package a.inheritancePolymorphism;
/*Bank Account Java program using inheritance and polymorphism
I have a second part to a java program for a assignment that I dont quite get.:
her is the first part of it that I did (there are extra variables and stuff I know):*/
public class Person {
//  data fields
  public String name;
  public String socSecNum;
  public String type;
  public double balance;
  public String address;
  public double date;
  public double interest;
  private double total;
  public double days;
  public double daysa;
  public double rate;
  public double month;
  public double montha;
  public double datea;
  public double checking;
  
  
  
  
  public Person(String n, String soc, String t,
              double b, String add, double d, double in, double da, double mo,double rat, double moa,
              double daa, double daya, double check){
        
        name = n;
        socSecNum = soc;
        type = t;
        balance = b;
        address = add;
        date = d;
        interest = in;
        days = da;
        daysa = daya;
        month = mo;
        rate = rat;
        montha = moa;
        datea = daa;
        checking = check;
  }


  public Person() {
        
  
        
  }


  public void setN(String n) {
        name = n;
        }
  public void setSoc(String soc) {
        socSecNum = soc;
        }      
  public void setT(String t) {
        type = t;
        }
  public void setB(double b) {
        balance = b;
        }      
  public void setAdd(String add) {
        address = add;
        }      
  public void setD(double d) {
        date = d;
        }      
  public void setDaa(double daa){
        datea = daa;
  }
  public void setDa (double da){
        days = da;
  }
  public void setDaya (double daya){
        daysa = daya;
  }
  public void setMo (double mo){
        month = mo;
  }
  public void setRat (double rat){
        rate = rat;
  }
  public void setIntr (double intr){
        interest = intr;
  }
  public void setMoa (double moa){
        montha = moa;
  }
  public void setCheck (double check){
        checking = check;
  }
  public String getN(){
        return name;
  }
  public String getSoc(){
        return socSecNum;
  }
  public String getT(){
        return type;
  }
  public double getB(){
        return balance - checking;
  }
  public String getAdd(){
        return address;
  }
  public double getD(){
        return days + month;
  }
  public double getDaa(){
        return (montha + daysa)- (month + days) ;
  }
  public double getDa(){
        return days;
  }
  public double getDaya(){
        return daysa;
  }

  public double getMo(){
        return month;
  }
  public double getMoa(){
        return montha;
  }
  public double getCheck(){
        return checking;
  }
  public double getInterest()
  {
              return (balance * rate * datea )/365;
  }
  public double getRat(){
        return rate;
  }

  


  }




