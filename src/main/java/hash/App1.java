package hash;

import java.util.HashSet;

public class App1 {
    public static void main(String[] args) {

        //first hashset
        HashSet<String> countries = new HashSet<>();
        countries.add("Germany");
        countries.add("England");
        countries.add("Canada");
        countries.add("Australia");

        countries.forEach(country -> System.out.println(country));

        //second hashset
        HashSet<Make> cars = new HashSet<>();
        cars.add(new Make("Toyota"));
        cars.add(new Make("Subaru"));
        cars.add(new Make("Mazda"));
        cars.add(new Make("Honda"));

        System.out.println(cars);
    }
}
