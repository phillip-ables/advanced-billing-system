/*

 */
package OO_Billing_S;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Parent_Billing {
    //declare data types
    public double Labour;
    public double Travel;
    public double Plastic;
    public double Copper;
    public double Chrome;
    public double iTax;
    //the next thing is the cost of each material
    public double priceLabour = 45;
    public double priceTravel = 5.0;
    public double pricePlastic = 3.5;
    public double priceCopper = 5.5;
    public double priceChrome = 7.8;
    public double costTax = 0.90;
    //create the method calculates the total cost
    public double itemCost1;
    public double itemCost2;
    public double itemCost3;
    public double itemCost4;
    public double itemCost5;


    
    public double GetAmount() {
        itemCost5 = Labour + Travel + Plastic + Copper + Chrome;
        return (itemCost5);
    }
    public double cFindTax(double cAmount) {
        double FindTax = cAmount - (cAmount * costTax);
        return (FindTax);
    }
    //exit method
    private JFrame frame;
    
    public void iExitSystem() {
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Billing System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }
}
