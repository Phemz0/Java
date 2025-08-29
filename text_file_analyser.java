import java.io.File;
import java.util.Scanner; 

public class text_file_analyser {
    
    public static void main (String args[]) {
        int menu_option;
        boolean x;

        Scanner user_input = new Scanner(System.in);
        File file = new File("text.txt");

        System.out.println("Readable | 1 \n File size in Bytes | 2 \n Absolute File Path");

        System.out.println("Pick an option");
        menu_option = user_input.nextInt();

        switch (menu_option){
            case 1 -> {
                if(file.exists()){ // Make better 
                    System.out.println("Readable " + file.canRead());
                }

            } case 2 -> {
                

            }
    
    
    
        }

        


            System.out.println("Size in bytes:" + i.length());
            System.out.println("Absolute file path: " + i.getPath());
        

    

    }
}
