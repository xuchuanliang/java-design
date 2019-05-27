package com.snail.capter10.b1;

/**
 * 状态模式
 * 糖果机器
 */
public class GumballMachine {
    private final static int SOLD_OUT = 0;
    private final static int NO_QUARTER = 1;
    private final static int HAS_QUARTER = 2;
    private final static int SOLD = 3;

    private int state = SOLD_OUT;
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if(count>0){
            state = NO_QUARTER;
        }
    }

    /**
     * 塞硬币
     */
    public void insertQuarter(){
        if(state == HAS_QUARTER){
            System.out.println("已经有钱了，不用投了");
        }else if(state == NO_QUARTER){
            System.out.println("投钱成功");
            state = HAS_QUARTER;
        }else if(state == SOLD_OUT){
            System.out.println("售罄");
        }else if(state==SOLD){
            System.out.println("稍等一下，刚刚已经给过糖果了");
        }
    }

    /**
     * 退钱
     */
    public void ejectQuarter(){
        if(state==HAS_QUARTER){
            System.out.println("退给你钱，接好");
            state = NO_QUARTER;
        }else if(state==NO_QUARTER){
            System.out.println("你刚刚根本没有投钱，不可能给你退钱");
        }else if(state==SOLD){
            System.out.println("刚刚给你糖果了，不可能再给你退钱了");
        }else if(state==SOLD_OUT){
            System.out.println("糖果已经卖完了，不会退你钱了");
        }
    }

    /**
     * 转动曲柄
     */
    public void turnCarnk(){
        if(state==SOLD){
            System.out.println("刚刚已经给过你糖果了，不会再给你第二次了");
        }else if(state==NO_QUARTER){
            System.out.println("需要先给钱，才能给糖果");
        }else if(state==SOLD_OUT){
            System.out.println("糖果已经卖完了");
        }else if(state==HAS_QUARTER){
            System.out.println("给你糖果，接着");
            state=SOLD;
            dispense();
        }
    }

    /**
     * 分发糖果
     */
    public void dispense(){
        if(state==SOLD){
            System.out.println("正在输出糖果，接着");
            count = count-1;
            if(count==0){
                System.out.println("售罄");
                state=SOLD_OUT;
            }else{
                state=NO_QUARTER;
            }
        }else if(state==NO_QUARTER){
            System.out.println("你需要先付钱");
        }else if(state==SOLD_OUT){
            System.out.println("糖果已经售罄");
        }else if(state==HAS_QUARTER){
            System.out.println("没有糖果能派给你的，现在系统异常，正在自检...");
        }
    }
}
