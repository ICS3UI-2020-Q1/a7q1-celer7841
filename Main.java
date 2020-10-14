import java.util.Scanner;
/**
 *
 * @author celer7841 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    examGrade(85);
    examGrade(60);
    examGrade(72);
    
  }


  public static void examGrade(int score){
    if(score < 50){
      System.out.println("F");
    }else if(score < 60){
      System.out.println("D");
    }else if(score < 70){
      System.out.println("C");
    }else if(score < 80){
      System.out.println("B");
    }else{
      System.out.println("A");
    }
  }
  

}
