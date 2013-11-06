/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise.pkg4;

/**
 *
 * @author 2012
 */
public class Excercise4 
{
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String [] str;
        // TODO code application logic here
         String st=new String("Carnegie-Mellon University");
         String st1=new String("Carnegie Mellon University");
            //String st="carnegie mellon university";
        System.out.println("String is " + st);
        /**
         * length() method is used to check the length of the string including spaces
         */
        System.out.println("Length of the string is: " + st.length());
        /**
         * charAt(int n) is used to find the value of the character at position n
         */
        System.out.println(st.charAt(5));
        /**
         * substring(int a, int b) is used to get the substring starting from a position to b position b.
         */
        System.out.println(st.substring(2,7));
        /**
         * startsWith(String s) is used to tell the user whether the string starts from this or not
         * It returns true if yea otherwise false.
         */
      System.out.println(st.startsWith("Mello"));
        System.out.println(st.endsWith("versity"));
        System.out.println(st.indexOf("e",5));
        System.out.println(st.concat(" ranked no 1"));
        System.out.println(st.toUpperCase());
        System.out.println(st.toLowerCase());
        System.out.println(st.replace("University" , "School"));
    System.out.println(st.equals(st1));
      String delim="-";
       str=st.split(delim);
      
    }
}
