
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

    WordFreq [] phrases = {
            new WordFreq("happy", 400),
        new WordFreq("satisfied", 100),
        new WordFreq("neutral", 300),
        new WordFreq("would buy again", 200),
        new WordFreq("terrible", 160),
        new WordFreq("inconvenient", 900),
        new WordFreq("difficult to use", 100),
        new WordFreq("easy to use", 140),
        new WordFreq("would recommend to friends", 800),
        new WordFreq("visit the store", 700)
    };

    BuildMaxHeap.buildMaxHeap(phrases);

    System.out.print(Arrays.toString(phrases) + " ");


    }
}