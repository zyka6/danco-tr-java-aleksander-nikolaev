public class Doctors{
	private String specialization;
	private Pacient pacient;
	private Medcard medcard;

		public Doctors(String specialization){
			this.specialization=specialization;
			System.out.println("Объект 'Doctors' создан");
		}

public void prescribe(){
}
public void addNote(){
}
				public String getSpecialization(){
				return specialization;
				}
				
				public void setSpecialization(String specialization){
				this.specialization = specialization;
				}
				public Medcard getMedcard(){
				return medcard;
				}
				public void setMedcard(Medcard medcard){
				this.medcard = medcard;
				}
				public Pacient getPacient(){
				return pacient;
				}
				public void setPacient(Pacient pacient){
				this.pacient = pacient;
				}
}