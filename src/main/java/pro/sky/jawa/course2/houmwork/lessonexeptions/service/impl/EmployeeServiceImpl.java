package pro.sky.jawa.course2.houmwork.lessonexeptions.service.impl;


import org.springframework.stereotype.Service;
import pro.sky.jawa.course2.houmwork.lessonexeptions.data.Employee;
import pro.sky.jawa.course2.houmwork.lessonexeptions.exception.ArrayFullException;
import pro.sky.jawa.course2.houmwork.lessonexeptions.exception.EmployeeExistException;
import pro.sky.jawa.course2.houmwork.lessonexeptions.exception.NotFoundEmployeeException;
import pro.sky.jawa.course2.houmwork.lessonexeptions.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>(List.of(

            new Employee("Иван", "Иванов"),
            new Employee("Петр", "Петров"),
            new Employee("Василий", "Васильев"),
            new Employee("Борис", "Борисов"),
            new Employee("Андрей", "Андреев")
    ));


    public String addEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employees.add(employee);
        return String.valueOf(employee);
    }


    public String removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employees.remove(employee);
        return String.valueOf(employee);

    }


    public String findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        for (int i = 0; i < employees.size(); i++) {
            if (employee.equals(employees)) {
                return String.valueOf(employee);
            }
        }
        throw new NotFoundEmployeeException();
    }
}
