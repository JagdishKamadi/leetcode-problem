import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
    }

    public ListNode reverseList(ListNode head) {
        List<Integer> lst = new ArrayList<>();
        while (head.next != null) {
            lst.add(head.val);
            head = head.next;
        }
        return buildList(lst.reversed().stream()
                .mapToInt(Integer::intValue)
                .toArray());
    }

    private static ListNode buildList(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < n; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }
}
