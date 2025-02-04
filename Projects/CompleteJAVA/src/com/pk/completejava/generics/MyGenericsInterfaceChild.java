package com.pk.completejava.generics;

public class MyGenericsInterfaceChild<T> implements MyGenericsInterface<T> {
    private T var;

    @Override
    public T getVar() {
        return var;
    }

    @Override
    public void setVar(T var) {
        this.var = var;
    }
}
