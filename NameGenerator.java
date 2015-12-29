

/**
 * Created by jelliott on 9/9/2015.
 */


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NameGenerator {
    //This array will hold the first and last name
    String name[];
    //This will generate a random number
    Random rand = new Random();
    Scanner scan;
    int randomNum = rand.nextInt((20-1)+1);

    //this variable will hold a  part of the name after a random male/female/surname is selected
    String firstNamePart,surNamePart;

    public NameGenerator(){}


    public NameGenerator(boolean male) {
        //If the user chose a male as their human
        if (male ) {
            try{
                firstNamePart= Files.readAllLines(Paths.get("C:\\PeopleNet\\src\\IDEAL\\data\\maleNames.txt")).get(randomNum);
            }catch (IOException e) {
                e.printStackTrace();
            }


                //firstNamePart= Files.readAllLines(Paths.get("data/maleNames.txt")).get(randomNum);


            //System.out.println(firstNamePart);

            //Else it must be a female Name
        } else {
            try{
                firstNamePart= Files.readAllLines(Paths.get("C:\\PeopleNet\\src\\IDEAL\\data\\femaleNames.txt")).get(randomNum);
            }catch (IOException e) {
                e.printStackTrace();
            }
            //System.out.println(firstNamePart);
        }
        //Get the Surnames from the database
        try{
            surNamePart = Files.readAllLines(Paths.get("C:\\PeopleNet\\src\\IDEAL\\data\\surNames.txt")).get(randomNum);
        }catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(surNamePart);


    }

    public NameGenerator(String nameA,String nameB){
        firstNamePart=nameA;
        surNamePart=nameB;
    }


    public String getFirstName() {
        return firstNamePart;

    }
    public String getLastName(){
        return surNamePart;
    }

    public String getWholeName(){return( firstNamePart+(" ")+surNamePart+(""));}








   public static void main(String[] args) {

        NameGenerator nameGenerator = new NameGenerator(false);

        System.out.println(nameGenerator);


    }







/*public String getFile(File fileName) {
    //this will go to the maleNames.txt file to randomly generate boy names
    try{
        //Open File For Reading
        File file= new File(fileName);
        FileReader fileReader= new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuffer stringBuffer = new StringBuffer();
        String line;
        while((line= bufferedReader.readLine())!=null){
            stringBuffer.append(line);
            stringBuffer.append("\n");
        }
        fileReader.close();
        System.out.println("Contents of file:");
        System.out.println(stringBuffer.toString());
    }catch (IOException e) {
        e.printStackTrace();
    }

}*/

}


