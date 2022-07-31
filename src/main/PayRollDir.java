package main;
import java.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class PayRollDir {
    public static void main(String[] args) {
        try{
            Path empPay = Paths.get("EmployeePayRoll");
           if (Files.exists(empPay)) {
               System.out.println("Already Created");
           }else {
                Path directories = Files.createDirectories(empPay);
               System.out.println(directories.toString() + " Has Been Successfully Created");
           }
        }catch (Exception e){
                e.printStackTrace();
        }
    }
}
