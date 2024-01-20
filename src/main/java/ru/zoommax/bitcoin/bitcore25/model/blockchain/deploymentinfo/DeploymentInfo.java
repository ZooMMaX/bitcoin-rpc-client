package ru.zoommax.bitcoin.bitcore25.model.blockchain.deploymentinfo;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

import java.util.HashMap;

@Getter
@Setter
public class DeploymentInfo {
    public static class Result extends JsonRpcResult<DeploymentInfo> {
    }

    private String hash;
    private long height;
    private HashMap<String, Deployment> deployments;
}
