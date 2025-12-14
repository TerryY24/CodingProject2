/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author snail
 */
public class EasyQuestion extends Question {
    
    //overloaded constructor
    public EasyQuestion(String text, String A, String B, char correct) {
        super(text, A, B, correct);
    }
    
    // method overriding for polymorphism
    @Override
    public boolean checkAnswer(char ans) {
        return ans == correctAnswer;
    }
}
