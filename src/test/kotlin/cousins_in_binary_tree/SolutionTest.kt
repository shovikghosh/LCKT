package cousins_in_binary_tree

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val n1 = TreeNode(1)
    private val n2 = TreeNode(2)
    private val n3 = TreeNode(3)
    private val n4 = TreeNode(4)
    private val n5 = TreeNode(5)

    @BeforeEach
    fun setUp() {
        n1.left = n2
        n1.right = n3
        n2.right = n4
        n3.right = n5
    }

    @Test
    fun testDepth() {
        assertEquals(Solution().depth(n1, n3.`val`),1, "WTH!!")
    }

    @Test
    fun testAncestor() {
        val res = Solution().ancestor(n1, 4)
        assertEquals(res?.`val`, 2, "WTYY!")
    }

    @Test
    fun testIsCousin() {
        val res = Solution().isCousins(n1, 5 , 4)
        assertEquals(true, res, "JHGK!")
    }



}