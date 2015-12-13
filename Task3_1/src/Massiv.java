public class Massiv {
	
	public static void main(String arg[]){
		String[] mas = {"book","apple","voice","circle","lemon"};
		
		for(int i = 0; i <mas.length; i++) {
			  System.out.println(mas[i]);
			}
		System.out.println("--------------");
		
		mas  = Sortirovka.sort(mas);
		
		for(int i=0; i <mas.length; i++)
		{
			System.out.println(mas[i]);
		}
		
	}
}