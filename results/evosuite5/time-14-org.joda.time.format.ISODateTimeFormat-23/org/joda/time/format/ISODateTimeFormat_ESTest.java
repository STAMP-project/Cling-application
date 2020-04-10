/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 01:36:00 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ISODateTimeFormat_ESTest extends ISODateTimeFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTimeParser();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateParser();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.weekyearWeekDay();
      assertFalse(dateTimeFormatter1.equals((Object)dateTimeFormatter0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondMillis();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.dateParser();
      assertFalse(dateTimeFormatter1.equals((Object)dateTimeFormatter0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecondFraction();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondFraction();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondMillis();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.dateHourMinuteSecondMillis();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecond();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecond();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ISODateTimeFormat.dateHourMinute();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinute();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecondFraction();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTime();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ISODateTimeFormat.hourMinuteSecondMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hourMinuteSecondMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.dateHourMinuteSecond();
      assertFalse(dateTimeFormatter1.equals((Object)dateTimeFormatter0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ISODateTimeFormat.dateHourMinute();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hourMinute();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ISODateTimeFormat.weekDate();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekyearWeekDay();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ISODateTimeFormat.weekyearWeek();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekyearWeek();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.yearMonth();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.yearMonth();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ISODateTimeFormat.basicWeekDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ISODateTimeFormat.basicWeekDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTime();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDate();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.basicWeekDateTimeNoMillis();
      assertFalse(dateTimeFormatter1.equals((Object)dateTimeFormatter0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ISODateTimeFormat.basicOrdinalDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTime();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ISODateTimeFormat.basicOrdinalDate();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ISODateTimeFormat.basicDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTimeNoMillis();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTime();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.basicDateTime();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTimeNoMillis();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ISODateTimeFormat.basicTTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ISODateTimeFormat.basicDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTimeNoMillis();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ISODateTimeFormat.basicTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTime();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDate();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.basicDateTimeNoMillis();
      assertFalse(dateTimeFormatter1.equals((Object)dateTimeFormatter0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ISODateTimeFormat.weekDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTimeNoMillis();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTime();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ISODateTimeFormat.ordinalDate();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTimeNoMillis();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ISODateTimeFormat.dateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTimeNoMillis();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ISODateTimeFormat.dateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTime();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTimeNoMillis();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTime();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.timeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ISODateTimeFormat.time();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTime();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ISODateTimeFormat.localDateOptionalTimeParser();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localDateOptionalTimeParser();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateOptionalTimeParser();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.dateTimeParser();
      assertFalse(dateTimeFormatter1.equals((Object)dateTimeFormatter0));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTimeParser();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.dateTimeParser();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ISODateTimeFormat.localTimeParser();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localTimeParser();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ISODateTimeFormat.timeParser();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.timeParser();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ISODateTimeFormat.dateParser();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateOptionalTimeParser();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localDateParser();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.localDateParser();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateParser();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.dateParser();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.year();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      linkedList0.add(dateTimeFieldType0);
      linkedList0.add(dateTimeFieldType1);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, false, false);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.dayOfMonth();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      linkedHashSet0.add(dateTimeFieldType0);
      linkedHashSet0.add(dateTimeFieldType1);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.millisOfSecond();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      linkedHashSet0.add(dateTimeFieldType1);
      linkedHashSet0.add(dateTimeFieldType0);
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedHashSet0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No valid ISO8601 format for fields: []
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.secondOfMinute();
      linkedList0.add(dateTimeFieldType1);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, true);
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.hourOfDay();
      linkedList0.add(dateTimeFieldType1);
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedList0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No valid ISO8601 format for fields: []
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.hourOfDay();
      linkedList0.add(dateTimeFieldType1);
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedList0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No valid ISO8601 format for fields: []
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      linkedList0.offerFirst(dateTimeFieldType0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.minuteOfHour();
      linkedList0.add(dateTimeFieldType1);
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.hourOfDay();
      linkedList0.add(dateTimeFieldType2);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, true);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.hourOfDay();
      linkedList0.add(dateTimeFieldType1);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, true);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.dayOfWeek();
      linkedHashSet0.add(dateTimeFieldType1);
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedHashSet0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No valid ISO8601 format for fields because Time was truncated: []
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.hourOfDay();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      linkedHashSet0.add(dateTimeFieldType1);
      linkedHashSet0.add(dateTimeFieldType0);
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedHashSet0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No valid ISO8601 format for fields because Date was reduced precision: []
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, false, false);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, true);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.weekOfWeekyear();
      linkedHashSet0.add(dateTimeFieldType1);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.dayOfWeek();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.weekOfWeekyear();
      linkedHashSet0.add(dateTimeFieldType2);
      linkedHashSet0.add(dateTimeFieldType1);
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.weekOfWeekyear();
      linkedHashSet0.add(dateTimeFieldType1);
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.dayOfWeek();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      linkedHashSet0.add(dateTimeFieldType1);
      linkedHashSet0.add(dateTimeFieldType0);
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedHashSet0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No valid ISO8601 format for fields: []
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.monthOfYear();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      linkedHashSet0.add(dateTimeFieldType1);
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.year();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.monthOfYear();
      linkedHashSet0.add(dateTimeFieldType2);
      linkedHashSet0.add(dateTimeFieldType1);
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.monthOfYear();
      linkedHashSet0.add(dateTimeFieldType1);
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      linkedHashSet0.add(dateTimeFieldType0);
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedHashSet0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No valid format for fields: [yearOfEra]
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedHashSet0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fields must not be null or empty
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields((Collection<DateTimeFieldType>) null, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fields must not be null or empty
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekyear();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ISODateTimeFormat iSODateTimeFormat0 = new ISODateTimeFormat();
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.year();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ISODateTimeFormat.dateHour();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHour();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTime();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.weekDateTime();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }
}
