/*

 * Tue Mar 03 18:26:06 GMT 2020
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
        ISODateTimeFormat.forFields((Collection<DateTimeFieldType>) null, true, false);
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
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDate();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.basicWeekDateTime();
      assertFalse(dateTimeFormatter1.equals((Object)dateTimeFormatter0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ISODateTimeFormat.basicOrdinalDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTime();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHour();
      ISODateTimeFormat.dateHour();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      assertFalse(dateTimeFormatter1.equals((Object)dateTimeFormatter0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ISODateTimeFormat.basicDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTime();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTimeNoMillis();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTimeNoMillis();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, true);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDate();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertFalse(dateTimeFormatter1.equals((Object)dateTimeFormatter0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.basicDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ISODateTimeFormat.dateParser();
      ISODateTimeFormat.dateParser();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
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
  public void test11()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedList0.offerLast(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, false, true);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDate();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ISODateTimeFormat.timeElementParser();
      ISODateTimeFormat.localTimeParser();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ISODateTimeFormat.hourMinuteSecondMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hourMinuteSecondMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ISODateTimeFormat.weekDateTime();
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields((Collection<DateTimeFieldType>) null, true, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fields must not be null or empty
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ISODateTimeFormat.dateHour();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.date();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ISODateTimeFormat.dateHourMinute();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinute();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecond();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecond();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ISODateTimeFormat.basicWeekDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTime();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ISODateTimeFormat.basicDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTime();
      ISODateTimeFormat.dateHourMinuteSecondFraction();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.forFields(linkedList0, false, false);
      assertFalse(dateTimeFormatter1.equals((Object)dateTimeFormatter0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hourMinute();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ISODateTimeFormat.weekDate();
      ISODateTimeFormat.weekDate();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ISODateTimeFormat.dateTime();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
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
  public void test24()  throws Throwable  {
      ISODateTimeFormat.hourMinuteSecond();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.tTimeNoMillis();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.forFields(linkedList0, false, false);
      assertFalse(dateTimeFormatter1.equals((Object)dateTimeFormatter0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedList0.offerLast(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, true, true);
      ISODateTimeFormat.dateHour();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHour();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ISODateTimeFormat.weekDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTimeNoMillis();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecond();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      linkedList0.add(dateTimeFieldType0);
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedList0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No valid format for fields: [era]
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ISODateTimeFormat.basicTTimeNoMillis();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTimeNoMillis();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ISODateTimeFormat.dateParser();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localDateOptionalTimeParser();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTime();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.basicOrdinalDate();
      assertFalse(dateTimeFormatter1.equals((Object)dateTimeFormatter0));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ISODateTimeFormat.basicWeekDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedList0.offerLast(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, true, true);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTimeNoMillis();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTime();
      ISODateTimeFormat.weekDateTime();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.forFields(linkedList0, false, false);
      assertFalse(dateTimeFormatter1.equals((Object)dateTimeFormatter0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ISODateTimeFormat.weekyearWeek();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekyearWeek();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ISODateTimeFormat.yearMonth();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.yearMonth();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ISODateTimeFormat.basicDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTimeNoMillis();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ISODateTimeFormat.weekDateTime();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.ordinalDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, true);
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ISODateTimeFormat.localTimeParser();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      linkedList0.add(dateTimeFieldType0);
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedList0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No valid format for fields: [era]
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.tTimeNoMillis();
      ISODateTimeFormat.forFields(linkedList0, false, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.tTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinute();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.hourMinute();
      assertFalse(dateTimeFormatter1.equals((Object)dateTimeFormatter0));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ISODateTimeFormat.basicTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ISODateTimeFormat.basicTTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTimeNoMillis();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTimeNoMillis();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedList0.offerLast(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, true, true);
      ISODateTimeFormat.dateHour();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondMillis();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ISODateTimeFormat.timeNoMillis();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTimeNoMillis();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ISODateTimeFormat.dateOptionalTimeParser();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTimeParser();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedList0.offerLast(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, true, true);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hourMinute();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localDateOptionalTimeParser();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.localDateOptionalTimeParser();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedList0.offerLast(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, true, true);
      ISODateTimeFormat.weekDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTime();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ISODateTimeFormat.dateTimeParser();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      linkedList0.add(dateTimeFieldType0);
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedList0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No valid format for fields: [era]
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ISODateTimeFormat.basicOrdinalDateTime();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, false, false);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, true, true);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondFraction();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecondMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondMillis();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecondFraction();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondFraction();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ISODateTimeFormat.dateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTime();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedList0.offerLast(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, true, true);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekyearWeek();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ISODateTimeFormat.localDateParser();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedList0.offerLast(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, true, true);
      ISODateTimeFormat.weekDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.timeNoMillis();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      linkedList0.addLast(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, true, true);
      ISODateTimeFormat.dateParser();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateParser();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ISODateTimeFormat.weekDateTime();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      linkedList0.addLast(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, true);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedList0.offerLast(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedList0, true, true);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTimeNoMillis();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ISODateTimeFormat.weekDateTime();
      ISODateTimeFormat.ordinalDateTime();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, false, false);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ISODateTimeFormat.dateElementParser();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedList0.offerLast(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, true);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ISODateTimeFormat.timeParser();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      linkedList0.offerLast(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, true);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      assertNotNull(dateTimeFormatter0);
      
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.basicDateTimeNoMillis();
      assertNotNull(dateTimeFormatter1);
      assertTrue(dateTimeFormatter1.isParser());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ISODateTimeFormat.weekDateTime();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      linkedHashSet0.add(dateTimeFieldType0);
      ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hourMinuteSecondFraction();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      linkedList0.add(dateTimeFieldType0);
      ISODateTimeFormat.dateParser();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedList0, true, true);
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTime();
      assertNotNull(dateTimeFormatter0);
      
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      linkedList0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.forFields(linkedList0, true, true);
      assertTrue(dateTimeFormatter1.isParser());
      assertTrue(dateTimeFormatter1.isPrinter());
  }
}
