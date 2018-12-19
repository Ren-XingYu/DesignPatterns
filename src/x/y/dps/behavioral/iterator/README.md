# Intent

Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

# Motivation

An aggregate object such as a list should give you a way to access its elements without exposing its internal structure. Moreover, you might want to traverse the list in different ways, depending on what you want to accomplish. But you probably don't want to bloat the List interface with operations for different traversals,even if you could anticipate the ones you will need. You might also need to have more than one traversal pending on the same list. 

# 本质：控制访问集合对象中的元素

