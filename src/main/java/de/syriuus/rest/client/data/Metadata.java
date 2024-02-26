
package de.syriuus.rest.client.data;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Metadata {

    public Metadata(String dataVersion, String matchId, List<String> participants) {
        this.dataVersion = dataVersion;
        this.matchId = matchId;
        this.participants = participants;
    }

    public Metadata() {
    }

    private String dataVersion;
    private String matchId;
    private List<String> participants;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
