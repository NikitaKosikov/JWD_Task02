package by.epam_training.homework02.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class Criteria {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Criteria criteria1 = (Criteria) o;
        return Objects.equals(groupSearchName, criteria1.groupSearchName) &&
                Objects.equals(criteria, criteria1.criteria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupSearchName, criteria);
    }

    // you may add your own code here

}