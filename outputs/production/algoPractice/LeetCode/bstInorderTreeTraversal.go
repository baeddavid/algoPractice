// O(n) memory solution
func inorderTraversal(root *TreeNode) []int {
	current := root
	var stack []*TreeNode
	var answer []int

	for current != nil || len(stack) > 0 {
		for current != nil {
			stack = append(stack, current)
			current = current.Left
		}
		current = stack[len(stack)-1]
		stack = stack[:len(stack)-1]
		answer = append(answer, current.Val)
		current = current.Right
	}
	return answer
}

// O(1) memory solution
func inorderTraversal(root *TreeNode) []int {
	var answer []int
	current := root
	for current != nil {
		if current.Left == nil {
			answer = append(answer, current.Val)
			current = current.Right
		} else {
			pre := current.Left
			for pre.Right != nil && pre.Right != current {
				pre = pre.Right
			}
			if pre.Right == nil {
				pre.Right = current
				current = current.Left
			} else {
				pre.Right = nil
				answer = append(answer, current.Val)
				current = current.Right
			}
		}
	}
	return answer
}

//Recursive
func inorderTraversal(root *TreeNode) []int {
	return helper(root, []int{})
}

func helper(node *TreeNode, result []int) []int {
	if node == nil {
		return result
	}

	var left, right []int
	if node.Left != nil {
		left = helper(node.Left, result)
	}
	if node.Right != nil {
		right = helper(node.Right, result)
	}
	result = append(result, left...)
	result = append(result, node.Val)
	result = append(result, right...)
	return result
}