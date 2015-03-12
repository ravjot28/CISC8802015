import java.util.ArrayList;
import java.util.List;

public class AssignmentAlgo {

	private Node root;

	public void addNode(Node currNode, List<Node> children, Node parent,
			int cost) {

		currNode.setChildren(children);
		currNode.setCost(cost);
		currNode.setParent(parent);

	}

	public static void main(String[] args) {
		AssignmentAlgo algo = new AssignmentAlgo();

		algo.root = new Node();
		Method m = new Method();
		m.setName("m");
		algo.root.setMethod(m);

		Node doFilterInternal = new Node();
		Method m1 = new Method();
		m1.setName("m1");
		doFilterInternal.setMethod(m1);
		Node doFilterInternal1 = new Node();
		Method m2 = new Method();
		m2.setName("m2");
		doFilterInternal1.setMethod(m2);

		Node doFilter = new Node();
		Method m3 = new Method();
		m3.setName("m3");
		doFilter.setMethod(m3);
		Node doFilter1 = new Node();
		Method m50 = new Method();
		m50.setName("m50");
		doFilter1.setMethod(m50);

		Node service = new Node();
		Method m4 = new Method();
		m4.setName("m4");
		service.setMethod(m4);

		Node doGet = new Node();
		Method m5 = new Method();
		m5.setName("m5");
		doGet.setMethod(m5);
		Node doPut = new Node();
		Method m6 = new Method();
		m6.setName("m6");
		doPut.setMethod(m6);

		Node processRequest = new Node();
		Method m7 = new Method();
		m7.setName("m7");
		processRequest.setMethod(m7);
		Node processRequest1 = new Node();
		processRequest1.setMethod(m7);

		Node doService = new Node();
		Method m8 = new Method();
		m8.setName("m8");
		doService.setMethod(m8);
		Node doDispatch = new Node();
		Method m9 = new Method();
		m9.setName("m9");
		doDispatch.setMethod(m9);
		Node handle = new Node();
		Method m10 = new Method();
		m10.setName("m10");
		handle.setMethod(m10);
		Node processDispatchResult = new Node();
		Method m11 = new Method();
		m11.setName("m11");
		processDispatchResult.setMethod(m11);
		Node getSingleResult = new Node();
		Method m12 = new Method();
		m12.setName("m12");
		getSingleResult.setMethod(m12);
		Node handleInternal = new Node();
		Method m13 = new Method();
		m13.setName("m13");
		handleInternal.setMethod(m13);

		Node render = new Node();
		Method m14 = new Method();
		m14.setName("m14");
		render.setMethod(m14);
		Node render1 = new Node();
		Method m15 = new Method();
		m15.setName("m15");
		render1.setMethod(m15);

		Node invokeHandleMethod = new Node();
		Method m16 = new Method();
		m16.setName("m16");
		invokeHandleMethod.setMethod(m16);
		Node invokeAndHandle = new Node();
		Method m17 = new Method();
		m17.setName("m17");
		invokeAndHandle.setMethod(m17);
		Node renderMergedOutputModel = new Node();
		Method m18 = new Method();
		m18.setName("m18");
		renderMergedOutputModel.setMethod(m18);
		Node invokeForRequest = new Node();
		Method m19 = new Method();
		m19.setName("m19");
		invokeForRequest.setMethod(m19);

		Node showVitList = new Node();
		Method m20 = new Method();
		m20.setName("m20");
		showVitList.setMethod(m20);
		Node doEndTag = new Node();
		Method m21 = new Method();
		m21.setName("m21");
		doEndTag.setMethod(m21);
		Node setupHtmlGeneration = new Node();
		Method m22 = new Method();
		m22.setName("m22");
		setupHtmlGeneration.setMethod(m22);
		Node doInvoke = new Node();
		Method m23 = new Method();
		m23.setName("m23");
		doInvoke.setMethod(m23);
		Node processFindForm = new Node();
		Method m24 = new Method();
		m24.setName("m24");
		processFindForm.setMethod(m24);
		Node showOwner = new Node();
		Method m25 = new Method();
		m25.setName("m25");
		showOwner.setMethod(m25);
		Node ProcessUpdateOwnerForm = new Node();
		Method m26 = new Method();
		m26.setName("m26");
		ProcessUpdateOwnerForm.setMethod(m26);
		Node generateWebResources = new Node();
		Method m27 = new Method();
		m27.setName("m27");
		generateWebResources.setMethod(m27);

		Node invoke = new Node();
		Method m28 = new Method();
		m.setName("m1");
		invoke.setMethod(m28);
		Node invoke1 = new Node();
		invoke1.setMethod(m28);
		Node invoke2 = new Node();
		invoke2.setMethod(m28);
		Node invoke3 = new Node();
		invoke3.setMethod(m28);

		Node invoke4 = new Node();
		Method m29 = new Method();
		m29.setName("m29");
		invoke4.setMethod(m29);
		Node invoke5 = new Node();
		Method m30 = new Method();
		m30.setName("m30");
		invoke5.setMethod(m30);
		Node invoke6 = new Node();
		Method m31 = new Method();
		m31.setName("m31");
		invoke6.setMethod(m31);
		Node invoke7 = new Node();
		Method m32 = new Method();
		m32.setName("m32");
		invoke7.setMethod(m32);
		Node invoke8 = new Node();
		Method m33 = new Method();
		m33.setName("m33");
		invoke8.setMethod(m33);
		Node invoke9 = new Node();
		Method m34 = new Method();
		m34.setName("m34");
		invoke9.setMethod(m34);
		Node invoke10 = new Node();
		invoke10.setMethod(m34);

		Node loadExtensions = new Node();
		Method m35 = new Method();
		m35.setName("m35");
		loadExtensions.setMethod(m35);

		Method m36 = new Method();
		m36.setName("m36");
		Node proceed1 = new Node();
		proceed1.setMethod(m36);
		Node proceed2 = new Node();
		proceed2.setMethod(m36);
		Node proceed3 = new Node();
		proceed3.setMethod(m36);
		Node proceed4 = new Node();
		proceed4.setMethod(m36);

		Node invokeJointPointUsingReflection = new Node();
		Method m37 = new Method();
		m37.setName("m37");
		invokeJointPointUsingReflection.setMethod(m37);
		Node registerBuiltInExtensions = new Node();
		Method m38 = new Method();
		m38.setName("m38");
		registerBuiltInExtensions.setMethod(m38);
		Node scanForExtensions = new Node();
		Method m39 = new Method();
		m39.setName("m39");
		scanForExtensions.setMethod(m39);
		Node invokeJoinpoint = new Node();
		Method m40 = new Method();
		m40.setName("m40");
		invokeJoinpoint.setMethod(m40);

		Node invokeWithinTransaction = new Node();
		Method m41 = new Method();
		m41.setName("m41");
		invokeWithinTransaction.setMethod(m41);
		Node invokeAdviceMethod = new Node();
		Method m42 = new Method();
		m42.setName("m42");
		invokeAdviceMethod.setMethod(m42);

		Node proceedWithInvocation = new Node();
		Method m43 = new Method();
		m43.setName("m43");
		proceedWithInvocation.setMethod(m43);
		Node findOwnerByLastName = new Node();
		Method m44 = new Method();
		m44.setName("m44");
		findOwnerByLastName.setMethod(m44);
		Node findByLastName = new Node();
		Method m45 = new Method();
		m45.setName("m45");
		findByLastName.setMethod(m45);
		Node findOwnerById = new Node();
		Method m46 = new Method();
		m46.setName("m46");
		findOwnerById.setMethod(m46);
		Node findById = new Node();
		Method m47 = new Method();
		m47.setName("m47");
		findById.setMethod(m47);
		Node invokeAdviceMethodWithGivenArgs = new Node();
		Method m48 = new Method();
		m48.setName("m48");
		invokeAdviceMethodWithGivenArgs.setMethod(m48);
		Node getResultList = new Node();
		Method m49 = new Method();
		m49.setName("m49");
		getResultList.setMethod(m49);

		List<Node> children = new ArrayList<Node>();
		children.add(doFilter);
		algo.addNode(algo.root, children, null, 58);

		children = new ArrayList<Node>();

		children.add(doFilterInternal);
		children.add(doFilterInternal1);
		algo.addNode(doFilter, children, algo.root, 57);

		children = new ArrayList<Node>();

		children.add(doFilter1);
		algo.addNode(doFilterInternal, children, doFilter, 57);

		children = new ArrayList<Node>();

		children.add(service);
		algo.addNode(doFilterInternal1, children, doFilter, 57);

		children = new ArrayList<Node>();

		children.add(doGet);
		children.add(doPut);
		algo.addNode(service, children, doFilterInternal1, 57);

		children = new ArrayList<Node>();

		children.add(processRequest);
		algo.addNode(doGet, children, service, 56);
		algo.addNode(doPut, children, service, 62);

		children = new ArrayList<Node>();

		children.add(doService);
		algo.addNode(processRequest, children, doGet, 57);
		algo.addNode(processRequest1, children, doPut, 57);

		children = new ArrayList<Node>();

		children.add(doDispatch);
		algo.addNode(doService, children, processRequest, 57);

		children = new ArrayList<Node>();

		children.add(handle);
		children.add(processDispatchResult);
		algo.addNode(doDispatch, children, doService, 57);

		children = new ArrayList<Node>();

		children.add(handleInternal);
		algo.addNode(handle, children, doDispatch, 47);

		children = new ArrayList<Node>();

		children.add(render);
		algo.addNode(processDispatchResult, children, doDispatch, 16);

		children = new ArrayList<Node>();

		children.add(invokeHandleMethod);
		algo.addNode(handleInternal, children, handle, 47);

		children = new ArrayList<Node>();

		children.add(render1);
		algo.addNode(render, children, processDispatchResult, 17);

		children = new ArrayList<Node>();

		children.add(invokeAndHandle);
		algo.addNode(invokeHandleMethod, children, handleInternal, 47);

		children = new ArrayList<Node>();

		children.add(renderMergedOutputModel);
		algo.addNode(render1, children, render, 17);

		children = new ArrayList<Node>();

		children.add(invokeForRequest);
		algo.addNode(invokeAndHandle, children, invokeHandleMethod, 46);

		children = new ArrayList<Node>();

		children.add(doEndTag);
		algo.addNode(renderMergedOutputModel, children, render1, 19);

		children = new ArrayList<Node>();

		children.add(doInvoke);
		algo.addNode(invokeForRequest, children, invokeAndHandle, 28);

		children = new ArrayList<Node>();

		children.add(setupHtmlGeneration);
		algo.addNode(doEndTag, children, renderMergedOutputModel, 22);

		children = new ArrayList<Node>();

		children.add(processFindForm);

		children.add(showOwner);

		children.add(showVitList);

		children.add(ProcessUpdateOwnerForm);
		algo.addNode(doInvoke, children, invokeForRequest, 18);

		children = new ArrayList<Node>();

		children.add(generateWebResources);
		algo.addNode(setupHtmlGeneration, children, doEndTag, 20);

		children = new ArrayList<Node>();

		children.add(invoke);
		algo.addNode(processFindForm, children, doInvoke, 155);
		children = new ArrayList<Node>();

		children.add(invoke1);
		algo.addNode(showOwner, children, doInvoke, 25);
		children = new ArrayList<Node>();

		children.add(invoke2);
		algo.addNode(showVitList, children, doInvoke, 41);
		children = new ArrayList<Node>();

		children.add(invoke3);
		algo.addNode(ProcessUpdateOwnerForm, children, doInvoke, 40);

		children = new ArrayList<Node>();

		children.add(loadExtensions);
		algo.addNode(generateWebResources, children, setupHtmlGeneration, 20);

		children = new ArrayList<Node>();

		children.add(proceed1);
		algo.addNode(invoke, children, processFindForm, 48);
		children = new ArrayList<Node>();

		children.add(proceed2);
		algo.addNode(invoke1, children, showOwner, 48);
		children = new ArrayList<Node>();

		children.add(proceed3);
		algo.addNode(invoke2, children, showVitList, 48);
		children = new ArrayList<Node>();

		children.add(proceed4);
		algo.addNode(invoke3, children, ProcessUpdateOwnerForm, 48);

		children = new ArrayList<Node>();

		children.add(registerBuiltInExtensions);
		algo.addNode(loadExtensions, children, generateWebResources, 19);

		children = new ArrayList<Node>();

		children.add(scanForExtensions);
		algo.addNode(registerBuiltInExtensions, children, loadExtensions, 17);

		children = new ArrayList<Node>();

		children.add(invoke4);
		algo.addNode(proceed1, children, invoke, 47);

		children.add(invokeJoinpoint);
		algo.addNode(proceed2, children, invoke1, 47);

		children.add(invoke5);
		algo.addNode(proceed3, children, invoke2, 47);

		children.add(invoke6);
		algo.addNode(proceed4, children, invoke3, 47);

		children = new ArrayList<Node>();

		children.add(invokeWithinTransaction);
		algo.addNode(invoke4, children, proceed1, 48);

		children = new ArrayList<Node>();

		children.add(invokeJointPointUsingReflection);
		algo.addNode(invokeJoinpoint, children, proceed2, 48);

		algo.addNode(invoke5, null, proceed3, 48);

		children = new ArrayList<Node>();

		children.add(invokeAdviceMethod);
		algo.addNode(invoke6, children, proceed4, 48);

		algo.addNode(invoke7, null, proceed4, 48);

		algo.addNode(scanForExtensions, null, registerBuiltInExtensions, 17);

		children = new ArrayList<Node>();

		children.add(proceedWithInvocation);
		algo.addNode(invokeWithinTransaction, children, invoke4, 48);

		children = new ArrayList<Node>();
		children.add(findOwnerByLastName);
		children.add(findByLastName);
		children.add(findOwnerById);
		children.add(findById);
		algo.addNode(invokeJointPointUsingReflection, children,
				invokeJoinpoint, 48);

		children = new ArrayList<Node>();

		children.add(invokeAdviceMethodWithGivenArgs);
		algo.addNode(invokeAdviceMethod, children, invoke6, 48);

		algo.addNode(proceedWithInvocation, null, invokeWithinTransaction, 42);

		children = new ArrayList<Node>();

		children.add(invoke8);
		algo.addNode(invokeAdviceMethodWithGivenArgs, children,
				invokeAdviceMethod, 48);

		algo.addNode(findByLastName, null, invokeJointPointUsingReflection, 151);

		children = new ArrayList<Node>();

		children.add(getResultList);

		children.add(invoke9);
		algo.addNode(findByLastName, children, invokeJointPointUsingReflection,
				150);

		algo.addNode(findOwnerById, null, invokeJointPointUsingReflection, 22);

		children = new ArrayList<Node>();

		children.add(getResultList);

		children.add(invoke10);
		algo.addNode(findById, children, invokeJointPointUsingReflection, 22);

		algo.addNode(invoke8, null, invokeAdviceMethodWithGivenArgs, 48);

		algo.addNode(getResultList, null, findByLastName, 150);

		algo.addNode(getSingleResult, null, findById, 21);

		algo.addNode(invoke9, null, findByLastName, 8);

		algo.addNode(invoke10, null, findById, 8);

		algo.reduceRecursivePaths(doFilter);

		System.out.println(doFilter.getAdjustedChildren().size());

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