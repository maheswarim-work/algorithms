package main.java;

public class VonCharOccurenceString {

    public static void main(String[] args) {
        VonCharOccurenceString test = new VonCharOccurenceString();
        //boolean result = test.solution("abba"); false
        // boolean result = test.solution("aa"); false
        // boolean result = test.solution("bb"); false
        boolean result = test.solution("aab"); // true
        System.out.println("result = " + result);
    }

    public boolean solution(String S) {
        boolean result = true;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i - 1) != S.charAt(i) && S.charAt(i - 1) == 'b') {
                result = false;
                break;
            }

        }
        return result;
    }
}
