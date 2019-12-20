package by.tc.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance{
	
	private int powerConsumption;
	private double weight;
	private int freezerCapacity;
	private int overallCapacity;
	private double height;
	private double width;
	
	public Refrigerator() {
	}

	public Refrigerator(int powerConsumption, double weight, int freezerCapacity, int overallCapacity,
			double height, double width) {
		super(Refrigerator.class.getSimpleName());
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		this.height = height;
		this.width = width;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public int getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(int overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(freezerCapacity, height, overallCapacity, powerConsumption, weight, width);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refrigerator other = (Refrigerator) obj;
		return freezerCapacity == other.freezerCapacity
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& overallCapacity == other.overallCapacity && powerConsumption == other.powerConsumption
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}

	@Override
	public String toString() {
		return "Refrigerator [powerConsumption=" + powerConsumption + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", overallCapacity=" + overallCapacity + ", height=" + height + ", width=" + width
				+ "]";
	}

	

}
