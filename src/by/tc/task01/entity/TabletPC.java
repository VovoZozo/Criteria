package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC extends Appliance {
	// you may add your own code here

	private int batteryCapacity;
	private String color;
	private int memoryRom;
	private int flashMemoryCapacity;
	private int displayInchs;

	public TabletPC() {
	}

	public TabletPC(int batteryCapacity, String color, int memoryRom, int flashMemoryCapacity, int displayInchs) {

		this.batteryCapacity = batteryCapacity;
		this.color = color;
		this.memoryRom = memoryRom;
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.displayInchs = displayInchs;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public void setFlashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
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
		result = prime * result + Objects.hash(batteryCapacity, color, displayInchs, flashMemoryCapacity, memoryRom);
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
		TabletPC other = (TabletPC) obj;
		return batteryCapacity == other.batteryCapacity && Objects.equals(color, other.color)
				&& displayInchs == other.displayInchs && flashMemoryCapacity == other.flashMemoryCapacity
				&& memoryRom == other.memoryRom;
	}

	@Override
	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", color=" + color + ", memoryRom=" + memoryRom
				+ ", flashMemoryCapacity=" + flashMemoryCapacity + ", displayInchs=" + displayInchs + "]";
	}

}
