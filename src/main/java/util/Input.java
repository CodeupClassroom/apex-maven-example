package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Yes or No?");
        String input = getString();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max){

        int number = getInt();

        if(number < min){
            System.out.println(String.format("Number outside of range (%d - %d)", min, max));
            return getInt(min, max);
        } else if (number > max) {
            System.out.println(String.format("Number outside of range (%d - %d)", min, max));
            return getInt(min, max);
        }

        return number;
    }

    public int getInt(){
        System.out.println("Give me a number: ");
        int number;
        try{
            number = Integer.valueOf(getString());
            return number;
        } catch (NumberFormatException nfe){
            System.out.println("Wrong input, try again: ");
            return getInt();
        }
    }

    public double getDouble(double min, double max){
        double number = getDouble();

        if(number < min){
            System.out.println(String.format("Number outside of range (%f - %f)", min, max));
            return getDouble(min, max);
        } else if (number > max) {
            System.out.println(String.format("Number outside of range (%f - %f)", min, max));
            return getDouble(min, max);
        }

        return number;
    }

    public double getDouble(){
        System.out.println("Give me a decimal: ");
        double number;
        try{
            number = Double.valueOf(getString());
            return number;
        } catch (NumberFormatException nfe){
            System.out.println("Wrong input, try again: ");
            return getDouble();
        }
    }

}