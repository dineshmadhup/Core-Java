/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clonablecomparable;



// TestCloneable.java: Use the TestCloneable interface
// to enable cloning

public class ClonableComparable {

  /** Main method */
  public static void main(String[] args) throws CloneNotSupportedException {
    House house1 = new House(1, 1750.50);
    House house2 = (House)house1.clone();
    System.out.println(house1.getWhenBuilt() == house2.getWhenBuilt());
  }
}

class House implements Cloneable, Comparable {
  private int id;
  private double area;
  private java.util.Date whenBuilt;

  public House(int id, double area) {
    this.id = id;
    this.area = area;
    whenBuilt = new java.util.Date();
  }

  public double getId() {
    return id;
  }

  public double getArea() {
    return area;
  }

  public java.util.Date getWhenBuilt() {
    return whenBuilt;
  }

  /** Override the protected clone method defined in the Object
    class, and strengthen its accessibility */
//  public Object clone() {
//    try {
//      House house = (House)super.clone();
//      house.whenBuilt = (java.util.Date)(whenBuilt.clone());
//      return house;
//    }
//    catch (CloneNotSupportedException ex) {
//      return null;
//    }
//  }
  
  public Object clone() throws CloneNotSupportedException {
      return super.clone();
  }
  

    @Override
    /** Implement the compareTo method defined in Comparable */
  public int compareTo(Object o) {
    if (area > ((House)o).area)
      return 1;
    else if (area < ((House)o).area)
      return -1;
    else
      return 0;
  }
}
