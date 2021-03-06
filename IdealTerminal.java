/**
 * Created by jelliott on 9/25/2015.
 */
import java.util.Random;
import java.util.Scanner;

public class IdealTerminal implements Runnable {

    private Human human;
    private Jobs job;
    private NameGenerator name,nameOfChar;
    //private Neighborhood neighborhood;
    private int age, schoolAttendanceAmount,socialisingWithFriends,workingOnPhysicalApp;
    private int value,looks=0,worshippers=0,friends=0,professionAssocites=0,influence=0;
    private double wealth=0.0;
    private Boolean banker=false,independent=false,buisnessowner=false,king=false,intern=false,male;
    private Family family;
    private Countries countries;
    private Scanner scanner=new Scanner(System.in);
    private FamilyMember mother,sister,brother,father;
    private String familyName, firstNamePart,lastNamePart;
    Random rand = new Random();
    int randomNum = rand.nextInt((50-1)+1);
    private boolean begger=false;
    private boolean vagrant=false;
    private boolean packingboy=false;
    private boolean firefighter=false;
    private boolean scientist=false;
    private boolean god=false;
    private boolean sultan=false;
    private boolean worshippersFollow=false;
    private boolean omega=false;
    private boolean worshippersActivation=false;
    private boolean influencActivation=false;


    //This variable is placed outside worshippersFollow(boolean worshippersFollow) method
    //because I need this number to activate only when worshippersFollow(boolean worshippersFollow) and it must stay the same
    //IT MUST NOT UPDATE WHILE THE GAME IS RUNNING BECAUSE ONCE IT ACTIVATES TI WILL CONTINUE UNTIL THE END OF THE GAME
    //This will not break the game but this feature is a buff and not a permanent fixture on the game's state
    private  int tempNum =age-10;
    private Boolean heavenBoolean=false;


    public void run(){
        System.out.println("            MMMMM.     .MMMMMM          MMMMMMMMM         .M          MMMMM           \n" +
                "              M.        MM    MM         MM   .M          MM.          MM             \n" +
                "              M.        MM     MM        MM              ..MM          MM             \n" +
                "              M.        MM      MM       MM .M           M  MM         MM             \n" +
                "              M.        MM      MM       MM .M          M-_-MM         MM             \n" +
                "              M.        MM     .MM       MM             M    MM        MM             \n" +
                "              M.        MM     MM        MM     M      M     .M        MM     M       \n" +
                "             MMMMM      MMMMMMM+        NMMMMMMMMM    MMMM$  ZMMMM    .MMMMMMMMM  ");

        IdealTerminal idealTerminal = new IdealTerminal();
        //idealTerminal.credits();
        idealTerminal.Init();
        System.out.println("\n"+"/--------------------------------------------------------------------------------------/CREATE A CHARACTER");
        idealTerminal.CreateCharacter();
        System.out.println("\n"+"/--------------------------------------------------------------------------------------/");
        System.out.println("\n"+"/--------------------------------------------------------------------------------------/SELECTING A COUNTRY");
        idealTerminal.SelectACountry();
        System.out.println("\n"+"/--------------------------------------------------------------------------------------/");
        System.out.println("\n"+"/--------------------------------------------------------------------------------------/CREATING A FAMILY");
        idealTerminal.CreateFamily();
        System.out.println("\n"+"/--------------------------------------------------------------------------------------/");
        System.out.println("\n"+"/--------------------------------------------------------------------------------------/FINAL INIT");
        idealTerminal.FinalInit();
        System.out.println("\n"+"/--------------------------------------------------------------------------------------/");
        System.out.println("\n"+"/--------------------------------------------------------------------------------------/TUTORIAL");
        idealTerminal.TutorialwithFamily();
        System.out.println("\n"+"/--------------------------------------------------------------------------------------/ADULT LIFE");
        idealTerminal.GrownUpHuman();
        System.out.println("\n"+"/--------------------------------------------------------------------------------------/CREDITS");
        credits();
        System.out.println("\n"+"/--------------------------------------------------------------------------------------/");


    }

    private void credits() {

        System.out.println("        ___                       ___           ___           ___           ___     \n" +
                "              /__/\\        ___          /__/\\         /__/\\         /  /\\         /  /\\    \n" +
                "             _\\_ \\:\\      /  /\\         \\  \\:\\        \\  \\:\\       /  /:/_       /  /::\\   \n" +
                "            /__/\\ \\:\\    /  /:/          \\  \\:\\        \\  \\:\\     /  /:/ /\\     /  /:/\\:\\  \n" +
                "           _\\_ \\:\\ \\:\\  /__/::\\      _____\\__\\:\\   _____\\__\\:\\   /  /:/ /:/_   /  /:/~/:/  \n" +
                "          /__/\\ \\:\\ \\:\\ \\__\\/\\:\\__  /__/::::::::\\ /__/::::::::\\ /__/:/ /:/ /\\ /__/:/ /:/___\n" +
                "          \\  \\:\\ \\:\\/:/    \\  \\:\\/\\ \\  \\:\\~~\\~~\\/ \\  \\:\\~~\\~~\\/ \\  \\:\\/:/ /:/ \\  \\:\\/:::::/\n" +
                "           \\  \\:\\ \\::/      \\__\\::/  \\  \\:\\  ~~~   \\  \\:\\  ~~~   \\  \\::/ /:/   \\  \\::/~~~~ \n" +
                "            \\  \\:\\/:/       /__/:/    \\  \\:\\        \\  \\:\\        \\  \\:\\/:/     \\  \\:\\     \n" +
                "             \\  \\::/        \\__\\/      \\  \\:\\        \\  \\:\\        \\  \\::/       \\  \\:\\    \n" +
                "              \\__\\/                     \\__\\/         \\__\\/         \\__\\/         \\__\\/    ");
        System.out.println("            MMMMM.     .MMMMMM          MMMMMMMMM         .M          MMMMM           \n" +
                "              M.        MM    MM         MM   .M          MM.          MM             \n" +
                "              M.        MM     MM        MM              ..MM          MM             \n" +
                "              M.        MM      MM       MM .M           M  MM         MM             \n" +
                "              M.        MM      MM       MM  M          M-_-MM         MM             \n" +
                "              M.        MM     .MM       MM  .          M    MM        MM             \n" +
                "              M.        MM     MM        MM     M      M     .M        MM     M       \n" +
                "             MMMMM      MMMMMMM+        NMMMMMMMMM    MMMM$  ZMMMM    .MMMMMMMMM  ");

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Created by Jonathan Elliott:Quiet Storm Productions");
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thank You ");
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(":)");
    }

    public static void main(String[] args) {
        (new Thread(new IdealTerminal())).start();
      }

    public void Init(){


        System.out.println("Welcome!The purpose of this Java Program is to create your fantasy ideal life.." +
                ("\n")+"Create a character at the bottom of society." +
                ("\n")+"Progress this character through the world and accumulate influence, wealth, and associates." +
                ("\n")+"Don't hold back,accumulating everything the world has the offer is the key of winning the game"+
                ("\n")+"Good Luck!");



    }

