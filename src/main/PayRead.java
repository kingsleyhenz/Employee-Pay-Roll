package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PayRead {
    public static void main(String[] args) {
            try {
                Path epr = Paths.get("EmployeePayRoll/payroll.txt");
                if (!Files.exists(epr)) {
                    System.out.println("File Not Found");
                } else {
                    List<String> strings = Files.readAllLines(epr);
                    for (int i = 0; i < strings.size(); i++) {
                        String s = strings.get(i);
                    }
                    Object[] roll = strings.toArray();
                    for (int i=0;i<roll.length;i++){
                        Object element = roll[i];
                        String s = element.toString();
                        String[] split = s.split(", PayInfo");
                        System.out.println(split[0] +"\n"+split[1]+"\n"+split[2]+"\n"+split[3]);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
