
/**
 * ES234211 - Basic Programming
 * Computing Lab. Work
 * Coursework No.   : 02
 * Student ID       : 5026231210
 * Student Name     : Bimo Rajendra Widyadhana
 * Class            : D
 * Cohort           : 6
 */

public class Main {
    public static void main(String[] args) {
        task1("Rahman Arif/17-02-2003/Jakarta/M/A/WNI/Single");
        task2("Wanda");
        task3();
        task4("VI+X");
    }
    public static String task1(String data){
        // Your code here
        // ...

        int startPosition = 0;
        //find the first slash position within string stored in variable named data
        int slashPosition = data.indexOf("/");
        //chop the string from the beginning to the first slash position (/ is excluded)
        String name = data.substring(startPosition, slashPosition);
        //split and reverse the name to correct firstname and lastname order
        String firstName=name.substring(name.indexOf(" ")+1, slashPosition);
        String lastName=name.substring(startPosition, name.indexOf(" "));
        //get the first character of first and last name
        String initial = ""+ firstName.charAt(0) + lastName.charAt(0);

        //chop the string stored in variable named data from the first slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the date of birth dd-mm-yyyy
        String birthDate = data.substring(startPosition);
        //chop the year of birth yyyy
        String birthYear = data.substring(6,10);
        //count the age
        int age = 2024 - (Integer.parseInt(birthYear));

        //chop the string stored in variable named data from the second slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the palace of birth
        String birthPlace =data.substring(startPosition,slashPosition);

        //chop the string stored in variable named data from the third slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the sex data M or F
        String sex = data.substring(startPosition,slashPosition);
        //change M to Male and F to Female
        sex= sex.replace("M","Male");
        sex= sex.replace("F","Female");

        //chop the string stored in variable named data from the fourth slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the blood type data
        String bloodType = data.substring(startPosition,slashPosition);

        //chop the string stored in variable named data from the fifth slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the citizenship data
        String citizen = data.substring(startPosition,slashPosition);
        //check whether local citizen
        boolean isLocalCitizenB = citizen.equals("WNI");
        //change true or false to Yes or No
        String isLocalCitizen =""+isLocalCitizenB;
        isLocalCitizen = isLocalCitizen.replace("true","yes");
        isLocalCitizen = isLocalCitizen.replace("false","no");

        //chop the string stored in variable named data from the sixth slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //chop the marital status data
        String maritalStatus = data;

        //generating the output
        String line1 = "Full Name: " + firstName + " "+lastName+ " (" + initial + ")";
        String line2 = "Age: " + age;
        String line3 = "City of Birth: " + birthPlace;
        String line4 = "Sex: " +sex;
        String line5 = "Blood Type: " + bloodType;
        String line6 = "Local Citizen: " + isLocalCitizen;
        String line7 = "Marital Status: " + maritalStatus;


        //store the output to variable named output
        String output = line1 + "\n" + line2+ "\n" + line3+ "\n" + line4 + "\n" + line5 + "\n" + line6 + "\n" + line7;

        //print out the output
        System.out.println(output);

        return output;
    }
    public static String task2(String name){
        // Your code here
        // ...

        //store all alphabet to single string
        //each alphabet with its index: a -> 0, b->1. ... z ->25
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        //change the input to lowercase, since tha alphabets are all in lowercase
        name = name.toLowerCase();

        //set the key

        int key = 5;

        //shift each character to 5 places right, if more than 25 then it back to 0
        String k1 = ""+alphabet.charAt((alphabet.indexOf(name.charAt(0)) +key) %26);
        String k2 = ""+alphabet.charAt((alphabet.indexOf(name.charAt(1)) +key) %26);
        String k3 = ""+alphabet.charAt((alphabet.indexOf(name.charAt(2)) +key) %26);
        String k4 = ""+alphabet.charAt((alphabet.indexOf(name.charAt(3)) +key) %26);
        String k5 = ""+alphabet.charAt((alphabet.indexOf(name.charAt(4)) +key) %26);

        //change the first character to upper case
        k1 = k1.toUpperCase();

        //generate the output
        String output = k1 + k2 + k3 + k4 + k5;

        //print out the output
        System.out.println(output);

        //return the output
        return output;
    }
    public static void task3(){

        //declare and initialize the variables

        int priceOfCoffee = 15000;
        int priceOfTea = 10000;
        int priceOfPizza = 45000;
        String currency = "$";
        int numOfCoffee = 3;
        int numOfTea = 5;
        int numOfPizza = 1;
        String nameOfCustomer = "Albert";

        double discountOfCoffee = 0.10;
        double discountOfTea = 0.15;
        double discountOfPizza = 0.05;
        double taxRate = 0.11;
        double cashInHand = 200000;

        // count number of items
        int numOfItems =  numOfCoffee + numOfTea + numOfPizza;

        // count the total price
        double totalPrice = (priceOfCoffee * (1 - discountOfCoffee) * numOfCoffee) + (priceOfTea * (1 - discountOfTea) * numOfTea) + (priceOfPizza * (1 - discountOfPizza) * numOfPizza);
        // count the total price after tax
        double totalPriceAfterTax = totalPrice * (1 + taxRate);
        // print total price
        System.out.println("Total Price: "+ currency + totalPrice);

        // count the change
        double change = cashInHand - totalPriceAfterTax;
        //printing the change
        System.out.println("Change: " + currency + change);

        // count amount of donation
        double donation = change % 1000;
        System.out.println("Donation: "+ currency + donation);


        // print the receipt
        System.out.println("-----------------------------------\n");
        System.out.println("Name Of Customer: "+ nameOfCustomer);
        System.out.println("ORDERS");
        System.out.println("Number of items" + numOfItems);
        System.out.println("Tea \t|\t" + numOfTea + "\t|\t"  + currency + (priceOfTea * (1 - discountOfTea) * numOfTea));
        System.out.println("Coffee\t|\t" + numOfCoffee + "\t|\t"  + currency + (priceOfCoffee * (1 - discountOfCoffee) * numOfCoffee));
        System.out.println("Pizza\t|\t" + numOfPizza + "\t|\t"  + currency + (priceOfPizza * (1 - discountOfPizza) * numOfPizza));
        System.out.println("Total Before Tax: "+ currency + totalPrice);
        System.out.println("Tax: " + (taxRate*100) + "%");
        System.out.println("Total After Tax:  "+ totalPriceAfterTax);
        System.out.println("Amount Paid: "+ currency + cashInHand);
        System.out.println("Change: " + currency +change);
        System.out.println("Donation Amount: " + currency +donation);
        System.out.println("-----------------------------------\n");
    }

