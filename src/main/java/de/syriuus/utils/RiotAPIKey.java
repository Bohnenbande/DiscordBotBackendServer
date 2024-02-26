package de.syriuus.utils;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class RiotAPIKey {
    private static RiotAPIKey INSTANCE;
    String apiKey = "";
    private RiotAPIKey(){
        apiKey = getKey();
    }

    public static RiotAPIKey getInstance(){
        if(INSTANCE == null){
            INSTANCE = new RiotAPIKey();
        }
        return INSTANCE;
    }

    public String getApiKey(){
        return apiKey;
    }
    private String getKey(){
        try{
            InputStream is = RiotAPIKey.class.getClassLoader().getResourceAsStream("API-Key");
            assert is != null;
            return IOUtils.toString(is, StandardCharsets.UTF_8);
        }
        catch (IOException e){
            return "Key not found";
        }
    }
}
