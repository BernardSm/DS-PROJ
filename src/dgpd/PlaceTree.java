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
	
	public void insert(Places data) {
		TreeNode n, t;
		n = new TreeNode();
		if(n!=null) {
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
}
