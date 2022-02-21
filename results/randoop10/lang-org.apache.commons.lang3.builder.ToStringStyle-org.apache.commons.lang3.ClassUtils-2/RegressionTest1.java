import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.format.TextStyle textStyle24 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle25 = textStyle24.asNormal();
        java.util.Locale locale27 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet28 = locale27.getExtensionKeys();
        java.util.Locale locale30 = new java.util.Locale("");
        java.lang.String str31 = locale30.getDisplayCountry();
        java.lang.String str32 = locale27.getDisplayScript(locale30);
        java.lang.String str33 = zoneOffset22.getDisplayName(textStyle24, locale27);
        int int34 = zoneOffset22.getTotalSeconds();
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset22);
        java.time.LocalDateTime localDateTime37 = localDateTime35.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime39 = localDateTime37.atZone((java.time.ZoneId) zoneOffset38);
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.UTC;
        boolean boolean42 = chronoField40.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset41);
        java.time.ZonedDateTime zonedDateTime43 = java.time.ZonedDateTime.of(localDateTime37, (java.time.ZoneId) zoneOffset41);
        java.time.DayOfWeek dayOfWeek44 = zonedDateTime43.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime46 = zonedDateTime43.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal47 = localDateTime16.adjustInto((java.time.temporal.Temporal) zonedDateTime46);
        java.time.LocalDateTime localDateTime49 = localDateTime16.minusWeeks(0L);
        java.time.temporal.ChronoField chronoField50 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        int int51 = localDateTime49.get((java.time.temporal.TemporalField) chronoField50);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + textStyle24 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle24.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle25 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle25.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Z" + "'", str33, "Z");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime39);
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField40.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(zonedDateTime43);
        org.junit.Assert.assertTrue("'" + dayOfWeek44 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek44.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime46);
        org.junit.Assert.assertNotNull(temporal47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + chronoField50 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField50.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 16000 + "'", int51 == 16000);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.time.Duration duration1 = java.time.Duration.ofMinutes((long) (byte) 0);
        java.time.Duration duration3 = duration1.withSeconds(0L);
        java.time.Duration duration5 = duration1.minusDays(0L);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime20 = localDateTime16.plusMonths((long) (short) 0);
        java.time.LocalTime localTime21 = localDateTime20.toLocalTime();
        java.time.Instant instant24 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant26 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean27 = instant24.isAfter(instant26);
        java.time.Period period29 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period31 = period29.plusYears((long) (short) 0);
        java.time.chrono.ChronoPeriod chronoPeriod33 = period31.multipliedBy((int) ' ');
        java.time.LocalDate localDate35 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField36 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit37 = chronoField36.getRangeUnit();
        boolean boolean38 = localDate35.isSupported(temporalUnit37);
        long long39 = chronoPeriod33.get(temporalUnit37);
        boolean boolean40 = instant26.isSupported(temporalUnit37);
        java.time.temporal.Temporal temporal41 = localDateTime20.minus((-359984L), temporalUnit37);
        java.time.LocalDateTime localDateTime43 = localDateTime20.plusHours(10L);
        java.time.temporal.ChronoField chronoField46 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset47 = java.time.ZoneOffset.UTC;
        boolean boolean48 = chronoField46.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset47);
        java.time.format.TextStyle textStyle49 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle50 = textStyle49.asNormal();
        java.util.Locale locale52 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet53 = locale52.getExtensionKeys();
        java.util.Locale locale55 = new java.util.Locale("");
        java.lang.String str56 = locale55.getDisplayCountry();
        java.lang.String str57 = locale52.getDisplayScript(locale55);
        java.lang.String str58 = zoneOffset47.getDisplayName(textStyle49, locale52);
        int int59 = zoneOffset47.getTotalSeconds();
        java.time.LocalDateTime localDateTime60 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset47);
        java.time.LocalDateTime localDateTime62 = localDateTime60.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField65 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset66 = java.time.ZoneOffset.UTC;
        boolean boolean67 = chronoField65.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset66);
        java.time.format.TextStyle textStyle68 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle69 = textStyle68.asNormal();
        java.util.Locale locale71 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet72 = locale71.getExtensionKeys();
        java.util.Locale locale74 = new java.util.Locale("");
        java.lang.String str75 = locale74.getDisplayCountry();
        java.lang.String str76 = locale71.getDisplayScript(locale74);
        java.lang.String str77 = zoneOffset66.getDisplayName(textStyle68, locale71);
        int int78 = zoneOffset66.getTotalSeconds();
        java.time.LocalDateTime localDateTime79 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset66);
        java.time.LocalDateTime localDateTime81 = localDateTime79.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset82 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime83 = localDateTime81.atZone((java.time.ZoneId) zoneOffset82);
        java.time.temporal.ChronoField chronoField84 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset85 = java.time.ZoneOffset.UTC;
        boolean boolean86 = chronoField84.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset85);
        java.time.ZonedDateTime zonedDateTime87 = java.time.ZonedDateTime.of(localDateTime81, (java.time.ZoneId) zoneOffset85);
        java.time.DayOfWeek dayOfWeek88 = zonedDateTime87.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime90 = zonedDateTime87.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal91 = localDateTime60.adjustInto((java.time.temporal.Temporal) zonedDateTime90);
        java.time.LocalDateTime localDateTime93 = localDateTime60.minusWeeks(0L);
        boolean boolean94 = localDateTime43.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime93);
        int int95 = localDateTime93.getYear();
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(chronoPeriod33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + chronoField36 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField36.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit37 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit37.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(temporal41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + chronoField46 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField46.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + textStyle49 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle49.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle50 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle50.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertNotNull(charSet53);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Z" + "'", str58, "Z");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertTrue("'" + chronoField65 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField65.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + textStyle68 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle68.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle69 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle69.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertNotNull(charSet72);
        org.junit.Assert.assertEquals(locale74.toString(), "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Z" + "'", str77, "Z");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(localDateTime79);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(zoneOffset82);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime83);
        org.junit.Assert.assertTrue("'" + chronoField84 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField84.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(zonedDateTime87);
        org.junit.Assert.assertTrue("'" + dayOfWeek88 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek88.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime90);
        org.junit.Assert.assertNotNull(temporal91);
        org.junit.Assert.assertNotNull(localDateTime93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1970 + "'", int95 == 1970);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        long[] longArray8 = new long[] { 16L, 1970, '4', 364740218880L, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "1969-12-27T20:10:16.000000097Z", longArray8, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[16, 1970, 52, 364740218880, 10]");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime24.withMinute((int) (byte) 10);
        java.time.Period period29 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period31 = period29.plusYears((long) (short) 0);
        java.time.Period period33 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod34 = period31.plus((java.time.temporal.TemporalAmount) period33);
        java.time.ZonedDateTime zonedDateTime35 = zonedDateTime24.minus((java.time.temporal.TemporalAmount) chronoPeriod34);
        int int36 = zonedDateTime35.getNano();
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(chronoPeriod34);
        org.junit.Assert.assertNotNull(zonedDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        java.time.Month month1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.of((int) (short) 10, month1, (int) '.', 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: month");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList7 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList7, charArray6);
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream16 = java.util.stream.IntStream.of(intArray15);
        java.util.stream.IntStream intStream17 = charListMap2.put(charList7, intStream16);
        intStream16.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<java.lang.Integer> intSpliterator19 = intStream16.spliterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNull(intStream17);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.Period period5 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod6 = period3.plus((java.time.temporal.TemporalAmount) period5);
        java.time.chrono.ChronoPeriod chronoPeriod8 = period5.multipliedBy((int) '#');
        java.lang.String str9 = period5.toString();
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.UTC;
        boolean boolean14 = chronoField12.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset13);
        java.time.format.TextStyle textStyle15 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle16 = textStyle15.asNormal();
        java.util.Locale locale18 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        java.util.Locale locale21 = new java.util.Locale("");
        java.lang.String str22 = locale21.getDisplayCountry();
        java.lang.String str23 = locale18.getDisplayScript(locale21);
        java.lang.String str24 = zoneOffset13.getDisplayName(textStyle15, locale18);
        int int25 = zoneOffset13.getTotalSeconds();
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset13);
        java.time.LocalDateTime localDateTime28 = localDateTime26.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset29 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime30 = localDateTime28.atZone((java.time.ZoneId) zoneOffset29);
        java.time.temporal.ChronoField chronoField31 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset32 = java.time.ZoneOffset.UTC;
        boolean boolean33 = chronoField31.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset32);
        java.time.ZonedDateTime zonedDateTime34 = java.time.ZonedDateTime.of(localDateTime28, (java.time.ZoneId) zoneOffset32);
        java.time.DayOfWeek dayOfWeek35 = zonedDateTime34.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime37 = zonedDateTime34.withMinute((int) (byte) 10);
        int int38 = zonedDateTime37.getNano();
        java.time.temporal.Temporal temporal39 = period5.addTo((java.time.temporal.Temporal) zonedDateTime37);
        java.time.temporal.ChronoField chronoField42 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset43 = java.time.ZoneOffset.UTC;
        boolean boolean44 = chronoField42.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset43);
        java.time.format.TextStyle textStyle45 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle46 = textStyle45.asNormal();
        java.util.Locale locale48 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet49 = locale48.getExtensionKeys();
        java.util.Locale locale51 = new java.util.Locale("");
        java.lang.String str52 = locale51.getDisplayCountry();
        java.lang.String str53 = locale48.getDisplayScript(locale51);
        java.lang.String str54 = zoneOffset43.getDisplayName(textStyle45, locale48);
        int int55 = zoneOffset43.getTotalSeconds();
        java.time.LocalDateTime localDateTime56 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset43);
        java.time.ZonedDateTime zonedDateTime57 = zonedDateTime37.withZoneSameInstant((java.time.ZoneId) zoneOffset43);
        java.time.LocalDate localDate59 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField60 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit61 = chronoField60.getRangeUnit();
        boolean boolean62 = localDate59.isSupported(temporalUnit61);
        java.time.ZonedDateTime zonedDateTime63 = zonedDateTime37.truncatedTo(temporalUnit61);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(chronoPeriod6);
        org.junit.Assert.assertNotNull(chronoPeriod8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P-1M" + "'", str9, "P-1M");
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField12.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + textStyle15 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle15.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle16 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle16.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z" + "'", str24, "Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(zoneOffset29);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime30);
        org.junit.Assert.assertTrue("'" + chronoField31 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField31.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(zonedDateTime34);
        org.junit.Assert.assertTrue("'" + dayOfWeek35 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek35.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertNotNull(temporal39);
        org.junit.Assert.assertTrue("'" + chronoField42 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField42.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + textStyle45 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle45.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle46 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle46.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNotNull(charSet49);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Z" + "'", str54, "Z");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(zonedDateTime57);
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertTrue("'" + chronoField60 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField60.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit61 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit61.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(zonedDateTime63);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        java.time.Duration duration1 = java.time.Duration.ofMinutes((long) (byte) 0);
        java.time.Duration duration3 = duration1.withSeconds(0L);
        java.time.Duration duration5 = java.time.Duration.ofMinutes((long) (byte) 0);
        java.time.Duration duration7 = duration5.withSeconds(0L);
        int int8 = duration1.compareTo(duration5);
        long long9 = duration5.toHours();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime3 = java.time.LocalTime.of((int) 'x', 365000000, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 120");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        boolean boolean7 = localDate4.isSupported(temporalUnit6);
        boolean boolean8 = localDate1.isBefore((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.format.DateTimeFormatter dateTimeFormatter9 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray11 = new java.time.temporal.TemporalField[] { chronoField10 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet12 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet12, temporalFieldArray11);
        java.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet12);
        java.lang.String str15 = localDate4.format(dateTimeFormatter14);
        java.text.Format format16 = dateTimeFormatter14.toFormat();
        java.lang.Object obj17 = format16.clone();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-W02-7" + "'", str15, "1970-W02-7");
        org.junit.Assert.assertNotNull(format16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        java.security.AccessControlException accessControlException2 = new java.security.AccessControlException("/");
        java.io.IOException iOException3 = new java.io.IOException("hi!", (java.lang.Throwable) accessControlException2);
        java.security.cert.CertificateException certificateException4 = new java.security.cert.CertificateException((java.lang.Throwable) accessControlException2);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        java.time.Instant instant1 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant3 = instant1.minusMillis((long) 'x');
        int int4 = instant3.getNano();
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition5 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD;
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.UTC;
        boolean boolean10 = chronoField8.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset9);
        java.time.format.TextStyle textStyle11 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle12 = textStyle11.asNormal();
        java.util.Locale locale14 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet15 = locale14.getExtensionKeys();
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getDisplayCountry();
        java.lang.String str19 = locale14.getDisplayScript(locale17);
        java.lang.String str20 = zoneOffset9.getDisplayName(textStyle11, locale14);
        int int21 = zoneOffset9.getTotalSeconds();
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset9);
        java.time.LocalDateTime localDateTime24 = localDateTime22.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime26 = localDateTime22.plusMonths((long) (short) 0);
        java.time.LocalTime localTime27 = localDateTime26.toLocalTime();
        java.time.Instant instant29 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant31 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean32 = instant29.isAfter(instant31);
        java.time.temporal.ChronoField chronoField35 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset36 = java.time.ZoneOffset.UTC;
        boolean boolean37 = chronoField35.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset36);
        java.time.format.TextStyle textStyle38 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle39 = textStyle38.asNormal();
        java.util.Locale locale41 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet42 = locale41.getExtensionKeys();
        java.util.Locale locale44 = new java.util.Locale("");
        java.lang.String str45 = locale44.getDisplayCountry();
        java.lang.String str46 = locale41.getDisplayScript(locale44);
        java.lang.String str47 = zoneOffset36.getDisplayName(textStyle38, locale41);
        int int48 = zoneOffset36.getTotalSeconds();
        java.time.LocalDateTime localDateTime49 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset36);
        java.time.LocalDateTime localDateTime51 = localDateTime49.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset52 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime53 = localDateTime51.atZone((java.time.ZoneId) zoneOffset52);
        java.time.temporal.ChronoField chronoField54 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset55 = java.time.ZoneOffset.UTC;
        boolean boolean56 = chronoField54.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset55);
        java.time.ZonedDateTime zonedDateTime57 = java.time.ZonedDateTime.of(localDateTime51, (java.time.ZoneId) zoneOffset55);
        java.time.ZonedDateTime zonedDateTime58 = java.time.ZonedDateTime.ofInstant(instant29, (java.time.ZoneId) zoneOffset55);
        java.time.temporal.ChronoField chronoField61 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset62 = java.time.ZoneOffset.UTC;
        boolean boolean63 = chronoField61.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset62);
        java.time.format.TextStyle textStyle64 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle65 = textStyle64.asNormal();
        java.util.Locale locale67 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet68 = locale67.getExtensionKeys();
        java.util.Locale locale70 = new java.util.Locale("");
        java.lang.String str71 = locale70.getDisplayCountry();
        java.lang.String str72 = locale67.getDisplayScript(locale70);
        java.lang.String str73 = zoneOffset62.getDisplayName(textStyle64, locale67);
        int int74 = zoneOffset62.getTotalSeconds();
        java.time.LocalDateTime localDateTime75 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset62);
        java.time.LocalDateTime localDateTime76 = timeDefinition5.createDateTime(localDateTime26, zoneOffset55, zoneOffset62);
        java.time.Clock clock77 = java.time.Clock.fixed(instant3, (java.time.ZoneId) zoneOffset55);
        java.time.Duration duration79 = java.time.Duration.ofNanos((long) (byte) 10);
        java.time.Duration duration81 = duration79.plusMillis((long) (byte) 100);
        java.time.Duration duration83 = duration81.minusMillis((long) (byte) 100);
        java.time.Clock clock84 = java.time.Clock.offset(clock77, duration83);
        java.time.Instant instant85 = java.time.Instant.now(clock84);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + timeDefinition5 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD + "'", timeDefinition5.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD));
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField8.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + textStyle11 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle11.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle12 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle12.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Z" + "'", str20, "Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + chronoField35 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField35.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + textStyle38 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle38.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle39 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle39.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(charSet42);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Z" + "'", str47, "Z");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(zoneOffset52);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime53);
        org.junit.Assert.assertTrue("'" + chronoField54 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField54.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(zonedDateTime57);
        org.junit.Assert.assertNotNull(zonedDateTime58);
        org.junit.Assert.assertTrue("'" + chronoField61 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField61.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + textStyle64 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle64.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle65 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle65.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertNotNull(charSet68);
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Z" + "'", str73, "Z");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(clock77);
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertNotNull(duration81);
        org.junit.Assert.assertNotNull(duration83);
        org.junit.Assert.assertNotNull(clock84);
        org.junit.Assert.assertNotNull(instant85);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList7 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList7, charArray6);
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream16 = java.util.stream.IntStream.of(intArray15);
        java.util.stream.IntStream intStream17 = charListMap2.put(charList7, intStream16);
        java.util.Spliterator<java.lang.Character> charSpliterator18 = charList7.spliterator();
        java.util.Locale locale19 = java.util.Locale.KOREA;
        boolean boolean20 = charList7.contains((java.lang.Object) locale19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNull(intStream17);
        org.junit.Assert.assertNotNull(charSpliterator18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.CE;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
        boolean boolean2 = isoEra0.isSupported((java.time.temporal.TemporalField) chronoField1);
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra0.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH + "'", chronoField1.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.putShort((short) 0);
        java.nio.ShortBuffer shortBuffer9 = byteBuffer8.asShortBuffer();
        java.nio.CharBuffer charBuffer10 = byteBuffer8.asCharBuffer();
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.wrap(byteArray16);
        int int18 = byteBuffer8.compareTo(byteBuffer17);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = byteBuffer8.getLong();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 100, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        java.time.ZonedDateTime zonedDateTime0 = java.time.ZonedDateTime.now();
        org.junit.Assert.assertNotNull(zonedDateTime0);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.chrono.ChronoPeriod chronoPeriod5 = period3.multipliedBy((int) ' ');
        java.time.Period period7 = period3.withYears(0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(chronoPeriod5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.SECOND_OF_MINUTE;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_MINUTE + "'", chronoField0.equals(java.time.temporal.ChronoField.SECOND_OF_MINUTE));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        java.time.Duration duration1 = java.time.Duration.ofNanos((long) (byte) 10);
        java.time.Duration duration3 = duration1.plusMillis((long) (byte) 100);
        long long4 = duration1.toDays();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int5 = localDate4.getMonthValue();
        int int6 = localDate4.getDayOfYear();
        boolean boolean7 = localDate2.isAfter((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.OffsetDateTime offsetDateTime8 = offsetTime0.atDate(localDate2);
        java.time.LocalDate localDate10 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int11 = localDate10.getMonthValue();
        java.time.LocalDate localDate13 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField14.getRangeUnit();
        boolean boolean16 = localDate13.isSupported(temporalUnit15);
        boolean boolean17 = localDate10.isBefore((java.time.chrono.ChronoLocalDate) localDate13);
        java.time.format.DateTimeFormatter dateTimeFormatter18 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray20 = new java.time.temporal.TemporalField[] { chronoField19 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet21 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet21, temporalFieldArray20);
        java.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter18.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet21);
        java.lang.String str24 = localDate13.format(dateTimeFormatter18);
        java.time.LocalDateTime localDateTime25 = localDate13.atStartOfDay();
        java.time.LocalDate localDate27 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int28 = localDate27.getMonthValue();
        int int29 = localDate27.getDayOfYear();
        java.time.LocalDate localDate31 = localDate27.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit33 = chronoField32.getRangeUnit();
        long long34 = localDate13.until((java.time.temporal.Temporal) localDate27, temporalUnit33);
        java.time.OffsetDateTime offsetDateTime35 = offsetTime0.atDate(localDate27);
        java.time.DayOfWeek dayOfWeek36 = offsetDateTime35.getDayOfWeek();
        java.time.OffsetDateTime offsetDateTime38 = offsetDateTime35.minusYears((long) (short) 10);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField19.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-W02-7" + "'", str24, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit33 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit33.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertTrue("'" + dayOfWeek36 + "' != '" + java.time.DayOfWeek.SUNDAY + "'", dayOfWeek36.equals(java.time.DayOfWeek.SUNDAY));
        org.junit.Assert.assertNotNull(offsetDateTime38);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange4 = java.time.temporal.ValueRange.of(0L, (long) (short) 0, 7187392471159151072L, (long) 365000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Smallest maximum value must be less than largest maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int5 = localDate4.getMonthValue();
        int int6 = localDate4.getDayOfYear();
        boolean boolean7 = localDate2.isAfter((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.OffsetDateTime offsetDateTime8 = offsetTime0.atDate(localDate2);
        java.time.LocalDate localDate10 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int11 = localDate10.getMonthValue();
        java.time.LocalDate localDate13 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField14.getRangeUnit();
        boolean boolean16 = localDate13.isSupported(temporalUnit15);
        boolean boolean17 = localDate10.isBefore((java.time.chrono.ChronoLocalDate) localDate13);
        java.time.format.DateTimeFormatter dateTimeFormatter18 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray20 = new java.time.temporal.TemporalField[] { chronoField19 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet21 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet21, temporalFieldArray20);
        java.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter18.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet21);
        java.lang.String str24 = localDate13.format(dateTimeFormatter18);
        java.time.LocalDateTime localDateTime25 = localDate13.atStartOfDay();
        java.time.LocalDate localDate27 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int28 = localDate27.getMonthValue();
        int int29 = localDate27.getDayOfYear();
        java.time.LocalDate localDate31 = localDate27.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit33 = chronoField32.getRangeUnit();
        long long34 = localDate13.until((java.time.temporal.Temporal) localDate27, temporalUnit33);
        java.time.OffsetDateTime offsetDateTime35 = offsetTime0.atDate(localDate27);
        java.time.temporal.ChronoField chronoField36 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean37 = offsetDateTime35.isSupported((java.time.temporal.TemporalField) chronoField36);
        java.time.OffsetDateTime offsetDateTime39 = offsetDateTime35.plusWeeks((long) 31);
        java.time.OffsetDateTime offsetDateTime41 = offsetDateTime35.minusNanos((long) (byte) 1);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField19.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-W02-7" + "'", str24, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit33 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit33.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertTrue("'" + chronoField36 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField36.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(offsetDateTime39);
        org.junit.Assert.assertNotNull(offsetDateTime41);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        boolean boolean5 = file2.setLastModified(4210L);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime4 = localTime1.withHour(31);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 31");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale1.getDisplayScript(locale4);
        java.time.chrono.Chronology chronology7 = java.time.chrono.Chronology.ofLocale(locale4);
        java.time.LocalDate localDate9 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int10 = localDate9.getMonthValue();
        java.time.LocalDate localDate12 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField13.getRangeUnit();
        boolean boolean15 = localDate12.isSupported(temporalUnit14);
        boolean boolean16 = localDate9.isBefore((java.time.chrono.ChronoLocalDate) localDate12);
        java.time.chrono.ChronoLocalDate chronoLocalDate17 = chronology7.date((java.time.temporal.TemporalAccessor) localDate12);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset21 = java.time.ZoneOffset.UTC;
        boolean boolean22 = chronoField20.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset21);
        java.time.format.TextStyle textStyle23 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle24 = textStyle23.asNormal();
        java.util.Locale locale26 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet27 = locale26.getExtensionKeys();
        java.util.Locale locale29 = new java.util.Locale("");
        java.lang.String str30 = locale29.getDisplayCountry();
        java.lang.String str31 = locale26.getDisplayScript(locale29);
        java.lang.String str32 = zoneOffset21.getDisplayName(textStyle23, locale26);
        int int33 = zoneOffset21.getTotalSeconds();
        java.time.LocalDateTime localDateTime34 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset21);
        java.time.LocalDateTime localDateTime36 = localDateTime34.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset37 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime38 = localDateTime36.atZone((java.time.ZoneId) zoneOffset37);
        java.time.temporal.ChronoField chronoField39 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset40 = java.time.ZoneOffset.UTC;
        boolean boolean41 = chronoField39.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset40);
        java.time.ZonedDateTime zonedDateTime42 = java.time.ZonedDateTime.of(localDateTime36, (java.time.ZoneId) zoneOffset40);
        java.time.ZonedDateTime zonedDateTime44 = zonedDateTime42.plusDays((-359984L));
        java.time.temporal.Temporal temporal45 = localDate12.adjustInto((java.time.temporal.Temporal) zonedDateTime42);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField13.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chronoLocalDate17);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField20.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + textStyle23 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle23.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle24 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle24.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(charSet27);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Z" + "'", str32, "Z");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(zoneOffset37);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime38);
        org.junit.Assert.assertTrue("'" + chronoField39 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField39.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(zonedDateTime42);
        org.junit.Assert.assertNotNull(zonedDateTime44);
        org.junit.Assert.assertNotNull(temporal45);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        boolean boolean7 = localDate4.isSupported(temporalUnit6);
        boolean boolean8 = localDate1.isBefore((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.format.DateTimeFormatter dateTimeFormatter9 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray11 = new java.time.temporal.TemporalField[] { chronoField10 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet12 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet12, temporalFieldArray11);
        java.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet12);
        java.lang.String str15 = localDate4.format(dateTimeFormatter9);
        java.time.LocalDateTime localDateTime16 = localDate4.atStartOfDay();
        java.time.LocalDate localDate18 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int19 = localDate18.getMonthValue();
        int int20 = localDate18.getDayOfYear();
        java.time.LocalDate localDate22 = localDate18.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField23 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit24 = chronoField23.getRangeUnit();
        long long25 = localDate4.until((java.time.temporal.Temporal) localDate18, temporalUnit24);
        java.time.LocalDate localDate27 = localDate18.withMonth(11);
        int int28 = localDate27.lengthOfYear();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-W02-7" + "'", str15, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + chronoField23 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField23.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit24 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit24.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 365 + "'", int28 == 365);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?> wildcardClass3 = null;
        java.lang.Class[] classArray5 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        wildcardClassArray6[0] = wildcardClass3;
        boolean boolean10 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray2, wildcardClassArray6, false);
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray12 = null;
        boolean boolean13 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray11, wildcardClassArray12);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "", (double) 10000000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Date date3 = new java.util.Date((long) (short) 100);
        boolean boolean4 = charSet1.equals((java.lang.Object) date3);
        java.lang.String str5 = date3.toLocaleString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Jan 1, 1970 12:00:00 AM" + "'", str5, "Jan 1, 1970 12:00:00 AM");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime24.minusHours((long) (short) 0);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime28 = zonedDateTime24.withLaterOffsetAtOverlap();
        java.time.ZonedDateTime zonedDateTime30 = zonedDateTime24.plusYears(0L);
        long long31 = zonedDateTime30.toEpochSecond();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime33 = zonedDateTime30.withMonth(16384);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 16384");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime28);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-359984L) + "'", long31 == (-359984L));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType(".");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.lang.Character[] charArray4 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList5 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList5, charArray4);
        java.lang.Character[] charArray8 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList9 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList9, charArray8);
        boolean boolean11 = charList5.removeAll((java.util.Collection<java.lang.Character>) charList9);
        java.util.ListIterator<java.lang.Character> charItor12 = charList5.listIterator();
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap15 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap18 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean20 = charListMap18.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray22 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList23 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList23, charArray22);
        int[] intArray31 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream32 = java.util.stream.IntStream.of(intArray31);
        java.util.stream.IntStream intStream33 = charListMap18.put(charList23, intStream32);
        int[] intArray40 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream41 = java.util.stream.IntStream.of(intArray40);
        java.util.Spliterator<java.lang.Integer> intSpliterator42 = intStream41.spliterator();
        java.util.stream.IntStream intStream43 = charListMap15.put(charList23, intStream41);
        int[] intArray50 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream51 = java.util.stream.IntStream.of(intArray50);
        boolean boolean52 = charListMap2.replace(charList5, intStream41, intStream51);
        java.time.OffsetTime offsetTime53 = java.time.OffsetTime.now();
        java.time.LocalDate localDate55 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate57 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int58 = localDate57.getMonthValue();
        int int59 = localDate57.getDayOfYear();
        boolean boolean60 = localDate55.isAfter((java.time.chrono.ChronoLocalDate) localDate57);
        java.time.OffsetDateTime offsetDateTime61 = offsetTime53.atDate(localDate55);
        java.time.LocalDate localDate63 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int64 = localDate63.getMonthValue();
        java.time.LocalDate localDate66 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField67 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit68 = chronoField67.getRangeUnit();
        boolean boolean69 = localDate66.isSupported(temporalUnit68);
        boolean boolean70 = localDate63.isBefore((java.time.chrono.ChronoLocalDate) localDate66);
        java.time.format.DateTimeFormatter dateTimeFormatter71 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField72 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray73 = new java.time.temporal.TemporalField[] { chronoField72 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet74 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet74, temporalFieldArray73);
        java.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter71.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet74);
        java.lang.String str77 = localDate66.format(dateTimeFormatter71);
        java.time.LocalDateTime localDateTime78 = localDate66.atStartOfDay();
        java.time.LocalDate localDate80 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int81 = localDate80.getMonthValue();
        int int82 = localDate80.getDayOfYear();
        java.time.LocalDate localDate84 = localDate80.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField85 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit86 = chronoField85.getRangeUnit();
        long long87 = localDate66.until((java.time.temporal.Temporal) localDate80, temporalUnit86);
        java.time.OffsetDateTime offsetDateTime88 = offsetTime53.atDate(localDate80);
        java.time.temporal.ChronoField chronoField89 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean90 = offsetDateTime88.isSupported((java.time.temporal.TemporalField) chronoField89);
        java.time.OffsetDateTime offsetDateTime92 = offsetDateTime88.plusWeeks((long) 31);
        java.nio.file.AccessMode accessMode93 = java.nio.file.AccessMode.READ;
        boolean boolean94 = offsetDateTime92.equals((java.lang.Object) accessMode93);
        java.time.LocalDate localDate95 = java.time.LocalDate.from((java.time.temporal.TemporalAccessor) offsetDateTime92);
        boolean boolean96 = charList5.equals((java.lang.Object) localDate95);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charItor12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream32);
        org.junit.Assert.assertNull(intStream33);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream41);
        org.junit.Assert.assertNotNull(intSpliterator42);
        org.junit.Assert.assertNull(intStream43);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(offsetTime53);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 11 + "'", int59 == 11);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(offsetDateTime61);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(localDate66);
        org.junit.Assert.assertTrue("'" + chronoField67 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField67.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit68 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit68.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter71);
        org.junit.Assert.assertTrue("'" + chronoField72 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField72.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "1970-W02-7" + "'", str77, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 11 + "'", int82 == 11);
        org.junit.Assert.assertNotNull(localDate84);
        org.junit.Assert.assertTrue("'" + chronoField85 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField85.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit86 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit86.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime88);
        org.junit.Assert.assertTrue("'" + chronoField89 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField89.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(offsetDateTime92);
        org.junit.Assert.assertTrue("'" + accessMode93 + "' != '" + java.nio.file.AccessMode.READ + "'", accessMode93.equals(java.nio.file.AccessMode.READ));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(localDate95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        java.io.File file1 = new java.io.File("java.time");
        java.io.File file2 = file1.getAbsoluteFile();
        boolean boolean3 = file2.canExecute();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "java.time");
        org.junit.Assert.assertNotNull(file2);
// flaky:         org.junit.Assert.assertEquals(file2.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/experiment/java.time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.temporal.ChronoField chronoField29 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.UTC;
        boolean boolean31 = chronoField29.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset30);
        java.time.format.TextStyle textStyle32 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle33 = textStyle32.asNormal();
        java.util.Locale locale35 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet36 = locale35.getExtensionKeys();
        java.util.Locale locale38 = new java.util.Locale("");
        java.lang.String str39 = locale38.getDisplayCountry();
        java.lang.String str40 = locale35.getDisplayScript(locale38);
        java.lang.String str41 = zoneOffset30.getDisplayName(textStyle32, locale35);
        int int42 = zoneOffset30.getTotalSeconds();
        java.time.LocalDateTime localDateTime43 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset30);
        java.time.LocalDateTime localDateTime45 = localDateTime43.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField48 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset49 = java.time.ZoneOffset.UTC;
        boolean boolean50 = chronoField48.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset49);
        java.time.format.TextStyle textStyle51 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle52 = textStyle51.asNormal();
        java.util.Locale locale54 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet55 = locale54.getExtensionKeys();
        java.util.Locale locale57 = new java.util.Locale("");
        java.lang.String str58 = locale57.getDisplayCountry();
        java.lang.String str59 = locale54.getDisplayScript(locale57);
        java.lang.String str60 = zoneOffset49.getDisplayName(textStyle51, locale54);
        int int61 = zoneOffset49.getTotalSeconds();
        java.time.LocalDateTime localDateTime62 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset49);
        java.time.LocalDateTime localDateTime64 = localDateTime62.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset65 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime66 = localDateTime64.atZone((java.time.ZoneId) zoneOffset65);
        java.time.temporal.ChronoField chronoField67 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset68 = java.time.ZoneOffset.UTC;
        boolean boolean69 = chronoField67.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset68);
        java.time.ZonedDateTime zonedDateTime70 = java.time.ZonedDateTime.of(localDateTime64, (java.time.ZoneId) zoneOffset68);
        java.time.DayOfWeek dayOfWeek71 = zonedDateTime70.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime73 = zonedDateTime70.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal74 = localDateTime43.adjustInto((java.time.temporal.Temporal) zonedDateTime73);
        java.time.ZonedDateTime zonedDateTime76 = zonedDateTime73.withSecond((int) (byte) 1);
        java.time.temporal.ChronoField chronoField77 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.ValueRange valueRange78 = chronoField77.range();
        boolean boolean79 = zonedDateTime73.isSupported((java.time.temporal.TemporalField) chronoField77);
        java.time.temporal.TemporalUnit temporalUnit80 = chronoField77.getRangeUnit();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime81 = zonedDateTime24.minus(100L, temporalUnit80);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertTrue("'" + chronoField29 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField29.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + textStyle32 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle32.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle33 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle33.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(charSet36);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Z" + "'", str41, "Z");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + chronoField48 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField48.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + textStyle51 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle51.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle52 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle52.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertNotNull(charSet55);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Z" + "'", str60, "Z");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(zoneOffset65);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime66);
        org.junit.Assert.assertTrue("'" + chronoField67 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField67.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(zonedDateTime70);
        org.junit.Assert.assertTrue("'" + dayOfWeek71 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek71.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime73);
        org.junit.Assert.assertNotNull(temporal74);
        org.junit.Assert.assertNotNull(zonedDateTime76);
        org.junit.Assert.assertTrue("'" + chronoField77 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField77.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(valueRange78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + temporalUnit80 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit80.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime81);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.Period period5 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod6 = period3.plus((java.time.temporal.TemporalAmount) period5);
        java.time.chrono.ChronoPeriod chronoPeriod8 = period5.multipliedBy((int) '#');
        java.lang.String str9 = period5.toString();
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.UTC;
        boolean boolean14 = chronoField12.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset13);
        java.time.format.TextStyle textStyle15 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle16 = textStyle15.asNormal();
        java.util.Locale locale18 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        java.util.Locale locale21 = new java.util.Locale("");
        java.lang.String str22 = locale21.getDisplayCountry();
        java.lang.String str23 = locale18.getDisplayScript(locale21);
        java.lang.String str24 = zoneOffset13.getDisplayName(textStyle15, locale18);
        int int25 = zoneOffset13.getTotalSeconds();
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset13);
        java.time.LocalDateTime localDateTime28 = localDateTime26.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset29 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime30 = localDateTime28.atZone((java.time.ZoneId) zoneOffset29);
        java.time.temporal.ChronoField chronoField31 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset32 = java.time.ZoneOffset.UTC;
        boolean boolean33 = chronoField31.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset32);
        java.time.ZonedDateTime zonedDateTime34 = java.time.ZonedDateTime.of(localDateTime28, (java.time.ZoneId) zoneOffset32);
        java.time.DayOfWeek dayOfWeek35 = zonedDateTime34.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime37 = zonedDateTime34.withMinute((int) (byte) 10);
        int int38 = zonedDateTime37.getNano();
        java.time.temporal.Temporal temporal39 = period5.addTo((java.time.temporal.Temporal) zonedDateTime37);
        java.time.LocalDate localDate41 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int42 = localDate41.getMonthValue();
        int int43 = localDate41.getDayOfYear();
        java.time.LocalDate localDate45 = localDate41.withYear((int) ' ');
        java.time.chrono.Era era46 = localDate41.getEra();
        java.time.LocalDate localDate48 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate50 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int51 = localDate50.getMonthValue();
        int int52 = localDate50.getDayOfYear();
        boolean boolean53 = localDate48.isAfter((java.time.chrono.ChronoLocalDate) localDate50);
        boolean boolean54 = localDate41.isEqual((java.time.chrono.ChronoLocalDate) localDate50);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime55 = zonedDateTime37.with((java.time.temporal.TemporalAdjuster) localDate41);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime56 = java.time.LocalDateTime.from((java.time.temporal.TemporalAccessor) localDate41);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDateTime from TemporalAccessor: 1970-01-11 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(chronoPeriod6);
        org.junit.Assert.assertNotNull(chronoPeriod8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P-1M" + "'", str9, "P-1M");
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField12.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + textStyle15 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle15.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle16 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle16.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z" + "'", str24, "Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(zoneOffset29);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime30);
        org.junit.Assert.assertTrue("'" + chronoField31 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField31.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(zonedDateTime34);
        org.junit.Assert.assertTrue("'" + dayOfWeek35 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek35.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertNotNull(temporal39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 11 + "'", int43 == 11);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertTrue("'" + era46 + "' != '" + java.time.chrono.IsoEra.CE + "'", era46.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 11 + "'", int52 == 11);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime55);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime24.withMinute((int) (byte) 10);
        java.time.Period period29 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period31 = period29.plusYears((long) (short) 0);
        java.time.Period period33 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod34 = period31.plus((java.time.temporal.TemporalAmount) period33);
        java.time.temporal.Temporal temporal35 = zonedDateTime27.minus((java.time.temporal.TemporalAmount) chronoPeriod34);
        java.time.chrono.ChronoPeriod chronoPeriod36 = chronoPeriod34.normalized();
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(chronoPeriod34);
        org.junit.Assert.assertNotNull(temporal35);
        org.junit.Assert.assertNotNull(chronoPeriod36);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        java.util.Date date1 = new java.util.Date((long) (short) 100);
        date1.setMinutes((int) (byte) 10);
        java.util.Date date5 = new java.util.Date((long) (short) 100);
        java.lang.String str6 = date5.toGMTString();
        date5.setHours(256);
        boolean boolean9 = date1.before(date5);
        java.util.Date date11 = new java.util.Date((long) (short) 100);
        date11.setMinutes((int) (byte) 10);
        int int14 = date1.compareTo(date11);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:10:00 UTC 1970");
        org.junit.Assert.assertEquals(date5.toString(), "Sun Jan 11 16:00:00 UTC 1970");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str6, "1 Jan 1970 00:00:00 GMT");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:10:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.chrono.Chronology chronology1 = localDateTime0.getChronology();
        java.time.chrono.ChronoLocalDate chronoLocalDate3 = chronology1.dateEpochDay((long) 16384);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        boolean boolean8 = chronoField6.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset7);
        java.time.format.TextStyle textStyle9 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle10 = textStyle9.asNormal();
        java.util.Locale locale12 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = locale12.getDisplayScript(locale15);
        java.lang.String str18 = zoneOffset7.getDisplayName(textStyle9, locale12);
        int int19 = zoneOffset7.getTotalSeconds();
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset7);
        java.time.LocalDateTime localDateTime22 = localDateTime20.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime24 = localDateTime22.atZone((java.time.ZoneId) zoneOffset23);
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.UTC;
        boolean boolean27 = chronoField25.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset26);
        java.time.ZonedDateTime zonedDateTime28 = java.time.ZonedDateTime.of(localDateTime22, (java.time.ZoneId) zoneOffset26);
        java.time.DayOfWeek dayOfWeek29 = zonedDateTime28.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime31 = zonedDateTime28.withMinute((int) (byte) 10);
        int int32 = zonedDateTime31.getNano();
        java.time.temporal.Temporal temporal33 = chronoLocalDate3.adjustInto((java.time.temporal.Temporal) zonedDateTime31);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronoLocalDate3);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField6.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + textStyle9 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle9.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle10 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle10.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Z" + "'", str18, "Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime24);
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField25.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(zonedDateTime28);
        org.junit.Assert.assertTrue("'" + dayOfWeek29 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek29.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(temporal33);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        java.io.PrintWriter printWriter1 = new java.io.PrintWriter("1970-01-01T00:00:00.120Z");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = intStream7.spliterator();
        java.util.stream.IntStream intStream9 = intStream7.sequential();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime24.minusHours((long) (short) 0);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime28 = zonedDateTime24.withLaterOffsetAtOverlap();
        java.time.ZonedDateTime zonedDateTime30 = zonedDateTime24.withNano(64);
        java.time.ZonedDateTime zonedDateTime31 = zonedDateTime24.withFixedOffsetZone();
        java.time.Instant instant32 = zonedDateTime31.toInstant();
        java.lang.String str33 = instant32.toString();
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime28);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertNotNull(zonedDateTime31);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1969-12-27T20:00:16.000000097Z" + "'", str33, "1969-12-27T20:00:16.000000097Z");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        java.nio.ByteOrder byteOrder0 = java.nio.ByteOrder.nativeOrder();
        org.junit.Assert.assertNotNull(byteOrder0);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        java.io.File file2 = java.io.File.createTempFile("1969-12-27T20:10:16.000000097Z", "F");
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/tmp/1969-12-27T20:10:16.000000097Z1099420987210281019F");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        long[] longArray6 = new long[] { 10000000000L, 466000000, (-359984L), (byte) -1, (byte) 0, 0L };
        java.nio.LongBuffer longBuffer9 = java.nio.LongBuffer.wrap(longArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = longBuffer9.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[10000000000, 466000000, -359984, -1, 0, 0]");
        org.junit.Assert.assertNotNull(longBuffer9);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime24.minusHours((long) (short) 0);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime28 = zonedDateTime24.withLaterOffsetAtOverlap();
        java.time.ZonedDateTime zonedDateTime30 = zonedDateTime24.withNano(64);
        java.lang.String str31 = zonedDateTime24.toString();
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime28);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1969-12-27T20:00:16.000000097Z" + "'", str31, "1969-12-27T20:00:16.000000097Z");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        byte byte7 = byteBuffer6.get();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer6.putLong((long) ':');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        java.util.concurrent.TimeoutException timeoutException1 = new java.util.concurrent.TimeoutException("$");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        java.lang.Character[] charArray1 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList2 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList2, charArray1);
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList6 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList6, charArray5);
        boolean boolean8 = charList2.removeAll((java.util.Collection<java.lang.Character>) charList6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Character> charList11 = charList6.subList(31, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        java.time.Instant instant1 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant3 = instant1.minusMillis((long) 'x');
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit5 = chronoField4.getRangeUnit();
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.UTC;
        boolean boolean10 = chronoField8.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset9);
        java.time.format.TextStyle textStyle11 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle12 = textStyle11.asNormal();
        java.util.Locale locale14 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet15 = locale14.getExtensionKeys();
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getDisplayCountry();
        java.lang.String str19 = locale14.getDisplayScript(locale17);
        java.lang.String str20 = zoneOffset9.getDisplayName(textStyle11, locale14);
        int int21 = zoneOffset9.getTotalSeconds();
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset9);
        java.time.LocalDateTime localDateTime24 = localDateTime22.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime26 = temporalUnit5.addTo(localDateTime22, (long) 'a');
        boolean boolean27 = instant3.isSupported(temporalUnit5);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField4.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit5 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit5.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField8.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + textStyle11 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle11.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle12 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle12.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Z" + "'", str20, "Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.Period period26 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period28 = period26.plusYears((long) (short) 0);
        java.time.Period period30 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod31 = period28.plus((java.time.temporal.TemporalAmount) period30);
        java.time.chrono.ChronoPeriod chronoPeriod33 = period30.multipliedBy((int) '#');
        java.lang.String str34 = period30.toString();
        java.time.temporal.ChronoField chronoField37 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        boolean boolean39 = chronoField37.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset38);
        java.time.format.TextStyle textStyle40 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle41 = textStyle40.asNormal();
        java.util.Locale locale43 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet44 = locale43.getExtensionKeys();
        java.util.Locale locale46 = new java.util.Locale("");
        java.lang.String str47 = locale46.getDisplayCountry();
        java.lang.String str48 = locale43.getDisplayScript(locale46);
        java.lang.String str49 = zoneOffset38.getDisplayName(textStyle40, locale43);
        int int50 = zoneOffset38.getTotalSeconds();
        java.time.LocalDateTime localDateTime51 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset38);
        java.time.LocalDateTime localDateTime53 = localDateTime51.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset54 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime55 = localDateTime53.atZone((java.time.ZoneId) zoneOffset54);
        java.time.temporal.ChronoField chronoField56 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset57 = java.time.ZoneOffset.UTC;
        boolean boolean58 = chronoField56.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset57);
        java.time.ZonedDateTime zonedDateTime59 = java.time.ZonedDateTime.of(localDateTime53, (java.time.ZoneId) zoneOffset57);
        java.time.DayOfWeek dayOfWeek60 = zonedDateTime59.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime62 = zonedDateTime59.withMinute((int) (byte) 10);
        int int63 = zonedDateTime62.getNano();
        java.time.temporal.Temporal temporal64 = period30.addTo((java.time.temporal.Temporal) zonedDateTime62);
        java.time.LocalDate localDate66 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int67 = localDate66.getMonthValue();
        int int68 = localDate66.getDayOfYear();
        java.time.LocalDate localDate70 = localDate66.withYear((int) ' ');
        java.time.chrono.Era era71 = localDate66.getEra();
        java.time.LocalDate localDate73 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate75 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int76 = localDate75.getMonthValue();
        int int77 = localDate75.getDayOfYear();
        boolean boolean78 = localDate73.isAfter((java.time.chrono.ChronoLocalDate) localDate75);
        boolean boolean79 = localDate66.isEqual((java.time.chrono.ChronoLocalDate) localDate75);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime80 = zonedDateTime62.with((java.time.temporal.TemporalAdjuster) localDate66);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime81 = localDateChronoZonedDateTime80.toLocalDateTime();
        java.time.ZoneOffset zoneOffset82 = localDateChronoZonedDateTime80.getOffset();
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime83 = zonedDateTime24.withZoneSameLocal((java.time.ZoneId) zoneOffset82);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(chronoPeriod31);
        org.junit.Assert.assertNotNull(chronoPeriod33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "P-1M" + "'", str34, "P-1M");
        org.junit.Assert.assertTrue("'" + chronoField37 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField37.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + textStyle40 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle40.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle41 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle41.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertNotNull(charSet44);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Z" + "'", str49, "Z");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(zoneOffset54);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime55);
        org.junit.Assert.assertTrue("'" + chronoField56 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField56.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(zonedDateTime59);
        org.junit.Assert.assertTrue("'" + dayOfWeek60 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek60.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 97 + "'", int63 == 97);
        org.junit.Assert.assertNotNull(temporal64);
        org.junit.Assert.assertNotNull(localDate66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 11 + "'", int68 == 11);
        org.junit.Assert.assertNotNull(localDate70);
        org.junit.Assert.assertTrue("'" + era71 + "' != '" + java.time.chrono.IsoEra.CE + "'", era71.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(localDate73);
        org.junit.Assert.assertNotNull(localDate75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 11 + "'", int77 == 11);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime80);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime81);
        org.junit.Assert.assertNotNull(zoneOffset82);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime83);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        java.security.InvalidKeyException invalidKeyException1 = new java.security.InvalidKeyException("Jan 1, 1970 12:00:00 AM");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.Period period5 = period3.minusDays(10L);
        java.time.chrono.ChronoPeriod chronoPeriod6 = period3.negated();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(chronoPeriod6);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.HOURS;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = timeUnit0.convert((long) (byte) -1, timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeUnit0);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        java.time.Duration duration2 = java.time.Duration.ofSeconds(7187392471159151072L, (long) 11);
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.lang.Character[] charArray4 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList5 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList5, charArray4);
        java.lang.Character[] charArray8 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList9 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList9, charArray8);
        boolean boolean11 = charList5.removeAll((java.util.Collection<java.lang.Character>) charList9);
        java.util.ListIterator<java.lang.Character> charItor12 = charList5.listIterator();
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap15 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap18 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean20 = charListMap18.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray22 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList23 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList23, charArray22);
        int[] intArray31 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream32 = java.util.stream.IntStream.of(intArray31);
        java.util.stream.IntStream intStream33 = charListMap18.put(charList23, intStream32);
        int[] intArray40 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream41 = java.util.stream.IntStream.of(intArray40);
        java.util.Spliterator<java.lang.Integer> intSpliterator42 = intStream41.spliterator();
        java.util.stream.IntStream intStream43 = charListMap15.put(charList23, intStream41);
        int[] intArray50 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream51 = java.util.stream.IntStream.of(intArray50);
        boolean boolean52 = charListMap2.replace(charList5, intStream41, intStream51);
        java.util.function.IntPredicate intPredicate53 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = intStream41.anyMatch(intPredicate53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charItor12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream32);
        org.junit.Assert.assertNull(intStream33);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream41);
        org.junit.Assert.assertNotNull(intSpliterator42);
        org.junit.Assert.assertNull(intStream43);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintWriter printWriter3 = new java.io.PrintWriter((java.io.OutputStream) filterOutputStream1, true);
        char[] charArray8 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer9 = java.nio.CharBuffer.wrap(charArray8);
        java.nio.CharBuffer charBuffer11 = charBuffer9.put('#');
        char[] charArray13 = new char[] { '#' };
        java.nio.CharBuffer charBuffer14 = charBuffer9.get(charArray13);
        printWriter3.write(charArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Writer writer19 = printWriter3.append((java.lang.CharSequence) "1969-12-27T20:10:16.000000097Z", 365, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -365");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, 4, a,  ]");
        org.junit.Assert.assertNotNull(charBuffer9);
        org.junit.Assert.assertNotNull(charBuffer11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4]");
        org.junit.Assert.assertNotNull(charBuffer14);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.OptionalDouble optionalDouble1 = doubleStream0.max();
        java.util.DoubleSummaryStatistics doubleSummaryStatistics2 = new java.util.DoubleSummaryStatistics();
        doubleSummaryStatistics2.accept((double) 10);
        double double5 = doubleSummaryStatistics2.getAverage();
        optionalDouble1.ifPresent((java.util.function.DoubleConsumer) doubleSummaryStatistics2);
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals(doubleSummaryStatistics2.toString(), "DoubleSummaryStatistics{count=1, sum=10.000000, min=10.000000, average=10.000000, max=10.000000}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime26 = zonedDateTime24.plusDays((-359984L));
        java.time.Period period28 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period30 = period28.plusYears((long) (short) 0);
        java.time.Period period32 = period28.plusMonths((long) (byte) 0);
        java.time.ZonedDateTime zonedDateTime33 = zonedDateTime26.plus((java.time.temporal.TemporalAmount) period32);
        java.time.chrono.ChronoPeriod chronoPeriod34 = period32.negated();
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertNotNull(zonedDateTime26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(zonedDateTime33);
        org.junit.Assert.assertNotNull(chronoPeriod34);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        java.time.Period period1 = java.time.Period.ofMonths(4210);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.UTC;
        boolean boolean6 = chronoField4.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset5);
        java.time.format.TextStyle textStyle7 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle8 = textStyle7.asNormal();
        java.util.Locale locale10 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet11 = locale10.getExtensionKeys();
        java.util.Locale locale13 = new java.util.Locale("");
        java.lang.String str14 = locale13.getDisplayCountry();
        java.lang.String str15 = locale10.getDisplayScript(locale13);
        java.lang.String str16 = zoneOffset5.getDisplayName(textStyle7, locale10);
        int int17 = zoneOffset5.getTotalSeconds();
        java.time.LocalDateTime localDateTime18 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset5);
        java.time.LocalDateTime localDateTime20 = localDateTime18.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField23 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        boolean boolean25 = chronoField23.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset24);
        java.time.format.TextStyle textStyle26 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle27 = textStyle26.asNormal();
        java.util.Locale locale29 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet30 = locale29.getExtensionKeys();
        java.util.Locale locale32 = new java.util.Locale("");
        java.lang.String str33 = locale32.getDisplayCountry();
        java.lang.String str34 = locale29.getDisplayScript(locale32);
        java.lang.String str35 = zoneOffset24.getDisplayName(textStyle26, locale29);
        int int36 = zoneOffset24.getTotalSeconds();
        java.time.LocalDateTime localDateTime37 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset24);
        java.time.LocalDateTime localDateTime39 = localDateTime37.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset40 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime41 = localDateTime39.atZone((java.time.ZoneId) zoneOffset40);
        java.time.temporal.ChronoField chronoField42 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset43 = java.time.ZoneOffset.UTC;
        boolean boolean44 = chronoField42.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset43);
        java.time.ZonedDateTime zonedDateTime45 = java.time.ZonedDateTime.of(localDateTime39, (java.time.ZoneId) zoneOffset43);
        java.time.DayOfWeek dayOfWeek46 = zonedDateTime45.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime48 = zonedDateTime45.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal49 = localDateTime18.adjustInto((java.time.temporal.Temporal) zonedDateTime48);
        java.time.ZonedDateTime zonedDateTime51 = zonedDateTime48.withSecond((int) (byte) 1);
        java.time.temporal.ChronoField chronoField52 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.ValueRange valueRange53 = chronoField52.range();
        boolean boolean54 = zonedDateTime48.isSupported((java.time.temporal.TemporalField) chronoField52);
        boolean boolean55 = period1.equals((java.lang.Object) zonedDateTime48);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField4.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + textStyle7 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle7.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle8 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle8.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Z" + "'", str16, "Z");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField23 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField23.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + textStyle26 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle26.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle27 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle27.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNotNull(charSet30);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Z" + "'", str35, "Z");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(zoneOffset40);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime41);
        org.junit.Assert.assertTrue("'" + chronoField42 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField42.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(zonedDateTime45);
        org.junit.Assert.assertTrue("'" + dayOfWeek46 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek46.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime48);
        org.junit.Assert.assertNotNull(temporal49);
        org.junit.Assert.assertNotNull(zonedDateTime51);
        org.junit.Assert.assertTrue("'" + chronoField52 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField52.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(valueRange53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        int int3 = localDate1.getDayOfYear();
        java.time.LocalDate localDate5 = localDate1.withYear((int) ' ');
        java.time.chrono.Era era6 = localDate1.getEra();
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = era6.query(booleanTemporalQuery7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + era6 + "' != '" + java.time.chrono.IsoEra.CE + "'", era6.equals(java.time.chrono.IsoEra.CE));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano((int) (byte) 0);
        java.time.OffsetTime offsetTime4 = offsetTime2.minusSeconds((long) 'x');
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(offsetTime4);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.format.TextStyle textStyle24 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle25 = textStyle24.asNormal();
        java.util.Locale locale27 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet28 = locale27.getExtensionKeys();
        java.util.Locale locale30 = new java.util.Locale("");
        java.lang.String str31 = locale30.getDisplayCountry();
        java.lang.String str32 = locale27.getDisplayScript(locale30);
        java.lang.String str33 = zoneOffset22.getDisplayName(textStyle24, locale27);
        int int34 = zoneOffset22.getTotalSeconds();
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset22);
        java.time.LocalDateTime localDateTime37 = localDateTime35.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime39 = localDateTime37.atZone((java.time.ZoneId) zoneOffset38);
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.UTC;
        boolean boolean42 = chronoField40.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset41);
        java.time.ZonedDateTime zonedDateTime43 = java.time.ZonedDateTime.of(localDateTime37, (java.time.ZoneId) zoneOffset41);
        java.time.DayOfWeek dayOfWeek44 = zonedDateTime43.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime46 = zonedDateTime43.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal47 = localDateTime16.adjustInto((java.time.temporal.Temporal) zonedDateTime46);
        java.time.LocalDateTime localDateTime48 = zonedDateTime46.toLocalDateTime();
        java.time.LocalDateTime localDateTime50 = localDateTime48.plusWeeks((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + textStyle24 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle24.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle25 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle25.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Z" + "'", str33, "Z");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime39);
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField40.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(zonedDateTime43);
        org.junit.Assert.assertTrue("'" + dayOfWeek44 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek44.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime46);
        org.junit.Assert.assertNotNull(temporal47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        charSet2.clear();
        java.util.Spliterator<java.lang.Character> charSpliterator4 = charSet2.spliterator();
        int int5 = charSet2.size();
        charSet2.clear();
        java.time.LocalTime localTime8 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology9 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime8);
        java.time.LocalTime localTime11 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology12 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime11);
        java.time.LocalTime localTime14 = localTime11.minusHours(1L);
        boolean boolean15 = localTime8.isBefore(localTime14);
        java.time.LocalTime localTime17 = localTime8.minusMinutes((long) 0);
        java.time.LocalDate localDate19 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int20 = localDate19.getMonthValue();
        int int21 = localDate19.getDayOfYear();
        java.time.LocalDate localDate23 = localDate19.withYear((int) ' ');
        java.time.LocalDateTime localDateTime24 = localTime8.atDate(localDate19);
        boolean boolean25 = charSet2.contains((java.lang.Object) localTime8);
        java.security.AccessControlException accessControlException27 = new java.security.AccessControlException("");
        java.util.InvalidPropertiesFormatException invalidPropertiesFormatException28 = new java.util.InvalidPropertiesFormatException((java.lang.Throwable) accessControlException27);
        java.util.InvalidPropertiesFormatException invalidPropertiesFormatException29 = new java.util.InvalidPropertiesFormatException((java.lang.Throwable) accessControlException27);
        boolean boolean30 = localTime8.equals((java.lang.Object) invalidPropertiesFormatException29);
        long long31 = localTime8.toNanoOfDay();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(charSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11 + "'", int21 == 11);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        java.net.URLConnection.setDefaultAllowUserInteraction(true);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        java.io.File file1 = new java.io.File("java.time");
        java.io.File file2 = file1.getAbsoluteFile();
        java.io.File file3 = file1.getCanonicalFile();
        boolean boolean5 = file1.setExecutable(false);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "java.time");
        org.junit.Assert.assertNotNull(file2);
// flaky:         org.junit.Assert.assertEquals(file2.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/experiment/java.time");
        org.junit.Assert.assertNotNull(file3);
// flaky:         org.junit.Assert.assertEquals(file3.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/experiment/java.time");
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setRegion("1970-W02-7");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 1970-W02-7 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        int int3 = localDate1.getDayOfYear();
        java.time.LocalDate localDate5 = localDate1.withYear((int) ' ');
        java.time.chrono.Era era6 = localDate1.getEra();
        java.time.LocalDate localDate8 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate10 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int11 = localDate10.getMonthValue();
        int int12 = localDate10.getDayOfYear();
        boolean boolean13 = localDate8.isAfter((java.time.chrono.ChronoLocalDate) localDate10);
        boolean boolean14 = localDate1.isEqual((java.time.chrono.ChronoLocalDate) localDate10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime17 = localDate1.atTime((-1), 7);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + era6 + "' != '" + java.time.chrono.IsoEra.CE + "'", era6.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        java.lang.Character[] charArray4 = new java.lang.Character[] { ' ', '4', ':', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet5 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet5, charArray4);
        boolean boolean7 = charSet5.isEmpty();
        java.util.Spliterator<java.lang.Character> charSpliterator8 = charSet5.spliterator();
        java.util.stream.Stream<java.lang.Character> charStream9 = charSet5.stream();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charSpliterator8);
        org.junit.Assert.assertNotNull(charStream9);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.LocalTime localTime4 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology5 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime7 = localTime4.minusHours(1L);
        boolean boolean8 = localTime1.isBefore(localTime7);
        java.time.LocalTime localTime10 = localTime1.minusMinutes((long) 0);
        java.time.LocalTime localTime12 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology13 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.LocalTime localTime15 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology16 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime15);
        java.time.LocalTime localTime18 = localTime15.minusHours(1L);
        boolean boolean19 = localTime12.isBefore(localTime18);
        java.time.LocalTime localTime21 = localTime12.minusMinutes((long) 0);
        java.time.LocalTime localTime23 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology24 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime23);
        java.time.LocalTime localTime26 = localTime23.minusHours(1L);
        boolean boolean27 = localTime21.isAfter(localTime23);
        int int28 = localTime1.compareTo(localTime21);
        java.time.LocalTime localTime30 = localTime21.minusSeconds(364740218880L);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localTime30);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream6 = doubleStream5.parallel();
        java.util.stream.DoubleStream doubleStream7 = doubleStream6.sequential();
        java.util.DoubleSummaryStatistics doubleSummaryStatistics8 = new java.util.DoubleSummaryStatistics();
        doubleSummaryStatistics8.accept((double) 10);
        doubleStream7.forEachOrdered((java.util.function.DoubleConsumer) doubleSummaryStatistics8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertEquals(doubleSummaryStatistics8.toString(), "DoubleSummaryStatistics{count=5, sum=43.000000, min=-1.000000, average=8.600000, max=32.000000}");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.chrono.IsoChronology isoChronology4 = period3.getChronology();
        java.time.Instant instant6 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant8 = instant6.minusMillis((long) 'x');
        int int9 = instant8.getNano();
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition10 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD;
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.UTC;
        boolean boolean15 = chronoField13.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset14);
        java.time.format.TextStyle textStyle16 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle17 = textStyle16.asNormal();
        java.util.Locale locale19 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        java.util.Locale locale22 = new java.util.Locale("");
        java.lang.String str23 = locale22.getDisplayCountry();
        java.lang.String str24 = locale19.getDisplayScript(locale22);
        java.lang.String str25 = zoneOffset14.getDisplayName(textStyle16, locale19);
        int int26 = zoneOffset14.getTotalSeconds();
        java.time.LocalDateTime localDateTime27 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset14);
        java.time.LocalDateTime localDateTime29 = localDateTime27.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime31 = localDateTime27.plusMonths((long) (short) 0);
        java.time.LocalTime localTime32 = localDateTime31.toLocalTime();
        java.time.Instant instant34 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant36 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean37 = instant34.isAfter(instant36);
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.UTC;
        boolean boolean42 = chronoField40.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset41);
        java.time.format.TextStyle textStyle43 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle44 = textStyle43.asNormal();
        java.util.Locale locale46 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet47 = locale46.getExtensionKeys();
        java.util.Locale locale49 = new java.util.Locale("");
        java.lang.String str50 = locale49.getDisplayCountry();
        java.lang.String str51 = locale46.getDisplayScript(locale49);
        java.lang.String str52 = zoneOffset41.getDisplayName(textStyle43, locale46);
        int int53 = zoneOffset41.getTotalSeconds();
        java.time.LocalDateTime localDateTime54 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset41);
        java.time.LocalDateTime localDateTime56 = localDateTime54.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset57 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime58 = localDateTime56.atZone((java.time.ZoneId) zoneOffset57);
        java.time.temporal.ChronoField chronoField59 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset60 = java.time.ZoneOffset.UTC;
        boolean boolean61 = chronoField59.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset60);
        java.time.ZonedDateTime zonedDateTime62 = java.time.ZonedDateTime.of(localDateTime56, (java.time.ZoneId) zoneOffset60);
        java.time.ZonedDateTime zonedDateTime63 = java.time.ZonedDateTime.ofInstant(instant34, (java.time.ZoneId) zoneOffset60);
        java.time.temporal.ChronoField chronoField66 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset67 = java.time.ZoneOffset.UTC;
        boolean boolean68 = chronoField66.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset67);
        java.time.format.TextStyle textStyle69 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle70 = textStyle69.asNormal();
        java.util.Locale locale72 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet73 = locale72.getExtensionKeys();
        java.util.Locale locale75 = new java.util.Locale("");
        java.lang.String str76 = locale75.getDisplayCountry();
        java.lang.String str77 = locale72.getDisplayScript(locale75);
        java.lang.String str78 = zoneOffset67.getDisplayName(textStyle69, locale72);
        int int79 = zoneOffset67.getTotalSeconds();
        java.time.LocalDateTime localDateTime80 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset67);
        java.time.LocalDateTime localDateTime81 = timeDefinition10.createDateTime(localDateTime31, zoneOffset60, zoneOffset67);
        java.time.Clock clock82 = java.time.Clock.fixed(instant8, (java.time.ZoneId) zoneOffset60);
        java.time.Duration duration84 = java.time.Duration.ofNanos((long) (byte) 10);
        java.time.Duration duration86 = duration84.plusMillis((long) (byte) 100);
        java.time.Duration duration88 = duration86.minusMillis((long) (byte) 100);
        java.time.Clock clock89 = java.time.Clock.offset(clock82, duration88);
        java.time.LocalTime localTime90 = java.time.LocalTime.now(clock89);
        java.time.LocalDate localDate91 = isoChronology4.dateNow(clock89);
        long long92 = localDate91.toEpochDay();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(isoChronology4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + timeDefinition10 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD + "'", timeDefinition10.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD));
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField13.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + textStyle16 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle16.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle17 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle17.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Z" + "'", str25, "Z");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField40.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + textStyle43 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle43.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle44 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle44.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(charSet47);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Z" + "'", str52, "Z");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(zoneOffset57);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime58);
        org.junit.Assert.assertTrue("'" + chronoField59 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField59.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(zonedDateTime62);
        org.junit.Assert.assertNotNull(zonedDateTime63);
        org.junit.Assert.assertTrue("'" + chronoField66 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField66.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + textStyle69 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle69.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle70 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle70.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertNotNull(charSet73);
        org.junit.Assert.assertEquals(locale75.toString(), "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Z" + "'", str78, "Z");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(clock82);
        org.junit.Assert.assertNotNull(duration84);
        org.junit.Assert.assertNotNull(duration86);
        org.junit.Assert.assertNotNull(duration88);
        org.junit.Assert.assertNotNull(clock89);
        org.junit.Assert.assertNotNull(localTime90);
        org.junit.Assert.assertNotNull(localDate91);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 0L + "'", long92 == 0L);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate3 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int4 = localDate3.getMonthValue();
        int int5 = localDate3.getDayOfYear();
        boolean boolean6 = localDate1.isAfter((java.time.chrono.ChronoLocalDate) localDate3);
        java.time.format.DateTimeFormatter dateTimeFormatter7 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray9 = new java.time.temporal.TemporalField[] { chronoField8 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet10 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet10, temporalFieldArray9);
        java.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet10);
        java.lang.String str13 = localDate3.format(dateTimeFormatter7);
        java.time.chrono.Chronology chronology14 = localDate3.getChronology();
        java.time.LocalDate localDate16 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int17 = localDate16.getMonthValue();
        int int18 = localDate16.getDayOfYear();
        java.time.LocalDate localDate20 = localDate16.withYear((int) ' ');
        java.time.chrono.Era era21 = localDate16.getEra();
        java.time.DayOfWeek dayOfWeek22 = java.time.DayOfWeek.THURSDAY;
        java.time.temporal.ChronoField chronoField23 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
        boolean boolean24 = dayOfWeek22.isSupported((java.time.temporal.TemporalField) chronoField23);
        boolean boolean25 = era21.isSupported((java.time.temporal.TemporalField) chronoField23);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate29 = chronology14.date(era21, 97, 4210, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 4210");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField8.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-W02-7" + "'", str13, "1970-W02-7");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + era21 + "' != '" + java.time.chrono.IsoEra.CE + "'", era21.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + dayOfWeek22 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek22.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + chronoField23 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH + "'", chronoField23.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.util.Set<java.util.Map.Entry<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>> charListEntrySet3 = charListMap2.entrySet();
        java.util.Set<java.util.Map.Entry<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>> charListEntrySet4 = charListMap2.entrySet();
        org.junit.Assert.assertNotNull(charListEntrySet3);
        org.junit.Assert.assertNotNull(charListEntrySet4);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MILLISECONDS;
        long long2 = timeUnit0.toMinutes((long) (short) 1);
        java.util.concurrent.TimeUnit timeUnit4 = java.util.concurrent.TimeUnit.SECONDS;
        long long5 = timeUnit0.convert((long) 16, timeUnit4);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(timeUnit4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 16000L + "'", long5 == 16000L);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        java.time.format.ResolverStyle resolverStyle0 = java.time.format.ResolverStyle.SMART;
        org.junit.Assert.assertTrue("'" + resolverStyle0 + "' != '" + java.time.format.ResolverStyle.SMART + "'", resolverStyle0.equals(java.time.format.ResolverStyle.SMART));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.chrono.IsoChronology isoChronology4 = period3.getChronology();
        java.time.Instant instant6 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant8 = instant6.minusMillis((long) 'x');
        int int9 = instant8.getNano();
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition10 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD;
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.UTC;
        boolean boolean15 = chronoField13.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset14);
        java.time.format.TextStyle textStyle16 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle17 = textStyle16.asNormal();
        java.util.Locale locale19 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        java.util.Locale locale22 = new java.util.Locale("");
        java.lang.String str23 = locale22.getDisplayCountry();
        java.lang.String str24 = locale19.getDisplayScript(locale22);
        java.lang.String str25 = zoneOffset14.getDisplayName(textStyle16, locale19);
        int int26 = zoneOffset14.getTotalSeconds();
        java.time.LocalDateTime localDateTime27 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset14);
        java.time.LocalDateTime localDateTime29 = localDateTime27.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime31 = localDateTime27.plusMonths((long) (short) 0);
        java.time.LocalTime localTime32 = localDateTime31.toLocalTime();
        java.time.Instant instant34 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant36 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean37 = instant34.isAfter(instant36);
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.UTC;
        boolean boolean42 = chronoField40.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset41);
        java.time.format.TextStyle textStyle43 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle44 = textStyle43.asNormal();
        java.util.Locale locale46 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet47 = locale46.getExtensionKeys();
        java.util.Locale locale49 = new java.util.Locale("");
        java.lang.String str50 = locale49.getDisplayCountry();
        java.lang.String str51 = locale46.getDisplayScript(locale49);
        java.lang.String str52 = zoneOffset41.getDisplayName(textStyle43, locale46);
        int int53 = zoneOffset41.getTotalSeconds();
        java.time.LocalDateTime localDateTime54 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset41);
        java.time.LocalDateTime localDateTime56 = localDateTime54.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset57 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime58 = localDateTime56.atZone((java.time.ZoneId) zoneOffset57);
        java.time.temporal.ChronoField chronoField59 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset60 = java.time.ZoneOffset.UTC;
        boolean boolean61 = chronoField59.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset60);
        java.time.ZonedDateTime zonedDateTime62 = java.time.ZonedDateTime.of(localDateTime56, (java.time.ZoneId) zoneOffset60);
        java.time.ZonedDateTime zonedDateTime63 = java.time.ZonedDateTime.ofInstant(instant34, (java.time.ZoneId) zoneOffset60);
        java.time.temporal.ChronoField chronoField66 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset67 = java.time.ZoneOffset.UTC;
        boolean boolean68 = chronoField66.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset67);
        java.time.format.TextStyle textStyle69 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle70 = textStyle69.asNormal();
        java.util.Locale locale72 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet73 = locale72.getExtensionKeys();
        java.util.Locale locale75 = new java.util.Locale("");
        java.lang.String str76 = locale75.getDisplayCountry();
        java.lang.String str77 = locale72.getDisplayScript(locale75);
        java.lang.String str78 = zoneOffset67.getDisplayName(textStyle69, locale72);
        int int79 = zoneOffset67.getTotalSeconds();
        java.time.LocalDateTime localDateTime80 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset67);
        java.time.LocalDateTime localDateTime81 = timeDefinition10.createDateTime(localDateTime31, zoneOffset60, zoneOffset67);
        java.time.Clock clock82 = java.time.Clock.fixed(instant8, (java.time.ZoneId) zoneOffset60);
        java.time.Duration duration84 = java.time.Duration.ofNanos((long) (byte) 10);
        java.time.Duration duration86 = duration84.plusMillis((long) (byte) 100);
        java.time.Duration duration88 = duration86.minusMillis((long) (byte) 100);
        java.time.Clock clock89 = java.time.Clock.offset(clock82, duration88);
        java.time.LocalTime localTime90 = java.time.LocalTime.now(clock89);
        java.time.LocalDate localDate91 = isoChronology4.dateNow(clock89);
        java.time.OffsetTime offsetTime92 = java.time.OffsetTime.now(clock89);
        java.time.Instant instant93 = java.time.Instant.now(clock89);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(isoChronology4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + timeDefinition10 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD + "'", timeDefinition10.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD));
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField13.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + textStyle16 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle16.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle17 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle17.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Z" + "'", str25, "Z");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField40.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + textStyle43 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle43.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle44 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle44.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(charSet47);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Z" + "'", str52, "Z");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(zoneOffset57);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime58);
        org.junit.Assert.assertTrue("'" + chronoField59 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField59.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(zonedDateTime62);
        org.junit.Assert.assertNotNull(zonedDateTime63);
        org.junit.Assert.assertTrue("'" + chronoField66 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField66.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + textStyle69 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle69.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle70 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle70.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertNotNull(charSet73);
        org.junit.Assert.assertEquals(locale75.toString(), "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Z" + "'", str78, "Z");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(clock82);
        org.junit.Assert.assertNotNull(duration84);
        org.junit.Assert.assertNotNull(duration86);
        org.junit.Assert.assertNotNull(duration88);
        org.junit.Assert.assertNotNull(clock89);
        org.junit.Assert.assertNotNull(localTime90);
        org.junit.Assert.assertNotNull(localDate91);
        org.junit.Assert.assertNotNull(offsetTime92);
        org.junit.Assert.assertNotNull(instant93);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        boolean boolean7 = localDate4.isSupported(temporalUnit6);
        boolean boolean8 = localDate1.isBefore((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.UTC;
        boolean boolean11 = chronoField9.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset10);
        java.time.format.TextStyle textStyle12 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle13 = textStyle12.asNormal();
        java.util.Locale locale15 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet16 = locale15.getExtensionKeys();
        java.util.Locale locale18 = new java.util.Locale("");
        java.lang.String str19 = locale18.getDisplayCountry();
        java.lang.String str20 = locale15.getDisplayScript(locale18);
        java.lang.String str21 = zoneOffset10.getDisplayName(textStyle12, locale15);
        java.time.LocalTime localTime22 = java.time.LocalTime.now((java.time.ZoneId) zoneOffset10);
        int int23 = localTime22.getNano();
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime24 = localDate1.atTime(localTime22);
        java.lang.String str26 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) localTime22, "J");
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField9.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + textStyle12 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle12.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle13 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle13.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Z" + "'", str21, "Z");
        org.junit.Assert.assertNotNull(localTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 496000000 + "'", int23 == 496000000);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "LocalTime" + "'", str26, "LocalTime");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.stream.IntStream intStream8 = intStream7.sequential();
        java.util.stream.IntStream intStream9 = intStream8.parallel();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        java.text.AttributedCharacterIterator.Attribute attribute0 = java.text.AttributedCharacterIterator.Attribute.INPUT_METHOD_SEGMENT;
        org.junit.Assert.assertNotNull(attribute0);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        java.util.Date date1 = new java.util.Date((long) (short) 100);
        int int2 = date1.getDate();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        byte byte7 = byteBuffer6.get();
        int int8 = byteBuffer6.remaining();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintWriter printWriter3 = new java.io.PrintWriter((java.io.OutputStream) filterOutputStream1, true);
        // The following exception was thrown during execution in test generation
        try {
            printWriter3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.Period period5 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod6 = period3.plus((java.time.temporal.TemporalAmount) period5);
        java.time.chrono.ChronoPeriod chronoPeriod8 = period5.multipliedBy((int) '#');
        java.lang.String str9 = period5.toString();
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.UTC;
        boolean boolean14 = chronoField12.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset13);
        java.time.format.TextStyle textStyle15 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle16 = textStyle15.asNormal();
        java.util.Locale locale18 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        java.util.Locale locale21 = new java.util.Locale("");
        java.lang.String str22 = locale21.getDisplayCountry();
        java.lang.String str23 = locale18.getDisplayScript(locale21);
        java.lang.String str24 = zoneOffset13.getDisplayName(textStyle15, locale18);
        int int25 = zoneOffset13.getTotalSeconds();
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset13);
        java.time.LocalDateTime localDateTime28 = localDateTime26.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset29 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime30 = localDateTime28.atZone((java.time.ZoneId) zoneOffset29);
        java.time.temporal.ChronoField chronoField31 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset32 = java.time.ZoneOffset.UTC;
        boolean boolean33 = chronoField31.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset32);
        java.time.ZonedDateTime zonedDateTime34 = java.time.ZonedDateTime.of(localDateTime28, (java.time.ZoneId) zoneOffset32);
        java.time.DayOfWeek dayOfWeek35 = zonedDateTime34.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime37 = zonedDateTime34.withMinute((int) (byte) 10);
        int int38 = zonedDateTime37.getNano();
        java.time.temporal.Temporal temporal39 = period5.addTo((java.time.temporal.Temporal) zonedDateTime37);
        java.time.temporal.ChronoField chronoField42 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset43 = java.time.ZoneOffset.UTC;
        boolean boolean44 = chronoField42.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset43);
        java.time.format.TextStyle textStyle45 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle46 = textStyle45.asNormal();
        java.util.Locale locale48 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet49 = locale48.getExtensionKeys();
        java.util.Locale locale51 = new java.util.Locale("");
        java.lang.String str52 = locale51.getDisplayCountry();
        java.lang.String str53 = locale48.getDisplayScript(locale51);
        java.lang.String str54 = zoneOffset43.getDisplayName(textStyle45, locale48);
        int int55 = zoneOffset43.getTotalSeconds();
        java.time.LocalDateTime localDateTime56 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset43);
        java.time.ZonedDateTime zonedDateTime57 = zonedDateTime37.withZoneSameInstant((java.time.ZoneId) zoneOffset43);
        java.time.temporal.ChronoField chronoField58 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit59 = chronoField58.getRangeUnit();
        java.time.ZonedDateTime zonedDateTime60 = zonedDateTime57.truncatedTo(temporalUnit59);
        int int61 = zonedDateTime57.getMonthValue();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(chronoPeriod6);
        org.junit.Assert.assertNotNull(chronoPeriod8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P-1M" + "'", str9, "P-1M");
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField12.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + textStyle15 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle15.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle16 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle16.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z" + "'", str24, "Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(zoneOffset29);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime30);
        org.junit.Assert.assertTrue("'" + chronoField31 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField31.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(zonedDateTime34);
        org.junit.Assert.assertTrue("'" + dayOfWeek35 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek35.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertNotNull(temporal39);
        org.junit.Assert.assertTrue("'" + chronoField42 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField42.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + textStyle45 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle45.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle46 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle46.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNotNull(charSet49);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Z" + "'", str54, "Z");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(zonedDateTime57);
        org.junit.Assert.assertTrue("'" + chronoField58 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField58.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit59 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit59.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(zonedDateTime60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 12 + "'", int61 == 12);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int5 = localDate4.getMonthValue();
        int int6 = localDate4.getDayOfYear();
        boolean boolean7 = localDate2.isAfter((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.OffsetDateTime offsetDateTime8 = offsetTime0.atDate(localDate2);
        java.time.LocalDate localDate10 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int11 = localDate10.getMonthValue();
        java.time.LocalDate localDate13 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField14.getRangeUnit();
        boolean boolean16 = localDate13.isSupported(temporalUnit15);
        boolean boolean17 = localDate10.isBefore((java.time.chrono.ChronoLocalDate) localDate13);
        java.time.format.DateTimeFormatter dateTimeFormatter18 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray20 = new java.time.temporal.TemporalField[] { chronoField19 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet21 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet21, temporalFieldArray20);
        java.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter18.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet21);
        java.lang.String str24 = localDate13.format(dateTimeFormatter18);
        java.time.LocalDateTime localDateTime25 = localDate13.atStartOfDay();
        java.time.LocalDate localDate27 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int28 = localDate27.getMonthValue();
        int int29 = localDate27.getDayOfYear();
        java.time.LocalDate localDate31 = localDate27.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit33 = chronoField32.getRangeUnit();
        long long34 = localDate13.until((java.time.temporal.Temporal) localDate27, temporalUnit33);
        java.time.OffsetDateTime offsetDateTime35 = offsetTime0.atDate(localDate27);
        java.time.temporal.ChronoField chronoField36 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean37 = offsetDateTime35.isSupported((java.time.temporal.TemporalField) chronoField36);
        java.time.OffsetDateTime offsetDateTime39 = offsetDateTime35.plusWeeks((long) 31);
        java.time.OffsetDateTime offsetDateTime41 = offsetDateTime35.plusMonths((long) 7);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField19.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-W02-7" + "'", str24, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit33 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit33.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertTrue("'" + chronoField36 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField36.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(offsetDateTime39);
        org.junit.Assert.assertNotNull(offsetDateTime41);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        java.net.URI uRI3 = new java.net.URI("Z", "P-1M", "1970-W01-4");
        java.lang.String str4 = uRI3.getRawPath();
        java.lang.String str5 = uRI3.toASCIIString();
        java.lang.String str6 = uRI3.getQuery();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Z:P-1M#1970-W01-4" + "'", str5, "Z:P-1M#1970-W01-4");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        java.nio.ShortBuffer shortBuffer1 = java.nio.ShortBuffer.allocate(1);
        java.nio.ShortBuffer shortBuffer2 = shortBuffer1.asReadOnlyBuffer();
        java.nio.ShortBuffer shortBuffer4 = shortBuffer1.put((short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer7 = shortBuffer4.put(4, (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortBuffer1);
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer4);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        java.net.URISyntaxException uRISyntaxException2 = new java.net.URISyntaxException("OptionalLong[0]", "Jan 1, 1970 12:00:00 AM");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        java.io.File file3 = file2.getCanonicalFile();
        long long4 = file3.getUsableSpace();
        java.net.URI uRI5 = file3.toURI();
        java.lang.String str6 = uRI5.toString();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertNotNull(file3);
// flaky:         org.junit.Assert.assertEquals(file3.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/experiment");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 280504102912L + "'", long4 == 280504102912L);
        org.junit.Assert.assertNotNull(uRI5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "file:/experiment/" + "'", str6, "file:/experiment/");
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.ValueRange valueRange3 = chronoField2.range();
        boolean boolean4 = valueRange3.isIntValue();
        long long5 = valueRange3.getMinimum();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer1, (java.lang.Object) valueRange3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(valueRange3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_TIME;
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        java.net.NetworkInterface networkInterface1 = java.net.NetworkInterface.getByIndex((int) 'a');
        org.junit.Assert.assertNull(networkInterface1);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        java.time.format.DecimalStyle decimalStyle0 = java.time.format.DecimalStyle.ofDefaultLocale();
        java.time.format.DecimalStyle decimalStyle2 = decimalStyle0.withDecimalSeparator('x');
        char char3 = decimalStyle2.getZeroDigit();
        char char4 = decimalStyle2.getDecimalSeparator();
        org.junit.Assert.assertNotNull(decimalStyle0);
        org.junit.Assert.assertNotNull(decimalStyle2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '0' + "'", char3 == '0');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'x' + "'", char4 == 'x');
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.putShort((short) 0);
        java.nio.ShortBuffer shortBuffer9 = byteBuffer8.asShortBuffer();
        java.nio.CharBuffer charBuffer10 = byteBuffer8.asCharBuffer();
        byte byte11 = byteBuffer8.get();
        java.lang.String str12 = byteBuffer8.toString();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.nio.HeapByteBuffer[pos=3 lim=5 cap=5]" + "'", str12, "java.nio.HeapByteBuffer[pos=3 lim=5 cap=5]");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId2 = java.time.ZoneId.of("ParseCaseSensitive(false)Value(WeekBasedYear,4,10,EXCEEDS_PAD)'-W'Value(WeekOfWeekBasedYear,2)'-'Value(DayOfWeek,1)[Offset(+HH:MM:ss,'Z')]", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: aliasMap");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit3 = chronoField2.getRangeUnit();
        boolean boolean4 = localDate1.isSupported(temporalUnit3);
        java.time.LocalDate localDate6 = localDate1.plusDays((long) 16384);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
        java.time.temporal.ValueRange valueRange8 = chronoField7.range();
        java.time.temporal.ValueRange valueRange9 = localDate6.range((java.time.temporal.TemporalField) chronoField7);
        long long10 = valueRange9.getMinimum();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField2.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit3 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit3.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH + "'", chronoField7.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
        org.junit.Assert.assertNotNull(valueRange8);
        org.junit.Assert.assertNotNull(valueRange9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime24.minusHours((long) (short) 0);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime28 = zonedDateTime24.withLaterOffsetAtOverlap();
        java.time.ZonedDateTime zonedDateTime30 = zonedDateTime24.plusYears(0L);
        java.time.ZonedDateTime zonedDateTime32 = zonedDateTime24.withMinute(16);
        java.time.LocalDate localDate34 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int35 = localDate34.getMonthValue();
        java.time.LocalDate localDate37 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField38 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit39 = chronoField38.getRangeUnit();
        boolean boolean40 = localDate37.isSupported(temporalUnit39);
        boolean boolean41 = localDate34.isBefore((java.time.chrono.ChronoLocalDate) localDate37);
        java.time.format.DateTimeFormatter dateTimeFormatter42 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField43 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray44 = new java.time.temporal.TemporalField[] { chronoField43 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet45 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet45, temporalFieldArray44);
        java.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter42.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet45);
        java.lang.String str48 = localDate37.format(dateTimeFormatter42);
        java.lang.String str49 = zonedDateTime24.format(dateTimeFormatter42);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime28);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + chronoField38 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField38.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit39 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit39.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertTrue("'" + chronoField43 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField43.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1970-W02-7" + "'", str48, "1970-W02-7");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1969-W52-6Z" + "'", str49, "1969-W52-6Z");
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        java.time.Duration duration0 = java.time.Duration.ZERO;
        org.junit.Assert.assertNotNull(duration0);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        java.lang.Character[] charArray1 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList2 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList2, charArray1);
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList6 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList6, charArray5);
        boolean boolean8 = charList2.removeAll((java.util.Collection<java.lang.Character>) charList6);
        java.lang.Object[] objArray9 = charList6.toArray();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[4]");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        java.lang.Character[] charArray1 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList2 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList2, charArray1);
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList6 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList6, charArray5);
        boolean boolean8 = charList2.removeAll((java.util.Collection<java.lang.Character>) charList6);
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap11 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.util.Set<java.util.Map.Entry<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>> charListEntrySet12 = charListMap11.entrySet();
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap15 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean17 = charListMap15.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray19 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList20 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList20, charArray19);
        int[] intArray28 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream29 = java.util.stream.IntStream.of(intArray28);
        java.util.stream.IntStream intStream30 = charListMap15.put(charList20, intStream29);
        boolean boolean31 = charListMap11.containsKey((java.lang.Object) charListMap15);
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap34 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean36 = charListMap34.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray38 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList39 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList39, charArray38);
        int[] intArray47 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream48 = java.util.stream.IntStream.of(intArray47);
        java.util.stream.IntStream intStream49 = charListMap34.put(charList39, intStream48);
        java.util.Spliterator<java.lang.Character> charSpliterator50 = charList39.spliterator();
        int[] intArray57 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream58 = java.util.stream.IntStream.of(intArray57);
        java.util.stream.IntStream intStream59 = intStream58.sequential();
        java.util.stream.IntStream intStream61 = intStream59.limit((long) 97);
        java.util.stream.IntStream intStream62 = charListMap15.put(charList39, intStream61);
        boolean boolean63 = charList2.removeAll((java.util.Collection<java.lang.Character>) charList39);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charListEntrySet12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream29);
        org.junit.Assert.assertNull(intStream30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream48);
        org.junit.Assert.assertNull(intStream49);
        org.junit.Assert.assertNotNull(charSpliterator50);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream58);
        org.junit.Assert.assertNotNull(intStream59);
        org.junit.Assert.assertNotNull(intStream61);
        org.junit.Assert.assertNotNull(intStream62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
        java.time.temporal.ValueRange valueRange1 = chronoField0.range();
        boolean boolean3 = valueRange1.isValidIntValue((long) 1);
        long long4 = valueRange1.getLargestMinimum();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH + "'", chronoField0.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
        org.junit.Assert.assertNotNull(valueRange1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        char[] charArray4 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap(charArray4);
        java.io.OutputStream outputStream6 = null;
        java.io.FilterOutputStream filterOutputStream7 = new java.io.FilterOutputStream(outputStream6);
        java.io.PrintWriter printWriter9 = new java.io.PrintWriter((java.io.OutputStream) filterOutputStream7, true);
        char[] charArray14 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer15 = java.nio.CharBuffer.wrap(charArray14);
        java.nio.CharBuffer charBuffer17 = charBuffer15.put('#');
        char[] charArray19 = new char[] { '#' };
        java.nio.CharBuffer charBuffer20 = charBuffer15.get(charArray19);
        printWriter9.write(charArray19);
        java.nio.CharBuffer charBuffer22 = charBuffer5.get(charArray19);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, a,  ]");
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4, a,  ]");
        org.junit.Assert.assertNotNull(charBuffer15);
        org.junit.Assert.assertNotNull(charBuffer17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a]");
        org.junit.Assert.assertNotNull(charBuffer20);
        org.junit.Assert.assertNotNull(charBuffer22);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        java.io.File file1 = new java.io.File("java.time");
        java.io.File file2 = file1.getAbsoluteFile();
        java.lang.String str3 = file1.getParent();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "java.time");
        org.junit.Assert.assertNotNull(file2);
