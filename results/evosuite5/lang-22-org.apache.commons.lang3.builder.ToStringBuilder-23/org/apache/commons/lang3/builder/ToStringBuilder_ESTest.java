/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 12:34:05 GMT 2019
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
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, (ToStringStyle) null, (StringBuffer) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString("?B)JVEVl,Eh\"GG");
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString((String) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("The style must not be null");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper("java.lang.String@1[value={T,h,e, ,s,t,y,l,e, ,m,u,s,t, ,n,o,t, ,b,e, ,n,u,l,l},hash=-1550154082]");
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper((String) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringBuilder.setDefaultStyle(toStringStyle0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      double[] doubleArray0 = new double[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(doubleArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("The style must not be null");
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((Object) toStringStyle0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("j$SA/({}^Kq2|qPB", (long[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((byte)0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      float[] floatArray0 = new float[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(floatArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(508);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("_KDqHX^");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      short[] shortArray0 = new short[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("_KDqHX^", shortArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      Object[] objectArray0 = new Object[8];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", objectArray0, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, (boolean[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("v#=@D@", (ToStringStyle) null, stringBuffer0);
      toStringBuilder0.append("v#=@D@", (short) (byte)83);
      assertEquals(29, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      Object[] objectArray0 = new Object[6];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(objectArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      int[] intArray0 = new int[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(intArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      String string0 = ToStringBuilder.reflectionToString((Object) "The style must not be null", toStringStyle0, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, 0L);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("Pgx#$_(mGk", (ToStringStyle) null, stringBuffer0);
      char[] charArray0 = new char[0];
      toStringBuilder0.append("", charArray0, true);
      assertEquals(23, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = ToStringBuilder.reflectionToString((Object) "java.util.prefs.PreferencesFactory");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      boolean[] booleanArray0 = new boolean[5];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("!ro)-Tvn", booleanArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("", toStringStyle0);
      float[] floatArray0 = new float[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", floatArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      Class<String> class0 = String.class;
      String string0 = ToStringBuilder.reflectionToString("", toStringStyle0, false, (Class<? super String>) class0);
      //  // Unstable assertion: assertEquals("{},{},00,{},0", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendAsObjectToString("|fM|D9m%");
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      long[] longArray0 = new long[6];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", longArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      toStringBuilder0.append(" g[MBREsDk|IJdnq*", (byte) (-104));
      assertEquals(42, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("_KDqHX^");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("_KDqHX^", '{');
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, (char[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, 1544.8175F);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("f.<NABz/", toStringStyle0);
      double[] doubleArray0 = new double[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("Mac OS X", doubleArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      Object object0 = new Object();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer(1);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, standardToStringStyle0, stringBuffer0);
      toStringBuilder0.append("", false);
      assertEquals(26, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("Pgx#$_(mGk", (ToStringStyle) null, stringBuffer0);
      toStringBuilder0.append("Pgx#$_(mGk", 0.0);
      assertEquals(34, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      byte[] byteArray0 = new byte[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("V", byteArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("f.<NABz/", toStringStyle0);
      int[] intArray0 = new int[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("f.<NABz/", intArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("f.<NABz/", toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("Mac OS X", (double[]) null, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append('l');
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("f.<NABz/", toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      short[] shortArray0 = new short[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(shortArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      short[] shortArray0 = new short[9];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.util.prefs.PreferencesFactory", shortArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      float[] floatArray0 = new float[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, floatArray0, true);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("Q-");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("Pgx#$_(mGk", (ToStringStyle) null, stringBuffer0);
      boolean[] booleanArray0 = new boolean[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(booleanArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test43()  throws Throwable  {
      Object object0 = new Object();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer(1);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, standardToStringStyle0, stringBuffer0);
      toStringBuilder0.append("", (Object) "", false);
      assertEquals(29, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer(1);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("i r!2(V4=~PWj;", standardToStringStyle0, stringBuffer0);
      long[] longArray0 = new long[9];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(longArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test45()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("v#=@D@", (ToStringStyle) null, stringBuffer0);
      byte[] byteArray0 = new byte[4];
      toStringBuilder0.append("", byteArray0, false);
      assertEquals(29, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test46()  throws Throwable  {
      Object object0 = new Object();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer(1);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, standardToStringStyle0, stringBuffer0);
      toStringBuilder0.append((short) (-303));
      assertEquals(24, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test47()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      StringBuffer stringBuffer0 = new StringBuffer(1203);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      toStringBuilder0.append((String) null, 793);
      assertEquals(23, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((-132L));
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      Object[] objectArray0 = new Object[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, objectArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer(512);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, standardToStringStyle0, stringBuffer0);
      String string0 = toStringBuilder0.toString();
      assertEquals("<null>", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("", toStringStyle0);
      String string0 = ToStringBuilder.reflectionToString((Object) toStringBuilder0, (ToStringStyle) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((byte[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer(512);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, standardToStringStyle0, stringBuffer0);
      int[] intArray0 = new int[3];
      toStringBuilder0.append((String) null, intArray0, false);
      //  // Unstable assertion: assertEquals("<size=3>,<null>", stringBuffer0.toString());
      //  // Unstable assertion: assertEquals(15, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test54()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("v#=@D@", (ToStringStyle) null, stringBuffer0);
      toStringBuilder0.append(0.0);
      assertEquals(23, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("", toStringStyle0);
      String string0 = toStringBuilder0.build();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test56()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("v#=@D@", (ToStringStyle) null, stringBuffer0);
      toStringBuilder0.append((float) (byte)46);
      assertEquals(24, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      char[] charArray0 = new char[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(charArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }
}
