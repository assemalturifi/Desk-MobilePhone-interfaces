package com.company;

public class GearBox {
    private boolean clutchIsIn;

//    public void operateClutch(String inOrOut){
//        this.clutchIsIn=inOrOut.equalsIgnoreCase("in");
//    }
    //or
    public void operateClutch(boolean inOrOut){
        this.clutchIsIn=inOrOut;
    }
}
