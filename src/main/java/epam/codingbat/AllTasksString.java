package epam.codingbat;

public class AllTasksString {
    public String helloName(String name) {
        return (String.format("Hello %s!", name));
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public String seeColor(String str) {
        String color = "";
        if (str.startsWith("red")) {
            color = "red";
        } else if (str.startsWith("blue")) {
            color = "blue";
        }
        return color;
    }

    public String extraFront(String str) {
        String result = "";
        if (str.length() > 1) {
            result = str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        } else {
            result = str + str + str;
        }
        return result;
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String extraEnd(String str) {
        String result = "";
        if (str.length() > 2) {
            result = str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
        } else {
            result = str + str + str;
        }
        return result;
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public String withouEnd2(String str) {
        String result = "";
        if (str.length() > 1) {
            result = str.substring(1, str.length() - 1);
        }
        return result;
    }

    public String nTwice(String str, int n) {
        String result = "";
        result = str.substring(0, n);
        result = result + str.substring(str.length() - n);
        return result;
    }

    public boolean hasBad(String str) {
        return str.startsWith("bad") || str.startsWith("bad", 1);
    }

    public String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0 && a.charAt(a.length() - 1) == b.charAt(0)) {
            a = a.substring(0, a.length() - 1);
        }
        return a + b;
    }

    public boolean frontAgain(String str) {
        return str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2));
    }

    public String without2(String str) {
        if (str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(2);
        }
        return str;
    }

    public String withoutX(String str) {
        if (str.length() > 1 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        return str.length() > 0 && str.charAt(str.length() - 1) == 'x' ? str.substring(0, str.length() - 1) : str;
    }

    public String makeTags(String tag, String word) {
        return String.format("<%s>%s</%s>", tag, word, tag);
    }

    public String firstTwo(String str) {
        if (str.length() > 2) {
            return str.substring(0, 2);
        } else {
            return str;
        }
    }

    public String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        } else
            return a + b + a;
    }

    public String right2(String str) {
        if (str.length() < 3) {
            return str;
        } else {
            return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
        }
    }

    public String middleTwo(String str) {
        int index = str.length() / 2;
        return str.substring(index - 1, index + 1);
    }

    public String twoChar(String str, int index) {
        if (index + 2 > str.length() || index < 0)
            return str.substring(0, 2);

        return str.substring(index, index + 2);
    }

    public String atFirst(String str) {
        if (str.length() > 1) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return "@@";
        }
    }

  /*  public String lastTwo(String str) {

    }
*/


}






