# Intent

Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

# Motivation

You could build an editor for music scores by customizing a general framework for graphical editors and adding new objects that represent notes, rests, and staves. 

# 本质：克隆生成对象

# Java中的clone方法

    需要实现java.lang.Cloneable接口
    public Object clone(){
        Object obj=null;
        try{
            obj=super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace()
        }
        return obj;
    }
    
 浅度克隆：只负责克隆按值传递的数据（比如基本数据类型、String类型）
 深度克隆：除了浅度克隆要克隆的值外，还负责克隆引用数据类型的数据，基本上就是被克隆实例所有属性数据都会被克隆出来
 
 