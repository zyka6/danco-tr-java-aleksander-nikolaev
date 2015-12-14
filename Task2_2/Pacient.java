public class Pacient extends Man{
	private int weight;
	private int height;
	
	private Pasport pasport;
	private Medcard medcard;
		

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
	this.height=height;
	}
	public Medcard getMedcard(){
	return medcard;
	}
	public Pasport getPasport(){
	return pasport;
	}

	public void setMedcard(Medcard medcard){
	this.medcard = medcard;
	}
	public void setPasport(Pasport pasport){
	this.pasport = pasport;
	}
	
}