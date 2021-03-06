import java.util.List;

public class Tree {

	private Node root;
	private List<Method> methods;

	public void addNode(Node currNode, List<Node> children, Node parent, int cost) {

		currNode.setChildren(children);
		currNode.setCost(cost);
		currNode.setParent(parent);

	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public List<Method> getMethods() {
		return methods;
	}

	public void setMethods(List<Method> methods) {
		this.methods = methods;
	}

	public void addNode(Node node) {}
}
