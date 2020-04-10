/*

 * Tue Mar 03 16:49:53 GMT 2020
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
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ISOChronology_ESTest extends ISOChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      try { 
        iSOChronology0.getDateTimeMillis((long) 409, 409, 409, 409, 409);
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 409 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(164);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      EthiopicChronology ethiopicChronology0 = null;
      try {
        ethiopicChronology0 = new EthiopicChronology(buddhistChronology0, buddhistChronology0, (-1509));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -1509
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
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
  public void test3()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      long long0 = iSOChronology0.getDateTimeMillis(1, 1, 1, 0);
      assertEquals((-62135597972000L), long0);
  }
}
