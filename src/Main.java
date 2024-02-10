import java.io.IOException;
import java.util.List;

public class Main{
    public static void main(String[] args){

        LetterOperations letterOperations = new LetterOperations("src/Letter.txt");
        try{
            int[] CharFrequency = letterOperations.CharsFrequency();
            letterOperations.insertCharsFrequency(CharFrequency);
            letterOperations.displaySortedLinkedList();

            // HuffmanTree huffmanTree = new HuffmanTree();

            Node[] nodeArray = letterOperations.sortedLinkedlist.linkedlistToArray();
            Node  huffmanCodes = HuffmanTreeBuilder.buildHuffmanTree(nodeArray);

            HuffmanTree huffmanTree = new HuffmanTree();
            System.out.println("huffman codes:");
            huffmanTree.writeHuffmanCodes(huffmanCodes,"");

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
