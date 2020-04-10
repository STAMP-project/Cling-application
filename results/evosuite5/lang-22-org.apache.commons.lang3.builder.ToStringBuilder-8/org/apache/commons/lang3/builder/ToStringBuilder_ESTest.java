/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 23:59:39 GMT 2019
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.builder.StandardToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ToStringBuilder_ESTest extends ToStringBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) toStringBuilder0;
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", objectArray0, true);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString("");
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString((String) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("org.apache.commons.lang3.builder.ToStringBuilder");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper("");
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper((String) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ToStringBuilder.setDefaultStyle(toStringStyle0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      double[] doubleArray0 = new double[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(doubleArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("org.apache.commons.lang3.builder.ToStringBuilder");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((Object) "org.apache.commons.lang3.builder.ToStringBuilder");
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      long[] longArray0 = new long[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", longArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("org.apache.commons.lang3.builder.ToStringBuilder");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((byte)13);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      StringBuffer stringBuffer0 = new StringBuffer("");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("", toStringStyle0, stringBuffer0);
      float[] floatArray0 = new float[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(floatArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("ec#FcL{{DW]fL,m]U");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      short[] shortArray0 = new short[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("_g~", shortArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      StringBuffer stringBuffer0 = new StringBuffer("");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("", toStringStyle0, stringBuffer0);
      boolean[] booleanArray0 = new boolean[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", booleanArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("org.apache.commons.lang3.builder.ToStringBuilder");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("+(fo/!&Sa\"@9sl7K&k", (short)0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((Object[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      int[] intArray0 = new int[5];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(intArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      String string0 = ToStringBuilder.reflectionToString((Object) "", toStringStyle0, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, (long) 0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("e'/t_*p2*:=om~");
      char[] charArray0 = new char[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("org.apache.commons.lang3.builder.ToStringBuilder", charArray0, true);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("org.apache.commons.lang3.builder.ToStringBuilder");
      boolean[] booleanArray0 = new boolean[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("org.apache.commons.lang3.builder.ToStringBuilder", booleanArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      float[] floatArray0 = new float[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(" ", floatArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      Class<Object> class0 = Object.class;
      String string0 = ToStringBuilder.reflectionToString("|.&", toStringStyle0, true, (Class<? super String>) class0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      Object object0 = new Object();
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendAsObjectToString(object0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(" ", (long[]) null, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", (byte)0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("org.apache.commons.lang3.builder.ToStringBuilder");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", ']');
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "[#9ei]>O:oh1t");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("[#9ei]>O:oh1t", toStringStyle0, stringBuffer0);
      char[] charArray0 = new char[8];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("[#9ei]>O:oh1t", charArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("org.apache.commons.lang3.builder.ToStringBuilder");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("org.apache.commons.lang3.builder.ToStringBuilder", (float) (short)0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("org.apache.commons.lang3.builder.ToStringBuilder");
      double[] doubleArray0 = new double[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", doubleArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("ec#FcL{{DW]fL,m]U");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("ec#FcL{{DW]fL,m]U", false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("org.apache.commons.lang3.builder.ToStringBuilder", (double) 1);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("org.apache.commons.lang3.builder.ToStringBuilder", (byte[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      int[] intArray0 = new int[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, intArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("org.apache.commons.lang3.builder.ToStringBuilder");
      double[] doubleArray0 = new double[5];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("+(fo/!&Sa\"@9sl7K&k", doubleArray0, true);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("|.&");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0, stringBuffer0);
      toStringBuilder0.append('M');
      //  // Unstable assertion: assertEquals("|.&ToStringStyle.ShortPrefixToStringStyle[M]", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(true);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("org.apache.commons.lang3.builder.ToStringBuilder");
      short[] shortArray0 = new short[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(shortArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      short[] shortArray0 = new short[7];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("org.apache.commons.lang3.builder.ToStringBuilder", shortArray0, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("|'w", (float[]) null, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0, stringBuffer0);
      boolean[] booleanArray0 = new boolean[6];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(booleanArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("|.&");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("String[value={|,.,&},hash=120628]", (Object) toStringStyle0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      long[] longArray0 = new long[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(longArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("org.apache.commons.lang3.builder.ToStringBuilder");
      byte[] byteArray0 = new byte[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("org.apache.commons.lang3.builder.ToStringBuilder", byteArray0, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("org.apache.commons.lang3.builder.ToStringBuilder");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((short)0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("org.apache.commons.lang3.builder.ToStringBuilder");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("V,KO=LlKNt^zO", 0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((long) 0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer("");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("eFK{`@$U2j*E", standardToStringStyle0, stringBuffer0);
      Object[] objectArray0 = new Object[7];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("fI)e;EN3/eaw*~qqX", objectArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = ToStringBuilder.reflectionToString((Object) null);
      assertEquals("<null>", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      String string0 = ToStringBuilder.reflectionToString(object0, toStringStyle0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("|.&");
      byte[] byteArray0 = new byte[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(byteArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      int[] intArray0 = new int[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", intArray0, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("org.apache.commons.lang3.builder.ToStringBuilder");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((-275.491));
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      String string0 = toStringBuilder0.build();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((float) 3559);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("org.apache.commons.lang3.builder.ToStringBuilder");
      char[] charArray0 = new char[8];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(charArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }
}
