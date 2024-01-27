package ru.zoommax.bitcoin.parser;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;

/**
 * The type Open docs.
 */
public class OpenDocs extends Thread{
	/**
	 * The Docs.
	 */
	private String docs;

	/**
	 * Instantiates a new Open docs.
	 *
	 * @param docs the docs
	 */
	public OpenDocs(String docs) {
		this.docs = docs;
	}

	@Override
	public void run() {
		final Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		final JFrame frame = new JFrame("Bitcoin RPC API");

		final Blocks blocks = new Blocks(docs);

		final JLabel label = new JLabel("RPC API");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 20));


		final JPanel panelArgs = new JPanel();
		panelArgs.setLayout(new MigLayout("fillx", "[grow,fill]", "[grow,fill]"));

		final JPanel panelDocs = new JPanel();
		panelDocs.setLayout(new MigLayout("fillx", "[grow,fill]", "[grow,fill]"));

		final JPanel panel = new JPanel();
		panel.setLayout(new MigLayout("fillx", "[grow,fill]", "[grow,fill]"));

		final JTextArea description = new JTextArea();
		description.setEditable(false);
		description.setLineWrap(true);
		description.setWrapStyleWord(true);
		description.setText(blocks.getDescription());

		panelDocs.add(description, "wrap");

		panel.add(new JLabel("Arguments:"), "wrap");
		for (int i = 0; i < blocks.getArguments().getJsonschema().size(); i++) {
			if (blocks.getArguments().getJsonschema().get(i).isEmpty() || blocks.getArguments().getJsonschema().get(i).equals(":")) {
				continue;
			}
			final JTextArea jsonschema = new JTextArea(blocks.getArguments().getJsonschema().get(i));
			jsonschema.setEditable(false);
			jsonschema.setLineWrap(true);
			jsonschema.setWrapStyleWord(true);
			jsonschema.setFont(new Font("Arial", Font.BOLD, 15));
			jsonschema.setBackground(Color.LIGHT_GRAY);
			jsonschema.setDisabledTextColor(Color.BLACK);
			jsonschema.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			panel.add(jsonschema);
			final JTextArea descriptionTextArea = new JTextArea(blocks.getArguments().getDescription().get(i));
			descriptionTextArea.setEditable(false);
			descriptionTextArea.setLineWrap(true);
			descriptionTextArea.setWrapStyleWord(true);
			descriptionTextArea.setFont(new Font("Arial", Font.BOLD, 15));
			descriptionTextArea.setBackground(Color.LIGHT_GRAY);
			descriptionTextArea.setDisabledTextColor(Color.BLACK);
			descriptionTextArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			panel.add(descriptionTextArea, "wrap");
		}

		panel.add(new JLabel("Result:"), "wrap");
		for (int i = 0; i < blocks.getResult().getJsonschema().size(); i++) {
			if (blocks.getResult().getJsonschema().get(i).isEmpty() || blocks.getResult().getJsonschema().get(i).equals(":")) {
				continue;
			}
			final JTextArea jsonschema = new JTextArea(blocks.getResult().getJsonschema().get(i));
			jsonschema.setEditable(false);
			jsonschema.setLineWrap(true);
			jsonschema.setWrapStyleWord(true);
			jsonschema.setFont(new Font("Arial", Font.BOLD, 15));
			jsonschema.setBackground(Color.LIGHT_GRAY);
			jsonschema.setDisabledTextColor(Color.BLACK);
			jsonschema.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			panel.add(jsonschema);
			final JTextArea descriptionTextArea = new JTextArea(blocks.getResult().getDescription().get(i));
			descriptionTextArea.setEditable(false);
			descriptionTextArea.setLineWrap(true);
			descriptionTextArea.setWrapStyleWord(true);
			descriptionTextArea.setFont(new Font("Arial", Font.BOLD, 15));
			descriptionTextArea.setBackground(Color.LIGHT_GRAY);
			descriptionTextArea.setDisabledTextColor(Color.BLACK);
			descriptionTextArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			panel.add(descriptionTextArea, "wrap");
		}

		panelDocs.add(panel, "wrap");
		panelDocs.add(new JLabel("Examples:"), "wrap");
		for (final String example : blocks.getExamples()) {
			if (example.isEmpty()) {
				continue;
			}
			final JTextArea exampleTextArea = new JTextArea(example);
			exampleTextArea.setEditable(false);
			exampleTextArea.setLineWrap(true);
			exampleTextArea.setWrapStyleWord(true);
			exampleTextArea.setBackground(Color.LIGHT_GRAY);
			exampleTextArea.setDisabledTextColor(Color.BLACK);
			exampleTextArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			panelDocs.add(exampleTextArea, "wrap");
		}

		final JScrollPane scrollPane = new JScrollPane(panelDocs);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		frame.setContentPane(scrollPane);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(new Dimension(screen.width / 2, screen.height / 2));
		frame.setVisible(true);
		while (frame.isVisible()) {
			try {
				Thread.sleep(100);
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
