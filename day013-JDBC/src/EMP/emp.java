package EMP;

public class emp {
    private int nid;
    private String username;
    private String password;
    private int age;
    private int UG_id;

    public emp() {
    }

    public emp(int nid, String username, String password, int age, int UG_id) {
        this.nid = nid;
        this.username = username;
        this.password = password;
        this.age = age;
        this.UG_id = UG_id;
    }

    @Override
    public String toString() {
        return "emp{" +
                "nid=" + nid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", UG_id=" + UG_id +
                '}';
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getUG_id() {
        return UG_id;
    }

    public void setUG_id(int UG_id) {
        this.UG_id = UG_id;
    }
}
