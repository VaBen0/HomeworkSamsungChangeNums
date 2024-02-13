package ru.myitschool.mte;

import static java.lang.Thread.sleep;

import android.widget.TextView;

public class NumberChanger extends Thread{
    final private TextView nums;
    private boolean runnable = true;
    final String[] arr = {"1", "2", "3"};
    private int cnt = 0;
    public NumberChanger(TextView nums){
        this.nums = nums;
    }

    @Override
    public void run() {
        super.run();
        while(runnable){
            nums.setText(arr[cnt++ % 3]);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void breakThread(){
        runnable = false;
    }
}
