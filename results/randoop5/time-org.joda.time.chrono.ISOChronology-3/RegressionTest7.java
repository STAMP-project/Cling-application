import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    @Ignore
  public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = iSOChronology1.getZone();
        long long10 = iSOChronology1.add((-1L), (long) (short) 0, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.hourOfHalfday();
        long long17 = iSOChronology1.getDateTimeMillis((-2101035L), (int) (short) 1, 10, (int) (byte) 10, (int) (short) 10);
        org.joda.time.DurationField durationField18 = iSOChronology1.weeks();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        java.lang.String str21 = iSOChronology20.toString();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = iSOChronology20.add(readablePeriod22, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = iSOChronology20.getZone();
        org.joda.time.DurationField durationField27 = iSOChronology20.years();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone28);
        org.joda.time.DurationField durationField30 = iSOChronology29.halfdays();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology29.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology29.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.chrono.ISOChronology iSOChronology34 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone33);
        java.lang.String str35 = iSOChronology34.toString();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        long long39 = iSOChronology34.add(readablePeriod36, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone40 = iSOChronology34.getZone();
        org.joda.time.Chronology chronology41 = iSOChronology29.withZone(dateTimeZone40);
        org.joda.time.chrono.ISOChronology iSOChronology42 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone40);
        org.joda.time.Chronology chronology43 = iSOChronology20.withZone(dateTimeZone40);
        boolean boolean44 = iSOChronology1.equals((java.lang.Object) dateTimeZone40);
        org.joda.time.chrono.ISOChronology iSOChronology45 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone40);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        long long49 = iSOChronology45.add(readablePeriod46, (-62166515125025L), (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long54 = iSOChronology45.getDateTimeMillis((int) ' ', (int) (byte) 100, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-82189990L) + "'", long17 == (-82189990L));
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(iSOChronology20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str21, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(iSOChronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(iSOChronology34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str35, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(iSOChronology42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(iSOChronology45);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-62166515125025L) + "'", long49 == (-62166515125025L));
    }

    @Test
    @Ignore
  public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        java.lang.String str8 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = iSOChronology1.add(readablePeriod11, 9753L, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long20 = iSOChronology1.getDateTimeMillis((-62171711938968L), (int) '#', (int) (byte) 0, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str8, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9753L + "'", long14 == 9753L);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField16 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology1.millis();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology21.dayOfYear();
        org.joda.time.DurationField durationField23 = iSOChronology21.seconds();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology21.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = iSOChronology21.add(readablePeriod27, 3670000L, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone31 = iSOChronology21.getZone();
        org.joda.time.Chronology chronology32 = iSOChronology1.withZone(dateTimeZone31);
        org.joda.time.chrono.ISOChronology iSOChronology33 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone31);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(iSOChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3670000L + "'", long30 == 3670000L);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(iSOChronology33);
    }

    @Test
    @Ignore
  public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfHalfday();
        java.lang.String str8 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField11 = iSOChronology1.hours();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str8, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    @Ignore
  public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.Chronology chronology17 = iSOChronology1.withUTC();
        org.joda.time.DurationField durationField18 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology1.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = iSOChronology1.get(readablePartial21, 203791084L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = iSOChronology1.days();
        org.joda.time.DurationField durationField12 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.era();
        org.joda.time.Chronology chronology14 = iSOChronology1.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    @Ignore
  public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.ISOChronology iSOChronology18 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology18.dayOfYear();
        org.joda.time.DurationField durationField20 = iSOChronology18.seconds();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology18.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology18.dayOfYear();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology18.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology18.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology26.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology26.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = iSOChronology26.getZone();
        org.joda.time.Chronology chronology30 = iSOChronology18.withZone(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology18.weekOfWeekyear();
        java.lang.String str32 = iSOChronology18.toString();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology18.hourOfDay();
        org.joda.time.Chronology chronology34 = iSOChronology18.withUTC();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology18.dayOfYear();
        boolean boolean36 = iSOChronology1.equals((java.lang.Object) dateTimeField35);
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology1.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray40 = iSOChronology1.get(readablePeriod38, 366444L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(iSOChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(iSOChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str32, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTimeField37);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField17 = iSOChronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.centuryOfEra();
        org.joda.time.DurationField durationField20 = iSOChronology16.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology22.dayOfYear();
        org.joda.time.DurationField durationField24 = iSOChronology22.seconds();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology22.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology22.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology22.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology22.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology30.dayOfYear();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology30.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = iSOChronology30.getZone();
        org.joda.time.Chronology chronology34 = iSOChronology22.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology35 = iSOChronology16.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology36 = iSOChronology1.withZone(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField40 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology1.weekyearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(iSOChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(iSOChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
    }

    @Test
    @Ignore
  public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology19.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology19.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = iSOChronology19.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone22);
        long long27 = iSOChronology23.add((long) (short) 100, (long) (byte) 0, (-1));
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology29.dayOfYear();
        org.joda.time.DurationField durationField31 = iSOChronology29.seconds();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology29.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology29.dayOfYear();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology29.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology29.hourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology29.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        long long40 = iSOChronology29.add(readablePeriod37, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology29.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology29.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.chrono.ISOChronology iSOChronology44 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology44.dayOfYear();
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology44.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone47 = iSOChronology44.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology48 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone47);
        org.joda.time.chrono.ISOChronology iSOChronology49 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone47);
        org.joda.time.Chronology chronology50 = iSOChronology29.withZone(dateTimeZone47);
        org.joda.time.Chronology chronology51 = iSOChronology23.withZone(dateTimeZone47);
        org.joda.time.Chronology chronology52 = iSOChronology1.withZone(dateTimeZone47);
        org.joda.time.DurationField durationField53 = iSOChronology1.weeks();
        java.lang.String str54 = iSOChronology1.toString();
        org.joda.time.DurationField durationField55 = iSOChronology1.seconds();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(iSOChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(iSOChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 97L + "'", long40 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(iSOChronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(iSOChronology48);
        org.junit.Assert.assertNotNull(iSOChronology49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str54, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField55);
    }

    @Test
    @Ignore
  public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.yearOfEra();
        org.joda.time.DurationField durationField9 = iSOChronology1.weekyears();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone10);
        java.lang.String str12 = iSOChronology11.toString();
        org.joda.time.DurationField durationField13 = iSOChronology11.millis();
        org.joda.time.DurationField durationField14 = iSOChronology11.weeks();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology11.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology11.weekyear();
        org.joda.time.DurationField durationField17 = iSOChronology11.hours();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology11.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology11.dayOfYear();
        boolean boolean20 = iSOChronology1.equals((java.lang.Object) dateTimeField19);
        java.lang.String str21 = iSOChronology1.toString();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str12, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str21, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = iSOChronology1.add(readablePeriod19, 100L, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone25 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone25);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(iSOChronology26);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology1.days();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField6 = iSOChronology5.millis();
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology5.getZone();
        org.joda.time.Chronology chronology8 = iSOChronology1.withZone(dateTimeZone7);
        long long12 = iSOChronology1.add((long) (byte) 1, (-1000L), 0);
        org.joda.time.DurationField durationField13 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.yearOfEra();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.era();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = iSOChronology1.days();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = iSOChronology1.getDateTimeMillis((int) (short) 0, (int) (byte) 10, (-1), 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField8 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.hourOfDay();
        org.joda.time.DurationField durationField10 = iSOChronology1.seconds();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    @Ignore
  public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField7 = iSOChronology1.millis();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        java.lang.String str10 = iSOChronology9.toString();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = iSOChronology9.add(readablePeriod11, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = iSOChronology9.getZone();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = iSOChronology9.add(readablePeriod16, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology9.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology23.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology23.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.era();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology23.era();
        java.lang.String str28 = iSOChronology23.toString();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology23.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone30 = iSOChronology23.getZone();
        org.joda.time.Chronology chronology31 = iSOChronology9.withZone(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology9.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.chrono.ISOChronology iSOChronology34 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone33);
        org.joda.time.DurationField durationField35 = iSOChronology34.halfdays();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology34.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology34.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.ISOChronology iSOChronology39 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone38);
        java.lang.String str40 = iSOChronology39.toString();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        long long44 = iSOChronology39.add(readablePeriod41, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone45 = iSOChronology39.getZone();
        org.joda.time.Chronology chronology46 = iSOChronology34.withZone(dateTimeZone45);
        org.joda.time.Chronology chronology47 = iSOChronology9.withZone(dateTimeZone45);
        org.joda.time.Chronology chronology48 = iSOChronology1.withZone(dateTimeZone45);
        org.joda.time.DurationField durationField49 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField50 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField51 = iSOChronology1.weekyear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str10, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str28, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(iSOChronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(iSOChronology39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str40, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyearOfCentury();
        org.joda.time.Chronology chronology7 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.minuteOfHour();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    @Ignore
  public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.dayOfYear();
        org.joda.time.DurationField durationField7 = iSOChronology5.seconds();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology5.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology5.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology5.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = iSOChronology5.add(readablePeriod13, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology5.millisOfSecond();
        org.joda.time.DurationField durationField18 = iSOChronology5.weeks();
        boolean boolean19 = iSOChronology1.equals((java.lang.Object) iSOChronology5);
        org.joda.time.DurationField durationField20 = iSOChronology1.days();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.minuteOfHour();
        long long8 = iSOChronology0.add(10L, (long) (byte) -1, 0);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.secondOfDay();
        org.joda.time.DurationField durationField11 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField12 = iSOChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone13 = iSOChronology0.getZone();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.secondOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.secondOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.halfdayOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology1.days();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField6 = iSOChronology5.millis();
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology5.getZone();
        org.joda.time.Chronology chronology8 = iSOChronology1.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.dayOfMonth();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.monthOfYear();
        org.joda.time.DurationField durationField11 = iSOChronology1.hours();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.yearOfEra();
        org.joda.time.DurationField durationField11 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.clockhourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        long long6 = iSOChronology1.add(10L, (long) ' ', (int) ' ');
        long long10 = iSOChronology1.add((-82189990L), (long) '4', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = iSOChronology1.getDateTimeMillis(0L, (int) (short) 0, 0, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1034L + "'", long6 == 1034L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-82184790L) + "'", long10 == (-82184790L));
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology7.dayOfYear();
        org.joda.time.DurationField durationField9 = iSOChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology7.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology7.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = iSOChronology7.add(readablePeriod15, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField21 = iSOChronology7.minutes();
        boolean boolean22 = iSOChronology1.equals((java.lang.Object) iSOChronology7);
        org.joda.time.DurationField durationField23 = iSOChronology1.years();
        org.joda.time.DurationField durationField24 = iSOChronology1.millis();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    @Ignore
  public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DurationField durationField7 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, (-62142767999900L), (int) (byte) 10);
        org.joda.time.DurationField durationField13 = iSOChronology1.days();
        org.joda.time.DurationField durationField14 = iSOChronology1.weekyears();
        java.lang.Class<?> wildcardClass15 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-62142767999900L) + "'", long12 == (-62142767999900L));
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField12 = iSOChronology1.centuries();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField5 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField7 = iSOChronology1.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = iSOChronology1.getDateTimeMillis((int) (byte) 1, (int) (byte) 100, (int) (short) 0, (int) (short) 1, (int) '#', (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    @Ignore
  public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        java.lang.String str18 = iSOChronology17.toString();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = iSOChronology17.add(readablePeriod19, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = iSOChronology17.getZone();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = iSOChronology17.add(readablePeriod24, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField28 = iSOChronology17.hours();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology17.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology17.year();
        boolean boolean32 = iSOChronology1.equals((java.lang.Object) iSOChronology17);
        org.joda.time.chrono.ISOChronology iSOChronology33 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology33.monthOfYear();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology33.monthOfYear();
        boolean boolean36 = iSOChronology1.equals((java.lang.Object) dateTimeField35);
        org.joda.time.DurationField durationField37 = iSOChronology1.hours();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.ISOChronology iSOChronology39 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology39.dayOfYear();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology39.secondOfDay();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology39.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology39.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField44 = iSOChronology39.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology39.clockhourOfHalfday();
        boolean boolean46 = iSOChronology1.equals((java.lang.Object) dateTimeField45);
        java.lang.String str47 = iSOChronology1.toString();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str18, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iSOChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(iSOChronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str47, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.year();
        org.joda.time.DurationField durationField8 = iSOChronology1.days();
        long long12 = iSOChronology1.add(3297L, (long) '#', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.year();
        org.joda.time.DurationField durationField14 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = iSOChronology1.getDateTimeMillis((-61827271210010L), 1, 1, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3297L + "'", long12 == 3297L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    @Ignore
  public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField13 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.hourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        long long9 = iSOChronology5.add((long) (short) 100, (long) (byte) 0, (-1));
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology11.dayOfYear();
        org.joda.time.DurationField durationField13 = iSOChronology11.seconds();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology11.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology11.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology11.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology11.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = iSOChronology11.add(readablePeriod19, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology11.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology11.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology26.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology26.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = iSOChronology26.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone29);
        org.joda.time.chrono.ISOChronology iSOChronology31 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone29);
        org.joda.time.Chronology chronology32 = iSOChronology11.withZone(dateTimeZone29);
        org.joda.time.Chronology chronology33 = iSOChronology5.withZone(dateTimeZone29);
        org.joda.time.chrono.ISOChronology iSOChronology34 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology34.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology34.dayOfYear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(iSOChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(iSOChronology30);
        org.junit.Assert.assertNotNull(iSOChronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(iSOChronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField9 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.weekOfWeekyear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    @Ignore
  public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DurationField durationField7 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.minuteOfHour();
        java.lang.String str9 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.millisOfSecond();
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology11.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology11.year();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology11.hourOfDay();
        boolean boolean16 = iSOChronology1.equals((java.lang.Object) dateTimeField15);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.secondOfMinute();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str9, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    @Ignore
  public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.minuteOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    @Ignore
  public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = iSOChronology1.add(readablePeriod18, 2101035L, 1);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = iSOChronology1.get(readablePeriod22, (-61827235200000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2101035L + "'", long21 == 2101035L);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, 1034L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.centuryOfEra();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1034L + "'", long12 == 1034L);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        org.joda.time.DurationField durationField6 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.year();
        long long11 = iSOChronology1.add((-62174390399903L), (-62174390399903L), 0);
        java.lang.Class<?> wildcardClass12 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-62174390399903L) + "'", long11 == (-62174390399903L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}

