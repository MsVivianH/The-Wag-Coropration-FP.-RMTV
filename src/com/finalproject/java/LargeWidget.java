package com.finalproject.java;

public class LargeWidget extends AbstractWidget {
    public LargeWidget(SurfaceColor color) {
        super(color);
        this.serialNumber = SerialNumberGenerator.getInstance()
                .getNextSerial(ProductType.LargeWidget) ;
    }
    @Override
    public String getGears() {
        return "9 Gears";
    }
    @Override
    public String getSprings(){
        return "4 Springs";
    }
    @Override
    public String getLevers() {
        return "2 Levers";
    }
}
