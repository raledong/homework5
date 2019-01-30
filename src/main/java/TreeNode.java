/**
 * author: rale
 * createdAt: 1/20/19
 * 树节点
 */
public class TreeNode {

    private int number;

    private TreeNode leftChild;

    private TreeNode rightChild;

    public TreeNode(){

    }

    public TreeNode(int number) {
        this.number = number;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (! (obj instanceof TreeNode)) return false;
        TreeNode other = (TreeNode) obj;
        return other.getNumber() == this.getNumber() &&
                (this.getLeftChild() == null ? other.getLeftChild()==null : this.getLeftChild().equals(other.getLeftChild()))&&
                (this.getRightChild() == null ? other.getRightChild() == null : this.getRightChild().equals(other.getRightChild()));
    }

    @Override
    public int hashCode() {
        return ((int)(this.getNumber())) +
                (leftChild == null ? 0 : leftChild.hashCode()) +
                (rightChild == null ? 0 : rightChild.hashCode());
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
