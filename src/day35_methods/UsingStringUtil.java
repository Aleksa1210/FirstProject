package day35_methods;

import my_utilities_libary.StringUtil;

public class UsingStringUtil {
    public static void main(String[] args) {
        System.out.println(StringUtil.reverse("apple"));
        //StringUtil.reverse();

        System.out.println(StringUtil.fix("jamES"));
        //StringUtil.fix();

        System.out.println(StringUtil.frequencyOfCharacter("apple", 'p'));

        System.out.println(StringUtil.uniqueCharacters ("aaaaabcccdeeff"));
        System.out.println(StringUtil.uniqueCharacters ("java"));
        System.out.println(StringUtil.uniqueCharacters ("eeiioo"));

    }
}
