/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package product;

/**
 *
 * @author PLANET
 */
//Product class
public class Product {
    
    private String code;
    private String description;
    private double price;
    protected static int count = 0;
    
    public Product() { }
    public void setCode(String code)
    {
        this.code = code;
    }
    
    public String getCode()
    {
        return code;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
    public double getPrice()
    {
        return price;
    }
    @Override
    public String toString()
    {
        return "Code: " + code + "\n" + "Description: " + description + "\n"
                + "price: " + price + "\n";
    }
    public static int getCount()
    {
        return count;
    }
}
//Book class
class Book extends Product
{
    private String author;
    public Book()
    {
        super();
        author = "";
        count++;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public String getAuthor()
    {
        return author;
    }
//    @Override
//    public String toString()
//    {
//        return super.toString()
//                + "Author: " + author + "\n";
//        
//    }
}


    

   
    
    
  
