import java.util.PriorityQueue;

class HuffmanTreeBuilder {
    public static Node buildHuffmanTree(Node[] nodesArray) {
        PriorityQueue<Node> pQueue = new PriorityQueue<>((a, b) -> a.frequency - b.frequency);

        for (Node node : nodesArray) {
            pQueue.offer(new Node(node.data, node.frequency));
        }

        while (pQueue.size() > 1) {
            Node left = pQueue.poll();
            Node right = pQueue.poll();

            Node selectedNode = new Node('-', left.frequency + right.frequency);
            selectedNode.left = left;
            selectedNode.right = right;

            pQueue.offer(selectedNode);
        }
        return pQueue.poll();
    }
}