package pro.sky.jawa.course2.houmwork.lessonexeptions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/add")
    public String addEmployee(@RequestParam("fName") String firstName, @RequestParam("lName") String lastName) {
        return "Сотрудник" + employeeService.addEmployee + "добавлен";
    }

    @GetMapping(path = "/remove")
    public String removeEmployee(@RequestParam("fName") String firstName, @RequestParam("lName") String lastName) {
        return "Сотрудник" + employeeService.removeEmployee + " удален";
    }

    @GetMapping(path = "/find")
    public String findEmployee(@RequestParam("fName") String firstName, @RequestParam("lName") String lastName) {
        return "Сотрудник" + employeeService.findEmployee + " найден";
    }

}

