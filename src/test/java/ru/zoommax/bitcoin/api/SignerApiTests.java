package ru.zoommax.bitcoin.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import ru.zoommax.bitcoin.NodeSettings;
import ru.zoommax.bitcoin.bitcore25.api.signer.SignerApi;

import java.io.File;
import java.io.IOException;

public class SignerApiTests {
    private SignerApi api;

    @Before
    public void setUp() throws IOException {
        final ObjectMapper mapper = new ObjectMapper();
        final NodeSettings settings = mapper.readValue(new File("NodeSettings.json"), NodeSettings.class);
        api = new SignerApi(settings.getUser(), settings.getPass(), settings.getUrl());
    }

    @Test
    public void enumer(){
        api.enumerateSigners();
    }
}
