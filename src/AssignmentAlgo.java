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
		Node processRequest1 = new Node();
		children.add(processRequest);
		algo.addNode(doGet, children, service, 56);

		
		
		children = new ArrayList<Node>();
		Node doService = new Node();
		children.add(doService);
		algo.addNode(processRequest, children, doGet, 57);
		algo.addNode(processRequest1, children, doPut, 57);
		
		children = new ArrayList<Node>();
		Node doDispatch = new Node();
		children.add(doDispatch);
		algo.addNode(doService, children, processRequest, 57);
		
		children = new ArrayList<Node>();
		Node handle = new Node();
		Node processDispatchResult = new Node();
		children.add(handle);
		children.add(processDispatchResult);
		algo.addNode(doDispatch, children, doService, );
		
		children = new ArrayList<Node>();
		Node handleInternal = new Node();
		children.add(handleInternal);
		algo.addNode(handle, children, doDispatch, 47);
		
		children = new ArrayList<Node>();
		Node render = new Node();
		children.add(render);
		algo.addNode(processDispatchResult, children, doDispatch, 17);
		
		
		children = new ArrayList<Node>();
		Node invokeHandleMethod = new Node();
		children.add(invokeHandleMethod);
		algo.addNode(handleInternal, children, handle, 47);
		
		children = new ArrayList<Node>();
		Node render1 = new Node();
		children.add(render1);
		algo.addNode(render, children, processDispatchResult, 17);
		
		children = new ArrayList<Node>();
		Node invokeAndHandle = new Node();
		children.add(invokeAndHandle);
		algo.addNode(invokeHandleMethod, children, handleInternal, 46);
		
		children = new ArrayList<Node>();
		Node renderMergedOutputModel = new Node();
		children.add(renderMergedOutputModel);
		algo.addNode(render1, children, render, 19);
		
		children = new ArrayList<Node>();
		Node invokeForRequest = new Node();
		children.add(invokeForRequest);
		algo.addNode(invokeAndHandle, children, invokeHandleMethod, 28);
		
		children = new ArrayList<Node>();
		Node doEndTag = new Node();
		children.add(doEndTag);
		algo.addNode(renderMergedOutputModel, children, render1, 22);
		
		children = new ArrayList<Node>();
		Node doInvoke = new Node();
		children.add(doInvoke);
		algo.addNode(invokeForRequest, children, invokeAndHandle, 18);
		
		children = new ArrayList<Node>();
		Node setupHtmlGeneration = new Node();
		children.add(setupHtmlGeneration);
		algo.addNode(doEndTag, children, renderMergedOutputModel, 22);

		children = new ArrayList<Node>();
		Node processFindForm = new Node();
		children.add(processFindForm);
		Node showOwner = new Node();
		children.add(showOwner);
		Node showVitList = new Node();
		children.add(showVitList);
		Node ProcessUpdateOwnerForm = new Node();
		children.add(ProcessUpdateOwnerForm);
		//algo.addNode(doInvoke, children, invokeForRequest, );
		
		children = new ArrayList<Node>();
		Node generateWebResources = new Node();
		children.add(generateWebResources);
		algo.addNode(setupHtmlGeneration, children, doEndTag, 20);
		
		children = new ArrayList<Node>();
		Node invoke = new Node();
		children.add(invoke);
		//algo.addNode(, children, doInvoke, 48);
		
		children = new ArrayList<Node>();
		Node generateWebResources = new Node();
		children.add(generateWebResources);
		algo.addNode(setupHtmlGeneration, children, doEndTag, 20);

		children = new ArrayList<Node>();
		Node loadExtensions = new Node();
		children.add(loadExtensions);
		algo.addNode(generateWebResources, children, setupHtmlGeneration, 19);
		
		children = new ArrayList<Node>();
		Node proceed = new Node();
		children.add(proceed);
		//algo.addNode(invoke, children, , 48);
		
		children = new ArrayList<Node>();
		Node registerBuiltInExtensions = new Node();
		children.add(registerBuiltInExtensions);
		algo.addNode(loadExtensions, children, generateWebResources, 19);
		
		
		
		children = new ArrayList<Node>();
		Node invoke2 = new Node();
		children.add(invoke2);
		Node invokeJoinpoint = new Node();
		children.add(invokeJoinpoint);
		Node invoke3 = new Node();
		children.add(invoke3);
		Node invoke4 = new Node();
		children.add(invoke4);
		Node invoke5 = new Node();
		children.add(invoke5);
		//algo.addNode(proceed, children,invoke , );
		
		children = new ArrayList<Node>();
		Node scanForExtensions = new Node();
		children.add(scanForExtensions);
		algo.addNode(registerBuiltInExtensions, children, loadExtensions, 17);
		
		
		///////////////////////////////////
		//Now, I complete it one at a time:
		///////////////////////////////////
		
		
		
		children = new ArrayList<Node>();
		Node invokeWithinTransaction = new Node();
		children.add(invokeWithinTransaction);
		algo.addNode(invoke2, children, proceed, 48);
		
		children = new ArrayList<Node>();
		Node proceedWithInvocation = new Node();
		children.add(proceedWithInvocation);
		algo.addNode(invokeWithinTransaction, children, invoke2, 42);
		
		///////////////////////////////////
		///////////////////////////////////
		
		
		children = new ArrayList<Node>();
		Node invokeAdvicedMethod = new Node();
		children.add(invokeAdvicedMethod);
		algo.addNode(invoke4, children, proceed, 48);
		
		children = new ArrayList<Node>();
		Node invokeAdvicedMethodWithGivenArgs = new Node();
		children.add(invokeAdvicedMethodWithGivenArgs);
		algo.addNode(invokeAdvicedMethod, children, invoke4, 48);
		
		children = new ArrayList<Node>();
		Node invoke6 = new Node();
		children.add(invoke6);
		algo.addNode(invokeAdvicedMethodWithGivenArgs, children, invokeAdvicedMethod, 48);
		
		children = new ArrayList<Node>();
		Node proceed1 = new Node();
		children.add(proceed1);
		algo.addNode(invoke6, children, invokeAdvicedMethodWithGivenArgs, 48);
		
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