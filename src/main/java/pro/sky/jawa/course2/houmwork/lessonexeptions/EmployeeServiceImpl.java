package pro.sky.jawa.course2.houmwork.lessonexeptions;


import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private static Employee[] employees = new Employee[10];

    static {
        employees[0] = new Employee("Иван", "Иванов");
        employees[1] = new Employee("Петр", "Петров");
        employees[2] = new Employee("Василий", "Васильев");
        employees[3] = new Employee("Борис", "Борисов");
        employees[4] = new Employee("Андрей", "Андреев");
    }


    public Employee addEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
            }

        }
        return employee;
    }

    public Employee removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        for (int i = 0; i < employees.length; i++) {
            if (employee.equals(employees[i])) {
                employees[i] = null;
            }

        }
        return employee;
    }

    public Employee findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        for (int i = 0; i < employees.length; i++) {
            if (employee.equals(employees[i])) {
                return employee;
            }
        }
        return null;
    }
}


