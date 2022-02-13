package HomeWorkApp.lesson_six;

public class Cat extends Animal {
    static int runningDistance = 200;
    static int swimDistance = 0;
    static int NUMBER_COPIES = 0;

    static {
        NUMBER_COPIES++;
    }

    public Cat(String name) {
        super(name, runningDistance, swimDistance);
    }

    @Override
    public void swim(int distance){
        System.out.println("Коты не умеют плавать");
    }
}
