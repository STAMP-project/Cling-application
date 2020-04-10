/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 20:49:22 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FastDateFormat_ESTest extends FastDateFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("K(8H`v>'wt4o");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("hR@");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("G/p:Vu!``t(uzW%}Tm5");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("[K&eSz7l(-gA@;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: e
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("?WLO. by<:[^&]*U$0=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("AuYHyB");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("OSIXVO ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("fR");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Illegal pattern component: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("a`tY19J/]y'6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("BYT07Si<kp~}DIAW");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("P2~;\"]>W+fv;Ypy6xB");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("g>dyc");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Hurr:m");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("[C<_>Se%50gN`_Uj1m");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: C
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("<null>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("7kQe5cN");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("J8gG*jT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Xd", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("HVA,En=e0?");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("E~}(r");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("WYXFM.my");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Y
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("&ZD7lCj6hP4+1y=5g");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("xW,3}a;yl+[Un>EUTP");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: x
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("FaoV*`wzt");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("The validated array contains null element at index: %d");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("b1zG;k!#p[h+;qnxMk");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Wi@Df[tQ 0n(p", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("No date pattern for locale: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(".U;:7INRw?$Ai=xH");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.UK;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("6w5.cVHM+$Rae~4-)FW", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("0q@.u");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("S*<Kj");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat();
      TimeZone timeZone0 = simpleDateFormat0.getTimeZone();
      FastDateFormat fastDateFormat0 = new FastDateFormat("&0vkKAr-he", timeZone0, (Locale) null);
      StringBuffer stringBuffer0 = new StringBuffer();
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Calendar) null, stringBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      // Undeclared exception!
      try { 
        fastDateFormat0.formatToCharacterIterator("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: java.lang.String
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getTimeInstance(0);
      assertNotNull(fastDateFormat1);
      
      fastDateFormat1.equals(fastDateFormat0);
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
      assertEquals(18, fastDateFormat1.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FastDateFormat.getInstance();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
      assertEquals(20, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test37()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
      
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(0, timeZone0);
      assertEquals("EEEE, MMMM d, yyyy", fastDateFormat1.getPattern());
      
      FastDateFormat fastDateFormat2 = FastDateFormat.getInstance();
      assertSame(fastDateFormat2, fastDateFormat0);
      assertNotNull(fastDateFormat2);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      Locale locale0 = Locale.FRANCE;
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
      assertSame(fastDateFormat1, fastDateFormat0);
      
      FastDateFormat fastDateFormat2 = FastDateFormat.getTimeInstance(0, locale0);
      assertEquals(12, fastDateFormat2.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat.getDateInstance(0, timeZone0);
      Locale locale0 = Locale.FRANCE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      assertEquals("HH' h 'mm z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, locale0);
      assertEquals("ahh'\u6642'mm'\u5206'ss'\u79D2'", fastDateFormat0.getPattern());
      
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(1);
      assertEquals(20, fastDateFormat1.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test41()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      TimeZone timeZone0 = TimeZone.getTimeZone("HH:mm");
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateTimeInstance(3, 2, timeZone0);
      assertEquals(24, fastDateFormat1.getMaxLengthEstimate());
      
      FastDateFormat fastDateFormat2 = FastDateFormat.getInstance();
      assertFalse(fastDateFormat2.getTimeZoneOverridesCalendar());
      assertEquals(21, fastDateFormat2.getMaxLengthEstimate());
      assertSame(fastDateFormat2, fastDateFormat0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat.getDateInstance(2, timeZone0);
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(832, 1, timeZone0, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 832
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FastDateFormat.getDateInstance(0);
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance((-263), 0, timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style -263
         //
         verifyException("java.text.DateFormat", e);
      }
  }
}
