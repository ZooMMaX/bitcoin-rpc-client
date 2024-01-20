package ru.zoommax.bitcoin.bitcore25.model.blockchain.deploymentinfo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bip9 {
    private long bit;
    private long start_time;
    private long timeout;
    private long min_activation_height;
    private String status;
    private long since;
    private String status_next;
    private Statistic statistic;
    private String signalling;
}
