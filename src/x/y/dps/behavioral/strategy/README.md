# Intent

Define a family of algorithms, encapsulate each one, and make them interchangeable.Strategy lets the algorithm vary independently from clients that use it.

# Motivation

Many algorithms exist for breaking a stream of text into lines.

# 本质：分离算法，选择实现

# Strategy可以实现容错机制恢复，在catch中实现日志记录