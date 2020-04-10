/*

 * Tue Mar 03 16:31:46 GMT 2020
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ToStringBuilder_ESTest extends ToStringBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("UZe5|#", (boolean[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper("");
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper((String) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle@4b0ad4b6[]", (float[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0, stringBuffer0);
      long[] longArray0 = new long[0];
      toStringBuilder0.append("ph@EU`&vECh", longArray0, false);
      assertEquals("ph@EU`&vECh=<size=0>,<null>", stringBuffer0.toString());
      assertEquals(27, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(1856);
      String string0 = ToStringBuilder.reflectionToString((Object) integer0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      String string0 = ToStringBuilder.reflectionToString((Object) toStringStyle0);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(string0, toStringStyle0);
      short[] shortArray0 = new short[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(string0, shortArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer(10);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0);
      int[] intArray0 = new int[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(intArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((char[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((byte[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      String string0 = ToStringBuilder.reflectionToString((Object) stringBuffer0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      char[] charArray0 = new char[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("Q=JUN5OE58@*@FLB", charArray0, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0);
      char[] charArray0 = new char[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("3y", charArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", (long[]) null, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.Object@2e5f00cb[]");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString("java.lang.Object@2e5f00cb[]");
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0, stringBuffer0);
      toStringBuilder0.appendToString((String) null);
      assertEquals(6, stringBuffer0.length());
      assertEquals("<null>", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      byte[] byteArray0 = new byte[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(byteArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("java.lang.Object@5ae2448f[]");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.Object@5ae2448f[]", (ToStringStyle) null, stringBuffer0);
      double[] doubleArray0 = new double[2];
      toStringBuilder0.append("java.lang.Object@5ae2448f[]", doubleArray0, false);
      assertEquals(90, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = mock(ToStringStyle.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(toStringStyle0).toString();
      String string0 = ToStringBuilder.reflectionToString((Object) toStringStyle0);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      boolean[] booleanArray0 = new boolean[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(string0, booleanArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("java.lang.Object@5ae2448f[]");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.Object@5ae2448f[]", (ToStringStyle) null, stringBuffer0);
      boolean[] booleanArray0 = new boolean[1];
      toStringBuilder0.append("java.lang.Object@5ae2448f[]", booleanArray0, false);
      assertEquals(90, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      long[] longArray0 = new long[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", longArray0, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("CN}l4}{", (double[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      byte[] byteArray0 = new byte[6];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("{L^|-@~kjZ`rI\"Lhz", byteArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      int[] intArray0 = new int[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", intArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0);
      String string0 = ToStringBuilder.reflectionToString((Object) toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString(string0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        ToStringBuilder.setDefaultStyle((ToStringStyle) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The style must not be null
         //
         verifyException("org.apache.commons.lang3.builder.ToStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      float[] floatArray0 = new float[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(floatArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      double[] doubleArray0 = new double[5];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("[=zc=Xcb#v", doubleArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", (int[]) null, true);
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) "org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle@4b0ad4b6[=<null>]i]]]";
      ToStringBuilder toStringBuilder2 = toStringBuilder1.append("]j9{@{^XdBAI/X'{aX", objectArray0, true);
      assertSame(toStringBuilder0, toStringBuilder2);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("4xn", (short[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0);
      short[] shortArray0 = new short[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.Object@92dffba[]", shortArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      Object[] objectArray0 = new Object[6];
      objectArray0[1] = (Object) toStringBuilder0;
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("]j9{@{^XdBAI/X'{aX", objectArray0, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("", (ToStringStyle) null);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) objectArray0;
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(objectArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0, stringBuffer0);
      float[] floatArray0 = new float[1];
      toStringBuilder0.append("?", floatArray0, false);
      assertEquals(19, stringBuffer0.length());
      assertEquals("?=<size=1>\n  <null>", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringBuilder.setDefaultStyle(toStringStyle0);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0);
      String string0 = toStringBuilder0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      Object[] objectArray0 = new Object[5];
      objectArray0[3] = (Object) toStringBuilder0;
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.awt.graphicsenv", objectArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }
}
