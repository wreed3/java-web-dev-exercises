package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if(numberOfCredits >=0 && numberOfCredits <=29){
            return "Freshman";
        }else if(numberOfCredits>=30 && numberOfCredits<=59){
            return "Sophomore";
        }else if(numberOfCredits>=60 && numberOfCredits<=89){
            return "Junior";
        }else {
            return "Senior";
        }

    }



    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        Double totalQualityScore = 0.0;
        int totalNumberOfCredits = 0;
        String newCourseGrade = "";
        Double qualityScore = 0.0;
        Double currentQualityScore = this.gpa * this.numberOfCredits;
        qualityScore = grade * courseCredits;
        totalQualityScore+=qualityScore;
        totalNumberOfCredits = this.getNumberOfCredits() + courseCredits;
        this.gpa = totalQualityScore/totalNumberOfCredits;

        System.out.println(gpa);
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    public String toString(){
        return ("Student Name: " + name + "\nStudent ID: " + studentId + "\nCurrent GPA: " + gpa + "\nNumber of Credits: " + numberOfCredits);
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    public boolean equals(Object person){
        if(person == this){
            return true;
        }
        if(person == null){
            return false;
        }
        if(person.getClass() != getClass()){
            return false;
        }
        Student aStudent = (Student) person;
        return aStudent.getStudentId() == getStudentId();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student will = new Student ("Will",1, 30,4.0);
        Student bob = new Student("Bob", 2,60,3.5);
        ArrayList<Student> classList = new ArrayList<>(asList(will, bob));
        Teacher bobby = new Teacher("Bobby","Jones","Math", 10);
        Teacher jones = new Teacher("Bobby","Jones","Math", 10);
        Course math101 = new Course("Math101",bobby, classList);
        Course math102  = new Course("Math101", bobby, classList);
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally.getGradeLevel());
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
        System.out.println(sally.equals(will));
        System.out.println(sally.equals(bob));
        System.out.println(math101.equals(math101));




    }
}
