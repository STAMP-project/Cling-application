import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        long long12 = dateTimeZone9.previousTransition((long) 'u');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime6", (dateTime3.compareTo(mutableDateTime6) == 0) == dateTime3.equals(mutableDateTime6));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfCentury((int) 'a');
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        java.lang.Object obj18 = mutableDateTime17.clone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime17.setZone(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localDate10.toDateTimeAtStartOfDay(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and mutableDateTime17", (dateTime14.compareTo(mutableDateTime17) == 0) == dateTime14.equals(mutableDateTime17));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay8.toDateTime(timeOfDay9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime10.toMutableDateTime();
        java.lang.Object obj14 = mutableDateTime13.clone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime13.setZone(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = dateTime3.withZone(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime13", (dateTime3.compareTo(mutableDateTime13) == 0) == dateTime3.equals(mutableDateTime13));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate8.minusDays((int) (short) 10);
        int int20 = localDate19.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long24 = dateTimeZone22.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(dateTimeZone22);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight25.withField(dateTimeFieldType26, (int) '4');
        org.joda.time.LocalDate localDate29 = dateMidnight28.toLocalDate();
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableDuration31);
        org.joda.time.MutablePeriod mutablePeriod33 = period32.toMutablePeriod();
        java.lang.Object obj34 = mutablePeriod33.clone();
        org.joda.time.LocalDate localDate36 = localDate29.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod33, (int) (byte) 1);
        org.joda.time.Period period37 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate19, (org.joda.time.ReadablePartial) localDate36);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay40 = null;
        org.joda.time.DateTime dateTime41 = yearMonthDay39.toDateTime(timeOfDay40);
        org.joda.time.DateTime dateTime43 = dateTime41.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime41.toMutableDateTime();
        java.lang.Object obj45 = mutableDateTime44.clone();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime44.setZone(dateTimeZone47);
        org.joda.time.Interval interval49 = localDate36.toInterval(dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and mutableDateTime44", (dateTime41.compareTo(mutableDateTime44) == 0) == dateTime41.equals(mutableDateTime44));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        boolean boolean18 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime6", (dateTime3.compareTo(mutableDateTime6) == 0) == dateTime3.equals(mutableDateTime6));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate8.minusDays((int) (short) 10);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay21.toDateTime(timeOfDay22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime23.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime29 = dateTime23.withDurationAdded(readableDuration27, (int) (short) 1);
        org.joda.time.DateTime dateTime30 = localDate8.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long34 = dateTimeZone32.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(dateTimeZone32);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight35.withField(dateTimeFieldType36, (int) '4');
        org.joda.time.LocalDate localDate39 = dateMidnight38.toLocalDate();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant40, readableDuration41);
        org.joda.time.MutablePeriod mutablePeriod43 = period42.toMutablePeriod();
        java.lang.Object obj44 = mutablePeriod43.clone();
        org.joda.time.LocalDate localDate46 = localDate39.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod43, (int) (byte) 1);
        org.joda.time.LocalDate localDate48 = localDate39.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate50 = localDate39.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long54 = dateTimeZone52.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime55 = org.joda.time.DateTime.now(dateTimeZone52);
        org.joda.time.DateTime dateTime56 = localDate50.toDateTimeAtStartOfDay(dateTimeZone52);
        boolean boolean57 = dateTime23.isAfter((org.joda.time.ReadableInstant) dateTime56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime55", (dateTime30.compareTo(dateTime55) == 0) == dateTime30.equals(dateTime55));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime6", (dateTime3.compareTo(mutableDateTime6) == 0) == dateTime3.equals(mutableDateTime6));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime6 = dateTime4.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableDuration0, (org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay9.toDateTime(timeOfDay10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime11.toMutableDateTime();
        java.lang.Object obj15 = mutableDateTime14.clone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime14.setZone(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((java.lang.Object) readableDuration0, dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime14", (dateTime4.compareTo(mutableDateTime14) == 0) == dateTime4.equals(mutableDateTime14));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        boolean boolean18 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime17.addMillis(1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime6", (dateTime3.compareTo(mutableDateTime6) == 0) == dateTime3.equals(mutableDateTime6));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        boolean boolean18 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime6", (dateTime3.compareTo(mutableDateTime6) == 0) == dateTime3.equals(mutableDateTime6));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime17 = dateTime15.plusMillis(1);
        int int18 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime6", (dateTime3.compareTo(mutableDateTime6) == 0) == dateTime3.equals(mutableDateTime6));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(dateTimeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime6", (dateTime3.compareTo(mutableDateTime6) == 0) == dateTime3.equals(mutableDateTime6));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        boolean boolean18 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long22 = dateTimeZone20.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(dateTimeZone20);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight23.withField(dateTimeFieldType24, (int) '4');
        org.joda.time.LocalDate localDate27 = dateMidnight26.toLocalDate();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableDuration29);
        org.joda.time.MutablePeriod mutablePeriod31 = period30.toMutablePeriod();
        java.lang.Object obj32 = mutablePeriod31.clone();
        org.joda.time.LocalDate localDate34 = localDate27.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod31, (int) (byte) 1);
        org.joda.time.LocalDate localDate36 = localDate27.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate38 = localDate27.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long42 = dateTimeZone40.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime44 = localDate38.toDateTimeAtStartOfDay(dateTimeZone40);
        mutableDateTime6.setZone(dateTimeZone40);
        java.lang.String str46 = dateTimeZone40.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime6", (dateTime3.compareTo(mutableDateTime6) == 0) == dateTime3.equals(mutableDateTime6));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology13 = yearMonthDay12.getChronology();
        long long17 = chronology13.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = chronology13.add(readablePeriod18, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField22 = chronology13.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(1000L, chronology13);
        org.joda.time.DateTime dateTime24 = dateTime9.toDateTime(chronology13);
        org.joda.time.DateTime.Property property25 = dateTime9.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime24", (dateTime9.compareTo(dateTime24) == 0) == dateTime9.equals(dateTime24));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight7.minusWeeks((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        java.lang.Object obj18 = mutableDateTime17.clone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime17.setZone(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = dateMidnight7.toDateTime(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and mutableDateTime17", (dateTime14.compareTo(mutableDateTime17) == 0) == dateTime14.equals(mutableDateTime17));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime5 = instant3.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime4", (instant3.compareTo(mutableDateTime4) == 0) == instant3.equals(mutableDateTime4));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        boolean boolean18 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long22 = dateTimeZone20.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(dateTimeZone20);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight23.withField(dateTimeFieldType24, (int) '4');
        org.joda.time.LocalDate localDate27 = dateMidnight26.toLocalDate();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableDuration29);
        org.joda.time.MutablePeriod mutablePeriod31 = period30.toMutablePeriod();
        java.lang.Object obj32 = mutablePeriod31.clone();
        org.joda.time.LocalDate localDate34 = localDate27.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod31, (int) (byte) 1);
        org.joda.time.LocalDate localDate36 = localDate27.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate38 = localDate27.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long42 = dateTimeZone40.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime44 = localDate38.toDateTimeAtStartOfDay(dateTimeZone40);
        mutableDateTime6.setZone(dateTimeZone40);
        long long48 = dateTimeZone40.adjustOffset((long) 86399999, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime6", (dateTime3.compareTo(mutableDateTime6) == 0) == dateTime3.equals(mutableDateTime6));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        boolean boolean18 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long22 = dateTimeZone20.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.monthOfYear();
        int int25 = dateTime23.get(dateTimeFieldType24);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long29 = dateTimeZone27.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(dateTimeZone27);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight30.withField(dateTimeFieldType31, (int) '4');
        org.joda.time.DateTime.Property property34 = dateTime23.property(dateTimeFieldType31);
        int int35 = mutableDateTime6.get(dateTimeFieldType31);
        org.joda.time.DateTime dateTime36 = mutableDateTime6.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.secondOfDay();
        mutableDateTime6.set(dateTimeFieldType37, 9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime36", (dateTime3.compareTo(dateTime36) == 0) == dateTime3.equals(dateTime36));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfEven();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long12 = dateTimeZone10.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.withField(dateTimeFieldType14, (int) '4');
        org.joda.time.LocalDate localDate17 = dateMidnight16.toLocalDate();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableDuration19);
        org.joda.time.MutablePeriod mutablePeriod21 = period20.toMutablePeriod();
        java.lang.Object obj22 = mutablePeriod21.clone();
        org.joda.time.LocalDate localDate24 = localDate17.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod21, (int) (byte) 1);
        org.joda.time.LocalDate localDate26 = localDate17.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate28 = localDate17.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long32 = dateTimeZone30.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime34 = localDate28.toDateTimeAtStartOfDay(dateTimeZone30);
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(dateTimeZone30);
        mutableDateTime8.setZone(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime8", (dateTime3.compareTo(mutableDateTime8) == 0) == dateTime3.equals(mutableDateTime8));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 1);
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfHour();
        org.joda.time.DateTime dateTime11 = property10.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime16 = dateTime11.withZone(dateTimeZone13);
        int int17 = dateTime11.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime16", (dateTime11.compareTo(dateTime16) == 0) == dateTime11.equals(dateTime16));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis((long) 12);
        org.joda.time.Instant instant4 = instant1.toInstant();
        org.joda.time.DateTime dateTime5 = instant4.toDateTime();
        org.joda.time.DateTime dateTime6 = instant4.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime5", (instant4.compareTo(dateTime5) == 0) == instant4.equals(dateTime5));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology13 = yearMonthDay12.getChronology();
        long long17 = chronology13.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = chronology13.add(readablePeriod18, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField22 = chronology13.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(1000L, chronology13);
        org.joda.time.DateTime dateTime24 = dateTime9.toDateTime(chronology13);
        org.joda.time.DateTimeField dateTimeField25 = chronology13.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime24", (dateTime3.compareTo(dateTime24) == 0) == dateTime3.equals(dateTime24));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        boolean boolean18 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long22 = dateTimeZone20.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.monthOfYear();
        int int25 = dateTime23.get(dateTimeFieldType24);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long29 = dateTimeZone27.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(dateTimeZone27);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight30.withField(dateTimeFieldType31, (int) '4');
        org.joda.time.DateTime.Property property34 = dateTime23.property(dateTimeFieldType31);
        int int35 = mutableDateTime6.get(dateTimeFieldType31);
        org.joda.time.DateTime dateTime36 = mutableDateTime6.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long40 = dateTimeZone38.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(dateTimeZone38);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight41.withField(dateTimeFieldType42, (int) '4');
        org.joda.time.LocalDate localDate45 = dateMidnight44.toLocalDate();
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant46, readableDuration47);
        org.joda.time.MutablePeriod mutablePeriod49 = period48.toMutablePeriod();
        java.lang.Object obj50 = mutablePeriod49.clone();
        org.joda.time.LocalDate localDate52 = localDate45.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod49, (int) (byte) 1);
        org.joda.time.LocalDate.Property property53 = localDate45.yearOfCentury();
        org.joda.time.LocalDate localDate55 = property53.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate56 = property53.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long60 = dateTimeZone58.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight(dateTimeZone58);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight61.withField(dateTimeFieldType62, (int) '4');
        org.joda.time.LocalDate localDate65 = dateMidnight64.toLocalDate();
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period(readableInstant66, readableDuration67);
        org.joda.time.MutablePeriod mutablePeriod69 = period68.toMutablePeriod();
        java.lang.Object obj70 = mutablePeriod69.clone();
        org.joda.time.LocalDate localDate72 = localDate65.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod69, (int) (byte) 1);
        org.joda.time.LocalDate localDate74 = localDate65.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate76 = localDate65.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long80 = dateTimeZone78.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime81 = org.joda.time.DateTime.now(dateTimeZone78);
        org.joda.time.DateTime dateTime82 = localDate76.toDateTimeAtStartOfDay(dateTimeZone78);
        org.joda.time.DateMidnight dateMidnight83 = new org.joda.time.DateMidnight(dateTimeZone78);
        org.joda.time.Interval interval84 = localDate56.toInterval(dateTimeZone78);
        long long88 = dateTimeZone78.convertLocalToUTC((long) 67, false, (long) 9);
        org.joda.time.DateTime dateTime89 = dateTime36.toDateTime(dateTimeZone78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime6", (dateTime3.compareTo(mutableDateTime6) == 0) == dateTime3.equals(mutableDateTime6));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("38");
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfCentury((int) (short) 0);
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTime dateTime7 = yearMonthDay5.toDateTime(timeOfDay6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime7.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime10.toMutableDateTime();
        org.joda.time.Period period14 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period16 = period14.minusMillis(12);
        org.joda.time.Period period18 = period16.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration19 = period16.toStandardDuration();
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (short) -1, periodType21, chronology22);
        boolean boolean25 = mutablePeriod23.equals((java.lang.Object) (-3599990L));
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay28 = null;
        org.joda.time.DateTime dateTime29 = yearMonthDay27.toDateTime(timeOfDay28);
        org.joda.time.DateTime dateTime31 = dateTime29.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime29.toMutableDateTime();
        java.lang.Object obj33 = mutableDateTime32.clone();
        org.joda.time.Chronology chronology34 = mutableDateTime32.getChronology();
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableDuration36);
        org.joda.time.MutablePeriod mutablePeriod38 = period37.toMutablePeriod();
        org.joda.time.Period period40 = period37.plusHours((int) 'a');
        org.joda.time.Minutes minutes41 = period40.toStandardMinutes();
        org.joda.time.Period period42 = period40.negated();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period46 = period42.plus((org.joda.time.ReadablePeriod) mutablePeriod45);
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay48.toDateTime(timeOfDay49);
        org.joda.time.DateTime dateTime51 = yearMonthDay48.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar52 = dateTime51.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.DateTime dateTime54 = dateTime51.minus(readableDuration53);
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay57 = null;
        org.joda.time.DateTime dateTime58 = yearMonthDay56.toDateTime(timeOfDay57);
        org.joda.time.DateTime dateTime60 = dateTime58.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime61 = dateTime58.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime61.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration63 = null;
        mutableDateTime61.add(readableDuration63, 100);
        mutablePeriod45.setPeriod((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) mutableDateTime61);
        mutableDateTime32.setMillis((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Duration duration68 = mutablePeriod23.toDurationTo((org.joda.time.ReadableInstant) dateTime51);
        boolean boolean69 = duration19.isLongerThan((org.joda.time.ReadableDuration) duration68);
        mutableDateTime12.add((org.joda.time.ReadableDuration) duration68, (int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay73 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay74 = null;
        org.joda.time.DateTime dateTime75 = yearMonthDay73.toDateTime(timeOfDay74);
        org.joda.time.DateTime dateTime77 = dateTime75.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime78 = dateTime75.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField79 = null;
        mutableDateTime78.setRounding(dateTimeField79, (int) '#');
        mutableDateTime78.addMillis((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime84 = mutableDateTime78.toMutableDateTime();
        mutableDateTime84.addMinutes(86399999);
        mutableDateTime12.setMillis((org.joda.time.ReadableInstant) mutableDateTime84);
        org.joda.time.DateTimeZone dateTimeZone89 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        mutableDateTime12.setZone(dateTimeZone89);
        org.joda.time.DateMidnight dateMidnight91 = localDate1.toDateMidnight(dateTimeZone89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and mutableDateTime84", (mutableDateTime12.compareTo(mutableDateTime84) == 0) == mutableDateTime12.equals(mutableDateTime84));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate8.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtStartOfDay(dateTimeZone21);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology28 = yearMonthDay27.getChronology();
        long long32 = chronology28.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = chronology28.add(readablePeriod33, (long) 7, (-60634556));
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime25.toMutableDateTime(chronology28);
        org.joda.time.DurationField durationField38 = chronology28.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and mutableDateTime37", (dateTime25.compareTo(mutableDateTime37) == 0) == dateTime25.equals(mutableDateTime37));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis((long) 12);
        org.joda.time.Instant instant4 = instant1.toInstant();
        org.joda.time.Period period6 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period8 = period6.minusMillis(12);
        org.joda.time.Period period10 = period8.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration11 = period8.toStandardDuration();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (short) -1, periodType13, chronology14);
        boolean boolean17 = mutablePeriod15.equals((java.lang.Object) (-3599990L));
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay19.toDateTime(timeOfDay20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime21.toMutableDateTime();
        java.lang.Object obj25 = mutableDateTime24.clone();
        org.joda.time.Chronology chronology26 = mutableDateTime24.getChronology();
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableDuration28);
        org.joda.time.MutablePeriod mutablePeriod30 = period29.toMutablePeriod();
        org.joda.time.Period period32 = period29.plusHours((int) 'a');
        org.joda.time.Minutes minutes33 = period32.toStandardMinutes();
        org.joda.time.Period period34 = period32.negated();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period38 = period34.plus((org.joda.time.ReadablePeriod) mutablePeriod37);
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay41 = null;
        org.joda.time.DateTime dateTime42 = yearMonthDay40.toDateTime(timeOfDay41);
        org.joda.time.DateTime dateTime43 = yearMonthDay40.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar44 = dateTime43.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime46 = dateTime43.minus(readableDuration45);
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay48.toDateTime(timeOfDay49);
        org.joda.time.DateTime dateTime52 = dateTime50.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime50.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime53.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration55 = null;
        mutableDateTime53.add(readableDuration55, 100);
        mutablePeriod37.setPeriod((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) mutableDateTime53);
        mutableDateTime24.setMillis((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Duration duration60 = mutablePeriod15.toDurationTo((org.joda.time.ReadableInstant) dateTime43);
        boolean boolean61 = duration11.isLongerThan((org.joda.time.ReadableDuration) duration60);
        org.joda.time.Instant instant62 = instant1.minus((org.joda.time.ReadableDuration) duration11);
        org.joda.time.MutableDateTime mutableDateTime63 = instant1.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long73 = dateTimeZone71.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight(dateTimeZone71);
        org.joda.time.DateMidnight dateMidnight75 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone71);
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime(3, (int) (byte) 10, 7, 8, 0, dateTimeZone71);
        java.util.Locale locale78 = java.util.Locale.GERMAN;
        java.util.Locale locale79 = java.util.Locale.CANADA;
        java.lang.String str80 = locale79.getISO3Country();
        java.lang.String str81 = locale78.getDisplayScript(locale79);
        java.lang.String str82 = dateTimeZone71.getName((long) 32, locale79);
        org.joda.time.MutableDateTime mutableDateTime83 = instant1.toMutableDateTime(dateTimeZone71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime63", (instant1.compareTo(mutableDateTime63) == 0) == instant1.equals(mutableDateTime63));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTime dateTime7 = yearMonthDay5.toDateTime(timeOfDay6);
        org.joda.time.DateTime dateTime8 = yearMonthDay5.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readableDuration9);
        org.joda.time.DateTime dateTime11 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableDuration13);
        org.joda.time.MutablePeriod mutablePeriod15 = period14.toMutablePeriod();
        org.joda.time.Period period17 = period14.plusHours((int) 'a');
        org.joda.time.Minutes minutes18 = period17.toStandardMinutes();
        org.joda.time.Period period19 = period17.negated();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period23 = period19.plus((org.joda.time.ReadablePeriod) mutablePeriod22);
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay1.minus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay24.withYear(22);
        int[] intArray27 = yearMonthDay24.getValues();
        org.joda.time.TimeOfDay timeOfDay28 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTime dateTime32 = yearMonthDay30.toDateTime(timeOfDay31);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime32.toMutableDateTime();
        java.lang.Object obj36 = mutableDateTime35.clone();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime35.setZone(dateTimeZone38);
        org.joda.time.DateTime dateTime40 = yearMonthDay24.toDateTime(timeOfDay28, dateTimeZone38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and mutableDateTime35", (dateTime32.compareTo(mutableDateTime35) == 0) == dateTime32.equals(mutableDateTime35));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        boolean boolean18 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime6, readableDuration19);
        int int21 = mutablePeriod20.getSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime6", (dateTime3.compareTo(mutableDateTime6) == 0) == dateTime3.equals(mutableDateTime6));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone13);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant19 = mutableDateTime6.toInstant();
        org.joda.time.DateTime dateTime20 = instant19.toDateTimeISO();
        long long21 = instant19.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and dateTime20", (mutableDateTime6.compareTo(dateTime20) == 0) == mutableDateTime6.equals(dateTime20));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone13);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant19 = mutableDateTime6.toInstant();
        org.joda.time.DateTime dateTime20 = instant19.toDateTimeISO();
        int int21 = dateTime20.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant19", (mutableDateTime6.compareTo(instant19) == 0) == mutableDateTime6.equals(instant19));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 1);
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfHour();
        org.joda.time.DateTime dateTime11 = property10.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime16 = dateTime11.withZone(dateTimeZone13);
        org.joda.time.DateTime dateTime18 = dateTime11.minusWeeks((int) 'x');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime16", (dateTime11.compareTo(dateTime16) == 0) == dateTime11.equals(dateTime16));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        int int4 = yearMonthDay1.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTime dateTime8 = yearMonthDay6.toDateTime(timeOfDay7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime8.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime14 = dateTime8.withDurationAdded(readableDuration12, (int) (short) 1);
        org.joda.time.DateTime.Property property15 = dateTime8.minuteOfHour();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay18.toDateTime(timeOfDay19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime20.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime23.toMutableDateTime();
        boolean boolean26 = dateTime16.isBefore((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        mutableDateTime25.setZoneRetainFields(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = yearMonthDay1.toDateTimeAtMidnight(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime25", (dateTime3.compareTo(mutableDateTime25) == 0) == dateTime3.equals(mutableDateTime25));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        boolean boolean18 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime6, readableDuration19);
        java.util.Date date21 = mutableDateTime6.toDate();
        org.joda.time.YearMonthDay yearMonthDay22 = org.joda.time.YearMonthDay.fromDateFields(date21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime6", (dateTime3.compareTo(mutableDateTime6) == 0) == dateTime3.equals(mutableDateTime6));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.minuteOfHour();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.lang.String str10 = property7.getAsText(locale9);
        org.joda.time.MutableDateTime mutableDateTime11 = property7.roundHalfFloor();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay13.minusDays((int) (byte) 1);
        int[] intArray18 = yearMonthDay17.getValues();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long22 = dateTimeZone20.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight24 = yearMonthDay17.toDateMidnight(dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusWeeks(22175113);
        mutableDateTime11.setMillis((org.joda.time.ReadableInstant) dateMidnight26);
        int int28 = mutableDateTime11.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and dateMidnight26", (mutableDateTime11.compareTo(dateMidnight26) == 0) == mutableDateTime11.equals(dateMidnight26));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone2);
        org.joda.time.Chronology chronology4 = dateMidnight3.getChronology();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) (-97), (long) ' ', chronology4);
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology9 = yearMonthDay8.getChronology();
        long long13 = chronology9.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = chronology9.add(readablePeriod14, (long) 7, (-60634556));
        org.joda.time.DurationField durationField18 = chronology9.eras();
        mutablePeriod5.setPeriod((long) 2022, chronology9);
        org.joda.time.DurationField durationField20 = chronology9.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField20, and durationField18", !(durationField18.compareTo(durationField20) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField20.compareTo(durationField18))));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        boolean boolean18 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableDuration20);
        org.joda.time.MutablePeriod mutablePeriod22 = period21.toMutablePeriod();
        org.joda.time.Period period24 = period21.plusHours((int) 'a');
        org.joda.time.Period period26 = period21.withWeeks((int) (byte) -1);
        org.joda.time.Period period28 = period26.plusDays(0);
        org.joda.time.Duration duration29 = period28.toStandardDuration();
        org.joda.time.Period period30 = period28.negated();
        mutableDateTime17.add((org.joda.time.ReadablePeriod) period30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime6", (dateTime3.compareTo(mutableDateTime6) == 0) == dateTime3.equals(mutableDateTime6));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        boolean boolean18 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime6, readableDuration19);
        java.util.Date date21 = mutableDateTime6.toDate();
        org.joda.time.TimeOfDay timeOfDay22 = org.joda.time.TimeOfDay.fromDateFields(date21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime6", (dateTime3.compareTo(mutableDateTime6) == 0) == dateTime3.equals(mutableDateTime6));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weekyears();
        org.joda.time.DateMidnight dateMidnight10 = org.joda.time.DateMidnight.now(chronology8);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.plus((long) (-1));
        org.joda.time.Period period14 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period16 = period14.minusMillis(12);
        org.joda.time.Period period18 = period16.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration19 = period16.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableDuration21);
        org.joda.time.MutablePeriod mutablePeriod23 = period22.toMutablePeriod();
        java.lang.Object obj24 = mutablePeriod23.clone();
        mutablePeriod23.setYears((int) ' ');
        int int27 = mutablePeriod23.getDays();
        boolean boolean28 = duration19.equals((java.lang.Object) int27);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTime dateTime32 = yearMonthDay30.toDateTime(timeOfDay31);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime32.toMutableDateTime();
        java.lang.Object obj36 = mutableDateTime35.clone();
        org.joda.time.Chronology chronology37 = mutableDateTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.era();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField40 = chronology37.weekyearOfCentury();
        org.joda.time.DurationField durationField41 = chronology37.eras();
        org.joda.time.DateMidnight dateMidnight42 = org.joda.time.DateMidnight.now(chronology37);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration19, (org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(chronology44);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration19, (org.joda.time.ReadableInstant) dateMidnight45);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight12.plus((org.joda.time.ReadableDuration) duration19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField41", Math.signum(durationField9.compareTo(durationField41)) == -Math.signum(durationField41.compareTo(durationField9)));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime6.add(readableDuration9);
        mutableDateTime6.setMillis((long) (-1));
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime6.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.getMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay16.toDateTime(timeOfDay17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime18.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.minuteOfHour();
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("");
        java.lang.String str25 = property22.getAsText(locale24);
        org.joda.time.MutableDateTime mutableDateTime26 = property22.roundHalfFloor();
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay28.toDateTime(timeOfDay29);
        org.joda.time.YearMonthDay yearMonthDay32 = yearMonthDay28.minusDays((int) (byte) 1);
        int[] intArray33 = yearMonthDay32.getValues();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long37 = dateTimeZone35.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(dateTimeZone35);
        org.joda.time.DateMidnight dateMidnight39 = yearMonthDay32.toDateMidnight(dateTimeZone35);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.minusWeeks(22175113);
        mutableDateTime26.setMillis((org.joda.time.ReadableInstant) dateMidnight41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight41.withWeekyear(24);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight41.plusMonths(22);
        int int47 = mutableDateTime14.compareTo((org.joda.time.ReadableInstant) dateMidnight46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and dateMidnight41", (mutableDateTime21.compareTo(dateMidnight41) == 0) == mutableDateTime21.equals(dateMidnight41));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight5 = org.joda.time.DateMidnight.now(dateTimeZone4);
        org.joda.time.Chronology chronology6 = dateMidnight5.getChronology();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.Period period9 = new org.joda.time.Period(0L, periodType8);
        int[] intArray11 = chronology6.get((org.joda.time.ReadablePeriod) period9, (long) 7);
        org.joda.time.DurationField durationField12 = chronology6.millis();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withChronology(chronology6);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay15.toDateTime(timeOfDay16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime17.toMutableDateTime();
        java.lang.Object obj21 = mutableDateTime20.clone();
        org.joda.time.Chronology chronology22 = mutableDateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.era();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.weekyearOfCentury();
        org.joda.time.DurationField durationField26 = chronology22.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withChronology(chronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField26", Math.signum(durationField12.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField12)));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology13 = yearMonthDay12.getChronology();
        long long17 = chronology13.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = chronology13.add(readablePeriod18, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField22 = chronology13.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(1000L, chronology13);
        org.joda.time.DateTime dateTime24 = dateTime9.toDateTime(chronology13);
        org.joda.time.DateTimeField dateTimeField25 = chronology13.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime24", (dateTime3.compareTo(dateTime24) == 0) == dateTime3.equals(dateTime24));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long13 = dateTimeZone11.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekyear(2);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime3.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay20.toDateTime(timeOfDay21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime22.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime28 = dateTime22.withDurationAdded(readableDuration26, (int) (short) 1);
        org.joda.time.DateTime.Property property29 = dateTime22.minuteOfHour();
        org.joda.time.DateTime.Property property30 = dateTime22.monthOfYear();
        org.joda.time.DateTime dateTime31 = property30.withMaximumValue();
        org.joda.time.DateTime dateTime33 = property30.setCopy(8);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay36 = null;
        org.joda.time.DateTime dateTime37 = yearMonthDay35.toDateTime(timeOfDay36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime37.toMutableDateTime();
        java.lang.Object obj41 = mutableDateTime40.clone();
        org.joda.time.Chronology chronology42 = mutableDateTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.era();
        org.joda.time.DateTime dateTime44 = dateTime33.toDateTime(chronology42);
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now(chronology42);
        boolean boolean46 = dateTime3.isEqual((org.joda.time.ReadableInstant) mutableDateTime45);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay49 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay49.toDateTime(timeOfDay50);
        org.joda.time.DateTime dateTime53 = dateTime51.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime51.toMutableDateTime();
        java.lang.Object obj55 = mutableDateTime54.clone();
        org.joda.time.Chronology chronology56 = mutableDateTime54.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.era();
        org.joda.time.DateTimeField dateTimeField58 = dateTimeFieldType47.getField(chronology56);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) (short) -1, periodType60, chronology61);
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) (short) -1, periodType64, chronology65);
        mutablePeriod62.add((org.joda.time.ReadablePeriod) mutablePeriod66);
        int[] intArray69 = chronology56.get((org.joda.time.ReadablePeriod) mutablePeriod66, (long) 23);
        org.joda.time.DateTimeField dateTimeField70 = chronology56.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime3.toMutableDateTime(chronology56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and mutableDateTime45", (dateTime14.compareTo(mutableDateTime45) == 0) == dateTime14.equals(mutableDateTime45));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        int int4 = mutablePeriod3.getHours();
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutablePeriod3.setPeriod(readableDuration5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay9.toDateTime(timeOfDay10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime11.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.minuteOfHour();
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("");
        java.lang.String str18 = property15.getAsText(locale17);
        org.joda.time.MutableDateTime mutableDateTime19 = property15.roundHalfFloor();
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay21.toDateTime(timeOfDay22);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay21.minusDays((int) (byte) 1);
        int[] intArray26 = yearMonthDay25.getValues();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long30 = dateTimeZone28.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(dateTimeZone28);
        org.joda.time.DateMidnight dateMidnight32 = yearMonthDay25.toDateMidnight(dateTimeZone28);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusWeeks(22175113);
        mutableDateTime19.setMillis((org.joda.time.ReadableInstant) dateMidnight34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight34.withWeekyear(24);
        mutablePeriod3.setPeriod(readableInstant7, (org.joda.time.ReadableInstant) dateMidnight37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and dateMidnight34", (mutableDateTime14.compareTo(dateMidnight34) == 0) == mutableDateTime14.equals(dateMidnight34));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        boolean boolean18 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime17.addDays((-60581005));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime6", (dateTime3.compareTo(mutableDateTime6) == 0) == dateTime3.equals(mutableDateTime6));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.minus(readableDuration5);
        org.joda.time.DateTime dateTime8 = dateTime4.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime10 = dateTime4.withMillis((long) 'a');
        org.joda.time.DateTime dateTime13 = dateTime10.withDurationAdded((long) 22175113, 687);
        org.joda.time.DateTime.Property property14 = dateTime10.hourOfDay();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay16.toDateTime(timeOfDay17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime18.toMutableDateTime();
        java.lang.Object obj22 = mutableDateTime21.clone();
        org.joda.time.Chronology chronology23 = mutableDateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.era();
        org.joda.time.DateTimeField dateTimeField25 = chronology23.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.weekyearOfCentury();
        org.joda.time.DurationField durationField27 = chronology23.eras();
        org.joda.time.DateTimeField dateTimeField28 = chronology23.clockhourOfDay();
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay((java.lang.Object) dateTime10, chronology23);
        org.joda.time.DurationField durationField30 = chronology23.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField30, and durationField27", !(durationField27.compareTo(durationField30) == 0) || (Math.signum(durationField27.compareTo(durationField27)) == Math.signum(durationField30.compareTo(durationField27))));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        long long14 = dateTimeZone9.convertLocalToUTC(0L, true, 2678400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime6", (dateTime3.compareTo(mutableDateTime6) == 0) == dateTime3.equals(mutableDateTime6));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period5 = period2.plusHours((int) 'a');
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Period period7 = period5.negated();
        org.joda.time.Period period9 = period7.withSeconds(67);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay11.toDateTime(timeOfDay12);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay15.toDateTime(timeOfDay16);
        org.joda.time.DateTime dateTime18 = yearMonthDay15.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.minus(readableDuration19);
        org.joda.time.DateTime dateTime21 = yearMonthDay11.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableDuration23);
        org.joda.time.MutablePeriod mutablePeriod25 = period24.toMutablePeriod();
        org.joda.time.Period period27 = period24.plusHours((int) 'a');
        org.joda.time.Minutes minutes28 = period27.toStandardMinutes();
        org.joda.time.Period period29 = period27.negated();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period33 = period29.plus((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay11.minus((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Period period35 = period9.withFields((org.joda.time.ReadablePeriod) period33);
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay38 = null;
        org.joda.time.DateTime dateTime39 = yearMonthDay37.toDateTime(timeOfDay38);
        org.joda.time.DateTime dateTime41 = dateTime39.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime39.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime42.minuteOfHour();
        java.util.Locale locale45 = java.util.Locale.forLanguageTag("");
        java.lang.String str46 = property43.getAsText(locale45);
        org.joda.time.MutableDateTime mutableDateTime47 = property43.roundHalfFloor();
        org.joda.time.YearMonthDay yearMonthDay49 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay49.toDateTime(timeOfDay50);
        org.joda.time.YearMonthDay yearMonthDay53 = yearMonthDay49.minusDays((int) (byte) 1);
        int[] intArray54 = yearMonthDay53.getValues();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long58 = dateTimeZone56.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight(dateTimeZone56);
        org.joda.time.DateMidnight dateMidnight60 = yearMonthDay53.toDateMidnight(dateTimeZone56);
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight60.minusWeeks(22175113);
        mutableDateTime47.setMillis((org.joda.time.ReadableInstant) dateMidnight62);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight62.withWeekyear(24);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight62.plusMonths(22);
        boolean boolean68 = period9.equals((java.lang.Object) dateMidnight62);
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.YearMonthDay yearMonthDay71 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay72 = null;
        org.joda.time.DateTime dateTime73 = yearMonthDay71.toDateTime(timeOfDay72);
        org.joda.time.DateTime dateTime75 = dateTime73.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod(readableDuration69, (org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.PeriodType periodType77 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType78 = org.joda.time.DurationFieldType.seconds();
        int int79 = periodType77.indexOf(durationFieldType78);
        org.joda.time.DateTime dateTime81 = dateTime73.withFieldAdded(durationFieldType78, 4);
        java.lang.String str82 = durationFieldType78.toString();
        org.joda.time.Period period84 = period9.withField(durationFieldType78, 5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime42 and dateMidnight62", (mutableDateTime42.compareTo(dateMidnight62) == 0) == mutableDateTime42.equals(dateMidnight62));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime4.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime10 = dateTime4.withDurationAdded(readableDuration8, (int) (short) 1);
        org.joda.time.DateTime.Property property11 = dateTime4.minuteOfHour();
        org.joda.time.DateTime dateTime12 = property11.getDateTime();
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay14.toDateTime(timeOfDay15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime16.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime19.toMutableDateTime();
        boolean boolean22 = dateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        mutableDateTime21.setZoneRetainFields(dateTimeZone25);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 22221, dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime21", (dateTime4.compareTo(mutableDateTime21) == 0) == dateTime4.equals(mutableDateTime21));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate18 = property16.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate19 = property16.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight24.withField(dateTimeFieldType25, (int) '4');
        org.joda.time.LocalDate localDate28 = dateMidnight27.toLocalDate();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableDuration30);
        org.joda.time.MutablePeriod mutablePeriod32 = period31.toMutablePeriod();
        java.lang.Object obj33 = mutablePeriod32.clone();
        org.joda.time.LocalDate localDate35 = localDate28.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod32, (int) (byte) 1);
        org.joda.time.LocalDate localDate37 = localDate28.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate39 = localDate28.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long43 = dateTimeZone41.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime45 = localDate39.toDateTimeAtStartOfDay(dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(dateTimeZone41);
        org.joda.time.Interval interval47 = localDate19.toInterval(dateTimeZone41);
        org.joda.time.YearMonthDay yearMonthDay49 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay49.toDateTime(timeOfDay50);
        org.joda.time.DateTime dateTime53 = dateTime51.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime51.toMutableDateTime();
        java.lang.Object obj55 = mutableDateTime54.clone();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime54.setZone(dateTimeZone57);
        org.joda.time.YearMonthDay yearMonthDay60 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay61 = null;
        org.joda.time.DateTime dateTime62 = yearMonthDay60.toDateTime(timeOfDay61);
        org.joda.time.DateTime dateTime64 = dateTime62.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime65 = dateTime62.toMutableDateTime();
        boolean boolean66 = mutableDateTime54.isAfter((org.joda.time.ReadableInstant) mutableDateTime65);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long70 = dateTimeZone68.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime71 = org.joda.time.DateTime.now(dateTimeZone68);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.monthOfYear();
        int int73 = dateTime71.get(dateTimeFieldType72);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long77 = dateTimeZone75.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight78 = new org.joda.time.DateMidnight(dateTimeZone75);
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight81 = dateMidnight78.withField(dateTimeFieldType79, (int) '4');
        org.joda.time.DateTime.Property property82 = dateTime71.property(dateTimeFieldType79);
        int int83 = mutableDateTime54.get(dateTimeFieldType79);
        int int84 = dateTimeZone41.getOffset((org.joda.time.ReadableInstant) mutableDateTime54);
        org.joda.time.LocalDate localDate85 = org.joda.time.LocalDate.now(dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime51 and mutableDateTime54", (dateTime51.compareTo(mutableDateTime54) == 0) == dateTime51.equals(mutableDateTime54));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate18 = property16.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate19 = property16.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight24.withField(dateTimeFieldType25, (int) '4');
        org.joda.time.LocalDate localDate28 = dateMidnight27.toLocalDate();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableDuration30);
        org.joda.time.MutablePeriod mutablePeriod32 = period31.toMutablePeriod();
        java.lang.Object obj33 = mutablePeriod32.clone();
        org.joda.time.LocalDate localDate35 = localDate28.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod32, (int) (byte) 1);
        org.joda.time.LocalDate localDate37 = localDate28.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate39 = localDate28.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long43 = dateTimeZone41.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime45 = localDate39.toDateTimeAtStartOfDay(dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(dateTimeZone41);
        org.joda.time.Interval interval47 = localDate19.toInterval(dateTimeZone41);
        java.util.Date date48 = localDate19.toDate();
        org.joda.time.LocalDate localDate50 = localDate19.withDayOfMonth(23);
        int int51 = localDate50.getCenturyOfEra();
        org.joda.time.Chronology chronology52 = localDate50.getChronology();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(chronology52);
        org.joda.time.DateTimeField dateTimeField54 = chronology52.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and dateTime53", (dateTime44.compareTo(dateTime53) == 0) == dateTime44.equals(dateTime53));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.plus((long) ' ');
        org.joda.time.DateTime dateTime7 = dateTime3.plusYears(2);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours(35);
        long long11 = dateTimeZone9.previousTransition((long) 17);
        org.joda.time.DateTime dateTime12 = dateTime7.toDateTime(dateTimeZone9);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay15.toDateTime(timeOfDay16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime17.toMutableDateTime();
        java.lang.Object obj21 = mutableDateTime20.clone();
        org.joda.time.Chronology chronology22 = mutableDateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.era();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType13.getField(chronology22);
        org.joda.time.DateTimeZone dateTimeZone25 = chronology22.getZone();
        long long27 = dateTimeZone9.getMillisKeepLocal(dateTimeZone25, (-1380L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime12", (dateTime7.compareTo(dateTime12) == 0) == dateTime7.equals(dateTime12));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology13 = yearMonthDay12.getChronology();
        long long17 = chronology13.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = chronology13.add(readablePeriod18, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField22 = chronology13.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(1000L, chronology13);
        org.joda.time.DateTime dateTime24 = dateTime9.toDateTime(chronology13);
        org.joda.time.DateTimeField dateTimeField25 = chronology13.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime24", (dateTime3.compareTo(dateTime24) == 0) == dateTime3.equals(dateTime24));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period5 = period2.plusHours((int) 'a');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period5.withSeconds((int) (short) -1);
        org.joda.time.MutablePeriod mutablePeriod9 = period5.toMutablePeriod();
        org.joda.time.Period period11 = period5.plusMonths(120);
        int int12 = period5.getWeeks();
        org.joda.time.Period period14 = period5.plusMinutes((-7));
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay16.toDateTime(timeOfDay17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime18.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.millisOfSecond();
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay24.toDateTime(timeOfDay25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime26.toMutableDateTime();
        java.lang.Object obj30 = mutableDateTime29.clone();
        org.joda.time.Chronology chronology31 = mutableDateTime29.getChronology();
        org.joda.time.ReadableDuration readableDuration32 = null;
        mutableDateTime29.add(readableDuration32);
        mutableDateTime29.setMillis((long) (-1));
        int int36 = property22.getDifference((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime29.weekyear();
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType39 = org.joda.time.DurationFieldType.seconds();
        int int40 = periodType38.indexOf(durationFieldType39);
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.millis();
        boolean boolean42 = periodType38.isSupported(durationFieldType41);
        org.joda.time.DurationFieldType durationFieldType44 = periodType38.getFieldType(0);
        mutableDateTime29.add(durationFieldType44, 59);
        org.joda.time.Period period48 = period5.withFieldAdded(durationFieldType44, 3);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long52 = dateTimeZone50.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay(dateTimeZone55);
        org.joda.time.YearMonthDay yearMonthDay58 = yearMonthDay56.minusYears((int) '4');
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) (short) -1, periodType60, chronology61);
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) (short) -1, periodType64, chronology65);
        mutablePeriod62.add((org.joda.time.ReadablePeriod) mutablePeriod66);
        mutablePeriod66.addMonths(0);
        org.joda.time.YearMonthDay yearMonthDay70 = yearMonthDay56.minus((org.joda.time.ReadablePeriod) mutablePeriod66);
        org.joda.time.DateTime dateTime71 = dateTime53.withFields((org.joda.time.ReadablePartial) yearMonthDay70);
        org.joda.time.YearMonthDay yearMonthDay74 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology75 = yearMonthDay74.getChronology();
        long long79 = chronology75.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        long long83 = chronology75.add(readablePeriod80, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField84 = chronology75.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod(1010L, chronology75);
        org.joda.time.PeriodType periodType88 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType89 = periodType88.withHoursRemoved();
        org.joda.time.DateTimeZone dateTimeZone90 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight91 = org.joda.time.DateMidnight.now(dateTimeZone90);
        org.joda.time.Chronology chronology92 = dateMidnight91.getChronology();
        org.joda.time.Period period93 = new org.joda.time.Period((-1128294000000L), 8000L, periodType88, chronology92);
        int[] intArray96 = chronology75.get((org.joda.time.ReadablePeriod) period93, (long) 23, (long) 22);
        org.joda.time.MutableDateTime mutableDateTime97 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime53, chronology75);
        boolean boolean98 = durationFieldType44.isSupported(chronology75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime53 and mutableDateTime97", (dateTime53.compareTo(mutableDateTime97) == 0) == dateTime53.equals(mutableDateTime97));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone13);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant19 = mutableDateTime6.toInstant();
        long long20 = instant19.getMillis();
        org.joda.time.DateTime dateTime21 = instant19.toDateTimeISO();
        org.joda.time.Instant instant23 = instant19.minus((long) (-60577410));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and dateTime21", (mutableDateTime6.compareTo(dateTime21) == 0) == mutableDateTime6.equals(dateTime21));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 1);
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfHour();
        org.joda.time.DateTime dateTime11 = property10.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime16 = dateTime11.withZone(dateTimeZone13);
        long long19 = dateTimeZone13.adjustOffset(100L, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime16", (dateTime3.compareTo(dateTime16) == 0) == dateTime3.equals(dateTime16));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) -1, periodType1, chronology2);
        boolean boolean5 = mutablePeriod3.equals((java.lang.Object) (-3599990L));
        int int6 = mutablePeriod3.getMonths();
        int int7 = mutablePeriod3.getMonths();
        mutablePeriod3.setHours(57);
        int int10 = mutablePeriod3.getMillis();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter14.withOffsetParsed();
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay17.toDateTime(timeOfDay18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime19.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.millisOfSecond();
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay26 = null;
        org.joda.time.DateTime dateTime27 = yearMonthDay25.toDateTime(timeOfDay26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime27.toMutableDateTime();
        java.lang.Object obj31 = mutableDateTime30.clone();
        org.joda.time.Chronology chronology32 = mutableDateTime30.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.weekyears();
        mutableDateTime22.setChronology(chronology32);
        org.joda.time.DateTimeField dateTimeField35 = chronology32.secondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter15.withChronology(chronology32);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeFormatter15.getZone();
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay40 = null;
        org.joda.time.DateTime dateTime41 = yearMonthDay39.toDateTime(timeOfDay40);
        org.joda.time.DateTime dateTime43 = dateTime41.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime41.toMutableDateTime();
        java.lang.Object obj45 = mutableDateTime44.clone();
        org.joda.time.Chronology chronology46 = mutableDateTime44.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.era();
        org.joda.time.DateTimeField dateTimeField48 = chronology46.clockhourOfHalfday();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(chronology46);
        org.joda.time.DateTimeField dateTimeField50 = chronology46.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter15.withChronology(chronology46);
        mutablePeriod3.add((long) 292278993, chronology46);
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType54 = org.joda.time.DurationFieldType.seconds();
        int int55 = periodType53.indexOf(durationFieldType54);
        org.joda.time.YearMonthDay yearMonthDay57 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology58 = yearMonthDay57.getChronology();
        long long62 = chronology58.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        long long66 = chronology58.add(readablePeriod63, (long) 7, (-60634556));
        org.joda.time.DurationField durationField67 = chronology58.weekyears();
        boolean boolean68 = durationFieldType54.isSupported(chronology58);
        int int69 = mutablePeriod3.indexOf(durationFieldType54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField33 and durationField67", (durationField33.compareTo(durationField67) == 0) == durationField33.equals(durationField67));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime5 = yearMonthDay2.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(1);
        int int8 = dateTime5.getMillisOfSecond();
        org.joda.time.DateTime dateTime10 = dateTime5.plusHours(53);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone13);
        org.joda.time.DateMidnight.Property property18 = dateMidnight17.yearOfEra();
        org.joda.time.DateMidnight dateMidnight19 = property18.roundHalfEvenCopy();
        org.joda.time.YearMonthDay yearMonthDay20 = dateMidnight19.toYearMonthDay();
        org.joda.time.Chronology chronology21 = yearMonthDay20.getChronology();
        long long25 = chronology21.add((long) 'x', 8000L, 965);
        org.joda.time.DateTime dateTime26 = dateTime5.toDateTime(chronology21);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(662688000000L, chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime26", (dateTime5.compareTo(dateTime26) == 0) == dateTime5.equals(dateTime26));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant4 = instant1.toInstant();
        org.joda.time.Instant instant6 = instant1.minus((long) 29);
        org.joda.time.DateTime dateTime7 = instant1.toDateTimeISO();
        org.joda.time.DateTime dateTime8 = instant1.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime7", (instant1.compareTo(dateTime7) == 0) == instant1.equals(dateTime7));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime6.toMutableDateTime();
        org.joda.time.Period period10 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period12 = period10.minusMillis(12);
        org.joda.time.Period period14 = period12.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration15 = period12.toStandardDuration();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (short) -1, periodType17, chronology18);
        boolean boolean21 = mutablePeriod19.equals((java.lang.Object) (-3599990L));
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTime dateTime25 = yearMonthDay23.toDateTime(timeOfDay24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime25.toMutableDateTime();
        java.lang.Object obj29 = mutableDateTime28.clone();
        org.joda.time.Chronology chronology30 = mutableDateTime28.getChronology();
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant31, readableDuration32);
        org.joda.time.MutablePeriod mutablePeriod34 = period33.toMutablePeriod();
        org.joda.time.Period period36 = period33.plusHours((int) 'a');
        org.joda.time.Minutes minutes37 = period36.toStandardMinutes();
        org.joda.time.Period period38 = period36.negated();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period42 = period38.plus((org.joda.time.ReadablePeriod) mutablePeriod41);
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay45 = null;
        org.joda.time.DateTime dateTime46 = yearMonthDay44.toDateTime(timeOfDay45);
        org.joda.time.DateTime dateTime47 = yearMonthDay44.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar48 = dateTime47.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.DateTime dateTime50 = dateTime47.minus(readableDuration49);
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay53 = null;
        org.joda.time.DateTime dateTime54 = yearMonthDay52.toDateTime(timeOfDay53);
        org.joda.time.DateTime dateTime56 = dateTime54.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime54.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime57.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration59 = null;
        mutableDateTime57.add(readableDuration59, 100);
        mutablePeriod41.setPeriod((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableInstant) mutableDateTime57);
        mutableDateTime28.setMillis((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Duration duration64 = mutablePeriod19.toDurationTo((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean65 = duration15.isLongerThan((org.joda.time.ReadableDuration) duration64);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration64, (int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay69 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay70 = null;
        org.joda.time.DateTime dateTime71 = yearMonthDay69.toDateTime(timeOfDay70);
        org.joda.time.DateTime dateTime73 = dateTime71.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime74 = dateTime71.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField75 = null;
        mutableDateTime74.setRounding(dateTimeField75, (int) '#');
        mutableDateTime74.addMillis((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime80 = mutableDateTime74.toMutableDateTime();
        mutableDateTime80.addMinutes(86399999);
        mutableDateTime8.setMillis((org.joda.time.ReadableInstant) mutableDateTime80);
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        mutableDateTime8.setZone(dateTimeZone85);
        org.joda.time.MutableDateTime mutableDateTime87 = new org.joda.time.MutableDateTime(dateTimeZone85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime80", (mutableDateTime8.compareTo(mutableDateTime80) == 0) == mutableDateTime8.equals(mutableDateTime80));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusYears((int) '4');
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) (short) -1, periodType12, chronology13);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) (short) -1, periodType16, chronology17);
        mutablePeriod14.add((org.joda.time.ReadablePeriod) mutablePeriod18);
        mutablePeriod18.addMonths(0);
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay8.minus((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.DateTime dateTime23 = dateTime5.withFields((org.joda.time.ReadablePartial) yearMonthDay22);
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology27 = yearMonthDay26.getChronology();
        long long31 = chronology27.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = chronology27.add(readablePeriod32, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField36 = chronology27.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(1010L, chronology27);
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType41 = periodType40.withHoursRemoved();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight43 = org.joda.time.DateMidnight.now(dateTimeZone42);
        org.joda.time.Chronology chronology44 = dateMidnight43.getChronology();
        org.joda.time.Period period45 = new org.joda.time.Period((-1128294000000L), 8000L, periodType40, chronology44);
        int[] intArray48 = chronology27.get((org.joda.time.ReadablePeriod) period45, (long) 23, (long) 22);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime5, chronology27);
        org.joda.time.YearMonthDay yearMonthDay50 = new org.joda.time.YearMonthDay((long) 4178182, chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime49", (dateTime5.compareTo(mutableDateTime49) == 0) == dateTime5.equals(mutableDateTime49));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis((long) 12);
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = instant3.toMutableDateTime();
        mutableDateTime5.setWeekyear(86399999);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime4", (instant3.compareTo(mutableDateTime4) == 0) == instant3.equals(mutableDateTime4));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone13);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant19 = mutableDateTime6.toInstant();
        long long20 = instant19.getMillis();
        org.joda.time.Chronology chronology21 = instant19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = instant19.toMutableDateTime();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.seconds();
        int int25 = periodType23.indexOf(durationFieldType24);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology28 = yearMonthDay27.getChronology();
        long long32 = chronology28.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = chronology28.add(readablePeriod33, (long) 7, (-60634556));
        org.joda.time.DurationField durationField37 = chronology28.weekyears();
        boolean boolean38 = durationFieldType24.isSupported(chronology28);
        org.joda.time.DurationField durationField39 = chronology28.days();
        org.joda.time.DateTimeField dateTimeField40 = chronology28.secondOfDay();
        org.joda.time.DateTimeField dateTimeField41 = chronology28.minuteOfDay();
        org.joda.time.DateTime dateTime42 = mutableDateTime22.toDateTime(chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant19", (mutableDateTime6.compareTo(instant19) == 0) == mutableDateTime6.equals(instant19));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 1);
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfHour();
        org.joda.time.DateTime dateTime11 = property10.getDateTime();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime15.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime18.toMutableDateTime();
        boolean boolean21 = dateTime11.isBefore((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        mutableDateTime20.setZoneRetainFields(dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime20", (dateTime3.compareTo(mutableDateTime20) == 0) == dateTime3.equals(mutableDateTime20));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate18 = property16.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate19 = property16.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight24.withField(dateTimeFieldType25, (int) '4');
        org.joda.time.LocalDate localDate28 = dateMidnight27.toLocalDate();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableDuration30);
        org.joda.time.MutablePeriod mutablePeriod32 = period31.toMutablePeriod();
        java.lang.Object obj33 = mutablePeriod32.clone();
        org.joda.time.LocalDate localDate35 = localDate28.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod32, (int) (byte) 1);
        org.joda.time.LocalDate localDate37 = localDate28.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate39 = localDate28.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long43 = dateTimeZone41.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime45 = localDate39.toDateTimeAtStartOfDay(dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(dateTimeZone41);
        org.joda.time.Interval interval47 = localDate19.toInterval(dateTimeZone41);
        java.util.Date date48 = localDate19.toDate();
        org.joda.time.LocalDate localDate50 = localDate19.withDayOfMonth(23);
        int int51 = localDate50.getCenturyOfEra();
        org.joda.time.Chronology chronology52 = localDate50.getChronology();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(chronology52);
        org.joda.time.DateTimeField dateTimeField54 = chronology52.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and dateTime53", (dateTime44.compareTo(dateTime53) == 0) == dateTime44.equals(dateTime53));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone13);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant19 = mutableDateTime6.toInstant();
        long long20 = instant19.getMillis();
        org.joda.time.Chronology chronology21 = instant19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = instant19.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableDuration26);
        org.joda.time.MutablePeriod mutablePeriod28 = period27.toMutablePeriod();
        mutablePeriod28.setWeeks((int) '#');
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay24.plus((org.joda.time.ReadablePeriod) mutablePeriod28);
        int int32 = mutablePeriod28.getWeeks();
        org.joda.time.DurationFieldType[] durationFieldTypeArray33 = mutablePeriod28.getFieldTypes();
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay36 = null;
        org.joda.time.DateTime dateTime37 = yearMonthDay35.toDateTime(timeOfDay36);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay40 = null;
        org.joda.time.DateTime dateTime41 = yearMonthDay39.toDateTime(timeOfDay40);
        org.joda.time.DateTime dateTime42 = yearMonthDay39.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.minus(readableDuration43);
        org.joda.time.DateTime dateTime45 = yearMonthDay35.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime.Property property46 = dateTime45.dayOfWeek();
        org.joda.time.DateTime dateTime48 = property46.addToCopy(35);
        org.joda.time.Period period50 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period52 = period50.minusMillis(12);
        org.joda.time.Period period54 = period52.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration55 = period52.toStandardDuration();
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime48, (org.joda.time.ReadableDuration) duration55);
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration55);
        org.joda.time.Instant instant59 = instant19.withDurationAdded((org.joda.time.ReadableDuration) duration55, (-234534));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and mutableDateTime22", (mutableDateTime6.compareTo(mutableDateTime22) == 0) == mutableDateTime6.equals(mutableDateTime22));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime5 = yearMonthDay2.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readableDuration6);
        org.joda.time.DateTime dateTime9 = dateTime5.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime11 = dateTime5.withMillis((long) 'a');
        org.joda.time.DateTime dateTime14 = dateTime11.withDurationAdded((long) 22175113, 687);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableDuration16);
        org.joda.time.MutablePeriod mutablePeriod18 = period17.toMutablePeriod();
        org.joda.time.Period period20 = period17.plusHours((int) 'a');
        org.joda.time.Minutes minutes21 = period20.toStandardMinutes();
        org.joda.time.Period period22 = period20.negated();
        org.joda.time.Period period24 = period22.withYears((-1));
        int int25 = period22.getMinutes();
        org.joda.time.Period period27 = period22.plusMillis((-292275054));
        org.joda.time.DateTime dateTime29 = dateTime14.withPeriodAdded((org.joda.time.ReadablePeriod) period22, 0);
        int int30 = dateTime29.getMonthOfYear();
        org.joda.time.DateTime dateTime31 = dateTime29.toDateTime();
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay34 = null;
        org.joda.time.DateTime dateTime35 = yearMonthDay33.toDateTime(timeOfDay34);
        org.joda.time.YearMonthDay yearMonthDay37 = yearMonthDay33.minusDays((int) (byte) 1);
        int[] intArray38 = yearMonthDay37.getValues();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long42 = dateTimeZone40.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(dateTimeZone40);
        org.joda.time.DateMidnight dateMidnight44 = yearMonthDay37.toDateMidnight(dateTimeZone40);
        org.joda.time.DateTime dateTime45 = dateTime29.withZone(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(0L, dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime45", (dateTime14.compareTo(dateTime45) == 0) == dateTime14.equals(dateTime45));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.minuteOfHour();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.lang.String str10 = property7.getAsText(locale9);
        org.joda.time.MutableDateTime mutableDateTime11 = property7.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime11.toMutableDateTime(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime15", (dateTime3.compareTo(mutableDateTime15) == 0) == dateTime3.equals(mutableDateTime15));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.plusMinutes(86399999);
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.plusHours(1010);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTimeToday();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime5.withZoneRetainFields(dateTimeZone7);
        long long11 = dateTimeZone7.adjustOffset(506427652L, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime8", (dateTime5.compareTo(dateTime8) == 0) == dateTime5.equals(dateTime8));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate8.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtStartOfDay(dateTimeZone21);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology28 = yearMonthDay27.getChronology();
        long long32 = chronology28.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = chronology28.add(readablePeriod33, (long) 7, (-60634556));
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime25.toMutableDateTime(chronology28);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay40 = null;
        org.joda.time.DateTime dateTime41 = yearMonthDay39.toDateTime(timeOfDay40);
        org.joda.time.DateTime dateTime42 = yearMonthDay39.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.minus(readableDuration43);
        org.joda.time.DateTime dateTime46 = dateTime42.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime48 = dateTime42.withMillis((long) 'a');
        java.lang.String str50 = dateTime42.toString("53");
        org.joda.time.DateMidnight dateMidnight51 = dateTime42.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight51.minusDays(0);
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateMidnight53, periodType54);
        org.joda.time.DateMidnight.Property property56 = dateMidnight53.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and mutableDateTime37", (dateTime25.compareTo(mutableDateTime37) == 0) == dateTime25.equals(mutableDateTime37));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate18 = property16.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate19 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate21 = localDate19.plusWeeks(23);
        org.joda.time.DateTime dateTime22 = localDate19.toDateTimeAtStartOfDay();
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay24.toDateTime(timeOfDay25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime26.toMutableDateTime();
        java.lang.Object obj30 = mutableDateTime29.clone();
        int int31 = mutableDateTime29.getHourOfDay();
        boolean boolean32 = dateTime22.isEqual((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.DateTime dateTime34 = dateTime22.withMillisOfDay(4);
        org.joda.time.DateTime dateTime36 = dateTime22.minusYears(121);
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay39 = null;
        org.joda.time.DateTime dateTime40 = yearMonthDay38.toDateTime(timeOfDay39);
        org.joda.time.DateTime dateTime42 = dateTime40.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime40.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTime dateTime46 = dateTime40.withDurationAdded(readableDuration44, (int) (short) 1);
        org.joda.time.DateTime.Property property47 = dateTime40.minuteOfHour();
        org.joda.time.DateTime dateTime48 = property47.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long52 = dateTimeZone50.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime53 = dateTime48.withZone(dateTimeZone50);
        org.joda.time.DateTime dateTime54 = dateTime22.withZone(dateTimeZone50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime53", (dateTime26.compareTo(dateTime53) == 0) == dateTime26.equals(dateTime53));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.secondOfMinute();
        org.joda.time.DurationField durationField2 = property1.getDurationField();
        org.joda.time.TimeOfDay timeOfDay4 = property1.addToCopy(22);
        java.lang.String str5 = property1.toString();
        org.joda.time.TimeOfDay timeOfDay7 = property1.addToCopy((int) (short) 0);
        org.joda.time.TimeOfDay timeOfDay8 = property1.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        int int14 = dateTimeZone12.getStandardOffset((long) 682);
        org.joda.time.DateTime dateTime15 = timeOfDay8.toDateTimeToday(dateTimeZone12);
        java.lang.String str16 = timeOfDay8.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime15", (dateTime10.compareTo(dateTime15) == 0) == dateTime10.equals(dateTime15));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        boolean boolean18 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime6, readableDuration19);
        java.util.Date date21 = mutableDateTime6.toDate();
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.fromDateFields(date21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime6", (dateTime3.compareTo(mutableDateTime6) == 0) == dateTime3.equals(mutableDateTime6));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone13);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant19 = mutableDateTime6.toInstant();
        long long20 = instant19.getMillis();
        org.joda.time.Chronology chronology21 = instant19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = instant19.toMutableDateTime();
        org.joda.time.Instant instant24 = instant19.plus((long) 'a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and mutableDateTime22", (mutableDateTime6.compareTo(mutableDateTime22) == 0) == mutableDateTime6.equals(mutableDateTime22));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfCentury();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime15.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime21 = dateTime15.withDurationAdded(readableDuration19, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long25 = dateTimeZone23.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone23);
        org.joda.time.DateTime dateTime28 = dateTime26.withWeekyear(2);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime15.toMutableDateTime();
        mutableDateTime30.setMillisOfSecond((int) 'a');
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime30.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.getMutableDateTime();
        mutableDateTime34.setMillis(3600067L);
        org.joda.time.Instant instant38 = new org.joda.time.Instant(0L);
        boolean boolean39 = mutableDateTime34.isBefore((org.joda.time.ReadableInstant) instant38);
        long long40 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) instant38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime26", (dateTime10.compareTo(dateTime26) == 0) == dateTime10.equals(dateTime26));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate18 = property16.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate19 = property16.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight24.withField(dateTimeFieldType25, (int) '4');
        org.joda.time.LocalDate localDate28 = dateMidnight27.toLocalDate();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableDuration30);
        org.joda.time.MutablePeriod mutablePeriod32 = period31.toMutablePeriod();
        java.lang.Object obj33 = mutablePeriod32.clone();
        org.joda.time.LocalDate localDate35 = localDate28.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod32, (int) (byte) 1);
        org.joda.time.LocalDate localDate37 = localDate28.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate39 = localDate28.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long43 = dateTimeZone41.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime45 = localDate39.toDateTimeAtStartOfDay(dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(dateTimeZone41);
        org.joda.time.Interval interval47 = localDate19.toInterval(dateTimeZone41);
        java.util.Date date48 = localDate19.toDate();
        org.joda.time.YearMonthDay yearMonthDay49 = org.joda.time.YearMonthDay.fromDateFields(date48);
        org.joda.time.Partial partial50 = new org.joda.time.Partial((org.joda.time.ReadablePartial) yearMonthDay49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = partial50.getFormatter();
        org.joda.time.Chronology chronology52 = partial50.getChronology();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long56 = dateTimeZone54.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight(dateTimeZone54);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight57.withField(dateTimeFieldType58, (int) '4');
        org.joda.time.DateTime dateTime61 = dateMidnight60.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology63 = null;
        boolean boolean64 = dateTimeFieldType62.isSupported(chronology63);
        boolean boolean65 = dateMidnight60.isSupported(dateTimeFieldType62);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight60.withField(dateTimeFieldType66, 121);
        org.joda.time.Partial partial69 = partial50.without(dateTimeFieldType66);
        int[] intArray70 = partial69.getValues();
        org.joda.time.Chronology chronology71 = partial69.getChronology();
        org.joda.time.YearMonthDay yearMonthDay73 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay74 = null;
        org.joda.time.DateTime dateTime75 = yearMonthDay73.toDateTime(timeOfDay74);
        org.joda.time.DateTime dateTime76 = yearMonthDay73.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime78 = dateTime76.plusMillis(1);
        int int79 = dateTime76.getMillisOfSecond();
        org.joda.time.DateTime dateTime81 = dateTime76.plusHours(53);
        org.joda.time.DateTimeZone dateTimeZone84 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long86 = dateTimeZone84.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight87 = new org.joda.time.DateMidnight(dateTimeZone84);
        org.joda.time.DateMidnight dateMidnight88 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone84);
        org.joda.time.DateMidnight.Property property89 = dateMidnight88.yearOfEra();
        org.joda.time.DateMidnight dateMidnight90 = property89.roundHalfEvenCopy();
        org.joda.time.YearMonthDay yearMonthDay91 = dateMidnight90.toYearMonthDay();
        org.joda.time.Chronology chronology92 = yearMonthDay91.getChronology();
        long long96 = chronology92.add((long) 'x', 8000L, 965);
        org.joda.time.DateTime dateTime97 = dateTime76.toDateTime(chronology92);
        org.joda.time.Partial partial98 = partial69.withChronologyRetainFields(chronology92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime76 and dateTime97", (dateTime76.compareTo(dateTime97) == 0) == dateTime76.equals(dateTime97));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay7.minusYears((int) '4');
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) (short) -1, periodType11, chronology12);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (short) -1, periodType15, chronology16);
        mutablePeriod13.add((org.joda.time.ReadablePeriod) mutablePeriod17);
        mutablePeriod17.addMonths(0);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay7.minus((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.DateTime dateTime22 = dateTime4.withFields((org.joda.time.ReadablePartial) yearMonthDay21);
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology26 = yearMonthDay25.getChronology();
        long long30 = chronology26.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        long long34 = chronology26.add(readablePeriod31, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField35 = chronology26.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(1010L, chronology26);
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType40 = periodType39.withHoursRemoved();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight42 = org.joda.time.DateMidnight.now(dateTimeZone41);
        org.joda.time.Chronology chronology43 = dateMidnight42.getChronology();
        org.joda.time.Period period44 = new org.joda.time.Period((-1128294000000L), 8000L, periodType39, chronology43);
        int[] intArray47 = chronology26.get((org.joda.time.ReadablePeriod) period44, (long) 23, (long) 22);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime4, chronology26);
        org.joda.time.DurationField durationField49 = chronology26.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime48", (dateTime4.compareTo(mutableDateTime48) == 0) == dateTime4.equals(mutableDateTime48));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTime(timeOfDay5);
        org.joda.time.DateTime dateTime8 = dateTime6.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableDuration2, (org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableDuration10, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Period period19 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period21 = period19.minusMillis(12);
        org.joda.time.Period period23 = period21.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration24 = period21.toStandardDuration();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) (short) -1, periodType26, chronology27);
        boolean boolean30 = mutablePeriod28.equals((java.lang.Object) (-3599990L));
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay32.toDateTime(timeOfDay33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime34.toMutableDateTime();
        java.lang.Object obj38 = mutableDateTime37.clone();
        org.joda.time.Chronology chronology39 = mutableDateTime37.getChronology();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant40, readableDuration41);
        org.joda.time.MutablePeriod mutablePeriod43 = period42.toMutablePeriod();
        org.joda.time.Period period45 = period42.plusHours((int) 'a');
        org.joda.time.Minutes minutes46 = period45.toStandardMinutes();
        org.joda.time.Period period47 = period45.negated();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period51 = period47.plus((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay54 = null;
        org.joda.time.DateTime dateTime55 = yearMonthDay53.toDateTime(timeOfDay54);
        org.joda.time.DateTime dateTime56 = yearMonthDay53.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar57 = dateTime56.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.DateTime dateTime59 = dateTime56.minus(readableDuration58);
        org.joda.time.YearMonthDay yearMonthDay61 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay62 = null;
        org.joda.time.DateTime dateTime63 = yearMonthDay61.toDateTime(timeOfDay62);
        org.joda.time.DateTime dateTime65 = dateTime63.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime63.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime66.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration68 = null;
        mutableDateTime66.add(readableDuration68, 100);
        mutablePeriod50.setPeriod((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) mutableDateTime66);
        mutableDateTime37.setMillis((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration73 = mutablePeriod28.toDurationTo((org.joda.time.ReadableInstant) dateTime56);
        boolean boolean74 = duration24.isLongerThan((org.joda.time.ReadableDuration) duration73);
        org.joda.time.DateTime dateTime75 = dateTime14.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.DateTime dateTime76 = dateTime6.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Instant instant78 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration24, (-292275054));
        org.joda.time.Instant instant80 = instant78.withMillis((long) ' ');
        boolean boolean81 = instant78.isEqualNow();
        org.joda.time.Instant instant83 = instant78.minus(0L);
        org.joda.time.DateTime dateTime84 = instant83.toDateTime();
        org.joda.time.DateTime dateTime85 = instant83.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant83 and dateTime84", (instant83.compareTo(dateTime84) == 0) == instant83.equals(dateTime84));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant12 = instant10.withMillis((long) 12);
        boolean boolean13 = mutableDateTime6.isBefore((org.joda.time.ReadableInstant) instant12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str15 = dateTimeZone14.getID();
        long long17 = dateTimeZone14.convertUTCToLocal((long) 9);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay19.toDateTime(timeOfDay20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime21.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime27 = dateTime21.withDurationAdded(readableDuration25, (int) (short) 1);
        org.joda.time.DateTime.Property property28 = dateTime21.minuteOfHour();
        org.joda.time.DateTime.Property property29 = dateTime21.monthOfYear();
        int int30 = dateTime21.getYear();
        java.lang.String str31 = dateTime21.toString();
        org.joda.time.DateTime dateTime32 = dateTime21.toDateTime();
        int int33 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) dateTime32);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay37 = null;
        org.joda.time.DateTime dateTime38 = yearMonthDay36.toDateTime(timeOfDay37);
        org.joda.time.DateTime dateTime40 = dateTime38.plus((long) ' ');
        org.joda.time.DateTime dateTime42 = dateTime38.plusYears(2);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours(35);
        long long46 = dateTimeZone44.previousTransition((long) 17);
        org.joda.time.DateTime dateTime47 = dateTime42.toDateTime(dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime32.toMutableDateTime(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and dateTime47", (dateTime42.compareTo(dateTime47) == 0) == dateTime42.equals(dateTime47));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period3 = org.joda.time.Period.seconds((int) ' ');
        int int4 = period3.getMinutes();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.years();
        int int6 = period3.get(durationFieldType5);
        int int7 = periodType1.indexOf(durationFieldType5);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.seconds();
        int int10 = periodType8.indexOf(durationFieldType9);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology13 = yearMonthDay12.getChronology();
        long long17 = chronology13.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = chronology13.add(readablePeriod18, (long) 7, (-60634556));
        org.joda.time.DurationField durationField22 = chronology13.weekyears();
        boolean boolean23 = durationFieldType9.isSupported(chronology13);
        org.joda.time.DurationField durationField24 = chronology13.days();
        boolean boolean25 = durationFieldType5.isSupported(chronology13);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay28 = null;
        org.joda.time.DateTime dateTime29 = yearMonthDay27.toDateTime(timeOfDay28);
        org.joda.time.DateTime dateTime30 = yearMonthDay27.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar31 = dateTime30.toGregorianCalendar();
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay36 = null;
        org.joda.time.DateTime dateTime37 = yearMonthDay35.toDateTime(timeOfDay36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime37.toMutableDateTime();
        java.lang.Object obj41 = mutableDateTime40.clone();
        org.joda.time.Chronology chronology42 = mutableDateTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.era();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType33.getField(chronology42);
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) (short) -1, periodType46, chronology47);
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) (short) -1, periodType50, chronology51);
        mutablePeriod48.add((org.joda.time.ReadablePeriod) mutablePeriod52);
        int[] intArray55 = chronology42.get((org.joda.time.ReadablePeriod) mutablePeriod52, (long) 23);
        org.joda.time.DateTimeField dateTimeField56 = chronology42.year();
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar31, chronology42);
        org.joda.time.DurationField durationField58 = durationFieldType5.getField(chronology42);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((long) 2021, chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField58", (durationField22.compareTo(durationField58) == 0) == durationField22.equals(durationField58));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.minus(readableDuration5);
        org.joda.time.DateTime dateTime8 = dateTime4.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime10 = dateTime4.withMillis((long) 'a');
        int int11 = dateTime4.getYear();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.DateTime dateTime16 = dateTime15.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long20 = dateTimeZone18.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(dateTimeZone18);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType24 = periodType23.withHoursRemoved();
        org.joda.time.PeriodType periodType25 = periodType23.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((-3599990L), periodType23);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateMidnight21, periodType23);
        boolean boolean28 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Instant instant29 = dateTime4.toInstant();
        org.joda.time.DateTime.Property property30 = dateTime4.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant29", (dateTime4.compareTo(instant29) == 0) == dateTime4.equals(instant29));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period5 = period2.plusHours((int) 'a');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period5.withSeconds((int) (short) -1);
        org.joda.time.MutablePeriod mutablePeriod9 = period5.toMutablePeriod();
        java.lang.Object obj10 = mutablePeriod9.clone();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period13 = org.joda.time.Period.seconds((int) ' ');
        int int14 = period13.getMinutes();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.years();
        int int16 = period13.get(durationFieldType15);
        int int17 = periodType11.indexOf(durationFieldType15);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.seconds();
        int int20 = periodType18.indexOf(durationFieldType19);
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology23 = yearMonthDay22.getChronology();
        long long27 = chronology23.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        long long31 = chronology23.add(readablePeriod28, (long) 7, (-60634556));
        org.joda.time.DurationField durationField32 = chronology23.weekyears();
        boolean boolean33 = durationFieldType19.isSupported(chronology23);
        org.joda.time.DurationField durationField34 = chronology23.days();
        boolean boolean35 = durationFieldType15.isSupported(chronology23);
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay38 = null;
        org.joda.time.DateTime dateTime39 = yearMonthDay37.toDateTime(timeOfDay38);
        org.joda.time.DateTime dateTime40 = yearMonthDay37.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar41 = dateTime40.toGregorianCalendar();
        org.joda.time.LocalDate localDate42 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay46 = null;
        org.joda.time.DateTime dateTime47 = yearMonthDay45.toDateTime(timeOfDay46);
        org.joda.time.DateTime dateTime49 = dateTime47.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime47.toMutableDateTime();
        java.lang.Object obj51 = mutableDateTime50.clone();
        org.joda.time.Chronology chronology52 = mutableDateTime50.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = chronology52.era();
        org.joda.time.DateTimeField dateTimeField54 = dateTimeFieldType43.getField(chronology52);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) (short) -1, periodType56, chronology57);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) (short) -1, periodType60, chronology61);
        mutablePeriod58.add((org.joda.time.ReadablePeriod) mutablePeriod62);
        int[] intArray65 = chronology52.get((org.joda.time.ReadablePeriod) mutablePeriod62, (long) 23);
        org.joda.time.DateTimeField dateTimeField66 = chronology52.year();
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar41, chronology52);
        org.joda.time.DurationField durationField68 = durationFieldType15.getField(chronology52);
        int int69 = mutablePeriod9.indexOf(durationFieldType15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField32 and durationField68", (durationField32.compareTo(durationField68) == 0) == durationField32.equals(durationField68));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone13);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant19 = mutableDateTime6.toInstant();
        long long20 = instant19.getMillis();
        org.joda.time.DateTime dateTime21 = instant19.toDateTimeISO();
        org.joda.time.DateTime dateTime23 = dateTime21.withMinuteOfHour(28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant19", (mutableDateTime6.compareTo(instant19) == 0) == mutableDateTime6.equals(instant19));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay7.minusYears((int) '4');
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) (short) -1, periodType11, chronology12);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (short) -1, periodType15, chronology16);
        mutablePeriod13.add((org.joda.time.ReadablePeriod) mutablePeriod17);
        mutablePeriod17.addMonths(0);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay7.minus((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.DateTime dateTime22 = dateTime4.withFields((org.joda.time.ReadablePartial) yearMonthDay21);
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology26 = yearMonthDay25.getChronology();
        long long30 = chronology26.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        long long34 = chronology26.add(readablePeriod31, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField35 = chronology26.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(1010L, chronology26);
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType40 = periodType39.withHoursRemoved();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight42 = org.joda.time.DateMidnight.now(dateTimeZone41);
        org.joda.time.Chronology chronology43 = dateMidnight42.getChronology();
        org.joda.time.Period period44 = new org.joda.time.Period((-1128294000000L), 8000L, periodType39, chronology43);
        int[] intArray47 = chronology26.get((org.joda.time.ReadablePeriod) period44, (long) 23, (long) 22);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime4, chronology26);
        java.lang.String str49 = chronology26.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime48", (dateTime4.compareTo(mutableDateTime48) == 0) == dateTime4.equals(mutableDateTime48));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant4 = instant1.toInstant();
        org.joda.time.Instant instant6 = instant1.minus((long) 29);
        org.joda.time.MutableDateTime mutableDateTime7 = instant1.toMutableDateTimeISO();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay9.toDateTime(timeOfDay10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime11.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.millisOfSecond();
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay17.toDateTime(timeOfDay18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime19.toMutableDateTime();
        java.lang.Object obj23 = mutableDateTime22.clone();
        org.joda.time.Chronology chronology24 = mutableDateTime22.getChronology();
        org.joda.time.ReadableDuration readableDuration25 = null;
        mutableDateTime22.add(readableDuration25);
        mutableDateTime22.setMillis((long) (-1));
        int int29 = property15.getDifference((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime22.weekyear();
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant31, readableDuration32);
        org.joda.time.MutablePeriod mutablePeriod34 = period33.toMutablePeriod();
        java.lang.Object obj35 = mutablePeriod34.clone();
        org.joda.time.MutablePeriod mutablePeriod36 = mutablePeriod34.toMutablePeriod();
        mutablePeriod34.clear();
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay40 = null;
        org.joda.time.DateTime dateTime41 = yearMonthDay39.toDateTime(timeOfDay40);
        org.joda.time.DateTime dateTime43 = dateTime41.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime41.toMutableDateTime();
        java.lang.Object obj45 = mutableDateTime44.clone();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime44.minuteOfDay();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight(chronology47);
        org.joda.time.Interval interval49 = dateMidnight48.toInterval();
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay53 = null;
        org.joda.time.DateTime dateTime54 = yearMonthDay52.toDateTime(timeOfDay53);
        org.joda.time.DateTime dateTime55 = yearMonthDay52.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar56 = dateTime55.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.DateTime dateTime58 = dateTime55.minus(readableDuration57);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.PeriodType periodType60 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType61 = org.joda.time.DurationFieldType.seconds();
        int int62 = periodType60.indexOf(durationFieldType61);
        org.joda.time.Period period63 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime55, readableInstant59, periodType60);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay66 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay67 = null;
        org.joda.time.DateTime dateTime68 = yearMonthDay66.toDateTime(timeOfDay67);
        org.joda.time.DateTime dateTime70 = dateTime68.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime68.toMutableDateTime();
        java.lang.Object obj72 = mutableDateTime71.clone();
        org.joda.time.Chronology chronology73 = mutableDateTime71.getChronology();
        org.joda.time.DateTimeField dateTimeField74 = chronology73.era();
        org.joda.time.DateTimeField dateTimeField75 = dateTimeFieldType64.getField(chronology73);
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((long) (short) -1, periodType77, chronology78);
        org.joda.time.PeriodType periodType81 = null;
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((long) (short) -1, periodType81, chronology82);
        mutablePeriod79.add((org.joda.time.ReadablePeriod) mutablePeriod83);
        int[] intArray86 = chronology73.get((org.joda.time.ReadablePeriod) mutablePeriod83, (long) 23);
        org.joda.time.DateTimeField dateTimeField87 = chronology73.secondOfDay();
        java.lang.String str88 = chronology73.toString();
        org.joda.time.Period period89 = new org.joda.time.Period(6000000L, periodType60, chronology73);
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime44, (org.joda.time.ReadableInstant) dateMidnight48, periodType60);
        org.joda.time.Duration duration91 = mutablePeriod34.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight48);
        org.joda.time.Period period92 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime22, (org.joda.time.ReadableDuration) duration91);
        org.joda.time.Instant instant94 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration91, 31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant94 and mutableDateTime7", (instant94.compareTo(mutableDateTime7) == 0) == instant94.equals(mutableDateTime7));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone13);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant19 = mutableDateTime6.toInstant();
        int int20 = mutableDateTime6.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight17 and instant19", (dateMidnight17.compareTo(instant19) == 0) == dateMidnight17.equals(instant19));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant4 = instant1.toInstant();
        org.joda.time.Instant instant6 = instant1.minus((long) 29);
        org.joda.time.MutableDateTime mutableDateTime7 = instant1.toMutableDateTimeISO();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableDuration11);
        org.joda.time.MutablePeriod mutablePeriod13 = period12.toMutablePeriod();
        mutablePeriod13.setWeeks((int) '#');
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay9.plus((org.joda.time.ReadablePeriod) mutablePeriod13);
        int int17 = mutablePeriod13.getWeeks();
        org.joda.time.DurationFieldType[] durationFieldTypeArray18 = mutablePeriod13.getFieldTypes();
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay20.toDateTime(timeOfDay21);
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay24.toDateTime(timeOfDay25);
        org.joda.time.DateTime dateTime27 = yearMonthDay24.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.minus(readableDuration28);
        org.joda.time.DateTime dateTime30 = yearMonthDay20.toDateTime((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime.Property property31 = dateTime30.dayOfWeek();
        org.joda.time.DateTime dateTime33 = property31.addToCopy(35);
        org.joda.time.Period period35 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period37 = period35.minusMillis(12);
        org.joda.time.Period period39 = period37.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration40 = period37.toStandardDuration();
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableDuration) duration40);
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Instant instant43 = instant1.minus((org.joda.time.ReadableDuration) duration40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime7", (instant1.compareTo(mutableDateTime7) == 0) == instant1.equals(mutableDateTime7));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant4 = instant1.toInstant();
        org.joda.time.Instant instant6 = instant1.minus((long) 29);
        org.joda.time.MutableDateTime mutableDateTime7 = instant1.toMutableDateTimeISO();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay9.toDateTime(timeOfDay10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime11.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay18.toDateTime(timeOfDay19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime20.toMutableDateTime();
        java.lang.Object obj24 = mutableDateTime23.clone();
        org.joda.time.Chronology chronology25 = mutableDateTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.era();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType16.getField(chronology25);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = dateTimeField27.getType();
        mutableDateTime14.setRounding(dateTimeField27);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime14.hourOfDay();
        org.joda.time.Period period32 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period34 = period32.minusMillis(12);
        org.joda.time.Period period36 = period34.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration37 = period34.toStandardDuration();
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) (short) -1, periodType39, chronology40);
        boolean boolean43 = mutablePeriod41.equals((java.lang.Object) (-3599990L));
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay46 = null;
        org.joda.time.DateTime dateTime47 = yearMonthDay45.toDateTime(timeOfDay46);
        org.joda.time.DateTime dateTime49 = dateTime47.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime47.toMutableDateTime();
        java.lang.Object obj51 = mutableDateTime50.clone();
        org.joda.time.Chronology chronology52 = mutableDateTime50.getChronology();
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant53, readableDuration54);
        org.joda.time.MutablePeriod mutablePeriod56 = period55.toMutablePeriod();
        org.joda.time.Period period58 = period55.plusHours((int) 'a');
        org.joda.time.Minutes minutes59 = period58.toStandardMinutes();
        org.joda.time.Period period60 = period58.negated();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period64 = period60.plus((org.joda.time.ReadablePeriod) mutablePeriod63);
        org.joda.time.YearMonthDay yearMonthDay66 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay67 = null;
        org.joda.time.DateTime dateTime68 = yearMonthDay66.toDateTime(timeOfDay67);
        org.joda.time.DateTime dateTime69 = yearMonthDay66.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar70 = dateTime69.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration71 = null;
        org.joda.time.DateTime dateTime72 = dateTime69.minus(readableDuration71);
        org.joda.time.YearMonthDay yearMonthDay74 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay75 = null;
        org.joda.time.DateTime dateTime76 = yearMonthDay74.toDateTime(timeOfDay75);
        org.joda.time.DateTime dateTime78 = dateTime76.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime79 = dateTime76.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime79.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration81 = null;
        mutableDateTime79.add(readableDuration81, 100);
        mutablePeriod63.setPeriod((org.joda.time.ReadableInstant) dateTime69, (org.joda.time.ReadableInstant) mutableDateTime79);
        mutableDateTime50.setMillis((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.Duration duration86 = mutablePeriod41.toDurationTo((org.joda.time.ReadableInstant) dateTime69);
        boolean boolean87 = duration37.isLongerThan((org.joda.time.ReadableDuration) duration86);
        mutableDateTime14.add((org.joda.time.ReadableDuration) duration37, (int) 'a');
        org.joda.time.Duration duration90 = duration37.toDuration();
        org.joda.time.Instant instant92 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration90, 82799);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime7", (instant1.compareTo(mutableDateTime7) == 0) == instant1.equals(mutableDateTime7));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.millisOfSecond();
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay7.toDateTime(timeOfDay8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime9.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField13 = null;
        mutableDateTime12.setRounding(dateTimeField13, (int) '#');
        mutableDateTime12.addMillis((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime12.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField19 = mutableDateTime18.getRoundingField();
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay21.toDateTime(timeOfDay22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime23.toMutableDateTime();
        java.lang.Object obj27 = mutableDateTime26.clone();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.minuteOfDay();
        mutableDateTime18.setMillis((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str31 = dateTimeZone30.getID();
        long long33 = dateTimeZone30.convertUTCToLocal((long) 9);
        long long36 = dateTimeZone30.adjustOffset((long) 'u', true);
        mutableDateTime18.setZone(dateTimeZone30);
        mutableDateTime4.setZoneRetainFields(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime18", (dateTime9.compareTo(mutableDateTime18) == 0) == dateTime9.equals(mutableDateTime18));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableDuration7);
        org.joda.time.LocalTime localTime9 = localTime5.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.DateTime dateTime10 = localTime9.toDateTimeToday();
        org.joda.time.Chronology chronology11 = localTime9.getChronology();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.Chronology chronology13 = chronology11.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime12", (dateTime10.compareTo(dateTime12) == 0) == dateTime10.equals(dateTime12));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTime dateTime7 = yearMonthDay5.toDateTime(timeOfDay6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime7.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.millisOfSecond();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime15.toMutableDateTime();
        java.lang.Object obj19 = mutableDateTime18.clone();
        org.joda.time.Chronology chronology20 = mutableDateTime18.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.weekyears();
        mutableDateTime10.setChronology(chronology20);
        org.joda.time.DateTimeField dateTimeField23 = chronology20.secondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter3.withChronology(chronology20);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeFormatter3.getZone();
        boolean boolean26 = dateTimeFormatter3.isParser();
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology29 = yearMonthDay28.getChronology();
        long long33 = chronology29.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = chronology29.add(readablePeriod34, (long) 7, (-60634556));
        org.joda.time.DurationField durationField38 = chronology29.weekyears();
        org.joda.time.DateTimeField dateTimeField39 = chronology29.minuteOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter3.withChronology(chronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField38", (durationField21.compareTo(durationField38) == 0) == durationField21.equals(durationField38));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.millisOfSecond();
        int int6 = property5.getMinimumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime4", (instant1.compareTo(mutableDateTime4) == 0) == instant1.equals(mutableDateTime4));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) 'u');
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withDurationAdded((long) 100, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight4.withMillis((-292275154L));
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.yearOfEra();
        org.joda.time.DateMidnight dateMidnight13 = property12.roundCeilingCopy();
        org.joda.time.DateTime dateTime14 = dateMidnight13.toDateTime();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weeks();
        org.joda.time.DateTime dateTime18 = dateTime14.withChronology(chronology16);
        org.joda.time.DateTime.Property property19 = dateTime14.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight13 and dateTime18", (dateMidnight13.compareTo(dateTime18) == 0) == dateMidnight13.equals(dateTime18));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.lang.Object obj0 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime4.toMutableDateTime();
        java.lang.Object obj8 = mutableDateTime7.clone();
        org.joda.time.Chronology chronology9 = mutableDateTime7.getChronology();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.dayOfYear();
        org.joda.time.DurationField durationField12 = chronology9.weeks();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(obj0, chronology9);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant18 = instant16.withMillis((long) 12);
        org.joda.time.Instant instant19 = instant16.toInstant();
        org.joda.time.Chronology chronology20 = instant16.getChronology();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(chronology20);
        org.joda.time.DurationField durationField22 = chronology20.weeks();
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay14.withChronologyRetainFields(chronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField22", (durationField12.compareTo(durationField22) == 0) == durationField12.equals(durationField22));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone13);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant19 = mutableDateTime6.toInstant();
        long long20 = instant19.getMillis();
        org.joda.time.Chronology chronology21 = instant19.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant19", (mutableDateTime6.compareTo(instant19) == 0) == mutableDateTime6.equals(instant19));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate8.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtStartOfDay(dateTimeZone21);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology28 = yearMonthDay27.getChronology();
        long long32 = chronology28.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = chronology28.add(readablePeriod33, (long) 7, (-60634556));
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime25.toMutableDateTime(chronology28);
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay(chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and mutableDateTime37", (dateTime25.compareTo(mutableDateTime37) == 0) == dateTime25.equals(mutableDateTime37));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.DurationField durationField12 = chronology8.eras();
        org.joda.time.DateMidnight dateMidnight13 = org.joda.time.DateMidnight.now(chronology8);
        java.lang.String str14 = chronology8.toString();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.secondOfMinute();
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay17.toDateTime(timeOfDay18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime19.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime22.toMutableDateTime();
        org.joda.time.Period period26 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period28 = period26.minusMillis(12);
        org.joda.time.Period period30 = period28.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration31 = period28.toStandardDuration();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) (short) -1, periodType33, chronology34);
        boolean boolean37 = mutablePeriod35.equals((java.lang.Object) (-3599990L));
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay40 = null;
        org.joda.time.DateTime dateTime41 = yearMonthDay39.toDateTime(timeOfDay40);
        org.joda.time.DateTime dateTime43 = dateTime41.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime41.toMutableDateTime();
        java.lang.Object obj45 = mutableDateTime44.clone();
        org.joda.time.Chronology chronology46 = mutableDateTime44.getChronology();
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant47, readableDuration48);
        org.joda.time.MutablePeriod mutablePeriod50 = period49.toMutablePeriod();
        org.joda.time.Period period52 = period49.plusHours((int) 'a');
        org.joda.time.Minutes minutes53 = period52.toStandardMinutes();
        org.joda.time.Period period54 = period52.negated();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period58 = period54.plus((org.joda.time.ReadablePeriod) mutablePeriod57);
        org.joda.time.YearMonthDay yearMonthDay60 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay61 = null;
        org.joda.time.DateTime dateTime62 = yearMonthDay60.toDateTime(timeOfDay61);
        org.joda.time.DateTime dateTime63 = yearMonthDay60.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar64 = dateTime63.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.DateTime dateTime66 = dateTime63.minus(readableDuration65);
        org.joda.time.YearMonthDay yearMonthDay68 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay69 = null;
        org.joda.time.DateTime dateTime70 = yearMonthDay68.toDateTime(timeOfDay69);
        org.joda.time.DateTime dateTime72 = dateTime70.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime73 = dateTime70.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime73.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration75 = null;
        mutableDateTime73.add(readableDuration75, 100);
        mutablePeriod57.setPeriod((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) mutableDateTime73);
        mutableDateTime44.setMillis((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Duration duration80 = mutablePeriod35.toDurationTo((org.joda.time.ReadableInstant) dateTime63);
        boolean boolean81 = duration31.isLongerThan((org.joda.time.ReadableDuration) duration80);
        mutableDateTime24.add((org.joda.time.ReadableDuration) duration80, (int) (short) 1);
        org.joda.time.MutableDateTime.Property property84 = mutableDateTime24.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate86 = new org.joda.time.LocalDate(dateTimeZone85);
        org.joda.time.DateTime dateTime87 = org.joda.time.DateTime.now(dateTimeZone85);
        java.lang.String str88 = dateTimeZone85.getID();
        java.util.TimeZone timeZone89 = dateTimeZone85.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime90 = mutableDateTime24.toMutableDateTime(dateTimeZone85);
        org.joda.time.Chronology chronology91 = chronology8.withZone(dateTimeZone85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime24 and mutableDateTime90", (mutableDateTime24.compareTo(mutableDateTime90) == 0) == mutableDateTime24.equals(mutableDateTime90));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears(100);
        int int4 = dateTime1.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long8 = dateTimeZone6.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(dateTimeZone6);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight9.withField(dateTimeFieldType10, (int) '4');
        org.joda.time.LocalDate localDate13 = dateMidnight12.toLocalDate();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableDuration15);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        java.lang.Object obj18 = mutablePeriod17.clone();
        org.joda.time.LocalDate localDate20 = localDate13.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod17, (int) (byte) 1);
        org.joda.time.LocalDate localDate22 = localDate13.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate24 = localDate13.minusDays((int) (short) 10);
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay26.toDateTime(timeOfDay27);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime28.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime34 = dateTime28.withDurationAdded(readableDuration32, (int) (short) 1);
        org.joda.time.DateTime dateTime35 = localDate13.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime37 = dateTime28.withCenturyOfEra((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours(17);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((java.lang.Object) dateTime28, dateTimeZone39);
        org.joda.time.DateTime dateTime41 = dateTime1.withZone(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime40", (dateTime28.compareTo(dateTime40) == 0) == dateTime28.equals(dateTime40));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long13 = dateTimeZone11.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekyear(2);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) (short) -1, periodType19, chronology20);
        boolean boolean23 = mutablePeriod21.equals((java.lang.Object) (-3599990L));
        org.joda.time.MutablePeriod mutablePeriod24 = mutablePeriod21.toMutablePeriod();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay28.toDateTime(timeOfDay29);
        org.joda.time.DateTime dateTime32 = dateTime30.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime30.toMutableDateTime();
        java.lang.Object obj34 = mutableDateTime33.clone();
        org.joda.time.Chronology chronology35 = mutableDateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.era();
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType26.getField(chronology35);
        mutablePeriod21.add((-3600000000L), chronology35);
        org.joda.time.DateTimeField dateTimeField39 = chronology35.minuteOfHour();
        org.joda.time.Chronology chronology40 = chronology35.withUTC();
        org.joda.time.DateTime dateTime41 = dateTime3.withChronology(chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime41", (dateTime3.compareTo(dateTime41) == 0) == dateTime3.equals(dateTime41));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.minuteOfHour();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("");
        java.lang.String str11 = property8.getAsText(locale10);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime12.copy();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(23);
        org.joda.time.DateTime dateTime17 = mutableDateTime13.toDateTime(dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) 25778293, dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and dateTime17", (mutableDateTime7.compareTo(dateTime17) == 0) == mutableDateTime7.equals(dateTime17));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.dayOfWeek();
        org.joda.time.DateTime dateTime3 = dateTime0.plusSeconds(202);
        org.joda.time.LocalTime localTime4 = dateTime3.toLocalTime();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTime(chronology6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and mutableDateTime7", (dateTime0.compareTo(mutableDateTime7) == 0) == dateTime0.equals(mutableDateTime7));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.lang.Object obj0 = null;
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant4 = instant2.withMillis((long) 12);
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj0, dateTimeZone6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime5", (instant4.compareTo(mutableDateTime5) == 0) == instant4.equals(mutableDateTime5));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis((long) 12);
        org.joda.time.Instant instant4 = instant1.toInstant();
        org.joda.time.DateTime dateTime5 = instant4.toDateTime();
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay7.toDateTime(timeOfDay8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime9.toMutableDateTime();
        java.lang.Object obj13 = mutableDateTime12.clone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime12.setZone(dateTimeZone15);
        java.lang.String str17 = mutableDateTime12.toString();
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay19.toDateTime(timeOfDay20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime21.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay28.toDateTime(timeOfDay29);
        org.joda.time.DateTime dateTime32 = dateTime30.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime30.toMutableDateTime();
        java.lang.Object obj34 = mutableDateTime33.clone();
        org.joda.time.Chronology chronology35 = mutableDateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.era();
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType26.getField(chronology35);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = dateTimeField37.getType();
        mutableDateTime24.setRounding(dateTimeField37);
        mutableDateTime24.setMillisOfDay(12);
        mutableDateTime24.setWeekyear(0);
        mutableDateTime24.addYears(46);
        org.joda.time.Period period47 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period49 = period47.minusMillis(12);
        org.joda.time.Period period51 = period49.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration52 = period49.toStandardDuration();
        org.joda.time.YearMonthDay yearMonthDay54 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay55 = null;
        org.joda.time.DateTime dateTime56 = yearMonthDay54.toDateTime(timeOfDay55);
        org.joda.time.DateTime dateTime58 = dateTime56.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime56.toMutableDateTime();
        java.lang.Object obj60 = mutableDateTime59.clone();
        org.joda.time.Chronology chronology61 = mutableDateTime59.getChronology();
        mutableDateTime59.setTime((long) '#');
        boolean boolean64 = mutableDateTime59.isEqualNow();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration52, (org.joda.time.ReadableInstant) mutableDateTime59);
        org.joda.time.Duration duration66 = duration52.toDuration();
        mutableDateTime24.add((org.joda.time.ReadableDuration) duration66);
        mutableDateTime12.add((org.joda.time.ReadableDuration) duration66);
        org.joda.time.Instant instant69 = instant4.minus((org.joda.time.ReadableDuration) duration66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime5", (instant4.compareTo(dateTime5) == 0) == instant4.equals(dateTime5));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableDuration3);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        mutablePeriod5.setWeeks((int) '#');
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay1.plus((org.joda.time.ReadablePeriod) mutablePeriod5);
        org.joda.time.Period period9 = org.joda.time.Period.ZERO;
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay8.withPeriodAdded((org.joda.time.ReadablePeriod) period9, (int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = yearMonthDay8.getFieldType(1);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay8.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology18 = yearMonthDay17.getChronology();
        long long22 = chronology18.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = chronology18.add(readablePeriod23, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField27 = chronology18.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(1010L, chronology18);
        java.lang.Object obj29 = mutablePeriod28.clone();
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod28, 2000);
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay34 = null;
        org.joda.time.DateTime dateTime35 = yearMonthDay33.toDateTime(timeOfDay34);
        org.joda.time.DateTime dateTime36 = yearMonthDay33.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar37 = dateTime36.toGregorianCalendar();
        org.joda.time.DateTime dateTime39 = dateTime36.minusMinutes((int) (byte) 1);
        org.joda.time.DateTime dateTime40 = dateTime36.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int42 = dateTime36.get(dateTimeFieldType41);
        org.joda.time.YearMonthDay.Property property43 = yearMonthDay8.property(dateTimeFieldType41);
        org.joda.time.YearMonthDay yearMonthDay45 = yearMonthDay8.withYear((-234534));
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours(9);
        long long49 = dateTimeZone47.previousTransition((long) 59);
        org.joda.time.DateTime dateTime50 = yearMonthDay8.toDateTimeAtCurrentTime(dateTimeZone47);
        boolean boolean51 = dateTimeZone47.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and dateTime50", (dateTime35.compareTo(dateTime50) == 0) == dateTime35.equals(dateTime50));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant3 = instant1.minus((long) (byte) 100);
        org.joda.time.Chronology chronology4 = instant1.getChronology();
        long long5 = instant1.getMillis();
        org.joda.time.MutableDateTime mutableDateTime6 = instant1.toMutableDateTimeISO();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay9.toDateTime(timeOfDay10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime11.toMutableDateTime();
        java.lang.Object obj15 = mutableDateTime14.clone();
        org.joda.time.Chronology chronology16 = mutableDateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekyear();
        org.joda.time.Period period18 = new org.joda.time.Period((long) 0, chronology16);
        mutableDateTime6.setChronology(chronology16);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableDuration23);
        org.joda.time.MutablePeriod mutablePeriod25 = period24.toMutablePeriod();
        mutablePeriod25.setWeeks((int) '#');
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay21.plus((org.joda.time.ReadablePeriod) mutablePeriod25);
        org.joda.time.Period period29 = org.joda.time.Period.ZERO;
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay28.withPeriodAdded((org.joda.time.ReadablePeriod) period29, (int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = yearMonthDay28.getFieldType(1);
        org.joda.time.YearMonthDay.Property property34 = yearMonthDay28.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology38 = yearMonthDay37.getChronology();
        long long42 = chronology38.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        long long46 = chronology38.add(readablePeriod43, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField47 = chronology38.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(1010L, chronology38);
        java.lang.Object obj49 = mutablePeriod48.clone();
        org.joda.time.YearMonthDay yearMonthDay51 = yearMonthDay28.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod48, 2000);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay54 = null;
        org.joda.time.DateTime dateTime55 = yearMonthDay53.toDateTime(timeOfDay54);
        org.joda.time.DateTime dateTime56 = yearMonthDay53.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar57 = dateTime56.toGregorianCalendar();
        org.joda.time.DateTime dateTime59 = dateTime56.minusMinutes((int) (byte) 1);
        org.joda.time.DateTime dateTime60 = dateTime56.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int62 = dateTime56.get(dateTimeFieldType61);
        org.joda.time.YearMonthDay.Property property63 = yearMonthDay28.property(dateTimeFieldType61);
        org.joda.time.YearMonthDay yearMonthDay65 = yearMonthDay28.withYear((-234534));
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetHours(9);
        long long69 = dateTimeZone67.previousTransition((long) 59);
        org.joda.time.DateTime dateTime70 = yearMonthDay28.toDateTimeAtCurrentTime(dateTimeZone67);
        mutableDateTime6.setZoneRetainFields(dateTimeZone67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime55 and dateTime70", (dateTime55.compareTo(dateTime70) == 0) == dateTime55.equals(dateTime70));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period2 = org.joda.time.Period.seconds((int) ' ');
        int int3 = period2.getMinutes();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.years();
        int int5 = period2.get(durationFieldType4);
        int int6 = periodType0.indexOf(durationFieldType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.seconds();
        int int9 = periodType7.indexOf(durationFieldType8);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology12 = yearMonthDay11.getChronology();
        long long16 = chronology12.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = chronology12.add(readablePeriod17, (long) 7, (-60634556));
        org.joda.time.DurationField durationField21 = chronology12.weekyears();
        boolean boolean22 = durationFieldType8.isSupported(chronology12);
        org.joda.time.DurationField durationField23 = chronology12.days();
        boolean boolean24 = durationFieldType4.isSupported(chronology12);
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay26.toDateTime(timeOfDay27);
        org.joda.time.DateTime dateTime29 = yearMonthDay26.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar30 = dateTime29.toGregorianCalendar();
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar30);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay35 = null;
        org.joda.time.DateTime dateTime36 = yearMonthDay34.toDateTime(timeOfDay35);
        org.joda.time.DateTime dateTime38 = dateTime36.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime36.toMutableDateTime();
        java.lang.Object obj40 = mutableDateTime39.clone();
        org.joda.time.Chronology chronology41 = mutableDateTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.era();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType32.getField(chronology41);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) (short) -1, periodType45, chronology46);
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) (short) -1, periodType49, chronology50);
        mutablePeriod47.add((org.joda.time.ReadablePeriod) mutablePeriod51);
        int[] intArray54 = chronology41.get((org.joda.time.ReadablePeriod) mutablePeriod51, (long) 23);
        org.joda.time.DateTimeField dateTimeField55 = chronology41.year();
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar30, chronology41);
        org.joda.time.DurationField durationField57 = durationFieldType4.getField(chronology41);
        org.joda.time.PeriodType periodType59 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.seconds();
        int int61 = periodType59.indexOf(durationFieldType60);
        org.joda.time.YearMonthDay yearMonthDay63 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology64 = yearMonthDay63.getChronology();
        long long68 = chronology64.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        long long72 = chronology64.add(readablePeriod69, (long) 7, (-60634556));
        org.joda.time.DurationField durationField73 = chronology64.weekyears();
        boolean boolean74 = durationFieldType60.isSupported(chronology64);
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate((long) (-3600000), chronology64);
        org.joda.time.DateMidnight dateMidnight76 = new org.joda.time.DateMidnight(chronology64);
        boolean boolean77 = durationFieldType4.isSupported(chronology64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField57", (durationField21.compareTo(durationField57) == 0) == durationField21.equals(durationField57));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) 'u');
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableDuration8);
        org.joda.time.MutablePeriod mutablePeriod10 = period9.toMutablePeriod();
        org.joda.time.Period period12 = period9.plusHours((int) 'a');
        org.joda.time.Period period14 = period9.withWeeks((int) (byte) -1);
        org.joda.time.Period period16 = period14.plusDays(0);
        org.joda.time.Period period17 = period16.toPeriod();
        org.joda.time.Hours hours18 = period16.toStandardHours();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight6.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period20 = period16.toPeriod();
        org.joda.time.Period period22 = period16.withMinutes((-7));
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period25 = org.joda.time.Period.seconds((int) ' ');
        int int26 = period25.getMinutes();
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.years();
        int int28 = period25.get(durationFieldType27);
        int int29 = periodType23.indexOf(durationFieldType27);
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.seconds();
        int int32 = periodType30.indexOf(durationFieldType31);
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology35 = yearMonthDay34.getChronology();
        long long39 = chronology35.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        long long43 = chronology35.add(readablePeriod40, (long) 7, (-60634556));
        org.joda.time.DurationField durationField44 = chronology35.weekyears();
        boolean boolean45 = durationFieldType31.isSupported(chronology35);
        org.joda.time.DurationField durationField46 = chronology35.days();
        boolean boolean47 = durationFieldType27.isSupported(chronology35);
        org.joda.time.YearMonthDay yearMonthDay49 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay49.toDateTime(timeOfDay50);
        org.joda.time.DateTime dateTime52 = yearMonthDay49.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar53 = dateTime52.toGregorianCalendar();
        org.joda.time.LocalDate localDate54 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar53);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay57 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay58 = null;
        org.joda.time.DateTime dateTime59 = yearMonthDay57.toDateTime(timeOfDay58);
        org.joda.time.DateTime dateTime61 = dateTime59.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime59.toMutableDateTime();
        java.lang.Object obj63 = mutableDateTime62.clone();
        org.joda.time.Chronology chronology64 = mutableDateTime62.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.era();
        org.joda.time.DateTimeField dateTimeField66 = dateTimeFieldType55.getField(chronology64);
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) (short) -1, periodType68, chronology69);
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((long) (short) -1, periodType72, chronology73);
        mutablePeriod70.add((org.joda.time.ReadablePeriod) mutablePeriod74);
        int[] intArray77 = chronology64.get((org.joda.time.ReadablePeriod) mutablePeriod74, (long) 23);
        org.joda.time.DateTimeField dateTimeField78 = chronology64.year();
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar53, chronology64);
        org.joda.time.DurationField durationField80 = durationFieldType27.getField(chronology64);
        org.joda.time.DurationFieldType durationFieldType81 = durationField80.getType();
        boolean boolean82 = period16.isSupported(durationFieldType81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField44 and durationField80", (durationField44.compareTo(durationField80) == 0) == durationField44.equals(durationField80));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime6.toMutableDateTime();
        org.joda.time.Period period10 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period12 = period10.minusMillis(12);
        org.joda.time.Period period14 = period12.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration15 = period12.toStandardDuration();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (short) -1, periodType17, chronology18);
        boolean boolean21 = mutablePeriod19.equals((java.lang.Object) (-3599990L));
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTime dateTime25 = yearMonthDay23.toDateTime(timeOfDay24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime25.toMutableDateTime();
        java.lang.Object obj29 = mutableDateTime28.clone();
        org.joda.time.Chronology chronology30 = mutableDateTime28.getChronology();
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant31, readableDuration32);
        org.joda.time.MutablePeriod mutablePeriod34 = period33.toMutablePeriod();
        org.joda.time.Period period36 = period33.plusHours((int) 'a');
        org.joda.time.Minutes minutes37 = period36.toStandardMinutes();
        org.joda.time.Period period38 = period36.negated();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period42 = period38.plus((org.joda.time.ReadablePeriod) mutablePeriod41);
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay45 = null;
        org.joda.time.DateTime dateTime46 = yearMonthDay44.toDateTime(timeOfDay45);
        org.joda.time.DateTime dateTime47 = yearMonthDay44.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar48 = dateTime47.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.DateTime dateTime50 = dateTime47.minus(readableDuration49);
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay53 = null;
        org.joda.time.DateTime dateTime54 = yearMonthDay52.toDateTime(timeOfDay53);
        org.joda.time.DateTime dateTime56 = dateTime54.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime54.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime57.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration59 = null;
        mutableDateTime57.add(readableDuration59, 100);
        mutablePeriod41.setPeriod((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableInstant) mutableDateTime57);
        mutableDateTime28.setMillis((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Duration duration64 = mutablePeriod19.toDurationTo((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean65 = duration15.isLongerThan((org.joda.time.ReadableDuration) duration64);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration64, (int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay69 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay70 = null;
        org.joda.time.DateTime dateTime71 = yearMonthDay69.toDateTime(timeOfDay70);
        org.joda.time.DateTime dateTime73 = dateTime71.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime74 = dateTime71.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField75 = null;
        mutableDateTime74.setRounding(dateTimeField75, (int) '#');
        mutableDateTime74.addMillis((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime80 = mutableDateTime74.toMutableDateTime();
        mutableDateTime80.addMinutes(86399999);
        mutableDateTime8.setMillis((org.joda.time.ReadableInstant) mutableDateTime80);
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        mutableDateTime8.setZone(dateTimeZone85);
        org.joda.time.LocalTime localTime87 = new org.joda.time.LocalTime(dateTimeZone85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime80", (mutableDateTime8.compareTo(mutableDateTime80) == 0) == mutableDateTime8.equals(mutableDateTime80));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime5 = yearMonthDay2.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readableDuration6);
        org.joda.time.DateTime dateTime9 = dateTime5.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime11 = dateTime5.withMillisOfSecond((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.minusDays((int) 'u');
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight16.withDurationAdded((long) 100, (int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay24.toDateTime(timeOfDay25);
        org.joda.time.DateTime dateTime28 = dateTime26.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(readableDuration22, (org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight21.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod29, (int) '4');
        int int32 = dateTime5.compareTo((org.joda.time.ReadableInstant) dateMidnight31);
        org.joda.time.DateTime dateTime33 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str35 = dateTimeZone34.getID();
        long long37 = dateTimeZone34.convertUTCToLocal((long) 9);
        long long40 = dateTimeZone34.adjustOffset((long) 17, true);
        org.joda.time.DateTime dateTime41 = dateTime33.withZone(dateTimeZone34);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (-60425351), dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime41", (dateTime5.compareTo(dateTime41) == 0) == dateTime5.equals(dateTime41));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone13);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant19 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime6.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight17 and instant19", (dateMidnight17.compareTo(instant19) == 0) == dateMidnight17.equals(instant19));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay5.monthOfYear();
        int int7 = property6.getMaximumValueOverall();
        org.joda.time.DateTimeField dateTimeField8 = property6.getField();
        java.lang.String str9 = property6.getAsString();
        org.joda.time.DurationField durationField10 = property6.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property6.getFieldType();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology14 = yearMonthDay13.getChronology();
        long long18 = chronology14.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology14.add(readablePeriod19, (long) 7, (-60634556));
        org.joda.time.DurationField durationField23 = chronology14.eras();
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay26 = null;
        org.joda.time.DateTime dateTime27 = yearMonthDay25.toDateTime(timeOfDay26);
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay29.toDateTime(timeOfDay30);
        org.joda.time.DateTime dateTime32 = yearMonthDay29.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.minus(readableDuration33);
        org.joda.time.DateTime dateTime35 = yearMonthDay25.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.YearMonthDay.Property property36 = yearMonthDay25.dayOfMonth();
        org.joda.time.DateTime dateTime37 = yearMonthDay25.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property38 = yearMonthDay25.year();
        long long40 = chronology14.set((org.joda.time.ReadablePartial) yearMonthDay25, (long) 1009);
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType11.getField(chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField23", Math.signum(durationField10.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField10)));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate8.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtStartOfDay(dateTimeZone21);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology28 = yearMonthDay27.getChronology();
        long long32 = chronology28.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = chronology28.add(readablePeriod33, (long) 7, (-60634556));
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime25.toMutableDateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField38 = chronology28.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and mutableDateTime37", (dateTime25.compareTo(mutableDateTime37) == 0) == dateTime25.equals(mutableDateTime37));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTime(timeOfDay5);
        org.joda.time.DateTime dateTime8 = dateTime6.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableDuration2, (org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableDuration10, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Period period19 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period21 = period19.minusMillis(12);
        org.joda.time.Period period23 = period21.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration24 = period21.toStandardDuration();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) (short) -1, periodType26, chronology27);
        boolean boolean30 = mutablePeriod28.equals((java.lang.Object) (-3599990L));
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay32.toDateTime(timeOfDay33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime34.toMutableDateTime();
        java.lang.Object obj38 = mutableDateTime37.clone();
        org.joda.time.Chronology chronology39 = mutableDateTime37.getChronology();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant40, readableDuration41);
        org.joda.time.MutablePeriod mutablePeriod43 = period42.toMutablePeriod();
        org.joda.time.Period period45 = period42.plusHours((int) 'a');
        org.joda.time.Minutes minutes46 = period45.toStandardMinutes();
        org.joda.time.Period period47 = period45.negated();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period51 = period47.plus((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay54 = null;
        org.joda.time.DateTime dateTime55 = yearMonthDay53.toDateTime(timeOfDay54);
        org.joda.time.DateTime dateTime56 = yearMonthDay53.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar57 = dateTime56.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.DateTime dateTime59 = dateTime56.minus(readableDuration58);
        org.joda.time.YearMonthDay yearMonthDay61 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay62 = null;
        org.joda.time.DateTime dateTime63 = yearMonthDay61.toDateTime(timeOfDay62);
        org.joda.time.DateTime dateTime65 = dateTime63.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime63.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime66.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration68 = null;
        mutableDateTime66.add(readableDuration68, 100);
        mutablePeriod50.setPeriod((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) mutableDateTime66);
        mutableDateTime37.setMillis((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration73 = mutablePeriod28.toDurationTo((org.joda.time.ReadableInstant) dateTime56);
        boolean boolean74 = duration24.isLongerThan((org.joda.time.ReadableDuration) duration73);
        org.joda.time.DateTime dateTime75 = dateTime14.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.DateTime dateTime76 = dateTime6.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Instant instant78 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration24, (-292275054));
        org.joda.time.Instant instant80 = instant78.withMillis((long) ' ');
        boolean boolean81 = instant78.isEqualNow();
        org.joda.time.Instant instant83 = instant78.minus(0L);
        org.joda.time.DateTime dateTime84 = instant83.toDateTime();
        org.joda.time.LocalDate localDate85 = new org.joda.time.LocalDate((java.lang.Object) instant83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant83 and dateTime84", (instant83.compareTo(dateTime84) == 0) == instant83.equals(dateTime84));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone13);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant19 = mutableDateTime6.toInstant();
        long long20 = instant19.getMillis();
        org.joda.time.Chronology chronology21 = instant19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = instant19.toMutableDateTime();
        mutableDateTime22.addMillis(2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant19", (mutableDateTime6.compareTo(instant19) == 0) == mutableDateTime6.equals(instant19));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField7 = null;
        mutableDateTime6.setRounding(dateTimeField7, (int) '#');
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.minuteOfDay();
        mutableDateTime6.add((long) 1969);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay14.toDateTime(timeOfDay15);
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.minus(readableDuration18);
        org.joda.time.DateTime dateTime21 = dateTime17.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime23 = dateTime17.withMillis((long) 'a');
        int int24 = dateTime17.getYear();
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay26.toDateTime(timeOfDay27);
        org.joda.time.DateTime dateTime29 = dateTime28.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long33 = dateTimeZone31.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(dateTimeZone31);
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType37 = periodType36.withHoursRemoved();
        org.joda.time.PeriodType periodType38 = periodType36.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((-3599990L), periodType36);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateMidnight34, periodType36);
        boolean boolean41 = dateTime17.isEqual((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Instant instant42 = dateTime17.toInstant();
        int int43 = mutableDateTime6.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant42", (dateTime17.compareTo(instant42) == 0) == dateTime17.equals(instant42));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay3.toDateTime(timeOfDay4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime5.toMutableDateTime();
        java.lang.Object obj9 = mutableDateTime8.clone();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.minuteOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(chronology11);
        org.joda.time.Interval interval13 = dateMidnight12.toInterval();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay16.toDateTime(timeOfDay17);
        org.joda.time.DateTime dateTime19 = yearMonthDay16.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar20 = dateTime19.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.minus(readableDuration21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.seconds();
        int int26 = periodType24.indexOf(durationFieldType25);
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime19, readableInstant23, periodType24);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTime dateTime32 = yearMonthDay30.toDateTime(timeOfDay31);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime32.toMutableDateTime();
        java.lang.Object obj36 = mutableDateTime35.clone();
        org.joda.time.Chronology chronology37 = mutableDateTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.era();
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType28.getField(chronology37);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) (short) -1, periodType41, chronology42);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) (short) -1, periodType45, chronology46);
        mutablePeriod43.add((org.joda.time.ReadablePeriod) mutablePeriod47);
        int[] intArray50 = chronology37.get((org.joda.time.ReadablePeriod) mutablePeriod47, (long) 23);
        org.joda.time.DateTimeField dateTimeField51 = chronology37.secondOfDay();
        java.lang.String str52 = chronology37.toString();
        org.joda.time.Period period53 = new org.joda.time.Period(6000000L, periodType24, chronology37);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime8, (org.joda.time.ReadableInstant) dateMidnight12, periodType24);
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay57 = null;
        org.joda.time.DateTime dateTime58 = yearMonthDay56.toDateTime(timeOfDay57);
        org.joda.time.DateTime dateTime60 = dateTime58.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime61 = dateTime58.toMutableDateTime();
        java.lang.Object obj62 = mutableDateTime61.clone();
        org.joda.time.Chronology chronology63 = mutableDateTime61.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.weekyears();
        org.joda.time.DateTimeField dateTimeField65 = chronology63.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField66 = chronology63.secondOfMinute();
        org.joda.time.DurationField durationField67 = chronology63.years();
        org.joda.time.Period period68 = new org.joda.time.Period(8000L, (long) (-60465857), periodType24, chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField64 and durationField67", (durationField64.compareTo(durationField67) == 0) == durationField64.equals(durationField67));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology2 = yearMonthDay1.getChronology();
        long long6 = chronology2.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = chronology2.add(readablePeriod7, (long) 7, (-60634556));
        org.joda.time.DurationField durationField11 = chronology2.eras();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay17.toDateTime(timeOfDay18);
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readableDuration21);
        org.joda.time.DateTime dateTime23 = yearMonthDay13.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay13.dayOfMonth();
        org.joda.time.DateTime dateTime25 = yearMonthDay13.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property26 = yearMonthDay13.year();
        long long28 = chronology2.set((org.joda.time.ReadablePartial) yearMonthDay13, (long) 1009);
        org.joda.time.DurationField durationField29 = chronology2.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField29, and durationField11", !(durationField11.compareTo(durationField29) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField29.compareTo(durationField11))));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis((long) 12);
        org.joda.time.Instant instant4 = instant1.toInstant();
        org.joda.time.Period period6 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period8 = period6.minusMillis(12);
        org.joda.time.Period period10 = period8.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration11 = period8.toStandardDuration();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (short) -1, periodType13, chronology14);
        boolean boolean17 = mutablePeriod15.equals((java.lang.Object) (-3599990L));
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay19.toDateTime(timeOfDay20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime21.toMutableDateTime();
        java.lang.Object obj25 = mutableDateTime24.clone();
        org.joda.time.Chronology chronology26 = mutableDateTime24.getChronology();
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableDuration28);
        org.joda.time.MutablePeriod mutablePeriod30 = period29.toMutablePeriod();
        org.joda.time.Period period32 = period29.plusHours((int) 'a');
        org.joda.time.Minutes minutes33 = period32.toStandardMinutes();
        org.joda.time.Period period34 = period32.negated();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period38 = period34.plus((org.joda.time.ReadablePeriod) mutablePeriod37);
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay41 = null;
        org.joda.time.DateTime dateTime42 = yearMonthDay40.toDateTime(timeOfDay41);
        org.joda.time.DateTime dateTime43 = yearMonthDay40.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar44 = dateTime43.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime46 = dateTime43.minus(readableDuration45);
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay48.toDateTime(timeOfDay49);
        org.joda.time.DateTime dateTime52 = dateTime50.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime50.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime53.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration55 = null;
        mutableDateTime53.add(readableDuration55, 100);
        mutablePeriod37.setPeriod((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) mutableDateTime53);
        mutableDateTime24.setMillis((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Duration duration60 = mutablePeriod15.toDurationTo((org.joda.time.ReadableInstant) dateTime43);
        boolean boolean61 = duration11.isLongerThan((org.joda.time.ReadableDuration) duration60);
        org.joda.time.Instant instant62 = instant1.minus((org.joda.time.ReadableDuration) duration11);
        org.joda.time.MutableDateTime mutableDateTime63 = instant1.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay65 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay66 = null;
        org.joda.time.DateTime dateTime67 = yearMonthDay65.toDateTime(timeOfDay66);
        org.joda.time.DateTime dateTime69 = dateTime67.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime70 = dateTime67.toMutableDateTime();
        java.lang.Object obj71 = mutableDateTime70.clone();
        org.joda.time.Chronology chronology72 = mutableDateTime70.getChronology();
        org.joda.time.DateTimeField dateTimeField73 = chronology72.dayOfWeek();
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period(readableInstant74, readableDuration75);
        org.joda.time.MutablePeriod mutablePeriod77 = period76.toMutablePeriod();
        org.joda.time.Period period79 = period76.plusHours((int) 'a');
        org.joda.time.Minutes minutes80 = period79.toStandardMinutes();
        org.joda.time.Period period81 = period79.negated();
        org.joda.time.Period period83 = period81.withYears((-1));
        int int84 = period81.getMinutes();
        org.joda.time.Period period86 = period81.plusMillis((-292275054));
        org.joda.time.Period period88 = period81.plusDays(8);
        int[] intArray90 = chronology72.get((org.joda.time.ReadablePeriod) period88, 1L);
        mutableDateTime63.setChronology(chronology72);
        org.joda.time.MutableDateTime.Property property92 = mutableDateTime63.hourOfDay();
        java.lang.String str93 = property92.getAsShortText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime63", (instant1.compareTo(mutableDateTime63) == 0) == instant1.equals(mutableDateTime63));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant3 = instant1.minus((long) (byte) 100);
        org.joda.time.Chronology chronology4 = instant1.getChronology();
        long long5 = instant1.getMillis();
        org.joda.time.MutableDateTime mutableDateTime6 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant10 = instant8.withMillis((long) 12);
        org.joda.time.Instant instant11 = instant8.toInstant();
        org.joda.time.Chronology chronology12 = instant8.getChronology();
        org.joda.time.Period period21 = new org.joda.time.Period((int) (short) 1, (int) 'x', 0, 7, (int) (byte) 10, (int) (short) 100, (-60634556), 429);
        int[] intArray24 = chronology12.get((org.joda.time.ReadablePeriod) period21, (long) 19, (long) 965);
        org.joda.time.DateTimeField dateTimeField25 = chronology12.clockhourOfHalfday();
        mutableDateTime6.setRounding(dateTimeField25, (int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property30 = timeOfDay29.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay29.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime33 = timeOfDay32.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay34 = dateTime33.toTimeOfDay();
        org.joda.time.DateTime.Property property35 = dateTime33.yearOfCentury();
        java.util.Locale locale37 = new java.util.Locale("905");
        java.util.Calendar calendar38 = dateTime33.toCalendar(locale37);
        java.lang.String str39 = dateTimeField25.getAsShortText(82799, locale37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime6", (instant1.compareTo(mutableDateTime6) == 0) == instant1.equals(mutableDateTime6));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusWeeks((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight4.plus(readablePeriod7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight4.withDayOfYear(10);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        java.lang.Object obj18 = mutableDateTime17.clone();
        org.joda.time.Chronology chronology19 = mutableDateTime17.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.weekyears();
        org.joda.time.DateMidnight dateMidnight21 = org.joda.time.DateMidnight.now(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight4.withChronology(chronology19);
        org.joda.time.DateMidnight.Property property23 = dateMidnight4.monthOfYear();
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight4.minusYears((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime28 = dateMidnight25.toMutableDateTime(dateTimeZone27);
        long long32 = dateTimeZone27.convertLocalToUTC((long) (-27362566), true, 1969L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight25 and mutableDateTime28", (dateMidnight25.compareTo(mutableDateTime28) == 0) == dateMidnight25.equals(mutableDateTime28));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone13);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant19 = mutableDateTime6.toInstant();
        mutableDateTime6.add(10L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight17 and instant19", (dateMidnight17.compareTo(instant19) == 0) == dateMidnight17.equals(instant19));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((-3599990L), periodType2);
        int int6 = mutablePeriod5.getWeeks();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withOffsetParsed();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime15.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.millisOfSecond();
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay21.toDateTime(timeOfDay22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime23.toMutableDateTime();
        java.lang.Object obj27 = mutableDateTime26.clone();
        org.joda.time.Chronology chronology28 = mutableDateTime26.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.weekyears();
        mutableDateTime18.setChronology(chronology28);
        org.joda.time.DateTimeField dateTimeField31 = chronology28.secondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter11.withChronology(chronology28);
        mutablePeriod5.setPeriod((-3599990L), chronology28);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(9223372036854775807L, chronology28);
        org.joda.time.DurationField durationField35 = chronology28.seconds();
        org.joda.time.DurationField durationField36 = chronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField36, durationField29, and durationField35", !(durationField36.compareTo(durationField29) == 0) || (Math.signum(durationField36.compareTo(durationField35)) == Math.signum(durationField29.compareTo(durationField35))));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTime(timeOfDay5);
        org.joda.time.DateTime dateTime8 = dateTime6.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableDuration2, (org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableDuration10, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Period period19 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period21 = period19.minusMillis(12);
        org.joda.time.Period period23 = period21.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration24 = period21.toStandardDuration();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) (short) -1, periodType26, chronology27);
        boolean boolean30 = mutablePeriod28.equals((java.lang.Object) (-3599990L));
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay32.toDateTime(timeOfDay33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime34.toMutableDateTime();
        java.lang.Object obj38 = mutableDateTime37.clone();
        org.joda.time.Chronology chronology39 = mutableDateTime37.getChronology();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant40, readableDuration41);
        org.joda.time.MutablePeriod mutablePeriod43 = period42.toMutablePeriod();
        org.joda.time.Period period45 = period42.plusHours((int) 'a');
        org.joda.time.Minutes minutes46 = period45.toStandardMinutes();
        org.joda.time.Period period47 = period45.negated();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period51 = period47.plus((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay54 = null;
        org.joda.time.DateTime dateTime55 = yearMonthDay53.toDateTime(timeOfDay54);
        org.joda.time.DateTime dateTime56 = yearMonthDay53.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar57 = dateTime56.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.DateTime dateTime59 = dateTime56.minus(readableDuration58);
        org.joda.time.YearMonthDay yearMonthDay61 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay62 = null;
        org.joda.time.DateTime dateTime63 = yearMonthDay61.toDateTime(timeOfDay62);
        org.joda.time.DateTime dateTime65 = dateTime63.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime63.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime66.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration68 = null;
        mutableDateTime66.add(readableDuration68, 100);
        mutablePeriod50.setPeriod((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) mutableDateTime66);
        mutableDateTime37.setMillis((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration73 = mutablePeriod28.toDurationTo((org.joda.time.ReadableInstant) dateTime56);
        boolean boolean74 = duration24.isLongerThan((org.joda.time.ReadableDuration) duration73);
        org.joda.time.DateTime dateTime75 = dateTime14.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.DateTime dateTime76 = dateTime6.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Instant instant78 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration24, (-292275054));
        org.joda.time.Instant instant80 = instant78.withMillis((long) ' ');
        boolean boolean81 = instant78.isEqualNow();
        org.joda.time.Instant instant83 = instant78.minus(0L);
        org.joda.time.DateTime dateTime84 = instant83.toDateTime();
        org.joda.time.Instant instant86 = instant83.withMillis((-1128294000000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant83 and dateTime84", (instant83.compareTo(dateTime84) == 0) == instant83.equals(dateTime84));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableDuration7);
        org.joda.time.LocalTime localTime9 = localTime5.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.DateTime dateTime10 = localTime9.toDateTimeToday();
        org.joda.time.Chronology chronology11 = localTime9.getChronology();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime12", (dateTime10.compareTo(dateTime12) == 0) == dateTime10.equals(dateTime12));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        java.lang.Object obj4 = mutablePeriod3.clone();
        org.joda.time.MutablePeriod mutablePeriod5 = mutablePeriod3.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long10 = dateTimeZone8.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone8);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now(dateTimeZone8);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableDuration14);
        org.joda.time.LocalTime localTime16 = localTime12.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.DateTime dateTime17 = localTime16.toDateTimeToday();
        org.joda.time.Chronology chronology18 = localTime16.getChronology();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        mutablePeriod3.setPeriod((long) (-1), chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime19", (dateTime17.compareTo(dateTime19) == 0) == dateTime17.equals(dateTime19));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate18 = property16.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate19 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate21 = localDate19.plusWeeks(23);
        org.joda.time.DateTime dateTime22 = localDate19.toDateTimeAtStartOfDay();
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay24.toDateTime(timeOfDay25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime26.toMutableDateTime();
        java.lang.Object obj30 = mutableDateTime29.clone();
        int int31 = mutableDateTime29.getHourOfDay();
        boolean boolean32 = dateTime22.isEqual((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long37 = dateTimeZone35.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(dateTimeZone35);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone35);
        int int41 = dateTimeZone35.getStandardOffset(1000L);
        org.joda.time.DateTime dateTime42 = dateTime22.withZoneRetainFields(dateTimeZone35);
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay45 = null;
        org.joda.time.DateTime dateTime46 = yearMonthDay44.toDateTime(timeOfDay45);
        org.joda.time.DateTime dateTime48 = dateTime46.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime46.toMutableDateTime();
        java.lang.Object obj50 = mutableDateTime49.clone();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime49.setZone(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long58 = dateTimeZone56.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight(dateTimeZone56);
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone56);
        mutableDateTime49.setMillis((org.joda.time.ReadableInstant) dateMidnight60);
        org.joda.time.Instant instant62 = mutableDateTime49.toInstant();
        long long63 = instant62.getMillis();
        org.joda.time.DateTime dateTime64 = instant62.toDateTimeISO();
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.ReadableDuration readableDuration66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant65, readableDuration66);
        org.joda.time.MutablePeriod mutablePeriod68 = period67.toMutablePeriod();
        java.lang.Object obj69 = mutablePeriod68.clone();
        mutablePeriod68.setYears((int) ' ');
        int int72 = mutablePeriod68.getDays();
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long76 = dateTimeZone74.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight77 = new org.joda.time.DateMidnight(dateTimeZone74);
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight80 = dateMidnight77.withField(dateTimeFieldType78, (int) '4');
        org.joda.time.LocalDate localDate81 = dateMidnight80.toLocalDate();
        org.joda.time.LocalDate localDate83 = localDate81.withYearOfCentury((int) 'a');
        org.joda.time.DateTime dateTime84 = localDate83.toDateTimeAtMidnight();
        org.joda.time.Duration duration85 = mutablePeriod68.toDurationTo((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.Instant instant86 = instant62.plus((org.joda.time.ReadableDuration) duration85);
        org.joda.time.DateTime dateTime88 = dateTime42.withDurationAdded((org.joda.time.ReadableDuration) duration85, (int) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight39 and instant62", (dateMidnight39.compareTo(instant62) == 0) == dateMidnight39.equals(instant62));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period3 = org.joda.time.Period.seconds((int) ' ');
        int int4 = period3.getMinutes();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.years();
        int int6 = period3.get(durationFieldType5);
        int int7 = periodType1.indexOf(durationFieldType5);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.seconds();
        int int10 = periodType8.indexOf(durationFieldType9);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology13 = yearMonthDay12.getChronology();
        long long17 = chronology13.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = chronology13.add(readablePeriod18, (long) 7, (-60634556));
        org.joda.time.DurationField durationField22 = chronology13.weekyears();
        boolean boolean23 = durationFieldType9.isSupported(chronology13);
        org.joda.time.DurationField durationField24 = chronology13.days();
        boolean boolean25 = durationFieldType5.isSupported(chronology13);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay28 = null;
        org.joda.time.DateTime dateTime29 = yearMonthDay27.toDateTime(timeOfDay28);
        org.joda.time.DateTime dateTime30 = yearMonthDay27.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar31 = dateTime30.toGregorianCalendar();
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay36 = null;
        org.joda.time.DateTime dateTime37 = yearMonthDay35.toDateTime(timeOfDay36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime37.toMutableDateTime();
        java.lang.Object obj41 = mutableDateTime40.clone();
        org.joda.time.Chronology chronology42 = mutableDateTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.era();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType33.getField(chronology42);
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) (short) -1, periodType46, chronology47);
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) (short) -1, periodType50, chronology51);
        mutablePeriod48.add((org.joda.time.ReadablePeriod) mutablePeriod52);
        int[] intArray55 = chronology42.get((org.joda.time.ReadablePeriod) mutablePeriod52, (long) 23);
        org.joda.time.DateTimeField dateTimeField56 = chronology42.year();
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar31, chronology42);
        org.joda.time.DurationField durationField58 = durationFieldType5.getField(chronology42);
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime(0L, chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField58", (durationField22.compareTo(durationField58) == 0) == durationField22.equals(durationField58));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusWeeks((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight4.plus(readablePeriod7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.withDayOfWeek(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str12 = dateTimeFieldType11.getName();
        int int13 = dateMidnight8.get(dateTimeFieldType11);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight8.withYearOfCentury(40);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableDuration19);
        org.joda.time.MutablePeriod mutablePeriod21 = period20.toMutablePeriod();
        org.joda.time.Period period23 = period20.plusHours((int) 'a');
        org.joda.time.Period period25 = period20.withWeeks((int) (byte) -1);
        org.joda.time.Period period27 = period25.plusDays(0);
        org.joda.time.MutablePeriod mutablePeriod28 = period27.toMutablePeriod();
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType33 = periodType32.withHoursRemoved();
        org.joda.time.PeriodType periodType34 = periodType32.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((-3599990L), periodType32);
        org.joda.time.Partial partial36 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology37 = partial36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(0L, periodType32, chronology37);
        org.joda.time.DateMidnight dateMidnight39 = org.joda.time.DateMidnight.now(chronology37);
        org.joda.time.Chronology chronology40 = chronology37.withUTC();
        org.joda.time.DateTimeField dateTimeField41 = chronology37.minuteOfDay();
        mutablePeriod28.setPeriod(0L, chronology37);
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(chronology37);
        org.joda.time.DateTimeField dateTimeField44 = chronology37.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField45 = chronology37.weekyear();
        org.joda.time.DurationField durationField46 = chronology37.days();
        org.joda.time.Period period47 = new org.joda.time.Period((long) 82799999, 2034L, chronology37);
        org.joda.time.DateTimeField dateTimeField48 = chronology37.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((java.lang.Object) dateMidnight15, chronology37);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight15 and mutableDateTime49", (dateMidnight15.compareTo(mutableDateTime49) == 0) == dateMidnight15.equals(mutableDateTime49));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.withField(dateTimeFieldType6, (int) '4');
        org.joda.time.DateTime dateTime9 = dateMidnight8.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (short) -1, periodType13, chronology14);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (short) -1, periodType17, chronology18);
        mutablePeriod15.add((org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology25 = yearMonthDay24.getChronology();
        long long29 = chronology25.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        long long33 = chronology25.add(readablePeriod30, (long) 7, (-60634556));
        org.joda.time.DurationField durationField34 = chronology25.weekyears();
        mutablePeriod19.setPeriod((long) 35, (long) 9, chronology25);
        org.joda.time.PeriodType periodType36 = mutablePeriod19.getPeriodType();
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant40 = instant38.withMillis((long) 12);
        org.joda.time.Instant instant41 = instant38.toInstant();
        org.joda.time.Chronology chronology42 = instant38.getChronology();
        org.joda.time.Period period51 = new org.joda.time.Period((int) (short) 1, (int) 'x', 0, 7, (int) (byte) 10, (int) (short) 100, (-60634556), 429);
        int[] intArray54 = chronology42.get((org.joda.time.ReadablePeriod) period51, (long) 19, (long) 965);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 7, periodType36, chronology42);
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay(chronology42);
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime9.toMutableDateTime(chronology42);
        org.joda.time.YearMonthDay yearMonthDay58 = new org.joda.time.YearMonthDay((-170182110960L), chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and mutableDateTime57", (dateMidnight5.compareTo(mutableDateTime57) == 0) == dateMidnight5.equals(mutableDateTime57));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate8.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtStartOfDay(dateTimeZone21);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology28 = yearMonthDay27.getChronology();
        long long32 = chronology28.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = chronology28.add(readablePeriod33, (long) 7, (-60634556));
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime25.toMutableDateTime(chronology28);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay40 = null;
        org.joda.time.DateTime dateTime41 = yearMonthDay39.toDateTime(timeOfDay40);
        org.joda.time.DateTime dateTime42 = yearMonthDay39.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.minus(readableDuration43);
        org.joda.time.DateTime dateTime46 = dateTime42.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime48 = dateTime42.withMillis((long) 'a');
        java.lang.String str50 = dateTime42.toString("53");
        org.joda.time.DateMidnight dateMidnight51 = dateTime42.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight51.minusDays(0);
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateMidnight53, periodType54);
        org.joda.time.Period period57 = period55.minusSeconds(1976);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and mutableDateTime37", (dateTime25.compareTo(mutableDateTime37) == 0) == dateTime25.equals(mutableDateTime37));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate18 = property16.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate19 = property16.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight24.withField(dateTimeFieldType25, (int) '4');
        org.joda.time.LocalDate localDate28 = dateMidnight27.toLocalDate();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableDuration30);
        org.joda.time.MutablePeriod mutablePeriod32 = period31.toMutablePeriod();
        java.lang.Object obj33 = mutablePeriod32.clone();
        org.joda.time.LocalDate localDate35 = localDate28.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod32, (int) (byte) 1);
        org.joda.time.LocalDate localDate37 = localDate28.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate39 = localDate28.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long43 = dateTimeZone41.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime45 = localDate39.toDateTimeAtStartOfDay(dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(dateTimeZone41);
        org.joda.time.Interval interval47 = localDate19.toInterval(dateTimeZone41);
        java.util.Date date48 = localDate19.toDate();
        org.joda.time.YearMonthDay yearMonthDay49 = org.joda.time.YearMonthDay.fromDateFields(date48);
        org.joda.time.Partial partial50 = new org.joda.time.Partial((org.joda.time.ReadablePartial) yearMonthDay49);
        java.lang.String str51 = partial50.toStringList();
        int[] intArray52 = partial50.getValues();
        org.joda.time.YearMonthDay yearMonthDay54 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology55 = yearMonthDay54.getChronology();
        long long59 = chronology55.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        long long63 = chronology55.add(readablePeriod60, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField64 = chronology55.secondOfMinute();
        org.joda.time.DurationField durationField65 = chronology55.minutes();
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(chronology55);
        org.joda.time.Partial partial67 = partial50.withChronologyRetainFields(chronology55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and mutableDateTime66", (dateTime44.compareTo(mutableDateTime66) == 0) == dateTime44.equals(mutableDateTime66));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay7.minusYears((int) '4');
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) (short) -1, periodType11, chronology12);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (short) -1, periodType15, chronology16);
        mutablePeriod13.add((org.joda.time.ReadablePeriod) mutablePeriod17);
        mutablePeriod17.addMonths(0);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay7.minus((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.DateTime dateTime22 = dateTime4.withFields((org.joda.time.ReadablePartial) yearMonthDay21);
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology26 = yearMonthDay25.getChronology();
        long long30 = chronology26.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        long long34 = chronology26.add(readablePeriod31, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField35 = chronology26.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(1010L, chronology26);
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType40 = periodType39.withHoursRemoved();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight42 = org.joda.time.DateMidnight.now(dateTimeZone41);
        org.joda.time.Chronology chronology43 = dateMidnight42.getChronology();
        org.joda.time.Period period44 = new org.joda.time.Period((-1128294000000L), 8000L, periodType39, chronology43);
        int[] intArray47 = chronology26.get((org.joda.time.ReadablePeriod) period44, (long) 23, (long) 22);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime4, chronology26);
        org.joda.time.DateTime dateTime50 = dateTime4.plusDays((int) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime48", (dateTime4.compareTo(mutableDateTime48) == 0) == dateTime4.equals(mutableDateTime48));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.minus(readableDuration5);
        org.joda.time.DateTime dateTime8 = dateTime4.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime10 = dateTime4.withMillis((long) 'a');
        java.lang.String str12 = dateTime4.toString("53");
        org.joda.time.DateMidnight dateMidnight13 = dateTime4.toDateMidnight();
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant17 = instant15.withMillis((long) 12);
        org.joda.time.Instant instant18 = instant15.toInstant();
        org.joda.time.Chronology chronology19 = instant15.getChronology();
        org.joda.time.Period period28 = new org.joda.time.Period((int) (short) 1, (int) 'x', 0, 7, (int) (byte) 10, (int) (short) 100, (-60634556), 429);
        int[] intArray31 = chronology19.get((org.joda.time.ReadablePeriod) period28, (long) 19, (long) 965);
        org.joda.time.DateTimeField dateTimeField32 = chronology19.era();
        org.joda.time.DateTimeField dateTimeField33 = chronology19.weekyearOfCentury();
        org.joda.time.DateTime dateTime34 = dateTime4.toDateTime(chronology19);
        org.joda.time.DurationField durationField35 = chronology19.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime34", (dateTime4.compareTo(dateTime34) == 0) == dateTime4.equals(dateTime34));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.plusMinutes(86399999);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long6 = dateTimeZone4.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime8 = timeOfDay2.toDateTimeToday(dateTimeZone4);
        org.joda.time.LocalTime localTime9 = timeOfDay2.toLocalTime();
        org.joda.time.DateTime dateTime10 = timeOfDay2.toDateTimeToday();
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(86399999);
        int int13 = dateTime12.getMonthOfYear();
        org.joda.time.Instant instant14 = dateTime12.toInstant();
        int int15 = dateTime12.getMinuteOfHour();
        org.joda.time.DateTime.Property property16 = dateTime12.millisOfSecond();
        org.joda.time.DateTime dateTime17 = property16.roundCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant14", (dateTime17.compareTo(instant14) == 0) == dateTime17.equals(instant14));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableDuration7);
        org.joda.time.LocalTime localTime9 = localTime5.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.DateTime dateTime10 = localTime9.toDateTimeToday();
        org.joda.time.Chronology chronology11 = localTime9.getChronology();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime12", (dateTime10.compareTo(dateTime12) == 0) == dateTime10.equals(dateTime12));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Instant instant7 = instant3.withDurationAdded((-2678368012L), 2066);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime4", (instant3.compareTo(mutableDateTime4) == 0) == instant3.equals(mutableDateTime4));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.minus(readableDuration5);
        org.joda.time.DateTime dateTime8 = dateTime4.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime10 = dateTime4.withMillis((long) 'a');
        int int11 = dateTime4.getYear();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.DateTime dateTime16 = dateTime15.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long20 = dateTimeZone18.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(dateTimeZone18);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType24 = periodType23.withHoursRemoved();
        org.joda.time.PeriodType periodType25 = periodType23.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((-3599990L), periodType23);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateMidnight21, periodType23);
        boolean boolean28 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Instant instant29 = dateTime4.toInstant();
        org.joda.time.MutableDateTime mutableDateTime30 = instant29.toMutableDateTimeISO();
        mutableDateTime30.setMonthOfYear(1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant29", (dateTime4.compareTo(instant29) == 0) == dateTime4.equals(instant29));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long5 = dateTimeZone3.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusWeeks((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight6.plus(readablePeriod9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight6.withDayOfYear(10);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay14.toDateTime(timeOfDay15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime16.toMutableDateTime();
        java.lang.Object obj20 = mutableDateTime19.clone();
        org.joda.time.Chronology chronology21 = mutableDateTime19.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.weekyears();
        org.joda.time.DateMidnight dateMidnight23 = org.joda.time.DateMidnight.now(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight6.withChronology(chronology21);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusWeeks(121);
        org.joda.time.MutableDateTime mutableDateTime27 = dateMidnight24.toMutableDateTimeISO();
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay29.toDateTime(timeOfDay30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime31.toMutableDateTime();
        java.lang.Object obj35 = mutableDateTime34.clone();
        mutableDateTime34.add((long) 24);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant41 = instant39.withMillis((long) 12);
        org.joda.time.Instant instant42 = instant39.toInstant();
        org.joda.time.Chronology chronology43 = instant39.getChronology();
        mutableDateTime34.setChronology(chronology43);
        org.joda.time.DateMidnight dateMidnight45 = org.joda.time.DateMidnight.now(chronology43);
        mutableDateTime27.setChronology(chronology43);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(100L, (long) (short) 10, chronology43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight6 and mutableDateTime27", (dateMidnight6.compareTo(mutableDateTime27) == 0) == dateMidnight6.equals(mutableDateTime27));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime6.add(readableDuration9);
        mutableDateTime6.setMillis((long) (-1));
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime6.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime6.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundFloor();
        mutableDateTime15.setDate(15000L);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant21 = instant19.withMillis((long) 12);
        org.joda.time.MutableDateTime mutableDateTime22 = instant21.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((java.lang.Object) mutableDateTime15, dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and mutableDateTime22", (instant21.compareTo(mutableDateTime22) == 0) == instant21.equals(mutableDateTime22));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate19 = localDate8.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtStartOfDay(dateTimeZone21);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology28 = yearMonthDay27.getChronology();
        long long32 = chronology28.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = chronology28.add(readablePeriod33, (long) 7, (-60634556));
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime25.toMutableDateTime(chronology28);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long42 = dateTimeZone40.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(dateTimeZone40);
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone40);
        org.joda.time.DateMidnight.Property property45 = dateMidnight44.yearOfEra();
        org.joda.time.DateMidnight dateMidnight46 = property45.roundHalfEvenCopy();
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = locale47.getDisplayName();
        java.util.Set<java.lang.Character> charSet49 = locale47.getExtensionKeys();
        java.lang.String str50 = property45.getAsShortText(locale47);
        org.joda.time.DateMidnight dateMidnight51 = property45.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight51.plusDays(99);
        int int54 = dateTime25.compareTo((org.joda.time.ReadableInstant) dateMidnight53);
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight53.minus(readableDuration55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and mutableDateTime37", (dateTime25.compareTo(mutableDateTime37) == 0) == dateTime25.equals(mutableDateTime37));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone2);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.yearOfEra();
        org.joda.time.DateMidnight dateMidnight8 = property7.roundHalfFloorCopy();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays(10);
        org.joda.time.Instant instant12 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant14 = instant12.minus((long) (byte) 100);
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay16.toDateTime(timeOfDay17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime18.toMutableDateTime();
        java.lang.Object obj22 = mutableDateTime21.clone();
        org.joda.time.Chronology chronology23 = mutableDateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.yearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay26.toDateTime(timeOfDay27);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTime dateTime32 = yearMonthDay30.toDateTime(timeOfDay31);
        org.joda.time.DateTime dateTime33 = yearMonthDay30.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.minus(readableDuration34);
        org.joda.time.DateTime dateTime36 = yearMonthDay26.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant37, readableDuration38);
        org.joda.time.MutablePeriod mutablePeriod40 = period39.toMutablePeriod();
        org.joda.time.Period period42 = period39.plusHours((int) 'a');
        org.joda.time.Minutes minutes43 = period42.toStandardMinutes();
        org.joda.time.Period period44 = period42.negated();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period48 = period44.plus((org.joda.time.ReadablePeriod) mutablePeriod47);
        org.joda.time.YearMonthDay yearMonthDay49 = yearMonthDay26.minus((org.joda.time.ReadablePeriod) period48);
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale52.getDisplayLanguage(locale53);
        java.lang.String str55 = locale51.getDisplayName(locale53);
        java.lang.String str56 = dateTimeField24.getAsShortText((org.joda.time.ReadablePartial) yearMonthDay49, 22178485, locale53);
        int int57 = instant14.get(dateTimeField24);
        org.joda.time.MutableDateTime mutableDateTime58 = instant14.toMutableDateTimeISO();
        org.joda.time.Instant instant61 = instant14.withDurationAdded((long) (-60609161), 767);
        boolean boolean62 = dateMidnight10.isEqual((org.joda.time.ReadableInstant) instant14);
        org.joda.time.Interval interval63 = dateMidnight10.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and mutableDateTime58", (instant14.compareTo(mutableDateTime58) == 0) == instant14.equals(mutableDateTime58));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField7 = null;
        mutableDateTime6.setRounding(dateTimeField7, (int) '#');
        mutableDateTime6.addMillis((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime6.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField13 = mutableDateTime12.getRoundingField();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay15.toDateTime(timeOfDay16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime17.toMutableDateTime();
        java.lang.Object obj21 = mutableDateTime20.clone();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.minuteOfDay();
        mutableDateTime12.setMillis((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str25 = dateTimeZone24.getID();
        long long27 = dateTimeZone24.convertUTCToLocal((long) 9);
        long long30 = dateTimeZone24.adjustOffset((long) 'u', true);
        mutableDateTime12.setZone(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime12", (dateTime3.compareTo(mutableDateTime12) == 0) == dateTime3.equals(mutableDateTime12));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone2);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.yearOfEra();
        int int8 = dateMidnight6.getSecondOfMinute();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.Period period14 = period11.plusHours((int) 'a');
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Period period16 = period14.negated();
        org.joda.time.Period period18 = period16.withYears((-1));
        int int19 = period16.getMinutes();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period22 = period16.withField(durationFieldType20, 292278993);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight6.withFieldAdded(durationFieldType20, 35);
        org.joda.time.Interval interval25 = dateMidnight6.toInterval();
        org.joda.time.Interval interval26 = dateMidnight6.toInterval();
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight6.withDurationAdded(37L, (-60578801));
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay32 = null;
        org.joda.time.DateTime dateTime33 = yearMonthDay31.toDateTime(timeOfDay32);
        org.joda.time.DateTime dateTime34 = yearMonthDay31.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.minus(readableDuration35);
        org.joda.time.DateTime dateTime38 = dateTime34.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime40 = dateTime34.withMillis((long) 'a');
        java.lang.String str42 = dateTime34.toString("53");
        org.joda.time.DateMidnight dateMidnight43 = dateTime34.toDateMidnight();
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant47 = instant45.withMillis((long) 12);
        org.joda.time.Instant instant48 = instant45.toInstant();
        org.joda.time.Chronology chronology49 = instant45.getChronology();
        org.joda.time.Period period58 = new org.joda.time.Period((int) (short) 1, (int) 'x', 0, 7, (int) (byte) 10, (int) (short) 100, (-60634556), 429);
        int[] intArray61 = chronology49.get((org.joda.time.ReadablePeriod) period58, (long) 19, (long) 965);
        org.joda.time.DateTimeField dateTimeField62 = chronology49.era();
        org.joda.time.DateTimeField dateTimeField63 = chronology49.weekyearOfCentury();
        org.joda.time.DateTime dateTime64 = dateTime34.toDateTime(chronology49);
        org.joda.time.MutableDateTime mutableDateTime65 = dateMidnight29.toMutableDateTime(chronology49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight6 and dateTime64", (dateMidnight6.compareTo(dateTime64) == 0) == dateMidnight6.equals(dateTime64));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.Instant instant2 = new org.joda.time.Instant(2629746000L);
        org.joda.time.DateTime dateTime3 = instant2.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology5 = null;
        boolean boolean6 = dateTimeFieldType4.isSupported(chronology5);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weeks();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.yearOfCentury();
        boolean boolean11 = dateTimeFieldType4.isSupported(chronology8);
        org.joda.time.DateTimeField dateTimeField12 = chronology8.secondOfMinute();
        org.joda.time.DurationField durationField13 = chronology8.days();
        org.joda.time.DateTime dateTime14 = dateTime3.toDateTime(chronology8);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((-86400000L), chronology8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime3", (instant2.compareTo(dateTime3) == 0) == instant2.equals(dateTime3));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weekyears();
        org.joda.time.DateMidnight dateMidnight10 = org.joda.time.DateMidnight.now(chronology8);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now(chronology8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long17 = dateTimeZone15.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusDays((int) 'u');
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight18.withDurationAdded((long) 100, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight18.withMillis((-292275154L));
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.withDayOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight27.withField(dateTimeFieldType28, 23);
        org.joda.time.LocalDate.Property property31 = localDate13.property(dateTimeFieldType28);
        org.joda.time.LocalDate.Property property32 = localDate11.property(dateTimeFieldType28);
        org.joda.time.LocalDate localDate34 = localDate11.plusMonths(71);
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay37 = null;
        org.joda.time.DateTime dateTime38 = yearMonthDay36.toDateTime(timeOfDay37);
        org.joda.time.DateTime dateTime39 = yearMonthDay36.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.minus(readableDuration40);
        org.joda.time.DateTime dateTime43 = dateTime39.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime45 = dateTime39.withMillis((long) 'a');
        int int46 = dateTime39.getYear();
        org.joda.time.DateTime.Property property47 = dateTime39.dayOfYear();
        org.joda.time.DateTime dateTime48 = property47.getDateTime();
        org.joda.time.DateTime dateTime49 = property47.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours(17);
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime49.toMutableDateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime53 = localDate11.toDateTimeAtMidnight(dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and mutableDateTime52", (dateTime39.compareTo(mutableDateTime52) == 0) == dateTime39.equals(mutableDateTime52));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.seconds();
        int int3 = periodType1.indexOf(durationFieldType2);
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology6 = yearMonthDay5.getChronology();
        long long10 = chronology6.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology6.add(readablePeriod11, (long) 7, (-60634556));
        org.joda.time.DurationField durationField15 = chronology6.weekyears();
        boolean boolean16 = durationFieldType2.isSupported(chronology6);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (-3600000), chronology6);
        java.util.Date date18 = localDate17.toDate();
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.fromDateFields(date18);
        org.joda.time.LocalDate localDate21 = localDate19.withWeekyear(356);
        org.joda.time.LocalDate.Property property22 = localDate19.yearOfEra();
        org.joda.time.Period period24 = org.joda.time.Period.days(100);
        org.joda.time.Period period26 = period24.withHours((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay29.toDateTime(timeOfDay30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime31.toMutableDateTime();
        java.lang.Object obj35 = mutableDateTime34.clone();
        org.joda.time.Chronology chronology36 = mutableDateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.era();
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType27.getField(chronology36);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) (short) -1, periodType40, chronology41);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) (short) -1, periodType44, chronology45);
        mutablePeriod42.add((org.joda.time.ReadablePeriod) mutablePeriod46);
        int[] intArray49 = chronology36.get((org.joda.time.ReadablePeriod) mutablePeriod46, (long) 23);
        mutablePeriod46.setDays((-97));
        org.joda.time.YearMonthDay yearMonthDay54 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay55 = null;
        org.joda.time.DateTime dateTime56 = yearMonthDay54.toDateTime(timeOfDay55);
        org.joda.time.DateTime dateTime58 = dateTime56.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime56.toMutableDateTime();
        java.lang.Object obj60 = mutableDateTime59.clone();
        org.joda.time.Chronology chronology61 = mutableDateTime59.getChronology();
        org.joda.time.DurationField durationField62 = chronology61.weekyears();
        org.joda.time.DateMidnight dateMidnight63 = org.joda.time.DateMidnight.now(chronology61);
        org.joda.time.LocalDate localDate64 = org.joda.time.LocalDate.now(chronology61);
        mutablePeriod46.setPeriod(1000L, chronology61);
        mutablePeriod46.addHours(0);
        org.joda.time.Period period68 = period26.plus((org.joda.time.ReadablePeriod) mutablePeriod46);
        mutablePeriod46.setHours(22);
        org.joda.time.LocalDate localDate71 = localDate19.minus((org.joda.time.ReadablePeriod) mutablePeriod46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField62", (durationField15.compareTo(durationField62) == 0) == durationField15.equals(durationField62));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTime dateTime7 = yearMonthDay5.toDateTime(timeOfDay6);
        org.joda.time.DateTime dateTime8 = yearMonthDay5.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readableDuration9);
        org.joda.time.DateTime dateTime11 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.Interval interval14 = yearMonthDay1.toInterval(dateTimeZone13);
        org.joda.time.LocalDate localDate15 = yearMonthDay1.toLocalDate();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableDuration17);
        org.joda.time.MutablePeriod mutablePeriod19 = period18.toMutablePeriod();
        org.joda.time.Period period21 = period18.plusHours((int) 'a');
        org.joda.time.Period period23 = period18.withWeeks((int) (byte) -1);
        org.joda.time.Period period25 = period23.plusDays(0);
        org.joda.time.Period period26 = period25.toPeriod();
        org.joda.time.Period period28 = period26.minusWeeks(9);
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay1.plus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str31 = dateTimeZone30.getID();
        long long33 = dateTimeZone30.previousTransition(7720120L);
        org.joda.time.DateTime dateTime34 = yearMonthDay1.toDateTimeAtCurrentTime(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long38 = dateTimeZone36.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(dateTimeZone36);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight39.withField(dateTimeFieldType40, (int) '4');
        org.joda.time.LocalDate localDate43 = dateMidnight42.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay46 = null;
        org.joda.time.DateTime dateTime47 = yearMonthDay45.toDateTime(timeOfDay46);
        boolean boolean49 = dateTime47.isAfter((long) (short) 10);
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType51 = periodType50.withHoursRemoved();
        org.joda.time.PeriodType periodType52 = periodType50.withMonthsRemoved();
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight42, (org.joda.time.ReadableInstant) dateTime47, periodType52);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long57 = dateTimeZone55.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight(dateTimeZone55);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight58.withField(dateTimeFieldType59, (int) '4');
        org.joda.time.DateMidnight.Property property62 = dateMidnight42.property(dateTimeFieldType59);
        int int63 = dateTimeZone30.getOffset((org.joda.time.ReadableInstant) dateMidnight42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime34", (dateTime3.compareTo(dateTime34) == 0) == dateTime3.equals(dateTime34));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DurationField durationField2 = durationFieldType0.getField(chronology1);
        java.lang.String str3 = durationField2.toString();
        long long5 = durationField2.getMillis((int) (byte) 100);
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property7 = timeOfDay6.secondOfMinute();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        int int9 = durationField2.compareTo(durationField8);
        long long12 = durationField8.add((long) 59999, (-3599959L));
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) long12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField8", (durationField2.compareTo(durationField8) == 0) == durationField2.equals(durationField8));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusWeeks((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight4.plus(readablePeriod7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight4.withDayOfYear(10);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        java.lang.Object obj18 = mutableDateTime17.clone();
        org.joda.time.Chronology chronology19 = mutableDateTime17.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.weekyears();
        org.joda.time.DateMidnight dateMidnight21 = org.joda.time.DateMidnight.now(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight4.withChronology(chronology19);
        org.joda.time.DateMidnight.Property property23 = dateMidnight4.monthOfYear();
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight4.minusYears((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime28 = dateMidnight25.toMutableDateTime(dateTimeZone27);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTime dateTime32 = yearMonthDay30.toDateTime(timeOfDay31);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime32.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime38 = dateTime32.withDurationAdded(readableDuration36, (int) (short) 1);
        org.joda.time.DateTime.Property property39 = dateTime32.minuteOfHour();
        org.joda.time.DateTime.Property property40 = dateTime32.monthOfYear();
        org.joda.time.DateTime dateTime41 = property40.withMaximumValue();
        org.joda.time.DateTime dateTime43 = property40.setCopy(8);
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay46 = null;
        org.joda.time.DateTime dateTime47 = yearMonthDay45.toDateTime(timeOfDay46);
        org.joda.time.DateTime dateTime49 = dateTime47.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime47.toMutableDateTime();
        java.lang.Object obj51 = mutableDateTime50.clone();
        org.joda.time.Chronology chronology52 = mutableDateTime50.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = chronology52.era();
        org.joda.time.DateTime dateTime54 = dateTime43.toDateTime(chronology52);
        org.joda.time.MutableDateTime mutableDateTime55 = org.joda.time.MutableDateTime.now(chronology52);
        org.joda.time.DateTimeField dateTimeField56 = chronology52.era();
        org.joda.time.DateTimeField dateTimeField57 = chronology52.weekyearOfCentury();
        boolean boolean58 = dateTimeZone27.equals((java.lang.Object) chronology52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight25 and mutableDateTime28", (dateMidnight25.compareTo(mutableDateTime28) == 0) == dateMidnight25.equals(mutableDateTime28));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone13);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant19 = mutableDateTime6.toInstant();
        int int20 = mutableDateTime6.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight17 and instant19", (dateMidnight17.compareTo(instant19) == 0) == dateMidnight17.equals(instant19));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.era();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        long long11 = mutableDateTime10.getMillis();
        org.joda.time.Instant instant12 = mutableDateTime10.toInstant();
        mutableDateTime10.setMillis(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant12", (dateTime3.compareTo(instant12) == 0) == dateTime3.equals(instant12));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis((long) 12);
        org.joda.time.Instant instant4 = instant1.toInstant();
        org.joda.time.Period period6 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period8 = period6.minusMillis(12);
        org.joda.time.Period period10 = period8.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration11 = period8.toStandardDuration();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (short) -1, periodType13, chronology14);
        boolean boolean17 = mutablePeriod15.equals((java.lang.Object) (-3599990L));
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay19.toDateTime(timeOfDay20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime21.toMutableDateTime();
        java.lang.Object obj25 = mutableDateTime24.clone();
        org.joda.time.Chronology chronology26 = mutableDateTime24.getChronology();
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableDuration28);
        org.joda.time.MutablePeriod mutablePeriod30 = period29.toMutablePeriod();
        org.joda.time.Period period32 = period29.plusHours((int) 'a');
        org.joda.time.Minutes minutes33 = period32.toStandardMinutes();
        org.joda.time.Period period34 = period32.negated();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period38 = period34.plus((org.joda.time.ReadablePeriod) mutablePeriod37);
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay41 = null;
        org.joda.time.DateTime dateTime42 = yearMonthDay40.toDateTime(timeOfDay41);
        org.joda.time.DateTime dateTime43 = yearMonthDay40.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar44 = dateTime43.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime46 = dateTime43.minus(readableDuration45);
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay48.toDateTime(timeOfDay49);
        org.joda.time.DateTime dateTime52 = dateTime50.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime50.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime53.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration55 = null;
        mutableDateTime53.add(readableDuration55, 100);
        mutablePeriod37.setPeriod((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) mutableDateTime53);
        mutableDateTime24.setMillis((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Duration duration60 = mutablePeriod15.toDurationTo((org.joda.time.ReadableInstant) dateTime43);
        boolean boolean61 = duration11.isLongerThan((org.joda.time.ReadableDuration) duration60);
        org.joda.time.Instant instant62 = instant1.minus((org.joda.time.ReadableDuration) duration11);
        org.joda.time.MutableDateTime mutableDateTime63 = instant1.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay65 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay66 = null;
        org.joda.time.DateTime dateTime67 = yearMonthDay65.toDateTime(timeOfDay66);
        org.joda.time.DateTime dateTime69 = dateTime67.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime70 = dateTime67.toMutableDateTime();
        java.lang.Object obj71 = mutableDateTime70.clone();
        org.joda.time.Chronology chronology72 = mutableDateTime70.getChronology();
        org.joda.time.DateTimeField dateTimeField73 = chronology72.dayOfWeek();
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period(readableInstant74, readableDuration75);
        org.joda.time.MutablePeriod mutablePeriod77 = period76.toMutablePeriod();
        org.joda.time.Period period79 = period76.plusHours((int) 'a');
        org.joda.time.Minutes minutes80 = period79.toStandardMinutes();
        org.joda.time.Period period81 = period79.negated();
        org.joda.time.Period period83 = period81.withYears((-1));
        int int84 = period81.getMinutes();
        org.joda.time.Period period86 = period81.plusMillis((-292275054));
        org.joda.time.Period period88 = period81.plusDays(8);
        int[] intArray90 = chronology72.get((org.joda.time.ReadablePeriod) period88, 1L);
        mutableDateTime63.setChronology(chronology72);
        org.joda.time.LocalTime localTime92 = new org.joda.time.LocalTime(chronology72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime63", (instant1.compareTo(mutableDateTime63) == 0) == instant1.equals(mutableDateTime63));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusWeeks((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight4.plus(readablePeriod7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight4.withDayOfYear(10);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        java.lang.Object obj18 = mutableDateTime17.clone();
        org.joda.time.Chronology chronology19 = mutableDateTime17.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.weekyears();
        org.joda.time.DateMidnight dateMidnight21 = org.joda.time.DateMidnight.now(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight4.withChronology(chronology19);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusWeeks(121);
        org.joda.time.MutableDateTime mutableDateTime25 = dateMidnight22.toMutableDateTimeISO();
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay28 = null;
        org.joda.time.DateTime dateTime29 = yearMonthDay27.toDateTime(timeOfDay28);
        org.joda.time.DateTime dateTime31 = dateTime29.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime29.toMutableDateTime();
        java.lang.Object obj33 = mutableDateTime32.clone();
        mutableDateTime32.add((long) 24);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant39 = instant37.withMillis((long) 12);
        org.joda.time.Instant instant40 = instant37.toInstant();
        org.joda.time.Chronology chronology41 = instant37.getChronology();
        mutableDateTime32.setChronology(chronology41);
        org.joda.time.DateMidnight dateMidnight43 = org.joda.time.DateMidnight.now(chronology41);
        mutableDateTime25.setChronology(chronology41);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime25.millisOfDay();
        java.lang.String str46 = property45.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and mutableDateTime25", (dateMidnight4.compareTo(mutableDateTime25) == 0) == dateMidnight4.equals(mutableDateTime25));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.secondOfMinute();
        org.joda.time.DurationField durationField2 = property1.getDurationField();
        org.joda.time.TimeOfDay timeOfDay4 = property1.addToCopy(22);
        java.lang.String str6 = timeOfDay4.toString("12");
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay4.minusHours((-624));
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.Period period14 = period11.plusHours((int) 'a');
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Period period16 = period14.negated();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DurationField durationField19 = durationFieldType17.getField(chronology18);
        boolean boolean20 = period14.isSupported(durationFieldType17);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay8.withPeriodAdded((org.joda.time.ReadablePeriod) period14, 70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField19", (durationField2.compareTo(durationField19) == 0) == durationField2.equals(durationField19));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusWeeks((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight4.plus(readablePeriod7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight4.withDayOfYear(10);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        java.lang.Object obj18 = mutableDateTime17.clone();
        org.joda.time.Chronology chronology19 = mutableDateTime17.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.weekyears();
        org.joda.time.DateMidnight dateMidnight21 = org.joda.time.DateMidnight.now(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight4.withChronology(chronology19);
        org.joda.time.DateMidnight.Property property23 = dateMidnight4.monthOfYear();
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight4.minusYears((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime28 = dateMidnight25.toMutableDateTime(dateTimeZone27);
        java.util.TimeZone timeZone29 = dateTimeZone27.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight25 and mutableDateTime28", (dateMidnight25.compareTo(mutableDateTime28) == 0) == dateMidnight25.equals(mutableDateTime28));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.plus((long) ' ');
        org.joda.time.DateTime dateTime7 = dateTime3.plusYears(2);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours(35);
        long long11 = dateTimeZone9.previousTransition((long) 17);
        org.joda.time.DateTime dateTime12 = dateTime7.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withEra((int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime13", (dateTime7.compareTo(dateTime13) == 0) == dateTime7.equals(dateTime13));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime4", (instant1.compareTo(mutableDateTime4) == 0) == instant1.equals(mutableDateTime4));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.plus((long) ' ');
        org.joda.time.DateTime dateTime7 = dateTime3.plusYears(2);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours(35);
        long long11 = dateTimeZone9.previousTransition((long) 17);
        org.joda.time.DateTime dateTime12 = dateTime7.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTime();
        int int14 = dateTime13.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime13", (dateTime7.compareTo(dateTime13) == 0) == dateTime7.equals(dateTime13));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTime(timeOfDay5);
        org.joda.time.DateTime dateTime8 = dateTime6.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableDuration2, (org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableDuration10, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Period period19 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period21 = period19.minusMillis(12);
        org.joda.time.Period period23 = period21.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration24 = period21.toStandardDuration();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) (short) -1, periodType26, chronology27);
        boolean boolean30 = mutablePeriod28.equals((java.lang.Object) (-3599990L));
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay32.toDateTime(timeOfDay33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime34.toMutableDateTime();
        java.lang.Object obj38 = mutableDateTime37.clone();
        org.joda.time.Chronology chronology39 = mutableDateTime37.getChronology();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant40, readableDuration41);
        org.joda.time.MutablePeriod mutablePeriod43 = period42.toMutablePeriod();
        org.joda.time.Period period45 = period42.plusHours((int) 'a');
        org.joda.time.Minutes minutes46 = period45.toStandardMinutes();
        org.joda.time.Period period47 = period45.negated();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period51 = period47.plus((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay54 = null;
        org.joda.time.DateTime dateTime55 = yearMonthDay53.toDateTime(timeOfDay54);
        org.joda.time.DateTime dateTime56 = yearMonthDay53.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar57 = dateTime56.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.DateTime dateTime59 = dateTime56.minus(readableDuration58);
        org.joda.time.YearMonthDay yearMonthDay61 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay62 = null;
        org.joda.time.DateTime dateTime63 = yearMonthDay61.toDateTime(timeOfDay62);
        org.joda.time.DateTime dateTime65 = dateTime63.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime63.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime66.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration68 = null;
        mutableDateTime66.add(readableDuration68, 100);
        mutablePeriod50.setPeriod((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) mutableDateTime66);
        mutableDateTime37.setMillis((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration73 = mutablePeriod28.toDurationTo((org.joda.time.ReadableInstant) dateTime56);
        boolean boolean74 = duration24.isLongerThan((org.joda.time.ReadableDuration) duration73);
        org.joda.time.DateTime dateTime75 = dateTime14.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.DateTime dateTime76 = dateTime6.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Instant instant78 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration24, (-292275054));
        org.joda.time.Instant instant80 = instant78.withMillis((long) ' ');
        boolean boolean81 = instant78.isEqualNow();
        org.joda.time.Instant instant83 = instant78.minus(0L);
        org.joda.time.DateTime dateTime84 = instant83.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime85 = org.joda.time.MutableDateTime.now();
        mutableDateTime85.addMillis(194);
        mutableDateTime85.setTime((-218091618000000L));
        org.joda.time.Period period91 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period93 = period91.minusMillis(12);
        org.joda.time.Period period95 = period93.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration96 = period93.toStandardDuration();
        mutableDateTime85.add((org.joda.time.ReadableDuration) duration96);
        org.joda.time.Instant instant99 = instant83.withDurationAdded((org.joda.time.ReadableDuration) duration96, 64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant83 and dateTime84", (instant83.compareTo(dateTime84) == 0) == instant83.equals(dateTime84));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 687, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long8 = dateTimeZone6.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYearOfCentury((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DurationField durationField16 = durationFieldType14.getField(chronology15);
        boolean boolean17 = localDateTime11.isSupported(durationFieldType14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime11.withDayOfYear(22);
        org.joda.time.Period period21 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period23 = period21.minusMillis(12);
        org.joda.time.Period period25 = period23.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration26 = period23.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableDuration28);
        org.joda.time.MutablePeriod mutablePeriod30 = period29.toMutablePeriod();
        java.lang.Object obj31 = mutablePeriod30.clone();
        mutablePeriod30.setYears((int) ' ');
        int int34 = mutablePeriod30.getDays();
        boolean boolean35 = duration26.equals((java.lang.Object) int34);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime19.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant38 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration26, 25793);
        org.joda.time.MutableDateTime mutableDateTime39 = instant0.toMutableDateTime();
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType42 = periodType41.withHoursRemoved();
        org.joda.time.PeriodType periodType43 = periodType41.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((-3599990L), periodType41);
        int int45 = mutablePeriod44.getWeeks();
        org.joda.time.format.DateTimePrinter dateTimePrinter47 = null;
        org.joda.time.format.DateTimeParser dateTimeParser48 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter47, dateTimeParser48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter49.withOffsetParsed();
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay53 = null;
        org.joda.time.DateTime dateTime54 = yearMonthDay52.toDateTime(timeOfDay53);
        org.joda.time.DateTime dateTime56 = dateTime54.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime54.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime57.millisOfSecond();
        org.joda.time.YearMonthDay yearMonthDay60 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay61 = null;
        org.joda.time.DateTime dateTime62 = yearMonthDay60.toDateTime(timeOfDay61);
        org.joda.time.DateTime dateTime64 = dateTime62.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime65 = dateTime62.toMutableDateTime();
        java.lang.Object obj66 = mutableDateTime65.clone();
        org.joda.time.Chronology chronology67 = mutableDateTime65.getChronology();
        org.joda.time.DurationField durationField68 = chronology67.weekyears();
        mutableDateTime57.setChronology(chronology67);
        org.joda.time.DateTimeField dateTimeField70 = chronology67.secondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter50.withChronology(chronology67);
        mutablePeriod44.setPeriod((-3599990L), chronology67);
        org.joda.time.YearMonthDay yearMonthDay74 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay75 = null;
        org.joda.time.DateTime dateTime76 = yearMonthDay74.toDateTime(timeOfDay75);
        org.joda.time.DateTime dateTime77 = yearMonthDay74.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime79 = dateTime77.plusMillis(1);
        int int80 = dateTime77.getYearOfCentury();
        org.joda.time.DateTime dateTime82 = dateTime77.plusDays(974);
        org.joda.time.Duration duration83 = mutablePeriod44.toDurationTo((org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.Period period84 = duration83.toPeriod();
        org.joda.time.Instant instant85 = instant0.minus((org.joda.time.ReadableDuration) duration83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant85 and mutableDateTime39", (instant85.compareTo(mutableDateTime39) == 0) == instant85.equals(mutableDateTime39));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant3 = instant1.minus((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTime();
        org.joda.time.Instant instant7 = instant3.withDurationAdded((long) (-60581005), 55);
        org.joda.time.DateTime dateTime8 = instant7.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime4", (instant3.compareTo(mutableDateTime4) == 0) == instant3.equals(mutableDateTime4));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusMonths((int) ' ');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYear((int) ' ');
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfWeek();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.dayOfMonth();
        org.joda.time.Chronology chronology14 = localDateTime11.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.eras();
        org.joda.time.DurationField durationField16 = chronology14.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField16, and durationField15", !(durationField15.compareTo(durationField16) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField16.compareTo(durationField15))));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withYearOfCentury((int) (short) 1);
        int int10 = dateMidnight4.getEra();
        org.joda.time.DateMidnight.Property property11 = dateMidnight4.weekyear();
        org.joda.time.DateMidnight dateMidnight12 = property11.roundHalfEvenCopy();
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay14.toDateTime(timeOfDay15);
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.minus(readableDuration18);
        org.joda.time.DateTime dateTime21 = dateTime17.withSecondOfMinute(0);
        int int22 = property11.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Instant instant23 = dateTime17.toInstant();
        java.lang.String str24 = instant23.toString();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Instant instant26 = instant23.minus(readableDuration25);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long36 = dateTimeZone34.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone34);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(3, (int) (byte) 10, 7, 8, 0, dateTimeZone34);
        long long41 = dateTimeZone34.convertUTCToLocal(31536000000L);
        org.joda.time.DateTime dateTime42 = instant23.toDateTime(dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant23", (dateTime17.compareTo(instant23) == 0) == dateTime17.equals(instant23));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.withField(dateTimeFieldType6, (int) '4');
        org.joda.time.LocalDate localDate9 = dateMidnight8.toLocalDate();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableDuration11);
        org.joda.time.MutablePeriod mutablePeriod13 = period12.toMutablePeriod();
        java.lang.Object obj14 = mutablePeriod13.clone();
        org.joda.time.LocalDate localDate16 = localDate9.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod13, (int) (byte) 1);
        org.joda.time.LocalDate localDate18 = localDate9.minusDays((int) (byte) -1);
        int int19 = localDate18.getCenturyOfEra();
        org.joda.time.Chronology chronology20 = localDate18.getChronology();
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(18408222000L, chronology20);
        org.joda.time.DurationField durationField22 = chronology20.eras();
        org.joda.time.DurationField durationField23 = chronology20.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField23, and durationField22", !(durationField22.compareTo(durationField23) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField23.compareTo(durationField22))));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfWeek();
        java.lang.String str11 = mutableDateTime9.toString();
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay16.toDateTime(timeOfDay17);
        org.joda.time.DateTime dateTime20 = dateTime18.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableDuration14, (org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay24.toDateTime(timeOfDay25);
        org.joda.time.DateTime dateTime28 = dateTime26.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(readableDuration22, (org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Period period31 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period33 = period31.minusMillis(12);
        org.joda.time.Period period35 = period33.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration36 = period33.toStandardDuration();
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) (short) -1, periodType38, chronology39);
        boolean boolean42 = mutablePeriod40.equals((java.lang.Object) (-3599990L));
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay45 = null;
        org.joda.time.DateTime dateTime46 = yearMonthDay44.toDateTime(timeOfDay45);
        org.joda.time.DateTime dateTime48 = dateTime46.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime46.toMutableDateTime();
        java.lang.Object obj50 = mutableDateTime49.clone();
        org.joda.time.Chronology chronology51 = mutableDateTime49.getChronology();
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant52, readableDuration53);
        org.joda.time.MutablePeriod mutablePeriod55 = period54.toMutablePeriod();
        org.joda.time.Period period57 = period54.plusHours((int) 'a');
        org.joda.time.Minutes minutes58 = period57.toStandardMinutes();
        org.joda.time.Period period59 = period57.negated();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period63 = period59.plus((org.joda.time.ReadablePeriod) mutablePeriod62);
        org.joda.time.YearMonthDay yearMonthDay65 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay66 = null;
        org.joda.time.DateTime dateTime67 = yearMonthDay65.toDateTime(timeOfDay66);
        org.joda.time.DateTime dateTime68 = yearMonthDay65.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar69 = dateTime68.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration70 = null;
        org.joda.time.DateTime dateTime71 = dateTime68.minus(readableDuration70);
        org.joda.time.YearMonthDay yearMonthDay73 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay74 = null;
        org.joda.time.DateTime dateTime75 = yearMonthDay73.toDateTime(timeOfDay74);
        org.joda.time.DateTime dateTime77 = dateTime75.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime78 = dateTime75.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime78.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration80 = null;
        mutableDateTime78.add(readableDuration80, 100);
        mutablePeriod62.setPeriod((org.joda.time.ReadableInstant) dateTime68, (org.joda.time.ReadableInstant) mutableDateTime78);
        mutableDateTime49.setMillis((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.Duration duration85 = mutablePeriod40.toDurationTo((org.joda.time.ReadableInstant) dateTime68);
        boolean boolean86 = duration36.isLongerThan((org.joda.time.ReadableDuration) duration85);
        org.joda.time.DateTime dateTime87 = dateTime26.minus((org.joda.time.ReadableDuration) duration36);
        org.joda.time.DateTime dateTime88 = dateTime18.minus((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Instant instant90 = instant13.withDurationAdded((org.joda.time.ReadableDuration) duration36, (-292275054));
        org.joda.time.Instant instant92 = instant90.withMillis((long) ' ');
        org.joda.time.Instant instant94 = instant92.plus((long) 292278993);
        org.joda.time.DateTime dateTime95 = instant92.toDateTime();
        mutableDateTime9.setDate((org.joda.time.ReadableInstant) instant92);
        mutableDateTime9.addMillis(32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant92 and dateTime95", (instant92.compareTo(dateTime95) == 0) == instant92.equals(dateTime95));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long13 = dateTimeZone11.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekyear(2);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Instant instant18 = dateTime3.toInstant();
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay20.toDateTime(timeOfDay21);
        boolean boolean24 = dateTime22.isAfter((long) (short) 10);
        org.joda.time.DateTime.Property property25 = dateTime22.era();
        org.joda.time.DateTime dateTime26 = property25.withMaximumValue();
        boolean boolean27 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant18", (dateTime3.compareTo(instant18) == 0) == dateTime3.equals(instant18));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 1);
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfHour();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy((int) (short) 10);
        org.joda.time.DateTime dateTime13 = property10.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime14 = property10.roundHalfEvenCopy();
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        boolean boolean16 = dateTime14.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant15", (dateTime13.compareTo(instant15) == 0) == dateTime13.equals(instant15));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.minus(readableDuration5);
        org.joda.time.DateTime dateTime8 = dateTime4.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime10 = dateTime4.withMillis((long) 'a');
        int int11 = dateTime4.getYear();
        org.joda.time.DateTime.Property property12 = dateTime4.dayOfYear();
        org.joda.time.DateTime dateTime13 = property12.getDateTime();
        org.joda.time.DateTime dateTime14 = property12.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(17);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = dateTime14.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime17", (dateTime18.compareTo(mutableDateTime17) == 0) == dateTime18.equals(mutableDateTime17));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay9.toDateTime(timeOfDay10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime11.toMutableDateTime();
        mutableDateTime6.setTime((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology19 = yearMonthDay18.getChronology();
        long long23 = chronology19.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = chronology19.add(readablePeriod24, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField28 = chronology19.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(1010L, chronology19);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType33 = periodType32.withHoursRemoved();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight35 = org.joda.time.DateMidnight.now(dateTimeZone34);
        org.joda.time.Chronology chronology36 = dateMidnight35.getChronology();
        org.joda.time.Period period37 = new org.joda.time.Period((-1128294000000L), 8000L, periodType32, chronology36);
        int[] intArray40 = chronology19.get((org.joda.time.ReadablePeriod) period37, (long) 23, (long) 22);
        mutableDateTime14.setChronology(chronology19);
        org.joda.time.DateTimeField dateTimeField42 = chronology19.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime14", (dateTime3.compareTo(mutableDateTime14) == 0) == dateTime3.equals(mutableDateTime14));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.minus(readableDuration5);
        org.joda.time.DateTime dateTime8 = dateTime4.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime10 = dateTime4.withMillis((long) 'a');
        int int11 = dateTime4.getYear();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.DateTime dateTime16 = dateTime15.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long20 = dateTimeZone18.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(dateTimeZone18);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType24 = periodType23.withHoursRemoved();
        org.joda.time.PeriodType periodType25 = periodType23.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((-3599990L), periodType23);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateMidnight21, periodType23);
        boolean boolean28 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Instant instant29 = dateTime4.toInstant();
        org.joda.time.MutableDateTime mutableDateTime30 = instant29.toMutableDateTimeISO();
        int int31 = mutableDateTime30.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant29", (dateTime4.compareTo(instant29) == 0) == dateTime4.equals(instant29));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withYearOfCentury((int) (short) 1);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.yearOfEra();
        org.joda.time.DateMidnight dateMidnight11 = property10.withMinimumValue();
        org.joda.time.DateTime dateTime12 = dateMidnight11.toDateTime();
        org.joda.time.LocalDateTime localDateTime13 = dateTime12.toLocalDateTime();
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period16 = org.joda.time.Period.seconds((int) ' ');
        int int17 = period16.getMinutes();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        int int19 = period16.get(durationFieldType18);
        int int20 = periodType14.indexOf(durationFieldType18);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.seconds();
        int int23 = periodType21.indexOf(durationFieldType22);
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology26 = yearMonthDay25.getChronology();
        long long30 = chronology26.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        long long34 = chronology26.add(readablePeriod31, (long) 7, (-60634556));
        org.joda.time.DurationField durationField35 = chronology26.weekyears();
        boolean boolean36 = durationFieldType22.isSupported(chronology26);
        org.joda.time.DurationField durationField37 = chronology26.days();
        boolean boolean38 = durationFieldType18.isSupported(chronology26);
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay41 = null;
        org.joda.time.DateTime dateTime42 = yearMonthDay40.toDateTime(timeOfDay41);
        org.joda.time.DateTime dateTime43 = yearMonthDay40.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar44 = dateTime43.toGregorianCalendar();
        org.joda.time.LocalDate localDate45 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay48.toDateTime(timeOfDay49);
        org.joda.time.DateTime dateTime52 = dateTime50.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime50.toMutableDateTime();
        java.lang.Object obj54 = mutableDateTime53.clone();
        org.joda.time.Chronology chronology55 = mutableDateTime53.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.era();
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType46.getField(chronology55);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) (short) -1, periodType59, chronology60);
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) (short) -1, periodType63, chronology64);
        mutablePeriod61.add((org.joda.time.ReadablePeriod) mutablePeriod65);
        int[] intArray68 = chronology55.get((org.joda.time.ReadablePeriod) mutablePeriod65, (long) 23);
        org.joda.time.DateTimeField dateTimeField69 = chronology55.year();
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar44, chronology55);
        org.joda.time.DurationField durationField71 = durationFieldType18.getField(chronology55);
        boolean boolean72 = localDateTime13.isSupported(durationFieldType18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField35 and durationField71", (durationField35.compareTo(durationField71) == 0) == durationField35.equals(durationField71));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime6.add(readableDuration9);
        mutableDateTime6.setMillis((long) (-1));
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime6.weekOfWeekyear();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableDuration15);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        org.joda.time.Period period19 = period16.plusHours((int) 'a');
        org.joda.time.Minutes minutes20 = period19.toStandardMinutes();
        org.joda.time.Period period21 = period19.negated();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period25 = period21.plus((org.joda.time.ReadablePeriod) mutablePeriod24);
        mutableDateTime6.add((org.joda.time.ReadablePeriod) period21);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime6.millisOfSecond();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime6.era();
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology32 = yearMonthDay31.getChronology();
        long long36 = chronology32.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        long long40 = chronology32.add(readablePeriod37, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField41 = chronology32.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(1010L, chronology32);
        org.joda.time.DateTimeField dateTimeField43 = chronology32.hourOfHalfday();
        mutableDateTime6.setRounding(dateTimeField43, 0);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str47 = dateTimeZone46.getID();
        long long49 = dateTimeZone46.convertUTCToLocal((long) 9);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime6.toMutableDateTime(dateTimeZone46);
        long long52 = dateTimeZone46.convertUTCToLocal(362L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and mutableDateTime50", (mutableDateTime6.compareTo(mutableDateTime50) == 0) == mutableDateTime6.equals(mutableDateTime50));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis((long) 12);
        org.joda.time.Instant instant4 = instant1.toInstant();
        org.joda.time.Chronology chronology5 = instant1.getChronology();
        org.joda.time.Instant instant6 = instant1.toInstant();
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long11 = dateTimeZone9.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusDays((int) 'u');
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(0, 2, 22);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withYearOfCentury((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DurationField durationField31 = durationFieldType29.getField(chronology30);
        boolean boolean32 = localDateTime26.isSupported(durationFieldType29);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime26.withDayOfYear(22);
        org.joda.time.Period period36 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period38 = period36.minusMillis(12);
        org.joda.time.Period period40 = period38.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration41 = period38.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant42, readableDuration43);
        org.joda.time.MutablePeriod mutablePeriod45 = period44.toMutablePeriod();
        java.lang.Object obj46 = mutablePeriod45.clone();
        mutablePeriod45.setYears((int) ' ');
        int int49 = mutablePeriod45.getDays();
        boolean boolean50 = duration41.equals((java.lang.Object) int49);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime34.minus((org.joda.time.ReadableDuration) duration41);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight18.withDurationAdded((org.joda.time.ReadableDuration) duration41, 1970);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight12.minus((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Instant instant55 = instant6.minus((org.joda.time.ReadableDuration) duration41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime7", (instant6.compareTo(dateTime7) == 0) == instant6.equals(dateTime7));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) 22);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = yearMonthDay1.toDateMidnight(dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight5 = yearMonthDay1.toDateMidnight();
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay7.toDateTime(timeOfDay8);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay11.toDateTime(timeOfDay12);
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readableDuration15);
        org.joda.time.DateTime dateTime17 = yearMonthDay7.toDateTime((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay7.dayOfMonth();
        org.joda.time.DateTime dateTime19 = yearMonthDay7.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property20 = yearMonthDay7.year();
        org.joda.time.YearMonthDay yearMonthDay22 = property20.setCopy("30");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str24 = dateTimeZone23.getID();
        long long26 = dateTimeZone23.convertUTCToLocal((long) 9);
        org.joda.time.DateTime dateTime27 = yearMonthDay22.toDateTimeAtMidnight(dateTimeZone23);
        org.joda.time.DateTime dateTime28 = yearMonthDay1.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableDuration30);
        org.joda.time.MutablePeriod mutablePeriod32 = period31.toMutablePeriod();
        org.joda.time.Period period34 = period31.plusHours((int) 'a');
        org.joda.time.Period period35 = period34.normalizedStandard();
        org.joda.time.Period period37 = period34.withSeconds((int) (short) -1);
        org.joda.time.MutablePeriod mutablePeriod38 = period34.toMutablePeriod();
        org.joda.time.Period period40 = period34.plusMonths(120);
        int int41 = period34.getWeeks();
        org.joda.time.Period period43 = period34.plusMinutes((-7));
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay46 = null;
        org.joda.time.DateTime dateTime47 = yearMonthDay45.toDateTime(timeOfDay46);
        org.joda.time.DateTime dateTime49 = dateTime47.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime47.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime50.millisOfSecond();
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay54 = null;
        org.joda.time.DateTime dateTime55 = yearMonthDay53.toDateTime(timeOfDay54);
        org.joda.time.DateTime dateTime57 = dateTime55.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime55.toMutableDateTime();
        java.lang.Object obj59 = mutableDateTime58.clone();
        org.joda.time.Chronology chronology60 = mutableDateTime58.getChronology();
        org.joda.time.ReadableDuration readableDuration61 = null;
        mutableDateTime58.add(readableDuration61);
        mutableDateTime58.setMillis((long) (-1));
        int int65 = property51.getDifference((org.joda.time.ReadableInstant) mutableDateTime58);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime58.weekyear();
        org.joda.time.PeriodType periodType67 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType68 = org.joda.time.DurationFieldType.seconds();
        int int69 = periodType67.indexOf(durationFieldType68);
        org.joda.time.DurationFieldType durationFieldType70 = org.joda.time.DurationFieldType.millis();
        boolean boolean71 = periodType67.isSupported(durationFieldType70);
        org.joda.time.DurationFieldType durationFieldType73 = periodType67.getFieldType(0);
        mutableDateTime58.add(durationFieldType73, 59);
        org.joda.time.Period period77 = period34.withFieldAdded(durationFieldType73, 3);
        org.joda.time.YearMonthDay yearMonthDay78 = yearMonthDay1.plus((org.joda.time.ReadablePeriod) period34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime28", (dateTime9.compareTo(dateTime28) == 0) == dateTime9.equals(dateTime28));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 1);
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfHour();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy((int) (short) 10);
        org.joda.time.DateTime dateTime13 = property10.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime14 = property10.roundHalfEvenCopy();
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.joda.time.Chronology chronology16 = dateTime14.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant15", (dateTime13.compareTo(instant15) == 0) == dateTime13.equals(instant15));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate18 = property16.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate19 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate21 = localDate19.plusMonths((-2760));
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = null;
        org.joda.time.format.DateTimeParser dateTimeParser23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter22, dateTimeParser23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter24.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter24.withZone(dateTimeZone27);
        long long30 = dateTimeZone27.nextTransition(3600055L);
        org.joda.time.DateMidnight dateMidnight31 = org.joda.time.DateMidnight.now(dateTimeZone27);
        org.joda.time.DateTime dateTime32 = localDate21.toDateTimeAtMidnight(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and dateMidnight31", (dateMidnight4.compareTo(dateMidnight31) == 0) == dateMidnight4.equals(dateMidnight31));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.Interval interval2 = dateMidnight1.toInterval();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.plusYears((int) (short) 0);
        org.joda.time.DateMidnight.Property property5 = dateMidnight1.year();
        org.joda.time.DateMidnight dateMidnight6 = property5.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.plusWeeks((-60558953));
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay10.toDateTime(timeOfDay11);
        org.joda.time.DateTime dateTime13 = yearMonthDay10.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.minus(readableDuration14);
        org.joda.time.DateTime dateTime17 = dateTime13.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime19 = dateTime13.withMillis((long) 'a');
        int int20 = dateTime13.getYear();
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay23 = null;
        org.joda.time.DateTime dateTime24 = yearMonthDay22.toDateTime(timeOfDay23);
        org.joda.time.DateTime dateTime25 = dateTime24.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long29 = dateTimeZone27.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(dateTimeZone27);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType33 = periodType32.withHoursRemoved();
        org.joda.time.PeriodType periodType34 = periodType32.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((-3599990L), periodType32);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateMidnight30, periodType32);
        boolean boolean37 = dateTime13.isEqual((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Instant instant38 = dateTime13.toInstant();
        boolean boolean39 = dateMidnight8.isEqual((org.joda.time.ReadableInstant) dateTime13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant38", (dateTime13.compareTo(instant38) == 0) == dateTime13.equals(instant38));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        boolean boolean18 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime6.addYears((int) '#');
        java.lang.String str22 = mutableDateTime6.toString("2022-02-22");
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant26 = instant24.withMillis((long) 12);
        org.joda.time.MutableDateTime mutableDateTime27 = instant26.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime28 = instant26.toMutableDateTime();
        org.joda.time.DateTime dateTime29 = instant26.toDateTime();
        mutableDateTime6.setDate((org.joda.time.ReadableInstant) dateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant26 and mutableDateTime27", (instant26.compareTo(mutableDateTime27) == 0) == instant26.equals(mutableDateTime27));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis((long) 12);
        org.joda.time.Instant instant4 = instant1.toInstant();
        org.joda.time.DateTime dateTime5 = instant4.toDateTime();
        org.joda.time.Instant instant7 = instant4.withMillis(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime5", (instant7.compareTo(dateTime5) == 0) == instant7.equals(dateTime5));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.plus((long) ' ');
        org.joda.time.DateTime dateTime7 = dateTime3.plusYears(2);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours(35);
        long long11 = dateTimeZone9.previousTransition((long) 17);
        org.joda.time.DateTime dateTime12 = dateTime7.toDateTime(dateTimeZone9);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (-1), periodType18);
        org.joda.time.PeriodType periodType20 = periodType18.withMinutesRemoved();
        org.joda.time.Period period21 = new org.joda.time.Period((long) 24, 6000000L, periodType20);
        org.joda.time.PeriodType periodType22 = period21.getPeriodType();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay26.toDateTime(timeOfDay27);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime28.toMutableDateTime();
        java.lang.Object obj32 = mutableDateTime31.clone();
        org.joda.time.Chronology chronology33 = mutableDateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.era();
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now(chronology33);
        org.joda.time.DateTimeField dateTimeField36 = chronology33.era();
        org.joda.time.Period period37 = new org.joda.time.Period(67816552543992000L, periodType24, chronology33);
        org.joda.time.Period period38 = new org.joda.time.Period((-1367678822431768L), (long) 22, periodType22, chronology33);
        org.joda.time.DateTime dateTime39 = dateTime7.minus((org.joda.time.ReadablePeriod) period38);
        int int40 = period38.getMonths();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime12", (dateTime7.compareTo(dateTime12) == 0) == dateTime7.equals(dateTime12));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant3 = instant1.minus((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = instant3.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime5.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime4", (instant3.compareTo(mutableDateTime4) == 0) == instant3.equals(mutableDateTime4));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType2 = periodType1.withHoursRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((-3599990L), periodType1);
        int int5 = mutablePeriod4.getWeeks();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.millisOfSecond();
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay20.toDateTime(timeOfDay21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime22.toMutableDateTime();
        java.lang.Object obj26 = mutableDateTime25.clone();
        org.joda.time.Chronology chronology27 = mutableDateTime25.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.weekyears();
        mutableDateTime17.setChronology(chronology27);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.secondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter10.withChronology(chronology27);
        mutablePeriod4.setPeriod((-3599990L), chronology27);
        org.joda.time.DurationField durationField33 = chronology27.eras();
        org.joda.time.DateTimeField dateTimeField34 = chronology27.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField28 and durationField33", Math.signum(durationField28.compareTo(durationField33)) == -Math.signum(durationField33.compareTo(durationField28)));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis((long) 12);
        org.joda.time.Instant instant4 = instant1.toInstant();
        org.joda.time.Period period6 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period8 = period6.minusMillis(12);
        org.joda.time.Period period10 = period8.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration11 = period8.toStandardDuration();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (short) -1, periodType13, chronology14);
        boolean boolean17 = mutablePeriod15.equals((java.lang.Object) (-3599990L));
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay19.toDateTime(timeOfDay20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime21.toMutableDateTime();
        java.lang.Object obj25 = mutableDateTime24.clone();
        org.joda.time.Chronology chronology26 = mutableDateTime24.getChronology();
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableDuration28);
        org.joda.time.MutablePeriod mutablePeriod30 = period29.toMutablePeriod();
        org.joda.time.Period period32 = period29.plusHours((int) 'a');
        org.joda.time.Minutes minutes33 = period32.toStandardMinutes();
        org.joda.time.Period period34 = period32.negated();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period38 = period34.plus((org.joda.time.ReadablePeriod) mutablePeriod37);
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay41 = null;
        org.joda.time.DateTime dateTime42 = yearMonthDay40.toDateTime(timeOfDay41);
        org.joda.time.DateTime dateTime43 = yearMonthDay40.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar44 = dateTime43.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime46 = dateTime43.minus(readableDuration45);
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay48.toDateTime(timeOfDay49);
        org.joda.time.DateTime dateTime52 = dateTime50.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime50.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime53.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration55 = null;
        mutableDateTime53.add(readableDuration55, 100);
        mutablePeriod37.setPeriod((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) mutableDateTime53);
        mutableDateTime24.setMillis((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Duration duration60 = mutablePeriod15.toDurationTo((org.joda.time.ReadableInstant) dateTime43);
        boolean boolean61 = duration11.isLongerThan((org.joda.time.ReadableDuration) duration60);
        org.joda.time.Instant instant62 = instant1.minus((org.joda.time.ReadableDuration) duration11);
        org.joda.time.MutableDateTime mutableDateTime63 = instant1.toMutableDateTime();
        org.joda.time.Instant instant66 = instant1.withDurationAdded(292279025L, 532);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime63", (instant1.compareTo(mutableDateTime63) == 0) == instant1.equals(mutableDateTime63));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime6.toMutableDateTime();
        mutableDateTime6.addMinutes((int) 'x');
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.hourOfDay();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime15.toMutableDateTime();
        java.lang.Object obj19 = mutableDateTime18.clone();
        mutableDateTime18.add((long) 24);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant25 = instant23.withMillis((long) 12);
        org.joda.time.Instant instant26 = instant23.toInstant();
        org.joda.time.Chronology chronology27 = instant23.getChronology();
        mutableDateTime18.setChronology(chronology27);
        org.joda.time.DateMidnight dateMidnight29 = org.joda.time.DateMidnight.now(chronology27);
        org.joda.time.DateTime dateTime30 = mutableDateTime6.toDateTime(chronology27);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and dateTime30", (mutableDateTime6.compareTo(dateTime30) == 0) == mutableDateTime6.equals(dateTime30));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTime(timeOfDay5);
        org.joda.time.DateTime dateTime8 = dateTime6.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableDuration2, (org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableDuration10, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Period period19 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period21 = period19.minusMillis(12);
        org.joda.time.Period period23 = period21.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration24 = period21.toStandardDuration();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) (short) -1, periodType26, chronology27);
        boolean boolean30 = mutablePeriod28.equals((java.lang.Object) (-3599990L));
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay32.toDateTime(timeOfDay33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime34.toMutableDateTime();
        java.lang.Object obj38 = mutableDateTime37.clone();
        org.joda.time.Chronology chronology39 = mutableDateTime37.getChronology();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant40, readableDuration41);
        org.joda.time.MutablePeriod mutablePeriod43 = period42.toMutablePeriod();
        org.joda.time.Period period45 = period42.plusHours((int) 'a');
        org.joda.time.Minutes minutes46 = period45.toStandardMinutes();
        org.joda.time.Period period47 = period45.negated();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period51 = period47.plus((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay54 = null;
        org.joda.time.DateTime dateTime55 = yearMonthDay53.toDateTime(timeOfDay54);
        org.joda.time.DateTime dateTime56 = yearMonthDay53.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar57 = dateTime56.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.DateTime dateTime59 = dateTime56.minus(readableDuration58);
        org.joda.time.YearMonthDay yearMonthDay61 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay62 = null;
        org.joda.time.DateTime dateTime63 = yearMonthDay61.toDateTime(timeOfDay62);
        org.joda.time.DateTime dateTime65 = dateTime63.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime63.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime66.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration68 = null;
        mutableDateTime66.add(readableDuration68, 100);
        mutablePeriod50.setPeriod((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) mutableDateTime66);
        mutableDateTime37.setMillis((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration73 = mutablePeriod28.toDurationTo((org.joda.time.ReadableInstant) dateTime56);
        boolean boolean74 = duration24.isLongerThan((org.joda.time.ReadableDuration) duration73);
        org.joda.time.DateTime dateTime75 = dateTime14.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.DateTime dateTime76 = dateTime6.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Instant instant78 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration24, (-292275054));
        org.joda.time.Instant instant80 = instant78.minus((long) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime81 = instant80.toMutableDateTimeISO();
        org.joda.time.Chronology chronology82 = instant80.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant80 and mutableDateTime81", (instant80.compareTo(mutableDateTime81) == 0) == instant80.equals(mutableDateTime81));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) 'u');
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withDurationAdded((long) 100, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight4.withMillis((-292275154L));
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.yearOfEra();
        org.joda.time.DateMidnight dateMidnight13 = property12.roundCeilingCopy();
        org.joda.time.DateTime dateTime14 = dateMidnight13.toDateTime();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weeks();
        org.joda.time.DateTime dateTime18 = dateTime14.withChronology(chronology16);
        int int19 = dateTime14.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight13 and dateTime18", (dateMidnight13.compareTo(dateTime18) == 0) == dateMidnight13.equals(dateTime18));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant3 = instant1.minus((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = instant3.toMutableDateTime();
        org.joda.time.DateTime dateTime6 = instant3.toDateTimeISO();
        org.joda.time.Chronology chronology7 = instant3.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime4", (instant3.compareTo(mutableDateTime4) == 0) == instant3.equals(mutableDateTime4));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 22, dateTimeZone2);
        org.joda.time.LocalDate localDate7 = localDate5.minusDays(1970);
        int int8 = localDate7.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long12 = dateTimeZone10.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.withField(dateTimeFieldType14, (int) '4');
        org.joda.time.LocalDate localDate17 = dateMidnight16.toLocalDate();
        org.joda.time.LocalDate localDate19 = localDate17.withYearOfCentury((int) 'a');
        org.joda.time.LocalDate.Property property20 = localDate17.dayOfYear();
        org.joda.time.LocalDate localDate22 = localDate17.plusWeeks(22);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str24 = dateTimeZone23.getID();
        org.joda.time.Interval interval25 = localDate17.toInterval(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = localDate7.toDateTimeAtStartOfDay(dateTimeZone23);
        org.joda.time.format.DateTimePrinter dateTimePrinter27 = null;
        org.joda.time.format.DateTimeParser dateTimeParser28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter27, dateTimeParser28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter29.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours(23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter29.withZone(dateTimeZone32);
        long long35 = dateTimeZone32.nextTransition(3600055L);
        org.joda.time.DateMidnight dateMidnight36 = org.joda.time.DateMidnight.now(dateTimeZone32);
        org.joda.time.Interval interval37 = localDate7.toInterval(dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight13 and dateMidnight36", (dateMidnight13.compareTo(dateMidnight36) == 0) == dateMidnight13.equals(dateMidnight36));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(0L);
        java.lang.String str2 = mutableDateTime1.toString();
        boolean boolean4 = mutableDateTime1.isAfter(15000L);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.year();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.set(184);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant9.plus(readableDuration10);
        org.joda.time.MutableDateTime mutableDateTime12 = instant11.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.millisOfSecond();
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale17 = locale16.stripExtensions();
        org.joda.time.MutableDateTime mutableDateTime18 = property13.set("12", locale17);
        mutableDateTime7.setDate((org.joda.time.ReadableInstant) mutableDateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant9", (mutableDateTime7.compareTo(instant9) == 0) == mutableDateTime7.equals(instant9));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfCentury((int) 'a');
        java.lang.String str11 = localDate10.toString();
        org.joda.time.DateMidnight dateMidnight12 = localDate10.toDateMidnight();
        org.joda.time.LocalDate.Property property13 = localDate10.era();
        int int14 = property13.getMinimumValue();
        org.joda.time.LocalDate localDate15 = property13.roundHalfCeilingCopy();
        java.lang.String str16 = localDate15.toString();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long21 = dateTimeZone19.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone19);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.yearOfEra();
        java.lang.String str25 = property24.getAsText();
        org.joda.time.DateMidnight dateMidnight26 = property24.roundCeilingCopy();
        org.joda.time.DateMidnight dateMidnight27 = property24.roundCeilingCopy();
        org.joda.time.DateMidnight dateMidnight29 = property24.addToCopy((long) 1);
        org.joda.time.Instant instant30 = dateMidnight29.toInstant();
        org.joda.time.DateTime dateTime31 = localDate15.toDateTime((org.joda.time.ReadableInstant) instant30);
        org.joda.time.DateMidnight dateMidnight32 = dateTime31.toDateMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight29 and instant30", (dateMidnight29.compareTo(instant30) == 0) == dateMidnight29.equals(instant30));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis((long) 12);
        org.joda.time.Instant instant4 = instant1.toInstant();
        org.joda.time.Period period6 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period8 = period6.minusMillis(12);
        org.joda.time.Period period10 = period8.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration11 = period8.toStandardDuration();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (short) -1, periodType13, chronology14);
        boolean boolean17 = mutablePeriod15.equals((java.lang.Object) (-3599990L));
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay19.toDateTime(timeOfDay20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime21.toMutableDateTime();
        java.lang.Object obj25 = mutableDateTime24.clone();
        org.joda.time.Chronology chronology26 = mutableDateTime24.getChronology();
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableDuration28);
        org.joda.time.MutablePeriod mutablePeriod30 = period29.toMutablePeriod();
        org.joda.time.Period period32 = period29.plusHours((int) 'a');
        org.joda.time.Minutes minutes33 = period32.toStandardMinutes();
        org.joda.time.Period period34 = period32.negated();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period38 = period34.plus((org.joda.time.ReadablePeriod) mutablePeriod37);
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay41 = null;
        org.joda.time.DateTime dateTime42 = yearMonthDay40.toDateTime(timeOfDay41);
        org.joda.time.DateTime dateTime43 = yearMonthDay40.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar44 = dateTime43.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime46 = dateTime43.minus(readableDuration45);
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay48.toDateTime(timeOfDay49);
        org.joda.time.DateTime dateTime52 = dateTime50.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime50.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime53.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration55 = null;
        mutableDateTime53.add(readableDuration55, 100);
        mutablePeriod37.setPeriod((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) mutableDateTime53);
        mutableDateTime24.setMillis((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Duration duration60 = mutablePeriod15.toDurationTo((org.joda.time.ReadableInstant) dateTime43);
        boolean boolean61 = duration11.isLongerThan((org.joda.time.ReadableDuration) duration60);
        org.joda.time.Instant instant62 = instant1.minus((org.joda.time.ReadableDuration) duration11);
        org.joda.time.MutableDateTime mutableDateTime63 = instant1.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay65 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay66 = null;
        org.joda.time.DateTime dateTime67 = yearMonthDay65.toDateTime(timeOfDay66);
        org.joda.time.DateTime dateTime69 = dateTime67.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime70 = dateTime67.toMutableDateTime();
        java.lang.Object obj71 = mutableDateTime70.clone();
        org.joda.time.Chronology chronology72 = mutableDateTime70.getChronology();
        org.joda.time.DateTimeField dateTimeField73 = chronology72.dayOfWeek();
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period(readableInstant74, readableDuration75);
        org.joda.time.MutablePeriod mutablePeriod77 = period76.toMutablePeriod();
        org.joda.time.Period period79 = period76.plusHours((int) 'a');
        org.joda.time.Minutes minutes80 = period79.toStandardMinutes();
        org.joda.time.Period period81 = period79.negated();
        org.joda.time.Period period83 = period81.withYears((-1));
        int int84 = period81.getMinutes();
        org.joda.time.Period period86 = period81.plusMillis((-292275054));
        org.joda.time.Period period88 = period81.plusDays(8);
        int[] intArray90 = chronology72.get((org.joda.time.ReadablePeriod) period88, 1L);
        mutableDateTime63.setChronology(chronology72);
        org.joda.time.MutableDateTime.Property property92 = mutableDateTime63.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime93 = property92.getMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime93", (instant1.compareTo(mutableDateTime93) == 0) == instant1.equals(mutableDateTime93));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay7.minusYears((int) '4');
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) (short) -1, periodType11, chronology12);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (short) -1, periodType15, chronology16);
        mutablePeriod13.add((org.joda.time.ReadablePeriod) mutablePeriod17);
        mutablePeriod17.addMonths(0);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay7.minus((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.DateTime dateTime22 = dateTime4.withFields((org.joda.time.ReadablePartial) yearMonthDay21);
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology26 = yearMonthDay25.getChronology();
        long long30 = chronology26.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        long long34 = chronology26.add(readablePeriod31, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField35 = chronology26.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(1010L, chronology26);
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType40 = periodType39.withHoursRemoved();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight42 = org.joda.time.DateMidnight.now(dateTimeZone41);
        org.joda.time.Chronology chronology43 = dateMidnight42.getChronology();
        org.joda.time.Period period44 = new org.joda.time.Period((-1128294000000L), 8000L, periodType39, chronology43);
        int[] intArray47 = chronology26.get((org.joda.time.ReadablePeriod) period44, (long) 23, (long) 22);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime4, chronology26);
        org.joda.time.DateTimeField dateTimeField49 = chronology26.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime48", (dateTime4.compareTo(mutableDateTime48) == 0) == dateTime4.equals(mutableDateTime48));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableDuration7);
        org.joda.time.LocalTime localTime9 = localTime5.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.DateTime dateTime10 = localTime9.toDateTimeToday();
        org.joda.time.Chronology chronology11 = localTime9.getChronology();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        java.lang.String str13 = chronology11.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime12", (dateTime10.compareTo(dateTime12) == 0) == dateTime10.equals(dateTime12));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime2.copy();
        mutableDateTime3.addSeconds(2021);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime6.toMutableDateTime();
        org.joda.time.Period period10 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period12 = period10.minusMillis(12);
        org.joda.time.Period period14 = period12.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration15 = period12.toStandardDuration();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (short) -1, periodType17, chronology18);
        boolean boolean21 = mutablePeriod19.equals((java.lang.Object) (-3599990L));
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTime dateTime25 = yearMonthDay23.toDateTime(timeOfDay24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime25.toMutableDateTime();
        java.lang.Object obj29 = mutableDateTime28.clone();
        org.joda.time.Chronology chronology30 = mutableDateTime28.getChronology();
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant31, readableDuration32);
        org.joda.time.MutablePeriod mutablePeriod34 = period33.toMutablePeriod();
        org.joda.time.Period period36 = period33.plusHours((int) 'a');
        org.joda.time.Minutes minutes37 = period36.toStandardMinutes();
        org.joda.time.Period period38 = period36.negated();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period42 = period38.plus((org.joda.time.ReadablePeriod) mutablePeriod41);
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay45 = null;
        org.joda.time.DateTime dateTime46 = yearMonthDay44.toDateTime(timeOfDay45);
        org.joda.time.DateTime dateTime47 = yearMonthDay44.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar48 = dateTime47.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.DateTime dateTime50 = dateTime47.minus(readableDuration49);
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay53 = null;
        org.joda.time.DateTime dateTime54 = yearMonthDay52.toDateTime(timeOfDay53);
        org.joda.time.DateTime dateTime56 = dateTime54.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime54.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime57.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration59 = null;
        mutableDateTime57.add(readableDuration59, 100);
        mutablePeriod41.setPeriod((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableInstant) mutableDateTime57);
        mutableDateTime28.setMillis((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Duration duration64 = mutablePeriod19.toDurationTo((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean65 = duration15.isLongerThan((org.joda.time.ReadableDuration) duration64);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration64, (int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay69 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay70 = null;
        org.joda.time.DateTime dateTime71 = yearMonthDay69.toDateTime(timeOfDay70);
        org.joda.time.DateTime dateTime73 = dateTime71.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime74 = dateTime71.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField75 = null;
        mutableDateTime74.setRounding(dateTimeField75, (int) '#');
        mutableDateTime74.addMillis((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime80 = mutableDateTime74.toMutableDateTime();
        mutableDateTime80.addMinutes(86399999);
        mutableDateTime8.setMillis((org.joda.time.ReadableInstant) mutableDateTime80);
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        mutableDateTime8.setZone(dateTimeZone85);
        org.joda.time.Instant instant87 = mutableDateTime8.toInstant();
        long long88 = mutableDateTime8.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime80 and instant87", (mutableDateTime80.compareTo(instant87) == 0) == mutableDateTime80.equals(instant87));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime2.copy();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long7 = dateTimeZone5.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) 'u');
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight8.plusYears(22178485);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(0, 2, 22);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long21 = dateTimeZone19.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withYearOfCentury((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DurationField durationField29 = durationFieldType27.getField(chronology28);
        boolean boolean30 = localDateTime24.isSupported(durationFieldType27);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime24.withDayOfYear(22);
        org.joda.time.Period period34 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period36 = period34.minusMillis(12);
        org.joda.time.Period period38 = period36.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration39 = period36.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant40, readableDuration41);
        org.joda.time.MutablePeriod mutablePeriod43 = period42.toMutablePeriod();
        java.lang.Object obj44 = mutablePeriod43.clone();
        mutablePeriod43.setYears((int) ' ');
        int int47 = mutablePeriod43.getDays();
        boolean boolean48 = duration39.equals((java.lang.Object) int47);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime32.minus((org.joda.time.ReadableDuration) duration39);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight16.withDurationAdded((org.joda.time.ReadableDuration) duration39, 1970);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant52, readableDuration53);
        org.joda.time.MutablePeriod mutablePeriod55 = period54.toMutablePeriod();
        org.joda.time.Period period57 = period54.plusHours((int) 'a');
        org.joda.time.Period period59 = period54.withWeeks((int) (byte) -1);
        org.joda.time.Period period61 = period59.plusDays(0);
        org.joda.time.Duration duration62 = period61.toStandardDuration();
        int int63 = duration39.compareTo((org.joda.time.ReadableDuration) duration62);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight12.withDurationAdded((org.joda.time.ReadableDuration) duration39, 1);
        org.joda.time.DateMidnight.Property property66 = dateMidnight65.era();
        int int67 = dateMidnight65.getYearOfEra();
        mutableDateTime3.setTime((org.joda.time.ReadableInstant) dateMidnight65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) 22);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = yearMonthDay1.toDateMidnight(dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight5 = yearMonthDay1.toDateMidnight();
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay7.toDateTime(timeOfDay8);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay11.toDateTime(timeOfDay12);
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readableDuration15);
        org.joda.time.DateTime dateTime17 = yearMonthDay7.toDateTime((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay7.dayOfMonth();
        org.joda.time.DateTime dateTime19 = yearMonthDay7.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property20 = yearMonthDay7.year();
        org.joda.time.YearMonthDay yearMonthDay22 = property20.setCopy("30");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str24 = dateTimeZone23.getID();
        long long26 = dateTimeZone23.convertUTCToLocal((long) 9);
        org.joda.time.DateTime dateTime27 = yearMonthDay22.toDateTimeAtMidnight(dateTimeZone23);
        org.joda.time.DateTime dateTime28 = yearMonthDay1.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay1.plusYears(5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime28", (dateTime9.compareTo(dateTime28) == 0) == dateTime9.equals(dateTime28));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.plusMinutes(86399999);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long6 = dateTimeZone4.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime8 = timeOfDay2.toDateTimeToday(dateTimeZone4);
        org.joda.time.LocalTime localTime9 = timeOfDay2.toLocalTime();
        org.joda.time.DateTime dateTime10 = timeOfDay2.toDateTimeToday();
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(86399999);
        int int13 = dateTime12.getMonthOfYear();
        org.joda.time.Instant instant14 = dateTime12.toInstant();
        int int15 = dateTime12.getMinuteOfHour();
        org.joda.time.DateTime.Property property16 = dateTime12.millisOfSecond();
        org.joda.time.DateTime dateTime17 = property16.withMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant14", (dateTime12.compareTo(instant14) == 0) == dateTime12.equals(instant14));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        java.lang.Object obj0 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime4.toMutableDateTime();
        java.lang.Object obj8 = mutableDateTime7.clone();
        org.joda.time.Chronology chronology9 = mutableDateTime7.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.weekyears();
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now(chronology9);
        org.joda.time.DurationField durationField12 = chronology9.centuries();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj0, chronology9);
        org.joda.time.DurationField durationField14 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField10, and durationField12", !(durationField14.compareTo(durationField10) == 0) || (Math.signum(durationField14.compareTo(durationField12)) == Math.signum(durationField10.compareTo(durationField12))));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar5 = dateTime4.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.minus(readableDuration6);
        org.joda.time.DateTime dateTime9 = dateTime4.minusWeeks((int) (short) 10);
        org.joda.time.DateTime.Property property10 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime11 = property10.withMinimumValue();
        org.joda.time.Instant instant13 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant15 = instant13.minus((long) (byte) 100);
        org.joda.time.Chronology chronology16 = instant13.getChronology();
        org.joda.time.DateTime dateTime17 = instant13.toDateTimeISO();
        org.joda.time.DateTime dateTime20 = dateTime17.withDurationAdded((long) (-234534), 993);
        int int21 = property10.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime17", (instant13.compareTo(dateTime17) == 0) == instant13.equals(dateTime17));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.Partial partial1 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology2 = partial1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.months();
        org.joda.time.DurationField durationField4 = chronology2.eras();
        org.joda.time.Period period5 = new org.joda.time.Period((-60389366L), chronology2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone13);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant19 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime6.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight17 and instant19", (dateMidnight17.compareTo(instant19) == 0) == dateMidnight17.equals(instant19));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.plus((long) ' ');
        org.joda.time.DateTime dateTime7 = dateTime3.plusYears(2);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours(35);
        long long11 = dateTimeZone9.previousTransition((long) 17);
        org.joda.time.DateTime dateTime12 = dateTime7.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTime();
        org.joda.time.TimeOfDay timeOfDay14 = dateTime12.toTimeOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime12", (dateTime7.compareTo(dateTime12) == 0) == dateTime7.equals(dateTime12));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone13);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant19 = mutableDateTime6.toInstant();
        long long20 = instant19.getMillis();
        org.joda.time.DateTime dateTime21 = instant19.toDateTimeISO();
        org.joda.time.DateTime.Property property22 = dateTime21.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant19", (mutableDateTime6.compareTo(instant19) == 0) == mutableDateTime6.equals(instant19));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) 22);
        int int2 = yearMonthDay1.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay1.withFieldAdded(durationFieldType4, (int) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay6.minusDays(70);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.secondOfDay();
        java.lang.String str10 = dateTimeFieldType9.toString();
        boolean boolean11 = yearMonthDay6.isSupported(dateTimeFieldType9);
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime15.toMutableDateTime();
        java.lang.Object obj19 = mutableDateTime18.clone();
        org.joda.time.Chronology chronology20 = mutableDateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.yearOfCentury();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTimeField dateTimeField23 = chronology20.millisOfSecond();
        boolean boolean24 = dateTimeFieldType9.isSupported(chronology20);
        org.joda.time.DurationField durationField25 = chronology20.eras();
        org.joda.time.DurationField durationField26 = chronology20.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField26, and durationField25", !(durationField25.compareTo(durationField26) == 0) || (Math.signum(durationField25.compareTo(durationField25)) == Math.signum(durationField26.compareTo(durationField25))));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weekyears();
        org.joda.time.DateMidnight dateMidnight10 = org.joda.time.DateMidnight.now(chronology8);
        org.joda.time.DurationField durationField11 = chronology8.centuries();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.weekyear();
        org.joda.time.DurationField durationField13 = chronology8.halfdays();
        long long16 = durationField13.getMillis(3000, (-3599947L));
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology19 = yearMonthDay18.getChronology();
        long long23 = chronology19.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = chronology19.add(readablePeriod24, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField28 = chronology19.secondOfMinute();
        org.joda.time.DurationField durationField29 = dateTimeField28.getRangeDurationField();
        long long32 = durationField29.getDifferenceAsLong((long) (-1), (long) 82800000);
        int int35 = durationField29.getValue((long) 1969, (long) 687);
        org.joda.time.DurationFieldType durationFieldType36 = durationField29.getType();
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.seconds();
        int int39 = periodType37.indexOf(durationFieldType38);
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology42 = yearMonthDay41.getChronology();
        long long46 = chronology42.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        long long50 = chronology42.add(readablePeriod47, (long) 7, (-60634556));
        org.joda.time.DurationField durationField51 = chronology42.weekyears();
        boolean boolean52 = durationFieldType38.isSupported(chronology42);
        org.joda.time.DurationField durationField53 = chronology42.days();
        org.joda.time.DurationField durationField54 = durationFieldType36.getField(chronology42);
        java.lang.String str55 = durationField54.getName();
        int int56 = durationField13.compareTo(durationField54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField51", (durationField9.compareTo(durationField51) == 0) == durationField9.equals(durationField51));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DurationField durationField2 = durationFieldType0.getField(chronology1);
        long long5 = durationField2.subtract((-1L), (-3599990L));
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period8 = org.joda.time.Period.seconds((int) ' ');
        int int9 = period8.getMinutes();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.years();
        int int11 = period8.get(durationFieldType10);
        int int12 = periodType6.indexOf(durationFieldType10);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.hours();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.seconds();
        int int15 = periodType13.indexOf(durationFieldType14);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology18 = yearMonthDay17.getChronology();
        long long22 = chronology18.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = chronology18.add(readablePeriod23, (long) 7, (-60634556));
        org.joda.time.DurationField durationField27 = chronology18.weekyears();
        boolean boolean28 = durationFieldType14.isSupported(chronology18);
        org.joda.time.DurationField durationField29 = chronology18.days();
        boolean boolean30 = durationFieldType10.isSupported(chronology18);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay32.toDateTime(timeOfDay33);
        org.joda.time.DateTime dateTime35 = yearMonthDay32.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar36 = dateTime35.toGregorianCalendar();
        org.joda.time.LocalDate localDate37 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay41 = null;
        org.joda.time.DateTime dateTime42 = yearMonthDay40.toDateTime(timeOfDay41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime42.toMutableDateTime();
        java.lang.Object obj46 = mutableDateTime45.clone();
        org.joda.time.Chronology chronology47 = mutableDateTime45.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.era();
        org.joda.time.DateTimeField dateTimeField49 = dateTimeFieldType38.getField(chronology47);
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) (short) -1, periodType51, chronology52);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) (short) -1, periodType55, chronology56);
        mutablePeriod53.add((org.joda.time.ReadablePeriod) mutablePeriod57);
        int[] intArray60 = chronology47.get((org.joda.time.ReadablePeriod) mutablePeriod57, (long) 23);
        org.joda.time.DateTimeField dateTimeField61 = chronology47.year();
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar36, chronology47);
        org.joda.time.DurationField durationField63 = durationFieldType10.getField(chronology47);
        java.lang.String str64 = durationField63.getName();
        int int65 = durationField2.compareTo(durationField63);
        java.lang.String str66 = durationField2.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField27 and durationField63", (durationField27.compareTo(durationField63) == 0) == durationField27.equals(durationField63));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTime(timeOfDay5);
        org.joda.time.DateTime dateTime8 = dateTime6.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableDuration2, (org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableDuration10, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Period period19 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period21 = period19.minusMillis(12);
        org.joda.time.Period period23 = period21.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration24 = period21.toStandardDuration();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) (short) -1, periodType26, chronology27);
        boolean boolean30 = mutablePeriod28.equals((java.lang.Object) (-3599990L));
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay32.toDateTime(timeOfDay33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime34.toMutableDateTime();
        java.lang.Object obj38 = mutableDateTime37.clone();
        org.joda.time.Chronology chronology39 = mutableDateTime37.getChronology();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant40, readableDuration41);
        org.joda.time.MutablePeriod mutablePeriod43 = period42.toMutablePeriod();
        org.joda.time.Period period45 = period42.plusHours((int) 'a');
        org.joda.time.Minutes minutes46 = period45.toStandardMinutes();
        org.joda.time.Period period47 = period45.negated();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period51 = period47.plus((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay54 = null;
        org.joda.time.DateTime dateTime55 = yearMonthDay53.toDateTime(timeOfDay54);
        org.joda.time.DateTime dateTime56 = yearMonthDay53.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar57 = dateTime56.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.DateTime dateTime59 = dateTime56.minus(readableDuration58);
        org.joda.time.YearMonthDay yearMonthDay61 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay62 = null;
        org.joda.time.DateTime dateTime63 = yearMonthDay61.toDateTime(timeOfDay62);
        org.joda.time.DateTime dateTime65 = dateTime63.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime63.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime66.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration68 = null;
        mutableDateTime66.add(readableDuration68, 100);
        mutablePeriod50.setPeriod((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) mutableDateTime66);
        mutableDateTime37.setMillis((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration73 = mutablePeriod28.toDurationTo((org.joda.time.ReadableInstant) dateTime56);
        boolean boolean74 = duration24.isLongerThan((org.joda.time.ReadableDuration) duration73);
        org.joda.time.DateTime dateTime75 = dateTime14.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.DateTime dateTime76 = dateTime6.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Instant instant78 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration24, (-292275054));
        org.joda.time.Instant instant80 = instant78.withMillis((long) ' ');
        org.joda.time.Instant instant82 = instant80.plus((long) 292278993);
        org.joda.time.DateTime dateTime83 = instant80.toDateTime();
        org.joda.time.Instant instant85 = instant80.minus((long) 22221);
        org.joda.time.Instant instant87 = instant80.plus(2017L);
        org.joda.time.Instant instant88 = instant87.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant80 and dateTime83", (instant80.compareTo(dateTime83) == 0) == instant80.equals(dateTime83));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate18 = property16.addWrapFieldToCopy(0);
        java.lang.String str19 = property16.getName();
        org.joda.time.LocalDate localDate20 = property16.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTime dateTime25 = yearMonthDay23.toDateTime(timeOfDay24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime25.toMutableDateTime();
        java.lang.Object obj29 = mutableDateTime28.clone();
        org.joda.time.Chronology chronology30 = mutableDateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.era();
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType21.getField(chronology30);
        org.joda.time.DateTimeZone dateTimeZone33 = chronology30.getZone();
        org.joda.time.DateTime dateTime34 = localDate20.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay37 = null;
        org.joda.time.DateTime dateTime38 = yearMonthDay36.toDateTime(timeOfDay37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime38.toMutableDateTime();
        java.lang.Object obj42 = mutableDateTime41.clone();
        org.joda.time.Chronology chronology43 = mutableDateTime41.getChronology();
        org.joda.time.ReadableDuration readableDuration44 = null;
        mutableDateTime41.add(readableDuration44);
        mutableDateTime41.setMillis((long) (-1));
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime41.weekOfWeekyear();
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant49, readableDuration50);
        org.joda.time.MutablePeriod mutablePeriod52 = period51.toMutablePeriod();
        org.joda.time.Period period54 = period51.plusHours((int) 'a');
        org.joda.time.Minutes minutes55 = period54.toStandardMinutes();
        org.joda.time.Period period56 = period54.negated();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period60 = period56.plus((org.joda.time.ReadablePeriod) mutablePeriod59);
        mutableDateTime41.add((org.joda.time.ReadablePeriod) period56);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime41.millisOfSecond();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime41.era();
        org.joda.time.YearMonthDay yearMonthDay66 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology67 = yearMonthDay66.getChronology();
        long long71 = chronology67.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        long long75 = chronology67.add(readablePeriod72, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField76 = chronology67.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod(1010L, chronology67);
        org.joda.time.DateTimeField dateTimeField78 = chronology67.hourOfHalfday();
        mutableDateTime41.setRounding(dateTimeField78, 0);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str82 = dateTimeZone81.getID();
        long long84 = dateTimeZone81.convertUTCToLocal((long) 9);
        org.joda.time.MutableDateTime mutableDateTime85 = mutableDateTime41.toMutableDateTime(dateTimeZone81);
        org.joda.time.DateMidnight dateMidnight86 = localDate20.toDateMidnight(dateTimeZone81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime41 and mutableDateTime85", (mutableDateTime41.compareTo(mutableDateTime85) == 0) == mutableDateTime41.equals(mutableDateTime85));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.minuteOfHour();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.lang.String str10 = property7.getAsText(locale9);
        org.joda.time.MutableDateTime mutableDateTime11 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.copy();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours(23);
        org.joda.time.DateTime dateTime16 = mutableDateTime12.toDateTime(dateTimeZone15);
        java.lang.String str18 = dateTimeZone15.getShortName(18575113L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and dateTime16", (mutableDateTime6.compareTo(dateTime16) == 0) == mutableDateTime6.equals(dateTime16));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.withField(dateTimeFieldType6, (int) '4');
        org.joda.time.LocalDate localDate9 = dateMidnight8.toLocalDate();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableDuration11);
        org.joda.time.MutablePeriod mutablePeriod13 = period12.toMutablePeriod();
        java.lang.Object obj14 = mutablePeriod13.clone();
        org.joda.time.LocalDate localDate16 = localDate9.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod13, (int) (byte) 1);
        org.joda.time.LocalDate localDate18 = localDate9.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate20 = localDate9.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long24 = dateTimeZone22.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime26 = localDate20.toDateTimeAtStartOfDay(dateTimeZone22);
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology29 = yearMonthDay28.getChronology();
        long long33 = chronology29.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = chronology29.add(readablePeriod34, (long) 7, (-60634556));
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime26.toMutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(10L, chronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and mutableDateTime38", (dateTime26.compareTo(mutableDateTime38) == 0) == dateTime26.equals(mutableDateTime38));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate18 = property16.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate19 = property16.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight24.withField(dateTimeFieldType25, (int) '4');
        org.joda.time.LocalDate localDate28 = dateMidnight27.toLocalDate();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableDuration30);
        org.joda.time.MutablePeriod mutablePeriod32 = period31.toMutablePeriod();
        java.lang.Object obj33 = mutablePeriod32.clone();
        org.joda.time.LocalDate localDate35 = localDate28.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod32, (int) (byte) 1);
        org.joda.time.LocalDate localDate37 = localDate28.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate39 = localDate28.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long43 = dateTimeZone41.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime45 = localDate39.toDateTimeAtStartOfDay(dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(dateTimeZone41);
        org.joda.time.Interval interval47 = localDate19.toInterval(dateTimeZone41);
        java.util.Date date48 = localDate19.toDate();
        org.joda.time.YearMonthDay yearMonthDay49 = org.joda.time.YearMonthDay.fromDateFields(date48);
        org.joda.time.Partial partial50 = new org.joda.time.Partial((org.joda.time.ReadablePartial) yearMonthDay49);
        java.lang.String str51 = partial50.toStringList();
        org.joda.time.Chronology chronology52 = partial50.getChronology();
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now(chronology52);
        org.joda.time.DateTimeField dateTimeField54 = chronology52.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and mutableDateTime53", (dateTime44.compareTo(mutableDateTime53) == 0) == dateTime44.equals(mutableDateTime53));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(2629746000L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTime dateTime4 = dateTime2.plusDays(22319);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, readableDuration5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long13 = dateTimeZone11.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekyear(2);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) (short) -1, periodType19, chronology20);
        boolean boolean23 = mutablePeriod21.equals((java.lang.Object) (-3599990L));
        org.joda.time.MutablePeriod mutablePeriod24 = mutablePeriod21.toMutablePeriod();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay28.toDateTime(timeOfDay29);
        org.joda.time.DateTime dateTime32 = dateTime30.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime30.toMutableDateTime();
        java.lang.Object obj34 = mutableDateTime33.clone();
        org.joda.time.Chronology chronology35 = mutableDateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.era();
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType26.getField(chronology35);
        mutablePeriod21.add((-3600000000L), chronology35);
        org.joda.time.DateTimeField dateTimeField39 = chronology35.minuteOfHour();
        org.joda.time.Chronology chronology40 = chronology35.withUTC();
        org.joda.time.DateTime dateTime41 = dateTime3.withChronology(chronology40);
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(chronology40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime41", (dateTime3.compareTo(dateTime41) == 0) == dateTime3.equals(dateTime41));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.minus(readableDuration5);
        org.joda.time.DateTime dateTime8 = dateTime4.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime10 = dateTime4.withMillisOfSecond((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) 'u');
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight15.withDurationAdded((long) 100, (int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTime dateTime25 = yearMonthDay23.toDateTime(timeOfDay24);
        org.joda.time.DateTime dateTime27 = dateTime25.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableDuration21, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight20.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod28, (int) '4');
        int int31 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateMidnight30);
        org.joda.time.DateTime dateTime32 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str34 = dateTimeZone33.getID();
        long long36 = dateTimeZone33.convertUTCToLocal((long) 9);
        long long39 = dateTimeZone33.adjustOffset((long) 17, true);
        org.joda.time.DateTime dateTime40 = dateTime32.withZone(dateTimeZone33);
        org.joda.time.DateTime dateTime42 = dateTime32.minusSeconds(2097);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime40", (dateTime4.compareTo(dateTime40) == 0) == dateTime4.equals(dateTime40));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfCentury((int) 'a');
        java.lang.String str11 = localDate10.toString();
        org.joda.time.DateMidnight dateMidnight12 = localDate10.toDateMidnight();
        org.joda.time.LocalDate.Property property13 = localDate10.era();
        int int14 = property13.getMinimumValue();
        org.joda.time.LocalDate localDate15 = property13.roundHalfCeilingCopy();
        java.lang.String str16 = localDate15.toString();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long21 = dateTimeZone19.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone19);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.yearOfEra();
        java.lang.String str25 = property24.getAsText();
        org.joda.time.DateMidnight dateMidnight26 = property24.roundCeilingCopy();
        org.joda.time.DateMidnight dateMidnight27 = property24.roundCeilingCopy();
        org.joda.time.DateMidnight dateMidnight29 = property24.addToCopy((long) 1);
        org.joda.time.Instant instant30 = dateMidnight29.toInstant();
        org.joda.time.DateTime dateTime31 = localDate15.toDateTime((org.joda.time.ReadableInstant) instant30);
        org.joda.time.Chronology chronology32 = instant30.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight29 and instant30", (dateMidnight29.compareTo(instant30) == 0) == dateMidnight29.equals(instant30));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar5 = dateTime4.toGregorianCalendar();
        org.joda.time.DateTime dateTime7 = dateTime4.minusMinutes((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = dateTime4.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int10 = dateTime4.get(dateTimeFieldType9);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime4.getZone();
        int int12 = dateTime4.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long18 = dateTimeZone16.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(dateTimeZone16);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight19.withField(dateTimeFieldType20, (int) '4');
        org.joda.time.LocalDate localDate23 = dateMidnight22.toLocalDate();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableDuration25);
        org.joda.time.MutablePeriod mutablePeriod27 = period26.toMutablePeriod();
        java.lang.Object obj28 = mutablePeriod27.clone();
        org.joda.time.LocalDate localDate30 = localDate23.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod27, (int) (byte) 1);
        org.joda.time.LocalDate localDate32 = localDate23.minusDays((int) (byte) -1);
        int int33 = localDate32.getCenturyOfEra();
        org.joda.time.Chronology chronology34 = localDate32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) (-7), (-292275154L), chronology34);
        org.joda.time.DateTime dateTime36 = dateTime4.toDateTime(chronology34);
        org.joda.time.DateTime dateTime38 = dateTime4.withWeekyear(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime36", (dateTime4.compareTo(dateTime36) == 0) == dateTime4.equals(dateTime36));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.era();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        long long11 = mutableDateTime10.getMillis();
        org.joda.time.Instant instant12 = mutableDateTime10.toInstant();
        org.joda.time.Instant instant14 = instant12.minus((long) 22568);
        long long15 = instant14.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant12", (dateTime3.compareTo(instant12) == 0) == dateTime3.equals(instant12));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime4.toMutableDateTime();
        java.lang.Object obj8 = mutableDateTime7.clone();
        org.joda.time.Chronology chronology9 = mutableDateTime7.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.weekyears();
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.millisOfSecond();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 687, chronology9);
        org.joda.time.DurationField durationField15 = chronology9.eras();
        org.joda.time.Partial partial16 = new org.joda.time.Partial(chronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField15", Math.signum(durationField10.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField10)));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.minus(readableDuration5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMillis(728);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant12 = instant10.withMillis((long) 12);
        org.joda.time.Instant instant14 = instant10.minus((long) (-81));
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay16.toDateTime(timeOfDay17);
        boolean boolean20 = dateTime18.isAfter((long) (short) 10);
        org.joda.time.DateTime.Property property21 = dateTime18.era();
        org.joda.time.DateTime dateTime22 = property21.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property21.getFieldType();
        int int24 = instant10.get(dateTimeFieldType23);
        boolean boolean25 = dateTime8.isSupported(dateTimeFieldType23);
        java.lang.String str26 = dateTimeFieldType23.getName();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long30 = dateTimeZone28.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay(dateTimeZone33);
        org.joda.time.YearMonthDay yearMonthDay36 = yearMonthDay34.minusYears((int) '4');
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) (short) -1, periodType38, chronology39);
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) (short) -1, periodType42, chronology43);
        mutablePeriod40.add((org.joda.time.ReadablePeriod) mutablePeriod44);
        mutablePeriod44.addMonths(0);
        org.joda.time.YearMonthDay yearMonthDay48 = yearMonthDay34.minus((org.joda.time.ReadablePeriod) mutablePeriod44);
        org.joda.time.DateTime dateTime49 = dateTime31.withFields((org.joda.time.ReadablePartial) yearMonthDay48);
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology53 = yearMonthDay52.getChronology();
        long long57 = chronology53.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        long long61 = chronology53.add(readablePeriod58, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField62 = chronology53.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(1010L, chronology53);
        org.joda.time.PeriodType periodType66 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType67 = periodType66.withHoursRemoved();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight69 = org.joda.time.DateMidnight.now(dateTimeZone68);
        org.joda.time.Chronology chronology70 = dateMidnight69.getChronology();
        org.joda.time.Period period71 = new org.joda.time.Period((-1128294000000L), 8000L, periodType66, chronology70);
        int[] intArray74 = chronology53.get((org.joda.time.ReadablePeriod) period71, (long) 23, (long) 22);
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime31, chronology53);
        boolean boolean76 = dateTimeFieldType23.isSupported(chronology53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and mutableDateTime75", (dateTime31.compareTo(mutableDateTime75) == 0) == dateTime31.equals(mutableDateTime75));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (-1), periodType1);
        java.lang.String str3 = periodType1.toString();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(periodType1);
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology9 = yearMonthDay8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        mutablePeriod4.setPeriod(3155695200000L, (-60136771L), chronology9);
        org.joda.time.DurationField durationField12 = chronology9.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField12, and durationField10", !(durationField10.compareTo(durationField12) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField12.compareTo(durationField10))));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.minus(readableDuration5);
        org.joda.time.DateTime dateTime8 = dateTime4.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime10 = dateTime4.withMillis((long) 'a');
        int int11 = dateTime4.getYear();
        org.joda.time.DateTime.Property property12 = dateTime4.dayOfYear();
        org.joda.time.DateTime dateTime13 = property12.getDateTime();
        org.joda.time.DateTime dateTime14 = property12.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(17);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime(dateTimeZone16);
        org.joda.time.LocalTime localTime18 = dateTime14.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and mutableDateTime17", (dateTime14.compareTo(mutableDateTime17) == 0) == dateTime14.equals(mutableDateTime17));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone13);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant19 = mutableDateTime6.toInstant();
        long long20 = instant19.getMillis();
        org.joda.time.Chronology chronology21 = instant19.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant19", (mutableDateTime6.compareTo(instant19) == 0) == mutableDateTime6.equals(instant19));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.minus(readableDuration5);
        org.joda.time.DateTime dateTime8 = dateTime4.withSecondOfMinute(0);
        org.joda.time.DateTime.Property property9 = dateTime4.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long13 = dateTimeZone11.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(dateTimeZone11);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.withField(dateTimeFieldType15, (int) '4');
        org.joda.time.LocalDate localDate18 = dateMidnight17.toLocalDate();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableDuration20);
        org.joda.time.MutablePeriod mutablePeriod22 = period21.toMutablePeriod();
        java.lang.Object obj23 = mutablePeriod22.clone();
        org.joda.time.LocalDate localDate25 = localDate18.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod22, (int) (byte) 1);
        org.joda.time.LocalDate localDate27 = localDate18.minusDays((int) (byte) -1);
        int int28 = localDate27.getCenturyOfEra();
        org.joda.time.LocalDate localDate30 = localDate27.withCenturyOfEra((int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant31, readableDuration32);
        org.joda.time.MutablePeriod mutablePeriod34 = period33.toMutablePeriod();
        org.joda.time.Period period36 = period33.plusHours((int) 'a');
        org.joda.time.LocalDate localDate38 = localDate30.withPeriodAdded((org.joda.time.ReadablePeriod) period33, 7);
        org.joda.time.LocalDate.Property property39 = localDate38.yearOfEra();
        int int40 = localDate38.getDayOfMonth();
        org.joda.time.DateTime dateTime41 = dateTime4.withFields((org.joda.time.ReadablePartial) localDate38);
        org.joda.time.DateTime dateTime43 = dateTime41.plusMinutes(194);
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay46 = null;
        org.joda.time.DateTime dateTime47 = yearMonthDay45.toDateTime(timeOfDay46);
        org.joda.time.DateTime dateTime49 = dateTime47.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime47.toMutableDateTime();
        java.lang.Object obj51 = mutableDateTime50.clone();
        org.joda.time.Chronology chronology52 = mutableDateTime50.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = chronology52.yearOfCentury();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(chronology52);
        org.joda.time.DateTime dateTime55 = dateTime43.toDateTime(chronology52);
        org.joda.time.DateTime dateTime57 = dateTime43.plusDays(1969);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long61 = dateTimeZone59.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight(dateTimeZone59);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.minusDays((int) 'u');
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight62.withDurationAdded((long) 100, (int) (byte) -1);
        java.lang.String str68 = dateMidnight67.toString();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateMidnight67);
        java.lang.String str70 = dateMidnight67.toString();
        org.joda.time.YearMonthDay yearMonthDay72 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay73 = null;
        org.joda.time.DateTime dateTime74 = yearMonthDay72.toDateTime(timeOfDay73);
        org.joda.time.DateTime dateTime76 = dateTime74.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime77 = dateTime74.toMutableDateTime();
        java.lang.Object obj78 = mutableDateTime77.clone();
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime77.setZone(dateTimeZone80);
        org.joda.time.YearMonthDay yearMonthDay83 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay84 = null;
        org.joda.time.DateTime dateTime85 = yearMonthDay83.toDateTime(timeOfDay84);
        org.joda.time.DateTime dateTime87 = dateTime85.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime88 = dateTime85.toMutableDateTime();
        boolean boolean89 = mutableDateTime77.isAfter((org.joda.time.ReadableInstant) mutableDateTime88);
        org.joda.time.ReadableDuration readableDuration90 = null;
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime77, readableDuration90);
        java.util.Date date92 = mutableDateTime77.toDate();
        org.joda.time.DateTimeZone dateTimeZone93 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate94 = new org.joda.time.LocalDate(dateTimeZone93);
        org.joda.time.DateTime dateTime95 = org.joda.time.DateTime.now(dateTimeZone93);
        mutableDateTime77.setZoneRetainFields(dateTimeZone93);
        org.joda.time.DateMidnight dateMidnight97 = new org.joda.time.DateMidnight(dateTimeZone93);
        int int98 = dateMidnight97.getYearOfCentury();
        boolean boolean99 = dateMidnight67.isAfter((org.joda.time.ReadableInstant) dateMidnight97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime54 and dateTime95", (dateTime54.compareTo(dateTime95) == 0) == dateTime54.equals(dateTime95));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis((long) 12);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTime();
        org.joda.time.Instant instant6 = instant1.plus((long) 1970);
        org.joda.time.Instant instant8 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant10 = instant8.minus((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime11 = instant10.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime12 = instant10.toMutableDateTime();
        org.joda.time.DateTime dateTime13 = instant10.toDateTimeISO();
        org.joda.time.Instant instant15 = instant10.plus((-14362396L));
        org.joda.time.Period period17 = org.joda.time.Period.weeks(202);
        org.joda.time.Hours hours18 = period17.toStandardHours();
        org.joda.time.Period period20 = period17.minusSeconds(82822728);
        org.joda.time.Duration duration21 = period20.toStandardDuration();
        org.joda.time.Instant instant23 = instant10.withDurationAdded((org.joda.time.ReadableDuration) duration21, 802);
        org.joda.time.Instant instant24 = instant1.plus((org.joda.time.ReadableDuration) duration21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant8", (mutableDateTime4.compareTo(instant8) == 0) == mutableDateTime4.equals(instant8));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone2);
        org.joda.time.LocalDate localDate7 = dateMidnight6.toLocalDate();
        org.joda.time.DateMidnight.Property property8 = dateMidnight6.centuryOfEra();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.DateMidnight dateMidnight10 = property8.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((java.lang.Object) dateMidnight10);
        org.joda.time.Instant instant12 = dateMidnight10.toInstant();
        org.joda.time.DateMidnight.Property property13 = dateMidnight10.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight11 and instant12", (dateMidnight11.compareTo(instant12) == 0) == dateMidnight11.equals(instant12));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime6.add(readableDuration9);
        mutableDateTime6.add(1L);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime6.secondOfMinute();
        org.joda.time.Instant instant15 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant17 = instant15.minus((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime18 = instant17.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime19 = instant17.toMutableDateTime();
        org.joda.time.DateTime dateTime20 = instant17.toDateTimeISO();
        org.joda.time.Instant instant22 = instant17.plus((-14362396L));
        org.joda.time.Period period24 = org.joda.time.Period.weeks(202);
        org.joda.time.Hours hours25 = period24.toStandardHours();
        org.joda.time.Period period27 = period24.minusSeconds(82822728);
        org.joda.time.Duration duration28 = period27.toStandardDuration();
        org.joda.time.Instant instant30 = instant17.withDurationAdded((org.joda.time.ReadableDuration) duration28, 802);
        mutableDateTime6.add((org.joda.time.ReadableDuration) duration28, 85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and mutableDateTime18", (instant17.compareTo(mutableDateTime18) == 0) == instant17.equals(mutableDateTime18));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone13);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant19 = mutableDateTime6.toInstant();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusWeeks((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight24.plus(readablePeriod27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight24.withDayOfYear(10);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay32.toDateTime(timeOfDay33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime34.toMutableDateTime();
        java.lang.Object obj38 = mutableDateTime37.clone();
        org.joda.time.Chronology chronology39 = mutableDateTime37.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.weekyears();
        org.joda.time.DateMidnight dateMidnight41 = org.joda.time.DateMidnight.now(chronology39);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight24.withChronology(chronology39);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusWeeks(121);
        org.joda.time.MutableDateTime mutableDateTime45 = dateMidnight42.toMutableDateTimeISO();
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay48 = null;
        org.joda.time.DateTime dateTime49 = yearMonthDay47.toDateTime(timeOfDay48);
        org.joda.time.DateTime dateTime51 = dateTime49.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime49.toMutableDateTime();
        java.lang.Object obj53 = mutableDateTime52.clone();
        mutableDateTime52.add((long) 24);
        org.joda.time.Instant instant57 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant59 = instant57.withMillis((long) 12);
        org.joda.time.Instant instant60 = instant57.toInstant();
        org.joda.time.Chronology chronology61 = instant57.getChronology();
        mutableDateTime52.setChronology(chronology61);
        org.joda.time.DateMidnight dateMidnight63 = org.joda.time.DateMidnight.now(chronology61);
        mutableDateTime45.setChronology(chronology61);
        org.joda.time.Period period66 = org.joda.time.Period.seconds(2022);
        org.joda.time.Period period68 = period66.minusSeconds(69);
        org.joda.time.Duration duration69 = period66.toStandardDuration();
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime45, (org.joda.time.ReadableDuration) duration69, periodType70);
        org.joda.time.Instant instant72 = instant19.plus((org.joda.time.ReadableDuration) duration69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight16 and mutableDateTime45", (dateMidnight16.compareTo(mutableDateTime45) == 0) == dateMidnight16.equals(mutableDateTime45));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis(1);
        int int7 = dateTime4.getMillisOfSecond();
        org.joda.time.DateTime dateTime9 = dateTime4.plusHours(53);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone12);
        org.joda.time.DateMidnight.Property property17 = dateMidnight16.yearOfEra();
        org.joda.time.DateMidnight dateMidnight18 = property17.roundHalfEvenCopy();
        org.joda.time.YearMonthDay yearMonthDay19 = dateMidnight18.toYearMonthDay();
        org.joda.time.Chronology chronology20 = yearMonthDay19.getChronology();
        long long24 = chronology20.add((long) 'x', 8000L, 965);
        org.joda.time.DateTime dateTime25 = dateTime4.toDateTime(chronology20);
        org.joda.time.DateTime dateTime27 = dateTime25.minusHours(19);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime25", (dateTime4.compareTo(dateTime25) == 0) == dateTime4.equals(dateTime25));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTime(timeOfDay5);
        org.joda.time.DateTime dateTime8 = dateTime6.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableDuration2, (org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.plus((long) ' ');
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableDuration10, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Period period19 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period21 = period19.minusMillis(12);
        org.joda.time.Period period23 = period21.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration24 = period21.toStandardDuration();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) (short) -1, periodType26, chronology27);
        boolean boolean30 = mutablePeriod28.equals((java.lang.Object) (-3599990L));
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay32.toDateTime(timeOfDay33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime34.toMutableDateTime();
        java.lang.Object obj38 = mutableDateTime37.clone();
        org.joda.time.Chronology chronology39 = mutableDateTime37.getChronology();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant40, readableDuration41);
        org.joda.time.MutablePeriod mutablePeriod43 = period42.toMutablePeriod();
        org.joda.time.Period period45 = period42.plusHours((int) 'a');
        org.joda.time.Minutes minutes46 = period45.toStandardMinutes();
        org.joda.time.Period period47 = period45.negated();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period51 = period47.plus((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay54 = null;
        org.joda.time.DateTime dateTime55 = yearMonthDay53.toDateTime(timeOfDay54);
        org.joda.time.DateTime dateTime56 = yearMonthDay53.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar57 = dateTime56.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.DateTime dateTime59 = dateTime56.minus(readableDuration58);
        org.joda.time.YearMonthDay yearMonthDay61 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay62 = null;
        org.joda.time.DateTime dateTime63 = yearMonthDay61.toDateTime(timeOfDay62);
        org.joda.time.DateTime dateTime65 = dateTime63.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime63.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime66.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration68 = null;
        mutableDateTime66.add(readableDuration68, 100);
        mutablePeriod50.setPeriod((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) mutableDateTime66);
        mutableDateTime37.setMillis((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration73 = mutablePeriod28.toDurationTo((org.joda.time.ReadableInstant) dateTime56);
        boolean boolean74 = duration24.isLongerThan((org.joda.time.ReadableDuration) duration73);
        org.joda.time.DateTime dateTime75 = dateTime14.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.DateTime dateTime76 = dateTime6.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Instant instant78 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration24, (-292275054));
        org.joda.time.Instant instant80 = instant78.withMillis((long) ' ');
        org.joda.time.Instant instant82 = instant80.plus((long) 292278993);
        org.joda.time.DateTime dateTime83 = instant80.toDateTime();
        org.joda.time.Instant instant85 = instant80.minus((long) 22221);
        org.joda.time.Instant instant86 = instant85.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant80 and dateTime83", (instant80.compareTo(dateTime83) == 0) == instant80.equals(dateTime83));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableDuration7);
        org.joda.time.LocalTime localTime9 = localTime5.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.DateTime dateTime10 = localTime9.toDateTimeToday();
        org.joda.time.Chronology chronology11 = localTime9.getChronology();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfWeek();
        org.joda.time.DateTime dateTime14 = property13.withMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime12", (dateTime10.compareTo(dateTime12) == 0) == dateTime10.equals(dateTime12));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology2 = yearMonthDay1.getChronology();
        long long6 = chronology2.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = chronology2.add(readablePeriod7, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField11 = chronology2.secondOfMinute();
        org.joda.time.DurationField durationField12 = chronology2.minutes();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology2);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay15.toDateTime(timeOfDay16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime17.toMutableDateTime();
        java.lang.Object obj21 = mutableDateTime20.clone();
        org.joda.time.Chronology chronology22 = mutableDateTime20.getChronology();
        org.joda.time.ReadableDuration readableDuration23 = null;
        mutableDateTime20.add(readableDuration23);
        mutableDateTime20.setMillis((long) (-1));
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime20.weekOfWeekyear();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableDuration29);
        org.joda.time.MutablePeriod mutablePeriod31 = period30.toMutablePeriod();
        org.joda.time.Period period33 = period30.plusHours((int) 'a');
        org.joda.time.Minutes minutes34 = period33.toStandardMinutes();
        org.joda.time.Period period35 = period33.negated();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period39 = period35.plus((org.joda.time.ReadablePeriod) mutablePeriod38);
        mutableDateTime20.add((org.joda.time.ReadablePeriod) period35);
        org.joda.time.Period period42 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period44 = period42.minusMillis(12);
        org.joda.time.Period period46 = period44.minusMonths((int) (byte) 1);
        mutableDateTime20.add((org.joda.time.ReadablePeriod) period46);
        mutableDateTime20.addHours(2097);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime20.weekyear();
        mutableDateTime13.setMillis((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight((java.lang.Object) mutableDateTime20);
        java.lang.Object obj53 = null;
        boolean boolean54 = dateMidnight52.equals(obj53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and mutableDateTime20", (mutableDateTime13.compareTo(mutableDateTime20) == 0) == mutableDateTime13.equals(mutableDateTime20));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant3 = instant1.minus((long) (byte) 100);
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTime dateTime7 = yearMonthDay5.toDateTime(timeOfDay6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime7.toMutableDateTime();
        java.lang.Object obj11 = mutableDateTime10.clone();
        org.joda.time.Chronology chronology12 = mutableDateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay15.toDateTime(timeOfDay16);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay19.toDateTime(timeOfDay20);
        org.joda.time.DateTime dateTime22 = yearMonthDay19.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.minus(readableDuration23);
        org.joda.time.DateTime dateTime25 = yearMonthDay15.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant26, readableDuration27);
        org.joda.time.MutablePeriod mutablePeriod29 = period28.toMutablePeriod();
        org.joda.time.Period period31 = period28.plusHours((int) 'a');
        org.joda.time.Minutes minutes32 = period31.toStandardMinutes();
        org.joda.time.Period period33 = period31.negated();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(0L, (long) 100);
        org.joda.time.Period period37 = period33.plus((org.joda.time.ReadablePeriod) mutablePeriod36);
        org.joda.time.YearMonthDay yearMonthDay38 = yearMonthDay15.minus((org.joda.time.ReadablePeriod) period37);
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.util.Locale locale41 = java.util.Locale.getDefault();
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.lang.String str43 = locale41.getDisplayLanguage(locale42);
        java.lang.String str44 = locale40.getDisplayName(locale42);
        java.lang.String str45 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) yearMonthDay38, 22178485, locale42);
        int int46 = instant3.get(dateTimeField13);
        org.joda.time.MutableDateTime mutableDateTime47 = instant3.toMutableDateTimeISO();
        java.lang.String str48 = instant3.toString();
        org.joda.time.DateTime dateTime49 = instant3.toDateTime();
        org.joda.time.Chronology chronology50 = instant3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight54 = org.joda.time.DateMidnight.now(dateTimeZone53);
        org.joda.time.Chronology chronology55 = dateMidnight54.getChronology();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) (-97), (long) ' ', chronology55);
        mutablePeriod56.addDays((int) (short) 100);
        int[] intArray61 = chronology50.get((org.joda.time.ReadablePeriod) mutablePeriod56, (long) 290, (long) 662);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime47", (instant3.compareTo(mutableDateTime47) == 0) == instant3.equals(mutableDateTime47));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.LocalDate localDate15 = localDate8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod12, (int) (byte) 1);
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        org.joda.time.LocalDate localDate18 = property16.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate19 = property16.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight24.withField(dateTimeFieldType25, (int) '4');
        org.joda.time.LocalDate localDate28 = dateMidnight27.toLocalDate();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableDuration30);
        org.joda.time.MutablePeriod mutablePeriod32 = period31.toMutablePeriod();
        java.lang.Object obj33 = mutablePeriod32.clone();
        org.joda.time.LocalDate localDate35 = localDate28.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod32, (int) (byte) 1);
        org.joda.time.LocalDate localDate37 = localDate28.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate39 = localDate28.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long43 = dateTimeZone41.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime45 = localDate39.toDateTimeAtStartOfDay(dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(dateTimeZone41);
        org.joda.time.Interval interval47 = localDate19.toInterval(dateTimeZone41);
        java.util.Date date48 = localDate19.toDate();
        org.joda.time.YearMonthDay yearMonthDay49 = org.joda.time.YearMonthDay.fromDateFields(date48);
        org.joda.time.Partial partial50 = new org.joda.time.Partial((org.joda.time.ReadablePartial) yearMonthDay49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = partial50.getFormatter();
        org.joda.time.Chronology chronology52 = partial50.getChronology();
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay56 = null;
        org.joda.time.DateTime dateTime57 = yearMonthDay55.toDateTime(timeOfDay56);
        org.joda.time.DateTime dateTime59 = dateTime57.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime57.toMutableDateTime();
        java.lang.Object obj61 = mutableDateTime60.clone();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime60.setZone(dateTimeZone63);
        org.joda.time.YearMonthDay yearMonthDay66 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay67 = null;
        org.joda.time.DateTime dateTime68 = yearMonthDay66.toDateTime(timeOfDay67);
        org.joda.time.DateTime dateTime70 = dateTime68.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime68.toMutableDateTime();
        boolean boolean72 = mutableDateTime60.isAfter((org.joda.time.ReadableInstant) mutableDateTime71);
        org.joda.time.ReadableDuration readableDuration73 = null;
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime60, readableDuration73);
        java.util.Date date75 = mutableDateTime60.toDate();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate77 = new org.joda.time.LocalDate(dateTimeZone76);
        org.joda.time.DateTime dateTime78 = org.joda.time.DateTime.now(dateTimeZone76);
        mutableDateTime60.setZoneRetainFields(dateTimeZone76);
        mutableDateTime60.setYear(25778293);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(readableDuration53, (org.joda.time.ReadableInstant) mutableDateTime60);
        org.joda.time.Partial partial83 = partial50.plus((org.joda.time.ReadablePeriod) mutablePeriod82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and dateTime78", (dateTime44.compareTo(dateTime78) == 0) == dateTime44.equals(dateTime78));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long5 = dateTimeZone3.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(dateTimeZone3);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.withField(dateTimeFieldType7, (int) '4');
        org.joda.time.LocalDate localDate10 = dateMidnight9.toLocalDate();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableDuration12);
        org.joda.time.MutablePeriod mutablePeriod14 = period13.toMutablePeriod();
        java.lang.Object obj15 = mutablePeriod14.clone();
        org.joda.time.LocalDate localDate17 = localDate10.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod14, (int) (byte) 1);
        org.joda.time.LocalDate.Property property18 = localDate10.yearOfCentury();
        org.joda.time.LocalDate localDate20 = property18.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate21 = property18.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long25 = dateTimeZone23.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(dateTimeZone23);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight26.withField(dateTimeFieldType27, (int) '4');
        org.joda.time.LocalDate localDate30 = dateMidnight29.toLocalDate();
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant31, readableDuration32);
        org.joda.time.MutablePeriod mutablePeriod34 = period33.toMutablePeriod();
        java.lang.Object obj35 = mutablePeriod34.clone();
        org.joda.time.LocalDate localDate37 = localDate30.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod34, (int) (byte) 1);
        org.joda.time.LocalDate localDate39 = localDate30.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate41 = localDate30.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long45 = dateTimeZone43.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone43);
        org.joda.time.DateTime dateTime47 = localDate41.toDateTimeAtStartOfDay(dateTimeZone43);
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight(dateTimeZone43);
        org.joda.time.Interval interval49 = localDate21.toInterval(dateTimeZone43);
        java.util.Date date50 = localDate21.toDate();
        org.joda.time.YearMonthDay yearMonthDay51 = org.joda.time.YearMonthDay.fromDateFields(date50);
        org.joda.time.Partial partial52 = new org.joda.time.Partial((org.joda.time.ReadablePartial) yearMonthDay51);
        java.lang.String str53 = partial52.toStringList();
        org.joda.time.Chronology chronology54 = partial52.getChronology();
        org.joda.time.MutableDateTime mutableDateTime55 = org.joda.time.MutableDateTime.now(chronology54);
        org.joda.time.Period period56 = new org.joda.time.Period((long) 718, 0L, chronology54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime46 and mutableDateTime55", (dateTime46.compareTo(mutableDateTime55) == 0) == dateTime46.equals(mutableDateTime55));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(0L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableDuration3);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.Period period7 = period4.plusHours((int) 'a');
        org.joda.time.Period period9 = period4.withWeeks((int) (byte) -1);
        org.joda.time.Period period11 = period9.plusDays(0);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (short) -1, periodType15, chronology16);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) (short) -1, periodType19, chronology20);
        mutablePeriod17.add((org.joda.time.ReadablePeriod) mutablePeriod21);
        mutablePeriod21.addMonths(0);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableDuration28);
        org.joda.time.MutablePeriod mutablePeriod30 = period29.toMutablePeriod();
        org.joda.time.Period period32 = period29.plusHours((int) 'a');
        org.joda.time.Period period34 = period29.withWeeks((int) (byte) -1);
        java.lang.String str35 = period29.toString();
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.time();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long41 = dateTimeZone39.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusMinutes((int) (byte) 0);
        org.joda.time.Chronology chronology45 = localDateTime42.getChronology();
        org.joda.time.Period period46 = new org.joda.time.Period((java.lang.Object) str35, periodType36, chronology45);
        mutablePeriod21.setPeriod((-1L), 3600067L, chronology45);
        mutablePeriod12.add((long) 23, chronology45);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime1.toMutableDateTime(chronology45);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime1.minuteOfHour();
        java.util.Locale.Builder builder51 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder52 = builder51.clearExtensions();
        java.util.Locale.Builder builder54 = builder52.setScript("");
        java.util.Locale locale55 = builder52.build();
        java.util.Locale locale57 = java.util.Locale.forLanguageTag("en-CA");
        java.util.Locale.Builder builder58 = builder52.setLocale(locale57);
        java.lang.String str59 = property50.getAsShortText(locale57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime49", (mutableDateTime1.compareTo(mutableDateTime49) == 0) == mutableDateTime1.equals(mutableDateTime49));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) 'u');
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withDurationAdded((long) 100, (int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight4.withMillis((-292275154L));
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.yearOfEra();
        org.joda.time.DateMidnight dateMidnight13 = property12.roundCeilingCopy();
        org.joda.time.DateTime dateTime14 = dateMidnight13.toDateTime();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weeks();
        org.joda.time.DateTime dateTime18 = dateTime14.withChronology(chronology16);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long22 = dateTimeZone20.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusWeeks((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight23.plus(readablePeriod26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.withDayOfWeek(3);
        org.joda.time.LocalDate localDate30 = dateMidnight27.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.DateTime dateTime33 = localDate30.toDateTimeAtCurrentTime(dateTimeZone32);
        boolean boolean35 = dateTimeZone32.isStandardOffset((-60354783L));
        org.joda.time.DateTime dateTime36 = dateTime14.withZone(dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight13 and dateTime18", (dateMidnight13.compareTo(dateTime18) == 0) == dateMidnight13.equals(dateTime18));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTime(timeOfDay5);
        org.joda.time.DateTime dateTime8 = dateTime6.plus((long) ' ');
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay10.toDateTime(timeOfDay11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime12.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.millisOfSecond();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay18.toDateTime(timeOfDay19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime20.toMutableDateTime();
        java.lang.Object obj24 = mutableDateTime23.clone();
        org.joda.time.Chronology chronology25 = mutableDateTime23.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.weekyears();
        mutableDateTime15.setChronology(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime8.toDateTime(chronology25);
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay(35, 2, 5, chronology25);
        org.joda.time.DateTimeField dateTimeField30 = chronology25.minuteOfHour();
        org.joda.time.DurationField durationField31 = chronology25.days();
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) (short) -1, periodType42, chronology43);
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) (short) -1, periodType46, chronology47);
        mutablePeriod44.add((org.joda.time.ReadablePeriod) mutablePeriod48);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology54 = yearMonthDay53.getChronology();
        long long58 = chronology54.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        long long62 = chronology54.add(readablePeriod59, (long) 7, (-60634556));
        org.joda.time.DurationField durationField63 = chronology54.weekyears();
        mutablePeriod48.setPeriod((long) 35, (long) 9, chronology54);
        org.joda.time.PeriodType periodType65 = mutablePeriod48.getPeriodType();
        org.joda.time.Instant instant67 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant69 = instant67.withMillis((long) 12);
        org.joda.time.Instant instant70 = instant67.toInstant();
        org.joda.time.Chronology chronology71 = instant67.getChronology();
        org.joda.time.Period period80 = new org.joda.time.Period((int) (short) 1, (int) 'x', 0, 7, (int) (byte) 10, (int) (short) 100, (-60634556), 429);
        int[] intArray83 = chronology71.get((org.joda.time.ReadablePeriod) period80, (long) 19, (long) 965);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) 7, periodType65, chronology71);
        org.joda.time.Period period85 = new org.joda.time.Period(1958, (-60320530), 0, 532, 0, (-60360), 57, 756, periodType65);
        java.lang.String str86 = period85.toString();
        int[] intArray89 = chronology25.get((org.joda.time.ReadablePeriod) period85, (long) 80580028, (long) (-60389771));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField26 and durationField63", (durationField26.compareTo(durationField63) == 0) == durationField26.equals(durationField63));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime6.add(readableDuration9);
        mutableDateTime6.add(1L);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime6.secondOfMinute();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime6.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long18 = dateTimeZone16.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(dateTimeZone16);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight19.withField(dateTimeFieldType20, (int) '4');
        org.joda.time.LocalDate localDate23 = dateMidnight22.toLocalDate();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableDuration25);
        org.joda.time.MutablePeriod mutablePeriod27 = period26.toMutablePeriod();
        java.lang.Object obj28 = mutablePeriod27.clone();
        org.joda.time.LocalDate localDate30 = localDate23.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod27, (int) (byte) 1);
        org.joda.time.LocalDate.Property property31 = localDate23.yearOfCentury();
        org.joda.time.LocalDate localDate33 = property31.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate34 = property31.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate36 = localDate34.plusWeeks(23);
        org.joda.time.DateTime dateTime37 = localDate36.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime39 = dateTime37.plusHours(318);
        java.lang.String str40 = dateTime39.toString();
        org.joda.time.DateTime dateTime42 = dateTime39.minusHours(25862882);
        org.joda.time.Instant instant43 = dateTime42.toInstant();
        org.joda.time.DateTime dateTime44 = instant43.toDateTime();
        org.joda.time.Period period46 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period48 = period46.minusMillis(12);
        org.joda.time.Period period50 = period48.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration51 = period48.toStandardDuration();
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay54 = null;
        org.joda.time.DateTime dateTime55 = yearMonthDay53.toDateTime(timeOfDay54);
        org.joda.time.DateTime dateTime56 = yearMonthDay53.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar57 = dateTime56.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.DateTime dateTime59 = dateTime56.minus(readableDuration58);
        org.joda.time.PeriodType periodType60 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType61 = periodType60.withMillisRemoved();
        org.joda.time.Period period62 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration51, (org.joda.time.ReadableInstant) dateTime59, periodType60);
        org.joda.time.Duration duration63 = period62.toStandardDuration();
        org.joda.time.Period period64 = duration63.toPeriod();
        org.joda.time.Instant instant65 = instant43.plus((org.joda.time.ReadableDuration) duration63);
        mutableDateTime6.add((org.joda.time.ReadableDuration) duration63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and instant43", (dateTime42.compareTo(instant43) == 0) == dateTime42.equals(instant43));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.LocalDate localDate8 = dateMidnight7.toLocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfCentury((int) 'a');
        java.lang.String str11 = localDate10.toString();
        org.joda.time.DateMidnight dateMidnight12 = localDate10.toDateMidnight();
        org.joda.time.LocalDate.Property property13 = localDate10.era();
        int int14 = property13.getMinimumValue();
        org.joda.time.LocalDate localDate15 = property13.roundHalfCeilingCopy();
        java.lang.String str16 = localDate15.toString();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long21 = dateTimeZone19.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (short) 10, dateTimeZone19);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.yearOfEra();
        java.lang.String str25 = property24.getAsText();
        org.joda.time.DateMidnight dateMidnight26 = property24.roundCeilingCopy();
        org.joda.time.DateMidnight dateMidnight27 = property24.roundCeilingCopy();
        org.joda.time.DateMidnight dateMidnight29 = property24.addToCopy((long) 1);
        org.joda.time.Instant instant30 = dateMidnight29.toInstant();
        org.joda.time.DateTime dateTime31 = localDate15.toDateTime((org.joda.time.ReadableInstant) instant30);
        org.joda.time.LocalDate.Property property32 = localDate15.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight29 and instant30", (dateMidnight29.compareTo(instant30) == 0) == dateMidnight29.equals(instant30));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant3 = instant1.minus((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = instant3.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone7);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.withField(dateTimeFieldType11, (int) '4');
        org.joda.time.LocalDate localDate14 = dateMidnight13.toLocalDate();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableDuration16);
        org.joda.time.MutablePeriod mutablePeriod18 = period17.toMutablePeriod();
        java.lang.Object obj19 = mutablePeriod18.clone();
        org.joda.time.LocalDate localDate21 = localDate14.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod18, (int) (byte) 1);
        org.joda.time.LocalDate.Property property22 = localDate14.yearOfCentury();
        org.joda.time.LocalDate localDate24 = property22.addWrapFieldToCopy(0);
        org.joda.time.LocalDate localDate25 = property22.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate27 = localDate25.plusWeeks(23);
        org.joda.time.LocalDate localDate29 = localDate27.plusDays(202);
        int int30 = localDate29.getYearOfCentury();
        org.joda.time.LocalDate localDate32 = localDate29.plusDays((int) '#');
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long36 = dateTimeZone34.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(dateTimeZone34);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight37.withField(dateTimeFieldType38, (int) '4');
        org.joda.time.LocalDate localDate41 = dateMidnight40.toLocalDate();
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant42, readableDuration43);
        org.joda.time.MutablePeriod mutablePeriod45 = period44.toMutablePeriod();
        java.lang.Object obj46 = mutablePeriod45.clone();
        org.joda.time.LocalDate localDate48 = localDate41.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod45, (int) (byte) 1);
        org.joda.time.LocalDate localDate50 = localDate41.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate52 = localDate50.minusMonths(86399999);
        org.joda.time.LocalDate.Property property53 = localDate52.dayOfWeek();
        org.joda.time.LocalDate localDate54 = property53.withMinimumValue();
        org.joda.time.LocalDate localDate56 = localDate54.plusDays(1006);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime58 = org.joda.time.MutableDateTime.now(dateTimeZone57);
        mutableDateTime58.addMonths(0);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime58.era();
        mutableDateTime58.setMillis((long) (-234534));
        mutableDateTime58.addYears(0);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime58.hourOfDay();
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant67, readableDuration68);
        org.joda.time.MutablePeriod mutablePeriod70 = period69.toMutablePeriod();
        org.joda.time.Period period72 = period69.plusHours((int) 'a');
        org.joda.time.Period period74 = period69.withYears(67);
        org.joda.time.Period period76 = period69.withMinutes(15);
        mutableDateTime58.add((org.joda.time.ReadablePeriod) period69, 728);
        org.joda.time.Seconds seconds79 = period69.toStandardSeconds();
        org.joda.time.LocalDate localDate80 = localDate56.plus((org.joda.time.ReadablePeriod) period69);
        org.joda.time.LocalDate localDate81 = localDate32.plus((org.joda.time.ReadablePeriod) period69);
        int int82 = period69.getYears();
        org.joda.time.DateTime dateTime84 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) period69, 22441561);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime4", (instant3.compareTo(mutableDateTime4) == 0) == instant3.equals(mutableDateTime4));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay7.minusYears((int) '4');
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) (short) -1, periodType11, chronology12);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (short) -1, periodType15, chronology16);
        mutablePeriod13.add((org.joda.time.ReadablePeriod) mutablePeriod17);
        mutablePeriod17.addMonths(0);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay7.minus((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.DateTime dateTime22 = dateTime4.withFields((org.joda.time.ReadablePartial) yearMonthDay21);
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology26 = yearMonthDay25.getChronology();
        long long30 = chronology26.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        long long34 = chronology26.add(readablePeriod31, (long) 7, (-60634556));
        org.joda.time.DateTimeField dateTimeField35 = chronology26.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(1010L, chronology26);
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType40 = periodType39.withHoursRemoved();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight42 = org.joda.time.DateMidnight.now(dateTimeZone41);
        org.joda.time.Chronology chronology43 = dateMidnight42.getChronology();
        org.joda.time.Period period44 = new org.joda.time.Period((-1128294000000L), 8000L, periodType39, chronology43);
        int[] intArray47 = chronology26.get((org.joda.time.ReadablePeriod) period44, (long) 23, (long) 22);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime4, chronology26);
        org.joda.time.DateTime dateTime49 = mutableDateTime48.toDateTime();
        org.joda.time.DateTime dateTime51 = dateTime49.plusDays(82799);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime48", (dateTime4.compareTo(mutableDateTime48) == 0) == dateTime4.equals(mutableDateTime48));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType2 = periodType1.withDaysRemoved();
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.centuries();
        boolean boolean4 = periodType1.isSupported(durationFieldType3);
        org.joda.time.PeriodType periodType5 = periodType1.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = periodType1.withWeeksRemoved();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.millisOfSecond();
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay20.toDateTime(timeOfDay21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime22.toMutableDateTime();
        java.lang.Object obj26 = mutableDateTime25.clone();
        org.joda.time.Chronology chronology27 = mutableDateTime25.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.weekyears();
        mutableDateTime17.setChronology(chronology27);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.secondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter10.withChronology(chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter10.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter33.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter34.withDefaultYear(64);
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay39 = null;
        org.joda.time.DateTime dateTime40 = yearMonthDay38.toDateTime(timeOfDay39);
        org.joda.time.DateTime dateTime42 = dateTime40.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime40.toMutableDateTime();
        java.lang.Object obj44 = mutableDateTime43.clone();
        org.joda.time.Chronology chronology45 = mutableDateTime43.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.era();
        org.joda.time.DateTimeField dateTimeField47 = chronology45.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField48 = chronology45.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter34.withChronology(chronology45);
        org.joda.time.Period period50 = new org.joda.time.Period(463821175728L, periodType1, chronology45);
        org.joda.time.DurationField durationField51 = chronology45.halfdays();
        org.joda.time.DurationField durationField52 = chronology45.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField52, durationField28, and durationField51", !(durationField52.compareTo(durationField28) == 0) || (Math.signum(durationField52.compareTo(durationField51)) == Math.signum(durationField28.compareTo(durationField51))));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.joda.time.Period period3 = org.joda.time.Period.seconds((int) ' ');
        org.joda.time.Period period5 = period3.minusMillis(12);
        org.joda.time.Period period7 = period5.minusMonths((int) (byte) 1);
        org.joda.time.Duration duration8 = period5.toStandardDuration();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay10.toDateTime(timeOfDay11);
        org.joda.time.DateTime dateTime13 = yearMonthDay10.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar14 = dateTime13.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.minus(readableDuration15);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType18 = periodType17.withMillisRemoved();
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, (org.joda.time.ReadableInstant) dateTime16, periodType17);
        java.lang.String str20 = periodType17.toString();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long24 = dateTimeZone22.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(dateTimeZone22);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight25.withField(dateTimeFieldType26, (int) '4');
        org.joda.time.DateTime dateTime29 = dateMidnight28.toDateTime();
        org.joda.time.DateTime dateTime30 = dateTime29.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) (short) -1, periodType33, chronology34);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) (short) -1, periodType37, chronology38);
        mutablePeriod35.add((org.joda.time.ReadablePeriod) mutablePeriod39);
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology45 = yearMonthDay44.getChronology();
        long long49 = chronology45.add((long) (-292275054), (long) (short) -1, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        long long53 = chronology45.add(readablePeriod50, (long) 7, (-60634556));
        org.joda.time.DurationField durationField54 = chronology45.weekyears();
        mutablePeriod39.setPeriod((long) 35, (long) 9, chronology45);
        org.joda.time.PeriodType periodType56 = mutablePeriod39.getPeriodType();
        org.joda.time.Instant instant58 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant60 = instant58.withMillis((long) 12);
        org.joda.time.Instant instant61 = instant58.toInstant();
        org.joda.time.Chronology chronology62 = instant58.getChronology();
        org.joda.time.Period period71 = new org.joda.time.Period((int) (short) 1, (int) 'x', 0, 7, (int) (byte) 10, (int) (short) 100, (-60634556), 429);
        int[] intArray74 = chronology62.get((org.joda.time.ReadablePeriod) period71, (long) 19, (long) 965);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((long) 7, periodType56, chronology62);
        org.joda.time.YearMonthDay yearMonthDay76 = new org.joda.time.YearMonthDay(chronology62);
        org.joda.time.MutableDateTime mutableDateTime77 = dateTime29.toMutableDateTime(chronology62);
        org.joda.time.Period period78 = new org.joda.time.Period((long) 22527, 3720000L, periodType17, chronology62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight25 and mutableDateTime77", (dateMidnight25.compareTo(mutableDateTime77) == 0) == dateMidnight25.equals(mutableDateTime77));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.minuteOfHour();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.lang.String str10 = property7.getAsText(locale9);
        org.joda.time.MutableDateTime mutableDateTime11 = property7.roundHalfFloor();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay13.minusDays((int) (byte) 1);
        int[] intArray18 = yearMonthDay17.getValues();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long22 = dateTimeZone20.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight24 = yearMonthDay17.toDateMidnight(dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusWeeks(22175113);
        mutableDateTime11.setMillis((org.joda.time.ReadableInstant) dateMidnight26);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay32.toDateTime(timeOfDay33);
        org.joda.time.DateTime dateTime36 = dateTime34.plus((long) ' ');
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay39 = null;
        org.joda.time.DateTime dateTime40 = yearMonthDay38.toDateTime(timeOfDay39);
        org.joda.time.DateTime dateTime42 = dateTime40.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime40.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.millisOfSecond();
        org.joda.time.YearMonthDay yearMonthDay46 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay47 = null;
        org.joda.time.DateTime dateTime48 = yearMonthDay46.toDateTime(timeOfDay47);
        org.joda.time.DateTime dateTime50 = dateTime48.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime48.toMutableDateTime();
        java.lang.Object obj52 = mutableDateTime51.clone();
        org.joda.time.Chronology chronology53 = mutableDateTime51.getChronology();
        org.joda.time.DurationField durationField54 = chronology53.weekyears();
        mutableDateTime43.setChronology(chronology53);
        org.joda.time.DateTime dateTime56 = dateTime36.toDateTime(chronology53);
        org.joda.time.YearMonthDay yearMonthDay57 = new org.joda.time.YearMonthDay(35, 2, 5, chronology53);
        mutableDateTime11.setChronology(chronology53);
        org.joda.time.YearMonthDay yearMonthDay60 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay61 = null;
        org.joda.time.DateTime dateTime62 = yearMonthDay60.toDateTime(timeOfDay61);
        org.joda.time.DateTime dateTime63 = yearMonthDay60.toDateTimeAtMidnight();
        org.joda.time.YearMonthDay yearMonthDay65 = yearMonthDay60.minusDays((int) 'a');
        org.joda.time.YearMonthDay yearMonthDay67 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay68 = null;
        org.joda.time.DateTime dateTime69 = yearMonthDay67.toDateTime(timeOfDay68);
        org.joda.time.YearMonthDay yearMonthDay71 = yearMonthDay67.minusDays((int) (byte) 1);
        int[] intArray72 = yearMonthDay71.getValues();
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long76 = dateTimeZone74.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight77 = new org.joda.time.DateMidnight(dateTimeZone74);
        org.joda.time.DateMidnight dateMidnight78 = yearMonthDay71.toDateMidnight(dateTimeZone74);
        java.lang.String str79 = dateTimeZone74.getID();
        org.joda.time.DateMidnight dateMidnight80 = yearMonthDay60.toDateMidnight(dateTimeZone74);
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.forOffsetMillis(687);
        org.joda.time.Interval interval83 = yearMonthDay60.toInterval(dateTimeZone82);
        long long86 = dateTimeZone82.convertLocalToUTC((long) 36, false);
        org.joda.time.DateTime dateTime87 = mutableDateTime11.toDateTime(dateTimeZone82);
        boolean boolean88 = mutableDateTime11.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and dateTime87", (mutableDateTime11.compareTo(dateTime87) == 0) == mutableDateTime11.equals(dateTime87));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfCentury();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime15.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime21 = dateTime15.withDurationAdded(readableDuration19, (int) (short) 1);
        org.joda.time.DateTime.Property property22 = dateTime15.minuteOfHour();
        org.joda.time.DateTime dateTime24 = property22.addWrapFieldToCopy((int) (short) 10);
        int int25 = dateTime24.getEra();
        boolean boolean26 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant30 = instant28.withMillis((long) 12);
        org.joda.time.MutableDateTime mutableDateTime31 = instant30.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight36 = org.joda.time.DateMidnight.now(dateTimeZone35);
        org.joda.time.Chronology chronology37 = dateMidnight36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) (-97), (long) ' ', chronology37);
        mutableDateTime31.setChronology(chronology37);
        org.joda.time.DateTime dateTime40 = dateTime10.withChronology(chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant30 and mutableDateTime31", (instant30.compareTo(mutableDateTime31) == 0) == instant30.equals(mutableDateTime31));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears(100);
        int int4 = dateTime1.getWeekOfWeekyear();
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay7.toDateTime(timeOfDay8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime9.toMutableDateTime();
        java.lang.Object obj13 = mutableDateTime12.clone();
        org.joda.time.Chronology chronology14 = mutableDateTime12.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.weekyears();
        org.joda.time.DateMidnight dateMidnight16 = org.joda.time.DateMidnight.now(chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.millisOfSecond();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 687, chronology14);
        org.joda.time.DurationField durationField20 = chronology14.eras();
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime1.toMutableDateTime(chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField20", Math.signum(durationField15.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField15)));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType2 = periodType1.withHoursRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((-3599990L), periodType1);
        int int5 = mutablePeriod4.getWeeks();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTime(timeOfDay13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.millisOfSecond();
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay20.toDateTime(timeOfDay21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime22.toMutableDateTime();
        java.lang.Object obj26 = mutableDateTime25.clone();
        org.joda.time.Chronology chronology27 = mutableDateTime25.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.weekyears();
        mutableDateTime17.setChronology(chronology27);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.secondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter10.withChronology(chronology27);
        mutablePeriod4.setPeriod((-3599990L), chronology27);
        org.joda.time.DurationField durationField33 = chronology27.eras();
        org.joda.time.DurationField durationField34 = chronology27.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField28 and durationField34", Math.signum(durationField28.compareTo(durationField34)) == -Math.signum(durationField34.compareTo(durationField28)));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.secondOfMinute();
        org.joda.time.DurationField durationField2 = property1.getDurationField();
        org.joda.time.TimeOfDay timeOfDay4 = property1.addToCopy(22);
        java.lang.String str6 = timeOfDay4.toString("12");
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay4.minusHours((-624));
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay((long) 7);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableDuration12);
        org.joda.time.MutablePeriod mutablePeriod14 = period13.toMutablePeriod();
        org.joda.time.Period period16 = period13.plusHours((int) 'a');
        org.joda.time.Minutes minutes17 = period16.toStandardMinutes();
        org.joda.time.Period period18 = period16.negated();
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DurationField durationField21 = durationFieldType19.getField(chronology20);
        boolean boolean22 = period16.isSupported(durationFieldType19);
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay10.withFieldAdded(durationFieldType19, (-60461975));
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay8.withFieldAdded(durationFieldType19, 538);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField21", (durationField2.compareTo(durationField21) == 0) == durationField2.equals(durationField21));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(2629746000L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTime dateTime4 = dateTime2.plusDays(22319);
        org.joda.time.DateMidnight dateMidnight5 = dateTime2.toDateMidnight();
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTime dateTime7 = yearMonthDay5.toDateTime(timeOfDay6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime7.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.millisOfSecond();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime15.toMutableDateTime();
        java.lang.Object obj19 = mutableDateTime18.clone();
        org.joda.time.Chronology chronology20 = mutableDateTime18.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.weekyears();
        mutableDateTime10.setChronology(chronology20);
        org.joda.time.DateTimeField dateTimeField23 = chronology20.secondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter3.withChronology(chronology20);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeFormatter3.getZone();
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay28 = null;
        org.joda.time.DateTime dateTime29 = yearMonthDay27.toDateTime(timeOfDay28);
        org.joda.time.DateTime dateTime31 = dateTime29.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime29.toMutableDateTime();
        java.lang.Object obj33 = mutableDateTime32.clone();
        org.joda.time.Chronology chronology34 = mutableDateTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.era();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.clockhourOfHalfday();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology34);
        org.joda.time.DateTimeField dateTimeField38 = chronology34.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter3.withChronology(chronology34);
        org.joda.time.DurationField durationField40 = chronology34.minutes();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(chronology34);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DurationField durationField43 = chronology34.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField43, durationField21, and durationField40", !(durationField43.compareTo(durationField21) == 0) || (Math.signum(durationField43.compareTo(durationField40)) == Math.signum(durationField21.compareTo(durationField40))));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableDuration4);
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.Period period8 = period5.plusHours((int) 'a');
        org.joda.time.Period period10 = period5.withWeeks((int) (byte) -1);
        org.joda.time.Period period12 = period10.plusDays(0);
        org.joda.time.MutablePeriod mutablePeriod13 = period12.toMutablePeriod();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) (short) -1, periodType16, chronology17);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) (short) -1, periodType20, chronology21);
        mutablePeriod18.add((org.joda.time.ReadablePeriod) mutablePeriod22);
        mutablePeriod22.addMonths(0);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableDuration29);
        org.joda.time.MutablePeriod mutablePeriod31 = period30.toMutablePeriod();
        org.joda.time.Period period33 = period30.plusHours((int) 'a');
        org.joda.time.Period period35 = period30.withWeeks((int) (byte) -1);
        java.lang.String str36 = period30.toString();
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.time();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long42 = dateTimeZone40.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusMinutes((int) (byte) 0);
        org.joda.time.Chronology chronology46 = localDateTime43.getChronology();
        org.joda.time.Period period47 = new org.joda.time.Period((java.lang.Object) str36, periodType37, chronology46);
        mutablePeriod22.setPeriod((-1L), 3600067L, chronology46);
        mutablePeriod13.add((long) 23, chronology46);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime2.toMutableDateTime(chronology46);
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.fromMillisOfDay(13608604800000L, chronology46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime50", (mutableDateTime2.compareTo(mutableDateTime50) == 0) == mutableDateTime2.equals(mutableDateTime50));
    }
}

