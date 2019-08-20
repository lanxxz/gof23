# Observer 模式(观察者模式)
也被称为 Publish-Subscribe 模式(发布-订阅模式)。定义对象间的一种一对多的依赖关系。当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
## 优点
- 观察者和被观察者抽象耦合
- 建议一套触发机制
## 缺点
- 如果一个被观察者对象有很多的直接和间接的观察者的话，将导致所有的观察者收到通知花费了很长的时间
- 如果在观察者和被观察者之间有循环依赖的话，观察目标会触发他们之间进行循环调用，可能导致系统崩溃
- 观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，
而仅仅只是知道观察目标发生率变化
## 适用场景
- 一个抽象模型有两个方面，其中一个方面依赖于另一个方面麻将这些方面封装在独立的对象中使他们可以各自独立的改变和复用。
- 一个对象的改变将其他一个或多个对象也发生改变，而且不知道具体有多少个对象将发生改变，可以降低对象之间的耦合度
- 一个对象必须通知其他对象，而不必知道其他对象是谁
- 需要在系统中创建一个触发链，A 对象的行为将影响 B 对象，B 对象的行为将影响 C 对象……，
可以使用观察者模式创建一种链式触发机制。
- MVC模式中的 model 和 view 的关系相当于 subject 角色和 observer 角色。model 是指操作"不依赖于显示形式的内部模型"，
view 是管理 model "怎么显示"的部分。通常情况下，一个 model 对应多个 view
## 注意事项
- JAVA 中已经有了对观察者模式的支持类
- 避免循环调用
- 如果顺序执行，某一观察者错误会导致系统卡顿，一般采用 __异步模式__
- 设计具体观察者对象时，要注意这些观察者的通知顺序，不能因为他们的调用顺序改变而产生问题，尽量保持各个模块独立
## jdk 的 Observer 接口
传递给 `java.util.Observer` 接口的 Subject 角色必须是 `java.util.Observable`类型的子类型，由于 JAVA 是单一继承，
导致如果 Subject 角色如果已经是 `java.util.Observable`
## jdk 实例
- ava.util.Observer/java.util.Observable
- java.util.EventListener (所有子类)
- javax.servlet.http.HttpSessionBindingListener
- javax.servlet.http.HttpSessionAttributeListener
## 相关设计模式
- [Mediator 模式](../mediator/mediator.md) 中，有时候会使用 Observer 模式来实现 Mediator 角色(仲裁者角色) 和
colleague 角色(同事角色)之间的通信。Mediator 模式中，发送的通知不过是对 Colleague 角色进行仲裁而已。Observer 模式
中，subject 角色的变化会通知 Observer 角色的目的是为了这两种角色同步。