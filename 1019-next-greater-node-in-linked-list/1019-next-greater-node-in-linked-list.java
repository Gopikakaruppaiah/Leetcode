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
    public int[] nextLargerNodes(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int[] ans = new int[count];
        temp = head;
        int i = 0;
        while (temp != null) {
            ListNode curr = temp.next;
            while (curr != null && curr.val <= temp.val) {
                curr = curr.next;
            }
            if (curr != null) {
                ans[i] = curr.val;
            } else {
                ans[i] = 0;
            }
            temp = temp.next;
            i++;
        }
        return ans;
    }
}