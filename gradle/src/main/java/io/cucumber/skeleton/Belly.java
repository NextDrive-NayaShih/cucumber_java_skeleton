package io.cucumber.skeleton;

public class Belly {
    private int cakes;
    private int bellyAmount = 0;

    public void eat(int cakes) {
        this.cakes = cakes;
    }

    public void wait(int hours) {
        if(hours >= 1){
            bellyAmount += 1;
        }
    }

    public int growl() {
        return bellyAmount;
    }
}
