package com.example.work.mode_00_start.interface_geli_02;
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

/**
 *@ClassName Demo
 *@Description 该demo主要演示接口隔离原则 ,以及通过接口而进行的依赖的情况
 *@Author zhutao
 *@Date 2021/9/7 15:18
 *@Version 1.0
 **/
public class Demo {
    /**
     * 接口隔离:客户端不应该依赖它不需要的接口,我们应该将这些不需要的接口拆开
     * @param args
     */
    public static void main(String[] args) {
        B b = new B();
        //类B调用方法的时候将实现了Interface_0接口的类(类A)当作参数,实现了b通过接口依赖a
        b.method(new A());
    }
}
interface Interface_0{
    void method_0();
}

/**
 * 将原本一个接口中的三个方法分别拆成三个接口,实现类只实现自己需要的接口 -- 接口隔离
 */
interface Interface_1{
    void method_1();
}
interface Interface_2{
    void method_2();
}
class A implements Interface_0,Interface_1{
    @Override
    public void method_0() {
        System.out.println(" 类A 实现了 Interface_0 接口中的 menthod_0()方法");
    }

    @Override
    public void method_1() {
        System.out.println("实现接口隔离");
    }
}
class B{
    void method(Interface_0 interface0) {
        interface0.method_0();
    }
}

