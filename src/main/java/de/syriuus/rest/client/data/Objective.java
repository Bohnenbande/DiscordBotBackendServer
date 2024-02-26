package de.syriuus.rest.client.data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedHashMap;
import java.util.Map;

@XmlRootElement
public class Objective {
    public Objective(Boolean first, Integer kills) {
        this.first = first;
        this.kills = kills;
    }

    public Objective() {
    }

    private Boolean first;
    private Integer kills;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Boolean getFirst() {
        return first;
    }

    public void setFirst(Boolean first) {
        this.first = first;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
