package pro.sky.jawa.course2.houmwork.lessonexeptions;



public class EmployeeService {
    public static void employeeList(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иван", "Иванов");
        employees[1] = new Employee("Петр", "Петров");
        employees[2] = new Employee("Василий", "Васильев");
        employees[3] = new Employee("Бороис", "Борисов");
        employees[4] = new Employee("Андрей", "Андреев");
    }

}
