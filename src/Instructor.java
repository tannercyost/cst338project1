import java.util.ArrayList;

/**
 * Instructor.java
 * Abstract: Class representing an instructor at a school. Basic private fields, including an ArrayList field for
 *           storing the courses the instructor is teaching.
 *
 * Tanner Yost
 * 9/29/2018
 */
public class Instructor {
    private String name;
    private String email;
    private int id;
    private String phone;
    private ArrayList<Course> teaching;

    /*
        Constructors
     */

    public Instructor (int id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.teaching = new ArrayList<>();
    }

    /*
        Methods
     */

    public void addToTeaching(Course course) {
        teaching.add(course);
    }

    /*
        Getters and Setters
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", phone='" + phone + '\'' +
                '}';
    }
}
