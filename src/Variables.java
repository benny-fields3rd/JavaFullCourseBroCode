public class Variables {

        /*
         * TYPES OF VARIABLES - "**" denotes IMPORTANT
         *  data type    size        primitive/reference     value
         *  ---------    -----       -------------------     -----
         ** boolean      1 bit       primitive               true    false
         *  byte         1 bit       primitive               -128 to 127
         *  short        2 bytes     primitive               -32,768 to 32,767
         ** int          4 bytes     primitive               -2 billion to 2 billion
         *  long         8 bytes     primitive               -9 quintillion to 9 quintillion
         *
         *  float        4 bytes     primitive               fraction number up to 6-7 digits; ex 3.141592f
         ** double       8 bytes     primitive               fractional number up to 15 digits ex 3.141592653589793
         *
         ** char         2 bytes     primitive               single character/letter/ASCII value ex 'f'
         ** String       varies      reference               a sequence of characters ex "Hello world!"
         * 
	*/

    public static void main(String[] args) {

        //int x; //declaration
        //x = 123; //assignment
        int x = 123; //initialization
        long z = 1656584565686545654L;
        float y = 3.14f;
        double d = 3.14;
        boolean b = true;
        char symbol = '@';
        String message = "\"This is my first string variable!\"";

        System.out.println(x);
        System.out.println("My number is: " + x);
        System.out.println(z);
        System.out.println(y);
        System.out.println(d);
        System.out.println(b);
        System.out.println(symbol);
        System.out.println(message);

    }




}
