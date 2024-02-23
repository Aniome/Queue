package org.queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int length = scanner.nextInt();
        Queue queue = new Queue(length);
        while (true){
            System.out.print("Choose operation: push or pop? Enter 'exit' for leave. ");
            switch (scanner.next()){
                case "push":
                    if (queue.isFull()){
                        System.out.println("Queue is full");
                        break;
                    }
                    System.out.print("Enter number: ");
                    int response = queue.push(scanner.nextInt());
                    if (response == 0){
                        System.out.println("Data has been pushed");
                    }
                    break;
                case "pop":
                    if (queue.isEmpty()){
                        System.out.println("Queue is empty");
                        break;
                    }
                    System.out.println(queue.pop());
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        }
    }
}