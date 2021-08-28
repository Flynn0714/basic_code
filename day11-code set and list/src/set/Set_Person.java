package set;

import java.util.Objects;

public class Set_Person implements Comparable<Set_Person>{
    private String name;
    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Set_Person that = (Set_Person) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int compareTo(Set_Person o){
//        return this.id - o.id; //升序
        return o.id - this.id; //降序
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public Set_Person() {

    }

    public Set_Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Set_Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
