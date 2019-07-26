package com.finalproject.java;

import java.util.ArrayList;
import java.util.List;


public class LargeGadget extends AbstractGadget {
        public LargeGadget() {
            this(SurfaceColor.PAINTED);

    }
    public LargeGadget(SurfaceColor color) {
        super(color);
        this.serialNumber = SerialNumberGenerator.getInstance()
                .getNextSerial(ProductType.LargeGadget);
    }
    @Override
        public List<WidgetInterface> getWidgets (SurfaceColor color) {
        List<WidgetInterface> myList = new ArrayList<>();
        myList.add(new LargeWidget(color));
        myList.add(new LargeWidget(color));
        myList.add(new LargeWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new MediumWidget(color));
        myList.add(new SmallWidget(color));
        myList.add(new SmallWidget(color));
        myList.add(new SmallWidget(color));
        return myList;
    }

        @Override
        public int getSwitches() {
            return 2;
        }

        @Override
        public int getButtons() {
            return 4;
        }

        @Override
        public int getLights() {
            return 5;
        }

        @Override
        public String getPowerSource() {
            return "Generator";
        }

        @Override
        public float getPrice() {
            return 84.99F;
    }
}
