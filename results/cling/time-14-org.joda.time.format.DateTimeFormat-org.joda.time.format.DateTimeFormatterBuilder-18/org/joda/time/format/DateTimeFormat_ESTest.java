/*

 * Tue Mar 03 18:39:29 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeFieldType;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormat_ESTest extends DateTimeFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("O\"GG~XKW4");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildPrinter();
      DateTimeFormat.forPattern("Fields invalid for add");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType0, 34, 34);
      dateTimeFormatterBuilder1.toPrinter();
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.forPattern("|,,}d4E!]nr}N");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder0.appendPattern("|y:B-9!.");
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
  public void test04()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfSecond(77, 77);
      DateTimeFormat.forPattern("%+].HQQmG/<!d)E");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfHour(320, 320);
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("No parser supplied");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfHour(91, (-1054));
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "_0=K93(Kum2`");
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
  public void test07()  throws Throwable  {
      DateTimeFormat.forPattern("4FN4p[VvIkY");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DateTimeFormat.forPattern("|F^E{&L`f:.&<J h<(c");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      DateTimeFormat.forPattern("eJD)-sP89.90z");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfDay(2119, 2119);
      DateTimeFormat.forPattern("wF");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      DateTimeFormat.forPattern("B");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      DateTimeFormat.forPattern(">h8ETA9JVG<nU^}o");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFormat.forPattern("M3+2{wak,");
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendPattern("M3+2{wak,");
      assertSame(dateTimeFormatterBuilder1, dateTimeFormatterBuilder0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendPattern("M3k+2{wak,");
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("J{N`OK4K$XCb&.Oe");
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
  public void test15()  throws Throwable  {
      DateTimeFormat.forPattern("}\"GG~XKW4");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      DateTimeFormat.forPattern("~wBNP4=yd5 Z-");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      DateTimeFormat.forPattern("5zJSb");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      DateTimeFormat.forPattern("_A\"k-Q9v\"{U");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfHour(429, 429);
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "R.R");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      DateTimeFormat.forPattern("S=9H=uL,*+WK\"+l");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfSecond(77, 77);
      DateTimeFormat.forPattern("YDG4L1<`E%3N?6");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      DateTimeFormat.forPattern("<0!J");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType0, 77, 90);
      DateTimeFormat.forPattern("sBG[o#B:CAsA4$ZghGq");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      DateTimeFormat.forPattern("|,,}d4E!]jK}N");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfHour(320, 320);
      DateTimeFormat.forPattern("MIT");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      DateTimeFormat.forPattern("ZEvZJ`efzJ5Bv7");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType0, 118, 118);
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.forPattern("CTT");
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildPrinter();
      DateTimeFormat.forPattern("CTT");
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, ",[Hw`@");
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("org.joda.time.PeriodType");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeFormat.shortDate();
      DateTimeFormat.shortTime();
      DateTimeFormat.shortTime();
      DateTimeFormat.shortDate();
      DateTimeFormat.mediumDateTime();
      DateTimeFormat dateTimeFormat0 = new DateTimeFormat();
      DateTimeFormat.forPattern("41d[Hs@;_");
      DateTimeFormat.shortTime();
      DateTimeFormat.shortDateTime();
      // Undeclared exception!
      try { 
        DateTimeFormat.forStyle("41d[Hs@;_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid style specification: 41d[Hs@;_
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      DateTimeFormat.forPattern("tz.kRn");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      DateTimeFormat.forPattern("weekyearOfCentury");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "mT1v%p");
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
  public void test34()  throws Throwable  {
      DateTimeFormat.forPattern("gk;:g{~SL3(M");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      DateTimeFormat.forPattern("(~=p5jtG\"");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      DateTimeFormat.forPattern("6iUvpTjYF");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test37()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType0, 77, 90);
      DateTimeFormat.forPattern("PKG@KU#");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      DateTimeFormat.forPattern("#&>yPYzzfZO^Fr");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test39()  throws Throwable  {
      DateTimeFormat.forPattern("?c'gZGN1");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test40()  throws Throwable  {
      DateTimeFormat.forPattern("fUX0kXwfEV:eHKQ:#TN");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = mock(DateTimeFormatterBuilder.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeFormatterBuilder) null).when(dateTimeFormatterBuilder0).appendLiteral(anyString());
      doReturn((DateTimeFormatterBuilder) null).when(dateTimeFormatterBuilder0).appendYearOfEra(anyInt() , anyInt());
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "Y9(I7mmZ#");
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
  public void test42()  throws Throwable  {
      DateTimeFormat.forPattern("7%>#\"4~a[Hz([TqCy");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test43()  throws Throwable  {
      DateTimeFormat.forPattern("q$o%dDdo+1%T");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test44()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendPattern("M3+2{wak,");
      DateTimeFormat.forPattern("HZya[LMEKX");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test45()  throws Throwable  {
      DateTimeFormat.forPattern("5{?77xJw[G#8P=q");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test46()  throws Throwable  {
      DateTimeFormat.forPattern("YG(au)}##C\"");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test47()  throws Throwable  {
      DateTimeFormat.forPattern("xd~^L%w");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test48()  throws Throwable  {
      DateTimeFormat.forPattern("HvxQlzZ)D");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test49()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfDay(96, 1902);
      DateTimeFormat.forPattern("|,,}d4E!]nr}N");
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "}E'gzMRIo3Y%");
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("org.joda.time.format.DateTimeFormat$StyleFormatter");
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
  public void test51()  throws Throwable  {
      DateTimeFormat.forPattern("halfdays");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test52()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfDay(2119, 2119);
      DateTimeFormat.forPattern("Asa/KEarahi");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test53()  throws Throwable  {
      DateTimeFormat.forPattern("below the supported minimum of ");
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendFractionOfSecond(45, 45);
      DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder1.appendPattern("M3+2{wak,");
      assertSame(dateTimeFormatterBuilder2, dateTimeFormatterBuilder1);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfSecond(77, 77);
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("J{N`OK4K$XCb&.Oe");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }
}
