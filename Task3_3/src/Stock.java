
public class Stock {
	private Food[] food = new Food[5];
	private int index;
	
		public void addFood(Food food){
			this.food[index]=food;
			index++;
			if (index == 5){System.out.println("zapolnen");};
		}
		
		
		public int countWeight() 
		{
			int weight = 0;
			for (int i = 0; i < food.length; i++) 
			{
				weight += food[i].getWeight();
			}
			return weight;
		}
		
		public String toString(){
			  return this.food[0]+" "+this.food[1]+" "+this.food[2]+" "+this.food[3]+" "+this.food[4];
		}
		
		public Food[] getFood() {
			return food;
		}

		public void setFlower(Food[] food) {
			this.food = food;
		}
}
		

