/*

 * Tue Mar 03 18:38:55 GMT 2020
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
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = mock(DateTimeFormatterBuilder.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeFormatterBuilder) null).when(dateTimeFormatterBuilder0).appendCenturyOfEra(anyInt() , anyInt());
      doReturn((DateTimeFormatterBuilder) null).when(dateTimeFormatterBuilder0).appendLiteral(anyString());
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "5!CBw0M}k");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  @Ignore
  public void test02()  throws Throwable  {
      DateTimeFormat.forPattern("YdMVKU");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildPrinter();
      DateTimeFormat.forPattern(".Fh!Cc");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      dateTimeFormatterBuilder0.appendText(dateTimeFieldType0);
      dateTimeFormatterBuilder0.toPrinter();
      DateTimeFormat.forPattern("|*Ry`+L;(-4vR?)uC");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "Hkb");
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
  public void test06()  throws Throwable  {
      DateTimeFormat.forPattern("m1&Flth9&zM0k8rJv");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendFractionOfSecond(4, 4);
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder1, "=QI)JJnZ~");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = mock(DateTimeFormatterBuilder.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeFormatterBuilder) null).when(dateTimeFormatterBuilder0).appendEraText();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "GprWJ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfDay(274, 274);
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "No parser supplied");
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
  public void test10()  throws Throwable  {
      DateTimeFormat.forPattern(".MA<LBFKt^WzZF2B");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      String string0 = "dSF>{L=(\\uy^";
      DateTimeFormat.forPattern(string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfDay(3375, 45);
      DateTimeFormat.forPattern("Zd\"!sHp@q4n");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType0, 5062500, 90);
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "kLZ5z3nX!2jpoHy@d");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      DateTimeFormat.forPattern("yH:Vb2`A");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      DateTimeFormat.forPattern("EMVKU");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendFractionOfDay(274, 274);
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "2M");
      assertSame(dateTimeFormatterBuilder0, dateTimeFormatterBuilder1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      DateTimeFormat.forPattern("6{YC0!A8 _e7Z <qRJ");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType0, 75, 5062500);
      DateTimeFormat.forPattern("3~)3&&\"R1.");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "YXM2*V");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildFormatter();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder0.appendPattern("Z?B6BRC");
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
  public void test21()  throws Throwable  {
      DateTimeFormat.forPattern("+J8NV<V5svs.Jk_rl|");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      DateTimeFormat.forPattern("x-6,urxu7HV");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendFractionOfSecond(65533, 65533);
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder1.appendPattern("sEY|B#a^I3C");
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
  public void test24()  throws Throwable  {
      DateTimeFormat.forPattern("5!w;@j}`}&");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType0, 1087, (-1945));
      DateTimeFormat.forPattern("Incomplete parser array");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      DateTimeFormat.forPattern("SST");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildPrinter();
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.forPattern("D>yE[5O$8d'");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("tAA>/x");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      DateTimeFormat.forPattern("$,5<-w0r@N");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      DateTimeFormat.forPattern("H/ag}dS|s");
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "Y-6>zA");
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
      DateTimeFormat.forPattern("+1ID,Wh1hCqqC|");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      DateTimeFormat.forPattern("|SE=wiKjf");
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("org.joda.time.DateTime");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfDay(292272984, 292272984);
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
  @Ignore
  public void test36()  throws Throwable  {
      DateTimeFormat.forPattern("=\u0005aD2\"S;saKe]Ec9");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test37()  throws Throwable  {
      DateTimeFormat.forPattern("f#h");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      DateTimeFormat.forPattern("6{YC0!]8 _e7Z <qRJ");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test39()  throws Throwable  {
      DateTimeFormat.forPattern("|&n2k1X/vc7q~gEM");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test40()  throws Throwable  {
      DateTimeFormat.forPattern("4+xHaNgHWD4V");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test41()  throws Throwable  {
      DateTimeFormat.forPattern("v\"V>r");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      DateTimeFormat.forPattern("lZw3^L5-L!");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test43()  throws Throwable  {
      DateTimeFormat.forPattern("k| w+FP.Bg(m0");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test44()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType0, 83, 83);
      DateTimeFormat.forPattern("Amerca[Indiana/Indianapolis");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test45()  throws Throwable  {
      DateTimeFormat.forPattern("aZ$hb/7`");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test46()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfMinute(7, 7);
      DateTimeFormat.forPattern("D>yE[5O$8d'");
  }
}
