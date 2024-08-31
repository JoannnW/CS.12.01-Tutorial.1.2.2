public class HiddenWord {
    //properties
    private String hiddenWord;
    private String hint;

    //contructors
    public HiddenWord(String hiddenWord){
        this.hiddenWord = hiddenWord.toUpperCase();
    }
    public String getHiddenWord(){
        return hiddenWord;
    }

    public String getHint(String guess){
        String str="";
            if (!guess.toUpperCase().equals(guess)){
                throw new IllegalArgumentException("Your guess ("+guess+") does not contain uppercase letters. THe guess must be in uppercase!");
                // throwing this instead of returning a String explicitly shows that an error has occurred
            }
            if (guess.length()!=hiddenWord.length()){
                throw new IllegalArgumentException("Your guess ("+guess+") has " + guess.length()+" characters. The hidden word has "+hiddenWord.length()+" characters. Number of characters must match!");
            }
        for(int i=0; i<guess.length(); i++){
            if (guess.charAt(i) == (hiddenWord.charAt(i))){
                str += guess.charAt(i);
            } else if (hiddenWord.contains(guess.substring(i,i+1))&&(guess.charAt(i) != (hiddenWord.charAt(i)))) {
                str+="+";
            } else {
                str += "*";
            }
        }
        return str;
    }
}
