// Reads the .xlsx file that stores the questions.
// Sets difficulty and gets a collection of questions, code snippets (if any), and its answers.
// This also deploys the game mechanics of if there are code snippets or none.

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.io.IOException;
import java.net.URL;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class QuestionSheet {
    public void setDifficulty(String difficulty) {
        
        int max = 0, min = 0;
        if(difficulty == "easy") {
            min = 2; max = 72; questionsMaxNum = 20;
        }else if(difficulty == "moderate") {
            min = 72; max = 117; questionsMaxNum = 15;
        }else if(difficulty == "hard") {
            min = 117; max = 147; questionsMaxNum = 10;
        }

        generated = new LinkedList<>();
        while (generated.size() < questionsMaxNum) {
            int random = getRandom(min, max);
            if(!generated.contains(random))
                generated.add(random);
        }
    }

    public void displayQuestion() {
        try {
            XSSFWorkbook wb = new XSSFWorkbook(getClass().getClassLoader().getResourceAsStream("questions.xlsx"));
            XSSFSheet sheet = wb.getSheetAt(0);
            
                CellReference cellReferenceQues = new CellReference("E" + generated.get(Scores.questionsNum).toString()); 
                Row rowQues = sheet.getRow(cellReferenceQues.getRow());
                Cell cellQues = rowQues.getCell(cellReferenceQues.getCol());
                Ques = cellQues.toString(); 

                String choices = "FGHI";
                List<Integer> choicesNum = new LinkedList<>();
                while (choicesNum.size() < choices.length()) {
                    int random = getRandom(0, 4);
                    if(!choicesNum.contains(random))
                        choicesNum.add(random);
                }
                    
                CellReference cellReferenceA = new CellReference(choices.charAt(choicesNum.get(0)) + generated.get(Scores.questionsNum).toString()); 
                Row rowA = sheet.getRow(cellReferenceA.getRow());
                Cell cellA = rowA.getCell(cellReferenceA.getCol()); 
                A = String.valueOf(cellA);
                urlA = getClass().getResource(A);
                if(urlA == null) 
                    hasLinkA = false;
                else {
                    hasLinkA = true;
                    A = "Click to open code.\nClick code to select answer.";
                }

                CellReference cellReferenceB = new CellReference(choices.charAt(choicesNum.get(1)) + generated.get(Scores.questionsNum).toString()); 
                Row rowB = sheet.getRow(cellReferenceB.getRow());
                Cell cellB = rowB.getCell(cellReferenceB.getCol()); 
                B = String.valueOf(cellB);
                urlB = getClass().getResource(B);
                if(urlB == null) 
                    hasLinkB = false;
                else {
                    hasLinkB = true;
                    B = "Click to open code.\nClick code to select answer.";
                }

                CellReference cellReferenceC = new CellReference(choices.charAt(choicesNum.get(2)) + generated.get(Scores.questionsNum).toString()); 
                Row rowC = sheet.getRow(cellReferenceC.getRow());
                Cell cellC = rowC.getCell(cellReferenceC.getCol()); 
                C = String.valueOf(cellC);
                urlC = getClass().getResource(C);
                if(urlC == null) 
                    hasLinkC = false;
                else {
                    hasLinkC = true;
                    C = "Click to open code.\nClick code to select answer.";
                }

                CellReference cellReferenceD = new CellReference(choices.charAt(choicesNum.get(3)) + generated.get(Scores.questionsNum).toString()); 
                Row rowD = sheet.getRow(cellReferenceD.getRow());
                Cell cellD = rowD.getCell(cellReferenceD.getCol()); 
                D = String.valueOf(cellD);
                urlD = getClass().getResource(D);
                if(urlD == null) 
                    hasLinkD = false;
                else {
                    hasLinkD = true;
                    D = "Click to open code.\nClick code to select answer.";
                }

                CellReference cellReferenceAns = new CellReference("J" + generated.get(Scores.questionsNum).toString()); 
                Row rowAns = sheet.getRow(cellReferenceAns.getRow());
                Cell cellAns = rowAns.getCell(cellReferenceAns.getCol());
                if(cellAns.toString() == "A") answerInt = 0;
                if(cellAns.toString() == "B") answerInt = 1;
                if(cellAns.toString() == "C") answerInt = 2;
                if(cellAns.toString() == "D") answerInt = 3;
                answerIntFinal = choicesNum.indexOf(answerInt);

                CellReference cellReferenceLink = new CellReference("K" + generated.get(Scores.questionsNum).toString()); 
                Row rowLink = sheet.getRow(cellReferenceLink.getRow());
                Cell cellLink = rowLink.getCell(cellReferenceLink.getCol());
                link = String.valueOf(cellLink);
                urlLink = getClass().getResource(link);
                if(cellLink== null) 
                    hasLink = false;
                else
                    hasLink = true;
                
                Scores.questionsNum++;

                gameplay = new Gameplay();
                gameplay.setVisible(true);
                gameplay.setLocationRelativeTo(null);
        } catch (IOException e) {
        }
    }

    public static int getRandom(int from, int to) {
        if (from < to)
            return from + new Random().nextInt(Math.abs(to - from));
        return from - new Random().nextInt(Math.abs(to - from));
    }

    public int answerInt, answerIntFinal;
    public int questionsMaxNum;
    public String Ques, A, B, C, D, link;
    public static Gameplay gameplay;
    public boolean hasLink, hasLinkA, hasLinkB, hasLinkC, hasLinkD; 
    public URL urlLink, urlA, urlB, urlC, urlD;
    List<Integer> generated;
}   