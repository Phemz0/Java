import java.util.Scanner;

public class calc { 
        public static void main (String args[]) {

            int operand_1, operand_2;
            int answer = 0;

            Scanner user_input = new Scanner(System.in);

            System.out.print("Hello and welcome to the calculator \n");

            System.out.println("Please enter the first number: ");
            while (!user_input.hasNextInt()) {
                System.out.println("Input is invalid please enter an intager: ");
                user_input.next();
            }   operand_1 = user_input.nextInt();

            System.out.println("Please enter the second number: ");
            while(!user_input.hasNextInt()){
                System.out.println("Invalid input, please enter an intager");
                user_input.next();
            }   operand_2 = user_input.nextInt();

            
            System.out.print("Add | 1 \nSubtract | 2 \nMultiply | 3 \nDivide | 4\n: ");
            int menu_int = user_input.nextInt();

            switch (menu_int){
                case 1 -> {
                    answer = operand_1 + operand_2;
                }

                case 2 -> {
                    answer = operand_1 - operand_2;
                }

                case 3 -> {
                    answer = operand_1 * operand_2;
                }

                case 4 -> {
                    if (operand_2 == 0) {
                        System.out.println("Infinity");
                    } else {
                        answer = operand_1 / operand_2;
                    }
                }

                default -> System.err.println("This is not a valid input");
            }
            
            System.out.println(answer);
        }


        
}
