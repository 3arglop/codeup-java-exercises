public class Main {

    public static void main(String[] args) {
        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);

        String myString = "This is my string value okurrrr 🤠";
        System.out.println(myString);

        //#3 IN WOULD HAVE TO CHANGE IT FROM "" TO '' IF IT HAS A CHARACTER VALUE.
        //#4 I CANNOT ASSIGN NUMBER VALUES TO A STRING VARIABLE

//        long myNumber = 123L;
        double myNumber = 3.14;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);


        String theNumberThree = "three";
//        System.out.println(theNumberThree);
        Object o = theNumberThree;
//        System.out.println(o);
//        int three = (int) o;
//        System.out.println(three);

        //CANNOT BE CAST TO CLASS, ALSO ITS A INT WITH A STRING VALUE, CANNOT PROCEED

//        int three = (int) "three";
        //NOPE, THIS IS ALSO INCORRECT BC IT'S A INT WITH A STRING VALUE


//        int x = 4;
//        x = x + 5;
//        System.out.println(x); //9

//        int x = 3;
//        int y = 4;
//        y = y * x;
//        System.out.println(y); //12

        int x = 10;
        int y = 2;
        x = x / y;
        y = y - x;
        System.out.println(y); //-3
    }
}
