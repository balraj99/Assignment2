/*
    Time complexity: O(n) as it traverses the string
    Space complexity: O(1)
 */

public class StringCheck {

    public static boolean isAlphbet(char ch){

            if(ch >= 'a' && ch <= 'z')
                return true;
            if(ch >= 'A' && ch <= 'Z')
                return true;

            return false;


    }
    public static boolean isContainsOnlyAlphabets(String str){

        int len = str.length();
        for(int i = 0; i < len; i++){

            if(!isAlphbet(str.charAt(i))){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        if(isContainsOnlyAlphabets("Hello ")){
            System.out.println("Contains only aplhabets");
        }else{
            System.out.println("Does not contain only alphabets");
        }

    }
}
