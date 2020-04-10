/*

 * Tue Mar 03 16:29:59 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FastDateFormat_ESTest extends FastDateFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("RNx!}U{1a");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "The validated character sequence is blank");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("`|JCx)Taw", (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("s+BanR)*j5fAG1os", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, locale0);
      assertEquals(15, fastDateFormat0.getMaxLengthEstimate());
      
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(1, timeZone0);
      assertEquals(20, fastDateFormat1.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("g8MkW6PZwc3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("org.apache.commons.lang3.time.FastDateFormat$UnpaddedMonthField");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("4l", (TimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      assertEquals(14, fastDateFormat0.getMaxLengthEstimate());
      
      Locale locale0 = Locale.JAPAN;
      FastDateFormat fastDateFormat1 = FastDateFormat.getTimeInstance(1, locale0);
      assertEquals(15, fastDateFormat1.getMaxLengthEstimate());
      
      FastDateFormat fastDateFormat2 = FastDateFormat.getInstance();
      assertSame(fastDateFormat2, fastDateFormat0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Lf9ro&", (TimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("T`d,d&");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("E-9e}d%zwXtmNkui");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: e
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Unknown class: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("O8M(e8+b\"%BYq<");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("r");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("+G[W7j){2-VF7d");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(timeZone0).getOffset(anyLong());
      doReturn(0).when(timeZone0).getRawOffset();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1, timeZone0);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(1, 0, 3, 2, 0, 1);
      String string0 = fastDateFormat0.format((Calendar) gregorianCalendar0);
      assertEquals(20, fastDateFormat0.getMaxLengthEstimate());
      assertEquals("January 3, 0001", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Z+bRbbZtEJ$/$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Negative values should not be possible", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("FastDateFormat%[");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FastDateFormat.getInstance();
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance(95);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 95
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("ScWgR");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Qp\":O'QT5pU77@<=6dF");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("I<@.s.?;)L.3pz-z");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("AgBz][]P1ymW90_:Bd}C");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("kx`");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: x
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      Locale locale0 = Locale.ROOT;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Wpe/{<E=-g[@[U@CL", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat.getDateInstance(1, timeZone0);
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(2173, 0, timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 2173
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FastDateFormat.getDateInstance(0);
      TimeZone timeZone0 = TimeZone.getTimeZone("01/01/70 00:00");
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(3, (-769), timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style -769
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      FastDateFormat.getTimeInstance(1, locale0);
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance(95);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 95
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("+X7)_N|Um&H~~_I;;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(",[E6EPv~+nP<zjh");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("wq~tX+Jp$K");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(1, timeZone0);
      assertNotNull(fastDateFormat1);
      
      boolean boolean0 = fastDateFormat1.equals(fastDateFormat0);
      assertTrue(fastDateFormat1.getTimeZoneOverridesCalendar());
      assertEquals(20, fastDateFormat1.getMaxLengthEstimate());
      assertEquals(14, fastDateFormat0.getMaxLengthEstimate());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("*{=idt7*cs$B9K;k3TZ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("`/DYhaf|9F[/Ij+z&");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Y
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: java.util.Locale
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("S]-0ucaD", timeZone0, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test37()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      assertEquals(14, fastDateFormat1.getMaxLengthEstimate());
      assertSame(fastDateFormat1, fastDateFormat0);
      
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      FastDateFormat fastDateFormat2 = FastDateFormat.getDateInstance(1, timeZone0);
      assertNotNull(fastDateFormat2);
      assertTrue(fastDateFormat2.getTimeZoneOverridesCalendar());
      assertEquals(20, fastDateFormat2.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance(" +K");
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("39C)L@fkz|", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: C
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1255, "h:mm:ss a z");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("vbv`R'7@DI7w", (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Zn0]R");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("ft]=Ki<#nkvVF@", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("`VS(98wjf(PUQ*NsLi");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }
}
