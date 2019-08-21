# Memento 模式 (备忘录模式)
备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。
## 优点
- 给用户提供`一种可以恢复状态的机制，可以使用户比较方便都会到某个历史的状态。
- 实现了信息的封装，使得用户不需要关心状态的保存细节
## 缺点
- 消耗资源。如果类的成员变量过多，势必会占用比较大的资源。而且每一次保存都会消耗一定的内存
## 使用场景
- 需要保存/恢复数据的相关场景
- 提供一个可回滚的操作,比如数据库的事物管理
## jdk 实例
- java.util.Date: 通过 fastTime 保存历史时间
## 注意事项
- 为了符合迪米特原则还必须添加一个管理备忘录的类
- 为了节约内存，可以使用[原型模式](../prototype/prototype.md) + 备忘录模式
- Caretaker 角色(负责人)决定何时使用 Memento, Originator 角色(生成者)决定生成和使用 Memento
## 相关设计模式
- command 模式可以使用 Memento 模式实现撤销功能
- State 模式中用"类"表示状态， Memento 模式中用"实例"表示状态