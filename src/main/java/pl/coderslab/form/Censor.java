package pl.coderslab.form;

import java.util.Collections;

public class Censor {

    private static final String[] NOT_ALLOWED_WORDS = {"kurde", "motyla noga", "kota"};
    public static String doCensor(String userText) {

        for (String word:NOT_ALLOWED_WORDS
             ) {
            String stars = String.join("", Collections.nCopies(word.length(),"*"));
           userText=userText.replaceAll(word,stars);

        }
        return userText;
    }
}
