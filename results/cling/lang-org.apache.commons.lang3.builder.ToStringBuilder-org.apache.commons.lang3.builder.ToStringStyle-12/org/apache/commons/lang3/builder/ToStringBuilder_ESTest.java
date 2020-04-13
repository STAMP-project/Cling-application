/*

 * Tue Mar 03 16:26:30 GMT 2020
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import org.junit.Ignore;
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
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("Cu7ULXXW^T<N=", (boolean[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper((String) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      byte[] byteArray0 = new byte[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle", byteArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("*G%&YJUQS3YfQ4'4?", (float[]) null, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      long[] longArray0 = new long[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", longArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(76);
      String string0 = ToStringBuilder.reflectionToString((Object) integer0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      short[] shortArray0 = new short[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", shortArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      int[] intArray0 = new int[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", intArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", (char[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("g?rB E'mw8hG+,Z)x'");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((byte[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = ToStringBuilder.reflectionToString((Object) "org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStrin+Style");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      char[] charArray0 = new char[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(charArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      char[] charArray0 = new char[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle", charArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("B62plD", (long[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper("java.lang.String@37dab15b[]");
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStrin+Style");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.String@56fd7579[value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,M,u,l,t,i,L,i,n,e,T,o,S,t,r,i,n,+,S,t,y,l,e},value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,M,u,l,t,i,L,i,n,e,T,o,S,t,r,i,n,+,S,t,y,l,e},hash=-322055093]hash=-322055093,value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,M,u,l,t,i,L,i,n,e,T,o,S,t,r,i,n,+,S,t,y,l,e},hash=-322055093]]", (int[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString((String) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      double[] doubleArray0 = new double[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("}", doubleArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("g?rB E'mw8hG+,Z)x'");
      boolean[] booleanArray0 = new boolean[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.String@663ded62[]", booleanArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      boolean[] booleanArray0 = new boolean[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("'*;_-te>:'TuHfwC{", booleanArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("g?rB E'mw8hG+,Z)x'");
      long[] longArray0 = new long[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(longArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("g?2rB E'mw8hG+,Z)x'");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((double[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      byte[] byteArray0 = new byte[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.String@37dab15b[]", byteArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      int[] intArray0 = new int[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("[", intArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper("java.lang.String@483af7be[value={[},value={[},hash=91]hash=91,value={[},hash=91]]");
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
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringBuilder.setDefaultStyle(toStringStyle0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((Object) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object object0 = new Object();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, standardToStringStyle0);
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) objectArray0;
      toStringBuilder0.append("bO,hSOpr[G-W'w", objectArray0);
      assertFalse(standardToStringStyle0.isUseShortClassName());
      assertEquals("<size=", standardToStringStyle0.getSizeStartText());
      assertEquals("<null>", standardToStringStyle0.getNullText());
      assertEquals("{", standardToStringStyle0.getArrayStart());
      assertEquals("<", standardToStringStyle0.getSummaryObjectStartText());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtStart());
      assertTrue(standardToStringStyle0.isDefaultFullDetail());
      assertEquals("]", standardToStringStyle0.getContentEnd());
      assertTrue(standardToStringStyle0.isUseFieldNames());
      assertEquals(">", standardToStringStyle0.getSummaryObjectEndText());
      assertTrue(standardToStringStyle0.isUseClassName());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtEnd());
      assertEquals("}", standardToStringStyle0.getArrayEnd());
      assertEquals(",", standardToStringStyle0.getArraySeparator());
      assertEquals(">", standardToStringStyle0.getSizeEndText());
      assertEquals("[", standardToStringStyle0.getContentStart());
      assertEquals(",", standardToStringStyle0.getFieldSeparator());
      assertEquals("=", standardToStringStyle0.getFieldNameValueSeparator());
      assertTrue(standardToStringStyle0.isArrayContentDetail());
      assertTrue(standardToStringStyle0.isUseIdentityHashCode());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      double[] doubleArray0 = new double[16];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(doubleArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("g?2rB E'mw8hG+,Z)x'");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((short[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = new Object();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, standardToStringStyle0);
      Object[] objectArray0 = new Object[9];
      objectArray0[1] = (Object) toStringBuilder0;
      toStringBuilder0.append("bO,hSOpr[G-W'w", objectArray0);
      assertFalse(standardToStringStyle0.isUseShortClassName());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtEnd());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtStart());
      assertTrue(standardToStringStyle0.isArrayContentDetail());
      assertEquals("<", standardToStringStyle0.getSummaryObjectStartText());
      assertEquals(",", standardToStringStyle0.getFieldSeparator());
      assertEquals("]", standardToStringStyle0.getContentEnd());
      assertEquals("<size=", standardToStringStyle0.getSizeStartText());
      assertEquals(",", standardToStringStyle0.getArraySeparator());
      assertTrue(standardToStringStyle0.isUseIdentityHashCode());
      assertTrue(standardToStringStyle0.isDefaultFullDetail());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString("r9m");
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      String string0 = ToStringBuilder.reflectionToString((Object) boolean0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      float[] floatArray0 = new float[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(floatArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("g?rB E'mw8hG+,Z)x'");
      float[] floatArray0 = new float[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("g?rB E'mw8hG+,Z)x'", floatArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      String string0 = toStringBuilder0.build();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      String string0 = toStringBuilder0.build();
      assertEquals("<null>", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(stringBuffer0, toStringStyle0, stringBuffer0);
      assertEquals(35, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("hQ~V'gMzb>");
      short[] shortArray0 = new short[5];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("4.1", shortArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }
}
