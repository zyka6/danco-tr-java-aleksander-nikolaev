public class Pasport{
	private String registration;
	private int regnumber;
		
		public Pasport(String registration, int regnumber){
			this.registration=registration;
			this.regnumber=regnumber;
			
		System.out.println("Объект 'Pasport' создан");
	}
public String toString(){
return "Pasport[Zaregestririvan " + registration +", Nomer "+ regnumber +" ]";
}

				public String getRegistration(){
				return registration;
				}
				public int getRegnumber(){
				return regnumber;
				}
			
				
				public void setRegistration(String registration){
				this.registration = registration;
				}
				public void setRegnumber(int regnumber){
				this.regnumber = regnumber;
				}
}