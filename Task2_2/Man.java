public class Man{
	private String gender;
	private String name;
	private String surname;
	
		public Man(String gender, String name, String surname){
			this.gender=gender;
			this.name=name;
			this.surname=surname;			
		System.out.println("Объект 'Man' создан");
	}

				public String getGender(){
				return gender;
				}
				public String getName(){
				return name;
				}
				public String getSurname(){
				return surname;
				}
			
				public void setGender(String gender){
				this.gender = gender;
				}
				public void setName(String name){
				this.name = name;
				}
				public void setSurname(String surname){
				this.surname = surname;
				}
}