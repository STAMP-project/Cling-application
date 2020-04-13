/*

 * Tue Mar 03 16:11:11 GMT 2020
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ToStringStyle_ESTest extends ToStringStyle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ToStringStyle.unregister((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      Boolean boolean0 = new Boolean("");
      StringBuffer stringBuffer0 = new StringBuffer("Po6^y,l9_gs<Jq");
      toStringStyle0.append(stringBuffer0, "", (Object) toStringStyle0, boolean0);
      assertEquals("Po6^y,l9_gs<Jq=<ToStringStyle.ShortPrefixToStringStyle>,", stringBuffer0.toString());
      assertEquals(56, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("java.awt.fonts");
      Boolean boolean0 = Boolean.FALSE;
      toStringStyle0.append(stringBuffer0, "java.awt.fonts", (Object) toStringStyle0, boolean0);
      ToStringStyle.unregister(stringBuffer0);
      assertEquals(70, stringBuffer0.length());
      assertEquals("java.awt.fontsjava.awt.fonts=<ToStringStyle.ShortPrefixToStringStyle>,", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ToStringStyle.register((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle1.appendStart(stringBuffer0, toStringStyle0);
      assertEquals("ToStringStyle.NoFieldNameToStringStyle[", stringBuffer0.toString());
      assertEquals(39, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("]");
      toStringStyle0.appendToString(stringBuffer0, "]");
      Boolean boolean0 = new Boolean("]");
      toStringStyle0.append(stringBuffer0, "]", (Object) toStringStyle0, boolean0);
      assertEquals("]]=<ToStringStyle.DefaultToStringStyle>,", stringBuffer0.toString());
      assertEquals(40, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("jaa.awkt.fonts");
      Boolean boolean0 = Boolean.valueOf("jaa.awkt.fonts");
      toStringStyle0.append(stringBuffer0, "jaa.awkt.fonts", (Object) toStringStyle0, boolean0);
      Short short0 = new Short((short)70);
      toStringStyle0.appendStart(stringBuffer0, short0);
      toStringStyle0.append(stringBuffer0, "[java.lang.String", (Object) short0, boolean0);
      assertEquals(102, stringBuffer0.length());
      assertEquals("jaa.awkt.fontsjaa.awkt.fonts=<ToStringStyle.ShortPrefixToStringStyle>,Short[[java.lang.String=<Short>,", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("java.awt.fonts");
      toStringStyle0.appendToString(stringBuffer0, "java.awt.fonts");
      Boolean boolean0 = Boolean.FALSE;
      toStringStyle0.append(stringBuffer0, "java.awt.fonts", (Object) toStringStyle0, boolean0);
      assertEquals("java.awt.fontsjava.awt.fonts=<ToStringStyle.ShortPrefixToStringStyle>,", stringBuffer0.toString());
      assertEquals(70, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("]");
      toStringStyle0.appendToString(stringBuffer0, (String) null);
      Boolean boolean0 = new Boolean((String) null);
      toStringStyle0.append(stringBuffer0, (String) null, (Object) toStringStyle0, boolean0);
      assertEquals("]<ToStringStyle.DefaultToStringStyle>,", stringBuffer0.toString());
      assertEquals(38, stringBuffer0.length());
  }
}
