/*

 * Tue Mar 03 16:10:56 GMT 2020
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ToStringStyle_ESTest extends ToStringStyle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = new Boolean("BS.Uen|oW{gypFX5K");
      toStringStyle0.append(stringBuffer0, "BS.Uen|oW{gypFX5K", (Object) toStringStyle0, boolean0);
      ToStringStyle.unregister(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = new Boolean(false);
      toStringStyle0.append(stringBuffer0, "BS.Uen|o{gypFX5K", (Object) toStringStyle0, boolean0);
      // Undeclared exception!
      try { 
        toStringStyle0.appendInternal(stringBuffer0, (String) null, (Object) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.builder.ToStringStyle", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = new Boolean("?pUen|o{ypAFX5K");
      toStringStyle0.append(stringBuffer0, "?pUen|o{ypAFX5K", (Object) toStringStyle0, boolean0);
      toStringStyle0.appendToString(stringBuffer0, "?pUen|o{ypAFX5K");
      assertEquals(57, stringBuffer0.length());
      assertEquals("?pUen|o{ypAFX5K=<ToStringStyle.ShortPrefixToStringStyle>,", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = new Boolean("BS.Uen|o{gypFX5K");
      toStringStyle0.append(stringBuffer0, "BS.Uen|o{gypFX5K", (Object) toStringStyle0, boolean0);
      ToStringStyle.register(boolean0);
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) boolean0;
      toStringStyle0.appendDetail(stringBuffer0, "BS.Uen|o{gypFX5K", objectArray0);
      assertEquals(75, stringBuffer0.length());
      assertEquals("BS.Uen|o{gypFX5K=<ToStringStyle.DefaultToStringStyle>,{false,<null>,<null>}", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("");
      toStringStyle0.appendSuper(stringBuffer0, "");
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle1.appendStart(stringBuffer0, toStringStyle0);
      assertEquals("ToStringStyle.SimpleToStringStyle[", stringBuffer0.toString());
      assertEquals(34, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = new Boolean("BS.Uen|o{gypFX5K");
      toStringStyle0.append(stringBuffer0, "BS.Uen|o{gypFX5K", (Object) toStringStyle0, boolean0);
      toStringStyle0.appendToString(stringBuffer0, (String) null);
      assertEquals(54, stringBuffer0.length());
      assertEquals("BS.Uen|o{gypFX5K=<ToStringStyle.DefaultToStringStyle>,", stringBuffer0.toString());
  }
}
