
package de.syriuus.rest.client.data;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StatPerks {

    public StatPerks(Integer defense, Integer flex, Integer offense) {
        this.defense = defense;
        this.flex = flex;
        this.offense = offense;
    }

    public StatPerks() {
    }

    private Integer defense;
    private Integer flex;
    private Integer offense;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getFlex() {
        return flex;
    }

    public void setFlex(Integer flex) {
        this.flex = flex;
    }

    public Integer getOffense() {
        return offense;
    }

    public void setOffense(Integer offense) {
        this.offense = offense;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
