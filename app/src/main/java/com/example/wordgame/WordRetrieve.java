package com.example.wordgame;

import android.content.Context;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//Handles the retrieving of word form a file
public class WordRetrieve {

    private Context context;
    private String word = null;
    private ArrayList<String> wordsPalyed = new ArrayList<String>();

    public WordRetrieve(Context context){
        this.context = context;
        setWord();
    }

    public String getWord(){
        return word;
    }

    public void setWord(){
        try{
            word = retrieveWord();
        }catch (IOException e){
            System.out.println("File not found");
            //TODO: how to handle this. Notify user? -> own class that print error to UI in error cases
        }
        
    }

    private String retrieveWord() throws IOException {

        boolean found = true;//switch for if the word has already been played
        String candidateWord = null;
        //retrieves the word that hasn't been in the game yet from txt.file
        Scanner reader = new Scanner(context.getAssets().open("Words.txt"));

        while (reader.hasNextLine() && found) {
            candidateWord = reader.nextLine();
            for (String word : wordsPalyed){
                if (candidateWord.equals(word)) {
                //if the word is found a new word must be fetched
                    if (!reader.hasNextLine()) {
                        //File is finished and there are no words left to play
                        break;
                        //TODO: handle no more words situation?
                        }
                    candidateWord = reader.nextLine();
                }
            }
            //Search ends, candidate word is not in array and can be played
            found = false;
        }
        reader.close();
        return candidateWord;
    }

}
