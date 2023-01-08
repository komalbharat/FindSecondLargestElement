import java.util.*;
import java.util.regex.Pattern;
public class ValidUser {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.printf(" Enter the First Name \n");
        System.out.printf(" Enter the Number \n");
        System.out.printf(" Enter Pin Number \n");
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        boolean b2 = Pattern.compile("^[91][-.+]{1}[1-9]{10}$").matcher(str2).find();
        //"^(91)[-.+]{1}[1-9]{1}[0-9]{9}$"
        //^(91)[-.+]{1}[1-9]{1}[0-9]{9}$
        //^[1-9][0-9]{5}$ For PinCode
        //^[0-9]{3}[ ][0-9]{3}$
        boolean b1 = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$").matcher(str1).find();
        boolean b3 = Pattern.compile("^[1-9][0-9]{5}$").matcher(str3).find();
        if (b1 == true){
            System.out.printf("Valid "+ str1 +"\n");
        }
        else {
            System.out.printf(" Invalid Try Like ex-Avi \n");
        }
        if (b2 == true){
            System.out.printf("Phone Number is Valid \n");
        }
        else {
            System.out.printf("Phone Number is Invalid \n");
        }
        if (b3 == true){
            System.out.printf("Pin code is Valid \n");
        }
        else {
            System.out.printf("Pin code is Invalid \n");
        }
    }


    }

//* - 0 or more occurance
//? - 0 or 1 occurance
//. - any
//+ - 1 or more
//^ - starts with
//$ - ends with
//\ - represents special character
//{10} - limit ten
//{6, } - limit starts from 6 or more
//[mno] - m or n or o
//[910] - 0 or 1 or 9
//() - grouping regex patterns
//eg: ([a-z][0-9){1}