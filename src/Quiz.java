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
 *
 * @author 342927951
 */

public class Quiz {
    private int score;
    private int currentIndex;
    private ArrayList<Question> questions;
    
    private static final String EASY_FILE = "easyq.txt";
    private static final String HARD_FILE = "hardq.txt";
    
    public Quiz() {
        this(false);
    }
    
    public Quiz (boolean isHard) {
        score = 0;
        currentIndex = 0;
        questions = new ArrayList<>();
        
        if (isHard) {
            loadQuestionsFromFile(HARD_FILE);
        } else {
            loadQuestionsFromFile(EASY_FILE);
        }
    }
    
    public void loadQuestionsFromFile(String filename) {
        try {
            Scanner input = new Scanner(new File(filename));
            
            while (input.hasNextLine()) {
                String line = input.nextLine();
                Question q = parseQuestion(line, filename.equals(HARD_FILE));
                questions.add(q);
            }
            
            input.close();
        } catch (IOException e) {
            System.out.println("Error loading questions");
        }
    }
    
    public static Question parseQuestion(String line, boolean isHard) {
        String[] parts = line.split(";");
        String text = parts[0];
        String optionA = parts[1];
        String optionB = parts[2];
        char correct = parts[3].charAt(0);
        
        if (isHard) {
            return new HardQuestion(text, optionA, optionB, correct);
        } else {
            return new EasyQuestion(text, optionA, optionB, correct);
        }
    }
    
    public Question displayQuestion() {
        if (currentIndex < questions.size()) {
            return questions.get(currentIndex);
        }
        return null; //
    }
    
    public void checkAnswer(char choice) {
        if (currentIndex < questions.size()) {
            Question q = questions.get(currentIndex);
            
            if (q.checkAnswer(choice)) {
                score++;
            }
            currentIndex++;  // increment question count to keep cycling through questions
        }
    }
    
    public void saveScore() {
        try {
            FileWriter writer = new FileWriter("results.txt", true); //create new txt file for quiz scores
            writer.write("Score: " + score + "/" + questions.size() + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving score");
        }
    }
    
    public int getScore() {
        return score;
    }
}
