package javaClub.team3;

import java.util.HashMap;
import java.util.Map;

//https://www.codewars.com/kata/57a93f93bb9944516d0000c1
public class Task72 extends Task{
    @Override
    void execute() {

    }
}

class Dictionary {
    private Map<String, String> entries = new HashMap<>();

    public Dictionary(){

    }

    public void newEntry(String key, String value){
        this.entries.put(key, value);
    }

    public String look(String key){
        String value = getEntries().get(key);
        if (value == null) return "Cant find entry for "+key;
        return value;
    }

    public void setEntries(Map<String, String> entries) {
        this.entries = entries;
    }

    public Map<String, String> getEntries() {
        return entries;
    }
}