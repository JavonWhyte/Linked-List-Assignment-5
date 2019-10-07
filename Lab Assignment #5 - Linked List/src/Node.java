
public class Node {
	//Class Attributes
	private GiftBasket data;
	private Node next;
	
	//Default Constructor
	public Node() {
		super();
		this.data = new GiftBasket();
		this.data = null;
	}
	
	//Primary Constructor
	public Node(GiftBasket Data, Node Next) {
		super();
		this.data = Data;
		this.next = Next;
	}
	
	//Setters
	public void SetData(GiftBasket Data) {
		data = Data;
	}
	
	public void SetNext(Node Next) {
		next = Next;
	}
	
	//Getters
	public GiftBasket GetData() {
		return data;
	}
	
	public Node GetNext() {
		return next;
	}
	
	
	
	
}
