package HomeWorkApp.lesson_six;

public class Dog extends Animal{
    static int runningDistance = 500;
    static int swimDistance = 10;
    static int NUMBER_COPIES = 0;

    static {
        NUMBER_COPIES++;
    }

    public Dog(String name) {
        super(name, runningDistance, swimDistance);
    }

}
