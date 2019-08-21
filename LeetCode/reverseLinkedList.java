/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // Iterative Solution
    // Time: O(n)
    // Space: O(1)
    public ListNode reverseListIterative(ListNode head) {
        // Initialize two pointers: one to head, one to prev
        ListNode current = head;
        ListNode prev = null;
        
        // As long as current is not null
        while(current != null) {
            // Create a next reference for the link next to current
            ListNode next = current.next;
            // Set the next pointer of current to prev
            current.next = prev;
            // Move prev up to current
            prev = current;
            // Move current up to next
            current = next;
        }
        // Return prev as it is our new list head
        return prev;
    }
    // Recursive Solution
    // Time: O(n)
    // Space: O(n) : because of the recursive calls onto our stack
    public ListNode reverseListRecursive(ListNode head) {
        // If the head or the link next to head is null, return head
        if(head == null || head.next == null)
            return head;
        // Find the newRevHead by recursively calling the function on head.next
        ListNode newRevHead = reverseListRecursive(head.next);
        // When we bottom out, set the next pointer of the link next to head to head
        head.next.next = head;
        // Set the next pointer of head to null
        head.next = null;
        // Return the newRevHead as it is the new head of our list
        return newRevHead;
    }
}