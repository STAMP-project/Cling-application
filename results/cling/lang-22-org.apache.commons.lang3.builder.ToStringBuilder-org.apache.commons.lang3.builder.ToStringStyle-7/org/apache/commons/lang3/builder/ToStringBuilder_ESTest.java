/*

 * Tue Mar 03 16:32:36 GMT 2020
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.builder.StandardToStringStyle;
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
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((boolean[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      short[] shortArray0 = new short[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(shortArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper((String) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((float[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      Integer integer0 = new Integer(2112);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0, toStringStyle0);
      long[] longArray0 = new long[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.String@79fa494a[value={},value={},hash=0]hash=0,value={},hash=0]]", longArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(512);
      String string0 = ToStringBuilder.reflectionToString((Object) integer0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      short[] shortArray0 = new short[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("UaR$ Gj;", shortArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[6];
      Integer integer0 = new Integer(0);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(intArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((char[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle", (byte[]) null, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(0);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0);
      boolean[] booleanArray0 = new boolean[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(booleanArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      char[] charArray0 = new char[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(charArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      char[] charArray0 = new char[8];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("#).T<Gp`g84A83,j", charArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.Object@45dccc9a[]");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.Object@45dccc9a[]", (long[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.Object@3be239b5[]");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper("java.lang.Object@3be239b5[]");
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((int[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString((String) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      double[] doubleArray0 = new double[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.Integer@78f1d160[\n  value=-2781\n  value=-2781\n]\n]", doubleArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0);
      boolean[] booleanArray0 = new boolean[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", booleanArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      long[] longArray0 = new long[4];
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, longArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((double[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      byte[] byteArray0 = new byte[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("=&/]m25rE;pPtM", byteArray0, true);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      byte[] byteArray0 = new byte[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("~7%0S&", byteArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      String string0 = ToStringBuilder.reflectionToString((Object) toStringStyle0, toStringStyle0, false);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      int[] intArray0 = new int[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(string0, intArray0, true);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      int[] intArray0 = new int[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("path.separator", intArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      Integer integer0 = new Integer(2112);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString("java.lang.String@79fa494a[value={},value={},hash=0]hash=0,value={},hash=0]]");
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      ToStringStyle toStringStyle0 = mock(ToStringStyle.class, new ViolatedAssumptionAnswer());
      ToStringBuilder.setDefaultStyle(toStringStyle0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(" D 9iORs", (Object) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) objectArray0;
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("VHWa7<&", objectArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      double[] doubleArray0 = new double[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, doubleArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(":0GNH?[z");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((short[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      Object[] objectArray0 = new Object[4];
      objectArray0[3] = (Object) toStringBuilder0;
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("VHWa7<&", objectArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper("");
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0);
      float[] floatArray0 = new float[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, floatArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringBuilder toStringBuilder1 = new ToStringBuilder(toStringBuilder0, toStringStyle0);
      String string0 = toStringBuilder1.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) toStringBuilder0;
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.Object@6320ab74[]", objectArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test37()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer("|&u`.#");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, standardToStringStyle0, stringBuffer0);
      float[] floatArray0 = new float[0];
      toStringBuilder0.append("Linux", floatArray0, false);
      assertEquals("|&u`.#Linux=<size=0>,<null>", stringBuffer0.toString());
      assertEquals("<null>", standardToStringStyle0.getNullText());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      String string0 = ToStringBuilder.reflectionToString((Object) "java.lang.Object@29e2465[]", toStringStyle0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringBuilder.reflectionToString((Object) toStringStyle0, toStringStyle0, false);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 1114.0;
  }
}
