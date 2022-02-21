import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        java.util.GregorianCalendar gregorianCalendar3 = new java.util.GregorianCalendar(5, (int) (short) -1, (int) 'a');
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar3.toZonedDateTime();
        int int5 = gregorianCalendar3.getWeeksInWeekYear();
        java.util.GregorianCalendar gregorianCalendar9 = new java.util.GregorianCalendar(5, (int) (short) -1, (int) 'a');
        java.time.ZonedDateTime zonedDateTime10 = gregorianCalendar9.toZonedDateTime();
        int int11 = gregorianCalendar9.getWeeksInWeekYear();
        java.util.GregorianCalendar gregorianCalendar15 = new java.util.GregorianCalendar(5, (int) (short) -1, (int) 'a');
        java.time.ZonedDateTime zonedDateTime16 = gregorianCalendar15.toZonedDateTime();
        int int17 = zonedDateTime16.getDayOfMonth();
        java.util.GregorianCalendar gregorianCalendar21 = new java.util.GregorianCalendar(5, (int) (short) -1, (int) 'a');
        java.time.ZonedDateTime zonedDateTime22 = gregorianCalendar21.toZonedDateTime();
        java.util.GregorianCalendar gregorianCalendar26 = new java.util.GregorianCalendar(5, (int) (short) -1, (int) 'a');
        java.time.ZonedDateTime zonedDateTime27 = gregorianCalendar26.toZonedDateTime();
        int int28 = zonedDateTime22.compareTo((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime27);
        java.time.format.FormatStyle formatStyle29 = java.time.format.FormatStyle.MEDIUM;
        java.time.format.FormatStyle formatStyle30 = java.time.format.FormatStyle.MEDIUM;
        java.time.format.DateTimeFormatter dateTimeFormatter31 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle29, formatStyle30);
        java.time.format.FormatStyle formatStyle32 = java.time.format.FormatStyle.MEDIUM;
        java.time.format.FormatStyle formatStyle33 = java.time.format.FormatStyle.MEDIUM;
        java.time.format.DateTimeFormatter dateTimeFormatter34 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle32, formatStyle33);
        java.time.format.DateTimeFormatter dateTimeFormatter35 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle29, formatStyle32);
        java.lang.String str36 = zonedDateTime27.format(dateTimeFormatter35);
        java.time.ZoneOffset zoneOffset37 = zonedDateTime27.getOffset();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime38 = zonedDateTime16.withZoneSameInstant((java.time.ZoneId) zoneOffset37);
        java.lang.String str39 = zoneOffset37.toString();
        java.util.TimeZone timeZone40 = java.util.TimeZone.getTimeZone((java.time.ZoneId) zoneOffset37);
        gregorianCalendar9.setTimeZone(timeZone40);
        gregorianCalendar3.setTimeZone(timeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar9 and gregorianCalendar15", (gregorianCalendar9.compareTo(gregorianCalendar15) == 0) == gregorianCalendar9.equals(gregorianCalendar15));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        java.util.GregorianCalendar gregorianCalendar3 = new java.util.GregorianCalendar(5, (int) (short) -1, (int) 'a');
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar3.toZonedDateTime();
        int int5 = gregorianCalendar3.getWeeksInWeekYear();
        java.util.GregorianCalendar gregorianCalendar9 = new java.util.GregorianCalendar(5, (int) (short) -1, (int) 'a');
        java.time.ZonedDateTime zonedDateTime10 = gregorianCalendar9.toZonedDateTime();
        int int11 = zonedDateTime10.getDayOfMonth();
        java.util.GregorianCalendar gregorianCalendar15 = new java.util.GregorianCalendar(5, (int) (short) -1, (int) 'a');
        java.time.ZonedDateTime zonedDateTime16 = gregorianCalendar15.toZonedDateTime();
        java.util.GregorianCalendar gregorianCalendar20 = new java.util.GregorianCalendar(5, (int) (short) -1, (int) 'a');
        java.time.ZonedDateTime zonedDateTime21 = gregorianCalendar20.toZonedDateTime();
        int int22 = zonedDateTime16.compareTo((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime21);
        java.time.format.FormatStyle formatStyle23 = java.time.format.FormatStyle.MEDIUM;
        java.time.format.FormatStyle formatStyle24 = java.time.format.FormatStyle.MEDIUM;
        java.time.format.DateTimeFormatter dateTimeFormatter25 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle23, formatStyle24);
        java.time.format.FormatStyle formatStyle26 = java.time.format.FormatStyle.MEDIUM;
        java.time.format.FormatStyle formatStyle27 = java.time.format.FormatStyle.MEDIUM;
        java.time.format.DateTimeFormatter dateTimeFormatter28 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle26, formatStyle27);
        java.time.format.DateTimeFormatter dateTimeFormatter29 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle23, formatStyle26);
        java.lang.String str30 = zonedDateTime21.format(dateTimeFormatter29);
        java.time.ZoneOffset zoneOffset31 = zonedDateTime21.getOffset();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime32 = zonedDateTime10.withZoneSameInstant((java.time.ZoneId) zoneOffset31);
        java.lang.String str33 = zoneOffset31.toString();
        java.util.TimeZone timeZone34 = java.util.TimeZone.getTimeZone((java.time.ZoneId) zoneOffset31);
        gregorianCalendar3.setTimeZone(timeZone34);
        int int36 = timeZone34.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar3 and gregorianCalendar9", (gregorianCalendar3.compareTo(gregorianCalendar9) == 0) == gregorianCalendar3.equals(gregorianCalendar9));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        java.util.GregorianCalendar gregorianCalendar3 = new java.util.GregorianCalendar(5, (int) (short) -1, (int) 'a');
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar3.toZonedDateTime();
        int int5 = gregorianCalendar3.getWeeksInWeekYear();
        java.util.GregorianCalendar gregorianCalendar9 = new java.util.GregorianCalendar(5, (int) (short) -1, (int) 'a');
        java.time.ZonedDateTime zonedDateTime10 = gregorianCalendar9.toZonedDateTime();
        int int11 = zonedDateTime10.getDayOfMonth();
        java.util.GregorianCalendar gregorianCalendar15 = new java.util.GregorianCalendar(5, (int) (short) -1, (int) 'a');
        java.time.ZonedDateTime zonedDateTime16 = gregorianCalendar15.toZonedDateTime();
        java.util.GregorianCalendar gregorianCalendar20 = new java.util.GregorianCalendar(5, (int) (short) -1, (int) 'a');
        java.time.ZonedDateTime zonedDateTime21 = gregorianCalendar20.toZonedDateTime();
        int int22 = zonedDateTime16.compareTo((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime21);
        java.time.format.FormatStyle formatStyle23 = java.time.format.FormatStyle.MEDIUM;
        java.time.format.FormatStyle formatStyle24 = java.time.format.FormatStyle.MEDIUM;
        java.time.format.DateTimeFormatter dateTimeFormatter25 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle23, formatStyle24);
        java.time.format.FormatStyle formatStyle26 = java.time.format.FormatStyle.MEDIUM;
        java.time.format.FormatStyle formatStyle27 = java.time.format.FormatStyle.MEDIUM;
        java.time.format.DateTimeFormatter dateTimeFormatter28 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle26, formatStyle27);
        java.time.format.DateTimeFormatter dateTimeFormatter29 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle23, formatStyle26);
        java.lang.String str30 = zonedDateTime21.format(dateTimeFormatter29);
        java.time.ZoneOffset zoneOffset31 = zonedDateTime21.getOffset();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime32 = zonedDateTime10.withZoneSameInstant((java.time.ZoneId) zoneOffset31);
        java.lang.String str33 = zoneOffset31.toString();
        java.util.TimeZone timeZone34 = java.util.TimeZone.getTimeZone((java.time.ZoneId) zoneOffset31);
        gregorianCalendar3.setTimeZone(timeZone34);
        java.util.GregorianCalendar gregorianCalendar39 = new java.util.GregorianCalendar(5, (int) (short) -1, (int) 'a');
        gregorianCalendar39.setTimeInMillis((long) 3);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone43 = dateTimeZone42.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        gregorianCalendar39.setTimeZone(timeZone43);
        java.time.ZoneId zoneId46 = timeZone43.toZoneId();
        boolean boolean47 = timeZone34.hasSameRules(timeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar3 and gregorianCalendar9", (gregorianCalendar3.compareTo(gregorianCalendar9) == 0) == gregorianCalendar3.equals(gregorianCalendar9));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        java.util.GregorianCalendar gregorianCalendar3 = new java.util.GregorianCalendar(5, (int) (short) -1, (int) 'a');
        java.time.ZonedDateTime zonedDateTime4 = gregorianCalendar3.toZonedDateTime();
        int int5 = gregorianCalendar3.getWeeksInWeekYear();
        java.util.GregorianCalendar gregorianCalendar9 = new java.util.GregorianCalendar(5, (int) (short) -1, (int) 'a');
        java.time.ZonedDateTime zonedDateTime10 = gregorianCalendar9.toZonedDateTime();
        int int11 = zonedDateTime10.getDayOfMonth();
        java.util.GregorianCalendar gregorianCalendar15 = new java.util.GregorianCalendar(5, (int) (short) -1, (int) 'a');
        java.time.ZonedDateTime zonedDateTime16 = gregorianCalendar15.toZonedDateTime();
        java.util.GregorianCalendar gregorianCalendar20 = new java.util.GregorianCalendar(5, (int) (short) -1, (int) 'a');
        java.time.ZonedDateTime zonedDateTime21 = gregorianCalendar20.toZonedDateTime();
        int int22 = zonedDateTime16.compareTo((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime21);
        java.time.format.FormatStyle formatStyle23 = java.time.format.FormatStyle.MEDIUM;
        java.time.format.FormatStyle formatStyle24 = java.time.format.FormatStyle.MEDIUM;
        java.time.format.DateTimeFormatter dateTimeFormatter25 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle23, formatStyle24);
        java.time.format.FormatStyle formatStyle26 = java.time.format.FormatStyle.MEDIUM;
        java.time.format.FormatStyle formatStyle27 = java.time.format.FormatStyle.MEDIUM;
        java.time.format.DateTimeFormatter dateTimeFormatter28 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle26, formatStyle27);
        java.time.format.DateTimeFormatter dateTimeFormatter29 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle23, formatStyle26);
        java.lang.String str30 = zonedDateTime21.format(dateTimeFormatter29);
        java.time.ZoneOffset zoneOffset31 = zonedDateTime21.getOffset();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime32 = zonedDateTime10.withZoneSameInstant((java.time.ZoneId) zoneOffset31);
        java.lang.String str33 = zoneOffset31.toString();
        java.util.TimeZone timeZone34 = java.util.TimeZone.getTimeZone((java.time.ZoneId) zoneOffset31);
        gregorianCalendar3.setTimeZone(timeZone34);
        int int37 = timeZone34.getOffset((long) 34509205);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar3 and gregorianCalendar9", (gregorianCalendar3.compareTo(gregorianCalendar9) == 0) == gregorianCalendar3.equals(gregorianCalendar9));
    }
}

