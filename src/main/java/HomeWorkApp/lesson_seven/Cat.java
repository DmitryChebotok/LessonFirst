package HomeWorkApp.lesson_seven;

public class Cat {
    private String name;
    private int appetite;
    private boolean wellFed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.wellFed = false;
    }
    public void eat(Plate p) {

        this.wellFed = p.decreaseFood(appetite);

    }

    public String info(){
        return "Cat: " + this.name + " " + (wellFed ? "сытый" : "голодный");
    }
}
