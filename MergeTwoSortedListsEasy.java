/*Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeTwoSortedListsEasy {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head,curr = new ListNode(0);
        head = curr;
     
        while(l1!=null && l2!=null) {
            if(l1.val < l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
            
        }
        head.next = (l1 == null) ? l2:l1;
        return curr.next;
    }
}
