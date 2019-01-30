/**
 * author: rale
 * createdAt: 1/30/19
 */
public class IndexedTreeNode extends TreeNode {

    private int index;

    public IndexedTreeNode(int number, int index) {
        super(number);
        this.index = index;
    }
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
