package de.syriuus.rest.client;


import de.syriuus.rest.client.data.MatchData;
import de.syriuus.utils.RiotAPIKey;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

public class RestClient {
	private static String baseURL = "https://europe.api.riotgames.com";

	public static void getMatches(String puid, int count) {
		int start = 0;
		String url = baseURL + "/lol/match/v5/matches/by-puuid/" + puid + "/ids?start=" + start + "&count=" + count;
		System.out.println("Calling url=" + url);
		Client client = ClientBuilder.newClient();
		Response response = client.target(url).request(MediaType.APPLICATION_JSON).header("X-Riot-Token", RiotAPIKey.getInstance().getApiKey()).get();
		List<String> user = response.readEntity(new GenericType<List<String>>() {});
		user.forEach(System.out::println);
	}

	public static void getMatchData(String matchID){
		String url = baseURL + "/lol/match/v5/matches/" + matchID;
		System.out.println("Calling url=" + url);
		Client client = ClientBuilder.newClient();
		Response response = client.target(url).request(MediaType.APPLICATION_JSON).header("X-Riot-Token", RiotAPIKey.getInstance().getApiKey()).get();
		MatchData matchData = response.readEntity(MatchData.class);

	}


}