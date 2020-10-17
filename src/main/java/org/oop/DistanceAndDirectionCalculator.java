package org.oop;

import java.sql.SQLOutput;

public class DistanceAndDirectionCalculator
{
    public static void main(String args[])
    {
        Point from=new Point(5,6);
        Point to=new Point(1,9);
        System.out.println(from.direction(to));
        System.out.println(from.distance(to));
    }
}
