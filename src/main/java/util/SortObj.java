package main.java.util;

import java.util.Objects;

public class SortObj implements Comparable {

    private int id;
    private String name;

    public SortObj(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(getId(), ((SortObj) o).getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SortObj)) return false;
        SortObj sortObj = (SortObj) o;
        return getId() == sortObj.getId() &&
                Objects.equals(getName(), sortObj.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
