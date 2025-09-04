import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder l1Value = new StringBuilder();
        StringBuilder l2Value = new StringBuilder();

        while (l1 != null) {
            l1Value.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            l2Value.append(l2.val);
            l2 = l2.next;
        }
        l1Value.reverse();
        l2Value.reverse();

        int l1Size = l1Value.length();
        int l2Size = l2Value.length();

        int c1 = l1Size - 1;
        int c2 = l2Size - 1;
        List<Integer> lst = new ArrayList<>();
        int carry = 0;

        while (c1 >= 0 && c2 >= 0) {
            int sum = (l1Value.charAt(c1) - '0') + (l2Value.charAt(c2) - '0') + carry;
            lst.add(sum % 10);
            carry = sum / 10;
            c1--;
            c2--;
        }

        while (c1 >= 0) {
            int sum = (l1Value.charAt(c1) - '0') + carry;
            lst.add(sum % 10);
            carry = sum / 10;
            c1--;
        }

        while (c2 >= 0) {
            int sum = (l2Value.charAt(c2) - '0') + carry;
            lst.add(sum % 10);
            carry = sum / 10;
            c2--;
        }

        if (carry > 0) {
            lst.add(carry);
        }

        ListNode head = new ListNode(lst.getFirst());
        ListNode current = head;

        for (int i = 1; i < lst.size(); i++) {
            current.next = new ListNode(lst.get(i));
            current = current.next;
        }

        return head;
    }
}
