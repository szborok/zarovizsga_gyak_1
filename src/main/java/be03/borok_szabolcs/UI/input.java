package be03.borok_szabolcs.UI;

import java.util.Scanner;

public class input {

    public static String userInput() {
        Scanner myScanner = new Scanner(System.in);
        String input = null;    
        
        input = myScanner.nextLine();


        return input;
    }

    public static void askForUserInputWhileNull() {
        String answer = null;
        Integer wheat = null;

        while (answer != "") {
            System.out.println("Add meg az elvetett buza mennyiseget tonnaban!");
            answer = userInput();
            if (answer == "") {
                answer = "";
            }
            else {
                try {
                    wheat = Integer.parseInt(answer);
                } catch (NumberFormatException e) {
                    System.out.println("Egesz szamot pls.");
                }
            }
        }
    }

}
