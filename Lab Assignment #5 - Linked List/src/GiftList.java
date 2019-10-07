
public class GiftList {
	//Class Attributes
	private Node head;
	
	//Default Constructor
	public GiftList() {
		Node head = null;
	}
	
	//Class Methods
	public boolean isEmpty() {
		if(head ==null ) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Checks if there is any additional memory
	 * */
	public boolean isFull() {
		//attempt to allocate memory for a new node
		Node temp = new Node();
		//if memory is successfully allocated the address of the the Node object
		//will be stored in the variable temp
		if(temp == null) {
			//if temp is null, no address, no memory allocated
			return true;
		}else {
			//successfully allocaed memory
			//release resources
			temp = null; //CPP : delete temp;
			return false;
		}
	}

	public boolean addGiftBasketToEnd(GiftBasket GoodieBag) {
		if(isFull()) {
			System.out.println("List is full, unable to add to back");
			return false;
		}else {
			Node nextItem = new Node();
			nextItem.SetData(GoodieBag);
			if(isEmpty()) {
				head = nextItem;
			}else {
				Node current = head;
				while(current.GetNext()!=null) {
					current = current.GetNext();
				} 
					current.SetNext(nextItem);
				}
			return true;
			}
		}//add to back ends here.
	
	public void display() {
		if(isEmpty()) {
			System.out.println("List is empty, nothing to display");
		}else {
			Node current = head;
			while(current!=null) {
				current.GetData().display();
				current = current.GetNext();
			}
		}
	}
}
