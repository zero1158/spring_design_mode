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
import org.springframework.validation.annotation.Validated;

/**
 *@ClassName Cow
 *@Description 牛 的原型
 *@Author zhutao
 *@Date 2021/9/12 17:35
 *@Version 1.0
 **/
@Data
@Accessors(chain = true)
public class Cow {
    private String name;
    private String age;

    public Cow(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
