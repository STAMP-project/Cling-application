import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.minus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology10 = dateTime2.getChronology();
        org.joda.time.DateTime.Property property11 = dateTime2.centuryOfEra();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property11.getAsText(locale12);
        org.joda.time.DurationField durationField14 = property11.getRangeDurationField();
        java.util.Locale locale15 = null;
        int int16 = property11.getMaximumShortTextLength(locale15);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19" + "'", str13, "19");
        org.junit.Assert.assertNull(durationField14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.DateTime.Property property16 = dateTime15.weekyear();
        long long17 = property16.remainder();
        org.joda.time.DateTime dateTime19 = property16.setCopy("1");
        org.joda.time.DateTime.Property property20 = dateTime19.centuryOfEra();
        org.joda.time.DateTime dateTime22 = dateTime19.withMillis((-50L));
        org.joda.time.DateTime.Property property23 = dateTime19.minuteOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 619200001L + "'", long17 == 619200001L);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 1, chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        int int6 = dateTime4.getDayOfMonth();
        org.joda.time.DateTime dateTime8 = dateTime4.withYearOfEra(1);
        org.joda.time.DateTime.Property property9 = dateTime8.monthOfYear();
        int int10 = dateTime8.getYear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        org.joda.time.DateTime dateTime16 = dateTime13.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime13.toMutableDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime13.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        int int25 = dateTime23.getDayOfMonth();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateTime23.toDateTime(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime23.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime29.getZone();
        org.joda.time.DateTime dateTime31 = dateTime20.toDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime8.toMutableDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 292278993, dateTimeZone30);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone30);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime33);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime8 = property7.withMaximumValue();
        org.joda.time.DateTime dateTime10 = dateTime8.minusDays(2040);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMillis(2040);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime10.withDayOfWeek(600001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 600001 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(1970);
        org.joda.time.DateTime.Property property7 = dateTime6.monthOfYear();
        org.joda.time.DateTime.Property property8 = dateTime6.dayOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTime();
        org.joda.time.DateTime dateTime14 = dateTime11.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime11.toMutableDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime11.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime21.toMutableDateTime();
        int int23 = dateTime21.getDayOfMonth();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.toDateTime(chronology24);
        org.joda.time.DateTime dateTime27 = dateTime21.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime27.getZone();
        org.joda.time.DateTime dateTime29 = dateTime18.toDateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime6.toMutableDateTime(dateTimeZone28);
        boolean boolean33 = dateTime6.isAfterNow();
        java.util.Locale locale34 = null;
        java.util.Calendar calendar35 = dateTime6.toCalendar(locale34);
        org.joda.time.DateTime dateTime37 = dateTime6.plusMonths(34);
        org.joda.time.DateTime.Property property38 = dateTime6.era();
        org.joda.time.DateTime dateTime39 = property38.roundHalfFloorCopy();
        java.util.Locale locale40 = null;
        java.lang.String str41 = property38.getAsText(locale40);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (byte) 1, chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime44.toMutableDateTime();
        int int46 = dateTime44.getDayOfMonth();
        org.joda.time.DateTime dateTime48 = dateTime44.withYearOfEra(1);
        org.joda.time.DateTime.Property property49 = dateTime48.monthOfYear();
        org.joda.time.DurationField durationField50 = property49.getDurationField();
        java.lang.String str51 = property49.toString();
        org.joda.time.DateTime dateTime53 = property49.addToCopy((long) 5);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (byte) 1, chronology55);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = dateTime56.toDateTime(chronology57);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.DateTime dateTime61 = dateTime56.withDurationAdded(readableDuration59, 100);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = dateTime61.withZone(dateTimeZone62);
        org.joda.time.DateTime.Property property64 = dateTime63.minuteOfDay();
        org.joda.time.DateTime dateTime66 = dateTime63.plusHours((int) (byte) 100);
        boolean boolean68 = dateTime66.isBefore(0L);
        org.joda.time.DateTime dateTime70 = dateTime66.withYearOfCentury(0);
        int int71 = dateTime70.getSecondOfDay();
        boolean boolean73 = dateTime70.isEqual((long) 100);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) (byte) 1, chronology75);
        org.joda.time.DateTime dateTime77 = dateTime76.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology78 = dateTime76.getChronology();
        org.joda.time.MutableDateTime mutableDateTime79 = dateTime70.toMutableDateTime(chronology78);
        boolean boolean80 = dateTime53.isBefore((org.joda.time.ReadableInstant) mutableDateTime79);
        // The following exception was thrown during execution in test generation
        try {
            long long81 = property38.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime79);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(calendar35);
        org.junit.Assert.assertEquals(calendar35.toString(), "java.util.GregorianCalendar[time=1971,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=1,MILLISECOND=971,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "AD" + "'", str41, "AD");
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Property[monthOfYear]" + "'", str51, "Property[monthOfYear]");
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 14400 + "'", int71 == 14400);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertNotNull(mutableDateTime79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.DateTime dateTime11 = dateTime2.plusMonths((int) (short) 0);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTime.Property property20 = dateTime14.yearOfCentury();
        org.joda.time.DateTime dateTime21 = property20.roundFloorCopy();
        org.joda.time.DateTime dateTime23 = dateTime21.plus((long) (short) -1);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 1, chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime27.toMutableDateTime();
        org.joda.time.DateTime dateTime30 = dateTime27.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime27.toMutableDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime27.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 1, chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime37.toMutableDateTime();
        int int39 = dateTime37.getDayOfMonth();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.toDateTime(chronology40);
        org.joda.time.DateTime dateTime43 = dateTime37.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTime43.getZone();
        org.joda.time.DateTime dateTime45 = dateTime34.toDateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(0L, dateTimeZone44);
        org.joda.time.DateTime dateTime48 = dateTime21.withZoneRetainFields(dateTimeZone44);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (byte) 1, chronology50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.toDateTime(chronology52);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime56 = dateTime51.withDurationAdded(readableDuration54, 100);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = dateTime56.withZone(dateTimeZone57);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.DateTime dateTime60 = dateTime56.plus(readableDuration59);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (byte) 1, chronology62);
        org.joda.time.DateTime.Property property64 = dateTime63.minuteOfDay();
        java.lang.String str65 = property64.getAsText();
        org.joda.time.DateTime dateTime66 = property64.roundHalfEvenCopy();
        int int67 = dateTime60.compareTo((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) (byte) 1, chronology69);
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime70.toMutableDateTime();
        int int72 = dateTime70.getDayOfMonth();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateTime dateTime74 = dateTime70.toDateTime(chronology73);
        org.joda.time.DateTime dateTime76 = dateTime70.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone77 = dateTime76.getZone();
        org.joda.time.DateTime dateTime78 = dateTime66.toDateTime(dateTimeZone77);
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime(dateTimeZone77);
        org.joda.time.DateTime dateTime80 = dateTime48.toDateTime(dateTimeZone77);
        org.joda.time.DateTime dateTime81 = dateTime2.withZoneRetainFields(dateTimeZone77);
        org.joda.time.DateTime dateTime82 = new org.joda.time.DateTime((java.lang.Object) dateTime81);
        boolean boolean84 = dateTime82.isEqual(1606264587832L);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "0" + "'", str65, "0");
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(dateTimeZone77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        int int15 = dateTime13.getDayOfMonth();
        long long16 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime13);
        int int17 = property9.get();
        org.joda.time.Interval interval18 = property9.toInterval();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.toDateTime(chronology22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withDurationAdded(readableDuration24, 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withZone(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = dateTime26.toLocalDateTime();
        int int30 = property9.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTime dateTime31 = dateTime5.withFields((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) 1, chronology33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.toDateTime(chronology35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime39 = dateTime34.withDurationAdded(readableDuration37, 100);
        org.joda.time.DateTime.Property property40 = dateTime34.yearOfCentury();
        org.joda.time.DateTime dateTime41 = property40.roundFloorCopy();
        org.joda.time.DateTime dateTime43 = dateTime41.plus((long) (short) -1);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (byte) 1, chronology46);
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime47.toMutableDateTime();
        org.joda.time.DateTime dateTime50 = dateTime47.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime47.toMutableDateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime47.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) (byte) 1, chronology56);
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime57.toMutableDateTime();
        int int59 = dateTime57.getDayOfMonth();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTime dateTime61 = dateTime57.toDateTime(chronology60);
        org.joda.time.DateTime dateTime63 = dateTime57.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone64 = dateTime63.getZone();
        org.joda.time.DateTime dateTime65 = dateTime54.toDateTime(dateTimeZone64);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(dateTimeZone64);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(0L, dateTimeZone64);
        org.joda.time.DateTime dateTime68 = dateTime41.withZoneRetainFields(dateTimeZone64);
        org.joda.time.DateTime dateTime69 = dateTime5.withZoneRetainFields(dateTimeZone64);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(dateTimeZone64);
        int int71 = dateTime70.getEra();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((long) (byte) 1, chronology74);
        org.joda.time.DateTime.Property property76 = dateTime75.minuteOfDay();
        java.lang.String str77 = property76.getAsText();
        org.joda.time.DateTime dateTime78 = property76.getDateTime();
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime((long) (byte) 1, chronology80);
        org.joda.time.DateTime dateTime82 = dateTime81.toDateTimeISO();
        org.joda.time.Chronology chronology83 = dateTime82.getChronology();
        org.joda.time.DateTime dateTime84 = org.joda.time.DateTime.now(chronology83);
        org.joda.time.DateTime dateTime85 = dateTime78.withChronology(chronology83);
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime((long) 9, chronology83);
        org.joda.time.DateTime dateTime87 = new org.joda.time.DateTime((java.lang.Object) dateTime70, chronology83);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "0" + "'", str77, "0");
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(chronology83);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(dateTime85);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.DateTime dateTime11 = dateTime2.plusMonths((int) (short) 0);
        int int12 = dateTime11.getCenturyOfEra();
        org.joda.time.DateTime dateTime14 = dateTime11.withYearOfEra(86398);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime11.withPeriodAdded(readablePeriod15, 2020);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.plus(readableDuration18);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.minus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime5.withPeriodAdded(readablePeriod10, 1439);
        org.joda.time.Chronology chronology13 = dateTime5.getChronology();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime16.minus(readableDuration18);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime19.toMutableDateTime();
        org.joda.time.DateTime.Property property21 = dateTime19.weekyear();
        org.joda.time.DateTime dateTime23 = property21.addToCopy((int) (byte) 0);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfDay();
        java.lang.String str28 = property27.getAsText();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTime();
        int int33 = dateTime31.getDayOfMonth();
        long long34 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime35 = property27.withMinimumValue();
        org.joda.time.DateTime dateTime37 = dateTime35.minusWeeks((int) (byte) 10);
        long long38 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime.Property property39 = dateTime37.centuryOfEra();
        int int40 = dateTime5.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (byte) 1, chronology42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.toDateTime(chronology44);
        org.joda.time.DateTime dateTime47 = dateTime43.plusMillis(1970);
        org.joda.time.TimeOfDay timeOfDay48 = dateTime43.toTimeOfDay();
        org.joda.time.DateTime dateTime49 = dateTime37.withFields((org.joda.time.ReadablePartial) timeOfDay48);
        java.util.Date date50 = dateTime37.toDate();
        org.joda.time.DateTime dateTime52 = dateTime37.minusDays(31);
        org.joda.time.DateTime dateTime54 = dateTime37.withYear(59);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0" + "'", str28, "0");
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Oct 23 00:00:00 UTC 1969");
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.DateTime dateTime11 = property9.roundHalfEvenCopy();
        int int12 = property9.get();
        java.util.Locale locale13 = null;
        int int14 = property9.getMaximumTextLength(locale13);
        int int15 = property9.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property9.getFieldType();
        org.joda.time.DateTime.Property property17 = dateTime2.property(dateTimeFieldType16);
        org.joda.time.DateTime dateTime19 = dateTime2.minusYears(12);
        int int20 = dateTime2.getHourOfDay();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        int int15 = dateTime13.getDayOfMonth();
        long long16 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime13);
        int int17 = property9.get();
        org.joda.time.Interval interval18 = property9.toInterval();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.toDateTime(chronology22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withDurationAdded(readableDuration24, 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withZone(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = dateTime26.toLocalDateTime();
        int int30 = property9.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTime dateTime31 = dateTime5.withFields((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTime dateTime32 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology33 = dateTime32.getChronology();
        org.joda.time.DateTime dateTime35 = dateTime32.withMillisOfDay(154);
        org.joda.time.DateTime dateTime37 = dateTime35.plusMillis(70);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.withDayOfYear(20);
        org.joda.time.DateTime dateTime13 = dateTime11.withMonthOfYear((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekOfWeekyear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTime(chronology18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime22 = dateTime17.withDurationAdded(readableDuration20, 100);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.withZone(dateTimeZone23);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        org.joda.time.DateTime dateTime27 = dateTime24.plusHours((int) (byte) 100);
        org.joda.time.LocalDate localDate28 = dateTime27.toLocalDate();
        java.util.Date date29 = dateTime27.toDate();
        org.joda.time.DateTime.Property property30 = dateTime27.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = dateTime32.toDateTimeISO();
        long long34 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime35 = property14.withMaximumValue();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Mon Jan 05 04:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 41L + "'", long34 == 41L);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(1970);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.minus(readablePeriod7);
        org.joda.time.DateTime.Property property9 = dateTime8.era();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.toDateTime(chronology14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withDurationAdded(readableDuration16, 100);
        org.joda.time.DateTime dateTime21 = dateTime18.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.DateTime dateTime22 = dateTime18.withLaterOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime18.minus(readableDuration23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 1, chronology26);
        org.joda.time.DateTime dateTime28 = dateTime27.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology29 = dateTime27.getChronology();
        org.joda.time.DateTime dateTime30 = dateTime18.toDateTime(chronology29);
        org.joda.time.DateTime dateTime31 = dateTime9.withChronology(chronology29);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(chronology29);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(5, (-18595), (-18595), 157, 6, 36, 2, chronology29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 157 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        int int14 = dateTime12.getDayOfMonth();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime12.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTime dateTime20 = dateTime9.toDateTime(dateTimeZone19);
        org.joda.time.LocalDate localDate21 = dateTime9.toLocalDate();
        org.joda.time.DateTime dateTime24 = dateTime9.withDurationAdded((long) (byte) 0, 19);
        org.joda.time.DateTime dateTime26 = dateTime24.minus((long) 609);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime10 = property7.getDateTime();
        org.joda.time.DateTime.Property property11 = dateTime10.secondOfMinute();
        org.joda.time.DateTime.Property property12 = dateTime10.weekyear();
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(timeOfDay13);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.DateTime dateTime30 = dateTime28.plus(86340001L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime32 = dateTime30.withMillisOfSecond(72000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 72000 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        org.joda.time.DateTime dateTime29 = dateTime26.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime26.toMutableDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime26.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 1, chronology35);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime36.toMutableDateTime();
        int int38 = dateTime36.getDayOfMonth();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = dateTime36.toDateTime(chronology39);
        org.joda.time.DateTime dateTime42 = dateTime36.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime42.getZone();
        org.joda.time.DateTime dateTime44 = dateTime33.toDateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = dateTime23.withZone(dateTimeZone43);
        org.joda.time.DateTime dateTime47 = dateTime45.plusSeconds((int) (byte) 100);
        boolean boolean48 = dateTime45.isAfterNow();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology4 = dateTime2.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology4);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DateTime dateTime10 = property8.addWrapFieldToCopy(100);
        int int11 = dateTime10.getMillisOfSecond();
        java.util.Date date12 = dateTime10.toDate();
        org.joda.time.DateTime dateTime14 = dateTime10.plusSeconds(9);
        org.joda.time.DateTime dateTime16 = dateTime10.minusHours(0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sat Apr 11 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        int int10 = dateTime2.getMonthOfYear();
        org.joda.time.DateTime.Property property11 = dateTime2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime2.getZone();
        int int13 = dateTime2.getDayOfWeek();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        boolean boolean6 = dateTime5.isEqualNow();
        org.joda.time.DateTime.Property property7 = dateTime5.millisOfSecond();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withDurationAdded(readableDuration13, 100);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.withZone(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime18 = dateTime15.toLocalDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = dateTime15.toString(dateTimeFormatter19);
        boolean boolean22 = dateTime15.isBefore((long) 19);
        org.joda.time.DateTime dateTime24 = dateTime15.withDayOfYear(12);
        int int25 = property7.getDifference((org.joda.time.ReadableInstant) dateTime15);
        long long26 = dateTime15.getMillis();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str20, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.toDateTime(chronology4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.withDurationAdded(readableDuration6, 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.withZone(dateTimeZone9);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfDay();
        org.joda.time.DateTime dateTime13 = dateTime10.plusHours((int) (byte) 100);
        boolean boolean15 = dateTime13.isBefore(0L);
        org.joda.time.DateTime dateTime17 = dateTime13.withYearOfCentury(0);
        int int18 = dateTime17.getSecondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = dateTime17.toString(dateTimeFormatter19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime29 = dateTime24.withDurationAdded(readableDuration27, 100);
        org.joda.time.DateTime.Property property30 = dateTime29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime29.getZone();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(100L, dateTimeZone31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((java.lang.Object) dateTime17, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone31);
        int int35 = dateTime34.getSecondOfMinute();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14400 + "'", int18 == 14400);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1900-01-05T04:00:00.001Z" + "'", str20, "1900-01-05T04:00:00.001Z");
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) readableDuration4);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.minus(readableDuration7);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime6.toMutableDateTime();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime3.toMutableDateTime();
        org.joda.time.DateTime dateTime6 = dateTime3.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime3.withCenturyOfEra(1439);
        org.joda.time.DateTime dateTime12 = dateTime3.plusMonths((int) (short) 0);
        int int13 = dateTime12.getCenturyOfEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfDay();
        java.lang.String str18 = property17.getAsText();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime21.toMutableDateTime();
        int int23 = dateTime21.getDayOfMonth();
        long long24 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime25 = property17.withMinimumValue();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, chronology27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.toDateTime(chronology29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime33 = dateTime28.withDurationAdded(readableDuration31, 100);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.withZone(dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime36 = dateTime35.toLocalDateTime();
        org.joda.time.DateTime dateTime37 = dateTime25.withFields((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (byte) 1, chronology39);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime40.toMutableDateTime();
        org.joda.time.DateTime dateTime43 = dateTime40.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime40.toMutableDateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime40.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (byte) 1, chronology49);
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime50.toMutableDateTime();
        int int52 = dateTime50.getDayOfMonth();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = dateTime50.toDateTime(chronology53);
        org.joda.time.DateTime dateTime56 = dateTime50.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone57 = dateTime56.getZone();
        org.joda.time.DateTime dateTime58 = dateTime47.toDateTime(dateTimeZone57);
        org.joda.time.DateTime dateTime59 = dateTime37.withZone(dateTimeZone57);
        boolean boolean60 = dateTime12.equals((java.lang.Object) dateTime59);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.DateTime dateTime62 = dateTime59.plus(readablePeriod61);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) (byte) 1, chronology64);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = dateTime65.toDateTime(chronology66);
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.DateTime dateTime70 = dateTime65.withDurationAdded(readableDuration68, 100);
        org.joda.time.DateTime dateTime73 = dateTime70.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.DateTime dateTime74 = dateTime70.withLaterOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.DateTime dateTime76 = dateTime70.minus(readableDuration75);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((long) (byte) 1, chronology78);
        org.joda.time.DateTime dateTime80 = dateTime79.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology81 = dateTime79.getChronology();
        org.joda.time.DateTime dateTime82 = dateTime70.toDateTime(chronology81);
        org.joda.time.DateTime dateTime83 = dateTime59.toDateTime(chronology81);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime((java.lang.Object) 600001, chronology81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(chronology81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTime83);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.Object obj4 = null;
        boolean boolean5 = property3.equals(obj4);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.DurationField durationField7 = property3.getRangeDurationField();
        long long8 = property3.remainder();
        org.joda.time.DateTime dateTime9 = property3.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime10 = property3.roundCeilingCopy();
        org.joda.time.DateTime.Property property11 = dateTime10.monthOfYear();
        org.joda.time.DateTime.Property property12 = dateTime10.secondOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withPeriodAdded(readablePeriod29, (int) (byte) 0);
        org.joda.time.DateTime dateTime33 = dateTime28.minusWeeks(292278993);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 1, chronology35);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime36.toMutableDateTime();
        org.joda.time.DateTime dateTime39 = dateTime36.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime36.toMutableDateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = dateTime36.toDateTimeISO();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (byte) 1, chronology44);
        org.joda.time.DateTime.Property property46 = dateTime45.minuteOfDay();
        java.lang.String str47 = property46.getAsText();
        org.joda.time.DateTime dateTime48 = property46.withMaximumValue();
        long long49 = dateTime48.getMillis();
        boolean boolean50 = dateTime42.isBefore((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (byte) 1, chronology52);
        org.joda.time.DateTime.Property property54 = dateTime53.minuteOfDay();
        java.lang.String str55 = property54.getAsText();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) 1, chronology57);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime58.toMutableDateTime();
        int int60 = dateTime58.getDayOfMonth();
        long long61 = property54.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime62 = property54.withMinimumValue();
        int int63 = property54.get();
        org.joda.time.DurationField durationField64 = property54.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property54.getFieldType();
        boolean boolean66 = dateTime42.isSupported(dateTimeFieldType65);
        int int67 = dateTime33.get(dateTimeFieldType65);
        org.joda.time.DateTime dateTime68 = dateTime33.withEarlierOffsetAtOverlap();
        int int69 = dateTime68.getYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "0" + "'", str47, "0");
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 86340001L + "'", long49 == 86340001L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "0" + "'", str55, "0");
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(durationField64);
        org.junit.Assert.assertNotNull(dateTimeFieldType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-5599659) + "'", int69 == (-5599659));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime7 = dateTime5.toLocalDateTime();
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withDurationAdded(readableDuration14, 100);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.withZone(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime19 = dateTime18.toLocalDateTime();
        org.joda.time.DateTime dateTime20 = dateTime5.withFields((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.DateTime dateTime23 = dateTime5.withDurationAdded((long) (short) -1, 1439);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 1, chronology26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (byte) 1, chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime30.minus(readableDuration32);
        int int34 = dateTime27.compareTo((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime37 = dateTime30.withPeriodAdded(readablePeriod35, 1439);
        org.joda.time.Chronology chronology38 = dateTime30.getChronology();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) ' ', chronology38);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (byte) 1, chronology41);
        org.joda.time.DateTime dateTime43 = dateTime42.toDateTimeISO();
        org.joda.time.Chronology chronology44 = dateTime43.getChronology();
        org.joda.time.DateTime dateTime45 = dateTime39.toDateTime(chronology44);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (byte) 1, chronology47);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime48.toMutableDateTime();
        org.joda.time.DateTime dateTime51 = dateTime48.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime48.toMutableDateTime(dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime48.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) 1, chronology57);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime58.toMutableDateTime();
        int int60 = dateTime58.getDayOfMonth();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = dateTime58.toDateTime(chronology61);
        org.joda.time.DateTime dateTime64 = dateTime58.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone65 = dateTime64.getZone();
        org.joda.time.DateTime dateTime66 = dateTime55.toDateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime45.toDateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime69 = org.joda.time.DateTime.now(dateTimeZone65);
        org.joda.time.DateTime dateTime70 = dateTime5.toDateTime(dateTimeZone65);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime70);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime2.withSecondOfMinute((int) (short) 1);
        java.util.Locale locale9 = null;
        java.util.Calendar calendar10 = dateTime2.toCalendar(locale9);
        java.util.Date date11 = dateTime2.toDate();
        org.joda.time.DateTime.Property property12 = dateTime2.hourOfDay();
        org.joda.time.DateTime.Property property13 = dateTime2.era();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property13.getAsShortText(locale14);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AD" + "'", str15, "AD");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.Object obj4 = null;
        boolean boolean5 = property3.equals(obj4);
        org.joda.time.DateTime dateTime6 = property3.roundHalfFloorCopy();
        int int7 = dateTime6.getDayOfWeek();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime10 = property7.getDateTime();
        org.joda.time.DateTime.Property property11 = dateTime10.centuryOfEra();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 1, chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.minus(readableDuration20);
        int int22 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime25 = dateTime18.withPeriodAdded(readablePeriod23, 1439);
        org.joda.time.Chronology chronology26 = dateTime18.getChronology();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) ' ', chronology26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (byte) 1, chronology29);
        org.joda.time.DateTime dateTime31 = dateTime30.toDateTimeISO();
        org.joda.time.Chronology chronology32 = dateTime31.getChronology();
        org.joda.time.DateTime dateTime33 = dateTime27.toDateTime(chronology32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 1, chronology35);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime36.toMutableDateTime();
        org.joda.time.DateTime dateTime39 = dateTime36.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime36.toMutableDateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime36.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (byte) 1, chronology45);
        org.joda.time.MutableDateTime mutableDateTime47 = dateTime46.toMutableDateTime();
        int int48 = dateTime46.getDayOfMonth();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = dateTime46.toDateTime(chronology49);
        org.joda.time.DateTime dateTime52 = dateTime46.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone53 = dateTime52.getZone();
        org.joda.time.DateTime dateTime54 = dateTime43.toDateTime(dateTimeZone53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime33.toDateTime(dateTimeZone53);
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(dateTimeZone53);
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now(dateTimeZone53);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime10.toMutableDateTime(dateTimeZone53);
        java.lang.String str60 = dateTime10.toString();
        org.joda.time.LocalTime localTime61 = dateTime10.toLocalTime();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str60, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(localTime61);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        int int15 = dateTime13.getDayOfMonth();
        long long16 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime13);
        int int17 = property9.get();
        org.joda.time.Interval interval18 = property9.toInterval();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.toDateTime(chronology22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withDurationAdded(readableDuration24, 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withZone(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = dateTime26.toLocalDateTime();
        int int30 = property9.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTime dateTime31 = dateTime5.withFields((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTime dateTime32 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology33 = dateTime32.getChronology();
        org.joda.time.DateTime dateTime35 = dateTime32.withMillisOfDay(154);
        java.lang.String str36 = dateTime35.toString();
        org.joda.time.DateTime dateTime38 = dateTime35.minusDays((int) (byte) 100);
        org.joda.time.DateTime dateTime40 = dateTime35.withYear(157);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01T00:00:00.154Z" + "'", str36, "1970-01-01T00:00:00.154Z");
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.getDateTime();
        java.lang.String str12 = property3.toString();
        org.joda.time.DateTime dateTime14 = property3.setCopy(300);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withPeriodAdded(readablePeriod15, 19);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[minuteOfDay]" + "'", str12, "Property[minuteOfDay]");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime.Property property7 = dateTime6.monthOfYear();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        java.lang.String str9 = property7.toString();
        org.joda.time.DateTime dateTime11 = property7.addToCopy((long) 5);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.withDurationAdded(readableDuration12, 1966);
        org.joda.time.DateTime.Property property15 = dateTime14.monthOfYear();
        boolean boolean16 = property15.isLeap();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Property[monthOfYear]" + "'", str9, "Property[monthOfYear]");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime11.year();
        org.joda.time.DateTime dateTime16 = dateTime11.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((-18591L));
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.minus(readableDuration27);
        int int29 = dateTime22.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime32 = dateTime25.withPeriodAdded(readablePeriod30, 1439);
        org.joda.time.Chronology chronology33 = dateTime25.getChronology();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) ' ', chronology33);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 1, chronology36);
        org.joda.time.DateTime dateTime38 = dateTime37.toDateTimeISO();
        org.joda.time.Chronology chronology39 = dateTime38.getChronology();
        org.joda.time.DateTime dateTime40 = dateTime34.toDateTime(chronology39);
        org.joda.time.DateTime dateTime41 = dateTime18.toDateTime(chronology39);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((java.lang.Object) dateTime16, chronology39);
        org.joda.time.DateTime.Property property43 = dateTime42.weekyear();
        int int44 = dateTime42.getEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime8 = dateTime2.plusHours(0);
        long long9 = dateTime2.getMillis();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfDay();
        java.lang.Object obj14 = null;
        boolean boolean15 = property13.equals(obj14);
        org.joda.time.DateTimeField dateTimeField16 = property13.getField();
        org.joda.time.DurationField durationField17 = property13.getRangeDurationField();
        org.joda.time.DateTime dateTime18 = property13.getDateTime();
        java.util.Locale locale19 = null;
        java.util.Calendar calendar20 = dateTime18.toCalendar(locale19);
        boolean boolean21 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime(chronology13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withDurationAdded(readableDuration15, 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZone(dateTimeZone18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.plus(readableDuration20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        java.lang.String str26 = property25.getAsText();
        org.joda.time.DateTime dateTime27 = property25.roundHalfEvenCopy();
        int int28 = dateTime21.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTime();
        org.joda.time.DateTime dateTime34 = dateTime31.withMillisOfSecond((int) '#');
        boolean boolean35 = dateTime21.equals((java.lang.Object) dateTime34);
        boolean boolean36 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 1, chronology38);
        org.joda.time.DateTime.Property property40 = dateTime39.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTime dateTime42 = dateTime39.minus(readableDuration41);
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime42.toMutableDateTime();
        org.joda.time.DateTime.Property property44 = dateTime42.weekyear();
        org.joda.time.DateTime dateTime46 = property44.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime48 = dateTime46.minusMonths(20);
        org.joda.time.DateTime dateTime50 = dateTime46.plusWeeks(70);
        int int51 = dateTime50.getHourOfDay();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (byte) 1, chronology53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = dateTime54.toDateTime(chronology55);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.DateTime dateTime59 = dateTime54.withDurationAdded(readableDuration57, 100);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateTime dateTime61 = dateTime59.withZone(dateTimeZone60);
        org.joda.time.DateTime.Property property62 = dateTime61.minuteOfDay();
        org.joda.time.DateTime dateTime64 = dateTime61.plusHours((int) (byte) 100);
        boolean boolean66 = dateTime64.isBefore(0L);
        org.joda.time.DateTime dateTime68 = dateTime64.withYearOfCentury(0);
        int int69 = dateTime68.getSecondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = null;
        java.lang.String str71 = dateTime68.toString(dateTimeFormatter70);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((long) (byte) 1, chronology74);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.DateTime dateTime77 = dateTime75.toDateTime(chronology76);
        org.joda.time.ReadableDuration readableDuration78 = null;
        org.joda.time.DateTime dateTime80 = dateTime75.withDurationAdded(readableDuration78, 100);
        org.joda.time.DateTime.Property property81 = dateTime80.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone82 = dateTime80.getZone();
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime(100L, dateTimeZone82);
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime((java.lang.Object) dateTime68, dateTimeZone82);
        org.joda.time.DateTime dateTime85 = dateTime50.toDateTime(dateTimeZone82);
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime((java.lang.Object) dateTime9, dateTimeZone82);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 14400 + "'", int69 == 14400);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "1900-01-05T04:00:00.001Z" + "'", str71, "1900-01-05T04:00:00.001Z");
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertNotNull(dateTimeZone82);
        org.junit.Assert.assertNotNull(dateTime85);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        long long29 = dateTime28.getMillis();
        int int30 = dateTime28.getYear();
        int int31 = dateTime28.getMonthOfYear();
        org.joda.time.DateTime dateTime33 = dateTime28.minusHours(242);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 1, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.toDateTime(chronology37);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTime dateTime41 = dateTime36.withDurationAdded(readableDuration39, 100);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = dateTime41.withZone(dateTimeZone42);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTime dateTime45 = dateTime41.plus(readableDuration44);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (byte) 1, chronology47);
        org.joda.time.DateTime.Property property49 = dateTime48.minuteOfDay();
        java.lang.String str50 = property49.getAsText();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (byte) 1, chronology52);
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime53.toMutableDateTime();
        int int55 = dateTime53.getDayOfMonth();
        long long56 = property49.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime57 = property49.withMinimumValue();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (byte) 1, chronology59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = dateTime60.toDateTime(chronology61);
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.DateTime dateTime65 = dateTime60.withDurationAdded(readableDuration63, 100);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = dateTime65.withZone(dateTimeZone66);
        org.joda.time.LocalDateTime localDateTime68 = dateTime67.toLocalDateTime();
        org.joda.time.DateTime dateTime69 = dateTime57.withFields((org.joda.time.ReadablePartial) localDateTime68);
        int int70 = dateTime57.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime72 = dateTime57.withYear(4);
        org.joda.time.DateTime dateTime74 = dateTime57.withMillis((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        org.joda.time.DateTime dateTime77 = dateTime74.withPeriodAdded(readablePeriod75, (int) (byte) 0);
        org.joda.time.DateTime dateTime79 = dateTime77.plusYears((int) (byte) 0);
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.DateTime dateTime82 = new org.joda.time.DateTime((long) (byte) 1, chronology81);
        org.joda.time.DateTime.Property property83 = dateTime82.minuteOfDay();
        java.lang.String str84 = property83.getAsText();
        org.joda.time.DateTime dateTime85 = property83.roundHalfEvenCopy();
        int int86 = property83.get();
        java.util.Locale locale87 = null;
        int int88 = property83.getMaximumTextLength(locale87);
        int int89 = property83.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType90 = property83.getFieldType();
        org.joda.time.DateTime dateTime92 = dateTime77.withField(dateTimeFieldType90, (int) (short) 1);
        org.joda.time.DateTime dateTime94 = dateTime45.withField(dateTimeFieldType90, 1439);
        org.joda.time.DateTime.Property property95 = dateTime28.property(dateTimeFieldType90);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "0" + "'", str50, "0");
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "0" + "'", str84, "0");
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 4 + "'", int88 == 4);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType90);
        org.junit.Assert.assertNotNull(dateTime92);
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertNotNull(property95);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTimeISO();
        org.joda.time.DateTime.Property property4 = dateTime2.secondOfDay();
        int int5 = property4.getMaximumValueOverall();
        org.joda.time.DurationField durationField6 = property4.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 86399 + "'", int5 == 86399);
        org.junit.Assert.assertNull(durationField6);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DateTime dateTime10 = property8.addWrapFieldToCopy(100);
        int int11 = dateTime10.getMillisOfSecond();
        java.util.Date date12 = dateTime10.toDate();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.toDateTime(chronology16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime20 = dateTime15.withDurationAdded(readableDuration18, 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.withZone(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime23 = dateTime20.toLocalDateTime();
        org.joda.time.DateTime dateTime24 = dateTime10.withFields((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.DateTime dateTime26 = dateTime24.plusYears((int) 'a');
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sat Apr 11 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        int int15 = dateTime13.getDayOfMonth();
        long long16 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime13);
        int int17 = property9.get();
        org.joda.time.Interval interval18 = property9.toInterval();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.toDateTime(chronology22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withDurationAdded(readableDuration24, 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withZone(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = dateTime26.toLocalDateTime();
        int int30 = property9.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTime dateTime31 = dateTime5.withFields((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) 1, chronology33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.toDateTime(chronology35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime39 = dateTime34.withDurationAdded(readableDuration37, 100);
        org.joda.time.DateTime.Property property40 = dateTime34.yearOfCentury();
        org.joda.time.DateTime dateTime41 = property40.roundFloorCopy();
        org.joda.time.DateTime dateTime43 = dateTime41.plus((long) (short) -1);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (byte) 1, chronology46);
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime47.toMutableDateTime();
        org.joda.time.DateTime dateTime50 = dateTime47.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime47.toMutableDateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime47.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) (byte) 1, chronology56);
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime57.toMutableDateTime();
        int int59 = dateTime57.getDayOfMonth();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTime dateTime61 = dateTime57.toDateTime(chronology60);
        org.joda.time.DateTime dateTime63 = dateTime57.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone64 = dateTime63.getZone();
        org.joda.time.DateTime dateTime65 = dateTime54.toDateTime(dateTimeZone64);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(dateTimeZone64);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(0L, dateTimeZone64);
        org.joda.time.DateTime dateTime68 = dateTime41.withZoneRetainFields(dateTimeZone64);
        org.joda.time.DateTime dateTime69 = dateTime5.withZoneRetainFields(dateTimeZone64);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(dateTimeZone64);
        int int71 = dateTime70.getEra();
        boolean boolean72 = dateTime70.isAfterNow();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(1970);
        org.joda.time.DateTime.Property property7 = dateTime6.monthOfYear();
        org.joda.time.DateTime.Property property8 = dateTime6.dayOfYear();
        org.joda.time.DateTime.Property property9 = dateTime6.minuteOfDay();
        java.lang.String str10 = property9.getAsString();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 1, chronology3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.toDateTime(chronology5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime4.withDurationAdded(readableDuration7, 100);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withZone(dateTimeZone10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.plus(readableDuration12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfDay();
        java.lang.String str18 = property17.getAsText();
        org.joda.time.DateTime dateTime19 = property17.roundHalfEvenCopy();
        int int20 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        int int25 = dateTime23.getDayOfMonth();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateTime23.toDateTime(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime23.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime29.getZone();
        org.joda.time.DateTime dateTime31 = dateTime19.toDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 'a', dateTimeZone30);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (short) 0, dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime2.plusMinutes((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.plus(readablePeriod9);
        boolean boolean12 = dateTime8.isBefore((long) 5);
        org.joda.time.LocalDate localDate13 = dateTime8.toLocalDate();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(1612319594405L);
        org.joda.time.Chronology chronology2 = dateTime1.getChronology();
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        java.util.GregorianCalendar gregorianCalendar14 = dateTime12.toGregorianCalendar();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        int int6 = property3.get();
        java.util.Locale locale7 = null;
        int int8 = property3.getMaximumTextLength(locale7);
        int int9 = property3.get();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime(chronology13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withDurationAdded(readableDuration15, 100);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfYear();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime21.minus(readableDuration23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((java.lang.Object) readableDuration23);
        org.joda.time.DateTime.Property property26 = dateTime25.millisOfSecond();
        long long27 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.LocalTime localTime28 = dateTime25.toLocalTime();
        org.joda.time.DateTime dateTime29 = dateTime25.toDateTime();
        int int30 = dateTime25.getHourOfDay();
        long long31 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime32 = property3.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-18591L) + "'", long27 == (-18591L));
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-26771197L) + "'", long31 == (-26771197L));
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) readableDuration4);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        java.lang.String str9 = property7.getAsShortText();
        boolean boolean11 = property7.equals((java.lang.Object) (-50));
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        int int16 = dateTime14.getDayOfMonth();
        org.joda.time.DateTime dateTime18 = dateTime14.withYearOfEra(1);
        org.joda.time.DateTime dateTime21 = dateTime14.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.withZoneRetainFields(dateTimeZone22);
        org.joda.time.DateTime.Property property24 = dateTime23.dayOfYear();
        java.lang.String str25 = dateTime23.toString();
        org.joda.time.DateTime.Property property26 = dateTime23.minuteOfDay();
        int int27 = property7.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "679" + "'", str9, "679");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01T00:00:01.440Z" + "'", str25, "1970-01-01T00:00:01.440Z");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.toDateTime(chronology4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.withDurationAdded(readableDuration6, 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.withZone(dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.minuteOfDay();
        java.lang.String str17 = property16.getAsText();
        org.joda.time.DateTime dateTime18 = property16.roundHalfEvenCopy();
        int int19 = dateTime12.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime22.toMutableDateTime();
        org.joda.time.DateTime dateTime25 = dateTime22.withMillisOfSecond((int) '#');
        boolean boolean26 = dateTime12.equals((java.lang.Object) dateTime25);
        org.joda.time.DateTime.Property property27 = dateTime12.weekyear();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime12.getZone();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(454420108800001L, dateTimeZone28);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.minus(readablePeriod6);
        long long8 = dateTime7.getMillis();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.withDurationAdded(readableDuration9, 1439);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        int int16 = dateTime14.getDayOfMonth();
        org.joda.time.DateTime dateTime18 = dateTime14.withYearOfEra(1);
        org.joda.time.DateTime.Property property19 = dateTime18.monthOfYear();
        org.joda.time.DateTime.Property property20 = dateTime18.millisOfSecond();
        org.joda.time.DateTime dateTime23 = dateTime18.withDurationAdded((long) (byte) 0, 10);
        boolean boolean24 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.LocalTime localTime25 = dateTime23.toLocalTime();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(localTime25);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withPeriodAdded(readablePeriod29, (int) (byte) 0);
        org.joda.time.DateTime dateTime33 = dateTime31.plusYears((int) (byte) 0);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 1, chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.minuteOfDay();
        java.lang.String str38 = property37.getAsText();
        org.joda.time.DateTime dateTime39 = property37.roundHalfEvenCopy();
        int int40 = property37.get();
        java.util.Locale locale41 = null;
        int int42 = property37.getMaximumTextLength(locale41);
        int int43 = property37.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property37.getFieldType();
        org.joda.time.DateTime dateTime46 = dateTime31.withField(dateTimeFieldType44, (int) (short) 1);
        org.joda.time.DateTime dateTime48 = dateTime46.plusMonths(292278993);
        org.joda.time.DateTime dateTime49 = dateTime46.toDateTime();
        org.joda.time.DateTime dateTime51 = dateTime49.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.minus(readablePeriod52);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis(1970);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime.Property property9 = dateTime7.dayOfYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        org.joda.time.DateTime dateTime15 = dateTime12.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime12.toMutableDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime12.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime22.toMutableDateTime();
        int int24 = dateTime22.getDayOfMonth();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.toDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime22.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime28.getZone();
        org.joda.time.DateTime dateTime30 = dateTime19.toDateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime7.toMutableDateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 53, dateTimeZone29);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime2.withSecondOfMinute((int) (short) 1);
        java.util.Locale locale9 = null;
        java.util.Calendar calendar10 = dateTime2.toCalendar(locale9);
        org.joda.time.DateTime dateTime12 = dateTime2.minusMonths((int) (short) 0);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMillis((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withPeriodAdded(readablePeriod15, 12);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.withDayOfYear(20);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.minus(readablePeriod12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusWeeks(453);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.getDateTime();
        java.lang.String str12 = property3.toString();
        org.joda.time.DateTime dateTime14 = property3.setCopy(300);
        org.joda.time.DateTime dateTime15 = property3.withMaximumValue();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.minus(readablePeriod16);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[minuteOfDay]" + "'", str12, "Property[minuteOfDay]");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime.Property property7 = dateTime6.monthOfYear();
        org.joda.time.DateTime.Property property8 = dateTime6.millisOfSecond();
        java.util.Locale locale9 = null;
        int int10 = property8.getMaximumShortTextLength(locale9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.toDateTime(chronology14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withDurationAdded(readableDuration16, 100);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.withZone(dateTimeZone19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.plus(readableDuration21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.minuteOfDay();
        java.lang.String str27 = property26.getAsText();
        org.joda.time.DateTime dateTime28 = property26.roundHalfEvenCopy();
        int int29 = dateTime22.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        int int34 = dateTime32.getDayOfMonth();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = dateTime32.toDateTime(chronology35);
        org.joda.time.DateTime dateTime38 = dateTime32.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTime38.getZone();
        org.joda.time.DateTime dateTime40 = dateTime28.toDateTime(dateTimeZone39);
        boolean boolean41 = dateTime40.isEqualNow();
        boolean boolean42 = property8.equals((java.lang.Object) dateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime7 = property3.setCopy((int) (byte) 10);
        java.lang.String str8 = property3.getAsShortText();
        boolean boolean9 = property3.isLeap();
        int int10 = property3.getMaximumValueOverall();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.minuteOfDay();
        java.lang.String str15 = property14.getAsText();
        org.joda.time.DateTime dateTime16 = property14.withMaximumValue();
        org.joda.time.DateTime dateTime18 = property14.setCopy((int) (byte) 10);
        java.lang.String str19 = property14.getAsShortText();
        org.joda.time.DateTime dateTime20 = property14.roundFloorCopy();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((-18591L));
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, chronology31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 1, chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime35.minus(readableDuration37);
        int int39 = dateTime32.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.DateTime dateTime42 = dateTime35.withPeriodAdded(readablePeriod40, 1439);
        org.joda.time.Chronology chronology43 = dateTime35.getChronology();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) ' ', chronology43);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (byte) 1, chronology46);
        org.joda.time.DateTime dateTime48 = dateTime47.toDateTimeISO();
        org.joda.time.Chronology chronology49 = dateTime48.getChronology();
        org.joda.time.DateTime dateTime50 = dateTime44.toDateTime(chronology49);
        org.joda.time.DateTime dateTime51 = dateTime28.toDateTime(chronology49);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(292278993, (int) (short) 10, 19, (int) (short) 1, (int) (short) 0, chronology49);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) 12, chronology49);
        org.joda.time.DateTime dateTime54 = dateTime20.withChronology(chronology49);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((java.lang.Object) int10, chronology49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1439 + "'", int10 == 1439);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime54);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.DateTime.Property property16 = dateTime15.weekyear();
        org.joda.time.DateTime.Property property17 = dateTime15.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime15.withDate((-18595), 240, 2040);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 240 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("346");
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readableDuration2);
        org.joda.time.DateTime.Property property4 = dateTime3.hourOfDay();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMonths(20);
        org.joda.time.DateTime dateTime12 = dateTime11.toDateTime();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(292278993, 60, (int) (byte) 1, 5, 5, 10, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 60 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        boolean boolean6 = dateTime5.isEqualNow();
        org.joda.time.DateTime.Property property7 = dateTime5.millisOfSecond();
        org.joda.time.DateTime dateTime9 = dateTime5.withYearOfEra((int) '#');
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Interval interval11 = property3.toInterval();
        java.lang.String str12 = property3.getAsShortText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = property3.setCopy("1969-12-31T23:59:58.030Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1969-12-31T23:59:58.030Z\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.minus(readableDuration13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) readableDuration13);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfSecond();
        long long17 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime19 = dateTime15.plusMonths((-1));
        org.joda.time.DateTime.Property property20 = dateTime15.millisOfSecond();
        org.joda.time.DateTime.Property property21 = dateTime15.dayOfYear();
        org.joda.time.DateTime dateTime22 = property21.roundFloorCopy();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-18591L) + "'", long17 == (-18591L));
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime11.plus(readableDuration29);
        org.joda.time.DateTime dateTime32 = dateTime11.plusYears((int) (byte) 1);
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfEra();
        org.joda.time.DateTime dateTime35 = dateTime32.minusMinutes(86399);
        org.joda.time.DateTime dateTime37 = dateTime35.plusMonths(86398);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime41 = dateTime37.withDate((-18591), 86398, 154);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86398 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        boolean boolean9 = property8.isLeap();
        org.joda.time.DateTime dateTime11 = property8.addToCopy(365);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        java.lang.Object obj16 = null;
        boolean boolean17 = property15.equals(obj16);
        org.joda.time.DateTime dateTime18 = property15.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) dateTime18);
        int int20 = dateTime18.getMinuteOfDay();
        org.joda.time.DateTime dateTime22 = dateTime18.minusYears((int) (short) -1);
        int int23 = property8.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime25 = property8.addWrapFieldToCopy(20);
        org.joda.time.DateTime dateTime27 = dateTime25.plusSeconds(1439);
        org.joda.time.DateTime dateTime29 = dateTime27.withMillis((long) (-1));
        org.joda.time.DateTime.Property property30 = dateTime29.hourOfDay();
        org.joda.time.DateTime dateTime32 = dateTime29.plusYears(70);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        int int15 = dateTime13.getDayOfMonth();
        long long16 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime13);
        int int17 = property9.get();
        org.joda.time.Interval interval18 = property9.toInterval();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.toDateTime(chronology22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withDurationAdded(readableDuration24, 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withZone(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = dateTime26.toLocalDateTime();
        int int30 = property9.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTime dateTime31 = dateTime5.withFields((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateMidnight dateMidnight32 = dateTime5.toDateMidnight();
        java.lang.String str33 = dateMidnight32.toString();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str33, "1970-01-01T00:00:00.000Z");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.toDateTime(chronology4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.withDurationAdded(readableDuration6, 100);
        int int9 = dateTime3.getDayOfMonth();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTimeISO();
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime3.toMutableDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 2922789, chronology14);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.DateTime dateTime11 = dateTime2.plusMonths((int) (short) 0);
        int int12 = dateTime11.getCenturyOfEra();
        org.joda.time.DateTime dateTime14 = dateTime11.withYearOfEra(86398);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.minus(readableDuration19);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime20.toMutableDateTime();
        org.joda.time.DateTime.Property property22 = dateTime20.weekyear();
        org.joda.time.DurationField durationField23 = property22.getLeapDurationField();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime26.minus(readableDuration28);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime29.toMutableDateTime();
        org.joda.time.DateTime.Property property31 = dateTime29.weekyear();
        org.joda.time.DateTime dateTime33 = property31.addToCopy((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withDurationAdded(readableDuration34, 971);
        int int37 = property22.getDifference((org.joda.time.ReadableInstant) dateTime33);
        int int38 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime.Property property39 = dateTime33.yearOfEra();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(property39);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        int int14 = dateTime12.getDayOfMonth();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime12.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTime dateTime20 = dateTime9.toDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime24 = dateTime22.minusYears(1);
        org.joda.time.DateTime dateTime26 = dateTime22.withMillisOfDay(1968);
        org.joda.time.DateTime dateTime27 = dateTime22.toDateTimeISO();
        int int28 = dateTime22.getMillisOfSecond();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 474 + "'", int28 == 474);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.DateTime dateTime11 = dateTime2.plusMonths((int) (short) 0);
        int int12 = dateTime11.getCenturyOfEra();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.minuteOfDay();
        java.lang.String str17 = property16.getAsText();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime20.toMutableDateTime();
        int int22 = dateTime20.getDayOfMonth();
        long long23 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime24 = property16.withMinimumValue();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 1, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.toDateTime(chronology28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withDurationAdded(readableDuration30, 100);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.withZone(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime35 = dateTime34.toLocalDateTime();
        org.joda.time.DateTime dateTime36 = dateTime24.withFields((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 1, chronology38);
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime39.toMutableDateTime();
        org.joda.time.DateTime dateTime42 = dateTime39.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime39.toMutableDateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime39.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (byte) 1, chronology48);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime49.toMutableDateTime();
        int int51 = dateTime49.getDayOfMonth();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = dateTime49.toDateTime(chronology52);
        org.joda.time.DateTime dateTime55 = dateTime49.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone56 = dateTime55.getZone();
        org.joda.time.DateTime dateTime57 = dateTime46.toDateTime(dateTimeZone56);
        org.joda.time.DateTime dateTime58 = dateTime36.withZone(dateTimeZone56);
        boolean boolean59 = dateTime11.equals((java.lang.Object) dateTime58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.DateTime dateTime61 = dateTime58.plus(readablePeriod60);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (byte) 1, chronology63);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = dateTime64.toDateTime(chronology65);
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.DateTime dateTime69 = dateTime64.withDurationAdded(readableDuration67, 100);
        org.joda.time.DateTime dateTime72 = dateTime69.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.DateTime dateTime73 = dateTime69.withLaterOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration74 = null;
        org.joda.time.DateTime dateTime75 = dateTime69.minus(readableDuration74);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime((long) (byte) 1, chronology77);
        org.joda.time.DateTime dateTime79 = dateTime78.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology80 = dateTime78.getChronology();
        org.joda.time.DateTime dateTime81 = dateTime69.toDateTime(chronology80);
        org.joda.time.DateTime dateTime82 = dateTime58.toDateTime(chronology80);
        org.joda.time.DateTime dateTime84 = dateTime58.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime86 = dateTime58.minusMinutes(4319);
        org.joda.time.DateTime.Property property87 = dateTime86.dayOfWeek();
        org.joda.time.DateTime dateTime88 = property87.roundFloorCopy();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(chronology80);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertNotNull(dateTime88);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.DateTime dateTime11 = dateTime7.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate12 = dateTime11.toLocalDate();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) '4');
        org.joda.time.DateTime.Property property15 = dateTime11.yearOfEra();
        org.joda.time.DateTime dateTime17 = dateTime11.minusWeeks(1200);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime17.withDate(7, (int) ' ', 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 10);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        int int6 = property3.get();
        java.util.Locale locale7 = null;
        int int8 = property3.getMaximumTextLength(locale7);
        int int9 = property3.get();
        int int10 = property3.get();
        int int11 = property3.getMinimumValueOverall();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime14.plusMillis(1970);
        org.joda.time.DateTime.Property property19 = dateTime18.monthOfYear();
        boolean boolean20 = property3.equals((java.lang.Object) property19);
        org.joda.time.DateTime dateTime22 = property3.addWrapFieldToCopy(35);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.DateTime dateTime30 = dateTime28.plus(86340001L);
        org.joda.time.DateTime dateTime32 = dateTime28.minus(0L);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 1, chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime35.toMutableDateTime();
        org.joda.time.DateTime dateTime38 = dateTime35.withMillisOfSecond((int) '#');
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (byte) 1, chronology40);
        org.joda.time.DateTime.Property property42 = dateTime41.minuteOfDay();
        java.lang.String str43 = property42.getAsText();
        org.joda.time.DateTime dateTime44 = property42.roundHalfEvenCopy();
        int int45 = property42.get();
        java.util.Locale locale46 = null;
        int int47 = property42.getMaximumTextLength(locale46);
        int int48 = property42.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property42.getFieldType();
        org.joda.time.DateTime.Property property50 = dateTime35.property(dateTimeFieldType49);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (byte) 1, chronology52);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (byte) 1, chronology55);
        org.joda.time.DateTime.Property property57 = dateTime56.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.DateTime dateTime59 = dateTime56.minus(readableDuration58);
        int int60 = dateTime53.compareTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Chronology chronology61 = dateTime53.getChronology();
        org.joda.time.DateTime dateTime62 = dateTime35.toDateTime(chronology61);
        org.joda.time.DateTime dateTime63 = org.joda.time.DateTime.now(chronology61);
        org.joda.time.DateTime dateTime64 = dateTime32.withChronology(chronology61);
        org.joda.time.DateTime dateTime65 = dateTime64.withEarlierOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration66 = null;
        org.joda.time.DateTime dateTime67 = dateTime65.minus(readableDuration66);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0" + "'", str43, "0");
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime67);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        long long29 = dateTime28.getMillis();
        int int30 = dateTime28.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime28.getZone();
        java.util.Date date32 = dateTime28.toDate();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus((long) (short) -1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime15.toMutableDateTime();
        org.joda.time.DateTime dateTime18 = dateTime15.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime15.toMutableDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime15.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime25.toMutableDateTime();
        int int27 = dateTime25.getDayOfMonth();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.toDateTime(chronology28);
        org.joda.time.DateTime dateTime31 = dateTime25.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime31.getZone();
        org.joda.time.DateTime dateTime33 = dateTime22.toDateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(0L, dateTimeZone32);
        org.joda.time.DateTime dateTime36 = dateTime9.withZoneRetainFields(dateTimeZone32);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 1, chronology38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.toDateTime(chronology40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime44 = dateTime39.withDurationAdded(readableDuration42, 100);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.withZone(dateTimeZone45);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.DateTime dateTime48 = dateTime44.plus(readableDuration47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (byte) 1, chronology50);
        org.joda.time.DateTime.Property property52 = dateTime51.minuteOfDay();
        java.lang.String str53 = property52.getAsText();
        org.joda.time.DateTime dateTime54 = property52.roundHalfEvenCopy();
        int int55 = dateTime48.compareTo((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) 1, chronology57);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime58.toMutableDateTime();
        int int60 = dateTime58.getDayOfMonth();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = dateTime58.toDateTime(chronology61);
        org.joda.time.DateTime dateTime64 = dateTime58.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone65 = dateTime64.getZone();
        org.joda.time.DateTime dateTime66 = dateTime54.toDateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime36.toDateTime(dateTimeZone65);
        org.joda.time.LocalTime localTime69 = dateTime68.toLocalTime();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((long) (byte) 1, chronology71);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateTime dateTime74 = dateTime72.toDateTime(chronology73);
        org.joda.time.DateTime dateTime76 = dateTime72.plusMillis(1970);
        org.joda.time.TimeOfDay timeOfDay77 = dateTime72.toTimeOfDay();
        org.joda.time.DateTime dateTime78 = dateTime68.withFields((org.joda.time.ReadablePartial) timeOfDay77);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0" + "'", str53, "0");
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(timeOfDay77);
        org.junit.Assert.assertNotNull(dateTime78);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(0);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) dateTime11);
        org.joda.time.DateTime.Property property13 = dateTime11.secondOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = dateTime7.toString(dateTimeFormatter12);
        org.joda.time.DateTime.Property property14 = dateTime7.minuteOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTime(chronology18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime22 = dateTime17.withDurationAdded(readableDuration20, 100);
        org.joda.time.DateTime dateTime25 = dateTime22.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfMonth();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 1, chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime29.toMutableDateTime();
        org.joda.time.DateTime dateTime32 = dateTime29.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime29.toMutableDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime29.withCenturyOfEra(1439);
        org.joda.time.DateTime dateTime38 = dateTime29.plusMonths((int) (short) 0);
        java.lang.String str40 = dateTime38.toString("0");
        int int41 = dateTime25.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (byte) 1, chronology43);
        org.joda.time.DateTime.Property property45 = dateTime44.minuteOfDay();
        java.lang.String str46 = property45.getAsText();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (byte) 1, chronology48);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime49.toMutableDateTime();
        int int51 = dateTime49.getDayOfMonth();
        long long52 = property45.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime dateTime53 = property45.withMinimumValue();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (byte) 1, chronology55);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = dateTime56.toDateTime(chronology57);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.DateTime dateTime61 = dateTime56.withDurationAdded(readableDuration59, 100);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = dateTime61.withZone(dateTimeZone62);
        org.joda.time.LocalDateTime localDateTime64 = dateTime63.toLocalDateTime();
        org.joda.time.DateTime dateTime65 = dateTime53.withFields((org.joda.time.ReadablePartial) localDateTime64);
        int int66 = dateTime53.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime68 = dateTime53.withYear(4);
        org.joda.time.DateTime dateTime70 = dateTime53.withMillis((long) (byte) 10);
        long long71 = dateTime70.getMillis();
        int int72 = dateTime70.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone73 = dateTime70.getZone();
        org.joda.time.DateTime dateTime74 = dateTime25.toDateTime(dateTimeZone73);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((java.lang.Object) dateTime7, dateTimeZone73);
        org.joda.time.DateTime dateTime77 = dateTime75.withMillisOfDay(156);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str13, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0" + "'", str46, "0");
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 10L + "'", long71 == 10L);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime77);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        java.lang.String str16 = property15.getAsText();
        org.joda.time.DateTime dateTime17 = property15.roundHalfEvenCopy();
        int int18 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime21.toMutableDateTime();
        org.joda.time.DateTime dateTime24 = dateTime21.withMillisOfSecond((int) '#');
        boolean boolean25 = dateTime11.equals((java.lang.Object) dateTime24);
        org.joda.time.DateTime dateTime27 = dateTime24.withDayOfYear(4);
        int int28 = dateTime24.getSecondOfMinute();
        org.joda.time.DateTime dateTime33 = dateTime24.withTime(1, 1, 19, (int) (short) 100);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 1, chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime39 = dateTime36.minus(readableDuration38);
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime39.toMutableDateTime();
        org.joda.time.DateTime.Property property41 = dateTime39.weekyear();
        org.joda.time.DateTime dateTime43 = property41.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime44 = property41.getDateTime();
        org.joda.time.DateTime.Property property45 = dateTime44.centuryOfEra();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (byte) 1, chronology48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (byte) 1, chronology51);
        org.joda.time.DateTime.Property property53 = dateTime52.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime55 = dateTime52.minus(readableDuration54);
        int int56 = dateTime49.compareTo((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.DateTime dateTime59 = dateTime52.withPeriodAdded(readablePeriod57, 1439);
        org.joda.time.Chronology chronology60 = dateTime52.getChronology();
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) ' ', chronology60);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (byte) 1, chronology63);
        org.joda.time.DateTime dateTime65 = dateTime64.toDateTimeISO();
        org.joda.time.Chronology chronology66 = dateTime65.getChronology();
        org.joda.time.DateTime dateTime67 = dateTime61.toDateTime(chronology66);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) (byte) 1, chronology69);
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime70.toMutableDateTime();
        org.joda.time.DateTime dateTime73 = dateTime70.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.MutableDateTime mutableDateTime75 = dateTime70.toMutableDateTime(dateTimeZone74);
        org.joda.time.DateTime dateTime77 = dateTime70.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime((long) (byte) 1, chronology79);
        org.joda.time.MutableDateTime mutableDateTime81 = dateTime80.toMutableDateTime();
        int int82 = dateTime80.getDayOfMonth();
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.DateTime dateTime84 = dateTime80.toDateTime(chronology83);
        org.joda.time.DateTime dateTime86 = dateTime80.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone87 = dateTime86.getZone();
        org.joda.time.DateTime dateTime88 = dateTime77.toDateTime(dateTimeZone87);
        org.joda.time.DateTime dateTime89 = new org.joda.time.DateTime(dateTimeZone87);
        org.joda.time.DateTime dateTime90 = dateTime67.toDateTime(dateTimeZone87);
        org.joda.time.DateTime dateTime91 = org.joda.time.DateTime.now(dateTimeZone87);
        org.joda.time.DateTime dateTime92 = org.joda.time.DateTime.now(dateTimeZone87);
        org.joda.time.MutableDateTime mutableDateTime93 = dateTime44.toMutableDateTime(dateTimeZone87);
        org.joda.time.DateTime dateTime94 = dateTime24.withZoneRetainFields(dateTimeZone87);
        org.joda.time.DateTime.Property property95 = dateTime94.secondOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(mutableDateTime71);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(mutableDateTime75);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(mutableDateTime81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertNotNull(dateTimeZone87);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertNotNull(dateTime90);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertNotNull(dateTime92);
        org.junit.Assert.assertNotNull(mutableDateTime93);
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertNotNull(property95);
    }
}
