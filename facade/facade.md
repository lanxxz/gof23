# Facade 模式 (门面模式)
门面模式又称外观模式。  
Facade 模式为互相关联在一起的错综复杂的类整理出一个高层接口(API)，
其中的 Facade角色可以让系统对外只有一个简单的接口(API)。而且 Facade 角色
还会考虑到系统内部各个类之间的责任关系和依赖关系，按照正确的顺序调整各个类。  
## 优点
- 减少系统相互依赖
- 提高灵活性
- 提高安全性
## 缺点
- 不符合开闭原则，如果要修改东西很麻烦，继承重写都不合适
## 使用场景
- 为复杂的模块提供外界访问的模块
- 子系统相对独立
- 预防低水平人员带来的风险
- JAVA 的三层开发模式
- 可以递归的使用 Facade 模式 来降低复杂系统的耦合度
- 希望控制把控入口，外部只能通过某个类来访问，这样以后要换方案就不会影响外部使用。
## JDK 实例
- java.lang.Class
- javax.faces.webapp.FacesServlet
## 相关设计模式
- Abstract Factory 模式:可以看做 Facade 模式的复杂版
- Singleton 模式: 有时候可以使用 Singleton 模式创建 Facade 角色
- Mediator 模式: Facade 角色使用其他角色来提供高层接口。 
Mediator 角色作为 Colleague 角色间的仲裁者，负责调停。
可以说，Facade 模式是单向的，Mediator 模式是双向的。
## 参考文章
- [设计模式系列·Facade模式之MVC的烦恼](https://juejin.im/post/58daecb244d904006887abd2)

