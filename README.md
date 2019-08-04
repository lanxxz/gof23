# 七大设计模式原则  
- __单一职责原则__：一个类只负责一个功能领域的相应职责。  
- __开闭原则__：对扩展开发，对修改关闭。  
- __里氏代换原则__：子类可以扩展父类功能，但是不能改变父类原有的功能。  
- __依赖倒转原则__：高层模块不应该依赖低层模块，二者都应该依赖其抽象。  
- __接口隔离原则__：使用多个隔离的接口比使用单个接口要好。将臃肿庞大的接口拆分成更小的接口。  
- __合成复用原则__：用合成/聚合的地方，不能用继承。尽量先用合成/聚合的等关联关系实现，其次才考虑继承关系实现。  
- __迪米特法则(最少知道原则)__：一个实体应该尽量少的与其他实体之间发生相互作用，使得系统功能模块相对独立。    
#   设计模式
__设计模式__ 是反复出现问题的解决方案，是如何解决某些问题的指导方针。设计模式 可以分为三大类：创建型设计模式、结构型设计模式 和 行为型设计模式。  
## 维基百科定义
在软件工程中，软件设计模式是软件设计中给定上下文中常见问题的通用可重用解决方案。
它不是可以直接转换为源代码或机器代码的完成设计。它是如何解决可在许多不同情况下使用的问题的描述或模板。  
## 创建型设计模式  
提供对象创建机制，增加现有代码灵活性和复用性。  
- [Singleton 模式](./sigleton/sigleton.md)
- [Simple Factory 模式](./simple-factory/simpleFactory.md)
- [Factory Method 模式](./factory-method/FactoryMethod.md)
- [Abstract Factory 模式](./abstract-factory/abstract-factory.md)
- [Builder 模式](./builder/builder.md)
- [Prototype 模式](./prototype/prototype.md)
## 结构型设计模式  
解释如何将对象和类组装成更大的结构，同时保持结构的灵活性和高效性。  
- [Adapter 模式](./adapter/Adapter.md)
- [Bridge 模式](./bridge/bridge.md)
- [Composite 模式](./composite/composite.md)
- [Decorator 模式](./decorator/decorator.md)
- [Facade 模式](./facade/facade.md)
- Flyweight 模式
- Proxy 模式
## 行为型设计模式  
负责有效的沟通和对象之间的责任分配。  
- [Iterator 模式](./iterator/Iterator.md)
- [Chain of Resposibility 模式](./chainOfResponsibility/chainOfResponsibility.md)
- Command 模式
- Interpreter 模式
- Mediator 模式
- Memento 模式
- Observer 模式
- State 模式
- [Strategy 模式](./strategy/strategy.md)
- [Template Method 模式](./template-method/TemplateMethod.md)
- [Visitor 模式](./visitor/visitor.md)  
# GoF23
__GoF23__ 是指 被称为 Gang of Four(GoF) 的四个人整理出来的 23 种设计模式。  
包括：Singleton 模式、  Abstract Factory 模式、
Factory Method 模式、Builder 模式、Prototype 模式、
Adapter 模式、Bridge 模式、Composite 模式、
Decorator 模式、Facade 模式、Flyweight 模式、Proxy 模式、
Iterator 模式、Chain of Resposibility 模式、Command 模式、
Interpreter 模式、Mediator 模式、Memento 模式、Observer 模式、
State 模式、Strategy 模式、Template Method 模式 和 Visitor 模式。  



