package com.finalproject.java;

import java.util.ArrayList;
import java.util.List;

public class MediumGadget extends AbstractGadget {
    public MediumGadget() {
        this(SurfaceColor.PAINTED);
    }

    public MediumGadget(SurfaceColor color) {
        super(color);
        this.serialNumber = SerialNumberGenerator.getInstance()
                .getNextSerial(ProductType.MediumGadget);
    }

    @Override
    public List<WidgetInterface> getWidgets(SurfaceColor color) {
        List<WidgetInterface> myList = new ArrayList<>();
        myList.add(new LargeWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new SmallWidget(color));
        myList.add(new SmallWidget(color));

        return myList;
    }

    @Override
    public int getSwitches() {
        return 1;
    }

    @Override
    public int getButtons() {
        return 2;
    }

    @Override
    public int getLights() {
        return 3;
    }

    @Override
    public String getPowerSource() {
        return "Solar";
    }

    @Override
    public float getPrice() {

        return 79.99F;
    }
}