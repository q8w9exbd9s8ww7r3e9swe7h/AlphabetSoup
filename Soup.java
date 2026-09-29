//Name: Leo
//Date: 09/24/26
//Description: This program will do Alphabet Soup
public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup() {
        letters = "";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company) {
        this.company = company;
    }

    //returns the company name
    public String getCompany() {
        return company;
    }

    //returns letters
    public String getLetters() {
        return letters;
    }

//below are the functions you'll be writing.

    //precondition: word must be a string
    //postcondition: letters now contains "word"
    public void add(String word){
        letters += word;
    }

    //precondition: word must be a string
    //postcondition: returns a random letter of type "char"
    public char randomLetter() {
        int rand = (int)(Math.random() * letters.length());
        return letters.charAt(rand);
    }

    //precondition: num must be an int less than the length of the string
    //postcondition: returns the letters currently stored with the company name placed directly in the center of all the letters
    public String companyCentered() {
        int middle = letters.length() / 2;
        return letters.substring(0, middle) + company + letters.substring(middle);
    }

    //precondition: letters must be initialized
    //postcondition: letters no longer contains the first vowel
    public void removeFirstVowel() {
        letters = letters.replaceFirst("[aeiouAEIOU]", "");
    }

    //precondition: num must be an int less than the length of the string
    //postcondition: letters no longer contains a random selection of length "num"
    public void removeSome(int num) {
        int rand = (int)(Math.random() * (letters.length() - num));
        letters = letters.substring(0, rand) + letters.substring(rand + num);
    }

    //precondition: word must be a string
    //postcondition: letters no longer contains "word"
    public void removeWord(String word) {
        letters = letters.replaceAll(word, "");
    }
}
