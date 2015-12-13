
public class EngineLineStep implements ILineStep {

	 public EngineLineStep(){
	    System.out.println("Engine Line Step created.");
	  }
	  
	  public IProductPart buildProductPart() {
	    return new Engine(); 
	  }

}
