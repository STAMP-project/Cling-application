/*

 * Tue Mar 03 16:25:46 GMT 2020
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
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, (boolean[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper((String) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((float[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0);
      long[] longArray0 = new long[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, longArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      Integer integer0 = new Integer((-98));
      Class<Object> class0 = Object.class;
      String string0 = ToStringBuilder.reflectionToString(integer0, toStringStyle0, false, (Class<? super Integer>) class0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      short[] shortArray0 = new short[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(".X]{", shortArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("u7Sx5eE.=X*", toStringStyle0);
      int[] intArray0 = new int[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(intArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, (char[]) null, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.String@6657d894[value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,w,l,e},value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,w,l,e},hash=-590123206]hash=-590123206,value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,w,l,e},hash=-590123206]]", standardToStringStyle0);
      toStringBuilder0.append("0*Vs6YXan", (byte[]) null, false);
      assertFalse(standardToStringStyle0.isFieldSeparatorAtStart());
      assertTrue(standardToStringStyle0.isUseClassName());
      assertEquals("{", standardToStringStyle0.getArrayStart());
      assertTrue(standardToStringStyle0.isDefaultFullDetail());
      assertEquals("=", standardToStringStyle0.getFieldNameValueSeparator());
      assertFalse(standardToStringStyle0.isUseShortClassName());
      assertEquals(",", standardToStringStyle0.getArraySeparator());
      assertEquals("<null>", standardToStringStyle0.getNullText());
      assertTrue(standardToStringStyle0.isArrayContentDetail());
      assertEquals(",", standardToStringStyle0.getFieldSeparator());
      assertEquals("[", standardToStringStyle0.getContentStart());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtEnd());
      assertEquals("}", standardToStringStyle0.getArrayEnd());
      assertTrue(standardToStringStyle0.isUseIdentityHashCode());
      assertEquals(">", standardToStringStyle0.getSizeEndText());
      assertTrue(standardToStringStyle0.isUseFieldNames());
      assertEquals("]", standardToStringStyle0.getContentEnd());
      assertEquals(">", standardToStringStyle0.getSummaryObjectEndText());
      assertEquals("<size=", standardToStringStyle0.getSizeStartText());
      assertEquals("<", standardToStringStyle0.getSummaryObjectStartText());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      boolean[] booleanArray0 = new boolean[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(booleanArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("<null>", toStringStyle0);
      char[] charArray0 = new char[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("<null>", charArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.String@7e4cdbf5[value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},hash=-590121284]hash=-590121284,value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},hash=-590121284]]", toStringStyle0);
      char[] charArray0 = new char[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.String@7e4cdbf5[value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},hash=-590121284]hash=-590121284,value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},hash=-590121284]]", charArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("u7Sx5E.=X*");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((long[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString("java.lang.Object@76464e70[]");
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      String string0 = ToStringBuilder.reflectionToString((Object) toStringStyle0);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(string0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((int[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString((String) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0);
      double[] doubleArray0 = new double[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("~{~%$!XBVY>ko*D37p", doubleArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      boolean[] booleanArray0 = new boolean[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.Object@4f6ab82e[]", booleanArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("u7Sx5E.=X*");
      long[] longArray0 = new long[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(longArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((double[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      String string0 = ToStringBuilder.reflectionToString((Object) toStringStyle0);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(string0, toStringStyle0);
      byte[] byteArray0 = new byte[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(byteArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      byte[] byteArray0 = new byte[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("eYgooe(Kh6ei/>T", byteArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.String@7e4cdbf5[value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},hash=-590121284]hash=-590121284,value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},hash=-590121284]]", standardToStringStyle0);
      int[] intArray0 = new int[2];
      toStringBuilder0.append("", intArray0, false);
      assertEquals("]", standardToStringStyle0.getContentEnd());
      assertEquals("[", standardToStringStyle0.getContentStart());
      assertEquals(">", standardToStringStyle0.getSizeEndText());
      assertEquals("=", standardToStringStyle0.getFieldNameValueSeparator());
      assertEquals("}", standardToStringStyle0.getArrayEnd());
      assertEquals("<null>", standardToStringStyle0.getNullText());
      assertFalse(standardToStringStyle0.isUseShortClassName());
      assertEquals(",", standardToStringStyle0.getFieldSeparator());
      assertTrue(standardToStringStyle0.isUseIdentityHashCode());
      assertEquals(",", standardToStringStyle0.getArraySeparator());
      assertTrue(standardToStringStyle0.isArrayContentDetail());
      assertEquals("<", standardToStringStyle0.getSummaryObjectStartText());
      assertTrue(standardToStringStyle0.isDefaultFullDetail());
      assertEquals("{", standardToStringStyle0.getArrayStart());
      assertEquals("<size=", standardToStringStyle0.getSizeStartText());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtEnd());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtStart());
      assertEquals(">", standardToStringStyle0.getSummaryObjectEndText());
      assertTrue(standardToStringStyle0.isUseFieldNames());
      assertTrue(standardToStringStyle0.isUseClassName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.String@cc19532[value={z,[,U,5,e,Z,|,/,G,M,i,&,r,,,^},value={z,[,U,5,e,Z,|,/,G,M,i,&,r,,,^},hash=-1638714632]hash=-1638714632,value={z,[,U,5,e,Z,|,/,G,M,i,&,r,,,^},hash=-1638714632]]");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper("java.lang.String@cc19532[value={z,[,U,5,e,Z,|,/,G,M,i,&,r,,,^},value={z,[,U,5,e,Z,|,/,G,M,i,&,r,,,^},hash=-1638714632]hash=-1638714632,value={z,[,U,5,e,Z,|,/,G,M,i,&,r,,,^},hash=-1638714632]]");
      assertSame(toStringBuilder0, toStringBuilder1);
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
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
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
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      double[] doubleArray0 = new double[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(doubleArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("u7Sx5E.=X*");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("u7Sx5E.=X*", (short[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      Object[] objectArray0 = new Object[23];
      objectArray0[1] = (Object) toStringBuilder0;
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(objectArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.String@7e4cdbf5[value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},hash=-590121284]hash=-590121284,value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},hash=-590121284]]", toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString("S");
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("u7Sx5E.=X*");
      float[] floatArray0 = new float[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(floatArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      String string0 = ToStringBuilder.reflectionToString((Object) toStringStyle0);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(string0);
      float[] floatArray0 = new float[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("?ai[en&w1wK+", floatArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      String string0 = ToStringBuilder.reflectionToString(object0, toStringStyle0, true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      String string0 = toStringBuilder0.build();
      assertEquals("<null>", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      assertEquals(7, stringBuffer0.length());
      assertEquals("Object[", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      short[] shortArray0 = new short[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.Object@556d9caf[]", shortArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = ToStringBuilder.reflectionToString((Object) "org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      Object[] objectArray0 = new Object[23];
      objectArray0[0] = (Object) objectArray0;
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(objectArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }
}
