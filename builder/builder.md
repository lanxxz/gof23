# Builder 模式(建造者模式)
Builder 模式是使用多个简单对象一步一步构建成复杂的对象。
## 优点
- 可替换性
- 可扩展性
- 便于风险控制
- 与构造器相比，它可以有多个可变参数
## 缺点
- 产品必须有共同点
- 内部变化复杂，会有很多建造类
## 场景
- 需要生成的对象具有复杂的内部结构
- 需要生成的对象内部属性本身相互依赖
## JDK 实例
- `StringBuilder`
## 注意事项
- 与工厂模式的区别是，建造者模式更加关注与零件装配的顺序