/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:13:32 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DurationFormatUtils_ESTest extends DurationFormatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0);
      boolean boolean0 = durationFormatUtils_Token1.equals(durationFormatUtils_Token0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("s");
      boolean boolean0 = durationFormatUtils_Token0.equals("s");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[2];
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("", 0);
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      // Undeclared exception!
      try { 
        DurationFormatUtils.format(durationFormatUtils_TokenArray0, 0, (-419), 256, (-419), (-3839), 256, (-3570), true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(1000L, 0L, "q|lwRxb!-lq054Yr");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(327L, (-2164L), "");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(0L, 0L, "y7");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(324L, (-1268L), "e;sMA 1uhk8qz8");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-1L), (-1L), "Minimum abbreviation width is 4");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO(327L, 0L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-489L), 327L, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-1779L), false, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-2164L), "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(60046L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(60000L, 60000L, "java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000210java.lang.StringBuffer@0000000022000java.lang.StringBuffer@0000000023");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(60000L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("M", 11944);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("M");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("s");
      String string0 = durationFormatUtils_Token0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      String string0 = DurationFormatUtils.formatPeriod((-1L), (-1L), "0java.lang.StringBuffer@00000000090java.lang.StringBuffer@00000000100java.lang.StringBuffer@00000000110java.lang.StringBuffer@0000000012", false, timeZone0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-1L), true, true);
      assertNotNull(string0);
  }
}
