package HomeWorkApp.lesson_seven;

public class Plate {
    private int food;

    public Plate(int food) {

        this.food = food;

    }

    public void addFood(int amount){

        this.food += amount;

    }

    public boolean decreaseFood(int n) {

        boolean result = food >= n;

        if (food >= n){
            food -= n;
        }

        return result;

    }

    public void info() {

       System.out.println("plate: " + food);

    }
}
