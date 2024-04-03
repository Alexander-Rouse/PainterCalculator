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

double meth1 = m2 * round(bt * 100.0) / 100.0; //Line changed from rounding up
double meth2 = m2 * round(pt * 100.0) / 100.0; // Round up to nearest 2 decimal places
double meth3 = m2 * round(ft * 100.0) / 100.0;
double meth4 = round(m2 * 100.0)/100.0; // Round to 2 decimal places

 if (rm1 > wd1) {
     System.out.println("1 Layer of paint: Cans & Cost");
     System.out.println(p1 + " " + "square meters to be painted, requiring" + " " + meth4 + " " + "liters of paint");
     System.out.println((int) Math.ceil(ceil(m2)/5) + " " + "cans of paint required");
     System.out.println("Basic paint cost =" + " " + "£" + round(meth1 * 100.0) /100.0);
     System.out.println("Premium paint cost =" + " " + "£" + round(meth2 * 100.0) / 100.0);
     System.out.println("Fabulous paint cost =" + " " + "£" + round(meth3 * 100.0) / 100.0);
     System.out.println("2 Layers of paint: Cans & Cost");
     System.out.println((2*p1) + " " + "square meters to be painted, requiring" + " " + (2*meth4) + " " + "liters of paint");
     System.out.println((2*(int) Math.ceil(ceil(m2)/5)) + " " + "cans of paint required");
     System.out.println("Basic paint cost =" + " " + "£" + 2 * round(meth1 * 100.0) /100.0);
     System.out.println("Premium paint cost =" + " " + "£" + 2 * round(meth2 * 100.0) / 100.0);
     System.out.println("Fabulous paint cost =" + " " + "£" + 2 * round(meth3 * 100.0) / 100.0);
     System.out.println("3 Layers of paint: Cans & Cost");
     System.out.println((3*p1) + " " + "square meters to be painted, requiring" + " " + (3*meth4) + " " + "liters of paint");
     System.out.println((3*(int) Math.ceil(ceil(m2)/5)) + " " + "cans of paint required");
     System.out.println("Basic paint cost =" + " " + "£" + 3 * round(meth1 * 100.0) /100.0);
     System.out.println("Premium paint cost =" + " " + "£" + 3 * round(meth2 * 100.0) / 100.0);
     System.out.println("Fabulous paint cost =" + " " + "£" + 3 * round(meth3 * 100.0) / 100.0);

 } else {
     System.out.println("Please re-enter measurements. The wall area cannot be smaller than the door/window area.");
 }

    }
}
