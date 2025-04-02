public class Palindrome {
    private String text;

    public Palindrome(String text){
        this.text = text;
    }
    public boolean CheckPalindrome(String text){
        int len = text.length();
        for (int i = 0; i < len; i++){
            if (text.charAt(i) == text.charAt(len - i - 1)){
                return true;
            }
        }
        return false;
    }
    public void display(){
        if (CheckPalindrome(text)){
            System.out.println("The string is Palindrome");
        }
        else{
            System.out.println("The string is not a Palindrome");
        }
    }
}
