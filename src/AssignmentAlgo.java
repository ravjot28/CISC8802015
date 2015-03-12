import java.util.ArrayList;
import java.util.List;

public class AssignmentAlgo {

	private Node root;

	public void addNode(Node currNode, List<Node> children, Node parent, int cost) {

		currNode.setChildren(children);
		currNode.setCost(cost);
		currNode.setParent(parent);

	}

	public static void main(String[] args) {
		AssignmentAlgo algo = new AssignmentAlgo();
		algo.root = new Node();

		List<Node> children = new ArrayList<Node>();
		Node doFilter = new Node();
		children.add(doFilter);
		algo.addNode(algo.root, children, null, 58);

		children = new ArrayList<Node>();
		Node doFilterInternal = new Node();
		Node doFilterInternal1 = new Node();
		children.add(doFilterInternal);
		children.add(doFilterInternal1);
		algo.addNode(doFilter, children, algo.root, 57);

		children = new ArrayList<Node>();
		Node doFilter1 = new Node();
		children.add(doFilter1);
		algo.addNode(doFilterInternal, children, doFilter, 56);

		children = new ArrayList<Node>();
		Node service = new Node();
		children.add(service);
		algo.addNode(doFilterInternal1, children, doFilter, 56);

		children = new ArrayList<Node>();
		Node doGet = new Node();
		Node doPut = new Node();
		children.add(doGet);
		children.add(doPut);
		algo.addNode(service, children, doFilterInternal1, 56);

		children = new ArrayList<Node>();
		Node processRequest = new Node();
		children.add(processRequest);
		algo.addNode(doGet, children, service, 56);

		children = new ArrayList<Node>();
		children.add(processRequest);
		algo.addNode(doPut, children, service, 56);

		algo.calculateHeight(algo.root);
		System.out.println(algo.root.getHeight());

	}

	public void reduceRecursivePaths(Node n) {
		n.setAdjustedParent(findAdjustedParent(n));

		n.getAdjustedParent().getAdjustedChildren().add(n);
		List<Node> nodes = n.getChildren();
		for (Node c : nodes)
			reduceRecursivePaths(c);
	}

	public Node findAdjustedParent(Node current) {
		Node match1 = null;
		Node match2 = null;
		Node n = current.getParent();

		while (n != null && match2 == null) {
			if (n.getMethod() == current.getMethod()) {
				if (match1 == null) {
					match1 = n;
				} else
					match2 = n;
			}
			n = n.getAdjustedParent();
			if (match1 == null || match2 == null) {
				return current.getParent();
			}
			Node n1 = current.getParent();
			Node n2 = match1.getAdjustedParent();
			while (n1 != match1 && n2 != match2) {
				if (n1.getMethod() != n2.getMethod()) {
					return current.getParent();

				}
				n1 = n1.getAdjustedParent();
				n2 = n2.getAdjustedParent();

				if (n1 != match1 || n2 != match2) {
					return current.getParent();
				}
			}
		}

		return match1.getAdjustedParent();
	}

	public void minCPD(Method m) {
		m.setMinCPD(99999999);
		Node n = m.getNodes().get(0);
		n = n.getAdjustedParent();
		while (n != null) {
			int dist = CPD(n.getMethod(), m);
			if (dist < m.getMinCPD()) {
				m.setMinCPD(dist);
				m.setCommonParent(n.getMethod());
			}
			n = n.getParent();
		}
	}

	public int CPD(Method p, Method m) {
		List<Node> nodes = m.getNodes();
		int cpd = 0;
		for (Node n : nodes) {
			int dist = Distance(p, n);
			if (dist > cpd)
				cpd = dist;
		}
		return cpd;

	}

	public int Distance(Method m, Node n) {
		int dist = 0;
		while (true) {
			dist = dist + 1;
			if (n == null)
				return 99999999;
			if (n.getMethod() == m)
				return dist;
		}
	}

	public void calculateHeight(Node v) {
		v.setHeight(0);
		List<Node> nodes = v.getAdjustedChildren();
		for (Node c : nodes) {
			calculateHeight(c);
			if ((c.getHeight() + 1) > v.getHeight())
				v.setHeight(c.getHeight() + 1);
		}
		if (v.getHeight() > v.getMethod().getMaxHeight())
			v.getMethod().setMaxHeight(v.getHeight());
	}

	public void CalculateInducedCost(Node n) {
		n.setInduced(n.getCost());
		List<Node> nodes = n.getChildren();
		for (Node c : nodes) {
			CalculateInducedCost(c);
			if (c.getMethod().isSubsumed())
				n.setInduced(n.getInduced() + c.getInduced());
		}
		n.getMethod().setInduced(n.getMethod().getInduced() + n.getInduced());

	}
}