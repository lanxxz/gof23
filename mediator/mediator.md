# Mediator 模式(仲裁者模式)
Mediator 模式添加第三方对象（称为 mediator）来控制两个对象（称为同事）之间的交互。
它有助于减少彼此通信的类之间的耦合。因为现在他们不需要了解彼此的实现。  
## 优点
- 降低了类的复杂度麻将一对多转化为一对一
- 各个类之间解耦
- 符合迪米特原则
## 缺点
- 中介者会很庞大，变的难以维护
## 使用场景
- 系统中对象之间存在复杂的引用关系，导致
他们之间的依赖关系结构混乱或者难以复用该对象
- 想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类
## 实例
- MVC 框架中，其中的 C（控制器）就是 M(模型) 和 V（视图）的中介者。
- java.util.Timer (所有scheduleXXX()方法)
- java.util.concurrent.Executor#execute()
- java.util.concurrent.ExecutorService (invokeXXX()和submit()方法)
- java.util.concurrent.ScheduledExecutorService (所有scheduleXXX()方法)
## 相关设计模式
- Mediator 模式中， modiator 角色和 Colleague 角色 进行交互; Facade 模式中， facade 角色但方便地使用
其他角色来对外提供高层接口(API)。所以，Mediator 是双向的，而 facade 是单向的。
- 有时候， Madiator 模式会使用Observer模式来实现 Mediator 角色和 Colleague 角色通信。