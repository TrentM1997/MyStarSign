import java.util.Scanner;

public class MyStarSign {

    public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
    System.out.println("What month were you born?");

    String birthMonth = "";

        

    birthMonth= myScanner.next();  // Read user input



    System.out.println("You were born in " + birthMonth + "?");  // Output user input


    System.out.println("What day of the month were you born?");

    int birthDay=0;

    while (birthDay > 31) {

        System.out.println("Please enter a valid day of the month");
    
        birthDay = myScanner.nextInt();

    }

    
        
    System.out.println("Oh that makes so much sense");

    

    if (birthMonth == "January") { 
        if(birthDay < 20) {
            System.out.println("You're a Capricorn");

    } else {
        System.out.println("You're an Aquarius");
    } 

    
    } else if (birthMonth == "February") {
            if (birthDay < 20) {

                System.out.println("You're an Aquarius");

            } else {
                System.out.println("You're a Pisces");

            }
    } else if (birthMonth == "March") {
            if (birthDay < 20) {

                System.out.println("You're a Pisces");

            } else {

                System.out.println("You're an Aries");
            }
    } else if (birthMonth == "April") {
            if(birthDay < 20) {

                System.out.println("You're an Aries");

            } else {

                System.out.println("You're a Taurus");
            }
    } else if (birthMonth == "May") {
            if (birthDay < 21) {

                System.out.println("You're a Taurus");

            } else {

                System.out.println("You're a Gemini");

            }
    } else if (birthMonth == "June") {
            if(birthDay < 21) {

                System.out.println("You're a Gemini");

            } else {

                System.out.println("You're a Cancer");

            }

    } else if (birthMonth == "July") {
            if (birthDay < 22) {

                System.out.println("You're a Cancer");

            } else {

                System.out.println("You're a Leo");
            }

    } else if (birthMonth == "August") {
            if (birthDay < 23) {
                
                System.out.println("You're a Leo");
            } else {

                System.out.println("You're a Virgo");

            }

    } else if (birthMonth == "September") {
            if (birthDay < 23) {

                System.out.println("You're a Virgo");

            } else { 

                System.out.println("You're a Libra");
                
            }

    } else if (birthMonth == "October") {
            if (birthDay < 23) {

                System.out.println("You're a Libra");

            } else {

                System.out.println("You're a Scorpio");

            }

    } else if (birthMonth == "November") {
            if (birthDay < 23) {

                System.out.println("You're a Scorpio");

            } else {

                System.out.println("You're a Sagittarius");

            }

    } else if (birthMonth == "December") {
            if (birthDay < 22) {

                System.out.println("You're a Sagittarius");

            } else {

                System.out.println("You're a Capricorn");
            }
    }
    

 }

}


    
    

