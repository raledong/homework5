import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * author: rale
 * createdAt: 1/30/19
 */
public class CheckBinarySearchTreeTest {

    private CheckBinarySearchTree checkBinarySearchTree;
    @Before
    public void before() {
        checkBinarySearchTree = new CheckBinarySearchTree();
    }

    @Test
    public void testEmpty() {
        boolean result = checkBinarySearchTree.check(null);
        Assert.assertTrue(result);
    }

    @Test
    public void testSingleRoot() {
        TreeNode root = new TreeNode('a');
        boolean result = checkBinarySearchTree.check(root);
        Assert.assertTrue(result);
    }

    @Test
    public void testFalseBinarySearchTree() {
        TreeNode root = new TreeNode();
        root.setNumber(2);

        TreeNode left = new TreeNode();
        left.setNumber(3);
        root.setLeftChild(left);

        TreeNode right = new TreeNode();
        right.setNumber(4);
        root.setRightChild(right);

        boolean result = checkBinarySearchTree.check(root);
        Assert.assertFalse(result);
    }

    @Test
    public void testTrueBinarySearchTree() {
        TreeNode root = new TreeNode();
        root.setNumber(2);

        TreeNode left = new TreeNode();
        left.setNumber(1);
        root.setLeftChild(left);

        TreeNode right = new TreeNode();
        right.setNumber(3);
        root.setRightChild(right);

        boolean result = checkBinarySearchTree.check(root);
        Assert.assertTrue(result);
    }

    @Test
    public void testComplicateFalseBinarySearchTree() {
        TreeNode root = new TreeNode();
        root.setNumber(2);

        TreeNode left = new TreeNode();
        left.setNumber(1);
        root.setLeftChild(left);

        TreeNode leftRight = new TreeNode();
        leftRight.setNumber(10);
        left.setRightChild(leftRight);

        TreeNode right = new TreeNode();
        right.setNumber(3);
        root.setRightChild(right);

        boolean result = checkBinarySearchTree.check(root);
        Assert.assertFalse(result);
    }

}
