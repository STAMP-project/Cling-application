/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 17:09:57 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DurationFormatUtils$Token_ESTest extends DurationFormatUtils$Token_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0);
      Object object1 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(object1);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-104));
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(byte0);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(object0);
      assertTrue(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      
      durationFormatUtils_Token1.increment();
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0);
      boolean boolean0 = durationFormatUtils_Token0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-32));
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(byte0);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0, 1330);
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[5];
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token1;
      boolean boolean0 = DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[0];
      boolean boolean0 = DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0);
      String string0 = durationFormatUtils_Token0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token((Object) null);
      durationFormatUtils_Token0.hashCode();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token((Object) null);
      int int0 = durationFormatUtils_Token0.getCount();
      assertEquals(1, int0);
  }
}
