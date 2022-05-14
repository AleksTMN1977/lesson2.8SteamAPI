package pro.sky.jawa.course2.houmwork.lessonexeptions;


import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private static Employee[] employees = new Employee[6];

    static {
        employees[0] = new Employee("Иван", "Иванов");
        employees[1] = new Employee("Петр", "Петров");
        employees[2] = new Employee("Василий", "Васильев");
        employees[3] = new Employee("Борис", "Борисов");
        employees[4] = new Employee("Андрей", "Андреев");
    }

    public Employee addEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        int index = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employee.equals(employees[i])) {
                throw new EmployeeExistException();
            }
            if (employees[i] == null) {
                index = i;
            }
        }
        if (index == -1) {
            throw new ArrayFullException();
        } else {
            employees[index] = employee;
        }
        return employee;
    }


    public Employee removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        for (int i = 0; i < employees.length; i++) {
            if (employee.equals(employees[i])) {
                employees[i] = null;
                return employee;

            }
        }
        throw new NotFoundEmployeeException();

    }

    public Employee findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        for (int i = 0; i < employees.length; i++) {
            if (employee.equals(employees[i])) {
                return employee;
            }
        }
        throw new NotFoundEmployeeException();
    }


}
