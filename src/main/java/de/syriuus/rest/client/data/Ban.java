
package de.syriuus.rest.client.data;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ban {

    private Integer championId;
    private Integer pickTurn;

    public Ban(Integer championId, Integer pickTurn) {
        this.championId = championId;
        this.pickTurn = pickTurn;
    }

    public Ban() {
    }

    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Integer getChampionId() {
        return championId;
    }

    public void setChampionId(Integer championId) {
        this.championId = championId;
    }

    public Integer getPickTurn() {
        return pickTurn;
    }

    public void setPickTurn(Integer pickTurn) {
        this.pickTurn = pickTurn;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
