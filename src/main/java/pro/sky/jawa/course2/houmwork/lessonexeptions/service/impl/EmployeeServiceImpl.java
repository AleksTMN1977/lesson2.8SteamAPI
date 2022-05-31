package pro.sky.jawa.course2.houmwork.lessonexeptions.service.impl;


import org.springframework.stereotype.Service;
import pro.sky.jawa.course2.houmwork.lessonexeptions.data.Employee;
import pro.sky.jawa.course2.houmwork.lessonexeptions.exception.NotFoundEmployeeException;
import pro.sky.jawa.course2.houmwork.lessonexeptions.service.EmployeeService;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    Map<Integer, Employee> employees;
    Integer NextId = 0;

    public EmployeeServiceImpl() {
        this.employees = new HashMap<>();

        employees.put(getNextId(), new Employee("Иван", "Иванов"));
        employees.put(getNextId(), new Employee("Петр", "Петров"));
        employees.put(getNextId(), new Employee("Василий", "Васильев"));
        employees.put(getNextId(), new Employee("Борис", "Борисов"));
        employees.put(getNextId(), new Employee("Андрей", "Андреев"));
    }

    private Integer getNextId() {
        Integer result = NextId;
        NextId = NextId + 1;
        return result;
    }

    @Override
    public String addEmployee(String firstName, String lastName) {
        employees.put(getNextId(), new Employee(firstName, lastName));
        return firstName + " " + lastName + " добавлен";

    }

    @Override
    public String removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsValue(employee)) {
            employees.remove(firstName, lastName);
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
        if (employees.containsValue(employee)) {
            return employee + " найден";
        }
        return messageNot();
    }

    @Override
    public String getEmployee(Integer id) {
        Employee employee = employees[id];
        if (employees.containsKey(id)) {
            return employees.employee(id);
        }
        return messageNot();
    }
}


