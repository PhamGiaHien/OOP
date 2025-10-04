public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    Student(String name, String id, String email) {
        group = "K62CB";
        this.name = name;
        this.id = id;
        this.email = email;
    }

    Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.email = s.email;
        this.group = s.group;
    }
}
