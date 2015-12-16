
public class Random {
	public static int generate()
	{	int i;
		do{ i=new java.util.Random().nextInt(999);
		}while (i<100);
		
		return i;
	
			
	}
}
