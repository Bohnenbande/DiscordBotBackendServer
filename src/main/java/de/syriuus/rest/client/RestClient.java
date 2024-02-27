package de.syriuus.rest.client;


import de.syriuus.rest.client.data.MatchData;
import de.syriuus.utils.RiotAPIKey;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

public class RestClient {
	private static String matchesURL = "https://europe.api.riotgames.com";

	private static List<MatchData> getMatches(String puid, int count) {
		int start = 0;
		List<MatchData> matchDataList = new ArrayList<>();

		String url = matchesURL + "/lol/match/v5/matches/by-puuid/" + puid + "/ids?start=" + start + "&count=" + count;
		System.out.println("Calling url=" + url);
		Client client = ClientBuilder.newClient();
		Response response = client.target(url).request(MediaType.APPLICATION_JSON).header("X-Riot-Token", RiotAPIKey.getInstance().getApiKey()).get();
		List<String> matchIDList = response.readEntity(new GenericType<List<String>>() {});
		matchIDList.forEach(id -> {
			matchDataList.add(getMatchData(id));
		});
		return matchDataList;
	}

	private static MatchData getMatchData(String matchID){
		String url = matchesURL + "/lol/match/v5/matches/" + matchID;
		System.out.println("Calling url=" + url);
		Client client = ClientBuilder.newClient();
		Response response = client.target(url).request(MediaType.APPLICATION_JSON).header("X-Riot-Token", RiotAPIKey.getInstance().getApiKey()).get();
		return response.readEntity(MatchData.class);
	}

	public static double getWinrateForRole(String role, String puid, int count){
		List<MatchData> matchDataList = getMatches(puid, count);

		List<MatchData> test = matchDataList.stream().filter(data -> data.getInfo().getParticipants().stream().anyMatch(player -> player.getTeamPosition().equalsIgnoreCase(role) && player.getPuuid().equals(puid) && player.getWin())).toList();
		// List<MatchData> test = matchDataList.stream().filter(data -> data.getInfo().getParticipants().stream().anyMatch(player -> player.getPuuid().equals(puid) && player.getWin())).toList();
		return ((double)test.size()/(double)matchDataList.size())*100;
	}


}