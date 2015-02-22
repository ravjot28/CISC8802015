public class AssignmentAlgo {

	public static void main(String[] args) {
		Node controller = new Node();
		controller.setAvgTime(10);
		controller.setClassName("web.OwnerController.showOwner");
		Node service = new Node();
		service.setAvgTime(10);
		service.setClassName("service.ClinicServiceImpl");
		Node aop = new Node();
		aop.setAvgTime(10);
		aop.setClassName("util.CallMonitoringAspect.invoke");
		Node dao = new Node();
		dao.setAvgTime(10);
		dao.setClassName("repository.jpa.JpaOwnerRepositoryImpl.findById");

		Tree tree = new Tree();

		tree.addNode(controller);
		tree.addNode(service);
		tree.addNode(aop);
		tree.addNode(dao);

		new AssignmentAlgo().algo(tree);

	}

	public void algo(Tree tree) {
		Node temp = tree.getStartingPoint();

		while (temp != null) {
			System.out.println(temp.getClassName());
			temp = temp.getNextNode();
		}
	}

}
