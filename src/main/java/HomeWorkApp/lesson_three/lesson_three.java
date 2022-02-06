package HomeWorkApp.lesson_three;

import java.util.Random;

public class lesson_three {

    public static void main(String[] args) {
        reverseValues();
        createArray();
        changeArray();
        fillDiagonal();
        createArraySpecificLength(20, 555);
        arrayMaxMin();
        int[] array = {2, 2, 2, 1, 2, 2, 10, 1};
        boolean arrayHasEquality = therePlaceEquality(array);
        array = shiftArray(array, -20, true);
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void reverseValues(){

        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        for (int i = 0; i < array.length; i++) {

            array[i] = (array[i] - 1) * -1;
        }

    }

    /**
     * 2. Задать пустой целочисленный массив длиной 100.
     * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    public static void createArray(){

        int arrayLength = 100;
        int[] array = new int[arrayLength];

        for(int i = 1; i <= arrayLength; i++){

            array[i-1] = i;

        }

    }

    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     * и числа меньшие 6 умножить на 2;
     */
    public static void changeArray(){

        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        for(int i = 0; i < array.length; i++){

            if(array[i] < 6){

                array[i] = array[i]*2;
            }
        }

    }

    /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
     * если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
     * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    public static void fillDiagonal(){
        int[][] array = new int[5][5];
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++) {
                if (i == j || i+j == array.length -1) {
                    array[i][j] = 1;
                }
            }
        }
    }


    /**
     * 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
     * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
    public static int[] createArraySpecificLength(int len, int initialValue){

        int[] array = new int[len];

        for(int i = 0; i < len; i++){

            array[i] = initialValue;
        }

        return array;
    }

    /**
     * 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
     */
    public static void arrayMaxMin(){
        Random random = new Random();

        int[] array = new int[10];
        int minNumber = -100;
        int maxNumber = 100;
        int diff = maxNumber - minNumber;
        for(int i = 0; i < array.length; i++){

            array[i] = random.nextInt(diff) + 1 + minNumber;
        }

        int min = array[0];
        int max = array[0];
        for (int j : array) {

            min = Math.min(min, j);
            max = Math.max(max, j);
        }

    }

    /**
     * 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
     * метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     */
    public static boolean therePlaceEquality(int[] array){

        boolean result = false;
        int sumLeft = 0;
        int sumRight;

        for (int i = 0; i < array.length - 1; i++){
            sumLeft = sumLeft + array[i];
            sumRight = 0;
            for (int j = i + 1; j < array.length; j++){
                sumRight = sumRight + array[j];
            }
            if (sumLeft == sumRight){
                result = true;
                break;
            }
        }

        return result;

    }

    /**
     * 8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
     * или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
     * Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
     * при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
     */

    // попробовал переопределить метод с доп параметрами
    public static int[] shiftArray(int[] array, int shift){
        return shiftArray(array, shift, false);
    }

    public static int[] shiftArray(int[] array, int shift, boolean testMode){

        // хотел почитать про умные сортировки, но решил изобретать велосипед
        // для перевода отрицательного смещения в положительное
        shift = (shift%array.length + array.length)%array.length;
        int endItem;
        while (shift-- != 0){

            endItem = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--){
                // с последнего двигаемся к первому предварительно сохранив последний элемент
                array[i] = array[i - 1];
            }
            array[0] = endItem;

        }
        if(testMode) {
            for (int j : array) {
                System.out.print(j + " ");
            }
        }

        return array;
    }

}
