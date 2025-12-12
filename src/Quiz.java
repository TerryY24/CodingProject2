import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342927951
 */

public class Quiz {
    private int score;
    private int currentIndex;
    private Difficulty difficulty;
    
    private ArrayList<Question> questions;
    
    private static final String EASY_FILE = "easyq.txt";
    private static final String HARD_FILE = "hardq.txt";
    
    public Quiz(){
        this.difficulty = new Difficulty("level");
        this.score = 0;
        this.currentIndex = 0;
    }
    
    public Quiz(Difficulty difficulty){
        this.difficulty = difficulty;
    }
    
    public void loadQuestionFromFile(String filename){
        try{
            Scanner fileInput = new Scanner (new File("easyq.txt"));
            
        }
    }
    
    public void saveScore(){
        
    }
    
    public void displayQuestion(){
        
    }
    
    public void checkAnswer(String choice){
        
    }
    
    public int getScore(){
       return score; 
    }
    
    public Difficulty getDifficulty(){
        return difficulty;
    }
    
    
}
