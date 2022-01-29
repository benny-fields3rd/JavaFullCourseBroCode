import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {

        // HashMap implements the Map interface (need import)
        // HashMap is similar to ArrayList, but with key-value pairs
        // stores objects, need to use Wrapper Class
        // ex: (name,email),(username,userID),(country,capital)

        HashMap<String,String> countries = new HashMap<String,String>();

        // add a key and value KEY,VALUE
        countries.put("USA","Washington DC");
        countries.put("South Korea","Seoul");
        countries.put("India","New Delhi");
        countries.put("Russia","Moscow");
        countries.put("China","Beijing");

        //countries.remove("USA"); // removes USA
        //System.out.println(countries.get("Russia")); // returns capital of Russia which is Moscow
        //countries.clear(); // returns {}  because everything was cleared
        //System.out.println(countries.size()); // displays number of key value pairs - which is 5
        //countries.replace("USA","Detroit"); // replaces Washington DC with Detroit as the capital
        //System.out.println(countries.containsKey("China")); // returns boolean value - false if key not found and true if found
        //System.out.print(countries); // prints: {USA=Washington DC, South Korea=Seoul, China=Beijing, India=New Delhi, Russia=Moscow}

        for (String i : countries.keySet()) {
            System.out.print(i + "\t" + "= "); // prints each key in hashmap
            System.out.println(countries.get(i));
        }



    }

}
