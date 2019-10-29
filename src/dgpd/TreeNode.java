package dgpd;

public class TreeNode {
	private Places data;
	private TreeNode leftSubTree;
	private TreeNode rightSubTree;
	
	
	public TreeNode() {
		super();
		this.data = null;;
		this.leftSubTree = null;
		this.rightSubTree = null;
	}

	public TreeNode(Places data) {
		super();
		this.data = data;
		this.leftSubTree = null;
		this.rightSubTree = null;
	}
	
	public TreeNode(Places data, TreeNode leftSubTree, TreeNode rightSubTree) {
		super();
		this.data = data;
		this.leftSubTree = leftSubTree;
		this.rightSubTree = rightSubTree;
	}

	@Override
	public String toString() {
		return "TreeNode [data=" + data + ", leftSubTree=" + leftSubTree + ", rightSubTree=" + rightSubTree + "]";
	}
	
	public void display() {
		toString();
	}

	public Places getData() {
		return data;
	}

	public void setData(Places data) {
		this.data = data;
	}

	public TreeNode getLeftSubTree() {
		return leftSubTree;
	}

	public void setLeftSubTree(TreeNode leftSubTree) {
		this.leftSubTree = leftSubTree;
	}

	public TreeNode getRightSubTree() {
		return rightSubTree;
	}

	public void setRightSubTree(TreeNode rightSubTree) {
		this.rightSubTree = rightSubTree;
	}
	
	
	
	
}
