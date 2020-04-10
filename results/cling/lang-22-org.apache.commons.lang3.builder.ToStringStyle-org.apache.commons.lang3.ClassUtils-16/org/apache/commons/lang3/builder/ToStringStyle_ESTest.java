/*

 * Tue Mar 03 16:11:22 GMT 2020
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.builder.StandardToStringStyle;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ToStringStyle_ESTest extends ToStringStyle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ToStringStyle.unregister((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      // Undeclared exception!
      try { 
        standardToStringStyle0.SHORT_PREFIX_STYLE.appendStart((StringBuffer) null, toStringStyle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.builder.ToStringStyle", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ToStringStyle.unregister("u[gGA*");
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("u[gGA*");
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      assertEquals("u[gGA*ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
      assertEquals(45, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Float float0 = new Float((-103.89702607140516));
      ToStringStyle.isRegistered(float0);
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      Boolean boolean0 = Boolean.FALSE;
      standardToStringStyle0.append(stringBuffer0, "java.lang.Byte", (Object) toStringStyle0, boolean0);
      assertEquals(52, stringBuffer0.length());
      assertEquals("[", standardToStringStyle0.getContentStart());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringStyle.register((Object) null);
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      // Undeclared exception!
      try { 
        standardToStringStyle0.SHORT_PREFIX_STYLE.appendStart((StringBuffer) null, toStringStyle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.builder.ToStringStyle", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      toStringStyle0.appendSuper((StringBuffer) null, "m.OK?a28I%g(J<K$");
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      // Undeclared exception!
      try { 
        standardToStringStyle0.SHORT_PREFIX_STYLE.appendStart((StringBuffer) null, toStringStyle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.builder.ToStringStyle", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.appendToString(stringBuffer0, (String) null);
      Boolean boolean0 = new Boolean((String) null);
      standardToStringStyle0.append(stringBuffer0, (String) null, (Object) toStringStyle0, boolean0);
      assertEquals(39, stringBuffer0.length());
      assertEquals("<ToStringStyle.MultiLineToStringStyle>,", stringBuffer0.toString());
  }
}
