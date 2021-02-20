import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    @Ignore
  public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Interval interval6 = mutableInterval3.toInterval();
        mutableInterval3.setDurationBeforeEnd(0L);
        boolean boolean10 = mutableInterval3.contains((long) (short) 0);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval(0L, 1L, chronology13);
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        java.lang.Object obj16 = mutableInterval14.clone();
        long long17 = mutableInterval14.getStartMillis();
        boolean boolean18 = mutableInterval3.equals((java.lang.Object) mutableInterval14);
        org.joda.time.MutableInterval mutableInterval19 = mutableInterval14.copy();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(mutableInterval19);
    }

    @Test
    @Ignore
  public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval3);
        boolean boolean7 = mutableInterval5.isBefore(35L);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = mutableInterval5.toPeriod(periodType8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(0L, 1L, chronology12);
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.DateTime dateTime15 = mutableInterval13.getStart();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(readableInstant16, readablePeriod17);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval(0L, 1L, chronology21);
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.DateTime dateTime24 = mutableInterval22.getStart();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval(0L, 1L, chronology27);
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.DateTime dateTime30 = mutableInterval28.getStart();
        mutableInterval18.setInterval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime33 = mutableInterval32.getStart();
        boolean boolean35 = mutableInterval32.isBefore((long) (short) 10);
        org.joda.time.Interval interval36 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval(0L, 1L, chronology39);
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        mutableInterval40.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval(0L, 1L, chronology46);
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        mutableInterval47.setDurationAfterStart((long) (byte) 1);
        boolean boolean52 = mutableInterval47.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology53 = mutableInterval47.getChronology();
        mutableInterval40.setChronology(chronology53);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval(0L, 1L, chronology57);
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        java.lang.Object obj60 = mutableInterval58.clone();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval(obj60, chronology61);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        mutableInterval62.setPeriodAfterStart(readablePeriod63);
        org.joda.time.Period period65 = mutableInterval62.toPeriod();
        org.joda.time.MutableInterval mutableInterval66 = mutableInterval62.copy();
        boolean boolean67 = mutableInterval40.isAfter((org.joda.time.ReadableInterval) mutableInterval62);
        org.joda.time.MutableInterval mutableInterval68 = mutableInterval40.toMutableInterval();
        org.joda.time.DateTime dateTime69 = mutableInterval40.getStart();
        boolean boolean70 = interval36.overlaps((org.joda.time.ReadableInterval) mutableInterval40);
        org.joda.time.Duration duration71 = mutableInterval40.toDuration();
        boolean boolean72 = mutableInterval40.containsNow();
        org.joda.time.Chronology chronology73 = mutableInterval40.getChronology();
        org.joda.time.DateTime dateTime74 = mutableInterval40.getEnd();
        boolean boolean75 = mutableInterval5.contains((org.joda.time.ReadableInstant) dateTime74);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(mutableInterval66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(mutableInterval68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    @Ignore
  public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        java.lang.Object obj6 = mutableInterval3.clone();
        org.joda.time.MutableInterval mutableInterval7 = mutableInterval3.copy();
        org.joda.time.Duration duration8 = mutableInterval3.toDuration();
        org.joda.time.Period period9 = mutableInterval3.toPeriod();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval(0L, 1L, chronology16);
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        mutableInterval17.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval(0L, 1L, chronology23);
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        mutableInterval24.setDurationAfterStart((long) (byte) 1);
        boolean boolean29 = mutableInterval24.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology30 = mutableInterval24.getChronology();
        mutableInterval17.setChronology(chronology30);
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (-1), (long) '4', chronology30);
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) 1, (long) 100, chronology30);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval(0L, 1L, chronology36);
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        java.lang.Object obj39 = mutableInterval37.clone();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval(obj39, chronology40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        mutableInterval41.setPeriodAfterStart(readablePeriod42);
        org.joda.time.Period period44 = mutableInterval41.toPeriod();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(readableInstant47, readablePeriod48);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval(0L, 1L, chronology52);
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.DateTime dateTime55 = mutableInterval53.getStart();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval(0L, 1L, chronology58);
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.DateTime dateTime61 = mutableInterval59.getStart();
        mutableInterval49.setInterval((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval(readablePeriod46, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval(readablePeriod45, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval(readableInstant65, readablePeriod66);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval(0L, 1L, chronology70);
        org.joda.time.Interval interval72 = mutableInterval71.toInterval();
        org.joda.time.DateTime dateTime73 = mutableInterval71.getStart();
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval(0L, 1L, chronology76);
        org.joda.time.Interval interval78 = mutableInterval77.toInterval();
        org.joda.time.DateTime dateTime79 = mutableInterval77.getStart();
        mutableInterval67.setInterval((org.joda.time.ReadableInstant) dateTime73, (org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.MutableInterval mutableInterval82 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period44, (org.joda.time.ReadableInstant) dateTime73);
        boolean boolean83 = mutableInterval33.isBefore((org.joda.time.ReadableInstant) dateTime73);
        mutableInterval3.setStart((org.joda.time.ReadableInstant) dateTime73);
        mutableInterval3.setInterval(1606267386825L, 1606267431474L);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(interval78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        mutableInterval2.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval5 = mutableInterval2.toMutableInterval();
        org.joda.time.DateTime dateTime6 = mutableInterval5.getEnd();
        org.joda.time.MutableInterval mutableInterval7 = mutableInterval5.toMutableInterval();
        org.joda.time.DateTime dateTime8 = mutableInterval7.getStart();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        mutableInterval12.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval(0L, 1L, chronology18);
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        long long21 = interval20.getEndMillis();
        boolean boolean23 = interval20.isAfter((long) (byte) 100);
        boolean boolean24 = mutableInterval12.overlaps((org.joda.time.ReadableInterval) interval20);
        org.joda.time.Duration duration25 = mutableInterval12.toDuration();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(0L, 1L, chronology28);
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.DateTime dateTime31 = mutableInterval29.getStart();
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval(readableInstant32, readablePeriod33);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval(0L, 1L, chronology37);
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.DateTime dateTime40 = mutableInterval38.getStart();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(0L, 1L, chronology43);
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.DateTime dateTime46 = mutableInterval44.getStart();
        mutableInterval34.setInterval((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration25, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        mutableInterval49.setPeriodAfterStart(readablePeriod50);
        org.joda.time.Chronology chronology52 = mutableInterval49.getChronology();
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval7, chronology52);
        boolean boolean54 = mutableInterval7.isAfterNow();
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(1606267392528L, 1606267502581L);
    }

    @Test
    @Ignore
  public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(10L, (long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval(readableDuration3, readableInstant4);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = mutableInterval5.toPeriod(periodType6);
        mutableInterval2.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period7);
        org.joda.time.ReadableInterval readableInterval9 = null;
        boolean boolean10 = mutableInterval2.isAfter(readableInterval9);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval(0L, 1L, chronology13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutableInterval14.setDurationBeforeEnd(readableDuration15);
        long long17 = mutableInterval14.getEndMillis();
        boolean boolean19 = mutableInterval14.isBefore(1606267325736L);
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval(10L, (long) (short) 100);
        org.joda.time.MutableInterval mutableInterval23 = mutableInterval22.copy();
        org.joda.time.DateTime dateTime24 = mutableInterval23.getStart();
        boolean boolean25 = mutableInterval14.isAfter((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval(readableDuration26, readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval(readableInstant29, readablePeriod30);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(0L, 1L, chronology34);
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.DateTime dateTime37 = mutableInterval35.getStart();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval(0L, 1L, chronology40);
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.DateTime dateTime43 = mutableInterval41.getStart();
        mutableInterval31.setInterval((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) dateTime43);
        boolean boolean45 = mutableInterval28.contains((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.MutableInterval mutableInterval47 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval(0L, 1L, chronology50);
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        java.lang.Object obj53 = mutableInterval51.clone();
        org.joda.time.Interval interval54 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval(0L, 1L, chronology57);
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        java.lang.Object obj60 = mutableInterval58.clone();
        boolean boolean61 = interval54.isBefore((org.joda.time.ReadableInterval) mutableInterval58);
        boolean boolean62 = mutableInterval47.isAfter((org.joda.time.ReadableInterval) mutableInterval58);
        org.joda.time.MutableInterval mutableInterval63 = mutableInterval58.toMutableInterval();
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Period period65 = mutableInterval58.toPeriod(periodType64);
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadablePeriod) period65);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval2.setInterval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(mutableInterval23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(mutableInterval47);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(mutableInterval63);
        org.junit.Assert.assertNotNull(period65);
    }

    @Test
    @Ignore
  public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(readableInstant6, readablePeriod7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.DateTime dateTime14 = mutableInterval12.getStart();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, 1L, chronology17);
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.DateTime dateTime20 = mutableInterval18.getStart();
        mutableInterval8.setInterval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval(readablePeriod5, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval(readablePeriod4, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval(readableInstant24, readablePeriod25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval(0L, 1L, chronology29);
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.DateTime dateTime32 = mutableInterval30.getStart();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval(0L, 1L, chronology35);
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.DateTime dateTime38 = mutableInterval36.getStart();
        mutableInterval26.setInterval((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime41 = mutableInterval40.getStart();
        mutableInterval40.setInterval((long) (byte) 1, (long) (short) 1);
        boolean boolean45 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) mutableInterval40);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(0L, 1L, chronology48);
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        java.lang.Object obj51 = mutableInterval49.clone();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval(obj51, chronology52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        mutableInterval53.setPeriodBeforeEnd(readablePeriod54);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval(0L, 1L, chronology58);
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        mutableInterval59.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval(0L, 1L, chronology65);
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        long long68 = interval67.getEndMillis();
        boolean boolean70 = interval67.isAfter((long) (byte) 100);
        boolean boolean71 = mutableInterval59.overlaps((org.joda.time.ReadableInterval) interval67);
        org.joda.time.Duration duration72 = mutableInterval59.toDuration();
        boolean boolean73 = mutableInterval53.isBefore((org.joda.time.ReadableInterval) mutableInterval59);
        org.joda.time.MutableInterval mutableInterval74 = mutableInterval59.toMutableInterval();
        java.lang.String str75 = mutableInterval74.toString();
        java.lang.String str76 = mutableInterval74.toString();
        boolean boolean77 = mutableInterval40.isBefore((org.joda.time.ReadableInterval) mutableInterval74);
        org.joda.time.ReadableInterval readableInterval78 = null;
        boolean boolean79 = mutableInterval74.isAfter(readableInterval78);
        org.joda.time.Interval interval80 = mutableInterval74.toInterval();
        org.joda.time.Interval interval81 = mutableInterval74.toInterval();
        org.joda.time.ReadableInstant readableInstant82 = null;
        boolean boolean83 = mutableInterval74.isBefore(readableInstant82);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval74.setStartMillis(1606267498276L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(mutableInterval74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z" + "'", str75, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z" + "'", str76, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(interval80);
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    @Ignore
  public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        mutableInterval3.setEndMillis((long) '4');
        mutableInterval3.setInterval(35L, 1606267387939L);
        long long11 = mutableInterval3.getStartMillis();
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval3);
        long long13 = mutableInterval3.toDurationMillis();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval(0L, 1L, chronology20);
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        mutableInterval21.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval(0L, 1L, chronology27);
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        mutableInterval28.setDurationAfterStart((long) (byte) 1);
        boolean boolean33 = mutableInterval28.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology34 = mutableInterval28.getChronology();
        mutableInterval21.setChronology(chronology34);
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (-1), (long) '4', chronology34);
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) 1, (long) 100, chronology34);
        boolean boolean38 = mutableInterval37.isBeforeNow();
        org.joda.time.MutableInterval mutableInterval39 = mutableInterval37.copy();
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = mutableInterval39.toPeriod(periodType40);
        mutableInterval3.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period41);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1606267387904L + "'", long13 == 1606267387904L);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(mutableInterval39);
        org.junit.Assert.assertNotNull(period41);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        long long3 = mutableInterval2.getEndMillis();
        org.joda.time.MutableInterval mutableInterval4 = mutableInterval2.copy();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(readableDuration5, readableInstant6);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = mutableInterval7.toPeriod(periodType8);
        mutableInterval2.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period9);
        org.joda.time.DateTime dateTime11 = mutableInterval2.getStart();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval(0L, 1L, chronology14);
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        boolean boolean18 = mutableInterval15.contains((long) ' ');
        org.joda.time.MutableInterval mutableInterval19 = mutableInterval15.copy();
        boolean boolean20 = mutableInterval2.equals((java.lang.Object) mutableInterval19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableInterval2.setDurationBeforeEnd(readableDuration21);
        long long23 = mutableInterval2.getStartMillis();
        org.joda.time.Chronology chronology24 = mutableInterval2.getChronology();
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1606267576832L + "'", long3 == 1606267576832L);
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(mutableInterval19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1606267576832L + "'", long23 == 1606267576832L);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    @Ignore
  public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        long long5 = interval4.getEndMillis();
        org.joda.time.DateTime dateTime6 = interval4.getEnd();
        boolean boolean7 = interval4.isAfterNow();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(0L, 1L, chronology12);
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        java.lang.Object obj15 = mutableInterval13.clone();
        mutableInterval13.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology18 = mutableInterval13.getChronology();
        org.joda.time.MutableInterval mutableInterval19 = mutableInterval13.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval20 = mutableInterval13.copy();
        org.joda.time.Duration duration21 = mutableInterval13.toDuration();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval(readableInstant24, readablePeriod25);
        mutableInterval26.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval29 = mutableInterval26.toMutableInterval();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval(0L, 1L, chronology32);
        long long34 = mutableInterval33.toDurationMillis();
        mutableInterval26.setInterval((org.joda.time.ReadableInterval) mutableInterval33);
        mutableInterval26.setDurationAfterStart(100L);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval(0L, 1L, chronology44);
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        mutableInterval45.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval(0L, 1L, chronology51);
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        mutableInterval52.setDurationAfterStart((long) (byte) 1);
        boolean boolean57 = mutableInterval52.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology58 = mutableInterval52.getChronology();
        mutableInterval45.setChronology(chronology58);
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((long) (-1), (long) '4', chronology58);
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) 1, (long) 100, chronology58);
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval26, chronology58);
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((long) (short) 1, (long) ' ', chronology58);
        mutableInterval13.setChronology(chronology58);
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((long) (short) 0, 1606267323873L, chronology58);
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((java.lang.Object) interval4, chronology58);
        org.joda.time.DateTime dateTime67 = mutableInterval66.getEnd();
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime67, readableInstant68);
        long long70 = mutableInterval69.getStartMillis();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(mutableInterval19);
        org.junit.Assert.assertNotNull(mutableInterval20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
    }

    @Test
    @Ignore
  public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        mutableInterval2.setDurationBeforeEnd(1L);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(readableInstant5, readablePeriod6);
        long long8 = mutableInterval7.getEndMillis();
        org.joda.time.MutableInterval mutableInterval9 = mutableInterval7.copy();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(readableDuration10, readableInstant11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = mutableInterval12.toPeriod(periodType13);
        mutableInterval7.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period14);
        org.joda.time.DateTime dateTime16 = mutableInterval7.getStart();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        java.lang.Object obj22 = mutableInterval20.clone();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval(obj22, chronology23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableInterval24.setPeriodBeforeEnd(readablePeriod25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(readableInstant27, readablePeriod28);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval(0L, 1L, chronology32);
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.DateTime dateTime35 = mutableInterval33.getStart();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval(0L, 1L, chronology38);
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.DateTime dateTime41 = mutableInterval39.getStart();
        mutableInterval29.setInterval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval(0L, 1L, chronology45);
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        java.lang.Object obj48 = mutableInterval46.clone();
        org.joda.time.Interval interval49 = mutableInterval46.toInterval();
        org.joda.time.ReadableInterval readableInterval50 = null;
        boolean boolean51 = mutableInterval46.isBefore(readableInterval50);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology54);
        boolean boolean56 = mutableInterval46.isAfter((org.joda.time.ReadableInterval) mutableInterval55);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval(0L, 1L, chronology59);
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        org.joda.time.DateTime dateTime62 = mutableInterval60.getStart();
        boolean boolean63 = mutableInterval46.isBefore((org.joda.time.ReadableInstant) dateTime62);
        mutableInterval24.setInterval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime62);
        boolean boolean65 = mutableInterval7.isAfter((org.joda.time.ReadableInstant) dateTime62);
        boolean boolean66 = mutableInterval2.overlaps((org.joda.time.ReadableInterval) mutableInterval7);
        java.lang.Object obj67 = mutableInterval2.clone();
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1606267577038L + "'", long8 == 1606267577038L);
        org.junit.Assert.assertNotNull(mutableInterval9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(obj67);
// flaky:         org.junit.Assert.assertEquals(obj67.toString(), "2020-11-25T01:26:17.037Z/2020-11-25T01:26:17.038Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj67), "2020-11-25T01:26:17.037Z/2020-11-25T01:26:17.038Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj67), "2020-11-25T01:26:17.037Z/2020-11-25T01:26:17.038Z");
    }

    @Test
    @Ignore
  public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.DateTime dateTime5 = mutableInterval3.getStart();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(readableInstant6, readablePeriod7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.DateTime dateTime14 = mutableInterval12.getStart();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, 1L, chronology17);
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.DateTime dateTime20 = mutableInterval18.getStart();
        mutableInterval8.setInterval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime23 = mutableInterval22.getStart();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval(0L, 1L, chronology26);
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        mutableInterval27.setDurationAfterStart((long) (byte) 1);
        boolean boolean32 = mutableInterval27.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval(0L, 1L, chronology35);
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        java.lang.Object obj38 = mutableInterval36.clone();
        mutableInterval36.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology41 = mutableInterval36.getChronology();
        mutableInterval27.setChronology(chronology41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval(readableInstant43, readablePeriod44);
        mutableInterval45.setDurationBeforeEnd(1L);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval(0L, 1L, chronology50);
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        java.lang.Object obj53 = mutableInterval51.clone();
        mutableInterval51.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology56 = mutableInterval51.getChronology();
        mutableInterval45.setChronology(chronology56);
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval27, chronology56);
        boolean boolean59 = mutableInterval22.contains((org.joda.time.ReadableInterval) mutableInterval58);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((java.lang.Object) boolean59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    @Ignore
  public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        mutableInterval2.setDurationBeforeEnd(1L);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(0L, 1L, chronology7);
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        java.lang.Object obj10 = mutableInterval8.clone();
        mutableInterval8.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology13 = mutableInterval8.getChronology();
        mutableInterval2.setChronology(chronology13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval(readableInstant15, readablePeriod16);
        mutableInterval17.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval20 = mutableInterval17.toMutableInterval();
        org.joda.time.Period period21 = mutableInterval17.toPeriod();
        mutableInterval17.setDurationBeforeEnd((long) '#');
        boolean boolean24 = mutableInterval2.isBefore((org.joda.time.ReadableInterval) mutableInterval17);
        boolean boolean26 = mutableInterval2.isAfter((long) 100);
        boolean boolean28 = mutableInterval2.isBefore(1606267428518L);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(mutableInterval20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableInterval3.setPeriodAfterStart(readablePeriod4);
        org.joda.time.MutableInterval mutableInterval6 = mutableInterval3.toMutableInterval();
        long long7 = mutableInterval3.toDurationMillis();
        long long8 = mutableInterval3.getStartMillis();
        org.junit.Assert.assertNotNull(mutableInterval6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    @Ignore
  public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.DateTime dateTime5 = mutableInterval3.getStart();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval(0L, 1L, chronology8);
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        java.lang.Object obj11 = mutableInterval9.clone();
        org.joda.time.Interval interval12 = mutableInterval9.toInterval();
        org.joda.time.ReadableInterval readableInterval13 = null;
        boolean boolean14 = mutableInterval9.isBefore(readableInterval13);
        org.joda.time.MutableInterval mutableInterval15 = mutableInterval9.copy();
        boolean boolean16 = mutableInterval3.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        mutableInterval20.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval(0L, 1L, chronology26);
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        java.lang.Object obj29 = mutableInterval27.clone();
        org.joda.time.Interval interval30 = mutableInterval27.toInterval();
        org.joda.time.ReadableInterval readableInterval31 = null;
        boolean boolean32 = mutableInterval27.isBefore(readableInterval31);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology35);
        boolean boolean37 = mutableInterval27.isAfter((org.joda.time.ReadableInterval) mutableInterval36);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval(0L, 1L, chronology40);
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.DateTime dateTime43 = mutableInterval41.getStart();
        boolean boolean44 = mutableInterval27.isBefore((org.joda.time.ReadableInstant) dateTime43);
        boolean boolean45 = mutableInterval20.contains((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(0L, 1L, chronology48);
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        java.lang.Object obj51 = mutableInterval49.clone();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval(obj51, chronology52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        mutableInterval53.setPeriodAfterStart(readablePeriod54);
        org.joda.time.Period period56 = mutableInterval53.toPeriod();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval(0L, 1L, chronology59);
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        java.lang.Object obj62 = mutableInterval60.clone();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval(obj62, chronology63);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        mutableInterval64.setPeriodAfterStart(readablePeriod65);
        org.joda.time.Period period67 = mutableInterval64.toPeriod();
        mutableInterval53.setPeriodAfterStart((org.joda.time.ReadablePeriod) period67);
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadablePeriod) period67);
        boolean boolean70 = mutableInterval3.equals((java.lang.Object) mutableInterval69);
        org.joda.time.Duration duration71 = mutableInterval3.toDuration();
        org.joda.time.Interval interval72 = mutableInterval3.toInterval();
        mutableInterval3.setDurationBeforeEnd(1606267516363L);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(mutableInterval15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(interval72);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        long long12 = interval11.getEndMillis();
        boolean boolean14 = interval11.isAfter((long) (byte) 100);
        boolean boolean15 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) interval11);
        org.joda.time.Duration duration16 = mutableInterval3.toDuration();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval(readableInstant17, readablePeriod18);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval(0L, 1L, chronology22);
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.DateTime dateTime25 = mutableInterval23.getStart();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(0L, 1L, chronology28);
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.DateTime dateTime31 = mutableInterval29.getStart();
        mutableInterval19.setInterval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime31, readableInstant34);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    @Ignore
  public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableInterval3.setPeriodBeforeEnd(readablePeriod4);
        mutableInterval3.setStartMillis((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(readableInstant8, readablePeriod9);
        long long11 = mutableInterval10.getEndMillis();
        boolean boolean12 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) mutableInterval10);
        boolean boolean13 = mutableInterval10.isAfterNow();
        org.joda.time.Duration duration14 = mutableInterval10.toDuration();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, 1L, chronology17);
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        java.lang.Object obj20 = mutableInterval18.clone();
        mutableInterval18.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology23 = mutableInterval18.getChronology();
        org.joda.time.MutableInterval mutableInterval24 = mutableInterval18.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval25 = mutableInterval18.copy();
        org.joda.time.Duration duration26 = mutableInterval18.toDuration();
        org.joda.time.DateTime dateTime27 = mutableInterval18.getStart();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval(0L, 1L, chronology30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableInterval31.setPeriodAfterStart(readablePeriod32);
        org.joda.time.MutableInterval mutableInterval34 = mutableInterval31.toMutableInterval();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval(0L, 1L, chronology37);
        long long39 = mutableInterval38.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval40 = mutableInterval38.copy();
        org.joda.time.Period period41 = mutableInterval38.toPeriod();
        mutableInterval31.setPeriodAfterStart((org.joda.time.ReadablePeriod) period41);
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadablePeriod) period41);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval(0L, 1L, chronology46);
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        java.lang.Object obj49 = mutableInterval47.clone();
        mutableInterval47.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology52 = mutableInterval47.getChronology();
        org.joda.time.MutableInterval mutableInterval53 = mutableInterval47.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval54 = mutableInterval47.copy();
        org.joda.time.Duration duration55 = mutableInterval47.toDuration();
        org.joda.time.DateTime dateTime56 = mutableInterval47.getStart();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval(0L, 1L, chronology59);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        mutableInterval60.setPeriodAfterStart(readablePeriod61);
        org.joda.time.MutableInterval mutableInterval63 = mutableInterval60.toMutableInterval();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval(0L, 1L, chronology66);
        long long68 = mutableInterval67.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval69 = mutableInterval67.copy();
        org.joda.time.Period period70 = mutableInterval67.toPeriod();
        mutableInterval60.setPeriodAfterStart((org.joda.time.ReadablePeriod) period70);
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadablePeriod) period70);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval(readableInstant73, readablePeriod74);
        long long76 = mutableInterval75.getEndMillis();
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        org.joda.time.MutableInterval mutableInterval79 = new org.joda.time.MutableInterval(readableInstant77, readablePeriod78);
        mutableInterval79.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval82 = mutableInterval79.toMutableInterval();
        org.joda.time.DateTime dateTime83 = mutableInterval82.getEnd();
        boolean boolean84 = mutableInterval75.isAfter((org.joda.time.ReadableInstant) dateTime83);
        mutableInterval43.setInterval((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) dateTime83);
        org.joda.time.Chronology chronology88 = null;
        org.joda.time.MutableInterval mutableInterval89 = new org.joda.time.MutableInterval(0L, 1L, chronology88);
        org.joda.time.Interval interval90 = mutableInterval89.toInterval();
        java.lang.Object obj91 = mutableInterval89.clone();
        org.joda.time.Chronology chronology92 = null;
        org.joda.time.MutableInterval mutableInterval93 = new org.joda.time.MutableInterval(obj91, chronology92);
        org.joda.time.DateTime dateTime94 = mutableInterval93.getEnd();
        org.joda.time.MutableInterval mutableInterval95 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) dateTime94);
        org.joda.time.MutableInterval mutableInterval96 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration14, (org.joda.time.ReadableInstant) dateTime56);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval96.setStartMillis(1606267425946L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1606267577462L + "'", long11 == 1606267577462L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(mutableInterval24);
        org.junit.Assert.assertNotNull(mutableInterval25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(mutableInterval34);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertNotNull(mutableInterval40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(mutableInterval53);
        org.junit.Assert.assertNotNull(mutableInterval54);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(mutableInterval63);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(mutableInterval69);
        org.junit.Assert.assertNotNull(period70);
// flaky:         org.junit.Assert.assertTrue("'" + long76 + "' != '" + 1606267577463L + "'", long76 == 1606267577463L);
        org.junit.Assert.assertNotNull(mutableInterval82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(interval90);
        org.junit.Assert.assertNotNull(obj91);
        org.junit.Assert.assertEquals(obj91.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj91), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj91), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(dateTime94);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.DateTime dateTime5 = mutableInterval3.getStart();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(readableInstant6, readablePeriod7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.DateTime dateTime14 = mutableInterval12.getStart();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, 1L, chronology17);
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.DateTime dateTime20 = mutableInterval18.getStart();
        mutableInterval8.setInterval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime23 = mutableInterval22.getStart();
        boolean boolean25 = mutableInterval22.isBefore((long) (short) 10);
        org.joda.time.Interval interval26 = mutableInterval22.toInterval();
        boolean boolean27 = interval26.isAfterNow();
        long long28 = interval26.getStartMillis();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    @Ignore
  public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableInterval3.setDurationAfterStart(readableDuration6);
        boolean boolean8 = mutableInterval3.isAfterNow();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        mutableInterval12.setDurationAfterStart((long) (byte) 1);
        boolean boolean17 = mutableInterval12.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology18 = mutableInterval12.getChronology();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval(0L, 1L, chronology21);
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        java.lang.Object obj24 = mutableInterval22.clone();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval(obj24, chronology25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableInterval26.setPeriodAfterStart(readablePeriod27);
        org.joda.time.Period period29 = mutableInterval26.toPeriod();
        mutableInterval12.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period29);
        mutableInterval3.setPeriodAfterStart((org.joda.time.ReadablePeriod) period29);
        long long32 = mutableInterval3.getEndMillis();
        boolean boolean33 = mutableInterval3.isBeforeNow();
        long long34 = mutableInterval3.getEndMillis();
        java.lang.String str35 = mutableInterval3.toString();
        boolean boolean36 = mutableInterval3.containsNow();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z" + "'", str35, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    @Ignore
  public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(0L, (long) 0);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableInterval6.setPeriodBeforeEnd(readablePeriod7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval(readableInstant9, readablePeriod10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval(0L, 1L, chronology14);
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.DateTime dateTime17 = mutableInterval15.getStart();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval(0L, 1L, chronology20);
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.DateTime dateTime23 = mutableInterval21.getStart();
        mutableInterval11.setInterval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime23);
        boolean boolean25 = mutableInterval6.isAfter((org.joda.time.ReadableInstant) dateTime23);
        long long26 = mutableInterval6.getStartMillis();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval(0L, 1L, chronology29);
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        mutableInterval30.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval(0L, 1L, chronology36);
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        long long39 = interval38.getEndMillis();
        boolean boolean41 = interval38.isAfter((long) (byte) 100);
        boolean boolean42 = mutableInterval30.overlaps((org.joda.time.ReadableInterval) interval38);
        org.joda.time.Duration duration43 = mutableInterval30.toDuration();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval(0L, 1L, chronology46);
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.DateTime dateTime49 = mutableInterval47.getStart();
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval(readableInstant50, readablePeriod51);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval(0L, 1L, chronology55);
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        org.joda.time.DateTime dateTime58 = mutableInterval56.getStart();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval(0L, 1L, chronology61);
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.DateTime dateTime64 = mutableInterval62.getStart();
        mutableInterval52.setInterval((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration43, (org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval(0L, 1L, chronology70);
        org.joda.time.Interval interval72 = mutableInterval71.toInterval();
        mutableInterval71.setDurationAfterStart((long) (byte) 1);
        mutableInterval71.setDurationAfterStart((long) '#');
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutableInterval mutableInterval80 = new org.joda.time.MutableInterval(0L, 1L, chronology79);
        org.joda.time.Interval interval81 = mutableInterval80.toInterval();
        org.joda.time.DateTime dateTime82 = mutableInterval80.getStart();
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.MutableInterval mutableInterval86 = new org.joda.time.MutableInterval(0L, 1L, chronology85);
        org.joda.time.Interval interval87 = mutableInterval86.toInterval();
        java.lang.Object obj88 = mutableInterval86.clone();
        org.joda.time.Chronology chronology89 = null;
        org.joda.time.MutableInterval mutableInterval90 = new org.joda.time.MutableInterval(obj88, chronology89);
        org.joda.time.ReadablePeriod readablePeriod91 = null;
        mutableInterval90.setPeriodAfterStart(readablePeriod91);
        org.joda.time.Period period93 = mutableInterval90.toPeriod();
        org.joda.time.MutableInterval mutableInterval94 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime82, (org.joda.time.ReadablePeriod) period93);
        boolean boolean95 = mutableInterval71.isBefore((org.joda.time.ReadableInstant) dateTime82);
        org.joda.time.MutableInterval mutableInterval96 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration43, (org.joda.time.ReadableInstant) dateTime82);
        boolean boolean97 = mutableInterval6.contains((org.joda.time.ReadableInstant) dateTime82);
        mutableInterval2.setEnd((org.joda.time.ReadableInstant) dateTime82);
        boolean boolean99 = mutableInterval2.isBeforeNow();
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(interval87);
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertEquals(obj88.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj88), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj88), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        long long12 = interval11.getEndMillis();
        boolean boolean14 = interval11.isAfter((long) (byte) 100);
        boolean boolean15 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) interval11);
        org.joda.time.Duration duration16 = mutableInterval3.toDuration();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.DateTime dateTime22 = mutableInterval20.getStart();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(readableInstant23, readablePeriod24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(0L, 1L, chronology28);
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.DateTime dateTime31 = mutableInterval29.getStart();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(0L, 1L, chronology34);
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.DateTime dateTime37 = mutableInterval35.getStart();
        mutableInterval25.setInterval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(0L, 1L, chronology43);
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.DateTime dateTime46 = mutableInterval44.getStart();
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(readableInstant47, readablePeriod48);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval(0L, 1L, chronology52);
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.DateTime dateTime55 = mutableInterval53.getStart();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval(0L, 1L, chronology58);
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.DateTime dateTime61 = mutableInterval59.getStart();
        mutableInterval49.setInterval((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTime dateTime64 = mutableInterval63.getStart();
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Period period66 = mutableInterval65.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((java.lang.Object) period66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(period66);
    }

    @Test
    @Ignore
  public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.DateTime dateTime5 = mutableInterval3.getStart();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(readableInstant6, readablePeriod7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.DateTime dateTime14 = mutableInterval12.getStart();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, 1L, chronology17);
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.DateTime dateTime20 = mutableInterval18.getStart();
        mutableInterval8.setInterval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime23 = mutableInterval22.getStart();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval(0L, 1L, chronology26);
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        mutableInterval27.setDurationAfterStart((long) (byte) 1);
        boolean boolean32 = mutableInterval27.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval(0L, 1L, chronology35);
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        java.lang.Object obj38 = mutableInterval36.clone();
        mutableInterval36.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology41 = mutableInterval36.getChronology();
        mutableInterval27.setChronology(chronology41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval(readableInstant43, readablePeriod44);
        mutableInterval45.setDurationBeforeEnd(1L);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval(0L, 1L, chronology50);
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        java.lang.Object obj53 = mutableInterval51.clone();
        mutableInterval51.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology56 = mutableInterval51.getChronology();
        mutableInterval45.setChronology(chronology56);
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval27, chronology56);
        boolean boolean59 = mutableInterval22.contains((org.joda.time.ReadableInterval) mutableInterval58);
        mutableInterval22.setDurationAfterStart(1606267335606L);
        org.joda.time.MutableInterval mutableInterval62 = mutableInterval22.toMutableInterval();
        boolean boolean63 = mutableInterval22.isAfterNow();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(mutableInterval62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    @Ignore
  public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(obj5, chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableInterval7.setPeriodBeforeEnd(readablePeriod8);
        mutableInterval7.setDurationBeforeEnd((long) 100);
        mutableInterval7.setStartMillis(1L);
        org.joda.time.MutableInterval mutableInterval14 = mutableInterval7.toMutableInterval();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, 1L, chronology17);
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        mutableInterval18.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(0L, 1L, chronology24);
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        long long27 = interval26.getEndMillis();
        boolean boolean29 = interval26.isAfter((long) (byte) 100);
        boolean boolean30 = mutableInterval18.overlaps((org.joda.time.ReadableInterval) interval26);
        org.joda.time.Duration duration31 = mutableInterval18.toDuration();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(0L, 1L, chronology34);
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.DateTime dateTime37 = mutableInterval35.getStart();
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval(readableInstant38, readablePeriod39);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(0L, 1L, chronology43);
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.DateTime dateTime46 = mutableInterval44.getStart();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval(0L, 1L, chronology49);
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.DateTime dateTime52 = mutableInterval50.getStart();
        mutableInterval40.setInterval((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration31, (org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        mutableInterval55.setPeriodAfterStart(readablePeriod56);
        org.joda.time.Duration duration58 = mutableInterval55.toDuration();
        mutableInterval14.setDurationAfterStart((org.joda.time.ReadableDuration) duration58);
        java.lang.Object obj60 = mutableInterval14.clone();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(mutableInterval14);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "1970-01-01T00:00:00.001Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "1970-01-01T00:00:00.001Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "1970-01-01T00:00:00.001Z/1970-01-01T00:00:00.001Z");
    }

    @Test
    @Ignore
  public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval(0L, 1L, chronology4);
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        java.lang.Object obj7 = mutableInterval5.clone();
        org.joda.time.Interval interval8 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        java.lang.Object obj14 = mutableInterval12.clone();
        boolean boolean15 = interval8.isBefore((org.joda.time.ReadableInterval) mutableInterval12);
        boolean boolean16 = mutableInterval1.isAfter((org.joda.time.ReadableInterval) mutableInterval12);
        boolean boolean18 = mutableInterval1.isAfter(1606267431474L);
        org.junit.Assert.assertNotNull(mutableInterval1);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    @Ignore
  public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        long long12 = interval11.getEndMillis();
        boolean boolean14 = interval11.isAfter((long) (byte) 100);
        boolean boolean15 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) interval11);
        org.joda.time.Duration duration16 = mutableInterval3.toDuration();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.DateTime dateTime22 = mutableInterval20.getStart();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(readableInstant23, readablePeriod24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(0L, 1L, chronology28);
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.DateTime dateTime31 = mutableInterval29.getStart();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(0L, 1L, chronology34);
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.DateTime dateTime37 = mutableInterval35.getStart();
        mutableInterval25.setInterval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval(readableInstant41, readablePeriod42);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval(0L, 1L, chronology46);
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.DateTime dateTime49 = mutableInterval47.getStart();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval(0L, 1L, chronology52);
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.DateTime dateTime55 = mutableInterval53.getStart();
        mutableInterval43.setInterval((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval(0L, 1L, chronology60);
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        java.lang.Object obj63 = mutableInterval61.clone();
        org.joda.time.Interval interval64 = mutableInterval61.toInterval();
        org.joda.time.ReadableInterval readableInterval65 = null;
        boolean boolean66 = mutableInterval61.isBefore(readableInterval65);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology69);
        boolean boolean71 = mutableInterval61.isAfter((org.joda.time.ReadableInterval) mutableInterval70);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval(0L, 1L, chronology74);
        org.joda.time.Interval interval76 = mutableInterval75.toInterval();
        org.joda.time.DateTime dateTime77 = mutableInterval75.getStart();
        boolean boolean78 = mutableInterval61.isBefore((org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.MutableInterval mutableInterval79 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime77, readableInstant80);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertEquals(obj63.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj63), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj63), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(interval76);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    @Ignore
  public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        mutableInterval10.setDurationAfterStart((long) (byte) 1);
        boolean boolean15 = mutableInterval10.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology16 = mutableInterval10.getChronology();
        mutableInterval3.setChronology(chronology16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval(0L, 1L, chronology20);
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        java.lang.Object obj23 = mutableInterval21.clone();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(obj23, chronology24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableInterval25.setPeriodAfterStart(readablePeriod26);
        org.joda.time.Period period28 = mutableInterval25.toPeriod();
        org.joda.time.MutableInterval mutableInterval29 = mutableInterval25.copy();
        boolean boolean30 = mutableInterval3.isAfter((org.joda.time.ReadableInterval) mutableInterval25);
        org.joda.time.Interval interval31 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(0L, 1L, chronology34);
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        java.lang.Object obj37 = mutableInterval35.clone();
        org.joda.time.Interval interval38 = mutableInterval35.toInterval();
        mutableInterval35.setDurationBeforeEnd(0L);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(0L, 1L, chronology43);
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        java.lang.Object obj46 = mutableInterval44.clone();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval(obj46, chronology47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        mutableInterval48.setPeriodBeforeEnd(readablePeriod49);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval(0L, 1L, chronology53);
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        mutableInterval54.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval(0L, 1L, chronology60);
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        long long63 = interval62.getEndMillis();
        boolean boolean65 = interval62.isAfter((long) (byte) 100);
        boolean boolean66 = mutableInterval54.overlaps((org.joda.time.ReadableInterval) interval62);
        org.joda.time.Duration duration67 = mutableInterval54.toDuration();
        boolean boolean68 = mutableInterval48.isBefore((org.joda.time.ReadableInterval) mutableInterval54);
        org.joda.time.MutableInterval mutableInterval69 = mutableInterval54.toMutableInterval();
        boolean boolean70 = mutableInterval35.overlaps((org.joda.time.ReadableInterval) mutableInterval69);
        boolean boolean71 = mutableInterval3.isBefore((org.joda.time.ReadableInterval) mutableInterval69);
        boolean boolean73 = mutableInterval69.isAfter(1606267389736L);
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval69);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1L + "'", long63 == 1L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(mutableInterval69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    @Ignore
  public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        mutableInterval2.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval5 = mutableInterval2.toMutableInterval();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval(0L, 1L, chronology8);
        long long10 = mutableInterval9.toDurationMillis();
        mutableInterval2.setInterval((org.joda.time.ReadableInterval) mutableInterval9);
        mutableInterval2.setDurationAfterStart(100L);
        mutableInterval2.setDurationBeforeEnd(1606267383550L);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(readableInstant16, readablePeriod17);
        mutableInterval18.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval21 = mutableInterval18.toMutableInterval();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(0L, 1L, chronology24);
        long long26 = mutableInterval25.toDurationMillis();
        mutableInterval18.setInterval((org.joda.time.ReadableInterval) mutableInterval25);
        org.joda.time.DateTime dateTime28 = mutableInterval18.getEnd();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval(0L, 1L, chronology31);
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        mutableInterval32.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval(0L, 1L, chronology38);
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        long long41 = interval40.getEndMillis();
        boolean boolean43 = interval40.isAfter((long) (byte) 100);
        boolean boolean44 = mutableInterval32.overlaps((org.joda.time.ReadableInterval) interval40);
        org.joda.time.Duration duration45 = mutableInterval32.toDuration();
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval(readableInstant46, readablePeriod47);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval(0L, 1L, chronology51);
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.DateTime dateTime54 = mutableInterval52.getStart();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval(0L, 1L, chronology57);
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        org.joda.time.DateTime dateTime60 = mutableInterval58.getStart();
        mutableInterval48.setInterval((org.joda.time.ReadableInstant) dateTime54, (org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration45, (org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableDuration) duration45);
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (-1), (long) (byte) 100);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval(0L, 1L, chronology69);
        org.joda.time.Interval interval71 = mutableInterval70.toInterval();
        java.lang.Object obj72 = mutableInterval70.clone();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval(obj72, chronology73);
        org.joda.time.DateTime dateTime75 = mutableInterval74.getEnd();
        boolean boolean76 = mutableInterval66.isBefore((org.joda.time.ReadableInstant) dateTime75);
        mutableInterval2.setInterval((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.Period period79 = mutableInterval2.toPeriod(periodType78);
        java.lang.String str80 = mutableInterval2.toString();
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(mutableInterval21);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertEquals(obj72.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj72), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj72), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "1970-01-01T00:00:00.001Z/1970-01-01T00:00:00.001Z" + "'", str80, "1970-01-01T00:00:00.001Z/1970-01-01T00:00:00.001Z");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableDuration0, readableInstant1);
        org.joda.time.MutableInterval mutableInterval3 = mutableInterval2.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval4 = mutableInterval2.toMutableInterval();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(readableInstant5, readablePeriod6);
        mutableInterval7.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval10 = mutableInterval7.toMutableInterval();
        long long11 = mutableInterval7.toDurationMillis();
        boolean boolean13 = mutableInterval7.contains((long) 100);
        long long14 = mutableInterval7.getEndMillis();
        org.joda.time.DateTime dateTime15 = mutableInterval7.getStart();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = mutableInterval7.toPeriod(periodType16);
        mutableInterval2.setPeriodAfterStart((org.joda.time.ReadablePeriod) period17);
        org.junit.Assert.assertNotNull(mutableInterval3);
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(mutableInterval10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1606267578758L + "'", long14 == 1606267578758L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    @Ignore
  public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        mutableInterval3.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology8 = mutableInterval3.getChronology();
        org.joda.time.MutableInterval mutableInterval9 = mutableInterval3.toMutableInterval();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(0L, 1L, chronology12);
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        java.lang.Object obj15 = mutableInterval13.clone();
        long long16 = mutableInterval13.getStartMillis();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval(readableInstant19, readablePeriod20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(0L, 1L, chronology24);
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.DateTime dateTime27 = mutableInterval25.getStart();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval(0L, 1L, chronology30);
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.DateTime dateTime33 = mutableInterval31.getStart();
        mutableInterval21.setInterval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(readablePeriod18, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval(readablePeriod17, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval(readableInstant37, readablePeriod38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval(0L, 1L, chronology42);
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.DateTime dateTime45 = mutableInterval43.getStart();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(0L, 1L, chronology48);
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.DateTime dateTime51 = mutableInterval49.getStart();
        mutableInterval39.setInterval((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime45);
        boolean boolean54 = mutableInterval13.isBefore((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval(0L, 1L, chronology57);
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        mutableInterval58.setDurationAfterStart((long) (byte) 1);
        boolean boolean63 = mutableInterval58.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval(0L, 1L, chronology66);
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        java.lang.Object obj69 = mutableInterval67.clone();
        mutableInterval67.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology72 = mutableInterval67.getChronology();
        mutableInterval58.setChronology(chronology72);
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval13, chronology72);
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval9, chronology72);
        boolean boolean76 = mutableInterval75.isBeforeNow();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(mutableInterval9);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertEquals(obj69.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj69), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj69), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    @Ignore
  public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval(0L, 1L, chronology3);
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        java.lang.Object obj6 = mutableInterval4.clone();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(obj6, chronology7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableInterval8.setPeriodBeforeEnd(readablePeriod9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(readableInstant11, readablePeriod12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval(0L, 1L, chronology16);
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.DateTime dateTime19 = mutableInterval17.getStart();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval(0L, 1L, chronology22);
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.DateTime dateTime25 = mutableInterval23.getStart();
        mutableInterval13.setInterval((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval(0L, 1L, chronology29);
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        java.lang.Object obj32 = mutableInterval30.clone();
        org.joda.time.Interval interval33 = mutableInterval30.toInterval();
        org.joda.time.ReadableInterval readableInterval34 = null;
        boolean boolean35 = mutableInterval30.isBefore(readableInterval34);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology38);
        boolean boolean40 = mutableInterval30.isAfter((org.joda.time.ReadableInterval) mutableInterval39);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(0L, 1L, chronology43);
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.DateTime dateTime46 = mutableInterval44.getStart();
        boolean boolean47 = mutableInterval30.isBefore((org.joda.time.ReadableInstant) dateTime46);
        mutableInterval8.setInterval((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(readablePeriod0, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval(0L, 1L, chronology52);
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        java.lang.Object obj55 = mutableInterval53.clone();
        java.lang.Object obj56 = mutableInterval53.clone();
        org.joda.time.MutableInterval mutableInterval57 = mutableInterval53.copy();
        org.joda.time.Duration duration58 = mutableInterval53.toDuration();
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableDuration) duration58);
        java.lang.Object obj60 = mutableInterval59.clone();
        long long61 = mutableInterval59.toDurationMillis();
        boolean boolean62 = mutableInterval59.containsNow();
        boolean boolean64 = mutableInterval59.contains(1606267347337L);
        org.joda.time.ReadableDuration readableDuration65 = null;
        mutableInterval59.setDurationBeforeEnd(readableDuration65);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertEquals(obj55.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj55), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj55), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj56), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(mutableInterval57);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("2020-11-25T01:25:28.549Z/2020-11-25T01:25:28.550Z");
        org.junit.Assert.assertNotNull(mutableInterval1);
    }

    @Test
    @Ignore
  public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(obj5, chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableInterval7.setPeriodBeforeEnd(readablePeriod8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(0L, 1L, chronology12);
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        mutableInterval13.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        long long22 = interval21.getEndMillis();
        boolean boolean24 = interval21.isAfter((long) (byte) 100);
        boolean boolean25 = mutableInterval13.overlaps((org.joda.time.ReadableInterval) interval21);
        org.joda.time.Duration duration26 = mutableInterval13.toDuration();
        boolean boolean27 = mutableInterval7.isBefore((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.MutableInterval mutableInterval28 = mutableInterval13.toMutableInterval();
        java.lang.String str29 = mutableInterval28.toString();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval(0L, 1L, chronology32);
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        java.lang.Object obj35 = mutableInterval33.clone();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval(obj35, chronology36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableInterval37.setPeriodBeforeEnd(readablePeriod38);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval(readableInstant40, readablePeriod41);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval(0L, 1L, chronology45);
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.DateTime dateTime48 = mutableInterval46.getStart();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval(0L, 1L, chronology51);
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.DateTime dateTime54 = mutableInterval52.getStart();
        mutableInterval42.setInterval((org.joda.time.ReadableInstant) dateTime48, (org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval(0L, 1L, chronology58);
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        java.lang.Object obj61 = mutableInterval59.clone();
        org.joda.time.Interval interval62 = mutableInterval59.toInterval();
        org.joda.time.ReadableInterval readableInterval63 = null;
        boolean boolean64 = mutableInterval59.isBefore(readableInterval63);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology67);
        boolean boolean69 = mutableInterval59.isAfter((org.joda.time.ReadableInterval) mutableInterval68);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval(0L, 1L, chronology72);
        org.joda.time.Interval interval74 = mutableInterval73.toInterval();
        org.joda.time.DateTime dateTime75 = mutableInterval73.getStart();
        boolean boolean76 = mutableInterval59.isBefore((org.joda.time.ReadableInstant) dateTime75);
        mutableInterval37.setInterval((org.joda.time.ReadableInstant) dateTime48, (org.joda.time.ReadableInstant) dateTime75);
        boolean boolean78 = mutableInterval28.isAfter((org.joda.time.ReadableInstant) dateTime48);
        boolean boolean79 = mutableInterval28.isAfterNow();
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval(0L, 1L, chronology82);
        org.joda.time.Interval interval84 = mutableInterval83.toInterval();
        java.lang.Object obj85 = mutableInterval83.clone();
        mutableInterval83.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology88 = mutableInterval83.getChronology();
        org.joda.time.MutableInterval mutableInterval89 = mutableInterval83.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval90 = mutableInterval83.copy();
        boolean boolean92 = mutableInterval90.isBefore((long) (short) -1);
        boolean boolean93 = mutableInterval28.contains((org.joda.time.ReadableInterval) mutableInterval90);
        org.joda.time.Interval interval94 = mutableInterval28.toInterval();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(mutableInterval28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z" + "'", str29, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals(obj61.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj61), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj61), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(interval74);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(interval84);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertEquals(obj85.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj85), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj85), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology88);
        org.junit.Assert.assertNotNull(mutableInterval89);
        org.junit.Assert.assertNotNull(mutableInterval90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(interval94);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        long long12 = interval11.getEndMillis();
        boolean boolean14 = interval11.isAfter((long) (byte) 100);
        boolean boolean15 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) interval11);
        long long16 = mutableInterval3.toDurationMillis();
        org.joda.time.DateTime dateTime17 = mutableInterval3.getStart();
        boolean boolean18 = mutableInterval3.isAfterNow();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = mutableInterval3.toPeriod(periodType19);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    @Ignore
  public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        boolean boolean8 = mutableInterval3.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        java.lang.Object obj14 = mutableInterval12.clone();
        mutableInterval12.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology17 = mutableInterval12.getChronology();
        mutableInterval3.setChronology(chronology17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval(readableInstant19, readablePeriod20);
        mutableInterval21.setDurationBeforeEnd(1L);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval(0L, 1L, chronology26);
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        java.lang.Object obj29 = mutableInterval27.clone();
        mutableInterval27.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology32 = mutableInterval27.getChronology();
        mutableInterval21.setChronology(chronology32);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval3, chronology32);
        java.lang.Class<?> wildcardClass35 = mutableInterval3.getClass();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    @Ignore
  public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        mutableInterval3.setStartMillis((long) 1);
        org.joda.time.Period period8 = mutableInterval3.toPeriod();
        org.joda.time.Chronology chronology9 = mutableInterval3.getChronology();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Duration duration5 = mutableInterval3.toDuration();
        org.joda.time.Duration duration6 = mutableInterval3.toDuration();
        long long7 = mutableInterval3.getStartMillis();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    @Ignore
  public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(obj5, chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableInterval7.setPeriodAfterStart(readablePeriod8);
        org.joda.time.Period period10 = mutableInterval7.toPeriod();
        org.joda.time.MutableInterval mutableInterval11 = mutableInterval7.copy();
        long long12 = mutableInterval11.toDurationMillis();
        org.joda.time.Chronology chronology13 = mutableInterval11.getChronology();
        mutableInterval11.setDurationBeforeEnd(1606267450287L);
        java.lang.Object obj16 = mutableInterval11.clone();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(mutableInterval11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "1919-02-06T22:35:49.713Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "1919-02-06T22:35:49.713Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "1919-02-06T22:35:49.713Z/1970-01-01T00:00:00.000Z");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval(0L, 1L, chronology8);
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        mutableInterval9.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval(0L, 1L, chronology15);
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        mutableInterval16.setDurationAfterStart((long) (byte) 1);
        boolean boolean21 = mutableInterval16.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology22 = mutableInterval16.getChronology();
        mutableInterval9.setChronology(chronology22);
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (-1), (long) '4', chronology22);
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(1606267335463L, 1606267344145L, chronology22);
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval(0L, 1L, chronology22);
        org.joda.time.Period period27 = mutableInterval26.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((java.lang.Object) period27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(period27);
    }

    @Test
    @Ignore
  public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        boolean boolean8 = mutableInterval3.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology9 = mutableInterval3.getChronology();
        mutableInterval3.setStartMillis((long) (byte) 0);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval(0L, 1L, chronology14);
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        java.lang.Object obj17 = mutableInterval15.clone();
        org.joda.time.Interval interval18 = mutableInterval15.toInterval();
        org.joda.time.ReadableInterval readableInterval19 = null;
        boolean boolean20 = mutableInterval15.isBefore(readableInterval19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology23);
        boolean boolean25 = mutableInterval15.isAfter((org.joda.time.ReadableInterval) mutableInterval24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(0L, 1L, chronology28);
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        mutableInterval29.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval(0L, 1L, chronology35);
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        long long38 = interval37.getEndMillis();
        boolean boolean40 = interval37.isAfter((long) (byte) 100);
        boolean boolean41 = mutableInterval29.overlaps((org.joda.time.ReadableInterval) interval37);
        mutableInterval24.setInterval((org.joda.time.ReadableInterval) interval37);
        mutableInterval24.setDurationAfterStart((long) 1);
        org.joda.time.MutableInterval mutableInterval45 = mutableInterval24.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval46 = mutableInterval45.toMutableInterval();
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(readableInstant47, readablePeriod48);
        mutableInterval49.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval52 = mutableInterval49.toMutableInterval();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval(0L, 1L, chronology55);
        long long57 = mutableInterval56.toDurationMillis();
        mutableInterval49.setInterval((org.joda.time.ReadableInterval) mutableInterval56);
        org.joda.time.Duration duration59 = mutableInterval56.toDuration();
        mutableInterval45.setDurationAfterStart((org.joda.time.ReadableDuration) duration59);
        mutableInterval3.setDurationAfterStart((org.joda.time.ReadableDuration) duration59);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(mutableInterval45);
        org.junit.Assert.assertNotNull(mutableInterval46);
        org.junit.Assert.assertNotNull(mutableInterval52);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertNotNull(duration59);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(readableDuration5, readableInstant6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableInterval11.setPeriodBeforeEnd(readablePeriod12);
        mutableInterval7.setInterval((org.joda.time.ReadableInterval) mutableInterval11);
        mutableInterval7.setDurationAfterStart(1606267313258L);
        boolean boolean17 = interval4.contains((org.joda.time.ReadableInterval) mutableInterval7);
        org.joda.time.DateTime dateTime18 = mutableInterval7.getStart();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval(0L, 1L, chronology21);
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        mutableInterval22.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(0L, 1L, chronology28);
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        long long31 = interval30.getEndMillis();
        boolean boolean33 = interval30.isAfter((long) (byte) 100);
        boolean boolean34 = mutableInterval22.overlaps((org.joda.time.ReadableInterval) interval30);
        org.joda.time.Duration duration35 = mutableInterval22.toDuration();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval(0L, 1L, chronology38);
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        mutableInterval39.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval(0L, 1L, chronology45);
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        long long48 = interval47.getEndMillis();
        boolean boolean50 = interval47.isAfter((long) (byte) 100);
        boolean boolean51 = mutableInterval39.overlaps((org.joda.time.ReadableInterval) interval47);
        org.joda.time.Duration duration52 = mutableInterval39.toDuration();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval(0L, 1L, chronology55);
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        org.joda.time.DateTime dateTime58 = mutableInterval56.getStart();
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval(readableInstant59, readablePeriod60);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval(0L, 1L, chronology64);
        org.joda.time.Interval interval66 = mutableInterval65.toInterval();
        org.joda.time.DateTime dateTime67 = mutableInterval65.getStart();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval(0L, 1L, chronology70);
        org.joda.time.Interval interval72 = mutableInterval71.toInterval();
        org.joda.time.DateTime dateTime73 = mutableInterval71.getStart();
        mutableInterval61.setInterval((org.joda.time.ReadableInstant) dateTime67, (org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.MutableInterval mutableInterval76 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration52, (org.joda.time.ReadableInstant) dateTime73);
        mutableInterval22.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration52);
        org.joda.time.MutableInterval mutableInterval78 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableDuration) duration52);
        boolean boolean79 = mutableInterval78.containsNow();
        org.joda.time.MutableInterval mutableInterval80 = mutableInterval78.copy();
        mutableInterval78.setStartMillis((long) (short) 0);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(mutableInterval80);
    }

    @Test
    @Ignore
  public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        mutableInterval2.setDurationBeforeEnd(1L);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(0L, 1L, chronology7);
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        java.lang.Object obj10 = mutableInterval8.clone();
        mutableInterval8.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology13 = mutableInterval8.getChronology();
        mutableInterval2.setChronology(chronology13);
        boolean boolean16 = mutableInterval2.contains(0L);
        org.joda.time.DateTime dateTime17 = mutableInterval2.getEnd();
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    @Ignore
  public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        mutableInterval3.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology8 = mutableInterval3.getChronology();
        org.joda.time.MutableInterval mutableInterval9 = mutableInterval3.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval10 = mutableInterval3.copy();
        org.joda.time.Duration duration11 = mutableInterval3.toDuration();
        org.joda.time.DateTime dateTime12 = mutableInterval3.getStart();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval(0L, 1L, chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableInterval16.setPeriodAfterStart(readablePeriod17);
        org.joda.time.MutableInterval mutableInterval19 = mutableInterval16.toMutableInterval();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval(0L, 1L, chronology22);
        long long24 = mutableInterval23.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval25 = mutableInterval23.copy();
        org.joda.time.Period period26 = mutableInterval23.toPeriod();
        mutableInterval16.setPeriodAfterStart((org.joda.time.ReadablePeriod) period26);
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadablePeriod) period26);
        java.lang.String str29 = mutableInterval28.toString();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = mutableInterval28.toPeriod(periodType30);
        org.joda.time.DateTime dateTime32 = mutableInterval28.getStart();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(mutableInterval9);
        org.junit.Assert.assertNotNull(mutableInterval10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableInterval19);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(mutableInterval25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.000Z" + "'", str29, "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    @Ignore
  public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        boolean boolean8 = mutableInterval3.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        java.lang.Object obj14 = mutableInterval12.clone();
        mutableInterval12.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology17 = mutableInterval12.getChronology();
        mutableInterval3.setChronology(chronology17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval(readableInstant19, readablePeriod20);
        mutableInterval21.setDurationBeforeEnd(1L);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval(0L, 1L, chronology26);
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        java.lang.Object obj29 = mutableInterval27.clone();
        mutableInterval27.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology32 = mutableInterval27.getChronology();
        mutableInterval21.setChronology(chronology32);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval3, chronology32);
        boolean boolean35 = mutableInterval34.isAfterNow();
        mutableInterval34.setInterval((long) (byte) 0, (long) '4');
        org.joda.time.MutableInterval mutableInterval39 = mutableInterval34.copy();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(mutableInterval39);
    }

    @Test
    @Ignore
  public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        long long3 = mutableInterval2.getEndMillis();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval(readableInstant4, readablePeriod5);
        mutableInterval6.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval9 = mutableInterval6.toMutableInterval();
        org.joda.time.DateTime dateTime10 = mutableInterval9.getEnd();
        boolean boolean11 = mutableInterval2.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval(readableDuration12, readableInstant13);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableInterval18.setPeriodBeforeEnd(readablePeriod19);
        mutableInterval14.setInterval((org.joda.time.ReadableInterval) mutableInterval18);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(0L, 1L, chronology24);
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        java.lang.Object obj27 = mutableInterval25.clone();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(obj27, chronology28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableInterval29.setPeriodAfterStart(readablePeriod30);
        org.joda.time.Period period32 = mutableInterval29.toPeriod();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval(readableInstant35, readablePeriod36);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval(0L, 1L, chronology40);
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.DateTime dateTime43 = mutableInterval41.getStart();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval(0L, 1L, chronology46);
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.DateTime dateTime49 = mutableInterval47.getStart();
        mutableInterval37.setInterval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval(readablePeriod34, (org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval(readablePeriod33, (org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval(readableInstant53, readablePeriod54);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval(0L, 1L, chronology58);
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.DateTime dateTime61 = mutableInterval59.getStart();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval(0L, 1L, chronology64);
        org.joda.time.Interval interval66 = mutableInterval65.toInterval();
        org.joda.time.DateTime dateTime67 = mutableInterval65.getStart();
        mutableInterval55.setInterval((org.joda.time.ReadableInstant) dateTime61, (org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period32, (org.joda.time.ReadableInstant) dateTime61);
        mutableInterval14.setPeriodAfterStart((org.joda.time.ReadablePeriod) period32);
        mutableInterval2.setPeriodAfterStart((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutableInterval mutableInterval76 = new org.joda.time.MutableInterval(0L, 1L, chronology75);
        org.joda.time.Interval interval77 = mutableInterval76.toInterval();
        org.joda.time.DateTime dateTime78 = mutableInterval76.getStart();
        org.joda.time.MutableInterval mutableInterval79 = mutableInterval76.toMutableInterval();
        mutableInterval2.setInterval((org.joda.time.ReadableInterval) mutableInterval76);
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval76);
        boolean boolean83 = mutableInterval76.isBefore(1606267386236L);
        org.joda.time.MutableInterval mutableInterval84 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval76);
        boolean boolean85 = mutableInterval76.containsNow();
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1606267580511L + "'", long3 == 1606267580511L);
        org.junit.Assert.assertNotNull(mutableInterval9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(mutableInterval79);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval(readableInstant2, readablePeriod3);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(0L, 1L, chronology7);
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.DateTime dateTime10 = mutableInterval8.getStart();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval(0L, 1L, chronology13);
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.DateTime dateTime16 = mutableInterval14.getStart();
        mutableInterval4.setInterval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(readablePeriod1, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval(readablePeriod0, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableInterval23.setPeriodBeforeEnd(readablePeriod24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval(readableInstant26, readablePeriod27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval(0L, 1L, chronology31);
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.DateTime dateTime34 = mutableInterval32.getStart();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval(0L, 1L, chronology37);
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.DateTime dateTime40 = mutableInterval38.getStart();
        mutableInterval28.setInterval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) dateTime40);
        boolean boolean42 = mutableInterval23.isAfter((org.joda.time.ReadableInstant) dateTime40);
        long long43 = mutableInterval23.getStartMillis();
        long long44 = mutableInterval23.toDurationMillis();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval(0L, 1L, chronology47);
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        boolean boolean51 = mutableInterval48.contains((long) ' ');
        org.joda.time.MutableInterval mutableInterval52 = mutableInterval48.copy();
        org.joda.time.Duration duration53 = mutableInterval48.toDuration();
        mutableInterval23.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration53);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval(readableInstant55, readablePeriod56);
        mutableInterval57.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval60 = mutableInterval57.toMutableInterval();
        org.joda.time.DateTime dateTime61 = mutableInterval60.getEnd();
        org.joda.time.MutableInterval mutableInterval62 = mutableInterval60.toMutableInterval();
        org.joda.time.DateTime dateTime63 = mutableInterval62.getStart();
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration53, (org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration53);
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval(10L, (long) (short) 100);
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval(readableDuration69, readableInstant70);
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.Period period73 = mutableInterval71.toPeriod(periodType72);
        mutableInterval68.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period73);
        boolean boolean75 = mutableInterval68.isAfterNow();
        boolean boolean77 = mutableInterval68.isBefore(1606267311991L);
        org.joda.time.DateTime dateTime78 = mutableInterval68.getEnd();
        org.joda.time.MutableInterval mutableInterval79 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration53, (org.joda.time.ReadableInstant) dateTime78);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L + "'", long43 == 100L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(mutableInterval52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(mutableInterval60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(mutableInterval62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(dateTime78);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("2020-11-25T01:24:12.280Z/2020-11-25T01:24:12.281Z");
        org.joda.time.DateTime dateTime2 = mutableInterval1.getEnd();
        org.junit.Assert.assertNotNull(mutableInterval1);
        org.junit.Assert.assertNotNull(dateTime2);
    }

    @Test
    @Ignore
  public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(obj5, chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableInterval7.setPeriodBeforeEnd(readablePeriod8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(0L, 1L, chronology12);
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        mutableInterval13.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        long long22 = interval21.getEndMillis();
        boolean boolean24 = interval21.isAfter((long) (byte) 100);
        boolean boolean25 = mutableInterval13.overlaps((org.joda.time.ReadableInterval) interval21);
        org.joda.time.Duration duration26 = mutableInterval13.toDuration();
        boolean boolean27 = mutableInterval7.isBefore((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.MutableInterval mutableInterval28 = mutableInterval13.toMutableInterval();
        java.lang.String str29 = mutableInterval28.toString();
        boolean boolean30 = mutableInterval28.isAfterNow();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(mutableInterval28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z" + "'", str29, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    @Ignore
  public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(0L, (long) 0);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval(0L, 1L, chronology5);
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        java.lang.Object obj8 = mutableInterval6.clone();
        mutableInterval6.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology11 = mutableInterval6.getChronology();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = mutableInterval6.toPeriod(periodType12);
        org.joda.time.Interval interval14 = mutableInterval6.toInterval();
        boolean boolean15 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval6);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval(0L, 1L, chronology18);
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        java.lang.Object obj21 = mutableInterval19.clone();
        mutableInterval19.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology24 = mutableInterval19.getChronology();
        org.joda.time.MutableInterval mutableInterval25 = mutableInterval19.toMutableInterval();
        boolean boolean26 = mutableInterval19.containsNow();
        org.joda.time.Duration duration27 = mutableInterval19.toDuration();
        mutableInterval6.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration27);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(mutableInterval25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(duration27);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        boolean boolean8 = mutableInterval3.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology9 = mutableInterval3.getChronology();
        long long10 = mutableInterval3.getStartMillis();
        org.joda.time.Duration duration11 = mutableInterval3.toDuration();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = mutableInterval3.toPeriod(periodType12);
        java.lang.Class<?> wildcardClass14 = period13.getClass();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    @Ignore
  public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(readableInstant6, readablePeriod7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.DateTime dateTime14 = mutableInterval12.getStart();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, 1L, chronology17);
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.DateTime dateTime20 = mutableInterval18.getStart();
        mutableInterval8.setInterval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval(readablePeriod5, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval(readablePeriod4, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval(readableInstant24, readablePeriod25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval(0L, 1L, chronology29);
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.DateTime dateTime32 = mutableInterval30.getStart();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval(0L, 1L, chronology35);
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.DateTime dateTime38 = mutableInterval36.getStart();
        mutableInterval26.setInterval((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime41 = mutableInterval40.getStart();
        mutableInterval40.setInterval((long) (byte) 1, (long) (short) 1);
        boolean boolean45 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) mutableInterval40);
        boolean boolean46 = mutableInterval40.isAfterNow();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval(0L, 1L, chronology49);
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        java.lang.Object obj52 = mutableInterval50.clone();
        org.joda.time.Interval interval53 = mutableInterval50.toInterval();
        org.joda.time.ReadableInterval readableInterval54 = null;
        boolean boolean55 = mutableInterval50.isBefore(readableInterval54);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology58);
        boolean boolean60 = mutableInterval50.isAfter((org.joda.time.ReadableInterval) mutableInterval59);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval(0L, 1L, chronology63);
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        mutableInterval64.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval(0L, 1L, chronology70);
        org.joda.time.Interval interval72 = mutableInterval71.toInterval();
        long long73 = interval72.getEndMillis();
        boolean boolean75 = interval72.isAfter((long) (byte) 100);
        boolean boolean76 = mutableInterval64.overlaps((org.joda.time.ReadableInterval) interval72);
        mutableInterval59.setInterval((org.joda.time.ReadableInterval) interval72);
        mutableInterval59.setDurationAfterStart((long) 1);
        org.joda.time.MutableInterval mutableInterval80 = mutableInterval59.toMutableInterval();
        org.joda.time.Chronology chronology81 = mutableInterval80.getChronology();
        org.joda.time.Period period82 = mutableInterval80.toPeriod();
        mutableInterval40.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period82);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1L + "'", long73 == 1L);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(mutableInterval80);
        org.junit.Assert.assertNotNull(chronology81);
        org.junit.Assert.assertNotNull(period82);
    }

    @Test
    @Ignore
  public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval(0L, 1L, chronology4);
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        java.lang.Object obj7 = mutableInterval5.clone();
        mutableInterval5.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology10 = mutableInterval5.getChronology();
        org.joda.time.MutableInterval mutableInterval11 = mutableInterval5.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval12 = mutableInterval5.copy();
        org.joda.time.Duration duration13 = mutableInterval5.toDuration();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(readableInstant16, readablePeriod17);
        mutableInterval18.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval21 = mutableInterval18.toMutableInterval();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(0L, 1L, chronology24);
        long long26 = mutableInterval25.toDurationMillis();
        mutableInterval18.setInterval((org.joda.time.ReadableInterval) mutableInterval25);
        mutableInterval18.setDurationAfterStart(100L);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval(0L, 1L, chronology36);
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        mutableInterval37.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(0L, 1L, chronology43);
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        mutableInterval44.setDurationAfterStart((long) (byte) 1);
        boolean boolean49 = mutableInterval44.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology50 = mutableInterval44.getChronology();
        mutableInterval37.setChronology(chronology50);
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (-1), (long) '4', chronology50);
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) 1, (long) 100, chronology50);
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval18, chronology50);
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((long) (short) 1, (long) ' ', chronology50);
        mutableInterval5.setChronology(chronology50);
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) ' ', (long) (short) 100, chronology50);
        org.joda.time.Chronology chronology58 = mutableInterval57.getChronology();
        boolean boolean60 = mutableInterval57.isBefore(1606267425946L);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval(0L, 1L, chronology63);
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        java.lang.Object obj66 = mutableInterval64.clone();
        org.joda.time.Interval interval67 = mutableInterval64.toInterval();
        org.joda.time.ReadableInterval readableInterval68 = null;
        boolean boolean69 = mutableInterval64.isBefore(readableInterval68);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology72);
        boolean boolean74 = mutableInterval64.isAfter((org.joda.time.ReadableInterval) mutableInterval73);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.MutableInterval mutableInterval78 = new org.joda.time.MutableInterval(0L, 1L, chronology77);
        org.joda.time.Interval interval79 = mutableInterval78.toInterval();
        mutableInterval78.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.MutableInterval mutableInterval85 = new org.joda.time.MutableInterval(0L, 1L, chronology84);
        org.joda.time.Interval interval86 = mutableInterval85.toInterval();
        long long87 = interval86.getEndMillis();
        boolean boolean89 = interval86.isAfter((long) (byte) 100);
        boolean boolean90 = mutableInterval78.overlaps((org.joda.time.ReadableInterval) interval86);
        mutableInterval73.setInterval((org.joda.time.ReadableInterval) interval86);
        mutableInterval73.setDurationAfterStart((long) 1);
        org.joda.time.DateTime dateTime94 = mutableInterval73.getEnd();
        boolean boolean95 = mutableInterval57.contains((org.joda.time.ReadableInstant) dateTime94);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(mutableInterval11);
        org.junit.Assert.assertNotNull(mutableInterval12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(mutableInterval21);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertEquals(obj66.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj66), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj66), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(interval79);
        org.junit.Assert.assertNotNull(interval86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 1L + "'", long87 == 1L);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    @Ignore
  public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        boolean boolean8 = mutableInterval3.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        java.lang.Object obj14 = mutableInterval12.clone();
        mutableInterval12.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology17 = mutableInterval12.getChronology();
        mutableInterval3.setChronology(chronology17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval(readableInstant19, readablePeriod20);
        mutableInterval21.setDurationBeforeEnd(1L);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval(0L, 1L, chronology26);
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        java.lang.Object obj29 = mutableInterval27.clone();
        mutableInterval27.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology32 = mutableInterval27.getChronology();
        mutableInterval21.setChronology(chronology32);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval3, chronology32);
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.ReadableInstant readableInstant36 = null;
        boolean boolean37 = interval35.contains(readableInstant36);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.DateTime dateTime5 = mutableInterval3.getStart();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(readableInstant6, readablePeriod7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.DateTime dateTime14 = mutableInterval12.getStart();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, 1L, chronology17);
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.DateTime dateTime20 = mutableInterval18.getStart();
        mutableInterval8.setInterval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(readableInstant23, readablePeriod24);
        mutableInterval25.setDurationBeforeEnd(1L);
        boolean boolean28 = mutableInterval22.contains((org.joda.time.ReadableInterval) mutableInterval25);
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval25);
        boolean boolean30 = mutableInterval29.isBeforeNow();
        boolean boolean31 = mutableInterval29.isAfterNow();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    @Ignore
  public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        boolean boolean8 = mutableInterval3.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology9 = mutableInterval3.getChronology();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(0L, 1L, chronology12);
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        java.lang.Object obj15 = mutableInterval13.clone();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval(obj15, chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableInterval17.setPeriodAfterStart(readablePeriod18);
        org.joda.time.Period period20 = mutableInterval17.toPeriod();
        mutableInterval3.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(0L, 1L, chronology24);
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        java.lang.Object obj27 = mutableInterval25.clone();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(obj27, chronology28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableInterval29.setPeriodBeforeEnd(readablePeriod30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval(readableInstant32, readablePeriod33);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval(0L, 1L, chronology37);
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.DateTime dateTime40 = mutableInterval38.getStart();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(0L, 1L, chronology43);
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.DateTime dateTime46 = mutableInterval44.getStart();
        mutableInterval34.setInterval((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval(0L, 1L, chronology50);
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        java.lang.Object obj53 = mutableInterval51.clone();
        org.joda.time.Interval interval54 = mutableInterval51.toInterval();
        org.joda.time.ReadableInterval readableInterval55 = null;
        boolean boolean56 = mutableInterval51.isBefore(readableInterval55);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology59);
        boolean boolean61 = mutableInterval51.isAfter((org.joda.time.ReadableInterval) mutableInterval60);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval(0L, 1L, chronology64);
        org.joda.time.Interval interval66 = mutableInterval65.toInterval();
        org.joda.time.DateTime dateTime67 = mutableInterval65.getStart();
        boolean boolean68 = mutableInterval51.isBefore((org.joda.time.ReadableInstant) dateTime67);
        mutableInterval29.setInterval((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime67);
        boolean boolean70 = mutableInterval3.isAfter((org.joda.time.ReadableInstant) dateTime40);
        mutableInterval3.setDurationAfterStart(1606267442859L);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    @Ignore
  public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(obj5, chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableInterval7.setPeriodAfterStart(readablePeriod8);
        org.joda.time.Period period10 = mutableInterval7.toPeriod();
        org.joda.time.MutableInterval mutableInterval11 = mutableInterval7.copy();
        long long12 = mutableInterval11.toDurationMillis();
        org.joda.time.Chronology chronology13 = mutableInterval11.getChronology();
        org.joda.time.Interval interval14 = mutableInterval11.toInterval();
        org.joda.time.MutableInterval mutableInterval15 = mutableInterval11.toMutableInterval();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(mutableInterval11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(mutableInterval15);
    }

    @Test
    @Ignore
  public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        long long3 = mutableInterval2.getEndMillis();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval(readableInstant4, readablePeriod5);
        mutableInterval6.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval9 = mutableInterval6.toMutableInterval();
        org.joda.time.DateTime dateTime10 = mutableInterval9.getEnd();
        boolean boolean11 = mutableInterval2.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval(readableDuration12, readableInstant13);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableInterval18.setPeriodBeforeEnd(readablePeriod19);
        mutableInterval14.setInterval((org.joda.time.ReadableInterval) mutableInterval18);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(0L, 1L, chronology24);
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        java.lang.Object obj27 = mutableInterval25.clone();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(obj27, chronology28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableInterval29.setPeriodAfterStart(readablePeriod30);
        org.joda.time.Period period32 = mutableInterval29.toPeriod();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval(readableInstant35, readablePeriod36);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval(0L, 1L, chronology40);
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.DateTime dateTime43 = mutableInterval41.getStart();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval(0L, 1L, chronology46);
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.DateTime dateTime49 = mutableInterval47.getStart();
        mutableInterval37.setInterval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval(readablePeriod34, (org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval(readablePeriod33, (org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval(readableInstant53, readablePeriod54);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval(0L, 1L, chronology58);
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.DateTime dateTime61 = mutableInterval59.getStart();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval(0L, 1L, chronology64);
        org.joda.time.Interval interval66 = mutableInterval65.toInterval();
        org.joda.time.DateTime dateTime67 = mutableInterval65.getStart();
        mutableInterval55.setInterval((org.joda.time.ReadableInstant) dateTime61, (org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period32, (org.joda.time.ReadableInstant) dateTime61);
        mutableInterval14.setPeriodAfterStart((org.joda.time.ReadablePeriod) period32);
        mutableInterval2.setPeriodAfterStart((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutableInterval mutableInterval76 = new org.joda.time.MutableInterval(0L, 1L, chronology75);
        org.joda.time.Interval interval77 = mutableInterval76.toInterval();
        org.joda.time.DateTime dateTime78 = mutableInterval76.getStart();
        org.joda.time.MutableInterval mutableInterval79 = mutableInterval76.toMutableInterval();
        mutableInterval2.setInterval((org.joda.time.ReadableInterval) mutableInterval76);
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval76);
        boolean boolean83 = mutableInterval76.isBefore(1606267386236L);
        org.joda.time.MutableInterval mutableInterval84 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval76);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval84.setInterval(1606267502661L, 1606267338607L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1606267582335L + "'", long3 == 1606267582335L);
        org.junit.Assert.assertNotNull(mutableInterval9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(mutableInterval79);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(1606267463712L, 1606267573851L);
    }

    @Test
    @Ignore
  public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        mutableInterval2.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval5 = mutableInterval2.toMutableInterval();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval(0L, 1L, chronology8);
        long long10 = mutableInterval9.toDurationMillis();
        mutableInterval2.setInterval((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Duration duration12 = mutableInterval9.toDuration();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval(0L, 1L, chronology15);
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        java.lang.Object obj18 = mutableInterval16.clone();
        org.joda.time.Interval interval19 = mutableInterval16.toInterval();
        org.joda.time.ReadableInterval readableInterval20 = null;
        boolean boolean21 = mutableInterval16.isBefore(readableInterval20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology24);
        boolean boolean26 = mutableInterval16.isAfter((org.joda.time.ReadableInterval) mutableInterval25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval(0L, 1L, chronology29);
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.DateTime dateTime32 = mutableInterval30.getStart();
        boolean boolean33 = mutableInterval16.isBefore((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration12, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval34);
        long long36 = mutableInterval35.toDurationMillis();
        org.joda.time.Interval interval37 = mutableInterval35.toInterval();
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertNotNull(interval37);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("2020-11-25T01:21:53.258Z/2020-11-25T01:23:12.528Z");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval(0L, 1L, chronology4);
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        mutableInterval5.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        long long14 = interval13.getEndMillis();
        boolean boolean16 = interval13.isAfter((long) (byte) 100);
        boolean boolean17 = mutableInterval5.overlaps((org.joda.time.ReadableInterval) interval13);
        org.joda.time.Duration duration18 = mutableInterval5.toDuration();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval(readableInstant19, readablePeriod20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(0L, 1L, chronology24);
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.DateTime dateTime27 = mutableInterval25.getStart();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval(0L, 1L, chronology30);
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.DateTime dateTime33 = mutableInterval31.getStart();
        mutableInterval21.setInterval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration18, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval(readableInstant38, readablePeriod39);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(0L, 1L, chronology43);
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.DateTime dateTime46 = mutableInterval44.getStart();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval(0L, 1L, chronology49);
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.DateTime dateTime52 = mutableInterval50.getStart();
        mutableInterval40.setInterval((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval(readablePeriod37, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval(readablePeriod36, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval(readableInstant56, readablePeriod57);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval(0L, 1L, chronology61);
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.DateTime dateTime64 = mutableInterval62.getStart();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval(0L, 1L, chronology67);
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        org.joda.time.DateTime dateTime70 = mutableInterval68.getStart();
        mutableInterval58.setInterval((org.joda.time.ReadableInstant) dateTime64, (org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime64);
        boolean boolean73 = mutableInterval35.contains((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = mutableInterval35.toPeriod(periodType74);
        org.joda.time.MutableInterval mutableInterval76 = mutableInterval35.toMutableInterval();
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.Period period78 = mutableInterval35.toPeriod(periodType77);
        mutableInterval1.setPeriodAfterStart((org.joda.time.ReadablePeriod) period78);
        org.junit.Assert.assertNotNull(mutableInterval1);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(mutableInterval76);
        org.junit.Assert.assertNotNull(period78);
    }

    @Test
    @Ignore
  public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Interval interval6 = mutableInterval3.toInterval();
        org.joda.time.ReadableInterval readableInterval7 = null;
        boolean boolean8 = mutableInterval3.isBefore(readableInterval7);
        long long9 = mutableInterval3.toDurationMillis();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(readableInstant10, readablePeriod11);
        mutableInterval12.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval15 = mutableInterval12.toMutableInterval();
        org.joda.time.Period period16 = mutableInterval12.toPeriod();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval(readableInstant19, readablePeriod20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(0L, 1L, chronology24);
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.DateTime dateTime27 = mutableInterval25.getStart();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval(0L, 1L, chronology30);
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.DateTime dateTime33 = mutableInterval31.getStart();
        mutableInterval21.setInterval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(readablePeriod18, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval(readablePeriod17, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval(readableInstant37, readablePeriod38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval(0L, 1L, chronology42);
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.DateTime dateTime45 = mutableInterval43.getStart();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(0L, 1L, chronology48);
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.DateTime dateTime51 = mutableInterval49.getStart();
        mutableInterval39.setInterval((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime45);
        boolean boolean54 = mutableInterval12.isAfter((org.joda.time.ReadableInstant) dateTime45);
        boolean boolean55 = mutableInterval3.contains((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Duration duration56 = mutableInterval3.toDuration();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(mutableInterval15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(duration56);
    }

    @Test
    @Ignore
  public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        mutableInterval10.setDurationAfterStart((long) (byte) 1);
        boolean boolean15 = mutableInterval10.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology16 = mutableInterval10.getChronology();
        mutableInterval3.setChronology(chronology16);
        mutableInterval3.setEndMillis((long) '#');
        org.joda.time.Duration duration20 = mutableInterval3.toDuration();
        org.joda.time.Duration duration21 = mutableInterval3.toDuration();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(0L, 1L, chronology24);
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        java.lang.Object obj27 = mutableInterval25.clone();
        org.joda.time.Interval interval28 = mutableInterval25.toInterval();
        boolean boolean30 = interval28.contains(1606267356510L);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval(0L, 1L, chronology33);
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.DateTime dateTime36 = mutableInterval34.getStart();
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval(readableInstant37, readablePeriod38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval(0L, 1L, chronology42);
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.DateTime dateTime45 = mutableInterval43.getStart();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(0L, 1L, chronology48);
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.DateTime dateTime51 = mutableInterval49.getStart();
        mutableInterval39.setInterval((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime dateTime54 = mutableInterval53.getStart();
        org.joda.time.DateTime dateTime55 = mutableInterval53.getEnd();
        boolean boolean56 = interval28.contains((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration21, (org.joda.time.ReadableInstant) dateTime55);
        boolean boolean59 = mutableInterval57.isBefore(1606267428069L);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    @Ignore
  public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableInterval3.setPeriodBeforeEnd(readablePeriod4);
        mutableInterval3.setStartMillis((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(readableInstant8, readablePeriod9);
        long long11 = mutableInterval10.getEndMillis();
        boolean boolean12 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) mutableInterval10);
        boolean boolean13 = mutableInterval10.isAfterNow();
        mutableInterval10.setStartMillis(1606267468587L);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval(0L, 1L, chronology18);
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        java.lang.Object obj21 = mutableInterval19.clone();
        org.joda.time.Interval interval22 = mutableInterval19.toInterval();
        org.joda.time.ReadableInterval readableInterval23 = null;
        boolean boolean24 = mutableInterval19.isBefore(readableInterval23);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology27);
        boolean boolean29 = mutableInterval19.isAfter((org.joda.time.ReadableInterval) mutableInterval28);
        boolean boolean30 = mutableInterval10.contains((org.joda.time.ReadableInterval) mutableInterval28);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1606267583058L + "'", long11 == 1606267583058L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/2020-11-25T01:26:03.512Z");
        org.junit.Assert.assertNotNull(mutableInterval1);
    }

    @Test
    @Ignore
  public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        mutableInterval10.setDurationAfterStart((long) (byte) 1);
        boolean boolean15 = mutableInterval10.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology16 = mutableInterval10.getChronology();
        mutableInterval3.setChronology(chronology16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval(0L, 1L, chronology20);
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        java.lang.Object obj23 = mutableInterval21.clone();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(obj23, chronology24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableInterval25.setPeriodAfterStart(readablePeriod26);
        org.joda.time.Period period28 = mutableInterval25.toPeriod();
        org.joda.time.MutableInterval mutableInterval29 = mutableInterval25.copy();
        boolean boolean30 = mutableInterval3.isAfter((org.joda.time.ReadableInterval) mutableInterval25);
        mutableInterval3.setEndMillis(1606267428315L);
        long long33 = mutableInterval3.getEndMillis();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1606267428315L + "'", long33 == 1606267428315L);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        mutableInterval10.setDurationAfterStart((long) (byte) 1);
        boolean boolean15 = mutableInterval10.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology16 = mutableInterval10.getChronology();
        mutableInterval3.setChronology(chronology16);
        mutableInterval3.setEndMillis((long) '#');
        org.joda.time.Duration duration20 = mutableInterval3.toDuration();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval(0L, 1L, chronology23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(readableInstant27, readablePeriod28);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval(0L, 1L, chronology32);
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.DateTime dateTime35 = mutableInterval33.getStart();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval(0L, 1L, chronology38);
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.DateTime dateTime41 = mutableInterval39.getStart();
        mutableInterval29.setInterval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval(readablePeriod26, (org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(readablePeriod25, (org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval(readableInstant45, readablePeriod46);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval(0L, 1L, chronology50);
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.DateTime dateTime53 = mutableInterval51.getStart();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval(0L, 1L, chronology56);
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.DateTime dateTime59 = mutableInterval57.getStart();
        mutableInterval47.setInterval((org.joda.time.ReadableInstant) dateTime53, (org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime62 = mutableInterval61.getStart();
        mutableInterval61.setInterval((long) (byte) 1, (long) (short) 1);
        boolean boolean66 = mutableInterval24.overlaps((org.joda.time.ReadableInterval) mutableInterval61);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval(0L, 1L, chronology70);
        org.joda.time.Interval interval72 = mutableInterval71.toInterval();
        org.joda.time.DateTime dateTime73 = mutableInterval71.getStart();
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval(readablePeriod67, (org.joda.time.ReadableInstant) dateTime73);
        mutableInterval61.setStart((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.MutableInterval mutableInterval76 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration20, (org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.Period period77 = mutableInterval76.toPeriod();
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval(0L, 1L, chronology80);
        org.joda.time.Interval interval82 = mutableInterval81.toInterval();
        boolean boolean84 = mutableInterval81.contains((long) ' ');
        org.joda.time.MutableInterval mutableInterval85 = mutableInterval81.copy();
        org.joda.time.MutableInterval mutableInterval88 = new org.joda.time.MutableInterval(10L, (long) (short) 100);
        org.joda.time.ReadableDuration readableDuration89 = null;
        org.joda.time.ReadableInstant readableInstant90 = null;
        org.joda.time.MutableInterval mutableInterval91 = new org.joda.time.MutableInterval(readableDuration89, readableInstant90);
        org.joda.time.PeriodType periodType92 = null;
        org.joda.time.Period period93 = mutableInterval91.toPeriod(periodType92);
        mutableInterval88.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period93);
        mutableInterval85.setPeriodAfterStart((org.joda.time.ReadablePeriod) period93);
        boolean boolean96 = mutableInterval76.isBefore((org.joda.time.ReadableInterval) mutableInterval85);
        org.joda.time.Interval interval97 = mutableInterval85.toInterval();
        org.joda.time.DateTime dateTime98 = interval97.getStart();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(interval82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(mutableInterval85);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(interval97);
        org.junit.Assert.assertNotNull(dateTime98);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        mutableInterval2.setDurationBeforeEnd(1L);
        boolean boolean5 = mutableInterval2.isAfterNow();
        mutableInterval2.setStartMillis(0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    @Ignore
  public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        java.lang.Object obj6 = mutableInterval3.clone();
        org.joda.time.MutableInterval mutableInterval7 = mutableInterval3.copy();
        org.joda.time.Chronology chronology8 = mutableInterval7.getChronology();
        mutableInterval7.setInterval(1606267313258L, 1606267392528L);
        org.joda.time.MutableInterval mutableInterval12 = mutableInterval7.toMutableInterval();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval(0L, 1L, chronology15);
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        mutableInterval16.setDurationAfterStart((long) (byte) 1);
        boolean boolean20 = mutableInterval16.isAfterNow();
        long long21 = mutableInterval16.getStartMillis();
        mutableInterval16.setEndMillis(1606267300626L);
        boolean boolean24 = mutableInterval12.overlaps((org.joda.time.ReadableInterval) mutableInterval16);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval(0L, 1L, chronology27);
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        java.lang.Object obj30 = mutableInterval28.clone();
        mutableInterval28.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology33 = mutableInterval28.getChronology();
        org.joda.time.MutableInterval mutableInterval34 = mutableInterval28.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval35 = mutableInterval28.copy();
        org.joda.time.Duration duration36 = mutableInterval28.toDuration();
        org.joda.time.DateTime dateTime37 = mutableInterval28.getStart();
        mutableInterval12.setStart((org.joda.time.ReadableInstant) dateTime37);
        mutableInterval12.setDurationAfterStart(1606267389736L);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(mutableInterval12);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(mutableInterval34);
        org.junit.Assert.assertNotNull(mutableInterval35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    @Ignore
  public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        mutableInterval10.setDurationAfterStart((long) (byte) 1);
        boolean boolean15 = mutableInterval10.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology16 = mutableInterval10.getChronology();
        mutableInterval3.setChronology(chronology16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval(0L, 1L, chronology20);
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        java.lang.Object obj23 = mutableInterval21.clone();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(obj23, chronology24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableInterval25.setPeriodAfterStart(readablePeriod26);
        org.joda.time.Period period28 = mutableInterval25.toPeriod();
        org.joda.time.MutableInterval mutableInterval29 = mutableInterval25.copy();
        boolean boolean30 = mutableInterval3.isAfter((org.joda.time.ReadableInterval) mutableInterval25);
        org.joda.time.Interval interval31 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(0L, 1L, chronology34);
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        java.lang.Object obj37 = mutableInterval35.clone();
        org.joda.time.Interval interval38 = mutableInterval35.toInterval();
        mutableInterval35.setDurationBeforeEnd(0L);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(0L, 1L, chronology43);
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        java.lang.Object obj46 = mutableInterval44.clone();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval(obj46, chronology47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        mutableInterval48.setPeriodBeforeEnd(readablePeriod49);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval(0L, 1L, chronology53);
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        mutableInterval54.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval(0L, 1L, chronology60);
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        long long63 = interval62.getEndMillis();
        boolean boolean65 = interval62.isAfter((long) (byte) 100);
        boolean boolean66 = mutableInterval54.overlaps((org.joda.time.ReadableInterval) interval62);
        org.joda.time.Duration duration67 = mutableInterval54.toDuration();
        boolean boolean68 = mutableInterval48.isBefore((org.joda.time.ReadableInterval) mutableInterval54);
        org.joda.time.MutableInterval mutableInterval69 = mutableInterval54.toMutableInterval();
        boolean boolean70 = mutableInterval35.overlaps((org.joda.time.ReadableInterval) mutableInterval69);
        boolean boolean71 = mutableInterval3.isBefore((org.joda.time.ReadableInterval) mutableInterval69);
        org.joda.time.MutableInterval mutableInterval73 = org.joda.time.MutableInterval.parse("2020-11-25T01:21:58.090Z/2020-11-25T01:21:58.091Z");
        boolean boolean74 = mutableInterval69.overlaps((org.joda.time.ReadableInterval) mutableInterval73);
        java.lang.String str75 = mutableInterval73.toString();
        mutableInterval73.setInterval(0L, 1606267491459L);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1L + "'", long63 == 1L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(mutableInterval69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(mutableInterval73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "2020-11-25T01:21:58.090Z/2020-11-25T01:21:58.091Z" + "'", str75, "2020-11-25T01:21:58.090Z/2020-11-25T01:21:58.091Z");
    }

    @Test
    @Ignore
  public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Interval interval6 = mutableInterval3.toInterval();
        org.joda.time.ReadableInterval readableInterval7 = null;
        boolean boolean8 = mutableInterval3.isBefore(readableInterval7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology11);
        boolean boolean13 = mutableInterval3.isAfter((org.joda.time.ReadableInterval) mutableInterval12);
        boolean boolean14 = mutableInterval12.isAfterNow();
        org.joda.time.MutableInterval mutableInterval15 = mutableInterval12.copy();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(mutableInterval15);
    }

    @Test
    @Ignore
  public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        long long12 = interval11.getEndMillis();
        boolean boolean14 = interval11.isAfter((long) (byte) 100);
        boolean boolean15 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) interval11);
        org.joda.time.Duration duration16 = mutableInterval3.toDuration();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval(readableInstant17, readablePeriod18);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval(0L, 1L, chronology22);
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.DateTime dateTime25 = mutableInterval23.getStart();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(0L, 1L, chronology28);
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.DateTime dateTime31 = mutableInterval29.getStart();
        mutableInterval19.setInterval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval(0L, 1L, chronology36);
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        mutableInterval37.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(0L, 1L, chronology43);
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        long long46 = interval45.getEndMillis();
        boolean boolean48 = interval45.isAfter((long) (byte) 100);
        boolean boolean49 = mutableInterval37.overlaps((org.joda.time.ReadableInterval) interval45);
        org.joda.time.Duration duration50 = mutableInterval37.toDuration();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval(0L, 1L, chronology53);
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.DateTime dateTime56 = mutableInterval54.getStart();
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval(readableInstant57, readablePeriod58);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval(0L, 1L, chronology62);
        org.joda.time.Interval interval64 = mutableInterval63.toInterval();
        org.joda.time.DateTime dateTime65 = mutableInterval63.getStart();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval(0L, 1L, chronology68);
        org.joda.time.Interval interval70 = mutableInterval69.toInterval();
        org.joda.time.DateTime dateTime71 = mutableInterval69.getStart();
        mutableInterval59.setInterval((org.joda.time.ReadableInstant) dateTime65, (org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration50, (org.joda.time.ReadableInstant) dateTime71);
        long long75 = mutableInterval74.toDurationMillis();
        org.joda.time.Period period76 = mutableInterval74.toPeriod();
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadablePeriod) period76);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval(0L, 1L, chronology80);
        org.joda.time.Interval interval82 = mutableInterval81.toInterval();
        java.lang.Object obj83 = mutableInterval81.clone();
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.MutableInterval mutableInterval87 = new org.joda.time.MutableInterval(0L, 1L, chronology86);
        org.joda.time.Interval interval88 = mutableInterval87.toInterval();
        java.lang.Object obj89 = mutableInterval87.clone();
        java.lang.Object obj90 = mutableInterval87.clone();
        boolean boolean91 = mutableInterval81.equals((java.lang.Object) mutableInterval87);
        java.lang.Object obj92 = mutableInterval81.clone();
        boolean boolean94 = mutableInterval81.isAfter(1606267403054L);
        org.joda.time.Duration duration95 = mutableInterval81.toDuration();
        org.joda.time.MutableInterval mutableInterval96 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableDuration) duration95);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1L + "'", long75 == 1L);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(interval82);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertEquals(obj83.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj83), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj83), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval88);
        org.junit.Assert.assertNotNull(obj89);
        org.junit.Assert.assertEquals(obj89.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj89), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj89), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(obj90);
        org.junit.Assert.assertEquals(obj90.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj90), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj90), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(obj92);
        org.junit.Assert.assertEquals(obj92.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj92), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj92), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(duration95);
    }

    @Test
    @Ignore
  public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        java.lang.Object obj6 = mutableInterval3.clone();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        boolean boolean13 = mutableInterval10.contains((long) ' ');
        org.joda.time.MutableInterval mutableInterval14 = mutableInterval10.copy();
        org.joda.time.Duration duration15 = mutableInterval10.toDuration();
        mutableInterval3.setDurationAfterStart((org.joda.time.ReadableDuration) duration15);
        java.lang.Object obj17 = mutableInterval3.clone();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(mutableInterval14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
    }

    @Test
    @Ignore
  public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(obj5, chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableInterval7.setPeriodAfterStart(readablePeriod8);
        mutableInterval7.setDurationAfterStart(1606267503292L);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
    }

    @Test
    @Ignore
  public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableInterval3.setPeriodBeforeEnd(readablePeriod4);
        mutableInterval3.setStartMillis((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(readableInstant8, readablePeriod9);
        long long11 = mutableInterval10.getEndMillis();
        boolean boolean12 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) mutableInterval10);
        boolean boolean13 = mutableInterval10.isAfterNow();
        boolean boolean15 = mutableInterval10.isBefore((long) (byte) 10);
        org.joda.time.Period period16 = mutableInterval10.toPeriod();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        long long21 = mutableInterval20.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval22 = mutableInterval20.copy();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableInterval20.setPeriodAfterStart(readablePeriod23);
        java.lang.Object obj25 = mutableInterval20.clone();
        org.joda.time.DateTime dateTime26 = mutableInterval20.getStart();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval(0L, 1L, chronology29);
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        java.lang.Object obj32 = mutableInterval30.clone();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval(obj32, chronology33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableInterval34.setPeriodBeforeEnd(readablePeriod35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval(readableInstant37, readablePeriod38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval(0L, 1L, chronology42);
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.DateTime dateTime45 = mutableInterval43.getStart();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(0L, 1L, chronology48);
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.DateTime dateTime51 = mutableInterval49.getStart();
        mutableInterval39.setInterval((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval(0L, 1L, chronology55);
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        java.lang.Object obj58 = mutableInterval56.clone();
        org.joda.time.Interval interval59 = mutableInterval56.toInterval();
        org.joda.time.ReadableInterval readableInterval60 = null;
        boolean boolean61 = mutableInterval56.isBefore(readableInterval60);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology64);
        boolean boolean66 = mutableInterval56.isAfter((org.joda.time.ReadableInterval) mutableInterval65);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval(0L, 1L, chronology69);
        org.joda.time.Interval interval71 = mutableInterval70.toInterval();
        org.joda.time.DateTime dateTime72 = mutableInterval70.getStart();
        boolean boolean73 = mutableInterval56.isBefore((org.joda.time.ReadableInstant) dateTime72);
        mutableInterval34.setInterval((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.ReadablePeriod readablePeriod76 = null;
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval(readableInstant75, readablePeriod76);
        mutableInterval77.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval80 = mutableInterval77.toMutableInterval();
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.MutableInterval mutableInterval84 = new org.joda.time.MutableInterval(0L, 1L, chronology83);
        long long85 = mutableInterval84.toDurationMillis();
        mutableInterval77.setInterval((org.joda.time.ReadableInterval) mutableInterval84);
        org.joda.time.Duration duration87 = mutableInterval84.toDuration();
        mutableInterval34.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration87);
        org.joda.time.MutableInterval mutableInterval89 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableDuration) duration87);
        org.joda.time.MutableInterval mutableInterval90 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period16, (org.joda.time.ReadableInstant) dateTime26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval91 = new org.joda.time.MutableInterval((java.lang.Object) period16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1606267584578L + "'", long11 == 1606267584578L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(mutableInterval22);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertEquals(obj58.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj58), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj58), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(mutableInterval80);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 1L + "'", long85 == 1L);
        org.junit.Assert.assertNotNull(duration87);
    }

    @Test
    @Ignore
  public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(obj5, chronology6);
        org.joda.time.DateTime dateTime8 = mutableInterval7.getEnd();
        org.joda.time.Interval interval9 = mutableInterval7.toInterval();
        boolean boolean10 = mutableInterval7.isBeforeNow();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    @Ignore
  public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval(readableInstant2, readablePeriod3);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(0L, 1L, chronology7);
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.DateTime dateTime10 = mutableInterval8.getStart();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval(0L, 1L, chronology13);
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.DateTime dateTime16 = mutableInterval14.getStart();
        mutableInterval4.setInterval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(readablePeriod1, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval(readablePeriod0, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval19);
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval19);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(0L, 1L, chronology24);
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        java.lang.Object obj27 = mutableInterval25.clone();
        org.joda.time.ReadableDuration readableDuration28 = null;
        mutableInterval25.setDurationAfterStart(readableDuration28);
        boolean boolean30 = mutableInterval25.isAfterNow();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval(0L, 1L, chronology33);
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        mutableInterval34.setDurationAfterStart((long) (byte) 1);
        boolean boolean39 = mutableInterval34.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology40 = mutableInterval34.getChronology();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(0L, 1L, chronology43);
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        java.lang.Object obj46 = mutableInterval44.clone();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval(obj46, chronology47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        mutableInterval48.setPeriodAfterStart(readablePeriod49);
        org.joda.time.Period period51 = mutableInterval48.toPeriod();
        mutableInterval34.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period51);
        mutableInterval25.setPeriodAfterStart((org.joda.time.ReadablePeriod) period51);
        long long54 = mutableInterval25.getEndMillis();
        boolean boolean55 = mutableInterval21.isAfter((org.joda.time.ReadableInterval) mutableInterval25);
        java.lang.String str56 = mutableInterval21.toString();
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z" + "'", str56, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        long long5 = interval4.getEndMillis();
        org.joda.time.Period period6 = interval4.toPeriod();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    @Ignore
  public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.DateTime dateTime5 = mutableInterval3.getStart();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval(0L, 1L, chronology8);
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        java.lang.Object obj11 = mutableInterval9.clone();
        org.joda.time.Interval interval12 = mutableInterval9.toInterval();
        org.joda.time.ReadableInterval readableInterval13 = null;
        boolean boolean14 = mutableInterval9.isBefore(readableInterval13);
        org.joda.time.MutableInterval mutableInterval15 = mutableInterval9.copy();
        boolean boolean16 = mutableInterval3.contains((org.joda.time.ReadableInterval) mutableInterval9);
        mutableInterval9.setInterval((long) '#', 1606267300661L);
        org.joda.time.Chronology chronology20 = mutableInterval9.getChronology();
        boolean boolean21 = mutableInterval9.isBeforeNow();
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = mutableInterval9.toPeriod(periodType22);
        mutableInterval9.setInterval((long) (byte) 100, 1606267325736L);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval(0L, 1L, chronology29);
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        mutableInterval30.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval(0L, 1L, chronology36);
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        long long39 = interval38.getEndMillis();
        boolean boolean41 = interval38.isAfter((long) (byte) 100);
        boolean boolean42 = mutableInterval30.overlaps((org.joda.time.ReadableInterval) interval38);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval(readableInstant43, readablePeriod44);
        mutableInterval45.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval48 = mutableInterval45.toMutableInterval();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval(0L, 1L, chronology51);
        long long53 = mutableInterval52.toDurationMillis();
        mutableInterval45.setInterval((org.joda.time.ReadableInterval) mutableInterval52);
        org.joda.time.Duration duration55 = mutableInterval52.toDuration();
        mutableInterval30.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration55);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval(0L, 1L, chronology59);
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        java.lang.Object obj62 = mutableInterval60.clone();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval(obj62, chronology63);
        org.joda.time.DateTime dateTime65 = mutableInterval64.getEnd();
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration55, (org.joda.time.ReadableInstant) dateTime65);
        mutableInterval9.setDurationAfterStart((org.joda.time.ReadableDuration) duration55);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(mutableInterval15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(mutableInterval48);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(dateTime65);
    }

    @Test
    @Ignore
  public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Interval interval6 = mutableInterval3.toInterval();
        org.joda.time.ReadableInterval readableInterval7 = null;
        boolean boolean8 = mutableInterval3.isBefore(readableInterval7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        mutableInterval12.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval(0L, 1L, chronology18);
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        mutableInterval19.setDurationAfterStart((long) (byte) 1);
        boolean boolean24 = mutableInterval19.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology25 = mutableInterval19.getChronology();
        mutableInterval12.setChronology(chronology25);
        mutableInterval3.setChronology(chronology25);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval(readableInstant30, readablePeriod31);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval(0L, 1L, chronology35);
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.DateTime dateTime38 = mutableInterval36.getStart();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval(0L, 1L, chronology41);
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.DateTime dateTime44 = mutableInterval42.getStart();
        mutableInterval32.setInterval((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval(readablePeriod29, (org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval(readablePeriod28, (org.joda.time.ReadableInstant) dateTime38);
        boolean boolean48 = mutableInterval3.isAfter((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        mutableInterval3.setPeriodAfterStart(readablePeriod49);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    @Ignore
  public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        long long12 = interval11.getEndMillis();
        boolean boolean14 = interval11.isAfter((long) (byte) 100);
        boolean boolean15 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) interval11);
        org.joda.time.Duration duration16 = mutableInterval3.toDuration();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.DateTime dateTime22 = mutableInterval20.getStart();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(readableInstant23, readablePeriod24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(0L, 1L, chronology28);
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.DateTime dateTime31 = mutableInterval29.getStart();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(0L, 1L, chronology34);
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.DateTime dateTime37 = mutableInterval35.getStart();
        mutableInterval25.setInterval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableInterval40.setPeriodAfterStart(readablePeriod41);
        org.joda.time.Chronology chronology43 = mutableInterval40.getChronology();
        long long44 = mutableInterval40.getStartMillis();
        org.joda.time.MutableInterval mutableInterval45 = mutableInterval40.copy();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(0L, 1L, chronology48);
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        java.lang.Object obj51 = mutableInterval49.clone();
        org.joda.time.Interval interval52 = mutableInterval49.toInterval();
        org.joda.time.ReadableInterval readableInterval53 = null;
        boolean boolean54 = mutableInterval49.isBefore(readableInterval53);
        org.joda.time.MutableInterval mutableInterval55 = mutableInterval49.copy();
        boolean boolean56 = mutableInterval40.contains((org.joda.time.ReadableInterval) mutableInterval49);
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = mutableInterval49.toPeriod(periodType57);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNotNull(mutableInterval45);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(mutableInterval55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(period58);
    }

    @Test
    @Ignore
  public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        java.lang.Object obj6 = mutableInterval3.clone();
        org.joda.time.MutableInterval mutableInterval7 = mutableInterval3.copy();
        org.joda.time.DateTime dateTime8 = mutableInterval3.getStart();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        java.lang.Object obj14 = mutableInterval12.clone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval(obj14, chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableInterval16.setPeriodAfterStart(readablePeriod17);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval(0L, 1L, chronology21);
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        java.lang.Object obj24 = mutableInterval22.clone();
        mutableInterval22.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology27 = mutableInterval22.getChronology();
        org.joda.time.MutableInterval mutableInterval28 = mutableInterval22.toMutableInterval();
        boolean boolean29 = mutableInterval16.isAfter((org.joda.time.ReadableInterval) mutableInterval28);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval(0L, 1L, chronology32);
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        java.lang.Object obj35 = mutableInterval33.clone();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval(obj35, chronology36);
        org.joda.time.Duration duration38 = mutableInterval37.toDuration();
        mutableInterval28.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration38);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableDuration) duration38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((java.lang.Object) duration38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.Duration");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(mutableInterval28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(duration38);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(1606267539541L, 1606267440862L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableInterval3.setPeriodBeforeEnd(readablePeriod4);
        mutableInterval3.setStartMillis((-1L));
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = mutableInterval3.toPeriod(periodType8);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    @Ignore
  public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        boolean boolean8 = mutableInterval3.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        java.lang.Object obj14 = mutableInterval12.clone();
        mutableInterval12.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology17 = mutableInterval12.getChronology();
        mutableInterval3.setChronology(chronology17);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval(0L, 1L, chronology21);
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        mutableInterval22.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(0L, 1L, chronology28);
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        java.lang.Object obj31 = mutableInterval29.clone();
        org.joda.time.Interval interval32 = mutableInterval29.toInterval();
        org.joda.time.ReadableInterval readableInterval33 = null;
        boolean boolean34 = mutableInterval29.isBefore(readableInterval33);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology37);
        boolean boolean39 = mutableInterval29.isAfter((org.joda.time.ReadableInterval) mutableInterval38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval(0L, 1L, chronology42);
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.DateTime dateTime45 = mutableInterval43.getStart();
        boolean boolean46 = mutableInterval29.isBefore((org.joda.time.ReadableInstant) dateTime45);
        boolean boolean47 = mutableInterval22.contains((org.joda.time.ReadableInstant) dateTime45);
        boolean boolean48 = mutableInterval3.isAfter((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime dateTime49 = mutableInterval3.getEnd();
        org.joda.time.MutableInterval mutableInterval50 = mutableInterval3.toMutableInterval();
        boolean boolean52 = mutableInterval50.contains(1606267415770L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((java.lang.Object) 1606267415770L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(mutableInterval50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    @Ignore
  public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Interval interval6 = mutableInterval3.toInterval();
        org.joda.time.ReadableInterval readableInterval7 = null;
        boolean boolean8 = mutableInterval3.isBefore(readableInterval7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology11);
        boolean boolean13 = mutableInterval3.isAfter((org.joda.time.ReadableInterval) mutableInterval12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval(0L, 1L, chronology16);
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        mutableInterval17.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval(0L, 1L, chronology23);
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        long long26 = interval25.getEndMillis();
        boolean boolean28 = interval25.isAfter((long) (byte) 100);
        boolean boolean29 = mutableInterval17.overlaps((org.joda.time.ReadableInterval) interval25);
        mutableInterval12.setInterval((org.joda.time.ReadableInterval) interval25);
        mutableInterval12.setDurationAfterStart((long) 1);
        org.joda.time.MutableInterval mutableInterval33 = mutableInterval12.toMutableInterval();
        long long34 = mutableInterval12.toDurationMillis();
        mutableInterval12.setDurationAfterStart(1606267416031L);
        long long37 = mutableInterval12.toDurationMillis();
        boolean boolean39 = mutableInterval12.isBefore(1606267576832L);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(mutableInterval33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1606267416031L + "'", long37 == 1606267416031L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    @Ignore
  public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        java.lang.Object obj12 = mutableInterval10.clone();
        org.joda.time.Interval interval13 = mutableInterval10.toInterval();
        org.joda.time.ReadableInterval readableInterval14 = null;
        boolean boolean15 = mutableInterval10.isBefore(readableInterval14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology18);
        boolean boolean20 = mutableInterval10.isAfter((org.joda.time.ReadableInterval) mutableInterval19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval(0L, 1L, chronology23);
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.DateTime dateTime26 = mutableInterval24.getStart();
        boolean boolean27 = mutableInterval10.isBefore((org.joda.time.ReadableInstant) dateTime26);
        boolean boolean28 = mutableInterval3.contains((org.joda.time.ReadableInstant) dateTime26);
        long long29 = mutableInterval3.toDurationMillis();
        java.lang.Object obj30 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval(obj30);
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        boolean boolean33 = mutableInterval3.isAfter((org.joda.time.ReadableInterval) mutableInterval31);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    @Ignore
  public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableDuration0, readableInstant1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableInterval6.setPeriodBeforeEnd(readablePeriod7);
        mutableInterval2.setInterval((org.joda.time.ReadableInterval) mutableInterval6);
        mutableInterval2.setDurationAfterStart(1606267313258L);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval(0L, 1L, chronology14);
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        java.lang.Object obj17 = mutableInterval15.clone();
        org.joda.time.Interval interval18 = mutableInterval15.toInterval();
        java.lang.String str19 = interval18.toString();
        boolean boolean20 = mutableInterval2.isBefore((org.joda.time.ReadableInterval) interval18);
        org.joda.time.DateTime dateTime21 = interval18.getEnd();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) 100, 1606267376702L);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval(0L, 1L, chronology27);
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        java.lang.Object obj30 = mutableInterval28.clone();
        org.joda.time.Interval interval31 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(0L, 1L, chronology34);
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        java.lang.Object obj37 = mutableInterval35.clone();
        boolean boolean38 = interval31.isBefore((org.joda.time.ReadableInterval) mutableInterval35);
        mutableInterval35.setDurationBeforeEnd((long) 10);
        org.joda.time.Period period41 = mutableInterval35.toPeriod();
        mutableInterval24.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period41);
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadablePeriod) period41);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z" + "'", str19, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(period41);
    }

    @Test
    @Ignore
  public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(0L, 1L, chronology6);
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        mutableInterval7.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval(0L, 1L, chronology13);
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        mutableInterval14.setDurationAfterStart((long) (byte) 1);
        boolean boolean19 = mutableInterval14.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology20 = mutableInterval14.getChronology();
        mutableInterval7.setChronology(chronology20);
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (-1), (long) '4', chronology20);
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) 1, (long) 100, chronology20);
        boolean boolean24 = mutableInterval23.isBeforeNow();
        org.joda.time.MutableInterval mutableInterval25 = mutableInterval23.copy();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(0L, 1L, chronology28);
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        mutableInterval29.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval(0L, 1L, chronology35);
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        java.lang.Object obj38 = mutableInterval36.clone();
        org.joda.time.Interval interval39 = mutableInterval36.toInterval();
        org.joda.time.ReadableInterval readableInterval40 = null;
        boolean boolean41 = mutableInterval36.isBefore(readableInterval40);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology44);
        boolean boolean46 = mutableInterval36.isAfter((org.joda.time.ReadableInterval) mutableInterval45);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval(0L, 1L, chronology49);
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.DateTime dateTime52 = mutableInterval50.getStart();
        boolean boolean53 = mutableInterval36.isBefore((org.joda.time.ReadableInstant) dateTime52);
        boolean boolean54 = mutableInterval29.contains((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval(readableInstant55, readablePeriod56);
        mutableInterval57.setDurationBeforeEnd(1L);
        boolean boolean60 = mutableInterval29.overlaps((org.joda.time.ReadableInterval) mutableInterval57);
        org.joda.time.Period period61 = mutableInterval57.toPeriod();
        mutableInterval23.setPeriodAfterStart((org.joda.time.ReadablePeriod) period61);
        mutableInterval23.setDurationAfterStart(1606267464694L);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(mutableInterval25);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(period61);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        mutableInterval2.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval5 = mutableInterval2.toMutableInterval();
        org.joda.time.DateTime dateTime6 = mutableInterval5.getEnd();
        org.joda.time.MutableInterval mutableInterval7 = mutableInterval5.toMutableInterval();
        java.lang.Object obj8 = mutableInterval7.clone();
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertNotNull(obj8);
// flaky:         org.junit.Assert.assertEquals(obj8.toString(), "2020-11-25T01:26:25.880Z/2020-11-25T01:26:25.881Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "2020-11-25T01:26:25.880Z/2020-11-25T01:26:25.881Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "2020-11-25T01:26:25.880Z/2020-11-25T01:26:25.881Z");
    }

    @Test
    @Ignore
  public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        long long5 = interval4.getEndMillis();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(readableInstant6, readablePeriod7);
        mutableInterval8.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval11 = mutableInterval8.toMutableInterval();
        boolean boolean12 = interval4.overlaps((org.joda.time.ReadableInterval) mutableInterval8);
        org.joda.time.Period period13 = interval4.toPeriod();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval(0L, 1L, chronology16);
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        mutableInterval17.setDurationAfterStart((long) (byte) 1);
        boolean boolean22 = mutableInterval17.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology23 = mutableInterval17.getChronology();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval(0L, 1L, chronology26);
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        java.lang.Object obj29 = mutableInterval27.clone();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval(obj29, chronology30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableInterval31.setPeriodAfterStart(readablePeriod32);
        org.joda.time.Period period34 = mutableInterval31.toPeriod();
        mutableInterval17.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval(0L, 1L, chronology38);
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        java.lang.Object obj41 = mutableInterval39.clone();
        org.joda.time.Interval interval42 = mutableInterval39.toInterval();
        org.joda.time.ReadableInterval readableInterval43 = null;
        boolean boolean44 = mutableInterval39.isBefore(readableInterval43);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology47);
        boolean boolean49 = mutableInterval39.isAfter((org.joda.time.ReadableInterval) mutableInterval48);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval(0L, 1L, chronology52);
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.DateTime dateTime55 = mutableInterval53.getStart();
        boolean boolean56 = mutableInterval39.isBefore((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period34, (org.joda.time.ReadableInstant) dateTime55);
        boolean boolean58 = interval4.isAfter((org.joda.time.ReadableInterval) mutableInterval57);
        long long59 = mutableInterval57.getStartMillis();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(mutableInterval11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
    }

    @Test
    @Ignore
  public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(readableInstant1, readablePeriod2);
        mutableInterval3.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval6 = mutableInterval3.toMutableInterval();
        org.joda.time.Period period7 = mutableInterval3.toPeriod();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval(0L, 1L, chronology10);
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        mutableInterval11.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, 1L, chronology17);
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        java.lang.Object obj20 = mutableInterval18.clone();
        org.joda.time.Interval interval21 = mutableInterval18.toInterval();
        org.joda.time.ReadableInterval readableInterval22 = null;
        boolean boolean23 = mutableInterval18.isBefore(readableInterval22);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology26);
        boolean boolean28 = mutableInterval18.isAfter((org.joda.time.ReadableInterval) mutableInterval27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval(0L, 1L, chronology31);
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.DateTime dateTime34 = mutableInterval32.getStart();
        boolean boolean35 = mutableInterval18.isBefore((org.joda.time.ReadableInstant) dateTime34);
        boolean boolean36 = mutableInterval11.contains((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval(0L, 1L, chronology39);
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        java.lang.Object obj42 = mutableInterval40.clone();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(obj42, chronology43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableInterval44.setPeriodAfterStart(readablePeriod45);
        org.joda.time.Period period47 = mutableInterval44.toPeriod();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval(0L, 1L, chronology50);
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        java.lang.Object obj53 = mutableInterval51.clone();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval(obj53, chronology54);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        mutableInterval55.setPeriodAfterStart(readablePeriod56);
        org.joda.time.Period period58 = mutableInterval55.toPeriod();
        mutableInterval44.setPeriodAfterStart((org.joda.time.ReadablePeriod) period58);
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadablePeriod) period58);
        boolean boolean61 = mutableInterval3.contains((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval(0L, 1L, chronology64);
        org.joda.time.Interval interval66 = mutableInterval65.toInterval();
        java.lang.Object obj67 = mutableInterval65.clone();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval(obj67, chronology68);
        org.joda.time.Duration duration70 = mutableInterval69.toDuration();
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableDuration) duration70);
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval(readableDuration0, (org.joda.time.ReadableInstant) dateTime34);
        org.junit.Assert.assertNotNull(mutableInterval6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertEquals(obj67.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj67), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj67), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(duration70);
    }

    @Test
    @Ignore
  public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(obj5, chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableInterval7.setPeriodAfterStart(readablePeriod8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(0L, 1L, chronology12);
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        java.lang.Object obj15 = mutableInterval13.clone();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval(obj15, chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableInterval17.setPeriodAfterStart(readablePeriod18);
        org.joda.time.Period period20 = mutableInterval17.toPeriod();
        org.joda.time.MutableInterval mutableInterval21 = mutableInterval17.copy();
        long long22 = mutableInterval17.getEndMillis();
        boolean boolean23 = mutableInterval7.isAfter((org.joda.time.ReadableInterval) mutableInterval17);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval(readableInstant24, readablePeriod25);
        mutableInterval26.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval29 = mutableInterval26.toMutableInterval();
        org.joda.time.Period period30 = mutableInterval26.toPeriod();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(readableInstant33, readablePeriod34);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval(0L, 1L, chronology38);
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.DateTime dateTime41 = mutableInterval39.getStart();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval(0L, 1L, chronology44);
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        org.joda.time.DateTime dateTime47 = mutableInterval45.getStart();
        mutableInterval35.setInterval((org.joda.time.ReadableInstant) dateTime41, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(readablePeriod32, (org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval(readablePeriod31, (org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval(readableInstant51, readablePeriod52);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval(0L, 1L, chronology56);
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.DateTime dateTime59 = mutableInterval57.getStart();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval(0L, 1L, chronology62);
        org.joda.time.Interval interval64 = mutableInterval63.toInterval();
        org.joda.time.DateTime dateTime65 = mutableInterval63.getStart();
        mutableInterval53.setInterval((org.joda.time.ReadableInstant) dateTime59, (org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime41, (org.joda.time.ReadableInstant) dateTime59);
        boolean boolean68 = mutableInterval26.isAfter((org.joda.time.ReadableInstant) dateTime59);
        boolean boolean69 = mutableInterval7.contains((org.joda.time.ReadableInstant) dateTime59);
        boolean boolean70 = mutableInterval7.isBeforeNow();
        org.joda.time.Duration duration71 = mutableInterval7.toDuration();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval(0L, 1L, chronology74);
        org.joda.time.Interval interval76 = mutableInterval75.toInterval();
        java.lang.Object obj77 = mutableInterval75.clone();
        org.joda.time.Interval interval78 = mutableInterval75.toInterval();
        org.joda.time.ReadableInterval readableInterval79 = null;
        boolean boolean80 = mutableInterval75.isBefore(readableInterval79);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.MutableInterval mutableInterval84 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology83);
        boolean boolean85 = mutableInterval75.isAfter((org.joda.time.ReadableInterval) mutableInterval84);
        org.joda.time.Chronology chronology88 = null;
        org.joda.time.MutableInterval mutableInterval89 = new org.joda.time.MutableInterval(0L, 1L, chronology88);
        org.joda.time.Interval interval90 = mutableInterval89.toInterval();
        org.joda.time.DateTime dateTime91 = mutableInterval89.getStart();
        boolean boolean92 = mutableInterval75.isBefore((org.joda.time.ReadableInstant) dateTime91);
        mutableInterval7.setEnd((org.joda.time.ReadableInstant) dateTime91);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(mutableInterval21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(interval76);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertEquals(obj77.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj77), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj77), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(interval90);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    @Ignore
  public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Interval interval6 = mutableInterval3.toInterval();
        mutableInterval3.setDurationBeforeEnd(0L);
        boolean boolean10 = mutableInterval3.contains((long) (short) 0);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval(0L, 1L, chronology13);
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        java.lang.Object obj16 = mutableInterval14.clone();
        long long17 = mutableInterval14.getStartMillis();
        boolean boolean18 = mutableInterval3.equals((java.lang.Object) mutableInterval14);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval(0L, 1L, chronology21);
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        java.lang.Object obj24 = mutableInterval22.clone();
        org.joda.time.Interval interval25 = mutableInterval22.toInterval();
        mutableInterval22.setDurationBeforeEnd(0L);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval(0L, 1L, chronology30);
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        java.lang.Object obj33 = mutableInterval31.clone();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(obj33, chronology34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableInterval35.setPeriodBeforeEnd(readablePeriod36);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval(0L, 1L, chronology40);
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        mutableInterval41.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval(0L, 1L, chronology47);
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        long long50 = interval49.getEndMillis();
        boolean boolean52 = interval49.isAfter((long) (byte) 100);
        boolean boolean53 = mutableInterval41.overlaps((org.joda.time.ReadableInterval) interval49);
        org.joda.time.Duration duration54 = mutableInterval41.toDuration();
        boolean boolean55 = mutableInterval35.isBefore((org.joda.time.ReadableInterval) mutableInterval41);
        org.joda.time.MutableInterval mutableInterval56 = mutableInterval41.toMutableInterval();
        boolean boolean57 = mutableInterval22.overlaps((org.joda.time.ReadableInterval) mutableInterval56);
        boolean boolean58 = mutableInterval14.overlaps((org.joda.time.ReadableInterval) mutableInterval56);
        org.joda.time.MutableInterval mutableInterval59 = mutableInterval14.copy();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(mutableInterval56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(mutableInterval59);
    }

    @Test
    @Ignore
  public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        long long12 = interval11.getEndMillis();
        boolean boolean14 = interval11.isAfter((long) (byte) 100);
        boolean boolean15 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) interval11);
        org.joda.time.Duration duration16 = mutableInterval3.toDuration();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.DateTime dateTime22 = mutableInterval20.getStart();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(readableInstant23, readablePeriod24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(0L, 1L, chronology28);
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.DateTime dateTime31 = mutableInterval29.getStart();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(0L, 1L, chronology34);
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.DateTime dateTime37 = mutableInterval35.getStart();
        mutableInterval25.setInterval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(0L, 1L, chronology43);
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        mutableInterval44.setDurationAfterStart((long) (byte) 1);
        mutableInterval44.setDurationAfterStart((long) '#');
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval(0L, 1L, chronology52);
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.DateTime dateTime55 = mutableInterval53.getStart();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval(0L, 1L, chronology58);
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        java.lang.Object obj61 = mutableInterval59.clone();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval(obj61, chronology62);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        mutableInterval63.setPeriodAfterStart(readablePeriod64);
        org.joda.time.Period period66 = mutableInterval63.toPeriod();
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadablePeriod) period66);
        boolean boolean68 = mutableInterval44.isBefore((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime55);
        java.lang.Object obj70 = null;
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval(obj70);
        boolean boolean72 = mutableInterval69.equals((java.lang.Object) mutableInterval71);
        boolean boolean74 = mutableInterval69.contains(1606267362498L);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals(obj61.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj61), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj61), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableInterval3.setPeriodBeforeEnd(readablePeriod4);
        mutableInterval3.setStartMillis((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(readableInstant8, readablePeriod9);
        long long11 = mutableInterval10.getEndMillis();
        boolean boolean12 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) mutableInterval10);
        boolean boolean13 = mutableInterval10.isAfterNow();
        boolean boolean15 = mutableInterval10.isBefore((long) (byte) 10);
        org.joda.time.Period period16 = mutableInterval10.toPeriod();
        mutableInterval10.setStartMillis((long) (short) 0);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval(0L, 1L, chronology21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableInterval22.setPeriodAfterStart(readablePeriod23);
        org.joda.time.DateTime dateTime25 = mutableInterval22.getEnd();
        boolean boolean27 = mutableInterval22.contains(1606267453388L);
        boolean boolean28 = mutableInterval10.contains((org.joda.time.ReadableInterval) mutableInterval22);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1606267586838L + "'", long11 == 1606267586838L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    @Ignore
  public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        mutableInterval3.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology8 = mutableInterval3.getChronology();
        org.joda.time.MutableInterval mutableInterval9 = mutableInterval3.toMutableInterval();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(0L, 1L, chronology12);
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        java.lang.Object obj15 = mutableInterval13.clone();
        long long16 = mutableInterval13.getStartMillis();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval(readableInstant19, readablePeriod20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(0L, 1L, chronology24);
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.DateTime dateTime27 = mutableInterval25.getStart();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval(0L, 1L, chronology30);
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.DateTime dateTime33 = mutableInterval31.getStart();
        mutableInterval21.setInterval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(readablePeriod18, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval(readablePeriod17, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval(readableInstant37, readablePeriod38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval(0L, 1L, chronology42);
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.DateTime dateTime45 = mutableInterval43.getStart();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(0L, 1L, chronology48);
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.DateTime dateTime51 = mutableInterval49.getStart();
        mutableInterval39.setInterval((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime45);
        boolean boolean54 = mutableInterval13.isBefore((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval(0L, 1L, chronology57);
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        mutableInterval58.setDurationAfterStart((long) (byte) 1);
        boolean boolean63 = mutableInterval58.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval(0L, 1L, chronology66);
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        java.lang.Object obj69 = mutableInterval67.clone();
        mutableInterval67.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology72 = mutableInterval67.getChronology();
        mutableInterval58.setChronology(chronology72);
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval13, chronology72);
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval9, chronology72);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval75.setStartMillis(1606267505326L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(mutableInterval9);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertEquals(obj69.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj69), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj69), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology72);
    }

    @Test
    @Ignore
  public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval(0L, 1L, chronology4);
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        mutableInterval5.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        mutableInterval12.setDurationAfterStart((long) (byte) 1);
        boolean boolean17 = mutableInterval12.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology18 = mutableInterval12.getChronology();
        mutableInterval5.setChronology(chronology18);
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) '4', (long) 'a', chronology18);
        boolean boolean21 = mutableInterval20.isBeforeNow();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (-1), (long) (byte) 100);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval(0L, 1L, chronology27);
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.DateTime dateTime30 = mutableInterval28.getStart();
        org.joda.time.Interval interval31 = mutableInterval28.toInterval();
        boolean boolean32 = mutableInterval24.isAfter((org.joda.time.ReadableInterval) mutableInterval28);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(readableDuration33, readableInstant34);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        mutableInterval39.setPeriodBeforeEnd(readablePeriod40);
        mutableInterval35.setInterval((org.joda.time.ReadableInterval) mutableInterval39);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval(0L, 1L, chronology45);
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        java.lang.Object obj48 = mutableInterval46.clone();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval(obj48, chronology49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        mutableInterval50.setPeriodAfterStart(readablePeriod51);
        org.joda.time.Period period53 = mutableInterval50.toPeriod();
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval(readableInstant56, readablePeriod57);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval(0L, 1L, chronology61);
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.DateTime dateTime64 = mutableInterval62.getStart();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval(0L, 1L, chronology67);
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        org.joda.time.DateTime dateTime70 = mutableInterval68.getStart();
        mutableInterval58.setInterval((org.joda.time.ReadableInstant) dateTime64, (org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval(readablePeriod55, (org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval(readablePeriod54, (org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        org.joda.time.MutableInterval mutableInterval76 = new org.joda.time.MutableInterval(readableInstant74, readablePeriod75);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutableInterval mutableInterval80 = new org.joda.time.MutableInterval(0L, 1L, chronology79);
        org.joda.time.Interval interval81 = mutableInterval80.toInterval();
        org.joda.time.DateTime dateTime82 = mutableInterval80.getStart();
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.MutableInterval mutableInterval86 = new org.joda.time.MutableInterval(0L, 1L, chronology85);
        org.joda.time.Interval interval87 = mutableInterval86.toInterval();
        org.joda.time.DateTime dateTime88 = mutableInterval86.getStart();
        mutableInterval76.setInterval((org.joda.time.ReadableInstant) dateTime82, (org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.MutableInterval mutableInterval90 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime64, (org.joda.time.ReadableInstant) dateTime82);
        org.joda.time.MutableInterval mutableInterval91 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period53, (org.joda.time.ReadableInstant) dateTime82);
        mutableInterval35.setPeriodAfterStart((org.joda.time.ReadablePeriod) period53);
        mutableInterval24.setPeriodAfterStart((org.joda.time.ReadablePeriod) period53);
        mutableInterval20.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period53);
        mutableInterval20.setDurationAfterStart(1606267328077L);
        long long97 = mutableInterval20.toDurationMillis();
        org.joda.time.Chronology chronology98 = mutableInterval20.getChronology();
        java.lang.Object obj99 = mutableInterval20.clone();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(interval87);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 1606267328077L + "'", long97 == 1606267328077L);
        org.junit.Assert.assertNotNull(chronology98);
        org.junit.Assert.assertNotNull(obj99);
        org.junit.Assert.assertEquals(obj99.toString(), "1970-01-01T00:00:00.097Z/2020-11-25T01:22:08.174Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj99), "1970-01-01T00:00:00.097Z/2020-11-25T01:22:08.174Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj99), "1970-01-01T00:00:00.097Z/2020-11-25T01:22:08.174Z");
    }

    @Test
    @Ignore
  public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        mutableInterval3.setEndMillis((long) '4');
        mutableInterval3.setInterval(35L, 1606267387939L);
        long long11 = mutableInterval3.getStartMillis();
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval3);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval(0L, 1L, chronology15);
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        java.lang.Object obj18 = mutableInterval16.clone();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(obj18, chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableInterval20.setPeriodBeforeEnd(readablePeriod21);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval(0L, 1L, chronology25);
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        mutableInterval26.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval(0L, 1L, chronology32);
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        long long35 = interval34.getEndMillis();
        boolean boolean37 = interval34.isAfter((long) (byte) 100);
        boolean boolean38 = mutableInterval26.overlaps((org.joda.time.ReadableInterval) interval34);
        org.joda.time.Duration duration39 = mutableInterval26.toDuration();
        boolean boolean40 = mutableInterval20.isBefore((org.joda.time.ReadableInterval) mutableInterval26);
        org.joda.time.MutableInterval mutableInterval41 = mutableInterval26.toMutableInterval();
        java.lang.String str42 = mutableInterval41.toString();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval(0L, 1L, chronology45);
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        java.lang.Object obj48 = mutableInterval46.clone();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval(obj48, chronology49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        mutableInterval50.setPeriodBeforeEnd(readablePeriod51);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval(readableInstant53, readablePeriod54);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval(0L, 1L, chronology58);
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.DateTime dateTime61 = mutableInterval59.getStart();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval(0L, 1L, chronology64);
        org.joda.time.Interval interval66 = mutableInterval65.toInterval();
        org.joda.time.DateTime dateTime67 = mutableInterval65.getStart();
        mutableInterval55.setInterval((org.joda.time.ReadableInstant) dateTime61, (org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval(0L, 1L, chronology71);
        org.joda.time.Interval interval73 = mutableInterval72.toInterval();
        java.lang.Object obj74 = mutableInterval72.clone();
        org.joda.time.Interval interval75 = mutableInterval72.toInterval();
        org.joda.time.ReadableInterval readableInterval76 = null;
        boolean boolean77 = mutableInterval72.isBefore(readableInterval76);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology80);
        boolean boolean82 = mutableInterval72.isAfter((org.joda.time.ReadableInterval) mutableInterval81);
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.MutableInterval mutableInterval86 = new org.joda.time.MutableInterval(0L, 1L, chronology85);
        org.joda.time.Interval interval87 = mutableInterval86.toInterval();
        org.joda.time.DateTime dateTime88 = mutableInterval86.getStart();
        boolean boolean89 = mutableInterval72.isBefore((org.joda.time.ReadableInstant) dateTime88);
        mutableInterval50.setInterval((org.joda.time.ReadableInstant) dateTime61, (org.joda.time.ReadableInstant) dateTime88);
        boolean boolean91 = mutableInterval41.isAfter((org.joda.time.ReadableInstant) dateTime61);
        boolean boolean92 = mutableInterval41.isAfterNow();
        mutableInterval3.setInterval((org.joda.time.ReadableInterval) mutableInterval41);
        boolean boolean95 = mutableInterval3.isAfter(100L);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(mutableInterval41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z" + "'", str42, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertEquals(obj74.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj74), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj74), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(interval87);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(10L, (long) (short) 100);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(readableDuration8, readableInstant9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = mutableInterval10.toPeriod(periodType11);
        mutableInterval7.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period12);
        boolean boolean14 = interval4.contains((org.joda.time.ReadableInterval) mutableInterval7);
        org.joda.time.DateTime dateTime15 = mutableInterval7.getStart();
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval7);
        boolean boolean17 = mutableInterval16.containsNow();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    @Ignore
  public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval(0L, 1L, chronology4);
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        java.lang.Object obj7 = mutableInterval5.clone();
        org.joda.time.Interval interval8 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        java.lang.Object obj14 = mutableInterval12.clone();
        boolean boolean15 = interval8.isBefore((org.joda.time.ReadableInterval) mutableInterval12);
        boolean boolean16 = mutableInterval1.isAfter((org.joda.time.ReadableInterval) mutableInterval12);
        org.joda.time.MutableInterval mutableInterval17 = mutableInterval1.copy();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = mutableInterval1.toPeriod(periodType18);
        org.junit.Assert.assertNotNull(mutableInterval1);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(mutableInterval17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    @Ignore
  public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        java.lang.Object obj12 = mutableInterval10.clone();
        org.joda.time.Interval interval13 = mutableInterval10.toInterval();
        org.joda.time.ReadableInterval readableInterval14 = null;
        boolean boolean15 = mutableInterval10.isBefore(readableInterval14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology18);
        boolean boolean20 = mutableInterval10.isAfter((org.joda.time.ReadableInterval) mutableInterval19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval(0L, 1L, chronology23);
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.DateTime dateTime26 = mutableInterval24.getStart();
        boolean boolean27 = mutableInterval10.isBefore((org.joda.time.ReadableInstant) dateTime26);
        boolean boolean28 = mutableInterval3.contains((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval(0L, 1L, chronology31);
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        java.lang.Object obj34 = mutableInterval32.clone();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval(obj34, chronology35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableInterval36.setPeriodAfterStart(readablePeriod37);
        org.joda.time.Period period39 = mutableInterval36.toPeriod();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval(0L, 1L, chronology42);
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        java.lang.Object obj45 = mutableInterval43.clone();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval(obj45, chronology46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        mutableInterval47.setPeriodAfterStart(readablePeriod48);
        org.joda.time.Period period50 = mutableInterval47.toPeriod();
        mutableInterval36.setPeriodAfterStart((org.joda.time.ReadablePeriod) period50);
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadablePeriod) period50);
        java.lang.Object obj53 = mutableInterval52.clone();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
    }

    @Test
    @Ignore
  public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Interval interval6 = mutableInterval3.toInterval();
        org.joda.time.ReadableInterval readableInterval7 = null;
        boolean boolean8 = mutableInterval3.isBefore(readableInterval7);
        org.joda.time.MutableInterval mutableInterval9 = mutableInterval3.copy();
        boolean boolean11 = mutableInterval3.contains(1606267302410L);
        org.joda.time.DateTime dateTime12 = mutableInterval3.getStart();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval(0L, 1L, chronology15);
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        mutableInterval16.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval(0L, 1L, chronology22);
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        long long25 = interval24.getEndMillis();
        boolean boolean27 = interval24.isAfter((long) (byte) 100);
        boolean boolean28 = mutableInterval16.overlaps((org.joda.time.ReadableInterval) interval24);
        org.joda.time.Duration duration29 = mutableInterval16.toDuration();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval(0L, 1L, chronology32);
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.DateTime dateTime35 = mutableInterval33.getStart();
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval(readableInstant36, readablePeriod37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval(0L, 1L, chronology41);
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.DateTime dateTime44 = mutableInterval42.getStart();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval(0L, 1L, chronology47);
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.DateTime dateTime50 = mutableInterval48.getStart();
        mutableInterval38.setInterval((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration29, (org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval(readableInstant54, readablePeriod55);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval(0L, 1L, chronology59);
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        org.joda.time.DateTime dateTime62 = mutableInterval60.getStart();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval(0L, 1L, chronology65);
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        org.joda.time.DateTime dateTime68 = mutableInterval66.getStart();
        mutableInterval56.setInterval((org.joda.time.ReadableInstant) dateTime62, (org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration29, (org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval(readableInstant71, readablePeriod72);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval(0L, 1L, chronology76);
        org.joda.time.Interval interval78 = mutableInterval77.toInterval();
        org.joda.time.DateTime dateTime79 = mutableInterval77.getStart();
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval(0L, 1L, chronology82);
        org.joda.time.Interval interval84 = mutableInterval83.toInterval();
        org.joda.time.DateTime dateTime85 = mutableInterval83.getStart();
        mutableInterval73.setInterval((org.joda.time.ReadableInstant) dateTime79, (org.joda.time.ReadableInstant) dateTime85);
        org.joda.time.MutableInterval mutableInterval87 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration29, (org.joda.time.ReadableInstant) dateTime85);
        mutableInterval87.setEndMillis((long) ' ');
        mutableInterval3.setInterval((org.joda.time.ReadableInterval) mutableInterval87);
        boolean boolean91 = mutableInterval87.isBeforeNow();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(mutableInterval9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(interval78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(interval84);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    @Ignore
  public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableDuration0, readableInstant1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableInterval6.setPeriodBeforeEnd(readablePeriod7);
        mutableInterval2.setInterval((org.joda.time.ReadableInterval) mutableInterval6);
        mutableInterval2.setDurationAfterStart(1606267313258L);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval(0L, 1L, chronology14);
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        java.lang.Object obj17 = mutableInterval15.clone();
        org.joda.time.Interval interval18 = mutableInterval15.toInterval();
        java.lang.String str19 = interval18.toString();
        boolean boolean20 = mutableInterval2.isBefore((org.joda.time.ReadableInterval) interval18);
        org.joda.time.MutableInterval mutableInterval21 = mutableInterval2.copy();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval(readableInstant22, readablePeriod23);
        mutableInterval24.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval27 = mutableInterval24.toMutableInterval();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval(0L, 1L, chronology30);
        long long32 = mutableInterval31.toDurationMillis();
        mutableInterval24.setInterval((org.joda.time.ReadableInterval) mutableInterval31);
        mutableInterval24.setDurationAfterStart(100L);
        mutableInterval24.setDurationBeforeEnd(1606267383550L);
        mutableInterval21.setInterval((org.joda.time.ReadableInterval) mutableInterval24);
        mutableInterval21.setInterval(1606267452280L, 1606267562360L);
        long long42 = mutableInterval21.getEndMillis();
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z" + "'", str19, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(mutableInterval21);
        org.junit.Assert.assertNotNull(mutableInterval27);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1606267562360L + "'", long42 == 1606267562360L);
    }

    @Test
    @Ignore
  public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.DateTime dateTime5 = mutableInterval3.getStart();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(readableInstant6, readablePeriod7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.DateTime dateTime14 = mutableInterval12.getStart();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, 1L, chronology17);
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.DateTime dateTime20 = mutableInterval18.getStart();
        mutableInterval8.setInterval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime23 = mutableInterval22.getStart();
        boolean boolean25 = mutableInterval22.isBefore((long) (short) 10);
        org.joda.time.Interval interval26 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval(0L, 1L, chronology29);
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        mutableInterval30.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval(0L, 1L, chronology36);
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        mutableInterval37.setDurationAfterStart((long) (byte) 1);
        boolean boolean42 = mutableInterval37.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology43 = mutableInterval37.getChronology();
        mutableInterval30.setChronology(chronology43);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval(0L, 1L, chronology47);
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        java.lang.Object obj50 = mutableInterval48.clone();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval(obj50, chronology51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        mutableInterval52.setPeriodAfterStart(readablePeriod53);
        org.joda.time.Period period55 = mutableInterval52.toPeriod();
        org.joda.time.MutableInterval mutableInterval56 = mutableInterval52.copy();
        boolean boolean57 = mutableInterval30.isAfter((org.joda.time.ReadableInterval) mutableInterval52);
        org.joda.time.MutableInterval mutableInterval58 = mutableInterval30.toMutableInterval();
        org.joda.time.DateTime dateTime59 = mutableInterval30.getStart();
        boolean boolean60 = interval26.overlaps((org.joda.time.ReadableInterval) mutableInterval30);
        boolean boolean62 = interval26.isBefore(1606267577038L);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(mutableInterval56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(mutableInterval58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    @Ignore
  public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        long long6 = mutableInterval3.getStartMillis();
        java.lang.String str7 = mutableInterval3.toString();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z" + "'", str7, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        mutableInterval2.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval5 = mutableInterval2.toMutableInterval();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval(0L, 1L, chronology8);
        long long10 = mutableInterval9.toDurationMillis();
        mutableInterval2.setInterval((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.DateTime dateTime12 = mutableInterval2.getStart();
        long long13 = mutableInterval2.getStartMillis();
        org.joda.time.ReadableInterval readableInterval14 = null;
        boolean boolean15 = mutableInterval2.overlaps(readableInterval14);
        boolean boolean17 = mutableInterval2.isBefore(1606267390671L);
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    @Ignore
  public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        long long6 = mutableInterval3.getStartMillis();
        mutableInterval3.setDurationBeforeEnd(1606267300661L);
        java.lang.String str9 = mutableInterval3.toString();
        org.joda.time.DateTime dateTime10 = mutableInterval3.getEnd();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1919-02-06T22:38:19.340Z/1970-01-01T00:00:00.001Z" + "'", str9, "1919-02-06T22:38:19.340Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    @Ignore
  public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        mutableInterval3.setStartMillis((long) (short) -1);
        org.joda.time.MutableInterval mutableInterval8 = mutableInterval3.toMutableInterval();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        java.lang.Object obj14 = mutableInterval12.clone();
        org.joda.time.Interval interval15 = mutableInterval12.toInterval();
        boolean boolean17 = interval15.contains(1606267356510L);
        boolean boolean18 = interval15.isAfterNow();
        org.joda.time.Chronology chronology19 = interval15.getChronology();
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((java.lang.Object) interval15);
        boolean boolean21 = mutableInterval8.isAfter((org.joda.time.ReadableInterval) mutableInterval20);
        long long22 = mutableInterval8.getStartMillis();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval(0L, 1L, chronology25);
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        java.lang.Object obj28 = mutableInterval26.clone();
        long long29 = mutableInterval26.getStartMillis();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval(readableInstant32, readablePeriod33);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval(0L, 1L, chronology37);
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.DateTime dateTime40 = mutableInterval38.getStart();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(0L, 1L, chronology43);
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.DateTime dateTime46 = mutableInterval44.getStart();
        mutableInterval34.setInterval((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval(readablePeriod31, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(readablePeriod30, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval(readableInstant50, readablePeriod51);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval(0L, 1L, chronology55);
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        org.joda.time.DateTime dateTime58 = mutableInterval56.getStart();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval(0L, 1L, chronology61);
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.DateTime dateTime64 = mutableInterval62.getStart();
        mutableInterval52.setInterval((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime58);
        boolean boolean67 = mutableInterval26.isBefore((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval(0L, 1L, chronology70);
        org.joda.time.Interval interval72 = mutableInterval71.toInterval();
        mutableInterval71.setDurationAfterStart((long) (byte) 1);
        boolean boolean76 = mutableInterval71.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutableInterval mutableInterval80 = new org.joda.time.MutableInterval(0L, 1L, chronology79);
        org.joda.time.Interval interval81 = mutableInterval80.toInterval();
        java.lang.Object obj82 = mutableInterval80.clone();
        mutableInterval80.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology85 = mutableInterval80.getChronology();
        mutableInterval71.setChronology(chronology85);
        org.joda.time.MutableInterval mutableInterval87 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval26, chronology85);
        org.joda.time.MutableInterval mutableInterval88 = mutableInterval26.toMutableInterval();
        org.joda.time.PeriodType periodType89 = null;
        org.joda.time.Period period90 = mutableInterval26.toPeriod(periodType89);
        mutableInterval8.setPeriodAfterStart((org.joda.time.ReadablePeriod) period90);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(mutableInterval8);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertEquals(obj82.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj82), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj82), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology85);
        org.junit.Assert.assertNotNull(mutableInterval88);
        org.junit.Assert.assertNotNull(period90);
    }

    @Test
    @Ignore
  public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableInterval3.setPeriodBeforeEnd(readablePeriod4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(readableInstant6, readablePeriod7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.DateTime dateTime14 = mutableInterval12.getStart();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, 1L, chronology17);
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.DateTime dateTime20 = mutableInterval18.getStart();
        mutableInterval8.setInterval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime20);
        boolean boolean22 = mutableInterval3.isAfter((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (-1), (long) (byte) 100);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(0L, 1L, chronology28);
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        java.lang.Object obj31 = mutableInterval29.clone();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval(obj31, chronology32);
        org.joda.time.DateTime dateTime34 = mutableInterval33.getEnd();
        boolean boolean35 = mutableInterval25.isBefore((org.joda.time.ReadableInstant) dateTime34);
        mutableInterval3.setStart((org.joda.time.ReadableInstant) dateTime34);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    @Ignore
  public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        java.lang.Object obj6 = mutableInterval3.clone();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        mutableInterval10.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval(0L, 1L, chronology16);
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        mutableInterval17.setDurationAfterStart((long) (byte) 1);
        boolean boolean22 = mutableInterval17.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology23 = mutableInterval17.getChronology();
        mutableInterval10.setChronology(chronology23);
        mutableInterval10.setEndMillis((long) '#');
        org.joda.time.Duration duration27 = mutableInterval10.toDuration();
        mutableInterval3.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration27);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = mutableInterval3.toPeriod(periodType29);
        org.joda.time.Period period31 = mutableInterval3.toPeriod();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
    }

    @Test
    @Ignore
  public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        mutableInterval3.setStartMillis((long) (short) -1);
        boolean boolean8 = mutableInterval3.isAfterNow();
        mutableInterval3.setDurationAfterStart(1606267317701L);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    @Ignore
  public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        long long12 = interval11.getEndMillis();
        boolean boolean14 = interval11.isAfter((long) (byte) 100);
        boolean boolean15 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) interval11);
        org.joda.time.Duration duration16 = mutableInterval3.toDuration();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.DateTime dateTime22 = mutableInterval20.getStart();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(readableInstant23, readablePeriod24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(0L, 1L, chronology28);
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.DateTime dateTime31 = mutableInterval29.getStart();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(0L, 1L, chronology34);
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.DateTime dateTime37 = mutableInterval35.getStart();
        mutableInterval25.setInterval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(0L, 1L, chronology43);
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        mutableInterval44.setDurationAfterStart((long) (byte) 1);
        boolean boolean49 = mutableInterval44.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology50 = mutableInterval44.getChronology();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval(0L, 1L, chronology53);
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        java.lang.Object obj56 = mutableInterval54.clone();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval(obj56, chronology57);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        mutableInterval58.setPeriodAfterStart(readablePeriod59);
        org.joda.time.Period period61 = mutableInterval58.toPeriod();
        mutableInterval44.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period61);
        mutableInterval40.setPeriodAfterStart((org.joda.time.ReadablePeriod) period61);
        org.joda.time.Interval interval64 = mutableInterval40.toInterval();
        mutableInterval40.setInterval(1606267404625L, 1606267417416L);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval(0L, 1L, chronology70);
        long long72 = mutableInterval71.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval73 = mutableInterval71.copy();
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        mutableInterval71.setPeriodAfterStart(readablePeriod74);
        java.lang.Object obj76 = mutableInterval71.clone();
        org.joda.time.DateTime dateTime77 = mutableInterval71.getStart();
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval40.setEnd((org.joda.time.ReadableInstant) dateTime77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj56), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 1L + "'", long72 == 1L);
        org.junit.Assert.assertNotNull(mutableInterval73);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertEquals(obj76.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj76), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj76), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTime77);
    }

    @Test
    @Ignore
  public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.DateTime dateTime5 = mutableInterval3.getStart();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval(0L, 1L, chronology8);
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        java.lang.Object obj11 = mutableInterval9.clone();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(obj11, chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableInterval13.setPeriodAfterStart(readablePeriod14);
        org.joda.time.Period period16 = mutableInterval13.toPeriod();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadablePeriod) period16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval(0L, 1L, chronology20);
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        java.lang.Object obj23 = mutableInterval21.clone();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(obj23, chronology24);
        org.joda.time.Duration duration26 = mutableInterval25.toDuration();
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval(readableInstant28, readablePeriod29);
        long long31 = mutableInterval30.getEndMillis();
        org.joda.time.MutableInterval mutableInterval32 = mutableInterval30.copy();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(readableDuration33, readableInstant34);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = mutableInterval35.toPeriod(periodType36);
        mutableInterval30.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period37);
        org.joda.time.DateTime dateTime39 = mutableInterval30.getStart();
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((java.lang.Object) duration26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.Duration");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(duration26);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1606267588648L + "'", long31 == 1606267588648L);
        org.junit.Assert.assertNotNull(mutableInterval32);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(dateTime39);
    }

    @Test
    @Ignore
  public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        mutableInterval2.setDurationBeforeEnd(1L);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(0L, 1L, chronology7);
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        java.lang.Object obj10 = mutableInterval8.clone();
        mutableInterval8.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology13 = mutableInterval8.getChronology();
        mutableInterval2.setChronology(chronology13);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, 1L, chronology17);
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        mutableInterval18.setDurationAfterStart((long) (byte) 1);
        mutableInterval18.setDurationAfterStart((long) '#');
        boolean boolean24 = mutableInterval2.isBefore((org.joda.time.ReadableInterval) mutableInterval18);
        long long25 = mutableInterval18.toDurationMillis();
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35L + "'", long25 == 35L);
    }

    @Test
    @Ignore
  public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval(0L, 1L, chronology4);
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        mutableInterval5.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        mutableInterval12.setDurationAfterStart((long) (byte) 1);
        boolean boolean17 = mutableInterval12.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology18 = mutableInterval12.getChronology();
        mutableInterval5.setChronology(chronology18);
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) '4', (long) 'a', chronology18);
        org.joda.time.MutableInterval mutableInterval22 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval(0L, 1L, chronology25);
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        java.lang.Object obj28 = mutableInterval26.clone();
        org.joda.time.Interval interval29 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval(0L, 1L, chronology32);
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        java.lang.Object obj35 = mutableInterval33.clone();
        boolean boolean36 = interval29.isBefore((org.joda.time.ReadableInterval) mutableInterval33);
        boolean boolean37 = mutableInterval22.isAfter((org.joda.time.ReadableInterval) mutableInterval33);
        org.joda.time.Chronology chronology38 = mutableInterval33.getChronology();
        mutableInterval20.setChronology(chronology38);
        org.joda.time.Period period40 = mutableInterval20.toPeriod();
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval(readableInstant41, readablePeriod42);
        mutableInterval43.setDurationBeforeEnd(1L);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(0L, 1L, chronology48);
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        java.lang.Object obj51 = mutableInterval49.clone();
        mutableInterval49.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology54 = mutableInterval49.getChronology();
        mutableInterval43.setChronology(chronology54);
        mutableInterval43.setStartMillis(1L);
        org.joda.time.MutableInterval mutableInterval58 = mutableInterval43.copy();
        org.joda.time.MutableInterval mutableInterval59 = mutableInterval58.copy();
        boolean boolean60 = mutableInterval20.isBefore((org.joda.time.ReadableInterval) mutableInterval59);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(mutableInterval22);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(mutableInterval58);
        org.junit.Assert.assertNotNull(mutableInterval59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("2020-11-25T01:23:34.694Z/2020-11-25T01:23:34.694Z");
        org.joda.time.Period period2 = mutableInterval1.toPeriod();
        org.joda.time.MutableInterval mutableInterval3 = mutableInterval1.toMutableInterval();
        long long4 = mutableInterval3.getEndMillis();
        org.junit.Assert.assertNotNull(mutableInterval1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(mutableInterval3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1606267414694L + "'", long4 == 1606267414694L);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableInterval3.setPeriodAfterStart(readablePeriod4);
        org.joda.time.DateTime dateTime6 = mutableInterval3.getEnd();
        boolean boolean8 = mutableInterval3.contains(1606267453388L);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = mutableInterval3.toPeriod(periodType9);
        boolean boolean12 = mutableInterval3.contains(0L);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    @Ignore
  public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        long long12 = interval11.getEndMillis();
        boolean boolean14 = interval11.isAfter((long) (byte) 100);
        boolean boolean15 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) interval11);
        org.joda.time.Duration duration16 = mutableInterval3.toDuration();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.DateTime dateTime22 = mutableInterval20.getStart();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(readableInstant23, readablePeriod24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(0L, 1L, chronology28);
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.DateTime dateTime31 = mutableInterval29.getStart();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(0L, 1L, chronology34);
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.DateTime dateTime37 = mutableInterval35.getStart();
        mutableInterval25.setInterval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(0L, 1L, chronology43);
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        mutableInterval44.setDurationAfterStart((long) (byte) 1);
        mutableInterval44.setDurationAfterStart((long) '#');
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval(0L, 1L, chronology52);
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.DateTime dateTime55 = mutableInterval53.getStart();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval(0L, 1L, chronology58);
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        java.lang.Object obj61 = mutableInterval59.clone();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval(obj61, chronology62);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        mutableInterval63.setPeriodAfterStart(readablePeriod64);
        org.joda.time.Period period66 = mutableInterval63.toPeriod();
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadablePeriod) period66);
        boolean boolean68 = mutableInterval44.isBefore((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime55);
        mutableInterval69.setInterval(1606267376702L, 1606267383550L);
        long long73 = mutableInterval69.getStartMillis();
        boolean boolean74 = mutableInterval69.isAfterNow();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals(obj61.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj61), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj61), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1606267376702L + "'", long73 == 1606267376702L);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        boolean boolean8 = mutableInterval3.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology9 = mutableInterval3.getChronology();
        java.lang.Class<?> wildcardClass10 = chronology9.getClass();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    @Ignore
  public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.DateTime dateTime5 = mutableInterval3.getStart();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval(0L, 1L, chronology8);
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        java.lang.Object obj11 = mutableInterval9.clone();
        org.joda.time.Interval interval12 = mutableInterval9.toInterval();
        org.joda.time.ReadableInterval readableInterval13 = null;
        boolean boolean14 = mutableInterval9.isBefore(readableInterval13);
        org.joda.time.MutableInterval mutableInterval15 = mutableInterval9.copy();
        boolean boolean16 = mutableInterval3.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        mutableInterval20.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval(0L, 1L, chronology26);
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        java.lang.Object obj29 = mutableInterval27.clone();
        org.joda.time.Interval interval30 = mutableInterval27.toInterval();
        org.joda.time.ReadableInterval readableInterval31 = null;
        boolean boolean32 = mutableInterval27.isBefore(readableInterval31);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology35);
        boolean boolean37 = mutableInterval27.isAfter((org.joda.time.ReadableInterval) mutableInterval36);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval(0L, 1L, chronology40);
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.DateTime dateTime43 = mutableInterval41.getStart();
        boolean boolean44 = mutableInterval27.isBefore((org.joda.time.ReadableInstant) dateTime43);
        boolean boolean45 = mutableInterval20.contains((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(0L, 1L, chronology48);
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        java.lang.Object obj51 = mutableInterval49.clone();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval(obj51, chronology52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        mutableInterval53.setPeriodAfterStart(readablePeriod54);
        org.joda.time.Period period56 = mutableInterval53.toPeriod();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval(0L, 1L, chronology59);
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        java.lang.Object obj62 = mutableInterval60.clone();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval(obj62, chronology63);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        mutableInterval64.setPeriodAfterStart(readablePeriod65);
        org.joda.time.Period period67 = mutableInterval64.toPeriod();
        mutableInterval53.setPeriodAfterStart((org.joda.time.ReadablePeriod) period67);
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadablePeriod) period67);
        boolean boolean70 = mutableInterval3.equals((java.lang.Object) mutableInterval69);
        org.joda.time.Chronology chronology71 = mutableInterval3.getChronology();
        org.joda.time.ReadableInterval readableInterval72 = null;
        boolean boolean73 = mutableInterval3.contains(readableInterval72);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(mutableInterval15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    @Ignore
  public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(obj5, chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableInterval7.setPeriodBeforeEnd(readablePeriod8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(0L, 1L, chronology12);
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        mutableInterval13.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        long long22 = interval21.getEndMillis();
        boolean boolean24 = interval21.isAfter((long) (byte) 100);
        boolean boolean25 = mutableInterval13.overlaps((org.joda.time.ReadableInterval) interval21);
        org.joda.time.Duration duration26 = mutableInterval13.toDuration();
        boolean boolean27 = mutableInterval7.isBefore((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.MutableInterval mutableInterval28 = mutableInterval13.toMutableInterval();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval(0L, 1L, chronology31);
        org.joda.time.ReadableDuration readableDuration33 = null;
        mutableInterval32.setDurationBeforeEnd(readableDuration33);
        boolean boolean35 = mutableInterval13.isBefore((org.joda.time.ReadableInterval) mutableInterval32);
        org.joda.time.MutableInterval mutableInterval37 = org.joda.time.MutableInterval.parse("1969-12-31T23:59:59.999Z/1969-12-31T23:59:59.999Z");
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval(10L, (long) (short) 100);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval(readableDuration41, readableInstant42);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = mutableInterval43.toPeriod(periodType44);
        mutableInterval40.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period45);
        boolean boolean47 = mutableInterval40.isAfterNow();
        boolean boolean49 = mutableInterval40.isBefore(1606267311991L);
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = mutableInterval40.toPeriod(periodType50);
        mutableInterval37.setPeriodAfterStart((org.joda.time.ReadablePeriod) period51);
        mutableInterval13.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period51);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(mutableInterval28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(mutableInterval37);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(period51);
    }

    @Test
    @Ignore
  public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableDuration0, readableInstant1);
        org.joda.time.MutableInterval mutableInterval3 = mutableInterval2.toMutableInterval();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(0L, 1L, chronology6);
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        java.lang.Object obj9 = mutableInterval7.clone();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval(obj9, chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableInterval11.setPeriodBeforeEnd(readablePeriod12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval(0L, 1L, chronology16);
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        mutableInterval17.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval(0L, 1L, chronology23);
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        long long26 = interval25.getEndMillis();
        boolean boolean28 = interval25.isAfter((long) (byte) 100);
        boolean boolean29 = mutableInterval17.overlaps((org.joda.time.ReadableInterval) interval25);
        org.joda.time.Duration duration30 = mutableInterval17.toDuration();
        boolean boolean31 = mutableInterval11.isBefore((org.joda.time.ReadableInterval) mutableInterval17);
        org.joda.time.MutableInterval mutableInterval32 = mutableInterval17.toMutableInterval();
        java.lang.String str33 = mutableInterval32.toString();
        boolean boolean34 = mutableInterval32.containsNow();
        org.joda.time.Duration duration35 = mutableInterval32.toDuration();
        mutableInterval3.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration35);
        mutableInterval3.setDurationBeforeEnd(1606267527643L);
        org.junit.Assert.assertNotNull(mutableInterval3);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(mutableInterval32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z" + "'", str33, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(duration35);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        mutableInterval2.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval5 = mutableInterval2.toMutableInterval();
        java.lang.String str6 = mutableInterval2.toString();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = mutableInterval2.toPeriod(periodType7);
        boolean boolean9 = mutableInterval2.isAfterNow();
        org.junit.Assert.assertNotNull(mutableInterval5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:26:29.534Z/2020-11-25T01:26:29.535Z" + "'", str6, "2020-11-25T01:26:29.534Z/2020-11-25T01:26:29.535Z");
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    @Ignore
  public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        boolean boolean8 = mutableInterval3.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology9 = mutableInterval3.getChronology();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(0L, 1L, chronology12);
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        java.lang.Object obj15 = mutableInterval13.clone();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval(obj15, chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableInterval17.setPeriodAfterStart(readablePeriod18);
        org.joda.time.Period period20 = mutableInterval17.toPeriod();
        mutableInterval3.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period20);
        org.joda.time.MutableInterval mutableInterval22 = mutableInterval3.toMutableInterval();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(readableDuration23, readableInstant24);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = mutableInterval25.toPeriod(periodType26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval(readableInstant28, readablePeriod29);
        long long31 = mutableInterval30.getEndMillis();
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval(readableInstant32, readablePeriod33);
        mutableInterval34.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval37 = mutableInterval34.toMutableInterval();
        org.joda.time.DateTime dateTime38 = mutableInterval37.getEnd();
        boolean boolean39 = mutableInterval30.isAfter((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period27, (org.joda.time.ReadableInstant) dateTime38);
        boolean boolean41 = mutableInterval3.contains((org.joda.time.ReadableInterval) mutableInterval40);
        boolean boolean42 = mutableInterval40.isBeforeNow();
        org.joda.time.DateTime dateTime43 = mutableInterval40.getEnd();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval(0L, 1L, chronology46);
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        mutableInterval47.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval(0L, 1L, chronology53);
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        long long56 = interval55.getEndMillis();
        boolean boolean58 = interval55.isAfter((long) (byte) 100);
        boolean boolean59 = mutableInterval47.overlaps((org.joda.time.ReadableInterval) interval55);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval(readableInstant60, readablePeriod61);
        mutableInterval62.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval65 = mutableInterval62.toMutableInterval();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval(0L, 1L, chronology68);
        long long70 = mutableInterval69.toDurationMillis();
        mutableInterval62.setInterval((org.joda.time.ReadableInterval) mutableInterval69);
        org.joda.time.Duration duration72 = mutableInterval69.toDuration();
        mutableInterval47.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration72);
        boolean boolean75 = mutableInterval47.contains(1606267328077L);
        long long76 = mutableInterval47.getStartMillis();
        org.joda.time.Duration duration77 = mutableInterval47.toDuration();
        org.joda.time.MutableInterval mutableInterval78 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableDuration) duration77);
        java.lang.Class<?> wildcardClass79 = duration77.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval80 = new org.joda.time.MutableInterval((java.lang.Object) duration77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.Duration");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(mutableInterval22);
        org.junit.Assert.assertNotNull(period27);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1606267589599L + "'", long31 == 1606267589599L);
        org.junit.Assert.assertNotNull(mutableInterval37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(mutableInterval65);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertNotNull(duration77);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    @Ignore
  public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (-1), (long) (byte) 100);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval(0L, 1L, chronology5);
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        java.lang.Object obj8 = mutableInterval6.clone();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(obj8, chronology9);
        org.joda.time.DateTime dateTime11 = mutableInterval10.getEnd();
        boolean boolean12 = mutableInterval2.isBefore((org.joda.time.ReadableInstant) dateTime11);
        boolean boolean14 = mutableInterval2.contains(1606267374942L);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, 1L, chronology17);
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.DateTime dateTime20 = mutableInterval18.getStart();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval(readableInstant21, readablePeriod22);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval(0L, 1L, chronology26);
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.DateTime dateTime29 = mutableInterval27.getStart();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval(0L, 1L, chronology32);
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.DateTime dateTime35 = mutableInterval33.getStart();
        mutableInterval23.setInterval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime35);
        boolean boolean38 = mutableInterval2.isAfter((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.MutableInterval mutableInterval39 = mutableInterval2.toMutableInterval();
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(mutableInterval39);
    }

    @Test
    @Ignore
  public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval(0L, 1L, chronology4);
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        java.lang.Object obj7 = mutableInterval5.clone();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval(obj7, chronology8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableInterval9.setPeriodAfterStart(readablePeriod10);
        org.joda.time.Period period12 = mutableInterval9.toPeriod();
        org.joda.time.MutableInterval mutableInterval13 = mutableInterval9.copy();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval(0L, 1L, chronology16);
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.DateTime dateTime19 = mutableInterval17.getStart();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval(readableInstant20, readablePeriod21);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval(0L, 1L, chronology25);
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.DateTime dateTime28 = mutableInterval26.getStart();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval(0L, 1L, chronology31);
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.DateTime dateTime34 = mutableInterval32.getStart();
        mutableInterval22.setInterval((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime34);
        boolean boolean37 = mutableInterval13.isBefore((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Chronology chronology38 = mutableInterval13.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval(10L, 0L, chronology38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(chronology38);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(readableDuration5, readableInstant6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableInterval11.setPeriodBeforeEnd(readablePeriod12);
        mutableInterval7.setInterval((org.joda.time.ReadableInterval) mutableInterval11);
        mutableInterval7.setDurationAfterStart(1606267313258L);
        boolean boolean17 = interval4.contains((org.joda.time.ReadableInterval) mutableInterval7);
        org.joda.time.DateTime dateTime18 = mutableInterval7.getStart();
        mutableInterval7.setEndMillis(1606267552718L);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableDuration0, readableInstant1);
        org.joda.time.MutableInterval mutableInterval3 = mutableInterval2.toMutableInterval();
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval3.setEndMillis(1606267502629L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableInterval3);
    }

    @Test
    @Ignore
  public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.DateTime dateTime5 = mutableInterval3.getStart();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval(0L, 1L, chronology8);
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        java.lang.Object obj11 = mutableInterval9.clone();
        org.joda.time.Interval interval12 = mutableInterval9.toInterval();
        org.joda.time.ReadableInterval readableInterval13 = null;
        boolean boolean14 = mutableInterval9.isBefore(readableInterval13);
        org.joda.time.MutableInterval mutableInterval15 = mutableInterval9.copy();
        boolean boolean16 = mutableInterval3.contains((org.joda.time.ReadableInterval) mutableInterval9);
        mutableInterval9.setInterval((long) '#', 1606267300661L);
        org.joda.time.Chronology chronology20 = mutableInterval9.getChronology();
        boolean boolean21 = mutableInterval9.isBeforeNow();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval(readableInstant22, readablePeriod23);
        mutableInterval24.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval27 = mutableInterval24.toMutableInterval();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval(0L, 1L, chronology30);
        long long32 = mutableInterval31.toDurationMillis();
        mutableInterval24.setInterval((org.joda.time.ReadableInterval) mutableInterval31);
        boolean boolean34 = mutableInterval9.isBefore((org.joda.time.ReadableInterval) mutableInterval31);
        org.joda.time.DateTime dateTime35 = mutableInterval31.getEnd();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval(0L, 1L, chronology40);
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        mutableInterval41.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval(0L, 1L, chronology47);
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        mutableInterval48.setDurationAfterStart((long) (byte) 1);
        boolean boolean53 = mutableInterval48.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology54 = mutableInterval48.getChronology();
        mutableInterval41.setChronology(chronology54);
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (-1), (long) '4', chronology54);
        java.lang.Object obj57 = mutableInterval56.clone();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval(0L, 1L, chronology60);
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        java.lang.Object obj63 = mutableInterval61.clone();
        org.joda.time.ReadableDuration readableDuration64 = null;
        mutableInterval61.setDurationAfterStart(readableDuration64);
        boolean boolean66 = mutableInterval56.contains((org.joda.time.ReadableInterval) mutableInterval61);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval(0L, 1L, chronology69);
        org.joda.time.Interval interval71 = mutableInterval70.toInterval();
        mutableInterval70.setDurationAfterStart((long) (byte) 1);
        boolean boolean75 = mutableInterval70.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology76 = mutableInterval70.getChronology();
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutableInterval mutableInterval80 = new org.joda.time.MutableInterval(0L, 1L, chronology79);
        org.joda.time.Interval interval81 = mutableInterval80.toInterval();
        java.lang.Object obj82 = mutableInterval80.clone();
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.MutableInterval mutableInterval84 = new org.joda.time.MutableInterval(obj82, chronology83);
        org.joda.time.ReadablePeriod readablePeriod85 = null;
        mutableInterval84.setPeriodAfterStart(readablePeriod85);
        org.joda.time.Period period87 = mutableInterval84.toPeriod();
        mutableInterval70.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period87);
        mutableInterval61.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period87);
        org.joda.time.MutableInterval mutableInterval90 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadablePeriod) period87);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(mutableInterval15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(mutableInterval27);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.052Z");
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertEquals(obj63.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj63), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj63), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertEquals(obj82.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj82), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj82), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period87);
    }

    @Test
    @Ignore
  public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(obj5, chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableInterval7.setPeriodBeforeEnd(readablePeriod8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(0L, 1L, chronology12);
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        mutableInterval13.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        long long22 = interval21.getEndMillis();
        boolean boolean24 = interval21.isAfter((long) (byte) 100);
        boolean boolean25 = mutableInterval13.overlaps((org.joda.time.ReadableInterval) interval21);
        org.joda.time.Duration duration26 = mutableInterval13.toDuration();
        boolean boolean27 = mutableInterval7.isBefore((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.MutableInterval mutableInterval28 = mutableInterval13.toMutableInterval();
        java.lang.String str29 = mutableInterval28.toString();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval(0L, 1L, chronology32);
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        java.lang.Object obj35 = mutableInterval33.clone();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval(obj35, chronology36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableInterval37.setPeriodBeforeEnd(readablePeriod38);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval(readableInstant40, readablePeriod41);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval(0L, 1L, chronology45);
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.DateTime dateTime48 = mutableInterval46.getStart();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval(0L, 1L, chronology51);
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.DateTime dateTime54 = mutableInterval52.getStart();
        mutableInterval42.setInterval((org.joda.time.ReadableInstant) dateTime48, (org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval(0L, 1L, chronology58);
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        java.lang.Object obj61 = mutableInterval59.clone();
        org.joda.time.Interval interval62 = mutableInterval59.toInterval();
        org.joda.time.ReadableInterval readableInterval63 = null;
        boolean boolean64 = mutableInterval59.isBefore(readableInterval63);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology67);
        boolean boolean69 = mutableInterval59.isAfter((org.joda.time.ReadableInterval) mutableInterval68);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval(0L, 1L, chronology72);
        org.joda.time.Interval interval74 = mutableInterval73.toInterval();
        org.joda.time.DateTime dateTime75 = mutableInterval73.getStart();
        boolean boolean76 = mutableInterval59.isBefore((org.joda.time.ReadableInstant) dateTime75);
        mutableInterval37.setInterval((org.joda.time.ReadableInstant) dateTime48, (org.joda.time.ReadableInstant) dateTime75);
        boolean boolean78 = mutableInterval28.isAfter((org.joda.time.ReadableInstant) dateTime48);
        boolean boolean79 = mutableInterval28.isAfterNow();
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval(0L, 1L, chronology82);
        org.joda.time.Interval interval84 = mutableInterval83.toInterval();
        java.lang.Object obj85 = mutableInterval83.clone();
        mutableInterval83.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology88 = mutableInterval83.getChronology();
        org.joda.time.MutableInterval mutableInterval89 = mutableInterval83.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval90 = mutableInterval83.copy();
        boolean boolean92 = mutableInterval90.isBefore((long) (short) -1);
        boolean boolean93 = mutableInterval28.contains((org.joda.time.ReadableInterval) mutableInterval90);
        boolean boolean94 = mutableInterval28.isBeforeNow();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(mutableInterval28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z" + "'", str29, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals(obj61.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj61), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj61), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(interval74);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(interval84);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertEquals(obj85.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj85), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj85), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology88);
        org.junit.Assert.assertNotNull(mutableInterval89);
        org.junit.Assert.assertNotNull(mutableInterval90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(1606267500818L, 1606267388349L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(0L, 1L, chronology6);
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        mutableInterval7.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval(0L, 1L, chronology13);
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        mutableInterval14.setDurationAfterStart((long) (byte) 1);
        boolean boolean19 = mutableInterval14.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology20 = mutableInterval14.getChronology();
        mutableInterval7.setChronology(chronology20);
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (-1), (long) '4', chronology20);
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) 1, (long) 100, chronology20);
        boolean boolean24 = mutableInterval23.isBeforeNow();
        org.joda.time.MutableInterval mutableInterval25 = mutableInterval23.copy();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(0L, 1L, chronology28);
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        mutableInterval29.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval(0L, 1L, chronology35);
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        java.lang.Object obj38 = mutableInterval36.clone();
        org.joda.time.Interval interval39 = mutableInterval36.toInterval();
        org.joda.time.ReadableInterval readableInterval40 = null;
        boolean boolean41 = mutableInterval36.isBefore(readableInterval40);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology44);
        boolean boolean46 = mutableInterval36.isAfter((org.joda.time.ReadableInterval) mutableInterval45);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval(0L, 1L, chronology49);
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.DateTime dateTime52 = mutableInterval50.getStart();
        boolean boolean53 = mutableInterval36.isBefore((org.joda.time.ReadableInstant) dateTime52);
        boolean boolean54 = mutableInterval29.contains((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval(readableInstant55, readablePeriod56);
        mutableInterval57.setDurationBeforeEnd(1L);
        boolean boolean60 = mutableInterval29.overlaps((org.joda.time.ReadableInterval) mutableInterval57);
        org.joda.time.Period period61 = mutableInterval57.toPeriod();
        mutableInterval23.setPeriodAfterStart((org.joda.time.ReadablePeriod) period61);
        org.joda.time.MutableInterval mutableInterval64 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval(0L, 1L, chronology67);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        mutableInterval68.setPeriodAfterStart(readablePeriod69);
        org.joda.time.DateTime dateTime71 = mutableInterval68.getEnd();
        boolean boolean72 = mutableInterval64.contains((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period61, (org.joda.time.ReadableInstant) dateTime71);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(mutableInterval25);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(mutableInterval64);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        mutableInterval2.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval5 = mutableInterval2.toMutableInterval();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval(0L, 1L, chronology8);
        long long10 = mutableInterval9.toDurationMillis();
        mutableInterval2.setInterval((org.joda.time.ReadableInterval) mutableInterval9);
        mutableInterval2.setDurationAfterStart(100L);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval(0L, 1L, chronology20);
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        mutableInterval21.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval(0L, 1L, chronology27);
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        mutableInterval28.setDurationAfterStart((long) (byte) 1);
        boolean boolean33 = mutableInterval28.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology34 = mutableInterval28.getChronology();
        mutableInterval21.setChronology(chronology34);
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (-1), (long) '4', chronology34);
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) 1, (long) 100, chronology34);
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval2, chronology34);
        org.joda.time.Duration duration39 = mutableInterval2.toDuration();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval(0L, 1L, chronology42);
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        mutableInterval43.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval(0L, 1L, chronology49);
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        long long52 = interval51.getEndMillis();
        boolean boolean54 = interval51.isAfter((long) (byte) 100);
        boolean boolean55 = mutableInterval43.overlaps((org.joda.time.ReadableInterval) interval51);
        org.joda.time.Duration duration56 = mutableInterval43.toDuration();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval(0L, 1L, chronology59);
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        org.joda.time.DateTime dateTime62 = mutableInterval60.getStart();
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval(readableInstant63, readablePeriod64);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval(0L, 1L, chronology68);
        org.joda.time.Interval interval70 = mutableInterval69.toInterval();
        org.joda.time.DateTime dateTime71 = mutableInterval69.getStart();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval(0L, 1L, chronology74);
        org.joda.time.Interval interval76 = mutableInterval75.toInterval();
        org.joda.time.DateTime dateTime77 = mutableInterval75.getStart();
        mutableInterval65.setInterval((org.joda.time.ReadableInstant) dateTime71, (org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.MutableInterval mutableInterval79 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime62, (org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.MutableInterval mutableInterval80 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration56, (org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        mutableInterval80.setPeriodAfterStart(readablePeriod81);
        org.joda.time.Chronology chronology83 = mutableInterval80.getChronology();
        long long84 = mutableInterval80.getStartMillis();
        org.joda.time.MutableInterval mutableInterval85 = mutableInterval80.copy();
        org.joda.time.DateTime dateTime86 = mutableInterval85.getEnd();
        org.joda.time.MutableInterval mutableInterval87 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration39, (org.joda.time.ReadableInstant) dateTime86);
        java.lang.Class<?> wildcardClass88 = dateTime86.getClass();
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(interval76);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(chronology83);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-1L) + "'", long84 == (-1L));
        org.junit.Assert.assertNotNull(mutableInterval85);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        mutableInterval2.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval5 = mutableInterval2.toMutableInterval();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval(0L, 1L, chronology8);
        long long10 = mutableInterval9.toDurationMillis();
        mutableInterval2.setInterval((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.DateTime dateTime12 = mutableInterval2.getEnd();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval(readableInstant13, readablePeriod14);
        long long16 = mutableInterval15.getEndMillis();
        org.joda.time.MutableInterval mutableInterval17 = mutableInterval15.copy();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(readableDuration18, readableInstant19);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = mutableInterval20.toPeriod(periodType21);
        mutableInterval15.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval(0L, 1L, chronology26);
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        mutableInterval27.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval(0L, 1L, chronology33);
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        long long36 = interval35.getEndMillis();
        boolean boolean38 = interval35.isAfter((long) (byte) 100);
        boolean boolean39 = mutableInterval27.overlaps((org.joda.time.ReadableInterval) interval35);
        org.joda.time.Duration duration40 = mutableInterval27.toDuration();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(0L, 1L, chronology43);
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.DateTime dateTime46 = mutableInterval44.getStart();
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(readableInstant47, readablePeriod48);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval(0L, 1L, chronology52);
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.DateTime dateTime55 = mutableInterval53.getStart();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval(0L, 1L, chronology58);
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.DateTime dateTime61 = mutableInterval59.getStart();
        mutableInterval49.setInterval((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration40, (org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval(0L, 1L, chronology67);
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        org.joda.time.DateTime dateTime70 = mutableInterval68.getStart();
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval(readableInstant71, readablePeriod72);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval(0L, 1L, chronology76);
        org.joda.time.Interval interval78 = mutableInterval77.toInterval();
        org.joda.time.DateTime dateTime79 = mutableInterval77.getStart();
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval(0L, 1L, chronology82);
        org.joda.time.Interval interval84 = mutableInterval83.toInterval();
        org.joda.time.DateTime dateTime85 = mutableInterval83.getStart();
        mutableInterval73.setInterval((org.joda.time.ReadableInstant) dateTime79, (org.joda.time.ReadableInstant) dateTime85);
        org.joda.time.MutableInterval mutableInterval87 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime70, (org.joda.time.ReadableInstant) dateTime85);
        org.joda.time.DateTime dateTime88 = mutableInterval87.getStart();
        org.joda.time.MutableInterval mutableInterval89 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime61, (org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.MutableInterval mutableInterval90 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period22, (org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.MutableInterval mutableInterval91 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadablePeriod) period22);
        long long92 = mutableInterval91.getStartMillis();
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606267590750L + "'", long16 == 1606267590750L);
        org.junit.Assert.assertNotNull(mutableInterval17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(interval78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(interval84);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 1L + "'", long92 == 1L);
    }

    @Test
    @Ignore
  public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(obj5, chronology6);
        org.joda.time.Duration duration8 = mutableInterval7.toDuration();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        java.lang.Object obj14 = mutableInterval12.clone();
        mutableInterval12.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology17 = mutableInterval12.getChronology();
        org.joda.time.MutableInterval mutableInterval18 = mutableInterval12.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval19 = mutableInterval12.copy();
        org.joda.time.Duration duration20 = mutableInterval12.toDuration();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval(0L, 1L, chronology23);
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.DateTime dateTime26 = mutableInterval24.getStart();
        mutableInterval12.setStart((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval(0L, 1L, chronology30);
        long long32 = mutableInterval31.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval33 = mutableInterval31.copy();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval(0L, 1L, chronology36);
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        java.lang.Object obj39 = mutableInterval37.clone();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval(obj39, chronology40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        mutableInterval41.setPeriodBeforeEnd(readablePeriod42);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval(0L, 1L, chronology46);
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        mutableInterval47.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval(0L, 1L, chronology53);
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        long long56 = interval55.getEndMillis();
        boolean boolean58 = interval55.isAfter((long) (byte) 100);
        boolean boolean59 = mutableInterval47.overlaps((org.joda.time.ReadableInterval) interval55);
        org.joda.time.Duration duration60 = mutableInterval47.toDuration();
        boolean boolean61 = mutableInterval41.isBefore((org.joda.time.ReadableInterval) mutableInterval47);
        org.joda.time.MutableInterval mutableInterval62 = mutableInterval47.toMutableInterval();
        java.lang.String str63 = mutableInterval62.toString();
        boolean boolean64 = mutableInterval62.containsNow();
        org.joda.time.Duration duration65 = mutableInterval62.toDuration();
        mutableInterval33.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration65);
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableDuration) duration65);
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration8, (org.joda.time.ReadableInstant) dateTime26);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(mutableInterval18);
        org.junit.Assert.assertNotNull(mutableInterval19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertNotNull(mutableInterval33);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(mutableInterval62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z" + "'", str63, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(duration65);
    }

    @Test
    @Ignore
  public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.DateTime dateTime5 = mutableInterval3.getStart();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(readableInstant6, readablePeriod7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.DateTime dateTime14 = mutableInterval12.getStart();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, 1L, chronology17);
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.DateTime dateTime20 = mutableInterval18.getStart();
        mutableInterval8.setInterval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime23 = mutableInterval22.getStart();
        boolean boolean25 = mutableInterval22.isBefore((long) (short) 10);
        org.joda.time.Interval interval26 = mutableInterval22.toInterval();
        java.lang.Object obj27 = mutableInterval22.clone();
        boolean boolean29 = mutableInterval22.isBefore(1606267439120L);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (byte) 0, (long) (short) 100);
        boolean boolean4 = mutableInterval2.isBefore(1606267397130L);
        org.joda.time.MutableInterval mutableInterval5 = mutableInterval2.toMutableInterval();
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableInterval2.setDurationAfterStart(readableDuration6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(mutableInterval5);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableInterval3.setPeriodAfterStart(readablePeriod4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(readableInstant6, readablePeriod7);
        mutableInterval8.setDurationBeforeEnd(1L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval(0L, 1L, chronology13);
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        mutableInterval14.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval(0L, 1L, chronology20);
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        long long23 = interval22.getEndMillis();
        boolean boolean25 = interval22.isAfter((long) (byte) 100);
        boolean boolean26 = mutableInterval14.overlaps((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Duration duration27 = mutableInterval14.toDuration();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval(0L, 1L, chronology30);
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        mutableInterval31.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval(0L, 1L, chronology37);
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        long long40 = interval39.getEndMillis();
        boolean boolean42 = interval39.isAfter((long) (byte) 100);
        boolean boolean43 = mutableInterval31.overlaps((org.joda.time.ReadableInterval) interval39);
        org.joda.time.Duration duration44 = mutableInterval31.toDuration();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval(0L, 1L, chronology47);
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.DateTime dateTime50 = mutableInterval48.getStart();
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval(readableInstant51, readablePeriod52);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval(0L, 1L, chronology56);
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.DateTime dateTime59 = mutableInterval57.getStart();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval(0L, 1L, chronology62);
        org.joda.time.Interval interval64 = mutableInterval63.toInterval();
        org.joda.time.DateTime dateTime65 = mutableInterval63.getStart();
        mutableInterval53.setInterval((org.joda.time.ReadableInstant) dateTime59, (org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration44, (org.joda.time.ReadableInstant) dateTime65);
        mutableInterval14.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration44);
        mutableInterval8.setInterval((org.joda.time.ReadableInterval) mutableInterval14);
        boolean boolean71 = mutableInterval3.contains((org.joda.time.ReadableInterval) mutableInterval14);
        long long72 = mutableInterval14.getStartMillis();
        boolean boolean74 = mutableInterval14.isBefore(1606267396760L);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    @Ignore
  public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval(0L, 1L, chronology4);
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        java.lang.Object obj7 = mutableInterval5.clone();
        org.joda.time.Interval interval8 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        java.lang.Object obj14 = mutableInterval12.clone();
        boolean boolean15 = interval8.isBefore((org.joda.time.ReadableInterval) mutableInterval12);
        boolean boolean16 = mutableInterval1.isAfter((org.joda.time.ReadableInterval) mutableInterval12);
        org.joda.time.MutableInterval mutableInterval17 = mutableInterval12.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval17);
        org.junit.Assert.assertNotNull(mutableInterval1);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(mutableInterval17);
    }

    @Test
    @Ignore
  public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.DateTime dateTime5 = mutableInterval3.getStart();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval(0L, 1L, chronology8);
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        java.lang.Object obj11 = mutableInterval9.clone();
        org.joda.time.Interval interval12 = mutableInterval9.toInterval();
        org.joda.time.ReadableInterval readableInterval13 = null;
        boolean boolean14 = mutableInterval9.isBefore(readableInterval13);
        org.joda.time.MutableInterval mutableInterval15 = mutableInterval9.copy();
        boolean boolean16 = mutableInterval3.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval9);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval(0L, 1L, chronology21);
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        java.lang.Object obj24 = mutableInterval22.clone();
        mutableInterval22.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology27 = mutableInterval22.getChronology();
        org.joda.time.MutableInterval mutableInterval28 = mutableInterval22.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval29 = mutableInterval22.copy();
        org.joda.time.Duration duration30 = mutableInterval22.toDuration();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval(0L, 1L, chronology33);
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.DateTime dateTime36 = mutableInterval34.getStart();
        mutableInterval22.setStart((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval(0L, 1L, chronology40);
        long long42 = mutableInterval41.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval43 = mutableInterval41.copy();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval(0L, 1L, chronology46);
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        java.lang.Object obj49 = mutableInterval47.clone();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval(obj49, chronology50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        mutableInterval51.setPeriodBeforeEnd(readablePeriod52);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval(0L, 1L, chronology56);
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        mutableInterval57.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval(0L, 1L, chronology63);
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        long long66 = interval65.getEndMillis();
        boolean boolean68 = interval65.isAfter((long) (byte) 100);
        boolean boolean69 = mutableInterval57.overlaps((org.joda.time.ReadableInterval) interval65);
        org.joda.time.Duration duration70 = mutableInterval57.toDuration();
        boolean boolean71 = mutableInterval51.isBefore((org.joda.time.ReadableInterval) mutableInterval57);
        org.joda.time.MutableInterval mutableInterval72 = mutableInterval57.toMutableInterval();
        java.lang.String str73 = mutableInterval72.toString();
        boolean boolean74 = mutableInterval72.containsNow();
        org.joda.time.Duration duration75 = mutableInterval72.toDuration();
        mutableInterval43.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration75);
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableDuration) duration75);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval9.setInterval(readableInstant18, (org.joda.time.ReadableInstant) dateTime36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(mutableInterval15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(mutableInterval28);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertNotNull(mutableInterval43);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(mutableInterval72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z" + "'", str73, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(duration75);
    }

    @Test
    @Ignore
  public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        mutableInterval2.setDurationBeforeEnd(1L);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(0L, 1L, chronology7);
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        java.lang.Object obj10 = mutableInterval8.clone();
        mutableInterval8.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology13 = mutableInterval8.getChronology();
        mutableInterval2.setChronology(chronology13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval(readableInstant15, readablePeriod16);
        mutableInterval17.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval20 = mutableInterval17.toMutableInterval();
        org.joda.time.Period period21 = mutableInterval17.toPeriod();
        mutableInterval17.setDurationBeforeEnd((long) '#');
        boolean boolean24 = mutableInterval2.isBefore((org.joda.time.ReadableInterval) mutableInterval17);
        org.joda.time.Duration duration25 = mutableInterval2.toDuration();
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(mutableInterval20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(duration25);
    }

    @Test
    @Ignore
  public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        long long4 = mutableInterval3.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval5 = mutableInterval3.copy();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableInterval3.setPeriodAfterStart(readablePeriod6);
        java.lang.Object obj8 = mutableInterval3.clone();
        boolean boolean10 = mutableInterval3.isBefore(1606267386825L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval(0L, 1L, chronology13);
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.DateTime dateTime16 = mutableInterval14.getStart();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        java.lang.Object obj22 = mutableInterval20.clone();
        org.joda.time.Interval interval23 = mutableInterval20.toInterval();
        org.joda.time.ReadableInterval readableInterval24 = null;
        boolean boolean25 = mutableInterval20.isBefore(readableInterval24);
        org.joda.time.MutableInterval mutableInterval26 = mutableInterval20.copy();
        boolean boolean27 = mutableInterval14.contains((org.joda.time.ReadableInterval) mutableInterval20);
        mutableInterval20.setInterval((long) '#', 1606267300661L);
        org.joda.time.Chronology chronology31 = mutableInterval20.getChronology();
        long long32 = mutableInterval20.toDurationMillis();
        mutableInterval20.setDurationAfterStart(1606267354802L);
        boolean boolean35 = mutableInterval3.contains((org.joda.time.ReadableInterval) mutableInterval20);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval3.setStartMillis(1606267421707L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(mutableInterval26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1606267300626L + "'", long32 == 1606267300626L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    @Ignore
  public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(obj5, chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableInterval7.setPeriodBeforeEnd(readablePeriod8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(readableInstant10, readablePeriod11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval(0L, 1L, chronology15);
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.DateTime dateTime18 = mutableInterval16.getStart();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval(0L, 1L, chronology21);
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.DateTime dateTime24 = mutableInterval22.getStart();
        mutableInterval12.setInterval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(0L, 1L, chronology28);
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        java.lang.Object obj31 = mutableInterval29.clone();
        org.joda.time.Interval interval32 = mutableInterval29.toInterval();
        org.joda.time.ReadableInterval readableInterval33 = null;
        boolean boolean34 = mutableInterval29.isBefore(readableInterval33);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology37);
        boolean boolean39 = mutableInterval29.isAfter((org.joda.time.ReadableInterval) mutableInterval38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval(0L, 1L, chronology42);
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.DateTime dateTime45 = mutableInterval43.getStart();
        boolean boolean46 = mutableInterval29.isBefore((org.joda.time.ReadableInstant) dateTime45);
        mutableInterval7.setInterval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval(0L, 1L, chronology50);
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.DateTime dateTime53 = mutableInterval51.getStart();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval(0L, 1L, chronology56);
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        java.lang.Object obj59 = mutableInterval57.clone();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval(obj59, chronology60);
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        mutableInterval61.setPeriodAfterStart(readablePeriod62);
        org.joda.time.Period period64 = mutableInterval61.toPeriod();
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime53, (org.joda.time.ReadablePeriod) period64);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval(0L, 1L, chronology68);
        org.joda.time.Interval interval70 = mutableInterval69.toInterval();
        java.lang.Object obj71 = mutableInterval69.clone();
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval(obj71, chronology72);
        org.joda.time.Duration duration74 = mutableInterval73.toDuration();
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime53, (org.joda.time.ReadableDuration) duration74);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.MutableInterval mutableInterval79 = new org.joda.time.MutableInterval(0L, 1L, chronology78);
        org.joda.time.Interval interval80 = mutableInterval79.toInterval();
        java.lang.Object obj81 = mutableInterval79.clone();
        mutableInterval79.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology84 = mutableInterval79.getChronology();
        org.joda.time.MutableInterval mutableInterval85 = mutableInterval79.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval86 = mutableInterval79.copy();
        org.joda.time.Duration duration87 = mutableInterval79.toDuration();
        org.joda.time.MutableInterval mutableInterval88 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime53, (org.joda.time.ReadableDuration) duration87);
        org.joda.time.MutableInterval mutableInterval89 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableDuration) duration87);
        java.lang.Class<?> wildcardClass90 = mutableInterval89.getClass();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals(obj59.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj59), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj59), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertEquals(obj71.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj71), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj71), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertNotNull(interval80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertEquals(obj81.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj81), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj81), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology84);
        org.junit.Assert.assertNotNull(mutableInterval85);
        org.junit.Assert.assertNotNull(mutableInterval86);
        org.junit.Assert.assertNotNull(duration87);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableInterval3.setPeriodBeforeEnd(readablePeriod4);
        mutableInterval3.setStartMillis((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(readableInstant8, readablePeriod9);
        long long11 = mutableInterval10.getEndMillis();
        boolean boolean12 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) mutableInterval10);
        boolean boolean13 = mutableInterval10.isAfterNow();
        boolean boolean14 = mutableInterval10.isAfterNow();
        org.joda.time.Interval interval15 = mutableInterval10.toInterval();
        boolean boolean17 = mutableInterval10.contains(1606267412356L);
        boolean boolean18 = mutableInterval10.containsNow();
        mutableInterval10.setDurationBeforeEnd(1606267529534L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1606267591862L + "'", long11 == 1606267591862L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    @Ignore
  public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        java.lang.Object obj6 = mutableInterval3.clone();
        org.joda.time.Duration duration7 = mutableInterval3.toDuration();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(1606267376940L, 1606267394790L);
        org.joda.time.Chronology chronology3 = mutableInterval2.getChronology();
        org.joda.time.Chronology chronology4 = mutableInterval2.getChronology();
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableDuration0, readableInstant1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableInterval6.setPeriodBeforeEnd(readablePeriod7);
        mutableInterval2.setInterval((org.joda.time.ReadableInterval) mutableInterval6);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval2);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = mutableInterval2.toPeriod(periodType11);
        long long13 = mutableInterval2.getEndMillis();
        org.joda.time.MutableInterval mutableInterval14 = mutableInterval2.copy();
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(mutableInterval14);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableDuration0, readableInstant1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableInterval6.setPeriodBeforeEnd(readablePeriod7);
        mutableInterval2.setInterval((org.joda.time.ReadableInterval) mutableInterval6);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval2);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = mutableInterval2.toPeriod(periodType11);
        long long13 = mutableInterval2.getEndMillis();
        boolean boolean15 = mutableInterval2.isAfter(0L);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval(0L, 1L, chronology18);
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        boolean boolean22 = mutableInterval19.contains((long) ' ');
        org.joda.time.MutableInterval mutableInterval23 = mutableInterval19.copy();
        org.joda.time.Duration duration24 = mutableInterval19.toDuration();
        boolean boolean25 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval19);
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval2);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(mutableInterval23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    @Ignore
  public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(obj5, chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableInterval7.setPeriodAfterStart(readablePeriod8);
        org.joda.time.Period period10 = mutableInterval7.toPeriod();
        org.joda.time.MutableInterval mutableInterval11 = mutableInterval7.copy();
        long long12 = mutableInterval7.getEndMillis();
        org.joda.time.MutableInterval mutableInterval13 = mutableInterval7.toMutableInterval();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval(0L, 1L, chronology16);
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.DateTime dateTime19 = mutableInterval17.getStart();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval(0L, 1L, chronology22);
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        java.lang.Object obj25 = mutableInterval23.clone();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval(obj25, chronology26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableInterval27.setPeriodAfterStart(readablePeriod28);
        org.joda.time.Period period30 = mutableInterval27.toPeriod();
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadablePeriod) period30);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(0L, 1L, chronology34);
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        mutableInterval35.setDurationAfterStart((long) (byte) 1);
        boolean boolean40 = mutableInterval35.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology41 = mutableInterval35.getChronology();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval(0L, 1L, chronology44);
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        java.lang.Object obj47 = mutableInterval45.clone();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(obj47, chronology48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        mutableInterval49.setPeriodAfterStart(readablePeriod50);
        org.joda.time.Period period52 = mutableInterval49.toPeriod();
        mutableInterval35.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period52);
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadablePeriod) period52);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval(0L, 1L, chronology59);
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        java.lang.Object obj62 = mutableInterval60.clone();
        org.joda.time.Interval interval63 = mutableInterval60.toInterval();
        org.joda.time.ReadableInterval readableInterval64 = null;
        boolean boolean65 = mutableInterval60.isBefore(readableInterval64);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval(0L, 1L, chronology68);
        org.joda.time.Interval interval70 = mutableInterval69.toInterval();
        mutableInterval69.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutableInterval mutableInterval76 = new org.joda.time.MutableInterval(0L, 1L, chronology75);
        org.joda.time.Interval interval77 = mutableInterval76.toInterval();
        mutableInterval76.setDurationAfterStart((long) (byte) 1);
        boolean boolean81 = mutableInterval76.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology82 = mutableInterval76.getChronology();
        mutableInterval69.setChronology(chronology82);
        mutableInterval60.setChronology(chronology82);
        org.joda.time.MutableInterval mutableInterval85 = new org.joda.time.MutableInterval(1L, 1606267311991L, chronology82);
        long long86 = mutableInterval85.getStartMillis();
        org.joda.time.DateTime dateTime87 = mutableInterval85.getEnd();
        org.joda.time.MutableInterval mutableInterval88 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period52, (org.joda.time.ReadableInstant) dateTime87);
        mutableInterval7.setEnd((org.joda.time.ReadableInstant) dateTime87);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(mutableInterval11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(chronology82);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 1L + "'", long86 == 1L);
        org.junit.Assert.assertNotNull(dateTime87);
    }

    @Test
    @Ignore
  public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.DateTime dateTime5 = mutableInterval3.getStart();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval(0L, 1L, chronology8);
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        java.lang.Object obj11 = mutableInterval9.clone();
        org.joda.time.Interval interval12 = mutableInterval9.toInterval();
        org.joda.time.ReadableInterval readableInterval13 = null;
        boolean boolean14 = mutableInterval9.isBefore(readableInterval13);
        org.joda.time.MutableInterval mutableInterval15 = mutableInterval9.copy();
        boolean boolean16 = mutableInterval3.contains((org.joda.time.ReadableInterval) mutableInterval9);
        mutableInterval9.setInterval((long) '#', 1606267300661L);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval(0L, 1L, chronology22);
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.DateTime dateTime25 = mutableInterval23.getStart();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval(readableInstant26, readablePeriod27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval(0L, 1L, chronology31);
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.DateTime dateTime34 = mutableInterval32.getStart();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval(0L, 1L, chronology37);
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.DateTime dateTime40 = mutableInterval38.getStart();
        mutableInterval28.setInterval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime40);
        boolean boolean43 = mutableInterval9.isAfter((org.joda.time.ReadableInstant) dateTime40);
        boolean boolean44 = mutableInterval9.isAfterNow();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(mutableInterval15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    @Ignore
  public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.DateTime dateTime5 = mutableInterval3.getStart();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval(0L, 1L, chronology8);
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        java.lang.Object obj11 = mutableInterval9.clone();
        org.joda.time.Interval interval12 = mutableInterval9.toInterval();
        org.joda.time.ReadableInterval readableInterval13 = null;
        boolean boolean14 = mutableInterval9.isBefore(readableInterval13);
        org.joda.time.MutableInterval mutableInterval15 = mutableInterval9.copy();
        boolean boolean16 = mutableInterval3.contains((org.joda.time.ReadableInterval) mutableInterval9);
        mutableInterval9.setInterval((long) '#', 1606267300661L);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval(0L, 1L, chronology22);
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.DateTime dateTime25 = mutableInterval23.getStart();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval(readableInstant26, readablePeriod27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval(0L, 1L, chronology31);
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.DateTime dateTime34 = mutableInterval32.getStart();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval(0L, 1L, chronology37);
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.DateTime dateTime40 = mutableInterval38.getStart();
        mutableInterval28.setInterval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime40);
        boolean boolean43 = mutableInterval9.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Interval interval44 = mutableInterval9.toInterval();
        java.lang.String str45 = interval44.toString();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(mutableInterval15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01-01T00:00:00.035Z/2020-11-25T01:21:40.661Z" + "'", str45, "1970-01-01T00:00:00.035Z/2020-11-25T01:21:40.661Z");
    }

    @Test
    @Ignore
  public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("1969-12-31T23:59:59.999Z/1969-12-31T23:59:59.999Z");
        java.lang.String str2 = mutableInterval1.toString();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval(0L, 1L, chronology5);
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        java.lang.Object obj8 = mutableInterval6.clone();
        org.joda.time.Interval interval9 = mutableInterval6.toInterval();
        org.joda.time.ReadableInterval readableInterval10 = null;
        boolean boolean11 = mutableInterval6.isBefore(readableInterval10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology14);
        boolean boolean16 = mutableInterval6.isAfter((org.joda.time.ReadableInterval) mutableInterval15);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        mutableInterval20.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval(0L, 1L, chronology26);
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        long long29 = interval28.getEndMillis();
        boolean boolean31 = interval28.isAfter((long) (byte) 100);
        boolean boolean32 = mutableInterval20.overlaps((org.joda.time.ReadableInterval) interval28);
        mutableInterval15.setInterval((org.joda.time.ReadableInterval) interval28);
        mutableInterval15.setDurationAfterStart((long) 1);
        org.joda.time.MutableInterval mutableInterval36 = mutableInterval15.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval37 = mutableInterval36.toMutableInterval();
        boolean boolean38 = mutableInterval1.isAfter((org.joda.time.ReadableInterval) mutableInterval36);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval1.setInterval(1606267325736L, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableInterval1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31T23:59:59.999Z/1969-12-31T23:59:59.999Z" + "'", str2, "1969-12-31T23:59:59.999Z/1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(mutableInterval36);
        org.junit.Assert.assertNotNull(mutableInterval37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        long long12 = interval11.getEndMillis();
        boolean boolean14 = interval11.isAfter((long) (byte) 100);
        boolean boolean15 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) interval11);
        long long16 = mutableInterval3.toDurationMillis();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableInterval20.setPeriodBeforeEnd(readablePeriod21);
        mutableInterval20.setStartMillis((-1L));
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval(readableInstant25, readablePeriod26);
        long long28 = mutableInterval27.getEndMillis();
        boolean boolean29 = mutableInterval20.overlaps((org.joda.time.ReadableInterval) mutableInterval27);
        boolean boolean30 = mutableInterval27.isAfterNow();
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval(readableInstant31, readablePeriod32);
        mutableInterval33.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval36 = mutableInterval33.toMutableInterval();
        org.joda.time.DateTime dateTime37 = mutableInterval36.getEnd();
        org.joda.time.MutableInterval mutableInterval38 = mutableInterval36.toMutableInterval();
        boolean boolean39 = mutableInterval27.equals((java.lang.Object) mutableInterval36);
        org.joda.time.Period period40 = mutableInterval27.toPeriod();
        mutableInterval3.setPeriodAfterStart((org.joda.time.ReadablePeriod) period40);
        boolean boolean42 = mutableInterval3.containsNow();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1606267592320L + "'", long28 == 1606267592320L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(mutableInterval36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(mutableInterval38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("2020-11-25T01:24:37.445Z/2020-11-25T01:24:37.445Z");
        org.junit.Assert.assertNotNull(mutableInterval1);
    }

    @Test
    @Ignore
  public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        long long5 = interval4.getEndMillis();
        org.joda.time.DateTime dateTime6 = interval4.getEnd();
        boolean boolean7 = interval4.isAfterNow();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(0L, 1L, chronology12);
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        java.lang.Object obj15 = mutableInterval13.clone();
        mutableInterval13.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology18 = mutableInterval13.getChronology();
        org.joda.time.MutableInterval mutableInterval19 = mutableInterval13.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval20 = mutableInterval13.copy();
        org.joda.time.Duration duration21 = mutableInterval13.toDuration();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval(readableInstant24, readablePeriod25);
        mutableInterval26.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval29 = mutableInterval26.toMutableInterval();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval(0L, 1L, chronology32);
        long long34 = mutableInterval33.toDurationMillis();
        mutableInterval26.setInterval((org.joda.time.ReadableInterval) mutableInterval33);
        mutableInterval26.setDurationAfterStart(100L);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval(0L, 1L, chronology44);
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        mutableInterval45.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval(0L, 1L, chronology51);
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        mutableInterval52.setDurationAfterStart((long) (byte) 1);
        boolean boolean57 = mutableInterval52.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology58 = mutableInterval52.getChronology();
        mutableInterval45.setChronology(chronology58);
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((long) (-1), (long) '4', chronology58);
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) 1, (long) 100, chronology58);
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval26, chronology58);
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((long) (short) 1, (long) ' ', chronology58);
        mutableInterval13.setChronology(chronology58);
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((long) (short) 0, 1606267323873L, chronology58);
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((java.lang.Object) interval4, chronology58);
        org.joda.time.DateTime dateTime67 = mutableInterval66.getEnd();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval(0L, 1L, chronology70);
        org.joda.time.Interval interval72 = mutableInterval71.toInterval();
        boolean boolean74 = mutableInterval71.contains((long) ' ');
        org.joda.time.MutableInterval mutableInterval75 = mutableInterval71.copy();
        org.joda.time.Duration duration76 = mutableInterval71.toDuration();
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime67, (org.joda.time.ReadableDuration) duration76);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval(0L, 1L, chronology80);
        org.joda.time.Interval interval82 = mutableInterval81.toInterval();
        org.joda.time.DateTime dateTime83 = mutableInterval81.getStart();
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.MutableInterval mutableInterval87 = new org.joda.time.MutableInterval(0L, 1L, chronology86);
        org.joda.time.Interval interval88 = mutableInterval87.toInterval();
        java.lang.Object obj89 = mutableInterval87.clone();
        org.joda.time.Interval interval90 = mutableInterval87.toInterval();
        org.joda.time.ReadableInterval readableInterval91 = null;
        boolean boolean92 = mutableInterval87.isBefore(readableInterval91);
        org.joda.time.MutableInterval mutableInterval93 = mutableInterval87.copy();
        boolean boolean94 = mutableInterval81.contains((org.joda.time.ReadableInterval) mutableInterval87);
        org.joda.time.MutableInterval mutableInterval95 = mutableInterval87.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval96 = mutableInterval95.toMutableInterval();
        java.lang.Object obj97 = mutableInterval96.clone();
        boolean boolean98 = mutableInterval77.overlaps((org.joda.time.ReadableInterval) mutableInterval96);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(mutableInterval19);
        org.junit.Assert.assertNotNull(mutableInterval20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(mutableInterval75);
        org.junit.Assert.assertNotNull(duration76);
        org.junit.Assert.assertNotNull(interval82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(interval88);
        org.junit.Assert.assertNotNull(obj89);
        org.junit.Assert.assertEquals(obj89.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj89), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj89), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(mutableInterval93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(mutableInterval95);
        org.junit.Assert.assertNotNull(mutableInterval96);
        org.junit.Assert.assertNotNull(obj97);
        org.junit.Assert.assertEquals(obj97.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj97), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj97), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    @Ignore
  public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        boolean boolean8 = mutableInterval3.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology9 = mutableInterval3.getChronology();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(0L, 1L, chronology12);
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        java.lang.Object obj15 = mutableInterval13.clone();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval(obj15, chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableInterval17.setPeriodAfterStart(readablePeriod18);
        org.joda.time.Period period20 = mutableInterval17.toPeriod();
        mutableInterval3.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(0L, 1L, chronology24);
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        java.lang.Object obj27 = mutableInterval25.clone();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(obj27, chronology28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableInterval29.setPeriodBeforeEnd(readablePeriod30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval(readableInstant32, readablePeriod33);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval(0L, 1L, chronology37);
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.DateTime dateTime40 = mutableInterval38.getStart();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(0L, 1L, chronology43);
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.DateTime dateTime46 = mutableInterval44.getStart();
        mutableInterval34.setInterval((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval(0L, 1L, chronology50);
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        java.lang.Object obj53 = mutableInterval51.clone();
        org.joda.time.Interval interval54 = mutableInterval51.toInterval();
        org.joda.time.ReadableInterval readableInterval55 = null;
        boolean boolean56 = mutableInterval51.isBefore(readableInterval55);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology59);
        boolean boolean61 = mutableInterval51.isAfter((org.joda.time.ReadableInterval) mutableInterval60);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval(0L, 1L, chronology64);
        org.joda.time.Interval interval66 = mutableInterval65.toInterval();
        org.joda.time.DateTime dateTime67 = mutableInterval65.getStart();
        boolean boolean68 = mutableInterval51.isBefore((org.joda.time.ReadableInstant) dateTime67);
        mutableInterval29.setInterval((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime67);
        boolean boolean70 = mutableInterval3.isAfter((org.joda.time.ReadableInstant) dateTime40);
        mutableInterval3.setDurationBeforeEnd(1606267386825L);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval3.setStartMillis(1606267536510L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    @Ignore
  public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        boolean boolean7 = mutableInterval3.isAfterNow();
        long long8 = mutableInterval3.toDurationMillis();
        org.joda.time.Interval interval9 = mutableInterval3.toInterval();
        org.joda.time.Duration duration10 = mutableInterval3.toDuration();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval(0L, 1L, chronology14);
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        mutableInterval15.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval(0L, 1L, chronology21);
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        long long24 = interval23.getEndMillis();
        boolean boolean26 = interval23.isAfter((long) (byte) 100);
        boolean boolean27 = mutableInterval15.overlaps((org.joda.time.ReadableInterval) interval23);
        org.joda.time.Duration duration28 = mutableInterval15.toDuration();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval(0L, 1L, chronology31);
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.DateTime dateTime34 = mutableInterval32.getStart();
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval(readableInstant35, readablePeriod36);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval(0L, 1L, chronology40);
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.DateTime dateTime43 = mutableInterval41.getStart();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval(0L, 1L, chronology46);
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.DateTime dateTime49 = mutableInterval47.getStart();
        mutableInterval37.setInterval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration28, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        mutableInterval52.setPeriodAfterStart(readablePeriod53);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval(0L, 1L, chronology57);
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        org.joda.time.DateTime dateTime60 = mutableInterval58.getStart();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval(0L, 1L, chronology63);
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        java.lang.Object obj66 = mutableInterval64.clone();
        org.joda.time.Interval interval67 = mutableInterval64.toInterval();
        org.joda.time.ReadableInterval readableInterval68 = null;
        boolean boolean69 = mutableInterval64.isBefore(readableInterval68);
        org.joda.time.MutableInterval mutableInterval70 = mutableInterval64.copy();
        boolean boolean71 = mutableInterval58.contains((org.joda.time.ReadableInterval) mutableInterval64);
        mutableInterval64.setInterval((long) '#', 1606267300661L);
        org.joda.time.Chronology chronology75 = mutableInterval64.getChronology();
        boolean boolean76 = mutableInterval64.isBeforeNow();
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        org.joda.time.MutableInterval mutableInterval79 = new org.joda.time.MutableInterval(readableInstant77, readablePeriod78);
        mutableInterval79.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval82 = mutableInterval79.toMutableInterval();
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.MutableInterval mutableInterval86 = new org.joda.time.MutableInterval(0L, 1L, chronology85);
        long long87 = mutableInterval86.toDurationMillis();
        mutableInterval79.setInterval((org.joda.time.ReadableInterval) mutableInterval86);
        boolean boolean89 = mutableInterval64.isBefore((org.joda.time.ReadableInterval) mutableInterval86);
        org.joda.time.PeriodType periodType90 = null;
        org.joda.time.Period period91 = mutableInterval64.toPeriod(periodType90);
        mutableInterval52.setPeriodAfterStart((org.joda.time.ReadablePeriod) period91);
        org.joda.time.MutableInterval mutableInterval93 = new org.joda.time.MutableInterval(readableInstant11, (org.joda.time.ReadablePeriod) period91);
        mutableInterval3.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period91);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertEquals(obj66.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj66), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj66), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(mutableInterval70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(mutableInterval82);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 1L + "'", long87 == 1L);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(period91);
    }

    @Test
    @Ignore
  public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (-1), (long) (byte) 100);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval(0L, 1L, chronology5);
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.DateTime dateTime8 = mutableInterval6.getStart();
        org.joda.time.Interval interval9 = mutableInterval6.toInterval();
        boolean boolean10 = mutableInterval2.isAfter((org.joda.time.ReadableInterval) mutableInterval6);
        boolean boolean11 = mutableInterval6.isAfterNow();
        org.joda.time.MutableInterval mutableInterval12 = mutableInterval6.copy();
        org.joda.time.MutableInterval mutableInterval13 = mutableInterval6.copy();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval(0L, 1L, chronology16);
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        java.lang.Object obj19 = mutableInterval17.clone();
        mutableInterval17.setStartMillis((long) (short) -1);
        boolean boolean22 = mutableInterval6.isAfter((org.joda.time.ReadableInterval) mutableInterval17);
        org.joda.time.Interval interval23 = mutableInterval17.toInterval();
        boolean boolean25 = mutableInterval17.isBefore(0L);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(mutableInterval12);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    @Ignore
  public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Interval interval6 = mutableInterval3.toInterval();
        org.joda.time.ReadableInterval readableInterval7 = null;
        boolean boolean8 = mutableInterval3.isBefore(readableInterval7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology11);
        boolean boolean13 = mutableInterval3.isAfter((org.joda.time.ReadableInterval) mutableInterval12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval(0L, 1L, chronology16);
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        mutableInterval17.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval(0L, 1L, chronology23);
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        long long26 = interval25.getEndMillis();
        boolean boolean28 = interval25.isAfter((long) (byte) 100);
        boolean boolean29 = mutableInterval17.overlaps((org.joda.time.ReadableInterval) interval25);
        mutableInterval12.setInterval((org.joda.time.ReadableInterval) interval25);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval(0L, 1L, chronology33);
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        mutableInterval34.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval(0L, 1L, chronology40);
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        long long43 = interval42.getEndMillis();
        boolean boolean45 = interval42.isAfter((long) (byte) 100);
        boolean boolean46 = mutableInterval34.overlaps((org.joda.time.ReadableInterval) interval42);
        org.joda.time.Duration duration47 = mutableInterval34.toDuration();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval(0L, 1L, chronology50);
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        mutableInterval51.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval(0L, 1L, chronology57);
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        long long60 = interval59.getEndMillis();
        boolean boolean62 = interval59.isAfter((long) (byte) 100);
        boolean boolean63 = mutableInterval51.overlaps((org.joda.time.ReadableInterval) interval59);
        org.joda.time.Duration duration64 = mutableInterval51.toDuration();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval(0L, 1L, chronology67);
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        org.joda.time.DateTime dateTime70 = mutableInterval68.getStart();
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval(readableInstant71, readablePeriod72);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval(0L, 1L, chronology76);
        org.joda.time.Interval interval78 = mutableInterval77.toInterval();
        org.joda.time.DateTime dateTime79 = mutableInterval77.getStart();
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval(0L, 1L, chronology82);
        org.joda.time.Interval interval84 = mutableInterval83.toInterval();
        org.joda.time.DateTime dateTime85 = mutableInterval83.getStart();
        mutableInterval73.setInterval((org.joda.time.ReadableInstant) dateTime79, (org.joda.time.ReadableInstant) dateTime85);
        org.joda.time.MutableInterval mutableInterval87 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime70, (org.joda.time.ReadableInstant) dateTime85);
        org.joda.time.MutableInterval mutableInterval88 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration64, (org.joda.time.ReadableInstant) dateTime85);
        mutableInterval34.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration64);
        mutableInterval12.setDurationAfterStart((org.joda.time.ReadableDuration) duration64);
        java.lang.Object obj91 = mutableInterval12.clone();
        org.joda.time.MutableInterval mutableInterval92 = mutableInterval12.toMutableInterval();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(interval78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(interval84);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(obj91);
        org.junit.Assert.assertEquals(obj91.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj91), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj91), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(mutableInterval92);
    }

    @Test
    @Ignore
  public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        long long12 = interval11.getEndMillis();
        boolean boolean14 = interval11.isAfter((long) (byte) 100);
        boolean boolean15 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) interval11);
        org.joda.time.Duration duration16 = mutableInterval3.toDuration();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        java.lang.Object obj22 = mutableInterval20.clone();
        org.joda.time.Interval interval23 = mutableInterval20.toInterval();
        org.joda.time.ReadableInterval readableInterval24 = null;
        boolean boolean25 = mutableInterval20.isBefore(readableInterval24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology28);
        boolean boolean30 = mutableInterval20.isAfter((org.joda.time.ReadableInterval) mutableInterval29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval(0L, 1L, chronology33);
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.DateTime dateTime36 = mutableInterval34.getStart();
        boolean boolean37 = mutableInterval20.isBefore((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.MutableInterval mutableInterval39 = mutableInterval38.toMutableInterval();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(mutableInterval39);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        long long12 = interval11.getEndMillis();
        boolean boolean14 = interval11.isAfter((long) (byte) 100);
        boolean boolean15 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) interval11);
        org.joda.time.Duration duration16 = mutableInterval3.toDuration();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval(readableInstant17, readablePeriod18);
        mutableInterval19.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval22 = mutableInterval19.toMutableInterval();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval(0L, 1L, chronology25);
        long long27 = mutableInterval26.toDurationMillis();
        mutableInterval19.setInterval((org.joda.time.ReadableInterval) mutableInterval26);
        mutableInterval19.setDurationAfterStart(100L);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval(0L, 1L, chronology37);
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        mutableInterval38.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval(0L, 1L, chronology44);
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        mutableInterval45.setDurationAfterStart((long) (byte) 1);
        boolean boolean50 = mutableInterval45.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology51 = mutableInterval45.getChronology();
        mutableInterval38.setChronology(chronology51);
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (-1), (long) '4', chronology51);
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) 1, (long) 100, chronology51);
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval19, chronology51);
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval3, chronology51);
        mutableInterval3.setEndMillis(1606267376940L);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(mutableInterval22);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(chronology51);
    }

    @Test
    @Ignore
  public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(obj5, chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableInterval7.setPeriodBeforeEnd(readablePeriod8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(0L, 1L, chronology12);
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        mutableInterval13.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        long long22 = interval21.getEndMillis();
        boolean boolean24 = interval21.isAfter((long) (byte) 100);
        boolean boolean25 = mutableInterval13.overlaps((org.joda.time.ReadableInterval) interval21);
        org.joda.time.Duration duration26 = mutableInterval13.toDuration();
        boolean boolean27 = mutableInterval7.isBefore((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.Chronology chronology28 = mutableInterval13.getChronology();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(chronology28);
    }

    @Test
    @Ignore
  public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        java.lang.Object obj0 = null;
        org.joda.time.MutableInterval mutableInterval1 = new org.joda.time.MutableInterval(obj0);
        org.joda.time.Interval interval2 = mutableInterval1.toInterval();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(0L, 1L, chronology7);
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        java.lang.Object obj10 = mutableInterval8.clone();
        mutableInterval8.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology13 = mutableInterval8.getChronology();
        org.joda.time.MutableInterval mutableInterval14 = mutableInterval8.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval15 = mutableInterval8.copy();
        org.joda.time.Duration duration16 = mutableInterval8.toDuration();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval(readableInstant19, readablePeriod20);
        mutableInterval21.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval24 = mutableInterval21.toMutableInterval();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval(0L, 1L, chronology27);
        long long29 = mutableInterval28.toDurationMillis();
        mutableInterval21.setInterval((org.joda.time.ReadableInterval) mutableInterval28);
        mutableInterval21.setDurationAfterStart(100L);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval(0L, 1L, chronology39);
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        mutableInterval40.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval(0L, 1L, chronology46);
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        mutableInterval47.setDurationAfterStart((long) (byte) 1);
        boolean boolean52 = mutableInterval47.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology53 = mutableInterval47.getChronology();
        mutableInterval40.setChronology(chronology53);
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((long) (-1), (long) '4', chronology53);
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (short) 1, (long) 100, chronology53);
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval21, chronology53);
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) 1, (long) ' ', chronology53);
        mutableInterval8.setChronology(chronology53);
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((long) ' ', (long) (short) 100, chronology53);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval(0L, 1L, chronology63);
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        mutableInterval64.setDurationAfterStart((long) (byte) 1);
        boolean boolean69 = mutableInterval64.equals((java.lang.Object) 0);
        boolean boolean70 = mutableInterval60.equals((java.lang.Object) mutableInterval64);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval(0L, 1L, chronology73);
        org.joda.time.Interval interval75 = mutableInterval74.toInterval();
        java.lang.Object obj76 = mutableInterval74.clone();
        java.lang.Object obj77 = mutableInterval74.clone();
        org.joda.time.MutableInterval mutableInterval78 = mutableInterval74.copy();
        org.joda.time.DateTime dateTime79 = mutableInterval74.getStart();
        boolean boolean80 = mutableInterval60.contains((org.joda.time.ReadableInstant) dateTime79);
        boolean boolean81 = mutableInterval1.contains((org.joda.time.ReadableInstant) dateTime79);
        long long82 = mutableInterval1.getStartMillis();
        java.lang.Class<?> wildcardClass83 = mutableInterval1.getClass();
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(mutableInterval14);
        org.junit.Assert.assertNotNull(mutableInterval15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(mutableInterval24);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(interval75);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertEquals(obj76.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj76), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj76), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertEquals(obj77.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj77), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj77), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(mutableInterval78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long82 + "' != '" + 1606267593138L + "'", long82 == 1606267593138L);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    @Ignore
  public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        mutableInterval10.setDurationAfterStart((long) (byte) 1);
        boolean boolean15 = mutableInterval10.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology16 = mutableInterval10.getChronology();
        mutableInterval3.setChronology(chronology16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval(0L, 1L, chronology20);
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        java.lang.Object obj23 = mutableInterval21.clone();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(obj23, chronology24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableInterval25.setPeriodAfterStart(readablePeriod26);
        org.joda.time.Period period28 = mutableInterval25.toPeriod();
        org.joda.time.MutableInterval mutableInterval29 = mutableInterval25.copy();
        boolean boolean30 = mutableInterval3.isAfter((org.joda.time.ReadableInterval) mutableInterval25);
        boolean boolean31 = mutableInterval3.isBeforeNow();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    @Ignore
  public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval(0L, 1L, chronology8);
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        java.lang.Object obj11 = mutableInterval9.clone();
        java.lang.Object obj12 = mutableInterval9.clone();
        boolean boolean13 = mutableInterval3.equals((java.lang.Object) mutableInterval9);
        org.joda.time.Interval interval14 = mutableInterval9.toInterval();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, 1L, chronology17);
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        java.lang.Object obj20 = mutableInterval18.clone();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval(obj20, chronology21);
        org.joda.time.DateTime dateTime23 = mutableInterval22.getEnd();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval(0L, 1L, chronology26);
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        mutableInterval27.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval(0L, 1L, chronology33);
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        mutableInterval34.setDurationAfterStart((long) (byte) 1);
        boolean boolean39 = mutableInterval34.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology40 = mutableInterval34.getChronology();
        mutableInterval27.setChronology(chronology40);
        mutableInterval27.setEndMillis((long) '#');
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = mutableInterval27.toPeriod(periodType44);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(0L, 1L, chronology48);
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        java.lang.Object obj51 = mutableInterval49.clone();
        long long52 = mutableInterval49.getStartMillis();
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval(readableInstant55, readablePeriod56);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval(0L, 1L, chronology60);
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        org.joda.time.DateTime dateTime63 = mutableInterval61.getStart();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval(0L, 1L, chronology66);
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.DateTime dateTime69 = mutableInterval67.getStart();
        mutableInterval57.setInterval((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval(readablePeriod54, (org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval(readablePeriod53, (org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval(readableInstant73, readablePeriod74);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.MutableInterval mutableInterval79 = new org.joda.time.MutableInterval(0L, 1L, chronology78);
        org.joda.time.Interval interval80 = mutableInterval79.toInterval();
        org.joda.time.DateTime dateTime81 = mutableInterval79.getStart();
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.MutableInterval mutableInterval85 = new org.joda.time.MutableInterval(0L, 1L, chronology84);
        org.joda.time.Interval interval86 = mutableInterval85.toInterval();
        org.joda.time.DateTime dateTime87 = mutableInterval85.getStart();
        mutableInterval75.setInterval((org.joda.time.ReadableInstant) dateTime81, (org.joda.time.ReadableInstant) dateTime87);
        org.joda.time.MutableInterval mutableInterval89 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime81);
        boolean boolean90 = mutableInterval49.isBefore((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.MutableInterval mutableInterval91 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period45, (org.joda.time.ReadableInstant) dateTime63);
        boolean boolean92 = mutableInterval22.isBefore((org.joda.time.ReadableInstant) dateTime63);
        boolean boolean93 = mutableInterval9.isAfter((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.MutableInterval mutableInterval94 = mutableInterval9.copy();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(interval80);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(interval86);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(mutableInterval94);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (byte) 0, (long) (short) 100);
        boolean boolean4 = mutableInterval2.isBefore(1606267397130L);
        boolean boolean5 = mutableInterval2.isBeforeNow();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    @Ignore
  public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(obj5, chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableInterval7.setPeriodBeforeEnd(readablePeriod8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(0L, 1L, chronology12);
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        mutableInterval13.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        long long22 = interval21.getEndMillis();
        boolean boolean24 = interval21.isAfter((long) (byte) 100);
        boolean boolean25 = mutableInterval13.overlaps((org.joda.time.ReadableInterval) interval21);
        org.joda.time.Duration duration26 = mutableInterval13.toDuration();
        boolean boolean27 = mutableInterval7.isBefore((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.MutableInterval mutableInterval28 = mutableInterval13.toMutableInterval();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval(readableInstant30, readablePeriod31);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval(0L, 1L, chronology35);
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.DateTime dateTime38 = mutableInterval36.getStart();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval(0L, 1L, chronology41);
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.DateTime dateTime44 = mutableInterval42.getStart();
        mutableInterval32.setInterval((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval(readablePeriod29, (org.joda.time.ReadableInstant) dateTime38);
        mutableInterval13.setEnd((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Interval interval48 = mutableInterval13.toInterval();
        long long49 = interval48.getEndMillis();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(mutableInterval28);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        boolean boolean7 = mutableInterval3.isAfterNow();
        long long8 = mutableInterval3.getStartMillis();
        long long9 = mutableInterval3.toDurationMillis();
        boolean boolean11 = mutableInterval3.isBefore(1606267381241L);
        org.joda.time.DateTime dateTime12 = mutableInterval3.getStart();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval(0L, 1L, chronology4);
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        mutableInterval5.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        mutableInterval12.setDurationAfterStart((long) (byte) 1);
        boolean boolean17 = mutableInterval12.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology18 = mutableInterval12.getChronology();
        mutableInterval5.setChronology(chronology18);
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (-1), (long) '4', chronology18);
        long long21 = mutableInterval20.getStartMillis();
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    @Ignore
  public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval(0L, 1L, chronology3);
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        java.lang.Object obj6 = mutableInterval4.clone();
        mutableInterval4.setStartMillis((long) (short) -1);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval(readableInstant9, readablePeriod10);
        mutableInterval11.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval14 = mutableInterval11.toMutableInterval();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, 1L, chronology17);
        long long19 = mutableInterval18.toDurationMillis();
        mutableInterval11.setInterval((org.joda.time.ReadableInterval) mutableInterval18);
        org.joda.time.Duration duration21 = mutableInterval18.toDuration();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(0L, 1L, chronology24);
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        java.lang.Object obj27 = mutableInterval25.clone();
        org.joda.time.Interval interval28 = mutableInterval25.toInterval();
        org.joda.time.ReadableInterval readableInterval29 = null;
        boolean boolean30 = mutableInterval25.isBefore(readableInterval29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology33);
        boolean boolean35 = mutableInterval25.isAfter((org.joda.time.ReadableInterval) mutableInterval34);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval(0L, 1L, chronology38);
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.DateTime dateTime41 = mutableInterval39.getStart();
        boolean boolean42 = mutableInterval25.isBefore((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration21, (org.joda.time.ReadableInstant) dateTime41);
        boolean boolean44 = mutableInterval4.contains((org.joda.time.ReadableInstant) dateTime41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval(readableInstant0, (org.joda.time.ReadableInstant) dateTime41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(mutableInterval14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    @Ignore
  public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval(0L, 1L, chronology3);
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        java.lang.Object obj6 = mutableInterval4.clone();
        mutableInterval4.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology9 = mutableInterval4.getChronology();
        org.joda.time.MutableInterval mutableInterval10 = mutableInterval4.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval11 = mutableInterval4.copy();
        boolean boolean12 = mutableInterval4.isAfterNow();
        org.joda.time.MutableInterval mutableInterval13 = mutableInterval4.copy();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval(0L, 1L, chronology18);
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        java.lang.Object obj21 = mutableInterval19.clone();
        org.joda.time.Interval interval22 = mutableInterval19.toInterval();
        org.joda.time.ReadableInterval readableInterval23 = null;
        boolean boolean24 = mutableInterval19.isBefore(readableInterval23);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval(0L, 1L, chronology27);
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        mutableInterval28.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(0L, 1L, chronology34);
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        mutableInterval35.setDurationAfterStart((long) (byte) 1);
        boolean boolean40 = mutableInterval35.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology41 = mutableInterval35.getChronology();
        mutableInterval28.setChronology(chronology41);
        mutableInterval19.setChronology(chronology41);
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval(1L, 1606267311991L, chronology41);
        long long45 = mutableInterval44.getStartMillis();
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = mutableInterval44.toPeriod(periodType46);
        mutableInterval13.setPeriodAfterStart((org.joda.time.ReadablePeriod) period47);
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval(readableInstant0, (org.joda.time.ReadablePeriod) period47);
        org.joda.time.DateTime dateTime50 = mutableInterval49.getStart();
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(mutableInterval10);
        org.junit.Assert.assertNotNull(mutableInterval11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(dateTime50);
    }

    @Test
    @Ignore
  public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Interval interval6 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        java.lang.Object obj12 = mutableInterval10.clone();
        boolean boolean13 = interval6.isBefore((org.joda.time.ReadableInterval) mutableInterval10);
        mutableInterval10.setDurationBeforeEnd((long) 10);
        org.joda.time.Interval interval16 = mutableInterval10.toInterval();
        long long17 = mutableInterval10.toDurationMillis();
        mutableInterval10.setEndMillis(1606267532309L);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("1970-01-01T00:00:00.032Z/1970-01-01T00:00:00.100Z");
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval(0L, 1L, chronology10);
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        mutableInterval11.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, 1L, chronology17);
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        mutableInterval18.setDurationAfterStart((long) (byte) 1);
        boolean boolean23 = mutableInterval18.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology24 = mutableInterval18.getChronology();
        mutableInterval11.setChronology(chronology24);
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (-1), (long) '4', chronology24);
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval(1606267335463L, 1606267344145L, chronology24);
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval(0L, 1L, chronology24);
        org.joda.time.Period period29 = mutableInterval28.toPeriod();
        mutableInterval1.setPeriodAfterStart((org.joda.time.ReadablePeriod) period29);
        org.junit.Assert.assertNotNull(mutableInterval1);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(period29);
    }

    @Test
    @Ignore
  public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(obj5, chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableInterval7.setPeriodBeforeEnd(readablePeriod8);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval7.setInterval(1606267583058L, 1606267398509L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
    }

    @Test
    @Ignore
  public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        mutableInterval3.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology8 = mutableInterval3.getChronology();
        org.joda.time.MutableInterval mutableInterval9 = mutableInterval3.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval10 = mutableInterval3.copy();
        org.joda.time.MutableInterval mutableInterval11 = mutableInterval3.toMutableInterval();
        boolean boolean13 = mutableInterval11.isBefore(1606267325736L);
        org.joda.time.MutableInterval mutableInterval14 = mutableInterval11.copy();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval(10L, (long) (short) 100);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(readableDuration18, readableInstant19);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = mutableInterval20.toPeriod(periodType21);
        mutableInterval17.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval(0L, 1L, chronology26);
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        mutableInterval27.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval(0L, 1L, chronology33);
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        long long36 = interval35.getEndMillis();
        boolean boolean38 = interval35.isAfter((long) (byte) 100);
        boolean boolean39 = mutableInterval27.overlaps((org.joda.time.ReadableInterval) interval35);
        org.joda.time.Duration duration40 = mutableInterval27.toDuration();
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval(readableInstant41, readablePeriod42);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval(0L, 1L, chronology46);
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.DateTime dateTime49 = mutableInterval47.getStart();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval(0L, 1L, chronology52);
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.DateTime dateTime55 = mutableInterval53.getStart();
        mutableInterval43.setInterval((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration40, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period22, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval(0L, 1L, chronology61);
        long long63 = mutableInterval62.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval64 = mutableInterval62.copy();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval(0L, 1L, chronology67);
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        java.lang.Object obj70 = mutableInterval68.clone();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval(obj70, chronology71);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        mutableInterval72.setPeriodBeforeEnd(readablePeriod73);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.MutableInterval mutableInterval78 = new org.joda.time.MutableInterval(0L, 1L, chronology77);
        org.joda.time.Interval interval79 = mutableInterval78.toInterval();
        mutableInterval78.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.MutableInterval mutableInterval85 = new org.joda.time.MutableInterval(0L, 1L, chronology84);
        org.joda.time.Interval interval86 = mutableInterval85.toInterval();
        long long87 = interval86.getEndMillis();
        boolean boolean89 = interval86.isAfter((long) (byte) 100);
        boolean boolean90 = mutableInterval78.overlaps((org.joda.time.ReadableInterval) interval86);
        org.joda.time.Duration duration91 = mutableInterval78.toDuration();
        boolean boolean92 = mutableInterval72.isBefore((org.joda.time.ReadableInterval) mutableInterval78);
        org.joda.time.MutableInterval mutableInterval93 = mutableInterval78.toMutableInterval();
        java.lang.String str94 = mutableInterval93.toString();
        boolean boolean95 = mutableInterval93.containsNow();
        org.joda.time.Duration duration96 = mutableInterval93.toDuration();
        mutableInterval64.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration96);
        mutableInterval58.setDurationAfterStart((org.joda.time.ReadableDuration) duration96);
        mutableInterval14.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration96);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(mutableInterval9);
        org.junit.Assert.assertNotNull(mutableInterval10);
        org.junit.Assert.assertNotNull(mutableInterval11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(mutableInterval14);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1L + "'", long63 == 1L);
        org.junit.Assert.assertNotNull(mutableInterval64);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj70), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval79);
        org.junit.Assert.assertNotNull(interval86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 1L + "'", long87 == 1L);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(duration91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(mutableInterval93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z" + "'", str94, "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(duration96);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        long long12 = interval11.getEndMillis();
        boolean boolean14 = interval11.isAfter((long) (byte) 100);
        boolean boolean15 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) interval11);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval(0L, 1L, chronology18);
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        mutableInterval19.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval(0L, 1L, chronology25);
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        long long28 = interval27.getEndMillis();
        boolean boolean30 = interval27.isAfter((long) (byte) 100);
        boolean boolean31 = mutableInterval19.overlaps((org.joda.time.ReadableInterval) interval27);
        org.joda.time.Duration duration32 = mutableInterval19.toDuration();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval(0L, 1L, chronology35);
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.DateTime dateTime38 = mutableInterval36.getStart();
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval(readableInstant39, readablePeriod40);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval(0L, 1L, chronology44);
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        org.joda.time.DateTime dateTime47 = mutableInterval45.getStart();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval(0L, 1L, chronology50);
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.DateTime dateTime53 = mutableInterval51.getStart();
        mutableInterval41.setInterval((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration32, (org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval(readableInstant57, readablePeriod58);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval(0L, 1L, chronology62);
        org.joda.time.Interval interval64 = mutableInterval63.toInterval();
        org.joda.time.DateTime dateTime65 = mutableInterval63.getStart();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval(0L, 1L, chronology68);
        org.joda.time.Interval interval70 = mutableInterval69.toInterval();
        org.joda.time.DateTime dateTime71 = mutableInterval69.getStart();
        mutableInterval59.setInterval((org.joda.time.ReadableInstant) dateTime65, (org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration32, (org.joda.time.ReadableInstant) dateTime65);
        boolean boolean74 = interval11.overlaps((org.joda.time.ReadableInterval) mutableInterval73);
        org.joda.time.Chronology chronology75 = interval11.getChronology();
        boolean boolean76 = interval11.isBeforeNow();
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(1606267421707L, 1606267479172L);
        long long3 = mutableInterval2.getEndMillis();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1606267479172L + "'", long3 == 1606267479172L);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        mutableInterval2.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval5 = mutableInterval2.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval5);
        mutableInterval6.setDurationBeforeEnd(1606267386236L);
        mutableInterval6.setEndMillis(1606267380943L);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval(0L, 1L, chronology15);
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        mutableInterval16.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval(0L, 1L, chronology22);
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        mutableInterval23.setDurationAfterStart((long) (byte) 1);
        boolean boolean28 = mutableInterval23.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology29 = mutableInterval23.getChronology();
        mutableInterval16.setChronology(chronology29);
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (-1), (long) '4', chronology29);
        mutableInterval6.setChronology(chronology29);
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(chronology29);
    }

    @Test
    @Ignore
  public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        java.lang.Object obj5 = mutableInterval3.clone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(obj5, chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableInterval7.setPeriodAfterStart(readablePeriod8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval(0L, 1L, chronology12);
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        java.lang.Object obj15 = mutableInterval13.clone();
        mutableInterval13.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology18 = mutableInterval13.getChronology();
        org.joda.time.MutableInterval mutableInterval19 = mutableInterval13.toMutableInterval();
        boolean boolean20 = mutableInterval7.isAfter((org.joda.time.ReadableInterval) mutableInterval19);
        mutableInterval7.setEndMillis(1606267536583L);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(mutableInterval19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    @Ignore
  public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        java.lang.String str3 = mutableInterval2.toString();
        org.joda.time.DateTime dateTime4 = mutableInterval2.getEnd();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(readableDuration5, readableInstant6);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = mutableInterval7.toPeriod(periodType8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(readableInstant10, readablePeriod11);
        mutableInterval12.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval15 = mutableInterval12.toMutableInterval();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval(0L, 1L, chronology18);
        long long20 = mutableInterval19.toDurationMillis();
        mutableInterval12.setInterval((org.joda.time.ReadableInterval) mutableInterval19);
        mutableInterval12.setDurationAfterStart(100L);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval(0L, 1L, chronology30);
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        mutableInterval31.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval(0L, 1L, chronology37);
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        mutableInterval38.setDurationAfterStart((long) (byte) 1);
        boolean boolean43 = mutableInterval38.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology44 = mutableInterval38.getChronology();
        mutableInterval31.setChronology(chronology44);
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (-1), (long) '4', chronology44);
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) 1, (long) 100, chronology44);
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval12, chronology44);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval(0L, 1L, chronology51);
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        java.lang.Object obj54 = mutableInterval52.clone();
        org.joda.time.Interval interval55 = mutableInterval52.toInterval();
        org.joda.time.ReadableInterval readableInterval56 = null;
        boolean boolean57 = mutableInterval52.isBefore(readableInterval56);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology60);
        boolean boolean62 = mutableInterval52.isAfter((org.joda.time.ReadableInterval) mutableInterval61);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval(0L, 1L, chronology65);
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        org.joda.time.DateTime dateTime68 = mutableInterval66.getStart();
        boolean boolean69 = mutableInterval52.isBefore((org.joda.time.ReadableInstant) dateTime68);
        boolean boolean71 = mutableInterval52.contains((long) '4');
        org.joda.time.ReadableDuration readableDuration72 = null;
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval(readableDuration72, readableInstant73);
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.Period period76 = mutableInterval74.toPeriod(periodType75);
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        org.joda.time.MutableInterval mutableInterval79 = new org.joda.time.MutableInterval(readableInstant77, readablePeriod78);
        long long80 = mutableInterval79.getEndMillis();
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.ReadablePeriod readablePeriod82 = null;
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval(readableInstant81, readablePeriod82);
        mutableInterval83.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval86 = mutableInterval83.toMutableInterval();
        org.joda.time.DateTime dateTime87 = mutableInterval86.getEnd();
        boolean boolean88 = mutableInterval79.isAfter((org.joda.time.ReadableInstant) dateTime87);
        org.joda.time.MutableInterval mutableInterval89 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period76, (org.joda.time.ReadableInstant) dateTime87);
        boolean boolean90 = mutableInterval52.isAfter((org.joda.time.ReadableInstant) dateTime87);
        org.joda.time.Duration duration91 = mutableInterval52.toDuration();
        mutableInterval12.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration91);
        mutableInterval7.setDurationAfterStart((org.joda.time.ReadableDuration) duration91);
        org.joda.time.MutableInterval mutableInterval94 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration91);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2020-11-25T01:26:34.946Z/2020-11-25T01:26:34.946Z" + "'", str3, "2020-11-25T01:26:34.946Z/2020-11-25T01:26:34.946Z");
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(mutableInterval15);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(period76);
// flaky:         org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1606267594946L + "'", long80 == 1606267594946L);
        org.junit.Assert.assertNotNull(mutableInterval86);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(duration91);
    }
}
