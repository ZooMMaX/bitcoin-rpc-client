package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Migrate wallet.
 */
@Getter
@Setter
public class MigrateWallet {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<MigrateWallet> {
	}

    /**
     * The Wallet name.
     */
    private String wallet_name;
    /**
     * The Watchonly name.
     */
    private String watchonly_name;
    /**
     * The Solvables name.
     */
    private String solvables_name;
    /**
     * The Backup path.
     */
    private String backup_path;

}
