
public class Tank implements IProduct {

	private Body body;
	private Engine engine;
	private Tower tower;
	 
	  
	  public Tank(){
	    body = null;
		engine = null;
		tower = null;
		
		System.out.println("Tank model created.");
	  }
	  
	  public void installFirstPart(IProductPart firstPart){
	    if(firstPart instanceof Body){
	    body = (Body)firstPart;
		System.out.println("Body installed.");
		}
		
	  }
	  
	  public void installSecondPart(IProductPart secondPart){
	    if(secondPart instanceof Engine){
	    engine = (Engine)secondPart;
		System.out.println("Engine installed.");
		}
	    
	  } 
	  public void installThirdPart(IProductPart thirdPart){
		if(thirdPart instanceof Tower){
		tower = (Tower)thirdPart;
		System.out.println("Tower installed.");
		}
	  } 

}
