import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

/**
 * School.java
 * Abstract: TODO
 *
 * Tanner Yost
 * 9/29/2018
 */

public class School {
    private String name;
    private ArrayList<Instructor> instructors;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    /*
        Constructors
     */
    public School() {
        this.name = "default";
        instructors = new ArrayList<>();
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public School(String name) {
        this();
        this.name = name;
    }
    /*
        Methods
     */
    public void readData(String filename) {
        int section = 0;
        System.out.println("Processing filename \"" + filename + "\"...");
        try {
            File file = new File(filename);
            Scanner sc = new Scanner(file);
            while(sc.hasNext()) {
                String line = sc.nextLine();
                if (line.contains(",")) {
                    String[] split = line.split(",");
                    if(section == 1)
                        addInstructor(Integer.parseInt(split[0]), split[1], split[2], split[3]);
                    else if(section == 2)
                        addCourse(Integer.parseInt(split[0]), split[1], Integer.parseInt(split[2]), split[3]);
                    else if(section == 3)
                        addStudent(Integer.parseInt(split[0]), split[1]);
                }
                else
                    section++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found, exiting.");
            System.exit(0);
        }
        System.out.println("Done.");
    }

    public void schoolInfo() {
        System.out.println("School name: " + this.getName());
        System.out.println("Instructor information");
        for (Instructor item : instructors)
            System.out.println("\t"+item.getName());
        System.out.println("Course information");
        for (Course item : courses)
            System.out.println("\t"+item.getName());
        System.out.println("Student information");
        for (Student item : students)
            System.out.println("\t"+item.getName());
    }

    public void addCourse(int number, String name, int capcaity, String location) {
        boolean found = false;
        for (Course item : courses) {
            if (item.getNumber() == number) {
                found = true;
                System.out.println("Error - course number " + item.getNumber() + " already exists.");
            }
        }
        if (!found)
            courses.add(new Course(number, name, capcaity, location));
    }

    public void addStudent(int id, String name) {
        boolean found = false;
        for (Student item : students) {
            if (item.getId() == id) {
                found = true;
                System.out.println("Error - student ID " + item.getId() + " already exists.");
            }
        }
        if (!found)
            students.add(new Student(id, name));
    }

    public void addInstructor(int id, String name, String email, String phone) {
        boolean found = false;
        for (Instructor item : instructors) {
            if (item.getId() == id) {
                found = true;
                System.out.println("Error - instructor ID " + item.getId() + " already exists.");
            }
        }
        if (!found)
            instructors.add(new Instructor(id, name, email, phone));
    }

    public void searchByEmail(String email) {
        boolean found = false;
        for (Instructor item : instructors) {
            if (item.getEmail().equals(email)) {
                System.out.println("Employee number: " + item.getId());
                System.out.println("Employee name: " + item.getName());
                System.out.println("Employee phone: " + item.getPhone());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employee with email " + email);
        }
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

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
