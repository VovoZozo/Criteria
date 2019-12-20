package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance {

	private int batteryCapacity;
	private String operatingSystem;
	private int memoryRom;
	private int systemMemory;
	private double centralProcessingUnit;
	private int displayInchs;

	public Laptop() {
	}

	public Laptop(int batteryCapacity, String operatingSystem, int memoryRom, int systemMemory,
			double centralProcessingUnit, int displayInchs) {
		super(Laptop.class.getSimpleName());
		this.batteryCapacity = batteryCapacity;
		this.operatingSystem = operatingSystem;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.centralProcessingUnit = centralProcessingUnit;
		this.displayInchs = displayInchs;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public double getCentralProcessingUnit() {
		return centralProcessingUnit;
	}

	public void setCentralProcessingUnit(double centralProcessingUnit) {
		this.centralProcessingUnit = centralProcessingUnit;
	}

	public int getDisplayInchs() {
		return displayInchs;
	}

	public void setDisplayInchs(int displayInchs) {
		this.displayInchs = displayInchs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(batteryCapacity, centralProcessingUnit, displayInchs, memoryRom,
				operatingSystem, systemMemory);
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
		Laptop other = (Laptop) obj;
		return batteryCapacity == other.batteryCapacity
				&& Double.doubleToLongBits(centralProcessingUnit) == Double
						.doubleToLongBits(other.centralProcessingUnit)
				&& displayInchs == other.displayInchs && memoryRom == other.memoryRom
				&& Objects.equals(operatingSystem, other.operatingSystem) && systemMemory == other.systemMemory;
	}

	@Override
	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", operatingSystem=" + operatingSystem + ", memoryRom="
				+ memoryRom + ", systemMemory=" + systemMemory + ", centralProcessingUnit=" + centralProcessingUnit
				+ ", displayInchs=" + displayInchs + "]";
	}

}
