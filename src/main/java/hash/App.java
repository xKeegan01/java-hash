package hash;

import java.util.HashMap;
import java.util.Map;


public class App {
    public static void main(String[] args) {

        //first hashmap
        HashMap<String, String> degrees = new HashMap<>();
        degrees.put("Alex", "Computer Science");
        degrees.put("Ann", "Maritime Biology");
        degrees.put("John", "Geology");
        degrees.put("Margo", "Chemistry");
        System.out.println(degrees);

        //second hashmap
        HashMap<Integer, String> movies = new HashMap<>();
        movies.put(2022, "TopGun: Maverick");
        movies.put(2010, "Inception");
        movies.put(2014, "Interstellar");
        movies.put(1999, "Matrix");

        for (Map.Entry<Integer, String> keyValue : movies.entrySet()) {
            System.out.println(keyValue.getKey() + " " + keyValue.getValue());
        }

        //third hashmap
        HashMap<Make, Model> cars = new HashMap<>();
        cars.put(new Make("Audi"), new Model("SQ5"));
        cars.put(new Make("BMW"), new Model("M3"));
        cars.put(new Make("Porsche"), new Model("Macan"));
        cars.put(new Make("Mercedes-Benz"), new Model("CLA"));

        for (Map.Entry keyValue : cars.entrySet()) {
            System.out.println(keyValue.getKey() + " - " + keyValue.getValue());
        }
    }
}
