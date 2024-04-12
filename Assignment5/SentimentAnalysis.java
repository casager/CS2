/* The following program gives the average sentiment of a
 * movie review when given the tsv file dataset for sentiments of 
 * smaller phrases within the sentence review.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SentimentAnalysis {
    static class ReviewEntry{ //make static since accessing nested class, dont need outer instance
        private int sentenceID;
        private int totalScore = 0;
        private int num_phrases = 0;

        public ReviewEntry(int sentenceID) {
            this.sentenceID = sentenceID;
        }
        public void updateEntry(int sentimentValue){
            totalScore += sentimentValue;
            num_phrases++;
        }
        public int getSentenceID(){
            return sentenceID;
        }
        public int getTotalScore(){
            return totalScore;
        }
        public int getNumPhrases(){
            return num_phrases;
        }
        public float calculateRating(){
            float rating = (float)totalScore/(float)num_phrases;
            return rating;
        }
    }
    public static void main(String[] args) {
        ReviewEntry[] entryList = new ReviewEntry[8544];
        String filePath = "movieReviews-1.tsv"; //file path for tsv file
        int sentenceID;
        int sentimentValue;
        String[] tokens;

        int userInput;
        float inputRating;
        int inputPhrases;
        String finalSentiment=null;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) { //use buffered reader for line input
            String line;
            reader.readLine();
            line = reader.readLine();
            // Split each line on tabs
            tokens = line.split("\t");
            sentenceID = Integer.parseInt(tokens[1]);
            sentimentValue = Integer.parseInt(tokens[3]);
            int i = 0;
            while (line != null) {
                entryList[i] = new ReviewEntry(i+1);//set current entry ID
                while(sentenceID == entryList[i].getSentenceID()){//move to next entry if sentenceID does not match current entry ID
                    entryList[i].updateEntry(sentimentValue); //updates entry value
                    line = reader.readLine(); //read next line of file
                    if(line==null)break;
                    tokens = line.split("\t");
                    sentenceID = Integer.parseInt(tokens[1]); //reset sentenceID/sentiment value to next line
                    sentimentValue = Integer.parseInt(tokens[3]);
                }
                i++;
            }
        } catch (IOException e) { 
            System.err.println("Error reading the file: " + e.getMessage());
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Sentence ID for Sentiment Analyis (Integers 1-8544):");
        userInput = scan.nextInt(); //takes user input
        inputRating = entryList[userInput-1].calculateRating();
        inputPhrases = entryList[userInput-1].getNumPhrases();
        if (inputRating >= 0 && inputRating <2){ //generates sentiment string
            finalSentiment = "negative";
        }
        else if (inputRating >= 2 && inputRating <3){
            finalSentiment = "neutral";
        }
        else if (inputRating >= 3 && inputRating <4){
            finalSentiment = "positive";
        }
        
        System.out.printf("Sentence ID %d has %d phrases with an average rating of %.2f. The overall sentiment is %s.", 
            userInput, inputPhrases, inputRating,finalSentiment);

        scan.close();
    }
}
