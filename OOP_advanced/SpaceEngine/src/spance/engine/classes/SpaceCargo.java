package spance.engine.classes;

public class SpaceCargo extends SpaceCraft {
	
	public SpaceCargo() {
		super();
	}
	
	@Override
	public String getName() {
		return super.name;
	}

	@Override
	public float getMaxWeight() {
		return super.maxWeight;
	}

	@Override
	public int getMaxSpeed() {
		return super.maxSpeed;
	}

	@Override
	public void setName(String newName) {
		super.name = newName;
	}

	@Override
	public void setMaxWeight(float maxWeight) {
		super.maxWeight = maxWeight;
		
	}

	@Override
	public void setMaxSpeed(int maxSpeed) {
		super.maxSpeed = maxSpeed;
	}

}
