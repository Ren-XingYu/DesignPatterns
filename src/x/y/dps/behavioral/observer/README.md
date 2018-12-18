# Intent

Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

# Motivation

A common side-effect of partitioning a system into a collection of cooperating classes is the need to maintain consistency between related objects. You don't want to achieve consistency by making the classes tightly coupled, because that reduces their reusability. 

# 本质：触发联动

# 推模型：目标对象主动向观察者推送目标的详细信息，不管观察者是否需要，推送的信息通常是目标对象的全部或部分数据，相当于是在广播通信。在观察者的update方法中传递的是内容
# 拉模型：目标对象在通知观察者的时候，只传递少量信息。如果观察者需要更具体的信息，由观察者主动到目标对象中获取，相当于是观察者从目标对象中拉数据。在观察者的update方法中传递的是subject的引用

# Java内置观察者模式实现，Observable接口相当于目标对象,Observer相当于观察者对象

# Java Swing中的事件处理机制用的观察者模式