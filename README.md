# design patterns

##Adapter

![Adapter](https://github.com/suqun/JavaDesignPatterns/blob/master/src/main/java/com/headfirst/adapter/class_diagram.png "适配器示例类图")

- **适配器模式**——将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间
- **要点**
    * 当需要使用一个现有的类而其接口不符合你得需要时，就要用适配器
    * 适配器改变接口以符合客户的希望
    * 适配器有两种形式；对象适配器和类适配器。类适配器需要用到多重继承


##Command

![Command](https://github.com/suqun/JavaDesignPatterns/blob/master/src/main/java/com/headfirst/command/simpleremote/command.png "命令模式类图")

- **命令模式**——将“请求”封装成对象，以便不同的请求、队列或日志来参数化其他对象。命令模式也支持撤销的操作。
- **要点**
    * 命令模式将发出请求的对象和执行请求的对象解耦。
    * 在被解耦的两者之间是通过命令模式进行沟通的。命令对象封装了接收者和一个或一组动作。
    * 调用者通过调用命令对象的execute()方法发出请求，这会使得接收者的动作被调用。
    * 调用者可以接受命令当做参数，甚至在运行时动态设置
    * 命令可以支持撤销，做法是实现一个undo()方法来回到execute()被执行前的状态
    * 宏命令是命令的一种简单的延伸，允许调用多个命令。宏方法也可以支持撤销
    * 命令模式也可以用来实现队列请求，日志和事务系统。

##Composite

![Composite](https://github.com/suqun/JavaDesignPatterns/blob/master/src/main/java/com/headfirst/composite/composite.png "组合模式示例类图")

- **组合模式**——允许你将对象组合成树形结构来表现“整体/部分”层次结构。组合能让客户以一致的方式处理个别以及对象组合
- **要点**
    * 组合模式提供一个结构，可同时包含个别对象和组合对象
    * 组合模式允许客户对对象以及组合对象一视同仁
    * 组合结构的任意对象称为组件，组件可以是组合，也可以是叶子节点
    * 在实现组合模式时，有许多设计上的折衷。你要根据需要平衡透明性和安全性