// flaky:         org.junit.Assert.assertEquals(file2.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/experiment/java.time");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) ':');
        java.time.Duration duration3 = java.time.Duration.ofSeconds((long) 'x');
        java.time.Instant instant4 = instant1.minus((java.time.temporal.TemporalAmount) duration3);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(instant4);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.Period period5 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod6 = period3.plus((java.time.temporal.TemporalAmount) period5);
        java.time.OffsetTime offsetTime7 = java.time.OffsetTime.now();
        java.time.LocalDate localDate9 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate11 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int12 = localDate11.getMonthValue();
        int int13 = localDate11.getDayOfYear();
        boolean boolean14 = localDate9.isAfter((java.time.chrono.ChronoLocalDate) localDate11);
        java.time.OffsetDateTime offsetDateTime15 = offsetTime7.atDate(localDate9);
        java.time.LocalDate localDate17 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int18 = localDate17.getMonthValue();
        java.time.LocalDate localDate20 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit22 = chronoField21.getRangeUnit();
        boolean boolean23 = localDate20.isSupported(temporalUnit22);
        boolean boolean24 = localDate17.isBefore((java.time.chrono.ChronoLocalDate) localDate20);
        java.time.format.DateTimeFormatter dateTimeFormatter25 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray27 = new java.time.temporal.TemporalField[] { chronoField26 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet28 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet28, temporalFieldArray27);
        java.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter25.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet28);
        java.lang.String str31 = localDate20.format(dateTimeFormatter25);
        java.time.LocalDateTime localDateTime32 = localDate20.atStartOfDay();
        java.time.LocalDate localDate34 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int35 = localDate34.getMonthValue();
        int int36 = localDate34.getDayOfYear();
        java.time.LocalDate localDate38 = localDate34.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField39 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit40 = chronoField39.getRangeUnit();
        long long41 = localDate20.until((java.time.temporal.Temporal) localDate34, temporalUnit40);
        java.time.OffsetDateTime offsetDateTime42 = offsetTime7.atDate(localDate34);
        java.time.temporal.ChronoField chronoField43 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean44 = offsetDateTime42.isSupported((java.time.temporal.TemporalField) chronoField43);
        java.time.OffsetDateTime offsetDateTime46 = offsetDateTime42.plusWeeks((long) 31);
        java.time.LocalDate localDate49 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int50 = localDate49.getMonthValue();
        java.time.LocalDate localDate52 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField53 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit54 = chronoField53.getRangeUnit();
        boolean boolean55 = localDate52.isSupported(temporalUnit54);
        boolean boolean56 = localDate49.isBefore((java.time.chrono.ChronoLocalDate) localDate52);
        java.time.format.DateTimeFormatter dateTimeFormatter57 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField58 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray59 = new java.time.temporal.TemporalField[] { chronoField58 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet60 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet60, temporalFieldArray59);
        java.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter57.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet60);
        java.lang.String str63 = localDate52.format(dateTimeFormatter57);
        java.time.LocalDateTime localDateTime64 = localDate52.atStartOfDay();
        java.time.LocalDate localDate66 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int67 = localDate66.getMonthValue();
        int int68 = localDate66.getDayOfYear();
        java.time.LocalDate localDate70 = localDate66.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField71 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit72 = chronoField71.getRangeUnit();
        long long73 = localDate52.until((java.time.temporal.Temporal) localDate66, temporalUnit72);
        java.time.OffsetDateTime offsetDateTime74 = offsetDateTime46.plus((long) 1, temporalUnit72);
        long long75 = period3.get(temporalUnit72);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration76 = java.time.Duration.from((java.time.temporal.TemporalAmount) period3);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unit must not have an estimated duration");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(chronoPeriod6);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField21.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit22 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit22.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField26.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-W02-7" + "'", str31, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 11 + "'", int36 == 11);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertTrue("'" + chronoField39 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField39.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit40 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit40.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime42);
        org.junit.Assert.assertTrue("'" + chronoField43 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField43.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(offsetDateTime46);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertTrue("'" + chronoField53 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField53.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit54 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit54.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertTrue("'" + chronoField58 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField58.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "1970-W02-7" + "'", str63, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(localDate66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 11 + "'", int68 == 11);
        org.junit.Assert.assertNotNull(localDate70);
        org.junit.Assert.assertTrue("'" + chronoField71 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField71.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit72 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit72.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime74);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList7 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList7, charArray6);
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream16 = java.util.stream.IntStream.of(intArray15);
        java.util.stream.IntStream intStream17 = charListMap2.put(charList7, intStream16);
        java.util.Locale locale19 = new java.util.Locale("");
        java.lang.String str20 = locale19.getDisplayCountry();
        java.io.File file21 = null;
        java.io.File file23 = new java.io.File(file21, "");
        java.io.File file24 = file23.getCanonicalFile();
        boolean boolean25 = charListMap2.remove((java.lang.Object) str20, (java.lang.Object) file23);
        boolean boolean26 = charListMap2.isEmpty();
        java.lang.Character[] charArray28 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList29 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList29, charArray28);
        java.lang.Character[] charArray32 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList33 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList33, charArray32);
        boolean boolean35 = charList29.removeAll((java.util.Collection<java.lang.Character>) charList33);
        int[] intArray42 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream43 = java.util.stream.IntStream.of(intArray42);
        java.util.Spliterator<java.lang.Integer> intSpliterator44 = intStream43.spliterator();
        java.util.stream.IntStream intStream45 = charListMap2.replace(charList33, intStream43);
        java.util.Iterator<java.lang.Character> charItor46 = charList33.iterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNull(intStream17);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull("file23.getParent() == null", file23.getParent());
        org.junit.Assert.assertEquals(file23.toString(), "");
        org.junit.Assert.assertNotNull(file24);
