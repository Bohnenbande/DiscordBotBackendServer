
package de.syriuus.rest.client.data;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Participant {

    public Participant(Integer allInPings, Integer assistMePings, Integer assists, Integer baronKills, Integer basicPings, Integer bountyLevel, Challenges challenges, Integer champExperience, Integer champLevel, Integer championId, String championName, Integer championTransform, Integer commandPings, Integer consumablesPurchased, Integer damageDealtToBuildings, Integer damageDealtToObjectives, Integer damageDealtToTurrets, Integer damageSelfMitigated, Integer dangerPings, Integer deaths, Integer detectorWardsPlaced, Integer doubleKills, Integer dragonKills, Boolean eligibleForProgression, Integer enemyMissingPings, Integer enemyVisionPings, Boolean firstBloodAssist, Boolean firstBloodKill, Boolean firstTowerAssist, Boolean firstTowerKill, Boolean gameEndedInEarlySurrender, Boolean gameEndedInSurrender, Integer getBackPings, Integer goldEarned, Integer goldSpent, Integer holdPings, String individualPosition, Integer inhibitorKills, Integer inhibitorTakedowns, Integer inhibitorsLost, Integer item0, Integer item1, Integer item2, Integer item3, Integer item4, Integer item5, Integer item6, Integer itemsPurchased, Integer killingSprees, Integer kills, String lane, Integer largestCriticalStrike, Integer largestKillingSpree, Integer largestMultiKill, Integer longestTimeSpentLiving, Integer magicDamageDealt, Integer magicDamageDealtToChampions, Integer magicDamageTaken, Missions missions, Integer needVisionPings, Integer neutralMinionsKilled, Integer nexusKills, Integer nexusLost, Integer nexusTakedowns, Integer objectivesStolen, Integer objectivesStolenAssists, Integer onMyWayPings, Integer participantId, Integer pentaKills, Perks perks, Integer physicalDamageDealt, Integer physicalDamageDealtToChampions, Integer physicalDamageTaken, Integer placement, Integer playerAugment1, Integer playerAugment2, Integer playerAugment3, Integer playerAugment4, Integer playerScore0, Integer playerScore1, Integer playerScore10, Integer playerScore11, Integer playerScore2, Integer playerScore3, Integer playerScore4, Integer playerScore5, Integer playerScore6, Integer playerScore7, Integer playerScore8, Integer playerScore9, Integer playerSubteamId, Integer profileIcon, Integer pushPings, String puuid, Integer quadraKills, String riotIdGameName, String riotIdTagline, String role, Integer sightWardsBoughtInGame, Integer spell1Casts, Integer spell2Casts, Integer spell3Casts, Integer spell4Casts, Integer subteamPlacement, Integer summoner1Casts, Integer summoner1Id, Integer summoner2Casts, Integer summoner2Id, String summonerId, Integer summonerLevel, String summonerName, Boolean teamEarlySurrendered, Integer teamId, String teamPosition, Integer timeCCingOthers, Integer timePlayed, Integer totalAllyJungleMinionsKilled, Integer totalDamageDealt, Integer totalDamageDealtToChampions, Integer totalDamageShieldedOnTeammates, Integer totalDamageTaken, Integer totalEnemyJungleMinionsKilled, Integer totalHeal, Integer totalHealsOnTeammates, Integer totalMinionsKilled, Integer totalTimeCCDealt, Integer totalTimeSpentDead, Integer totalUnitsHealed, Integer tripleKills, Integer trueDamageDealt, Integer trueDamageDealtToChampions, Integer trueDamageTaken, Integer turretKills, Integer turretTakedowns, Integer turretsLost, Integer unrealKills, Integer visionClearedPings, Integer visionScore, Integer visionWardsBoughtInGame, Integer wardsKilled, Integer wardsPlaced, Boolean win) {
        this.allInPings = allInPings;
        this.assistMePings = assistMePings;
        this.assists = assists;
        this.baronKills = baronKills;
        this.basicPings = basicPings;
        this.bountyLevel = bountyLevel;
        this.challenges = challenges;
        this.champExperience = champExperience;
        this.champLevel = champLevel;
        this.championId = championId;
        this.championName = championName;
        this.championTransform = championTransform;
        this.commandPings = commandPings;
        this.consumablesPurchased = consumablesPurchased;
        this.damageDealtToBuildings = damageDealtToBuildings;
        this.damageDealtToObjectives = damageDealtToObjectives;
        this.damageDealtToTurrets = damageDealtToTurrets;
        this.damageSelfMitigated = damageSelfMitigated;
        this.dangerPings = dangerPings;
        this.deaths = deaths;
        this.detectorWardsPlaced = detectorWardsPlaced;
        this.doubleKills = doubleKills;
        this.dragonKills = dragonKills;
        this.eligibleForProgression = eligibleForProgression;
        this.enemyMissingPings = enemyMissingPings;
        this.enemyVisionPings = enemyVisionPings;
        this.firstBloodAssist = firstBloodAssist;
        this.firstBloodKill = firstBloodKill;
        this.firstTowerAssist = firstTowerAssist;
        this.firstTowerKill = firstTowerKill;
        this.gameEndedInEarlySurrender = gameEndedInEarlySurrender;
        this.gameEndedInSurrender = gameEndedInSurrender;
        this.getBackPings = getBackPings;
        this.goldEarned = goldEarned;
        this.goldSpent = goldSpent;
        this.holdPings = holdPings;
        this.individualPosition = individualPosition;
        this.inhibitorKills = inhibitorKills;
        this.inhibitorTakedowns = inhibitorTakedowns;
        this.inhibitorsLost = inhibitorsLost;
        this.item0 = item0;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.item5 = item5;
        this.item6 = item6;
        this.itemsPurchased = itemsPurchased;
        this.killingSprees = killingSprees;
        this.kills = kills;
        this.lane = lane;
        this.largestCriticalStrike = largestCriticalStrike;
        this.largestKillingSpree = largestKillingSpree;
        this.largestMultiKill = largestMultiKill;
        this.longestTimeSpentLiving = longestTimeSpentLiving;
        this.magicDamageDealt = magicDamageDealt;
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
        this.magicDamageTaken = magicDamageTaken;
        this.missions = missions;
        this.needVisionPings = needVisionPings;
        this.neutralMinionsKilled = neutralMinionsKilled;
        this.nexusKills = nexusKills;
        this.nexusLost = nexusLost;
        this.nexusTakedowns = nexusTakedowns;
        this.objectivesStolen = objectivesStolen;
        this.objectivesStolenAssists = objectivesStolenAssists;
        this.onMyWayPings = onMyWayPings;
        this.participantId = participantId;
        this.pentaKills = pentaKills;
        this.perks = perks;
        this.physicalDamageDealt = physicalDamageDealt;
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
        this.physicalDamageTaken = physicalDamageTaken;
        this.placement = placement;
        this.playerAugment1 = playerAugment1;
        this.playerAugment2 = playerAugment2;
        this.playerAugment3 = playerAugment3;
        this.playerAugment4 = playerAugment4;
        this.playerScore0 = playerScore0;
        this.playerScore1 = playerScore1;
        this.playerScore10 = playerScore10;
        this.playerScore11 = playerScore11;
        this.playerScore2 = playerScore2;
        this.playerScore3 = playerScore3;
        this.playerScore4 = playerScore4;
        this.playerScore5 = playerScore5;
        this.playerScore6 = playerScore6;
        this.playerScore7 = playerScore7;
        this.playerScore8 = playerScore8;
        this.playerScore9 = playerScore9;
        this.playerSubteamId = playerSubteamId;
        this.profileIcon = profileIcon;
        this.pushPings = pushPings;
        this.puuid = puuid;
        this.quadraKills = quadraKills;
        this.riotIdGameName = riotIdGameName;
        this.riotIdTagline = riotIdTagline;
        this.role = role;
        this.sightWardsBoughtInGame = sightWardsBoughtInGame;
        this.spell1Casts = spell1Casts;
        this.spell2Casts = spell2Casts;
        this.spell3Casts = spell3Casts;
        this.spell4Casts = spell4Casts;
        this.subteamPlacement = subteamPlacement;
        this.summoner1Casts = summoner1Casts;
        this.summoner1Id = summoner1Id;
        this.summoner2Casts = summoner2Casts;
        this.summoner2Id = summoner2Id;
        this.summonerId = summonerId;
        this.summonerLevel = summonerLevel;
        this.summonerName = summonerName;
        this.teamEarlySurrendered = teamEarlySurrendered;
        this.teamId = teamId;
        this.teamPosition = teamPosition;
        this.timeCCingOthers = timeCCingOthers;
        this.timePlayed = timePlayed;
        this.totalAllyJungleMinionsKilled = totalAllyJungleMinionsKilled;
        this.totalDamageDealt = totalDamageDealt;
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
        this.totalDamageShieldedOnTeammates = totalDamageShieldedOnTeammates;
        this.totalDamageTaken = totalDamageTaken;
        this.totalEnemyJungleMinionsKilled = totalEnemyJungleMinionsKilled;
        this.totalHeal = totalHeal;
        this.totalHealsOnTeammates = totalHealsOnTeammates;
        this.totalMinionsKilled = totalMinionsKilled;
        this.totalTimeCCDealt = totalTimeCCDealt;
        this.totalTimeSpentDead = totalTimeSpentDead;
        this.totalUnitsHealed = totalUnitsHealed;
        this.tripleKills = tripleKills;
        this.trueDamageDealt = trueDamageDealt;
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
        this.trueDamageTaken = trueDamageTaken;
        this.turretKills = turretKills;
        this.turretTakedowns = turretTakedowns;
        this.turretsLost = turretsLost;
        this.unrealKills = unrealKills;
        this.visionClearedPings = visionClearedPings;
        this.visionScore = visionScore;
        this.visionWardsBoughtInGame = visionWardsBoughtInGame;
        this.wardsKilled = wardsKilled;
        this.wardsPlaced = wardsPlaced;
        this.win = win;
    }

    public Participant() {
    }

    private Integer allInPings;
    private Integer assistMePings;
    private Integer assists;
    private Integer baronKills;
    private Integer basicPings;
    private Integer bountyLevel;
    private Challenges challenges;
    private Integer champExperience;
    private Integer champLevel;
    private Integer championId;
    private String championName;
    private Integer championTransform;
    private Integer commandPings;
    private Integer consumablesPurchased;
    private Integer damageDealtToBuildings;
    private Integer damageDealtToObjectives;
    private Integer damageDealtToTurrets;
    private Integer damageSelfMitigated;
    private Integer dangerPings;
    private Integer deaths;
    private Integer detectorWardsPlaced;
    private Integer doubleKills;
    private Integer dragonKills;
    private Boolean eligibleForProgression;
    private Integer enemyMissingPings;
    private Integer enemyVisionPings;
    private Boolean firstBloodAssist;
    private Boolean firstBloodKill;
    private Boolean firstTowerAssist;
    private Boolean firstTowerKill;
    private Boolean gameEndedInEarlySurrender;
    private Boolean gameEndedInSurrender;
    private Integer getBackPings;
    private Integer goldEarned;
    private Integer goldSpent;
    private Integer holdPings;
    private String individualPosition;
    private Integer inhibitorKills;
    private Integer inhibitorTakedowns;
    private Integer inhibitorsLost;
    private Integer item0;
    private Integer item1;
    private Integer item2;
    private Integer item3;
    private Integer item4;
    private Integer item5;
    private Integer item6;
    private Integer itemsPurchased;
    private Integer killingSprees;
    private Integer kills;
    private String lane;
    private Integer largestCriticalStrike;
    private Integer largestKillingSpree;
    private Integer largestMultiKill;
    private Integer longestTimeSpentLiving;
    private Integer magicDamageDealt;
    private Integer magicDamageDealtToChampions;
    private Integer magicDamageTaken;
    private Missions missions;
    private Integer needVisionPings;
    private Integer neutralMinionsKilled;
    private Integer nexusKills;
    private Integer nexusLost;
    private Integer nexusTakedowns;
    private Integer objectivesStolen;
    private Integer objectivesStolenAssists;
    private Integer onMyWayPings;
    private Integer participantId;
    private Integer pentaKills;
    private Perks perks;
    private Integer physicalDamageDealt;
    private Integer physicalDamageDealtToChampions;
    private Integer physicalDamageTaken;
    private Integer placement;
    private Integer playerAugment1;
    private Integer playerAugment2;
    private Integer playerAugment3;
    private Integer playerAugment4;
    private Integer playerScore0;
    private Integer playerScore1;
    private Integer playerScore10;
    private Integer playerScore11;
    private Integer playerScore2;
    private Integer playerScore3;
    private Integer playerScore4;
    private Integer playerScore5;
    private Integer playerScore6;
    private Integer playerScore7;
    private Integer playerScore8;
    private Integer playerScore9;
    private Integer playerSubteamId;
    private Integer profileIcon;
    private Integer pushPings;
    private String puuid;
    private Integer quadraKills;
    private String riotIdGameName;
    private String riotIdTagline;
    private String role;
    private Integer sightWardsBoughtInGame;
    private Integer spell1Casts;
    private Integer spell2Casts;
    private Integer spell3Casts;
    private Integer spell4Casts;
    private Integer subteamPlacement;
    private Integer summoner1Casts;
    private Integer summoner1Id;
    private Integer summoner2Casts;
    private Integer summoner2Id;
    private String summonerId;
    private Integer summonerLevel;
    private String summonerName;
    private Boolean teamEarlySurrendered;
    private Integer teamId;
    private String teamPosition;
    private Integer timeCCingOthers;
    private Integer timePlayed;
    private Integer totalAllyJungleMinionsKilled;
    private Integer totalDamageDealt;
    private Integer totalDamageDealtToChampions;
    private Integer totalDamageShieldedOnTeammates;
    private Integer totalDamageTaken;
    private Integer totalEnemyJungleMinionsKilled;
    private Integer totalHeal;
    private Integer totalHealsOnTeammates;
    private Integer totalMinionsKilled;
    private Integer totalTimeCCDealt;
    private Integer totalTimeSpentDead;
    private Integer totalUnitsHealed;
    private Integer tripleKills;
    private Integer trueDamageDealt;
    private Integer trueDamageDealtToChampions;
    private Integer trueDamageTaken;
    private Integer turretKills;
    private Integer turretTakedowns;
    private Integer turretsLost;
    private Integer unrealKills;
    private Integer visionClearedPings;
    private Integer visionScore;
    private Integer visionWardsBoughtInGame;
    private Integer wardsKilled;
    private Integer wardsPlaced;
    private Boolean win;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Integer getAllInPings() {
        return allInPings;
    }

    public void setAllInPings(Integer allInPings) {
        this.allInPings = allInPings;
    }

    public Integer getAssistMePings() {
        return assistMePings;
    }

    public void setAssistMePings(Integer assistMePings) {
        this.assistMePings = assistMePings;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getBaronKills() {
        return baronKills;
    }

    public void setBaronKills(Integer baronKills) {
        this.baronKills = baronKills;
    }

    public Integer getBasicPings() {
        return basicPings;
    }

    public void setBasicPings(Integer basicPings) {
        this.basicPings = basicPings;
    }

    public Integer getBountyLevel() {
        return bountyLevel;
    }

    public void setBountyLevel(Integer bountyLevel) {
        this.bountyLevel = bountyLevel;
    }

    public Challenges getChallenges() {
        return challenges;
    }

    public void setChallenges(Challenges challenges) {
        this.challenges = challenges;
    }

    public Integer getChampExperience() {
        return champExperience;
    }

    public void setChampExperience(Integer champExperience) {
        this.champExperience = champExperience;
    }

    public Integer getChampLevel() {
        return champLevel;
    }

    public void setChampLevel(Integer champLevel) {
        this.champLevel = champLevel;
    }

    public Integer getChampionId() {
        return championId;
    }

    public void setChampionId(Integer championId) {
        this.championId = championId;
    }

    public String getChampionName() {
        return championName;
    }

    public void setChampionName(String championName) {
        this.championName = championName;
    }

    public Integer getChampionTransform() {
        return championTransform;
    }

    public void setChampionTransform(Integer championTransform) {
        this.championTransform = championTransform;
    }

    public Integer getCommandPings() {
        return commandPings;
    }

    public void setCommandPings(Integer commandPings) {
        this.commandPings = commandPings;
    }

    public Integer getConsumablesPurchased() {
        return consumablesPurchased;
    }

    public void setConsumablesPurchased(Integer consumablesPurchased) {
        this.consumablesPurchased = consumablesPurchased;
    }

    public Integer getDamageDealtToBuildings() {
        return damageDealtToBuildings;
    }

    public void setDamageDealtToBuildings(Integer damageDealtToBuildings) {
        this.damageDealtToBuildings = damageDealtToBuildings;
    }

    public Integer getDamageDealtToObjectives() {
        return damageDealtToObjectives;
    }

    public void setDamageDealtToObjectives(Integer damageDealtToObjectives) {
        this.damageDealtToObjectives = damageDealtToObjectives;
    }

    public Integer getDamageDealtToTurrets() {
        return damageDealtToTurrets;
    }

    public void setDamageDealtToTurrets(Integer damageDealtToTurrets) {
        this.damageDealtToTurrets = damageDealtToTurrets;
    }

    public Integer getDamageSelfMitigated() {
        return damageSelfMitigated;
    }

    public void setDamageSelfMitigated(Integer damageSelfMitigated) {
        this.damageSelfMitigated = damageSelfMitigated;
    }

    public Integer getDangerPings() {
        return dangerPings;
    }

    public void setDangerPings(Integer dangerPings) {
        this.dangerPings = dangerPings;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getDetectorWardsPlaced() {
        return detectorWardsPlaced;
    }

    public void setDetectorWardsPlaced(Integer detectorWardsPlaced) {
        this.detectorWardsPlaced = detectorWardsPlaced;
    }

    public Integer getDoubleKills() {
        return doubleKills;
    }

    public void setDoubleKills(Integer doubleKills) {
        this.doubleKills = doubleKills;
    }

    public Integer getDragonKills() {
        return dragonKills;
    }

    public void setDragonKills(Integer dragonKills) {
        this.dragonKills = dragonKills;
    }

    public Boolean getEligibleForProgression() {
        return eligibleForProgression;
    }

    public void setEligibleForProgression(Boolean eligibleForProgression) {
        this.eligibleForProgression = eligibleForProgression;
    }

    public Integer getEnemyMissingPings() {
        return enemyMissingPings;
    }

    public void setEnemyMissingPings(Integer enemyMissingPings) {
        this.enemyMissingPings = enemyMissingPings;
    }

    public Integer getEnemyVisionPings() {
        return enemyVisionPings;
    }

    public void setEnemyVisionPings(Integer enemyVisionPings) {
        this.enemyVisionPings = enemyVisionPings;
    }

    public Boolean getFirstBloodAssist() {
        return firstBloodAssist;
    }

    public void setFirstBloodAssist(Boolean firstBloodAssist) {
        this.firstBloodAssist = firstBloodAssist;
    }

    public Boolean getFirstBloodKill() {
        return firstBloodKill;
    }

    public void setFirstBloodKill(Boolean firstBloodKill) {
        this.firstBloodKill = firstBloodKill;
    }

    public Boolean getFirstTowerAssist() {
        return firstTowerAssist;
    }

    public void setFirstTowerAssist(Boolean firstTowerAssist) {
        this.firstTowerAssist = firstTowerAssist;
    }

    public Boolean getFirstTowerKill() {
        return firstTowerKill;
    }

    public void setFirstTowerKill(Boolean firstTowerKill) {
        this.firstTowerKill = firstTowerKill;
    }

    public Boolean getGameEndedInEarlySurrender() {
        return gameEndedInEarlySurrender;
    }

    public void setGameEndedInEarlySurrender(Boolean gameEndedInEarlySurrender) {
        this.gameEndedInEarlySurrender = gameEndedInEarlySurrender;
    }

    public Boolean getGameEndedInSurrender() {
        return gameEndedInSurrender;
    }

    public void setGameEndedInSurrender(Boolean gameEndedInSurrender) {
        this.gameEndedInSurrender = gameEndedInSurrender;
    }

    public Integer getGetBackPings() {
        return getBackPings;
    }

    public void setGetBackPings(Integer getBackPings) {
        this.getBackPings = getBackPings;
    }

    public Integer getGoldEarned() {
        return goldEarned;
    }

    public void setGoldEarned(Integer goldEarned) {
        this.goldEarned = goldEarned;
    }

    public Integer getGoldSpent() {
        return goldSpent;
    }

    public void setGoldSpent(Integer goldSpent) {
        this.goldSpent = goldSpent;
    }

    public Integer getHoldPings() {
        return holdPings;
    }

    public void setHoldPings(Integer holdPings) {
        this.holdPings = holdPings;
    }

    public String getIndividualPosition() {
        return individualPosition;
    }

    public void setIndividualPosition(String individualPosition) {
        this.individualPosition = individualPosition;
    }

    public Integer getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(Integer inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public Integer getInhibitorTakedowns() {
        return inhibitorTakedowns;
    }

    public void setInhibitorTakedowns(Integer inhibitorTakedowns) {
        this.inhibitorTakedowns = inhibitorTakedowns;
    }

    public Integer getInhibitorsLost() {
        return inhibitorsLost;
    }

    public void setInhibitorsLost(Integer inhibitorsLost) {
        this.inhibitorsLost = inhibitorsLost;
    }

    public Integer getItem0() {
        return item0;
    }

    public void setItem0(Integer item0) {
        this.item0 = item0;
    }

    public Integer getItem1() {
        return item1;
    }

    public void setItem1(Integer item1) {
        this.item1 = item1;
    }

    public Integer getItem2() {
        return item2;
    }

    public void setItem2(Integer item2) {
        this.item2 = item2;
    }

    public Integer getItem3() {
        return item3;
    }

    public void setItem3(Integer item3) {
        this.item3 = item3;
    }

    public Integer getItem4() {
        return item4;
    }

    public void setItem4(Integer item4) {
        this.item4 = item4;
    }

    public Integer getItem5() {
        return item5;
    }

    public void setItem5(Integer item5) {
        this.item5 = item5;
    }

    public Integer getItem6() {
        return item6;
    }

    public void setItem6(Integer item6) {
        this.item6 = item6;
    }

    public Integer getItemsPurchased() {
        return itemsPurchased;
    }

    public void setItemsPurchased(Integer itemsPurchased) {
        this.itemsPurchased = itemsPurchased;
    }

    public Integer getKillingSprees() {
        return killingSprees;
    }

    public void setKillingSprees(Integer killingSprees) {
        this.killingSprees = killingSprees;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public Integer getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    public void setLargestCriticalStrike(Integer largestCriticalStrike) {
        this.largestCriticalStrike = largestCriticalStrike;
    }

    public Integer getLargestKillingSpree() {
        return largestKillingSpree;
    }

    public void setLargestKillingSpree(Integer largestKillingSpree) {
        this.largestKillingSpree = largestKillingSpree;
    }

    public Integer getLargestMultiKill() {
        return largestMultiKill;
    }

    public void setLargestMultiKill(Integer largestMultiKill) {
        this.largestMultiKill = largestMultiKill;
    }

    public Integer getLongestTimeSpentLiving() {
        return longestTimeSpentLiving;
    }

    public void setLongestTimeSpentLiving(Integer longestTimeSpentLiving) {
        this.longestTimeSpentLiving = longestTimeSpentLiving;
    }

    public Integer getMagicDamageDealt() {
        return magicDamageDealt;
    }

    public void setMagicDamageDealt(Integer magicDamageDealt) {
        this.magicDamageDealt = magicDamageDealt;
    }

    public Integer getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    public void setMagicDamageDealtToChampions(Integer magicDamageDealtToChampions) {
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
    }

    public Integer getMagicDamageTaken() {
        return magicDamageTaken;
    }

    public void setMagicDamageTaken(Integer magicDamageTaken) {
        this.magicDamageTaken = magicDamageTaken;
    }

    public Missions getMissions() {
        return missions;
    }

    public void setMissions(Missions missions) {
        this.missions = missions;
    }

    public Integer getNeedVisionPings() {
        return needVisionPings;
    }

    public void setNeedVisionPings(Integer needVisionPings) {
        this.needVisionPings = needVisionPings;
    }

    public Integer getNeutralMinionsKilled() {
        return neutralMinionsKilled;
    }

    public void setNeutralMinionsKilled(Integer neutralMinionsKilled) {
        this.neutralMinionsKilled = neutralMinionsKilled;
    }

    public Integer getNexusKills() {
        return nexusKills;
    }

    public void setNexusKills(Integer nexusKills) {
        this.nexusKills = nexusKills;
    }

    public Integer getNexusLost() {
        return nexusLost;
    }

    public void setNexusLost(Integer nexusLost) {
        this.nexusLost = nexusLost;
    }

    public Integer getNexusTakedowns() {
        return nexusTakedowns;
    }

    public void setNexusTakedowns(Integer nexusTakedowns) {
        this.nexusTakedowns = nexusTakedowns;
    }

    public Integer getObjectivesStolen() {
        return objectivesStolen;
    }

    public void setObjectivesStolen(Integer objectivesStolen) {
        this.objectivesStolen = objectivesStolen;
    }

    public Integer getObjectivesStolenAssists() {
        return objectivesStolenAssists;
    }

    public void setObjectivesStolenAssists(Integer objectivesStolenAssists) {
        this.objectivesStolenAssists = objectivesStolenAssists;
    }

    public Integer getOnMyWayPings() {
        return onMyWayPings;
    }

    public void setOnMyWayPings(Integer onMyWayPings) {
        this.onMyWayPings = onMyWayPings;
    }

    public Integer getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }

    public Integer getPentaKills() {
        return pentaKills;
    }

    public void setPentaKills(Integer pentaKills) {
        this.pentaKills = pentaKills;
    }

    public Perks getPerks() {
        return perks;
    }

    public void setPerks(Perks perks) {
        this.perks = perks;
    }

    public Integer getPhysicalDamageDealt() {
        return physicalDamageDealt;
    }

    public void setPhysicalDamageDealt(Integer physicalDamageDealt) {
        this.physicalDamageDealt = physicalDamageDealt;
    }

    public Integer getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    public void setPhysicalDamageDealtToChampions(Integer physicalDamageDealtToChampions) {
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
    }

    public Integer getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    public void setPhysicalDamageTaken(Integer physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
    }

    public Integer getPlacement() {
        return placement;
    }

    public void setPlacement(Integer placement) {
        this.placement = placement;
    }

    public Integer getPlayerAugment1() {
        return playerAugment1;
    }

    public void setPlayerAugment1(Integer playerAugment1) {
        this.playerAugment1 = playerAugment1;
    }

    public Integer getPlayerAugment2() {
        return playerAugment2;
    }

    public void setPlayerAugment2(Integer playerAugment2) {
        this.playerAugment2 = playerAugment2;
    }

    public Integer getPlayerAugment3() {
        return playerAugment3;
    }

    public void setPlayerAugment3(Integer playerAugment3) {
        this.playerAugment3 = playerAugment3;
    }

    public Integer getPlayerAugment4() {
        return playerAugment4;
    }

    public void setPlayerAugment4(Integer playerAugment4) {
        this.playerAugment4 = playerAugment4;
    }

    public Integer getPlayerScore0() {
        return playerScore0;
    }

    public void setPlayerScore0(Integer playerScore0) {
        this.playerScore0 = playerScore0;
    }

    public Integer getPlayerScore1() {
        return playerScore1;
    }

    public void setPlayerScore1(Integer playerScore1) {
        this.playerScore1 = playerScore1;
    }

    public Integer getPlayerScore10() {
        return playerScore10;
    }

    public void setPlayerScore10(Integer playerScore10) {
        this.playerScore10 = playerScore10;
    }

    public Integer getPlayerScore11() {
        return playerScore11;
    }

    public void setPlayerScore11(Integer playerScore11) {
        this.playerScore11 = playerScore11;
    }

    public Integer getPlayerScore2() {
        return playerScore2;
    }

    public void setPlayerScore2(Integer playerScore2) {
        this.playerScore2 = playerScore2;
    }

    public Integer getPlayerScore3() {
        return playerScore3;
    }

    public void setPlayerScore3(Integer playerScore3) {
        this.playerScore3 = playerScore3;
    }

    public Integer getPlayerScore4() {
        return playerScore4;
    }

    public void setPlayerScore4(Integer playerScore4) {
        this.playerScore4 = playerScore4;
    }

    public Integer getPlayerScore5() {
        return playerScore5;
    }

    public void setPlayerScore5(Integer playerScore5) {
        this.playerScore5 = playerScore5;
    }

    public Integer getPlayerScore6() {
        return playerScore6;
    }

    public void setPlayerScore6(Integer playerScore6) {
        this.playerScore6 = playerScore6;
    }

    public Integer getPlayerScore7() {
        return playerScore7;
    }

    public void setPlayerScore7(Integer playerScore7) {
        this.playerScore7 = playerScore7;
    }

    public Integer getPlayerScore8() {
        return playerScore8;
    }

    public void setPlayerScore8(Integer playerScore8) {
        this.playerScore8 = playerScore8;
    }

    public Integer getPlayerScore9() {
        return playerScore9;
    }

    public void setPlayerScore9(Integer playerScore9) {
        this.playerScore9 = playerScore9;
    }

    public Integer getPlayerSubteamId() {
        return playerSubteamId;
    }

    public void setPlayerSubteamId(Integer playerSubteamId) {
        this.playerSubteamId = playerSubteamId;
    }

    public Integer getProfileIcon() {
        return profileIcon;
    }

    public void setProfileIcon(Integer profileIcon) {
        this.profileIcon = profileIcon;
    }

    public Integer getPushPings() {
        return pushPings;
    }

    public void setPushPings(Integer pushPings) {
        this.pushPings = pushPings;
    }

    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public Integer getQuadraKills() {
        return quadraKills;
    }

    public void setQuadraKills(Integer quadraKills) {
        this.quadraKills = quadraKills;
    }

    public String getRiotIdGameName() {
        return riotIdGameName;
    }

    public void setRiotIdGameName(String riotIdGameName) {
        this.riotIdGameName = riotIdGameName;
    }

    public String getRiotIdTagline() {
        return riotIdTagline;
    }

    public void setRiotIdTagline(String riotIdTagline) {
        this.riotIdTagline = riotIdTagline;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getSightWardsBoughtInGame() {
        return sightWardsBoughtInGame;
    }

    public void setSightWardsBoughtInGame(Integer sightWardsBoughtInGame) {
        this.sightWardsBoughtInGame = sightWardsBoughtInGame;
    }

    public Integer getSpell1Casts() {
        return spell1Casts;
    }

    public void setSpell1Casts(Integer spell1Casts) {
        this.spell1Casts = spell1Casts;
    }

    public Integer getSpell2Casts() {
        return spell2Casts;
    }

    public void setSpell2Casts(Integer spell2Casts) {
        this.spell2Casts = spell2Casts;
    }

    public Integer getSpell3Casts() {
        return spell3Casts;
    }

    public void setSpell3Casts(Integer spell3Casts) {
        this.spell3Casts = spell3Casts;
    }

    public Integer getSpell4Casts() {
        return spell4Casts;
    }

    public void setSpell4Casts(Integer spell4Casts) {
        this.spell4Casts = spell4Casts;
    }

    public Integer getSubteamPlacement() {
        return subteamPlacement;
    }

    public void setSubteamPlacement(Integer subteamPlacement) {
        this.subteamPlacement = subteamPlacement;
    }

    public Integer getSummoner1Casts() {
        return summoner1Casts;
    }

    public void setSummoner1Casts(Integer summoner1Casts) {
        this.summoner1Casts = summoner1Casts;
    }

    public Integer getSummoner1Id() {
        return summoner1Id;
    }

    public void setSummoner1Id(Integer summoner1Id) {
        this.summoner1Id = summoner1Id;
    }

    public Integer getSummoner2Casts() {
        return summoner2Casts;
    }

    public void setSummoner2Casts(Integer summoner2Casts) {
        this.summoner2Casts = summoner2Casts;
    }

    public Integer getSummoner2Id() {
        return summoner2Id;
    }

    public void setSummoner2Id(Integer summoner2Id) {
        this.summoner2Id = summoner2Id;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    public Integer getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(Integer summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public Boolean getTeamEarlySurrendered() {
        return teamEarlySurrendered;
    }

    public void setTeamEarlySurrendered(Boolean teamEarlySurrendered) {
        this.teamEarlySurrendered = teamEarlySurrendered;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamPosition() {
        return teamPosition;
    }

    public void setTeamPosition(String teamPosition) {
        this.teamPosition = teamPosition;
    }

    public Integer getTimeCCingOthers() {
        return timeCCingOthers;
    }

    public void setTimeCCingOthers(Integer timeCCingOthers) {
        this.timeCCingOthers = timeCCingOthers;
    }

    public Integer getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(Integer timePlayed) {
        this.timePlayed = timePlayed;
    }

    public Integer getTotalAllyJungleMinionsKilled() {
        return totalAllyJungleMinionsKilled;
    }

    public void setTotalAllyJungleMinionsKilled(Integer totalAllyJungleMinionsKilled) {
        this.totalAllyJungleMinionsKilled = totalAllyJungleMinionsKilled;
    }

    public Integer getTotalDamageDealt() {
        return totalDamageDealt;
    }

    public void setTotalDamageDealt(Integer totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
    }

    public Integer getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    public void setTotalDamageDealtToChampions(Integer totalDamageDealtToChampions) {
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
    }

    public Integer getTotalDamageShieldedOnTeammates() {
        return totalDamageShieldedOnTeammates;
    }

    public void setTotalDamageShieldedOnTeammates(Integer totalDamageShieldedOnTeammates) {
        this.totalDamageShieldedOnTeammates = totalDamageShieldedOnTeammates;
    }

    public Integer getTotalDamageTaken() {
        return totalDamageTaken;
    }

    public void setTotalDamageTaken(Integer totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
    }

    public Integer getTotalEnemyJungleMinionsKilled() {
        return totalEnemyJungleMinionsKilled;
    }

    public void setTotalEnemyJungleMinionsKilled(Integer totalEnemyJungleMinionsKilled) {
        this.totalEnemyJungleMinionsKilled = totalEnemyJungleMinionsKilled;
    }

    public Integer getTotalHeal() {
        return totalHeal;
    }

    public void setTotalHeal(Integer totalHeal) {
        this.totalHeal = totalHeal;
    }

    public Integer getTotalHealsOnTeammates() {
        return totalHealsOnTeammates;
    }

    public void setTotalHealsOnTeammates(Integer totalHealsOnTeammates) {
        this.totalHealsOnTeammates = totalHealsOnTeammates;
    }

    public Integer getTotalMinionsKilled() {
        return totalMinionsKilled;
    }

    public void setTotalMinionsKilled(Integer totalMinionsKilled) {
        this.totalMinionsKilled = totalMinionsKilled;
    }

    public Integer getTotalTimeCCDealt() {
        return totalTimeCCDealt;
    }

    public void setTotalTimeCCDealt(Integer totalTimeCCDealt) {
        this.totalTimeCCDealt = totalTimeCCDealt;
    }

    public Integer getTotalTimeSpentDead() {
        return totalTimeSpentDead;
    }

    public void setTotalTimeSpentDead(Integer totalTimeSpentDead) {
        this.totalTimeSpentDead = totalTimeSpentDead;
    }

    public Integer getTotalUnitsHealed() {
        return totalUnitsHealed;
    }

    public void setTotalUnitsHealed(Integer totalUnitsHealed) {
        this.totalUnitsHealed = totalUnitsHealed;
    }

    public Integer getTripleKills() {
        return tripleKills;
    }

    public void setTripleKills(Integer tripleKills) {
        this.tripleKills = tripleKills;
    }

    public Integer getTrueDamageDealt() {
        return trueDamageDealt;
    }

    public void setTrueDamageDealt(Integer trueDamageDealt) {
        this.trueDamageDealt = trueDamageDealt;
    }

    public Integer getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    public void setTrueDamageDealtToChampions(Integer trueDamageDealtToChampions) {
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
    }

    public Integer getTrueDamageTaken() {
        return trueDamageTaken;
    }

    public void setTrueDamageTaken(Integer trueDamageTaken) {
        this.trueDamageTaken = trueDamageTaken;
    }

    public Integer getTurretKills() {
        return turretKills;
    }

    public void setTurretKills(Integer turretKills) {
        this.turretKills = turretKills;
    }

    public Integer getTurretTakedowns() {
        return turretTakedowns;
    }

    public void setTurretTakedowns(Integer turretTakedowns) {
        this.turretTakedowns = turretTakedowns;
    }

    public Integer getTurretsLost() {
        return turretsLost;
    }

    public void setTurretsLost(Integer turretsLost) {
        this.turretsLost = turretsLost;
    }

    public Integer getUnrealKills() {
        return unrealKills;
    }

    public void setUnrealKills(Integer unrealKills) {
        this.unrealKills = unrealKills;
    }

    public Integer getVisionClearedPings() {
        return visionClearedPings;
    }

    public void setVisionClearedPings(Integer visionClearedPings) {
        this.visionClearedPings = visionClearedPings;
    }

    public Integer getVisionScore() {
        return visionScore;
    }

    public void setVisionScore(Integer visionScore) {
        this.visionScore = visionScore;
    }

    public Integer getVisionWardsBoughtInGame() {
        return visionWardsBoughtInGame;
    }

    public void setVisionWardsBoughtInGame(Integer visionWardsBoughtInGame) {
        this.visionWardsBoughtInGame = visionWardsBoughtInGame;
    }

    public Integer getWardsKilled() {
        return wardsKilled;
    }

    public void setWardsKilled(Integer wardsKilled) {
        this.wardsKilled = wardsKilled;
    }

    public Integer getWardsPlaced() {
        return wardsPlaced;
    }

    public void setWardsPlaced(Integer wardsPlaced) {
        this.wardsPlaced = wardsPlaced;
    }

    public Boolean getWin() {
        return win;
    }

    public void setWin(Boolean win) {
        this.win = win;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
