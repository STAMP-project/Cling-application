import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MIN;
        java.time.OffsetTime offsetTime2 = offsetTime0.withHour((int) (byte) 1);
        java.time.OffsetTime offsetTime4 = offsetTime0.withMinute((int) (short) 10);
        short[] shortArray6 = new short[] {};
        java.nio.ShortBuffer shortBuffer7 = java.nio.ShortBuffer.wrap(shortArray6);
        java.nio.ShortBuffer shortBuffer8 = shortBuffer7.asReadOnlyBuffer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.RuntimeException runtimeException9 = com.google.javascript.rhino.head.ScriptRuntime.undefWriteError((java.lang.Object) (short) 10, (java.lang.Object) (byte) 0, (java.lang.Object) shortBuffer7);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = com.google.javascript.rhino.head.ScriptRuntime.numberToString((double) ' ', 1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.lang.Object[] objArray3 = strSet2.toArray();
        java.util.concurrent.TimeUnit timeUnit4 = java.util.concurrent.TimeUnit.DAYS;
        long long6 = timeUnit4.toMinutes(0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = com.google.javascript.rhino.head.ScriptRuntime.getMessage2("100", (java.lang.Object) strSet2, (java.lang.Object) long6);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        java.nio.charset.CoderResult coderResult2 = java.nio.charset.CoderResult.malformedForLength((int) (byte) 1);
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.MAX;
        java.lang.String str4 = zoneOffset3.getId();
        java.lang.String str5 = zoneOffset3.getId();
        int int6 = zoneOffset3.getTotalSeconds();
        java.time.Duration duration7 = java.time.Duration.ZERO;
        long long8 = duration7.getSeconds();
        java.time.Duration duration10 = duration7.plusDays(0L);
        java.time.Duration duration12 = duration10.plusSeconds(10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = com.google.javascript.rhino.head.ScriptRuntime.getMessage3("error reporter_FUNCTION", (java.lang.Object) coderResult2, (java.lang.Object) int6, (java.lang.Object) duration10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        java.time.Period period3 = java.time.Period.ofDays((int) ' ');
        java.time.Period period5 = java.time.Period.ofDays((int) ' ');
        boolean boolean7 = period5.equals((java.lang.Object) true);
        java.time.chrono.Chronology chronology8 = period5.getChronology();
        java.time.chrono.ChronoPeriod chronoPeriod9 = period3.minus((java.time.temporal.TemporalAmount) period5);
        java.time.Period period10 = period5.normalized();
        java.time.Period period12 = period5.minusYears(100L);
        java.time.chrono.Chronology chronology13 = period5.getChronology();
        java.time.ZoneId zoneId14 = java.time.ZoneId.systemDefault();
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.now(zoneId14);
        int int16 = localDateTime15.getNano();
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.MAX;
        java.lang.String str18 = zoneOffset17.getId();
        java.lang.String str19 = zoneOffset17.getId();
        int int20 = zoneOffset17.getTotalSeconds();
        java.time.ZoneOffset zoneOffset21 = java.time.ZoneOffset.MAX;
        java.time.ZonedDateTime zonedDateTime22 = java.time.ZonedDateTime.ofLocal(localDateTime15, (java.time.ZoneId) zoneOffset17, zoneOffset21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = com.google.javascript.rhino.head.ScriptRuntime.getMessage3("Optional.empty", (java.lang.Object) chronoField1, (java.lang.Object) chronology13, (java.lang.Object) localDateTime15);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_DAY;
        boolean boolean2 = chronoField1.isDateBased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = com.google.javascript.rhino.head.ScriptRuntime.getMessage2("hi!", (java.lang.Object) chronoField1, (java.lang.Object) "[object Function]");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        java.lang.String[] strArray1 = com.google.javascript.rhino.head.ScriptRuntime.emptyStrings;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = com.google.javascript.rhino.head.ScriptRuntime.getMessage1("0 - 59", (java.lang.Object) strArray1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.EcmaError ecmaError2 = com.google.javascript.rhino.head.ScriptRuntime.typeError1("ISO", "0 - 59");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        java.time.Instant instant0 = java.time.Instant.MIN;
        java.time.Period period2 = java.time.Period.ofDays((int) ' ');
        boolean boolean4 = period2.equals((java.lang.Object) true);
        java.time.chrono.Chronology chronology5 = period2.getChronology();
        java.time.Instant instant6 = instant0.plus((java.time.temporal.TemporalAmount) period2);
        java.time.Period period8 = java.time.Period.ofDays((int) ' ');
        java.time.Period period10 = java.time.Period.ofDays((int) ' ');
        boolean boolean12 = period10.equals((java.lang.Object) true);
        java.time.chrono.Chronology chronology13 = period10.getChronology();
        java.time.chrono.ChronoPeriod chronoPeriod14 = period8.minus((java.time.temporal.TemporalAmount) period10);
        java.time.Period period15 = period10.normalized();
        java.time.Period period17 = period10.minusYears(100L);
        java.time.chrono.Chronology chronology18 = period10.getChronology();
        boolean boolean19 = instant6.equals((java.lang.Object) chronology18);
        boolean boolean21 = chronology18.isLeapYear(16384000000000L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.RuntimeException runtimeException23 = com.google.javascript.rhino.head.ScriptRuntime.undefReadError((java.lang.Object) boolean21, (java.lang.Object) (-1));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        java.time.Period period1 = java.time.Period.ofDays((int) ' ');
        java.time.Period period3 = period1.withDays(471000000);
        java.time.format.DecimalStyle decimalStyle4 = java.time.format.DecimalStyle.STANDARD;
        java.time.format.DecimalStyle decimalStyle6 = decimalStyle4.withDecimalSeparator('a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.RuntimeException runtimeException7 = com.google.javascript.rhino.head.ScriptRuntime.undefCallError((java.lang.Object) 471000000, (java.lang.Object) 'a');
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        java.time.ZoneId zoneId1 = java.time.ZoneId.systemDefault();
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.now(zoneId1);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        java.time.temporal.TemporalUnit temporalUnit5 = chronoField4.getRangeUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime6 = localDateTime2.plus((long) (short) 100, temporalUnit5);
        java.time.Period period8 = java.time.Period.ofDays((int) ' ');
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime9 = localDateTime2.plus((java.time.temporal.TemporalAmount) period8);
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.now(zoneId10);
        int int12 = localDateTime11.getNano();
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.MAX;
        java.lang.String str14 = zoneOffset13.getId();
        java.lang.String str15 = zoneOffset13.getId();
        int int16 = zoneOffset13.getTotalSeconds();
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.MAX;
        java.time.ZonedDateTime zonedDateTime18 = java.time.ZonedDateTime.ofLocal(localDateTime11, (java.time.ZoneId) zoneOffset13, zoneOffset17);
        boolean boolean19 = localDateTime2.isBefore((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime11);
        java.time.ZoneOffset zoneOffset20 = java.time.ZoneOffset.MAX;
        java.lang.String str21 = zoneOffset20.getId();
        java.lang.String str22 = zoneOffset20.getId();
        java.time.OffsetDateTime offsetDateTime23 = localDateTime11.atOffset(zoneOffset20);
        java.time.ZoneId zoneId25 = java.time.ZoneId.systemDefault();
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.now(zoneId25);
        java.time.LocalDate localDate27 = java.time.LocalDate.now(zoneId25);
        java.time.temporal.ChronoField chronoField28 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        java.time.temporal.TemporalUnit temporalUnit29 = chronoField28.getRangeUnit();
        boolean boolean30 = localDate27.isSupported(temporalUnit29);
        java.time.OffsetDateTime offsetDateTime31 = offsetDateTime23.plus((long) 917000000, temporalUnit29);
        int int32 = offsetDateTime23.getYear();
        java.time.ZoneId zoneId33 = java.time.ZoneId.systemDefault();
        java.time.LocalDateTime localDateTime34 = java.time.LocalDateTime.now(zoneId33);
        java.time.temporal.ChronoField chronoField36 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        java.time.temporal.TemporalUnit temporalUnit37 = chronoField36.getRangeUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime38 = localDateTime34.plus((long) (short) 100, temporalUnit37);
        java.time.Period period40 = java.time.Period.ofDays((int) ' ');
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime41 = localDateTime34.plus((java.time.temporal.TemporalAmount) period40);
        java.time.ZoneId zoneId42 = java.time.ZoneId.systemDefault();
        java.time.LocalDateTime localDateTime43 = java.time.LocalDateTime.now(zoneId42);
        int int44 = localDateTime43.getNano();
        java.time.ZoneOffset zoneOffset45 = java.time.ZoneOffset.MAX;
        java.lang.String str46 = zoneOffset45.getId();
        java.lang.String str47 = zoneOffset45.getId();
        int int48 = zoneOffset45.getTotalSeconds();
        java.time.ZoneOffset zoneOffset49 = java.time.ZoneOffset.MAX;
        java.time.ZonedDateTime zonedDateTime50 = java.time.ZonedDateTime.ofLocal(localDateTime43, (java.time.ZoneId) zoneOffset45, zoneOffset49);
        boolean boolean51 = localDateTime34.isBefore((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime43);
        java.time.ZoneOffset zoneOffset52 = java.time.ZoneOffset.MAX;
        java.lang.String str53 = zoneOffset52.getId();
        java.lang.String str54 = zoneOffset52.getId();
        java.time.OffsetDateTime offsetDateTime55 = localDateTime43.atOffset(zoneOffset52);
        java.time.OffsetDateTime offsetDateTime56 = offsetDateTime23.withOffsetSameLocal(zoneOffset52);
        java.time.Instant instant57 = java.time.Instant.MIN;
        int int58 = instant57.getNano();
        java.time.Instant instant60 = instant57.plusSeconds((long) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str61 = com.google.javascript.rhino.head.ScriptRuntime.getMessage2("fra", (java.lang.Object) offsetDateTime56, (java.lang.Object) (byte) 1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed(100L, (long) '#');
        java.util.stream.LongStream longStream5 = java.util.stream.LongStream.rangeClosed(100L, (long) '#');
        java.util.stream.LongStream longStream6 = java.util.stream.LongStream.concat(longStream2, longStream5);
        longStream2.close();
        boolean boolean8 = longStream2.isParallel();
        java.util.stream.LongStream longStream9 = longStream2.unordered();
        java.util.stream.LongStream longStream12 = java.util.stream.LongStream.rangeClosed(100L, (long) '#');
        java.util.stream.LongStream longStream15 = java.util.stream.LongStream.rangeClosed(100L, (long) '#');
        java.util.stream.LongStream longStream16 = java.util.stream.LongStream.concat(longStream12, longStream15);
        longStream12.close();
        boolean boolean18 = longStream12.isParallel();
        java.util.stream.LongStream longStream19 = longStream12.unordered();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.RuntimeException runtimeException20 = com.google.javascript.rhino.head.ScriptRuntime.undefCallError((java.lang.Object) longStream9, (java.lang.Object) longStream19);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        java.time.ZoneId zoneId1 = java.time.ZoneId.systemDefault();
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.now(zoneId1);
        int int3 = localDateTime2.getNano();
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.MAX;
        java.lang.String str5 = zoneOffset4.getId();
        java.lang.String str6 = zoneOffset4.getId();
        int int7 = zoneOffset4.getTotalSeconds();
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.MAX;
        java.time.ZonedDateTime zonedDateTime9 = java.time.ZonedDateTime.ofLocal(localDateTime2, (java.time.ZoneId) zoneOffset4, zoneOffset8);
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.now(zoneId10);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.MINUTE_OF_HOUR;
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField13.getRangeUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime15 = localDateTime11.plus((long) (short) 100, temporalUnit14);
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.MAX;
        java.lang.String str17 = zoneOffset16.getId();
        java.time.Instant instant18 = localDateChronoLocalDateTime15.toInstant(zoneOffset16);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray19 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList20 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList20, zoneOffsetTransitionArray19);
        java.time.zone.ZoneOffsetTransition[] zoneOffsetTransitionArray22 = new java.time.zone.ZoneOffsetTransition[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransition> zoneOffsetTransitionList23 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransition>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList23, zoneOffsetTransitionArray22);
        java.time.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArray25 = new java.time.zone.ZoneOffsetTransitionRule[] {};
        java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule> zoneOffsetTransitionRuleList26 = new java.util.ArrayList<java.time.zone.ZoneOffsetTransitionRule>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList26, zoneOffsetTransitionRuleArray25);
        java.time.zone.ZoneRules zoneRules28 = java.time.zone.ZoneRules.of(zoneOffset8, zoneOffset16, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList20, (java.util.List<java.time.zone.ZoneOffsetTransition>) zoneOffsetTransitionList23, (java.util.List<java.time.zone.ZoneOffsetTransitionRule>) zoneOffsetTransitionRuleList26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = com.google.javascript.rhino.head.ScriptRuntime.getMessage1("\u4e0a\u5348 08:46:00", (java.lang.Object) zoneRules28);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        java.io.File file2 = new java.io.File("fra", "\u5206\u9418");
        java.net.URL uRL3 = file2.toURL();
        java.security.cert.Certificate[] certificateArray4 = new java.security.cert.Certificate[] {};
        java.security.CodeSource codeSource5 = new java.security.CodeSource(uRL3, certificateArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.security.CodeSigner[] codeSignerArray6 = codeSource5.getCodeSigners();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        languageRangeList1.clear();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream4 = languageRangeList1.parallelStream();
        long long5 = languageRangeStream4.count();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = com.google.javascript.rhino.head.ScriptRuntime.typeof((java.lang.Object) languageRangeStream4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap1 = java.nio.charset.Charset.availableCharsets();
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap3 = strMap1.headMap("");
        java.util.Set<java.util.Map.Entry<java.lang.String, java.nio.charset.Charset>> strEntrySet4 = strMap1.entrySet();
        java.util.Set<java.lang.String> strSet5 = strMap1.keySet();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = com.google.javascript.rhino.head.ScriptRuntime.getMessage1("KOR", (java.lang.Object) strSet5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.RuntimeException runtimeException2 = com.google.javascript.rhino.head.ScriptRuntime.notFunctionError((java.lang.Object) 100.0d, (java.lang.Object) 1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.RuntimeException runtimeException3 = com.google.javascript.rhino.head.ScriptRuntime.undefWriteError((java.lang.Object) 0L, (java.lang.Object) (short) 0, (java.lang.Object) 'a');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.EcmaError ecmaError4 = com.google.javascript.rhino.head.ScriptRuntime.typeError3("", "", "", "hi!");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.RuntimeException runtimeException3 = com.google.javascript.rhino.head.ScriptRuntime.notFunctionError((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f, "hi!");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.EcmaError ecmaError3 = com.google.javascript.rhino.head.ScriptRuntime.typeError2("hi!", "", "");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = com.google.javascript.rhino.head.ScriptRuntime.getMessage1("", (java.lang.Object) (byte) -1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = com.google.javascript.rhino.head.ScriptRuntime.getMessage4("hi!", (java.lang.Object) 10L, (java.lang.Object) (-1), (java.lang.Object) 100L, (java.lang.Object) ' ');
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.RuntimeException runtimeException3 = com.google.javascript.rhino.head.ScriptRuntime.undefWriteError((java.lang.Object) (byte) 0, (java.lang.Object) (short) 100, (java.lang.Object) "hi!");
    }
}

