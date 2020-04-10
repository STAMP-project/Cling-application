/*

 * Tue Mar 03 16:10:43 GMT 2020
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
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      assertEquals(39, stringBuffer0.length());
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      Integer integer0 = new Integer((-485));
      ToStringStyle.unregister(integer0);
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      assertEquals(39, stringBuffer0.length());
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
      
      boolean boolean0 = ToStringStyle.isRegistered(toStringStyle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      boolean boolean0 = ToStringStyle.isRegistered(stringBuffer0);
      assertEquals(39, stringBuffer0.length());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ToStringStyle.register((Object) null);
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      assertEquals(39, stringBuffer0.length());
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle0.appendSuper(stringBuffer0, "6Oq");
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      assertEquals(39, stringBuffer0.length());
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      ToStringStyle.unregister(stringBuffer0);
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
      assertEquals(39, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      toStringStyle0.appendSuper(stringBuffer0, "");
      Boolean boolean0 = new Boolean("");
      toStringStyle0.append(stringBuffer0, "", (Object) toStringStyle0, boolean0);
      assertEquals(36, stringBuffer0.length());
      assertEquals("<ToStringStyle.SimpleToStringStyle>,", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      toStringStyle0.appendSuper(stringBuffer0, (String) null);
      assertEquals(39, stringBuffer0.length());
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
  }
}
