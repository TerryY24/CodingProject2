import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Controls the overall quiz logic
 * Loads questions from a flat file, tracks user score
 * Manages question progression
 * instance variables and methods
 * static variables and methods
 * file input/output
 * polymorphism
 * @author KW + TY
 */

public class Quiz {
    private int score; // instance variable for tracking quiz score
    private int currentIndex; // instance variable for tracking a current question
    private ArrayList<Question> questions; // polymorphism to store EasyQuestion and HardQuestion objects
    
    private static final String EASY_FILE = "easyq.txt"; // constant and static variable, defining file for easy questions
    private static final String HARD_FILE = "hardq.txt"; // constant and static variable, defining file for hard questions
    
    public Quiz() {
        this(false); // call overloaded constructor
    }
    
    /**
     * overloaded constructor
     * create either easy or hard quiz depending on the parameter
     * @param isHard true for hard quiz, then false for easy quiz
     */
    public Quiz (boolean isHard) {
        score = 0; // initialize instance variable
        currentIndex = 0; // initialize instance variable
        questions = new ArrayList<>(); // initialize instance variable
        
        if (isHard) { // load the correct flat file based on difficulty
            loadQuestionsFromFile(HARD_FILE);
        } else {
            loadQuestionsFromFile(EASY_FILE);
        }
    }
    
    /**
     * read questions from flat-file and stores them in questions list
     * @param filename name of file to read from
     */
    public void loadQuestionsFromFile(String filename) { 
        try {
            Scanner input = new Scanner(new File(filename)); // file input
            
            while (input.hasNextLine()) {
                String line = input.nextLine();
                Question q = parseQuestion(line, filename.equals(HARD_FILE)); // static method clal to convert text line into Question object
                questions.add(q); // add to polymorphic collection
            }
            
            input.close();
        } catch (IOException e) {
            System.out.println("Error loading questions");
        }
    }
    
    /**
     * static method converting a line of text
     * into either EasyQuestion or HardQuestion object
     * static method + polymorphism
     * @param line one line from text file
     * @param isHard isHard determines which subclass to create
     * @return Question object (EasyQuestion or HardQuestion)
     */
    public static Question parseQuestion(String line, boolean isHard) {
        String[] parts = line.split(";"); //parse flat-file format
        String text = parts[0];
        String optionA = parts[1];
        String optionB = parts[2];
        char correct = parts[3].charAt(0); // correct answer, A or B
        
        if (isHard) {
            return new HardQuestion(text, optionA, optionB, correct);
        } else {
            return new EasyQuestion(text, optionA, optionB, correct);
        }
    }
    
    /**
     * return current question to be displayed
     * @return current Question or null when quiz finished
     */
    public Question displayQuestion() {
        if (currentIndex < questions.size()) {
            return questions.get(currentIndex); // polymorphic return
        }
        return null; // signal quiz completion
    }
    
    /**
     * check user answer and update score
     * @param choice answer chosen by user A or B
     */
    public void checkAnswer(char choice) {
        if (currentIndex < questions.size()) {
            Question q = questions.get(currentIndex);
            
            if (q.checkAnswer(choice)) { //polymorphic call, actual method depends on the object type
                score++;
            }
            currentIndex++;  // increment question count to keep cycling through questions
        }
    }
    
    /**
     * saves user's score to flat-file
     * file output with FileWriter
     */
    public void saveScore() {
        try {
            FileWriter writer = new FileWriter("results.txt", true); //create new txt file for quiz scores
            writer.write("Score: " + score + "/" + questions.size() + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving score");
        }
    }
    
    /**
     * return users score
     * @return quiz score
     */
    public int getScore() {
        return score;
    }
}
