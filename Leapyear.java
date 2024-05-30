//This program checks if a year is a leap year or not

public class Leapyear {
    public static void main(String args[])
    {
        int year = 2020;

        if(year%4==0 && year%100!=0)
        {
            System.out.println("Leap year");
        }
        else if(year%400==0)
        {
            System.out.println("Leap year");
        }
        else
        System.out.println("Not a Leap year");
    }
}