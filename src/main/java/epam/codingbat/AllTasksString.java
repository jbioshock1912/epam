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




}
