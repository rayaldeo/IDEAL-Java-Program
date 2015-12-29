



/**
 * Created by jelliott on 9/16/2015.
 */

public enum Jobs {



    /*Non Paying Jobs */
    NOJOB("null",1,1),/*This is the default state for a job*/
    BEGGER("Begger",5,5),
    VAGRANT("Vagrant",10,10),

    /*Non Paying Jobs that add Influence*/
    INTERN("Intern",100,40),


    /*Average Paying/Influence Jobs with low Influence*/
    PACKINGBOY("Packaingboy",1500,400),
    FIREFIGHTER("Firefighter",3500,100),
    BANKTER("Banker",1000,500),

    /*Medium Paying Jobs with High Influence*/
    SCIENTIST("Scienctist",300,4000),
    INDEPENDENT("Independent",6000,9000),

    /*Highest Paying Jobs*/
    BUSINESSOWNER("BusinessOwner",10000,10000),
    KING("King",50000,50000),
    SULTAN("Sultan",90000,90000),


    /*Non Paying Jobs that give incredible amount of Influence*/
    GOD("GOD",0,1000000),

    /*Incredible amounts of money and Influence*/
    OMEGA("OMEGA",1000000,1000000);


    private  double income;
    private  int influence;
    private String name;

    Jobs(String nameA ,double incomeA,int influenceA) {
        this.income =incomeA;
        this.influence = influenceA;
        this.name= nameA;
    }

//Getters
    public double getIncome() {
        return income;
    }

    public int getInfluence() {
        return influence;
    }

    public String getJob(){return name;}


}



