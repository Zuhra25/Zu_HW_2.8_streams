package pro.sky.ZuHW2.streams.WorkWithDepartment;

import pro.sky.ZuHW2.streams.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    public Employee maxSalary(int dep);
    public Employee minSalary(int dep);
    public List<Employee> allEmployeeInDep(int dep);
    public Map<Integer, List<Employee>> allEmployee ();
}