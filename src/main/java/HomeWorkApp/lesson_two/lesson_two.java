package HomeWorkApp.lesson_two;

public class lesson_two {

    public static void main(String[] args) {

        int a = 1;
        consoleLog(jobSeparator(a++));
        consoleLog(String.valueOf(amountBetween(5, 10)));
        consoleLog(jobSeparator(a++));
        numberPositive(-4);
        consoleLog(jobSeparator(a++));
        consoleLog(String.valueOf(numberNegative(0)));
        consoleLog(jobSeparator(a++));
        outputMultipleTimes("text for log console", 5);
        consoleLog(jobSeparator(a++));
        int year = 1700;
        consoleLog("Год " + year + " високосный = " + leapYear(year));
        year = 400;
        consoleLog("Год " + year + " високосный = " + leapYear(year));
        year = 2020;
        consoleLog("Год " + year + " високосный = " + leapYear(year));
        year = 2022;
        consoleLog("Год " + year + " високосный = " + leapYear(year));
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
     * от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    public static boolean amountBetween(int a, int b){

        boolean result = false;
        int sum = a + b;

        if (sum > 10 && sum <= 20){
            result = true;
        }

        return result;

    }

    /**
     * 2. Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
     * Замечание: ноль считаем положительным числом.
     */

    public static void numberPositive(int a){

        String textLog;
        if (numberNegative(a)){
            textLog = "Число " + a + " отрицательное";
        }else {
            textLog = "Число " + a + " положительное";
        }
        consoleLog(textLog);

    }

    /**
     * 3. Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    public static boolean numberNegative(int a){

        boolean result = false;
        String textLog;
        if (a < 0){
            result = true;
        }
        return result;
    }

    /**
     * 4. Написать метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */
    public static void outputMultipleTimes(String textLog, int manyTimes){

        while((manyTimes--) > 0){
            consoleLog(textLog);
        }

    }

    /**
     * 5. Написать метод, который определяет, является ли год високосным, и возвращает
     * boolean (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й – високосный.
     */
    public static boolean leapYear(int year){

        boolean result = year%400 == 0 || (year%4 == 0 && year%100 != 0);
        return result;

    }


    /**
     * Служебные мметоды
     */
    public static String jobSeparator(int numberTask){

        return "Задание №" + numberTask;

    }

    public static void consoleLog(String textLog){

        System.out.println(textLog);

    }
}
