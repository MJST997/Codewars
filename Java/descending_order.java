import java.util.*;
import java.util.Collections;


public class descending_order{

    public static void main(String args[]){
        System.out.println(descending_order_calc.sortDesc(123456789));
    }
}

class descending_order_calc{
    //static int besagt das es eine int sein muss
  static int sortDesc(final int num) {
    //if number is negativ
    if (num<0) return num;
    
    //the return number
    int sortedNumber = 0; 

    //the loop through each number in descending order 
    for (int i = 9; i>= 0 ; i--){ 
        //getting a temp number which we will use is a while 
        int tempnumber = num; 

        //looping through each of the numbers in the temp number to get the single digist starting from the end
        while (tempnumber > 0){ 
            //last digit of the current temp number 
            int digit = tempnumber%10; 

            //if the digit == the current digit we search for then add that one to the sorted number by addition  but first multiplication
            if (digit == i){
                sortedNumber *= 10; 
                sortedNumber += digit; 
            }


            //end argument for the temp number 
            tempnumber /= 10;
        }

    }


    
    return sortedNumber;//Integer(String(tempArray));

  }
}


/*
Best practice solution 

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
}
*/

