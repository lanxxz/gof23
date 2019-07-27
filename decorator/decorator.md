# Decorator 模式(装饰器模式)
装饰器模式允许向现有模式添加新功能,同时又不改变其结构。  
这种模式创建了一个装饰类，用来包装原有的类，并保持类方法签名完整的情况下，提供额外的功能。  
## 特点
- 可以代替继承
- 具有递归结构,通过增加装饰物来增加对象的功能
- 委托，对"装饰边框"提出的要求会被转交(委托)给"被装饰物"去处理
## 主要解决
- 扩展一个类经常适用继承来实现，由于继承为类引入静态特征，
并且随着扩展功能的增多，子类会很膨胀
## 优点
- 装饰类和被装饰类弱关联，不会相互耦合
- 接口(API)透明性，装饰类与被装饰类具有一致性
- 在不改变被装饰类的前提下增加功能
- 可以动态的增加功能
- 只需要一些装饰物就可以添加很多功能。提供一些只有简单功能的装饰物，可以将他们组装成新的对象
## 缺点
- 多重装饰比较复杂
- 增加许多很小的类
## 应用场景
- 扩展一个类的功能
- 动态增加功能，动态撤销
## JDK 实例
### java.io 包
- java.io.BufferedInputStream(InputStream)
- java.io.DataInputStream(InputStream)
- java.io.BufferedOutputStream(OutputStream)
- ...
### 其他实例
- java.util.zip.ZipOutputStream(OutputStream)
- java.util.Collections#checked{List|Map|Set|SortedSet|SortedMap}()
## 相关设计模式区别
### Adapter 模式
- [Adapter 模式](../adapter/Adapter.md) 适用于两个不同接口
- Decorator 模式适用于在不改变装饰物的接口的前提下，为被装饰物添加边框(透明性)
### Stragety 模式
- [Stragety 模式](../strategy/strategy.md) 通过整体替换来改变类的功能
- Decorator 模式 可以向改变装饰物的边框或者是为被装饰物的添加多重边框那样来增加类的功能
## 补充内容
- 父类和子类:父类和子类具有一致性。子类可以继承父类的方法；父类当做子类操作前需要进行类型转换
- 委托:委托让接口具有透明性，自己和被委托对象具有一致性
