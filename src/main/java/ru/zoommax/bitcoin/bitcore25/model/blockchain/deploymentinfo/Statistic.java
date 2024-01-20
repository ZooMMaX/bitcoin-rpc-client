package ru.zoommax.bitcoin.bitcore25.model.blockchain.deploymentinfo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Statistic {
    private long period;
    private long threshold;
    private long elapsed;
    private long count;
    private boolean possible;
}
