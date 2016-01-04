/**
 * Created by jelliott on 9/9/2015.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NameGenerator {
    //This array will hold the first and last name
    String name[];
    //This will generate a random number
    Random rand = new Random();

    int randomNum = rand.nextInt(40);

    //this variable will hold a  part of the name after a random male/female/surname is selected
    String firstNamePart,surNamePart;

    //Constructors
    public NameGenerator(){}

    public NameGenerator(String nameA,String nameB){
        firstNamePart=nameA;
        surNamePart=nameB;
    }

    public NameGenerator(boolean male) {
        //If the user chose a male as their human
        File file;
        if (male) {
             file = new File("data/maleNames.txt");

            //Else it must be a female Name
        } else {

             file = new File("data/femaleNames.txt");

        }
        firstNamePart=readFile(file);
        File fileSecond = new File("data/surNames.txt");
        surNamePart=readFile(fileSecond);
        name=new String[]{firstNamePart,surNamePart};

        }

    //ReadFile Method
    public String readFile(File fileA) {
        ArrayList<String> nameA  = new ArrayList<>();
        try {
            Scanner input = new Scanner(fileA);
            while(input.hasNextLine()){
                nameA.add(input.nextLine());
            }
            //nameA = input.nextLine();
            //System.out.println(nameA);
        } catch (FileNotFoundException e) {
            System.out.printf("ERROR:  %s\n", e);

        }

        return nameA.get(randomNum);
    }

//Getters
    public String getFirstName() {
        return firstNamePart;

    }

    public String getLastName(){
        return surNamePart;
    }

    public String getWholeName(){return( firstNamePart+(" ")+surNamePart+(""));}

//Main Method
   public static void main(String[] args) {

        NameGenerator nameGenerator = new NameGenerator(true);
       System.out.println(nameGenerator.getFirstName());
       System.out.println(nameGenerator.getLastName());

        System.out.println(nameGenerator);


    }

}


