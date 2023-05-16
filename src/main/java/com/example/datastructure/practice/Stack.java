package com.example.datastructure.practice;

public class Stack {

    private int size;
    private int[] stack;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    public void push(int data) {

        stack[++top] = data;

    }

    public int pop() {

        int pop = stack[top];
        stack[top--] = 0;
        return pop;
    }

    public int peek() {

        return stack[top];

    }
}
