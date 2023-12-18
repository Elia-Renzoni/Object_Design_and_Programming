package spance.engine.classes;

public abstract class SpaceCraft {
	protected String name;
	protected float maxWeight;
	protected int maxSpeed;
	
	public abstract String getName();
	public abstract float getMaxWeight();
	public abstract int getMaxSpeed();
	public abstract void setName(String newName);
	public abstract void setMaxWeight(float maxWeight);
	public abstract void setMaxSpeed(int maxSpeed);
}
