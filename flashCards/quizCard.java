import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class quizCard implements Serializable {

    private String uniqueID;
    private String category;
    private String question;
    private String answer;
    private String hint;

    public quizCard(String q, String a) {
        question = q;
        answer = a;
   }
    

    public void setUniqueID(String id) {
       uniqueID = id;
    }

    public String getUniqueID() {
       return uniqueID;
    }

    public void setCategory(String c) {
       category = c;
    }

    public String getCategory() {
        return category;
    }
    
    public void setQuestion(String q) {
       question = q;
    }

    public String getQuestion() {
       return question;
    }

    public void setAnswer(String a) {
       answer = a;
    }

    public String getAnswer() {
       return answer;
    }

    public void setHint(String h) {
       hint = h;
    }

    public String getHint() {
       return hint;
    }
    public static void main(String[] args) {
        quizCardBuilder qb=new quizCardBuilder();
        qb.go();
        // quizCardPlayer qp=new quizCardPlayer();
        // qp.go();

    }
}     