package com.example.work.mode_04_build.old;
/**
 * Licensed to CMSR,Inc. under the terms of the CMSR
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date               Author               Version              Comments
 * 2021/9/14          zhutao                 1.0            Initial Version
 **/

/**
 *@ClassName BuildHouse
 *@Description 建房子的抽象类
 *@Author zhutao
 *@Date 2021/9/14 21:16
 *@Version 1.0
 **/
public abstract class OldBuildHouse {
    /**
     * 打地基
     */
    public abstract void buildBase();

    /**
     * 建墙
     */
    public abstract void buildWall();

    /**
     * 封顶
     */
    public abstract void buildRoof();

    /**
     * 盖房子
     */
    public void build(){
        buildBase();
        buildWall();
        buildRoof();
        System.out.println(" 房子建好啦 ---- ");
    }
}
