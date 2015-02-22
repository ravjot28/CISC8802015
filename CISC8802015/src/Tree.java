public class Tree {

	private Node startingPoint;
	private Node lastAddedPoint;

	public Node getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(Node startingPoint) {
		this.startingPoint = startingPoint;
	}

	public Node getLastAddedPoint() {
		return lastAddedPoint;
	}

	public void setLastAddedPoint(Node lastAddedPoint) {
		this.lastAddedPoint = lastAddedPoint;
	}

	public void addNode(Node node) {
		if (lastAddedPoint == null) {
			lastAddedPoint = node;
			startingPoint = node;
		} else {
			lastAddedPoint.setNextNode(node);
			lastAddedPoint = node;
		}
	}
}
