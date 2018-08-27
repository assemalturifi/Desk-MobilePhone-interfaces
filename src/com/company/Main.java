package com.company;

public class Main {

    public static void main(String[] args) {
        //we could have written it like this
        // DestPhone assemPhone=new DestPhone(12345);
        ITelephone assemPhone;
        assemPhone=new DestPhone(12345);
        assemPhone.powerOn();
        assemPhone.callPhone(12345);
        assemPhone.answer();
        System.out.println("========");

        assemPhone=new MobilePhone(121212);
        assemPhone.powerOn();
        assemPhone.callPhone(121212);
        assemPhone.answer();
    }


}
