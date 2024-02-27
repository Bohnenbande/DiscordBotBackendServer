package de.syriuus;

import de.syriuus.rest.client.RestClient;
import de.syriuus.utils.RiotAPIKey;

public class Main {
    public static void main(String[] args) {
        //_vxOMo-r1ELGfhsOcDMT5blJtLxpSkRBKVZ8gTcgIinYmoPZWY0TL-81i25dn0oWqrzBC-NaYA52SA
        System.out.println(RestClient.getWinrateForRole("TOP", "_vxOMo-r1ELGfhsOcDMT5blJtLxpSkRBKVZ8gTcgIinYmoPZWY0TL-81i25dn0oWqrzBC-NaYA52SA", 10));
    }
}