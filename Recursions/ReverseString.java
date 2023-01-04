public class ReverseString {
    public static void reversePrint(String str, int index){
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.println(str.charAt(index));
        reversePrint(str, index-1);
    }
    // subham -> mahbus
    public static void main(String args[]) {
        String a = "subham";
        reversePrint(a, 5);
    }
}
