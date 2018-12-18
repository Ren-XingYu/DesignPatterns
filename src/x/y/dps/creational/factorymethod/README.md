# Intent

Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses. 

# Motivation
Frameworks use abstract classes to define and maintain relationships between objects. A framework is often responsible for creating these objects as well. 

# 本质：延迟到子类来选择实现

# 可以用来实现框架，可用来实现Spring的Ioc和DI


