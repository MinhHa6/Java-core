package core.bt.lab9;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BookManager bookManager = new BookManager();
        bookManager.input();
        bookManager.display();
        bookManager.sortByPrice();
        System.out.println("Sach su khi giam theo gia la:");
        bookManager.display();
    }
}
