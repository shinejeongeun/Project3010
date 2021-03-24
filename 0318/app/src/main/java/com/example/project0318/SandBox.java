package com.example.project0318;

import java.util.ArrayList;
import java.util.List;

public class SandBox {
    private List<String> mGreetings = new ArrayList<>();

  /*  public SandBox(List<String> mGreetings) {
        this.mGreetings = mGreetings;
    }*/

    public SandBox() {
    }

    public List<String> get_mGreetings() {
        return mGreetings;
    }

    public void set_mGreetings(List<String> mGreetings) {
        this.mGreetings = mGreetings;
    }

    @Override
    public String toString() {
        return "SandBox{" +
                "mGreetings=" + mGreetings +
                '}';
    }
}
