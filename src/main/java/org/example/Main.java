package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
import static java.lang.Math.ceil;
import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {

Scanner ClientData = new Scanner(System.in);
System.out.println("Please enter the wall height in millimeters");
int rh = ClientData.nextInt();
System.out.println("Please enter the wall width in millimeters");
int rw = ClientData.nextInt();
System.out.println("If there is a door or window on the wall, please enter its height in millimeters");
int wdh = ClientData.nextInt();
System.out.println("If there is a door or window on the wall, please enter its width in millimeters");
int wdw = ClientData.nextInt();

int rm1 = (rh/1000) * (rw/1000); // Room Square meter value
int wd1 = (wdh/1000) * (wdw/1000); // Window/Door area value
int p1 = rm1 - wd1; // Total Area to be painted value

float bt = 20.5f; //Basic Tin cost
float pt = 31.26f; //Premium Tin cost
float ft = 44.6f; //Fabulous Tin cost
float m2 = ((2.5f / 35) * p1); // Liters of paint needed to cover area

// for every 5 in m2, assign one can

double meth1 = ceil(m2) * (round(bt * 100.0) / 100.0); // Round up to nearest 2 decimal places
double meth2 = ceil(m2) * (round(pt * 100.0) / 100.0);
double meth3 = ceil(m2) * (round(ft * 100.0) / 100.0);
double meth4 = round((m2 * 100.0)/100.0); // Round to 2 decimal places

 if (rm1 > wd1) {
     System.out.println("1 Layer of paint: Cans & Cost");
     System.out.println(p1 + " " + "square meters to be painted, requiring" + " " + meth4 + " " + "liters of paint");
     System.out.println((int) Math.ceil(ceil(m2)/5) + " " + "cans of paint required");
     System.out.println("Basic paint cost =" + " " + "£" + meth1);
     System.out.println("Premium paint cost =" + " " + "£" + meth2);
     System.out.println("Fabulous paint cost =" + " " + "£" + meth3);
     System.out.println("2 Layers of paint: Cans & Cost");
     System.out.println((2*p1) + " " + "square meters to be painted, requiring" + " " + (2*meth4) + " " + "liters of paint");
     // Works to here, 'multi-paint-layer' functionality is not there yet
     System.out.println((2*(int) Math.ceil(ceil(m2)/5)) + " " + "cans of paint required");
     System.out.println("Basic paint cost =" + " " + "£" + 2 * meth1);
     System.out.println("Premium paint cost =" + " " + "£" + 2 * meth2);
     System.out.println("Fabulous paint cost =" + " " + "£" + 2 * meth3);
     System.out.println("3 Layers of paint: Cans & Cost");
     System.out.println((3*p1) + " " + "square meters to be painted, requiring" + " " + (3*meth4) + " " + "liters of paint");
     System.out.println((3*(int) Math.ceil(ceil(m2)/5)) + " " + "cans of paint required");
     System.out.println("Basic paint cost =" + " " + "£" + 3 * meth1);
     System.out.println("Premium paint cost =" + " " + "£" + 3 * meth2);
     System.out.println("Fabulous paint cost =" + " " + "£" + 3 * meth3);
 } else {
     System.out.println("Please re-enter measurements. The wall area cannot be smaller than the door/window area.");
 }

    }
}

// convert millimeters into meters
// Calculations to include measurements minus the doors & windows
// exception handling, ex if door/window area is larger than wall
// for every 5L in m2, 1 can is needed
// what if the wall has multiple windows/door combination?

/* int rh = 3200; // Room Height value
int rw = 7500; // Room Width value
int wdh = 1450; // Window/Door Height value
int wdw = 1000; // Window/Door Width value
*/




//
// SCRATCH CODE
//


/* public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // System.out.println("Hello and welcome!");
        String thanks = "Thank you,";
        String name = "miguel!";
        String order = "Your order number is #";
        int previousOrder = 715;
        System.out.println(thanks + " " + name.toUpperCase() + " " + order + previousOrder);


        /*int x = 50;
        int y = 51;
        if (x==y) {
            System.out.println("1");
        } else if (x>y) {
                 System.out.println("2");
        } else {
            System.out.println("3");
        }

         */

/*for (int d = 3; d <=31; d+=3){
String weekday = "";
switch (d % 7) {
    case 1:
        weekday = "Monday";
        break;
    case 2:
        weekday = "Tuesday";
        break;
    case 3:
        weekday = "Wednesday";
        break;
    case 4:
        weekday = "Thursday";
        break;
    case 5:
        weekday = "Friday";
        break;
    case 6:
        weekday = "Saturday";
        break;
    case 0:
        weekday = "Sunday";
        break;
}
    System.out.println("Day" + " " + d + ", " + weekday);
}

 */

