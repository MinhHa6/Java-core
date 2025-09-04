package OT.OOP;

public class Main {
    public static void main(String[] args) {
        User.Address addr = new User.Address("23Nd","Nd");
        User user = new User(1L, "Hà", 22, addr);

        System.out.println(user);

        user.setId(2L);
        user.setName("Hoàng");
        user.setAddress(new User.Address("456 Trần Hưng Đạo", "HCM"));
        System.out.println(user);
    }

}
