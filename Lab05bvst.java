// Lab05bvst.java
// Open-Ended "Writing Classes Assignment
// This is the student starting Version of the Lab05b assignment.

public class Lab05bvst {
    public static void main(String[] args) {
        System.out.print("\nEnter the First Letter of Your Name----> ");
        String letter = Keyboard.getString();
        System.out.print("\nEnter the First Number to Your Age --> ");
        int Age = Keyboard.getInt();
        System.out.print("\nEnter First Digit to the Month of your Birthday --> ");
        int month = Keyboard.getInt();
        System.out.print("\nEnter First Digit to the Day of your Birthday--> ");
        int day = Keyboard.getInt();
        System.out.print("\nEnter First Digit to the Year of your Birthday--> ");
        int year = Keyboard.getInt();
        Rational r = new Rational();
        r.displayData();
    }
}

class Rational {

    public Rational() {
      
    }

    public void displayData() {
        System.out.println();
        System.out.flush();
    
    }

}


