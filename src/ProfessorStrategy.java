package UpgradedMyInfo;

public class ProfessorStrategy implements UserStrategy {
    CourseReader cr = new CourseReader();

    private void checkProgram(){
        System.out.println(cr.getCSCI());
        System.out.println("Here is a list of the classes needed for the students");
    }

    private void checkProgress(){
        System.out.println("Student has not completed any classes");
    }

    private void printInfo(){
        System.out.println("Here is a list of your students");
        System.out.println("Name: Justin Guerrero, Major: CSCI, Minor: Spanish, NetID: j87n896");
        System.out.println("Name: Blake Stanger, Major: CSCI, Minor: N/A, NetID: k54z459");
        System.out.println("Name: Connie Bernard, Major: CSCI, Minor: Spanish, NetID: n87k894");
    }
}
