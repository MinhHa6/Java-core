package Gt.List;

public class MergeSortedLists {

    // Định nghĩa node danh sách liên kết
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Hàm gộp hai danh sách liên kết đã sắp xếp
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Nối phần còn lại nếu có
        current.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }

    // Hàm in danh sách liên kết (để kiểm tra)
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Hàm main để chạy thử
    public static void main(String[] args) {
        // Danh sách 1: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));

        // Danh sách 2: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));

        // Gộp hai danh sách và in kết quả
        ListNode merged = mergeTwoLists(list1, list2);
        printList(merged); // Kết quả mong muốn: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
    }
}
