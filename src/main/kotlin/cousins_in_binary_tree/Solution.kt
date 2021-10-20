package cousins_in_binary_tree

import kotlin.math.max

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {

    fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
        val a1 = ancestor(root, x)
        val a2 = ancestor(root, y)
        return if(a1 == a2) false
        else depth(root, x) == depth(root, y)
    }

    fun depth(root: TreeNode?, value: Int) : Int {
        return if (root == null) Int.MIN_VALUE
        else if (root.`val` == value) 0
        else 1 + max(depth(root.left, value), depth(root.right, value))
    }

    fun ancestor(root: TreeNode?, value: Int) : TreeNode? {
        return if (root == null) null
        else if (root.left?.`val` == value || root.right?.`val` == value) root
        else {
            val l = ancestor(root.left, value)
            val r = ancestor(root.right, value)
            if (l== null && r == null) null
            else if (r == null) l
            else r
        }
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}