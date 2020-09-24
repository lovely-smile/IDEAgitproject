package edu.itstudy.JAVA07.extendss.Practice;

public class Test {

    public static void main(String[] args) {
        checkAccount();

    }

    public static  void checkAccount(){

        CheckAccount ca = new CheckAccount(10000,"622848778899",20000,0.045);

        double  d2 = ca.withdraw(23000) ;
    }


    public static void account(){
        Account account = new Account("6228666666666",20000,0.045);

        double balance = account.withdraw(160);
        System.out.println("账户余额"+balance);

        double balance2 = account.deposit(3000);
        System.out.println("账户余额"+balance2);
    }
}
