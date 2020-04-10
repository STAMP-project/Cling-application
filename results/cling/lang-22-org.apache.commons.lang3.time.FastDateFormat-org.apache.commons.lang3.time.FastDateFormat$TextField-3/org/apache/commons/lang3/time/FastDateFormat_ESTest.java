/*

 * Tue Mar 03 16:30:05 GMT 2020
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
        FastDateFormat.getInstance("RR)plCuI/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: RR
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("J9mdGRQ3Q-,DQ)#;H/^");
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
        FastDateFormat.getInstance("&~!BB su");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: BB
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat.getDateInstance(3, timeZone0);
      Locale locale0 = Locale.CANADA;
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance(12, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 12
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      assertEquals(17, fastDateFormat0.getMaxLengthEstimate());
      
      Locale locale0 = Locale.ITALIAN;
      FastDateFormat fastDateFormat1 = FastDateFormat.getTimeInstance(1, locale0);
      assertEquals("H.mm.ss z", fastDateFormat1.getPattern());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("_yg|P;?", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("$o dtepatten for locae: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("WE<|+y");
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("(lo/5qmH", timeZone0);
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
  public void test09()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      assertEquals(20, fastDateFormat0.getMaxLengthEstimate());
      
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateFormat fastDateFormat1 = FastDateFormat.getTimeInstance(3, locale0);
      assertNotNull(fastDateFormat1);
      assertEquals("HH:mm", fastDateFormat1.getPattern());
      
      FastDateFormat fastDateFormat2 = FastDateFormat.getInstance();
      assertSame(fastDateFormat2, fastDateFormat0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("*LsVS^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Hw,TY2Vuzj|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("1u$Z_m, AM):^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("eN%");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: e
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("U(Tp,vo_*t F@=j~");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(timeZone0).getDisplayName(anyBoolean() , anyInt() , any(java.util.Locale.class));
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("zHO", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("_ sG63q%G");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("j3;w3t", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(3, 3407, 0);
      TimeZone timeZone0 = TimeZone.getTimeZone("pe6lDAJ+Y&Jy=n");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0);
      String string0 = fastDateFormat0.format((Calendar) gregorianCalendar0);
      assertEquals("0286\u5E7411\u670830\u65E5 \u661F\u671F\u4E8C \u4E0A\u534812\u664200\u520600\u79D2 GMT", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("bKIp");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(">'8+OSDDI@_'kDZro");
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
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("FastDateFormat[", (Locale) null);
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
  public void test23()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      assertEquals(20, fastDateFormat0.getMaxLengthEstimate());
      
      TimeZone timeZone0 = TimeZone.getTimeZone("pe6lDAJ+Y&Jy=n");
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(1, timeZone0);
      assertEquals(13, fastDateFormat1.getMaxLengthEstimate());
      
      FastDateFormat fastDateFormat2 = FastDateFormat.getInstance();
      assertEquals(20, fastDateFormat2.getMaxLengthEstimate());
      assertFalse(fastDateFormat2.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("~07cm:$*nZHwL|]UN");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Q2/[8K;,<[p", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("IuhX>2MvJ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("H.AsQ}5H=F`p");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("3~x,r<u?oA}.Vj!,", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: x
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("p\"- [ ssS");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("pe6lDAJ+Y&Jy=n");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0);
      assertEquals(33, fastDateFormat0.getMaxLengthEstimate());
      
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(1, timeZone0);
      assertEquals(13, fastDateFormat1.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("kD\u0002\"Xx70}F+mg*M1");
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
        FastDateFormat.getInstance("P&t");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("pe6lDAJ+Y&Jy=n");
      FastDateFormat.getDateTimeInstance(0, 0, timeZone0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(2);
      assertEquals("yyyy/M/d", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(1);
      assertNotNull(fastDateFormat1);
      
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
      assertEquals(13, fastDateFormat1.getMaxLengthEstimate());
      assertFalse(boolean0);
      assertEquals(20, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = "i\\u*ZBC`|Y  c";
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(string0);
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
      TimeZone timeZone0 = TimeZone.getTimeZone("pe6lDAJ+Y&Jy=n");
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0);
      assertEquals(33, fastDateFormat1.getMaxLengthEstimate());
      assertNotNull(fastDateFormat1);
      
      FastDateFormat fastDateFormat2 = FastDateFormat.getInstance();
      assertSame(fastDateFormat2, fastDateFormat0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("YakS\"Rv", timeZone0);
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
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        fastDateFormat0.formatToCharacterIterator(locale0);
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
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("~mKS1");
      assertEquals(14, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("<aCcqR^dV&Jr", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: C
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("vK");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("8n", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("f*q[ t'C?_T");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("-V8ooN6IZ%%");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }
}
