/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342927951
 */
public class Hard extends Question {
    // override the abstract method at the bottom of the question class
    // thisis part of reaeding from the correct flat file depending on the difficulty
    @Override
    public boolean checkAnswer(char ans) {
        return Character.toUpperCase(ans) == correctAnswer;
    }
}