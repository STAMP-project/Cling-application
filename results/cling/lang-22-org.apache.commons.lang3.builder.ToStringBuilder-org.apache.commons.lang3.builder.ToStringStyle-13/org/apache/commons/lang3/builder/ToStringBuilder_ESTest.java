/*

 * Tue Mar 03 16:34:02 GMT 2020
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
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", (boolean[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper((String) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(">");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("{c2a&qD1bSv}t/na", (float[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      long[] longArray0 = new long[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, longArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer((-1023));
      String string0 = ToStringBuilder.reflectionToString((Object) integer0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = ToStringBuilder.reflectionToString((Object) ">");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(">");
      short[] shortArray0 = new short[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(">", shortArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      int[] intArray0 = new int[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(intArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("java.awt.fonts");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0, stringBuffer0);
      toStringBuilder0.append(":6ElZ~4", (char[]) null, false);
      assertEquals(37, stringBuffer0.length());
      assertEquals("java.awt.fonts:6ElZ~4=<null>\n  <null>", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(">");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((byte[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      Integer integer0 = new Integer((-2472));
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0, toStringStyle0);
      boolean[] booleanArray0 = new boolean[5];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", booleanArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("}");
      char[] charArray0 = new char[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("dh>i~o", charArray0, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      char[] charArray0 = new char[6];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("dh>i~o", charArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(">");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((long[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      toStringBuilder0.appendSuper("java.lang.Object@75a54124[]");
      assertEquals(26, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("java.awt.fonts");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0, stringBuffer0);
      toStringBuilder0.append((int[]) null);
      assertEquals(29, stringBuffer0.length());
      assertEquals("java.awt.fonts<null>\n  <null>", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("java.awt.fonts");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0, stringBuffer0);
      toStringBuilder0.appendToString((String) null);
      assertEquals(20, stringBuffer0.length());
      assertEquals("java.awt.fonts<null>", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      double[] doubleArray0 = new double[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", doubleArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      long[] longArray0 = new long[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("{", longArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(",A8m'M7,4#!", (double[]) null, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(">");
      byte[] byteArray0 = new byte[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(byteArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      byte[] byteArray0 = new byte[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, byteArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(">", (ToStringStyle) null);
      int[] intArray0 = new int[6];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(">", intArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(">");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString("java.lang.String@21fcea59[value=[C@2bd54017,value=[C@2bd54017,hash=62]hash=62,value=[C@2bd54017,hash=62]]");
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
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringBuilder.setDefaultStyle(standardToStringStyle0);
      assertEquals("]", standardToStringStyle0.getContentEnd());
      assertEquals("=", standardToStringStyle0.getFieldNameValueSeparator());
      assertTrue(standardToStringStyle0.isUseFieldNames());
      assertEquals(">", standardToStringStyle0.getSizeEndText());
      assertEquals("}", standardToStringStyle0.getArrayEnd());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtEnd());
      assertFalse(standardToStringStyle0.isFieldSeparatorAtStart());
      assertEquals("{", standardToStringStyle0.getArrayStart());
      assertTrue(standardToStringStyle0.isUseClassName());
      assertEquals(">", standardToStringStyle0.getSummaryObjectEndText());
      assertEquals("<", standardToStringStyle0.getSummaryObjectStartText());
      assertEquals("<size=", standardToStringStyle0.getSizeStartText());
      assertTrue(standardToStringStyle0.isDefaultFullDetail());
      assertEquals("<null>", standardToStringStyle0.getNullText());
      assertFalse(standardToStringStyle0.isUseShortClassName());
      assertTrue(standardToStringStyle0.isUseIdentityHashCode());
      assertEquals(",", standardToStringStyle0.getFieldSeparator());
      assertEquals(",", standardToStringStyle0.getArraySeparator());
      assertEquals("[", standardToStringStyle0.getContentStart());
      assertTrue(standardToStringStyle0.isArrayContentDetail());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("[X~?2)(e", (Object) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      double[] doubleArray0 = new double[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(doubleArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("~Ec\"se7(|-s^pZ", (short[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper("}");
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("<null>");
      Object[] objectArray0 = new Object[2];
      objectArray0[1] = (Object) "<null>";
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(objectArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("java.awt.fonts");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0, stringBuffer0);
      float[] floatArray0 = new float[6];
      toStringBuilder0.append((String) null, floatArray0);
      assertEquals("java.awt.fonts{0.0,0.0,0.0,0.0,0.0,0.0}\n  <null>", stringBuffer0.toString());
      assertEquals(48, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      float[] floatArray0 = new float[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", floatArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      Object object0 = new Object();
      String string0 = ToStringBuilder.reflectionToString(object0, toStringStyle0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((Object) toStringBuilder0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(">");
      short[] shortArray0 = new short[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(shortArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      Class<Object> class0 = Object.class;
      String string0 = ToStringBuilder.reflectionToString("HEM1O f", toStringStyle0, false, (Class<? super String>) class0);
      assertEquals("{H,E,M,1,O, ,f},{H,E,M,1,O, ,f},15238149001523814900,{H,E,M,1,O, ,f},1523814900", string0);
  }
}
