public class Solution {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode lastNode = head;
        int n = 1;

        while (lastNode.next != null) {
            n++;
            lastNode = lastNode.next;
        }
        k = k % n;
        if (k == 0) {
            return head;
        }

        k = n - k;
        ListNode current = head;
        for (int i = 1; i < k; i++) {
            current = current.next;
        }
        ListNode newHead = current.next;
        current.next = null;
        lastNode.next = head;

        return newHead;
    }

    public static void printList(ListNode head) {
        System.out.print("[ ");

        while (head.next != null) {
            System.out.print(head.data + ", ");
            head = head.next;
        }
        System.out.println(head.data + " ]");
    }

    public static void main(String[] args) {
        int[] values = new int[]{0, 1, 2};
        int k = 4;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        printList(head);
        ListNode listNode = new Solution().rotateRight(head, k);
        printList(listNode);
    }
}
