/*

 * Tue Mar 03 17:14:14 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CopticChronology_ESTest extends CopticChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      int int0 = copticChronology0.getDaysInYear(4123);
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("Q_<9/VzzF!z>nr<y;!", "Q_<9/VzzF!z>nr<y;!").when(dateTimeZone0).getID();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      int int0 = copticChronology0.getDaysInYear(189);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("Q_<9/VzzF!z>nr<y;!", "Q_<9/VzzF!z>nr<y;!").when(dateTimeZone0).getID();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      assertNotNull(copticChronology0);
      
      int int0 = copticChronology0.getWeekOfWeekyear(220L, 3994);
      assertEquals(53, int0);
  }
}
