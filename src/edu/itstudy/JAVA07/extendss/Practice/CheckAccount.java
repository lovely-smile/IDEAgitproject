package edu.itstudy.JAVA07.extendss.Practice;

public class CheckAccount extends Account{

     private double overdraft;

     public CheckAccount(){

     }

     public CheckAccount(double overdraft,String id,double balance,double rate){
          super(id,balance,rate);
          this.overdraft = overdraft;
     }

     public double withdraw(double money){
         if(money <= super.getBalance()){
             super.withdraw(money);
             return 0;
         }else if (money > (super.getBalance()+this.overdraft)){
             System.out.println("超出透支金额");
         }else{
             double account_balance = getBalance();
             super.withdraw(account_balance);
             overdraft -= (money-account_balance);
             System.out.println("账号"+super.getId()+"本次取款"+money+"当前余额为:0.0,透支金额为:"+(money-account_balance)+"透支余额为："+this.overdraft);
             return 0;
         }
         return 0;
     }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}
