# Intent

Allow an object to alter its behavior when its internal state changes.The object will appear to change its class. 

# Motivation

Consider a class TCPConnection that represents a network connection.A TCPConnection object can be in one of several different states:Established,Listening, Closed. When a TCPConnection object receives requests from other objects,it responds differently depending on its current state. 

# 本质：根据状态来分离和选择行为

