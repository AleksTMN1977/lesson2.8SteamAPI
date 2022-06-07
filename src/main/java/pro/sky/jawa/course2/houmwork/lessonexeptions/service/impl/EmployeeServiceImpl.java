package pro.sky.jawa.course2.houmwork.lessonexeptions.service.impl;


import org.springframework.stereotype.Service;
import pro.sky.jawa.course2.houmwork.lessonexeptions.data.Employee;
import pro.sky.jawa.course2.houmwork.lessonexeptions.exception.NotFoundEmployeeException;
import pro.sky.jawa.course2.houmwork.lessonexeptions.service.EmployeeService;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    Map<String, Employee> employees;


    public EmployeeServiceImpl() {
        this.employees = new HashMap<>();

        employees.put(getKey("Иван", "Иванов"), new Employee("Иван", "Иванов",
                1, 53000));
        employees.put(getKey("Петр", "Петров"), new Employee("Петр", "Петров",
                1, 55000));
        employees.put(getKey("Василий", "Васильев"), new Employee("Василий", "Васильев",
                2, 28000));
        employees.put(getKey("Борис", "Борисов"), new Employee("Борис", "Борисов",
                2, 31000));
        employees.put(getKey("Андрей", "Андреев"), new Employee("Андрей", "Андреев",
                3, 45000));
        employees.put(getKey("Сергей", "Сергеев"), new Employee("Сергей", "Сергеев",
                3, 41000));
    }

    private String getKey(String firstName, String lastName) {
        return firstName + lastName;
    }


    @Override
    public Employee addEmployee(String firstName, String lastName, Integer departament, Integer salary) {
        Employee employee = new Employee(firstName, lastName, departament, salary);
        employees.put(getKey(firstName, lastName), employee);
        return employee;
    }

    @Override
    public Employee removeEmployee(String firstName, String lastName) {
        String key = getKey(firstName, lastName);
        if (employees.containsKey(key)) {
            return employees.remove(key);
        }
        throw new NotFoundEmployeeException();
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        String key = getKey(firstName, lastName);
        if (employees.containsKey(key)) {
            return employees.get(key);
        }
        throw new NotFoundEmployeeException();
    }

    @Override
    public Employee maxSalary(Integer departamentId) {
        return employees.values().stream()
                .filter(employee -> employee.getDepartamentId().equals(departamentId))
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NotFoundEmployeeException::new);

  /*      int max = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees.values()) {
            if (employee.getDepartamentId().equals(departamentId) && max < employee.getSalary()) {
                max = employee.getSalary();
                result = employee;
            }
        }
        return result;*/
    }


    public List<Employee> allDepartament(Integer departamentId) {
        return employees.values().stream()
                .filter(employee -> employee.getDepartamentId().equals(departamentId))
                .collect(Collectors.toList());

    }

    @Override
    public Map<Integer, List<Employee>> groupByDepartament() {
        return employees.values().stream()
                .collect(Collectors.groupingBy(Employee::getDepartamentId));
    }
}


