/*

 * Tue Mar 03 18:27:02 GMT 2020
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
      ISODateTimeFormat.dateParser();
      ISODateTimeFormat.dateParser();
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
  public void test01()  throws Throwable  {
      ISODateTimeFormat.basicWeekDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTimeNoMillis();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTime();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.basicOrdinalDateTime();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ISODateTimeFormat.basicDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTime();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ISODateTimeFormat.tTime();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, false, true);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, false, true);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTimeNoMillis();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHour();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.dateHour();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecondMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hourMinuteSecondMillis();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinute();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.dateHourMinute();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecond();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecond();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTime();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.basicWeekDateTime();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ISODateTimeFormat.basicDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ISODateTimeFormat.weekDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTime();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ISODateTimeFormat.weekDateTime();
      ISODateTimeFormat.hourMinuteSecondFraction();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, false, true);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ISODateTimeFormat.tTime();
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
  public void test17()  throws Throwable  {
      ISODateTimeFormat.weekDateTimeNoMillis();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>(linkedList0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecond();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ISODateTimeFormat.dateTimeParser();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      linkedHashSet0.add(dateTimeFieldType0);
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedHashSet0, false, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No valid format for fields: [clockhourOfDay]
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>(linkedList0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHour();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ISODateTimeFormat.weekDateTimeNoMillis();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, false);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.weekDateTimeNoMillis();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localTimeParser();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ISODateTimeFormat.dateParser();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, true, false);
      ISODateTimeFormat.dateParser();
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedList0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fields must not be null or empty
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDate();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ISODateTimeFormat.basicWeekDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localDateParser();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ISODateTimeFormat.weekyearWeek();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekyearWeek();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTimeNoMillis();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, false, true);
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ISODateTimeFormat.yearMonth();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.yearMonth();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ISODateTimeFormat.basicDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDate();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ISODateTimeFormat.weekDateTimeNoMillis();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>(linkedList0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTimeNoMillis();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ISODateTimeFormat.dateHourMinute();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hourMinute();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ISODateTimeFormat.time();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, false, true);
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ISODateTimeFormat.basicTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ISODateTimeFormat.basicDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTime();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTimeNoMillis();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.yearMonthDay();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>(linkedList0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.dateTimeNoMillis();
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ISODateTimeFormat.dateTimeParser();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateOptionalTimeParser();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondMillis();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ISODateTimeFormat.time();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, true);
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ISODateTimeFormat.localDateOptionalTimeParser();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localDateOptionalTimeParser();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.timeParser();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ISODateTimeFormat.basicTTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTimeNoMillis();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>(linkedList0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.weekDateTime();
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>(linkedList0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ISODateTimeFormat.localDateOptionalTimeParser();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, false, true);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondMillis();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.dateHourMinuteSecondMillis();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecondFraction();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondFraction();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTime();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ISODateTimeFormat.dateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>(linkedList0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekyearWeek();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateParser();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.forFields(linkedHashSet0, false, false);
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, false, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateParser();
      assertFalse(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>(13421775, 13421775);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTimeNoMillis();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.forFields(linkedList0, true, false);
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ISODateTimeFormat.dateTimeParser();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, false, true);
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>(linkedList0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTime();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>(linkedList0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      ISODateTimeFormat.weekDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.tTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>(linkedList0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localDateOptionalTimeParser();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.dateElementParser();
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ISODateTimeFormat.time();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, false, false);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ISODateTimeFormat.dateHourMinute();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, false, false);
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ISODateTimeFormat.weekDateTimeNoMillis();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>(linkedList0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.timeNoMillis();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTime();
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
  public void test64()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateParser();
      ISODateTimeFormat.forFields(linkedList0, true, false);
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.dateParser();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ISODateTimeFormat.basicTTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ISODateTimeFormat.hourMinuteSecondMillis();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTimeNoMillis();
      assertTrue(dateTimeFormatter0.isParser());
      assertTrue(dateTimeFormatter0.isPrinter());
      assertNotNull(dateTimeFormatter0);
      
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      assertNotNull(dateTimeFormatter1);
      assertTrue(dateTimeFormatter1.isPrinter());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ISODateTimeFormat.dateTimeParser();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, false, true);
      assertTrue(dateTimeFormatter0.isParser());
  }
}
