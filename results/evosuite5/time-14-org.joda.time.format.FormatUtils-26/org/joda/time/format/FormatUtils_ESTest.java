/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 02:25:06 GMT 2019
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
      FormatUtils.createErrorMessage("ZqX#&RB", 2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FormatUtils.createErrorMessage("ZqX#&RB", (-13));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FormatUtils.createErrorMessage("", 1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.createErrorMessage("", Integer.MIN_VALUE);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FormatUtils.calculateDigitCount(9223372036854775776L);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FormatUtils.calculateDigitCount((-480L));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FormatUtils.calculateDigitCount(1L);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FormatUtils.calculateDigitCount((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FormatUtils.calculateDigitCount((-4361));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FormatUtils.calculateDigitCount(10);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(35);
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, (-2147483663L));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, 872L);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(10);
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, (long) 10);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, (long) (-7));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(35);
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, (-2147483648L));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(5);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      FormatUtils.appendUnpaddedInteger(stringBuffer0, (-1840L));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("}-nWVj'}");
      FormatUtils.appendUnpaddedInteger(stringBuffer0, (-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      FormatUtils.appendUnpaddedInteger(stringBuffer0, 12);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer(1);
      FormatUtils.appendUnpaddedInteger(stringBuffer0, 1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendUnpaddedInteger(stringBuffer0, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(976);
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (-9223372036854775808L), 976);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, 9223372036854775803L, 979);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (-9223372036854775808L), (-603));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(35);
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (-2147483663L), 35);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (long) 976, 976);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(35);
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (long) 35, 35);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (long) 7, 7);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (-2147483646), (-2147483646));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (long) Integer.MIN_VALUE, 693);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (long) 1288, 1288);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (-9223372036854775795L), 647);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, 9223372036854775792L, 619);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (-9223372036854775806L), (-2917));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (-2147483663L), 44);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      // Undeclared exception!
      FormatUtils.appendPaddedInteger(stringBuffer0, (long) 2147483637, 2147483637);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (long) 647, 647);
      assertEquals(647, stringBuffer0.length());
      assertEquals("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000647", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer(21);
      FormatUtils.appendPaddedInteger(stringBuffer0, (long) 21, 21);
      assertEquals(21, stringBuffer0.length());
      assertEquals("000000000000000000021", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer(0);
      FormatUtils.appendPaddedInteger(stringBuffer0, (long) 0, 2643);
      assertEquals(2643, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (long) (-4361), (-4361));
      assertEquals("-4361", stringBuffer0.toString());
      assertEquals(5, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (-2147483648L), 44);
      assertEquals(45, stringBuffer0.length());
      assertEquals("-00000000000000000000000000000000002147483648", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.parseTwoDigits("HvV r", 751);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
