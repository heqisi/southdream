package com.dy.entity;

import java.io.*;

/**
 * https://www.cnblogs.com/lanxuezaipiao/p/3369962.html
 * @description 使用transient关键字不序列化某个变量
 *        注意读取的时候，读取数据的顺序一定要和存放数据的顺序保持一致
 * @Auther: yuanmaojun
 * @Date: 2018.8.15 13:57
 * @Description:
 */
public class TransientTest {

    public static void main(String[] args) {

        NewUser newUser = new NewUser();
        newUser.setUsername("Alexia");
        newUser.setPasswd("123456");

        System.out.println("read before Serializable: ");
        System.out.println("username: " + newUser.getUsername());
        System.err.println("password: " + newUser.getPasswd());

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("D:/NewUser.txt"));
            os.writeObject(newUser); // 将User对象写进文件
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            // 在反序列化之前改变username的值
            newUser.username = "jmwang";

            ObjectInputStream is = new ObjectInputStream(new FileInputStream(
                    "D:/NewUser.txt"));
            newUser = (NewUser) is.readObject(); // 从流中读取User的数据
            is.close();

            System.out.println("\nread after Serializable: ");
            System.out.println("username: " + newUser.getUsername());
            System.err.println("password: " + newUser.getPasswd());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class NewUser implements Serializable {
    private static final long serialVersionUID = 8294180014912103005L;

    public  static transient  String username;
    //                                  ---static-------transient-------static transient序列化后
    //没有 newUser.username = "jmwang"    Alexia          null           Alexia
    //  有 newUser.username = "jmwang"    jmwang          null           jmwang
    private transient String passwd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

}
