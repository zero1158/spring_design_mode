抽象工厂模式 : 依次进阶
    1.简单工厂模式
    2.工厂方法模式
    3.抽象工厂模式

举例 : pizza项目
    要求 :
        1.便于pizza种类的扩展,维护 (可以有很多种pizza如:cheesePizza,greekPizza等等)
        2.披萨的制作流程 : perpare,bake,cut,box
        3.完成定制pizza的流程 : 用户向商店购买不同种类的pizza -> 商店向不同的pizza生产线订购pizza -> 生产pizza