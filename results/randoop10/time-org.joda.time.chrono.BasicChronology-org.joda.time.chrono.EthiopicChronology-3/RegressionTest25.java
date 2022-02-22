import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25 {

    public static boolean debug = false;

    @Test
    public void test12501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12501");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.days();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.minutes();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str13 = dateTimeZone11.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(4286800429L, dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long18 = dateTimeZone16.convertUTCToLocal((long) (short) 1);
        long long20 = dateTimeZone11.getMillisKeepLocal(dateTimeZone16, 3490L);
        org.joda.time.Chronology chronology21 = ethiopicChronology1.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology1.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 11L + "'", long18 == 11L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3963L + "'", long20 == 3963L);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test12502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12502");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.clockhourOfDay();
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str11 = dateTimeField8.getAsText((long) 'a', locale10);
        java.lang.String str12 = dateTimeField4.getAsText((int) 'a', locale10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology14.clockhourOfDay();
        org.joda.time.DurationField durationField16 = ethiopicChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology14.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology19.clockhourOfDay();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str23 = dateTimeField20.getAsText((long) 'a', locale22);
        int int24 = dateTimeField17.getMaximumTextLength(locale22);
        java.lang.String str25 = locale10.getDisplayCountry(locale22);
        java.util.Locale.Builder builder26 = builder0.setLocale(locale22);
        java.util.Locale.Builder builder28 = builder26.setLanguage("Germany");
        java.util.Locale.Builder builder29 = builder28.clearExtensions();
        java.util.Locale.Builder builder30 = builder29.clear();
        java.util.Locale.Builder builder31 = builder30.clearExtensions();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology33 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology33.clockhourOfDay();
        org.joda.time.DurationField durationField35 = ethiopicChronology33.weekyears();
        org.joda.time.DurationField durationField36 = ethiopicChronology33.hours();
        int int37 = ethiopicChronology33.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField38 = ethiopicChronology33.centuries();
        org.joda.time.DateTimeField dateTimeField39 = ethiopicChronology33.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField40 = ethiopicChronology33.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology43 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology43.clockhourOfDay();
        org.joda.time.DurationField durationField45 = ethiopicChronology43.weekyears();
        org.joda.time.DurationField durationField46 = ethiopicChronology43.centuries();
        org.joda.time.DateTimeField dateTimeField47 = ethiopicChronology43.weekyear();
        int int48 = dateTimeField47.getMinimumValue();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(chronology49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime50.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime50.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(chronology57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.withMillisOfSecond((int) (byte) 1);
        int int63 = localDateTime50.compareTo((org.joda.time.ReadablePartial) localDateTime58);
        org.joda.time.LocalDateTime.Property property64 = localDateTime58.weekyear();
        org.joda.time.LocalDateTime.Property property65 = localDateTime58.millisOfDay();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(chronology66);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime67.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime67.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.DateTime dateTime75 = localDateTime73.toDateTime(readableInstant74);
        java.util.Locale locale76 = java.util.Locale.GERMANY;
        boolean boolean77 = locale76.hasExtensions();
        boolean boolean78 = dateTime75.equals((java.lang.Object) locale76);
        java.lang.String str79 = dateTimeField47.getAsShortText((org.joda.time.ReadablePartial) localDateTime58, locale76);
        java.util.Locale locale80 = java.util.Locale.GERMANY;
        java.lang.String str81 = locale80.getDisplayCountry();
        java.lang.String str82 = locale76.getDisplayVariant(locale80);
        java.lang.String str83 = locale80.toLanguageTag();
        java.lang.String str84 = dateTimeField40.getAsText(0L, locale80);
        java.util.Locale.Builder builder85 = builder31.setLocale(locale80);
        java.lang.String str86 = locale80.getDisplayLanguage();
        org.junit.Assert.assertNotNull(ethiopicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "24" + "'", str11, "24");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "97" + "'", str12, "97");
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(ethiopicChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "24" + "'", str23, "24");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(ethiopicChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(ethiopicChronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-292269338) + "'", int48 == (-292269338));
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "2022" + "'", str79, "2022");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Germania" + "'", str81, "Germania");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "de-DE" + "'", str83, "de-DE");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "17" + "'", str84, "17");
        org.junit.Assert.assertNotNull(builder85);
// flaky:         org.junit.Assert.assertEquals("'" + str86 + "' != '" + "tedesco" + "'", str86, "tedesco");
    }

    @Test
    public void test12503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12503");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        int int8 = localDateTime7.getMillisOfSecond();
        int int9 = localDateTime7.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusHours((int) (short) -1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime7.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.minusHours((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology16 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology16.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.Chronology chronology20 = ethiopicChronology16.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology16.millisOfSecond();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.weekyear();
        org.joda.time.LocalDateTime localDateTime32 = property30.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField33 = property30.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime34 = property30.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.weekOfWeekyear();
        int int36 = dateTimeField21.getMaximumValue((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime38.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.DateTime dateTime46 = localDateTime44.toDateTime(readableInstant45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime44.millisOfDay();
        org.joda.time.LocalDateTime localDateTime48 = property47.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.withMonthOfYear(3);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime52.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime56.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime56.minusDays(0);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(chronology63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime64.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime64.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property71 = localDateTime70.weekyear();
        org.joda.time.LocalDateTime localDateTime73 = property71.setCopy((int) (byte) 1);
        long long74 = property71.remainder();
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime(chronology75);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime76.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime76.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime76.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant83 = null;
        org.joda.time.DateTime dateTime84 = localDateTime82.toDateTime(readableInstant83);
        org.joda.time.LocalDateTime.Property property85 = localDateTime82.millisOfDay();
        int int86 = property71.compareTo((org.joda.time.ReadablePartial) localDateTime82);
        boolean boolean88 = property71.equals((java.lang.Object) 1055L);
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = property71.getFieldType();
        org.joda.time.LocalDateTime localDateTime91 = localDateTime62.withField(dateTimeFieldType89, 175);
        boolean boolean92 = localDateTime48.isSupported(dateTimeFieldType89);
        org.joda.time.LocalDateTime localDateTime94 = localDateTime34.withField(dateTimeFieldType89, 55);
        org.joda.time.LocalDateTime.Property property95 = localDateTime14.property(dateTimeFieldType89);
        org.joda.time.DateTimeFieldType dateTimeFieldType96 = property95.getFieldType();
        int int97 = property95.getMinimumValue();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 367 + "'", int8 == 367);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 367 + "'", int9 == 367);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(ethiopicChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 999 + "'", int36 == 999);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(localDateTime73);
// flaky:         org.junit.Assert.assertTrue("'" + long74 + "' != '" + 4287384367L + "'", long74 == 4287384367L);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(localDateTime82);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType89);
        org.junit.Assert.assertNotNull(localDateTime91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(localDateTime94);
        org.junit.Assert.assertNotNull(property95);
        org.junit.Assert.assertNotNull(dateTimeFieldType96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-292275054) + "'", int97 == (-292275054));
    }

    @Test
    public void test12504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12504");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekOfWeekyear();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withMillisOfSecond((int) (byte) 1);
        int int20 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime.Property property21 = localDateTime15.weekyear();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime15.minusMillis(2022);
        int[] intArray25 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime15, (long) '#');
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField28 = ethiopicChronology1.weeks();
        org.joda.time.DurationField durationField29 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology1.minuteOfHour();
        int int31 = dateTimeField30.getMinimumValue();
        boolean boolean33 = dateTimeField30.isLeap((long) 152);
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(intArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1962, 4, 23, 518]");
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test12505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12505");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.centuries();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = localDateTime8.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readablePeriod10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology13.clockhourOfDay();
        org.joda.time.DurationField durationField15 = ethiopicChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology13.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = ethiopicChronology13.getZone();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) ethiopicChronology13);
        org.joda.time.DurationField durationField19 = ethiopicChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology13.hourOfHalfday();
        org.joda.time.DurationField durationField21 = ethiopicChronology13.hours();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.lang.String str25 = dateTimeZone23.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone23);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.lang.String str30 = dateTimeZone28.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone28);
        boolean boolean32 = localDateTime26.isEqual((org.joda.time.ReadablePartial) localDateTime31);
        int[] intArray34 = ethiopicChronology13.get((org.joda.time.ReadablePartial) localDateTime31, (long) 30);
        ethiopicChronology1.validate((org.joda.time.ReadablePartial) localDateTime11, intArray34);
        int int36 = ethiopicChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField37 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField38 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField39 = ethiopicChronology1.year();
        org.joda.time.DurationField durationField40 = dateTimeField39.getLeapDurationField();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(ethiopicChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
// flaky:         org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
// flaky:         org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(intArray34);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1962, 4, 23, 513]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(durationField40);
    }

    @Test
    public void test12506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12506");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.dayOfMonth();
        java.util.Locale locale6 = new java.util.Locale("hi!", "hi!");
        java.lang.String str7 = dateTimeField2.getAsText((int) (byte) 10, locale6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.weekyear();
        org.joda.time.LocalDateTime localDateTime18 = property16.setCopy((int) (byte) 1);
        long long19 = property16.remainder();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime27.toDateTime(readableInstant28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.millisOfDay();
        int int31 = property16.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        boolean boolean33 = property16.equals((java.lang.Object) 1055L);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology35 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology35.clockhourOfDay();
        org.joda.time.DurationField durationField37 = ethiopicChronology35.weekyears();
        org.joda.time.DurationField durationField38 = ethiopicChronology35.hours();
        boolean boolean39 = property16.equals((java.lang.Object) ethiopicChronology35);
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("2022-02-14T14:46:42.333");
        java.lang.String str42 = locale41.toLanguageTag();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology44 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = ethiopicChronology44.hourOfDay();
        org.joda.time.DateTimeField dateTimeField46 = ethiopicChronology44.halfdayOfDay();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(chronology47);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray49 = localDateTime48.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property54 = localDateTime51.dayOfWeek();
        java.util.Locale locale55 = java.util.Locale.GERMANY;
        java.lang.String str56 = locale55.getScript();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology58 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone57);
        org.joda.time.DateTimeField dateTimeField59 = ethiopicChronology58.clockhourOfDay();
        java.util.Locale locale61 = java.util.Locale.ITALIAN;
        java.lang.String str62 = dateTimeField59.getAsText((long) 'a', locale61);
        java.lang.String str63 = locale55.getDisplayName(locale61);
        java.lang.String str64 = dateTimeField46.getAsText((org.joda.time.ReadablePartial) localDateTime51, locale61);
        java.lang.String str65 = locale41.getDisplayLanguage(locale61);
        java.lang.String str66 = property16.getAsText(locale61);
        java.lang.String str67 = locale6.getDisplayScript(locale61);
        java.util.Set<java.lang.String> strSet68 = locale6.getUnicodeLocaleAttributes();
        java.util.Spliterator<java.lang.String> strSpliterator69 = strSet68.spliterator();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!_HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4287384450L + "'", long19 == 4287384450L);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(ethiopicChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "und" + "'", str42, "und");
        org.junit.Assert.assertNotNull(ethiopicChronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(ethiopicChronology58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "it");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "24" + "'", str62, "24");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "tedesco (Germania)" + "'", str63, "tedesco (Germania)");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "0" + "'", str64, "0");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "2000" + "'", str66, "2000");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNotNull(strSpliterator69);
    }

    @Test
    public void test12507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12507");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.dayOfMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusWeeks((int) (byte) 10);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime10, locale11);
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream14 = strSet13.parallelStream();
        boolean boolean15 = strSet13.isEmpty();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.weekOfWeekyear();
        org.joda.time.field.AbstractReadableInstantFieldProperty[] abstractReadableInstantFieldPropertyArray21 = new org.joda.time.field.AbstractReadableInstantFieldProperty[] { property20 };
        org.joda.time.field.AbstractReadableInstantFieldProperty[] abstractReadableInstantFieldPropertyArray22 = strSet13.toArray(abstractReadableInstantFieldPropertyArray21);
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = locale23.getCountry();
        java.util.Set<java.lang.String> strSet25 = locale23.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet26 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet26.clear();
        java.lang.Object[] objArray28 = strSet26.toArray();
        boolean boolean29 = strSet25.addAll((java.util.Collection<java.lang.String>) strSet26);
        java.util.Set<java.lang.String> strSet30 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Set<java.lang.String> strSet31 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean32 = strSet30.addAll((java.util.Collection<java.lang.String>) strSet31);
        java.lang.Object[] objArray33 = strSet31.toArray();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology36 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology36.hourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = ethiopicChronology36.secondOfDay();
        org.joda.time.DateTimeField dateTimeField39 = ethiopicChronology36.secondOfDay();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology36);
        org.joda.time.DurationField durationField41 = ethiopicChronology36.eras();
        org.joda.time.DateTimeField dateTimeField42 = ethiopicChronology36.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField43 = ethiopicChronology36.hourOfHalfday();
        boolean boolean44 = strSet31.equals((java.lang.Object) dateTimeField43);
        boolean boolean45 = strSet25.removeAll((java.util.Collection<java.lang.String>) strSet31);
        boolean boolean46 = strSet13.addAll((java.util.Collection<java.lang.String>) strSet25);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.parse("JP");
        java.lang.String[] strArray54 = new java.lang.String[] { "10", "UTC", "10", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        java.util.Iterator<java.lang.String> strItor57 = strSet55.iterator();
        java.util.stream.Stream<java.lang.String> strStream58 = strSet55.parallelStream();
        java.lang.String str59 = java.util.Locale.lookupTag(languageRangeList48, (java.util.Collection<java.lang.String>) strSet55);
        boolean boolean60 = strSet13.retainAll((java.util.Collection<java.lang.String>) strSet55);
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2" + "'", str12, "2");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(abstractReadableInstantFieldPropertyArray21);
        org.junit.Assert.assertNotNull(abstractReadableInstantFieldPropertyArray22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "CA" + "'", str24, "CA");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(ethiopicChronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(languageRangeList48);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strItor57);
        org.junit.Assert.assertNotNull(strStream58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test12508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12508");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        java.lang.String str3 = dateTimeZone1.getName(4287340433L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+100:00" + "'", str3, "+100:00");
    }

    @Test
    public void test12509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12509");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.months();
        boolean boolean6 = durationField5.isSupported();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test12510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12510");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMinutes(541);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withDurationAdded(readableDuration7, 987);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test12511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12511");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.clockhourOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.clockhourOfDay();
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = dateTimeField13.getAsText((long) 'a', locale15);
        int int17 = dateTimeField10.getMaximumTextLength(locale15);
        int int19 = dateTimeField10.getMinimumValue((-3600001L));
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.centuryOfEra();
        java.lang.String str26 = localDateTime23.toString();
        java.util.Locale locale28 = java.util.Locale.ENGLISH;
        java.lang.String str29 = dateTimeField10.getAsShortText((org.joda.time.ReadablePartial) localDateTime23, (-292275054), locale28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime23.withDurationAdded(readableDuration30, 22);
        java.util.Date date33 = localDateTime23.toDate();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime23.withFields((org.joda.time.ReadablePartial) localDateTime41);
        java.util.Locale locale43 = java.util.Locale.GERMANY;
        java.lang.String str44 = locale43.getScript();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology46 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField47 = ethiopicChronology46.clockhourOfDay();
        java.util.Locale locale49 = java.util.Locale.ITALIAN;
        java.lang.String str50 = dateTimeField47.getAsText((long) 'a', locale49);
        java.lang.String str51 = locale43.getDisplayName(locale49);
        java.lang.String str52 = locale49.toLanguageTag();
        java.lang.String str53 = dateTimeField5.getAsText((org.joda.time.ReadablePartial) localDateTime41, locale49);
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "24" + "'", str16, "24");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2022-02-14T14:56:24.572" + "'", str26, "2022-02-14T14:56:24.572");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-292275054" + "'", str29, "-292275054");
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Mon Feb 14 14:56:24 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(ethiopicChronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "it");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "24" + "'", str50, "24");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "tedesco (Germania)" + "'", str51, "tedesco (Germania)");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "it" + "'", str52, "it");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1" + "'", str53, "1");
    }

    @Test
    public void test12512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12512");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = localDateTime1.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plus(readablePeriod3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime4.getFieldTypes();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = localDateTime4.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray6);
    }

    @Test
    public void test12513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12513");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekOfWeekyear();
        int int5 = localDateTime3.getYear();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime3.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime7.withCenturyOfEra(595);
        org.joda.time.LocalDateTime.Property property17 = localDateTime7.centuryOfEra();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.LocalDateTime localDateTime20 = property17.addToCopy(759);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test12514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12514");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.lang.String str9 = dateTimeField6.getAsText(100L, locale8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMillisOfSecond((int) (short) 0);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfWeek();
        org.joda.time.Chronology chronology25 = localDateTime23.getChronology();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology27 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology27.clockhourOfDay();
        org.joda.time.DurationField durationField29 = ethiopicChronology27.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology27.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = ethiopicChronology27.getZone();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) ethiopicChronology27);
        org.joda.time.DurationField durationField33 = ethiopicChronology27.weekyears();
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology27.hourOfHalfday();
        org.joda.time.DurationField durationField35 = ethiopicChronology27.hours();
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        java.lang.String str39 = dateTimeZone37.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone37);
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        java.lang.String str44 = dateTimeZone42.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone42);
        boolean boolean46 = localDateTime40.isEqual((org.joda.time.ReadablePartial) localDateTime45);
        int[] intArray48 = ethiopicChronology27.get((org.joda.time.ReadablePartial) localDateTime45, (long) 30);
        boolean boolean49 = localDateTime23.equals((java.lang.Object) intArray48);
        int int50 = dateTimeField6.getMaximumValue((org.joda.time.ReadablePartial) localDateTime17, intArray48);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long54 = dateTimeZone52.convertUTCToLocal((long) (short) 1);
        org.joda.time.DateTime dateTime55 = localDateTime17.toDateTime(dateTimeZone52);
        long long57 = dateTimeZone52.previousTransition(4286884298L);
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "62" + "'", str9, "62");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(ethiopicChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
// flaky:         org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(dateTimeZone42);
// flaky:         org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intArray48);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1962, 4, 23, 513]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 11L + "'", long54 == 11L);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 4286884298L + "'", long57 == 4286884298L);
    }

    @Test
    public void test12515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12515");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getScript();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology4 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology4.clockhourOfDay();
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str8 = dateTimeField5.getAsText((long) 'a', locale7);
        java.lang.String str9 = locale1.getDisplayName(locale7);
        java.lang.String str10 = locale7.getISO3Language();
        boolean boolean11 = locale7.hasExtensions();
        java.util.Locale locale12 = locale7.stripExtensions();
        java.util.Locale.setDefault(category0, locale12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology15.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology15.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology20 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology20.clockhourOfDay();
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        java.lang.String str24 = dateTimeField21.getAsText((long) 'a', locale23);
        java.lang.String str25 = dateTimeField17.getAsText((int) 'a', locale23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology27 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology27.clockhourOfDay();
        org.joda.time.DurationField durationField29 = ethiopicChronology27.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology27.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology32 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology32.clockhourOfDay();
        java.util.Locale locale35 = java.util.Locale.ITALIAN;
        java.lang.String str36 = dateTimeField33.getAsText((long) 'a', locale35);
        int int37 = dateTimeField30.getMaximumTextLength(locale35);
        java.lang.String str38 = locale23.getDisplayCountry(locale35);
        java.util.Locale.setDefault(category0, locale23);
        java.util.Locale locale40 = java.util.Locale.getDefault(category0);
        java.util.Locale locale41 = java.util.Locale.getDefault(category0);
        java.util.Locale locale42 = locale41.stripExtensions();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(ethiopicChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "24" + "'", str8, "24");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "tedesco (Germania)" + "'", str9, "tedesco (Germania)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ita" + "'", str10, "ita");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNotNull(ethiopicChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(ethiopicChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "24" + "'", str24, "24");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "97" + "'", str25, "97");
        org.junit.Assert.assertNotNull(ethiopicChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(ethiopicChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "24" + "'", str36, "24");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "it");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "it");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
    }

    @Test
    public void test12516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12516");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology2.getZone();
        org.joda.time.DurationField durationField7 = ethiopicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1, (org.joda.time.Chronology) ethiopicChronology2);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology2.hourOfDay();
        int int13 = ethiopicChronology2.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test12517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12517");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getScript();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology3.clockhourOfDay();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = dateTimeField4.getAsText((long) 'a', locale6);
        java.lang.String str8 = locale0.getDisplayName(locale6);
        java.lang.String str9 = locale6.getDisplayCountry();
        java.util.Set<java.lang.String> strSet10 = locale6.getUnicodeLocaleAttributes();
        java.util.stream.Stream<java.lang.String> strStream11 = strSet10.parallelStream();
        int int12 = strSet10.size();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "24" + "'", str7, "24");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tedesco (Germania)" + "'", str8, "tedesco (Germania)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test12518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12518");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        int int14 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property15 = localDateTime9.weekyear();
        org.joda.time.LocalDateTime.Property property16 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime9.minusYears(999);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusDays((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.minusMinutes(51040001);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusYears((-22));
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusSeconds(22);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.minusMonths(0);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.minusYears(53734782);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
    }

    @Test
    public void test12519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12519");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = ethiopicChronology1.getDateTimeMillis(987, 74, 579, 969, 55, 19, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 969 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test12520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12520");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) ethiopicChronology1);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.Chronology chronology9 = ethiopicChronology1.withZone(dateTimeZone8);
        org.joda.time.DurationField durationField10 = ethiopicChronology1.hours();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.months();
        org.joda.time.Chronology chronology12 = ethiopicChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DurationField durationField15 = ethiopicChronology1.halfdays();
        org.joda.time.DurationField durationField16 = ethiopicChronology1.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = durationField16.subtract(55382399517L, (long) 53479987);
            org.junit.Assert.fail("Expected exception of type org.joda.time.chrono.LimitChronology.LimitException; message: The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (EthiopicChronology[UTC])");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test12521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12521");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        int int14 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property15 = localDateTime9.weekyear();
        org.joda.time.LocalDateTime.Property property16 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime9.minusYears(999);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime9.plus(readableDuration19);
        int int21 = localDateTime9.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime9.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
    }

    @Test
    public void test12522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12522");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.era();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test12523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12523");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 999);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
    }

    @Test
    public void test12524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12524");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.hourOfHalfday();
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology10.dayOfMonth();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.plusWeeks((int) (byte) 10);
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.lang.String str21 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime19, locale20);
        java.util.Set<java.lang.String> strSet22 = locale20.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category8, locale20);
        java.util.Set<java.lang.String> strSet24 = locale20.getUnicodeLocaleKeys();
        int int25 = dateTimeField7.getMaximumShortTextLength(locale20);
        java.util.Locale locale27 = java.util.Locale.JAPAN;
        java.lang.String str28 = locale27.getCountry();
        java.lang.String str29 = dateTimeField7.getAsText(165075529L, locale27);
        int int30 = dateTimeField7.getMinimumValue();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2" + "'", str21, "2");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "JP" + "'", str28, "JP");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "9" + "'", str29, "9");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test12525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12525");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet0.clear();
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone[] dateTimeZoneArray12 = new org.joda.time.DateTimeZone[] { dateTimeZone3, dateTimeZone5, dateTimeZone7, dateTimeZone9, dateTimeZone11 };
        org.joda.time.DateTimeZone[] dateTimeZoneArray13 = strSet0.toArray(dateTimeZoneArray12);
        boolean boolean15 = strSet0.remove((java.lang.Object) false);
        java.util.Set<java.lang.String> strSet16 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Set<java.lang.String> strSet17 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet17.clear();
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTimeZone[] dateTimeZoneArray29 = new org.joda.time.DateTimeZone[] { dateTimeZone20, dateTimeZone22, dateTimeZone24, dateTimeZone26, dateTimeZone28 };
        org.joda.time.DateTimeZone[] dateTimeZoneArray30 = strSet17.toArray(dateTimeZoneArray29);
        java.util.Spliterator<java.lang.String> strSpliterator31 = strSet17.spliterator();
        boolean boolean32 = strSet17.isEmpty();
        boolean boolean33 = strSet16.containsAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.Locale.Builder builder34 = new java.util.Locale.Builder();
        boolean boolean35 = strSet16.equals((java.lang.Object) builder34);
        boolean boolean36 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet16);
        java.util.stream.Stream<java.lang.String> strStream37 = strSet0.stream();
        java.lang.Object[] objArray38 = strSet0.toArray();
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneArray12);
        org.junit.Assert.assertNotNull(dateTimeZoneArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZoneArray29);
        org.junit.Assert.assertNotNull(dateTimeZoneArray30);
        org.junit.Assert.assertNotNull(strSpliterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strStream37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
    }

    @Test
    public void test12526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12526");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        int int8 = localDateTime7.getMillisOfSecond();
        int int9 = localDateTime7.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = localDateTime7.isSupported(durationFieldType12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekOfWeekyear();
        java.lang.String str19 = property18.getAsText();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.centuryOfEra();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime(readableInstant34);
        java.util.Locale locale36 = java.util.Locale.GERMANY;
        boolean boolean37 = locale36.hasExtensions();
        boolean boolean38 = dateTime35.equals((java.lang.Object) locale36);
        int int39 = property25.getDifference((org.joda.time.ReadableInstant) dateTime35);
        int int40 = property18.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(chronology41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.weekyear();
        org.joda.time.LocalDateTime localDateTime51 = property49.setCopy((int) (byte) 1);
        long long52 = property49.remainder();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(chronology53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime54.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime54.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.DateTime dateTime62 = localDateTime60.toDateTime(readableInstant61);
        org.joda.time.LocalDateTime.Property property63 = localDateTime60.millisOfDay();
        int int64 = property49.compareTo((org.joda.time.ReadablePartial) localDateTime60);
        boolean boolean66 = property49.equals((java.lang.Object) 1055L);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = property49.getFieldType();
        boolean boolean68 = dateTime35.isSupported(dateTimeFieldType67);
        boolean boolean69 = localDateTime7.isSupported(dateTimeFieldType67);
        org.joda.time.ReadableDuration readableDuration70 = null;
        org.joda.time.LocalDateTime localDateTime71 = localDateTime7.plus(readableDuration70);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.plusYears(816);
        int int74 = localDateTime73.getWeekyear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 879 + "'", int8 == 879);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 879 + "'", int9 == 879);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "7" + "'", str19, "7");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime51);
