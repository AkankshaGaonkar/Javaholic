public class NoOfWordsInString {
    public static void main(String args[]){
        String str=" abc def gh ijk  ";
        System.out.println(str.replaceAll("\\s+"," ").trim());
        String words[]=str.split("\\s");
        System.out.println(words.length);

    }
}
