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

import lombok.Data;

/**
 *@ClassName BuildDirector
 *@Description 角色-指挥者 : 指挥建造房子 - 就是将建造房子的步骤组合执行
 *@Author zhutao
 *@Date 2021/9/14 22:00
 *@Version 1.0
 **/
@Data
public class BuildDirector {
    private BuildHouse buildHouse;

    /**
     * 通过构造器传入 具体建造者
     */
    public BuildDirector(BuildHouse buildHouse){
        this.buildHouse = buildHouse;
    }

    /**
     * 通过setter方法传入 具体建造者
     */
    public void setBuildHouse(BuildHouse buildHouse) {
        this.buildHouse = buildHouse;
    }

    /**
     * 指挥者 指挥建造房子
     */
    public House getHouse(){
        buildHouse.buildBase();
        buildHouse.buildWall();
        buildHouse.buildRoof();
        House build = buildHouse.build();
        return build;
    }
}
