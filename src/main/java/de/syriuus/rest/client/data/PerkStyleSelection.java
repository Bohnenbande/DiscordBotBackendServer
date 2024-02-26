
package de.syriuus.rest.client.data;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PerkStyleSelection {

    public PerkStyleSelection(Integer perk, Integer var1, Integer var2, Integer var3) {
        this.perk = perk;
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public PerkStyleSelection() {
    }

    private Integer perk;
    private Integer var1;
    private Integer var2;
    private Integer var3;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Integer getPerk() {
        return perk;
    }

    public void setPerk(Integer perk) {
        this.perk = perk;
    }

    public Integer getVar1() {
        return var1;
    }

    public void setVar1(Integer var1) {
        this.var1 = var1;
    }

    public Integer getVar2() {
        return var2;
    }

    public void setVar2(Integer var2) {
        this.var2 = var2;
    }

    public Integer getVar3() {
        return var3;
    }

    public void setVar3(Integer var3) {
        this.var3 = var3;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
