/**
 * 
 */

/**
 * @author javon
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GiftList list = new GiftList();
		System.out.println("Adding Gifts");
		GiftBasket FruitBasket = new GiftBasket(1, "Fruits", 500f);
		GiftBasket ToyBasket = new GiftBasket(2, "Toys", 3000f);
		GiftBasket ClothesBasket = new GiftBasket(3, "Clothes", 10000f);
		//GiftBasket BreadBasket = new GiftBasket(4, "Bread", 2500f);	
		
		list.addGiftBasketToEnd(FruitBasket);
		list.addGiftBasketToEnd(ToyBasket);
		list.addGiftBasketToEnd(ClothesBasket);
		//list.addGiftBasketToEnd(BreadBasket);
		
		
		list.display();
		}
		
		
		
		
		
		

	

}
