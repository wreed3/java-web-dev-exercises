package school;

import org.launchcode.java.demos.lsn3classes1.Student;

import java.util.ArrayList;

public class Course {
    private String name;
    private int courseId;
    private ArrayList<Student> courseCredits;

    public Course(String name, int courseId, ArrayList<Student> courseCredits){
        this.name = name;
        this.courseId = courseId;
        this.courseCredits = courseCredits;
    }




}
