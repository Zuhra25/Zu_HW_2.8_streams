package pro.sky.ZuHW2.streams.services;

import pro.sky.ZuHW2.streams.Employee;

import java.util.Collection;

public interface EmployeeService {
    public Employee addEmployee(String firstName, String lastName, double salary, int department);

    public Employee removeEmployee(String firstName, String lastName, double salary, int department);

    public Employee findEmployee(String firstName, String lastName, double salary, int department);
    public Collection<Employee> printAll();

}