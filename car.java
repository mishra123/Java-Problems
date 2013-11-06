/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise.pkg4;

/**
 *
 * @author 2012
 */
public class car {

     String model1;
     int year1;

    public void setModel(String model, int year) {
        this.model1 = model;
        this.year1=year;
    }

    public  String getModel() {
        return this.model1 +"  :  " + this.year1;
    }

   

    public static void main(String args[]) {
        car[] car1 = new car[20];
        car[] model = new car[20];
     
        for (int i = 0 ; i < 20 ; i++){
            car1[i] = new car();
      }
        car1[0].setModel("Ford", 2012);
        car1[1].setModel("abc",1989);
        car1[2].setModel("dvc", 1838);
        car1[3].setModel("Ferari",1438);
        car1[4].setModel("Maruti",2919);
        car1[5].setModel("800", 1399);
        car1[6].setModel("BMW", 1450);
        car1[7].setModel("Ford123", 3649);
        car1[8].setModel("IKON", 2123);
        car1[9].setModel("Nano", 2000);
        car1[10].setModel("Tata",1000);
        car1[11].setModel("Toyota", 1999);
        car1[12].setModel("Suzuki",2035);
        car1[13].setModel("Birla", 2010);
        car1[14].setModel("svsf", 2006);
        car1[15].setModel("Forg122", 2007);
        car1[16].setModel("Fordfb", 2011);
        car1[17].setModel("dhdd", 2010);
        car1[18].setModel("bfb", 1190);
        car1[19].setModel("fjwe", 1795);
        
        for (car car123 : car1) 
        {
            System.out.println(car123.getModel());
        }
    
       
    }
}
