package HomeWorkApp.lesson_five;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String telephone;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String telephone, double salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Employee data:\nFull name: " + this.fullName + "\nPosition: " + this.position +
                        "\nEmail: " + this.email + "\nTelephone: " + this.telephone +
                "\nSalary: " + this.salary + "\nAge: " + this.age);
    }

    public int getAge() {
        return age;
    }
}
