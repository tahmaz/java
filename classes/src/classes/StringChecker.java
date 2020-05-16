package classes;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2008</p>
 *
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 */
public class StringChecker {
    public static void main (String[] arguments){
        String str="Nobody ever went broke by bying IBM";
        System.out.println("The string is: "+str);
        System.out.println("Leng of this string: "+str.length());
        System.out.println("The character at position 5: "+str.charAt(5));
        System.out.println("Teh substring from 26 to 32: " +str.subSequence(26,32));
        System.out.println("The index of the character v: "+str.indexOf('v'));
        System.out.println("The index of beginning of the "+"substring\"IBM\":" +str.indexOf("IBM"));
        System.out.println("The string in upper case: "+str.toUpperCase());


    }
}
