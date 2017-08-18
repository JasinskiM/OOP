package Employee;

/**
 * Created by RENT on 2017-08-18.
 */
public class Employee {
    private int _id;
    private String _firstName;
    private String _lastName;
    private int _salary;

    public Employee(int id, String firstName,String lastName, int salary){
        _id = id;
        _firstName = firstName;
        _lastName = lastName;
        _salary = salary;


    }
    public int getId() {
        return _id;
    }

    public String getFirstName() {
        return _firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public int getSalary() {
        return _salary;
    }

    public String getName(){
        return _firstName+_lastName;
    }

    public void setSalary(int salary){
        _salary = salary;
    }

    public int getAnnualSalary(){
        return _salary*12;
    }

    public int raiseSalary(int percent){
        _salary = (int)(_salary + _salary*percent*0.01);
        return _salary;
    }
}
