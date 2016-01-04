
import java.util.ArrayList;

/**
 * Created by jelliott on 10/4/2015.
 */
public class Family {


    private ArrayList<FamilyMember> family = new ArrayList<FamilyMember>();
    private int familyInfluence,familyFriends,familyWorshippers;
    private double familyWealth;
    private  String familyName,familyFatherName,familyMotherName,familyBrotherName,familySisterName,neighborhood;
    private FamilyMember father,brother, sister,mother;
    private Countries country;


    //FamilyMemeber Constructor
    //(String firstNameA,String familyNameA,Jobs jobA,Countries countryA,int friendsA,int worshippers
    //Custom Family with a custom name
    public Family(String familyNameA,FamilyMember brotherA, FamilyMember sisterA, FamilyMember fatherA, FamilyMember motherA) {
        this.familyName = familyNameA;
        this.familyFatherName ="Mr."+familyName;
        this.familyBrotherName = "Brother "+ familyName;
        this.familyMotherName = "Mrs."+ familyName;
        this.familySisterName = "Sister "+ familyName;
        this.father =fatherA;
        this.mother = motherA;
        this.sister = sisterA;
        this.brother = brotherA;
        family.add(fatherA);
        family.add(motherA);
        family.add(sisterA);
        family.add(brotherA);
        //brotherA.getWealthDoubleValue returns a double date set of the brother's wealth
        this.familyWealth=(brotherA.getWealthDoubleValue() + sisterA.getWealthDoubleValue() + motherA.getWealthDoubleValue() + fatherA.getWealthDoubleValue());
        this.familyInfluence=(brotherA.getInfluence() + sisterA.getInfluence() + motherA.getInfluence() + fatherA.getInfluence());
        this.familyWorshippers =(brotherA.getWorshippers()+motherA.getWorshippers()+fatherA.getWorshippers()+sisterA.getWorshippers());
        this.familyFriends =(brotherA.getFriends()+motherA.getFriends()+fatherA.getFriends()+sisterA.getFriends());
        country=fatherA.getCountry();
    }

    public Family(int fatherA, int motherA, int sisterA, int brotherA) {}

    ///Getters
    //Getters
    public double getFamilyWealth() {
        return familyWealth;
    }

    public double getFamilyWealthDouble(){
        return familyWealth;
    }

    public int getFamilyInfluence() {
        return familyInfluence;
    }

    public String getFamilyName(){ return familyName;   }

    public String getFamilyCountry(){return country.getName();}

    public int getFamilyFriends(){return familyFriends;}

    public int getFamilyWorshippers(){return familyWorshippers;}

    public String getFamilyNeighborhood(){return neighborhood;}

    public void setFamilyWealth(double familyWealthA) {
        this.familyWealth = familyWealthA;
    }

    public void setFamilyInfluence(int familyInfluenceA) {
        this.familyInfluence = familyInfluenceA;
    }

    public void setFamilyName(String familyNameA){
        familyName = familyNameA;
    }

    public void setNeighborhood(String neighborhoodA){neighborhood=neighborhoodA;}


}
