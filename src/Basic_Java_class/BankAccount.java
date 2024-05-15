public class BankAccount {

    String bankName;
    int balance;
    String bankcode;


    BankAccount(){
        bankName="SBI";
        bankcode="sbi001";
        System.out.println("Default C");

    }

    BankAccount(String bName,String bcode){
        this.bankName=bName;
        this.bankcode=bcode;
        System.out.println("parameterised C");

    }

    void printDetails(){
        System.out.println(bankName);
        System.out.println(balance);
        System.out.println(bankcode);
    }
}
