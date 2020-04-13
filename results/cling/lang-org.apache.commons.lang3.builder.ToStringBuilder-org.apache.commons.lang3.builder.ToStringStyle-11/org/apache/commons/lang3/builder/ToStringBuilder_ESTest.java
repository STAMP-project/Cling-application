/*

 * Tue Mar 03 16:31:22 GMT 2020
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
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.String@68cfa842[value={X,y,Y,%,Y,-,x,[,:,s,{,B,!,>},value={X,y,Y,%,Y,-,x,[,:,s,{,B,!,>},hash=2021010881]hash=2021010881,value={X,y,Y,%,Y,-,x,[,:,s,{,B,!,>},hash=2021010881]]");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("<", (boolean[]) null, false);
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
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.String@7c50c629[value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},hash=-590121284]hash=-590121284,value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},hash=-590121284]]");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((float[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      long[] longArray0 = new long[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("org.apache.commons.lang3.builder.ToStringBuilder@7b210075[buffer=java.lang.Object@608166ab[{64,87,107,-83}]{64,87,107,-83}]]<null>]]]]]]]]],buffer=java.lang.Object@608166ab[{64,87,107,-83}]{64,87,107,-83}]]<null>]]]]]]]]]],object=java.lang.Object@608166ab,style=org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle@7ea212fb]object=java.lang.Object@608166ab,buffer=java.lang.Object@608166ab[{64,87,107,-83}]{64,87,107,-83}]]<null>]]]]]]]]]]],object=java.lang.Object@608166ab,style=org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle@7ea212fb]style=org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle@7ea212fb,buffer=java.lang.Object@608166ab[{64,87,107,-83}]{64,87,107,-83}]]<null>]]]]]]]]]]]],object=java.lang.Object@608166ab,style=org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle@7ea212fb]]", longArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer(2035);
      String string0 = ToStringBuilder.reflectionToString((Object) integer0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.String@7c50c629[value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},hash=-590121284]hash=-590121284,value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},hash=-590121284]]");
      short[] shortArray0 = new short[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.lang.String@7c50c629[value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},hash=-590121284]hash=-590121284,value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},hash=-590121284]]", shortArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0);
      int[] intArray0 = new int[9];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(intArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("Solaris", (char[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", (byte[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.String@63cd5771[value={X,y,Y,%,Y,-,x,[,:,s,{,B,!,b},value={X,y,Y,%,Y,-,x,[,:,s,{,B,!,b},hash=2021010917]hash=2021010917,value={X,y,Y,%,Y,-,x,[,:,s,{,B,!,b},hash=2021010917]]");
      char[] charArray0 = new char[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(charArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      char[] charArray0 = new char[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("hFs", charArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("<size=");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((long[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString("java.lang.Object@1841e86[]");
      assertSame(toStringBuilder0, toStringBuilder1);
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
      Integer integer0 = new Integer(59);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString((String) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      boolean[] booleanArray0 = new boolean[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(booleanArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("7");
      boolean[] booleanArray0 = new boolean[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("7", booleanArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Integer integer0 = new Integer(2035);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0);
      long[] longArray0 = new long[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(longArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.Object@56077d39[]");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("org.apache.commons.lang3.builder.ToStringStyle", (double[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      byte[] byteArray0 = new byte[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(byteArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      byte[] byteArray0 = new byte[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("J2`B5>^]9_QFEo9+e", byteArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = new Integer(59);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0);
      int[] intArray0 = new int[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, intArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("java.lang.String@7c50c629[value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},hash=-590121284]hash=-590121284,value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},hash=-590121284]]");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString("java.lang.String@7c50c629[value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},hash=-590121284]hash=-590121284,value={o,r,g,.,a,p,a,c,h,e,.,c,o,m,m,o,n,s,.,l,a,n,g,3,.,b,u,i,l,d,e,r,.,T,o,S,t,r,i,n,g,S,t,y,l,e,$,S,i,m,p,l,e,T,o,S,t,r,i,n,g,S,t,y,l,e},hash=-590121284]]");
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ToStringBuilder.setDefaultStyle(toStringStyle0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((Object) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) objectArray0;
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(objectArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("or.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
      double[] doubleArray0 = new double[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(doubleArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(":", (short[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      Object[] objectArray0 = new Object[8];
      objectArray0[7] = (Object) toStringBuilder0;
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(objectArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper("`D):.A,pbnql");
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      float[] floatArray0 = new float[2];
      toStringBuilder0.append("", floatArray0);
      assertEquals(9, stringBuffer0.length());
      assertEquals("{0.0,0.0}", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      float[] floatArray0 = new float[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle", floatArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      String string0 = ToStringBuilder.reflectionToString(object0, toStringStyle0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null, toStringStyle0);
      String string0 = toStringBuilder0.build();
      assertEquals("<null>", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      Integer integer0 = new Integer(0);
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0, toStringStyle0, stringBuffer0);
      double[] doubleArray0 = new double[1];
      toStringBuilder0.append("{Gs&JXAZg&ONt", doubleArray0, false);
      assertEquals(54, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      short[] shortArray0 = new short[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(shortArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = ToStringBuilder.reflectionToString((Object) "org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle");
      assertNotNull(string0);
  }
}
