package com.test.robotium;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

public class MainActivity extends ActivityInstrumentationTestCase2 {

    private static  Class<?> activityClass;
    private Solo solo;

    static {
        try {
            activityClass = Class.forName("com.test.autofill.MainActivity");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public MainActivity() {
        super(activityClass);
    }

    @Override
    protected void setUp() throws Exception {
        solo = new Solo(getInstrumentation(),getActivity());
    }

    public void testDemo(){
        solo.typeText(0,"17");
        solo.clickOnText("fill");
        solo.sleep(10000);
    }
}
