
package de.syriuus.rest.client.data;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MatchData {

    private Metadata metadata;
    private Info info;

    public MatchData(){

    }

    public MatchData(Metadata metadata, Info info) {
        this.metadata = metadata;
        this.info = info;
    }

    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
