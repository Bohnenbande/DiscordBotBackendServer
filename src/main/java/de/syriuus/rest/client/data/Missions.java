
package de.syriuus.rest.client.data;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Missions {

    public Missions(Integer playerScore0, Integer playerScore1, Integer playerScore10, Integer playerScore11, Integer playerScore2, Integer playerScore3, Integer playerScore4, Integer playerScore5, Integer playerScore6, Integer playerScore7, Integer playerScore8, Integer playerScore9) {
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
    }

    public Missions() {
    }

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
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
