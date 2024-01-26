package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.createjson;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * The type Psbt request args json.
 */
@Getter
@Setter
public class PsbtRequestArgsJson {
    /**
     * The Inputs.
     */
    private Inputs inputs = new Inputs();
    /**
     * The Outputs.
     */
    private Outputs outputs = new Outputs();

    /**
     * Add input.
     *
     * @param input the input
     */
    public void addInput(Input input) {
        this.inputs.setInputs(input);
    }

    /**
     * Add input.
     *
     * @param txid the txid
     * @param vout the vout
     */
    public void addInput(@NonNull String txid, long vout) {
        Input input = new Input();
        input.setTxid(txid);
        input.setVout(vout);
        this.inputs.setInputs(input);
    }

    /**
     * Add input.
     *
     * @param txid     the txid
     * @param vout     the vout
     * @param sequence the sequence
     */
    public void addInput(@NonNull String txid, long vout, long sequence) {
        Input input = new Input();
        input.setTxid(txid);
        input.setVout(vout);
        input.setSequence(sequence);
        this.inputs.setInputs(input);
    }

    /**
     * Add output.
     *
     * @param address the address
     * @param amount  the amount
     * @param data    the data
     * @param hex     the hex
     */
    public void addOutput(@NonNull String address, double amount, @NonNull String data, @NonNull String hex) {
        this.outputs.addOutput(address, amount, data, hex);
    }

    /**
     * Gets inputs.
     *
     * @return the inputs
     */
    public String getInputs() {
        return this.inputs.getInputs();
    }

    /**
     * Gets outputs.
     *
     * @return the outputs
     */
    public String getOutputs() {
        return this.outputs.getOutputs();
    }


}
