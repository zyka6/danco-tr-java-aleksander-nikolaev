public class Medcard{
	private String anamnesis;
	
	Registry registry;
	Pacient pacient;
		
		public Medcard(String anamnesis){
			this.anamnesis=anamnesis;
			
			

			
						
		System.out.println("Объект 'Medcard' создан");

		}
public String toString(){
return "Medcard[Diagnos " + anamnesis +" ]";
}





				public String getAnamnesis(){
				return anamnesis;
				}
								
				public void setAnamnesis(String anamnesis){
				this.anamnesis = anamnesis;
				}

				
}