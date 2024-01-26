package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.createpsbt;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class CreatePsbtRequestArgs {
    private Inputs inputs = new Inputs();
    private Outputs outputs = new Outputs();
    private long locktime;
    private boolean replaceable = true;

    public void addInput(Input input) {
        this.inputs.setInputs(input);
    }

    public void addInput(@NonNull String txid, long vout) {
        Input input = new Input();
        input.setTxid(txid);
        input.setVout(vout);
        this.inputs.setInputs(input);
    }

    public void addInput(@NonNull String txid, long vout, long sequence) {
        Input input = new Input();
        input.setTxid(txid);
        input.setVout(vout);
        input.setSequence(sequence);
        this.inputs.setInputs(input);
    }

    public void addOutput(@NonNull String address, double amount, @NonNull String data, @NonNull String hex) {
        this.outputs.addOutput(address, amount, data, hex);
    }

    public String getInputs() {
        return this.inputs.getInputs();
    }

    public String getOutputs() {
        return this.outputs.getOutputs();
    }


}
