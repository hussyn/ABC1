package a.inheritancePolymorphism;

//TEST CLASS:
import javax.swing.JOptionPane;
//import java.swing.Scanner;
import java.util.Scanner;

public class customer {

  public static void main(String[] args)
  {
              String namei;
              String soci;
              String typei;
              String input;
              double inputi;
              String inputii;
              String addressi;
              String daysi;
              String daysa;
              double interesti;
              String monthi;
              double inter;
              int test;
              int testi;
              String monthb;
              char repeat;
              
                    
              
              Person cus = new Person();
        
              {
                    
              namei =
                    JOptionPane.showInputDialog("What is" +
                                                              "the customers name?");
              cus.setN(namei);
        
        soci =
              JOptionPane.showInputDialog("What is the customers"+
                                                                                "social security number?");
        cus.setSoc(soci);
        double typeii;
        typei =
              JOptionPane.showInputDialog("What type of account is it, 1 for checking 2 for savings?");
        typeii = Double.parseDouble(typei);
        
        if (typeii == 1)
              cus.setCheck (-6);
        inputii =
              JOptionPane.showInputDialog("How old is the customer?");
        cus.nowBday(Integer.parseInt(inputii));
        input = 
              JOptionPane.showInputDialog("What is the balance of the customer?");
        cus.setB(Integer.parseInt(input));
  if (input > 4999 && inputi > 54)
        cus.setCheck (0);
        cus.setRat(++.01);
        addressi = 
              JOptionPane.showInputDialog("What is the address of the customer?");
        cus.setAdd(addressi);
        monthi = JOptionPane.showInputDialog("What is the Month?");
        cus.setD (Integer.parseInt(monthi));
        test = Integer.parseInt(monthi);
        switch (test)
        {

        case 1:
        cus.setRat(.06);
        break;

        case 2:
        cus.month = 31;
        cus.setRat(.06);
        break;

        case 3:
        cus.month = 59;
        cus.setRat(.06);
        break;

        case 4:
        cus.month = 90;
        cus.setRat(.05);
        break;

        case 5:
        cus.month = 120;
        cus.setRat(.05);
        break;

        case 6:
        cus.month = 151;
        cus.setRat(.05);
        break;

        case 7:
        cus.month = 181;
        cus.setRat(.04);
        break;

        case 8:
        cus.month = 212;
        cus.setRat(.04);
        break;

        case 9:
        cus.month = 243;
        cus.setRat(.04);
        break;

        case 10:
        cus.month = 273;
        cus.setRat(.03);
        break;

        case 11:
        cus.month = 304;
        cus.setRat(.03);
        break;

        case 12:
        cus.month = 334;
        cus.setRat(.03);
        break;
        }
        daysi =
              JOptionPane.showInputDialog("What is the day of the month?");
        double da = Double.parseDouble(daysi);
        
        monthb = JOptionPane.showInputDialog("What is the Month now?");
        cus.setDaa (Integer.parseInt(monthb));
        testi = Integer.parseInt(monthb);
        switch (testi)
        {

        case 1:
        cus.montha = 0;
        break;

        case 2:
        cus.montha = 31;
        
        break;

        case 3:
        cus.montha = 59;
  
        break;

        case 4:
        cus.montha = 90;
  
        break;

        case 5:
        cus.montha = 120;
  
        break;

        case 6:
        cus.montha = 151;
  
        break;

        case 7:
        cus.montha = 181;
        
        break;

        case 8:
        cus.montha = 212;
        
        break;

        case 9:
        cus.montha = 243;
  
        break;

        case 10:
        cus.montha = 273;
        
        break;

        case 11:
        cus.montha = 304;
        
        break;

        case 12:
        cus.montha = 334;
        break;
              
        default:
        JOptionPane.showInputDialog("You did not enter a valid number");
        
        break;
        }
        daysa =
              JOptionPane.showInputDialog("What is the day of the month now?");
        double daya = Double.parseDouble(daysa);
        interesti = (int)cus.getInterest();
        
        JOptionPane.showMessageDialog(null, "Name: " + namei +
                    "\nsocial security #:" + soci + "\ntype:" + typei + "\nbalance:" +
                    input + "\naddress:" + addressi + "\ndate:" + daysi + "\ninteterst:" + interesti);
        System.out.println("Would you like to calculate another customers interest?");
        System.out.println("Enter Y for yes or N for no:");
        input = keyboard.nextLine();
        repeat = input.charAt(0);
  
        }while (repeat == 'y' || repeat == 'Y');
        
              }
  }


//Now I have to have a bank account for senior citizens.  To qualify for this senior citizen free checking account you must be 55 years or older and have a balance of 5000 or over.  As you can see I have started to impliment my third class in the test class.  Balically I need a third class that extends the other class for the senior citizens acconts who get no charge for thier checkbook and a increase of 1% in interest.  can somone help me implement this using inheritance and polymorphism?  I really need help with this have been fooling with it all weekend.
