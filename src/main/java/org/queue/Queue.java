package org.queue;

public class Queue {
    private int[] queue;
    private int ind;
    public Queue(int length){
        queue = new int[length];
    }

    public int push(int data){
        queue[ind] = data;
        ind++;
        return 0;
    }

    public int pop(){
        int data = queue[0];
        ind--;
        for (int i = 0; i < ind; i++){
            queue[i] = queue[i + 1];
        }
        return data;
    }

    public boolean isEmpty(){
        return ind == 0;
    }

    public boolean isFull(){
        return ind == queue.length;
    }
}
