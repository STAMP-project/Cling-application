/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 02:27:51 GMT 2019
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
      FormatUtils.createErrorMessage("2147Y483648", 5);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FormatUtils.createErrorMessage("2147483648", 0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FormatUtils.createErrorMessage("", 2147064845);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.createErrorMessage("4J@y\"(", (-277));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FormatUtils.calculateDigitCount(9223372036854775802L);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FormatUtils.calculateDigitCount((-167L));
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
      FormatUtils.calculateDigitCount((-5582L));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FormatUtils.calculateDigitCount(22);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, (-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, (long) 22);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, (long) (-156));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, (long) Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, 0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("}OW#");
      FormatUtils.appendUnpaddedInteger(stringBuffer0, 9223372036854775790L);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendUnpaddedInteger(stringBuffer0, 59L);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendUnpaddedInteger(stringBuffer0, (-1629L));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendUnpaddedInteger(stringBuffer0, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendUnpaddedInteger(stringBuffer0, 2);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (-2147483649L), 1574);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, 9223372036854775787L, 996);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (-9223372036854775808L), (-482));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (-9223372036854775808L), 996);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (long) 13381883, 13381883);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (long) 996, 996);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (long) 22, 22);
      assertEquals("0000000000000000000022", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      FormatUtils.writePaddedInteger((Writer) stringWriter0, 0L, 19);
      assertEquals("0000000000000000000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (-6L), (-1));
      assertEquals("-6", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(48);
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (-2147483648L), 1574);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (long) 4184, 4184);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      assertNotNull(stringBuffer0);
      
      FormatUtils.appendPaddedInteger(stringBuffer0, (-9223372036854775808L), 20);
      assertEquals(21, stringBuffer0.length());
      assertEquals("-09223372036854775808", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (-2147483649L), 576);
      assertEquals(577, stringBuffer0.length());
      assertEquals("-000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000002147483649", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (-9223372036854775808L), (-506));
      assertEquals("-9223372036854775808", stringBuffer0.toString());
      assertEquals(20, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, 9223372036854775782L, 100);
      assertEquals(100, stringBuffer0.length());
      assertEquals("0000000000000000000000000000000000000000000000000000000000000000000000000000000009223372036854775782", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      // Undeclared exception!
      FormatUtils.appendPaddedInteger(stringBuffer0, 13421772, 13421772);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer(962);
      FormatUtils.appendPaddedInteger(stringBuffer0, (long) 962, 962);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (long) 22, 47);
      assertEquals(47, stringBuffer0.length());
      assertEquals("00000000000000000000000000000000000000000000022", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (long) 5, 5);
      assertEquals("00005", stringBuffer0.toString());
      assertEquals(5, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer(22);
      FormatUtils.appendPaddedInteger(stringBuffer0, (-4795L), 22);
      assertEquals("-0000000000000000004795", stringBuffer0.toString());
      assertEquals(23, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (-2147483648L), 47);
      assertEquals(48, stringBuffer0.length());
      assertEquals("-00000000000000000000000000000000000002147483648", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = FormatUtils.parseTwoDigits("\" is too short", 0);
      assertEquals((-156), int0);
  }
}
