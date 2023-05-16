package com.example.datastructure.practice;

public class LinkedList {
    static class Node {

        private int value;
        private Node node;

        public Node(int value) {
            this.value = value;
            this.node = null;
        }

        public void addLast(int data) {

            Node newNode = new Node(data);
            this.node = newNode;
        }

        public void removeLast() {

            this.node = null;

        }

        public void addNode(Node node, int location) {


        }

        public void removeNode(Node node) {

        }
    }

}
