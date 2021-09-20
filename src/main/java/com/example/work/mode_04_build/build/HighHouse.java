package com.example.work.mode_04_build.build;
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
 *@ClassName HighHouse
 *@Description 角色-具体建造者 : 高楼
 *@Author zhutao
 *@Date 2021/9/14 21:46
 *@Version 1.0
 **/
public class HighHouse extends BuildHouse{

    @Override
    public void buildBase() {
        System.out.println(" 建造者模式 -> 给 高楼 打地基  -- 50米 ");
    }

    @Override
    public void buildWall() {
        System.out.println(" 建造者模式 -> 给 高楼 建墙 -- 30米 ");
    }

    @Override
    public void buildRoof() {
        System.out.println(" 建造者模式 -> 给 高楼 封顶 -- 十层 ");
    }

}
