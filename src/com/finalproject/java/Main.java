package com.finalproject.java;

import java.util.ArrayList;
import java.util.List;

public class  Main {

    public static void main(String[] args) {
	// Run Simulations
        //simulation();
        SalesClerk clerk = new SalesClerk();
       clerk.beginOrder();
    }

    //Simulation for testing
    private static void simulation() {
        List<GadgetInterface> gadgetList = gadgetList = new ArrayList<>();
        gadgetList.add(new LargeGadget());
        gadgetList.add(new LargeGadget());
        gadgetList.add(new MediumGadget(SurfaceColor.PLATED));
        gadgetList.add(new SmallGadget(SurfaceColor.PAINTED));

        //TODO: send it to a receipt class.
        TransactionReceipt rec = new TransactionReceipt(gadgetList);
        rec.printReceipt();
    }
}