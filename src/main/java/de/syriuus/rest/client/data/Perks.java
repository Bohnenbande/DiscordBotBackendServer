
package de.syriuus.rest.client.data;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Perks {

    public Perks(StatPerks statPerks, List<Style> styles) {
        this.statPerks = statPerks;
        this.styles = styles;
    }

    public Perks() {
    }

    private StatPerks statPerks;
    private List<Style> styles;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public StatPerks getStatPerks() {
        return statPerks;
    }

    public void setStatPerks(StatPerks statPerks) {
        this.statPerks = statPerks;
    }

    public List<Style> getStyles() {
        return styles;
    }

    public void setStyles(List<Style> styles) {
        this.styles = styles;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
