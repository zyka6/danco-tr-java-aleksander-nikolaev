public class Main{
	
	
	public static void main(String args[]){
	
	Pacient pacient = new Pacient("m","Ivan","Ivanov",70 , 180);
	
	Pasport pasport = new Pasport("Grodno",15987);
		
	Registry registry = new Registry();

	Medcard medcard = new Medcard("zdorov");

	Doctors doctors = new Doctors("terapevt");

	pacient.setPasport(pasport);
	System.out.println(pacient.getPasport());

	pacient.setMedcard(medcard);
	System.out.println(pacient.getMedcard());
	
	doctors.setMedcard(medcard);
	System.out.println(doctors.getMedcard());
	
	registry.setMedcard(medcard);
	System.out.println(registry.getMedcard());

	registry.setDoctors(doctors);
	System.out.println(registry.getDoctors());
	
	registry.setPacient(pacient);
	System.out.println(registry.getPacient());

		

}
}