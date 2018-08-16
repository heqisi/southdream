package com.dy.entity;

/**
 * @Auther: yuanmaojun
 * @Date: 2018.8.16 14:48
 * @Description:
 */
public class Engine {
    
    /*
    * 类型
    */
    private String type;
    
    /*
    * 汽缸
    */
    private int cylinders;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
