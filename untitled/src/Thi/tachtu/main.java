package Thi.tachtu;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap review:");
        String review = scanner.nextLine();

        // Bước 1: Chuyển câu về chữ thường (không dùng toLowerCase)
        String chuthuong="";
        for(int i=0;i<review.length();i++)
        {
            char c=review.charAt(i);
            if (c>='A' && c<='Z')
            {
                chuthuong+=(char)(c+32);
            }
            else {
                chuthuong+=c;
            }
        }

        System.out.println("Doan review khi chuyenthanhchuthuong"+chuthuong);
        // Bước 2: Tách từ thủ công (không gọi hàm riêng)
       String []words= new String[100];
       int wordIndex=0;
       String currenWord="";
       for(int i=0;i<chuthuong.length();i++)
       {
           char c=chuthuong.charAt(i);
           if(c==' ')
           {

               if(!currenWord.equals(""))
               {
                   words[wordIndex]=currenWord;
                   currenWord="";
               }
           }
           else
           {
               currenWord+=c;
           }
       }
       if(!currenWord.equals(""))
       {
           words[wordIndex++]=currenWord;

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
