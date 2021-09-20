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
 *@ClassName HighHouse
 *@Description 高楼
 *@Author zhutao
 *@Date 2021/9/14 21:23
 *@Version 1.0
 **/
public class OldHighHouse extends OldBuildHouse {
    @Override
    public void buildBase() {
        System.out.println(" 给 高楼 打地基  -- 20米 ");
    }

    @Override
    public void buildWall() {
        System.out.println(" 给 高楼 建墙 -- 30米 ");
    }

    @Override
    public void buildRoof() {
        System.out.println(" 给 高楼 封顶 -- 3层 ");
    }
}
