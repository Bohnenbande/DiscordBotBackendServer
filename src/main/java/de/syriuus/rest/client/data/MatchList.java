package de.syriuus.rest.client.data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
public class MatchList {

    List<String> list;


    public MatchList(){
    }
    public MatchList(ArrayList<String> list){
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

}
