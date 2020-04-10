/*

 * Tue Mar 03 16:50:52 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.ZonedChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ISOChronology_ESTest extends ISOChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      assertNotNull(zonedChronology0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("4V#@EewA<ee~XAObdn", "4V#@EewA<ee~XAObdn").when(dateTimeZone0).getID();
      doReturn("4V#@EewA<ee~XAObdn", "4V#@EewA<ee~XAObdn", "4V#@EewA<ee~XAObdn", "4V#@EewA<ee~XAObdn", "4V#@EewA<ee~XAObdn").when(dateTimeZone0).toString();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      try { 
        iSOChronology0.getDateTimeMillis(6, 6, 719527, (-3501), 719527, (-3501), 250);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -3501 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(845);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      try { 
        iSOChronology0.getDateTimeMillis((long) 845, 845, 1, 5, (-2822));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 845 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = mock(AssembledChronology.Fields.class, new ViolatedAssumptionAnswer());
      iSOChronology0.assemble(assembledChronology_Fields0);
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimeZone0).getID();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(dateTimeZone0).toString();
      ISOChronology iSOChronology1 = ISOChronology.getInstance(dateTimeZone0);
      assertNotSame(iSOChronology1, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(dateTimeZone0).getID();
      doReturn("", "", "", "", "").when(dateTimeZone0).toString();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      try { 
        iSOChronology0.getDateTimeMillis((-1770), (-1770), (-1770), (-2271));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -2271 for millisOfDay must be in the range [0,86399999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("Field '", "Field '").when(dateTimeZone0).getID();
      doReturn("Field '", "lra6u>F)m)2{c@qd", "Field '", "YJ@@;[*hQ@l", "YJ@@;[*hQ@l").when(dateTimeZone0).toString();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      ISOChronology iSOChronology1 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotSame(iSOChronology1, iSOChronology0);
  }
}
