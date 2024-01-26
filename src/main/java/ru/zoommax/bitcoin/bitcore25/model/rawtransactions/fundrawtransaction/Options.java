package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.fundrawtransaction;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class Options {
    private boolean add_inputs;
    private boolean include_unsafe;
    private long minconf;
    private long maxconf;
    private String changeAddress;
    private long changePosition;
    private String change_type;
    private boolean includeWatching;
    private boolean lockUnspents;
    private double fee_rate;
    private double feeRate;
    private long[] subtractFeeFromOutputs;
    private List<InputWeight> inputWeights;
    private long conf_target;
    private String estimate_mode;
    private boolean replaceable;
    private SlovingData solving_data;
}
