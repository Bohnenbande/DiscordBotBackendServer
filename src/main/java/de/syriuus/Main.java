package de.syriuus;

import de.syriuus.rest.client.RestClient;
import de.syriuus.utils.RiotAPIKey;

public class Main {
    public static void main(String[] args) {
        RestClient.getMatchData("EUW1_6784224177");
    }
}