// flaky:         org.junit.Assert.assertTrue("'" + long52 + "' != '" + 4287384879L + "'", long52 == 4287384879L);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2838 + "'", int74 == 2838);
    }

    @Test
    public void test12527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12527");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) ethiopicChronology1);
        org.joda.time.DurationField durationField7 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.hours();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str13 = dateTimeZone11.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone11);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.lang.String str18 = dateTimeZone16.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone16);
        boolean boolean20 = localDateTime14.isEqual((org.joda.time.ReadablePartial) localDateTime19);
        int[] intArray22 = ethiopicChronology1.get((org.joda.time.ReadablePartial) localDateTime19, (long) 30);
        org.joda.time.DateTimeZone dateTimeZone23 = ethiopicChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = ethiopicChronology1.add(readablePeriod24, (long) 613, (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology1.hourOfDay();
        org.joda.time.DurationField durationField29 = ethiopicChronology1.weeks();
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        java.lang.String str33 = dateTimeZone31.getNameKey((long) (byte) 0);
        boolean boolean34 = dateTimeZone31.isFixed();
        boolean boolean35 = dateTimeZone31.isFixed();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.minusDays(100);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.minuteOfHour();
        boolean boolean49 = dateTimeZone31.equals((java.lang.Object) localDateTime47);
        org.joda.time.Chronology chronology50 = ethiopicChronology1.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField51 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField52 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField53 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField54 = ethiopicChronology1.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long59 = ethiopicChronology1.getDateTimeMillis(53432001, 449, 3, 1888099091);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1888099091 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
// flaky:         org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1962, 4, 23, 513]");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 613L + "'", long27 == 613L);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
// flaky:         org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
    }

    @Test
    public void test12528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12528");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        java.lang.String str6 = ethiopicChronology1.toString();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.weekyear();
        int int8 = dateTimeField7.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology10.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Chronology chronology14 = ethiopicChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology10.millisOfSecond();
        org.joda.time.DurationField durationField16 = ethiopicChronology10.hours();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology10.dayOfMonth();
        org.joda.time.DurationField durationField18 = ethiopicChronology10.days();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology10.hourOfDay();
        org.joda.time.DurationField durationField20 = ethiopicChronology10.minutes();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology10.halfdayOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.minusDays(0);
        int int34 = localDateTime33.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.minusYears(689);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusMonths(955);
        int int39 = localDateTime36.getEra();
        long long41 = ethiopicChronology10.set((org.joda.time.ReadablePartial) localDateTime36, 402L);
        int int42 = dateTimeField7.getMinimumValue((org.joda.time.ReadablePartial) localDateTime36);
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EthiopicChronology[+00:00:00.483]" + "'", str6, "EthiopicChronology[+00:00:00.483]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 292272984 + "'", int8 == 292272984);
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 56 + "'", int34 == 56);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-19855011816482L) + "'", long41 == (-19855011816482L));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-292269338) + "'", int42 == (-292269338));
    }

    @Test
    public void test12529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12529");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.millisOfSecond();
        boolean boolean7 = dateTimeField5.isLeap(4287312566L);
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test12530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12530");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.dayOfMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusWeeks((int) (byte) 10);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime10, locale11);
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleKeys();
        java.lang.Object[] objArray14 = strSet13.toArray();
        java.lang.Object obj15 = null;
        boolean boolean16 = strSet13.equals(obj15);
        java.util.Spliterator<java.lang.String> strSpliterator17 = strSet13.spliterator();
        java.lang.String[] strArray27 = new java.lang.String[] { "UTC", "UTC", "tedesco (Germania)", "Etc/UTC", "Etc/UTC", "", "", "10", "Etc/UTC" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Collection<java.lang.String> strCollection33 = null;
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, strCollection33);
        boolean boolean35 = strSet28.retainAll((java.util.Collection<java.lang.String>) strList34);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Collection<java.lang.String> strCollection39 = null;
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strCollection39);
        java.util.Collection<java.lang.String> strCollection41 = null;
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strCollection41);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Collection<java.lang.String> strCollection46 = null;
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, strCollection46);
        java.util.Collection<java.lang.String> strCollection48 = null;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, strCollection48);
        java.util.Locale.FilteringMode filteringMode50 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strCollection48, filteringMode50);
        java.util.Locale locale52 = java.util.Locale.GERMANY;
        boolean boolean53 = locale52.hasExtensions();
        java.util.Locale locale54 = java.util.Locale.TAIWAN;
        java.util.Locale locale55 = java.util.Locale.JAPAN;
        java.util.Locale locale56 = java.util.Locale.ITALY;
        java.util.Locale locale57 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology59 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = ethiopicChronology59.clockhourOfDay();
        org.joda.time.DurationField durationField61 = ethiopicChronology59.weekyears();
        org.joda.time.DateTimeField dateTimeField62 = ethiopicChronology59.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology64 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone63);
        org.joda.time.DateTimeField dateTimeField65 = ethiopicChronology64.clockhourOfDay();
        java.util.Locale locale67 = java.util.Locale.ITALIAN;
        java.lang.String str68 = dateTimeField65.getAsText((long) 'a', locale67);
        int int69 = dateTimeField62.getMaximumTextLength(locale67);
        java.util.Locale[] localeArray70 = new java.util.Locale[] { locale52, locale54, locale55, locale56, locale57, locale67 };
        java.util.ArrayList<java.util.Locale> localeList71 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList71, localeArray70);
        java.util.List<java.util.Locale> localeList73 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList71);
        boolean boolean74 = strSet28.contains((java.lang.Object) localeList73);
        boolean boolean75 = strSet13.removeAll((java.util.Collection<java.lang.String>) strSet28);
        int int76 = strSet28.size();
        java.util.Iterator<java.lang.String> strItor77 = strSet28.iterator();
        java.util.stream.Stream<java.lang.String> strStream78 = strSet28.stream();
        java.lang.Object[] objArray79 = strSet28.toArray();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2" + "'", str12, "2");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertTrue("'" + filteringMode50 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode50.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(ethiopicChronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(ethiopicChronology64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "it");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "24" + "'", str68, "24");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertNotNull(localeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(localeList73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(strItor77);
        org.junit.Assert.assertNotNull(strStream78);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[]");
    }

    @Test
    public void test12531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12531");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.weekyear();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.millis();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology1.getZone();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test12532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12532");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.minuteOfDay();
        long long13 = ethiopicChronology1.add((long) 99, 4286822991L, 21);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology1.era();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plusWeeks((int) (byte) 10);
        int int23 = localDateTime22.getMillisOfSecond();
        int int24 = localDateTime22.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withYearOfEra(928);
        org.joda.time.LocalDateTime.Property property27 = localDateTime22.era();
        int int28 = property27.get();
        int int29 = property27.getMaximumValue();
        int int30 = property27.getMaximumValueOverall();
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("Heure de Greenwich");
        int int33 = property27.getMaximumShortTextLength(locale32);
        int int34 = dateTimeField14.getMaximumShortTextLength(locale32);
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 90023282910L + "'", long13 == 90023282910L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 45 + "'", int23 == 45);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 45 + "'", int24 == 45);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test12533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12533");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.weekyears();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = ethiopicChronology1.add(readablePeriod5, 0L, 51053001);
        org.joda.time.DurationField durationField9 = ethiopicChronology1.days();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.monthOfYear();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.days();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.hourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test12534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12534");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.minusDays(0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.weekyear();
        org.joda.time.LocalDateTime localDateTime22 = property20.setCopy((int) (byte) 1);
        long long23 = property20.remainder();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(readableInstant32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime31.millisOfDay();
        int int35 = property20.compareTo((org.joda.time.ReadablePartial) localDateTime31);
        boolean boolean37 = property20.equals((java.lang.Object) 1055L);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property20.getFieldType();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime11.withField(dateTimeFieldType38, 175);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime11.withDayOfMonth((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType43 = null;
        boolean boolean44 = localDateTime11.isSupported(durationFieldType43);
        int int45 = localDateTime11.size();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology47 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField48 = ethiopicChronology47.hourOfDay();
        org.joda.time.DateTimeField dateTimeField49 = ethiopicChronology47.centuryOfEra();
        org.joda.time.DurationField durationField50 = ethiopicChronology47.millis();
        org.joda.time.DurationField durationField51 = ethiopicChronology47.months();
        org.joda.time.DateTimeField dateTimeField52 = ethiopicChronology47.clockhourOfHalfday();
        org.joda.time.DurationField durationField53 = ethiopicChronology47.hours();
        org.joda.time.DateTimeField dateTimeField54 = ethiopicChronology47.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField55 = ethiopicChronology47.hourOfDay();
        org.joda.time.DateTimeField dateTimeField56 = ethiopicChronology47.dayOfYear();
        java.util.TimeZone timeZone57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        java.lang.String str60 = dateTimeZone58.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime(dateTimeZone58);
        java.lang.String str62 = dateTimeZone58.getID();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(chronology63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property67 = localDateTime66.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property68 = localDateTime66.centuryOfEra();
        java.lang.String str69 = localDateTime66.toString();
        boolean boolean70 = dateTimeZone58.isLocalDateTimeGap(localDateTime66);
        org.joda.time.Chronology chronology71 = ethiopicChronology47.withZone(dateTimeZone58);
        org.joda.time.DurationField durationField72 = ethiopicChronology47.hours();
        org.joda.time.DurationFieldType durationFieldType73 = durationField72.getType();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime11.withFieldAdded(durationFieldType73, 13228);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime11.minusMinutes(148);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 4287385077L + "'", long23 == 4287385077L);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertNotNull(ethiopicChronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeZone58);
// flaky:         org.junit.Assert.assertNull(str60);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "+00:00:00.483" + "'", str62, "+00:00:00.483");
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(property68);
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "2022-02-14T14:56:25.077" + "'", str69, "2022-02-14T14:56:25.077");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(durationField72);
        org.junit.Assert.assertNotNull(durationFieldType73);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(localDateTime77);
    }

    @Test
    public void test12535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12535");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.Interval interval9 = property8.toInterval();
        boolean boolean10 = property8.isLeap();
        java.lang.String str11 = property8.getName();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology13.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Chronology chronology17 = ethiopicChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology13.clockhourOfHalfday();
        int int21 = dateTimeField19.getLeapAmount((long) (short) 1);
        java.util.Locale locale23 = java.util.Locale.GERMANY;
        java.lang.String str24 = locale23.getScript();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology26 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology26.clockhourOfDay();
        java.util.Locale locale29 = java.util.Locale.ITALIAN;
        java.lang.String str30 = dateTimeField27.getAsText((long) 'a', locale29);
        java.lang.String str31 = locale23.getDisplayName(locale29);
        java.lang.String str32 = locale29.getISO3Language();
        java.lang.String str33 = dateTimeField19.getAsShortText(53, locale29);
        int int34 = property8.getMaximumShortTextLength(locale29);
        org.joda.time.LocalDateTime localDateTime35 = property8.roundCeilingCopy();
        org.joda.time.Interval interval36 = property8.toInterval();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyear" + "'", str11, "weekyear");
        org.junit.Assert.assertNotNull(ethiopicChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(ethiopicChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "24" + "'", str30, "24");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "tedesco (Germania)" + "'", str31, "tedesco (Germania)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ita" + "'", str32, "ita");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "53" + "'", str33, "53");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(interval36);
    }

    @Test
    public void test12536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12536");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField11 = property8.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime12 = property8.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks(619);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusMonths((int) 'a');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusMillis(52);
        int int19 = localDateTime18.getYear();
        int int20 = localDateTime18.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2012 + "'", int19 == 2012);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test12537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12537");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.hours();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = ethiopicChronology1.add(readablePeriod10, 3155760000000L, 41);
        org.joda.time.DurationField durationField14 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology1.dayOfMonth();
        int int16 = ethiopicChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology1.millisOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3155760000000L + "'", long13 == 3155760000000L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test12538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12538");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.days();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.minutes();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str13 = dateTimeZone11.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(4286800429L, dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long18 = dateTimeZone16.convertUTCToLocal((long) (short) 1);
        long long20 = dateTimeZone11.getMillisKeepLocal(dateTimeZone16, 3490L);
        org.joda.time.Chronology chronology21 = ethiopicChronology1.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField22 = chronology21.year();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology24 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology24.clockhourOfDay();
        org.joda.time.DurationField durationField26 = ethiopicChronology24.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology24.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = ethiopicChronology24.getZone();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) ethiopicChronology24);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.hourOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.plusSeconds(197);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology35 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology35.hourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology35.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.Chronology chronology39 = ethiopicChronology35.withZone(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField40 = ethiopicChronology35.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField41 = ethiopicChronology35.year();
        org.joda.time.DurationField durationField42 = ethiopicChronology35.hours();
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        long long46 = ethiopicChronology35.add(readablePeriod43, 4286799226L, 83);
        org.joda.time.DateTimeField dateTimeField47 = ethiopicChronology35.minuteOfDay();
        int int49 = dateTimeField47.getMaximumValue((long) 644);
        org.joda.time.ReadablePartial readablePartial50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime52.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime52.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.DateTime dateTime60 = localDateTime58.toDateTime(readableInstant59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.plusSeconds(4);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(chronology63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime64.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime64.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime(chronology71);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime72.withMillisOfSecond((int) (byte) 1);
        int int77 = localDateTime64.compareTo((org.joda.time.ReadablePartial) localDateTime72);
        org.joda.time.LocalDateTime.Property property78 = localDateTime72.weekyear();
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime(chronology79);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime80.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime86 = localDateTime84.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime88 = localDateTime84.withMinuteOfHour(10);
        boolean boolean89 = localDateTime72.isEqual((org.joda.time.ReadablePartial) localDateTime88);
        boolean boolean90 = localDateTime62.isAfter((org.joda.time.ReadablePartial) localDateTime88);
        org.joda.time.LocalDateTime localDateTime92 = localDateTime62.plusMonths(55);
        int[] intArray93 = localDateTime62.getValues();
        int int94 = dateTimeField47.getMinimumValue(readablePartial50, intArray93);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray96 = dateTimeField22.set((org.joda.time.ReadablePartial) localDateTime32, 512, intArray93, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 512");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 11L + "'", long18 == 11L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3963L + "'", long20 == 3963L);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(ethiopicChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(ethiopicChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 4286799226L + "'", long46 == 4286799226L);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1439 + "'", int49 == 1439);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(localDateTime82);
        org.junit.Assert.assertNotNull(localDateTime84);
        org.junit.Assert.assertNotNull(localDateTime86);
        org.junit.Assert.assertNotNull(localDateTime88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(localDateTime92);
        org.junit.Assert.assertNotNull(intArray93);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[2000, 2, 21, 53789234]");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test12539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12539");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.minutes();
        org.joda.time.Chronology chronology10 = ethiopicChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.clockhourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test12540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12540");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.seconds();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = localDateTime5.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withMillisOfDay((int) (byte) 0);
        int int9 = localDateTime8.getYear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.yearOfEra();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundFloorCopy();
        int int12 = property10.get();
        org.joda.time.LocalDateTime localDateTime13 = property10.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime15 = property10.addToCopy(51006001);
        boolean boolean16 = property10.isLeap();
        int int17 = property10.getLeapAmount();
        boolean boolean18 = ethiopicChronology1.equals((java.lang.Object) int17);
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test12541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12541");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.monthOfYear();
        org.joda.time.tz.NameProvider nameProvider12 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider12);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider12);
        java.util.Locale locale16 = new java.util.Locale("53196316");
        java.lang.String str17 = locale16.getDisplayVariant();
        java.util.Locale locale18 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleKeys();
        java.lang.String str20 = locale16.getDisplayName(locale18);
        java.lang.String str23 = nameProvider12.getName(locale18, "2000-01-03T00:10:19.000Z", "");
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale locale25 = builder24.build();
        java.lang.String str28 = nameProvider12.getShortName(locale25, "seconds", "2022-02-14T14:46:56.225");
        int int29 = property11.getMaximumShortTextLength(locale25);
        int int30 = property11.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime31 = property11.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology33 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology33.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField35 = ethiopicChronology33.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone36 = ethiopicChronology33.getZone();
        int int38 = dateTimeZone36.getOffsetFromLocal((long) 21);
        java.util.TimeZone timeZone39 = dateTimeZone36.toTimeZone();
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("2022-02-14T14:46:42.333");
        java.lang.String str43 = locale42.toLanguageTag();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology45 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField46 = ethiopicChronology45.hourOfDay();
        org.joda.time.DateTimeField dateTimeField47 = ethiopicChronology45.halfdayOfDay();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(chronology48);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray50 = localDateTime49.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property55 = localDateTime52.dayOfWeek();
        java.util.Locale locale56 = java.util.Locale.GERMANY;
        java.lang.String str57 = locale56.getScript();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology59 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = ethiopicChronology59.clockhourOfDay();
        java.util.Locale locale62 = java.util.Locale.ITALIAN;
        java.lang.String str63 = dateTimeField60.getAsText((long) 'a', locale62);
        java.lang.String str64 = locale56.getDisplayName(locale62);
        java.lang.String str65 = dateTimeField47.getAsText((org.joda.time.ReadablePartial) localDateTime52, locale62);
        java.lang.String str66 = locale42.getDisplayLanguage(locale62);
        java.lang.String str67 = locale62.getDisplayCountry();
        java.lang.String str68 = dateTimeZone36.getShortName(0L, locale62);
        int int69 = property11.getMaximumTextLength(locale62);
        int int70 = property11.getMinimumValueOverall();
        java.lang.String str71 = property11.getName();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(nameProvider12);
        org.junit.Assert.assertEquals(locale16.toString(), "53196316");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "53196316" + "'", str20, "53196316");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(ethiopicChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 483 + "'", int38 == 483);
        org.junit.Assert.assertNotNull(timeZone39);
// flaky:         org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "und" + "'", str43, "und");
        org.junit.Assert.assertNotNull(ethiopicChronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(ethiopicChronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "it");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "24" + "'", str63, "24");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "tedesco (Germania)" + "'", str64, "tedesco (Germania)");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "0" + "'", str65, "0");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "+00:00:00.483" + "'", str68, "+00:00:00.483");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 9 + "'", int69 == 9);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "monthOfYear" + "'", str71, "monthOfYear");
    }

    @Test
    public void test12542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12542");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.setCopy((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusDays(10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology14.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology14.dayOfWeek();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray20 = localDateTime19.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology27 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology27.hourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = ethiopicChronology27.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology27.secondOfDay();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 10, (org.joda.time.Chronology) ethiopicChronology27);
        int int32 = localDateTime31.getDayOfYear();
        boolean boolean33 = localDateTime24.isEqual((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology35 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology35.hourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology35.centuryOfEra();
        org.joda.time.DurationField durationField38 = ethiopicChronology35.millis();
        org.joda.time.DateTimeField dateTimeField39 = ethiopicChronology35.weekOfWeekyear();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(chronology40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(chronology48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime49.withMillisOfSecond((int) (byte) 1);
        int int54 = localDateTime41.compareTo((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.LocalDateTime.Property property55 = localDateTime49.weekyear();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime49.minusMillis(2022);
        int[] intArray59 = ethiopicChronology35.get((org.joda.time.ReadablePartial) localDateTime49, (long) '#');
        int int60 = dateTimeField17.getMinimumValue((org.joda.time.ReadablePartial) localDateTime31, intArray59);
        int int61 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.LocalDateTime localDateTime63 = localDateTime10.minus(readableDuration62);
        org.joda.time.Chronology chronology64 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime10.plusMinutes(8);
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime((long) 52);
        boolean boolean69 = localDateTime66.isAfter((org.joda.time.ReadablePartial) localDateTime68);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime68.withYearOfEra(131);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime76 = localDateTime71.withTime(51021001, 303, 838, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 51021001 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(ethiopicChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 113 + "'", int32 == 113);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(ethiopicChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(intArray59);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1962, 4, 23, 518]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(localDateTime71);
    }

    @Test
    public void test12543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12543");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(402);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test12544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12544");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("weekyear");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("2022-02-14T14:48:29.990");
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("1");
        int int8 = timeZone7.getRawOffset();
        boolean boolean9 = timeZone5.hasSameRules(timeZone7);
        int int10 = timeZone5.getRawOffset();
        boolean boolean11 = languageRange1.equals((java.lang.Object) timeZone5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "weekyear" + "'", str2, "weekyear");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12545");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        long long6 = ethiopicChronology1.add((long) '#', (long) 'a', (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.centuryOfEra();
        int int11 = dateTimeField10.getMinimumValue();
        int int12 = dateTimeField10.getMaximumValue();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3430L + "'", long6 == 3430L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2922730 + "'", int12 == 2922730);
    }

    @Test
    public void test12546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12546");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.secondOfMinute();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.weekyear();
        org.joda.time.LocalDateTime localDateTime14 = property12.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField15 = property12.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime16 = property12.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks(619);
        int int19 = localDateTime18.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.plusHours(51021001);
        boolean boolean22 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 25 + "'", int19 == 25);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test12547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12547");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology1.millisOfSecond();
        int int19 = dateTimeField17.getMinimumValue(1888451505991L);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = dateTimeField17.getType();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
    }

    @Test
    public void test12548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12548");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.minuteOfHour();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.yearOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test12549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12549");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.months();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology1.add(readablePeriod7, 4286817452L, 53245692);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.hourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4286817452L + "'", long10 == 4286817452L);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test12550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12550");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        java.lang.String str6 = dateTimeZone5.getID();
        java.lang.String str7 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.weekyear();
        org.joda.time.LocalDateTime localDateTime18 = property16.setCopy((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = property16.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusSeconds(619);
        org.joda.time.DateTime dateTime22 = localDateTime21.toDateTime();
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        int int24 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) dateTime22);
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.483" + "'", str6, "+00:00:00.483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.483" + "'", str7, "+00:00:00.483");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 483 + "'", int24 == 483);
    }

    @Test
    public void test12551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12551");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay((int) (byte) 0);
        int int5 = localDateTime4.getYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.yearOfEra();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withYearOfCentury(0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(readableInstant15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = dateTime16.isSupported(dateTimeFieldType17);
        long long19 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology21 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology21.hourOfDay();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology21.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.Chronology chronology25 = ethiopicChronology21.withZone(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology21.millisOfSecond();
        org.joda.time.DurationField durationField27 = ethiopicChronology21.hours();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology21.dayOfMonth();
        org.joda.time.DurationField durationField29 = ethiopicChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology21.monthOfYear();
        java.util.Locale locale32 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str33 = dateTimeField30.getAsShortText(402, locale32);
        java.util.Locale locale34 = java.util.Locale.TAIWAN;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology36 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology36.clockhourOfDay();
        org.joda.time.DurationField durationField38 = ethiopicChronology36.weekyears();
        org.joda.time.DateTimeField dateTimeField39 = ethiopicChronology36.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology41 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField42 = ethiopicChronology41.clockhourOfDay();
        java.util.Locale locale44 = java.util.Locale.ITALIAN;
        java.lang.String str45 = dateTimeField42.getAsText((long) 'a', locale44);
        int int46 = dateTimeField39.getMaximumTextLength(locale44);
        int int48 = dateTimeField39.getMinimumValue((-3600001L));
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(chronology49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property54 = localDateTime52.centuryOfEra();
        java.lang.String str55 = localDateTime52.toString();
        java.util.Locale locale57 = java.util.Locale.ENGLISH;
        java.lang.String str58 = dateTimeField39.getAsShortText((org.joda.time.ReadablePartial) localDateTime52, (-292275054), locale57);
        java.util.Set<java.lang.String> strSet59 = locale57.getUnicodeLocaleKeys();
        java.lang.String str60 = locale34.getDisplayLanguage(locale57);
        java.lang.String str61 = locale32.getDisplayLanguage(locale34);
        java.util.Set<java.lang.Character> charSet62 = locale34.getExtensionKeys();
        int int63 = property6.getMaximumShortTextLength(locale34);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(chronology64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime65.withMillisOfSecond((int) (byte) 1);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime(chronology70);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime71.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime71.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property78 = localDateTime77.weekyear();
        org.joda.time.LocalDateTime localDateTime80 = property78.setCopy((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime81 = property78.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime83 = localDateTime81.plusSeconds(619);
        org.joda.time.DateTime dateTime84 = localDateTime83.toDateTime();
        java.lang.String str85 = dateTime84.toString();
        org.joda.time.DateTime dateTime86 = localDateTime69.toDateTime((org.joda.time.ReadableInstant) dateTime84);
        long long87 = dateTime86.getMillis();
        int int88 = property6.getDifference((org.joda.time.ReadableInstant) dateTime86);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 21L + "'", long19 == 21L);
        org.junit.Assert.assertNotNull(ethiopicChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "402" + "'", str33, "402");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(ethiopicChronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(ethiopicChronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "it");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "24" + "'", str45, "24");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(property54);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "2022-02-14T14:56:25.500" + "'", str55, "2022-02-14T14:56:25.500");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "-292275054" + "'", str58, "-292275054");
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Chinese" + "'", str60, "Chinese");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\u6cd5\u6587" + "'", str61, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(charSet62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 9 + "'", int63 == 9);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertNotNull(dateTime84);
// flaky:         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "2000-01-03T00:10:19.000+00:00:00.483" + "'", str85, "2000-01-03T00:10:19.000+00:00:00.483");
        org.junit.Assert.assertNotNull(dateTime86);
// flaky:         org.junit.Assert.assertTrue("'" + long87 + "' != '" + 1645455384518L + "'", long87 == 1645455384518L);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test12552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12552");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.days();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.hourOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.halfdayOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.minusDays(0);
        int int25 = localDateTime24.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusYears(689);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusMonths(955);
        int int30 = localDateTime27.getEra();
        long long32 = ethiopicChronology1.set((org.joda.time.ReadablePartial) localDateTime27, 402L);
        org.joda.time.LocalDateTime.Property property33 = localDateTime27.weekyear();
        java.lang.String str34 = property33.getAsString();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 56 + "'", int25 == 56);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-19855011815482L) + "'", long32 == (-19855011815482L));
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1333" + "'", str34, "1333");
    }

    @Test
    public void test12553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12553");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(483);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        java.util.Locale locale7 = new java.util.Locale("inglese", "Chinese", "French");
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology10.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Chronology chronology14 = ethiopicChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology10.millisOfSecond();
        org.joda.time.DurationField durationField16 = ethiopicChronology10.hours();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology10.dayOfMonth();
        org.joda.time.DurationField durationField18 = ethiopicChronology10.weeks();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology10.monthOfYear();
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str22 = dateTimeField19.getAsShortText(402, locale21);
        java.util.Locale locale23 = java.util.Locale.TAIWAN;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology25 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology25.clockhourOfDay();
        org.joda.time.DurationField durationField27 = ethiopicChronology25.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology25.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology30 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology30.clockhourOfDay();
        java.util.Locale locale33 = java.util.Locale.ITALIAN;
        java.lang.String str34 = dateTimeField31.getAsText((long) 'a', locale33);
        int int35 = dateTimeField28.getMaximumTextLength(locale33);
        int int37 = dateTimeField28.getMinimumValue((-3600001L));
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property43 = localDateTime41.centuryOfEra();
        java.lang.String str44 = localDateTime41.toString();
        java.util.Locale locale46 = java.util.Locale.ENGLISH;
        java.lang.String str47 = dateTimeField28.getAsShortText((org.joda.time.ReadablePartial) localDateTime41, (-292275054), locale46);
        java.util.Set<java.lang.String> strSet48 = locale46.getUnicodeLocaleKeys();
        java.lang.String str49 = locale23.getDisplayLanguage(locale46);
        java.lang.String str50 = locale21.getDisplayLanguage(locale23);
        java.util.Set<java.lang.Character> charSet51 = locale23.getExtensionKeys();
        java.lang.String str52 = locale7.getDisplayName(locale23);
        java.util.Set<java.lang.String> strSet53 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str54 = dateTimeZone1.getName(4287205104L, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(ethiopicChronology2);
        org.junit.Assert.assertEquals(locale7.toString(), "inglese_CHINESE_French");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "402" + "'", str22, "402");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(ethiopicChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(ethiopicChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "24" + "'", str34, "24");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property43);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2022-02-14T14:56:25.580" + "'", str44, "2022-02-14T14:56:25.580");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-292275054" + "'", str47, "-292275054");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Chinese" + "'", str49, "Chinese");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\u6cd5\u6587" + "'", str50, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(charSet51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "inglese (CHINESE,French)" + "'", str52, "inglese (CHINESE,French)");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00:00.483" + "'", str54, "+00:00:00.483");
    }

    @Test
    public void test12554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12554");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.dayOfYear();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.centuries();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekOfWeekyear();
        int int14 = localDateTime12.getYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime12.withFields((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime16.withCenturyOfEra(595);
        long long27 = ethiopicChronology1.set((org.joda.time.ReadablePartial) localDateTime25, (long) 244);
        long long31 = ethiopicChronology1.add(4286864520L, (long) (short) 1, 734);
        org.joda.time.DurationField durationField32 = ethiopicChronology1.centuries();
        org.joda.time.DurationField durationField33 = ethiopicChronology1.weeks();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1816450152985119L + "'", long27 == 1816450152985119L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 4286865254L + "'", long31 == 4286865254L);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(durationField33);
    }

    @Test
    public void test12555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12555");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long3 = dateTimeZone1.previousTransition(4286810703L);
        boolean boolean5 = dateTimeZone1.isStandardOffset(1888152431824L);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+100:00' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4286810703L + "'", long3 == 4286810703L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+:0:00");
    }

    @Test
    public void test12556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12556");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("32");
        int int2 = localDateTime1.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusSeconds(273);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test12557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12557");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.years();
        org.joda.time.DurationField durationField13 = ethiopicChronology1.hours();
        long long16 = durationField13.subtract(4287118111L, (-59));
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 4499518111L + "'", long16 == 4499518111L);
    }

    @Test
    public void test12558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12558");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        int int8 = localDateTime7.getMillisOfSecond();
        int int9 = localDateTime7.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusHours((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = localDateTime7.isSupported(durationFieldType12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime7.minuteOfHour();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withMillisOfSecond((int) (byte) 1);
        int int29 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.LocalDateTime.Property property30 = localDateTime24.weekyear();
        int int31 = property30.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime32 = property30.withMaximumValue();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime34.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(chronology41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.withMillisOfSecond((int) (byte) 1);
        int int47 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.LocalDateTime.Property property48 = localDateTime42.weekyear();
        org.joda.time.LocalDateTime.Property property49 = localDateTime42.millisOfDay();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime42.minusYears(999);
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime42.plus(readableDuration52);
        org.joda.time.DateTime dateTime54 = localDateTime53.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone55 = dateTime54.getZone();
        org.joda.time.DateTime dateTime56 = localDateTime32.toDateTime((org.joda.time.ReadableInstant) dateTime54);
        int int57 = property14.compareTo((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Instant instant58 = dateTime54.toInstant();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 663 + "'", int8 == 663);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 663 + "'", int9 == 663);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-292275054) + "'", int31 == (-292275054));
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(instant58);
    }

    @Test
    public void test12559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12559");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("Italian");
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("lun");
        org.joda.time.tz.NameProvider nameProvider5 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale6 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str7 = locale6.getCountry();
        java.lang.String str10 = nameProvider5.getShortName(locale6, "2022-02-14T14:46:37.492", "2022-02-14T14:46:36.704");
        java.util.Locale.Builder builder11 = builder2.setLocale(locale6);
        java.util.Locale.Builder builder13 = builder11.addUnicodeLocaleAttribute("53778");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(nameProvider5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CA" + "'", str7, "CA");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test12560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12560");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = property8.setCopy((int) (byte) 1);
        org.joda.time.DurationField durationField11 = property8.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime12 = property8.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks(619);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusMonths((int) 'a');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withCenturyOfEra(42);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withMillisOfDay(679);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test12561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12561");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology1.weekyears();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) ethiopicChronology1);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.weekyearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test12562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12562");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.minusDays(100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology13.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone16 = ethiopicChronology13.getZone();
        org.joda.time.DateTime dateTime17 = localDateTime5.toDateTime(dateTimeZone16);
        int int18 = localDateTime5.getCenturyOfEra();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.minusDays(100);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime24.withYearOfCentury((int) (short) 1);
        int int33 = localDateTime24.getDayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = localDateTime24.getFieldType(0);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime5.withField(dateTimeFieldType35, 225);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology39 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField40 = ethiopicChronology39.clockhourOfDay();
        org.joda.time.DurationField durationField41 = ethiopicChronology39.weekyears();
        org.joda.time.DateTimeField dateTimeField42 = ethiopicChronology39.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone43 = ethiopicChronology39.getZone();
        org.joda.time.DurationField durationField44 = ethiopicChronology39.minutes();
        org.joda.time.DurationField durationField45 = ethiopicChronology39.hours();
        org.joda.time.DurationFieldType durationFieldType46 = durationField45.getType();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime37.withFieldAdded(durationFieldType46, 742);
        org.joda.time.LocalDateTime.Property property49 = localDateTime37.year();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(ethiopicChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(ethiopicChronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
    }

    @Test
    public void test12563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12563");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology1.halfdayOfDay();
        org.joda.time.Chronology chronology9 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField10 = ethiopicChronology1.days();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField12 = ethiopicChronology1.days();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ethiopicChronology1.get(readablePeriod15, 4287305071L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test12564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12564");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        int int3 = timeZone1.getOffset(0L);
        timeZone1.setRawOffset((-292269338));
        int int6 = timeZone1.getRawOffset();
        int int7 = timeZone1.getRawOffset();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        int int10 = timeZone8.getOffset(0L);
        timeZone8.setRawOffset((-292269338));
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        int int16 = dateTimeZone14.getStandardOffset((long) 1);
        java.util.TimeZone timeZone17 = dateTimeZone14.toTimeZone();
        boolean boolean18 = timeZone8.hasSameRules(timeZone17);
        int int20 = timeZone8.getOffset((long) 2);
        boolean boolean21 = timeZone1.hasSameRules(timeZone8);
        timeZone8.setRawOffset(53);
        java.util.TimeZone.setDefault(timeZone8);
        timeZone8.setRawOffset(53229194);
        int int28 = timeZone8.getOffset(4287206301L);
        boolean boolean29 = timeZone0.hasSameRules(timeZone8);
        boolean boolean30 = timeZone8.observesDaylightTime();
        java.lang.String str31 = timeZone8.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-292269338) + "'", int6 == (-292269338));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-292269338) + "'", int7 == (-292269338));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 483 + "'", int16 == 483);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-292269338) + "'", int20 == (-292269338));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 53229194 + "'", int28 == 53229194);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4" + "'", str31, "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test12565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12565");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-21T14:47:14.175");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test12566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12566");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.years();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test12567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12567");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMillisOfSecond((int) (byte) 1);
        int int14 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property15 = localDateTime9.weekyear();
        org.joda.time.DurationField durationField16 = property15.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime17 = property15.withMinimumValue();
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.fromDateFields(date18);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.fromDateFields(date18);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNull(durationField16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Sun Sep 22 05:22:17 GMT 292272993");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test12568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12568");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.seconds();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test12569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12569");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology1.getZone();
        org.joda.time.Chronology chronology6 = ethiopicChronology1.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology1.seconds();
        org.joda.time.DurationField durationField8 = ethiopicChronology1.days();
        org.joda.time.DurationField durationField9 = ethiopicChronology1.millis();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology1.secondOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology1.years();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test12570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12570");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str5 = nameProvider0.getShortName(locale1, "2022-02-14T14:46:37.492", "2022-02-14T14:46:36.704");
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("Italian");
        java.util.Locale.Builder builder9 = builder6.clear();
        java.util.Locale.Builder builder11 = builder6.setLanguageTag("UTC");
        java.util.Locale locale12 = builder11.build();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology14.dayOfMonth();
        java.util.Locale locale19 = new java.util.Locale("hi!", "hi!");
        java.lang.String str20 = dateTimeField15.getAsText((int) (byte) 10, locale19);
        boolean boolean21 = dateTimeField15.isSupported();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology23 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology23.dayOfMonth();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withMillisOfSecond((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.plusWeeks((int) (byte) 10);
        java.util.Locale locale33 = java.util.Locale.PRC;
        java.lang.String str34 = dateTimeField24.getAsText((org.joda.time.ReadablePartial) localDateTime32, locale33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.withMillisOfSecond((int) (byte) 1);
        java.util.Locale locale42 = java.util.Locale.JAPAN;
        java.lang.String str43 = dateTimeField24.getAsText((org.joda.time.ReadablePartial) localDateTime36, 2022, locale42);
        java.lang.String str44 = locale42.getDisplayCountry();
        int int45 = dateTimeField15.getMaximumTextLength(locale42);
        java.lang.String str46 = locale42.getDisplayScript();
        java.util.Locale.Builder builder47 = builder11.setLocale(locale42);
        java.lang.String str48 = locale42.getDisplayCountry();
        java.lang.String str51 = nameProvider0.getShortName(locale42, "2022-02-14T14:56:00.903", "2022-02-14T14:48:08.248");
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CA" + "'", str2, "CA");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "utc");
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals(locale19.toString(), "hi!_HI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10" + "'", str20, "10");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2" + "'", str34, "2");
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "2022" + "'", str43, "2022");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u65e5\u672c" + "'", str44, "\u65e5\u672c");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\u65e5\u672c" + "'", str48, "\u65e5\u672c");
        org.junit.Assert.assertNull(str51);
    }
}
