public class Main {

	public static void main( String[] arg) {
		
		
					
		Milk milk1 = new Milk("milk",1);
		Milk milk2 = new Milk("milk",1);
		Milk milk3 = new Milk("milk",1);
		Cheese cheese1 = new Cheese("cheese",5);
		Cheese cheese2 = new Cheese("cheese",5);
	
		
		Food[] food = {milk1,milk2,milk3,cheese1,cheese2};
		
		Stock stock = new Stock();
				
		for(int i=0; i<5;i++){
			stock.addFood(food[i]);
		}
			
		
		
		System.out.println(stock);
	
		System.out.println(stock.countWeight());
	
	}

}
