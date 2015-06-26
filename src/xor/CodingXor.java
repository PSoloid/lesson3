package xor;

/**
 * Created by ITHILLEL7 on 26.06.2015.
 */
public class CodingXor {
    public static void main(String[] args){
        String message ="Hello";

        for (char ch: message.toCharArray()){
            System.out.println(ch);
        }

        System.out.println(message.toCharArray());
        char key ='a';
//        String[] a = new String[4];
        String[] a = new String[] {"W","S","S","A"};
      a =expandArray(a,1);
        a=add(a,"HDHGF");
        a[4] = "New Element";

        for (String el : a){
            System.out.println(el);
        }

// a[0] = "Winter";
//        a[1] = "Spring";
//        a[2] = "Summer";
//        a[3] = "Autm";



//        int[] a = new int[5];
//        a = new int[8];
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
    public static String encode(String message, char key){

        message.toCharArray();

        return null;//TODO
    }

    public static String[] expandArray(String[] inArray, int expandBy){
        int initLength = inArray.length;
        String[] result = new String[initLength+expandBy];
        for(int i=0; i<inArray.length;i++){
            result[i]=inArray[i];
        }
        return result;
    }

}
