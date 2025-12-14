/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342883410
 */
public class Question {
    protected String text;
    protected String optionA;
    protected String optionB;
    protected char correctAnswer;
    
    public Question(String text, String A, String B, char correct) {
        this.text = text;
        this.optionA = A;
        this.optionB = B;
        this.correctAnswer = correct;
    }
    
    public boolean checkAnswer(char ans) {
        return ans == correctAnswer;
    }
    
    public String getText() {
        return text;
    }
    
    public String getOptionA() {
        return optionA;
    }
    
    public String getOptionB() {
        return optionB;
    }
}
