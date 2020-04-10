/*

 * Tue Mar 03 16:31:04 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
        FastDateFormat.getInstance("R\"g2sAF|u2Ux9Hg~VfI");
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
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Jc!5*,@/ovQ:_Kw");
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
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("4Bp{?58<^+d7kI6n~~d");
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
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat.getDateInstance(3, timeZone0);
      Locale locale0 = Locale.KOREAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance(1384, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 1384
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("(gS<UZ,sY*>(DVm)");
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
        FastDateFormat.getInstance("org.apache.commons.lang3.time.FastDateFormat");
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
      TimeZone timeZone0 = TimeZone.getTimeZone(">lD<'I[1");
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(">lD<'I[1", timeZone0, locale0);
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
      Locale locale0 = Locale.PRC;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getTimeInstance(1, locale0);
      assertEquals(11, fastDateFormat1.getMaxLengthEstimate());
      assertNotNull(fastDateFormat1);
      
      FastDateFormat fastDateFormat2 = FastDateFormat.getInstance();
      assertEquals(14, fastDateFormat2.getMaxLengthEstimate());
      assertSame(fastDateFormat2, fastDateFormat0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("LN;obl3ij@(v");
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
        FastDateFormat.getInstance("uTv6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("W8ET;X#$(p^6,Z:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("=ezxU4OD[Ry_B#");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: e
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("|U;Hm%7L{Zx", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("OZc]+5H3|P.%ypO");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("r:Hcf`\"PxTZ>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("-2ZDj,M");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("HH:mm", timeZone0);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(1, 1, 90, 1, 1);
      String string0 = fastDateFormat0.format((Calendar) gregorianCalendar0);
      assertEquals("01:01", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("b=mO[w;D3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("FastDateFormat[dd/MM/yy HH:mm]", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      assertEquals(14, fastDateFormat0.getMaxLengthEstimate());
      
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(1, timeZone0);
      assertEquals(19, fastDateFormat1.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      assertEquals(14, fastDateFormat0.getMaxLengthEstimate());
      
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(2);
      assertEquals(15, fastDateFormat1.getMaxLengthEstimate());
      
      FastDateFormat fastDateFormat2 = FastDateFormat.getInstance();
      assertSame(fastDateFormat2, fastDateFormat0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Zc]+5H3|P.%ypO");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Q3kaAj");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("3kaAj");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("?wx`q3\"c5#Yr=PR");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: x
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("mp");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat.getDateInstance(1, timeZone0);
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance((-4086), 0, timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style -4086
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("r6-HV8A@q?{T$~h2|");
      FastDateFormat.getDateTimeInstance(0, 2, timeZone0, (Locale) null);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(2);
      assertEquals("d MMM yyyy", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      FastDateFormat.getTimeInstance(1, locale0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(3);
      assertEquals("dd/MM/yy", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("X;]ll&&ZGhJAuH(d?:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("W8PT;X#$(p^,Z:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("qNPw# ");
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
  public void test34()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getTimeInstance(1);
      assertNotNull(fastDateFormat1);
      
      fastDateFormat0.equals(fastDateFormat1);
      assertEquals(14, fastDateFormat0.getMaxLengthEstimate());
      assertEquals(13, fastDateFormat1.getMaxLengthEstimate());
      assertFalse(fastDateFormat1.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("]i=cm>JFY");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      TimeZone timeZone0 = TimeZone.getTimeZone("r6-HV8A@q?{T$~h2|");
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateTimeInstance(0, 2, timeZone0, (Locale) null);
      assertNotNull(fastDateFormat1);
      assertEquals(37, fastDateFormat1.getMaxLengthEstimate());
      
      FastDateFormat fastDateFormat2 = FastDateFormat.getInstance();
      assertSame(fastDateFormat2, fastDateFormat0);
      assertEquals(14, fastDateFormat2.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("YX@pb ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Y
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      Locale locale0 = Locale.CHINESE;
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
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("h^St");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("KG{*Gk`a2kH");
      assertEquals("KG{*Gk`a2kH", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("_C.!`N\tv", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: C
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("v:7^1E(_<[ Qy");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("h<}nnNNK77S");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: nn
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("<:fO*]r^a|/kA3s(g@C");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("$V62", (TimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }
}
