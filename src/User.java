public class User {
    private String email;
    private String name;
    private Integer age;

    public String getEmail() {
        return this.email;
    }
    public String getName() {
        return this.name;
    }
    public Integer getAge() {
        return this.age;
    }

    void setEmail(String email) {
        this.email = email;
    }
    void setName(String name) {
        this.name = name;
    }
    void setAge(int age) {
        this.age = age;
    }
}
