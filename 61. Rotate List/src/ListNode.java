public class ListNode {
    public Integer data;
    public ListNode next;

    public ListNode(Integer data) {
        this.data = data;
        next = null;
    }

    public ListNode(Integer data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}