// flaky:         org.junit.Assert.assertEquals(file24.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file24.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream43);
        org.junit.Assert.assertNotNull(intSpliterator44);
        org.junit.Assert.assertNull(intStream45);
        org.junit.Assert.assertNotNull(charItor46);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        java.time.Period period1 = java.time.Period.ofYears(10);
        java.time.Period period2 = period1.normalized();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        java.util.function.Function<java.nio.channels.ClosedChannelException, java.nio.channels.ClosedChannelException> closedChannelExceptionFunction0 = java.util.function.Function.identity();
        org.junit.Assert.assertNotNull(closedChannelExceptionFunction0);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of((long) 365000000);
        java.util.function.LongBinaryOperator longBinaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = longStream1.reduce((long) 16000, longBinaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int5 = localDate4.getMonthValue();
        int int6 = localDate4.getDayOfYear();
        boolean boolean7 = localDate2.isAfter((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.OffsetDateTime offsetDateTime8 = offsetTime0.atDate(localDate2);
        java.time.LocalDate localDate10 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int11 = localDate10.getMonthValue();
        java.time.LocalDate localDate13 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField14.getRangeUnit();
        boolean boolean16 = localDate13.isSupported(temporalUnit15);
        boolean boolean17 = localDate10.isBefore((java.time.chrono.ChronoLocalDate) localDate13);
        java.time.format.DateTimeFormatter dateTimeFormatter18 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray20 = new java.time.temporal.TemporalField[] { chronoField19 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet21 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet21, temporalFieldArray20);
        java.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter18.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet21);
        java.lang.String str24 = localDate13.format(dateTimeFormatter18);
        java.time.LocalDateTime localDateTime25 = localDate13.atStartOfDay();
        java.time.LocalDate localDate27 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int28 = localDate27.getMonthValue();
        int int29 = localDate27.getDayOfYear();
        java.time.LocalDate localDate31 = localDate27.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit33 = chronoField32.getRangeUnit();
        long long34 = localDate13.until((java.time.temporal.Temporal) localDate27, temporalUnit33);
        java.time.OffsetDateTime offsetDateTime35 = offsetTime0.atDate(localDate27);
        java.time.temporal.ChronoField chronoField36 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean37 = offsetDateTime35.isSupported((java.time.temporal.TemporalField) chronoField36);
        int int38 = offsetDateTime35.getNano();
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.ValueRange valueRange41 = chronoField40.range();
        java.time.temporal.TemporalUnit temporalUnit42 = chronoField40.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime43 = offsetDateTime35.minus(6603384152749567654L, temporalUnit42);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -6603384152749565684");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField19.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-W02-7" + "'", str24, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit33 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit33.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertTrue("'" + chronoField36 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField36.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 678000000 + "'", int38 == 678000000);
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField40.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(valueRange41);
        org.junit.Assert.assertTrue("'" + temporalUnit42 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit42.equals(java.time.temporal.ChronoUnit.YEARS));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = new java.net.URL("ArrayList");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: ArrayList");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        java.time.Clock clock0 = java.time.Clock.systemUTC();
        org.junit.Assert.assertNotNull(clock0);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        java.lang.Character[] charArray1 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList2 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList2, charArray1);
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList6 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList6, charArray5);
        boolean boolean8 = charList2.removeAll((java.util.Collection<java.lang.Character>) charList6);
        java.util.ListIterator<java.lang.Character> charItor9 = charList2.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            charItor9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charItor9);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap5 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean7 = charListMap5.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray9 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList10 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList10, charArray9);
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream19 = java.util.stream.IntStream.of(intArray18);
        java.util.stream.IntStream intStream20 = charListMap5.put(charList10, intStream19);
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream28 = java.util.stream.IntStream.of(intArray27);
        java.util.Spliterator<java.lang.Integer> intSpliterator29 = intStream28.spliterator();
        java.util.stream.IntStream intStream30 = charListMap2.put(charList10, intStream28);
        byte[] byteArray36 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer37 = java.nio.ByteBuffer.wrap(byteArray36);
        java.nio.ByteBuffer byteBuffer39 = byteBuffer37.putShort((short) 0);
        java.nio.ShortBuffer shortBuffer40 = byteBuffer39.asShortBuffer();
        java.time.temporal.ChronoField chronoField41 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.UTC;
        boolean boolean43 = chronoField41.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset42);
        boolean boolean44 = byteBuffer39.equals((java.lang.Object) boolean43);
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap47 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.util.Set<java.util.Map.Entry<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>> charListEntrySet48 = charListMap47.entrySet();
        charListMap47.clear();
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap52 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.util.Set<java.util.Map.Entry<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>> charListEntrySet53 = charListMap52.entrySet();
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap56 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean58 = charListMap56.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray60 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList61 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList61, charArray60);
        int[] intArray69 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream70 = java.util.stream.IntStream.of(intArray69);
        java.util.stream.IntStream intStream71 = charListMap56.put(charList61, intStream70);
        boolean boolean72 = charListMap52.containsKey((java.lang.Object) charListMap56);
        charListMap47.putAll((java.util.Map<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>) charListMap52);
        boolean boolean74 = charListMap2.remove((java.lang.Object) boolean43, (java.lang.Object) charListMap47);
        boolean boolean75 = charListMap2.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNull(intStream20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream28);
        org.junit.Assert.assertNotNull(intSpliterator29);
        org.junit.Assert.assertNull(intStream30);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(shortBuffer40);
        org.junit.Assert.assertTrue("'" + chronoField41 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField41.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(charListEntrySet48);
        org.junit.Assert.assertNotNull(charListEntrySet53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream70);
        org.junit.Assert.assertNull(intStream71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.LocalTime localTime4 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology5 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime7 = localTime4.minusHours(1L);
        boolean boolean8 = localTime1.isBefore(localTime7);
        java.time.LocalTime localTime10 = localTime1.minusMinutes((long) 0);
        java.time.LocalDate localDate12 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int13 = localDate12.getMonthValue();
        int int14 = localDate12.getDayOfYear();
        java.time.LocalDate localDate16 = localDate12.withYear((int) ' ');
        java.time.LocalDateTime localDateTime17 = localTime1.atDate(localDate12);
        java.lang.String str18 = localDate12.toString();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-11" + "'", str18, "1970-01-11");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        java.lang.Character[] charArray1 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList2 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList2, charArray1);
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList6 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList6, charArray5);
        boolean boolean8 = charList2.removeAll((java.util.Collection<java.lang.Character>) charList6);
        boolean boolean9 = charList2.isEmpty();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime24.withMinute((int) (byte) 10);
        java.time.Period period29 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period31 = period29.plusYears((long) (short) 0);
        java.time.Period period33 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod34 = period31.plus((java.time.temporal.TemporalAmount) period33);
        java.time.ZonedDateTime zonedDateTime35 = zonedDateTime24.minus((java.time.temporal.TemporalAmount) chronoPeriod34);
        java.time.OffsetTime offsetTime36 = java.time.OffsetTime.from((java.time.temporal.TemporalAccessor) zonedDateTime24);
        java.time.ZonedDateTime zonedDateTime38 = zonedDateTime24.plusMonths((long) 4210);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(chronoPeriod34);
        org.junit.Assert.assertNotNull(zonedDateTime35);
        org.junit.Assert.assertNotNull(offsetTime36);
        org.junit.Assert.assertNotNull(zonedDateTime38);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.of(".");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unknown chronology: .");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        char[] charArray4 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap(charArray4);
        java.nio.CharBuffer charBuffer7 = charBuffer5.put('#');
        char[] charArray9 = new char[] { '#' };
        java.nio.CharBuffer charBuffer10 = charBuffer5.get(charArray9);
        java.nio.CharBuffer charBuffer12 = charBuffer10.put('#');
        char[] charArray17 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer18 = java.nio.CharBuffer.wrap(charArray17);
        java.util.stream.IntStream intStream19 = charBuffer18.chars();
        int int20 = charBuffer10.compareTo(charBuffer18);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, 4, #,  ]");
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(charBuffer7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(charBuffer12);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, 4, a,  ]");
        org.junit.Assert.assertNotNull(charBuffer18);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-65) + "'", int20 == (-65));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        java.io.File file3 = file2.getCanonicalFile();
        boolean boolean4 = file3.createNewFile();
        java.net.URI uRI5 = file3.toURI();
        long long6 = file3.getFreeSpace();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertNotNull(file3);
