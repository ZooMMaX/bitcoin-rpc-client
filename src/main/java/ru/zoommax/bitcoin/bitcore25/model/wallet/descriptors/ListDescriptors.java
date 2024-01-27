package ru.zoommax.bitcoin.bitcore25.model.wallet.descriptors;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class ListDescriptors {

	public static class Result extends JsonRpcResult<ListDescriptors> {
	}

	private String wallet_name;
	private Descriptor[] descriptors;

}
