import java.util.Scanner;

public class Registration {
    public static void main(String [] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("""
                Hello my people,
                Enter:
                1-> register
                2 -> login
                3 -> logout
                """);
        int userInput = Scanner.nextInt();
        switch (userInput){

            case 1:
                System.out.println("enter full name" );
                Scanner.next();
                System.out.println("create password");
                String password = Scanner.next();


                System.out.println("account creation successful");
               Scanner.next();
               // System.out.println();
               // switch (password) {
                  //  case "create password":
                     //   System.out.println("correct");
                     //   break;
                   // case "wrong password":
                     //   System.out.println("incorrect ");
                 //   break;
                //    default:
             //   }

            case 2: {
                System.out.println("Enter your name");
                Scanner.next();
                System.out.println("Enter your password");
                Scanner.next();
                System.out.println("logged in");
                Scanner.next();
                System.out.println("\n". repeat(5));
                Scanner.next();
               // System.out.println("logged in");
               // Scanner.next();
            }
            case 3:{
                System.out.println("enter password");
                Scanner.next();
                System.out.println("save loggin details");
                Scanner.next();
                System.out.println("saved");
                Scanner.next();
            }
        }
    }
}
