# Intent

Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.

# Motivation

Sometimes it's necessary to record the internal state of an object.This is required when implementing checkpoints and undo mechanisms that let users back out of tentative operations or recover from errors. You must save state information somewhere so that you can restore objects to their previous states. But objects normally encapsulate some or all of their state, making it inaccessible to other objects and impossible to save externally. Exposing this state would violate encapsulation, which can compromise the application's reliability and extensibility. 

# 本质：保存和恢复内部状态