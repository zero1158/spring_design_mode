package com.example.work.mode_02_factory.factory_03_abstract.factory;
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

import com.example.work.mode_02_factory.factory_03_abstract.pizza.Pizza;

/**
 *@ClassName AbstrctFactory
 *@Description 定义工厂接口
 *@Author zhutao
 *@Date 2021/9/10 16:49
 *@Version 1.0
 **/
public interface AbstrctFactory {
    public Pizza createFactory(String type);
}
