public class Pacient extends Man{
	private int weight;
	private int height;
	
	Pasport pasport;

		public Pacient(String gender, String name, String surname, int weight, int height){
		super(gender, name, surname);
		this.weight=weight;
		this.height=height;
							
		System.out.println("Объект 'Pacient' создан");
		}




	public int getWeight(){
	return weight;
	}
	public int getHeight(){
	return height;
	}

	public void setWeight(int weight){
	this.weight = weight;
	}
	public void setHeight(int height){
	this.height = height;
	}
	
}