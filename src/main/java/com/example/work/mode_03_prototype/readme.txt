原型模式 : 用原型实例指定创建对象的种类,并通过拷贝这些原型,创建新的对象,是一种创建型的设计模式,
            允许一个对象在创建另一个定制的对象,而无需知道如何创建的细节
    简单来说主要就是调用Object类中的clone()方法

    需求:有一只name=tom,age=2,color=red的羊,现在需要在来5个一模一样的羊
    方案一 : 直接new 5个一样的对象
    缺点 : 1.每次创建对象都需要重新获取原始对象的属性 ;
           2.总是需要重新初始化对象,而不是动态的获取对象运行时的状态,不够灵活
    改进 : Java中Object类是所有类的基类,其中有一个clone()方法,可以复制Java对象,
           但是需要Java类实现一个Cloneable接口,该接口表示该类能够复制且具有复制的能力 --> 原型模式


    浅拷贝 : 对于基本数据类型的成员变量,直接进行值传递,对于引用类型的成员变量(类对象,数组等),会进行引用传递
    深拷贝 : 复制所有基本数据类型的成员变量值,为所有的引用数据类型的成员变量申请存储空间,
            并复制每个引用数据类型成员变量所引用的对象,直到该对象可达的所有对象,也就是说--是对整个对象进行拷贝
        实现方式 :
            1.重写clone方法
            2.通过对象序列化实现
