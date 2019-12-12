package by.tc.task01.entity;

import java.util.List;
import java.util.Objects;

public class Appliance {

	private List<String> appliance;

	public Appliance() {

	}

	public List<String> getAppliance() {
		return appliance;
	}

	public void setAppliance(List<String> appliance) {
		this.appliance = appliance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(appliance);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliance other = (Appliance) obj;
		return Objects.equals(appliance, other.appliance);
	}

	@Override
	public String toString() {
		return "Appliance [appliance=" + appliance + "]";
	}

}
