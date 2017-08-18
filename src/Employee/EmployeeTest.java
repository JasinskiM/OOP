package Employee;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-18.
 */
public class EmployeeTest {
    @Test
    public void raisSalaryTest(){
        Employee employee = new Employee(12,"Andrzej","Kaczka",1000);
        employee.raiseSalary(40);
        Assert.assertEquals(1400,employee.getSalary());
    }
}
