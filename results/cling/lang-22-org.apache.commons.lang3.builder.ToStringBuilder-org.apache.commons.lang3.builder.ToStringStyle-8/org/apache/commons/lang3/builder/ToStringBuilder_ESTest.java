/*

 * Tue Mar 03 16:26:29 GMT 2020
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
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("boolean");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", (boolean[]) null, true);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper("org.apache.commons.lang3.builder.ToStringBuilder@645e4fe7[buffer=java.lang.Object@62b31900[]]]]]]]],buffer=java.lang.Object@62b31900[]]]]]]]]],object=java.lang.Object@62b31900,style=org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle@13286c9b]object=java.lang.Object@62b31900,buffer=java.lang.Object@62b31900[]]]]]]]]]],object=java.lang.Object@62b31900,style=org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle@13286c9b]style=org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle@13286c9b,buffer=java.lang.Object@62b31900[]]]]]]]]]]],object=java.lang.Object@62b31900,style=org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle@13286c9b]]");
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper((String) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("tPE$ud($Q:!s$", (float[]) null, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      long[] longArray0 = new long[7];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("wK7H*MxtMWQOK|", longArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(57);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((Object) integer0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      short[] shortArray0 = new short[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, shortArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.Object@6c05df95[]");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(";", (char[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("boolekan");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((byte[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("U=!|t~PX=R?V=dKW");
      char[] charArray0 = new char[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("U=!|t~PX=R?V=dKW", charArray0, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      char[] charArray0 = new char[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", charArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("U=*t~PX=R?V=dKW");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("U=*t~PX=R?V=dKW", (long[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString("java.lang.Object@4d9950d8[]");
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((int[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("U=*t~PX=R?V=dKW");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString((String) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      double[] doubleArray0 = new double[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("<null>", doubleArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("U=v~PX=R?VZdKW");
      boolean[] booleanArray0 = new boolean[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(booleanArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.Object@172531fd[]");
      boolean[] booleanArray0 = new boolean[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.Object@5510f7c5[]", booleanArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      long[] longArray0 = new long[7];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("wK7H*MxtMWQOK|", longArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, standardToStringStyle0);
      toStringBuilder0.append("{j", (double[]) null, true);
      assertEquals(">", standardToStringStyle0.getSummaryObjectEndText());
      assertTrue(standardToStringStyle0.isUseFieldNames());
      assertEquals("=", standardToStringStyle0.getFieldNameValueSeparator());
      assertEquals(">", standardToStringStyle0.getSizeEndText());
      assertTrue(standardToStringStyle0.isUseIdentityHashCode());
      assertEquals(",", standardToStringStyle0.getArraySeparator());
      assertFalse(standardToStringStyle0.isUseShortClassName());
      assertEquals(",", standardToStringStyle0.getFieldSeparator());
      assertEquals("<null>", standardToStringStyle0.getNullText());
      assertTrue(standardToStringStyle0.isArrayContentDetail());
      assertEquals("[", standardToStringStyle0.getContentStart());
      assertTrue(standardToStringStyle0.isDefaultFullDetail());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtEnd());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtStart());
      assertTrue(standardToStringStyle0.isUseClassName());
      assertEquals("{", standardToStringStyle0.getArrayStart());
      assertEquals("}", standardToStringStyle0.getArrayEnd());
      assertEquals("]", standardToStringStyle0.getContentEnd());
      assertEquals("<size=", standardToStringStyle0.getSizeStartText());
      assertEquals("<", standardToStringStyle0.getSummaryObjectStartText());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      byte[] byteArray0 = new byte[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(byteArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      byte[] byteArray0 = new byte[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("org.apache.commons.lang3.builder.ToStringBuilder@1519c4ea[buffer=java.lang.Object@61d116c[]]]]]]]],buffer=java.lang.Object@61d116c[]]]]]]]]],object=java.lang.Object@61d116c,style=org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle@13286c9b]object=java.lang.Object@61d116c,buffer=java.lang.Object@61d116c[]]]]]]]]]],object=java.lang.Object@61d116c,style=org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle@13286c9b]style=org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle@13286c9b,buffer=java.lang.Object@61d116c[]]]]]]]]]]],object=java.lang.Object@61d116c,style=org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle@13286c9b]]", byteArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.Object@575a959f[]");
      int[] intArray0 = new int[5];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(intArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = new Object();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, standardToStringStyle0);
      int[] intArray0 = new int[1];
      toStringBuilder0.append("{j", intArray0, false);
      assertEquals("=", standardToStringStyle0.getFieldNameValueSeparator());
      assertFalse(standardToStringStyle0.isUseShortClassName());
      assertEquals("[", standardToStringStyle0.getContentStart());
      assertEquals("<size=", standardToStringStyle0.getSizeStartText());
      assertEquals("<null>", standardToStringStyle0.getNullText());
      assertEquals(",", standardToStringStyle0.getArraySeparator());
      assertEquals("]", standardToStringStyle0.getContentEnd());
      assertEquals(">", standardToStringStyle0.getSummaryObjectEndText());
      assertTrue(standardToStringStyle0.isUseFieldNames());
      assertEquals("{", standardToStringStyle0.getArrayStart());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtStart());
      assertEquals("}", standardToStringStyle0.getArrayEnd());
      assertTrue(standardToStringStyle0.isUseIdentityHashCode());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtEnd());
      assertEquals("<", standardToStringStyle0.getSummaryObjectStartText());
      assertTrue(standardToStringStyle0.isArrayContentDetail());
      assertTrue(standardToStringStyle0.isUseClassName());
      assertEquals(",", standardToStringStyle0.getFieldSeparator());
      assertEquals(">", standardToStringStyle0.getSizeEndText());
      assertTrue(standardToStringStyle0.isDefaultFullDetail());
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
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringBuilder.setDefaultStyle(standardToStringStyle0);
      assertTrue(standardToStringStyle0.isDefaultFullDetail());
      assertTrue(standardToStringStyle0.isArrayContentDetail());
      assertEquals("<", standardToStringStyle0.getSummaryObjectStartText());
      assertTrue(standardToStringStyle0.isUseClassName());
      assertEquals("{", standardToStringStyle0.getArrayStart());
      assertEquals("<null>", standardToStringStyle0.getNullText());
      assertFalse(standardToStringStyle0.isUseShortClassName());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtStart());
      assertEquals("<size=", standardToStringStyle0.getSizeStartText());
      assertTrue(standardToStringStyle0.isUseFieldNames());
      assertEquals(">", standardToStringStyle0.getSizeEndText());
      assertTrue(standardToStringStyle0.isUseIdentityHashCode());
      assertEquals("[", standardToStringStyle0.getContentStart());
      assertEquals(",", standardToStringStyle0.getFieldSeparator());
      assertEquals("}", standardToStringStyle0.getArrayEnd());
      assertEquals(",", standardToStringStyle0.getArraySeparator());
      assertEquals(">", standardToStringStyle0.getSummaryObjectEndText());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtEnd());
      assertEquals("]", standardToStringStyle0.getContentEnd());
      assertEquals("=", standardToStringStyle0.getFieldNameValueSeparator());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((Object) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.Object@5aed3c61[]");
      float[] floatArray0 = new float[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.Object@5aed3c61[]", floatArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Integer integer0 = new Integer((-1567));
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0);
      double[] doubleArray0 = new double[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", doubleArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = new Object();
      String string0 = ToStringBuilder.reflectionToString(object0, (ToStringStyle) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("\"LfIMNH<<_]F9[gCR");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((short[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = new Object();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, standardToStringStyle0);
      Object[] objectArray0 = new Object[8];
      objectArray0[3] = (Object) toStringBuilder0;
      toStringBuilder0.append(objectArray0);
      assertEquals(",", standardToStringStyle0.getFieldSeparator());
      assertEquals(",", standardToStringStyle0.getArraySeparator());
      assertEquals("}", standardToStringStyle0.getArrayEnd());
      assertTrue(standardToStringStyle0.isArrayContentDetail());
      assertEquals("<null>", standardToStringStyle0.getNullText());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtStart());
      assertEquals(">", standardToStringStyle0.getSummaryObjectEndText());
      assertTrue(standardToStringStyle0.isUseFieldNames());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(">?VPnLGnlOABvo 3");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString(">?VPnLGnlOABvo 3");
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      float[] floatArray0 = new float[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", floatArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      String string0 = ToStringBuilder.reflectionToString(object0, toStringStyle0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      String string0 = toStringBuilder0.toString();
      assertEquals("<null>", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      Object object0 = new Object();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, standardToStringStyle0);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "{j");
      ToStringBuilder toStringBuilder1 = new ToStringBuilder(toStringBuilder0, standardToStringStyle0, stringBuffer0);
      assertEquals(60, stringBuffer0.length());
      assertEquals("]", standardToStringStyle0.getContentEnd());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      short[] shortArray0 = new short[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(shortArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = ToStringBuilder.reflectionToString((Object) "bool)ean");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = new Object();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, standardToStringStyle0);
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) objectArray0;
      toStringBuilder0.append(objectArray0);
      assertTrue(standardToStringStyle0.isUseClassName());
      assertEquals("{", standardToStringStyle0.getArrayStart());
      assertTrue(standardToStringStyle0.isDefaultFullDetail());
      assertTrue(standardToStringStyle0.isArrayContentDetail());
      assertFalse(standardToStringStyle0.isUseShortClassName());
      assertEquals("[", standardToStringStyle0.getContentStart());
      assertEquals(",", standardToStringStyle0.getFieldSeparator());
      assertEquals("<null>", standardToStringStyle0.getNullText());
      assertEquals(",", standardToStringStyle0.getArraySeparator());
      assertTrue(standardToStringStyle0.isUseIdentityHashCode());
      assertEquals(">", standardToStringStyle0.getSizeEndText());
      assertEquals("}", standardToStringStyle0.getArrayEnd());
      assertEquals("=", standardToStringStyle0.getFieldNameValueSeparator());
      assertTrue(standardToStringStyle0.isUseFieldNames());
      assertEquals("]", standardToStringStyle0.getContentEnd());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtEnd());
      assertEquals(">", standardToStringStyle0.getSummaryObjectEndText());
      assertEquals("<size=", standardToStringStyle0.getSizeStartText());
      assertEquals("<", standardToStringStyle0.getSummaryObjectStartText());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtStart());
  }
}
