package com.dy.entity;

/**
 * @Auther: yuanmaojun
 * @Date: 2018.8.16 14:47
 * @Description:
 */
public class Car {
    /*
    * id
    */
    private int id;
    /*
    * 类型
    */
    private String type;
    
    private Engine engine;
    
    private Brakes brakes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Brakes getBrakes() {
        return brakes;
    }

    public void setBrakes(Brakes brakes) {
        this.brakes = brakes;
    }
}
