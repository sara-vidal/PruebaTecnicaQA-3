package petstore.java;

import org.json.JSONObject;

public class Names{

    //Attributes
    JSONObject names; //The json with the ids and pet names

    //Constructor
    public Names(String names){
        this.names = new JSONObject(names);
    }

    //Getter and setter
    public void setNames(JSONObject names){
        this.names = names;
    }

    public JSONObject getNames(){
        return this.names;
    }

    //Method countNames
    //Creates a json with the pet names and the times each one is used
    public String countNames(){
        JSONObject json = new JSONObject();
        names.keySet().forEach(keyStr ->
        {
            String keyvalue = names.get(keyStr).toString();
            if (json.keySet().contains(keyvalue)) {
                json.put(keyvalue, (int) json.get(keyvalue) + 1);
            } else {
                json.put(keyvalue, 1);
            }
        });
        return json.toString();
    }

}