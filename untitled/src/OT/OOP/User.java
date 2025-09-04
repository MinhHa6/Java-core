package OT.OOP;

public class User {
    // cac thuoc tinh user
    private Long id; // identity
    private String name;
    private Integer age;
    private Address address;

    public User(Long id, String name, Integer age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
// ham khoi tao

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // lop long nhau
   static  class   Address {
        private String street;
        private String city;
        public Address(String street, String city) {
            this.street = street;
            this.city = city;
        }

        @Override
        public String toString() {
            return "Address{street='" + street + "', city='" + city + "'}";
        }
    }
    // in ra doi tuong do
    @Override
    public String toString() {
        return "User{" +
                "Id=" + id +
                ", Name='" + name + '\'' +
                ", Age=" + age +
                ", Address=" + address +
                '}';
    }
}
