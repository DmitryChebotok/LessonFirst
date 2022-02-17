package HomeWorkApp.lesson_six;

public abstract class Animal {
    public String name;
    public int runningDistance;
    public int swimDistance;
    public static int NUMBER_COPIES = 0;

    static {
        NUMBER_COPIES++;
    }

    public Animal(String name, int runningDistance, int swimDistance){
        this.name = name;
        this.runningDistance = runningDistance;
        this.swimDistance = swimDistance;
    }

    public void swim(int distance){
        if(distance > this.swimDistance){
            System.out.printf("%s не может проплыть %d\n", this.name, distance);
        }else{
            System.out.printf("%s проплыл %d\n", this.name, distance);
        }
    }

    public void run(int distance){
        if(distance > this.runningDistance){
            System.out.printf("%s не может пробежать %d\n", this.name, distance);
        }else{
            System.out.printf("%s пробежал %d\n", this.name, distance);
        }
    }

}
