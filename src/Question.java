/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The Question class represents a single quiz question.
 * Each question contains the question text, two answer options,
 * and the correct answer.
 * @author 342883410 + 342927951
 */
public class Question {
    // Protected variables used in the question class
    protected String text;
    protected String optionA;
    protected String optionB;
    protected char correctAnswer;
    
    /**
     * Constructs a new Question object.
     *
     * @param text the question text
     * @param A option A text
     * @param B option B text
     * @param correct the correct answer character ('A' or 'B')
     */
    public Question(String text, String A, String B, char correct) {
        this.text = text;
        this.optionA = A;
        this.optionB = B;
        this.correctAnswer = correct;
    }
    
    /**
     * Checks whether the user's answer is correct.
     *
     * @param ans the user's selected answer
     * @return true if the answer matches the correct answer, false otherwise
     */
    public boolean checkAnswer(char ans) {
        return ans == correctAnswer;
    }
    
    /**
     * Gets the question text.
     *
     * @return the question text
     */
    public String getText() {
        return text;
    }
    
    /**
     * Gets option A from users.
     * Option A is for true.
     *
     * @return the text for option A
     */
    public String getOptionA() {
        return optionA;
    }
    
    /**
     * Gets option B from users to use later.
     * Option B is for false
     *
     * @return the text for option B
     */
    public String getOptionB() {
        return optionB;
    }
}
