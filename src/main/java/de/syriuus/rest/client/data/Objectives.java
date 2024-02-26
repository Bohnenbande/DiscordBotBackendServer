
package de.syriuus.rest.client.data;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Objectives {

    public Objectives(Objective baron, Objective champion, Objective dragon, Objective horde, Objective inhibitor, Objective riftHerald, Objective tower) {
        this.baron = baron;
        this.champion = champion;
        this.dragon = dragon;
        this.horde = horde;
        this.inhibitor = inhibitor;
        this.riftHerald = riftHerald;
        this.tower = tower;
    }

    public Objectives() {
    }

    private Objective baron;
    private Objective champion;
    private Objective dragon;
    private Objective horde;
    private Objective inhibitor;
    private Objective riftHerald;
    private Objective tower;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Objective getBaron() {
        return baron;
    }

    public void setBaron(Objective baron) {
        this.baron = baron;
    }

    public Objective getChampion() {
        return champion;
    }

    public void setChampion(Objective champion) {
        this.champion = champion;
    }

    public Objective getDragon() {
        return dragon;
    }

    public void setDragon(Objective dragon) {
        this.dragon = dragon;
    }

    public Objective getHorde() {
        return horde;
    }

    public void setHorde(Objective horde) {
        this.horde = horde;
    }

    public Objective getInhibitor() {
        return inhibitor;
    }

    public void setInhibitor(Objective inhibitor) {
        this.inhibitor = inhibitor;
    }

    public Objective getRiftHerald() {
        return riftHerald;
    }

    public void setRiftHerald(Objective riftHerald) {
        this.riftHerald = riftHerald;
    }

    public Objective getTower() {
        return tower;
    }

    public void setTower(Objective tower) {
        this.tower = tower;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
