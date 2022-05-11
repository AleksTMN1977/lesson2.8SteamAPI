package pro.sky.jawa.course2.houmwork.lessonexeptions;

public interface EmployeeService {
    Employee addEmployee(String lastName, String firstName);
    Employee removeEmployee(String lastName, String firstName);;
    Employee  findEmployee(String lastName, String firstName);
}
