package homework5;

public class ListOfEmployees {


    public static void main(String[] args) {

        int age = 40;
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Федоров Василий", "Инженер", "fedorov@mail.ru", "89285552525", 30000, 25);
        employees[1] = new Employee("Бегунков Александр", "Директор", "begunkov@mail.ru", "89307852222", 150000, 48);
        employees[2] = new Employee("Строкин Владимир", "Водитель", "strokin@mail.ru", "89204589632", 45000, 38);
        employees[3] = new Employee("Булкин Владислав", "Технолог", "bulkin@mail.ru", "89305874525", 35000, 52);
        employees[4] = new Employee("Тихонов Алексей", "Генеральный директор", "tihonov@mail.ru", "89613332222", 285000, 25);

        for (Employee employee : employees) {
            if(employee.getAge() > age){
                employee.printInfoEmployee();
            }

        }
    }


}
