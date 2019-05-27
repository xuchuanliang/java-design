package com.snail.capter10.b2;

/**
 * 糖果机
 */
public class GumbalMachine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;

    State state = soldOutState;
    int count = 0;

    public GumbalMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldOutState(this);
        this.count = count;
        if(count>0){
            state = noQuarterState;
        }
    }

    /**
     * 投入硬币
     */
    void insertQuarter(){
        state.insertQuarter();
    }

    /**
     * 退钱
     */
    void ejectQuarter(){
        state.ejectQuarter();
    }

    /**
     * 转动曲柄
     */
    void turnCarnk(){
        state.turnCarnk();
    }

    /**
     * 分发糖果
     */
    void dispense(){
        state.dispense();
    }

    void releaseBall(){
        System.out.println("给你糖果");
        if(count!=0){
            count--;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }


    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
