package dpp;

import java.util.HashSet;

public class FindVowelsFromSentence {

    public static void main(String[] str){

        String inputSentence="This is a program where we will find vowels";
        System.out.println(upperVowelsInSentence(inputSentence));
    }

    public static String upperVowelsInSentence(String str){

        HashSet<Character> vowelsSet=new HashSet<>();
        StringBuilder sentence=new StringBuilder();
        vowelsSet.add('a');
        vowelsSet.add('e');
        vowelsSet.add('i');
        vowelsSet.add('o');
        vowelsSet.add('u');

        for (char ch:str.toCharArray()
             ) {

                    if (vowelsSet.contains(ch))
                    {
                        sentence.append(String.valueOf(ch).toUpperCase());
                    }
                    else {
                        sentence.append(ch);
                    }
        }

        return sentence.toString();

    }
}
