package dgpd;

public class PlaceTree {
	private TreeNode root;

	public PlaceTree() {
		super();
		this.root = null;
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	public boolean isEmpty() {
		if(root == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@SuppressWarnings("unused")
	public boolean isFull() {
		TreeNode temp = new TreeNode();
		if(temp == null) {
			return true;
		}else {
			temp = null;//delete temp;
			return false;
		}
	}
	
	public void insert(Places data) {
		TreeNode n, t;
		n = new TreeNode();
		if(!isFull()) {
			n.setData(data);
			n.setLeftSubTree(null);
			n.setRightSubTree(null);
			
			if(this.root == null) {
				root = n;
			}
			else {
				t = root;
				while(t!=null) {
					if(n.getData().getId() < t.getData().getId()) {
						if(t.getLeftSubTree()==null) {
							t.setLeftSubTree(n);
							return;
						}
						else {
							t = t.getLeftSubTree();
						}
					}
					else {
						if(t.getRightSubTree()==null) {
							t.setRightSubTree(n);
							return;
						}
						else {
							t = t.getRightSubTree();
						}
					}
				}
			}
		}
		else {
			System.out.println("Error: Out of memory, cannot add new node.");
		}
	}
	
	public void preOrder(TreeNode current) {
		if(current == null)return;
		System.out.println(current.getData().toString()+" ");
		preOrder(current.getLeftSubTree());
		preOrder(current.getRightSubTree());
	}
	
	public void inOrder(TreeNode current) {
		if(current == null)return;
		System.out.println(current.getLeftSubTree().toString()+" ");
		System.out.println(current.getData().toString()+" ");
		inOrder(current.getRightSubTree());
	}

	public void postOrder(TreeNode current) {
		if(current == null)return;
		postOrder(current.getLeftSubTree());
		postOrder(current.getRightSubTree());
		System.out.println(current.getData().toString()+" ");
	}
	
}

