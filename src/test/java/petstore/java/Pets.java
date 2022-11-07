package petstore.java;

import org.json.JSONObject;
import org.json.JSONArray;

import java.util.stream.IntStream;

public class Pets{

    //Attributes
    JSONArray pets; //The json array with the ids and pet names

    //Constructor
    public Pets(String pets){
        this.pets = new JSONObject(pets).getJSONArray("pets");
    }

    //Getter and setter
    public void setPets(JSONArray pets){
        this.pets = pets;
    }

    public JSONArray getPets(){
        return this.pets;
    }

    //Method countNames
    //Creates a json with the pet names and the times each one is used
    public String countNames(){
        JSONObject json = new JSONObject();
        IntStream.range(0, pets.length())
            .mapToObj(index -> (JSONObject) pets.get(index))
            .forEach(item -> {
                String name = item.get("name").toString();
                json.put(name, (json.keySet().contains(name) ? (int) json.get(name) + 1 : 1));
            });
        return json.toString();
    }

}