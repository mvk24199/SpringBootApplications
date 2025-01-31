package project.cashcard;

import com.fasterxml.jackson.annotation.JsonProperty;


class CashCard{
    double id,amount;
    public CashCard(double id,double amount){
        this.id=id;
        this.amount = amount;
    }
    @JsonProperty
    public Double getId() {
        return id;
    }

    @JsonProperty
    public Double getAmount() {
        return amount;
    }
}
