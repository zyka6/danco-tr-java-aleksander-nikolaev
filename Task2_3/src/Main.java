
public class Main {
	public static void main(String args[]){
	  BodyLineStep bodyLineStep = new BodyLineStep();
	  EngineLineStep engineLineStep = new EngineLineStep();
	  TowerLineStep towerLineStep = new TowerLineStep();
	  TankAssemblyLine tankAssemblyLine = new TankAssemblyLine(bodyLineStep,engineLineStep,towerLineStep);
	  Tank tankModel = new Tank();
	  Tank tank = (Tank)tankAssemblyLine.assembleProduct(tankModel);
	  }
}
