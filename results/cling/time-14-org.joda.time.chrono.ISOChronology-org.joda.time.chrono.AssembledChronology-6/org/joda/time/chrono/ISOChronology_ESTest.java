/*

 * Tue Mar 03 16:50:12 GMT 2020
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
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ISOChronology_ESTest extends ISOChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("JeP", "JeP").when(dateTimeZone0).getID();
      doReturn("", "", "", "<Mg}pGA2Zl", "<Mg}pGA2Zl").when(dateTimeZone0).toString();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      try { 
        iSOChronology0.getDateTimeMillis((-2074), 100, (-2074), 100, 100, 100, 719527);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 100 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("Partial must not be null", "Partial must not be null").when(dateTimeZone0).getID();
      doReturn(0).when(dateTimeZone0).getOffset(anyLong());
      doReturn("Partial must not be null", "Partial must not be null", "Partial must not be null", "Partial must not be null", "Partial must not be null").when(dateTimeZone0).toString();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      try { 
        iSOChronology0.getDateTimeMillis((long) 1034, 1034, 0, 85, 5);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 1034 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimeZone0).getID();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(dateTimeZone0).toString();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      ISOChronology iSOChronology1 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = mock(AssembledChronology.Fields.class, new ViolatedAssumptionAnswer());
      iSOChronology1.assemble(assembledChronology_Fields0);
      assertFalse(iSOChronology1.equals((Object)iSOChronology0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(dateTimeZone0).getID();
      doReturn("", (String) null, "$VALUES", (String) null, "").when(dateTimeZone0).toString();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      ISOChronology iSOChronology1 = ISOChronology.getInstance((DateTimeZone) null);
      assertFalse(iSOChronology1.equals((Object)iSOChronology0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimeZone0).getID();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(dateTimeZone0).toString();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      try { 
        iSOChronology0.getDateTimeMillis((-81), (-81), 0, (-81));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value -81 for millisOfDay must be in the range [0,86399999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
