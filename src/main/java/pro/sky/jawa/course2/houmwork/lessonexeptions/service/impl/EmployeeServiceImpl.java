package pro.sky.jawa.course2.houmwork.lessonexeptions.service.impl;


import org.springframework.stereotype.Service;
import pro.sky.jawa.course2.houmwork.lessonexeptions.data.Employee;
import pro.sky.jawa.course2.houmwork.lessonexeptions.service.EmployeeService;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    Map<String, Employee> employees;


    public EmployeeServiceImpl() {
        this.employees = new HashMap<>();

        employees.put(getKey("Иван", "Иванов"), new Employee("Иван", "Иванов"));
        employees.put(getKey("Петр", "Петров"), new Employee("Петр", "Петров"));
        employees.put(getKey("Василий", "Васильев"), new Employee("Василий", "Васильев"));
        employees.put(getKey("Борис", "Борисов"), new Employee("Борис", "Борисов"));
        employees.put(getKey("Андрей", "Андреев"), new Employee("Андрей", "Андреев"));
    }

    private String getKey(String firstName, String lastName) {
        return firstName + lastName;
    }


    @Override
    public String addEmployee(String firstName, String lastName) {
        employees.put(getKey(firstName, lastName), new Employee(firstName, lastName));
        return firstName + " " + lastName + " добавлен";

    }

    @Override
    public String removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        String key = getKey(firstName, lastName);
        if (employees.containsKey(key)) {
            employees.remove(key);
            return employee + " удален";
        }
        return messageNot();
    }

    private String messageNot() {
        return "Сотрудник не обнаружен";
    }

    @Override
    public String findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        String key = getKey(firstName, lastName);
        if (employees.containsKey(key)) {
            return employee + " найден";
        }
        return messageNot();
    }
  }


