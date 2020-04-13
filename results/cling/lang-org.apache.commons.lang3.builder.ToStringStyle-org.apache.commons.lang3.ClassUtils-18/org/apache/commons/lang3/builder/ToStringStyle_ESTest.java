/*

 * Tue Mar 03 16:11:34 GMT 2020
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.builder.StandardToStringStyle;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ToStringStyle_ESTest extends ToStringStyle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.MULTI_LINE_STYLE.appendEnd(stringBuffer0, (Object) null);
      Boolean boolean0 = Boolean.valueOf("java.lang.Boole<n");
      standardToStringStyle0.append(stringBuffer0, "java.lang.Boole<n", (Object) toStringStyle0, boolean0);
      assertEquals(56, stringBuffer0.length());
      assertEquals("\n]java.lang.Boole<n=<ToStringStyle.SimpleToStringStyle>,", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringStyle.unregister(toStringStyle0);
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle1.appendStart(stringBuffer0, toStringStyle0);
      assertEquals(34, stringBuffer0.length());
      assertEquals("ToStringStyle.SimpleToStringStyle[", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Character character0 = Character.valueOf('7');
      ToStringStyle.register(character0);
      boolean boolean0 = ToStringStyle.isRegistered(character0);
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean1 = new Boolean(":59wCCbk!nc9MM");
      toStringStyle0.append(stringBuffer0, ":59wCCbk!nc9MM", (Object) toStringStyle0, boolean1);
      assertEquals(":59wCCbk!nc9MM=<ToStringStyle.DefaultToStringStyle>,", stringBuffer0.toString());
      assertFalse(boolean1.equals((Object)boolean0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToStringStyle.register((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("RCJD");
      Boolean boolean0 = new Boolean("Cu!Sa");
      toStringStyle0.append(stringBuffer0, "RCJD", (Object) toStringStyle0, boolean0);
      assertEquals(45, stringBuffer0.length());
      assertEquals("RCJD<ToStringStyle.NoFieldNameToStringStyle>,", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      toStringStyle0.appendToString(stringBuffer0, "]");
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle1.appendStart(stringBuffer0, toStringStyle0);
      assertEquals("ToStringStyle.DefaultToStringStyle[", stringBuffer0.toString());
      assertEquals(35, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("RCJD");
      toStringStyle0.appendToString(stringBuffer0, "Cu!Sa");
      Boolean boolean0 = new Boolean("Cu!Sa");
      toStringStyle0.append(stringBuffer0, "RCJD", (Object) toStringStyle0, boolean0);
      assertEquals("RCJD<ToStringStyle.NoFieldNameToStringStyle>,", stringBuffer0.toString());
      assertEquals(45, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      toStringStyle0.appendToString(stringBuffer0, (String) null);
      Boolean boolean0 = Boolean.FALSE;
      toStringStyle0.append(stringBuffer0, (String) null, (Object) toStringStyle0, boolean0);
      assertEquals(37, stringBuffer0.length());
      assertEquals("<ToStringStyle.DefaultToStringStyle>,", stringBuffer0.toString());
  }
}
