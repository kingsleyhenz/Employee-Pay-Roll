package main;
import java.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PayFile {
    public static void main(String[] args) {
        try {
            Path roll = Paths.get("EmployeePayRoll/payroll.txt");
            if (Files.exists(roll)){
                System.out.println("Already Exists");
            }else{
                Path file = Files.createFile(roll);
                System.out.println(file.toString() + " Has Been Successfully Created");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
