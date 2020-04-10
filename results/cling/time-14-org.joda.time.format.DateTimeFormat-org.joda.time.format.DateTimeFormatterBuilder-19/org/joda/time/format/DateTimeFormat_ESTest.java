/*

 * Tue Mar 03 18:40:27 GMT 2020
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
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormat_ESTest extends DateTimeFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      DateTimeFormat.forPattern("\"F.wV");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      DateTimeFormat.forPattern("w9A[WUxQ54sa?3;&jpb");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildParser();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "K3;Y1L`<u");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
      dateTimeFormatterBuilder1.toPrinter();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder1, "DR7sL*rn]w$p");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildParser();
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("Printing is not supported");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildParser();
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("I9Se@]&BH,!cj)()E");
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
  public void test06()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildParser();
      DateTimeFormat.forPattern("13EJ4Sw5");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildParser();
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("Aq`");
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
  public void test08()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfHour(92, 92);
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.forPattern(")y4w=>GQ|>x%>l&");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = mock(DateTimeFormatterBuilder.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeFormatterBuilder) null).when(dateTimeFormatterBuilder0).appendDayOfMonth(anyInt());
      doReturn((DateTimeFormatterBuilder) null).when(dateTimeFormatterBuilder0).appendLiteral(anyString());
      doReturn((DateTimeFormatterBuilder) null).when(dateTimeFormatterBuilder0).appendTimeZoneOffset(anyString() , anyString() , anyBoolean() , anyInt() , anyInt());
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "dZ$''");
      DateTimeFormat.forPattern("E+|U'N$PsY");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfHour(1433, 1433);
      DateTimeFormat.forPattern("0ZNl\"Y,dW_P");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendFractionOfDay(110, 110);
      DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder1.appendPattern("Km");
      assertSame(dateTimeFormatterBuilder0, dateTimeFormatterBuilder2);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      DateTimeFormat.forPattern("3|A.XX%4k9fN%Ge-E");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      DateTimeFormat.forPattern("HiIQNm^iShgU~*nit`");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      DateTimeFormat.forPattern("HtIQNm^iShgU~*nit`");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      DateTimeFormat.forPattern("|J'~31s#AKvMg1AWu");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      DateTimeFormat.forPattern("-)5MAS2OK:'*-E");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("A");
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
  public void test18()  throws Throwable  {
      DateTimeFormat.forPattern("s[A:Qq1,0b");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfDay(92, 82);
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
  public void test20()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = mock(DateTimeFormatterBuilder.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeFormatterBuilder) null).when(dateTimeFormatterBuilder0).appendDayOfMonth(anyInt());
      doReturn((DateTimeFormatterBuilder) null).when(dateTimeFormatterBuilder0).appendLiteral(anyString());
      doReturn((DateTimeFormatterBuilder) null).when(dateTimeFormatterBuilder0).appendTimeZoneOffset(anyString() , anyString() , anyBoolean() , anyInt() , anyInt());
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "dZ$''");
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("Field type must not be null");
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
  public void test21()  throws Throwable  {
      DateTimeFormat.forPattern("zGZ,u");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      DateTimeFormat.forPattern("Ewpu^(,p%(uXD");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendFractionOfHour(81, (-2153));
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder1, "Field type must not be oull");
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
      DateTimeFormat.forPattern("][}-It6U<1Pr#HPKC0h");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      DateTimeFormat.forPattern(")}3*:zBSlidQe,:yE0");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfDay(92, 82);
      DateTimeFormat.forPattern("M -/DmGZ> T)&ywiS");
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "dZ$'fA'");
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("I");
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
  public void test28()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "dZ$'fA'");
      DateTimeFormat.forPattern(")y4w=>GQ|>x%>l&");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      DateTimeFormat.forPattern("zJ");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfDay(115, 115);
      DateTimeFormat.forPattern("/|RNyS");
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendMinuteOfHour(382);
      dateTimeFormatterBuilder1.toFormatter();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "dB$''");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "4ysw>`)%>#3Yf:4");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      DateTimeFormat.forPattern("s3/x%?uYu|B^");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      DateTimeFormat.forPattern("Y0j59)|W_46'%|(");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      DateTimeFormat.forPattern("}dhXa8CT$KG");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfDay(92, 92);
      DateTimeFormat.forPattern("Invalid style specification: ");
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendSecondOfDay(3160);
      dateTimeFormatterBuilder0.toFormatter();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder0.appendPattern("zSO}lB3p<");
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
  public void test38()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildParser();
      DateTimeFormat.forPattern("T8aFD\"R>]([zd8'^");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test39()  throws Throwable  {
      DateTimeFormat.forPattern("E1ndfe&n:{Tvld`");
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "dZ$'fA'");
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("BST");
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
  public void test41()  throws Throwable  {
      DateTimeFormat.forPattern("e>\"/*gk#9,zg>/4h'uj");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      DateTimeFormat.forPattern("H$0s/p`\u0004=d6bTe+/8e");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test43()  throws Throwable  {
      DateTimeFormat.forPattern("M$=IO*~d");
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("org.joda.time.YearMonth");
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
  public void test45()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfDay(92, 82);
      DateTimeFormat.forPattern("P;Hw8+:'");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test46()  throws Throwable  {
      DateTimeFormat.forPattern("7?c({@@)gaKzU_");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test47()  throws Throwable  {
      DateTimeFormat.forPattern("E1dfe&n:{Tvld`");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test48()  throws Throwable  {
      DateTimeFormat.forPattern(" yIb9o&'j%;Lit?");
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("qq");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: qq
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test50()  throws Throwable  {
      DateTimeFormat.forPattern("ZH!/n=`/e?<%hz&%");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test51()  throws Throwable  {
      DateTimeFormat.forPattern("{*EHMmU1AlwsF)m");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test52()  throws Throwable  {
      DateTimeFormat.forPattern(":Kv{ti5q]y 2a%lW1`Q");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test53()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfSecond(84, 84);
      DateTimeFormat.forPattern("EBw2VTlEV");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test54()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "dZ$'fA'");
      DateTimeFormat.forPattern("HST");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test55()  throws Throwable  {
      DateTimeFormat.forPattern("ZHalbY7NY+f^pa:)");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test56()  throws Throwable  {
      DateTimeFormat.forPattern("kxYi/gB5!2;%`");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test57()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfHour(76, (-2153));
      DateTimeFormat.forPattern("$.!AY]CZ+");
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = mock(DateTimeFormatterBuilder.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeFormatterBuilder) null).when(dateTimeFormatterBuilder0).appendLiteral(anyChar());
      doReturn((DateTimeFormatterBuilder) null).when(dateTimeFormatterBuilder0).appendWeekyear(anyInt() , anyInt());
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "*x");
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("~B}E{");
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
  public void test59()  throws Throwable  {
      DateTimeFormat.forPattern("yearOfEra");
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("bm>g7Ny}M!5(N$nF^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test61()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfHour(76, (-2153));
      DateTimeFormat.forPattern("GJChronology");
  }
}
