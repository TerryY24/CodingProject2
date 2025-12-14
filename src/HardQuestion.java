/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author snail
 */
public class HardQuestion extends Question {
    
    //overloaded constructor
    public HardQuestion(String text, String A, String B, char correct) {
        super(text, A, B, correct);
    }
    
    // method overriding for polymorphism
    @Override
    public boolean checkAnswer(char ans) {
        return ans == correctAnswer;
    }
}
