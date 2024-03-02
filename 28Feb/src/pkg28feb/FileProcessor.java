/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg28feb;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author ahmed
 */
public class FileProcessor {
    // method that reads a test file and may throw an exception(filenotfound, not readable, etc)
    public static void readfile(String filepath)throws IOException{
        // try with ressources to automatically close the reader
        try(BufferedReader br = new BufferedReader(new FileReader(filepath))){
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
    }
        }
    }
                public static void main(String[] args) throws IOException {
                    try{
String filepath = "C://Users//ahmed//OneDrive//Desktop//ahmed.txt";
                        readfile(filepath);
                    }catch(IOException e)
                    {System.out.println("error reading the file "+e.getMessage());}
                    
                    //code to process a file
                    /*
                    FileProcessor fileProcessor = new FileProcessor();
                    if(FilePath.equals("invalid path")){
                        throw new IOException("invalid file path");
                    }
                    //code continue if the file processing is successful
                    System.out.println("file processed successfully"); */
                }
}
