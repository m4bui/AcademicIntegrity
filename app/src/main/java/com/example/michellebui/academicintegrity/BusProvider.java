package com.example.michellebui.academicintegrity;

import com.squareup.otto.Bus;

/**
 * Created by michellebui on 2/21/17.
 */
public class BusProvider {

    private static final Bus BUS = new Bus();

    public static Bus getInstance(){
        return BUS;
    }

    public BusProvider(){}
}