import java.io.*;

public class LetterOperations extends SortedLinkedlist {
    private final String txtFile;

    public LetterOperations(String txtFile){
        this.txtFile = txtFile;

    }

    public int[] CharsFrequency() throws IOException{
        int [] CFrequency = new int[355];
        try(BufferedReader bReader = new BufferedReader(new FileReader(txtFile))){
            int initialChar;
            while((initialChar =bReader.read()) != -1){
                CFrequency[initialChar]++;
            }
        }
        return CFrequency;
    }
    SortedLinkedlist sortedLinkedlist = new SortedLinkedlist();

    public void insertCharsFrequency(int[] array){
        int i;
        for( i = 0;i<array.length;i++){
            if(array[i]>0){
                sortedLinkedlist.insert((char)i,array[i]);
            }
        }

    }

    public void displaySortedLinkedList() {
        System.out.println("Chars and their Frequency:");
        sortedLinkedlist.display();


    }


}
