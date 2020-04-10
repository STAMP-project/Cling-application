/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 20:45:18 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.format.FormatUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FormatUtils_ESTest extends FormatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FormatUtils.createErrorMessage("", 8);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FormatUtils.createErrorMessage("38)-f|)s%Yo*.pw", 1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FormatUtils.createErrorMessage("/S\"xbGQ.", (-1));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.createErrorMessage("b|", (-954));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FormatUtils.calculateDigitCount(10000L);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FormatUtils.calculateDigitCount(544L);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FormatUtils.calculateDigitCount((-3091L));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FormatUtils.calculateDigitCount((-1L));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FormatUtils.calculateDigitCount((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FormatUtils.calculateDigitCount((-32L));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.writeUnpaddedInteger((Writer) null, (-32L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, (-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, 32);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, 3);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, (-2099761788));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.appendUnpaddedInteger((StringBuffer) null, (-9223372036854775808L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(35);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      FormatUtils.appendUnpaddedInteger(stringBuffer0, 35);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendUnpaddedInteger(stringBuffer0, (-3093L));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendUnpaddedInteger(stringBuffer0, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendUnpaddedInteger(stringBuffer0, 5);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, 9223372036854775791L, 4310);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (-9223372036854775783L), 3);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (-9223372036854775808L), 2746);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, 2146742625L, (-2756));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (long) 59, 59);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, 1L, 2065);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (long) Integer.MIN_VALUE, 45);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (long) (-591), (-591));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (long) 2710, 48);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, 9223372036854775800L, 2710);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (-9223372036854775791L), (-627));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (-9223372036854775783L), 2710);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer(0);
      FormatUtils.appendPaddedInteger(stringBuffer0, 10000L, 0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (long) 2718, 2718);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (long) 447, 447);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (long) Integer.MIN_VALUE, 1000);
      assertEquals(1001, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (-36L), 2710);
      assertEquals(2711, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, 0L, 48);
      assertEquals(48, stringBuffer0.length());
      assertEquals("000000000000000000000000000000000000000000000000", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.parseTwoDigits("", 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
