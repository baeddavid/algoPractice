/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func maxDepth(root *TreeNode) int {
	if root == nil {
		return 0
	}
	return mathMax(maxDepth(root.Left)+1, maxDepth(root.Right)+1)
}

func mathMax(a int, b int) int {
	if a > b {
		return a
	} else {
		return b
	}
}