package by.tc.task01.entity;

import java.util.Objects;

public class Oven extends Appliance {

	private int powerConsumption;
	private int capacity;
	private double weight;
	private double depth;
	private double height;
	private double width;

	public Oven() {
	}

	public Oven(int powerConsumption, int capacity, double weight, double depth, double heigth, double width) {
		super(Oven.class.getSimpleName());
		this.powerConsumption = powerConsumption;
		this.capacity = capacity;
		this.weight = weight;
		this.depth = depth;
		this.height = heigth;
		this.width = width;

	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getHeigth() {
		return height;
	}

	public void setHeigth(double heigth) {
		this.height = heigth;
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
		result = prime * result + Objects.hash(capacity, depth, height, powerConsumption, weight, width);
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
		Oven other = (Oven) obj;
		return capacity == other.capacity && Double.doubleToLongBits(depth) == Double.doubleToLongBits(other.depth)
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& powerConsumption == other.powerConsumption
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}

	@Override
	public String toString() {
		return "Oven [powerConsumption=" + powerConsumption + ", capacity=" + capacity + ", weight=" + weight
				+ ", depth=" + depth + ", heigth=" + height + ", width=" + width + "]";
	}

}
