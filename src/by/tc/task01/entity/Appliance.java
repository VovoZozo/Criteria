package by.tc.task01.entity;

public class Appliance {

	private String type;

	public Appliance() {
	}

	public Appliance(String type) {
		this.type = type;
	}

	public String getName() {
		return type;
	}

	public void setName(String name) {
		this.type = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
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
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Appliance [name=" + type + "]";
	}

}
