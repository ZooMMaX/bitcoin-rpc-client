package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class MigrateWallet {

	public static class Result extends JsonRpcResult<MigrateWallet> {
	}

	private String wallet_name;
	private String watchonly_name;
	private String solvables_name;
	private String backup_path;

}
