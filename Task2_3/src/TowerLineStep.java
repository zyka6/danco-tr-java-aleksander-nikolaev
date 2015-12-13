
public class TowerLineStep implements ILineStep {
	
	public TowerLineStep(){
	    System.out.println("Tower Line Step created.");
	  }
	  
	  public IProductPart buildProductPart(){
	    return new Tower(); 
	  }

}
