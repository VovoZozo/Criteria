package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Map<String, Object> getCriteria() {
		return criteria;
	}

	public void setGroupSearchName(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(criteria, groupSearchName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Criteria other = (Criteria) obj;
		return Objects.equals(criteria, other.criteria) && Objects.equals(groupSearchName, other.groupSearchName);
	}

	@Override
	public String toString() {
		return "Criteria [groupSearchName=" + groupSearchName + ", criteria=" + criteria + "]";
	}

}
