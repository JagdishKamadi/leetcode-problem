public class Main {
    public static void main(String[] args) {
        int[] l1 = {9, 9, 9, 9, 9, 9, 9};
        int[] l2 = {9, 9, 9};

        ListNode head1 = new ListNode(l1[0]);
        ListNode l1CurrentNode = head1;
        for (int i = 1; i < l1.length; i++) {
            l1CurrentNode.next = new ListNode(l1[i]);
            l1CurrentNode = l1CurrentNode.next;
        }

        ListNode head2 = new ListNode(l2[0]);
        ListNode l2CurrentNode = head2;
        for (int i = 1; i < l2.length; i++) {
            l2CurrentNode.next = new ListNode(l2[i]);
            l2CurrentNode = l2CurrentNode.next;
        }

        ListNode listNode = new Solution().addTwoNumbers(head1, head2);
        while (listNode != null) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }
}
