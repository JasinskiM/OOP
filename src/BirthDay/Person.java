package BirthDay;

/**
 * Created by RENT on 2017-08-25.
 */
public class Person {
    private String _name;
    private String _surname;
    private String _pesel;
    private char _gender;
    private Birthday _birthday;


    Person(String name, String surname, String pesel){
        _name = name;
        _surname = surname;
        _pesel = pesel;
    }

    public String getName(){
        return _name;
    }

    public String getSurname(){
        return _surname;
    }

    public String getPesel(){
        return _pesel;
    }

    public char getGender(){
        return _gender;
    }


}
