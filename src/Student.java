package UpgradedMyInfo;

import java.awt.*;
import java.util.List;

public class Student extends User {

    private String major;
    private List<Course> registeredCourses;
    private int currentSemester;
    private Professor advisor;
    private List<Course> DegreeProcess;
    private Image programOfStudy;
    User usr = new User();


    public boolean selectAdvisor(String advisor){
        System.out.println("You have chosen your advisor" + advisor);
        return true;
    }

    public boolean modifyProcesss(List<Course> hi){
        System.out.println("your process has been modified");
        return true;
    }

    public void getCourseDescrption(String className){
        System.out.println(usr.getClassDescription(className));
    }

    public List<Course> getDegreeProgress(){
        return (List<Course>) registeredCourses;
    }

    public Image getProgramStudy(){
        return programOfStudy;
    }

}
