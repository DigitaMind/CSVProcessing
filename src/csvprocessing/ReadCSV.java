/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvprocessing;

/**
 *
 * @author Digital-Mind
 */
import com.opencsv.CSVReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReadCSV {
    private static int valid, invalid;

    public static void main(String[] args){

        String fileName = "src/record.csv";

        try {
            FileInputStream fis = new FileInputStream(fileName);
            
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            /*Read the file with a CSV file reader */
            CSVReader reader = new CSVReader(isr);
            String[] nextLine;
            RecordModel model;
            while ((nextLine = reader.readNext()) != null) {                
                if (nextLine.length != 4) {
                    invalid++;
                    continue;
                }
                model = new RecordModel(nextLine);                
                if (model.isValid()) {
                    valid++;
                    //System.out.printf("%s \t %d \t %s \t %s \n", model.getName(), model.getAge(), model.getGender(), model.getState());
                } else {
                    invalid++;
                    //System.out.println("Invalid");
                }
            }
        } catch (IOException e) {
            System.out.println("Sorry, "+e.toString());
        }
        System.out.printf("\n%d %s valid\n",valid, valid>1? "are":"is");
        System.out.printf("\n%d %s invalid\n",invalid, invalid>1? "are":"is");
        
    }
}
