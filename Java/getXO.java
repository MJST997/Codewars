public class getXO {

    public static void main(String argv[]){
        System.out.println(XO.getXO_algo("xXXXOXoooxOOXOXKXUXOOooAX0XxXZXxVXSX0BHxxxXoxGxx0XXooXG4"));
        //X = 46 O= 
    }
}

class XO{
    static boolean getXO_algo (String str) {
        
        // Good Luck!!
        long count_x = str.chars().filter(ch-> ch == 'x').count(); 
        long count_o = str.chars().filter(ch-> ch == 'o').count();
        long count_X = str.chars().filter(ch-> ch == 'X').count();
        long count_O = str.chars().filter(ch-> ch == 'O').count();
    
        long counts_x = count_x + count_X; 
        long counts_o = count_o + count_O; 
    
        if (counts_x == counts_o){
        return true;
        };
        return false;
    }
}


/*
Best practice 
public class XO {
  public static boolean getXO(String str) {
    int x = 0, o = 0;
    for(int i = 0; i < str.length(); i++){
      if(str.toUpperCase().charAt(i) == 'O') o++;
      if(str.toUpperCase().charAt(i) == 'X') x++;
    }
    return x == o;
  }
}
 */