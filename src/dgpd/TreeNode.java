package dgpd;

public class TreeNode {
	private Places data;
	private TreeNode leftSubTree;
	private TreeNode rightSubTree;
	
	
	public TreeNode() {
		super();
		this.data = new Places();
		this.leftSubTree = null;
		this.rightSubTree = null;
	}

	public TreeNode(Places data, TreeNode leftSubTree, TreeNode rightSubTree) {
		super();
		this.data = data;
		this.leftSubTree = leftSubTree;
		this.rightSubTree = rightSubTree;
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
