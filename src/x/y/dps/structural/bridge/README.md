# Intent

Decouple an abstraction from its implementation so that the two can vary independently.

# Motivation

When an abstraction can have one of several possible implementations, the usual way to accommodate them is to use inheritance. An abstract class defines the interface to the abstraction, and concrete subclasses implement it in different ways. But this approach isn't always flexible enough. Inheritance binds an implementation to the abstraction permanently, which makes it difficult to modify,extend, and reuse abstractions and implementations independently. 

# 本质：分离抽象和实现

# Java中的JDBC体现了桥接模式

