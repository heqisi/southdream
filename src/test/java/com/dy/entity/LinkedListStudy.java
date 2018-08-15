package com.dy.entity;

import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: yuanmaojun
 * @Date: 2018.8.15 16:12
 * @Description:study use LinkedList
 */
public class LinkedListStudy {
    public static void main(String[] args) {

        //获取链表的第一个和最后一个元素
        LinkedList<String> linkedList=new LinkedList<String>();
        initLinkedList(linkedList);

        System.out.println("链表的第一个元素是："+linkedList.getFirst());
        System.out.println("链表的最后一个元素是："+linkedList.getLast());
//        链表的第一个元素是：1
//        链表的最后一个元素是：5
        System.out.println("**************");

        //获取链表元素
        for(String str:linkedList){
            System.out.println(str);
        }
        System.out.println("**************");

        //从链表生成子表
        System.out.println(linkedList);//[1, 2, 3, 4, 5]
        List sub=linkedList.subList(1,3);
        System.out.println(sub);//[2, 3]
        sub.remove(1);//移除sub的第二个元素，注意也会影响原链表。
        System.out.println(linkedList);//[1, 2, 4, 5]
        sub.add("3");
        System.out.println("sub加3后："+linkedList);//[1, 2, 3, 4, 5]
        linkedList.addFirst("0");
        linkedList.addLast("6");
        System.out.println(linkedList);//[0,1, 2, 3, 4, 5,6]
    }

    public static void initLinkedList(LinkedList ll){
        ll.add("1");
        ll.add("2");
        ll.add("3");
        ll.add("4");
        ll.add("5");
    }
}
