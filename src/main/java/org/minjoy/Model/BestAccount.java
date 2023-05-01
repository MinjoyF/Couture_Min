package org.minjoy.Model;

public class BestAccount extends ClientAccount {

    private double sold;

    public BestAccount(){
        super();
    }


    public BestAccount(String name, String phone_number, double sold){
        super(name, phone_number);
        this.sold = sold;
    }


    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    @Override
    public String geType() {
        return "BEST_ACCOUNT";
    }


}
