/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

// Iterative
func reverseList(head *ListNode) *ListNode {
	current := head
	var prev *ListNode = nil

	for current != nil {
		nextLink := current.Next
		current.Next = prev
		prev = current
		current = nextLink
	}
	return prev
}

// Recursive
func reverseList(head *ListNode) *ListNode {
	if head == nil || head.Next == nil {
		return head
	}

	newHead := reverseList(head.Next)
	head.Next.Next = head
	head.Next = nil
	return newHead
}