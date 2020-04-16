package UpgradedMyInfo;



public class User {
    CourseReader CR = new CourseReader();
    PersonalInformation pers = new PersonalInformation();
    private UserStrategy strategy;

    public void collectInfo(){

        pers.dataCollection();
    }
    public void printInformation(){

        pers.getAll();
    }

    public void checkProgramOfStudy(){
        System.out.println("Major : " + pers.getMajor());
        System.out.println("Minor : " + pers.getMinor());
    }

    public void checkDegreeProgress(){

        System.out.println(CR.getCSCI());
    }

    public String getClassDescription(String className){

        return "This is the course description for " + className;
    }

}
