package com.abc.testcallback;

/**
 * Created by abc on 18-2-6.
 */

public class AnotherClass {

    public void exeMessage(String msg, MyCallback callback) {
        System.out.println(msg+" Start");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        callback.onCallback(msg+" Callback");
    }
}
