package com.arrayprograms;

public class StringPalindrome {
    private static boolean isStringPalindrom(String string) {
          String reverse = "";
          for (int i = string.length() - 1; i >= 0; i--) {
              reverse = reverse + string.charAt(i);
          }
          if (string.equals(reverse)) {
              System.out.println(reverse);
              return true;
          } else {
              return false;
          }
    }




  public static void main(String[] args){
      
      String []str= {"aba","megha","mam", "madam", "neha"};
       for (String string : str) {
              if (StringPalindrome.isStringPalindrom(string)) {
                  continue;
              }
          }
  }
}
