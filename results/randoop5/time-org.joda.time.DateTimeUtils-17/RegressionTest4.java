import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        java.lang.Class<?> wildcardClass13 = periodType9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
    }
}

