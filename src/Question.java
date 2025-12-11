/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342883410
 */
public abstract class Question {
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
    
    // abstract method, so it has no body in question class, subclasses must provide
    public abstract boolean checkAnswer(char ans);
}
