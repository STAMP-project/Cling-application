/*

 * Tue Mar 03 18:37:25 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormat_ESTest extends DateTimeFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      DateTimeFormat.forPattern("G),@%l=Y tbdd#");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      DateTimeFormat.forPattern("E(if-T6[#");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      DateTimeFormat.forPattern("L/DkzjGZ,Pai%< zE\"");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      DateTimeFormat.forPattern("F");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      DateTimeFormat.forPattern("<EadR^<A3Li91 aSyV5");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      DateTimeFormat.forPattern(":0H\"R,8nf=v7");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DateTimeFormat.forPattern("Er^WX!>X!2");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfSecond(102, 95);
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "No datetime pattern for locale: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DateTimeFormat.forPattern("`]yH\"!QX+");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      DateTimeFormat.forPattern("e4J/\"Oq%");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      DateTimeFormat.forPattern(".>B9it/Jt^HKzp=");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      DateTimeFormat.forPattern("a SM/p}d<");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder0.appendPattern("zJqynYy>Dgr2SN");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      DateTimeFormat.forPattern("D8A");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      DateTimeFormat.forPattern("Gs_6*G~Ic/m:dmr@XK");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("u");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfSecond(2036, (-1747));
      DateTimeFormat.forPattern("Time");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      DateTimeFormat.forPattern("'");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      DateTimeFormat.forPattern("!FDE9");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      DateTimeFormat.forPattern("d}6A");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      DateTimeFormat.forPattern("xzm_j3UK{U'*wh Z|P");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      DateTimeFormat.forPattern("xMHtn.)CR*");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      DateTimeFormat.forPattern("weekyearOfCentury");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      DateTimeFormat.forPattern("?#g:/VbhtLo");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      DateTimeFormat.forPattern("YA{@Y8&LzvYV|}V!dVa");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      DateTimeFormat.forPattern("4KSZ~5iAmGUL`");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      DateTimeFormat.forPattern("]o/*Rg");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      DateTimeFormat.forPattern("@Y[?ycpw");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      DateTimeFormat.forPattern("YfV@1u?k");
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder0.appendPattern("x9,J7M_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      DateTimeFormat.forPattern("@Y[?yhpw");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      DateTimeFormat.forPattern("HC8?EI");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      DateTimeFormat.forPattern("qW.GAn|ow_T~dD)B0W");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      DateTimeFormat.forPattern("n4k}GE5k9P=jC}+");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      DateTimeFormat.forPattern("}\"xHD^_HCOmd*Ja");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      DateTimeFormat.forPattern("m~5@}BHJ}-$Oqv");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      DateTimeFormat.forPattern("%9Gv");
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendFractionOfSecond(102, 77);
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder1, "Asia/Yerevan");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      DateTimeFormat.forPattern("(]HZ&4`}algSbggl");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test39()  throws Throwable  {
      DateTimeFormat.forPattern("bce");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test40()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfDay(90, 2421);
      DateTimeFormat.forPattern(";*8GPQ+7\"o>Uh");
  }
}
