package com.dy.entity;

/**
 * @Auther: yuanmaojun
 * @Date: 2018.8.14 14:03
 * @Description:
 */
public class Course {
    /*
    * 主键
    */
    private int id;
    
    /*
    * 名字
    */
    private String name;
    
    /*
    * 标记
    */
    private int deleteFlag;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDeleteFlag() {
        return deleteFlag;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeleteFlag(int deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deleteFlag=" + deleteFlag +
                '}';
    }
}
