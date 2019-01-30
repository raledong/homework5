import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * author: rale
 * createdAt: 1/30/19
 */
public class FindKthElementTest {

    private FindKthElement findKthElement;

    @Before
    public void before() {
        findKthElement = new FindKthElement();
    }

    @Test
    public void testFindNull() {
        int result = findKthElement.find(0, null);
        int expect = -1;
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testFindOutOfBound() {
        IndexedTreeNode root = new IndexedTreeNode(1, 1);
        int result = findKthElement.find(2, root);
        int expect = -1;
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testFindNormal() {
        IndexedTreeNode root = new IndexedTreeNode(2, 2);
        IndexedTreeNode left = new IndexedTreeNode(1, 1);
        IndexedTreeNode right = new IndexedTreeNode(3, 1);
        root.setLeftChild(left);
        root.setRightChild(right);
        int result = findKthElement.find(3, root);
        int expect = 3;
        Assert.assertEquals(expect, result);
    }

    @Test
    public void testFindNormalComplicate() {
        IndexedTreeNode root = new IndexedTreeNode(2,2);
        IndexedTreeNode left = new IndexedTreeNode(1, 1);
        IndexedTreeNode right = new IndexedTreeNode(3, 1);
        IndexedTreeNode rightRight = new IndexedTreeNode(5, 1);
        root.setLeftChild(left);
        root.setRightChild(right);
        right.setRightChild(right);
        int result = findKthElement.find(4, root);
        int expect = 5;
        Assert.assertEquals(expect, result);
    }
}
