package main;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class PayInput {
    Scanner scan = new Scanner(System.in);
    static List<PayInfo> Payroll = new ArrayList<>();
    public static void main(String[] args) {
        PayInfo emp1 = new PayInfo(100,"Kingsley Henshaw","Computer Science",20000);
        PayInfo emp2 = new PayInfo(101,"Benzema Karim","Data Science",45000);
        PayInfo emp3 = new PayInfo(102,"Hazel Henshaw","Medicine",50000);
        PayInfo emp4 = new PayInfo(103,"David Okoye","Electrical Science",200000);
        Payroll = new ArrayList<>();
        Payroll.addAll(Arrays.asList(emp1,emp2,emp3,emp4));
        for (PayInfo emp: Payroll){
            System.out.println(emp);
        }

        try{
            Path epr = Paths.get("EmployeePayRoll/payroll.txt");
            String Info = Payroll.toString();
            if (Files.exists(epr)){
                Files.write(epr,Info.getBytes());
                System.out.println("Files has been written");
            }else{
                System.out.println("File Has Not Been Created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
