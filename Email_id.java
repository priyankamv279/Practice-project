package practice_project;

import java.util.*;

public class Email_id {
	
    // Method to search for an email in the list
    public static boolean searchEmployeeEmail(List<String> emailList, String searchTerm) {
        for (String email : emailList) {
            if (email.equals(searchTerm)) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
    	
        List<String> employeeEmails = new ArrayList<>();

        employeeEmails.add("jay.cooper@example.com");
        employeeEmails.add("bell.roy@example.com");
        employeeEmails.add("betty.jones@example.com");
        employeeEmails.add("candance.xx@example.com");
        employeeEmails.add("rory.gilmore@example.com");
        
        // input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an email ID to search: ");
        String searchTerm = sc.nextLine();

        // searchEmployeeEmail method to search for the email
        boolean searched = searchEmployeeEmail(employeeEmails, searchTerm);

        // Display result after searching 
        if (searched) {
            System.out.println("Email ID in the list: " + searchTerm);
        } else {
            System.out.println("Email ID not in the list: " + searchTerm);
        }

    }

}
