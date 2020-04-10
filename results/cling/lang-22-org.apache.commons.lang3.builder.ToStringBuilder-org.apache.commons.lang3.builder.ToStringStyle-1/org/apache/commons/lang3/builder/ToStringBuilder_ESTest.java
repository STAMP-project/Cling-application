/*

 * Tue Mar 03 16:29:43 GMT 2020
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ToStringBuilder_ESTest extends ToStringBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("`f(");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("`f(", (boolean[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper((String) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("`fg(");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.String@224c6a65[]", (float[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      long[] longArray0 = new long[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("Q(Wmo^0Iz", longArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer(3);
      String string0 = ToStringBuilder.reflectionToString((Object) integer0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
      short[] shortArray0 = new short[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, shortArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("", toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((char[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("o");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("o", (byte[]) null, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      boolean[] booleanArray0 = new boolean[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(booleanArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      char[] charArray0 = new char[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(charArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("=l xhgaS}");
      char[] charArray0 = new char[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("=/p", charArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("=cQt5xI6PDEf><38Az", (long[]) null, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("Windows NT");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString("java.lang.String@6a057371[]");
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("o");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("o", (int[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString((String) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("`f(");
      double[] doubleArray0 = new double[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("`f(", doubleArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      boolean[] booleanArray0 = new boolean[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, booleanArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("RhTekUg4mh");
      long[] longArray0 = new long[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(longArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(",");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(",", (double[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("=l xhgaS}");
      byte[] byteArray0 = new byte[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("=l xhgaS}", byteArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("=l xhgaS}");
      byte[] byteArray0 = new byte[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("Caught a SecurityException reading the system property '", byteArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("=l xhgaS}");
      int[] intArray0 = new int[8];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(intArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      int[] intArray0 = new int[5];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("-", intArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("r1 ");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString("java.lang.String@677d35b5[value={r,1, },value={r,1, },hash=111105]hash=111105,value={r,1, },hash=111105]]");
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ToStringBuilder.setDefaultStyle(toStringStyle0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      String string0 = ToStringBuilder.reflectionToString((Object) toStringBuilder0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) objectArray0;
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(objectArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      double[] doubleArray0 = new double[6];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(doubleArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("N");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((short[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("=l xhgaS}");
      Object[] objectArray0 = new Object[3];
      objectArray0[1] = (Object) toStringBuilder0;
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(objectArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      boolean boolean0 = true;
      String string0 = ToStringBuilder.reflectionToString(object0, toStringStyle0, boolean0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("r1 ");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper("r1 ");
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      float[] floatArray0 = new float[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("dEDl'qj.R(5%6X-`", floatArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("", toStringStyle0);
      float[] floatArray0 = new float[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", floatArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((Object) toStringBuilder0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0, stringBuffer0);
      assertEquals(77, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("Windows NT");
      short[] shortArray0 = new short[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(shortArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = ToStringBuilder.reflectionToString((Object) "r1 ");
      assertNotNull(string0);
  }
}