    public static String task4(String roman){
        int plus = roman.indexOf("+");
        String firstRoman = roman.substring(0, plus);
        String secondRoman = roman.substring(plus+1);
        boolean roman0 = firstRoman.equals("V");
        boolean roman1 = firstRoman.equals("VI");
        boolean roman2 = firstRoman.equals("VII");
        boolean roman3 = firstRoman.equals("VIII");
        boolean roman4 = firstRoman.equals("IX");
        boolean roman5 = firstRoman.equals("X");

        int number = 0;
        number += roman0 ? 5 : 0;
        number += roman1 ? 6 : 0;
        number += roman2 ? 7 : 0;
        number += roman3 ? 8 : 0;
        number += roman4 ? 9 : 0;
        number += roman5 ? 10 : 0;

        //input2
        boolean romans0 = secondRoman.equals("V");
        boolean romans1 = secondRoman.equals("VI");
        boolean romans2 = secondRoman.equals("VII");
        boolean romans3 = secondRoman.equals("VIII");
        boolean romans4 = secondRoman.equals("IX");
        boolean romans5 = secondRoman.equals("X");

        int numberTwo = 0;
        numberTwo += romans0 ? 5 : 0;
        numberTwo += romans1 ? 6 : 0;
        numberTwo += romans2 ? 7 : 0;
        numberTwo += romans3 ? 8 : 0;
        numberTwo += romans4 ? 9 : 0;
        numberTwo += romans5 ? 10 : 0;


        int total = number + numberTwo;
        String num = String.valueOf(total);


        boolean final1 = num.equals("10");
        boolean final2 = num.equals("11");
        boolean final3 = num.equals("12");
        boolean final4 = num.equals("13");
        boolean final5 = num.equals("14");
        boolean final6 = num.equals("15");
        boolean final7 = num.equals("16");
        boolean final8 = num.equals("17");
        boolean final9 = num.equals("18");
        boolean final10 = num.equals("19");
        boolean final11 = num.equals("20");

        String result =
                final1 ? "X" :
                        final2 ? "XI" :
                                final3 ? "XII" :
                                        final4 ? "XIII" :
                                                final5 ? "XIV" :
                                                        final6 ? "XV" :
                                                                final7 ? "XVI" :
                                                                        final8 ? "XVII" :
                                                                                final9 ? "XVIII" :
                                                                                        final10 ? "XIX" :
                                                                                                final11 ? "XX" : "0";


        System.out.println(result);
        return result;
    }
}