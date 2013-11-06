/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2012
 */
public class GeometricObject 
{
    String color="white";
    boolean filled=false;
    private java.util.Date dateCreated;
    public GeometricObject()
    {
        dateCreated=new java.util.Date();
    }
    public void GeometricObject(String Color, boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public boolean getFilled()
    {
        return filled;
    }
    public void setFilled(boolean filled)
    {
        this.filled=filled;
    }
    public java.util.Date getDate()
    {
        return dateCreated;
    }
    public String toString()
    {
        return "This object is created on " + getDate() + "\nColor is: " + getColor() + " \n and filled is : "
                + getFilled();
    }
}

class circle extends GeometricObject
{
    private double radius;
    public circle(double radius)
    {
        this.radius=radius;
        setColor("red");
        setFilled(true);
    }
    /*public String toString()
    {
        return "Color : "+ getColor() + " \nFilled: " + getFilled();
    }*/
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getArea()
    {
        return radius*radius*3.14;
    }
    public double getDiameter()
    {
        return 2*radius;
    }
    public double getPerimeter()
    {
        return 2*3.14*radius;
    }
}
    
class Rectangle extends GeometricObject
{
    private double width;
    private double height;
    public Rectangle(double width, double height)
    {
        this.width=width;
        this.height=height;
        setColor("Blue");
       setFilled(false);
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
   public double getHeight()
    {
        return height;
    }
    public void setHeight(double height)
    {
        this.height=height;
    }
    public double getArea()
    {
        return width*height;
    }
    public double getPerimeter()
    {
        return 2*(width+height);
    }
}
class test 
{
    public static void main(String args[])
    {
        circle c=new circle(5);
        System.out.println(c.toString());
      
       System.out.println(c.getArea());
       System.out.println(c.getPerimeter());
       System.out.println(c.getDiameter());
       Rectangle r=new Rectangle(4,5);
       System.out.println(r.toString());
       System.out.println(r.getArea());
       System.out.println(r.getPerimeter());
       System.out.println(r.getHeight());
                
    }
}