// flaky:         org.junit.Assert.assertEquals(file3.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRI5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 299102117888L + "'", long6 == 299102117888L);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(11);
        int[] intArray3 = new int[] { 16 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.IntBuffer intBuffer6 = intBuffer1.get(intArray3, 466000000, 4096);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[16]");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime24.withMinute((int) (byte) 10);
        java.time.Period period29 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period31 = period29.plusYears((long) (short) 0);
        java.time.Period period33 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod34 = period31.plus((java.time.temporal.TemporalAmount) period33);
        java.time.ZonedDateTime zonedDateTime35 = zonedDateTime24.minus((java.time.temporal.TemporalAmount) chronoPeriod34);
        java.time.OffsetTime offsetTime36 = java.time.OffsetTime.from((java.time.temporal.TemporalAccessor) zonedDateTime24);
        java.time.ZoneOffset zoneOffset37 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int42 = zoneOffset37.compareTo(zoneOffset41);
        java.time.OffsetTime offsetTime43 = offsetTime36.withOffsetSameInstant(zoneOffset41);
        java.time.OffsetTime offsetTime45 = offsetTime43.minusHours((-1L));
        java.time.OffsetTime offsetTime47 = offsetTime43.minusNanos((long) (short) -1);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(chronoPeriod34);
        org.junit.Assert.assertNotNull(zonedDateTime35);
        org.junit.Assert.assertNotNull(offsetTime36);
        org.junit.Assert.assertNotNull(zoneOffset37);
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4210 + "'", int42 == 4210);
        org.junit.Assert.assertNotNull(offsetTime43);
        org.junit.Assert.assertNotNull(offsetTime45);
        org.junit.Assert.assertNotNull(offsetTime47);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        java.io.FileNotFoundException fileNotFoundException1 = new java.io.FileNotFoundException("1970-W01-4");
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        java.nio.DoubleBuffer doubleBuffer1 = java.nio.DoubleBuffer.allocate((int) 'x');
        boolean boolean3 = doubleBuffer1.equals((java.lang.Object) (-1.0d));
        java.nio.DoubleBuffer doubleBuffer4 = doubleBuffer1.asReadOnlyBuffer();
        double[] doubleArray5 = doubleBuffer1.array();
        org.junit.Assert.assertNotNull(doubleBuffer1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doubleBuffer4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.String str3 = locale1.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.Period period5 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod6 = period3.plus((java.time.temporal.TemporalAmount) period5);
        java.time.chrono.ChronoPeriod chronoPeriod8 = period5.multipliedBy((int) '#');
        java.lang.String str9 = period5.toString();
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.UTC;
        boolean boolean14 = chronoField12.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset13);
        java.time.format.TextStyle textStyle15 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle16 = textStyle15.asNormal();
        java.util.Locale locale18 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        java.util.Locale locale21 = new java.util.Locale("");
        java.lang.String str22 = locale21.getDisplayCountry();
        java.lang.String str23 = locale18.getDisplayScript(locale21);
        java.lang.String str24 = zoneOffset13.getDisplayName(textStyle15, locale18);
        int int25 = zoneOffset13.getTotalSeconds();
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset13);
        java.time.LocalDateTime localDateTime28 = localDateTime26.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset29 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime30 = localDateTime28.atZone((java.time.ZoneId) zoneOffset29);
        java.time.temporal.ChronoField chronoField31 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset32 = java.time.ZoneOffset.UTC;
        boolean boolean33 = chronoField31.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset32);
        java.time.ZonedDateTime zonedDateTime34 = java.time.ZonedDateTime.of(localDateTime28, (java.time.ZoneId) zoneOffset32);
        java.time.DayOfWeek dayOfWeek35 = zonedDateTime34.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime37 = zonedDateTime34.withMinute((int) (byte) 10);
        int int38 = zonedDateTime37.getNano();
        java.time.temporal.Temporal temporal39 = period5.addTo((java.time.temporal.Temporal) zonedDateTime37);
        java.time.LocalDate localDate41 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int42 = localDate41.getMonthValue();
        int int43 = localDate41.getDayOfYear();
        java.time.LocalDate localDate45 = localDate41.withYear((int) ' ');
        java.time.chrono.Era era46 = localDate41.getEra();
        java.time.LocalDate localDate48 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate50 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int51 = localDate50.getMonthValue();
        int int52 = localDate50.getDayOfYear();
        boolean boolean53 = localDate48.isAfter((java.time.chrono.ChronoLocalDate) localDate50);
        boolean boolean54 = localDate41.isEqual((java.time.chrono.ChronoLocalDate) localDate50);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime55 = zonedDateTime37.with((java.time.temporal.TemporalAdjuster) localDate41);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime56 = localDateChronoZonedDateTime55.toLocalDateTime();
        java.time.ZoneOffset zoneOffset57 = localDateChronoZonedDateTime55.getOffset();
        long long58 = localDateChronoZonedDateTime55.toEpochSecond();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(chronoPeriod6);
        org.junit.Assert.assertNotNull(chronoPeriod8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P-1M" + "'", str9, "P-1M");
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField12.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + textStyle15 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle15.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle16 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle16.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z" + "'", str24, "Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(zoneOffset29);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime30);
        org.junit.Assert.assertTrue("'" + chronoField31 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField31.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(zonedDateTime34);
        org.junit.Assert.assertTrue("'" + dayOfWeek35 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek35.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertNotNull(temporal39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 11 + "'", int43 == 11);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertTrue("'" + era46 + "' != '" + java.time.chrono.IsoEra.CE + "'", era46.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 11 + "'", int52 == 11);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime55);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime56);
        org.junit.Assert.assertNotNull(zoneOffset57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 936616L + "'", long58 == 936616L);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        java.net.URL uRL0 = null;
        java.security.CodeSigner[] codeSignerArray1 = new java.security.CodeSigner[] {};
        java.security.CodeSource codeSource2 = new java.security.CodeSource(uRL0, codeSignerArray1);
        java.security.PermissionCollection permissionCollection3 = null;
        java.lang.ClassLoader classLoader4 = null;
        java.security.Principal[] principalArray5 = null;
        java.security.ProtectionDomain protectionDomain6 = new java.security.ProtectionDomain(codeSource2, permissionCollection3, classLoader4, principalArray5);
        java.security.PermissionCollection permissionCollection7 = null;
        java.security.ProtectionDomain protectionDomain8 = new java.security.ProtectionDomain(codeSource2, permissionCollection7);
        java.security.Permission permission9 = null;
        boolean boolean10 = protectionDomain8.implies(permission9);
        java.security.CodeSource codeSource11 = protectionDomain8.getCodeSource();
        java.security.CodeSource codeSource12 = protectionDomain8.getCodeSource();
        org.junit.Assert.assertNotNull(codeSignerArray1);
        org.junit.Assert.assertEquals(protectionDomain6.toString(), "ProtectionDomain  (null <no signer certificates>)\n null\n <no principals>\n null\n");
        org.junit.Assert.assertEquals(protectionDomain8.toString(), "ProtectionDomain  (null <no signer certificates>)\n null\n <no principals>\n null\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(codeSource11);
        org.junit.Assert.assertNotNull(codeSource12);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "ISO", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MILLISECONDS;
        long long2 = timeUnit0.toHours((long) 0);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MICROSECONDS;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MICROSECONDS;
        long long3 = timeUnit0.convert((long) 4210, timeUnit2);
        long long5 = timeUnit0.toSeconds((long) (short) -1);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertNotNull(timeUnit2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4210L + "'", long3 == 4210L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.plusHours((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime20 = localDateTime18.withDayOfMonth(452000000);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 452000000");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        java.nio.ShortBuffer shortBuffer1 = java.nio.ShortBuffer.allocate(1);
        short short2 = shortBuffer1.get();
        java.nio.ShortBuffer shortBuffer3 = shortBuffer1.asReadOnlyBuffer();
        org.junit.Assert.assertNotNull(shortBuffer1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(11);
        java.nio.IntBuffer intBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.IntBuffer intBuffer3 = intBuffer1.put(intBuffer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intBuffer1);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.Period period5 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod6 = period3.plus((java.time.temporal.TemporalAmount) period5);
        java.time.chrono.ChronoPeriod chronoPeriod8 = period5.multipliedBy((int) '#');
        java.lang.String str9 = period5.toString();
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.UTC;
        boolean boolean14 = chronoField12.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset13);
        java.time.format.TextStyle textStyle15 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle16 = textStyle15.asNormal();
        java.util.Locale locale18 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        java.util.Locale locale21 = new java.util.Locale("");
        java.lang.String str22 = locale21.getDisplayCountry();
        java.lang.String str23 = locale18.getDisplayScript(locale21);
        java.lang.String str24 = zoneOffset13.getDisplayName(textStyle15, locale18);
        int int25 = zoneOffset13.getTotalSeconds();
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset13);
        java.time.LocalDateTime localDateTime28 = localDateTime26.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset29 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime30 = localDateTime28.atZone((java.time.ZoneId) zoneOffset29);
        java.time.temporal.ChronoField chronoField31 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset32 = java.time.ZoneOffset.UTC;
        boolean boolean33 = chronoField31.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset32);
        java.time.ZonedDateTime zonedDateTime34 = java.time.ZonedDateTime.of(localDateTime28, (java.time.ZoneId) zoneOffset32);
        java.time.DayOfWeek dayOfWeek35 = zonedDateTime34.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime37 = zonedDateTime34.withMinute((int) (byte) 10);
        int int38 = zonedDateTime37.getNano();
        java.time.temporal.Temporal temporal39 = period5.addTo((java.time.temporal.Temporal) zonedDateTime37);
        long long40 = period5.toTotalMonths();
        java.time.Duration duration42 = java.time.Duration.ofMinutes((long) (byte) 0);
        java.time.Duration duration44 = duration42.withSeconds(0L);
        java.time.Duration duration46 = java.time.Duration.ofMinutes((long) (byte) 0);
        java.time.Duration duration48 = duration46.withSeconds(0L);
        int int49 = duration42.compareTo(duration46);
        java.time.Duration duration51 = java.time.Duration.ofNanos((long) (byte) 10);
        java.time.Duration duration53 = duration51.plusMillis((long) (byte) 100);
        java.time.Duration duration55 = duration53.minusMillis((long) (byte) 100);
        int int56 = duration42.compareTo(duration55);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoPeriod chronoPeriod57 = period5.plus((java.time.temporal.TemporalAmount) duration42);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unit must be Years, Months or Days, but was Seconds");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(chronoPeriod6);
        org.junit.Assert.assertNotNull(chronoPeriod8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P-1M" + "'", str9, "P-1M");
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField12.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + textStyle15 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle15.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle16 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle16.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z" + "'", str24, "Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(zoneOffset29);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime30);
        org.junit.Assert.assertTrue("'" + chronoField31 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField31.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(zonedDateTime34);
        org.junit.Assert.assertTrue("'" + dayOfWeek35 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek35.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertNotNull(temporal39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-10) + "'", int56 == (-10));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.Period period5 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod6 = period3.plus((java.time.temporal.TemporalAmount) period5);
        java.time.chrono.ChronoPeriod chronoPeriod8 = period5.multipliedBy((int) '#');
        java.time.Period period10 = period5.multipliedBy((int) (byte) 0);
        java.lang.String str11 = period10.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(chronoPeriod6);
        org.junit.Assert.assertNotNull(chronoPeriod8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0D" + "'", str11, "P0D");
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        java.time.Month month0 = java.time.Month.JULY;
        int int1 = month0.minLength();
        java.time.Month month3 = month0.plus(0L);
        java.time.format.TextStyle textStyle4 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle5 = textStyle4.asNormal();
        java.util.Locale locale7 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale7.getDisplayCountry();
        java.lang.String str10 = month3.getDisplayName(textStyle5, locale7);
        boolean boolean11 = textStyle5.isStandalone();
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.JULY + "'", month0.equals(java.time.Month.JULY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
        org.junit.Assert.assertTrue("'" + month3 + "' != '" + java.time.Month.JULY + "'", month3.equals(java.time.Month.JULY));
        org.junit.Assert.assertTrue("'" + textStyle4 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle4.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "7" + "'", str10, "7");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.format.TextStyle textStyle24 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle25 = textStyle24.asNormal();
        java.util.Locale locale27 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet28 = locale27.getExtensionKeys();
        java.util.Locale locale30 = new java.util.Locale("");
        java.lang.String str31 = locale30.getDisplayCountry();
        java.lang.String str32 = locale27.getDisplayScript(locale30);
        java.lang.String str33 = zoneOffset22.getDisplayName(textStyle24, locale27);
        int int34 = zoneOffset22.getTotalSeconds();
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset22);
        java.time.LocalDateTime localDateTime37 = localDateTime35.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime39 = localDateTime37.atZone((java.time.ZoneId) zoneOffset38);
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.UTC;
        boolean boolean42 = chronoField40.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset41);
        java.time.ZonedDateTime zonedDateTime43 = java.time.ZonedDateTime.of(localDateTime37, (java.time.ZoneId) zoneOffset41);
        java.time.DayOfWeek dayOfWeek44 = zonedDateTime43.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime46 = zonedDateTime43.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal47 = localDateTime16.adjustInto((java.time.temporal.Temporal) zonedDateTime46);
        java.time.ZonedDateTime zonedDateTime49 = zonedDateTime46.plusWeeks(0L);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + textStyle24 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle24.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle25 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle25.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Z" + "'", str33, "Z");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime39);
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField40.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(zonedDateTime43);
        org.junit.Assert.assertTrue("'" + dayOfWeek44 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek44.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime46);
        org.junit.Assert.assertNotNull(temporal47);
        org.junit.Assert.assertNotNull(zonedDateTime49);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        java.time.Duration duration1 = java.time.Duration.ofNanos((long) (byte) 10);
        java.time.Duration duration3 = duration1.withSeconds(6603384152749567654L);
        java.time.Duration duration5 = duration1.withSeconds((long) 4096);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        java.util.Comparator<java.time.OffsetTime> offsetTimeComparator0 = java.util.Comparator.reverseOrder();
        org.junit.Assert.assertNotNull(offsetTimeComparator0);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.stream.IntStream intStream8 = intStream7.sequential();
        java.util.stream.IntStream intStream10 = intStream8.limit((long) 97);
        java.util.OptionalInt optionalInt11 = intStream10.findFirst();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(optionalInt11);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition0 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.UTC;
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.UTC;
        boolean boolean5 = chronoField3.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset4);
        java.time.format.TextStyle textStyle6 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle7 = textStyle6.asNormal();
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str14 = locale9.getDisplayScript(locale12);
        java.lang.String str15 = zoneOffset4.getDisplayName(textStyle6, locale9);
        int int16 = zoneOffset4.getTotalSeconds();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset4);
        java.time.LocalDateTime localDateTime19 = localDateTime17.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime21 = localDateTime17.plusMonths((long) (short) 0);
        java.time.temporal.ChronoField chronoField22 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.UTC;
        boolean boolean24 = chronoField22.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset23);
        java.time.format.TextStyle textStyle25 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle26 = textStyle25.asNormal();
        java.util.Locale locale28 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet29 = locale28.getExtensionKeys();
        java.util.Locale locale31 = new java.util.Locale("");
        java.lang.String str32 = locale31.getDisplayCountry();
        java.lang.String str33 = locale28.getDisplayScript(locale31);
        java.lang.String str34 = zoneOffset23.getDisplayName(textStyle25, locale28);
        java.time.temporal.ChronoField chronoField37 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        boolean boolean39 = chronoField37.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset38);
        java.time.format.TextStyle textStyle40 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle41 = textStyle40.asNormal();
        java.util.Locale locale43 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet44 = locale43.getExtensionKeys();
        java.util.Locale locale46 = new java.util.Locale("");
        java.lang.String str47 = locale46.getDisplayCountry();
        java.lang.String str48 = locale43.getDisplayScript(locale46);
        java.lang.String str49 = zoneOffset38.getDisplayName(textStyle40, locale43);
        int int50 = zoneOffset38.getTotalSeconds();
        java.time.LocalDateTime localDateTime51 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset38);
        java.time.zone.ZoneRules zoneRules52 = zoneOffset38.getRules();
        java.time.LocalDateTime localDateTime53 = timeDefinition0.createDateTime(localDateTime21, zoneOffset23, zoneOffset38);
        org.junit.Assert.assertTrue("'" + timeDefinition0 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.UTC + "'", timeDefinition0.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.UTC));
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField3.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle7 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle7.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + chronoField22 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField22.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + textStyle25 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle25.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle26 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle26.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(charSet29);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Z" + "'", str34, "Z");
        org.junit.Assert.assertTrue("'" + chronoField37 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField37.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + textStyle40 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle40.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle41 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle41.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertNotNull(charSet44);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Z" + "'", str49, "Z");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(zoneRules52);
        org.junit.Assert.assertNotNull(localDateTime53);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', 'u', '4', 'u', 'u', ' ', '#' };
        java.util.ArrayList<java.lang.Character> charList8 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList8, charArray7);
        java.util.Spliterator<java.lang.Character> charSpliterator10 = charList8.spliterator();
        java.util.Locale locale12 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        charSet13.clear();
        java.util.Spliterator<java.lang.Character> charSpliterator15 = charSet13.spliterator();
        int int16 = charSet13.size();
        charSet13.clear();
        boolean boolean18 = charList8.retainAll((java.util.Collection<java.lang.Character>) charSet13);
        java.io.File file19 = null;
        java.io.File file21 = new java.io.File(file19, "");
        java.io.File file22 = file21.getCanonicalFile();
        boolean boolean23 = charList8.remove((java.lang.Object) file21);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charSpliterator10);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertNotNull(charSpliterator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull("file21.getParent() == null", file21.getParent());
        org.junit.Assert.assertEquals(file21.toString(), "");
        org.junit.Assert.assertNotNull(file22);
// flaky:         org.junit.Assert.assertEquals(file22.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file22.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MAX;
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.UTC;
        boolean boolean5 = chronoField3.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset4);
        java.time.format.TextStyle textStyle6 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle7 = textStyle6.asNormal();
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str14 = locale9.getDisplayScript(locale12);
        java.lang.String str15 = zoneOffset4.getDisplayName(textStyle6, locale9);
        int int16 = zoneOffset4.getTotalSeconds();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset4);
        java.time.LocalDateTime localDateTime19 = localDateTime17.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField22 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.UTC;
        boolean boolean24 = chronoField22.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset23);
        java.time.format.TextStyle textStyle25 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle26 = textStyle25.asNormal();
        java.util.Locale locale28 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet29 = locale28.getExtensionKeys();
        java.util.Locale locale31 = new java.util.Locale("");
        java.lang.String str32 = locale31.getDisplayCountry();
        java.lang.String str33 = locale28.getDisplayScript(locale31);
        java.lang.String str34 = zoneOffset23.getDisplayName(textStyle25, locale28);
        int int35 = zoneOffset23.getTotalSeconds();
        java.time.LocalDateTime localDateTime36 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset23);
        java.time.LocalDateTime localDateTime38 = localDateTime36.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset39 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime40 = localDateTime38.atZone((java.time.ZoneId) zoneOffset39);
        java.time.temporal.ChronoField chronoField41 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.UTC;
        boolean boolean43 = chronoField41.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset42);
        java.time.ZonedDateTime zonedDateTime44 = java.time.ZonedDateTime.of(localDateTime38, (java.time.ZoneId) zoneOffset42);
        java.time.DayOfWeek dayOfWeek45 = zonedDateTime44.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime47 = zonedDateTime44.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal48 = localDateTime17.adjustInto((java.time.temporal.Temporal) zonedDateTime47);
        java.time.ZonedDateTime zonedDateTime50 = zonedDateTime47.withSecond((int) (byte) 1);
        java.time.temporal.ChronoField chronoField51 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.ValueRange valueRange52 = chronoField51.range();
        boolean boolean53 = zonedDateTime47.isSupported((java.time.temporal.TemporalField) chronoField51);
        java.time.temporal.TemporalUnit temporalUnit54 = chronoField51.getRangeUnit();
        boolean boolean55 = localDateTime0.isSupported((java.time.temporal.TemporalField) chronoField51);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField3.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle7 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle7.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + chronoField22 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField22.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + textStyle25 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle25.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle26 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle26.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(charSet29);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Z" + "'", str34, "Z");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(zoneOffset39);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime40);
        org.junit.Assert.assertTrue("'" + chronoField41 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField41.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(zonedDateTime44);
        org.junit.Assert.assertTrue("'" + dayOfWeek45 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek45.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime47);
        org.junit.Assert.assertNotNull(temporal48);
        org.junit.Assert.assertNotNull(zonedDateTime50);
        org.junit.Assert.assertTrue("'" + chronoField51 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField51.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(valueRange52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + temporalUnit54 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit54.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator0 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator0);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.LocalTime localTime4 = localTime1.plusMinutes((long) (byte) 10);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        java.util.Set<java.lang.String> strSet0 = java.time.ZoneId.getAvailableZoneIds();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.temporal.ChronoField chronoField27 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.UTC;
        boolean boolean29 = chronoField27.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset28);
        java.time.format.TextStyle textStyle30 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle31 = textStyle30.asNormal();
        java.util.Locale locale33 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet34 = locale33.getExtensionKeys();
        java.util.Locale locale36 = new java.util.Locale("");
        java.lang.String str37 = locale36.getDisplayCountry();
        java.lang.String str38 = locale33.getDisplayScript(locale36);
        java.lang.String str39 = zoneOffset28.getDisplayName(textStyle30, locale33);
        int int40 = zoneOffset28.getTotalSeconds();
        java.time.LocalDateTime localDateTime41 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset28);
        java.time.LocalDateTime localDateTime43 = localDateTime41.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField46 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset47 = java.time.ZoneOffset.UTC;
        boolean boolean48 = chronoField46.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset47);
        java.time.format.TextStyle textStyle49 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle50 = textStyle49.asNormal();
        java.util.Locale locale52 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet53 = locale52.getExtensionKeys();
        java.util.Locale locale55 = new java.util.Locale("");
        java.lang.String str56 = locale55.getDisplayCountry();
        java.lang.String str57 = locale52.getDisplayScript(locale55);
        java.lang.String str58 = zoneOffset47.getDisplayName(textStyle49, locale52);
        int int59 = zoneOffset47.getTotalSeconds();
        java.time.LocalDateTime localDateTime60 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset47);
        java.time.LocalDateTime localDateTime62 = localDateTime60.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset63 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime64 = localDateTime62.atZone((java.time.ZoneId) zoneOffset63);
        java.time.temporal.ChronoField chronoField65 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset66 = java.time.ZoneOffset.UTC;
        boolean boolean67 = chronoField65.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset66);
        java.time.ZonedDateTime zonedDateTime68 = java.time.ZonedDateTime.of(localDateTime62, (java.time.ZoneId) zoneOffset66);
        java.time.DayOfWeek dayOfWeek69 = zonedDateTime68.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime71 = zonedDateTime68.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal72 = localDateTime41.adjustInto((java.time.temporal.Temporal) zonedDateTime71);
        java.time.ZonedDateTime zonedDateTime74 = zonedDateTime71.withSecond((int) (byte) 1);
        boolean boolean75 = zonedDateTime24.isBefore((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime71);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + chronoField27 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField27.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + textStyle30 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle30.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle31 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle31.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(charSet34);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Z" + "'", str39, "Z");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + chronoField46 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField46.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + textStyle49 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle49.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle50 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle50.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertNotNull(charSet53);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Z" + "'", str58, "Z");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(zoneOffset63);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime64);
        org.junit.Assert.assertTrue("'" + chronoField65 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField65.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(zonedDateTime68);
        org.junit.Assert.assertTrue("'" + dayOfWeek69 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek69.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime71);
        org.junit.Assert.assertNotNull(temporal72);
        org.junit.Assert.assertNotNull(zonedDateTime74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        java.util.Date date0 = new java.util.Date();
        date0.setMonth((int) (short) -1);
        java.lang.String str3 = date0.toGMTString();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Tue Dec 21 09:40:53 UTC 2021");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "21 Dec 2021 09:40:53 GMT" + "'", str3, "21 Dec 2021 09:40:53 GMT");
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.Spliterator<java.lang.Integer> intSpliterator8 = intStream7.spliterator();
        java.util.stream.IntStream intStream9 = intStream7.parallel();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intSpliterator8);
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of((long) 365000000);
        boolean boolean2 = longStream1.isParallel();
        long[] longArray3 = longStream1.toArray();
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[365000000]");
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        java.util.Date date1 = new java.util.Date((long) (short) 100);
        java.lang.String str2 = date1.toGMTString();
        date1.setHours(256);
        date1.setMonth((int) ':');
        org.junit.Assert.assertEquals(date1.toString(), "Mon Nov 11 16:00:00 UTC 1974");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str2, "1 Jan 1970 00:00:00 GMT");
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        int[] intArray6 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.OptionalInt optionalInt8 = intStream7.findFirst();
        int int10 = optionalInt8.orElse(64);
        java.io.OutputStream outputStream11 = null;
        java.io.FilterOutputStream filterOutputStream12 = new java.io.FilterOutputStream(outputStream11);
        java.io.PrintWriter printWriter14 = new java.io.PrintWriter((java.io.OutputStream) filterOutputStream12, true);
        boolean boolean15 = optionalInt8.equals((java.lang.Object) printWriter14);
        // The following exception was thrown during execution in test generation
        try {
            printWriter14.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        java.nio.ShortBuffer shortBuffer1 = java.nio.ShortBuffer.allocate(1);
        java.nio.ShortBuffer shortBuffer2 = shortBuffer1.asReadOnlyBuffer();
        java.nio.ShortBuffer shortBuffer3 = shortBuffer1.asReadOnlyBuffer();
        java.nio.ShortBuffer shortBuffer4 = shortBuffer1.duplicate();
        java.nio.ShortBuffer shortBuffer6 = java.nio.ShortBuffer.allocate(1);
        java.nio.ShortBuffer shortBuffer7 = shortBuffer6.asReadOnlyBuffer();
        java.nio.ShortBuffer shortBuffer8 = shortBuffer6.asReadOnlyBuffer();
        java.nio.ShortBuffer shortBuffer9 = shortBuffer6.duplicate();
        java.nio.ShortBuffer shortBuffer10 = shortBuffer4.put(shortBuffer6);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.wrap(byteArray16);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer17.putShort((short) 0);
        java.nio.ShortBuffer shortBuffer20 = byteBuffer19.asShortBuffer();
        int int21 = shortBuffer6.compareTo(shortBuffer20);
        org.junit.Assert.assertNotNull(shortBuffer1);
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(shortBuffer4);
        org.junit.Assert.assertNotNull(shortBuffer6);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(shortBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate3 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int4 = localDate3.getMonthValue();
        java.time.Period period7 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period9 = period7.plusYears((long) (short) 0);
        java.time.Period period11 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod12 = period9.plus((java.time.temporal.TemporalAmount) period11);
        java.time.OffsetTime offsetTime13 = java.time.OffsetTime.now();
        java.time.LocalDate localDate15 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate17 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int18 = localDate17.getMonthValue();
        int int19 = localDate17.getDayOfYear();
        boolean boolean20 = localDate15.isAfter((java.time.chrono.ChronoLocalDate) localDate17);
        java.time.OffsetDateTime offsetDateTime21 = offsetTime13.atDate(localDate15);
        java.time.LocalDate localDate23 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int24 = localDate23.getMonthValue();
        java.time.LocalDate localDate26 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField27 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit28 = chronoField27.getRangeUnit();
        boolean boolean29 = localDate26.isSupported(temporalUnit28);
        boolean boolean30 = localDate23.isBefore((java.time.chrono.ChronoLocalDate) localDate26);
        java.time.format.DateTimeFormatter dateTimeFormatter31 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray33 = new java.time.temporal.TemporalField[] { chronoField32 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet34 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet34, temporalFieldArray33);
        java.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter31.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet34);
        java.lang.String str37 = localDate26.format(dateTimeFormatter31);
        java.time.LocalDateTime localDateTime38 = localDate26.atStartOfDay();
        java.time.LocalDate localDate40 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int41 = localDate40.getMonthValue();
        int int42 = localDate40.getDayOfYear();
        java.time.LocalDate localDate44 = localDate40.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField45 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit46 = chronoField45.getRangeUnit();
        long long47 = localDate26.until((java.time.temporal.Temporal) localDate40, temporalUnit46);
        java.time.OffsetDateTime offsetDateTime48 = offsetTime13.atDate(localDate40);
        java.time.temporal.ChronoField chronoField49 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean50 = offsetDateTime48.isSupported((java.time.temporal.TemporalField) chronoField49);
        java.time.OffsetDateTime offsetDateTime52 = offsetDateTime48.plusWeeks((long) 31);
        java.time.LocalDate localDate55 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int56 = localDate55.getMonthValue();
        java.time.LocalDate localDate58 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField59 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit60 = chronoField59.getRangeUnit();
        boolean boolean61 = localDate58.isSupported(temporalUnit60);
        boolean boolean62 = localDate55.isBefore((java.time.chrono.ChronoLocalDate) localDate58);
        java.time.format.DateTimeFormatter dateTimeFormatter63 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField64 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray65 = new java.time.temporal.TemporalField[] { chronoField64 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet66 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet66, temporalFieldArray65);
        java.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter63.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet66);
        java.lang.String str69 = localDate58.format(dateTimeFormatter63);
        java.time.LocalDateTime localDateTime70 = localDate58.atStartOfDay();
        java.time.LocalDate localDate72 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int73 = localDate72.getMonthValue();
        int int74 = localDate72.getDayOfYear();
        java.time.LocalDate localDate76 = localDate72.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField77 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit78 = chronoField77.getRangeUnit();
        long long79 = localDate58.until((java.time.temporal.Temporal) localDate72, temporalUnit78);
        java.time.OffsetDateTime offsetDateTime80 = offsetDateTime52.plus((long) 1, temporalUnit78);
        long long81 = period9.get(temporalUnit78);
        java.time.LocalDate localDate82 = localDate3.minus((long) 120000000, temporalUnit78);
        boolean boolean83 = localDate1.isAfter((java.time.chrono.ChronoLocalDate) localDate82);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(chronoPeriod12);
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(offsetDateTime21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + chronoField27 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField27.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit28 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit28.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField32.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-W02-7" + "'", str37, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 11 + "'", int42 == 11);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertTrue("'" + chronoField45 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField45.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit46 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit46.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime48);
        org.junit.Assert.assertTrue("'" + chronoField49 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField49.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(offsetDateTime52);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertTrue("'" + chronoField59 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField59.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit60 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit60.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertTrue("'" + chronoField64 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField64.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "1970-W02-7" + "'", str69, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(localDate72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 11 + "'", int74 == 11);
        org.junit.Assert.assertNotNull(localDate76);
        org.junit.Assert.assertTrue("'" + chronoField77 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField77.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit78 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit78.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime80);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertNotNull(localDate82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MIN;
        boolean boolean2 = offsetTime0.isEqual(offsetTime1);
        java.time.Instant instant4 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant6 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean7 = instant4.isAfter(instant6);
        java.time.Period period9 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period11 = period9.plusYears((long) (short) 0);
        java.time.chrono.ChronoPeriod chronoPeriod13 = period11.multipliedBy((int) ' ');
        java.time.LocalDate localDate15 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit17 = chronoField16.getRangeUnit();
        boolean boolean18 = localDate15.isSupported(temporalUnit17);
        long long19 = chronoPeriod13.get(temporalUnit17);
        boolean boolean20 = instant6.isSupported(temporalUnit17);
        java.time.OffsetTime offsetTime21 = offsetTime1.truncatedTo(temporalUnit17);
        java.time.OffsetTime offsetTime22 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime23 = java.time.OffsetTime.MIN;
        boolean boolean24 = offsetTime22.isEqual(offsetTime23);
        java.time.Instant instant26 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant28 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean29 = instant26.isAfter(instant28);
        java.time.Period period31 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period33 = period31.plusYears((long) (short) 0);
        java.time.chrono.ChronoPeriod chronoPeriod35 = period33.multipliedBy((int) ' ');
        java.time.LocalDate localDate37 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField38 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit39 = chronoField38.getRangeUnit();
        boolean boolean40 = localDate37.isSupported(temporalUnit39);
        long long41 = chronoPeriod35.get(temporalUnit39);
        boolean boolean42 = instant28.isSupported(temporalUnit39);
        java.time.OffsetTime offsetTime43 = offsetTime23.truncatedTo(temporalUnit39);
        java.time.OffsetTime offsetTime45 = offsetTime23.plusNanos(72616000L);
        boolean boolean46 = offsetTime21.isEqual(offsetTime23);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(chronoPeriod13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField16.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit17 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit17.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(chronoPeriod35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + chronoField38 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField38.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit39 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit39.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(offsetTime43);
        org.junit.Assert.assertNotNull(offsetTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        boolean boolean7 = localDate4.isSupported(temporalUnit6);
        boolean boolean8 = localDate1.isBefore((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.chrono.Chronology chronology9 = localDate1.getChronology();
        java.time.chrono.IsoChronology isoChronology10 = localDate1.getChronology();
        java.lang.String str11 = isoChronology10.getCalendarType();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(isoChronology10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "iso8601" + "'", str11, "iso8601");
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.LocalTime localTime4 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology5 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime7 = localTime4.minusHours(1L);
        boolean boolean8 = localTime1.isBefore(localTime7);
        java.time.LocalTime localTime10 = localTime1.minusMinutes((long) 0);
        java.time.LocalDate localDate12 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int13 = localDate12.getMonthValue();
        int int14 = localDate12.getDayOfYear();
        java.time.LocalDate localDate16 = localDate12.withYear((int) ' ');
        java.time.LocalDateTime localDateTime17 = localTime1.atDate(localDate12);
        java.time.LocalDate localDate19 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit21 = chronoField20.getRangeUnit();
        boolean boolean22 = localDate19.isSupported(temporalUnit21);
        boolean boolean23 = localDate12.equals((java.lang.Object) boolean22);
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.PROLEPTIC_MONTH;
        boolean boolean25 = localDate12.isSupported((java.time.temporal.TemporalField) chronoField24);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField20.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit21 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit21.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.PROLEPTIC_MONTH + "'", chronoField24.equals(java.time.temporal.ChronoField.PROLEPTIC_MONTH));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int5 = zoneOffset0.compareTo(zoneOffset4);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        boolean boolean8 = chronoField6.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset7);
        java.time.format.TextStyle textStyle9 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle10 = textStyle9.asNormal();
        java.util.Locale locale12 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = locale12.getDisplayScript(locale15);
        java.lang.String str18 = zoneOffset7.getDisplayName(textStyle9, locale12);
        java.util.Locale locale20 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.lang.String str22 = locale20.getDisplayCountry();
        java.lang.String str23 = zoneOffset0.getDisplayName(textStyle9, locale20);
        java.util.Locale locale25 = new java.util.Locale("");
        java.lang.String str26 = locale25.getDisplayCountry();
        java.time.format.DecimalStyle decimalStyle27 = java.time.format.DecimalStyle.of(locale25);
        java.lang.String str28 = locale25.getCountry();
        java.lang.String str29 = locale20.getDisplayName(locale25);
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4210 + "'", int5 == 4210);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField6.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + textStyle9 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle9.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle10 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle10.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Z" + "'", str18, "Z");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Z" + "'", str23, "Z");
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(decimalStyle27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.chrono.ChronoPeriod chronoPeriod5 = period3.multipliedBy(0);
        java.time.chrono.ChronoPeriod chronoPeriod7 = chronoPeriod5.multipliedBy((int) '0');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(chronoPeriod5);
        org.junit.Assert.assertNotNull(chronoPeriod7);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        java.time.Clock clock0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime1 = java.time.LocalTime.now(clock0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: clock");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        boolean boolean7 = localDate4.isSupported(temporalUnit6);
        boolean boolean8 = localDate1.isBefore((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.format.DateTimeFormatter dateTimeFormatter9 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray11 = new java.time.temporal.TemporalField[] { chronoField10 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet12 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet12, temporalFieldArray11);
        java.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet12);
        java.lang.String str15 = localDate4.format(dateTimeFormatter9);
        java.time.LocalDateTime localDateTime16 = localDate4.atStartOfDay();
        java.time.LocalDate localDate18 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int19 = localDate18.getMonthValue();
        int int20 = localDate18.getDayOfYear();
        java.time.LocalDate localDate22 = localDate18.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField23 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit24 = chronoField23.getRangeUnit();
        long long25 = localDate4.until((java.time.temporal.Temporal) localDate18, temporalUnit24);
        java.time.LocalDateTime localDateTime26 = localDate4.atStartOfDay();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-W02-7" + "'", str15, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + chronoField23 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField23.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit24 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit24.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale2 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayVariant(locale2);
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.lang.String str11 = locale9.getDisplayCountry();
        java.lang.String str12 = locale9.getDisplayCountry();
        java.lang.String str13 = locale7.getDisplayVariant(locale9);
        java.lang.String str14 = locale2.getDisplayVariant(locale7);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintWriter printWriter3 = new java.io.PrintWriter((java.io.OutputStream) filterOutputStream1, true);
        printWriter3.print((int) (byte) -1);
        java.io.PrintWriter printWriter7 = printWriter3.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNotNull(printWriter7);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of((long) 365000000);
        boolean boolean2 = longStream1.isParallel();
        java.util.stream.LongStream longStream4 = longStream1.skip((long) 365);
        java.util.function.LongUnaryOperator longUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream6 = longStream1.map(longUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintWriter printWriter3 = new java.io.PrintWriter((java.io.OutputStream) filterOutputStream1, true);
        char[] charArray8 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer9 = java.nio.CharBuffer.wrap(charArray8);
        java.nio.CharBuffer charBuffer11 = charBuffer9.put('#');
        char[] charArray13 = new char[] { '#' };
        java.nio.CharBuffer charBuffer14 = charBuffer9.get(charArray13);
        printWriter3.write(charArray13);
        java.net.URL uRL17 = null;
        java.security.CodeSigner[] codeSignerArray18 = new java.security.CodeSigner[] {};
        java.security.CodeSource codeSource19 = new java.security.CodeSource(uRL17, codeSignerArray18);
        java.security.PermissionCollection permissionCollection20 = null;
        java.lang.ClassLoader classLoader21 = null;
        java.security.Principal[] principalArray22 = null;
        java.security.ProtectionDomain protectionDomain23 = new java.security.ProtectionDomain(codeSource19, permissionCollection20, classLoader21, principalArray22);
        java.security.PermissionCollection permissionCollection24 = null;
        java.security.ProtectionDomain protectionDomain25 = new java.security.ProtectionDomain(codeSource19, permissionCollection24);
        java.security.Principal[] principalArray26 = protectionDomain25.getPrincipals();
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter27 = printWriter3.format("Z", (java.lang.Object[]) principalArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, 4, a,  ]");
        org.junit.Assert.assertNotNull(charBuffer9);
        org.junit.Assert.assertNotNull(charBuffer11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4]");
        org.junit.Assert.assertNotNull(charBuffer14);
        org.junit.Assert.assertNotNull(codeSignerArray18);
        org.junit.Assert.assertEquals(protectionDomain23.toString(), "ProtectionDomain  (null <no signer certificates>)\n null\n <no principals>\n null\n");
        org.junit.Assert.assertEquals(protectionDomain25.toString(), "ProtectionDomain  (null <no signer certificates>)\n null\n <no principals>\n null\n");
        org.junit.Assert.assertNotNull(principalArray26);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.format.TextStyle textStyle24 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle25 = textStyle24.asNormal();
        java.util.Locale locale27 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet28 = locale27.getExtensionKeys();
        java.util.Locale locale30 = new java.util.Locale("");
        java.lang.String str31 = locale30.getDisplayCountry();
        java.lang.String str32 = locale27.getDisplayScript(locale30);
        java.lang.String str33 = zoneOffset22.getDisplayName(textStyle24, locale27);
        int int34 = zoneOffset22.getTotalSeconds();
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset22);
        java.time.LocalDateTime localDateTime37 = localDateTime35.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime39 = localDateTime37.atZone((java.time.ZoneId) zoneOffset38);
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.UTC;
        boolean boolean42 = chronoField40.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset41);
        java.time.ZonedDateTime zonedDateTime43 = java.time.ZonedDateTime.of(localDateTime37, (java.time.ZoneId) zoneOffset41);
        java.time.DayOfWeek dayOfWeek44 = zonedDateTime43.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime46 = zonedDateTime43.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal47 = localDateTime16.adjustInto((java.time.temporal.Temporal) zonedDateTime46);
        java.time.ZonedDateTime zonedDateTime49 = zonedDateTime46.withSecond((int) (byte) 1);
        java.time.ZonedDateTime zonedDateTime50 = zonedDateTime46.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + textStyle24 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle24.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle25 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle25.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Z" + "'", str33, "Z");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime39);
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField40.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(zonedDateTime43);
        org.junit.Assert.assertTrue("'" + dayOfWeek44 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek44.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime46);
        org.junit.Assert.assertNotNull(temporal47);
        org.junit.Assert.assertNotNull(zonedDateTime49);
        org.junit.Assert.assertNotNull(zonedDateTime50);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (short) 10);
        boolean boolean2 = optionalDouble1.isPresent();
        java.util.function.DoubleSupplier doubleSupplier3 = null;
        double double4 = optionalDouble1.orElseGet(doubleSupplier3);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale1.getDisplayScript(locale4);
        java.time.chrono.Chronology chronology7 = java.time.chrono.Chronology.ofLocale(locale4);
        java.time.LocalDate localDate9 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int10 = localDate9.getMonthValue();
        java.time.LocalDate localDate12 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField13.getRangeUnit();
        boolean boolean15 = localDate12.isSupported(temporalUnit14);
        boolean boolean16 = localDate9.isBefore((java.time.chrono.ChronoLocalDate) localDate12);
        java.time.chrono.ChronoLocalDate chronoLocalDate17 = chronology7.date((java.time.temporal.TemporalAccessor) localDate12);
        boolean boolean19 = chronology7.isLeapYear((long) 1970);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField13.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chronoLocalDate17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology2 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime1);
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.ValueRange valueRange4 = chronology2.range(chronoField3);
        java.time.Instant instant6 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant8 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean9 = instant6.isAfter(instant8);
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset11 = java.time.ZoneOffset.UTC;
        boolean boolean12 = chronoField10.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset11);
        java.time.format.TextStyle textStyle13 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle14 = textStyle13.asNormal();
        java.util.Locale locale16 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.util.Locale locale19 = new java.util.Locale("");
        java.lang.String str20 = locale19.getDisplayCountry();
        java.lang.String str21 = locale16.getDisplayScript(locale19);
        java.lang.String str22 = zoneOffset11.getDisplayName(textStyle13, locale16);
        int int23 = zoneOffset11.getTotalSeconds();
        java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime24 = chronology2.zonedDateTime(instant8, (java.time.ZoneId) zoneOffset11);
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.ValueRange valueRange26 = chronoField25.range();
        java.time.temporal.TemporalUnit temporalUnit27 = chronoField25.getRangeUnit();
        java.time.temporal.ValueRange valueRange28 = chronology2.range(chronoField25);
        boolean boolean29 = valueRange28.isFixed();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField3.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + textStyle13 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle13.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle14 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle14.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Z" + "'", str22, "Z");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTime24);
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField25.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(valueRange26);
        org.junit.Assert.assertTrue("'" + temporalUnit27 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", temporalUnit27.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(valueRange28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.ValueRange valueRange1 = chronoField0.range();
        boolean boolean2 = valueRange1.isIntValue();
        long long3 = valueRange1.getMinimum();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = locale11.getScript();
        java.util.Locale locale16 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.util.Locale locale19 = new java.util.Locale("");
        java.lang.String str20 = locale19.getDisplayCountry();
        java.lang.String str21 = locale16.getDisplayScript(locale19);
        java.util.Locale locale23 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet24 = locale23.getExtensionKeys();
        java.util.Locale locale26 = new java.util.Locale("");
        java.lang.String str27 = locale26.getDisplayCountry();
        java.lang.String str28 = locale23.getDisplayScript(locale26);
        java.time.chrono.Chronology chronology29 = java.time.chrono.Chronology.ofLocale(locale26);
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale33 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet34 = locale33.getExtensionKeys();
        java.util.Locale locale36 = new java.util.Locale("");
        java.lang.String str37 = locale36.getDisplayCountry();
        java.lang.String str38 = locale33.getDisplayScript(locale36);
        java.util.Locale locale40 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet41 = locale40.getExtensionKeys();
        java.util.Locale locale43 = new java.util.Locale("");
        java.lang.String str44 = locale43.getDisplayCountry();
        java.lang.String str45 = locale40.getDisplayScript(locale43);
        java.time.temporal.ChronoField chronoField46 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset47 = java.time.ZoneOffset.UTC;
        boolean boolean48 = chronoField46.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset47);
        java.time.format.TextStyle textStyle49 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle50 = textStyle49.asNormal();
        java.util.Locale locale52 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet53 = locale52.getExtensionKeys();
        java.util.Locale locale55 = new java.util.Locale("");
        java.lang.String str56 = locale55.getDisplayCountry();
        java.lang.String str57 = locale52.getDisplayScript(locale55);
        java.lang.String str58 = zoneOffset47.getDisplayName(textStyle49, locale52);
        java.util.Locale locale60 = new java.util.Locale("");
        java.lang.String str61 = locale60.getDisplayCountry();
        java.util.Locale locale63 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale65 = new java.util.Locale("");
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale11, locale19, locale26, locale31, locale33, locale40, locale52, locale60, locale63, locale65 };
        java.util.ArrayList<java.util.Locale> localeList67 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList67, localeArray66);
        java.util.List<java.util.Locale> localeList69 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList67);
        java.lang.String[] strArray84 = new java.lang.String[] { "1969-12-27T20:00:16.000000097", "OptionalLong[0]", "P-1M", "$", "ISO", "1969-W52-6Z", "1970-W02-7", "1969-W52-6Z", "", "ISO", "1 Jan 1970 00:00:00 GMT", "1970-W02-7", "/", "$" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList85);
        boolean boolean88 = valueRange1.equals((java.lang.Object) strList85);
        java.util.List<java.lang.Class<?>> wildcardClassList89 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList85);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(valueRange1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(charSet34);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertNotNull(charSet41);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + chronoField46 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField46.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + textStyle49 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle49.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle50 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle50.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertNotNull(charSet53);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Z" + "'", str58, "Z");
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertNotNull(localeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(localeList69);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClassList89);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        char[] charArray4 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap(charArray4);
        java.nio.CharBuffer charBuffer7 = charBuffer5.put('#');
        char[] charArray9 = new char[] { '#' };
        java.nio.CharBuffer charBuffer10 = charBuffer5.get(charArray9);
        java.nio.CharBuffer charBuffer12 = charBuffer10.put('#');
        char[] charArray17 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer18 = java.nio.CharBuffer.wrap(charArray17);
        java.nio.CharBuffer charBuffer20 = charBuffer18.put('#');
        char[] charArray22 = new char[] { '#' };
        java.nio.CharBuffer charBuffer23 = charBuffer18.get(charArray22);
        char[] charArray28 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer29 = java.nio.CharBuffer.wrap(charArray28);
        java.nio.CharBuffer charBuffer31 = charBuffer29.put('#');
        char[] charArray33 = new char[] { '#' };
        java.nio.CharBuffer charBuffer34 = charBuffer29.get(charArray33);
        int int35 = charBuffer23.compareTo(charBuffer29);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer36 = charBuffer12.put(charBuffer29);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, 4, #,  ]");
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(charBuffer7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(charBuffer12);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, 4, a,  ]");
        org.junit.Assert.assertNotNull(charBuffer18);
        org.junit.Assert.assertNotNull(charBuffer20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4]");
        org.junit.Assert.assertNotNull(charBuffer23);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "#4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "#4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, 4, a,  ]");
        org.junit.Assert.assertNotNull(charBuffer29);
        org.junit.Assert.assertNotNull(charBuffer31);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[4]");
        org.junit.Assert.assertNotNull(charBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("", "", "zh");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int5 = zoneOffset0.compareTo(zoneOffset4);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        boolean boolean8 = chronoField6.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset7);
        java.time.format.TextStyle textStyle9 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle10 = textStyle9.asNormal();
        java.util.Locale locale12 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = locale12.getDisplayScript(locale15);
        java.lang.String str18 = zoneOffset7.getDisplayName(textStyle9, locale12);
        java.util.Locale locale20 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.lang.String str22 = locale20.getDisplayCountry();
        java.lang.String str23 = zoneOffset0.getDisplayName(textStyle9, locale20);
        java.time.format.TextStyle textStyle24 = textStyle9.asNormal();
        org.junit.Assert.assertNotNull(zoneOffset0);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4210 + "'", int5 == 4210);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField6.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + textStyle9 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle9.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle10 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle10.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Z" + "'", str18, "Z");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Z" + "'", str23, "Z");
        org.junit.Assert.assertTrue("'" + textStyle24 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle24.equals(java.time.format.TextStyle.NARROW));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.format.TextStyle textStyle24 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle25 = textStyle24.asNormal();
        java.util.Locale locale27 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet28 = locale27.getExtensionKeys();
        java.util.Locale locale30 = new java.util.Locale("");
        java.lang.String str31 = locale30.getDisplayCountry();
        java.lang.String str32 = locale27.getDisplayScript(locale30);
        java.lang.String str33 = zoneOffset22.getDisplayName(textStyle24, locale27);
        int int34 = zoneOffset22.getTotalSeconds();
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset22);
        java.time.LocalDateTime localDateTime37 = localDateTime35.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime39 = localDateTime37.atZone((java.time.ZoneId) zoneOffset38);
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.UTC;
        boolean boolean42 = chronoField40.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset41);
        java.time.ZonedDateTime zonedDateTime43 = java.time.ZonedDateTime.of(localDateTime37, (java.time.ZoneId) zoneOffset41);
        java.time.DayOfWeek dayOfWeek44 = zonedDateTime43.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime46 = zonedDateTime43.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal47 = localDateTime16.adjustInto((java.time.temporal.Temporal) zonedDateTime46);
        java.time.LocalDateTime localDateTime49 = localDateTime16.minusWeeks(0L);
        java.time.temporal.ChronoField chronoField50 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset51 = java.time.ZoneOffset.UTC;
        boolean boolean52 = chronoField50.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset51);
        java.time.zone.ZoneRules zoneRules53 = zoneOffset51.getRules();
        long long54 = localDateTime49.toEpochSecond(zoneOffset51);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + textStyle24 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle24.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle25 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle25.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Z" + "'", str33, "Z");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime39);
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField40.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(zonedDateTime43);
        org.junit.Assert.assertTrue("'" + dayOfWeek44 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek44.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime46);
        org.junit.Assert.assertNotNull(temporal47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + chronoField50 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField50.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(zoneRules53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 16L + "'", long54 == 16L);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        java.time.Instant instant1 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant3 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean4 = instant1.isAfter(instant3);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.UTC;
        boolean boolean9 = chronoField7.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset8);
        java.time.format.TextStyle textStyle10 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle11 = textStyle10.asNormal();
        java.util.Locale locale13 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.util.Locale locale16 = new java.util.Locale("");
        java.lang.String str17 = locale16.getDisplayCountry();
        java.lang.String str18 = locale13.getDisplayScript(locale16);
        java.lang.String str19 = zoneOffset8.getDisplayName(textStyle10, locale13);
        int int20 = zoneOffset8.getTotalSeconds();
        java.time.LocalDateTime localDateTime21 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset8);
        java.time.LocalDateTime localDateTime23 = localDateTime21.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime25 = localDateTime23.atZone((java.time.ZoneId) zoneOffset24);
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.UTC;
        boolean boolean28 = chronoField26.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset27);
        java.time.ZonedDateTime zonedDateTime29 = java.time.ZonedDateTime.of(localDateTime23, (java.time.ZoneId) zoneOffset27);
        java.time.ZonedDateTime zonedDateTime30 = java.time.ZonedDateTime.ofInstant(instant1, (java.time.ZoneId) zoneOffset27);
        java.time.Instant instant32 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant34 = instant32.minusMillis((long) 'x');
        int int35 = instant1.compareTo(instant34);
        java.time.ZoneOffset zoneOffset36 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset40 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int41 = zoneOffset36.compareTo(zoneOffset40);
        java.time.LocalDateTime localDateTime42 = java.time.LocalDateTime.ofInstant(instant34, (java.time.ZoneId) zoneOffset36);
        java.time.temporal.ChronoField chronoField45 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset46 = java.time.ZoneOffset.UTC;
        boolean boolean47 = chronoField45.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset46);
        java.time.format.TextStyle textStyle48 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle49 = textStyle48.asNormal();
        java.util.Locale locale51 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet52 = locale51.getExtensionKeys();
        java.util.Locale locale54 = new java.util.Locale("");
        java.lang.String str55 = locale54.getDisplayCountry();
        java.lang.String str56 = locale51.getDisplayScript(locale54);
        java.lang.String str57 = zoneOffset46.getDisplayName(textStyle48, locale51);
        int int58 = zoneOffset46.getTotalSeconds();
        java.time.LocalDateTime localDateTime59 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset46);
        java.time.LocalDateTime localDateTime61 = localDateTime59.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset62 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime63 = localDateTime61.atZone((java.time.ZoneId) zoneOffset62);
        java.time.temporal.ChronoField chronoField64 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset65 = java.time.ZoneOffset.UTC;
        boolean boolean66 = chronoField64.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset65);
        java.time.ZonedDateTime zonedDateTime67 = java.time.ZonedDateTime.of(localDateTime61, (java.time.ZoneId) zoneOffset65);
        java.time.DayOfWeek dayOfWeek68 = zonedDateTime67.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime70 = zonedDateTime67.withMinute((int) (byte) 10);
        java.time.Period period72 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period74 = period72.plusYears((long) (short) 0);
        java.time.Period period76 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod77 = period74.plus((java.time.temporal.TemporalAmount) period76);
        java.time.ZonedDateTime zonedDateTime78 = zonedDateTime67.minus((java.time.temporal.TemporalAmount) chronoPeriod77);
        java.time.OffsetTime offsetTime79 = java.time.OffsetTime.from((java.time.temporal.TemporalAccessor) zonedDateTime67);
        java.time.ZoneOffset zoneOffset80 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset84 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int85 = zoneOffset80.compareTo(zoneOffset84);
        java.time.OffsetTime offsetTime86 = offsetTime79.withOffsetSameInstant(zoneOffset84);
        java.time.OffsetTime offsetTime87 = java.time.OffsetTime.ofInstant(instant34, (java.time.ZoneId) zoneOffset84);
        java.time.temporal.ChronoField chronoField88 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit89 = chronoField88.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant91 = instant34.with((java.time.temporal.TemporalField) chronoField88, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for NanoOfDay (valid values 0 - 86399999999999): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField7.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + textStyle10 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle10.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle11 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle11.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Z" + "'", str19, "Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime25);
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField26.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 120000000 + "'", int35 == 120000000);
        org.junit.Assert.assertNotNull(zoneOffset36);
        org.junit.Assert.assertNotNull(zoneOffset40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4210 + "'", int41 == 4210);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + chronoField45 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField45.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + textStyle48 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle48.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle49 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle49.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertNotNull(charSet52);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Z" + "'", str57, "Z");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(zoneOffset62);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime63);
        org.junit.Assert.assertTrue("'" + chronoField64 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField64.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(zonedDateTime67);
        org.junit.Assert.assertTrue("'" + dayOfWeek68 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek68.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(chronoPeriod77);
        org.junit.Assert.assertNotNull(zonedDateTime78);
        org.junit.Assert.assertNotNull(offsetTime79);
        org.junit.Assert.assertNotNull(zoneOffset80);
        org.junit.Assert.assertNotNull(zoneOffset84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 4210 + "'", int85 == 4210);
        org.junit.Assert.assertNotNull(offsetTime86);
        org.junit.Assert.assertNotNull(offsetTime87);
        org.junit.Assert.assertTrue("'" + chronoField88 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField88.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit89 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit89.equals(java.time.temporal.ChronoUnit.DAYS));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        byte byte7 = byteBuffer6.get();
        float float8 = byteBuffer6.getFloat();
        java.nio.Buffer buffer9 = byteBuffer6.flip();
        // The following exception was thrown during execution in test generation
        try {
            float float11 = byteBuffer6.getFloat(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 9.547344E21f + "'", float8 == 9.547344E21f);
        org.junit.Assert.assertNotNull(buffer9);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        java.util.InvalidPropertiesFormatException invalidPropertiesFormatException1 = new java.util.InvalidPropertiesFormatException("1970-01-01T00:00:00.120Z");
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.UTC;
        boolean boolean23 = chronoField21.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset22);
        java.time.ZonedDateTime zonedDateTime24 = java.time.ZonedDateTime.of(localDateTime18, (java.time.ZoneId) zoneOffset22);
        java.time.DayOfWeek dayOfWeek25 = zonedDateTime24.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime24.withMinute((int) (byte) 10);
        java.time.Period period29 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period31 = period29.plusYears((long) (short) 0);
        java.time.Period period33 = java.time.Period.ofMonths((int) (short) -1);
        java.time.chrono.ChronoPeriod chronoPeriod34 = period31.plus((java.time.temporal.TemporalAmount) period33);
        java.time.temporal.Temporal temporal35 = zonedDateTime27.minus((java.time.temporal.TemporalAmount) chronoPeriod34);
        java.time.ZonedDateTime zonedDateTime36 = zonedDateTime27.withLaterOffsetAtOverlap();
        java.time.chrono.Chronology chronology37 = zonedDateTime36.getChronology();
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField21.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + dayOfWeek25 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek25.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(chronoPeriod34);
        org.junit.Assert.assertNotNull(temporal35);
        org.junit.Assert.assertNotNull(zonedDateTime36);
        org.junit.Assert.assertNotNull(chronology37);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        int int0 = java.util.Spliterator.DISTINCT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10000000000L);
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        java.time.Month month0 = java.time.Month.JULY;
        int int1 = month0.minLength();
        java.time.Month month3 = month0.plus(0L);
        java.time.format.TextStyle textStyle4 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle5 = textStyle4.asNormal();
        java.util.Locale locale7 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale7.getDisplayCountry();
        java.lang.String str10 = month3.getDisplayName(textStyle5, locale7);
        int int11 = month3.getValue();
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.JULY + "'", month0.equals(java.time.Month.JULY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
        org.junit.Assert.assertTrue("'" + month3 + "' != '" + java.time.Month.JULY + "'", month3.equals(java.time.Month.JULY));
        org.junit.Assert.assertTrue("'" + textStyle4 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle4.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "7" + "'", str10, "7");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        java.io.PrintStream printStream1 = new java.io.PrintStream("1969-12-27T20:00:16.000000097Z");
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        long[] longArray6 = new long[] { 10000000000L, 466000000, (-359984L), (byte) -1, (byte) 0, 0L };
        java.nio.LongBuffer longBuffer9 = java.nio.LongBuffer.wrap(longArray6, 0, 0);
        java.lang.String str10 = longBuffer9.toString();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[10000000000, 466000000, -359984, -1, 0, 0]");
        org.junit.Assert.assertNotNull(longBuffer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.nio.HeapLongBuffer[pos=0 lim=0 cap=6]" + "'", str10, "java.nio.HeapLongBuffer[pos=0 lim=0 cap=6]");
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.MONDAY;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.UTC;
        boolean boolean3 = chronoField1.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset2);
        java.time.format.TextStyle textStyle4 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle5 = textStyle4.asNormal();
        java.util.Locale locale7 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.util.Locale locale10 = new java.util.Locale("");
        java.lang.String str11 = locale10.getDisplayCountry();
        java.lang.String str12 = locale7.getDisplayScript(locale10);
        java.lang.String str13 = zoneOffset2.getDisplayName(textStyle4, locale7);
        int int14 = zoneOffset2.getTotalSeconds();
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.now((java.time.ZoneId) zoneOffset2);
        java.time.temporal.Temporal temporal16 = dayOfWeek0.adjustInto((java.time.temporal.Temporal) localDateTime15);
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.MONDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.MONDAY));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField1.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + textStyle4 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle4.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Z" + "'", str13, "Z");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(temporal16);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of((long) 365000000);
        boolean boolean2 = longStream1.isParallel();
        java.util.stream.LongStream longStream3 = longStream1.sorted();
        java.util.stream.DoubleStream doubleStream4 = longStream3.asDoubleStream();
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        java.time.LocalTime localTime0 = java.time.LocalTime.now();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = localTime0.withSecond(4210);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfMinute (valid values 0 - 59): 4210");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        java.nio.charset.CodingErrorAction codingErrorAction0 = java.nio.charset.CodingErrorAction.REPORT;
        org.junit.Assert.assertNotNull(codingErrorAction0);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.UTC;
        boolean boolean2 = chronoField0.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset1);
        java.time.format.TextStyle textStyle3 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle4 = textStyle3.asNormal();
        java.util.Locale locale6 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale6.getDisplayScript(locale9);
        java.lang.String str12 = zoneOffset1.getDisplayName(textStyle3, locale6);
        java.util.Locale locale14 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet15 = locale14.getExtensionKeys();
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getDisplayCountry();
        java.lang.String str19 = locale14.getDisplayScript(locale17);
        java.lang.String str20 = locale14.getDisplayCountry();
        java.lang.String str21 = locale6.getDisplayCountry(locale14);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + textStyle3 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle3.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle4 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle4.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        long[] longArray6 = new long[] { 10000000000L, 466000000, (-359984L), (byte) -1, (byte) 0, 0L };
        java.nio.LongBuffer longBuffer9 = java.nio.LongBuffer.wrap(longArray6, 0, 0);
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        charSet12.clear();
        java.util.Spliterator<java.lang.Character> charSpliterator14 = charSet12.spliterator();
        int int15 = charSet12.size();
        charSet12.clear();
        java.time.LocalTime localTime18 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology19 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime18);
        java.time.LocalTime localTime21 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology22 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime21);
        java.time.LocalTime localTime24 = localTime21.minusHours(1L);
        boolean boolean25 = localTime18.isBefore(localTime24);
        java.time.LocalTime localTime27 = localTime18.minusMinutes((long) 0);
        java.time.LocalDate localDate29 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int30 = localDate29.getMonthValue();
        int int31 = localDate29.getDayOfYear();
        java.time.LocalDate localDate33 = localDate29.withYear((int) ' ');
        java.time.LocalDateTime localDateTime34 = localTime18.atDate(localDate29);
        boolean boolean35 = charSet12.contains((java.lang.Object) localTime18);
        boolean boolean36 = longBuffer9.equals((java.lang.Object) boolean35);
        boolean boolean37 = longBuffer9.hasArray();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[10000000000, 466000000, -359984, -1, 0, 0]");
        org.junit.Assert.assertNotNull(longBuffer9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertNotNull(charSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 11 + "'", int31 == 11);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("F", "P0D");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: F [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        boolean boolean7 = localDate4.isSupported(temporalUnit6);
        boolean boolean8 = localDate1.isBefore((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.format.DateTimeFormatter dateTimeFormatter9 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray11 = new java.time.temporal.TemporalField[] { chronoField10 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet12 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet12, temporalFieldArray11);
        java.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet12);
        java.lang.String str15 = localDate4.format(dateTimeFormatter9);
        java.time.LocalDateTime localDateTime16 = localDate4.atStartOfDay();
        java.time.LocalDate localDate18 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int19 = localDate18.getMonthValue();
        int int20 = localDate18.getDayOfYear();
        java.time.LocalDate localDate22 = localDate18.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField23 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit24 = chronoField23.getRangeUnit();
        long long25 = localDate4.until((java.time.temporal.Temporal) localDate18, temporalUnit24);
        int int26 = localDate4.lengthOfMonth();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-W02-7" + "'", str15, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + chronoField23 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField23.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit24 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit24.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 31 + "'", int26 == 31);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.OffsetTime offsetTime2 = offsetTime0.withNano((int) (byte) 0);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.UTC;
        boolean boolean7 = chronoField5.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset6);
        java.time.format.TextStyle textStyle8 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle9 = textStyle8.asNormal();
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.util.Locale locale14 = new java.util.Locale("");
        java.lang.String str15 = locale14.getDisplayCountry();
        java.lang.String str16 = locale11.getDisplayScript(locale14);
        java.lang.String str17 = zoneOffset6.getDisplayName(textStyle8, locale11);
        int int18 = zoneOffset6.getTotalSeconds();
        java.time.LocalDateTime localDateTime19 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset6);
        java.time.LocalDateTime localDateTime21 = localDateTime19.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.UTC;
        boolean boolean26 = chronoField24.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset25);
        java.time.format.TextStyle textStyle27 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle28 = textStyle27.asNormal();
        java.util.Locale locale30 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet31 = locale30.getExtensionKeys();
        java.util.Locale locale33 = new java.util.Locale("");
        java.lang.String str34 = locale33.getDisplayCountry();
        java.lang.String str35 = locale30.getDisplayScript(locale33);
        java.lang.String str36 = zoneOffset25.getDisplayName(textStyle27, locale30);
        int int37 = zoneOffset25.getTotalSeconds();
        java.time.LocalDateTime localDateTime38 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset25);
        java.time.LocalDateTime localDateTime40 = localDateTime38.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime42 = localDateTime40.atZone((java.time.ZoneId) zoneOffset41);
        java.time.temporal.ChronoField chronoField43 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset44 = java.time.ZoneOffset.UTC;
        boolean boolean45 = chronoField43.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset44);
        java.time.ZonedDateTime zonedDateTime46 = java.time.ZonedDateTime.of(localDateTime40, (java.time.ZoneId) zoneOffset44);
        java.time.DayOfWeek dayOfWeek47 = zonedDateTime46.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime49 = zonedDateTime46.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal50 = localDateTime19.adjustInto((java.time.temporal.Temporal) zonedDateTime49);
        java.time.temporal.ChronoField chronoField51 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        long long53 = chronoField51.checkValidValue((long) 16);
        java.time.temporal.ChronoField chronoField56 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset57 = java.time.ZoneOffset.UTC;
        boolean boolean58 = chronoField56.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset57);
        java.time.format.TextStyle textStyle59 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle60 = textStyle59.asNormal();
        java.util.Locale locale62 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet63 = locale62.getExtensionKeys();
        java.util.Locale locale65 = new java.util.Locale("");
        java.lang.String str66 = locale65.getDisplayCountry();
        java.lang.String str67 = locale62.getDisplayScript(locale65);
        java.lang.String str68 = zoneOffset57.getDisplayName(textStyle59, locale62);
        int int69 = zoneOffset57.getTotalSeconds();
        java.time.LocalDateTime localDateTime70 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset57);
        java.time.LocalDateTime localDateTime72 = localDateTime70.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset73 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime74 = localDateTime72.atZone((java.time.ZoneId) zoneOffset73);
        java.time.temporal.ChronoField chronoField75 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset76 = java.time.ZoneOffset.UTC;
        boolean boolean77 = chronoField75.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset76);
        java.time.ZonedDateTime zonedDateTime78 = java.time.ZonedDateTime.of(localDateTime72, (java.time.ZoneId) zoneOffset76);
        java.time.DayOfWeek dayOfWeek79 = zonedDateTime78.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime81 = zonedDateTime78.withMinute((int) (byte) 10);
        long long82 = chronoField51.getFrom((java.time.temporal.TemporalAccessor) zonedDateTime81);
        java.util.Locale locale83 = java.util.Locale.ITALIAN;
        java.lang.String str84 = locale83.getCountry();
        java.lang.String str85 = chronoField51.getDisplayName(locale83);
        boolean boolean86 = zonedDateTime49.isSupported((java.time.temporal.TemporalField) chronoField51);
        long long87 = offsetTime2.getLong((java.time.temporal.TemporalField) chronoField51);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField5.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + textStyle8 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle8.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle9 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle9.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z" + "'", str17, "Z");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField24.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + textStyle27 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle27.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle28 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle28.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(charSet31);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Z" + "'", str36, "Z");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime42);
        org.junit.Assert.assertTrue("'" + chronoField43 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField43.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(zonedDateTime46);
        org.junit.Assert.assertTrue("'" + dayOfWeek47 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek47.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime49);
        org.junit.Assert.assertNotNull(temporal50);
        org.junit.Assert.assertTrue("'" + chronoField51 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField51.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 16L + "'", long53 == 16L);
        org.junit.Assert.assertTrue("'" + chronoField56 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField56.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + textStyle59 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle59.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle60 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle60.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertNotNull(charSet63);
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Z" + "'", str68, "Z");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(zoneOffset73);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime74);
        org.junit.Assert.assertTrue("'" + chronoField75 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField75.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(zonedDateTime78);
        org.junit.Assert.assertTrue("'" + dayOfWeek79 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek79.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime81);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 72616000L + "'", long82 == 72616000L);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "it");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "MilliOfDay" + "'", str85, "MilliOfDay");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long87 + "' != '" + 34855000L + "'", long87 == 34855000L);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        java.security.SignatureException signatureException1 = new java.security.SignatureException(".");
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        java.time.format.FormatStyle formatStyle0 = java.time.format.FormatStyle.LONG;
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofLocalizedTime(formatStyle0);
        java.time.format.DateTimeFormatter dateTimeFormatter2 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle0);
        org.junit.Assert.assertTrue("'" + formatStyle0 + "' != '" + java.time.format.FormatStyle.LONG + "'", formatStyle0.equals(java.time.format.FormatStyle.LONG));
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList7 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList7, charArray6);
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream16 = java.util.stream.IntStream.of(intArray15);
        java.util.stream.IntStream intStream17 = charListMap2.put(charList7, intStream16);
        java.util.Locale locale19 = new java.util.Locale("");
        java.lang.String str20 = locale19.getDisplayCountry();
        java.io.File file21 = null;
        java.io.File file23 = new java.io.File(file21, "");
        java.io.File file24 = file23.getCanonicalFile();
        boolean boolean25 = charListMap2.remove((java.lang.Object) str20, (java.lang.Object) file23);
        long long26 = file23.lastModified();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNull(intStream17);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull("file23.getParent() == null", file23.getParent());
        org.junit.Assert.assertEquals(file23.toString(), "");
        org.junit.Assert.assertNotNull(file24);
