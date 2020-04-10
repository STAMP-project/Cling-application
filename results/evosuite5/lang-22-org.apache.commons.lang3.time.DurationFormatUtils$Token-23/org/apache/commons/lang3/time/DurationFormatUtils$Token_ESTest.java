/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 21:02:36 GMT 2019
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
      Integer integer0 = new Integer(13);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(integer0);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0, 875);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(object0);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0, 5);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0, 5);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0);
      boolean boolean0 = durationFormatUtils_Token0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0);
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[9];
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      boolean boolean0 = DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0, (-3471));
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[1];
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      Double double0 = new Double((-3471));
      boolean boolean0 = DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0, 875);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("org.apache.commons.lang3.time.DurationFormatUtils$Token");
      durationFormatUtils_Token0.increment();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Double double0 = new Double(4012.4768252);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(double0);
      durationFormatUtils_Token0.hashCode();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("org.apache.commons.lang3.time.DurationFormatUtils$Token");
      int int0 = durationFormatUtils_Token0.getCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0);
      String string0 = durationFormatUtils_Token0.toString();
      assertNotNull(string0);
  }
}
