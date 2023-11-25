package tasker.banking.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
    private int id;
    private int pin;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pin=" + pin +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", email='" + email + '\'' +
                '}';
    }

    private String name;

    public int getPin() {
        return pin;
    }

    public Account(int id, int pin, String name, float balance, String email) {
        this.id = id;
        this.pin = pin;
        this.name = name;
        this.balance = balance;
        this.email = email;
    }
    public static Account getActiveAccount(List<Account> accounts, int id, int pin){
        Account activeAccount = null;
        for(Account account:accounts){
            if((id ==account.getId())
                    && (pin == account.getPin()) ){
                activeAccount = account;
            }
        }
        return activeAccount;
    }

    public int getId() {
        return id;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        List<Account> dbo =new ArrayList<>();
        dbo.add(new Account(1112,4692,"Marc Yim",1000,"marcyim@starmagic.cc"));
        dbo.add(new Account(9637,1230,"Eric Lopez",1004060,"eric@starmagic.cc"));
        Scanner input1 = new Scanner(System.in);
        int o,p;
        System.out.println("Enter ID:");
        o = input1.nextInt();
        System.out.println("Enter Pin:");
        p = input1.nextInt();
        System.out.println(getActiveAccount(dbo,o,p).toString());
    }

    private float balance;
    private String email;
}
