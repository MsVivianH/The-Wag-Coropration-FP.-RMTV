package com.finalproject.java;

public class MediumWidget extends AbstractWidget{
    public MediumWidget(SurfaceColor color) {
        super(color);
        this.serialNumber = SerialNumberGenerator.getInstance()
                .getNextSerial(ProductType.LargeWidget) ;
    }
    @Override
    public String getGears() {

        return "4 Gears";
    }
    @Override
    public String getSprings(){

        return "5 Springs";
    }
    @Override
    public String getLevers() {

        return "3 Levers";
    }
}
