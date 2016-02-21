public class Chapter2 {

    public static void main(String[] args) {
        Chapter2 demo = new Chapter2();
        //   demo.operators();
        demo.statements();
    }


    //operators
    public void operators() {
        int x, y, a, b;
        x = 1;
        //Post-unary operators 	expression++
        int yPost = x++;
        System.out.println("Expression++ --> " + "X:" + x + " | Y:" + yPost);

        x = 1;
        /*Pre-unary operators 	++ expression*/
        int yPre = ++x;
        System.out.println("++Expression--> " + "X:" + x + " | Y:" + yPre);

        //!
        System.out.println(!false);

        x = 1;
        // !=
        System.out.println(x++ != ++x);

        x = 1;
        //==
        System.out.println(x++ == ++x);
        x = 1;

        System.out.println("& Bitwise AND");
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & false);
        /* A or B, but not, A and B
            Input 	            Output
            A   ^    B
            F   ^    F 	        F
            F   ^    T 	        T
            T   ^    F 	        T
            T   ^    T 	        F
         */
        System.out.println("^ Bitwise exclusive OR 'XOR'");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);
        /* A or B
            Input 	            Output
            A   |    B
            F   |    F 	        F
            F   |    T 	        T
            T   |    F 	        T
            T   |    T 	        T
         */
        System.out.println("| Bitwise inclusive OR");
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | false);

        //Short-circuit logical operators
        //Don't evaluate right hand side if result is known

        // &&
        System.out.println("|| short circuit inclusive OR");
        System.out.println(true || true);//No need to go the second condition
        System.out.println(false || true);// Go to second condition

        //||
        System.out.println("|| short circuit inclusive AND");
        System.out.println(true && true);// Go to second condition
        System.out.println(false && true);// no need to go to the second condition

        //Ternary operators ?
        int max1, maxTr;
        a = 1;
        b = 5;
        if (a > b) {
            max1 = a;
        } else {
            max1 = b;
        }
        System.out.println(max1);

        maxTr = (a > b) ? a : b;

        System.out.println(maxTr);

        //Assignment operators 	= , +=
        x = 2;
        y = 10;
        x *= y; //     -->   x=x*y;
        System.out.println("*= --> " + "X:" + x + " | Y:" + y);
    }

    //statements
    public void statements() {
        //if-then-else!
        int hourOfDay = 11;
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }
        /*
        * int t=1;
        * if(t){....} ?
        *
        * also watch out for {}
       * */

        //Switch
        int dayOfWeek = 5;
        switch (dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

        /*
        * Watch for the break!
        * When evaluating switch statements on the exam, always consider that
        * multiple branches may be visited in a single execution
        *Data type for case statements must all match the data type of the switch variable
        * */
        String firstName = "John";
        switch (firstName) {
            case "John":
                System.out.println("John Smith");
                break;
            case "":        //case 0
                System.out.println("DOES NOT COMPILE");
                break;
        }

        //While
        int hunger = 5;
        while (hunger > 0) {
            System.out.println("Still hungry| Value of hunger= " + hunger);
            hunger--;
        }

        //do while
        hunger = 5;
        do {
            System.out.println("Still hungry| Value of hunger= " + hunger);
            hunger--;
        } while (hunger > 0);


        //For--> for(initialization;condition; updateStatement)
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ");
        }
       /*
            for( ; ; ) {
            System.out.println("Hello World");}
        */

        //for-each for(datatype variable : collection)

        String[] meals = new String[3];
        meals[0] = "Breakfast";
        meals[1] = "Lunch";
        meals[2] = "Dinner";
        for (String meal : meals) {
            System.out.print(meal+" ");
        }


    }
}
