
package de.syriuus.rest.client.data;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Team {

    public Team(List<Ban> bans, Objectives objectives, Integer teamId, Boolean win) {
        this.bans = bans;
        this.objectives = objectives;
        this.teamId = teamId;
        this.win = win;
    }

    public Team() {
    }

    private List<Ban> bans;
    private Objectives objectives;
    private Integer teamId;
    private Boolean win;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public List<Ban> getBans() {
        return bans;
    }

    public void setBans(List<Ban> bans) {
        this.bans = bans;
    }

    public Objectives getObjectives() {
        return objectives;
    }

    public void setObjectives(Objectives objectives) {
        this.objectives = objectives;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
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
