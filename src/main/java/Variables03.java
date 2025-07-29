public class Variables03 {
    public static void main(String[] args) {
        /*
                Primitive Data Types:
                    - Created by Java itself, not us.
                    - Use small letters (int, char, etc.)
                    - Memory consumption depends on the data type we use.

                    https://www.w3schools.com/java/java_data_types.asp
         */

        //Example 1: Create a variable for the site population and assign it the value 1200.
        short sitePopulation = 1200;
        System.out.println(sitePopulation);

        // Error example
        // byte value = 200;


        // Long: -9,223,372,036,854,775,808 - 9,223,372,036,854,775,807
        // Use L at the end of the value to define a Long data type.
        /*
                Java treats values as int when possible to save up memory.
                You have to use L at the end of the value to force it to use it as a Long value.
         */

        //int val = 1236742;
        //long val = 1236742;
        long val = 1236742L;

        // Example: Create two long variables and print their sums to the console with a label
        // Result: ...
        long a = 2589631789L;
        long b = 456123789L;
        System.out.println(a);
        System.out.println(b);
        System.out.println("Results:" +a + b);
        System.out.println("Results:" + (a + b));


        // Float
        // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        // 2.85, 3.42
        // Floats require you to put f at the end to indicate that they are indeed a float value
        float item1 = 2.85f;
        float item2 = 3.42f;

        System.out.println("Sum: "+(item1+item2));


        // Double
        // 8 bytes (64 bits)
        double cellWeight = 0.00000000000028;
        System.out.println(cellWeight);


        // Char
        /*
                2 bytes (16 bits)
                Only here for a single character
                Written within the single quotes (')
         */
        char firstLetterOfTheName = 'J';
        System.out.println(firstLetterOfTheName);


        // Boolean
        // True / False
        boolean isActive = true;
        System.out.println(isActive);

        // CTRL + D
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        boolean b4 = false;

        System.out.println("---------------------");
        System.out.println(b1 && b2); // true AND true => TRUE
        System.out.println(b3 && b4); // false AND false => FALSE
        System.out.println(b2 && b3); // true AND false => FALSE
        System.out.println("---------------------");
        System.out.println(b1 || b2); // true OR true => TRUE
        System.out.println(b3 || b4); // false OR false => FALSE
        System.out.println(b2 || b3); // true OR false => TRUE



        // Non-Primitive

        // String
        String cityName = "San Francisco";
        System.out.println(cityName);

    }



}