    //Creates a New Name for your Character only
    public NameGenerator CreateCharacter() {

        System.out.println("\n");
        System.out.println("(1)To make your own name " + ("\n") +
                "(2)Generate a Male's Name" + ("\n") +
                "(3)Generate a Female's Name" + ("\n"));
        value = scanner.nextInt();
        //value =Integer.valueOf(value);
        while(value < 0 || value> 3 ||value==0/*|| Integer.valueOf(value)*/) {
            System.out.println("You did not put in a valid command");
            this.CreateCharacter();
        }
        switch (value) {
            case 1:
                System.out.println("Make your own name");
                System.out.println("Make First Name");
                this.firstNamePart = scanner.next();
                System.out.println("Make Last Name");
                this.familyName = scanner.next();
                nameOfChar = new NameGenerator(firstNamePart, familyName);
                System.out.println("\n Is this a (1)boy or (2)girl");
                value = scanner.nextInt();
                //value =Integer.valueOf(value);
                while(value < 0 || value> 2 ||value==0/*|| Integer.valueOf(value)*/) {
                    System.out.println("You did not put in a valid command");
                    this.CreateCharacter();
                    switch (value) {
                        case 1:
                            male = true;
                            break;
                        case 2:
                            male = false;

                    }
                }

                break;
            case 2:
                System.out.println("Generating a Boy");
                name = new NameGenerator(true);
                nameOfChar = new NameGenerator(name.getFirstName(), name.getLastName());
                familyName=name.getLastName();
                male=true;
                //human = new Human(nameOfChar.getWholeName());
                //this.printOutCharDetails();
                break;
            case 3:
                System.out.println("Generating a Girl");
                name = new NameGenerator(false);
                nameOfChar = new NameGenerator(name.getFirstName(), name.getLastName());
                familyName=name.getLastName();
                male=false;
                //human = new Human(nameOfChar.getWholeName());
                //this.printOutCharDetails();
                break;
        }

        try {
            Thread.sleep(500);
            //System.out.println("Loading...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        human=new Human();
        return nameOfChar;

    }

    //Select a Country
    public void SelectACountry(){
        System.out.println("\n");
        System.out.println("Now...Select a Country");

        System.out.println("Poor Countries:(1)Irada (2)Itican" + ("\n") +
                "Countries with Average Taxes: (3)Albaq (4) Trientina" + ("\n") +
                "Countries with Higher Taxes: (5)Albico (6)Ugeria (7) Portada" + ("\n") +
                "Richest Countries: (8)Kuwador (9)Ukrark (0)Rany" + ("\n")+
                "Divine Countries:(10)Heaven:"+heavenBoolean + ("\n"));

        value = scanner.nextInt();
        //value =Integer.valueOf(value);
        while(value < 0 || value> 10 /*|| Integer.valueOf(value)*/) {
            System.out.println("You did not put in a valid command");
            this.CreateFamily();
        }
        switch (value) {
            case 1:
                this.countries =Countries.Irada;
                break;
            case 2:
                this.countries =Countries.Itican;
                break;
            case 3:
                this.countries =Countries.Albaq;
                break;
            case 4:
                this.countries =Countries.Trinentina;
                break;
            case 5:
                this.countries =Countries.Albico;
                break;
            case 6:
                this.countries =Countries.Ugeria;
                break;
            case 7:
                this.countries =Countries.Portada;
                break;
            case 8:
                this.countries =Countries.Kuwador;
                break;
            case 9:
                this.countries =Countries.Ukrark;
                break;
            case 0:
                this.countries =Countries.Rany;
                break;
            case 10:
                if(socialisingWithFriends<4||!heavenBoolean) {
                    System.out.println("You have not socialised enough to access this place");
                    if (schoolAttendanceAmount < 4||!heavenBoolean) {
                        System.out.println("You do not have enough education to access this place");
                     }else {
                        System.out.println("Choose a different country");
                        SelectACountry();
                    }
                    if (human.getWorshippers() < 10000||!heavenBoolean) {
                        System.out.println("You do not have enough worshippers to access this place");
                    }else {
                        System.out.println("Choose a different country");
                        SelectACountry();
                    }
                    if (human.getInfluence() < 100000||!heavenBoolean) {
                        System.out.println("You do not have enough power to access this place");
                        System.out.println("Choose a different country");
                        SelectACountry();
                    } else {
                        heavenBoolean = true;
                        this.countries = Countries.Heaven;
                    }

                }
                break;

        }
        //I did this because when the user was asked to change countries...this method did not update properly...
        // also meant that the user was stuck picking the same jobs for a certain country even though that user is not there
        if(age>1){
            family.setCountry(countries);
            human.setCountries(countries);
        }if(age>=20){
            human.setCountries(countries);
        }
        this.CountryDetails();
    }

    //Creates a New Family
    public Family CreateFamily() {

        System.out.println("\n");
        System.out.println("Now...make a Family");
        //if(familyName.equals("")) {
          //  System.out.println("Type in a Family Name");
            //this.familyName = scanner.next();
        //}
        System.out.println("(1)Generate a Poor Family " + ("\n") +
                "(2)Generate a Middle Family" + ("\n") +
                "(3)Generate a Rich Family" + ("\n") +
                "(4)Generate a Custom Family" + ("\n"));

        value = scanner.nextInt();
        //value =Integer.valueOf(value);
        while(value < 0 || value> 4 ||value==0/*|| Integer.valueOf(value)*/) {
            System.out.println("You did not put in a valid command");
            this.CreateFamily();
        }
        switch (value) {
            case 1:
                System.out.println("Generating a Poor Family");
                father = new FamilyMember(true, familyName, Jobs.BEGGER, countries, randomNum * 20, (int) (randomNum * 1.5));
                mother = new FamilyMember(false,familyName,Jobs.PACKINGBOY,countries,randomNum*20, (int) (randomNum*1.5));
                sister = new FamilyMember(false,familyName,Jobs.INTERN,countries,randomNum*20, (int) (randomNum*1.5));
                this.brother = new FamilyMember(true, familyName, Jobs.NOJOB, countries, randomNum * 20, (int) (randomNum * 1.5));
                family = new Family(familyName, brother,sister, father,mother);

                break;
            case 2:
                System.out.println("Generating a Middle Family");
                father = new FamilyMember(true,familyName,Jobs.FIREFIGHTER,countries,randomNum*20, (int) (randomNum*1.5));
                mother = new FamilyMember(false,familyName,Jobs.FIREFIGHTER,countries,randomNum*20, (int) (randomNum*1.5));
                sister = new FamilyMember(false,familyName,Jobs.NOJOB,countries,randomNum*20, (int) (randomNum*1.5));
                brother = new FamilyMember(true,familyName,Jobs.NOJOB,countries,randomNum*20, (int) (randomNum*1.5));
                family = new Family(familyName, brother,sister, father,mother);

                break;
            case 3:
                System.out.println("Generating a Rich Family");
                father = new FamilyMember(true,familyName,Jobs.BUSINESSOWNER,countries,randomNum*20, (int) (randomNum*1.5));
                mother = new FamilyMember(false,familyName,Jobs.BANKTER,countries,randomNum*20, (int) (randomNum*1.5));
                sister = new FamilyMember(false,familyName,Jobs.NOJOB,countries,randomNum*20, (int) (randomNum*1.5));
                brother = new FamilyMember(true,familyName,Jobs.NOJOB,countries,randomNum*20, (int) (randomNum*1.5));
                familyName = nameOfChar.getLastName();
                family = new Family(familyName, brother,sister, father,mother);

                break;
            case 4:
                familyName = nameOfChar.getLastName();
                System.out.println("Generating Custom Family");
                /*
                User can customize Family member's
                    Wealth
                    Worshippers
                    Friends
                */
                System.out.println("(1)This family will have an extreme level of wealth " + ("\n") +
                        "(2)This Family will have many worshippers" + ("\n") +
                        "(3)This Family will have many friends" + ("\n"));


                value = scanner.nextInt();
                //value =Integer.valueOf(value);
                while(value < 0 || value> 4 ||value==0/*|| Integer.valueOf(value)*/) {
                    System.out.println("You did not put in a valid command");
                    this.CreateFamily();
                }
                switch (value) {
                    case 1:
                        System.out.println("Generating a Family with an extreme level of Wealth");
                        father = new FamilyMember(true,familyName,Jobs.BUSINESSOWNER,countries,randomNum*20, (int) (randomNum*1.5));
                        mother = new FamilyMember(false,familyName,Jobs.BUSINESSOWNER,countries,randomNum*20, (int) (randomNum*1.5));
                        sister = new FamilyMember(false,familyName,Jobs.SCIENTIST,countries,randomNum*20, (int) (randomNum*1.5));
                        brother = new FamilyMember(true,familyName,Jobs.SULTAN,countries,randomNum*20, (int) (randomNum*1.5));
                        familyName = nameOfChar.getLastName();
                        family = new Family(familyName, brother,sister, father,mother);

                        break;
                    case 2:
                        System.out.println("Generating a Family will have many Worshippers");
                        father = new FamilyMember(true,familyName,Jobs.FIREFIGHTER,countries,randomNum*20, 50000);
                        mother = new FamilyMember(false,familyName,Jobs.BUSINESSOWNER,countries,randomNum*20, 50000);
                        sister = new FamilyMember(false,familyName,Jobs.NOJOB,countries,randomNum*20, 50000);
                        brother = new FamilyMember(true,familyName,Jobs.NOJOB,countries,randomNum*20, 50000);
                        familyName = nameOfChar.getLastName();
                        family = new Family(familyName, brother,sister, father,mother);

                        break;
                    case 3:
                        System.out.println("Generating a Family with an extreme level of Friends");
                        father = new FamilyMember(true,familyName,Jobs.BANKTER,countries,50000, (int) (randomNum*1.5));
                        mother = new FamilyMember(false,familyName,Jobs.BANKTER,countries,50000, (int) (randomNum*1.5));
                        sister = new FamilyMember(false,familyName,Jobs.NOJOB,countries,50000, (int) (randomNum*1.5));
                        brother = new FamilyMember(true,familyName,Jobs.NOJOB,countries,50000, (int) (randomNum*1.5));
                        familyName = nameOfChar.getLastName();
                        family = new Family(familyName, brother,sister, father,mother);

                        break;
                }
                break;
        }
        if(family.getFamilyFriends()>countries.getRequiredFriends()&&family.getFamilyWealth()>countries.getRequireedWealth()
                && family.getFamilyInfluence()>countries.getRequiredInfluence()){
            family.setNeighborhood(countries.getRichNeighborHood());


        }else if(family.getFamilyFriends()==countries.getRequiredFriends()&&family.getFamilyWealth()==countries.getRequireedWealth()
                && family.getFamilyInfluence()==countries.getRequiredInfluence()) {
            family.setNeighborhood(countries.getMiddleNeighborHood());

        }else{
            family.setNeighborhood(countries.getPoorNeighborHood());
        }
        try {
            Thread.sleep(500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.FamilyDetails();
        return family;
    }

    //Tutorial
    public void TutorialwithFamily(){
        System.out.println("\n"+"/--------------------------------------------------------------------------------------/");
        System.out.println("Now that you have a family; it is time to start your new IDEAL life"+"\n"
                +"Every turn represents an age"+"\n"
                +"Once age 20 is reached; the player will be removed from the family and has to choose a starting location");
        //Turn

        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("INITIAL STATE");
        System.out.println("|"+family.getFamilyWealth()+"|"+"|"+countries.getName()+"||"+countries.getTaxes());
        System.out.println("\n"+"/--------------------------------------------------------------------------------------/");
            age=1;
        do {

                System.out.println("\n" + "/--------------------------------------------------------------------------------------/");


                randomNum = rand.nextInt(30);
                //System.out.println(randomNum);
                if (randomNum <= 13) {
                    chancesOfLife();
                }

                System.out.println("Turn: " + age + "\n" +"|Family" +"|" + family.getFamilyWealth() + "|" + "|" + countries.getName() + "|" + "|" + countries.getTaxes());
                updatingStateOfFamily(wealth,influence);
                updatingStateOfHuman(job, looks, worshippers, friends, professionAssocites, influence);
                FamilyDetails();
                System.out.println("\n" + "/--------------------------------------------------------------------------------------/");
                age++;


        }while(age<20);
        //Once this human reaches 20 years of age then the family's wealth will be given to the human
       human.setWealth(family.getFamilyWealth());
        human.setOverAllwealth(family.getFamilyWealth()+human.getOverAllWealth());


        //do {
        //    System.out.println("\n" + "/--------------------------------------------------------------------------------------/");
        //    this.worshippersFollow(worshippersFollow);
        //    updatingStateOfHuman(job,looks,worshippers,friends,professionAssocites,influence);
        //    FamilyDetails();
        //    makeLifeDecisions();
        //    chancesOfLife();
        //    family.setFamilyWealth(family.getFamilyWealth() - countries.getTaxes());
        //    System.out.println("Turn: " + age + "\n" + "|" + family.getFamilyWealth()+ "|" + "|" + countries.getName() + "|" + "|" + countries.getTaxes());
        //    System.out.println("\n" + "/--------------------------------------------------------------------------------------/");
        //    age++;
        //}while (age < 20.0) ;


    }

    public void GrownUpHuman(){
        System.out.println("\n"+"/--------------------------------------------------------------------------------------/");
        System.out.println("You are now an adult and will have to work on your own now to secure you IDEAL Life"+"\n"
                +"If you can reach $10,000,000 in wealth and 2,000,000 in influence;you would have won the game!!"
                +"\n There are also many other features to unlock in the game"
                +"\n Create your IDEAL Life");
        try {
            Thread.sleep(5000);
            System.out.println("Loading...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Adult||Initial Wealth:"+human.getInitialWealth()+"|"+"|"+countries.getName()+"|"+"|"+countries.getTaxes()+"|| Neighborhood: "+human.getNeighborhood());
        do {

                System.out.println("\n" + "/--------------------------------------------------------------------------------------/");

                ///This is so that the user will make a decision  happens every four turns and NOT every turn
                if ((age % 4) == 0) {
                    makeLifeDecisions();
                    //countries.setTaxes(countries.getMultiplier() * countries.getTaxes());

                }
            randomNum = rand.nextInt(30);
            //System.out.println(randomNum);
            if (randomNum <= 13) {
                chancesOfLife();
            }


                System.out.println("Turn: " + age + "\n" +"|Adult" +"|" + human.getOverAllWealth() + "|" + "|" + countries.getName() + "|" + "|" + countries.getTaxes());


            //Once the player reaches 100000 worshippers, the player will become a god
            //it only needs to be activated once and the benefit should automatically apply without the player being notified again
            //Permanent benefit once it is activated
            if(worshippersActivation) {//this will play once the upgrade is activated
                job = Jobs.GOD;
                this.worshippersFollow(worshippersActivation);
                heavenBoolean=true;

            }else if(human.getWorshippers()>=100000&& !worshippersActivation){//This will play first when the upgrade is activated for the
                //First time

                job = Jobs.GOD;
                this.worshippersFollow(worshippersActivation);
                heavenBoolean=true;
                System.out.println("You have earned enough worshippers to become a God.Rule over all!!");
                System.out.println("You have also gained access to heaven");
            }else{
                this.worshippersFollow(worshippersFollow);
                           }


            //Once the player reaches 100000 in influence, the player will get paid $100000 every turn
            //it only needs to be activated once and the benefit should automatically apply without the player being notified again
            //Permanent benefit once it is activated
            if(influencActivation){
                System.out.println("You have gained 100000 in wealth");
                wealth =100000;
            }else if(human.getInfluence()>=100000 && !influencActivation || human.getProfessionalAssociates()>=10000 && !influencActivation
                    ||human.getFriends()>=100000 && !influencActivation){
                System.out.println("You have gained enough power,you will now gain a steady source of money");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                wealth =100000;
                influencActivation=true;
            }



                updatingStateOfHuman(job, looks, worshippers, friends, professionAssocites, influence);
                wealth=0;
                CharDetails();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                System.out.println("\n" + "/--------------------------------------------------------------------------------------/");
                age++;


        }while(human.getOverAllWealth()< 10000000 && human.getInfluence()<2000000);
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You have created your ideal life at age:" +age);




    }

    //If 'worshippersFollow' is true then the user will gain  100 worshippers for 10 turns.I am proud of this piece of code!!
    private void worshippersFollow(boolean worshippersFollow) {

        if(worshippersFollow && tempNum !=age) {

                human.setWorshippers(human.getWorshippers()+100);
                System.out.println("You attracted 100 worshippers");
                tempNum++;

        }if(worshippersFollow && god){


                human.setWorshippers(human.getWorshippers()+1000);
                System.out.println("You attracted 1000 worshippers");


        }
    }

    public void CharDetails(){
        //System.out.println("DOuble Value Wealth:"+human.getOverAllWealth());
        System.out.println("Name: "+human.getName());
        System.out.println("Job:"+ human.getJob());
        System.out.println("Income: "+ human.getIncome());
        System.out.println("Initial Wealth: "+human.getInitialWealth());
        System.out.println("Overall Wealth: "+human.getOverAllWealth());
        System.out.println("Friends: "+human.getFriends());
        System.out.println("Professional Associates: "+human.getProfessionalAssociates());
        System.out.println("Influence: "+human.getInfluence());
        System.out.println("Worshippers : "+human.getWorshippers());
        System.out.println("Attractiveness : " +human.getLooks());
        //System.out.println("Color: "+ human.getColor());
        this.CountryDetails();
        System.out.println("Neighborhood: " +human.getNeighborhood());

        //this.FamilyDetails();

    }

    public void FamilyDetails(){
        System.out.println("Name: "+family.getFamilyName()+"'s Family");
        System.out.println("Family Wealth:"+ family.getFamilyWealth());
        System.out.println("Influence: "+family.getFamilyInfluence());
        System.out.println("Country: "+ family.getFamilyCountry());
        System.out.println("Family Friend: "+ family.getFamilyFriends());
        System.out.println("Family Worshippers: "+ family.getFamilyWorshippers());
        System.out.println("Family's Neighborhood: "+ family.getFamilyNeighborhood());
        this.CountryDetails();


    }

    public void CountryDetails(){
        System.out.println("Name:"+countries.getName());
        System.out.println("Total Money Amount:$"+countries.getIncome());
        System.out.println("Taxes:"+countries.getTaxes());


    }

    //Puts Name/Family/Country together to make one human that the user can control
    public void FinalInit(){
        System.out.println("\n");
        System.out.println("Finishing up the Final Touches on your new Character");
        try {
            Thread.sleep(500);
            //System.out.println("Loading...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        human = new Human(nameOfChar.getWholeName(), Jobs.NOJOB,family,countries);
        job=Jobs.NOJOB;


    }

    public void chancesOfLife(){
                   try {
                Thread.sleep(1000);
                 } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n"+"/--------------------------------------------------------------------------------------/"+"CHANCES OF LIFE"+"\n");
            System.out.println("..................:::...................\n" +
                    ".................:::::..................\n" +
                    "................:::::::.................\n" +
                    "...............:::::::::................\n" +
                    "..............::::: :::::...............\n" +
                    ".............:::::   :::::..............\n" +
                    "............:::::     :::::.............\n" +
                    "............::::  ...  ::::.............\n" +
                    "...........::::   ...   ::::............\n" +
                    "..........::::    ...    ::::...........\n" +
                    ".........::::     ...     ::::..........\n" +
                    "........::::      ...      ::::.........\n" +
                    ".......::::       ...       ::::........\n" +
                    "......::::        ...        ::::.......\n" +
                    ".....::::          .          ::::......\n" +
                    "....:::::          ~          :::::.....\n" +
                    "...:::::          ...          :::::....\n" +
                    "..:::::           ...           :::::...\n" +
                    ".:::::                           :::::..\n" +
                    ".:::::::::::::::::::::::::::::::::::::..\n" +
                    ":::::::::::::::::::::::::::::::::::::::.\n" +
                    "........................................");

            System.out.println("\n");
            ///If you want to test any specific chance of life just place in the case number into switch bracket..the program will only run that switch
            switch (randomNum) {

                case 0:
                    //Move to another country with higher or lower income
                    //This affects your wealth with the family in the tutorial
                    //This will affect your overall wealth in th later game

                        System.out.println("You decided to move;so here is the  opportunity to choose a different country!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                        SelectACountry();
                        //CountryDetails();

                    break;
                case 1:

                    //System.out.println("2");
                    if(age<20) {
                        if ( family.getFamilyFriends() > 1000) {
                            System.out.println("Your family is very famous and this allows you to earn $500");
                            family.setFamilyWealth(human.getOverAllWealth() + 500);
                            System.out.println("This character's wealth is $" + family.getFamilyWealth());

                            CharDetails();
                        } else if ( family.getFamilyFriends() > 500) {
                            System.out.println("Your family is Famous and this allows you to earn $100");
                            family.setFamilyWealth(human.getOverAllWealth() + 100);
                            System.out.println("This character's wealth is $" + family.getFamilyWealth());

                            CharDetails();
                        } else {
                            System.out.println("Your family is not very popular;it is beneficial to have more friends!!");
                        }

                    }else {
                        if (human.getFriends() > 1000 ) {
                            System.out.println("You are very famous and this allows you to earn $500");
                            human.setOverAllwealth(human.getOverAllWealth() + 500);
                            System.out.println("This character's wealth is $" + human.getOverAllWealth());

                            CharDetails();
                        } else if (human.getFriends() > 500 ) {
                            System.out.println("You are famous  and this allows you to earn $100");
                            human.setOverAllwealth(human.getOverAllWealth() + 100);
                            System.out.println("This character's wealth is $" + human.getOverAllWealth());

                            CharDetails();
                        } else {
                            System.out.println("You are not very popular;it is beneficial to have more friends!!");
                        }

                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    break;
                case 2:

                    //System.out.println("3");
                    if (human.getInfluence() > 100000 || human.getInfluence() + family.getFamilyInfluence() > 100000) {
                        System.out.println("Your family has a high influence level and is able to get you to the best schools and mentors" + "\n" + "You have will have access to the intern job "
                                + "\n" + "You have will have access to the Banker job "
                                + "\n" + "You have will have access to the Business Owner job ");

                        intern = true;
                        banker = true;
                        buisnessowner = true;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("Your family's influence is not very high;try increasing it!!");
                    }


                    break;
                case 3:

                    //System.out.println("4");
                    if (human.getFriends() > 100000 || human.getFriends() + family.getFamilyFriends() > 100000) {
                        System.out.println("Having many friends make ways for more friends.You gained 500 friends");
                        human.setFriends(human.getFriends() + 500);
                        CharDetails();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else if(human.getFriends() > 1000 || human.getFriends() + family.getFamilyFriends() > 1000) {
                        System.out.println("You don't have much friends but you still get a bonus.You gained 100 friends");
                        human.setFriends(human.getFriends() + 100);
                        CharDetails();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    } else {
                        System.out.println("You do not have enough friends to access this bonus");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    break;
                case 4:

                    //System.out.println("5");
                    System.out.println("A storm came over and destroyed your car.You lose some of your money in the process of replacing it");

                    if(age>20) {
                        human.setOverAllwealth(human.getOverAllWealth() - 10000);
                        System.out.println("You got charged:10000");
                        CharDetails();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }else{
                        wealth=-10000;
                        updatingStateOfFamily(wealth,0);
                        wealth=0;
                        System.out.println("Your family got charged $10000");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }

                    break;
                case 5:
                    //System.out.println("6");

                    if (human.getLooks() > 1 && human.getLooks() < 5) {
                        System.out.println("You are not very good looking and people do not resonate with you very well.What a shallow world where people judge based on your looks \n You gain nothing");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    } else if (human.getLooks() == 5) {
                        System.out.println("You are average looking so very few people take you on face value.What a shallow world where people judge based on your looks \n You gain $100 \n" +
                                "You gain 100 influence" +
                                "\n You gain 100 friends");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        human.setOverAllwealth(human.getOverAllWealth() + 100);
                        human.setInfluence(human.getInfluence() + 100);
                        human.setFriends(human.getFriends() + 100);


                    } else if (human.getLooks() < 15) {
                        System.out.println("People automatically love you at face value.What a shallow world where people judge based on your looks \n You gain $500 \n" +
                                "You gain 500 influence" +
                                "\n You gain 500 friends");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        human.setOverAllwealth(human.getOverAllWealth() + 500);
                        human.setInfluence(human.getInfluence() + 500);
                        human.setFriends(human.getFriends() + 500);


                    }
                    CharDetails();
                    break;
                case 6:
                    //System.out.println("7");
                    if(god&&age>20) {
                        System.out.println("You have surpass the earthly domain and is ready to create your own heaven");
                        human.setJob(Jobs.GOD);
                        worshippersFollow = true;
                        heavenBoolean=true;
                       System.out.println("You have also gained access to heaven");
                        CharDetails();


                    }else if(age>20){
                        System.out.println("You inherited Godly talent! You begin to attract worshippers");
                        worshippersFollow = true;
                    }else{
                        System.out.println("You need to be outside the family tutorial to access this benefit");
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;

                case 7:
                     Jobs temjobA=human.getJob(); ///I must undo any changes if the user doesn't comply with my instructions
                    if(age>19) {
                        System.out.println("You magically found a genie and he is able to grant you three wishes!");

                        for (int i = 0; i < 3; i++) {

                            System.out.println(" Options are displayed..Choose ONE..or lose your three wishes completely");
                            System.out.println("(1)Improve your physical Appearance  " + ("\n") +
                                    "(2)Increase the number of Worshippers" + ("\n") +
                                    "(3)Increase the number of Friends" + ("\n") +
                                    "(4)Increase the number of Professional Associates" + ("\n") +
                                    "(5)Increase you Influence" + ("\n") +
                                    "(6)Increase your Wealth" + ("\n") +
                                    "(7)Choose any job you desire" + ("\n") +
                                    "(0)Special" + ("\n"));
                            value = scanner.nextInt();
                            if (value < 0 || value > 7 /*|| Integer.valueOf(value)*/) {
                                ///I must undo any changes if the user doesn't comply with my instructions
                                //looks=0,worshippers=0,friends=0,professionAssocites=0,influence=0,wealth=0;
                                job=temjobA;

                                worshippers = 0;
                                wealth = 0;
                                friends = 0;
                                looks = 0;
                                professionAssocites = 0;
                                influence = 0;
                                updatingStateOfHuman(job,looks,worshippers,friends,professionAssocites,influence);
                                System.out.println("You did not place in a proper command,upsetting the Genie.You lose all three of your wishes");
                                chancesOfLife();

                            }
                            selectingAWish(value);

                            }
                            updatingStateOfHuman(job,looks,worshippers,friends,professionAssocites,influence);
                                 worshippers = 0;
                                wealth = 0;
                                friends = 0;
                                looks = 0;
                                 professionAssocites = 0;
                                influence = 0;


                    }else{
                        updatingStateOfHuman(Jobs.NOJOB,1,10,10,10,100);
                        System.out.println("You get a slight boost in wealth, worshippers,friends,looks,professional associates, and influence");
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    break;

                case 8:
                    //System.out.println("9");
                    if (age > 20) {
                        System.out.println("You won the lottery so you will gain $500000");
                        human.setOverAllwealth(human.getOverAllWealth() + 500000);
                        System.out.println(human.getOverAllWealth());

                    }else{
                        wealth=500000;
                        updatingStateOfFamily(wealth,0);
                        System.out.println("Your family won the lottery,gained $500000");
                        wealth=0;
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    break;


                case 9:
                    //System.out.println("10");
                    System.out.println("Your recent trip to IDEAL Center of Academics added professional Associates to call onto later in life");
                    human.setProfessionalAssociates(human.getProfessionalAssociates()+500);
                    CharDetails();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;

                case 10:

                    //System.out.println("11");
                    System.out.println("You get a boost in influence, wealth, and friends!You are very lucky");
                    human.setOverAllwealth(human.getOverAllWealth() + 500000);
                    human.setFriends(human.getFriends()+50000);
                    human.setInfluence(human.getInfluence()+5000);
                    CharDetails();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;

                case 11:

                    //System.out.println("12");
                    System.out.println("You get a boost in professional associates, looks, and worshippers !You are very lucky");
                    human.setProfessionalAssociates(human.getProfessionalAssociates() + 5000);
                    human.setLooks(human.getLooks()+2);
                    human.setWorshippers(human.getWorshippers()+5000);
                    CharDetails();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    break;

                case 12:

                    //System.out.println("13");
                    System.out.println("You lose in  influence, wealth, and friends!You are very unlucky");
                    human.setOverAllwealth(human.getOverAllWealth() - 5000);
                    human.setFriends(human.getFriends()-500);
                    human.setInfluence(human.getInfluence()-500);
                    CharDetails();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;

                case 13:

                   // System.out.println("14");
                    System.out.println("You lose in professional associates, looks, and worshippers !You are very unlucky");
                    human.setProfessionalAssociates(human.getProfessionalAssociates() -500);
                    human.setLooks(human.getLooks()-2);
                    human.setWorshippers(human.getWorshippers()+50);
                    CharDetails();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;


            }

        System.out.println("\n"+"/--------------------------------------------------------------------------------------/");
        try {
            Thread.sleep(2000);
            System.out.println("No chances of life this turn...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void makeLifeDecisions() {
        //try {
        //    Thread.sleep(1000);
        //    System.out.println("Loading...");
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}

        System.out.println("\n"+"/--------------------------------------------------------------------------------------/MAKE A DECISION");
        System.out.println("                            \n" +
                "               ~=========               \n" +
                "            ~====~~~~~~==~~~            \n" +
                "         7~+=~~~~~~~~~~~~~~~~77         \n" +
                "        ===~~~~::::::::::~~~~~I7        \n" +
                "       =+~~~~::::::::::::::~~~~=7       \n" +
                "      7?~~~~::::,,::::::::::~~~~I       \n" +
                "        ~:::::,:~      ~::::~~~~~~      \n" +
                "          7~:,~         ~~:~~~~~=~      \n" +
                "                         ?=~~~~~==      \n" +
                "                        ~:=~~~~~==      \n" +
                "                       ~:~~~~~::~7      \n" +
                "                    7~:~~~~~~:::=       \n" +
                "                  7~:~~~~~~::::~        \n" +
                "                 =~=~~~~::::::~         \n" +
                "                ?~=~~~::::::~7          \n" +
                "               7==~~~:::::~7            \n" +
                "               I+~~~::::~7              \n" +
                "               I=~~::::~                \n" +
                "               =:::::::=                \n" +
                "                 7777                   \n" +
                "               77:,,,:7                 \n" +
                "         77 777I~=~~~:7~77777           \n" +
                "      777777777?=~~~~~~=77777777        \n" +
                "      777777777~::~~~::~777777777       \n" +
                "     7777777777~:::::::~7777777777      \n" +
                "     77777777777~:::::~I7777777777      \n" +
                "     7777777777I?=,.,~?II777777777      \n" +
                "     7777777777777777777777777777       \n" +
                "      77777777777777777777777777        \n" +
                "        77777777777777777777777         \n" +
                "           77777777777777777      ");
        System.out.println("\n");

        System.out.println("(1)Get a job" + ("\n") +
                "(2)Go to school" +" School Attendance:"+schoolAttendanceAmount+ ("\n") +
                "(3)Work on your physical Appearance:" +workingOnPhysicalApp+ ("\n") +
                "(4)Socialise with People:" + socialisingWithFriends+ ("\n") +
                "(5)Move to another Country" );
        value = scanner.nextInt();
        //value =Integer.valueOf(value);
        while (value < 0 || value > 5 || value == 0/*|| Integer.valueOf(value)*/) {
            System.out.println("You did not put in a valid command");
            this.makeLifeDecisions();
        }
        switch (value) {
            case 1:
                //Scanner and the if statement will always be Loading for a wrong option while everything so if the user places anything outside the desired options then that user will be  placed back
                //to the top of case 1
                System.out.println("Get a job: Raises you overall wealth" + "\n" +
                        "Raises the amount of professional Associates" + "\n" +
                        "Raises your influence" + "\n" +
                        "Raises your amount of friends slightly");
                //System.out.println(human.getCountry());

                if (age < 20) {
                    System.out.println("(1)Packing Boy" + ("\n") +
                            "(2)Intern" + ("\n"));
                    value = scanner.nextInt();
                    while (value < 0 || value > 2 || value == 0/*|| Integer.valueOf(value)*/) {
                        System.out.println("You did not put in a valid command");
                        this.makeLifeDecisions();
                    }

                    System.out.println("\n");

                    switch (value) {
                        case 1:
                            job = Jobs.PACKINGBOY;
                            professionAssocites = 100;
                            friends = 10;
                            break;
                        case 2:
                            job = Jobs.INTERN;
                            professionAssocites = 500;
                            friends = 15;
                            break;
                    }

                }  else {
                    //System.out.println("It got past the else");
                    //The Human will be old enough to move into his own country..So use getter from human
                    if (human.getCountry() == Countries.Irada ||
                            human.getCountry() == Countries.Itican ||
                            human.getCountry() == Countries.Albaq) {
                        //System.out.println("It is in the first if statement :)");
                        System.out.println("\n You can only choose jobs that you have access to....Press 0 to go back if you have access to no jobs"
                                + "\n" + "(1)Beggar:" + begger
                                + "\n" + "(2)Vagrant:" + vagrant
                                + "\n" + "(3)Packing Boy:" + packingboy);
                        value = scanner.nextInt();
                        while (value < 0 || value > 3 || value == 0/*|| Integer.valueOf(value)*/) {
                            System.out.println("You did not put in a valid command");
                            this.makeLifeDecisions();
                        }
                        switch (value) {
                            case 1:
                                if (begger) {
                                    job = Jobs.BEGGER;
                                    professionAssocites = 10;
                                    friends = 0;
                                } else {
                                    System.out.println("You do not have access to this job");
                                    makeLifeDecisions();
                                }
                                break;
                            case 2:
                                if (vagrant) {
                                    job = Jobs.VAGRANT;
                                    professionAssocites = 0;
                                    friends = 0;
                                } else {
                                    System.out.println("You do not have access to this job");
                                    makeLifeDecisions();
                                }
                                break;
                            case 3:
                                if (packingboy) {
                                    job = Jobs.PACKINGBOY;
                                    professionAssocites = 10;
                                    friends = 0;
                                } else {
                                    System.out.println("You do not have access to this job");
                                    makeLifeDecisions();
                                }

                                break;

                        }
                    }
                    if (human.getCountry() == Countries.Trinentina ||
                            human.getCountry() == Countries.Albico ||
                            human.getCountry() == Countries.Ugeria ||
                            human.getCountry() == Countries.Portada) {

                            System.out.println("\n You can only choose jobs that you have access to....Press 0 to go back if you have access to no jobs"

                                    + "\n" + "(1)Firefighter:" + firefighter
                                    + "\n" + "(2)Banker:" + banker
                                    + "\n" + "(3)Scientist:" + scientist);
                             value = scanner.nextInt();
                            while (value < 0 || value > 3 /*|| Integer.valueOf(value)*/) {
                                System.out.println("You did not put in a valid command");
                                this.makeLifeDecisions();
                            }
                            switch (value) {
                                case 1:
                                    if (firefighter) {
                                        job = Jobs.FIREFIGHTER;
                                        professionAssocites = 0;
                                        friends = 0;
                                    } else {
                                        System.out.println("You do not have access to this job");
                                        makeLifeDecisions();
                                    }
                                    break;
                                case 2:
                                    if (banker) {
                                        job = Jobs.BANKTER;
                                        professionAssocites = 10;
                                        friends = 0;
                                    } else {
                                        System.out.println("You do not have access to this job");
                                        makeLifeDecisions();
                                    }

                                    break;

                                case 3:
                                    if (scientist) {
                                        job = Jobs.SCIENTIST;
                                        professionAssocites = 10;
                                        friends = 0;
                                    } else {
                                        System.out.println("You do not have access to this job");
                                        makeLifeDecisions();
                                    }
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                            }

                    }
                    if (human.getCountry() == Countries.Kuwador ||
                            human.getCountry() == Countries.Ukrark ||
                            human.getCountry() == Countries.Rany) {
                        System.out.println("\n You can only choose jobs that you have access to....Press 0 to go back if you have access to no jobs"
                                + "\n" + "(1)Banker:" + banker
                                + "\n" + "(2)Scientist:" + scientist
                                + "\n" + "(3)Independent:" + independent
                                + "\n" + "(4)Business Owner:" + buisnessowner);

                        value = scanner.nextInt();
                        while (value < 0 || value > 4 || value == 0/*|| Integer.valueOf(value)*/) {
                            System.out.println("You did not put in a valid command");
                            this.makeLifeDecisions();
                        }
                        switch (value) {
                            case 1:
                                if (banker) {
                                    job = Jobs.BANKTER;
                                    professionAssocites = 100;
                                    friends = 100;
                                } else {
                                    System.out.println("You do not have access to this job");
                                    makeLifeDecisions();
                                }

                                break;

                            case 2:
                                if (scientist) {
                                    job = Jobs.SCIENTIST;
                                    professionAssocites = 100;
                                    friends = 100;
                                } else {
                                    System.out.println("You do not have access to this job");
                                    makeLifeDecisions();
                                }
                                break;

                            case 3:
                                if (independent) {
                                    job = Jobs.INDEPENDENT;
                                    professionAssocites = 100000;
                                    friends = 10000000;
                                } else {
                                    System.out.println("You do not have access to this job");
                                    makeLifeDecisions();
                                }
                                break;
                            case 4:
                                if (buisnessowner) {
                                    job = Jobs.BUSINESSOWNER;
                                    professionAssocites = 10000;
                                    friends = 10000;
                                } else {
                                    System.out.println("You do not have access to this job");
                                    makeLifeDecisions();
                                }
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                break;

                        }
                    }
                    if (human.getCountry() == Countries.Heaven) {

                        //A boolean will be returned for the access level of all jobs
                        System.out.println("\n You can only choose jobs that you have access to....Press 0 to go back if you have access to no jobs"
                                + "\n" + "(1)Independent:" + independent
                                + "\n" + "(2)King:" + king
                                + "\n" + "(3)Sultan:" + sultan);

                        value = scanner.nextInt();
                        while (value < 0 || value > 9 || value == 0/*|| Integer.valueOf(value)*/) {
                            System.out.println("You did not put in a valid command");
                            this.makeLifeDecisions();
                        }
                        switch (value) {

                            case 1:
                                if (independent) {
                                    job = Jobs.INDEPENDENT;
                                    professionAssocites = 200000;
                                    friends = 2000000;
                                } else {
                                    System.out.println("You do not have access to this job");
                                    makeLifeDecisions();
                                }
                                break;

                            case 2:
                                // private Boolean banker,independent,buisnessowner,king,intern;
                                if (king) {
                                    job = Jobs.KING;
                                    professionAssocites = 2000000;
                                    friends = 2000000;
                                } else {
                                    System.out.println("You do not have access to this job");
                                    makeLifeDecisions();
                                }
                                break;
                            case 3:
                                if (king && sultan) {
                                    job = Jobs.SULTAN;
                                    professionAssocites = 100000000;
                                    friends = 100000;

                                } else {
                                    System.out.println("You don't have access to this job");
                                    makeLifeDecisions();
                                }
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                break;
                        }

                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                break;

            case 2:
                System.out.println("Go a school:Raises the amount of professional Associates" + "\n" +
                        "Unlocks jobs" + "\n" +
                        "Raises the amount of friends");
                human.setOverAllwealth(human.getOverAllWealth()-2500*countries.getMultiplier());
                System.out.println("You got charged:$"+2500*countries.getMultiplier());

                         schoolAttendanceAmount++;
                System.out.println("School Attendance:"+schoolAttendanceAmount);
                if (human.getOverAllWealth() >= 1 && human.getInfluence() >= 1 || schoolAttendanceAmount>=0) {
                    if (!begger) {
                        begger = true;
                        System.out.println("You have unlocked the Begger Job");
                    }
                    if (!vagrant) {
                        vagrant = true;
                        System.out.println("You have unlocked the Vagrant Job");
                    }
                }if(human.getOverAllWealth()>=10000 && human.getInfluence()>=20000 || schoolAttendanceAmount>=1){
                    if(!intern){
                        intern=true;
                        System.out.println("You have unlocked the Intern Job");
                    }if(!packingboy){
                        packingboy=true;
                        System.out.println("You have unlocked the Packing boy Job");
                    }if(!firefighter){
                        firefighter=true;
                        System.out.println("You have unlocked the Firefighter Job");
                }
                }if(human.getOverAllWealth()>=70000 && human.getInfluence()>=100000 || schoolAttendanceAmount>=2&&socialisingWithFriends>=2
                    &&workingOnPhysicalApp>=1){
                    if(!banker){
                    banker=true;
                    System.out.println("You have unlocked the Banker Job");
                    }if(!scientist){
                    scientist=true;
                    System.out.println("You have unlocked the Scientist Job");
                    }if(!independent){
                    independent=true;
                    System.out.println("You have unlocked the Independent Job");
                    }if(!firefighter){
                    firefighter=true;
                    System.out.println("You have unlocked the Firefighter Job");
                    }
                }if(human.getOverAllWealth()>=1000000 && human.getInfluence()>=100000 && human.getFriends()>10000 || schoolAttendanceAmount>=3&&socialisingWithFriends>=3
                    &&workingOnPhysicalApp>=3){
                if(!sultan){
                    sultan=true;
                    System.out.println("You have unlocked the Sultan Job");

                }
                }if(human.getOverAllWealth()>=10000000 && human.getInfluence()>=10000000 && human.getFriends()>100000 && human.getWorshippers()>10000 ||  schoolAttendanceAmount>=4&&socialisingWithFriends>=4
                    &&workingOnPhysicalApp>=4) {
                if (!god) {
                    god = true;
                    System.out.println("You have unlocked the God Job");

                }

            }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                System.out.println("Work on your physical Appearance:Raises your looks" + "\n" +
                        "Raises the amount of worshippers" + "\n" +
                        "Raises the amount of influence" + "\n" +
                        "Raises the amount of friends");
                workingOnPhysicalApp++;
                System.out.println("How many times you have worked on your physical appearance:"+workingOnPhysicalApp);
                human.setLooks(human.getLooks()+1);
                human.setWorshippers(human.getWorshippers()+100);
                human.setInfluence(human.getInfluence()+1000);
                human.setFriends(human.getFriends()+1000);
                human.setOverAllwealth(human.getOverAllWealth()-100*countries.getMultiplier());
                System.out.println("Your looks got increased by 1");
                System.out.println("The amount of worshippers got increased by 100");
                System.out.println("Your influence got increased by 1000");
                System.out.println("The amount of friends increased by 1000");
                System.out.println("You got charged:$"+100*countries.getMultiplier());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

            case 4:
                System.out.println("(4)Socialise with People:Raises the amount of friends" + "\n" +
                        "Raises the amount of worshippers" + "\n" +
                        "Raises the amount of influence" + "\n" +
                        "Raises the amount of professional associates");
                    socialisingWithFriends++;
                System.out.println("How many times you socialised with people:"+socialisingWithFriends);
                human.setWorshippers(human.getWorshippers()+10);
                human.setInfluence(human.getInfluence()+100);
                human.setFriends(human.getFriends()+10000);
                human.setProfessionalAssociates(human.getProfessionalAssociates()+1000);
                human.setOverAllwealth(human.getOverAllWealth()-50*countries.getMultiplier());
                System.out.println("The amount of worshippers got increased by 10");
                System.out.println("Your influence got increased by 1000");
                System.out.println("The amount of friends increased by 10000");
                System.out.println("Your professional Associates got increased by 1000");
                System.out.println("You got charged:$"+50*countries.getMultiplier());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 5:System.out.println("(4)Move to another country:Moving to another country may prevent you from accessing a job.Choose wisely!! ");
                SelectACountry();
                CountryDetails();
                human.setOverAllwealth(human.getOverAllWealth()-500*countries.getMultiplier());
                System.out.println("You got charged:$"+500*countries.getMultiplier());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;


        }

        System.out.println("\n" + "/--------------------------------------------------------------------------------------/");
        try {
            Thread.sleep(2000);
            System.out.println("Loading...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void updatingStateOfHuman(Jobs job,int looksA,int worshippersA,
                                     int friendsA,int professionalAssociatesA,int influenceA) {
        human.setJob(job);
        human.setIncome(job.getIncome());
        human.setOverAllwealth((human.getOverAllWealth()+job.getIncome()+wealth));
        human.setInfluence( ((human.getInfluence()+job.getInfluence()+influenceA)));
        human.setProfessionalAssociates(human.getProfessionalAssociates()+professionalAssociatesA);
        human.setFriends(human.getFriends()+friendsA);
        human.setLooks(human.getLooks()+looksA);
        human.setWorshippers(human.getWorshippers()+worshippersA);
        if(human.getFriends()>countries.getRequiredFriends()||human.getOverAllWealth()>countries.getRequireedWealth()
                && human.getInfluence()>countries.getRequiredInfluence()){
            human.setNeighborhood(countries.getRichNeighborHood());


        }else if(human.getFriends()==countries.getRequiredFriends()||human.getOverAllWealth()==countries.getRequireedWealth()
                && human.getInfluence()==countries.getRequiredInfluence()){
            human.setNeighborhood(countries.getMiddleNeighborHood());

        }else{
            human.setNeighborhood(countries.getPoorNeighborHood());
        }

    }

    public void updatingStateOfFamily(double wealthA,int influenceA){
        family.setFamilyWealth(family.getFamilyWealth()+mother.getIncome()+brother.getIncome()+sister.getIncome()+father.getIncome()+wealthA);
        family.setFamilyInfluence(family.getFamilyInfluence()+influenceA);
        if(family.getFamilyFriends()>countries.getRequiredFriends()||family.getFamilyWealth()>countries.getRequireedWealth()
                && family.getFamilyInfluence()>countries.getRequiredInfluence()){
            family.setNeighborhood(countries.getRichNeighborHood());
            human.setNeighborhood(countries.getRichNeighborHood());


        }else if(family.getFamilyFriends()==countries.getRequiredFriends()||family.getFamilyWealth()==countries.getRequireedWealth()
                && family.getFamilyInfluence()==countries.getRequiredInfluence()){
            family.setNeighborhood(countries.getMiddleNeighborHood());
            human.setNeighborhood(countries.getMiddleNeighborHood());

        }else{
            family.setNeighborhood(countries.getPoorNeighborHood());
            human.setNeighborhood(countries.getPoorNeighborHood());
        }
    }

    public void selectingAWish(int numberSelection){
       //looks=0,worshippers=0,friends=0,professionAssocites=0,influence=0

        switch (numberSelection) {
            case 1:
                //Looks
                looks=5;
                System.out.println("Your looks was increased by 5");
                break;

            case 2:
                //Worshipers
                System.out.println("You got 1000 worshippers");
                worshippers=1000;

                break;
            case 3:
                //Friends
                System.out.println("You got 1000 friends");
                friends=1000;
                break;
            case 4:
                //ProfessionalAssociates
                System.out.println("You got 1000 professional Associates");
                professionAssocites=1000;
                break;
            case 5:
                //Influence
                System.out.println("You got 1000 Influence");
                influence=1000;
                break;
            case 6:
                //Wealth
                System.out.println("You got 100000 wealth");
                wealth=100000;
                break;
            case 7:
               System.out.println("Choose a job of your liking,get the job, and permanently unlock it for life!");
                System.out.println("Very Low Paying Jobs:(0)Begger (1)Vagrant" + ("\n") +
                        "Low Paying Jobs that add greater Influence: (2)Intern"  + ("\n") +
                        "Average Paying Jobs with low Influence: (3)Packingboy (4)Firefighter (5) Banker" + ("\n") +
                        "Medium Paying Jobs with High Influence: (6)Scientist (7)Independent" + ("\n")+
                        "Highest Paying Jobs: (8)Business Owner (9)King (10)Sultan" + ("\n")+
                        "Divine Jobs: (11)God" + ("\n"));
                value = scanner.nextInt();
                while(value < 0 || value> 11 /*|| Integer.valueOf(value)*/) {
                    System.out.println("You did not put in a good command.The Genie Left");
                    chancesOfLife();
                }switch(value) {
                case 0:
                    job =Jobs.BEGGER;
                        begger=true;
                    break;
                case 1:
                    job =Jobs.VAGRANT;
                        vagrant=true;
                    break;
                case 2:
                    job =Jobs.INTERN;
                    intern=true;
                    break;
                case 3:
                    job =Jobs.PACKINGBOY;
                    packingboy=true;
                    break;
                case 4:
                    job =Jobs.FIREFIGHTER;
                    firefighter=true;
                    break;
                case 5:
                    job =Jobs.BANKTER;
                    banker=true;
                    break;
                case 6:
                    job =Jobs.SCIENTIST;
                    scientist=true;
                    break;
                case 7:
                    job =Jobs.INDEPENDENT;
                    independent=true;
                    break;
                case 8:
                    job =Jobs.BUSINESSOWNER;
                    buisnessowner=true;
                    break;
                case 9:
                    job =Jobs.KING;
                    king=true;
                    break;
                case 10:
                    job =Jobs.SULTAN;
                    sultan=true;
                    god=true;
                    break;
                case 11:
                    job =Jobs.GOD;
                    heavenBoolean=true;
                    System.out.println("You have also gained access to heaven");
                    sultan=true;
                    god=true;
                    break;

                    }
                System.out.print("\nYou are now a(n) "+job.getName()+("\n"));
                updatingStateOfHuman(job,0,0,0,0,0);
                CharDetails();
                System.out.println("\n");

                break;
            case 0:
                //Become Omega

                omega=true;
                job =Jobs.OMEGA;
                System.out.print("\nYou are now an "+job.getName()+("\n"));
                heavenBoolean=true;
                System.out.println("You have also gained access to heaven");
                updatingStateOfHuman(job,0,0,0,0,0);
                CharDetails();
                System.out.println("\n");




        }

    }

    public boolean isObjectInteger(Object o){
        //Suppose to return true if this object is an integer and false if otherwise..Does not work :(
        boolean intBool;
        //Integer integer = (Integer) o ;
        intBool = o instanceof Integer;
        return intBool;
    }
}
