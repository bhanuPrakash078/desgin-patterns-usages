package designpatterns.iterator.externaliterator;

import java.util.Stack;

public class ParseTreeIterator implements MyIterator<String> {
    private Stack<ParseTreeAggregate.Node> stack = new Stack<>();

    ParseTreeIterator(ParseTreeAggregate.Node root) {
        if (root != null) stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public String next() {
        ParseTreeAggregate.Node node = stack.pop();
        if (node.right != null) stack.push(node.right);
        if (node.left != null) stack.push(node.left);
        return node.value;
    }
}
