package com.finalproject.java;



public class SmallWidget extends AbstractWidget{
    public SmallWidget(SurfaceColor color) {
        super(color);
        this.serialNumber = SerialNumberGenerator.getInstance()
                .getNextSerial(ProductType.SmallWidget) ;
    }
    @Override
    public String getGears() {

        return "2 Gears";
    }
    @Override
    public String getSprings(){

        return "3 Springs";
    }
    @Override
    public String getLevers() {

        return "1 Levers";
    }
}
