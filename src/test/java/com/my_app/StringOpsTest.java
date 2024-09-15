package com.my_app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.my_app.learning.StringOps;


public class StringOpsTest {
  @Test
  public void test(){
    StringOps sops=new StringOps();
    assertEquals("olleh", sops.reveString("hello"));
  }
}
