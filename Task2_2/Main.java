public class main{
	
	
	public static void main(String args[]){
	
		Man man = new Man("m","Ivan","Ivanov");
		Pacient pacient = new Pacient("m","Ivan","Ivanov",70 , 180);
		

	
	System.out.println(man.getGender());
	System.out.println(man.getName());
	System.out.println(man.getSurname());
	

	System.out.println(pacient.getWeight());
	System.out.println(pacient.getHeight());

	System.out.println("U pacienta est' pasport");
	Pasport pasport = new Pasport("Grodno",15987);

	pacient.pasport = pasport;
	System.out.println(pacient.pasport);
	

}
}