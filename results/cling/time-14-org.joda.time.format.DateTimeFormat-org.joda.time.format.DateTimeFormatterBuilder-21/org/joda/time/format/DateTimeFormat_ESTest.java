/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 03:34:12 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormat_ESTest extends DateTimeFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      DateTimeFormat.forPattern("h~4^J)yKJ");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      DateTimeFormat.forPattern("[s_J)EDGt[L|^&W#");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder0.appendPattern("y|G4r*;[[/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "-k(J+dn9TPk-Hk,");
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
  public void test04()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildPrinter();
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.forPattern("HwKbCC3");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildFormatter();
      DateTimeFormat.forPattern("d9mM)JdkOWf3U");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DateTimeFormat.forPattern("GMT-");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      DateTimeFormat.forPattern("MIN > MAX");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DateTimeFormat.forPattern("HZw)L");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      DateTimeFormat.forPattern("8zIXHk~U{]h^S}GK-");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "!z.JP$^(,=IG");
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
  public void test11()  throws Throwable  {
      DateTimeFormat.forPattern("Y=(]HN:y'A.U #");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      DateTimeFormat.forPattern("6,}aJK8XR");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfDay(106, 0);
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("Illegal pattern component: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType0, 1, 625);
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder0.appendPattern(")Y0Ja|-b>E`Eopr");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendPattern("~");
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder0.appendPattern(")Y0Ja|-b>E`Eopr");
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
  public void test16()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "66E;9");
      DateTimeFormat.forPattern(")G~WQ)Fvm.5bU");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "wI");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      DateTimeFormat.forPattern("wJ2k'9pZuH,G");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "@SYD");
      DateTimeFormat.forPattern(",4G;rzhXA");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "5yK7D");
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "Invalid pattern specification");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildPrinter();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "h?^.?FAF7/[x<W");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: F
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      DateTimeFormat.forPattern("MF g|]dM &+");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType0, 92, 730);
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "h?^.?FAF7/[x<W");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: F
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      DateTimeFormat.forPattern("|x?GKFh@4jx^tH");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "@9w");
      DateTimeFormat.forPattern("aD{F'u:e5tE");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      DateTimeFormat.forPattern("yB:V7");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildPrinter();
      DateTimeFormat.forPattern("YA");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildParser();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "z96BmAa");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      DateTimeFormat.forPattern("0:H B?,d*D");
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder0.appendPattern("K\"m7`B5:3[29A#0G'^>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "!0z<A)uI");
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
  public void test32()  throws Throwable  {
      DateTimeFormat.forPattern("5]C-=\"Da=B6{M;ez;Y");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfHour(4, 700);
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "z96BmAa");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "66E;9");
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.forPattern("1:00 AM");
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      DateTimeFormat.forPattern("dBC\"cMndX*:DL)k`5,:");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "66E;9");
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("Both printing and parsing not supported");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "72xB_(RA$hi/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      DateTimeFormat.forPattern("k6B");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test39()  throws Throwable  {
      DateTimeFormat.forPattern("}YW}L+");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test40()  throws Throwable  {
      DateTimeFormat.forPattern("3?YXAGq]c:}&");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "YdasFa<0gdLvZs");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: F
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "66E;9");
      DateTimeFormat.forPattern("Sv32,FF`@txje3`Sg");
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "66E;9");
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "}1$s6");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test44()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "66E;9");
      DateTimeFormat.forPattern("(:8,uL5");
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildFormatter();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "66E;9");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test46()  throws Throwable  {
      DateTimeFormat.forPattern("E\";4.\nt!hCq{?(?4b0");
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "66E;9");
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "zou5");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test48()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "66E;9");
      DateTimeFormat.forPattern("\" ClassLoader: ");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test49()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "66E;9");
      DateTimeFormat.forPattern("9e&gK");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test50()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "66E;9");
      DateTimeFormat.forPattern("YearMonthDay");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test51()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "66E;9");
      DateTimeFormat.forPattern("hc");
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "EHi9O6@}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test53()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "66E;9");
      DateTimeFormat.forPattern("K\"p`c ZH1a");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test54()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "e:;E");
      DateTimeFormat.forPattern("xVy{Q#z");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test55()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "@SYD");
      DateTimeFormat.forPattern("]k!hACj:)3/Nn");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test56()  throws Throwable  {
      DateTimeFormat.forPattern("HDnB");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test57()  throws Throwable  {
      DateTimeFormat.forPattern("8yJL'WVc!iN");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test58()  throws Throwable  {
      DateTimeFormat.forPattern("E~f7McB");
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "&G*SweuN@Np]1u:");
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
  public void test60()  throws Throwable  {
      DateTimeFormat.forPattern("?5H`|ti<+`W] h$lPv=m");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test61()  throws Throwable  {
      DateTimeFormat.forPattern("dayOfWeek");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test62()  throws Throwable  {
      DateTimeFormat.forPattern("e&Hx\"o}?rVOMnj+?~I");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test63()  throws Throwable  {
      DateTimeFormat.forPattern("D8yQIjD*^");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test64()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "66E;9");
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.forPattern("(6wMNOwkdT/RIE?|");
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test65()  throws Throwable  {
      DateTimeFormat.forPattern("55d9G2#q,:Lu^");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test66()  throws Throwable  {
      DateTimeFormat.forPattern("a11yLc<64pDkTt,!.b");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test67()  throws Throwable  {
      DateTimeFormat.forPattern("|jd moL");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test68()  throws Throwable  {
      DateTimeFormat.forPattern("`Gsi@@]yg%");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test69()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "5yK7D");
      DateTimeFormat.forPattern("1:00 AM");
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendYear(31, 31);
      dateTimeFormatterBuilder0.toPrinter();
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("Literal must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildParser();
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("PT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test72()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendCenturyOfEra(31, 31);
      dateTimeFormatterBuilder0.toPrinter();
      DateTimeFormat.forPattern("(6wMNOwkdT/RIE?|");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test73()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildPrinter();
      DateTimeFormat.forPattern("/aZ!O,yEJu");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test74()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
      dateTimeFormatterBuilder1.toParser();
      DateTimeFormat.forPattern("%GT} !");
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildFormatter();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, ";ZQV!1csQR<pll#</8K");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test76()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfHour(4, 4);
      DateTimeFormat.forPattern("L#yZI");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test77()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfHour(1618, 1618);
      DateTimeFormat.forPattern("RT('_");
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfHour(4, 4);
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("PT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test79()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfHour(4, 700);
      DateTimeFormat.forPattern("N");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test80()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfDay(97, 8);
      DateTimeFormat.forPattern("99x@O(~\"Q4Z_$:Z@.");
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendFractionOfHour(4, 700);
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder1, "CET");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test82()  throws Throwable  {
      DateTimeFormat.forPattern("SQtSeS~<GcG}IE;(");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test83()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfHour(1618, 1618);
      DateTimeFormat.forPattern("HwKbCC3");
  }
}
