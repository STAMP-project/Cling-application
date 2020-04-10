/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 17:05:16 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      Integer integer0 = new Integer(24);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(integer0);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(object0, (-508));
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
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
      Integer integer0 = new Integer(24);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(integer0);
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[3];
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token0;
      durationFormatUtils_TokenArray0[2] = durationFormatUtils_Token0;
      Double double0 = new Double((-2752.3842846425));
      boolean boolean0 = DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Short short0 = new Short((short)7);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(short0, (short)7);
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[3];
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      boolean boolean0 = DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, short0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token((Object) null);
      // Undeclared exception!
      try { 
        durationFormatUtils_Token0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Short short0 = new Short((short)7);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(short0, (short)7);
      durationFormatUtils_Token0.increment();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Short short0 = new Short((short)1719);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(short0, (short)1719);
      durationFormatUtils_Token0.hashCode();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0, 2950);
      int int0 = durationFormatUtils_Token0.getCount();
      assertEquals(2950, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0);
      boolean boolean0 = durationFormatUtils_Token0.equals(object0);
      assertFalse(boolean0);
  }
}
