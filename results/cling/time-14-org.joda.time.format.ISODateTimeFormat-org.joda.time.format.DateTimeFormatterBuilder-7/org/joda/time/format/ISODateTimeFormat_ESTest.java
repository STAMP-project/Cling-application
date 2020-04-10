/*

 * Tue Mar 03 18:26:48 GMT 2020
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
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields((Collection<DateTimeFieldType>) null, false, false);
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
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ISODateTimeFormat.basicOrdinalDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTime();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTime();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.basicDateTime();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecond();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, false);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ISODateTimeFormat.dateHourMinute();
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields((Collection<DateTimeFieldType>) null, false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fields must not be null or empty
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ISODateTimeFormat.dateHour();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHour();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, false);
      ISODateTimeFormat.dateHourMinuteSecondMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.yearMonthDay();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ISODateTimeFormat.dateHourMinute();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinute();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecond();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecond();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ISODateTimeFormat.basicWeekDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTime();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ISODateTimeFormat.basicDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTime();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.weekDateTime();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, false);
      ISODateTimeFormat.ordinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecond();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ISODateTimeFormat.time();
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
  public void test16()  throws Throwable  {
      ISODateTimeFormat.hourMinuteSecondFraction();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTime();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ISODateTimeFormat.hourMinuteSecondMillis();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondMillis();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ISODateTimeFormat.weekDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTimeNoMillis();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, false);
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedList0, true, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fields must not be null or empty
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ISODateTimeFormat.basicOrdinalDate();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTime();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ISODateTimeFormat.dateParser();
      ISODateTimeFormat.dateParser();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedHashSet0, true, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fields must not be null or empty
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ISODateTimeFormat.basicWeekDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTimeNoMillis();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekyearWeek();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.weekyearWeek();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ISODateTimeFormat.basicOrdinalDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, true);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, false);
      ISODateTimeFormat.dateParser();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localDateOptionalTimeParser();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ISODateTimeFormat.yearMonth();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.yearMonth();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ISODateTimeFormat.basicDate();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTime();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekyearWeek();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.localDateOptionalTimeParser();
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedList0, false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No valid format for fields: [secondOfDay]
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, false);
      ISODateTimeFormat.ordinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTimeNoMillis();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ISODateTimeFormat.dateHourMinute();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hourMinute();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ISODateTimeFormat.basicTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTTime();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ISODateTimeFormat.basicWeekDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecond();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, false, false);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ISODateTimeFormat.dateOptionalTimeParser();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateOptionalTimeParser();
      assertFalse(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ISODateTimeFormat.basicOrdinalDate();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, false, false);
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ISODateTimeFormat.time();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinute();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ISODateTimeFormat.localDateOptionalTimeParser();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localDateOptionalTimeParser();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDate();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.weekDate();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ISODateTimeFormat.basicTTime();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, false, true);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ISODateTimeFormat.dateTimeParser();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, false);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, false, false);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondMillis();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.dateHourMinuteSecondMillis();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecondFraction();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondFraction();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateParser();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTime();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ISODateTimeFormat.dateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTime();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ISODateTimeFormat.hourMinuteSecondMillis();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondMillis();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.timeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.date();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.dateHourMinuteSecond();
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ISODateTimeFormat.localDateOptionalTimeParser();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, false, false);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, false, false);
      assertTrue(dateTimeFormatter0.isParser());
      
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.localTimeParser();
      assertTrue(dateTimeFormatter1.isPrinter());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, false);
      ISODateTimeFormat.ordinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTimeNoMillis();
      assertNotNull(dateTimeFormatter0);
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.localDateOptionalTimeParser();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, true);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ISODateTimeFormat.timeParser();
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
  public void test58()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTimeNoMillis();
      assertNotNull(dateTimeFormatter0);
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, false, false);
      ISODateTimeFormat.timeParser();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.localDateOptionalTimeParser();
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, false);
      ISODateTimeFormat.ordinalDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.tTime();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ISODateTimeFormat.timeParser();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTime();
      assertNotNull(dateTimeFormatter0);
      
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, false);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.secondOfMinute();
      linkedList0.add(dateTimeFieldType1);
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.forFields(linkedList0, true, false);
      assertTrue(dateTimeFormatter1.isPrinter());
      assertTrue(dateTimeFormatter1.isParser());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.localDateOptionalTimeParser();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, false, false);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ISODateTimeFormat.time();
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields((Collection<DateTimeFieldType>) null, false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fields must not be null or empty
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, false);
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedHashSet0, false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fields must not be null or empty
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, true, true);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.tTime();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ISODateTimeFormat.basicWeekDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTTimeNoMillis();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ISODateTimeFormat.hourMinuteSecondFraction();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, false, false);
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ISODateTimeFormat.localDateParser();
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields((Collection<DateTimeFieldType>) null, false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fields must not be null or empty
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, true);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ISODateTimeFormat.dateOptionalTimeParser();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, false, true);
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ISODateTimeFormat.hourMinuteSecondFraction();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, false);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.secondOfMinute();
      linkedList0.add(dateTimeFieldType1);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, false);
      assertTrue(dateTimeFormatter0.isParser());
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTimeNoMillis();
      assertTrue(dateTimeFormatter0.isParser());
      assertTrue(dateTimeFormatter0.isPrinter());
      assertNotNull(dateTimeFormatter0);
      
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.basicTTimeNoMillis();
      assertNotNull(dateTimeFormatter1);
      assertTrue(dateTimeFormatter1.isPrinter());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      ISODateTimeFormat.localDateParser();
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
  public void test75()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      ISODateTimeFormat.dateParser();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, false);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.tTime();
      assertNotNull(dateTimeFormatter0);
      assertTrue(dateTimeFormatter0.isPrinter());
  }
}
