public class Tree {
    private static class Node {
        protected int data;
        private Node leftChild;
        private Node rightChild;

        public Node(int data) {
            this.data = data;
            this.leftChild=null;
            this.rightChild=null;
        }
    }
    protected Node root;

    }

}