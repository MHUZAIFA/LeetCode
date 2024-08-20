/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode sortedList = new ListNode();
        ListNode header = sortedList;
        
        while(head1 != null || head2 != null) {
            
            if (head1 != null && head2 == null) {
                ListNode newNode = new ListNode(head1.val, null);
                header.next = newNode;
                head1 = head1.next;
            } else if (head2 != null && head1 == null) {
                ListNode newNode = new ListNode(head2.val, null);
                header.next = newNode;
                head2 = head2.next;
            } else if (head1.val < head2.val) {
                ListNode newNode = new ListNode(head1.val, null);
                header.next = newNode;
                head1 = head1.next;
            } else if (head1.val > head2.val) {
                ListNode newNode = new ListNode(head2.val, null);
                header.next = newNode;
                head2 = head2.next;
            } else {
                ListNode newNode1 = new ListNode(head2.val, null);
                ListNode newNode2 = new ListNode(head1.val, null);
                header.next = newNode1;
                header = header.next;
                header.next = newNode2;
                head1 = head1.next;
                head2 = head2.next;
            }
            header = header.next;
        }
        
        ListNode newheader = sortedList;
        
        
        while(newheader != null) {
            System.out.println(newheader.val);
            newheader = newheader.next;
        }
        
        
        return sortedList.next;
    }
}