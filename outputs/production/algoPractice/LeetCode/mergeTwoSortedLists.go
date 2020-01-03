/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func mergeTwoLists(l1 *ListNode, l2 *ListNode) *ListNode {
	if l1 == nil {
		return l2
	}

	if l2 == nil {
		return l1
	}

	var answer *ListNode

	if l1.Val < l2.Val {
		answer = l1
		l1 = l1.Next
	} else {
		answer = l2
		l2 = l2.Next
	}

	answerCurrent := answer
	l1Current, l2Current := l1, l2

	for l1Current != nil && l2Current != nil {
		if l1Current.Val < l2Current.Val {
			answerCurrent.Next = l1Current
			l1Current = l1Current.Next
		} else {
			answerCurrent.Next = l2Current
			l2Current = l2Current.Next
		}
		answerCurrent = answerCurrent.Next
	}

	for l1Current != nil {
		answerCurrent.Next = l1Current
		answerCurrent, l1Current = answerCurrent.Next, l1Current.Next
	}

	for l2Current != nil {
		answerCurrent.Next = l2Current
		answerCurrent, l2Current = answerCurrent.Next, l2Current.Next
	}

	return answer
}