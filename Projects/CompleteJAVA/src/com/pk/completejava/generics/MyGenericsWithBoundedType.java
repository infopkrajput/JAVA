package com.pk.completejava.generics;

public class  MyGenericsWithBoundedType <T extends Number>  {
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}
