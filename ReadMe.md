# head first 设计模式学习笔记

## 策略模式：定义了算法族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化独立于使用算法的客户
- 找出应用中可能需要变化之处，把他们独立出来，不要和那些不需要变化的代码混在一起
- 针对接口编程，而不是针对实现编程
- 多用组合，少用继承

## 观察者模式：定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，他的所有依赖者都会收到通知并且自动更新。
- 为了交互对象之间的松耦合设计而努力

## 装饰者模式：动态的将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案。具体参见装饰者.png
- 类应该对扩展开放，对修改关闭
> 装饰者和被装饰着有相同的超类型；你可以用一个或多个装饰者包装一个对象；既然装饰者和被装饰对象有相同的超类型，所以在任何需要原始对象的场合，
可以用装饰过的对象提到他；装饰者可以在所委托被装饰者的行为之前/后，加上自己的行为，以达到特定的目的；对象可以在任何时候被装饰，所以可以在运行时
动态的、不限量的用你喜欢的装饰者装饰对象。
- 装饰者该做的事，就是增加行为到被包装对象上，当需要窥视装饰者链中的每一个装饰者时，这就超出了他的职责。
- java I/O是jdk的针对装饰者模式的实现，均继承InputStream抽象类，FilterInputStream是装饰者的基类，FileInputStream等直接继承InputStream的类是被装饰类
具体参见装饰者java.io类.png

## 工厂模式：定义了一个创建对象接口，但由子类决定要实例化的类是哪一个。工厂方法让类实例化推迟到子类。具体类结构参见图工厂模式.png
- 工厂方法是由两个平行抽象类：产品类和创建者类以及他们的具体子类构成。产品类继承与抽象产品或者产品接口用于用户定义自定义的产品，创建者类
继承或者实现抽象创建者，实现创建产品的功能，负责创建一个或多个产品
- 依赖倒置原则：要依赖抽象，不要依赖具体类。这个原则说明了：不能让高层组件依赖低层组件，而且，不管高层或低层组件，两者都应该抵赖与抽象。
- 变量不可持有具体类的引用；不要让类派生自具体类；不要覆盖基类中已实现的方法；

## 抽象工厂模式：提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类
- 工厂方法模式只不过就是通过子类类创建对象。用这种做法，客户只需要知道他们所使用的抽象类型就可以了，而由子类来负责决定具体类型，换句话说工厂方法只负责将客户
从具体类型中解耦。
- 抽象工厂方法提供一个用来创建一个产品家族的抽象类型，这个类型的子类型定了产品被生产的方法。要想使用这个工厂，必须先实例化它，然后将它传入一些针对抽象类型所写

## 单例模式：确保一个类只有一个实例，并提供一个全局访问点
- 单例模式需要注意一个地方：当存在多个类加载器的时候，每个类加载器都定义了一个命名空间，那么需要自行制定类加载器，并且制定同一个类加载器

## 命令模式：将请求封装成对象，以便使用不同的请求、队列或日期参数化其他对象。命令模式也支持可撤销的操作。
- 命令模式可将动作的请求者从动作的执行者对象中解耦

## 适配器模式：将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间
- 适配器实现了目标接口，并持有被适配者的实例
- 客户使用适配器的过程如下：1.客户通过目标接口调用适配器的方法对适配器发出请求；2.适配器使用被适配者接口把请求转换成被适配者一个或多个调用接口；3.客户接收到调用的接口，但
并未察觉到这一切是适配器在其转换作用。
- 装饰者模式：不改变接口，但假如责任
- 适配器模式：将一个接口转换成另一个接口
- 外观模式：让接口更简单
- 适配器模式的意图是，改变接口符合客户的期望；外观模式的意图是，提供子系统的一个简化接口。

