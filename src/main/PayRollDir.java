package main;
import java.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class PayRollDir {
    public static void main(String[] args) throws IOException {
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

        Path java = Paths.get("java");
        Path directories = Files.createDirectories(java);
    }

}