// flaky:         org.junit.Assert.assertEquals(file24.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file24.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        double[] doubleArray4 = new double[] { 1.0d, ' ', 1.0f, (-1L) };
        java.util.stream.DoubleStream doubleStream5 = java.util.stream.DoubleStream.of(doubleArray4);
        java.util.stream.DoubleStream doubleStream6 = doubleStream5.parallel();
        boolean boolean7 = doubleStream6.isParallel();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        java.io.File file3 = file2.getCanonicalFile();
        boolean boolean4 = file3.createNewFile();
        java.net.URI uRI5 = file3.toURI();
        java.net.URI uRI7 = uRI5.resolve("1970-W02-7");
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertNotNull(file3);
// flaky:         org.junit.Assert.assertEquals(file3.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNotNull(uRI7);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.putShort((short) 0);
        java.nio.LongBuffer longBuffer9 = byteBuffer8.asLongBuffer();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(longBuffer9);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.UTC;
        boolean boolean2 = chronoField0.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset1);
        java.time.zone.ZoneRules zoneRules3 = zoneOffset1.getRules();
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        boolean boolean8 = chronoField6.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset7);
        java.time.format.TextStyle textStyle9 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle10 = textStyle9.asNormal();
        java.util.Locale locale12 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = locale12.getDisplayScript(locale15);
        java.lang.String str18 = zoneOffset7.getDisplayName(textStyle9, locale12);
        int int19 = zoneOffset7.getTotalSeconds();
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset7);
        java.time.LocalDateTime localDateTime22 = localDateTime20.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.UTC;
        boolean boolean27 = chronoField25.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset26);
        java.time.format.TextStyle textStyle28 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle29 = textStyle28.asNormal();
        java.util.Locale locale31 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet32 = locale31.getExtensionKeys();
        java.util.Locale locale34 = new java.util.Locale("");
        java.lang.String str35 = locale34.getDisplayCountry();
        java.lang.String str36 = locale31.getDisplayScript(locale34);
        java.lang.String str37 = zoneOffset26.getDisplayName(textStyle28, locale31);
        int int38 = zoneOffset26.getTotalSeconds();
        java.time.LocalDateTime localDateTime39 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset26);
        java.time.LocalDateTime localDateTime41 = localDateTime39.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime43 = localDateTime41.atZone((java.time.ZoneId) zoneOffset42);
        java.time.temporal.ChronoField chronoField44 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset45 = java.time.ZoneOffset.UTC;
        boolean boolean46 = chronoField44.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset45);
        java.time.ZonedDateTime zonedDateTime47 = java.time.ZonedDateTime.of(localDateTime41, (java.time.ZoneId) zoneOffset45);
        java.time.DayOfWeek dayOfWeek48 = zonedDateTime47.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime50 = zonedDateTime47.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal51 = localDateTime20.adjustInto((java.time.temporal.Temporal) zonedDateTime50);
        java.time.LocalDateTime localDateTime52 = zonedDateTime50.toLocalDateTime();
        java.time.ZoneOffset zoneOffset53 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset57 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int58 = zoneOffset53.compareTo(zoneOffset57);
        boolean boolean59 = zoneRules3.isValidOffset(localDateTime52, zoneOffset57);
        java.time.LocalDateTime localDateTime60 = java.time.LocalDateTime.MIN;
        boolean boolean61 = localDateTime52.isBefore((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime60);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zoneRules3);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField6.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + textStyle9 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle9.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle10 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle10.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Z" + "'", str18, "Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField25.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + textStyle28 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle28.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle29 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle29.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(charSet32);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Z" + "'", str37, "Z");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime43);
        org.junit.Assert.assertTrue("'" + chronoField44 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField44.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(zonedDateTime47);
        org.junit.Assert.assertTrue("'" + dayOfWeek48 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek48.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime50);
        org.junit.Assert.assertNotNull(temporal51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(zoneOffset53);
        org.junit.Assert.assertNotNull(zoneOffset57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 4210 + "'", int58 == 4210);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        java.security.ProtectionDomain[] protectionDomainArray0 = new java.security.ProtectionDomain[] {};
        java.security.AccessControlContext accessControlContext1 = new java.security.AccessControlContext(protectionDomainArray0);
        boolean boolean3 = accessControlContext1.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(protectionDomainArray0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(11);
        java.nio.IntBuffer intBuffer2 = intBuffer1.compact();
        boolean boolean3 = intBuffer2.isDirect();
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertNotNull(intBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MIN;
        boolean boolean2 = offsetTime0.isEqual(offsetTime1);
        java.time.Instant instant4 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant6 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean7 = instant4.isAfter(instant6);
        java.time.Period period9 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period11 = period9.plusYears((long) (short) 0);
        java.time.chrono.ChronoPeriod chronoPeriod13 = period11.multipliedBy((int) ' ');
        java.time.LocalDate localDate15 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit17 = chronoField16.getRangeUnit();
        boolean boolean18 = localDate15.isSupported(temporalUnit17);
        long long19 = chronoPeriod13.get(temporalUnit17);
        boolean boolean20 = instant6.isSupported(temporalUnit17);
        java.time.OffsetTime offsetTime21 = offsetTime1.truncatedTo(temporalUnit17);
        java.time.OffsetTime offsetTime23 = offsetTime1.plusNanos(72616000L);
        java.time.LocalTime localTime25 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology26 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime25);
        java.time.temporal.ChronoField chronoField27 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.ValueRange valueRange28 = chronology26.range(chronoField27);
        java.time.Instant instant30 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant32 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean33 = instant30.isAfter(instant32);
        java.time.temporal.ChronoField chronoField34 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset35 = java.time.ZoneOffset.UTC;
        boolean boolean36 = chronoField34.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset35);
        java.time.format.TextStyle textStyle37 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle38 = textStyle37.asNormal();
        java.util.Locale locale40 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet41 = locale40.getExtensionKeys();
        java.util.Locale locale43 = new java.util.Locale("");
        java.lang.String str44 = locale43.getDisplayCountry();
        java.lang.String str45 = locale40.getDisplayScript(locale43);
        java.lang.String str46 = zoneOffset35.getDisplayName(textStyle37, locale40);
        int int47 = zoneOffset35.getTotalSeconds();
        java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime48 = chronology26.zonedDateTime(instant32, (java.time.ZoneId) zoneOffset35);
        java.time.OffsetTime offsetTime49 = offsetTime23.withOffsetSameLocal(zoneOffset35);
        int int50 = offsetTime49.getMinute();
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(offsetTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(chronoPeriod13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField16.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit17 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit17.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(offsetTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + chronoField27 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField27.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange28);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + chronoField34 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField34.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + textStyle37 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle37.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle38 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle38.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertNotNull(charSet41);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Z" + "'", str46, "Z");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTime48);
        org.junit.Assert.assertNotNull(offsetTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int5 = localDate4.getMonthValue();
        int int6 = localDate4.getDayOfYear();
        boolean boolean7 = localDate2.isAfter((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.OffsetDateTime offsetDateTime8 = offsetTime0.atDate(localDate2);
        java.time.LocalDate localDate10 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int11 = localDate10.getMonthValue();
        java.time.LocalDate localDate13 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField14.getRangeUnit();
        boolean boolean16 = localDate13.isSupported(temporalUnit15);
        boolean boolean17 = localDate10.isBefore((java.time.chrono.ChronoLocalDate) localDate13);
        java.time.format.DateTimeFormatter dateTimeFormatter18 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray20 = new java.time.temporal.TemporalField[] { chronoField19 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet21 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet21, temporalFieldArray20);
        java.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter18.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet21);
        java.lang.String str24 = localDate13.format(dateTimeFormatter18);
        java.time.LocalDateTime localDateTime25 = localDate13.atStartOfDay();
        java.time.LocalDate localDate27 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int28 = localDate27.getMonthValue();
        int int29 = localDate27.getDayOfYear();
        java.time.LocalDate localDate31 = localDate27.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit33 = chronoField32.getRangeUnit();
        long long34 = localDate13.until((java.time.temporal.Temporal) localDate27, temporalUnit33);
        java.time.OffsetDateTime offsetDateTime35 = offsetTime0.atDate(localDate27);
        java.time.DayOfWeek dayOfWeek36 = offsetDateTime35.getDayOfWeek();
        java.time.OffsetDateTime offsetDateTime38 = offsetDateTime35.withDayOfYear((int) (short) 1);
        java.time.OffsetTime offsetTime39 = java.time.OffsetTime.now();
        java.time.LocalDate localDate41 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate43 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int44 = localDate43.getMonthValue();
        int int45 = localDate43.getDayOfYear();
        boolean boolean46 = localDate41.isAfter((java.time.chrono.ChronoLocalDate) localDate43);
        java.time.OffsetDateTime offsetDateTime47 = offsetTime39.atDate(localDate41);
        java.time.LocalDate localDate49 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int50 = localDate49.getMonthValue();
        java.time.LocalDate localDate52 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField53 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit54 = chronoField53.getRangeUnit();
        boolean boolean55 = localDate52.isSupported(temporalUnit54);
        boolean boolean56 = localDate49.isBefore((java.time.chrono.ChronoLocalDate) localDate52);
        java.time.format.DateTimeFormatter dateTimeFormatter57 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField58 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray59 = new java.time.temporal.TemporalField[] { chronoField58 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet60 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet60, temporalFieldArray59);
        java.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter57.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet60);
        java.lang.String str63 = localDate52.format(dateTimeFormatter57);
        java.time.LocalDateTime localDateTime64 = localDate52.atStartOfDay();
        java.time.LocalDate localDate66 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int67 = localDate66.getMonthValue();
        int int68 = localDate66.getDayOfYear();
        java.time.LocalDate localDate70 = localDate66.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField71 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit72 = chronoField71.getRangeUnit();
        long long73 = localDate52.until((java.time.temporal.Temporal) localDate66, temporalUnit72);
        java.time.OffsetDateTime offsetDateTime74 = offsetTime39.atDate(localDate66);
        java.time.temporal.ChronoField chronoField75 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean76 = offsetDateTime74.isSupported((java.time.temporal.TemporalField) chronoField75);
        java.time.temporal.ChronoField chronoField77 = java.time.temporal.ChronoField.AMPM_OF_DAY;
        java.time.temporal.ValueRange valueRange78 = offsetDateTime74.range((java.time.temporal.TemporalField) chronoField77);
        boolean boolean79 = offsetDateTime38.isBefore(offsetDateTime74);
        int int80 = offsetDateTime38.getMinute();
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField19.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-W02-7" + "'", str24, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit33 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit33.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertTrue("'" + dayOfWeek36 + "' != '" + java.time.DayOfWeek.SUNDAY + "'", dayOfWeek36.equals(java.time.DayOfWeek.SUNDAY));
        org.junit.Assert.assertNotNull(offsetDateTime38);
        org.junit.Assert.assertNotNull(offsetTime39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 11 + "'", int45 == 11);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(offsetDateTime47);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertTrue("'" + chronoField53 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField53.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit54 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit54.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertTrue("'" + chronoField58 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField58.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "1970-W02-7" + "'", str63, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(localDate66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 11 + "'", int68 == 11);
        org.junit.Assert.assertNotNull(localDate70);
        org.junit.Assert.assertTrue("'" + chronoField71 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField71.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit72 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit72.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime74);
        org.junit.Assert.assertTrue("'" + chronoField75 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField75.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + chronoField77 + "' != '" + java.time.temporal.ChronoField.AMPM_OF_DAY + "'", chronoField77.equals(java.time.temporal.ChronoField.AMPM_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int80 + "' != '" + 40 + "'", int80 == 40);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        char[] charArray4 = new char[] { 'a', '4', 'a', ' ' };
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap(charArray4);
        java.nio.CharBuffer charBuffer7 = charBuffer5.put('#');
        char[] charArray9 = new char[] { '#' };
        java.nio.CharBuffer charBuffer10 = charBuffer5.get(charArray9);
        java.nio.CharBuffer charBuffer12 = charBuffer10.put('#');
        java.nio.CharBuffer charBuffer14 = charBuffer10.put(".");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#4#.");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#4#.");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, 4, #, .]");
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(charBuffer7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(charBuffer12);
        org.junit.Assert.assertNotNull(charBuffer14);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        java.security.AccessControlException accessControlException1 = new java.security.AccessControlException("1970-01-11T00:00");
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int5 = localDate4.getMonthValue();
        int int6 = localDate4.getDayOfYear();
        boolean boolean7 = localDate2.isAfter((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.OffsetDateTime offsetDateTime8 = offsetTime0.atDate(localDate2);
        java.time.LocalDate localDate10 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int11 = localDate10.getMonthValue();
        java.time.LocalDate localDate13 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField14.getRangeUnit();
        boolean boolean16 = localDate13.isSupported(temporalUnit15);
        boolean boolean17 = localDate10.isBefore((java.time.chrono.ChronoLocalDate) localDate13);
        java.time.format.DateTimeFormatter dateTimeFormatter18 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray20 = new java.time.temporal.TemporalField[] { chronoField19 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet21 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet21, temporalFieldArray20);
        java.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter18.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet21);
        java.lang.String str24 = localDate13.format(dateTimeFormatter18);
        java.time.LocalDateTime localDateTime25 = localDate13.atStartOfDay();
        java.time.LocalDate localDate27 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int28 = localDate27.getMonthValue();
        int int29 = localDate27.getDayOfYear();
        java.time.LocalDate localDate31 = localDate27.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit33 = chronoField32.getRangeUnit();
        long long34 = localDate13.until((java.time.temporal.Temporal) localDate27, temporalUnit33);
        java.time.OffsetDateTime offsetDateTime35 = offsetTime0.atDate(localDate27);
        java.time.LocalDate localDate37 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int38 = localDate37.getMonthValue();
        java.time.LocalDate localDate40 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField41 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit42 = chronoField41.getRangeUnit();
        boolean boolean43 = localDate40.isSupported(temporalUnit42);
        boolean boolean44 = localDate37.isBefore((java.time.chrono.ChronoLocalDate) localDate40);
        java.time.format.DateTimeFormatter dateTimeFormatter45 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField46 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray47 = new java.time.temporal.TemporalField[] { chronoField46 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet48 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet48, temporalFieldArray47);
        java.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter45.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet48);
        java.lang.String str51 = localDate40.format(dateTimeFormatter45);
        java.time.LocalDateTime localDateTime52 = localDate40.atStartOfDay();
        java.time.LocalDate localDate54 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int55 = localDate54.getMonthValue();
        int int56 = localDate54.getDayOfYear();
        java.time.LocalDate localDate58 = localDate54.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField59 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit60 = chronoField59.getRangeUnit();
        long long61 = localDate40.until((java.time.temporal.Temporal) localDate54, temporalUnit60);
        boolean boolean62 = offsetTime0.isSupported(temporalUnit60);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField19.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-W02-7" + "'", str24, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit33 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit33.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertTrue("'" + chronoField41 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField41.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit42 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit42.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertTrue("'" + chronoField46 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField46.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1970-W02-7" + "'", str51, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 11 + "'", int56 == 11);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertTrue("'" + chronoField59 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField59.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit60 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit60.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        java.util.MissingResourceException missingResourceException3 = new java.util.MissingResourceException("1970-W02-7", "Z:P-1M#1970-W01-4", "LocalTime");
        java.lang.String str4 = missingResourceException3.getClassName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z:P-1M#1970-W01-4" + "'", str4, "Z:P-1M#1970-W01-4");
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.util.Set<java.util.Map.Entry<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>> charListEntrySet3 = charListMap2.entrySet();
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap6 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean8 = charListMap6.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray10 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList11 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList11, charArray10);
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream20 = java.util.stream.IntStream.of(intArray19);
        java.util.stream.IntStream intStream21 = charListMap6.put(charList11, intStream20);
        boolean boolean22 = charListMap2.containsKey((java.lang.Object) charListMap6);
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap25 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean27 = charListMap25.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray29 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList30 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList30, charArray29);
        int[] intArray38 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream39 = java.util.stream.IntStream.of(intArray38);
        java.util.stream.IntStream intStream40 = charListMap25.put(charList30, intStream39);
        java.util.Spliterator<java.lang.Character> charSpliterator41 = charList30.spliterator();
        int[] intArray48 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream49 = java.util.stream.IntStream.of(intArray48);
        java.util.stream.IntStream intStream50 = intStream49.sequential();
        java.util.stream.IntStream intStream52 = intStream50.limit((long) 97);
        java.util.stream.IntStream intStream53 = charListMap6.put(charList30, intStream52);
        boolean boolean54 = charList30.isEmpty();
        org.junit.Assert.assertNotNull(charListEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertNull(intStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream39);
        org.junit.Assert.assertNull(intStream40);
        org.junit.Assert.assertNotNull(charSpliterator41);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream49);
        org.junit.Assert.assertNotNull(intStream50);
        org.junit.Assert.assertNotNull(intStream52);
        org.junit.Assert.assertNotNull(intStream53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.putShort((short) 0);
        java.nio.ShortBuffer shortBuffer9 = byteBuffer8.asShortBuffer();
        java.nio.CharBuffer charBuffer10 = byteBuffer8.asCharBuffer();
        boolean boolean11 = charBuffer10.isDirect();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int5 = localDate4.getMonthValue();
        int int6 = localDate4.getDayOfYear();
        boolean boolean7 = localDate2.isAfter((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.OffsetDateTime offsetDateTime8 = offsetTime0.atDate(localDate2);
        java.time.LocalDate localDate10 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int11 = localDate10.getMonthValue();
        java.time.LocalDate localDate13 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField14.getRangeUnit();
        boolean boolean16 = localDate13.isSupported(temporalUnit15);
        boolean boolean17 = localDate10.isBefore((java.time.chrono.ChronoLocalDate) localDate13);
        java.time.format.DateTimeFormatter dateTimeFormatter18 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray20 = new java.time.temporal.TemporalField[] { chronoField19 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet21 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet21, temporalFieldArray20);
        java.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter18.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet21);
        java.lang.String str24 = localDate13.format(dateTimeFormatter18);
        java.time.LocalDateTime localDateTime25 = localDate13.atStartOfDay();
        java.time.LocalDate localDate27 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int28 = localDate27.getMonthValue();
        int int29 = localDate27.getDayOfYear();
        java.time.LocalDate localDate31 = localDate27.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit33 = chronoField32.getRangeUnit();
        long long34 = localDate13.until((java.time.temporal.Temporal) localDate27, temporalUnit33);
        java.time.OffsetDateTime offsetDateTime35 = offsetTime0.atDate(localDate27);
        java.time.temporal.ChronoField chronoField36 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean37 = offsetDateTime35.isSupported((java.time.temporal.TemporalField) chronoField36);
        java.time.temporal.ChronoField chronoField38 = java.time.temporal.ChronoField.AMPM_OF_DAY;
        java.time.temporal.ValueRange valueRange39 = offsetDateTime35.range((java.time.temporal.TemporalField) chronoField38);
        java.time.temporal.ChronoField chronoField42 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset43 = java.time.ZoneOffset.UTC;
        boolean boolean44 = chronoField42.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset43);
        java.time.format.TextStyle textStyle45 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle46 = textStyle45.asNormal();
        java.util.Locale locale48 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet49 = locale48.getExtensionKeys();
        java.util.Locale locale51 = new java.util.Locale("");
        java.lang.String str52 = locale51.getDisplayCountry();
        java.lang.String str53 = locale48.getDisplayScript(locale51);
        java.lang.String str54 = zoneOffset43.getDisplayName(textStyle45, locale48);
        int int55 = zoneOffset43.getTotalSeconds();
        java.time.LocalDateTime localDateTime56 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset43);
        java.time.LocalDateTime localDateTime58 = localDateTime56.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset59 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime60 = localDateTime58.atZone((java.time.ZoneId) zoneOffset59);
        long long61 = localDateChronoZonedDateTime60.toEpochSecond();
        boolean boolean62 = valueRange39.equals((java.lang.Object) long61);
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField19.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-W02-7" + "'", str24, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit33 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit33.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertTrue("'" + chronoField36 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField36.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + chronoField38 + "' != '" + java.time.temporal.ChronoField.AMPM_OF_DAY + "'", chronoField38.equals(java.time.temporal.ChronoField.AMPM_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange39);
        org.junit.Assert.assertTrue("'" + chronoField42 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField42.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + textStyle45 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle45.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle46 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle46.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNotNull(charSet49);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Z" + "'", str54, "Z");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(zoneOffset59);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-359984L) + "'", long61 == (-359984L));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime20 = localDateTime16.plusMonths((long) (short) 0);
        java.time.LocalTime localTime21 = localDateTime20.toLocalTime();
        java.time.Instant instant24 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant26 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean27 = instant24.isAfter(instant26);
        java.time.Period period29 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period31 = period29.plusYears((long) (short) 0);
        java.time.chrono.ChronoPeriod chronoPeriod33 = period31.multipliedBy((int) ' ');
        java.time.LocalDate localDate35 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField36 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit37 = chronoField36.getRangeUnit();
        boolean boolean38 = localDate35.isSupported(temporalUnit37);
        long long39 = chronoPeriod33.get(temporalUnit37);
        boolean boolean40 = instant26.isSupported(temporalUnit37);
        java.time.temporal.Temporal temporal41 = localDateTime20.minus((-359984L), temporalUnit37);
        java.time.Duration duration43 = java.time.Duration.ofMinutes((long) (byte) 0);
        java.time.Duration duration45 = duration43.withSeconds(0L);
        java.util.OptionalLong optionalLong47 = java.util.OptionalLong.of(0L);
        boolean boolean48 = duration45.equals((java.lang.Object) 0L);
        java.time.LocalDateTime localDateTime49 = localDateTime20.minus((java.time.temporal.TemporalAmount) duration45);
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(chronoPeriod33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + chronoField36 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField36.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit37 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit37.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(temporal41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(optionalLong47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(localDateTime49);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        java.util.function.DoubleUnaryOperator doubleUnaryOperator1 = java.util.function.DoubleUnaryOperator.identity();
        double double3 = doubleUnaryOperator1.applyAsDouble((double) 16);
        java.util.stream.DoubleStream doubleStream4 = java.util.stream.DoubleStream.iterate((double) (-65), doubleUnaryOperator1);
        org.junit.Assert.assertNotNull(doubleUnaryOperator1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 16.0d + "'", double3 == 16.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale4 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getDisplayCountry();
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.lang.String str10 = locale7.getScript();
        java.util.Locale locale12 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = locale12.getDisplayScript(locale15);
        java.util.Locale locale19 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        java.util.Locale locale22 = new java.util.Locale("");
        java.lang.String str23 = locale22.getDisplayCountry();
        java.lang.String str24 = locale19.getDisplayScript(locale22);
        java.time.chrono.Chronology chronology25 = java.time.chrono.Chronology.ofLocale(locale22);
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale29 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet30 = locale29.getExtensionKeys();
        java.util.Locale locale32 = new java.util.Locale("");
        java.lang.String str33 = locale32.getDisplayCountry();
        java.lang.String str34 = locale29.getDisplayScript(locale32);
        java.util.Locale locale36 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet37 = locale36.getExtensionKeys();
        java.util.Locale locale39 = new java.util.Locale("");
        java.lang.String str40 = locale39.getDisplayCountry();
        java.lang.String str41 = locale36.getDisplayScript(locale39);
        java.time.temporal.ChronoField chronoField42 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset43 = java.time.ZoneOffset.UTC;
        boolean boolean44 = chronoField42.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset43);
        java.time.format.TextStyle textStyle45 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle46 = textStyle45.asNormal();
        java.util.Locale locale48 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet49 = locale48.getExtensionKeys();
        java.util.Locale locale51 = new java.util.Locale("");
        java.lang.String str52 = locale51.getDisplayCountry();
        java.lang.String str53 = locale48.getDisplayScript(locale51);
        java.lang.String str54 = zoneOffset43.getDisplayName(textStyle45, locale48);
        java.util.Locale locale56 = new java.util.Locale("");
        java.lang.String str57 = locale56.getDisplayCountry();
        java.util.Locale locale59 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale61 = new java.util.Locale("");
        java.util.Locale[] localeArray62 = new java.util.Locale[] { locale7, locale15, locale22, locale27, locale29, locale36, locale48, locale56, locale59, locale61 };
        java.util.ArrayList<java.util.Locale> localeList63 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList63, localeArray62);
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap66 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList67 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap66);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNotNull(charSet30);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(charSet37);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + chronoField42 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField42.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + textStyle45 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle45.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle46 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle46.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNotNull(charSet49);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Z" + "'", str54, "Z");
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertNotNull(localeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertNotNull(languageRangeList67);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        java.time.Period period1 = java.time.Period.ofMonths((int) (short) -1);
        java.time.Period period3 = period1.plusYears((long) (short) 0);
        java.time.chrono.IsoChronology isoChronology4 = period3.getChronology();
        java.lang.String str5 = isoChronology4.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(isoChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISO" + "'", str5, "ISO");
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        java.net.URISyntaxException uRISyntaxException3 = new java.net.URISyntaxException("1970-W02-7", "$", (int) ':');
        java.lang.String str4 = uRISyntaxException3.getInput();
        int int5 = uRISyntaxException3.getIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-W02-7" + "'", str4, "1970-W02-7");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 58 + "'", int5 == 58);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.OptionalDouble optionalDouble1 = doubleStream0.average();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = doubleStream0.toArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        int int3 = localDate1.getDayOfYear();
        java.time.LocalDate localDate5 = localDate1.withYear((int) ' ');
        long long6 = localDate1.toEpochDay();
        java.time.DayOfWeek dayOfWeek7 = localDate1.getDayOfWeek();
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery8 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean9 = dayOfWeek7.query(booleanTemporalQuery8);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + dayOfWeek7 + "' != '" + java.time.DayOfWeek.SUNDAY + "'", dayOfWeek7.equals(java.time.DayOfWeek.SUNDAY));
        org.junit.Assert.assertNotNull(booleanTemporalQuery8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        java.util.OptionalLong optionalLong1 = java.util.OptionalLong.of(16L);
        long long2 = optionalLong1.getAsLong();
        java.util.function.LongSupplier longSupplier3 = null;
        long long4 = optionalLong1.orElseGet(longSupplier3);
        org.junit.Assert.assertNotNull(optionalLong1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16L + "'", long2 == 16L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 16L + "'", long4 == 16L);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        java.util.Properties properties0 = new java.util.Properties();
        java.lang.Object obj3 = properties0.setProperty("1970-01-11T00:00", "1 Jan 1970 00:00:00 GMT");
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        java.time.Month month0 = java.time.Month.FEBRUARY;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.FEBRUARY + "'", month0.equals(java.time.Month.FEBRUARY));
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintWriter printWriter3 = new java.io.PrintWriter((java.io.OutputStream) filterOutputStream1, true);
        // The following exception was thrown during execution in test generation
        try {
            filterOutputStream1.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        int[] intArray4 = new int[] { 7, 0, (-1), 365000000 };
        java.nio.IntBuffer intBuffer5 = java.nio.IntBuffer.wrap(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 0, -1, 365000000]");
        org.junit.Assert.assertNotNull(intBuffer5);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        java.util.function.Function<java.time.ZonedDateTime, java.time.ZonedDateTime> zonedDateTimeFunction0 = java.util.function.Function.identity();
        org.junit.Assert.assertNotNull(zonedDateTimeFunction0);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int2 = localDate1.getMonthValue();
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit6 = chronoField5.getRangeUnit();
        boolean boolean7 = localDate4.isSupported(temporalUnit6);
        boolean boolean8 = localDate1.isBefore((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.format.DateTimeFormatter dateTimeFormatter9 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray11 = new java.time.temporal.TemporalField[] { chronoField10 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet12 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet12, temporalFieldArray11);
        java.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet12);
        java.lang.String str15 = localDate4.format(dateTimeFormatter9);
        java.time.LocalDateTime localDateTime16 = localDate4.atStartOfDay();
        java.lang.String str17 = localDateTime16.toString();
        java.time.LocalDateTime localDateTime19 = localDateTime16.minusYears((long) 496000000);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit6 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit6.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField10.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-W02-7" + "'", str15, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-11T00:00" + "'", str17, "1970-01-11T00:00");
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        java.util.function.Predicate<java.util.AbstractCollection<java.lang.Character>> charCollectionPredicate1 = java.util.function.Predicate.isEqual((java.lang.Object) (short) 0);
        java.util.function.Predicate<java.util.AbstractCollection<java.lang.Character>> charCollectionPredicate3 = java.util.function.Predicate.isEqual((java.lang.Object) (short) 0);
        java.util.function.Predicate<java.util.AbstractCollection<java.lang.Character>> charCollectionPredicate4 = charCollectionPredicate1.and(charCollectionPredicate3);
        java.util.function.Predicate<java.util.AbstractCollection<java.lang.Character>> charCollectionPredicate6 = java.util.function.Predicate.isEqual((java.lang.Object) (short) 0);
        java.util.function.Predicate<java.util.AbstractCollection<java.lang.Character>> charCollectionPredicate7 = charCollectionPredicate4.or(charCollectionPredicate6);
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap10 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean12 = charListMap10.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray14 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList15 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList15, charArray14);
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream24 = java.util.stream.IntStream.of(intArray23);
        java.util.stream.IntStream intStream25 = charListMap10.put(charList15, intStream24);
        java.util.Locale locale27 = new java.util.Locale("");
        java.lang.String str28 = locale27.getDisplayCountry();
        java.io.File file29 = null;
        java.io.File file31 = new java.io.File(file29, "");
        java.io.File file32 = file31.getCanonicalFile();
        boolean boolean33 = charListMap10.remove((java.lang.Object) str28, (java.lang.Object) file31);
        boolean boolean34 = charListMap10.isEmpty();
        java.lang.Character[] charArray36 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList37 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList37, charArray36);
        java.lang.Character[] charArray40 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList41 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList41, charArray40);
        boolean boolean43 = charList37.removeAll((java.util.Collection<java.lang.Character>) charList41);
        int[] intArray50 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream51 = java.util.stream.IntStream.of(intArray50);
        java.util.Spliterator<java.lang.Integer> intSpliterator52 = intStream51.spliterator();
        java.util.stream.IntStream intStream53 = charListMap10.replace(charList41, intStream51);
        boolean boolean54 = charCollectionPredicate4.test((java.util.AbstractCollection<java.lang.Character>) charList41);
        java.time.Month month55 = java.time.Month.AUGUST;
        int int56 = charList41.indexOf((java.lang.Object) month55);
        java.util.Spliterator<java.lang.Character> charSpliterator57 = charList41.spliterator();
        org.junit.Assert.assertNotNull(charCollectionPredicate1);
        org.junit.Assert.assertNotNull(charCollectionPredicate3);
        org.junit.Assert.assertNotNull(charCollectionPredicate4);
        org.junit.Assert.assertNotNull(charCollectionPredicate6);
        org.junit.Assert.assertNotNull(charCollectionPredicate7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream24);
        org.junit.Assert.assertNull(intStream25);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull("file31.getParent() == null", file31.getParent());
        org.junit.Assert.assertEquals(file31.toString(), "");
        org.junit.Assert.assertNotNull(file32);
// flaky:         org.junit.Assert.assertEquals(file32.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file32.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream51);
        org.junit.Assert.assertNotNull(intSpliterator52);
        org.junit.Assert.assertNull(intStream53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + month55 + "' != '" + java.time.Month.AUGUST + "'", month55.equals(java.time.Month.AUGUST));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(charSpliterator57);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        java.util.Date date1 = new java.util.Date((long) (short) 100);
        int int2 = date1.getTimezoneOffset();
        date1.setYear(12);
        org.junit.Assert.assertEquals(date1.toString(), "Mon Jan 01 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.UTC;
        boolean boolean2 = chronoField0.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset1);
        java.time.zone.ZoneRules zoneRules3 = zoneOffset1.getRules();
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        boolean boolean8 = chronoField6.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset7);
        java.time.format.TextStyle textStyle9 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle10 = textStyle9.asNormal();
        java.util.Locale locale12 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = locale12.getDisplayScript(locale15);
        java.lang.String str18 = zoneOffset7.getDisplayName(textStyle9, locale12);
        int int19 = zoneOffset7.getTotalSeconds();
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset7);
        java.time.LocalDateTime localDateTime22 = localDateTime20.minusHours((long) (byte) 100);
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.UTC;
        boolean boolean27 = chronoField25.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset26);
        java.time.format.TextStyle textStyle28 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle29 = textStyle28.asNormal();
        java.util.Locale locale31 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet32 = locale31.getExtensionKeys();
        java.util.Locale locale34 = new java.util.Locale("");
        java.lang.String str35 = locale34.getDisplayCountry();
        java.lang.String str36 = locale31.getDisplayScript(locale34);
        java.lang.String str37 = zoneOffset26.getDisplayName(textStyle28, locale31);
        int int38 = zoneOffset26.getTotalSeconds();
        java.time.LocalDateTime localDateTime39 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset26);
        java.time.LocalDateTime localDateTime41 = localDateTime39.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime43 = localDateTime41.atZone((java.time.ZoneId) zoneOffset42);
        java.time.temporal.ChronoField chronoField44 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset45 = java.time.ZoneOffset.UTC;
        boolean boolean46 = chronoField44.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset45);
        java.time.ZonedDateTime zonedDateTime47 = java.time.ZonedDateTime.of(localDateTime41, (java.time.ZoneId) zoneOffset45);
        java.time.DayOfWeek dayOfWeek48 = zonedDateTime47.getDayOfWeek();
        java.time.ZonedDateTime zonedDateTime50 = zonedDateTime47.withMinute((int) (byte) 10);
        java.time.temporal.Temporal temporal51 = localDateTime20.adjustInto((java.time.temporal.Temporal) zonedDateTime50);
        java.time.LocalDateTime localDateTime52 = zonedDateTime50.toLocalDateTime();
        java.time.ZoneOffset zoneOffset53 = java.time.ZoneOffset.UTC;
        java.time.ZoneOffset zoneOffset57 = java.time.ZoneOffset.ofHoursMinutesSeconds((int) (byte) 1, (int) (byte) 10, (int) (byte) 10);
        int int58 = zoneOffset53.compareTo(zoneOffset57);
        boolean boolean59 = zoneRules3.isValidOffset(localDateTime52, zoneOffset57);
        java.time.LocalDateTime localDateTime60 = null;
        java.time.ZoneOffset zoneOffset61 = zoneRules3.getOffset(localDateTime60);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zoneRules3);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField6.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + textStyle9 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle9.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle10 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle10.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Z" + "'", str18, "Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField25.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + textStyle28 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle28.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle29 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle29.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(charSet32);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Z" + "'", str37, "Z");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime43);
        org.junit.Assert.assertTrue("'" + chronoField44 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField44.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(zonedDateTime47);
        org.junit.Assert.assertTrue("'" + dayOfWeek48 + "' != '" + java.time.DayOfWeek.SATURDAY + "'", dayOfWeek48.equals(java.time.DayOfWeek.SATURDAY));
        org.junit.Assert.assertNotNull(zonedDateTime50);
        org.junit.Assert.assertNotNull(temporal51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(zoneOffset53);
        org.junit.Assert.assertNotNull(zoneOffset57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 4210 + "'", int58 == 4210);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(zoneOffset61);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        int int0 = java.util.Spliterator.SORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.YEAR;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.YEAR + "'", chronoField0.equals(java.time.temporal.ChronoField.YEAR));
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.UTC;
        boolean boolean4 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset3);
        java.time.format.TextStyle textStyle5 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle6 = textStyle5.asNormal();
        java.util.Locale locale8 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = zoneOffset3.getDisplayName(textStyle5, locale8);
        int int15 = zoneOffset3.getTotalSeconds();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset3);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime20 = localDateTime18.atZone((java.time.ZoneId) zoneOffset19);
        java.time.chrono.Chronology chronology21 = localDateChronoZonedDateTime20.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate25 = chronology21.date(4, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 32");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField2.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + textStyle5 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle5.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime20);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.now();
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int5 = localDate4.getMonthValue();
        int int6 = localDate4.getDayOfYear();
        boolean boolean7 = localDate2.isAfter((java.time.chrono.ChronoLocalDate) localDate4);
        java.time.OffsetDateTime offsetDateTime8 = offsetTime0.atDate(localDate2);
        java.time.LocalDate localDate10 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int11 = localDate10.getMonthValue();
        java.time.LocalDate localDate13 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField14.getRangeUnit();
        boolean boolean16 = localDate13.isSupported(temporalUnit15);
        boolean boolean17 = localDate10.isBefore((java.time.chrono.ChronoLocalDate) localDate13);
        java.time.format.DateTimeFormatter dateTimeFormatter18 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray20 = new java.time.temporal.TemporalField[] { chronoField19 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet21 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet21, temporalFieldArray20);
        java.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter18.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet21);
        java.lang.String str24 = localDate13.format(dateTimeFormatter18);
        java.time.LocalDateTime localDateTime25 = localDate13.atStartOfDay();
        java.time.LocalDate localDate27 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int28 = localDate27.getMonthValue();
        int int29 = localDate27.getDayOfYear();
        java.time.LocalDate localDate31 = localDate27.withYear((int) ' ');
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.MILLI_OF_DAY;
        java.time.temporal.TemporalUnit temporalUnit33 = chronoField32.getRangeUnit();
        long long34 = localDate13.until((java.time.temporal.Temporal) localDate27, temporalUnit33);
        java.time.OffsetDateTime offsetDateTime35 = offsetTime0.atDate(localDate27);
        java.time.temporal.ChronoField chronoField36 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean37 = offsetDateTime35.isSupported((java.time.temporal.TemporalField) chronoField36);
        java.time.OffsetDateTime offsetDateTime39 = offsetDateTime35.plusWeeks((long) 31);
        java.time.OffsetTime offsetTime40 = offsetDateTime39.toOffsetTime();
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField19.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-W02-7" + "'", str24, "1970-W02-7");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.MILLI_OF_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit33 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit33.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertTrue("'" + chronoField36 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField36.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(offsetDateTime39);
        org.junit.Assert.assertNotNull(offsetTime40);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', 'u', '4', 'u', 'u', ' ', '#' };
        java.util.ArrayList<java.lang.Character> charList8 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList8, charArray7);
        java.util.Spliterator<java.lang.Character> charSpliterator10 = charList8.spliterator();
        java.util.Locale locale12 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        charSet13.clear();
        java.util.Spliterator<java.lang.Character> charSpliterator15 = charSet13.spliterator();
        int int16 = charSet13.size();
        charSet13.clear();
        boolean boolean18 = charList8.retainAll((java.util.Collection<java.lang.Character>) charSet13);
        java.time.LocalDate localDate20 = java.time.LocalDate.ofEpochDay((long) (byte) 10);
        int int21 = localDate20.getMonthValue();
        int int22 = localDate20.getDayOfYear();
        java.time.LocalDate localDate24 = localDate20.withYear((int) ' ');
        java.time.chrono.Era era25 = localDate20.getEra();
        java.time.DayOfWeek dayOfWeek26 = java.time.DayOfWeek.THURSDAY;
        java.time.temporal.ChronoField chronoField27 = java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
        boolean boolean28 = dayOfWeek26.isSupported((java.time.temporal.TemporalField) chronoField27);
        boolean boolean29 = era25.isSupported((java.time.temporal.TemporalField) chronoField27);
        int int30 = charList8.lastIndexOf((java.lang.Object) boolean29);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charSpliterator10);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertNotNull(charSpliterator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + era25 + "' != '" + java.time.chrono.IsoEra.CE + "'", era25.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + dayOfWeek26 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek26.equals(java.time.DayOfWeek.THURSDAY));
        org.junit.Assert.assertTrue("'" + chronoField27 + "' != '" + java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH + "'", chronoField27.equals(java.time.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_WEEK_DATE;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.temporal.TemporalField[] temporalFieldArray2 = new java.time.temporal.TemporalField[] { chronoField1 };
        java.util.LinkedHashSet<java.time.temporal.TemporalField> temporalFieldSet3 = new java.util.LinkedHashSet<java.time.temporal.TemporalField>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.time.temporal.TemporalField>) temporalFieldSet3, temporalFieldArray2);
        java.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withResolverFields((java.util.Set<java.time.temporal.TemporalField>) temporalFieldSet3);
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap8 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.util.Set<java.util.Map.Entry<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>> charListEntrySet9 = charListMap8.entrySet();
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap12 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean14 = charListMap12.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray16 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList17 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList17, charArray16);
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream26 = java.util.stream.IntStream.of(intArray25);
        java.util.stream.IntStream intStream27 = charListMap12.put(charList17, intStream26);
        boolean boolean28 = charListMap8.containsKey((java.lang.Object) charListMap12);
        java.time.format.ResolverStyle resolverStyle29 = java.time.format.ResolverStyle.LENIENT;
        boolean boolean30 = charListMap12.containsValue((java.lang.Object) resolverStyle29);
        java.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter0.withResolverStyle(resolverStyle29);
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap34 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.util.Set<java.util.Map.Entry<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>> charListEntrySet35 = charListMap34.entrySet();
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap38 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean40 = charListMap38.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray42 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList43 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList43, charArray42);
        int[] intArray51 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream52 = java.util.stream.IntStream.of(intArray51);
        java.util.stream.IntStream intStream53 = charListMap38.put(charList43, intStream52);
        boolean boolean54 = charListMap34.containsKey((java.lang.Object) charListMap38);
        java.time.format.ResolverStyle resolverStyle55 = java.time.format.ResolverStyle.LENIENT;
        boolean boolean56 = charListMap38.containsValue((java.lang.Object) resolverStyle55);
        java.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter31.withResolverStyle(resolverStyle55);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField1.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(temporalFieldArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(charListEntrySet9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertNull(intStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + resolverStyle29 + "' != '" + java.time.format.ResolverStyle.LENIENT + "'", resolverStyle29.equals(java.time.format.ResolverStyle.LENIENT));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(charListEntrySet35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream52);
        org.junit.Assert.assertNull(intStream53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + resolverStyle55 + "' != '" + java.time.format.ResolverStyle.LENIENT + "'", resolverStyle55.equals(java.time.format.ResolverStyle.LENIENT));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        java.time.Instant instant1 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant3 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean4 = instant1.isAfter(instant3);
        java.time.Instant instant6 = instant1.plusSeconds(10000000000L);
        java.time.LocalTime localTime8 = java.time.LocalTime.ofSecondOfDay((long) 0);
        java.time.chrono.Chronology chronology9 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localTime8);
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.temporal.ValueRange valueRange11 = chronology9.range(chronoField10);
        java.time.Instant instant13 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant15 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean16 = instant13.isAfter(instant15);
        java.time.temporal.ChronoField chronoField17 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.UTC;
        boolean boolean19 = chronoField17.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset18);
        java.time.format.TextStyle textStyle20 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle21 = textStyle20.asNormal();
        java.util.Locale locale23 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet24 = locale23.getExtensionKeys();
        java.util.Locale locale26 = new java.util.Locale("");
        java.lang.String str27 = locale26.getDisplayCountry();
        java.lang.String str28 = locale23.getDisplayScript(locale26);
        java.lang.String str29 = zoneOffset18.getDisplayName(textStyle20, locale23);
        int int30 = zoneOffset18.getTotalSeconds();
        java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime31 = chronology9.zonedDateTime(instant15, (java.time.ZoneId) zoneOffset18);
        java.time.OffsetDateTime offsetDateTime32 = java.time.OffsetDateTime.ofInstant(instant6, (java.time.ZoneId) zoneOffset18);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField10.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + chronoField17 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField17.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + textStyle20 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle20.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle21 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle21.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Z" + "'", str29, "Z");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTime31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        java.net.URI uRI3 = new java.net.URI("Z", "P-1M", "1970-W01-4");
        java.lang.String str4 = uRI3.getRawUserInfo();
        java.lang.String str5 = uRI3.getRawAuthority();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.allocate((int) (short) 1);
        int int2 = floatBuffer1.arrayOffset();
        boolean boolean3 = floatBuffer1.hasArray();
        int int4 = floatBuffer1.arrayOffset();
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        java.util.Date date1 = new java.util.Date((long) (short) 100);
        java.lang.String str2 = date1.toLocaleString();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Jan 1, 1970 12:00:00 AM" + "'", str2, "Jan 1, 1970 12:00:00 AM");
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        java.time.zone.ZoneOffsetTransitionRule.TimeDefinition timeDefinition0 = java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD;
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.UTC;
        boolean boolean5 = chronoField3.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset4);
        java.time.format.TextStyle textStyle6 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle7 = textStyle6.asNormal();
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str14 = locale9.getDisplayScript(locale12);
        java.lang.String str15 = zoneOffset4.getDisplayName(textStyle6, locale9);
        int int16 = zoneOffset4.getTotalSeconds();
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset4);
        java.time.LocalDateTime localDateTime19 = localDateTime17.plusHours((long) (short) 1);
        java.time.LocalDateTime localDateTime21 = localDateTime17.plusMonths((long) (short) 0);
        java.time.LocalTime localTime22 = localDateTime21.toLocalTime();
        java.time.Instant instant24 = java.time.Instant.ofEpochMilli((long) 'x');
        java.time.Instant instant26 = java.time.Instant.ofEpochMilli((long) 'x');
        boolean boolean27 = instant24.isAfter(instant26);
        java.time.temporal.ChronoField chronoField30 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.UTC;
        boolean boolean32 = chronoField30.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset31);
        java.time.format.TextStyle textStyle33 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle34 = textStyle33.asNormal();
        java.util.Locale locale36 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet37 = locale36.getExtensionKeys();
        java.util.Locale locale39 = new java.util.Locale("");
        java.lang.String str40 = locale39.getDisplayCountry();
        java.lang.String str41 = locale36.getDisplayScript(locale39);
        java.lang.String str42 = zoneOffset31.getDisplayName(textStyle33, locale36);
        int int43 = zoneOffset31.getTotalSeconds();
        java.time.LocalDateTime localDateTime44 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset31);
        java.time.LocalDateTime localDateTime46 = localDateTime44.minusHours((long) (byte) 100);
        java.time.ZoneOffset zoneOffset47 = java.time.ZoneOffset.UTC;
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime48 = localDateTime46.atZone((java.time.ZoneId) zoneOffset47);
        java.time.temporal.ChronoField chronoField49 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset50 = java.time.ZoneOffset.UTC;
        boolean boolean51 = chronoField49.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset50);
        java.time.ZonedDateTime zonedDateTime52 = java.time.ZonedDateTime.of(localDateTime46, (java.time.ZoneId) zoneOffset50);
        java.time.ZonedDateTime zonedDateTime53 = java.time.ZonedDateTime.ofInstant(instant24, (java.time.ZoneId) zoneOffset50);
        java.time.temporal.ChronoField chronoField56 = java.time.temporal.ChronoField.DAY_OF_YEAR;
        java.time.ZoneOffset zoneOffset57 = java.time.ZoneOffset.UTC;
        boolean boolean58 = chronoField56.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset57);
        java.time.format.TextStyle textStyle59 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle60 = textStyle59.asNormal();
        java.util.Locale locale62 = new java.util.Locale("");
        java.util.Set<java.lang.Character> charSet63 = locale62.getExtensionKeys();
        java.util.Locale locale65 = new java.util.Locale("");
        java.lang.String str66 = locale65.getDisplayCountry();
        java.lang.String str67 = locale62.getDisplayScript(locale65);
        java.lang.String str68 = zoneOffset57.getDisplayName(textStyle59, locale62);
        int int69 = zoneOffset57.getTotalSeconds();
        java.time.LocalDateTime localDateTime70 = java.time.LocalDateTime.ofEpochSecond(16L, (int) 'a', zoneOffset57);
        java.time.LocalDateTime localDateTime71 = timeDefinition0.createDateTime(localDateTime21, zoneOffset50, zoneOffset57);
        java.time.LocalTime localTime72 = localDateTime21.toLocalTime();
        org.junit.Assert.assertTrue("'" + timeDefinition0 + "' != '" + java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD + "'", timeDefinition0.equals(java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.STANDARD));
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField3.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + textStyle6 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle6.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle7 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle7.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + chronoField30 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField30.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + textStyle33 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle33.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle34 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle34.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(charSet37);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Z" + "'", str42, "Z");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(zoneOffset47);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime48);
        org.junit.Assert.assertTrue("'" + chronoField49 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField49.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(zonedDateTime52);
        org.junit.Assert.assertNotNull(zonedDateTime53);
        org.junit.Assert.assertTrue("'" + chronoField56 + "' != '" + java.time.temporal.ChronoField.DAY_OF_YEAR + "'", chronoField56.equals(java.time.temporal.ChronoField.DAY_OF_YEAR));
        org.junit.Assert.assertNotNull(zoneOffset57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + textStyle59 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle59.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle60 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle60.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertNotNull(charSet63);
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Z" + "'", str68, "Z");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(localTime72);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.lang.Character[] charArray4 = new java.lang.Character[] { '#' };
        java.util.ArrayList<java.lang.Character> charList5 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList5, charArray4);
        java.lang.Character[] charArray8 = new java.lang.Character[] { '4' };
        java.util.ArrayList<java.lang.Character> charList9 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList9, charArray8);
        boolean boolean11 = charList5.removeAll((java.util.Collection<java.lang.Character>) charList9);
        java.util.ListIterator<java.lang.Character> charItor12 = charList5.listIterator();
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap15 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap18 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean20 = charListMap18.contains((java.lang.Object) ' ');
        java.lang.Character[] charArray22 = new java.lang.Character[] { 'x' };
        java.util.ArrayList<java.lang.Character> charList23 = new java.util.ArrayList<java.lang.Character>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charList23, charArray22);
        int[] intArray31 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream32 = java.util.stream.IntStream.of(intArray31);
        java.util.stream.IntStream intStream33 = charListMap18.put(charList23, intStream32);
        int[] intArray40 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream41 = java.util.stream.IntStream.of(intArray40);
        java.util.Spliterator<java.lang.Integer> intSpliterator42 = intStream41.spliterator();
        java.util.stream.IntStream intStream43 = charListMap15.put(charList23, intStream41);
        int[] intArray50 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream51 = java.util.stream.IntStream.of(intArray50);
        boolean boolean52 = charListMap2.replace(charList5, intStream41, intStream51);
        charListMap2.clear();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charItor12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream32);
        org.junit.Assert.assertNull(intStream33);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream41);
        org.junit.Assert.assertNotNull(intSpliterator42);
        org.junit.Assert.assertNull(intStream43);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(16384);
        int int3 = optionalInt1.orElse(0);
        boolean boolean4 = optionalInt1.isPresent();
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        java.util.stream.IntStream intStream12 = java.util.stream.IntStream.of(intArray11);
        java.util.OptionalInt optionalInt13 = intStream12.findFirst();
        java.util.stream.IntStream.Builder builder14 = java.util.stream.IntStream.builder();
        optionalInt13.ifPresent((java.util.function.IntConsumer) builder14);
        optionalInt1.ifPresent((java.util.function.IntConsumer) builder14);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16384 + "'", int3 == 16384);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(optionalInt13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream> charListMap2 = new java.util.Hashtable<java.util.ArrayList<java.lang.Character>, java.util.stream.IntStream>((int) 'a', (float) 100);
        boolean boolean4 = charListMap2.contains((java.lang.Object) ' ');
        java.util.Properties properties5 = new java.util.Properties();
        boolean boolean6 = charListMap2.equals((java.lang.Object) properties5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate(452000000);
        char char3 = charBuffer1.get(10);
        java.nio.CharBuffer charBuffer4 = charBuffer1.asReadOnlyBuffer();
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(charBuffer4);
    }
}
