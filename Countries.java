/**
 * Created by jelliott on 9/25/2015.
 */
public enum Countries {

    /*Countries with the lowest taxes*/
    Irada("Irada",1,1,1,"poor","middle","rich",1,1,1),

    Itican("Itican",1,1,1,"poor","middle","rich",10,10,10),

    /*Countries with average taxes*/
    Albaq("Albaq",300,10.5,5000000,"poor","middle","rich",100,100,100),

    Trinentina("Trinentina",300,10.5,5000000,"poor","middle","rich",300,300,300),

    /*Countries with high taxes*/
    Albico("Albico",1000,30.5,999999,"poor","middle","rich",500,500,500),

    Ugeria("Ugeria",1000,30.5,999999,"poor","middle","rich",1000,2000,3000),

    Portada("Portada",1000,30.5,999999,"poor","middle","rich",10000,10000,10000),

    /*Places not for poor people*/
    Kuwador("Kuwador",10000,1000.5,999999,"poor","middle","rich",40000,40000,40000),

    Ukrark("Ukrark",15000,3000.5,999999,"poor","middle","rich",60000,60000,60000),

    Rany("Rany",15000,5000.5,999999,"poor","middle","rich",150000,150000,150000),

    /*The Holy Places*/
    Heaven("Heaven",0,0,999999,"poor","middle","rich",999999,999999,999999);

    private  int requiredFriends,requiredConnections;
    private double multiplier,taxes,income,requireedWealth;
    private String name,poorNeighborHood, middleNeighborHood,richNeighborHood;

    Countries(){
        this.taxes =0.0;
        this.multiplier =0.0;
        this.income=0.0;
    }
    Countries(String nameA,double taxesA,double multiplierA,double incomeA,String poorNeighborHoodA,
              String middleNeighborHoodB,String richNeighborHoodC,double requiredWealthA,
              int requiredFriendsA,int requiredConnectionsA){
        this.name= nameA;
        this.taxes =taxesA;
        this.multiplier =multiplierA;
        this.income=incomeA;
        this.poorNeighborHood = poorNeighborHoodA;
        this.middleNeighborHood= middleNeighborHoodB;
        this.richNeighborHood= richNeighborHoodC;
        this.requireedWealth=requiredWealthA;
        this.requiredFriends=requiredFriendsA;
        this.requiredConnections=requiredConnectionsA;
    }

    //Getters
    public double getTaxes(){return taxes;}

    public double getMultiplier(){return multiplier;}

    public double getIncome(){return income;}

    public String getName(){return name;}

    public String getPoorNeighborHood(){return poorNeighborHood;}

    public String getMiddleNeighborHood(){return middleNeighborHood;}

    public String getRichNeighborHood(){return richNeighborHood;}

    public int getRequiredInfluence() {
        return requiredConnections;
    }

    public int getRequiredFriends() {
        return requiredFriends;
    }

    public double getRequireedWealth() {
        return requireedWealth;
    }

    //Setters
    public void setTaxes(double taxesA){ taxes= taxesA;}

    public void setMultiplier(double multiplierA){multiplier= multiplierA;}

    public void setIncome(double incomeA){income= incomeA;}

    public void setName(String nameA) { this.name = name;}

    public void setRequiredInfluence(int requiredConnections) {
        this.requiredConnections = requiredConnections;
    }

    public void setRequiredFriends(int requiredFriends) {
        this.requiredFriends = requiredFriends;
    }

    public void setRequireedWealth(double requiredWealth) {
        this.requireedWealth = requiredWealth;
    }
}
