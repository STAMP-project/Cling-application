/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 20:47:26 GMT 2019
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
      StringBuffer stringBuffer0 = new StringBuffer("(g\"P>");
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(stringBuffer0);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0, 162);
      DurationFormatUtils.Token durationFormatUtils_Token2 = new DurationFormatUtils.Token(durationFormatUtils_Token1, 162);
      boolean boolean0 = durationFormatUtils_Token1.equals(durationFormatUtils_Token2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Short short0 = Short.valueOf((short)1);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(short0);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("(g\"P>");
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(stringBuffer0);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(object0, 48);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Short short0 = Short.valueOf((short)1);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(short0);
      boolean boolean0 = durationFormatUtils_Token0.equals(short0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Float float0 = new Float((-1.0F));
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(float0);
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[7];
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      Byte byte0 = new Byte((byte)0);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(byte0, (byte)0);
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token1;
      boolean boolean0 = DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, byte0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[3];
      StringBuffer stringBuffer0 = new StringBuffer("(g\"P>");
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(stringBuffer0);
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[2] = durationFormatUtils_TokenArray0[0];
      Short short0 = new Short((short)0);
      boolean boolean0 = DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, short0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0);
      String string0 = durationFormatUtils_Token0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Short short0 = Short.valueOf((short)1);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(short0);
      durationFormatUtils_Token0.increment();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer(2545);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(stringBuffer0);
      int int0 = durationFormatUtils_Token0.getCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0);
      durationFormatUtils_Token0.hashCode();
  }
}
