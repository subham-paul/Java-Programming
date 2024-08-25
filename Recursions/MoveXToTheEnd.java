public class MoveXToTheEnd {
    public static void MoveXToTheEnd(String str, int i, int count, String newStr) {
        if (i == str.length()) {
            for (int idx = 0; idx < count; idx++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(i);
        if (currChar == 'x') {
            count++;
            MoveXToTheEnd(str, i + 1, count, newStr);
        } else {
            newStr += currChar;
            MoveXToTheEnd(str, i + 1, count, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        MoveXToTheEnd(str, 0, 0, "");
    }
}
