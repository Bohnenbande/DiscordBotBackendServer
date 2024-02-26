
package de.syriuus.rest.client.data;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Style {

    public Style(String description, List<PerkStyleSelection> selections, Integer style) {
        this.description = description;
        this.selections = selections;
        this.style = style;
    }

    public Style() {
    }

    private String description;
    private List<PerkStyleSelection> selections;
    private Integer style;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PerkStyleSelection> getSelections() {
        return selections;
    }

    public void setSelections(List<PerkStyleSelection> selections) {
        this.selections = selections;
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
