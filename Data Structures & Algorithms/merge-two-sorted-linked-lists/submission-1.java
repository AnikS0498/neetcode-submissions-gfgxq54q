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
        ListNode dn = new ListNode(Integer.MAX_VALUE);

        ListNode l1 = list1;
        ListNode l2 = list2;

        ListNode headNode = dn;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                dn.next = l1;
                l1 = l1.next;
            }
            else{
                dn.next = l2;
                l2 = l2.next;
            }
            dn = dn.next;
        }
        if(l1 == null)
            dn.next = l2;
        else if(l2 == null)
            dn.next = l1;
        
        return headNode.next;
    }
}