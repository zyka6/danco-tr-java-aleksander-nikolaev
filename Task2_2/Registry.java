public class Registry{
	
	
	private Medcard medcard;
	private Pacient pacient;
	private Doctors doctors;

		public Registry(){
		
		System.out.println("Объект 'Registry' создан");
		this.medcard=new Medcard("zdorov");
			
		}

public void addMedcard(){
}
public void registrPatient(){
}
public void appointments(){
}

public Medcard getMedcard(){
return medcard;
	}	
public void setMedcard(Medcard medcard){
	this.medcard = medcard;
	}
public Doctors getDoctors(){
return doctors;
	}	
public void setDoctors(Doctors doctors){
	this.doctors = doctors;
	}
public Pacient getPacient(){
return pacient;
	}	
public void setPacient(Pacient pacient){
	this.pacient = pacient;
	}
}