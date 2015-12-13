
public class TankAssemblyLine implements IAssemblyLine {

	private BodyLineStep bodyLineStep;
	  private EngineLineStep engineLineStep;
	  private TowerLineStep towerLineStep;
	  
	  public TankAssemblyLine(BodyLineStep bodyLineStep, EngineLineStep engineLineStep, TowerLineStep towerLineStep){
	    this.bodyLineStep = bodyLineStep;
		this.engineLineStep = engineLineStep;
		this.towerLineStep = towerLineStep;
	    System.out.println("Tank Assembly Line created.");
	  }
	  
	  public IProduct assembleProduct(IProduct product){
	    if(product instanceof Tank){
		  product.installFirstPart(bodyLineStep.buildProductPart());
		  product.installSecondPart(engineLineStep.buildProductPart());
		  product.installThirdPart(towerLineStep.buildProductPart());
	    }
		System.out.println("Tank successfully assembled.");
		return product;
	  }

}
