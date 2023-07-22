package pro.sky.ZuHW2.streams;

import java.util.Collection;

public interface EmployeeService {
    public Employee addEmployee(String firstName, String lastName, double salary, int department);

    public Employee removeEmployee(String firstName, String lastName, double salary, int department);

    public Employee findEmployee(String firstName, String lastName, double salary, int department);

    public Collection<Employee> printAll();

}