## 外观模式：提供一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。
- 最少知识原则：要减少对象之间的交互，只留下几个密友
- **就任何对象而言，在对象方法内，我们只应该调用属于以下范围的方法：1.该对象本身；2.被当做方法的参数而传递进来的对象；3.此方法所创建或实例化的任何对象；4.对象的任何组件**

## 模板方法模式：在一个方法中定义了一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。
- 钩子是一种被声明在抽象类中的方法，但只有空的或者默认的实现。钩子的存在，可以让子类有能力对方法的不同点进行挂钩，要不要挂钩，由子类决定。
- 好莱坞原则：别调用我们，我们会调用你。当高层组件依赖底层组件，而底层组件又依赖高层组件，而高层组件又依赖边侧组件，而边侧组件又依赖底层组件时，依赖腐败就发生了，在好莱坞
原则下，我们允许底层组件将自己挂钩到系统上，但是高层组件会决定什么时候和怎样使用这些底层组件。

## 迭代器与组合模式：提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示。
- 迭代器模式让我们能够游走聚合内的每一个元素，而又不暴露其内部表示；把游走的任务放在迭代器上，而不是聚合上。这样简化了聚合的接口和实现，也让责任各得其所。
- 一个类应该只有一个引起变化的原因。类的每一个职责都有改变的潜在区域。超过一个责任，意味着超过一个改变的区域。这个原则告诉我们尽量让每个类保持单一职责。
- 当一个模块或一个类被设计成只支持一组相关的功能时，我们说它具有高内聚；反之，当被设计成支持一组不相关的功能时，我们说他具有低内聚。

## 组合模式：允许你将对象组合成树形结构来表现整体/部分层次结构。组合能让客户以一致的方式处理个别对象以及对象组合。
- 组合模式让我们能用树形方式创建对象的结构，树里面包含了组合以及个别对象。使用组合结构，我们能把相同的操作应用在组合和个别对象上。换句话说，在大多数
情况下，我们可以忽略对象组合和个别对象之间的差别。

## 状态模式：允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类

## 代理模式：为另一个对象提供一个替身或者占位符以控制这个对象的访问。
- RMI称呼：RMI将客户辅助对象称为stub（桩），服务辅助对象称为skeleton(骨架)
- 远程代理可以作为另一个JVM上对象的本地代表。调用代理的方法，会被代理利用网络转发到远程执行，并且结果会通过网络返回给代理，再由代理将结果转给客户。
- 虚拟代理作为创建开销大的对象的代表。虚拟代理经常直到我们真正需要一个对象的时候才创建它。当对象在创建前和创建中时，由虚拟代理来扮演对象的替身。对象创建后，代理就会将请求直接委托给对象。
- jdk动态代理模式相关细节参见动态代理.png，具体说明如下：因为java已经为你创建了Proxy类，所以你需要有办法来告诉Proxy类你要做什么。你不能像以前那样把代码放在Proxy类中，因为Proxy类不是
你直接实现的。既然这样的代码不能直接放在Proxy类中，那么要放在哪里？放在InvocationHandler中。InvocationHandler的工作是响应代理的任何调度。你可以把InvocationHandler想成是代理收到方法调用
后，请求做实际工作的对象。

## 模式的模式


-------------------------------------------------------------------------
2019年5月14日 08:26:12 62/677
2019年5月14日 18:17:00 101/677
2019年5月14日 21:33:08 116/677
2019年5月16日 08:31:20 140/677
2019年5月16日 17:52:09 154/677
2019年5月16日 22:38:36 174/677
2019年5月20日 12:06:41 228/677
2019年5月20日 12:27:08 243/677
2019年5月21日 08:31:04 252/677
2019年5月21日 12:05:06 272/677
2019年5月21日 19:45:47 312/677
2019年5月21日 20:50:48 352/677
2019年5月23日 18:33:14 422/677
2019年5月27日 12:22:00 443/677
2019年5月27日 18:02:36 466/677
2019年5月29日 11:56:19 498/677
2019年5月29日 19:43:12 536/677