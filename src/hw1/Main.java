package hw1;

import marathon.competitors.Competitor;
import marathon.competitors.Dog;

import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {


        Competitors[] competitors = {
            new Human("Борис", 2000, 4),
            new Cat("Мурзик", 200, 7),
            new Robot("Т800", 3000, 10),
            new Human("Анатолий", 2500, 3),
            new Cat("Ёрзик", 500, 4),
            new Robot("Т1000", 5000, 20),

        };

        Obstruction[] obstructions = {
                new Wall(4),
                new Treadmill(400),
                new Wall(11),
                new Treadmill(3500)
        };



        for (Competitors c: competitors) {
            for (Obstruction o: obstructions) {
                o.tryIt(c);
                if (c.doYouDisqualified()) {
                    break;
                }
            }

        }



    }
}
