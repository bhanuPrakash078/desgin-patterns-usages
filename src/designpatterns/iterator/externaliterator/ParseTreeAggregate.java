package designpatterns.iterator.externaliterator;

class ParseTreeAggregate implements MyAggregate<String> {

    Node root;

    static class Node {
        String value;
        Node left, right;

        Node(String val) {
            this.value = val;
        }
    }

    public ParseTreeAggregate() {
        this.root = new Node("charlie");
        this.root.left = new Node("Alice");
        this.root.right = new Node("Bob");
    }

    @Override
    public MyIterator<String> createIterator() {
        return new ParseTreeIterator(root);
    }
}
