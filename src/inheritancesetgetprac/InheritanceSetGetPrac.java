package inheritancesetgetprac;

import java.util.Scanner;
//main class
public class InheritanceSetGetPrac {


   public static void main(String[] args) throws Exception {

      Scanner in = new Scanner(System.in);
      NewClassPractice method = new NewClassPractice();
      NewClassPractice2 method2 = new NewClassPractice2(method);
      method.setBalance(5000.0);
      double withdraw = 0.0;
      double deposit = 0.0;
      String choice = "";
      String loop = "Y";

      do {
         method.transactionList();
         loop = method2.mainTransac(choice, withdraw, deposit, in, loop, method);
         if (loop.equals("Y")) {
            System.out.print("\nDo you want to do another transaction?: ");
            loop = in.next();
         }
      } while(loop.equals("Y"));

   }
}