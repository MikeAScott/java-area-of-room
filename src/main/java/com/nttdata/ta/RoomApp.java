package com.nttdata.ta;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class RoomApp 
{
    public static void main( String[] args )
    {
        Scanner scan = null;
        try {
            scan = new Scanner(System.in);
            System.out.println( "What is the length of the room in feet?" );
            int length = scan.nextInt();
            System.out.println( "What is the width of the room in feet?" );
            int width = scan.nextInt();
            System.out.printf("You entered dimensions of %d feet by %d feet.\n",length,width);

            Calculator calc = new Calculator();
            int area_sq_ft = calc.area(length, width);
            double area_in_sq_m = calc.sqft2sqm(area_sq_ft);
            System.out.printf("The area is\n%d square feet\n%f square meters\n", area_sq_ft, area_in_sq_m);
        } finally {
            if (scan != null)
                scan.close();
        }
    }
}
