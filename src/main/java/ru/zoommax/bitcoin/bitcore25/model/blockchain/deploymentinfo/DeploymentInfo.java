package ru.zoommax.bitcoin.bitcore25.model.blockchain.deploymentinfo;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

import java.util.HashMap;

/**
 * The type Deployment info.
 */
@Getter
@Setter
public class DeploymentInfo {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<DeploymentInfo> {
    }

    /**
     * The Hash.
     */
    private String hash;
    /**
     * The Height.
     */
    private long height;
    /**
     * The Deployments.
     */
    private HashMap<String, Deployment> deployments;
}
