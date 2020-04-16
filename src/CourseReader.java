package UpgradedMyInfo;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CourseReader {
    /**
     * The following class will read in data and return it all to strings and a hashtable
     *
     */

    /**
     * variables in use
     * Term Code,Class,Title,Crn,Instructor,Cap,Enrl,Days,Times,Location,Type
     */
    private String row = "";
    HashMap<String, List<String>> hash = new HashMap<>();
    HashMap<String, Integer> intHash = new HashMap<>();
    HashMap<String, List<String>> hash1 = new HashMap<>();
    HashMap<String, Integer> intHash1 = new HashMap<>();
    private static String termCode;
    private static String classCode;
    private static String classTitle;
    private static String CRN;
    private static String instructor;
    private static String classCap;
    private static String enrolled;
    private static String days;
    private static String times;
    private static String location;
    private static String CSCI;


    /**
     * constructor
     */
    public CourseReader() {

    }

    /**
     * BufferedReader to read in the .csv file
     * HashMap to store KV pairs
     *
     * @param arr
     * @throws IOException
     */

    /**
     * function to parse the data and place into String[]
     *
     * @param row
     */
    public boolean dataSplit(String row) {
        String[] data = row.split(",");
        termCode = data[0];
        classCode = data[1];
        classTitle = data[2];
        CRN = data[3];
        instructor = data[4] + "," + data[5];
        classCap = data[6];
        enrolled = data[7];
        days = data[8];
        times = data[9];
        location = data[10];
        // parse courses that are CSCI only
        if (data[1].charAt(0) == 'C') {
            if (data[1].charAt(1) == 'S') {
                if (data[1].charAt(2) == 'C') {
                    if (data[1].charAt(3) == 'I') {
                        CSCI = row;
                    }
                }
            }
        }
        /**
         * The lines below define all the variables as strings
         * to be able to place inside of a hashMap. The Hash
         * will allow us to store all the data in a place we can access it.
         */
        int i = 0;
        int j = 0;
        String code = ""; //getClassCode();
        String title = "";// = getClassTitle();
        String crn = ""; //getCRN();
        String teacher = ""; //getClassInstructor();
        String cap = "";//getClassCap();
        String enrolly = "";// getEnrolled();
        String day = "";//getDays();
        String where = "";//getLocation();
        String csci;// = getCSCI();

        /**
         * hash function for the title of the class
         */
        if (hash.containsKey(title)) {
            hash.get(title).add(classTitle);
        } else {
            List<String> comsci = new ArrayList<>();
            comsci.add(classTitle);
            hash.put(classTitle, comsci);
        }
        intHash.put(classTitle, i);
        i++;

        /**
         * Hash function for CS classes
         */

        if (hash1.containsKey(CSCI)) {
            hash1.get(CSCI).add(title);
        } else {
            List<String> comsci1 = new ArrayList<>();
            comsci1.add(CSCI);
            hash1.put(CSCI, comsci1);
        }
        intHash1.put(CSCI, j);
        j++;
        return true;
    }

    /**
     * Getters for all the information above
     *
     * @return
     */

    public String getClassCode() {

        return classCode;
    }

    public String getClassTitle() {

        return classTitle;
    }

    public String getCRN() {
        return CRN;
    }

    public String getClassInstructor() {
        return instructor;
    }

    public String getClassCap() {
        return classCap;
    }

    public String getEnrolled() {
        return enrolled;
    }

    public String getDays() {
        return days;
    }

    public String getTimes() {
        return times;
    }

    public String getLocation() {
        return location;
    }

    public String getCSCI() {

        System.out.println("You're a freshman! You have to take all of them!!");
        Iterator<String> itr2 = hash1.keySet().iterator(); // iterates through hash map
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
        return CSCI;
    }

    public int getCredits() {
        return 3;
    }

    public void getPreReq() {

    }

    public void printClassesAtUniversity(){
        Iterator<String> itr = hash.keySet().iterator(); // iterates through hash map
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
