
public class BodyLineStep implements ILineStep {
	
	public BodyLineStep(){
	    System.out.println("Body Line Step  created.");
	  }
	  
	  public IProductPart buildProductPart() {
	    return new Body(); 
	  }

}
