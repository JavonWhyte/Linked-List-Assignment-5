
public class GiftBasket {
	//declaration of attributes
private int id;
private String type;
private float cost;

	//Default Constructor
	public GiftBasket() {
		int id = 0;
		String type = "";
		float cost = 000;
	}
	
	//Primary Constructor
	public GiftBasket(int ID, String Type, float Cost) {
		id = ID;
		type = Type;
		cost = Cost;
	}
	
	//Copy Constructor 
	public GiftBasket(GiftBasket GoodieBag) {
		SetId(GoodieBag.GetId());
		SetType(GoodieBag.GetType());
		SetCost(GoodieBag.GetCost());
	}
	
	//Setters
	public void SetId(int ID) {
		id = ID;
	}
	
	public void SetType(String Type) {
		type = Type;
	}
	
	public void SetCost(float Cost) {
		cost = Cost;
	}
	
	//Getters
	public int GetId() {
		return id;
	}
	
	public String GetType() {
		return type;
	}
	
	public float GetCost() {
		return cost;
	}

	//Class Methods
	@Override
	public String toString() {
		return "GiftBasket [id=" + id + ", type=" + type + ", cost=" + cost + "]";
	}
	
	public void display() {
		System.out.println(toString());
	}
	
	
	
}
