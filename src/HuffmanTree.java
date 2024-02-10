import java.util.*;

public class HuffmanTree {

    public void writeHuffmanCodes(Node node, String code) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.println("Char: " + node.data + ", Code: " + code);
            }
            writeHuffmanCodes(node.left, code + "0");
            writeHuffmanCodes(node.right, code + "1");
        }
    }
}

