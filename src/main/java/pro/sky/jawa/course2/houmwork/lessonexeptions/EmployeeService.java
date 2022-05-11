package pro.sky.jawa.course2.houmwork.lessonexeptions;


import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public String addEmployee;
    public String removeEmployee;
    public String findEmployee;

    public static final Employee[] employees = new Employee[10];


    public static void employeeService(String[] args) {

        employees[0] = new Employee("Иван", "Иванов");
        employees[1] = new Employee("Петр", "Петров");
        employees[2] = new Employee("Василий", "Васильев");
        employees[3] = new Employee("Бороис", "Борисов");
        employees[4] = new Employee("Андрей", "Андреев");
    }

}
