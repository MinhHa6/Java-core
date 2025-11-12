package core.oop;

import java.util.Date;

public class User {
    private  Integer id;// day la fields
    private  String  firstName;
    private String lastName;
    private Date dateOfBirth;
    private Address address;
    public   String message;// bien tham chieu cua doi tuong
    // day la constructor
    public User (){}
    // day la constructor co tham so truyen vao
    public User(Integer id,String firstName,String lastName,Date dateOfBirth)
    {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.dateOfBirth=dateOfBirth;
    }
    // day la method the hien cac hanh vi cua behavior
    public Integer getId(Integer id)
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id=id;
    }

    public Integer getId() {
        return id;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    // day la hanh vi behavior
    public String getFullName(String firstName,String lastName)
    {
        return firstName +" "+lastName;
    }
    // lop long nhau
    class Address {
        private  String street;
        private  String district;
        private String city;
        private String country;
    }
    public String toString() {
        return "{"
                + "\"id\": " + id + ", "
                + "\"firstName\": \"" + firstName + "\", "
                + "\"lastName\": \"" + lastName + "\""
                + "}";
    }
}
