package tasker;

import java.util.*;
import java.io.*;

public class LargestInt {
    public static void main(String[] args) {
        int[] i = new int[]{1,2,4};
        System.out.println("the largest int is "+Arrays.stream(i).max().getAsInt());
        Properties BankingApp = new Properties();
        if(BankingApp.stringPropertyNames().isEmpty())
        {   BankingApp.setProperty("1","4562");
            BankingApp.setProperty("2","45645");
            System.out.println("added a default accounts");
        }
        System.out.println(BankingApp.getProperty("1"));
        savePropertiesToFile(BankingApp,"config.bankingapp");
    }
    private static void savePropertiesToFile(Properties properties, String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName)) {
            // Save properties to a file
            properties.store(fileOut, "Application Configuration");
            System.out.println("Properties saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
