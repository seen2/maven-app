package com.my_app.learning;

public class StringOps {

  public String reveString(String s) {
    String op="";
    for(int i=s.length()-1;i>=0;i--) {
        System.out.println(i);
        op+=s.charAt(i);
    }
    return op;
  }
}
