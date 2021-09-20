package com.example.work.mode_02_factory.factory_02_method.readme;
/**
 * Licensed to CMSR,Inc. under the terms of the CMSR
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date               Author               Version              Comments
 * 2021/9/10          zhutao                 1.0            Initial Version
 **/

/**
 *@ClassName CheesePizza
 *@Description TODO
 *@Author zhutao
 *@Date 2021/9/10 15:41
 *@Version 1.0
 **/
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(" 准备 CheesePizza 所需要的 材料");
    }
}
