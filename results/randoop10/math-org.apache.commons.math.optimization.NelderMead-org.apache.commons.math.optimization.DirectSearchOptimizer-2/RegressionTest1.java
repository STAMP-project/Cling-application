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
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime5);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.UTC;
        long long8 = localDateTime5.toEpochSecond(zoneOffset7);
        java.time.OffsetTime offsetTime9 = localTime4.atOffset(zoneOffset7);
        java.time.ZoneId zoneId10 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.now(zoneId10);
        boolean boolean13 = zonedDateTime11.equals((java.lang.Object) 10);
        java.time.LocalTime localTime14 = zonedDateTime11.toLocalTime();
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime16 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime15);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.UTC;
        long long18 = localDateTime15.toEpochSecond(zoneOffset17);
        java.time.OffsetTime offsetTime19 = localTime14.atOffset(zoneOffset17);
        java.time.OffsetTime offsetTime20 = offsetTime9.withOffsetSameInstant(zoneOffset17);
        java.time.OffsetTime offsetTime22 = offsetTime20.withHour(1);
        int int23 = offsetTime20.getHour();
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31557014135596800L) + "'", long8 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-31557014135596800L) + "'", long18 == (-31557014135596800L));
        org.junit.Assert.assertNotNull(offsetTime19);
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(20);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putFloat((float) 9L);
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer3.put(byteArray4, 349000000, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        int[] intArray5 = new int[] { (short) 100, 94000000, 627000000, 948000000, 948000000 };
        java.nio.IntBuffer intBuffer6 = java.nio.IntBuffer.wrap(intArray5);
        int[] intArray12 = new int[] { (short) 100, 94000000, 627000000, 948000000, 948000000 };
        java.nio.IntBuffer intBuffer13 = java.nio.IntBuffer.wrap(intArray12);
        java.nio.IntBuffer intBuffer14 = intBuffer6.put(intBuffer13);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 94000000, 627000000, 948000000, 948000000]");
        org.junit.Assert.assertNotNull(intBuffer6);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 94000000, 627000000, 948000000, 948000000]");
        org.junit.Assert.assertNotNull(intBuffer13);
        org.junit.Assert.assertNotNull(intBuffer14);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        double[] doubleArray2 = new double[] { (short) 0, 1L };
        java.util.stream.DoubleStream doubleStream3 = java.util.stream.DoubleStream.of(doubleArray2);
        java.util.stream.DoubleStream doubleStream4 = doubleStream3.parallel();
        double double5 = doubleStream4.sum();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream7 = doubleStream4.skip(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate((int) (short) 0);
        int int2 = charBuffer1.length();
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        java.lang.String str5 = file2.getName();
        long long6 = file2.getFreeSpace();
        boolean boolean8 = file2.setReadable(true);
        boolean boolean9 = file2.mkdirs();
        boolean boolean12 = file2.setWritable(true, true);
        boolean boolean13 = file2.exists();
        java.nio.file.Path path14 = file2.toPath();
        java.nio.file.Path path16 = path14.resolveSibling("MilliOfSecond");
        java.io.File file17 = path16.toFile();
        boolean boolean18 = file17.canRead();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(path14);
        org.junit.Assert.assertNotNull(path16);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertNull("file17.getParent() == null", file17.getParent());
        org.junit.Assert.assertEquals(file17.toString(), "MilliOfSecond");
// flaky:         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_TIME;
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.LocalTime localTime2 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime1);
        java.time.temporal.TemporalQuery<java.lang.Boolean> booleanTemporalQuery3 = java.time.format.DateTimeFormatter.parsedLeapSecond();
        java.lang.Boolean boolean4 = localDateTime1.query(booleanTemporalQuery3);
        java.text.Format format5 = dateTimeFormatter0.toFormat(booleanTemporalQuery3);
        java.time.format.ResolverStyle resolverStyle6 = java.time.format.ResolverStyle.LENIENT;
        java.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter0.withResolverStyle(resolverStyle6);
        java.time.ZoneId zoneId8 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime9 = java.time.ZonedDateTime.now(zoneId8);
        boolean boolean11 = zonedDateTime9.equals((java.lang.Object) 10);
        java.time.ZoneId zoneId12 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime13 = zonedDateTime9.withZoneSameInstant(zoneId12);
        java.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withZone(zoneId12);
        java.time.format.ResolverStyle resolverStyle15 = dateTimeFormatter14.getResolverStyle();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(booleanTemporalQuery3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertNotNull(format5);
        org.junit.Assert.assertTrue("'" + resolverStyle6 + "' != '" + java.time.format.ResolverStyle.LENIENT + "'", resolverStyle6.equals(java.time.format.ResolverStyle.LENIENT));
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + resolverStyle15 + "' != '" + java.time.format.ResolverStyle.LENIENT + "'", resolverStyle15.equals(java.time.format.ResolverStyle.LENIENT));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(zoneId0);
        boolean boolean3 = zonedDateTime1.equals((java.lang.Object) 10);
        java.time.LocalTime localTime4 = zonedDateTime1.toLocalTime();
        java.time.ZonedDateTime zonedDateTime6 = zonedDateTime1.minusMonths((long) '#');
        java.time.ZonedDateTime zonedDateTime8 = zonedDateTime1.plusDays((long) '4');
        java.time.ZonedDateTime zonedDateTime10 = zonedDateTime8.plusSeconds((long) 627000000);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime8.withNano(100);
        org.junit.Assert.assertNotNull(zoneId0);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        long long3 = file2.getTotalSpace();
        java.lang.String str4 = file2.getAbsolutePath();
        java.lang.String str5 = file2.getName();
        long long6 = file2.getFreeSpace();
        boolean boolean8 = file2.setReadable(true);
        boolean boolean9 = file2.mkdirs();
        boolean boolean12 = file2.setWritable(true, true);
        boolean boolean13 = file2.exists();
        java.nio.file.Path path14 = file2.toPath();
        java.nio.file.Path path16 = path14.resolveSibling("MilliOfSecond");
        java.io.File file17 = path16.toFile();
        java.util.Spliterator<java.nio.file.Path> pathSpliterator18 = path16.spliterator();
        java.util.Iterator<java.nio.file.Path> pathItor19 = path16.iterator();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment" + "'", str4, "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(path14);
        org.junit.Assert.assertNotNull(path16);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertNull("file17.getParent() == null", file17.getParent());
        org.junit.Assert.assertEquals(file17.toString(), "MilliOfSecond");
        org.junit.Assert.assertNotNull(pathSpliterator18);
        org.junit.Assert.assertNotNull(pathItor19);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        double[] doubleArray2 = new double[] { 987000000, (short) -1 };
        java.util.stream.DoubleStream doubleStream3 = java.util.stream.DoubleStream.of(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[9.87E8, -1.0]");
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.MICROSECONDS;
        java.nio.file.attribute.FileTime fileTime2 = java.nio.file.attribute.FileTime.from(0L, timeUnit1);
        java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.MICROSECONDS;
        java.util.concurrent.TimeUnit timeUnit5 = java.util.concurrent.TimeUnit.MICROSECONDS;
        long long7 = timeUnit5.toDays((long) (byte) 100);
        long long8 = timeUnit3.convert((long) (byte) 0, timeUnit5);
        timeUnit5.sleep((long) 213000000);
        long long11 = fileTime2.to(timeUnit5);
        long long13 = timeUnit5.toNanos((long) (byte) 100);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertNotNull(fileTime2);
        org.junit.Assert.assertNotNull(timeUnit3);
        org.junit.Assert.assertNotNull(timeUnit5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100000L + "'", long13 == 100000L);
    }
}
