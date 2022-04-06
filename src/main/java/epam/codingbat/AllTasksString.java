package epam.codingbat;

public class AllTasksString {
    public String helloName(String name) {
        return (String.format("Hello %s!", name));
    }

    public String makeOutWord(String out, String word) {
        String result = out.substring(0, 2) + word + out.substring(2);
        return result;
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
        return str.length() > 1 && (str.substring(str.length() - 2).equals("ly"));
    }

    public String seeColor(String str) {
        String color = "";
        if (str.startsWith("red")) {
            color = "red";
        }
        if (str.startsWith("blue")) { // а если бы елс иф??
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

}


}



