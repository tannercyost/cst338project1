import java.util.ArrayList;

/**
 * Course.java
 * Abstract: TODO
 *
 * Tanner Yost
 * 9/29/2018
 */
public class Course {
    private String name;
    private int number;
    private ArrayList<Student> enrolled;
    private Instructor teacher;
    private String location;
    private int capacity;

    /*
        Constructors
     */

    public Course() {
        enrolled = new ArrayList<>();
        teacher = null;
        this.name = "default";
        this.number = 0;
        this.location = "undef";
        this.capacity = 0;
    }

    public Course(int number, String name, int capacity, String location) {
        this();
        this.name = name;
        this.number = number;
        this.location = location;
        this.capacity = capacity;
    }

    /*
        Methods
     */

    public void updateLocation(String newLocation) {

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Student> getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(ArrayList<Student> enrolled) {
        this.enrolled = enrolled;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Instructor getTeacher() {
        return teacher;
    }

    public void setTeacher(Instructor teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", enrolled=" + enrolled +
                ", teacher=" + teacher +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
