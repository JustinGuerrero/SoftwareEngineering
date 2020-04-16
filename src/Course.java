package UpgradedMyInfo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * course will show information on the course selected in the hashmap by the user.
 */
public class Course {

    User usr = new User();
    CourseReader CR = new CourseReader();
    private String name;
    private String number;
    private String offering;
    private int CRN;
    private int numberCredits;
    private String description;
    private String prerequisites;
    private Professor Profe;

    public Course(){} // constructor

    public String viewCourseInformation(String course){ // view information
        return "This is the descrption for the course" + course;
    };

    public String getCredits(){ // get credit amount
        return "3 Credits";
    };

    public String getPreReq(){ // check if class has prereqs
        return "There may be prerequisites for this course. Check DegreeWorks";
    };

    public boolean addStudent(Student stood){ // adds a student *professor/advisor method only
        System.out.println("Successfully added student");
        return true;
    }
    public boolean dropStudent(Student stood) { // drops a student *professor/advisor method only
        System.out.println("Successfully dropped student");
        return true;
    }

    public Professor getProfessor(){ // get professor *student method only
        System.out.println("here's your profe");
        return Profe;
    }

}
