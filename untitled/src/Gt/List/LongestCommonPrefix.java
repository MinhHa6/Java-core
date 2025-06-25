package Gt.List;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0]; // Bắt đầu với chuỗi đầu tiên làm tiền tố

        for (int i = 1; i < strs.length; i++) { // Duyệt qua các chuỗi còn lại
            while (!strs[i].startsWith(prefix)) {
                // Nếu không phải tiền tố, cắt bớt 1 ký tự cuối của prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return ""; // Không có tiền tố chung
                }
            }
        }

        return prefix;
    }
}
