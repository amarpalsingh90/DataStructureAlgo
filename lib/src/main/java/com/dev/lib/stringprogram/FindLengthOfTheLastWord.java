package com.dev.lib.stringprogram;

public class FindLengthOfTheLastWord {

    public static void main(String[] args){
        String input= " Lets fly to the moonOrbit ";
      int output=  findCountOfTheLastWord(input);
      System.out.println("Length of the last word=="+output);

    }
    public static int findCountOfTheLastWord(String s){
        String str= s.trim();
         int count = 0;
        for(int i = str.length()-1;i >0; i-- ){
            if(str.charAt(i)!= ' '){
                count++;
            }else{
               break;
            }
        }
       return  count;
    }
}
