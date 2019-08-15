package quotes;

import java.util.ArrayList;
import java.util.Random;

public class Quotes {
    ArrayList<String> tags;
    String author;
    String likes;
    String text;


    public Quotes(ArrayList tags, String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    public String toString() {
        return "Quotes{" +
                "tags=" + tags +
                ", author='" + author + '\'' +
                ", likes='" + likes + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

}
