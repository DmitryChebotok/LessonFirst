package HomeWorkApp;

import java.sql.SQLOutput;

/**
 * documentation for class
 */
public class HomeWorkApp {
    public static void main(String[] args) {
        outputSeparator();
        printThreeWords();
        outputSeparator();
        checkSumSign();
        outputSeparator();
        printColor();
        outputSeparator();
        compareNumbers();
    }

    /**
     * Создайте метод printThreeWords(), который при вызове должен отпечатать
     * в столбец три слова: Orange, Banana, Apple.
     */
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /**
     * Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их
     * любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма
     * больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
     * в противном случае - “Сумма отрицательная”;
     */
    public static void checkSumSign(){
        int a = 10;
        int b = 5;

        String message = ((a + b) >= 0) ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(message);
        // if((a + b) >= 0){
        //    System.out.println("Сумма положительная");
        //}else{
        //    System.out.println("Сумма отрицательная");
        //}
    }

    /**
     * Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
     * Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в
     * пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
     * если больше 100 (100 исключительно) - “Зеленый”;
     */
    public static void printColor(){
        int value = 40;
        String message;

        if(value <= 0){
            message = "Красный";
        }else if(value <= 100){
            message = "Желтый";
        }else{
            message = "Зеленый";
        }

        System.out.println(message);
    }

    /**
     * Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте
     * их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль
     * сообщение “a >= b”, в противном случае “a < b”
     */
    public static void compareNumbers(){
        int a = 10;
        int b = 20;
        String comparisonSign;

        if (a >= b){
            comparisonSign = ">=";
        }else{
            comparisonSign = "<";
        }

        System.out.println("a " + comparisonSign + " b");

    }

    public static void outputSeparator(){
        System.out.println();
        System.out.println("======new task======");
        System.out.println();
    }
}
