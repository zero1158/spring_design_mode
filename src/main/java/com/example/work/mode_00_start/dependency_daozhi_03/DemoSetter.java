package com.example.work.mode_00_start.dependency_daozhi_03;
/**
 * Licensed to CMSR,Inc. under the terms of the CMSR
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date               Author               Version              Comments
 * 2021/9/7          zhutao                 1.0            Initial Version
 **/

import lombok.experimental.Accessors;

/**
 *@ClassName DemoSetter
 *@Description 3.setter方法传递依赖
 *@Author zhutao
 *@Date 2021/9/7 17:02
 *@Version 1.0
 **/
public class DemoSetter {
    public static void main(String[] args) {
        Interface_aaa i = new Function_aaa();
        Function_bbb bbb = new Function_bbb();
        /**
         * 跟构造器传递很相似,通过重写setter方法将aaa接口的实现类传进去,在bbb接口的实现类中调用
         * 接口方法,在接口方法中调用的实际就是function_aaa实现类实现的method-aaa方法
         */
        bbb.setAaa(i);
        bbb.method_bbb();
    }
}
interface Interface_aaa{
    void method_aaa();
}
interface Interface_bbb{
    void method_bbb();
}
class Function_aaa implements Interface_aaa{
    @Override
    public void method_aaa() {
        System.out.println("实现 Interface_aaa 接口中的 method_aaa() 方法");
    }
}
@Accessors(chain = true)
class Function_bbb implements Interface_bbb{
    private Interface_aaa aaa;
    public void setAaa(Interface_aaa aaa){
        this.aaa = aaa;
    }
    @Override
    public void method_bbb() {
        aaa.method_aaa();
    }
}
