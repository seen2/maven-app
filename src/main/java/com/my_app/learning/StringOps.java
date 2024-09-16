package com.my_app.learning;

public class StringOps {
  //reverse a string
  public String reverse(String str) {
    char[] strArray = str.toCharArray();
    int len = str.length();
    for (int i = 0; i < len / 2; i++) {
      char temp = str.charAt(i);
      int x = len - i - 1;
      strArray[i] = (str.charAt(x));
      strArray[x] = temp;
      
    }
    
    return String.valueOf(strArray);
  }
}
