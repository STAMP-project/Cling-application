/*

 * Tue Mar 03 16:32:21 GMT 2020
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
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("", toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((boolean[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      short[] shortArray0 = new short[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", shortArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper((String) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", (float[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer(1736);
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.appendSuper(stringBuffer0, (String) null);
      assertEquals("}", standardToStringStyle0.getArrayEnd());
      assertTrue(standardToStringStyle0.isDefaultFullDetail());
      assertEquals("{", standardToStringStyle0.getArrayStart());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtStart());
      assertTrue(standardToStringStyle0.isUseClassName());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtEnd());
      assertTrue(standardToStringStyle0.isUseFieldNames());
      assertEquals("]", standardToStringStyle0.getContentEnd());
      assertEquals(">", standardToStringStyle0.getSummaryObjectEndText());
      assertEquals("<", standardToStringStyle0.getSummaryObjectStartText());
      assertFalse(standardToStringStyle0.isUseShortClassName());
      assertEquals("<size=", standardToStringStyle0.getSizeStartText());
      assertEquals("<null>", standardToStringStyle0.getNullText());
      assertEquals("[", standardToStringStyle0.getContentStart());
      assertEquals(",", standardToStringStyle0.getArraySeparator());
      assertEquals("=", standardToStringStyle0.getFieldNameValueSeparator());
      assertTrue(standardToStringStyle0.isUseIdentityHashCode());
      assertEquals(">", standardToStringStyle0.getSizeEndText());
      assertEquals(",", standardToStringStyle0.getFieldSeparator());
      assertTrue(standardToStringStyle0.isArrayContentDetail());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("os.version");
      long[] longArray0 = new long[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", longArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      float[] floatArray0 = new float[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.String@1be68498[value={E,(,^,U,w,x,x,7,, ,,S,{,T,Y,I,e,6,1},value={E,(,^,U,w,x,x,7,, ,,S,{,T,Y,I,e,6,1},hash=525009765]hash=525009765,value={E,(,^,U,w,x,x,7,, ,,S,{,T,Y,I,e,6,1},hash=525009765]]", floatArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer(1);
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      String string0 = ToStringBuilder.reflectionToString((Object) integer0, toStringStyle0, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("~(^Uwxx S{TYIe91");
      short[] shortArray0 = new short[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("~(^Uwxx S{TYIe91", shortArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      int[] intArray0 = new int[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, intArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("os.version");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("os.version", (char[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((byte[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer(1736);
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      boolean[] booleanArray0 = new boolean[5];
      standardToStringStyle0.appendDetail(stringBuffer0, "", booleanArray0);
      assertEquals(31, stringBuffer0.length());
      assertEquals("{false,false,false,false,false}", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      char[] charArray0 = new char[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("long", charArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("", toStringStyle0);
      char[] charArray0 = new char[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", charArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.Integer@53a6db3c[value=1107,value=1107]]", (long[]) null, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("l3P0/+|VR>>");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper("]");
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("~{^UxxRz{TIe91");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("~{^UxxRz{TIe91", (int[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString("E(^Uwxx7 S{TYIe61");
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("['d-[[");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString((String) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.String@25574ef5[value={,?,},/,{,H,r,Q,?,k,a,I},value={,?,},/,{,H,r,Q,?,k,a,I},hash=2040097301]hash=2040097301,value={,?,},/,{,H,r,Q,?,k,a,I},hash=2040097301]]");
      double[] doubleArray0 = new double[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("C[Y$UX+v", doubleArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("~!(^xxRS{TIe91");
      boolean[] booleanArray0 = new boolean[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(booleanArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("~(^UxxRS{TIe91");
      boolean[] booleanArray0 = new boolean[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("~(^UxxRS{TIe91", booleanArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0);
      long[] longArray0 = new long[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(longArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("~(^UxxKR^{TIe91");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((double[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.Integer@1aa63a5c[value=2020,value=2020]]");
      byte[] byteArray0 = new byte[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(byteArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("os.version");
      byte[] byteArray0 = new byte[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("os.version", byteArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0);
      int[] intArray0 = new int[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", intArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("~(^UxxKR^{TIe91");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper("java.lang.String@1bf479d8[value={~,(,^,U,x,x,K,,R,^,{,T,I,e,9,1},value={~,(,^,U,x,x,K,,R,^,{,T,I,e,9,1},hash=-85265429]hash=-85265429,value={~,(,^,U,x,x,K,,R,^,{,T,I,e,9,1},hash=-85265429]]");
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder.setDefaultStyle(toStringStyle0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((Object) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Integer integer0 = new Integer((-1971));
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0, toStringStyle0);
      double[] doubleArray0 = new double[7];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("n", doubleArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("~(^UxxRS{TIe91");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((short[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      Object[] objectArray0 = new Object[5];
      objectArray0[1] = (Object) toStringBuilder0;
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(objectArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("{");
      float[] floatArray0 = new float[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("{", floatArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer(1986);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("os.version", toStringStyle0, stringBuffer0);
      String string0 = toStringBuilder0.toString();
      assertEquals(0, stringBuffer0.length());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0);
      String string0 = toStringBuilder0.build();
      assertEquals("<null>", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer(1736);
      String string0 = ToStringBuilder.reflectionToString((Object) stringBuffer0, toStringStyle0, true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) objectArray0;
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(objectArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }
}
