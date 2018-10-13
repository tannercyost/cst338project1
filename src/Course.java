import java.util.ArrayList;
import java.util.HashMap;

/**
 * Course.java
 * Abstract: Class representing a course at a school. The students ArrayList keeps a running list of all students taking
 *           the course. When a student is removed from the course via the School class, they are also removed from this
 *           list. The scores HashMap maps Student objects -> their scores. Course average is recalculated every time a
 *           new score is added.
 *
 * Tanner Yost
 * 9/29/2018
 */

public class Course {
    private String name;
    private int number;
    private ArrayList<Student> enrolled;
    private HashMap<Student, Double> scores;
    private double courseAverage;
    private Instructor teacher;
    private String location;
    private int capacity;

    /*
        Constructors
     */

    public Course() {
        enrolled = new ArrayList<>();
        scores = new HashMap<>();
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

    public void enrollStudent(Student student) {
        enrolled.add(student);
    }

    public void dropStudent(Student student) {
        enrolled.remove(student);
    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }

    public void addScore(Student student, Double score) {
        scores.put(student, score);
        Double sum = 0.0;
        for (Double item : scores.values()) {
            sum += item;
        }
        courseAverage = sum / scores.size();
    }

    /*
        Getters and Setters
     */

    public double getCourseAverage() {
        return courseAverage;
    }

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

    public HashMap<Student, Double> getScores() {
        return scores;
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
