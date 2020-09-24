package edu.itstudy.JAVA07.extendss.Practice;

public class Account {

    private String id;
    private double balance;
    private double rate;

    public Account(){

    }



    public Account(String id,double balance,double rate){
        this.id = id;
        this.balance = balance;
        this.rate = rate;
    }

    public double getMonthlyInterest(){
        return  rate/12;
    }

    public double deposit(double money){
        balance += money;
        System.out.println("账号"+id+"本次存款"+money+"当前余额为"+balance);
        return balance;
    }

    public double withdraw(double money){
        if(money > balance)
        {
            System.out.println("账户余额不足-----");
            return balance;
        }
            balance -= money;
            System.out.println("账号" + id + "本次取款" + money + "当前余额为" + balance);
        return  0;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
