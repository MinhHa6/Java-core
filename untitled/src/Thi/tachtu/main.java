package Thi.tachtu;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap review:");
        String review = scanner.nextLine();

        // Bước 1: Chuyển câu về chữ thường (không dùng toLowerCase)
        String chuThuong = "";
        for (int i = 0; i < review.length(); i++) {
            char c = review.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                chuThuong += (char) (c + 32);
            } else {
                chuThuong += c;
            }
        }
        System.out.println("Doan van sau khi duoc chuyen doi la:"+chuThuong);

        // Bước 2: Tách từ thủ công (không gọi hàm riêng)
        String[] words = new String[100];
        int wordIndex = 0;
        String currentWord = "";
        for (int i = 0; i < chuThuong.length(); i++) {
            char c = chuThuong.charAt(i);
            if (c == ' ') {
                if (!currentWord.equals("")) {
                    words[wordIndex++] = currentWord;
                    currentWord = "";
                }
            } else {
                currentWord += c;
            }
        }
        if (!currentWord.equals("")) {
            words[wordIndex++] = currentWord;
        }

        // In ra các từ đã tách
        System.out.print("Các từ được tách: ");
        for (int i = 0; i < wordIndex; i++) {
            System.out.print("[" + words[i] + "] ");
        }
        System.out.println();

        // Bước 3: Danh sách từ cảm xúc
        String[] positiveWords = {"tốt", "hài lòng", "tuyệt vời", "ổn", "nhẹ", "thích", "đẹp", "ưng", "mượt"};
        String[] negativeWords = {"tệ", "không tốt", "thất vọng", "kém", "xấu", "không hài lòng", "không thích"};

        int posCount = 0;
        int negCount = 0;

        // Bước 4: Đếm số từ tích cực và tiêu cực
        for (int i = 0; i < wordIndex; i++) {
            String word = words[i];
            for (int j = 0; j < positiveWords.length; j++) {
                if (word.equals(positiveWords[j])) {
                    posCount++;
                    break;
                }
            }
            for (int j = 0; j < negativeWords.length; j++) {
                if (word.equals(negativeWords[j])) {
                    negCount++;
                    break;
                }
            }
        }

        // Bước 5: Phân loại cảm xúc
        String sentiment;
        if (posCount > negCount) {
            sentiment = "Tích cực";
        } else if (posCount < negCount) {
            sentiment = "Tiêu cực";
        } else {
            sentiment = "Trung lập";
        }

        // In kết quả
        System.out.println("Số từ tích cực: " + posCount);
        System.out.println("Số từ tiêu cực: " + negCount);
        System.out.println("Kết quả: " + sentiment);
    }
}
