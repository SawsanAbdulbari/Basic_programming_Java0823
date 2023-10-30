import java.util.ArrayList;
import java.util.Collections;

public class Array {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Kia");
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Renault");

        for (String car : cars) {
            System.out.println(car);
        }

        cars.add(cars.indexOf("Kia") + 1, "Ford");

        cars.remove("Tesla");

        cars.set(cars.indexOf("BMW"), "Audi");

        System.out.println("MODIFIED LIST");
        for (String car : cars)
        {
            System.out.println(car);
        }

        Collections.sort(cars);

        System.out.println("SORTED LIST");
        for (String car : cars)
        {
            System.out.println(car);
        }
    }

}





