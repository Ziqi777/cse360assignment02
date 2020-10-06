/**
 * @ CSE360 Assignment 1, implemented file
 * @author Ziqi Gong
 * @version 2.0
 */
package cse360assignment02;

public class AddingMachine {
  private int total;
  private String totalString = "0";
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  totalString+=" + "+value;
	  total+=value;
  }

  public void subtract (int value) {
	  totalString+=" - "+value;
	  total-=value;
	  
  }

  public String toString () {
    return totalString;
  }

  public void clear() {
	  total = 0;
	  totalString = "0";
  }
}