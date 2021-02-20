import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withYearsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withWeeksRemoved();
        java.lang.String str5 = periodType4.toString();
        org.joda.time.PeriodType periodType6 = periodType4.withMillisRemoved();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withHoursRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withMonthsRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withMinutesRemoved();
        org.joda.time.DurationFieldType durationFieldType12 = periodType9.getFieldType((int) (byte) 1);
        org.joda.time.PeriodType periodType13 = periodType9.withHoursRemoved();
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType15 = periodType14.withHoursRemoved();
        org.joda.time.PeriodType periodType16 = periodType14.withMonthsRemoved();
        org.joda.time.PeriodType periodType17 = periodType14.withDaysRemoved();
        org.joda.time.PeriodType periodType18 = periodType14.withMinutesRemoved();
        boolean boolean19 = periodType13.equals((java.lang.Object) periodType14);
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType21 = periodType20.withDaysRemoved();
        org.joda.time.PeriodType periodType22 = periodType20.withYearsRemoved();
        org.joda.time.PeriodType periodType23 = periodType22.withHoursRemoved();
        org.joda.time.PeriodType periodType24 = periodType23.withYearsRemoved();
        org.joda.time.PeriodType periodType25 = periodType24.withMinutesRemoved();
        boolean boolean26 = periodType14.equals((java.lang.Object) periodType24);
        org.joda.time.PeriodType periodType27 = periodType14.withHoursRemoved();
        boolean boolean28 = periodType6.equals((java.lang.Object) periodType27);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PeriodType[Days]" + "'", str5, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMinutesRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType2.withSecondsRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withDaysRemoved();
        org.joda.time.PeriodType periodType7 = periodType5.withMinutesRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean6 = periodType4.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType7 = periodType4.withMonthsRemoved();
        org.joda.time.PeriodType periodType8 = periodType4.withMinutesRemoved();
        boolean boolean9 = periodType0.equals((java.lang.Object) periodType4);
        org.joda.time.PeriodType periodType10 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withSecondsRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withHoursRemoved();
        java.lang.Class<?> wildcardClass13 = periodType11.getClass();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withYearsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withSecondsRemoved();
        org.joda.time.PeriodType periodType5 = periodType2.withDaysRemoved();
        org.joda.time.PeriodType periodType6 = periodType2.withDaysRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withMonthsRemoved();
        org.joda.time.PeriodType periodType8 = periodType6.withMonthsRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        java.lang.String str1 = periodType0.toString();
        org.joda.time.PeriodType periodType2 = periodType0.withWeeksRemoved();
        int int3 = periodType0.size();
        org.joda.time.PeriodType periodType4 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType5 = periodType0.withMonthsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PeriodType[Hours]" + "'", str1, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withYearsRemoved();
        org.joda.time.PeriodType periodType6 = periodType3.withHoursRemoved();
        org.joda.time.PeriodType periodType7 = periodType3.withMonthsRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withMinutesRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withMonthsRemoved();
        org.joda.time.PeriodType periodType13 = periodType12.withWeeksRemoved();
        boolean boolean14 = periodType9.equals((java.lang.Object) periodType12);
        java.lang.String str15 = periodType9.toString();
        java.lang.String str16 = periodType9.toString();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PeriodType[DayTimeNoMinutes]" + "'", str15, "PeriodType[DayTimeNoMinutes]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PeriodType[DayTimeNoMinutes]" + "'", str16, "PeriodType[DayTimeNoMinutes]");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withHoursRemoved();
        java.lang.String str3 = periodType2.getName();
        int int4 = periodType2.size();
        org.joda.time.PeriodType periodType5 = periodType2.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType2.withYearsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withMinutesRemoved();
        int int8 = periodType7.size();
        int int9 = periodType7.size();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "YearMonthDayTimeNoHours" + "'", str3, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withHoursRemoved();
        java.lang.String str3 = periodType2.getName();
        int int4 = periodType2.size();
        org.joda.time.PeriodType periodType5 = periodType2.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType2.withMinutesRemoved();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        java.lang.String str10 = periodType9.getName();
        org.joda.time.PeriodType periodType11 = periodType9.withWeeksRemoved();
        org.joda.time.PeriodType periodType12 = periodType9.withDaysRemoved();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean15 = periodType13.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType16 = periodType13.withMonthsRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withDaysRemoved();
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType19 = periodType18.withWeeksRemoved();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.hours();
        java.lang.String str21 = periodType20.toString();
        org.joda.time.PeriodType periodType22 = periodType20.withWeeksRemoved();
        org.joda.time.PeriodType periodType23 = periodType20.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType25 = periodType20.getFieldType((int) (byte) 0);
        int int26 = periodType18.indexOf(durationFieldType25);
        int int27 = periodType16.indexOf(durationFieldType25);
        org.joda.time.PeriodType periodType28 = periodType16.withWeeksRemoved();
        org.joda.time.PeriodType periodType29 = periodType28.withMillisRemoved();
        org.joda.time.PeriodType periodType30 = periodType28.withWeeksRemoved();
        boolean boolean31 = periodType9.equals((java.lang.Object) periodType28);
        java.lang.String str32 = periodType9.getName();
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType34 = periodType33.withWeeksRemoved();
        org.joda.time.DurationFieldType durationFieldType35 = null;
        int int36 = periodType34.indexOf(durationFieldType35);
        org.joda.time.PeriodType periodType37 = periodType34.withHoursRemoved();
        org.joda.time.PeriodType periodType38 = periodType34.withSecondsRemoved();
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean41 = periodType39.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType42 = periodType39.withMonthsRemoved();
        org.joda.time.PeriodType periodType43 = periodType42.withDaysRemoved();
        org.joda.time.PeriodType periodType44 = periodType42.withMonthsRemoved();
        org.joda.time.PeriodType periodType45 = periodType44.withHoursRemoved();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType47 = periodType46.withSecondsRemoved();
        org.joda.time.PeriodType periodType48 = periodType46.withSecondsRemoved();
        org.joda.time.PeriodType periodType49 = periodType46.withYearsRemoved();
        org.joda.time.PeriodType periodType50 = periodType49.withDaysRemoved();
        org.joda.time.PeriodType periodType51 = periodType50.withWeeksRemoved();
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType53 = periodType52.withWeeksRemoved();
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.hours();
        java.lang.String str55 = periodType54.toString();
        org.joda.time.PeriodType periodType56 = periodType54.withWeeksRemoved();
        org.joda.time.PeriodType periodType57 = periodType54.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType59 = periodType54.getFieldType((int) (byte) 0);
        int int60 = periodType52.indexOf(durationFieldType59);
        boolean boolean61 = periodType50.isSupported(durationFieldType59);
        boolean boolean62 = periodType44.isSupported(durationFieldType59);
        int int63 = periodType38.indexOf(durationFieldType59);
        int int64 = periodType9.indexOf(durationFieldType59);
        boolean boolean65 = periodType6.isSupported(durationFieldType59);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "YearMonthDayTimeNoHours" + "'", str3, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Days" + "'", str10, "Days");
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PeriodType[Hours]" + "'", str21, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Days" + "'", str32, "Days");
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PeriodType[Hours]" + "'", str55, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType1 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMinutesRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType5 = periodType3.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withYearsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType5 = periodType2.withDaysRemoved();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType7 = periodType6.withWeeksRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withYearsRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withMonthsRemoved();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType11 = periodType10.withSecondsRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withHoursRemoved();
        java.lang.String str13 = periodType12.getName();
        org.joda.time.PeriodType periodType14 = periodType12.withMinutesRemoved();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType16 = periodType15.withHoursRemoved();
        org.joda.time.PeriodType periodType17 = periodType15.withMonthsRemoved();
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType19 = periodType18.withSecondsRemoved();
        org.joda.time.PeriodType periodType20 = periodType18.withHoursRemoved();
        java.lang.String str21 = periodType20.getName();
        int int22 = periodType20.size();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.hours();
        java.lang.String str24 = periodType23.toString();
        org.joda.time.PeriodType periodType25 = periodType23.withWeeksRemoved();
        org.joda.time.PeriodType periodType26 = periodType23.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType28 = periodType23.getFieldType((int) (byte) 0);
        boolean boolean29 = periodType20.isSupported(durationFieldType28);
        boolean boolean30 = periodType17.isSupported(durationFieldType28);
        boolean boolean31 = periodType12.isSupported(durationFieldType28);
        boolean boolean32 = periodType9.isSupported(durationFieldType28);
        boolean boolean33 = periodType5.equals((java.lang.Object) boolean32);
        org.joda.time.PeriodType periodType34 = periodType5.withWeeksRemoved();
        org.joda.time.PeriodType periodType35 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType36 = periodType5.withMonthsRemoved();
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.time();
        boolean boolean38 = periodType36.equals((java.lang.Object) periodType37);
        org.joda.time.PeriodType periodType39 = periodType36.withYearsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "YearMonthDayTimeNoHours" + "'", str13, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "YearMonthDayTimeNoHours" + "'", str21, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PeriodType[Hours]" + "'", str24, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(periodType39);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withMinutesRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withHoursRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withMillisRemoved();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withMonthsRemoved();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType14 = periodType13.withWeeksRemoved();
        org.joda.time.PeriodType periodType15 = periodType14.withYearsRemoved();
        org.joda.time.PeriodType periodType16 = periodType15.withMonthsRemoved();
        boolean boolean17 = periodType12.equals((java.lang.Object) periodType15);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.seconds();
        org.joda.time.DurationFieldType durationFieldType19 = null;
        boolean boolean20 = periodType18.isSupported(durationFieldType19);
        org.joda.time.PeriodType periodType21 = periodType18.withWeeksRemoved();
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean24 = periodType22.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType25 = periodType22.withMonthsRemoved();
        org.joda.time.PeriodType periodType26 = periodType25.withDaysRemoved();
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType28 = periodType27.withWeeksRemoved();
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.hours();
        java.lang.String str30 = periodType29.toString();
        org.joda.time.PeriodType periodType31 = periodType29.withWeeksRemoved();
        org.joda.time.PeriodType periodType32 = periodType29.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType34 = periodType29.getFieldType((int) (byte) 0);
        int int35 = periodType27.indexOf(durationFieldType34);
        int int36 = periodType25.indexOf(durationFieldType34);
        boolean boolean37 = periodType18.isSupported(durationFieldType34);
        boolean boolean38 = periodType12.isSupported(durationFieldType34);
        boolean boolean39 = periodType8.isSupported(durationFieldType34);
        int int40 = periodType3.indexOf(durationFieldType34);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PeriodType[Hours]" + "'", str30, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMillisRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withSecondsRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMillisRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withMillisRemoved();
        java.lang.String str8 = periodType7.toString();
        int int9 = periodType7.size();
        org.joda.time.PeriodType periodType10 = periodType7.withYearsRemoved();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType12 = periodType11.withYearsRemoved();
        org.joda.time.PeriodType periodType13 = periodType11.withMinutesRemoved();
        org.joda.time.PeriodType periodType14 = periodType11.withYearsRemoved();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean17 = periodType15.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType18 = periodType15.withMonthsRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withDaysRemoved();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType21 = periodType20.withWeeksRemoved();
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.hours();
        java.lang.String str23 = periodType22.toString();
        org.joda.time.PeriodType periodType24 = periodType22.withWeeksRemoved();
        org.joda.time.PeriodType periodType25 = periodType22.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType27 = periodType22.getFieldType((int) (byte) 0);
        int int28 = periodType20.indexOf(durationFieldType27);
        int int29 = periodType18.indexOf(durationFieldType27);
        org.joda.time.PeriodType periodType30 = periodType18.withMillisRemoved();
        org.joda.time.PeriodType periodType31 = periodType30.withWeeksRemoved();
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType33 = periodType32.withHoursRemoved();
        org.joda.time.PeriodType periodType34 = periodType32.withMonthsRemoved();
        org.joda.time.PeriodType periodType35 = periodType32.withDaysRemoved();
        org.joda.time.PeriodType periodType36 = periodType32.withMinutesRemoved();
        org.joda.time.PeriodType periodType37 = periodType32.withDaysRemoved();
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType39 = periodType38.withSecondsRemoved();
        org.joda.time.PeriodType periodType40 = periodType38.withSecondsRemoved();
        org.joda.time.PeriodType periodType41 = periodType38.withYearsRemoved();
        org.joda.time.PeriodType periodType42 = periodType41.withDaysRemoved();
        org.joda.time.PeriodType periodType43 = periodType41.withYearsRemoved();
        org.joda.time.PeriodType periodType44 = periodType41.withHoursRemoved();
        org.joda.time.PeriodType periodType45 = periodType41.withDaysRemoved();
        org.joda.time.PeriodType periodType46 = periodType41.withYearsRemoved();
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType48 = periodType47.withWeeksRemoved();
        org.joda.time.PeriodType periodType49 = periodType48.withYearsRemoved();
        org.joda.time.PeriodType periodType50 = periodType49.withWeeksRemoved();
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.seconds();
        org.joda.time.DurationFieldType durationFieldType52 = null;
        boolean boolean53 = periodType51.isSupported(durationFieldType52);
        org.joda.time.PeriodType periodType54 = periodType51.withWeeksRemoved();
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean57 = periodType55.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType58 = periodType55.withMonthsRemoved();
        org.joda.time.PeriodType periodType59 = periodType58.withDaysRemoved();
        org.joda.time.PeriodType periodType60 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType61 = periodType60.withWeeksRemoved();
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.hours();
        java.lang.String str63 = periodType62.toString();
        org.joda.time.PeriodType periodType64 = periodType62.withWeeksRemoved();
        org.joda.time.PeriodType periodType65 = periodType62.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType67 = periodType62.getFieldType((int) (byte) 0);
        int int68 = periodType60.indexOf(durationFieldType67);
        int int69 = periodType58.indexOf(durationFieldType67);
        boolean boolean70 = periodType51.isSupported(durationFieldType67);
        boolean boolean71 = periodType50.isSupported(durationFieldType67);
        int int72 = periodType46.indexOf(durationFieldType67);
        boolean boolean73 = periodType37.isSupported(durationFieldType67);
        int int74 = periodType30.indexOf(durationFieldType67);
        int int75 = periodType11.indexOf(durationFieldType67);
        int int76 = periodType7.indexOf(durationFieldType67);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PeriodType[Hours]" + "'", str8, "PeriodType[Hours]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PeriodType[Hours]" + "'", str23, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PeriodType[Hours]" + "'", str63, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(durationFieldType67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withMinutesRemoved();
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withSecondsRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withSecondsRemoved();
        org.joda.time.PeriodType periodType6 = periodType3.withMillisRemoved();
        boolean boolean7 = periodType1.equals((java.lang.Object) periodType3);
        org.joda.time.PeriodType periodType8 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType9 = periodType3.withHoursRemoved();
        org.joda.time.PeriodType periodType10 = periodType3.withMillisRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withMonthsRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withSecondsRemoved();
        org.joda.time.PeriodType periodType10 = periodType7.withYearsRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withDaysRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withWeeksRemoved();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType14 = periodType13.withWeeksRemoved();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.hours();
        java.lang.String str16 = periodType15.toString();
        org.joda.time.PeriodType periodType17 = periodType15.withWeeksRemoved();
        org.joda.time.PeriodType periodType18 = periodType15.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType20 = periodType15.getFieldType((int) (byte) 0);
        int int21 = periodType13.indexOf(durationFieldType20);
        boolean boolean22 = periodType11.isSupported(durationFieldType20);
        boolean boolean23 = periodType5.isSupported(durationFieldType20);
        int int24 = periodType5.size();
        org.joda.time.PeriodType periodType25 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType27 = periodType26.withWeeksRemoved();
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.hours();
        java.lang.String str29 = periodType28.toString();
        org.joda.time.PeriodType periodType30 = periodType28.withWeeksRemoved();
        org.joda.time.PeriodType periodType31 = periodType28.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType33 = periodType28.getFieldType((int) (byte) 0);
        int int34 = periodType26.indexOf(durationFieldType33);
        org.joda.time.DurationFieldType durationFieldType36 = periodType26.getFieldType(0);
        boolean boolean37 = periodType25.equals((java.lang.Object) durationFieldType36);
        org.joda.time.PeriodType periodType38 = periodType25.withHoursRemoved();
        org.joda.time.PeriodType periodType39 = periodType25.withHoursRemoved();
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.hours();
        java.lang.String str41 = periodType40.toString();
        org.joda.time.PeriodType periodType42 = periodType40.withHoursRemoved();
        java.lang.String str43 = periodType40.toString();
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType45 = periodType44.withSecondsRemoved();
        org.joda.time.PeriodType periodType46 = periodType44.withSecondsRemoved();
        org.joda.time.PeriodType periodType47 = periodType44.withMonthsRemoved();
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType49 = periodType48.withWeeksRemoved();
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.hours();
        java.lang.String str51 = periodType50.toString();
        org.joda.time.PeriodType periodType52 = periodType50.withWeeksRemoved();
        org.joda.time.PeriodType periodType53 = periodType50.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType55 = periodType50.getFieldType((int) (byte) 0);
        int int56 = periodType48.indexOf(durationFieldType55);
        boolean boolean57 = periodType47.isSupported(durationFieldType55);
        boolean boolean58 = periodType40.isSupported(durationFieldType55);
        org.joda.time.PeriodType periodType59 = periodType40.withWeeksRemoved();
        org.joda.time.PeriodType periodType60 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType61 = periodType60.withYearsRemoved();
        org.joda.time.PeriodType periodType62 = periodType60.withMinutesRemoved();
        org.joda.time.PeriodType periodType63 = periodType62.withMinutesRemoved();
        org.joda.time.DurationFieldType durationFieldType65 = periodType63.getFieldType(0);
        boolean boolean66 = periodType59.equals((java.lang.Object) durationFieldType65);
        boolean boolean67 = periodType25.isSupported(durationFieldType65);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PeriodType[Hours]" + "'", str16, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PeriodType[Hours]" + "'", str29, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PeriodType[Hours]" + "'", str41, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PeriodType[Hours]" + "'", str43, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "PeriodType[Hours]" + "'", str51, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(durationFieldType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(durationFieldType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withMillisRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withMillisRemoved();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean6 = periodType4.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType7 = periodType4.withMonthsRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withDaysRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withWeeksRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withMillisRemoved();
        org.joda.time.PeriodType periodType11 = periodType8.withDaysRemoved();
        org.joda.time.PeriodType periodType12 = periodType8.withWeeksRemoved();
        org.joda.time.PeriodType periodType13 = periodType12.withMillisRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withHoursRemoved();
        boolean boolean15 = periodType1.equals((java.lang.Object) periodType13);
        java.lang.String str16 = periodType13.toString();
        org.joda.time.PeriodType periodType17 = periodType13.withMonthsRemoved();
        int int18 = periodType17.size();
        org.joda.time.PeriodType periodType19 = periodType17.withDaysRemoved();
        org.joda.time.PeriodType periodType20 = periodType19.withHoursRemoved();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType22 = periodType21.withSecondsRemoved();
        org.joda.time.PeriodType periodType23 = periodType21.withWeeksRemoved();
        org.joda.time.DurationFieldType durationFieldType25 = periodType23.getFieldType((int) (short) 1);
        boolean boolean26 = periodType20.isSupported(durationFieldType25);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PeriodType[YearMonthDayTimeNoMonthsNoDaysNoMillis]" + "'", str16, "PeriodType[YearMonthDayTimeNoMonthsNoDaysNoMillis]");
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withMonthsRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMinutesRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withDaysRemoved();
        boolean boolean7 = periodType1.equals((java.lang.Object) periodType5);
        org.joda.time.PeriodType periodType8 = periodType1.withDaysRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withYearsRemoved();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean12 = periodType10.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType13 = periodType10.withMonthsRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withDaysRemoved();
        org.joda.time.PeriodType periodType15 = periodType14.withWeeksRemoved();
        org.joda.time.PeriodType periodType16 = periodType14.withMillisRemoved();
        org.joda.time.PeriodType periodType17 = periodType14.withDaysRemoved();
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str19 = periodType18.getName();
        org.joda.time.DurationFieldType durationFieldType21 = periodType18.getFieldType(0);
        int int22 = periodType17.indexOf(durationFieldType21);
        org.joda.time.PeriodType periodType23 = periodType17.withYearsRemoved();
        boolean boolean24 = periodType8.equals((java.lang.Object) periodType23);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType26 = periodType25.withWeeksRemoved();
        org.joda.time.DurationFieldType durationFieldType27 = null;
        int int28 = periodType26.indexOf(durationFieldType27);
        org.joda.time.PeriodType periodType29 = periodType26.withHoursRemoved();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType31 = periodType30.withSecondsRemoved();
        org.joda.time.PeriodType periodType32 = periodType30.withYearsRemoved();
        org.joda.time.PeriodType periodType33 = periodType32.withMonthsRemoved();
        boolean boolean34 = periodType26.equals((java.lang.Object) periodType32);
        java.lang.String str35 = periodType26.toString();
        org.joda.time.PeriodType periodType36 = periodType26.withSecondsRemoved();
        boolean boolean37 = periodType23.equals((java.lang.Object) periodType36);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "YearMonthDay" + "'", str19, "YearMonthDay");
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PeriodType[Days]" + "'", str35, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMillisRemoved();
        java.lang.String str4 = periodType2.toString();
        int int5 = periodType2.size();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PeriodType[DayTime]" + "'", str4, "PeriodType[DayTime]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        org.joda.time.DurationFieldType durationFieldType2 = null;
        int int3 = periodType1.indexOf(durationFieldType2);
        org.joda.time.PeriodType periodType4 = periodType1.withHoursRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withWeeksRemoved();
        java.lang.String str7 = periodType5.toString();
        org.joda.time.PeriodType periodType8 = periodType5.withWeeksRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PeriodType[Days]" + "'", str7, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withHoursRemoved();
        java.lang.String str3 = periodType2.getName();
        int int4 = periodType2.size();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.hours();
        java.lang.String str6 = periodType5.toString();
        org.joda.time.PeriodType periodType7 = periodType5.withWeeksRemoved();
        org.joda.time.PeriodType periodType8 = periodType5.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType10 = periodType5.getFieldType((int) (byte) 0);
        boolean boolean11 = periodType2.isSupported(durationFieldType10);
        org.joda.time.DurationFieldType[] durationFieldTypeArray12 = new org.joda.time.DurationFieldType[] { durationFieldType10 };
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.forFields(durationFieldTypeArray12);
        org.joda.time.PeriodType periodType14 = periodType13.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = periodType14.indexOf(durationFieldType15);
        org.joda.time.PeriodType periodType17 = periodType14.withWeeksRemoved();
        org.joda.time.PeriodType periodType18 = periodType17.withDaysRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withWeeksRemoved();
        org.joda.time.PeriodType periodType20 = periodType19.withMillisRemoved();
        org.joda.time.PeriodType periodType21 = periodType20.withYearsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "YearMonthDayTimeNoHours" + "'", str3, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PeriodType[Hours]" + "'", str6, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(durationFieldTypeArray12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withMonthsRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType6 = periodType3.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withMonthsRemoved();
        java.lang.Class<?> wildcardClass9 = periodType8.getClass();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withHoursRemoved();
        java.lang.String str3 = periodType0.getName();
        org.joda.time.PeriodType periodType4 = periodType0.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.PeriodType periodType8 = periodType6.withYearsRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withDaysRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withMonthsRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withMinutesRemoved();
        org.joda.time.DurationFieldType durationFieldType14 = periodType10.getFieldType(2);
        org.joda.time.PeriodType periodType15 = periodType10.withWeeksRemoved();
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType17 = periodType16.withSecondsRemoved();
        int int18 = periodType17.size();
        org.joda.time.PeriodType periodType19 = periodType17.withYearsRemoved();
        org.joda.time.PeriodType periodType20 = periodType19.withYearsRemoved();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType22 = periodType21.withSecondsRemoved();
        org.joda.time.PeriodType periodType23 = periodType21.withSecondsRemoved();
        org.joda.time.PeriodType periodType24 = periodType21.withYearsRemoved();
        org.joda.time.PeriodType periodType25 = periodType24.withDaysRemoved();
        org.joda.time.PeriodType periodType26 = periodType25.withWeeksRemoved();
        int int27 = periodType25.size();
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.hours();
        java.lang.String str29 = periodType28.toString();
        org.joda.time.PeriodType periodType30 = periodType28.withHoursRemoved();
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType32 = periodType31.withSecondsRemoved();
        org.joda.time.PeriodType periodType33 = periodType31.withHoursRemoved();
        java.lang.String str34 = periodType33.getName();
        int int35 = periodType33.size();
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.hours();
        java.lang.String str37 = periodType36.toString();
        org.joda.time.PeriodType periodType38 = periodType36.withWeeksRemoved();
        org.joda.time.PeriodType periodType39 = periodType36.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType41 = periodType36.getFieldType((int) (byte) 0);
        boolean boolean42 = periodType33.isSupported(durationFieldType41);
        int int43 = periodType30.indexOf(durationFieldType41);
        int int44 = periodType25.indexOf(durationFieldType41);
        int int45 = periodType20.indexOf(durationFieldType41);
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType47 = periodType46.withWeeksRemoved();
        org.joda.time.PeriodType periodType48 = periodType47.withMinutesRemoved();
        java.lang.String str49 = periodType48.getName();
        org.joda.time.PeriodType periodType50 = periodType48.withWeeksRemoved();
        org.joda.time.PeriodType periodType51 = periodType48.withDaysRemoved();
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType53 = periodType52.withYearsRemoved();
        org.joda.time.PeriodType periodType54 = periodType52.withMonthsRemoved();
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType56 = periodType55.withSecondsRemoved();
        org.joda.time.PeriodType periodType57 = periodType55.withSecondsRemoved();
        org.joda.time.PeriodType periodType58 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType59 = periodType58.withWeeksRemoved();
        org.joda.time.PeriodType periodType60 = periodType59.withYearsRemoved();
        org.joda.time.PeriodType periodType61 = periodType60.withWeeksRemoved();
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.seconds();
        org.joda.time.DurationFieldType durationFieldType63 = null;
        boolean boolean64 = periodType62.isSupported(durationFieldType63);
        org.joda.time.PeriodType periodType65 = periodType62.withWeeksRemoved();
        org.joda.time.PeriodType periodType66 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean68 = periodType66.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType69 = periodType66.withMonthsRemoved();
        org.joda.time.PeriodType periodType70 = periodType69.withDaysRemoved();
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType72 = periodType71.withWeeksRemoved();
        org.joda.time.PeriodType periodType73 = org.joda.time.PeriodType.hours();
        java.lang.String str74 = periodType73.toString();
        org.joda.time.PeriodType periodType75 = periodType73.withWeeksRemoved();
        org.joda.time.PeriodType periodType76 = periodType73.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType78 = periodType73.getFieldType((int) (byte) 0);
        int int79 = periodType71.indexOf(durationFieldType78);
        int int80 = periodType69.indexOf(durationFieldType78);
        boolean boolean81 = periodType62.isSupported(durationFieldType78);
        boolean boolean82 = periodType61.isSupported(durationFieldType78);
        boolean boolean83 = periodType55.isSupported(durationFieldType78);
        int int84 = periodType52.indexOf(durationFieldType78);
        int int85 = periodType51.indexOf(durationFieldType78);
        int int86 = periodType20.indexOf(durationFieldType78);
        boolean boolean87 = periodType10.isSupported(durationFieldType78);
        boolean boolean88 = periodType5.isSupported(durationFieldType78);
        org.joda.time.PeriodType periodType89 = periodType5.withDaysRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DayTime" + "'", str3, "DayTime");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PeriodType[Hours]" + "'", str29, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "YearMonthDayTimeNoHours" + "'", str34, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 6 + "'", int35 == 6);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PeriodType[Hours]" + "'", str37, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Days" + "'", str49, "Days");
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "PeriodType[Hours]" + "'", str74, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType75);
        org.junit.Assert.assertNotNull(periodType76);
        org.junit.Assert.assertNotNull(durationFieldType78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2 + "'", int80 == 2);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 3 + "'", int86 == 3);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(periodType89);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withDaysRemoved();
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withHoursRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMinutesRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withMillisRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withYearsRemoved();
        boolean boolean8 = periodType1.equals((java.lang.Object) periodType7);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType7 = periodType6.withWeeksRemoved();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.hours();
        java.lang.String str9 = periodType8.toString();
        org.joda.time.PeriodType periodType10 = periodType8.withWeeksRemoved();
        org.joda.time.PeriodType periodType11 = periodType8.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType13 = periodType8.getFieldType((int) (byte) 0);
        int int14 = periodType6.indexOf(durationFieldType13);
        boolean boolean15 = periodType4.isSupported(durationFieldType13);
        org.joda.time.PeriodType periodType16 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withMillisRemoved();
        java.lang.String str18 = periodType16.toString();
        org.joda.time.PeriodType periodType19 = periodType16.withYearsRemoved();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearDayTime();
        boolean boolean21 = periodType16.equals((java.lang.Object) periodType20);
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType23 = periodType22.withHoursRemoved();
        org.joda.time.PeriodType periodType24 = periodType22.withMonthsRemoved();
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType26 = periodType25.withWeeksRemoved();
        org.joda.time.PeriodType periodType27 = periodType26.withYearsRemoved();
        org.joda.time.PeriodType periodType28 = periodType27.withMonthsRemoved();
        boolean boolean29 = periodType24.equals((java.lang.Object) periodType27);
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType31 = periodType30.withSecondsRemoved();
        org.joda.time.PeriodType periodType32 = periodType30.withYearsRemoved();
        org.joda.time.PeriodType periodType33 = periodType32.withMinutesRemoved();
        org.joda.time.PeriodType periodType34 = periodType33.withHoursRemoved();
        boolean boolean35 = periodType24.equals((java.lang.Object) periodType33);
        boolean boolean36 = periodType16.equals((java.lang.Object) periodType24);
        org.joda.time.PeriodType periodType37 = periodType16.withSecondsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PeriodType[Hours]" + "'", str9, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PeriodType[DayTimeNoDaysNoSeconds]" + "'", str18, "PeriodType[DayTimeNoDaysNoSeconds]");
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(periodType37);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        java.lang.String str4 = periodType0.getName();
        java.lang.String str5 = periodType0.getName();
        org.joda.time.PeriodType periodType6 = periodType0.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType8 = periodType0.getFieldType((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DayTime" + "'", str4, "DayTime");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DayTime" + "'", str5, "DayTime");
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType1 = periodType0.withDaysRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withDaysRemoved();
        java.lang.String str3 = periodType1.toString();
        org.joda.time.PeriodType periodType4 = periodType1.withMonthsRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMinutesRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withYearsRemoved();
        java.lang.String str7 = periodType4.getName();
        org.joda.time.PeriodType periodType8 = periodType4.withYearsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PeriodType[Weeks]" + "'", str3, "PeriodType[Weeks]");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Weeks" + "'", str7, "Weeks");
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withHoursRemoved();
        java.lang.String str3 = periodType2.getName();
        int int4 = periodType2.size();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.hours();
        java.lang.String str6 = periodType5.toString();
        org.joda.time.PeriodType periodType7 = periodType5.withWeeksRemoved();
        org.joda.time.PeriodType periodType8 = periodType5.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType10 = periodType5.getFieldType((int) (byte) 0);
        boolean boolean11 = periodType2.isSupported(durationFieldType10);
        org.joda.time.DurationFieldType[] durationFieldTypeArray12 = new org.joda.time.DurationFieldType[] { durationFieldType10 };
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.forFields(durationFieldTypeArray12);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType15 = periodType14.withHoursRemoved();
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType17 = periodType16.withSecondsRemoved();
        org.joda.time.PeriodType periodType18 = periodType16.withHoursRemoved();
        org.joda.time.PeriodType periodType19 = periodType16.withWeeksRemoved();
        boolean boolean20 = periodType14.equals((java.lang.Object) periodType16);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType22 = periodType21.withWeeksRemoved();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.hours();
        java.lang.String str24 = periodType23.toString();
        org.joda.time.PeriodType periodType25 = periodType23.withWeeksRemoved();
        org.joda.time.PeriodType periodType26 = periodType23.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType28 = periodType23.getFieldType((int) (byte) 0);
        int int29 = periodType21.indexOf(durationFieldType28);
        int int30 = periodType14.indexOf(durationFieldType28);
        boolean boolean31 = periodType13.isSupported(durationFieldType28);
        org.joda.time.DurationFieldType durationFieldType32 = null;
        int int33 = periodType13.indexOf(durationFieldType32);
        org.joda.time.PeriodType periodType34 = periodType13.withMillisRemoved();
        org.joda.time.PeriodType periodType35 = periodType34.withWeeksRemoved();
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean38 = periodType36.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType39 = periodType36.withMonthsRemoved();
        org.joda.time.PeriodType periodType40 = periodType39.withDaysRemoved();
        org.joda.time.PeriodType periodType41 = periodType39.withMonthsRemoved();
        org.joda.time.PeriodType periodType42 = periodType41.withHoursRemoved();
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType44 = periodType43.withSecondsRemoved();
        org.joda.time.PeriodType periodType45 = periodType43.withSecondsRemoved();
        org.joda.time.PeriodType periodType46 = periodType43.withYearsRemoved();
        org.joda.time.PeriodType periodType47 = periodType46.withDaysRemoved();
        org.joda.time.PeriodType periodType48 = periodType47.withWeeksRemoved();
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType50 = periodType49.withWeeksRemoved();
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.hours();
        java.lang.String str52 = periodType51.toString();
        org.joda.time.PeriodType periodType53 = periodType51.withWeeksRemoved();
        org.joda.time.PeriodType periodType54 = periodType51.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType56 = periodType51.getFieldType((int) (byte) 0);
        int int57 = periodType49.indexOf(durationFieldType56);
        boolean boolean58 = periodType47.isSupported(durationFieldType56);
        boolean boolean59 = periodType41.isSupported(durationFieldType56);
        int int60 = periodType41.size();
        org.joda.time.PeriodType periodType61 = periodType41.withHoursRemoved();
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType63 = periodType62.withWeeksRemoved();
        org.joda.time.PeriodType periodType64 = org.joda.time.PeriodType.hours();
        java.lang.String str65 = periodType64.toString();
        org.joda.time.PeriodType periodType66 = periodType64.withWeeksRemoved();
        org.joda.time.PeriodType periodType67 = periodType64.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType69 = periodType64.getFieldType((int) (byte) 0);
        int int70 = periodType62.indexOf(durationFieldType69);
        org.joda.time.DurationFieldType durationFieldType72 = periodType62.getFieldType(0);
        boolean boolean73 = periodType61.equals((java.lang.Object) durationFieldType72);
        org.joda.time.PeriodType periodType74 = periodType61.withHoursRemoved();
        org.joda.time.PeriodType periodType75 = periodType61.withHoursRemoved();
        org.joda.time.PeriodType periodType76 = periodType75.withHoursRemoved();
        boolean boolean77 = periodType35.equals((java.lang.Object) periodType75);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "YearMonthDayTimeNoHours" + "'", str3, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PeriodType[Hours]" + "'", str6, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(durationFieldTypeArray12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PeriodType[Hours]" + "'", str24, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "PeriodType[Hours]" + "'", str52, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(durationFieldType56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 6 + "'", int60 == 6);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PeriodType[Hours]" + "'", str65, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertNotNull(durationFieldType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(durationFieldType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(periodType75);
        org.junit.Assert.assertNotNull(periodType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withMonthsRemoved();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withHoursRemoved();
        java.lang.String str10 = periodType9.getName();
        int int11 = periodType9.size();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.hours();
        java.lang.String str13 = periodType12.toString();
        org.joda.time.PeriodType periodType14 = periodType12.withWeeksRemoved();
        org.joda.time.PeriodType periodType15 = periodType12.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType17 = periodType12.getFieldType((int) (byte) 0);
        boolean boolean18 = periodType9.isSupported(durationFieldType17);
        boolean boolean19 = periodType6.isSupported(durationFieldType17);
        boolean boolean20 = periodType3.isSupported(durationFieldType17);
        int int21 = periodType3.size();
        org.joda.time.PeriodType periodType22 = periodType3.withMonthsRemoved();
        java.lang.String str23 = periodType22.toString();
        org.joda.time.PeriodType periodType24 = periodType22.withMonthsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "YearMonthDayTimeNoHours" + "'", str10, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PeriodType[Hours]" + "'", str13, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PeriodType[YearMonthDayTimeNoYearsNoMonths]" + "'", str23, "PeriodType[YearMonthDayTimeNoYearsNoMonths]");
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType1 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withDaysRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withSecondsRemoved();
        org.joda.time.PeriodType periodType4 = periodType1.withHoursRemoved();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.hours();
        java.lang.String str6 = periodType5.toString();
        org.joda.time.PeriodType periodType7 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType8 = periodType5.withMonthsRemoved();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str10 = periodType9.getName();
        org.joda.time.DurationFieldType durationFieldType12 = periodType9.getFieldType(0);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType14 = periodType13.withHoursRemoved();
        org.joda.time.PeriodType periodType15 = periodType13.withMonthsRemoved();
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType17 = periodType16.withMonthsRemoved();
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType19 = periodType18.withHoursRemoved();
        org.joda.time.PeriodType periodType20 = periodType18.withMonthsRemoved();
        org.joda.time.PeriodType periodType21 = periodType20.withWeeksRemoved();
        org.joda.time.PeriodType periodType22 = periodType20.withWeeksRemoved();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType24 = periodType23.withSecondsRemoved();
        org.joda.time.PeriodType periodType25 = periodType23.withSecondsRemoved();
        org.joda.time.PeriodType periodType26 = periodType23.withYearsRemoved();
        org.joda.time.PeriodType periodType27 = periodType26.withDaysRemoved();
        org.joda.time.PeriodType periodType28 = periodType27.withWeeksRemoved();
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType30 = periodType29.withWeeksRemoved();
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.hours();
        java.lang.String str32 = periodType31.toString();
        org.joda.time.PeriodType periodType33 = periodType31.withWeeksRemoved();
        org.joda.time.PeriodType periodType34 = periodType31.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType36 = periodType31.getFieldType((int) (byte) 0);
        int int37 = periodType29.indexOf(durationFieldType36);
        boolean boolean38 = periodType27.isSupported(durationFieldType36);
        boolean boolean39 = periodType22.isSupported(durationFieldType36);
        boolean boolean40 = periodType16.isSupported(durationFieldType36);
        int int41 = periodType13.indexOf(durationFieldType36);
        boolean boolean42 = periodType9.isSupported(durationFieldType36);
        int int43 = periodType5.indexOf(durationFieldType36);
        boolean boolean44 = periodType4.isSupported(durationFieldType36);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PeriodType[Hours]" + "'", str6, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "YearMonthDay" + "'", str10, "YearMonthDay");
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PeriodType[Hours]" + "'", str32, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMillisRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withYearsRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withYearsRemoved();
        org.joda.time.PeriodType periodType10 = periodType7.withDaysRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withMillisRemoved();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str13 = periodType12.getName();
        org.joda.time.DurationFieldType durationFieldType15 = periodType12.getFieldType(0);
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType17 = periodType16.withHoursRemoved();
        org.joda.time.PeriodType periodType18 = periodType16.withMonthsRemoved();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType20 = periodType19.withMonthsRemoved();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType22 = periodType21.withHoursRemoved();
        org.joda.time.PeriodType periodType23 = periodType21.withMonthsRemoved();
        org.joda.time.PeriodType periodType24 = periodType23.withWeeksRemoved();
        org.joda.time.PeriodType periodType25 = periodType23.withWeeksRemoved();
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType27 = periodType26.withSecondsRemoved();
        org.joda.time.PeriodType periodType28 = periodType26.withSecondsRemoved();
        org.joda.time.PeriodType periodType29 = periodType26.withYearsRemoved();
        org.joda.time.PeriodType periodType30 = periodType29.withDaysRemoved();
        org.joda.time.PeriodType periodType31 = periodType30.withWeeksRemoved();
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType33 = periodType32.withWeeksRemoved();
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.hours();
        java.lang.String str35 = periodType34.toString();
        org.joda.time.PeriodType periodType36 = periodType34.withWeeksRemoved();
        org.joda.time.PeriodType periodType37 = periodType34.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType39 = periodType34.getFieldType((int) (byte) 0);
        int int40 = periodType32.indexOf(durationFieldType39);
        boolean boolean41 = periodType30.isSupported(durationFieldType39);
        boolean boolean42 = periodType25.isSupported(durationFieldType39);
        boolean boolean43 = periodType19.isSupported(durationFieldType39);
        int int44 = periodType16.indexOf(durationFieldType39);
        boolean boolean45 = periodType12.isSupported(durationFieldType39);
        boolean boolean46 = periodType10.isSupported(durationFieldType39);
        org.joda.time.PeriodType periodType47 = periodType10.withDaysRemoved();
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType49 = periodType48.withSecondsRemoved();
        org.joda.time.PeriodType periodType50 = periodType49.withMinutesRemoved();
        org.joda.time.PeriodType periodType51 = periodType50.withMillisRemoved();
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType53 = periodType52.withSecondsRemoved();
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType55 = periodType54.withSecondsRemoved();
        org.joda.time.PeriodType periodType56 = periodType54.withYearsRemoved();
        org.joda.time.PeriodType periodType57 = periodType56.withMonthsRemoved();
        org.joda.time.PeriodType periodType58 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType59 = periodType58.withHoursRemoved();
        org.joda.time.PeriodType periodType60 = periodType58.withMonthsRemoved();
        org.joda.time.PeriodType periodType61 = periodType60.withMinutesRemoved();
        org.joda.time.DurationFieldType durationFieldType63 = periodType60.getFieldType((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType65 = periodType60.getFieldType(2);
        boolean boolean66 = periodType56.isSupported(durationFieldType65);
        int int67 = periodType52.indexOf(durationFieldType65);
        boolean boolean68 = periodType51.isSupported(durationFieldType65);
        boolean boolean69 = periodType47.isSupported(durationFieldType65);
        int int70 = periodType6.indexOf(durationFieldType65);
        boolean boolean71 = periodType5.isSupported(durationFieldType65);
        org.joda.time.PeriodType periodType72 = periodType5.withYearsRemoved();
        org.joda.time.PeriodType periodType73 = periodType72.withMinutesRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "YearMonthDay" + "'", str13, "YearMonthDay");
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PeriodType[Hours]" + "'", str35, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(durationFieldType63);
        org.junit.Assert.assertNotNull(durationFieldType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 5 + "'", int67 == 5);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertNotNull(periodType73);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withMillisRemoved();
        org.joda.time.PeriodType periodType7 = periodType4.withDaysRemoved();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str9 = periodType8.getName();
        org.joda.time.DurationFieldType durationFieldType11 = periodType8.getFieldType(0);
        int int12 = periodType7.indexOf(durationFieldType11);
        org.joda.time.PeriodType periodType13 = periodType7.withYearsRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withYearsRemoved();
        org.joda.time.PeriodType periodType15 = periodType13.withHoursRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "YearMonthDay" + "'", str9, "YearMonthDay");
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withMinutesRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withMillisRemoved();
        int int6 = periodType5.size();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withMillisRemoved();
        org.joda.time.PeriodType periodType7 = periodType4.withDaysRemoved();
        org.joda.time.PeriodType periodType8 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withDaysRemoved();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType11 = periodType10.withSecondsRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withSecondsRemoved();
        org.joda.time.PeriodType periodType13 = periodType10.withYearsRemoved();
        org.joda.time.PeriodType periodType14 = periodType10.withWeeksRemoved();
        org.joda.time.PeriodType periodType15 = periodType10.withSecondsRemoved();
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType17 = periodType16.withSecondsRemoved();
        org.joda.time.PeriodType periodType18 = periodType16.withYearsRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withMonthsRemoved();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType21 = periodType20.withHoursRemoved();
        org.joda.time.PeriodType periodType22 = periodType20.withMonthsRemoved();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType24 = periodType23.withSecondsRemoved();
        org.joda.time.PeriodType periodType25 = periodType23.withHoursRemoved();
        java.lang.String str26 = periodType25.getName();
        int int27 = periodType25.size();
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.hours();
        java.lang.String str29 = periodType28.toString();
        org.joda.time.PeriodType periodType30 = periodType28.withWeeksRemoved();
        org.joda.time.PeriodType periodType31 = periodType28.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType33 = periodType28.getFieldType((int) (byte) 0);
        boolean boolean34 = periodType25.isSupported(durationFieldType33);
        boolean boolean35 = periodType22.isSupported(durationFieldType33);
        boolean boolean36 = periodType19.isSupported(durationFieldType33);
        boolean boolean37 = periodType15.isSupported(durationFieldType33);
        int int38 = periodType8.indexOf(durationFieldType33);
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType40 = periodType39.withHoursRemoved();
        org.joda.time.PeriodType periodType41 = periodType39.withMonthsRemoved();
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType43 = periodType42.withSecondsRemoved();
        org.joda.time.PeriodType periodType44 = periodType42.withHoursRemoved();
        java.lang.String str45 = periodType44.getName();
        int int46 = periodType44.size();
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.hours();
        java.lang.String str48 = periodType47.toString();
        org.joda.time.PeriodType periodType49 = periodType47.withWeeksRemoved();
        org.joda.time.PeriodType periodType50 = periodType47.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType52 = periodType47.getFieldType((int) (byte) 0);
        boolean boolean53 = periodType44.isSupported(durationFieldType52);
        boolean boolean54 = periodType41.isSupported(durationFieldType52);
        int int55 = periodType8.indexOf(durationFieldType52);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "YearMonthDayTimeNoHours" + "'", str26, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PeriodType[Hours]" + "'", str29, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "YearMonthDayTimeNoHours" + "'", str45, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 6 + "'", int46 == 6);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "PeriodType[Hours]" + "'", str48, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(durationFieldType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        java.lang.String str4 = periodType3.getName();
        org.joda.time.PeriodType periodType5 = periodType3.withMinutesRemoved();
        org.joda.time.PeriodType periodType6 = periodType3.withMinutesRemoved();
        org.joda.time.PeriodType periodType7 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withDaysRemoved();
        int int9 = periodType8.size();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DayTime" + "'", str4, "DayTime");
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        java.lang.String str1 = periodType0.toString();
        org.joda.time.PeriodType periodType2 = periodType0.withHoursRemoved();
        java.lang.String str3 = periodType0.toString();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType5 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType4.withMonthsRemoved();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType9 = periodType8.withWeeksRemoved();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.hours();
        java.lang.String str11 = periodType10.toString();
        org.joda.time.PeriodType periodType12 = periodType10.withWeeksRemoved();
        org.joda.time.PeriodType periodType13 = periodType10.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType15 = periodType10.getFieldType((int) (byte) 0);
        int int16 = periodType8.indexOf(durationFieldType15);
        boolean boolean17 = periodType7.isSupported(durationFieldType15);
        boolean boolean18 = periodType0.isSupported(durationFieldType15);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType20 = periodType19.withSecondsRemoved();
        org.joda.time.PeriodType periodType21 = periodType20.withMonthsRemoved();
        org.joda.time.PeriodType periodType22 = periodType21.withMillisRemoved();
        org.joda.time.PeriodType periodType23 = periodType22.withSecondsRemoved();
        org.joda.time.PeriodType periodType24 = periodType23.withMillisRemoved();
        org.joda.time.PeriodType periodType25 = periodType23.withSecondsRemoved();
        org.joda.time.PeriodType periodType26 = periodType25.withDaysRemoved();
        boolean boolean27 = periodType0.equals((java.lang.Object) periodType25);
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType29 = periodType28.withWeeksRemoved();
        org.joda.time.PeriodType periodType30 = periodType29.withYearsRemoved();
        org.joda.time.PeriodType periodType31 = periodType30.withWeeksRemoved();
        java.lang.Object obj32 = null;
        boolean boolean33 = periodType30.equals(obj32);
        int int34 = periodType30.size();
        org.joda.time.PeriodType periodType35 = periodType30.withYearsRemoved();
        boolean boolean36 = periodType0.equals((java.lang.Object) periodType30);
        java.lang.String str37 = periodType0.toString();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PeriodType[Hours]" + "'", str1, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PeriodType[Hours]" + "'", str3, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PeriodType[Hours]" + "'", str11, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PeriodType[Hours]" + "'", str37, "PeriodType[Hours]");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.minutes();
        int int1 = periodType0.size();
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.hours();
        java.lang.String str5 = periodType4.toString();
        org.joda.time.PeriodType periodType6 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType7 = periodType4.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType9 = periodType4.getFieldType((int) (byte) 0);
        int int10 = periodType2.indexOf(durationFieldType9);
        org.joda.time.PeriodType periodType11 = periodType2.withYearsRemoved();
        boolean boolean12 = periodType0.equals((java.lang.Object) periodType11);
        org.joda.time.PeriodType periodType13 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withYearsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PeriodType[Hours]" + "'", str5, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withMonthsRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withSecondsRemoved();
        org.joda.time.PeriodType periodType10 = periodType7.withYearsRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withDaysRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withWeeksRemoved();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType14 = periodType13.withWeeksRemoved();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.hours();
        java.lang.String str16 = periodType15.toString();
        org.joda.time.PeriodType periodType17 = periodType15.withWeeksRemoved();
        org.joda.time.PeriodType periodType18 = periodType15.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType20 = periodType15.getFieldType((int) (byte) 0);
        int int21 = periodType13.indexOf(durationFieldType20);
        boolean boolean22 = periodType11.isSupported(durationFieldType20);
        boolean boolean23 = periodType5.isSupported(durationFieldType20);
        int int24 = periodType5.size();
        org.joda.time.PeriodType periodType25 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType27 = periodType26.withWeeksRemoved();
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.hours();
        java.lang.String str29 = periodType28.toString();
        org.joda.time.PeriodType periodType30 = periodType28.withWeeksRemoved();
        org.joda.time.PeriodType periodType31 = periodType28.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType33 = periodType28.getFieldType((int) (byte) 0);
        int int34 = periodType26.indexOf(durationFieldType33);
        org.joda.time.DurationFieldType durationFieldType36 = periodType26.getFieldType(0);
        boolean boolean37 = periodType25.equals((java.lang.Object) durationFieldType36);
        org.joda.time.PeriodType periodType38 = periodType25.withHoursRemoved();
        org.joda.time.PeriodType periodType39 = periodType25.withHoursRemoved();
        org.joda.time.PeriodType periodType40 = periodType39.withHoursRemoved();
        org.joda.time.PeriodType periodType41 = periodType39.withMillisRemoved();
        org.joda.time.PeriodType periodType42 = periodType41.withMillisRemoved();
        java.lang.String str43 = periodType41.toString();
        org.joda.time.PeriodType periodType44 = periodType41.withWeeksRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PeriodType[Hours]" + "'", str16, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PeriodType[Hours]" + "'", str29, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PeriodType[YearMonthDayTimeNoMonthsNoHoursNoMillis]" + "'", str43, "PeriodType[YearMonthDayTimeNoMonthsNoHoursNoMillis]");
        org.junit.Assert.assertNotNull(periodType44);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMinutesRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMonthsRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withMinutesRemoved();
        org.joda.time.DurationFieldType durationFieldType8 = periodType4.getFieldType(2);
        org.joda.time.PeriodType periodType9 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withWeeksRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withWeeksRemoved();
        org.joda.time.PeriodType periodType12 = periodType9.withWeeksRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType1 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMinutesRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMinutesRemoved();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean6 = periodType4.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType7 = periodType4.withMonthsRemoved();
        boolean boolean8 = periodType2.equals((java.lang.Object) periodType4);
        org.joda.time.PeriodType periodType9 = periodType2.withHoursRemoved();
        org.joda.time.PeriodType periodType10 = periodType2.withSecondsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType1 = periodType0.withDaysRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withHoursRemoved();
        java.lang.String str3 = periodType0.getName();
        org.joda.time.PeriodType periodType4 = periodType0.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType6 = periodType5.withYearsRemoved();
        org.joda.time.PeriodType periodType7 = periodType5.withMinutesRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withMinutesRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withYearsRemoved();
        org.joda.time.PeriodType periodType10 = periodType7.withWeeksRemoved();
        boolean boolean11 = periodType4.equals((java.lang.Object) periodType10);
        org.joda.time.PeriodType periodType12 = periodType10.withMillisRemoved();
        org.joda.time.PeriodType periodType13 = periodType10.withYearsRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withMonthsRemoved();
        org.joda.time.PeriodType periodType15 = periodType13.withMinutesRemoved();
        org.joda.time.PeriodType periodType16 = periodType13.withYearsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DayTime" + "'", str3, "DayTime");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withHoursRemoved();
        java.lang.String str3 = periodType2.getName();
        int int4 = periodType2.size();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.hours();
        java.lang.String str6 = periodType5.toString();
        org.joda.time.PeriodType periodType7 = periodType5.withWeeksRemoved();
        org.joda.time.PeriodType periodType8 = periodType5.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType10 = periodType5.getFieldType((int) (byte) 0);
        boolean boolean11 = periodType2.isSupported(durationFieldType10);
        org.joda.time.DurationFieldType[] durationFieldTypeArray12 = new org.joda.time.DurationFieldType[] { durationFieldType10 };
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.forFields(durationFieldTypeArray12);
        org.joda.time.PeriodType periodType14 = periodType13.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = periodType14.indexOf(durationFieldType15);
        java.lang.String str17 = periodType14.getName();
        java.lang.String str18 = periodType14.toString();
        org.joda.time.PeriodType periodType19 = periodType14.withHoursRemoved();
        java.lang.Class<?> wildcardClass20 = periodType14.getClass();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "YearMonthDayTimeNoHours" + "'", str3, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PeriodType[Hours]" + "'", str6, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(durationFieldTypeArray12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HoursNoHours" + "'", str17, "HoursNoHours");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PeriodType[HoursNoHours]" + "'", str18, "PeriodType[HoursNoHours]");
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withMonthsRemoved();
        java.lang.String str6 = periodType3.toString();
        boolean boolean8 = periodType3.equals((java.lang.Object) 0);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withMonthsRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withWeeksRemoved();
        org.joda.time.PeriodType periodType13 = periodType11.withDaysRemoved();
        java.lang.String str14 = periodType13.toString();
        org.joda.time.PeriodType periodType15 = periodType13.withYearsRemoved();
        org.joda.time.PeriodType periodType16 = periodType13.withDaysRemoved();
        org.joda.time.PeriodType periodType17 = periodType13.withDaysRemoved();
        org.joda.time.PeriodType periodType18 = periodType17.withMillisRemoved();
        boolean boolean19 = periodType3.equals((java.lang.Object) periodType18);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PeriodType[YearMonthDayTimeNoMonths]" + "'", str6, "PeriodType[YearMonthDayTimeNoMonths]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PeriodType[DayTimeNoDays]" + "'", str14, "PeriodType[DayTimeNoDays]");
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.hours();
        java.lang.String str3 = periodType2.toString();
        org.joda.time.PeriodType periodType4 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType5 = periodType2.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType7 = periodType2.getFieldType((int) (byte) 0);
        int int8 = periodType0.indexOf(durationFieldType7);
        org.joda.time.PeriodType periodType9 = periodType0.withYearsRemoved();
        java.lang.String str10 = periodType9.getName();
        org.joda.time.DurationFieldType durationFieldType12 = periodType9.getFieldType(0);
        org.joda.time.PeriodType periodType13 = periodType9.withMillisRemoved();
        org.joda.time.DurationFieldType durationFieldType15 = periodType9.getFieldType(0);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PeriodType[Hours]" + "'", str3, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Days" + "'", str10, "Days");
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(durationFieldType15);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMillisRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withSecondsRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMillisRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withDaysRemoved();
        org.joda.time.PeriodType periodType8 = periodType6.withSecondsRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withDaysRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMillisRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withSecondsRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMillisRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withMinutesRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withYearsRemoved();
        java.lang.String str8 = periodType7.getName();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hours" + "'", str8, "Hours");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        java.lang.String str4 = periodType3.getName();
        org.joda.time.PeriodType periodType5 = periodType3.withMinutesRemoved();
        org.joda.time.PeriodType periodType6 = periodType3.withYearsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withMonthsRemoved();
        org.joda.time.PeriodType periodType8 = periodType6.withMillisRemoved();
        org.joda.time.PeriodType periodType9 = periodType6.withMillisRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withWeeksRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DayTime" + "'", str4, "DayTime");
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withHoursRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withMonthsRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withMinutesRemoved();
        org.joda.time.DurationFieldType durationFieldType8 = periodType5.getFieldType((int) (byte) 1);
        int int9 = periodType2.indexOf(durationFieldType8);
        org.joda.time.DurationFieldType[] durationFieldTypeArray10 = new org.joda.time.DurationFieldType[] { durationFieldType8 };
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.forFields(durationFieldTypeArray10);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.forFields(durationFieldTypeArray10);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.forFields(durationFieldTypeArray10);
        org.joda.time.PeriodType periodType14 = periodType13.withDaysRemoved();
        org.joda.time.PeriodType periodType15 = periodType13.withSecondsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(durationFieldTypeArray10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withSecondsRemoved();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.PeriodType periodType8 = periodType6.withSecondsRemoved();
        org.joda.time.PeriodType periodType9 = periodType6.withYearsRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withDaysRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withWeeksRemoved();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType13 = periodType12.withWeeksRemoved();
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.hours();
        java.lang.String str15 = periodType14.toString();
        org.joda.time.PeriodType periodType16 = periodType14.withWeeksRemoved();
        org.joda.time.PeriodType periodType17 = periodType14.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType19 = periodType14.getFieldType((int) (byte) 0);
        int int20 = periodType12.indexOf(durationFieldType19);
        boolean boolean21 = periodType10.isSupported(durationFieldType19);
        org.joda.time.PeriodType periodType22 = periodType10.withSecondsRemoved();
        org.joda.time.PeriodType periodType23 = periodType22.withMillisRemoved();
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType25 = periodType24.withDaysRemoved();
        org.joda.time.PeriodType periodType26 = periodType25.withDaysRemoved();
        java.lang.String str27 = periodType25.toString();
        org.joda.time.PeriodType periodType28 = periodType25.withMonthsRemoved();
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType30 = periodType29.withHoursRemoved();
        org.joda.time.PeriodType periodType31 = periodType29.withMonthsRemoved();
        org.joda.time.PeriodType periodType32 = periodType31.withMinutesRemoved();
        org.joda.time.DurationFieldType durationFieldType34 = periodType31.getFieldType((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType36 = periodType31.getFieldType(2);
        boolean boolean37 = periodType28.isSupported(durationFieldType36);
        int int38 = periodType23.indexOf(durationFieldType36);
        boolean boolean39 = periodType3.isSupported(durationFieldType36);
        org.joda.time.PeriodType periodType40 = periodType3.withDaysRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PeriodType[Hours]" + "'", str15, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PeriodType[Weeks]" + "'", str27, "PeriodType[Weeks]");
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(periodType40);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withMonthsRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        int int6 = periodType4.size();
        org.joda.time.PeriodType periodType7 = periodType4.withDaysRemoved();
        org.joda.time.PeriodType periodType8 = periodType4.withMonthsRemoved();
        java.lang.String str9 = periodType4.getName();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "YearMonthDayTimeNoMonths" + "'", str9, "YearMonthDayTimeNoMonths");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withMonthsRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withSecondsRemoved();
        org.joda.time.PeriodType periodType10 = periodType7.withYearsRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withDaysRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withWeeksRemoved();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType14 = periodType13.withWeeksRemoved();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.hours();
        java.lang.String str16 = periodType15.toString();
        org.joda.time.PeriodType periodType17 = periodType15.withWeeksRemoved();
        org.joda.time.PeriodType periodType18 = periodType15.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType20 = periodType15.getFieldType((int) (byte) 0);
        int int21 = periodType13.indexOf(durationFieldType20);
        boolean boolean22 = periodType11.isSupported(durationFieldType20);
        boolean boolean23 = periodType5.isSupported(durationFieldType20);
        int int24 = periodType5.size();
        org.joda.time.PeriodType periodType25 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType27 = periodType26.withWeeksRemoved();
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.hours();
        java.lang.String str29 = periodType28.toString();
        org.joda.time.PeriodType periodType30 = periodType28.withWeeksRemoved();
        org.joda.time.PeriodType periodType31 = periodType28.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType33 = periodType28.getFieldType((int) (byte) 0);
        int int34 = periodType26.indexOf(durationFieldType33);
        org.joda.time.DurationFieldType durationFieldType36 = periodType26.getFieldType(0);
        boolean boolean37 = periodType25.equals((java.lang.Object) durationFieldType36);
        org.joda.time.PeriodType periodType38 = periodType25.withHoursRemoved();
        org.joda.time.PeriodType periodType39 = periodType25.withHoursRemoved();
        org.joda.time.PeriodType periodType40 = periodType39.withHoursRemoved();
        int int41 = periodType39.size();
        boolean boolean43 = periodType39.equals((java.lang.Object) "PeriodType[YearMonthDayTime]");
        org.joda.time.PeriodType periodType44 = periodType39.withDaysRemoved();
        int int45 = periodType44.size();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PeriodType[Hours]" + "'", str16, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PeriodType[Hours]" + "'", str29, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMillisRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withMinutesRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = periodType3.withSecondsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withMillisRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withWeeksRemoved();
        int int4 = periodType3.size();
        org.joda.time.DurationFieldType durationFieldType6 = periodType3.getFieldType(0);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(durationFieldType6);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withYearsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType5 = periodType2.withYearsRemoved();
        java.lang.String str6 = periodType5.getName();
        org.joda.time.PeriodType periodType7 = periodType5.withDaysRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Days" + "'", str6, "Days");
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType1 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMinutesRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMinutesRemoved();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean6 = periodType4.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType7 = periodType4.withMonthsRemoved();
        boolean boolean8 = periodType2.equals((java.lang.Object) periodType4);
        org.joda.time.PeriodType periodType9 = periodType2.withMillisRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.time();
        int int1 = periodType0.size();
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType5 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withWeeksRemoved();
        org.joda.time.DurationFieldType durationFieldType8 = periodType6.getFieldType((int) (short) 1);
        boolean boolean9 = periodType2.isSupported(durationFieldType8);
        boolean boolean10 = periodType0.isSupported(durationFieldType8);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType12 = periodType11.withHoursRemoved();
        org.joda.time.PeriodType periodType13 = periodType11.withMonthsRemoved();
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType15 = periodType14.withSecondsRemoved();
        org.joda.time.PeriodType periodType16 = periodType14.withYearsRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withMonthsRemoved();
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType19 = periodType18.withHoursRemoved();
        org.joda.time.PeriodType periodType20 = periodType18.withMonthsRemoved();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType22 = periodType21.withSecondsRemoved();
        org.joda.time.PeriodType periodType23 = periodType21.withHoursRemoved();
        java.lang.String str24 = periodType23.getName();
        int int25 = periodType23.size();
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.hours();
        java.lang.String str27 = periodType26.toString();
        org.joda.time.PeriodType periodType28 = periodType26.withWeeksRemoved();
        org.joda.time.PeriodType periodType29 = periodType26.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType31 = periodType26.getFieldType((int) (byte) 0);
        boolean boolean32 = periodType23.isSupported(durationFieldType31);
        boolean boolean33 = periodType20.isSupported(durationFieldType31);
        boolean boolean34 = periodType17.isSupported(durationFieldType31);
        boolean boolean35 = periodType13.isSupported(durationFieldType31);
        boolean boolean36 = periodType0.isSupported(durationFieldType31);
        org.joda.time.PeriodType periodType37 = periodType0.withWeeksRemoved();
        int int38 = periodType0.size();
        org.joda.time.PeriodType periodType39 = periodType0.withMonthsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "YearMonthDayTimeNoHours" + "'", str24, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PeriodType[Hours]" + "'", str27, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertNotNull(periodType39);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withMonthsRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withMillisRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withWeeksRemoved();
        org.joda.time.PeriodType periodType8 = periodType6.withSecondsRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withYearsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType1 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMinutesRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withMinutesRemoved();
        org.joda.time.PeriodType periodType4 = periodType0.withWeeksRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType6 = periodType5.withWeeksRemoved();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.hours();
        java.lang.String str8 = periodType7.toString();
        org.joda.time.PeriodType periodType9 = periodType7.withWeeksRemoved();
        org.joda.time.PeriodType periodType10 = periodType7.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType12 = periodType7.getFieldType((int) (byte) 0);
        int int13 = periodType5.indexOf(durationFieldType12);
        int int14 = periodType3.indexOf(durationFieldType12);
        org.joda.time.DurationFieldType[] durationFieldTypeArray15 = new org.joda.time.DurationFieldType[] { durationFieldType12 };
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.forFields(durationFieldTypeArray15);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.forFields(durationFieldTypeArray15);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.forFields(durationFieldTypeArray15);
        org.joda.time.PeriodType periodType19 = periodType18.withWeeksRemoved();
        org.joda.time.PeriodType periodType20 = periodType18.withSecondsRemoved();
        org.joda.time.PeriodType periodType21 = periodType18.withSecondsRemoved();
        org.joda.time.PeriodType periodType22 = periodType21.withWeeksRemoved();
        java.lang.String str23 = periodType21.getName();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PeriodType[Hours]" + "'", str8, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(durationFieldTypeArray15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hours" + "'", str23, "Hours");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMinutesRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType8 = periodType6.getFieldType(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.time();
        int int2 = periodType1.size();
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withHoursRemoved();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType5.withWeeksRemoved();
        org.joda.time.DurationFieldType durationFieldType9 = periodType7.getFieldType((int) (short) 1);
        boolean boolean10 = periodType3.isSupported(durationFieldType9);
        boolean boolean11 = periodType1.isSupported(durationFieldType9);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType13 = periodType12.withHoursRemoved();
        org.joda.time.PeriodType periodType14 = periodType12.withMonthsRemoved();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType16 = periodType15.withSecondsRemoved();
        org.joda.time.PeriodType periodType17 = periodType15.withYearsRemoved();
        org.joda.time.PeriodType periodType18 = periodType17.withMonthsRemoved();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType20 = periodType19.withHoursRemoved();
        org.joda.time.PeriodType periodType21 = periodType19.withMonthsRemoved();
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType23 = periodType22.withSecondsRemoved();
        org.joda.time.PeriodType periodType24 = periodType22.withHoursRemoved();
        java.lang.String str25 = periodType24.getName();
        int int26 = periodType24.size();
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.hours();
        java.lang.String str28 = periodType27.toString();
        org.joda.time.PeriodType periodType29 = periodType27.withWeeksRemoved();
        org.joda.time.PeriodType periodType30 = periodType27.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType32 = periodType27.getFieldType((int) (byte) 0);
        boolean boolean33 = periodType24.isSupported(durationFieldType32);
        boolean boolean34 = periodType21.isSupported(durationFieldType32);
        boolean boolean35 = periodType18.isSupported(durationFieldType32);
        boolean boolean36 = periodType14.isSupported(durationFieldType32);
        boolean boolean37 = periodType1.isSupported(durationFieldType32);
        org.joda.time.PeriodType periodType38 = periodType1.withWeeksRemoved();
        boolean boolean39 = periodType0.equals((java.lang.Object) periodType1);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "YearMonthDayTimeNoHours" + "'", str25, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PeriodType[Hours]" + "'", str28, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withMonthsRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withMinutesRemoved();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withWeeksRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withYearsRemoved();
        boolean boolean12 = periodType6.equals((java.lang.Object) periodType11);
        org.joda.time.PeriodType periodType13 = periodType6.withHoursRemoved();
        org.joda.time.PeriodType periodType14 = periodType6.withHoursRemoved();
        org.joda.time.PeriodType periodType15 = periodType6.withWeeksRemoved();
        org.joda.time.PeriodType periodType16 = periodType6.withYearsRemoved();
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.years();
        int int18 = periodType17.size();
        org.joda.time.PeriodType periodType19 = periodType17.withDaysRemoved();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean22 = periodType20.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType23 = periodType20.withMonthsRemoved();
        org.joda.time.PeriodType periodType24 = periodType23.withDaysRemoved();
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType26 = periodType25.withWeeksRemoved();
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.hours();
        java.lang.String str28 = periodType27.toString();
        org.joda.time.PeriodType periodType29 = periodType27.withWeeksRemoved();
        org.joda.time.PeriodType periodType30 = periodType27.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType32 = periodType27.getFieldType((int) (byte) 0);
        int int33 = periodType25.indexOf(durationFieldType32);
        int int34 = periodType23.indexOf(durationFieldType32);
        boolean boolean35 = periodType17.isSupported(durationFieldType32);
        int int36 = periodType16.indexOf(durationFieldType32);
        org.joda.time.PeriodType periodType37 = periodType16.withMinutesRemoved();
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType39 = periodType38.withSecondsRemoved();
        org.joda.time.PeriodType periodType40 = periodType38.withHoursRemoved();
        java.lang.String str41 = periodType40.getName();
        int int42 = periodType40.size();
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.hours();
        java.lang.String str44 = periodType43.toString();
        org.joda.time.PeriodType periodType45 = periodType43.withWeeksRemoved();
        org.joda.time.PeriodType periodType46 = periodType43.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType48 = periodType43.getFieldType((int) (byte) 0);
        boolean boolean49 = periodType40.isSupported(durationFieldType48);
        org.joda.time.DurationFieldType[] durationFieldTypeArray50 = new org.joda.time.DurationFieldType[] { durationFieldType48 };
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.forFields(durationFieldTypeArray50);
        org.joda.time.PeriodType periodType52 = periodType51.withHoursRemoved();
        org.joda.time.PeriodType periodType53 = periodType52.withMillisRemoved();
        org.joda.time.PeriodType periodType54 = periodType52.withMonthsRemoved();
        boolean boolean55 = periodType16.equals((java.lang.Object) periodType52);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PeriodType[Hours]" + "'", str28, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "YearMonthDayTimeNoHours" + "'", str41, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 6 + "'", int42 == 6);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PeriodType[Hours]" + "'", str44, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(durationFieldType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(durationFieldTypeArray50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withYearsRemoved();
        org.joda.time.PeriodType periodType6 = periodType3.withHoursRemoved();
        org.joda.time.PeriodType periodType7 = periodType3.withMonthsRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withMinutesRemoved();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        boolean boolean12 = periodType7.equals((java.lang.Object) periodType11);
        org.joda.time.PeriodType periodType13 = periodType11.withMillisRemoved();
        java.lang.String str14 = periodType11.getName();
        org.joda.time.PeriodType periodType15 = periodType11.withMonthsRemoved();
        org.joda.time.PeriodType periodType16 = periodType11.withDaysRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DayTimeNoSecondsNoHours" + "'", str14, "DayTimeNoSecondsNoHours");
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withYearsRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withMonthsRemoved();
        boolean boolean7 = periodType2.equals((java.lang.Object) periodType5);
        java.lang.String str8 = periodType2.getName();
        org.joda.time.PeriodType periodType9 = periodType2.withMonthsRemoved();
        java.lang.Class<?> wildcardClass10 = periodType2.getClass();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DayTime" + "'", str8, "DayTime");
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        org.joda.time.DurationFieldType durationFieldType2 = null;
        boolean boolean3 = periodType0.isSupported(durationFieldType2);
        org.joda.time.PeriodType periodType4 = periodType0.withMillisRemoved();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType5.withSecondsRemoved();
        org.joda.time.PeriodType periodType8 = periodType5.withYearsRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withDaysRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withWeeksRemoved();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType12 = periodType11.withWeeksRemoved();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.hours();
        java.lang.String str14 = periodType13.toString();
        org.joda.time.PeriodType periodType15 = periodType13.withWeeksRemoved();
        org.joda.time.PeriodType periodType16 = periodType13.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType18 = periodType13.getFieldType((int) (byte) 0);
        int int19 = periodType11.indexOf(durationFieldType18);
        boolean boolean20 = periodType9.isSupported(durationFieldType18);
        org.joda.time.PeriodType periodType21 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType23 = periodType22.withSecondsRemoved();
        org.joda.time.PeriodType periodType24 = periodType22.withYearsRemoved();
        org.joda.time.PeriodType periodType25 = periodType24.withMinutesRemoved();
        org.joda.time.PeriodType periodType26 = periodType24.withDaysRemoved();
        org.joda.time.PeriodType periodType27 = periodType26.withMonthsRemoved();
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType29 = periodType28.withSecondsRemoved();
        org.joda.time.PeriodType periodType30 = periodType28.withHoursRemoved();
        java.lang.String str31 = periodType30.getName();
        int int32 = periodType30.size();
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.hours();
        java.lang.String str34 = periodType33.toString();
        org.joda.time.PeriodType periodType35 = periodType33.withWeeksRemoved();
        org.joda.time.PeriodType periodType36 = periodType33.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType38 = periodType33.getFieldType((int) (byte) 0);
        boolean boolean39 = periodType30.isSupported(durationFieldType38);
        int int40 = periodType27.indexOf(durationFieldType38);
        boolean boolean41 = periodType21.isSupported(durationFieldType38);
        org.joda.time.PeriodType periodType42 = periodType21.withMillisRemoved();
        int int43 = periodType21.size();
        org.joda.time.PeriodType periodType44 = periodType21.withYearsRemoved();
        int int45 = periodType44.size();
        org.joda.time.PeriodType periodType46 = periodType44.withDaysRemoved();
        org.joda.time.DurationFieldType durationFieldType48 = periodType44.getFieldType(0);
        boolean boolean49 = periodType4.equals((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PeriodType[Hours]" + "'", str14, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "YearMonthDayTimeNoHours" + "'", str31, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PeriodType[Hours]" + "'", str34, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(durationFieldType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withMonthsRemoved();
        org.joda.time.PeriodType periodType6 = periodType3.withYearsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType7 = periodType6.withWeeksRemoved();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.hours();
        java.lang.String str9 = periodType8.toString();
        org.joda.time.PeriodType periodType10 = periodType8.withWeeksRemoved();
        org.joda.time.PeriodType periodType11 = periodType8.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType13 = periodType8.getFieldType((int) (byte) 0);
        int int14 = periodType6.indexOf(durationFieldType13);
        boolean boolean15 = periodType4.isSupported(durationFieldType13);
        org.joda.time.PeriodType periodType16 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType18 = periodType17.withSecondsRemoved();
        org.joda.time.PeriodType periodType19 = periodType17.withYearsRemoved();
        org.joda.time.PeriodType periodType20 = periodType19.withMinutesRemoved();
        org.joda.time.PeriodType periodType21 = periodType19.withDaysRemoved();
        org.joda.time.PeriodType periodType22 = periodType21.withMonthsRemoved();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType24 = periodType23.withSecondsRemoved();
        org.joda.time.PeriodType periodType25 = periodType23.withHoursRemoved();
        java.lang.String str26 = periodType25.getName();
        int int27 = periodType25.size();
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.hours();
        java.lang.String str29 = periodType28.toString();
        org.joda.time.PeriodType periodType30 = periodType28.withWeeksRemoved();
        org.joda.time.PeriodType periodType31 = periodType28.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType33 = periodType28.getFieldType((int) (byte) 0);
        boolean boolean34 = periodType25.isSupported(durationFieldType33);
        int int35 = periodType22.indexOf(durationFieldType33);
        boolean boolean36 = periodType16.isSupported(durationFieldType33);
        org.joda.time.PeriodType periodType37 = periodType16.withMillisRemoved();
        int int38 = periodType16.size();
        org.joda.time.PeriodType periodType39 = periodType16.withYearsRemoved();
        int int40 = periodType39.size();
        org.joda.time.PeriodType periodType41 = periodType39.withDaysRemoved();
        org.joda.time.PeriodType periodType42 = periodType39.withMillisRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PeriodType[Hours]" + "'", str9, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "YearMonthDayTimeNoHours" + "'", str26, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PeriodType[Hours]" + "'", str29, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        java.lang.String str4 = periodType0.toString();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        boolean boolean7 = periodType0.equals((java.lang.Object) periodType6);
        java.lang.String str8 = periodType6.getName();
        org.joda.time.PeriodType periodType9 = periodType6.withDaysRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PeriodType[DayTime]" + "'", str4, "PeriodType[DayTime]");
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StandardNoSeconds" + "'", str8, "StandardNoSeconds");
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType7 = periodType6.withWeeksRemoved();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.hours();
        java.lang.String str9 = periodType8.toString();
        org.joda.time.PeriodType periodType10 = periodType8.withWeeksRemoved();
        org.joda.time.PeriodType periodType11 = periodType8.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType13 = periodType8.getFieldType((int) (byte) 0);
        int int14 = periodType6.indexOf(durationFieldType13);
        boolean boolean15 = periodType4.isSupported(durationFieldType13);
        org.joda.time.PeriodType periodType16 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType18 = periodType17.withSecondsRemoved();
        org.joda.time.PeriodType periodType19 = periodType17.withYearsRemoved();
        org.joda.time.PeriodType periodType20 = periodType19.withMinutesRemoved();
        org.joda.time.PeriodType periodType21 = periodType19.withDaysRemoved();
        org.joda.time.PeriodType periodType22 = periodType21.withMonthsRemoved();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType24 = periodType23.withSecondsRemoved();
        org.joda.time.PeriodType periodType25 = periodType23.withHoursRemoved();
        java.lang.String str26 = periodType25.getName();
        int int27 = periodType25.size();
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.hours();
        java.lang.String str29 = periodType28.toString();
        org.joda.time.PeriodType periodType30 = periodType28.withWeeksRemoved();
        org.joda.time.PeriodType periodType31 = periodType28.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType33 = periodType28.getFieldType((int) (byte) 0);
        boolean boolean34 = periodType25.isSupported(durationFieldType33);
        int int35 = periodType22.indexOf(durationFieldType33);
        boolean boolean36 = periodType16.isSupported(durationFieldType33);
        org.joda.time.PeriodType periodType37 = periodType16.withMillisRemoved();
        int int38 = periodType16.size();
        org.joda.time.PeriodType periodType39 = periodType16.withMinutesRemoved();
        org.joda.time.PeriodType periodType40 = periodType16.withMillisRemoved();
        org.joda.time.PeriodType periodType41 = periodType40.withYearsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PeriodType[Hours]" + "'", str9, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "YearMonthDayTimeNoHours" + "'", str26, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PeriodType[Hours]" + "'", str29, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        java.lang.Object obj2 = null;
        boolean boolean3 = periodType1.equals(obj2);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withMonthsRemoved();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withYearsRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withMonthsRemoved();
        boolean boolean11 = periodType6.equals((java.lang.Object) periodType9);
        java.lang.String str12 = periodType6.getName();
        org.joda.time.PeriodType periodType13 = periodType6.withMonthsRemoved();
        boolean boolean14 = periodType1.equals((java.lang.Object) periodType13);
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType16 = periodType15.withSecondsRemoved();
        org.joda.time.PeriodType periodType17 = periodType15.withSecondsRemoved();
        org.joda.time.PeriodType periodType18 = periodType15.withYearsRemoved();
        org.joda.time.PeriodType periodType19 = periodType15.withWeeksRemoved();
        org.joda.time.PeriodType periodType20 = periodType15.withSecondsRemoved();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType22 = periodType21.withYearsRemoved();
        org.joda.time.PeriodType periodType23 = periodType21.withMinutesRemoved();
        org.joda.time.PeriodType periodType24 = periodType23.withMinutesRemoved();
        org.joda.time.DurationFieldType durationFieldType26 = periodType24.getFieldType(0);
        int int27 = periodType15.indexOf(durationFieldType26);
        boolean boolean28 = periodType13.isSupported(durationFieldType26);
        org.joda.time.PeriodType periodType29 = periodType13.withHoursRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DayTime" + "'", str12, "DayTime");
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(periodType29);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType3 = null;
        boolean boolean4 = periodType0.isSupported(durationFieldType3);
        org.joda.time.PeriodType periodType5 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType7 = periodType6.withWeeksRemoved();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.hours();
        java.lang.String str9 = periodType8.toString();
        org.joda.time.PeriodType periodType10 = periodType8.withWeeksRemoved();
        org.joda.time.PeriodType periodType11 = periodType8.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType13 = periodType8.getFieldType((int) (byte) 0);
        int int14 = periodType6.indexOf(durationFieldType13);
        boolean boolean15 = periodType0.isSupported(durationFieldType13);
        java.lang.Class<?> wildcardClass16 = durationFieldType13.getClass();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PeriodType[Hours]" + "'", str9, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType1 = periodType0.withDaysRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withYearsRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withDaysRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType4.withMinutesRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType1 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMinutesRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        int int4 = periodType3.size();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType6 = periodType5.withYearsRemoved();
        org.joda.time.PeriodType periodType7 = periodType5.withMinutesRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withMinutesRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withDaysRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType12 = periodType11.withWeeksRemoved();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType14 = periodType13.withSecondsRemoved();
        org.joda.time.PeriodType periodType15 = periodType13.withYearsRemoved();
        org.joda.time.PeriodType periodType16 = periodType15.withMonthsRemoved();
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.hours();
        java.lang.String str18 = periodType17.toString();
        org.joda.time.PeriodType periodType19 = periodType17.withWeeksRemoved();
        org.joda.time.PeriodType periodType20 = periodType17.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType22 = periodType17.getFieldType((int) (byte) 0);
        int int23 = periodType16.indexOf(durationFieldType22);
        int int24 = periodType12.indexOf(durationFieldType22);
        int int25 = periodType10.indexOf(durationFieldType22);
        boolean boolean26 = periodType3.equals((java.lang.Object) periodType10);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PeriodType[Hours]" + "'", str18, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withMinutesRemoved();
        org.joda.time.PeriodType periodType6 = periodType3.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType3.withWeeksRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType9 = periodType7.getFieldType((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMillisRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withYearsRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withMillisRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.seconds();
        org.joda.time.DurationFieldType durationFieldType1 = null;
        boolean boolean2 = periodType0.isSupported(durationFieldType1);
        org.joda.time.PeriodType periodType3 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean6 = periodType4.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType7 = periodType4.withMonthsRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withDaysRemoved();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType10 = periodType9.withWeeksRemoved();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.hours();
        java.lang.String str12 = periodType11.toString();
        org.joda.time.PeriodType periodType13 = periodType11.withWeeksRemoved();
        org.joda.time.PeriodType periodType14 = periodType11.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType16 = periodType11.getFieldType((int) (byte) 0);
        int int17 = periodType9.indexOf(durationFieldType16);
        int int18 = periodType7.indexOf(durationFieldType16);
        boolean boolean19 = periodType0.isSupported(durationFieldType16);
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType21 = periodType20.withHoursRemoved();
        org.joda.time.PeriodType periodType22 = periodType20.withMonthsRemoved();
        org.joda.time.PeriodType periodType23 = periodType22.withMinutesRemoved();
        org.joda.time.DurationFieldType durationFieldType25 = periodType22.getFieldType((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType27 = periodType22.getFieldType(2);
        org.joda.time.PeriodType periodType28 = periodType22.withHoursRemoved();
        org.joda.time.PeriodType periodType29 = periodType22.withYearsRemoved();
        boolean boolean30 = periodType0.equals((java.lang.Object) periodType29);
        org.joda.time.PeriodType periodType31 = periodType0.withMillisRemoved();
        java.lang.String str32 = periodType31.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType34 = periodType31.getFieldType(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PeriodType[Hours]" + "'", str12, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Seconds" + "'", str32, "Seconds");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withSecondsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMinutesRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMonthsRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withMinutesRemoved();
        org.joda.time.DurationFieldType durationFieldType8 = periodType4.getFieldType(2);
        org.joda.time.PeriodType periodType9 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType10 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.hours();
        java.lang.String str12 = periodType11.toString();
        org.joda.time.PeriodType periodType13 = periodType11.withWeeksRemoved();
        org.joda.time.PeriodType periodType14 = periodType11.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType16 = periodType11.getFieldType((int) (byte) 0);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType18 = periodType17.withSecondsRemoved();
        org.joda.time.PeriodType periodType19 = periodType17.withSecondsRemoved();
        org.joda.time.PeriodType periodType20 = periodType17.withYearsRemoved();
        org.joda.time.PeriodType periodType21 = periodType20.withDaysRemoved();
        org.joda.time.PeriodType periodType22 = periodType21.withWeeksRemoved();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType24 = periodType23.withWeeksRemoved();
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.hours();
        java.lang.String str26 = periodType25.toString();
        org.joda.time.PeriodType periodType27 = periodType25.withWeeksRemoved();
        org.joda.time.PeriodType periodType28 = periodType25.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType30 = periodType25.getFieldType((int) (byte) 0);
        int int31 = periodType23.indexOf(durationFieldType30);
        boolean boolean32 = periodType21.isSupported(durationFieldType30);
        boolean boolean33 = periodType11.isSupported(durationFieldType30);
        int int34 = periodType10.indexOf(durationFieldType30);
        org.joda.time.PeriodType periodType35 = periodType10.withSecondsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PeriodType[Hours]" + "'", str12, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PeriodType[Hours]" + "'", str26, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        org.joda.time.DurationFieldType durationFieldType2 = null;
        int int3 = periodType1.indexOf(durationFieldType2);
        org.joda.time.PeriodType periodType4 = periodType1.withMonthsRemoved();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean7 = periodType5.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType8 = periodType5.withMonthsRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withDaysRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withMonthsRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType13 = periodType12.withSecondsRemoved();
        org.joda.time.PeriodType periodType14 = periodType12.withSecondsRemoved();
        org.joda.time.PeriodType periodType15 = periodType12.withYearsRemoved();
        org.joda.time.PeriodType periodType16 = periodType15.withDaysRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withWeeksRemoved();
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType19 = periodType18.withWeeksRemoved();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.hours();
        java.lang.String str21 = periodType20.toString();
        org.joda.time.PeriodType periodType22 = periodType20.withWeeksRemoved();
        org.joda.time.PeriodType periodType23 = periodType20.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType25 = periodType20.getFieldType((int) (byte) 0);
        int int26 = periodType18.indexOf(durationFieldType25);
        boolean boolean27 = periodType16.isSupported(durationFieldType25);
        boolean boolean28 = periodType10.isSupported(durationFieldType25);
        int int29 = periodType10.size();
        org.joda.time.PeriodType periodType30 = periodType10.withSecondsRemoved();
        boolean boolean31 = periodType1.equals((java.lang.Object) periodType30);
        org.joda.time.DurationFieldType durationFieldType33 = periodType1.getFieldType(0);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PeriodType[Hours]" + "'", str21, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(durationFieldType33);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withMillisRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withMillisRemoved();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean6 = periodType4.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType7 = periodType4.withMonthsRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withDaysRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withWeeksRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withMillisRemoved();
        org.joda.time.PeriodType periodType11 = periodType8.withDaysRemoved();
        org.joda.time.PeriodType periodType12 = periodType8.withWeeksRemoved();
        org.joda.time.PeriodType periodType13 = periodType12.withMillisRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withHoursRemoved();
        boolean boolean15 = periodType1.equals((java.lang.Object) periodType13);
        java.lang.String str16 = periodType13.toString();
        org.joda.time.PeriodType periodType17 = periodType13.withMonthsRemoved();
        org.joda.time.PeriodType periodType18 = periodType13.withYearsRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withSecondsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PeriodType[YearMonthDayTimeNoMonthsNoDaysNoMillis]" + "'", str16, "PeriodType[YearMonthDayTimeNoMonthsNoDaysNoMillis]");
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType1 = null;
        boolean boolean2 = periodType0.isSupported(durationFieldType1);
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withMonthsRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = periodType3.withMonthsRemoved();
        java.lang.String str7 = periodType3.toString();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PeriodType[Hours]" + "'", str7, "PeriodType[Hours]");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        boolean boolean3 = periodType1.equals((java.lang.Object) 1);
        org.joda.time.DurationFieldType durationFieldType4 = null;
        boolean boolean5 = periodType1.isSupported(durationFieldType4);
        org.joda.time.PeriodType periodType6 = periodType1.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withHoursRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withMonthsRemoved();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType11 = periodType10.withWeeksRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withYearsRemoved();
        org.joda.time.PeriodType periodType13 = periodType12.withMonthsRemoved();
        boolean boolean14 = periodType9.equals((java.lang.Object) periodType12);
        org.joda.time.PeriodType periodType15 = periodType12.withSecondsRemoved();
        org.joda.time.PeriodType periodType16 = periodType15.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType18 = periodType15.getFieldType((int) (short) 0);
        int int19 = periodType6.indexOf(durationFieldType18);
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType21 = periodType20.withSecondsRemoved();
        org.joda.time.PeriodType periodType22 = periodType20.withSecondsRemoved();
        org.joda.time.PeriodType periodType23 = periodType20.withYearsRemoved();
        org.joda.time.PeriodType periodType24 = periodType23.withDaysRemoved();
        java.lang.String str25 = periodType23.getName();
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType27 = periodType26.withSecondsRemoved();
        org.joda.time.PeriodType periodType28 = periodType26.withSecondsRemoved();
        org.joda.time.PeriodType periodType29 = periodType26.withYearsRemoved();
        org.joda.time.PeriodType periodType30 = periodType29.withDaysRemoved();
        org.joda.time.PeriodType periodType31 = periodType30.withWeeksRemoved();
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType33 = periodType32.withWeeksRemoved();
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.hours();
        java.lang.String str35 = periodType34.toString();
        org.joda.time.PeriodType periodType36 = periodType34.withWeeksRemoved();
        org.joda.time.PeriodType periodType37 = periodType34.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType39 = periodType34.getFieldType((int) (byte) 0);
        int int40 = periodType32.indexOf(durationFieldType39);
        boolean boolean41 = periodType30.isSupported(durationFieldType39);
        org.joda.time.PeriodType periodType42 = periodType30.withSecondsRemoved();
        org.joda.time.PeriodType periodType43 = periodType42.withMillisRemoved();
        java.lang.String str44 = periodType42.toString();
        org.joda.time.PeriodType periodType45 = periodType42.withYearsRemoved();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.yearDayTime();
        boolean boolean47 = periodType42.equals((java.lang.Object) periodType46);
        org.joda.time.PeriodType periodType48 = periodType46.withMinutesRemoved();
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType50 = periodType49.withHoursRemoved();
        org.joda.time.PeriodType periodType51 = periodType49.withMonthsRemoved();
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType53 = periodType52.withSecondsRemoved();
        org.joda.time.PeriodType periodType54 = periodType52.withHoursRemoved();
        java.lang.String str55 = periodType54.getName();
        int int56 = periodType54.size();
        org.joda.time.PeriodType periodType57 = org.joda.time.PeriodType.hours();
        java.lang.String str58 = periodType57.toString();
        org.joda.time.PeriodType periodType59 = periodType57.withWeeksRemoved();
        org.joda.time.PeriodType periodType60 = periodType57.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType62 = periodType57.getFieldType((int) (byte) 0);
        boolean boolean63 = periodType54.isSupported(durationFieldType62);
        boolean boolean64 = periodType51.isSupported(durationFieldType62);
        boolean boolean65 = periodType48.isSupported(durationFieldType62);
        boolean boolean66 = periodType23.isSupported(durationFieldType62);
        org.joda.time.PeriodType periodType67 = periodType23.withSecondsRemoved();
        boolean boolean68 = periodType6.equals((java.lang.Object) periodType23);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "DayTime" + "'", str25, "DayTime");
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PeriodType[Hours]" + "'", str35, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PeriodType[DayTimeNoDaysNoSeconds]" + "'", str44, "PeriodType[DayTimeNoDaysNoSeconds]");
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "YearMonthDayTimeNoHours" + "'", str55, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 6 + "'", int56 == 6);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PeriodType[Hours]" + "'", str58, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withMonthsRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType7 = periodType5.withMinutesRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withMillisRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean12 = periodType10.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType13 = periodType10.withMonthsRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withMonthsRemoved();
        org.joda.time.PeriodType periodType15 = periodType14.withMillisRemoved();
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType17 = periodType16.withYearsRemoved();
        org.joda.time.PeriodType periodType18 = periodType16.withMonthsRemoved();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType20 = periodType19.withSecondsRemoved();
        org.joda.time.PeriodType periodType21 = periodType19.withSecondsRemoved();
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType23 = periodType22.withWeeksRemoved();
        org.joda.time.PeriodType periodType24 = periodType23.withYearsRemoved();
        org.joda.time.PeriodType periodType25 = periodType24.withWeeksRemoved();
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.seconds();
        org.joda.time.DurationFieldType durationFieldType27 = null;
        boolean boolean28 = periodType26.isSupported(durationFieldType27);
        org.joda.time.PeriodType periodType29 = periodType26.withWeeksRemoved();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean32 = periodType30.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType33 = periodType30.withMonthsRemoved();
        org.joda.time.PeriodType periodType34 = periodType33.withDaysRemoved();
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType36 = periodType35.withWeeksRemoved();
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.hours();
        java.lang.String str38 = periodType37.toString();
        org.joda.time.PeriodType periodType39 = periodType37.withWeeksRemoved();
        org.joda.time.PeriodType periodType40 = periodType37.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType42 = periodType37.getFieldType((int) (byte) 0);
        int int43 = periodType35.indexOf(durationFieldType42);
        int int44 = periodType33.indexOf(durationFieldType42);
        boolean boolean45 = periodType26.isSupported(durationFieldType42);
        boolean boolean46 = periodType25.isSupported(durationFieldType42);
        boolean boolean47 = periodType19.isSupported(durationFieldType42);
        int int48 = periodType16.indexOf(durationFieldType42);
        int int49 = periodType15.indexOf(durationFieldType42);
        int int50 = periodType15.size();
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType52 = periodType51.withYearsRemoved();
        org.joda.time.PeriodType periodType53 = periodType51.withMonthsRemoved();
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType55 = periodType54.withSecondsRemoved();
        org.joda.time.PeriodType periodType56 = periodType54.withSecondsRemoved();
        org.joda.time.PeriodType periodType57 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType58 = periodType57.withWeeksRemoved();
        org.joda.time.PeriodType periodType59 = periodType58.withYearsRemoved();
        org.joda.time.PeriodType periodType60 = periodType59.withWeeksRemoved();
        org.joda.time.PeriodType periodType61 = org.joda.time.PeriodType.seconds();
        org.joda.time.DurationFieldType durationFieldType62 = null;
        boolean boolean63 = periodType61.isSupported(durationFieldType62);
        org.joda.time.PeriodType periodType64 = periodType61.withWeeksRemoved();
        org.joda.time.PeriodType periodType65 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean67 = periodType65.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType68 = periodType65.withMonthsRemoved();
        org.joda.time.PeriodType periodType69 = periodType68.withDaysRemoved();
        org.joda.time.PeriodType periodType70 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType71 = periodType70.withWeeksRemoved();
        org.joda.time.PeriodType periodType72 = org.joda.time.PeriodType.hours();
        java.lang.String str73 = periodType72.toString();
        org.joda.time.PeriodType periodType74 = periodType72.withWeeksRemoved();
        org.joda.time.PeriodType periodType75 = periodType72.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType77 = periodType72.getFieldType((int) (byte) 0);
        int int78 = periodType70.indexOf(durationFieldType77);
        int int79 = periodType68.indexOf(durationFieldType77);
        boolean boolean80 = periodType61.isSupported(durationFieldType77);
        boolean boolean81 = periodType60.isSupported(durationFieldType77);
        boolean boolean82 = periodType54.isSupported(durationFieldType77);
        int int83 = periodType51.indexOf(durationFieldType77);
        int int84 = periodType15.indexOf(durationFieldType77);
        boolean boolean85 = periodType8.isSupported(durationFieldType77);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PeriodType[Hours]" + "'", str38, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "PeriodType[Hours]" + "'", str73, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(periodType75);
        org.junit.Assert.assertNotNull(durationFieldType77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2 + "'", int79 == 2);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 2 + "'", int84 == 2);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withDaysRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withMillisRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withYearsRemoved();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean8 = periodType6.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType9 = periodType6.withMonthsRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withDaysRemoved();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType12 = periodType11.withWeeksRemoved();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.hours();
        java.lang.String str14 = periodType13.toString();
        org.joda.time.PeriodType periodType15 = periodType13.withWeeksRemoved();
        org.joda.time.PeriodType periodType16 = periodType13.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType18 = periodType13.getFieldType((int) (byte) 0);
        int int19 = periodType11.indexOf(durationFieldType18);
        int int20 = periodType9.indexOf(durationFieldType18);
        org.joda.time.DurationFieldType[] durationFieldTypeArray21 = new org.joda.time.DurationFieldType[] { durationFieldType18 };
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.forFields(durationFieldTypeArray21);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.forFields(durationFieldTypeArray21);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.forFields(durationFieldTypeArray21);
        org.joda.time.PeriodType periodType25 = periodType24.withWeeksRemoved();
        org.joda.time.PeriodType periodType26 = periodType24.withSecondsRemoved();
        org.joda.time.PeriodType periodType27 = periodType24.withSecondsRemoved();
        boolean boolean28 = periodType5.equals((java.lang.Object) periodType27);
        org.joda.time.PeriodType periodType29 = periodType27.withYearsRemoved();
        org.joda.time.PeriodType periodType30 = periodType27.withSecondsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PeriodType[Hours]" + "'", str14, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(durationFieldTypeArray21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withMinutesRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMillisRemoved();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType5 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withYearsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withMinutesRemoved();
        java.lang.String str8 = periodType7.toString();
        org.joda.time.PeriodType periodType9 = periodType7.withWeeksRemoved();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType11 = periodType10.withSecondsRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withHoursRemoved();
        org.joda.time.PeriodType periodType13 = periodType11.withDaysRemoved();
        org.joda.time.PeriodType periodType14 = periodType11.withMinutesRemoved();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType16 = periodType15.withSecondsRemoved();
        org.joda.time.PeriodType periodType17 = periodType15.withHoursRemoved();
        java.lang.String str18 = periodType17.getName();
        int int19 = periodType17.size();
        org.joda.time.PeriodType periodType20 = periodType17.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType22 = periodType17.getFieldType(2);
        int int23 = periodType14.indexOf(durationFieldType22);
        int int24 = periodType9.indexOf(durationFieldType22);
        int int25 = periodType2.indexOf(durationFieldType22);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PeriodType[YearMonthDayTimeNoYearsNoMinutes]" + "'", str8, "PeriodType[YearMonthDayTimeNoYearsNoMinutes]");
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "YearMonthDayTimeNoHours" + "'", str18, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        java.lang.String str5 = periodType3.getName();
        org.joda.time.PeriodType periodType6 = periodType3.withMinutesRemoved();
        int int7 = periodType3.size();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withYearsRemoved();
        org.joda.time.PeriodType periodType11 = periodType8.withDaysRemoved();
        org.joda.time.PeriodType periodType12 = periodType8.withMillisRemoved();
        java.lang.String str13 = periodType12.getName();
        org.joda.time.DurationFieldType durationFieldType15 = periodType12.getFieldType((int) (short) 1);
        int int16 = periodType3.indexOf(durationFieldType15);
        java.lang.String str17 = periodType3.toString();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DayTime" + "'", str5, "DayTime");
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "YearMonthDayTimeNoMillis" + "'", str13, "YearMonthDayTimeNoMillis");
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PeriodType[DayTime]" + "'", str17, "PeriodType[DayTime]");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withHoursRemoved();
        java.lang.String str3 = periodType2.getName();
        org.joda.time.PeriodType periodType4 = periodType2.withMinutesRemoved();
        java.lang.String str5 = periodType2.getName();
        org.joda.time.DurationFieldType durationFieldType7 = periodType2.getFieldType(0);
        org.joda.time.PeriodType periodType8 = periodType2.withHoursRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withWeeksRemoved();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.hours();
        java.lang.String str11 = periodType10.toString();
        org.joda.time.PeriodType periodType12 = periodType10.withWeeksRemoved();
        org.joda.time.PeriodType periodType13 = periodType10.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType15 = periodType10.getFieldType((int) (byte) 0);
        int int16 = periodType9.indexOf(durationFieldType15);
        org.joda.time.PeriodType periodType17 = periodType9.withMillisRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "YearMonthDayTimeNoHours" + "'", str3, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "YearMonthDayTimeNoHours" + "'", str5, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PeriodType[Hours]" + "'", str11, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        java.lang.Object obj2 = null;
        boolean boolean3 = periodType1.equals(obj2);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withMonthsRemoved();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withYearsRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withMonthsRemoved();
        boolean boolean11 = periodType6.equals((java.lang.Object) periodType9);
        java.lang.String str12 = periodType6.getName();
        org.joda.time.PeriodType periodType13 = periodType6.withMonthsRemoved();
        boolean boolean14 = periodType1.equals((java.lang.Object) periodType13);
        org.joda.time.PeriodType periodType15 = periodType13.withMillisRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DayTime" + "'", str12, "DayTime");
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withMonthsRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withSecondsRemoved();
        org.joda.time.PeriodType periodType10 = periodType7.withYearsRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withDaysRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withWeeksRemoved();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType14 = periodType13.withWeeksRemoved();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.hours();
        java.lang.String str16 = periodType15.toString();
        org.joda.time.PeriodType periodType17 = periodType15.withWeeksRemoved();
        org.joda.time.PeriodType periodType18 = periodType15.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType20 = periodType15.getFieldType((int) (byte) 0);
        int int21 = periodType13.indexOf(durationFieldType20);
        boolean boolean22 = periodType11.isSupported(durationFieldType20);
        boolean boolean23 = periodType5.isSupported(durationFieldType20);
        int int24 = periodType5.size();
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType26 = periodType25.withWeeksRemoved();
        org.joda.time.PeriodType periodType27 = periodType26.withYearsRemoved();
        org.joda.time.PeriodType periodType28 = periodType27.withMillisRemoved();
        org.joda.time.PeriodType periodType29 = periodType27.withMillisRemoved();
        boolean boolean30 = periodType5.equals((java.lang.Object) periodType27);
        org.joda.time.PeriodType periodType31 = periodType5.withMillisRemoved();
        org.joda.time.PeriodType periodType32 = periodType5.withSecondsRemoved();
        org.joda.time.PeriodType periodType33 = periodType5.withYearsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PeriodType[Hours]" + "'", str16, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean6 = periodType4.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType7 = periodType4.withMonthsRemoved();
        org.joda.time.PeriodType periodType8 = periodType4.withMinutesRemoved();
        boolean boolean9 = periodType0.equals((java.lang.Object) periodType4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType11 = periodType4.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withMinutesRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withYearsRemoved();
        int int4 = periodType3.size();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType1 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = periodType0.withSecondsRemoved();
        java.lang.String str5 = periodType0.getName();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withMonthsRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withMillisRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withYearsRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withSecondsRemoved();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType14 = periodType13.withSecondsRemoved();
        org.joda.time.PeriodType periodType15 = periodType13.withYearsRemoved();
        org.joda.time.PeriodType periodType16 = periodType13.withDaysRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withMillisRemoved();
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str19 = periodType18.getName();
        org.joda.time.DurationFieldType durationFieldType21 = periodType18.getFieldType(0);
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType23 = periodType22.withHoursRemoved();
        org.joda.time.PeriodType periodType24 = periodType22.withMonthsRemoved();
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType26 = periodType25.withMonthsRemoved();
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType28 = periodType27.withHoursRemoved();
        org.joda.time.PeriodType periodType29 = periodType27.withMonthsRemoved();
        org.joda.time.PeriodType periodType30 = periodType29.withWeeksRemoved();
        org.joda.time.PeriodType periodType31 = periodType29.withWeeksRemoved();
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType33 = periodType32.withSecondsRemoved();
        org.joda.time.PeriodType periodType34 = periodType32.withSecondsRemoved();
        org.joda.time.PeriodType periodType35 = periodType32.withYearsRemoved();
        org.joda.time.PeriodType periodType36 = periodType35.withDaysRemoved();
        org.joda.time.PeriodType periodType37 = periodType36.withWeeksRemoved();
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType39 = periodType38.withWeeksRemoved();
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.hours();
        java.lang.String str41 = periodType40.toString();
        org.joda.time.PeriodType periodType42 = periodType40.withWeeksRemoved();
        org.joda.time.PeriodType periodType43 = periodType40.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType45 = periodType40.getFieldType((int) (byte) 0);
        int int46 = periodType38.indexOf(durationFieldType45);
        boolean boolean47 = periodType36.isSupported(durationFieldType45);
        boolean boolean48 = periodType31.isSupported(durationFieldType45);
        boolean boolean49 = periodType25.isSupported(durationFieldType45);
        int int50 = periodType22.indexOf(durationFieldType45);
        boolean boolean51 = periodType18.isSupported(durationFieldType45);
        boolean boolean52 = periodType16.isSupported(durationFieldType45);
        org.joda.time.PeriodType periodType53 = periodType16.withDaysRemoved();
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType55 = periodType54.withSecondsRemoved();
        org.joda.time.PeriodType periodType56 = periodType55.withMinutesRemoved();
        org.joda.time.PeriodType periodType57 = periodType56.withMillisRemoved();
        org.joda.time.PeriodType periodType58 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType59 = periodType58.withSecondsRemoved();
        org.joda.time.PeriodType periodType60 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType61 = periodType60.withSecondsRemoved();
        org.joda.time.PeriodType periodType62 = periodType60.withYearsRemoved();
        org.joda.time.PeriodType periodType63 = periodType62.withMonthsRemoved();
        org.joda.time.PeriodType periodType64 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType65 = periodType64.withHoursRemoved();
        org.joda.time.PeriodType periodType66 = periodType64.withMonthsRemoved();
        org.joda.time.PeriodType periodType67 = periodType66.withMinutesRemoved();
        org.joda.time.DurationFieldType durationFieldType69 = periodType66.getFieldType((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType71 = periodType66.getFieldType(2);
        boolean boolean72 = periodType62.isSupported(durationFieldType71);
        int int73 = periodType58.indexOf(durationFieldType71);
        boolean boolean74 = periodType57.isSupported(durationFieldType71);
        boolean boolean75 = periodType53.isSupported(durationFieldType71);
        int int76 = periodType12.indexOf(durationFieldType71);
        boolean boolean77 = periodType11.isSupported(durationFieldType71);
        boolean boolean78 = periodType0.isSupported(durationFieldType71);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "YearWeekDay" + "'", str5, "YearWeekDay");
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "YearMonthDay" + "'", str19, "YearMonthDay");
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PeriodType[Hours]" + "'", str41, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertNotNull(durationFieldType69);
        org.junit.Assert.assertNotNull(durationFieldType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 5 + "'", int73 == 5);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withYearsRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withMonthsRemoved();
        boolean boolean7 = periodType2.equals((java.lang.Object) periodType5);
        java.lang.String str8 = periodType2.getName();
        org.joda.time.PeriodType periodType9 = periodType2.withMonthsRemoved();
        java.lang.String str10 = periodType9.toString();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DayTime" + "'", str8, "DayTime");
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PeriodType[DayTime]" + "'", str10, "PeriodType[DayTime]");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withHoursRemoved();
        java.lang.String str3 = periodType0.getName();
        java.lang.String str4 = periodType0.getName();
        org.joda.time.PeriodType periodType5 = periodType0.withYearsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DayTime" + "'", str3, "DayTime");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DayTime" + "'", str4, "DayTime");
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        int int2 = periodType1.size();
        org.joda.time.PeriodType periodType3 = periodType1.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType1.withMillisRemoved();
        org.joda.time.PeriodType periodType5 = periodType1.withMonthsRemoved();
        org.joda.time.PeriodType periodType6 = periodType1.withMillisRemoved();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean9 = periodType7.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType10 = periodType7.withMonthsRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withDaysRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withWeeksRemoved();
        org.joda.time.PeriodType periodType13 = periodType11.withMillisRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withHoursRemoved();
        org.joda.time.PeriodType periodType15 = periodType13.withWeeksRemoved();
        boolean boolean16 = periodType1.equals((java.lang.Object) periodType13);
        org.joda.time.PeriodType periodType17 = periodType13.withHoursRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.hours();
        java.lang.String str3 = periodType2.toString();
        org.joda.time.PeriodType periodType4 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType5 = periodType2.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType7 = periodType2.getFieldType((int) (byte) 0);
        int int8 = periodType0.indexOf(durationFieldType7);
        org.joda.time.DurationFieldType durationFieldType10 = periodType0.getFieldType(0);
        org.joda.time.PeriodType periodType11 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType12 = periodType0.withSecondsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PeriodType[Hours]" + "'", str3, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType7 = periodType6.withWeeksRemoved();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.hours();
        java.lang.String str9 = periodType8.toString();
        org.joda.time.PeriodType periodType10 = periodType8.withWeeksRemoved();
        org.joda.time.PeriodType periodType11 = periodType8.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType13 = periodType8.getFieldType((int) (byte) 0);
        int int14 = periodType6.indexOf(durationFieldType13);
        boolean boolean15 = periodType4.isSupported(durationFieldType13);
        org.joda.time.PeriodType periodType16 = periodType4.withSecondsRemoved();
        java.lang.String str17 = periodType4.toString();
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType19 = periodType18.withHoursRemoved();
        org.joda.time.PeriodType periodType20 = periodType18.withMonthsRemoved();
        org.joda.time.PeriodType periodType21 = periodType20.withWeeksRemoved();
        org.joda.time.PeriodType periodType22 = periodType20.withDaysRemoved();
        org.joda.time.PeriodType periodType23 = periodType22.withMinutesRemoved();
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean26 = periodType24.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType27 = periodType24.withMonthsRemoved();
        org.joda.time.PeriodType periodType28 = periodType27.withDaysRemoved();
        org.joda.time.PeriodType periodType29 = periodType28.withMonthsRemoved();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean32 = periodType30.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType33 = periodType30.withMonthsRemoved();
        org.joda.time.PeriodType periodType34 = periodType33.withDaysRemoved();
        org.joda.time.PeriodType periodType35 = periodType33.withMonthsRemoved();
        org.joda.time.PeriodType periodType36 = periodType35.withHoursRemoved();
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType38 = periodType37.withSecondsRemoved();
        org.joda.time.PeriodType periodType39 = periodType37.withSecondsRemoved();
        org.joda.time.PeriodType periodType40 = periodType37.withYearsRemoved();
        org.joda.time.PeriodType periodType41 = periodType40.withDaysRemoved();
        org.joda.time.PeriodType periodType42 = periodType41.withWeeksRemoved();
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType44 = periodType43.withWeeksRemoved();
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.hours();
        java.lang.String str46 = periodType45.toString();
        org.joda.time.PeriodType periodType47 = periodType45.withWeeksRemoved();
        org.joda.time.PeriodType periodType48 = periodType45.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType50 = periodType45.getFieldType((int) (byte) 0);
        int int51 = periodType43.indexOf(durationFieldType50);
        boolean boolean52 = periodType41.isSupported(durationFieldType50);
        boolean boolean53 = periodType35.isSupported(durationFieldType50);
        int int54 = periodType28.indexOf(durationFieldType50);
        int int55 = periodType23.indexOf(durationFieldType50);
        boolean boolean56 = periodType4.isSupported(durationFieldType50);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PeriodType[Hours]" + "'", str9, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PeriodType[DayTimeNoDays]" + "'", str17, "PeriodType[DayTimeNoDays]");
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PeriodType[Hours]" + "'", str46, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withYearsRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMonthsRemoved();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.joda.time.PeriodType periodType8 = periodType6.withMonthsRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.DurationFieldType durationFieldType11 = periodType8.getFieldType((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType13 = periodType8.getFieldType(2);
        boolean boolean14 = periodType4.isSupported(durationFieldType13);
        int int15 = periodType0.indexOf(durationFieldType13);
        org.joda.time.PeriodType periodType16 = periodType0.withDaysRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withMonthsRemoved();
        org.joda.time.PeriodType periodType18 = periodType17.withMillisRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withWeeksRemoved();
        int int20 = periodType19.size();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withHoursRemoved();
        java.lang.String str3 = periodType0.getName();
        org.joda.time.PeriodType periodType4 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType5 = periodType0.withDaysRemoved();
        java.lang.String str6 = periodType5.toString();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DayTime" + "'", str3, "DayTime");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PeriodType[DayTimeNoDays]" + "'", str6, "PeriodType[DayTimeNoDays]");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withYearsRemoved();
        org.joda.time.PeriodType periodType6 = periodType3.withHoursRemoved();
        org.joda.time.PeriodType periodType7 = periodType3.withWeeksRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withSecondsRemoved();
        org.joda.time.DurationFieldType durationFieldType4 = periodType2.getFieldType(0);
        java.lang.String str5 = periodType2.toString();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PeriodType[Years]" + "'", str5, "PeriodType[Years]");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withHoursRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMillisRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withHoursRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        java.lang.String str1 = periodType0.toString();
        org.joda.time.PeriodType periodType2 = periodType0.withHoursRemoved();
        java.lang.String str3 = periodType0.toString();
        int int4 = periodType0.size();
        org.joda.time.PeriodType periodType5 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        java.lang.String str8 = periodType6.toString();
        org.joda.time.PeriodType periodType9 = periodType6.withHoursRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PeriodType[Hours]" + "'", str1, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PeriodType[Hours]" + "'", str3, "PeriodType[Hours]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PeriodType[HoursNoHours]" + "'", str8, "PeriodType[HoursNoHours]");
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType1 = periodType0.withDaysRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withYearsRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withDaysRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withDaysRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withMillisRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withWeeksRemoved();
        java.lang.String str4 = periodType1.toString();
        org.joda.time.PeriodType periodType5 = periodType1.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = periodType1.withDaysRemoved();
        java.lang.String str7 = periodType1.toString();
        org.joda.time.PeriodType periodType8 = periodType1.withWeeksRemoved();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withYearsRemoved();
        org.joda.time.PeriodType periodType12 = periodType9.withDaysRemoved();
        org.joda.time.PeriodType periodType13 = periodType9.withMillisRemoved();
        org.joda.time.PeriodType periodType14 = periodType9.withMonthsRemoved();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.hours();
        java.lang.String str16 = periodType15.toString();
        org.joda.time.PeriodType periodType17 = periodType15.withHoursRemoved();
        java.lang.String str18 = periodType15.toString();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType20 = periodType19.withSecondsRemoved();
        org.joda.time.PeriodType periodType21 = periodType19.withSecondsRemoved();
        org.joda.time.PeriodType periodType22 = periodType19.withMonthsRemoved();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType24 = periodType23.withWeeksRemoved();
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.hours();
        java.lang.String str26 = periodType25.toString();
        org.joda.time.PeriodType periodType27 = periodType25.withWeeksRemoved();
        org.joda.time.PeriodType periodType28 = periodType25.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType30 = periodType25.getFieldType((int) (byte) 0);
        int int31 = periodType23.indexOf(durationFieldType30);
        boolean boolean32 = periodType22.isSupported(durationFieldType30);
        boolean boolean33 = periodType15.isSupported(durationFieldType30);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType35 = periodType34.withSecondsRemoved();
        org.joda.time.PeriodType periodType36 = periodType35.withMonthsRemoved();
        org.joda.time.PeriodType periodType37 = periodType36.withMillisRemoved();
        org.joda.time.PeriodType periodType38 = periodType37.withSecondsRemoved();
        org.joda.time.PeriodType periodType39 = periodType38.withMillisRemoved();
        org.joda.time.PeriodType periodType40 = periodType38.withSecondsRemoved();
        org.joda.time.PeriodType periodType41 = periodType40.withDaysRemoved();
        boolean boolean42 = periodType15.equals((java.lang.Object) periodType40);
        org.joda.time.DurationFieldType durationFieldType44 = periodType15.getFieldType((int) (byte) 0);
        boolean boolean45 = periodType14.isSupported(durationFieldType44);
        boolean boolean46 = periodType1.isSupported(durationFieldType44);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PeriodType[YearDayTimeNoHours]" + "'", str4, "PeriodType[YearDayTimeNoHours]");
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PeriodType[YearDayTimeNoHours]" + "'", str7, "PeriodType[YearDayTimeNoHours]");
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PeriodType[Hours]" + "'", str16, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PeriodType[Hours]" + "'", str18, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PeriodType[Hours]" + "'", str26, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType2 = periodType1.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withYearsRemoved();
        java.lang.String str4 = periodType1.getName();
        org.joda.time.PeriodType periodType5 = periodType1.withMinutesRemoved();
        boolean boolean6 = periodType0.equals((java.lang.Object) periodType5);
        int int7 = periodType5.size();
        org.joda.time.PeriodType periodType8 = periodType5.withDaysRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "YearMonthDayTime" + "'", str4, "YearMonthDayTime");
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withMonthsRemoved();
        org.joda.time.PeriodType periodType6 = periodType3.withYearsRemoved();
        java.lang.String str7 = periodType6.getName();
        boolean boolean9 = periodType6.equals((java.lang.Object) 10L);
        java.lang.String str10 = periodType6.getName();
        org.joda.time.PeriodType periodType11 = periodType6.withMonthsRemoved();
        java.lang.String str12 = periodType11.toString();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "YearMonthDayTimeNoMonthsNoYears" + "'", str7, "YearMonthDayTimeNoMonthsNoYears");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "YearMonthDayTimeNoMonthsNoYears" + "'", str10, "YearMonthDayTimeNoMonthsNoYears");
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PeriodType[YearMonthDayTimeNoMonthsNoYears]" + "'", str12, "PeriodType[YearMonthDayTimeNoMonthsNoYears]");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType1 = periodType0.withMillisRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withYearsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMinutesRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withMillisRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withDaysRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withMonthsRemoved();
        int int10 = periodType7.size();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType12 = periodType11.withSecondsRemoved();
        org.joda.time.PeriodType periodType13 = periodType12.withMonthsRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withMillisRemoved();
        org.joda.time.PeriodType periodType15 = periodType14.withSecondsRemoved();
        org.joda.time.PeriodType periodType16 = periodType15.withMillisRemoved();
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType18 = periodType17.withHoursRemoved();
        org.joda.time.PeriodType periodType19 = periodType17.withMonthsRemoved();
        org.joda.time.PeriodType periodType20 = periodType17.withDaysRemoved();
        org.joda.time.PeriodType periodType21 = periodType17.withMinutesRemoved();
        org.joda.time.PeriodType periodType22 = periodType17.withDaysRemoved();
        org.joda.time.PeriodType periodType23 = periodType17.withSecondsRemoved();
        org.joda.time.PeriodType periodType24 = periodType17.withMillisRemoved();
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType26 = periodType25.withHoursRemoved();
        org.joda.time.PeriodType periodType27 = periodType25.withMonthsRemoved();
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType29 = periodType28.withMonthsRemoved();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType31 = periodType30.withHoursRemoved();
        org.joda.time.PeriodType periodType32 = periodType30.withMonthsRemoved();
        org.joda.time.PeriodType periodType33 = periodType32.withWeeksRemoved();
        org.joda.time.PeriodType periodType34 = periodType32.withWeeksRemoved();
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType36 = periodType35.withSecondsRemoved();
        org.joda.time.PeriodType periodType37 = periodType35.withSecondsRemoved();
        org.joda.time.PeriodType periodType38 = periodType35.withYearsRemoved();
        org.joda.time.PeriodType periodType39 = periodType38.withDaysRemoved();
        org.joda.time.PeriodType periodType40 = periodType39.withWeeksRemoved();
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType42 = periodType41.withWeeksRemoved();
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.hours();
        java.lang.String str44 = periodType43.toString();
        org.joda.time.PeriodType periodType45 = periodType43.withWeeksRemoved();
        org.joda.time.PeriodType periodType46 = periodType43.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType48 = periodType43.getFieldType((int) (byte) 0);
        int int49 = periodType41.indexOf(durationFieldType48);
        boolean boolean50 = periodType39.isSupported(durationFieldType48);
        boolean boolean51 = periodType34.isSupported(durationFieldType48);
        boolean boolean52 = periodType28.isSupported(durationFieldType48);
        int int53 = periodType25.indexOf(durationFieldType48);
        int int54 = periodType24.indexOf(durationFieldType48);
        int int55 = periodType15.indexOf(durationFieldType48);
        boolean boolean56 = periodType7.isSupported(durationFieldType48);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PeriodType[Hours]" + "'", str44, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(durationFieldType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withMonthsRemoved();
        int int4 = periodType1.size();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMinutesRemoved();
        org.joda.time.DurationFieldType durationFieldType5 = periodType2.getFieldType((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType7 = periodType2.getFieldType(2);
        org.joda.time.PeriodType periodType8 = periodType2.withYearsRemoved();
        org.joda.time.PeriodType periodType9 = periodType2.withWeeksRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType11 = periodType9.getFieldType((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType1 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMinutesRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType4 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMinutesRemoved();
        int int6 = periodType5.size();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        java.lang.String str5 = periodType3.getName();
        org.joda.time.PeriodType periodType6 = periodType3.withHoursRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DayTime" + "'", str5, "DayTime");
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMinutesRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withMinutesRemoved();
        java.lang.String str5 = periodType4.toString();
        org.joda.time.PeriodType periodType6 = periodType4.withWeeksRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PeriodType[Days]" + "'", str5, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType5.withYearsRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withMinutesRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withDaysRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withYearsRemoved();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType13 = periodType12.withHoursRemoved();
        org.joda.time.PeriodType periodType14 = periodType12.withMonthsRemoved();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType16 = periodType15.withHoursRemoved();
        org.joda.time.PeriodType periodType17 = periodType15.withMonthsRemoved();
        org.joda.time.PeriodType periodType18 = periodType17.withMinutesRemoved();
        org.joda.time.DurationFieldType durationFieldType20 = periodType17.getFieldType((int) (byte) 1);
        int int21 = periodType14.indexOf(durationFieldType20);
        int int22 = periodType11.indexOf(durationFieldType20);
        int int23 = periodType4.indexOf(durationFieldType20);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType1 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withDaysRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withYearsRemoved();
        int int4 = periodType1.size();
        java.lang.String str5 = periodType1.toString();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PeriodType[StandardNoMonths]" + "'", str5, "PeriodType[StandardNoMonths]");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType1 = periodType0.withDaysRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withMonthsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType1 = null;
        boolean boolean2 = periodType0.isSupported(durationFieldType1);
        org.joda.time.PeriodType periodType3 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = periodType0.withMinutesRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        java.lang.String str6 = periodType4.toString();
        org.joda.time.PeriodType periodType7 = periodType4.withYearsRemoved();
        org.joda.time.PeriodType periodType8 = periodType4.withMinutesRemoved();
        int int9 = periodType8.size();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PeriodType[Hours]" + "'", str6, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withMinutesRemoved();
        java.lang.String str3 = periodType2.getName();
        org.joda.time.PeriodType periodType4 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType5 = periodType2.withDaysRemoved();
        java.lang.String str6 = periodType2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType8 = periodType2.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Days" + "'", str3, "Days");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PeriodType[Days]" + "'", str6, "PeriodType[Days]");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withYearsRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withDaysRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withMonthsRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withMillisRemoved();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withMonthsRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withMillisRemoved();
        org.joda.time.PeriodType periodType13 = periodType12.withSecondsRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withWeeksRemoved();
        org.joda.time.PeriodType periodType15 = periodType13.withMinutesRemoved();
        boolean boolean16 = periodType7.equals((java.lang.Object) periodType15);
        org.joda.time.PeriodType periodType17 = periodType15.withMonthsRemoved();
        java.lang.String str18 = periodType15.getName();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hours" + "'", str18, "Hours");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType7 = periodType6.withWeeksRemoved();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.hours();
        java.lang.String str9 = periodType8.toString();
        org.joda.time.PeriodType periodType10 = periodType8.withWeeksRemoved();
        org.joda.time.PeriodType periodType11 = periodType8.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType13 = periodType8.getFieldType((int) (byte) 0);
        int int14 = periodType6.indexOf(durationFieldType13);
        boolean boolean15 = periodType4.isSupported(durationFieldType13);
        org.joda.time.PeriodType periodType16 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withMillisRemoved();
        java.lang.String str18 = periodType16.toString();
        org.joda.time.PeriodType periodType19 = periodType16.withYearsRemoved();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearDayTime();
        boolean boolean21 = periodType16.equals((java.lang.Object) periodType20);
        org.joda.time.PeriodType periodType22 = periodType20.withMinutesRemoved();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType24 = periodType23.withHoursRemoved();
        org.joda.time.PeriodType periodType25 = periodType23.withMonthsRemoved();
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType27 = periodType26.withSecondsRemoved();
        org.joda.time.PeriodType periodType28 = periodType26.withHoursRemoved();
        java.lang.String str29 = periodType28.getName();
        int int30 = periodType28.size();
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.hours();
        java.lang.String str32 = periodType31.toString();
        org.joda.time.PeriodType periodType33 = periodType31.withWeeksRemoved();
        org.joda.time.PeriodType periodType34 = periodType31.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType36 = periodType31.getFieldType((int) (byte) 0);
        boolean boolean37 = periodType28.isSupported(durationFieldType36);
        boolean boolean38 = periodType25.isSupported(durationFieldType36);
        boolean boolean39 = periodType22.isSupported(durationFieldType36);
        org.joda.time.PeriodType periodType40 = periodType22.withMonthsRemoved();
        org.joda.time.PeriodType periodType41 = periodType22.withDaysRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PeriodType[Hours]" + "'", str9, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PeriodType[DayTimeNoDaysNoSeconds]" + "'", str18, "PeriodType[DayTimeNoDaysNoSeconds]");
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "YearMonthDayTimeNoHours" + "'", str29, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PeriodType[Hours]" + "'", str32, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.DurationFieldType durationFieldType8 = periodType6.getFieldType(4);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(durationFieldType8);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withMillisRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withDaysRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withMonthsRemoved();
        java.lang.Class<?> wildcardClass10 = periodType9.getClass();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withHoursRemoved();
        java.lang.String str3 = periodType2.getName();
        org.joda.time.PeriodType periodType4 = periodType2.withMinutesRemoved();
        java.lang.String str5 = periodType2.getName();
        org.joda.time.PeriodType periodType6 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType7 = periodType2.withMillisRemoved();
        org.joda.time.PeriodType periodType8 = periodType2.withMonthsRemoved();
        org.joda.time.PeriodType periodType9 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType11 = periodType10.withSecondsRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withMinutesRemoved();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType14 = periodType13.withSecondsRemoved();
        org.joda.time.PeriodType periodType15 = periodType13.withSecondsRemoved();
        org.joda.time.PeriodType periodType16 = periodType13.withYearsRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withDaysRemoved();
        org.joda.time.PeriodType periodType18 = periodType17.withWeeksRemoved();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType20 = periodType19.withWeeksRemoved();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.hours();
        java.lang.String str22 = periodType21.toString();
        org.joda.time.PeriodType periodType23 = periodType21.withWeeksRemoved();
        org.joda.time.PeriodType periodType24 = periodType21.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType26 = periodType21.getFieldType((int) (byte) 0);
        int int27 = periodType19.indexOf(durationFieldType26);
        boolean boolean28 = periodType17.isSupported(durationFieldType26);
        org.joda.time.PeriodType periodType29 = periodType17.withSecondsRemoved();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType31 = periodType30.withSecondsRemoved();
        org.joda.time.PeriodType periodType32 = periodType30.withYearsRemoved();
        org.joda.time.PeriodType periodType33 = periodType32.withMinutesRemoved();
        org.joda.time.PeriodType periodType34 = periodType32.withDaysRemoved();
        org.joda.time.PeriodType periodType35 = periodType34.withMonthsRemoved();
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType37 = periodType36.withSecondsRemoved();
        org.joda.time.PeriodType periodType38 = periodType36.withHoursRemoved();
        java.lang.String str39 = periodType38.getName();
        int int40 = periodType38.size();
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.hours();
        java.lang.String str42 = periodType41.toString();
        org.joda.time.PeriodType periodType43 = periodType41.withWeeksRemoved();
        org.joda.time.PeriodType periodType44 = periodType41.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType46 = periodType41.getFieldType((int) (byte) 0);
        boolean boolean47 = periodType38.isSupported(durationFieldType46);
        int int48 = periodType35.indexOf(durationFieldType46);
        boolean boolean49 = periodType29.isSupported(durationFieldType46);
        org.joda.time.PeriodType periodType50 = periodType29.withMillisRemoved();
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType52 = periodType51.withSecondsRemoved();
        org.joda.time.PeriodType periodType53 = periodType51.withHoursRemoved();
        java.lang.String str54 = periodType53.getName();
        int int55 = periodType53.size();
        org.joda.time.PeriodType periodType56 = org.joda.time.PeriodType.hours();
        java.lang.String str57 = periodType56.toString();
        org.joda.time.PeriodType periodType58 = periodType56.withWeeksRemoved();
        org.joda.time.PeriodType periodType59 = periodType56.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType61 = periodType56.getFieldType((int) (byte) 0);
        boolean boolean62 = periodType53.isSupported(durationFieldType61);
        org.joda.time.DurationFieldType[] durationFieldTypeArray63 = new org.joda.time.DurationFieldType[] { durationFieldType61 };
        org.joda.time.PeriodType periodType64 = org.joda.time.PeriodType.forFields(durationFieldTypeArray63);
        org.joda.time.PeriodType periodType65 = periodType64.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType66 = null;
        int int67 = periodType65.indexOf(durationFieldType66);
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType69 = periodType68.withWeeksRemoved();
        org.joda.time.PeriodType periodType70 = org.joda.time.PeriodType.hours();
        java.lang.String str71 = periodType70.toString();
        org.joda.time.PeriodType periodType72 = periodType70.withWeeksRemoved();
        org.joda.time.PeriodType periodType73 = periodType70.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType75 = periodType70.getFieldType((int) (byte) 0);
        int int76 = periodType68.indexOf(durationFieldType75);
        org.joda.time.DurationFieldType durationFieldType78 = periodType68.getFieldType(0);
        org.joda.time.PeriodType periodType79 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str80 = periodType79.getName();
        org.joda.time.DurationFieldType durationFieldType82 = periodType79.getFieldType(0);
        boolean boolean83 = periodType68.isSupported(durationFieldType82);
        boolean boolean84 = periodType65.isSupported(durationFieldType82);
        int int85 = periodType29.indexOf(durationFieldType82);
        boolean boolean86 = periodType11.equals((java.lang.Object) durationFieldType82);
        int int87 = periodType2.indexOf(durationFieldType82);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "YearMonthDayTimeNoHours" + "'", str3, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "YearMonthDayTimeNoHours" + "'", str5, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PeriodType[Hours]" + "'", str22, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "YearMonthDayTimeNoHours" + "'", str39, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 6 + "'", int40 == 6);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PeriodType[Hours]" + "'", str42, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "YearMonthDayTimeNoHours" + "'", str54, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 6 + "'", int55 == 6);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "PeriodType[Hours]" + "'", str57, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(durationFieldType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(durationFieldTypeArray63);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "PeriodType[Hours]" + "'", str71, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(durationFieldType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(durationFieldType78);
        org.junit.Assert.assertNotNull(periodType79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "YearMonthDay" + "'", str80, "YearMonthDay");
        org.junit.Assert.assertNotNull(durationFieldType82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withHoursRemoved();
        java.lang.String str3 = periodType2.getName();
        org.joda.time.PeriodType periodType4 = periodType2.withMinutesRemoved();
        java.lang.String str5 = periodType2.getName();
        org.joda.time.PeriodType periodType6 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType7 = periodType2.withMillisRemoved();
        org.joda.time.PeriodType periodType8 = periodType2.withMonthsRemoved();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType10 = periodType9.withWeeksRemoved();
        org.joda.time.DurationFieldType durationFieldType11 = null;
        int int12 = periodType10.indexOf(durationFieldType11);
        org.joda.time.PeriodType periodType13 = periodType10.withHoursRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withWeeksRemoved();
        org.joda.time.PeriodType periodType15 = periodType14.withYearsRemoved();
        java.lang.String str16 = periodType14.getName();
        org.joda.time.PeriodType periodType17 = periodType14.withDaysRemoved();
        org.joda.time.DurationFieldType durationFieldType19 = periodType14.getFieldType(0);
        int int20 = periodType2.indexOf(durationFieldType19);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "YearMonthDayTimeNoHours" + "'", str3, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "YearMonthDayTimeNoHours" + "'", str5, "YearMonthDayTimeNoHours");
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Days" + "'", str16, "Days");
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        java.lang.String str1 = periodType0.toString();
        org.joda.time.PeriodType periodType2 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType5 = periodType0.getFieldType((int) (byte) 0);
        java.lang.String str6 = periodType0.getName();
        org.joda.time.PeriodType periodType7 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType8 = periodType0.withHoursRemoved();
        int int9 = periodType8.size();
        org.joda.time.PeriodType periodType10 = periodType8.withDaysRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PeriodType[Hours]" + "'", str1, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hours" + "'", str6, "Hours");
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType6 = periodType5.withWeeksRemoved();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.hours();
        java.lang.String str8 = periodType7.toString();
        org.joda.time.PeriodType periodType9 = periodType7.withWeeksRemoved();
        org.joda.time.PeriodType periodType10 = periodType7.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType12 = periodType7.getFieldType((int) (byte) 0);
        int int13 = periodType5.indexOf(durationFieldType12);
        int int14 = periodType3.indexOf(durationFieldType12);
        org.joda.time.DurationFieldType[] durationFieldTypeArray15 = new org.joda.time.DurationFieldType[] { durationFieldType12 };
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.forFields(durationFieldTypeArray15);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.forFields(durationFieldTypeArray15);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.forFields(durationFieldTypeArray15);
        org.joda.time.PeriodType periodType19 = periodType18.withWeeksRemoved();
        org.joda.time.PeriodType periodType20 = periodType19.withDaysRemoved();
        org.joda.time.PeriodType periodType21 = periodType20.withMillisRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PeriodType[Hours]" + "'", str8, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(durationFieldTypeArray15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMillisRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withSecondsRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMillisRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withMillisRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withMinutesRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withWeeksRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withYearsRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withHoursRemoved();
        org.joda.time.PeriodType periodType12 = periodType9.withMinutesRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withMonthsRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.PeriodType periodType8 = periodType6.withWeeksRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withYearsRemoved();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withMonthsRemoved();
        org.joda.time.PeriodType periodType13 = periodType12.withWeeksRemoved();
        org.joda.time.PeriodType periodType14 = periodType12.withWeeksRemoved();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType16 = periodType15.withSecondsRemoved();
        org.joda.time.PeriodType periodType17 = periodType15.withSecondsRemoved();
        org.joda.time.PeriodType periodType18 = periodType15.withYearsRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withDaysRemoved();
        org.joda.time.PeriodType periodType20 = periodType19.withWeeksRemoved();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType22 = periodType21.withWeeksRemoved();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.hours();
        java.lang.String str24 = periodType23.toString();
        org.joda.time.PeriodType periodType25 = periodType23.withWeeksRemoved();
        org.joda.time.PeriodType periodType26 = periodType23.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType28 = periodType23.getFieldType((int) (byte) 0);
        int int29 = periodType21.indexOf(durationFieldType28);
        boolean boolean30 = periodType19.isSupported(durationFieldType28);
        boolean boolean31 = periodType14.isSupported(durationFieldType28);
        int int32 = periodType8.indexOf(durationFieldType28);
        org.joda.time.PeriodType periodType33 = periodType8.withDaysRemoved();
        org.joda.time.PeriodType periodType34 = periodType8.withHoursRemoved();
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType36 = periodType35.withSecondsRemoved();
        org.joda.time.PeriodType periodType37 = periodType36.withMinutesRemoved();
        org.joda.time.PeriodType periodType38 = periodType37.withMonthsRemoved();
        org.joda.time.PeriodType periodType39 = periodType37.withMillisRemoved();
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType41 = periodType40.withDaysRemoved();
        org.joda.time.PeriodType periodType42 = periodType40.withYearsRemoved();
        org.joda.time.PeriodType periodType43 = periodType42.withHoursRemoved();
        int int44 = periodType42.size();
        org.joda.time.PeriodType periodType45 = periodType42.withMinutesRemoved();
        org.joda.time.PeriodType periodType46 = periodType45.withSecondsRemoved();
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType48 = periodType47.withWeeksRemoved();
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.hours();
        java.lang.String str50 = periodType49.toString();
        org.joda.time.PeriodType periodType51 = periodType49.withWeeksRemoved();
        org.joda.time.PeriodType periodType52 = periodType49.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType54 = periodType49.getFieldType((int) (byte) 0);
        int int55 = periodType47.indexOf(durationFieldType54);
        org.joda.time.DurationFieldType durationFieldType57 = periodType47.getFieldType(0);
        org.joda.time.PeriodType periodType58 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str59 = periodType58.getName();
        org.joda.time.DurationFieldType durationFieldType61 = periodType58.getFieldType(0);
        boolean boolean62 = periodType47.isSupported(durationFieldType61);
        boolean boolean63 = periodType46.isSupported(durationFieldType61);
        boolean boolean64 = periodType39.isSupported(durationFieldType61);
        boolean boolean65 = periodType34.isSupported(durationFieldType61);
        boolean boolean66 = periodType4.equals((java.lang.Object) boolean65);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PeriodType[Hours]" + "'", str24, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PeriodType[Hours]" + "'", str50, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(durationFieldType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(durationFieldType57);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "YearMonthDay" + "'", str59, "YearMonthDay");
        org.junit.Assert.assertNotNull(durationFieldType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType1 = null;
        boolean boolean2 = periodType0.isSupported(durationFieldType1);
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withMonthsRemoved();
        int int5 = periodType4.size();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withMinutesRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType6 = periodType2.getFieldType((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withMillisRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withSecondsRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMillisRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withMillisRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withMinutesRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withMonthsRemoved();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.minutes();
        int int11 = periodType10.size();
        boolean boolean12 = periodType9.equals((java.lang.Object) periodType10);
        org.joda.time.PeriodType periodType13 = periodType10.withMonthsRemoved();
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType15 = periodType14.withHoursRemoved();
        org.joda.time.PeriodType periodType16 = periodType15.withMillisRemoved();
        org.joda.time.PeriodType periodType17 = periodType15.withWeeksRemoved();
        java.lang.String str18 = periodType15.toString();
        org.joda.time.PeriodType periodType19 = periodType15.withWeeksRemoved();
        org.joda.time.PeriodType periodType20 = periodType15.withDaysRemoved();
        boolean boolean21 = periodType10.equals((java.lang.Object) periodType15);
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean24 = periodType22.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType25 = periodType22.withMonthsRemoved();
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType27 = periodType26.withWeeksRemoved();
        org.joda.time.PeriodType periodType28 = periodType27.withYearsRemoved();
        org.joda.time.PeriodType periodType29 = periodType28.withMillisRemoved();
        org.joda.time.PeriodType periodType30 = periodType28.withMillisRemoved();
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType32 = periodType31.withSecondsRemoved();
        org.joda.time.PeriodType periodType33 = periodType32.withMinutesRemoved();
        org.joda.time.PeriodType periodType34 = periodType32.withWeeksRemoved();
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType36 = periodType35.withSecondsRemoved();
        org.joda.time.PeriodType periodType37 = periodType35.withWeeksRemoved();
        org.joda.time.PeriodType periodType38 = periodType37.withYearsRemoved();
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType40 = periodType39.withHoursRemoved();
        org.joda.time.PeriodType periodType41 = periodType39.withMonthsRemoved();
        org.joda.time.PeriodType periodType42 = periodType41.withWeeksRemoved();
        org.joda.time.PeriodType periodType43 = periodType41.withWeeksRemoved();
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType45 = periodType44.withSecondsRemoved();
        org.joda.time.PeriodType periodType46 = periodType44.withSecondsRemoved();
        org.joda.time.PeriodType periodType47 = periodType44.withYearsRemoved();
        org.joda.time.PeriodType periodType48 = periodType47.withDaysRemoved();
        org.joda.time.PeriodType periodType49 = periodType48.withWeeksRemoved();
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType51 = periodType50.withWeeksRemoved();
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.hours();
        java.lang.String str53 = periodType52.toString();
        org.joda.time.PeriodType periodType54 = periodType52.withWeeksRemoved();
        org.joda.time.PeriodType periodType55 = periodType52.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType57 = periodType52.getFieldType((int) (byte) 0);
        int int58 = periodType50.indexOf(durationFieldType57);
        boolean boolean59 = periodType48.isSupported(durationFieldType57);
        boolean boolean60 = periodType43.isSupported(durationFieldType57);
        int int61 = periodType37.indexOf(durationFieldType57);
        int int62 = periodType32.indexOf(durationFieldType57);
        int int63 = periodType30.indexOf(durationFieldType57);
        org.joda.time.DurationFieldType durationFieldType65 = periodType30.getFieldType((int) (short) 0);
        int int66 = periodType25.indexOf(durationFieldType65);
        boolean boolean67 = periodType10.equals((java.lang.Object) durationFieldType65);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PeriodType[YearDayTimeNoHours]" + "'", str18, "PeriodType[YearDayTimeNoHours]");
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "PeriodType[Hours]" + "'", str53, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(durationFieldType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(durationFieldType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType1 = null;
        boolean boolean2 = periodType0.isSupported(durationFieldType1);
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withMonthsRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withMillisRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withMillisRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withDaysRemoved();
        java.lang.String str6 = periodType4.toString();
        org.joda.time.PeriodType periodType7 = periodType4.withMonthsRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withMinutesRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withWeeksRemoved();
        boolean boolean10 = periodType2.equals((java.lang.Object) periodType9);
        org.joda.time.PeriodType periodType11 = periodType9.withSecondsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PeriodType[Weeks]" + "'", str6, "PeriodType[Weeks]");
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType7 = periodType6.withWeeksRemoved();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.hours();
        java.lang.String str9 = periodType8.toString();
        org.joda.time.PeriodType periodType10 = periodType8.withWeeksRemoved();
        org.joda.time.PeriodType periodType11 = periodType8.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType13 = periodType8.getFieldType((int) (byte) 0);
        int int14 = periodType6.indexOf(durationFieldType13);
        boolean boolean15 = periodType4.isSupported(durationFieldType13);
        org.joda.time.PeriodType periodType16 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withMillisRemoved();
        org.joda.time.PeriodType periodType18 = periodType16.withDaysRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withDaysRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PeriodType[Hours]" + "'", str9, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType1 = periodType0.withDaysRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withDaysRemoved();
        java.lang.String str3 = periodType1.toString();
        org.joda.time.PeriodType periodType4 = periodType1.withMonthsRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMinutesRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withYearsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withMinutesRemoved();
        org.joda.time.PeriodType periodType8 = periodType6.withSecondsRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withMonthsRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withWeeksRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withHoursRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PeriodType[Weeks]" + "'", str3, "PeriodType[Weeks]");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType0.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType7 = periodType6.withWeeksRemoved();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.hours();
        java.lang.String str9 = periodType8.toString();
        org.joda.time.PeriodType periodType10 = periodType8.withWeeksRemoved();
        org.joda.time.PeriodType periodType11 = periodType8.withHoursRemoved();
        org.joda.time.DurationFieldType durationFieldType13 = periodType8.getFieldType((int) (byte) 0);
        int int14 = periodType6.indexOf(durationFieldType13);
        boolean boolean15 = periodType4.isSupported(durationFieldType13);
        org.joda.time.PeriodType periodType16 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withMillisRemoved();
        org.joda.time.PeriodType periodType18 = periodType16.withSecondsRemoved();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType20 = periodType19.withSecondsRemoved();
        org.joda.time.PeriodType periodType21 = periodType20.withHoursRemoved();
        boolean boolean22 = periodType18.equals((java.lang.Object) periodType20);
        org.joda.time.PeriodType periodType23 = periodType20.withMillisRemoved();
        org.joda.time.PeriodType periodType24 = periodType20.withMillisRemoved();
        org.joda.time.PeriodType periodType25 = periodType20.withMillisRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PeriodType[Hours]" + "'", str9, "PeriodType[Hours]");
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean2 = periodType0.equals((java.lang.Object) "");
        org.joda.time.PeriodType periodType3 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withMillisRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        java.lang.String str8 = periodType6.getName();
        org.joda.time.PeriodType periodType9 = periodType6.withMonthsRemoved();
        java.lang.String str10 = periodType9.getName();
        org.joda.time.PeriodType periodType11 = periodType9.withMonthsRemoved();
        org.joda.time.PeriodType periodType12 = periodType9.withWeeksRemoved();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType14 = periodType13.withSecondsRemoved();
        org.joda.time.PeriodType periodType15 = periodType13.withSecondsRemoved();
        org.joda.time.PeriodType periodType16 = periodType13.withYearsRemoved();
        org.joda.time.PeriodType periodType17 = periodType13.withWeeksRemoved();
        org.joda.time.PeriodType periodType18 = periodType13.withSecondsRemoved();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType20 = periodType19.withYearsRemoved();
        org.joda.time.PeriodType periodType21 = periodType19.withMinutesRemoved();
        org.joda.time.PeriodType periodType22 = periodType21.withMinutesRemoved();
        org.joda.time.DurationFieldType durationFieldType24 = periodType22.getFieldType(0);
        int int25 = periodType13.indexOf(durationFieldType24);
        int int26 = periodType12.indexOf(durationFieldType24);
        int int27 = periodType12.size();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "YearMonthDayTimeNoMonthsNoDaysNoMillis" + "'", str8, "YearMonthDayTimeNoMonthsNoDaysNoMillis");
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "YearMonthDayTimeNoMonthsNoDaysNoMillis" + "'", str10, "YearMonthDayTimeNoMonthsNoDaysNoMillis");
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withYearsRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMonthsRemoved();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.joda.time.PeriodType periodType8 = periodType6.withMonthsRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.DurationFieldType durationFieldType11 = periodType8.getFieldType((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType13 = periodType8.getFieldType(2);
        boolean boolean14 = periodType4.isSupported(durationFieldType13);
        int int15 = periodType0.indexOf(durationFieldType13);
        java.lang.String str16 = periodType0.getName();
        java.lang.String str17 = periodType0.getName();
        java.lang.String str18 = periodType0.getName();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Standard" + "'", str16, "Standard");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Standard" + "'", str17, "Standard");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Standard" + "'", str18, "Standard");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.seconds();
        org.joda.time.DurationFieldType durationFieldType1 = null;
        boolean boolean2 = periodType0.isSupported(durationFieldType1);
        org.joda.time.PeriodType periodType3 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withMonthsRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        java.lang.String str6 = periodType5.getName();
        java.lang.String str7 = periodType5.toString();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Seconds" + "'", str6, "Seconds");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PeriodType[Seconds]" + "'", str7, "PeriodType[Seconds]");
    }
}

