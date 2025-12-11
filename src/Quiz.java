import java.util.ArrayList;
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
    }
    
    public Quiz(Difficulty difficulty){
        this.difficulty = difficulty;
    }
    
    public void loadQuestionFromFile(String filename){
        
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
    
    public Difficulty difficulty(){
        
    }
    
    
}
