## design patterns

####adapter
- 适配器模式：将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间
- ![Adapter](https://github.com/suqun/JavaDesignPatterns/blob/master/src/main/java/com/headfirst/adapter/class_diagram.png "适配器示例类图")
- 要点
    1. 当需要使用一个现有的类而其接口不符合你得需要时，就是用适配器
    2. 适配器改变接口以符合客户的希望
    3. 适配器有两种形式；对象适配器和类适配器。类适配器需要用到多重继承