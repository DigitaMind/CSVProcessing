/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvprocessing;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Digital-Mind
 */
public class ReadCSVFile2 {
    BufferedReader br;
    FileReader fr;
    public ReadCSVFile2(){}
    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
        
        new ReadCSVFile2().readCSV("src/record.csv");
        
        // TODO code application logic here
    }
    
    public void readCSV(String filepath){
        try {
            fr = new FileReader(filepath);
            br = new BufferedReader(fr);
            String nextLine;
            String [] items;
            //RecordModel model;
            while((nextLine = br.readLine()) != null){
                items = nextLine.split(",");
                System.out.printf("\n%s \t %s \t %s \t %s\n", items[0], items[1], items[2], items[3]);
            }
        } catch (IOException ex) {
            System.out.println("Sorry, "+ex.toString());
        }
        
        
    } 


    
}
