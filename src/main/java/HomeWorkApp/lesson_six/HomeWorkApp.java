package HomeWorkApp.lesson_six;

import java.sql.SQLOutput;

public class HomeWorkApp {

    public static void main(String[] args) {

        Cat catBarsic = new Cat("Барсик");
        catBarsic.swim(500);
        catBarsic.run(10);
        catBarsic.run(250);

        Dog dogBobic = new Dog("Боб");
        dogBobic.swim(5);
        dogBobic.swim(11);
        dogBobic.run(200);
        dogBobic.run(600);

        System.out.println("Создано животных: " + Animal.NUMBER_COPIES);
        System.out.println("Создано котов: " + Cat.NUMBER_COPIES);
        System.out.println("Создано собак: " + Dog.NUMBER_COPIES);

    }

}
