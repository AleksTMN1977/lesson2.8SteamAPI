package pro.sky.jawa.course2.houmwork.lessonexeptions.data;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private Integer departamentId;
    private Integer salary;

    public Employee(String firstName, String lastName, Integer departamentId, Integer salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departamentId = departamentId;
        this.salary = salary;
    }

    public Integer getDepartamentId() {
        return departamentId;
    }

    public void setDepartamentId(Integer departamentId) {
        this.departamentId = departamentId;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "{" +
                "Имя '" + firstName + '\'' +
                ", Фамилия'" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}

