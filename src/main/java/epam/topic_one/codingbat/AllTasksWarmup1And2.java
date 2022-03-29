package epam.topic_one.codingbat;

import java.util.Arrays;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class AllTasksWarmup1And2 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public int diff21(int n) {
        if (n < 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    public boolean nearHundred(int n) {
        return Math.abs(100 - n) <= 10 || (Math.abs(200 - n) <= 10);
    }

    public String missingChar(String str, int n) {
        String newS = null;
        newS = str.substring(0, n);
        newS += str.substring(n + 1);
        return newS;
    }

    public String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        } else {
            String up = str.substring(str.length() - 3, str.length()).toUpperCase();
            str = str.substring(0, str.length() - 3);
            return str + up;
        }
    }

    public String backAround(String str) {
        String lastElement = str.substring(str.length() - 1);
        return lastElement + str + lastElement;
    }

    public boolean startHi(String str) {
        str = str.toLowerCase();
        if (str.length() < 2) {
            return false;
        } else
            return str.startsWith("hi");
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a < 20 && a > 12) || (b < 20 && b > 12) || (c < 20 && c > 12);
    }

    public boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        } else return str.startsWith("ix", 1);
    }

    public int close10(int a, int b) {
        if ((Math.abs(a - 10)) < (Math.abs(b - 10))) {
            return a;
        } else if ((Math.abs(a - 10)) > (Math.abs(b - 10))) {
            return b;
        } else {
            return 0;
        }
    }

    public boolean stringE(String str) {
        char[] strChar = str.toLowerCase().toCharArray();
        int count = 0;
        for (char c : strChar) {
            if (c == 'e') {
                count++;
            }
        }
        if (count > 0 && count < 4) {
            {
                return true;
            }
        }
        return false;
    }

    public String everyNth(String str, int n) {
        String myString = "";
        for (int i = 0; i < str.length(); i = i + n) {
            myString = myString + str.charAt(i);
        }
        return myString;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if ((a < 0 && b > 0 && !negative) || (b < 0 && a > 0 && !negative)) {
            return true;
        } else return a < 0 && b < 0 && negative;
    }

    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String middleStr = str.substring(0, str.length() - 1);
        return str.charAt(str.length() - 1) + middleStr + str.charAt(0);
    }

    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 || temp2 < 0) && (temp2 > 100 || temp1 > 100);
    }


    public boolean loneTeen(int a, int b) {
        if ((a < 20 && a > 12) && ((b > 19 || b < 13))) {
            return true;
        } else return (b < 20 && b > 12) && ((a > 19 || a < 13));
    }

    public String startOz(String str) {

        if (str.startsWith("oz"))
            return "oz";
        else if (str.startsWith("o"))
            return "o";
        else if (str.startsWith("z", 1))
            return "z";
        else
            return "";
    }

    public boolean in3050(int a, int b) {
        if ((a > 29 && a < 41) && (b > 29 && b < 41))
            return true;
        else return (a > 39 && a < 51) && (b > 39 && b < 51);
    }

    public int max1020(int a, int b) {
        int resultA;
        int resultB;
        if (a < 21 && a > 9) {
            resultA = a;
        } else {
            resultA = 0;
        }
        if (b < 21 && b > 9) {
            resultB = b;
        } else {
            resultB = 0;
        }
        return Math.max(resultA, resultB);
    }

    public boolean lastDigit(int a, int b) {
        int lastCharacterA = a % 10;
        int lastCharacterB = b % 10;
        return lastCharacterA == lastCharacterB;
    }

    public int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        } else
            return (a + b) * 2;
    }

    public boolean makes10(int a, int b) {
        return a == 10 || b == 10 || (a + b == 10);
    }

    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        } else return "not " + str;
    }

    public String front3(String str) {
        if (str.length() < 4) {
            return str + str + str;
        } else {
            return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
        }
    }

    public String front22(String str) {
        if (str.length() < 3) {
            return str + str + str;
        } else {
            return str.substring(0, 2) + str + str.substring(0, 2);
        }
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public String delDel(String str) {
        if (str.startsWith("del", 1)) {
            return str.charAt(0) + str.substring(4, str.length());
        } else
            return str;
    }

    public int intMax(int a, int b, int c) {
        int maxAorB = Math.max(a, b);
        return Math.max(maxAorB, c);
    }

    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = str + result;
        }
        return result;
    }

    boolean doubleX(String str) {
        int indexX = str.indexOf('x');
        return str.length() - indexX > 1 && str.toCharArray()[indexX + 1] == 'x';
    }

    public int last2(String str) {
        if (str.length() < 2)
            return 0;

        String end = str.substring(str.length() - 2);
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(end))
                count++;
        }
        return count;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3)
                return true;
        }
        return false;
    }

    public String frontTimes(String str, int n) {
        String addResult = "";
        if (str.length() < 4) {
            for (int i = 0; i < n; i++) {
                addResult = addResult + str;
            }
        } else {
            for (int j = 0; j < n; j++) {
                addResult = addResult + str.substring(0, 3);
            }
        }
        return addResult;
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7))) {
                count++;
            }
        }
        return count;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        int maxIndex = Math.min(4, nums.length);
        boolean result = false;
        for (int i = 0; i < maxIndex; i++) {
            if (nums[i] == 9) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean noTriples(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }


    public String altPairs(String str) {
        char[] strArray = str.toCharArray();
        String result = "";
        int addNumber = 1;
        int currentIndex = 0;
        while (currentIndex < strArray.length) {
            result = result + strArray[currentIndex];
            currentIndex = currentIndex + addNumber;
            addNumber = addNumber == 1 ? 3 : 1;
        }
        return result;
    }

    public String stringYak(String str) {
        return str.replace("yak", "");
    }

    public String stringBits(String str) {
        char[] strArray = str.toCharArray();
        String result = "";
        for (int i = 0; i < strArray.length; ) {
            result = result + strArray[i];
            i = i + 2;
        }
        return result;
    }

    public String stringSplosion(String str) {
        char[] strArray = str.toCharArray();
        String result = "";
        String addPrefResult = "";
        for (char c : strArray) {
            result = result + c;
            addPrefResult = addPrefResult + result;
        }
        return addPrefResult;
    }

    int countXX(String str) {
        char[] strArray = str.toCharArray();
        int count = 0;
        for (int i = 0; i < strArray.length - 1; i++) {
            if (strArray[i] == 'x' && strArray[i + 1] == 'x') {
                count++;
            }
        }
        return count;
    }

    public String stringX(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            String firstChar = str.substring(0, 1);
            String lastChar = str.substring(str.length() - 1);
            str = str.substring(1, str.length() - 1);
            str = str.replace("x", "");
            return firstChar + str + lastChar;
        }
    }

    public int stringMatch(String a, String b) {
        int minLength = Math.min(a.length(), b.length());
        char[] aStr = a.toCharArray();
        char[] bStr = b.toCharArray();
        int count = 0;
        for (int i = 0; i < minLength - 1; i++) {
            if (aStr[i] == bStr[i] && aStr[i + 1] == bStr[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i + 1] == nums[i] + 5) &&
                    (Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2))
                return true;
        }

        return false;
    }
}




