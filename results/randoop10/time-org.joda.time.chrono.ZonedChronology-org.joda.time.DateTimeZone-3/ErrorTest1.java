import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfDay();
        org.joda.time.DurationField durationField7 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.centuryOfEra();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeZone dateTimeZone10 = chronology5.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.plusDays(39);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology19.getZone();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 39236995, dateTimeZone21);
        org.joda.time.chrono.ZonedChronology zonedChronology23 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone21);
        org.joda.time.DurationField durationField24 = zonedChronology23.millis();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology23.era();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology23.millisOfSecond();
        org.joda.time.DurationField durationField28 = zonedChronology23.minutes();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology23.weekyear();
        org.joda.time.Chronology chronology30 = zonedChronology23.withUTC();
        org.joda.time.DurationField durationField31 = chronology30.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField7, and durationField20", !(durationField31.compareTo(durationField7) == 0) || (Math.signum(durationField31.compareTo(durationField20)) == Math.signum(durationField7.compareTo(durationField20))));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 100, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.plusDays(39);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DurationField durationField8 = chronology6.years();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.centuryOfEra();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeZone dateTimeZone11 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 100, dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.plusDays(39);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.centuries();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology20.getZone();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 39236995, dateTimeZone22);
        org.joda.time.chrono.ZonedChronology zonedChronology24 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone22);
        org.joda.time.DurationField durationField25 = zonedChronology24.hours();
        org.joda.time.DateTimeZone dateTimeZone26 = zonedChronology24.getZone();
        org.joda.time.DurationField durationField27 = zonedChronology24.hours();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology24.year();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology24.millisOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology24.seconds();
        org.joda.time.DurationField durationField31 = durationFieldType0.getField((org.joda.time.Chronology) zonedChronology24);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 100, dateTimeZone33);
        org.joda.time.LocalDate localDate36 = localDate34.plusDays(39);
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.minuteOfDay();
        org.joda.time.DurationField durationField39 = chronology37.years();
        org.joda.time.DateTimeField dateTimeField40 = chronology37.centuryOfEra();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(chronology37);
        org.joda.time.DateTimeZone dateTimeZone42 = chronology37.getZone();
        org.joda.time.DateTimeField dateTimeField43 = chronology37.monthOfYear();
        org.joda.time.DateTimeField dateTimeField44 = chronology37.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) 100, dateTimeZone47);
        org.joda.time.LocalDate localDate50 = localDate48.plusDays(39);
        org.joda.time.Chronology chronology51 = localDate50.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.centuries();
        org.joda.time.DateTimeZone dateTimeZone53 = chronology51.getZone();
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) 39236995, dateTimeZone53);
        org.joda.time.chrono.ZonedChronology zonedChronology55 = org.joda.time.chrono.ZonedChronology.getInstance(chronology37, dateTimeZone53);
        org.joda.time.DurationField durationField56 = zonedChronology55.hours();
        org.joda.time.DateTimeZone dateTimeZone57 = zonedChronology55.getZone();
        org.joda.time.DurationField durationField58 = zonedChronology55.hours();
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology55.year();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology55.millisOfDay();
        org.joda.time.DateTimeField dateTimeField61 = zonedChronology55.hourOfHalfday();
        org.joda.time.Chronology chronology62 = zonedChronology55.withUTC();
        org.joda.time.DateTimeField dateTimeField63 = zonedChronology55.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology55.centuryOfEra();
        org.joda.time.DurationField durationField65 = durationFieldType0.getField((org.joda.time.Chronology) zonedChronology55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField25 and durationField56", (durationField25.compareTo(durationField56) == 0) == durationField25.equals(durationField56));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfDay();
        org.joda.time.DurationField durationField7 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.centuryOfEra();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeZone dateTimeZone10 = chronology5.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.plusDays(39);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology19.getZone();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 39236995, dateTimeZone21);
        org.joda.time.chrono.ZonedChronology zonedChronology23 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone21);
        org.joda.time.DurationField durationField24 = zonedChronology23.millis();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology23.era();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology23.weekyear();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology23.centuryOfEra();
        org.joda.time.DurationField durationField29 = zonedChronology23.hours();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 100, dateTimeZone31);
        org.joda.time.LocalDate localDate34 = localDate32.plusDays(39);
        int int35 = localDate32.size();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 100, dateTimeZone37);
        org.joda.time.LocalDate localDate40 = localDate38.plusDays(39);
        org.joda.time.Chronology chronology41 = localDate40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.dayOfWeek();
        org.joda.time.DurationField durationField43 = chronology41.weekyears();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology41.getZone();
        org.joda.time.DateMidnight dateMidnight45 = localDate32.toDateMidnight(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) 100, dateTimeZone47);
        boolean boolean49 = dateTimeZone47.isFixed();
        int int51 = dateTimeZone47.getStandardOffset((long) 11);
        java.lang.String str52 = dateTimeZone47.toString();
        org.joda.time.DateTime dateTime53 = localDate32.toDateTimeAtMidnight(dateTimeZone47);
        java.util.Date date54 = localDate32.toDate();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((long) 100, dateTimeZone56);
        org.joda.time.LocalDate localDate59 = localDate57.plusDays(39);
        org.joda.time.Chronology chronology60 = localDate59.getChronology();
        org.joda.time.LocalDate.Property property61 = localDate59.era();
        java.util.Date date62 = localDate59.toDate();
        org.joda.time.LocalDate localDate64 = localDate59.withCenturyOfEra((int) ' ');
        java.util.Date date65 = localDate59.toDate();
        int int66 = localDate59.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalDate localDate69 = localDate59.withPeriodAdded(readablePeriod67, 1);
        int[] intArray70 = localDate59.getValues();
        zonedChronology23.validate((org.joda.time.ReadablePartial) localDate32, intArray70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField43", (durationField7.compareTo(durationField43) == 0) == durationField7.equals(durationField43));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfDay();
        org.joda.time.DurationField durationField7 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.centuryOfEra();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeZone dateTimeZone10 = chronology5.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.plusDays(39);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology19.getZone();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 39236995, dateTimeZone21);
        org.joda.time.chrono.ZonedChronology zonedChronology23 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone21);
        org.joda.time.DurationField durationField24 = zonedChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology23.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology23.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = zonedChronology23.getZone();
        org.joda.time.DurationField durationField28 = zonedChronology23.minutes();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology23.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology23.weekyearOfCentury();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.Instant instant34 = dateTime33.toInstant();
        org.joda.time.Chronology chronology35 = dateTime33.getChronology();
        boolean boolean36 = dateTime32.isEqual((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime.Property property37 = dateTime32.weekyear();
        java.util.Locale locale41 = new java.util.Locale("", "days", "java.util.GregorianCalendar[time=9,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=9,ZONE_OFFSET=0,DST_OFFSET=0]");
        int int42 = property37.getMaximumShortTextLength(locale41);
        org.joda.time.tz.NameProvider nameProvider43 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale46 = new java.util.Locale("+00:00", "");
        java.lang.String str49 = nameProvider43.getName(locale46, "hi!", "zh-TW");
        org.joda.time.tz.NameProvider nameProvider50 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale53 = new java.util.Locale("+00:00", "");
        java.lang.String str56 = nameProvider50.getName(locale53, "hi!", "zh-TW");
        java.lang.String str59 = nameProvider43.getShortName(locale53, "Coordinated Universal Time", "14:53:47.032");
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((long) 100, dateTimeZone62);
        org.joda.time.LocalDate.Property property64 = localDate63.weekyear();
        org.joda.time.Chronology chronology65 = localDate63.getChronology();
        org.joda.time.DurationField durationField66 = durationFieldType60.getField(chronology65);
        org.joda.time.DateTimeField dateTimeField67 = chronology65.dayOfMonth();
        java.lang.String str68 = dateTimeField67.toString();
        java.util.Locale locale70 = java.util.Locale.GERMAN;
        java.lang.String str71 = dateTimeField67.getAsText(2022, locale70);
        java.lang.String str74 = nameProvider43.getName(locale70, "", "und");
        java.lang.String str75 = locale41.getDisplayVariant(locale70);
        java.lang.String str76 = dateTimeField30.getAsShortText(2105969713297446L, locale41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField28 and durationField66", (durationField28.compareTo(durationField66) == 0) == durationField28.equals(durationField66));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 100, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.plusDays(39);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DurationField durationField8 = chronology6.years();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.centuryOfEra();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeZone dateTimeZone11 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 100, dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.plusDays(39);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.centuries();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology20.getZone();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 39236995, dateTimeZone22);
        org.joda.time.chrono.ZonedChronology zonedChronology24 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone22);
        org.joda.time.DurationField durationField25 = zonedChronology24.millis();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 53771363, (org.joda.time.Chronology) zonedChronology24);
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology24.millisOfDay();
        org.joda.time.DurationField durationField28 = zonedChronology24.centuries();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology24.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField28", (durationField21.compareTo(durationField28) == 0) == durationField21.equals(durationField28));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfDay();
        org.joda.time.DurationField durationField7 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.centuryOfEra();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeZone dateTimeZone10 = chronology5.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.plusDays(39);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology19.getZone();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 39236995, dateTimeZone21);
        org.joda.time.chrono.ZonedChronology zonedChronology23 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone21);
        org.joda.time.DurationField durationField24 = zonedChronology23.hours();
        org.joda.time.DateTimeZone dateTimeZone25 = zonedChronology23.getZone();
        org.joda.time.DurationField durationField26 = zonedChronology23.millis();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology23.weekyearOfCentury();
        org.joda.time.Chronology chronology28 = zonedChronology23.withUTC();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology23.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology23.dayOfWeek();
        org.joda.time.DurationField durationField31 = zonedChronology23.days();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime34 = dateTime32.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int36 = dateTime34.get(dateTimeFieldType35);
        org.joda.time.DateTime dateTime38 = dateTime34.minusMillis((int) '#');
        boolean boolean39 = dateTime34.isBeforeNow();
        org.joda.time.DateTime dateTime41 = dateTime34.plusMillis((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime44 = dateTime34.withDurationAdded(readableDuration42, 13);
        org.joda.time.DateTime dateTime46 = dateTime34.withWeekOfWeekyear(43);
        java.lang.String str48 = dateTime46.toString("days");
        org.joda.time.DateTimeZone dateTimeZone49 = dateTime46.getZone();
        org.joda.time.Chronology chronology50 = zonedChronology23.withZone(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology23.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) 100, dateTimeZone54);
        org.joda.time.LocalDate.Property property56 = localDate55.weekyear();
        org.joda.time.LocalDate localDate57 = property56.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = property56.getFieldType();
        org.joda.time.LocalDate localDate59 = property56.roundHalfFloorCopy();
        int int60 = localDate59.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((long) 100, dateTimeZone62);
        org.joda.time.LocalDate localDate65 = localDate63.plusDays(39);
        int int66 = localDate63.size();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate((long) 100, dateTimeZone68);
        org.joda.time.LocalDate localDate71 = localDate69.plusDays(39);
        org.joda.time.Chronology chronology72 = localDate71.getChronology();
        org.joda.time.DateTimeField dateTimeField73 = chronology72.dayOfWeek();
        org.joda.time.DurationField durationField74 = chronology72.weekyears();
        org.joda.time.DateTimeZone dateTimeZone75 = chronology72.getZone();
        org.joda.time.DateMidnight dateMidnight76 = localDate63.toDateMidnight(dateTimeZone75);
        int int78 = dateTimeZone75.getOffset(1645455371984L);
        org.joda.time.DateTime dateTime79 = localDate59.toDateTimeAtMidnight(dateTimeZone75);
        org.joda.time.chrono.ZonedChronology zonedChronology80 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology23, dateTimeZone75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField74", (durationField7.compareTo(durationField74) == 0) == durationField7.equals(durationField74));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfDay();
        org.joda.time.DurationField durationField7 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.centuryOfEra();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeZone dateTimeZone10 = chronology5.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.plusDays(39);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology19.getZone();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 39236995, dateTimeZone21);
        org.joda.time.chrono.ZonedChronology zonedChronology23 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone21);
        org.joda.time.DurationField durationField24 = zonedChronology23.hours();
        org.joda.time.DateTimeZone dateTimeZone25 = zonedChronology23.getZone();
        org.joda.time.DurationField durationField26 = zonedChronology23.hours();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology23.year();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology23.millisOfDay();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology23.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology23.weekyearOfCentury();
        org.joda.time.DurationField durationField31 = zonedChronology23.millis();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology23.clockhourOfHalfday();
        org.joda.time.DurationField durationField33 = zonedChronology23.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField7, and durationField20", !(durationField33.compareTo(durationField7) == 0) || (Math.signum(durationField33.compareTo(durationField20)) == Math.signum(durationField7.compareTo(durationField20))));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate.Property property6 = localDate4.era();
        java.util.Date date7 = localDate4.toDate();
        org.joda.time.LocalDate localDate9 = localDate4.withCenturyOfEra((int) ' ');
        java.util.Date date10 = localDate4.toDate();
        int int11 = localDate4.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate14 = localDate4.withPeriodAdded(readablePeriod12, 1);
        int[] intArray15 = localDate4.getValues();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int20 = dateTime18.get(dateTimeFieldType19);
        org.joda.time.DateTime dateTime22 = dateTime18.minusMillis((int) '#');
        boolean boolean23 = dateTime18.isBeforeNow();
        org.joda.time.DateTime dateTime25 = dateTime18.plusMillis((int) (short) 1);
        org.joda.time.DateTime.Property property26 = dateTime18.dayOfWeek();
        org.joda.time.DateTime dateTime27 = property26.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 100, dateTimeZone29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean32 = localDate30.isSupported(dateTimeFieldType31);
        org.joda.time.DateTimeField[] dateTimeFieldArray33 = localDate30.getFields();
        org.joda.time.LocalDate.Property property34 = localDate30.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 8);
        org.joda.time.DateTime dateTime38 = localDate30.toDateTimeAtMidnight(dateTimeZone37);
        boolean boolean39 = property26.equals((java.lang.Object) dateTimeZone37);
        long long41 = dateTimeZone37.nextTransition(53636904L);
        org.joda.time.DateMidnight dateMidnight42 = localDate4.toDateMidnight(dateTimeZone37);
        org.joda.time.DateTime dateTime43 = localDate4.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 100, dateTimeZone45);
        org.joda.time.LocalDate localDate48 = localDate46.plusDays(39);
        org.joda.time.Chronology chronology49 = localDate48.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.minuteOfDay();
        org.joda.time.DurationField durationField51 = chronology49.years();
        org.joda.time.DateTimeField dateTimeField52 = chronology49.centuryOfEra();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(chronology49);
        org.joda.time.DateTimeZone dateTimeZone54 = chronology49.getZone();
        org.joda.time.DateTimeField dateTimeField55 = chronology49.monthOfYear();
        org.joda.time.DateTimeField dateTimeField56 = chronology49.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) 100, dateTimeZone59);
        org.joda.time.LocalDate localDate62 = localDate60.plusDays(39);
        org.joda.time.Chronology chronology63 = localDate62.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.centuries();
        org.joda.time.DateTimeZone dateTimeZone65 = chronology63.getZone();
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate((long) 39236995, dateTimeZone65);
        org.joda.time.chrono.ZonedChronology zonedChronology67 = org.joda.time.chrono.ZonedChronology.getInstance(chronology49, dateTimeZone65);
        org.joda.time.DurationField durationField68 = zonedChronology67.hours();
        org.joda.time.DateTimeZone dateTimeZone69 = zonedChronology67.getZone();
        org.joda.time.DurationField durationField70 = zonedChronology67.hours();
        org.joda.time.DateTimeField dateTimeField71 = zonedChronology67.year();
        org.joda.time.DurationField durationField72 = zonedChronology67.months();
        org.joda.time.DateTimeField dateTimeField73 = zonedChronology67.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField74 = zonedChronology67.dayOfMonth();
        org.joda.time.DurationField durationField75 = zonedChronology67.minutes();
        org.joda.time.DateTimeField dateTimeField76 = zonedChronology67.weekyear();
        org.joda.time.DateTime dateTime77 = dateTime43.withChronology((org.joda.time.Chronology) zonedChronology67);
        org.joda.time.DateTime.Property property78 = dateTime77.minuteOfHour();
        org.joda.time.Interval interval79 = property78.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and dateTime77", (dateTime43.compareTo(dateTime77) == 0) == dateTime43.equals(dateTime77));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53628785);
        java.util.Locale locale7 = dateTimeFormatter6.getLocale();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(39);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.minuteOfDay();
        org.joda.time.DurationField durationField15 = chronology13.years();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField18 = chronology13.era();
        org.joda.time.DateTimeField dateTimeField19 = chronology13.hourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter6.withChronology(chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter20.withOffsetParsed();
        org.joda.time.Chronology chronology22 = dateTimeFormatter21.getChronolgy();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.Instant instant24 = dateTime23.toInstant();
        org.joda.time.Chronology chronology25 = dateTime23.getChronology();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime27 = dateTime23.plus(readablePeriod26);
        org.joda.time.Chronology chronology28 = dateTime23.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter21.withChronology(chronology28);
        org.joda.time.DurationField durationField30 = chronology28.centuries();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 100, dateTimeZone32);
        org.joda.time.LocalDate localDate35 = localDate33.plusDays(39);
        org.joda.time.Chronology chronology36 = localDate35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.dayOfWeek();
        org.joda.time.DurationField durationField38 = chronology36.weekyears();
        org.joda.time.DurationField durationField39 = chronology36.months();
        org.joda.time.DurationField durationField40 = chronology36.hours();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 100, dateTimeZone42);
        org.joda.time.LocalDate localDate45 = localDate43.plusDays(39);
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.centuries();
        org.joda.time.DateTimeZone dateTimeZone48 = chronology46.getZone();
        org.joda.time.chrono.ZonedChronology zonedChronology49 = org.joda.time.chrono.ZonedChronology.getInstance(chronology36, dateTimeZone48);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(dateTimeZone48);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone48);
        org.joda.time.Chronology chronology52 = chronology28.withZone(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField38", (durationField15.compareTo(durationField38) == 0) == durationField15.equals(durationField38));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfDay();
        org.joda.time.DurationField durationField7 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.centuryOfEra();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeZone dateTimeZone10 = chronology5.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.plusDays(39);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology19.getZone();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 39236995, dateTimeZone21);
        org.joda.time.chrono.ZonedChronology zonedChronology23 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone21);
        org.joda.time.DurationField durationField24 = zonedChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology23.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology23.millisOfDay();
        org.joda.time.DurationField durationField27 = zonedChronology23.years();
        org.joda.time.DurationField durationField28 = zonedChronology23.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField27", (durationField7.compareTo(durationField27) == 0) == durationField7.equals(durationField27));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfDay();
        org.joda.time.DurationField durationField7 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.centuryOfEra();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeZone dateTimeZone10 = chronology5.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.plusDays(39);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology19.getZone();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 39236995, dateTimeZone21);
        org.joda.time.chrono.ZonedChronology zonedChronology23 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone21);
        org.joda.time.DurationField durationField24 = zonedChronology23.hours();
        org.joda.time.DateTimeZone dateTimeZone25 = zonedChronology23.getZone();
        org.joda.time.DurationField durationField26 = zonedChronology23.millis();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology23.weekyearOfCentury();
        org.joda.time.Chronology chronology28 = zonedChronology23.withUTC();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology23.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology23.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology23.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone32 = zonedChronology23.getZone();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology23.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology23.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology23.centuryOfEra();
        org.joda.time.DurationField durationField37 = zonedChronology23.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField7, and durationField20", !(durationField37.compareTo(durationField7) == 0) || (Math.signum(durationField37.compareTo(durationField20)) == Math.signum(durationField7.compareTo(durationField20))));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 100, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.plusDays(39);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DurationField durationField8 = chronology6.years();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.centuryOfEra();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeZone dateTimeZone11 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 100, dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.plusDays(39);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.centuries();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology20.getZone();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 39236995, dateTimeZone22);
        org.joda.time.chrono.ZonedChronology zonedChronology24 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone22);
        org.joda.time.DurationField durationField25 = zonedChronology24.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology24.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology24.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology24.yearOfCentury();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(151473369600010L, (org.joda.time.Chronology) zonedChronology24);
        org.joda.time.DurationField durationField30 = zonedChronology24.millis();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology24.secondOfMinute();
        org.joda.time.DurationField durationField32 = zonedChronology24.months();
        org.joda.time.DurationField durationField33 = zonedChronology24.weeks();
        org.joda.time.DurationField durationField34 = zonedChronology24.weekyears();
        org.joda.time.DurationField durationField35 = zonedChronology24.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField34", (durationField8.compareTo(durationField34) == 0) == durationField8.equals(durationField34));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfDay();
        org.joda.time.DurationField durationField7 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.centuryOfEra();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeZone dateTimeZone10 = chronology5.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.plusDays(39);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology19.getZone();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 39236995, dateTimeZone21);
        org.joda.time.chrono.ZonedChronology zonedChronology23 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone21);
        org.joda.time.DurationField durationField24 = zonedChronology23.millis();
        org.joda.time.DurationField durationField25 = zonedChronology23.hours();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology23.dayOfMonth();
        org.joda.time.DurationField durationField27 = zonedChronology23.hours();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology23.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology23.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology23.weekyearOfCentury();
        org.joda.time.DurationField durationField31 = zonedChronology23.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField7, and durationField20", !(durationField31.compareTo(durationField7) == 0) || (Math.signum(durationField31.compareTo(durationField20)) == Math.signum(durationField7.compareTo(durationField20))));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfDay();
        org.joda.time.DurationField durationField7 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.centuryOfEra();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeZone dateTimeZone10 = chronology5.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.plusDays(39);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology19.getZone();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 39236995, dateTimeZone21);
        org.joda.time.chrono.ZonedChronology zonedChronology23 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone21);
        org.joda.time.DurationField durationField24 = zonedChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology23.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology23.dayOfYear();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology23.minuteOfHour();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now((org.joda.time.Chronology) zonedChronology23);
        org.joda.time.DurationField durationField31 = zonedChronology23.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField7, and durationField20", !(durationField31.compareTo(durationField7) == 0) || (Math.signum(durationField31.compareTo(durationField20)) == Math.signum(durationField7.compareTo(durationField20))));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(39);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfDay();
        org.joda.time.DurationField durationField7 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.centuryOfEra();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeZone dateTimeZone10 = chronology5.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.plusDays(39);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology19.getZone();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 39236995, dateTimeZone21);
        org.joda.time.chrono.ZonedChronology zonedChronology23 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone21);
        org.joda.time.DurationField durationField24 = zonedChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology23.yearOfEra();
        org.joda.time.DurationField durationField26 = zonedChronology23.weeks();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology23.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology23.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology23.year();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology23.secondOfDay();
        org.joda.time.DurationField durationField32 = zonedChronology23.weekyears();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology23.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField32", (durationField7.compareTo(durationField32) == 0) == durationField7.equals(durationField32));
    }
}

