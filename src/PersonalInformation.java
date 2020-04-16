package UpgradedMyInfo;

import java.util.Scanner;

/**
 * Class to collect personal data with a scanner that saves values to the private strings
 */
public class PersonalInformation{
    private String fName;
    private String lName;
    private String netID;
    private String SSN;
    private String address;
    private String phone;
    private String major;
    private String minor;
    private String advisor;
    Scanner src = new Scanner(System.in);

    public String dataCollection(){
        System.out.println("Enter first name : ");
        this.fName = src.nextLine();
        System.out.println("Enter last name: ");
        this.lName = src.nextLine();
        System.out.println("Enter your netID : ");
        this.netID = src.nextLine();
        System.out.println("Please enter your major : ");
        this.major = src.nextLine();
        System.out.println("Please enter your minor. If no minor type N/A : ");
        this.minor = src.nextLine();
        System.out.println("Please select an advisor from the list : ");
        System.out.println("1: Mary Ann Cummings");
        System.out.println("2: Sharlyn Gunderson-Izurieta");
        System.out.println("Hunter Lloyd");
        System.out.println("Clemente Izutrieta");
        advisor = src.nextLine();
        System.out.println("Enter your social security number xxx-xx-xxxx : ");
        this.SSN = src.nextLine();
        System.out.println("Enter your phone number xxx-xxx-xxxx : ");
        this.phone = src.nextLine();
        System.out.println("Enter your address : ");
        this.address = src.nextLine();
        System.out.println("Thank you, information has been saved.");
        return fName + lName + netID + major  + minor + SSN + address + phone;
    }

    /**
     * Public getters for the values added to the strings during the runtime of dataCollection()
     * @return
     */
    public String getfName(){
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getNetID() {
        return netID;
    }

    public String getMajor(){
        return major;
    }

    public String getMinor(){
        return minor;
    }

    public String getAdvisor(){ return advisor; }

    public String getSSN() {
        return SSN;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getAll() {
        return fName + lName + netID + major  + minor + SSN + address + phone;
    }
}
