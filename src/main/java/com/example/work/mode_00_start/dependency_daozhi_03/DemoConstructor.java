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
 *@ClassName DemoConstructor
 *@Description 2.构造器方法传递依赖
 *@Author zhutao
 *@Date 2021/9/7 16:50
 *@Version 1.0
 **/
public class DemoConstructor {
    public static void main(String[] args) {
        Function_aa function_aa = new Function_aa();
        /**
         * 通过Function_bb的有参构造器将Interface_aa接口的实现类,作为参数传入进去
         * 在实现Interface_bb的时候,调用了aa接口实现类中的方法,达到了依赖传递的效果
         */
        new Function_bb(function_aa).method_bb();
    }
}
interface Interface_aa{
    void method_aa();
}
interface Interface_bb{
    void method_bb();
}
class Function_aa implements Interface_aa{
    @Override
    public void method_aa() {
        System.out.println("实现  aa接口 ----");
    }
}
class Function_bb implements Interface_bb{
    private Interface_aa aa;
    public Function_bb(Interface_aa aa){
        this.aa = aa;
    }
    @Override
    public void method_bb() {
        aa.method_aa();
    }
}
