package com.example.work.mode_03_prototype;
/**
 * Licensed to CMSR,Inc. under the terms of the CMSR
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date               Author               Version              Comments
 * 2021/9/12          zhutao                 1.0            Initial Version
 **/

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.*;

/**
 *@ClassName Sheep
 *@Description 原型模式 --> 实现Cloneable接口,并重写其中的clone()方法
 *@Author zhutao
 *@Date 2021/9/12 12:46
 *@Version 1.0
 **/
@Data
@Accessors(chain = true)
public class Sheep implements Cloneable, Serializable {
    private String name;
    private String age;
    private String color;
    private Cow cow;

    public Sheep(String name, String age, String color, Cow cow) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.cow = cow;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", color='" + color + '\'' +
                ", cow=" + cow +
                '}';
    }

    /**
     * 浅层clone :  对于基本数据类型的成员变量,直接进行值传递,对于引用类型的成员变量(类对象,数组等),会进行引用传递
     * @return
     */
    public Sheep shallowClone(){
        try {
            Sheep clone = (Sheep)super.clone();
            return clone;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 深层clone 一 : 重写clone()方法
     */
    public Sheep deelClone(){
        try {
            Sheep clone = (Sheep)super.clone();
            Cow cowClone = (Cow)cow.clone();
            clone.cow = cowClone;
            return clone;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 深层clone 二 : 通过序列化来写
     */
    public Sheep deelClone2(){
        ByteArrayInputStream bis;
        ObjectInputStream ois;
        ByteArrayOutputStream bos;
        ObjectOutputStream oos;
        //将对象进行序列化
        try {
            //1.将该对象转成对象流的方式传出
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //2.
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Sheep clone = (Sheep)ois.readObject();
            return clone;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
