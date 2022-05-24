package pro.sky.jawa.course2.houmwork.lessonexeptions.service;

import pro.sky.jawa.course2.houmwork.lessonexeptions.data.Employee;
import pro.sky.jawa.course2.houmwork.lessonexeptions.exception.NotFoundEmployeeException;

public interface EmployeeService {

    Employee addEmployee(String firstName, String lastName);

    Employee removeEmployee(String firstName, String lastName) throws NotFoundEmployeeException;

    Employee findEmployee(String firstName, String lastName);
}
