package pro.sky.jawa.course2.houmwork.lessonexeptions.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.jawa.course2.houmwork.lessonexeptions.data.Employee;
import pro.sky.jawa.course2.houmwork.lessonexeptions.service.EmployeeService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

    private final EmployeeService employeeService;
    private Integer id;

    public EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    @GetMapping
    public String employee() {
        return "Добро пожаловать в книгу работников";
    }

    @GetMapping(path = "/add")
    public Employee addEmployee(@RequestParam("firstName") String firstName,
                                @RequestParam("lastName") String lastName,
                                @RequestParam("dep") Integer departament,
                                @RequestParam("salary") Integer salary) {
        return employeeService.addEmployee(firstName, lastName, departament, salary);
    }

    @GetMapping(path = "/remove")
    public Employee removeEmployee(@RequestParam("firstName") String firstName,
                                   @RequestParam("lastName") String lastName) {
        return employeeService.removeEmployee(firstName, lastName);
    }

    @GetMapping(path = "/find")
    public Employee findEmployee(@RequestParam("firstName") String firstName,
                                 @RequestParam("lastName") String lastName) {
        return employeeService.findEmployee(firstName, lastName);
    }

    @GetMapping(path = "/departments/max-salary")
    public Employee maxSalary(@RequestParam("departmentId") Integer departamentId) {
        return employeeService.maxSalary(departamentId);
    }

    @GetMapping("/departments/all")
    public Map<Integer, List<Employee>> groupByDepartament() {
        return employeeService.groupByDepartament();
    }

    @GetMapping(value = "/departments/all", params = "departmentId")
    public List<Employee> allDepartament(@RequestParam("departmentId") Integer departamentId) {
        return employeeService.allDepartament(departamentId);
    }
}


