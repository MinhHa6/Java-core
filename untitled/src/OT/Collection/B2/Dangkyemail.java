package OT.Collection.B2;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Dangkyemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> emails = new LinkedHashSet<>(); // giữ thứ tự nhập

        System.out.println("Nhap email (go 'exit' de dung):");
        while (true) {
            String email = sc.nextLine();
            if (email.equalsIgnoreCase("exit")) {
                break;
            }
            if (!emails.add(email)) { // add() trả về false nếu đã tồn tại
                System.out.println("Email da ton tai, vui long nhap lai!");
            }
        }

        System.out.println("\nDanh sach email da dang ky:");
        for (String s : emails) {
            System.out.println(s);
        }
    }
}
