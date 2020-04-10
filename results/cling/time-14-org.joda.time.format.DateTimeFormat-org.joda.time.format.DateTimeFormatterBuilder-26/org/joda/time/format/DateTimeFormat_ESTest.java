/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 03:38:30 GMT 2019
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
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder0.appendPattern("eI|_#.B(e>W0Ei");
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
  public void test01()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendPattern("7xHZ");
      DateTimeFormat.forPattern(" :2uh0A(qob");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfMinute(1094, 96);
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.forPattern(":ZGeszd{");
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildParser();
      DateTimeFormat.forPattern("yJd9fnOTV8/&6:VZD");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      DateTimeFormat.forPattern("_~Ir]3aSG.Tw#");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      DateTimeFormat.forPattern("HolQyB%1:}");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DateTimeFormat.forPattern("DY/IgHjY;'Uz()GqC$");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      DateTimeFormat.forPattern("y=M$G1Y/e-H-JE");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendPattern("7xHZ");
      DateTimeFormat.forPattern("k$^6l%FyV ");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      DateTimeFormat.forPattern(";aI^iF");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      DateTimeFormat.forPattern("#Gza8HJ6`aC))ol");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfMinute(1094, 1094);
      DateTimeFormat.forPattern("Invalid style specification: ");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendPattern("7xHZ");
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.forPattern("YQT/SN'+tTXRp|ZAH");
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      DateTimeFormat.forPattern("19zGr=k@sO`MbSf8P");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      DateTimeFormat.forPattern(" HrZIiA7e;k)`<8");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      DateTimeFormat.forPattern("maDGja");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendPattern("7xHZ");
      DateTimeFormat.forPattern("Yj!6$|uS~NSt8");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendPattern("y");
      DateTimeFormat.forPattern("Invalid style specification: ");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      DateTimeFormat.forPattern("ZYaHN*rvh-o1kwngY");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      DateTimeFormat.forPattern("eGFp>");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      DateTimeFormat.forPattern("3kF8");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildParser();
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.forPattern("FEJ`8~WBnZMSoX9");
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      DateTimeFormat.forPattern("wmF");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfMinute(1094, 1094);
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.forPattern("FEJ`8~WBnZMSoX9");
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      DateTimeFormat.forPattern(" 1EFbP");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendPattern("7xHZ");
      DateTimeFormat.forPattern("FEJ`8~WBnZMSoX9");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      DateTimeFormat.forPattern(";Y8AvhF6Cb[n>b");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      DateTimeFormat.forPattern("MAq~Z,");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      DateTimeFormat.forPattern("zdmBw");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      DateTimeFormat.forPattern("zds8)@BN;");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType0, 1768, (-952));
      DateTimeFormat.forPattern("Y9yA7V>Wr");
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "E\"^hGBg`%gl7|5=t");
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
  public void test32()  throws Throwable  {
      DateTimeFormat.forPattern("kS.G!^xBK|7\u0006>)6");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      DateTimeFormat.forPattern("xXyUh(h9~cx");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      DateTimeFormat.forPattern("weekyear");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      DateTimeFormat.forPattern("EZu2EiUn/0g=_S'D");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendFractionOfMinute(1094, 96);
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.forPattern("E,91W6 /O$x;!^~r");
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = mock(DateTimeFormatterBuilder.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeFormatterBuilder) null).when(dateTimeFormatterBuilder0).appendClockhourOfHalfday(anyInt());
      doReturn((DateTimeFormatterBuilder) null).when(dateTimeFormatterBuilder0).appendDayOfWeek(anyInt());
      doReturn((DateTimeFormatterBuilder) null).when(dateTimeFormatterBuilder0).appendLiteral(anyChar());
      doReturn((DateTimeFormatterBuilder) null).when(dateTimeFormatterBuilder0).appendLiteral(anyString());
      DateTimeFormat.appendPatternTo(dateTimeFormatterBuilder0, "(he #3;");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      DateTimeFormat.forPattern("E<jNI9a!M");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test39()  throws Throwable  {
      DateTimeFormat.forPattern("DEp*");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test40()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.appendPattern("7xHZ");
      DateTimeFormat.forPattern("E,91W6 /O$x;!^~r");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendPattern("yS");
      assertSame(dateTimeFormatterBuilder1, dateTimeFormatterBuilder0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      DateTimeFormat.forPattern("G6}CveI%\"{Gb");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test43()  throws Throwable  {
      DateTimeFormat.forPattern("yGF=2Hw$$x5E`cA/k}");
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("fcX:fH$}");
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
  public void test45()  throws Throwable  {
      DateTimeFormat.forPattern("&/1+>xId!FQ");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test46()  throws Throwable  {
      DateTimeFormat.forPattern("';h+hp'3k8tX");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test47()  throws Throwable  {
      DateTimeFormat.forPattern("dayOfYear");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test48()  throws Throwable  {
      DateTimeFormat.forPattern("kSG!^xC:||J%>)6");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test49()  throws Throwable  {
      DateTimeFormat.forPattern(":>yd:ow74.MIGo");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test50()  throws Throwable  {
      DateTimeFormat.forPattern("_:^6ZH%yg<(b}.|sa}");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test51()  throws Throwable  {
      DateTimeFormat.forPattern(")\"CkKr<QL>o@");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test52()  throws Throwable  {
      DateTimeFormat.forPattern("Y9yE7[nW0");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test53()  throws Throwable  {
      DateTimeFormat.forPattern("]3qFEctPd-e");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test54()  throws Throwable  {
      DateTimeFormat.forPattern(")!YL0l5;_n]T");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test55()  throws Throwable  {
      DateTimeFormat.forPattern("+Hi");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test56()  throws Throwable  {
      DateTimeFormat.forPattern("%hyH3wcD");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test57()  throws Throwable  {
      DateTimeFormat.forPattern("bO4S/Vc9m|LIhG,");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test58()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildPrinter();
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.forPattern("Literal must not be null");
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildPrinter();
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("PNT");
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
  public void test60()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildPrinter();
      DateTimeFormat.forPattern("No parsers supplied");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test61()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildPrinter();
      DateTimeFormat.forPattern("Z7,O0C5z");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test62()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      dateTimeFormatterBuilder0.canBuildParser();
      DateTimeFormat.forPattern("~T>54o ^0`UT7aX");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test63()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendMonthOfYearText();
      dateTimeFormatterBuilder1.toParser();
      DateTimeFormat.forPattern("YQT/SN'+tTXRp|ZAH");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test64()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType0, 1768, (-952));
      DateTimeFormat.forPattern("Literal must not be null");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test65()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType0, 98, (-4403));
      DateTimeFormat.forPattern("8R\"");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test66()  throws Throwable  {
      DateTimeFormat.forPattern("?7S[~%P'dx1U%<c]u_");
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendFractionOfMinute(1094, 101);
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder1.appendPattern("yN");
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
  public void test68()  throws Throwable  {
      DateTimeFormat.forPattern("SDY*mO7x[>OQ%m(faO");
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder0.appendPattern("MST");
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
  public void test70()  throws Throwable  {
      DateTimeFormat.forPattern("SsZQ9{");
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
      DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendFractionOfMinute(1094, 96);
      DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder1.appendPattern("7xHZ");
      assertSame(dateTimeFormatterBuilder0, dateTimeFormatterBuilder2);
  }
}
