抽象工厂模式 :
    定义一个接口,用于创建相关或有依赖关系的对象,而无需指明具体的类,可以将简单工厂模式和工厂方法模式进行整合

    将工厂抽象成两层,抽象工厂层和具体实现层,程序员可以根据创建对象的类型使用对应的工厂子类,
    这就将单个的简单工厂变成了工厂簇,更有利于代码的维护和扩展

从流程上看 : 与工厂方法模式几乎相同,只是不再使用基类,而是使用接口来进行抽象,感觉会更好些

