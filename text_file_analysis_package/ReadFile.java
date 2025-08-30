package text_file_analysis_package;

import java.awt.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {
    private String path;

    public ReadFile (String file_path){
        path = file_path;
    }

    public String[] OpenFile() throws IOException{
        int number_of_lines = 31;

        FileReader fr = new FileReader (path);
        BufferedReader textReader = new BufferedReader(fr);

        String[] text_data = new String[number_of_lines];

        for(int i = 0; i < number_of_lines; i++){
            text_data[i] = textReader.readLine();
        }
        textReader.close();
        return text_data;
    }

    int read_lines() throws IOException{
        int number_of_lines = 0;
        String a_line;

        FileReader file_to_read = new FileReader(path);
        BufferedReader bf = new BufferedReader(file_to_read);

        while((a_line = bf.readLine()) != null){
            number_of_lines++;
        }   bf.close();

        return number_of_lines;
    }

}
