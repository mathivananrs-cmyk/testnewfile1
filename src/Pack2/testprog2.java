package Pack2;

import java.util.Arrays;

public class testprog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Programming";
		String input = "programming";
        StringBuilder sb = new StringBuilder(input);

        int left = 0;
        int right = sb.length() - 1;

        while (left < right) {

            if (!isVowel(sb.charAt(left))) {
                left++;
            } else if (!isVowel(sb.charAt(right))) {
                right--;
            } else {
                // swap vowels
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);

                left++;
                right--;
            }
        }

        System.out.println(sb);
    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
		

	}

}

