package HomeWorkApp.lesson_five;

public class HomeWorkApp {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
                            "892312312", 30000, 30);
        employees[1] = new Employee("Форер Алексей Леонидович", "Актер", "ForerAlex@mailbox.com",
                                        "89584739398", 100000, 48);
        employees[2] = new Employee("Лебедев Евгений Олегович", "Программист",
                                "Lebedev.E.O.@mailbox.com", " 89518730044", 350000, 27);
        employees[3] = new Employee("Климин Максим Юрьевич", "Футболист", "KliminMYU@mailbox.com",
                            "89518730081", 20000000, 22);
        employees[4] = new Employee("Насибов Тимур Рауфович", "Врач", "NasibTR@mailbox.com",
                            "89518730078", 67000, 41);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }

    //        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

    }

}
