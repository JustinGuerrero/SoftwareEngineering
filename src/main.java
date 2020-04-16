package UpgradedMyInfo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {
    /**
     *
     * This is the UpgradedMyInfo.main class that will drive the software and call the other classes.
     *
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        /**
         * Constructors that make the program run
         *
         */
        String row = "";
        CourseReader temp = new CourseReader();
        Course crs = new Course();
        PersonalInformation pers = new PersonalInformation();
        User user = new User();
        Professor prof = new Professor();
        Student std = new Student();
        File file = new File(args[0]);
        Scanner scanner = new Scanner(file);
        Scanner src = new Scanner(System.in);
        String who = "";


        /** creating a reader to read the CSV, and a Linked List for our data structure
         to store and sort through the data.
         */
        int j = 0;
        BufferedReader csvReader = new BufferedReader(new FileReader(args[0])); // Read from command line
        while ((row = csvReader.readLine()) != null) {
            boolean var = temp.dataSplit(row); // call data split to place data in row.
            if(var) {

           }
        }
        csvReader.close();
        /**
         * A simple do while loop for user choice
         */
        System.out.println("***THIS SERVICE IS PROPERTY OF JUSTIN GUERRERO OF MONTANA STATE UNIVERSITY***");
        System.out.println("   Welcome to the rootin' tootin' best degree program in the west!");
        System.out.println("   Press Q at anytime to quit.");
        System.out.println("   Are you an (1) Advisor or a (2) Student? : ");
        who = src.nextLine();
        if(who.equalsIgnoreCase("1")){
            System.out.println("What action would you like to perform?");
            System.out.println("1: Check your students");
            System.out.println("2: Check the students progress");
            System.out.println("3: Check the students program");
            String whatup = src.nextLine();
            if(whatup.equalsIgnoreCase("1")){
                prof.printStudentInfo();
                whatup = src.nextLine();
            }
            else if(whatup.equalsIgnoreCase("2")){
                prof.checkProgress();
                whatup = src.nextLine();
            }
            else if(whatup.equalsIgnoreCase("3")){
                prof.checkProgram();
                whatup = src.nextLine();
            }
        }else if(who.equalsIgnoreCase("2")) {
            System.out.println("Please fill out the following form so we can get to know you!");
            pers.dataCollection(); // Collect data from user
            System.out.println("Please enter a choice from the list below, or press Q to quit.");
            System.out.println("1: Course description, number of credits, and prerequisites for course.");
            System.out.println("2: See program of study and committee forms");
            System.out.println("3: What courses you have met for your major and minor (if applicable)");
            System.out.println("4: See all classes offered for Spring 2020");
            System.out.println("5: Select Advisor");
            String whatToDo = src.nextLine();
            do {
                if (whatToDo.equalsIgnoreCase("1")) {
                    System.out.println("Please enter the class you wish to find information on");
                    String className = src.next(); // Scan in answer
                    std.getCourseDescrption(className); // print course description, credits, and prereqs
                    System.out.println(crs.getCredits());
                    System.out.println(crs.getPreReq());
                    whatToDo = src.nextLine();
                } else if (whatToDo.equalsIgnoreCase("2")) {
                    System.out.println("Please enter your netID");
                    String inputName = src.next();

                    try {
                        if (inputName.equalsIgnoreCase(pers.getNetID())) { // print out course major and minor
//                          user.checkProgramOfStudy();
                            System.out.println("Major : " + pers.getMajor());
                            System.out.println("Minor : " + pers.getMinor());
                            System.out.println("Here is the Committee Form");
                        }
                    } catch (Exception e) {
                        System.out.println("error");
                    }
                    whatToDo = src.nextLine();
                } else if (whatToDo.equalsIgnoreCase("3")) { // print out course path
                    System.out.println("Please enter your netID");
                    String inputName = src.next();
                    if (inputName.equalsIgnoreCase(pers.getNetID())) {
                        if (pers.getMajor().equalsIgnoreCase("cs") || pers.getMajor().equalsIgnoreCase("csci")) {
                            temp.getCSCI();
                        }
                    }
                    whatToDo = src.nextLine();
                } else if (whatToDo.equalsIgnoreCase("4")) {
                    System.out.println("Here is a list of all the classes offered in spring");
                    temp.printClassesAtUniversity();

                } else if (whatToDo.equalsIgnoreCase("5")) {
                    System.out.println("Please enter advisor name: ");
                    String advisor = src.next();
                    std.selectAdvisor(advisor);


                } else {
                    System.out.println("Please enter a valid option");
                    whatToDo = src.nextLine();
                }
            } while (!whatToDo.equalsIgnoreCase("Q"));
        }else{
            System.out.println("Option not valid. Exiting.");
        }

    }
}
