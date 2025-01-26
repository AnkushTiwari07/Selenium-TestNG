package PractiseCode;

public class ReverseString {

    public String reverseString(String input){
        String temp = "";
        StringBuffer sb = new StringBuffer();
        for(int i = input.length()-1 ; i>=0 ; i-- ){
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String returnReverseString = rs.reverseString("Ankush Tiwari");
        System.out.println(returnReverseString);
    }

}
