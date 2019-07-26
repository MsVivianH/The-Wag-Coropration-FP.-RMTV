package com.finalproject.java;


import java.util.ArrayList;
import java.util.List;

public class SmallGadget extends AbstractGadget {
        public SmallGadget() {
            this(SurfaceColor.PAINTED);

        }

        public SmallGadget(SurfaceColor color) {
            super(color);
            this.serialNumber = SerialNumberGenerator.getInstance()
                    .getNextSerial(ProductType.SmallGadget);
        }

        @Override
        public List<WidgetInterface> getWidgets(SurfaceColor color) {
            List<WidgetInterface> myList = new ArrayList<>();
            myList.add(new MediumWidget(color));
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
            return 0;
        }

           @Override
        public String getPowerSource() {
            return "Battery";
        }

        @Override
        public float getPrice() {
            return 49.95F;
        }
    }
