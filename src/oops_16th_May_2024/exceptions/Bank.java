package oops_16th_May_2024.exceptions;

public class Bank {

    private String currency;
    private Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }
    public  Integer add(Bank BankName) throws CustomException {
        if (!(BankName.currency.equalsIgnoreCase("INR"))){
            throw new CustomException("INR to USD is not possible");


        }
       Integer sum= this.amount+ BankName.amount;
       return sum;
    }
}
