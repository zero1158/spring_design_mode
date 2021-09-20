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

/**
 *@ClassName DemoInterface
 *@Description 1.接口传递依赖
 *@Author zhutao
 *@Date 2021/9/7 15:36
 *@Version 1.0
 **/
public class DemoInterface {
    public static void main(String[] args) {
        TestFunction test = new TestFunction();
        test.method_b(new Function());
    }
}
interface Interface_a{
    void method_a();
}
interface Interface_b{
    void method_b(Interface_a a);
}
class Function implements Interface_a{
    @Override
    public void method_a() {
        System.out.println("实现 Interface_a 中method_a() 方法");
    }
}
//通过接口进行的依赖传递
class TestFunction implements Interface_b{
    @Override
    public void method_b(Interface_a a) {
        a.method_a();
    }
}