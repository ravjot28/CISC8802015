import java.util.ArrayList;
import java.util.List;

public class AssignmentAlgo {

	public static void main(String[] args) {

		Node doFilter = new Node();
		Node doFilter1 = new Node();

		List<Node> children = new ArrayList<Node>();
		children.add(doFilter1);
		doFilter.setChildren(children);
		doFilter.setCost(58);
		Method m = new Method();
		List<Node> nodes = new ArrayList<Node>();
		nodes.add(doFilter);
		m.setNodes(nodes);
		doFilter.setMethod(m);
		doFilter.setParent(null);

		Node doFilterInternal = new Node();
		Node doFilterInternal1 = new Node();
		children = new ArrayList<Node>();
		children.add(doFilterInternal);
		children.add(doFilterInternal1);
		doFilter1.setChildren(children);
		doFilter1.setCost(57);
		m = new Method();
		nodes = new ArrayList<Node>();
		nodes.add(doFilter1);
		m.setNodes(nodes);
		doFilter1.setMethod(m);
		doFilter1.setParent(doFilter);
		
		
		Node service = new Node();
		children = new ArrayList<Node>();
		children.add(doGet);
		children.add(doPut);
		service.setChildren(children);
		service.setCost(57);
		m = new Method();
		nodes = new ArrayList<Node>();
		nodes.add(doFilterInternal1);
		m.setNodes(nodes);
		doFilterInternal1.setMethod(m);
		doFilterInternal1.setParent(doFilter1);
		
		Node doGet = new Node();
		Node doPut = new Node();
		children = new ArrayList<Node>();
		children.add(ProcessRequest);
		doGet.setChildren(children);
		doGet.setCost(56);
		doPut.setChildren(children);
		doPut.setCost(62);
		m = new Method();
		nodes = new ArrayList<Node>();
		nodes.add(service);
		m.setNodes(nodes);
		service.setMethod(m);
		service.setParent(doFilterInternal1);
		
		Node ProcessRequest = new Node();
		children = new ArrayList<Node>();
		children.add(doService);
		ProcessRequest.setChildren(children);
		ProcessRequest.setCost(57);
		m = new Method();
		nodes = new ArrayList<Node>();
		nodes.add(doGet);
		nodes.add(doPut);
		m.setNodes(nodes);
		doGet.setMethod(m);
		doGet.setParent(service);
		doPut.setMethod(m);
		doPut.setParent(service);
		
		Node doService = new Node();
		children = new ArrayList<Node>();
		children.add(doDispatch);
		doService.setChildren(children);
		doService.setCost(57);
		m = new Method();
		nodes = new ArrayList<Node>();
		nodes.add(ProcessRequest);
		m.setNodes(nodes);
		ProcessRequest.setMethod(m);
		ProcessRequest.setParent(service);

		
		Node doDispatch = new Node();
		children = new ArrayList<Node>();
		children.add(handle);
		children.add(processDispatchResult);
		doDispatch.setChildren(children);
		doDispatch.setCost(57);
		m = new Method();
		nodes = new ArrayList<Node>();
		nodes.add(doService);
		m.setNodes(nodes);
		doService.setMethod(m);
		doService.setParent(service);
		
		Node doDispatch = new Node();
		children = new ArrayList<Node>();
		children.add(handle);
		children.add(processDispatchResult);
		doDispatch.setChildren(children);
		doDispatch.setCost(57);
		m = new Method();
		nodes = new ArrayList<Node>();
		nodes.add(doService);
		m.setNodes(nodes);
		doService.setMethod(m);
		doService.setParent(service);		
		
		
		
	}

	public void reduceRecursivePaths(Node n) {
		n.setAdjustedParent(findAdjustedParent(n));

		n.getAdjustedParent().getAdjustedChildren().add(n);
		List<Node> nodes = n.getChildren();
		for (Node c : nodes)
			reduceRecursivePaths(n);
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