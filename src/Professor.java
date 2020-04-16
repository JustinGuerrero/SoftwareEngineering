package UpgradedMyInfo;

import java.util.List;

public class Professor extends User {

    private List<Course> coursesTeaching;
    private List<Student> advisees;
    private Student stood;
    CourseReader cr = new CourseReader();


    public boolean addAdvisee(Student newStudent){
        System.out.println("successfully created student" + newStudent);
        return true;
    }

    public boolean removeAdvisee(Student removeKid){
        System.out.println("You have successfully booted the student" + removeKid);
        return true;
    }

    public List<Student> getAdvisees(){
        System.out.println("Here are the advisees you can have");
        System.out.println(pers.getAll());
        return (List<Student>) stood;
    }
    void checkProgram(){
        System.out.println(cr.getCSCI());
        System.out.println("Here is a list of the classes needed for the students");
    }

    void checkProgress(){
        System.out.println("Student has not completed any classes");
    }

    void printStudentInfo(){
        System.out.println("Here is a list of your students");
        System.out.println("Name: Justin Guerrero, Major: CSCI, Minor: Spanish, NetID: j87n896");
        System.out.println("Name: Blake Stanger, Major: CSCI, Minor: N/A, NetID: k54z459");
        System.out.println("Name: Connie Bernard, Major: CSCI, Minor: Spanish, NetID: n87k894");
    }
}
