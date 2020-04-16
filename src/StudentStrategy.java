package UpgradedMyInfo;

public class StudentStrategy implements UserStrategy {

    private void checkProgram(){
        System.out.println(pers.getMajor() + pers.getMinor());
    }

    private void checkProgress(){
        System.out.println("You have not completed any classes yet");
    }

    private void printInfo(){
        System.out.println(pers.getAll());
    }
}
