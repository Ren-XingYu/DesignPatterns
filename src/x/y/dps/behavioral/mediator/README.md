# Intent

Define an object that encapsulates how a set of objects interact.Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently. 

中介模式通过引入一个中介对象，让其它对象都只和中介对象交互，而中介对象指导如何和其他所有的对象交互，这样对象的交互关系就没有了，从而实现了对象之间的解耦

# Motivation

Object-oriented design encourages the distribution of behavior among objects. Such distribution can result in an object structure with many connections between objects; in the worst case, every object ends up knowing about every other. 

![](https://cos-1257663582.cos.ap-chengdu.myqcloud.com/Notes/Design%20Patterns/mediator_1.jpg)

![](https://cos-1257663582.cos.ap-chengdu.myqcloud.com/Notes/Design%20Patterns/mediator_2.jpg)

# 本质：封装交互

例如部门类和人员类是多对多关系，可以利用中介者模式来实现部门类和人员类之间的解耦





