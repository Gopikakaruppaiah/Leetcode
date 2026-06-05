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
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        int[] values = new int[n];
        temp = head;
        for (int i = 0; i < n; i++) {
            values[i] = temp.val;
            temp = temp.next;
        }
        int[] ans = new int[n];
        int[] stack = new int[n];
        int top = -1;
        for (int i = n - 1; i >= 0; i--) {
            while (top != -1 && stack[top] <= values[i]) {
                top--;
            }
            ans[i] = (top == -1) ? 0 : stack[top];
            stack[++top] = values[i];
        }
        return ans;
    }
}