package HomeWorkApp.lesson_seven;

import java.rmi.UnexpectedException;

public class HomeWorkApp {

    public static void main(String[] args) {

        Cat[] arrayCat = new Cat[10];

        int addFood = 100;

        arrayCat[0] = new Cat("Barsik", 5);
        arrayCat[1] = new Cat("Tom", 50);
        arrayCat[2] = new Cat("Myrka", 13);
        arrayCat[3] = new Cat("Belka", 45);
        arrayCat[4] = new Cat("Vaska", 8);
        arrayCat[5] = new Cat("Mashka", 56);
        arrayCat[6] = new Cat("Timofey", 12);
        arrayCat[7] = new Cat("Kross", 67);
        arrayCat[8] = new Cat("Madina", 7);
        arrayCat[9] = new Cat("Gobel", 3);
        Plate plate = new Plate(100);
        plate.info();

        for (Cat cat : arrayCat) {

            cat.eat(plate);
            System.out.println(cat.info());
        }
        plate.addFood(addFood);
        plate.info();
    }
}
