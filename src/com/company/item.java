package com.company;

public class item {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String amount;
    public store store;


    public item (String name, String amount)
    {
        this.name = name;
        this.amount = amount;
        //this.store = store;
    }



    public  String[] giveItem(){

        String[] arrayItem = new String[2];
        arrayItem[0]=name;
        arrayItem[1]=amount;


        return arrayItem;
    }
}
