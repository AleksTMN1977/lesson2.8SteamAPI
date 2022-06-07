package pro.sky.jawa.course2.houmwork.lessonexeptions.service;


import pro.sky.jawa.course2.houmwork.lessonexeptions.data.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {


    Employee addEmployee(String firstName, String lastName, Integer departamentId, Integer salary);

    Employee removeEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);

    Employee maxSalary(Integer departamentId);

    List<Employee> allDepartament(Integer departamentId);

    Map<Integer, List<Employee>> groupByDepartament();
}
