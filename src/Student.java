import java.util.ArrayList;
import java.util.HashMap;

/**
 * Student.java
 * Abstract: Class repsenting a student at a school. Has an ArrayList to store the courses they are taking. Whenever
 *           a student is dropped from a class this list is updated.
 *           Has a HashMap mapping the Course they took -> the score they received. When a class is dropped the score
 *           stays inside this HashMap, including when the student has been graduated.
 *
 * Tanner Yost
 * 9/29/2018
 */
public class Student {
    private String name;
    private int id;
    private ArrayList<Course> taking;
    private HashMap<Course, Double> scores;

    /*
        Constructors
     */

    public Student(int id, String name) {
        this.name = name;
        this.id = id;
        this.taking = new ArrayList<>();
        this.scores = new HashMap<>();
    }

    /*
        Methods
     */
    public void addScore(Course course, Double score) {
        scores.put(course, score);
    }

    public double getAverage() {
        Double sum = 0.0;
        for (Double item : scores.values()) {
            sum += item;
        }
        return (sum / scores.size());
    }

    public void dropCourse (Course course) {
        taking.remove(course);
    }

    public void addCourse(Course course) {
        taking.add(course);
    }

    public void dropAllCourses() {
        taking = new ArrayList<>();
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Course> getTaking() {
        return taking;
    }

    public void setTaking(ArrayList<Course> taking) {
        this.taking = taking;
    }

    public HashMap<Course, Double> getScores() {
        return scores;
    }

    public void setScores(HashMap<Course, Double> scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nID: " + this.id + "\nEnrolled in " + taking.size() + " courses." + "\nAverage: " + getAverage();
    }
}
