import java.util.Scanner;

public class challenge363{

  public static boolean check(String s){
    int eiIndex = s.indexOf("ei");
    int ieIndex = s.indexOf("ie");
    if(eiIndex > 0 && s.charAt(eiIndex - 1) != 'c')
      return false;
    if(ieIndex > 0 && s.charAt(ieIndex - 1) == 'c')
      return false;
    return true;
  }

  public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Insert a word: ");
    String s = in.nextLine();
    if (s.length()>0)
      System.out.println("check(" + s + ") => " + check(s.toLowerCase()));
  }
}
