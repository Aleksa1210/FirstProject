package homework.all;

public class a9 {
    public boolean xyzMiddle(String str) {

/*
String-2 > xyzMiddle
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.
xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
 */


        boolean xyzMiddle = false;
        int mid = str.length() / 2;
        if (str.length() < 3) {
            return false;
        }
        if (str.length() % 2 != 0) {
            if (str.charAt(mid) == 'y') {
                if (str.charAt(mid - 1) == 'x' && str.charAt(mid + 1) == 'z') {
                    return true;
                }
            }
        } else {
            if (str.charAt(mid - 1) == 'y' && str.charAt(mid - 2) == 'x' && str.charAt(mid) == 'z') {
                return true;
            }
            if (str.charAt(mid - 1) == 'x' && str.charAt(mid) == 'y' && str.charAt(mid + 1) == 'z') {
                return true;

            }
            if (str.charAt(mid) == 'x' && str.charAt(mid + 1) == 'y' && str.charAt(mid + 2) == 'z') {
                return true;
            }
        }
        return false;
    }
}