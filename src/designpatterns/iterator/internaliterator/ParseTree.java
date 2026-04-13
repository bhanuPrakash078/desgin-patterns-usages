package designpatterns.iterator.internaliterator;

import java.util.Stack;
import java.util.function.Consumer;

class ParseTree implements MyAggregate<String> {
    Node root;

    static class Node {
        String value;
        Node left, right;

        Node(String val) {
            this.value = val;
        }
    }

    public ParseTree() {
        this.root = new Node("charlie");
        this.root.left = new Node("Alice");
        this.root.right = new Node("Bob");
    }

    @Override
    public void internalIterate(Consumer<String> consumer) {
        MyIterator<String> it = createIterator();
        while (it.hasNext()) {
           consumer.accept(it.next());
        }
    }

    @Override
    public MyIterator<String> createIterator() {
        return new TreeIterator(root);
    }

    private class TreeIterator implements MyIterator<String> {
        private Stack<Node> stack = new Stack<>();

        TreeIterator(Node root) {
            if (root != null) stack.push(root);
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public String next() {
            Node node = stack.pop();
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
            return node.value;
        }
    }
}
