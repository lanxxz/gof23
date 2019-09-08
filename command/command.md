# Command 模式 (命令模式)
命令模式是将请求封装成一个对象，从而可以同不同的请求对客户端进行参数化。  
通过调用者调用接受设执行命令: 调用者 -> 接受者 -> 命令。
## 优点
- 降低系统的耦合度
- 新的命令容易调价到系统中
## 缺点
- 使用命令模式会导致系统会有过多的命令
## 使用场景
- 认为是命令的地方都可以使用命令模式。比如 GUI中每一个按钮都是一个命令;模拟CMD等
## JDK 实例
- java.lang.Runnable
- javax.swing.Action
## 相关设计模式
- [Composite 模式](../composite/composite.md): 有时候使用该设计模式实现宏命令
- [Memento 模式](../memento/memento.md): 使用该设计模式保存 command角色的历史记录
- [Prototype 模式](../prototype/prototype.md): 有时候使用该模式复制发生的事件(生成的命令)
