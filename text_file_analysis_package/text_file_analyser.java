import java.io.File;
import java.util.Scanner; 

public class text_file_analyser {
    
    public static void main (String args[]) {
        int menu_option;
        boolean x;

        try (Scanner user_input = new Scanner(System.in)) {
            File file = new File("text.txt");

            System.out.println("Pick an option");
            System.out.println("Readable | 1 \nFile size in Bytes | 2 \nAbsolute File Path | 3 ");
            while(!user_input.hasNextInt()){
                System.out.println("Input is invalid, please enter an intager: ");
                user_input.next();
            } menu_option = user_input.nextInt();

            switch (menu_option){
                case 1 -> {
                    if(file.exists()){ // Make better 
                        System.out.println("Readable " + file.canRead());
                    }
                } case 2 -> {
                    if (file.exists()){
                        System.out.println("Size in Bytes: " + file.length());
                    }
                } case 3 -> {
                    if (file.exists()){
                        System.out.println("Abosolute file path: " + file.getAbsolutePath());
                    }
                }
            }
        }
    }
}
