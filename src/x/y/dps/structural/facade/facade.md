# Intent

Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

# Motivation

Structuring a system into subsystems helps reduce complexity. A common design goal is to minimize the communication and dependencies between subsystems. One way to achieve this goal is to introduce a facade object that provides a single,simplified interface to the more general facilities of a subsystem. 

![](https://cos-1257663582.cos.ap-chengdu.myqcloud.com/Notes/Design%20Patterns/facade.jpg)

本质：封装交互，简化调用

