package pro.sky.jawa.course2.houmwork.lessonexeptions.service;

import pro.sky.jawa.course2.houmwork.lessonexeptions.data.Employee;
import pro.sky.jawa.course2.houmwork.lessonexeptions.exception.NotFoundEmployeeException;

public interface EmployeeService {

    String addEmployee(String firstName, String lastName);

    String removeEmployee(String firstName, String lastName) throws NotFoundEmployeeException;

    String findEmployee(String firstName, String lastName);
}
