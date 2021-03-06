# design patterns

## Adapter

![Adapter](https://github.com/suqun/JavaDesignPatterns/blob/master/src/main/java/com/headfirst/adapter/class_diagram.png "适配器示例类图")

- **适配器模式——将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间**
- **要点**
    * 当需要使用一个现有的类而其接口不符合你得需要时，就要用适配器
    * 适配器改变接口以符合客户的希望
    * 适配器有两种形式；对象适配器和类适配器。类适配器需要用到多重继承


## Command

![Command](https://github.com/suqun/JavaDesignPatterns/blob/master/src/main/java/com/headfirst/command/simpleremote/command.png "命令模式类图")

- **命令模式——将“请求”封装成对象，以便不同的请求、队列或日志来参数化其他对象。命令模式也支持撤销的操作。**
- **要点**
    * 命令模式将发出请求的对象和执行请求的对象解耦。
    * 在被解耦的两者之间是通过命令模式进行沟通的。命令对象封装了接收者和一个或一组动作。
    * 调用者通过调用命令对象的execute()方法发出请求，这会使得接收者的动作被调用。
    * 调用者可以接受命令当做参数，甚至在运行时动态设置
    * 命令可以支持撤销，做法是实现一个undo()方法来回到execute()被执行前的状态
    * 宏命令是命令的一种简单的延伸，允许调用多个命令。宏方法也可以支持撤销
    * 命令模式也可以用来实现队列请求，日志和事务系统。

## Composite

![Composite](https://github.com/suqun/JavaDesignPatterns/blob/master/src/main/java/com/headfirst/composite/composite.png "组合模式示例类图")

- **组合模式——允许你将对象组合成树形结构来表现“整体/部分”层次结构。组合能让客户以一致的方式处理个别以及对象组合**
- **要点**
    * 组合模式提供一个结构，可同时包含个别对象和组合对象
    * 组合模式允许客户对对象以及组合对象一视同仁
    * 组合结构的任意对象称为组件，组件可以是组合，也可以是叶子节点
    * 在实现组合模式时，有许多设计上的折衷。你要根据需要平衡透明性和安全性

## decorator

![Decorator](https://github.com/suqun/JavaDesignPatterns/blob/master/src/main/java/com/headfirst/decorator/decorator.png "装饰者模式示例类图")

- **装饰者模式——动态的将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的代替方案。**
- **要点**
    * 继承属于扩展形式之一，但不见得是达到弹性设计的最佳方案
    * 在我们的设计中，应该允许行为可以被扩展，而无需修改现有的代码
    * 组合和委托可以用于运行时动态的加上新的行为
    * 除了继承，装饰者模式也可以让我们扩展行为
    * 装饰者模式意味着一群装饰者类，这些类用来包装具体组件。
    * 装饰者类反映出装饰的组件的类型（事实上，他们具有相同的类型，都经过接口或继承实现）
    * 装饰者可以在被装饰者的行为前面与/或后面加上自己的行为，甚至将被装饰者的行为整个取代掉，而达到特定的目的
    * 你可以用无数个装饰者包装一个组件
    * 装饰者一般对组件的客户是透明的，除非客户程序依赖于组件的具体类型
    * 装饰者会导致设计中出现许多小对象，如果过度使用，会让程序变的很复杂

## facade

![Facade](https://github.com/suqun/JavaDesignPatterns/blob/master/src/main/java/com/headfirst/facade/facade.png "外观模式示例类图")

- **外观模式——提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用**
- **要点**
    * 当需要简化并统一一个很大的接口或者一群复杂的接口时，使用外观
    * 外观将客户从一个复杂的系统中解耦
    * 实现一个外观，需要将子系统组合进外观中，然后将工作委托给子系统执行
    * 你可以为一个子系统实现一个以上的外观

## iterator

![Iterator](https://github.com/suqun/JavaDesignPatterns/blob/master/src/main/java/com/headfirst/iterator/iterator.png "迭代器模式示例类图")

- **迭代器模式——提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示。**
- **要点**
    * 迭代器允许访问聚合的元素，而不需要暴露它的内部结构。
    * 迭代器将遍历聚合的工作封装进一个对象中
    * 当使用迭代器的时候，我们依赖聚合提供遍历
    * 迭代器提供了一个通用的接口，让我们遍历聚合的项，当我们编码使用聚合的项时，就可以使用多态机制
    * 努力让一个类只分配一个责任

## observer

![Observer](https://github.com/suqun/JavaDesignPatterns/blob/master/src/main/java/com/headfirst/observer/observer.png "观察者模式示例类图")

- **观察者模式——定义对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新**
- **要点**
    * 观察者模式定义了对象之间的一对多的关系
    * 主体（也就是可观察者）用一个共同的接口来更新观察者
    * 观察者和可观察者之间用松耦合的方式结合，可观察者不知道观察者的细节，只知道观察者实现了观察者接口
    * 使用此模式时，你可从被观察者推或拉数据（然而，推的方式被认为更“正确”）
    * 有多个观察者时，不可以依赖特定的通知顺序

## singleton
- **单件模式——确保一个类只有一个实例，并提供全局访问点**
- **要点**
    * 单件模式确保程序中一个类最多只有一个实例
    * 单件模式也提供访问这个实例的全局点
    * 在Java中实现单件模式需要有私有的构造器、一个静态方法和一个静态变量
    * 确定在性能和资源上得限制，然后小心的选择适当的方案来实现单件，以解决多线程的问题（我们必须认定所有的程序都是多线程的）
    * 如果不是采用第五搬得Java，双重检查加锁会失效
    * 小心，如果你使用多个类加载器，可能导致单件失效而产生多个实例
    * 如果使用JVM1.2或之前的版本，你必须建立单件注册表，以免垃圾收集器将单件收回

## state

![State](https://github.com/suqun/JavaDesignPatterns/blob/master/src/main/java/com/headfirst/state/state.png "状态模式类图")

- **状态模式——允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类**
- **要点**
    * 状态模式允许一个对象基于内部状态而拥有不同的行为
    * 和程序状态机（PSM）不同，状态模式用类代表状态
    * Context会将行为委托给当前状态对象
    * 通过每个状态封装进一个类，我们把以后需要做得任何改变局部化了
    * 状态模式和策略模式有相同的类图，但是他们的意图不同
    * 策略模式通常会用行为或算法来配置Context类
    * 状态模式允许Context随着状态的改变而改变行为
    * 状态转换可以由State类或Context类控制
    * 使用状态模式通常会导致设计中的类的数目大量增加
    * 状态类可以被多个Context实例共享

## strategy

![Strategy](https://github.com/suqun/JavaDesignPatterns/blob/master/src/main/java/com/headfirst/strategy/duck.png "策略模式示例类图")

- **策略模式——定义算法族，分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立于使用算法的客户。**

## template-method

![TemplateMethod](https://github.com/suqun/JavaDesignPatterns/blob/master/src/main/java/com/headfirst/templatemethod/template.png "模板方法模式")

- **模板方法模式——在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得类可以在不改变算法结构的情况下，重新定义算法中的某些步骤**
- **要点**
    * 模板方法定义了算法的步骤，把这些步骤的实现延迟到子类
    * 模板方法模式为我们提供了一种代码复用的重要技巧
    * 模板方法的抽象类可以定义具体方法、抽象方法和钩子
    * 抽象方法由子类实现
    * 钩子是一种方法，它在抽象类中不做事，或者只做默认的事，子类可以选择要不要覆盖它
    * 为了防止子类覆盖模板方法中的算法，可以将模板方法声明为final 
    * 策略模式和模板方法模式都封装算法，一个用组合，一个用继承
    * 工厂方法是模板方法的一种特殊版本
