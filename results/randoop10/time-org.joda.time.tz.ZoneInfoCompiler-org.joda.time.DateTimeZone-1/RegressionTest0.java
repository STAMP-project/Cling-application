import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        char char0 = java.io.File.pathSeparatorChar;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + ':' + "'", char0 == ':');
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        java.util.Locale.Category category0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = java.util.Locale.getDefault(category0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) ' ', (int) (short) 100, (int) '4', 0, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("hi!", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.io.File file1 = new java.io.File("");
        boolean boolean2 = file1.isDirectory();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = strSet0.remove((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.lang.Character");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(reader0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        java.io.File file1 = new java.io.File("");
        java.lang.String str2 = file1.getCanonicalPath();
        boolean boolean3 = file1.isAbsolute();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/experiment" + "'", str2, "/experiment");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(0, (int) 'u', (int) '#', (int) (short) 100, (int) (byte) 1, (int) ':');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        java.lang.String str0 = java.io.File.pathSeparator;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ":" + "'", str0, ":");
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) '4', (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (byte) 10, (int) ':', (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime.Property property5 = localDateTime3.property(dateTimeFieldType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler0 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.BufferedReader bufferedReader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            zoneInfoCompiler0.parseDataFile(bufferedReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime5.withMillisOfSecond(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType17 = localDateTime15.getFieldType((int) ':');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 58");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange(":", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(reader0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime5.withMillisOfSecond(10);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withFieldAdded(durationFieldType16, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withDurationAdded(readableDuration4, (int) (short) 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader1 = new java.io.BufferedReader(reader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.io.File file1 = new java.io.File("");
        java.lang.String str2 = file1.getCanonicalPath();
        boolean boolean5 = file1.setReadable(true, false);
        boolean boolean6 = file1.isAbsolute();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/experiment" + "'", str2, "/experiment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "en");
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime5.withMillisOfSecond(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withYearOfCentury((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) boolean1, chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(reader0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        boolean boolean4 = file1.isAbsolute();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("experiment", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        java.time.ZoneId zoneId2 = timeZone0.toZoneId();
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.lang.String str6 = locale5.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = timeZone0.getDisplayName(false, 99, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.lang.String str0 = java.io.File.separator;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/" + "'", str0, "/");
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.net.URI uRI0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = new java.io.File(uRI0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        int int11 = property9.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime12 = property9.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withDayOfMonth((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(10);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.io.File file1 = new java.io.File("");
        java.io.File file2 = file1.getCanonicalFile();
        java.io.File file4 = new java.io.File("");
        java.io.File file6 = new java.io.File(file4, "hi!");
        boolean boolean7 = file4.exists();
        int int8 = file1.compareTo(file4);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertNotNull(file2);
// flaky:         org.junit.Assert.assertEquals(file2.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/experiment");
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "");
        org.junit.Assert.assertEquals(file6.getParent(), "/");
        org.junit.Assert.assertEquals(file6.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        boolean boolean18 = localDateTime13.isBefore((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime17, chronology19);
        boolean boolean21 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.Chronology chronology22 = localDateTime1.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = localDateTime1.withTime((int) 'u', 100, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: /");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        java.io.File file1 = new java.io.File("");
        java.io.File file2 = file1.getCanonicalFile();
        java.lang.String str3 = file2.getName();
        java.lang.String str4 = file2.getParent();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertNotNull(file2);
// flaky:         org.junit.Assert.assertEquals(file2.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/experiment");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "experiment" + "'", str3, "experiment");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/" + "'", str4, "/");
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        int int12 = localDateTime5.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime5.withEra(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) (byte) -1, 0, (int) (byte) 100, (int) 'x', 99, (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime8.getFields();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readablePeriod10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        int int13 = localDateTime11.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType15 = localDateTime11.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 38 + "'", int13 == 38);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        int int14 = localDateTime5.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.minusWeeks((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withTime(0, 22, 2022, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime1.withDate(100, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.io.File file1 = new java.io.File("");
        java.lang.String str2 = file1.getCanonicalPath();
        boolean boolean5 = file1.setReadable(true, false);
        boolean boolean6 = file1.isHidden();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/experiment" + "'", str2, "/experiment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("experiment", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=experiment");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.io.File file1 = new java.io.File("");
        java.io.File file2 = file1.getCanonicalFile();
        long long3 = file2.lastModified();
        boolean boolean4 = file2.isDirectory();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertNotNull(file2);
// flaky:         org.junit.Assert.assertEquals(file2.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/experiment");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1644573003000L + "'", long3 == 1644573003000L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        boolean boolean4 = file1.exists();
        java.io.File file5 = file1.getParentFile();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = file5.getUsableSpace();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray1 = strSet0.toArray();
        boolean boolean3 = strSet0.add("");
        java.util.Set<java.lang.String> strSet4 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray5 = strSet4.toArray();
        boolean boolean6 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        int int9 = localDateTime8.size();
        int int10 = localDateTime8.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.minusMillis((int) 'u');
        boolean boolean13 = strSet0.equals((java.lang.Object) localDateTime8);
        java.util.Locale locale15 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.setDefault(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = localDateTime8.toString("Chinese (Taiwan)", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(objArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(objArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        boolean boolean17 = localDateTime12.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        int int18 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        boolean boolean25 = localDateTime20.isBefore((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime24, chronology26);
        boolean boolean28 = localDateTime8.isAfter((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.Chronology chronology29 = localDateTime8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(4, (int) (short) 10, 2, 2022, 10, (int) (short) 0, 0, chronology29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(chronology29);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        long long4 = file3.getUsableSpace();
        boolean boolean5 = file3.isDirectory();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 280452325376L + "'", long4 == 280452325376L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler0 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file2 = new java.io.File("");
        java.io.File file4 = new java.io.File(file2, "hi!");
        boolean boolean5 = file2.exists();
        boolean boolean6 = file2.exists();
        boolean boolean8 = file2.setReadable(true);
        java.io.File file10 = new java.io.File("");
        java.io.File file12 = new java.io.File(file10, "hi!");
        long long13 = file12.getUsableSpace();
        java.io.File[] fileArray14 = new java.io.File[] { file12 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap15 = zoneInfoCompiler0.compile(file2, fileArray14);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertEquals(file4.getParent(), "/");
        org.junit.Assert.assertEquals(file4.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "");
        org.junit.Assert.assertEquals(file12.getParent(), "/");
        org.junit.Assert.assertEquals(file12.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 280452358144L + "'", long13 == 280452358144L);
        org.junit.Assert.assertNotNull(fileArray14);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        boolean boolean19 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime18, chronology20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime18.toDateTime(readableInstant22);
        org.joda.time.DateTime dateTime24 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Instant instant25 = dateTime24.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = dateTime24.get(dateTimeFieldType26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(instant25);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        java.io.File file1 = new java.io.File("");
        boolean boolean2 = file1.canExecute();
        java.lang.String str3 = file1.toString();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 120");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDateTime1.getFieldType(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(0, (int) (byte) -1, 304, (int) 'x', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.io.File file1 = new java.io.File("");
        java.lang.String str2 = file1.getCanonicalPath();
        boolean boolean4 = file1.setExecutable(true);
        java.lang.String str5 = file1.toString();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/experiment" + "'", str2, "/experiment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.io.IOException iOException1 = new java.io.IOException("/experiment");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.String str3 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: /experiment" + "'", str3, "java.io.IOException: /experiment");
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("German", (double) 1.0f);
        java.lang.String str3 = languageRange2.getRange();
        java.util.Locale.LanguageRange languageRange6 = new java.util.Locale.LanguageRange("German", (double) 1.0f);
        java.lang.String str7 = languageRange6.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] { languageRange2, languageRange6 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Collection<java.util.Locale> localeCollection11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList12 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, localeCollection11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "german" + "'", str3, "german");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "german" + "'", str7, "german");
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromDateFields(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        timeZone0.setRawOffset(22);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeZone0.getOffset(59, (int) ' ', 3, (int) ':', 22, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6" + "'", str1, "6");
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        boolean boolean4 = file1.exists();
        boolean boolean5 = file1.mkdirs();
        boolean boolean6 = file1.isDirectory();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str1 = locale0.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("experiment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: experiment");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CN" + "'", str1, "CN");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.io.File file1 = new java.io.File("");
        boolean boolean2 = file1.canExecute();
        java.lang.String str3 = file1.getParent();
        boolean boolean5 = file1.setLastModified((long) 'a');
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.lang.String str7 = locale6.getDisplayLanguage();
        boolean boolean8 = locale6.hasExtensions();
        boolean boolean9 = file1.equals((java.lang.Object) locale6);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u5fb7\u6587" + "'", str7, "\u5fb7\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(59, (int) (byte) 10, (int) (byte) 10, 100, 2022, 4, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withFieldAdded(durationFieldType9, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime8.getFields();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readablePeriod10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.year();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withMillisOfDay(50);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField16 = localDateTime14.getField(99);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 99");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Set<java.lang.String> strSet5 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale.FilteringMode filteringMode6 = null;
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strSet5, filteringMode6);
        java.util.Set<java.lang.String> strSet8 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray9 = strSet8.toArray();
        boolean boolean11 = strSet8.add("");
        java.util.Set<java.lang.String> strSet12 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray13 = strSet12.toArray();
        boolean boolean14 = strSet8.addAll((java.util.Collection<java.lang.String>) strSet12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = strSet5.contains((java.lang.Object) strSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.TreeSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        int int12 = localDateTime5.getYear();
        int int13 = localDateTime5.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        boolean boolean24 = localDateTime19.isBefore((org.joda.time.ReadablePartial) localDateTime23);
        int int25 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        boolean boolean32 = localDateTime27.isBefore((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime31, chronology33);
        boolean boolean35 = localDateTime15.isAfter((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.Chronology chronology36 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((java.lang.Object) int13, chronology36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(chronology36);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime5, chronology7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime5.toDateTime(readableInstant9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime5.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime5.withHourOfDay(99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        java.io.File file1 = new java.io.File("");
        boolean boolean2 = file1.canExecute();
        java.lang.String str3 = file1.getParent();
        boolean boolean4 = file1.mkdir();
        java.io.File file5 = file1.getAbsoluteFile();
        boolean boolean7 = file5.setExecutable(true);
        java.lang.String str8 = file5.getParent();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(file5);
// flaky:         org.junit.Assert.assertEquals(file5.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file5.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/" + "'", str8, "/");
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("\u30c9\u30a4\u30c4\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"?????\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(reader0, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.size();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYear((int) '4');
        int int5 = localDateTime1.getYearOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 576);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 576");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        int int4 = timeZone0.getRawOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = timeZone0.getDisplayName(true, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        int int4 = timeZone0.getRawOffset();
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.setDefault(locale5);
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.lang.String str9 = locale5.getDisplayName(locale7);
        java.lang.String str10 = timeZone0.getDisplayName(locale7);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese (Taiwan)" + "'", str9, "Chinese (Taiwan)");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GMT+00:00" + "'", str10, "GMT+00:00");
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray1 = strSet0.toArray();
        boolean boolean3 = strSet0.add("");
        java.util.stream.Stream<java.lang.String> strStream4 = strSet0.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream5 = strSet0.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = strSet0.remove((java.lang.Object) 120L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.lang.Long");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(objArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "\u4e2d\u6587\u53f0\u7063)]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "\u4e2d\u6587\u53f0\u7063)]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strStream4);
        org.junit.Assert.assertNotNull(strStream5);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("German", (double) 1.0f);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        boolean boolean9 = localDateTime4.isBefore((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.yearOfCentury();
        java.lang.String str13 = property12.getName();
        org.joda.time.LocalDateTime localDateTime15 = property12.addWrapFieldToCopy((int) (short) -1);
        boolean boolean16 = languageRange2.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "yearOfCentury" + "'", str13, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        int int14 = localDateTime5.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.minusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime18 = localDateTime5.minusYears((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime5.withHourOfDay((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        boolean boolean17 = localDateTime12.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        int int18 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        boolean boolean25 = localDateTime20.isBefore((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime24, chronology26);
        boolean boolean28 = localDateTime8.isAfter((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.Chronology chronology29 = localDateTime8.getChronology();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((int) 'x', (int) (byte) 0, 100, (int) (byte) 1, 1, (int) ' ', (int) 'a', chronology29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(chronology29);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("CN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'CN' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        java.io.File file1 = new java.io.File("");
        java.lang.String str2 = file1.getCanonicalPath();
        boolean boolean5 = file1.setReadable(true, false);
        boolean boolean8 = file1.setExecutable(true, true);
        java.net.URI uRI9 = file1.toURI();
        boolean boolean10 = file1.isAbsolute();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/experiment" + "'", str2, "/experiment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        timeZone0.setRawOffset(22);
        boolean boolean4 = timeZone0.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        boolean boolean11 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime10.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean17 = dateTimeZone15.equals(obj16);
        java.lang.String str18 = dateTimeZone15.toString();
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.util.Locale locale22 = java.util.Locale.US;
        java.lang.String str23 = locale20.getDisplayScript(locale22);
        java.lang.String str24 = dateTimeZone15.getName((long) ':', locale22);
        java.lang.String str25 = locale22.getLanguage();
        int int26 = property14.getMaximumShortTextLength(locale22);
        java.lang.String str27 = timeZone0.getDisplayName(locale22);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6" + "'", str1, "6");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u5fb7\u6587" + "'", str21, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en" + "'", str25, "en");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "GMT+00:00" + "'", str27, "GMT+00:00");
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(0);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMillisOfDay(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime1.withDayOfYear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray1 = strSet0.toArray();
        boolean boolean3 = strSet0.add("");
        java.util.Set<java.lang.String> strSet4 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray5 = strSet4.toArray();
        boolean boolean7 = strSet4.add("");
        java.util.stream.Stream<java.lang.String> strStream8 = strSet4.parallelStream();
        boolean boolean9 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet4);
        java.util.Set<java.lang.String> strSet10 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray11 = strSet10.toArray();
        boolean boolean12 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        boolean boolean19 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray22 = localDateTime21.getFields();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.plus(readablePeriod23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = strSet0.remove((java.lang.Object) readablePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(objArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(objArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(objArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldArray22);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone0.hasSameRules(timeZone4);
        timeZone0.setID("German");
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = timeZone0.inDaylightTime(date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plus(readableDuration7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withYearOfEra((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withWeekyear(0);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minus(readablePeriod5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        boolean boolean13 = localDateTime8.isBefore((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localDateTime15.getFields();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.plus(readablePeriod17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusWeeks(1);
        boolean boolean21 = localDateTime2.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        boolean boolean28 = localDateTime23.isBefore((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime23.plus(readableDuration29);
        int[] intArray31 = localDateTime23.getValues();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime2.withFields((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = localDateTime23.toString(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(intArray31);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[2022, 2, 11, 35408850]");
        org.junit.Assert.assertNotNull(localDateTime32);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2022-02-11T09:50:08.850" + "'", str34, "2022-02-11T09:50:08.850");
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.size();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = property3.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = localDateTime4.getField((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.size();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYear((int) '4');
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withDayOfYear((int) 'u');
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, (int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime6.withFieldAdded(durationFieldType10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        boolean boolean19 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime18, chronology20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime18.toDateTime(readableInstant22);
        org.joda.time.DateTime dateTime24 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime24.getZone();
        java.lang.String str27 = dateTimeZone25.getName((long) '#');
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        int int30 = localDateTime29.size();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.yearOfCentury();
        boolean boolean32 = dateTimeZone25.isLocalDateTimeGap(localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        boolean boolean43 = localDateTime38.isBefore((org.joda.time.ReadablePartial) localDateTime42);
        int int44 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        int int45 = localDateTime38.getYear();
        int int46 = localDateTime38.getYearOfEra();
        boolean boolean47 = dateTimeZone25.isLocalDateTimeGap(localDateTime38);
        int int49 = dateTimeZone25.getOffsetFromLocal(280452325376L);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(dateTimeZone54);
        boolean boolean56 = localDateTime51.isBefore((org.joda.time.ReadablePartial) localDateTime55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray59 = localDateTime58.getFields();
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.plus(readablePeriod60);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.millisOfSecond();
        int int63 = localDateTime61.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime61.minusSeconds((int) 'x');
        boolean boolean66 = dateTimeZone25.isLocalDateTimeGap(localDateTime65);
        java.util.TimeZone timeZone67 = dateTimeZone25.toTimeZone();
        java.lang.String str68 = timeZone67.getDisplayName();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2022 + "'", int45 == 2022);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2022 + "'", int46 == 2022);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(dateTimeFieldArray59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(property62);
// flaky:         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 22 + "'", int63 == 22);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(timeZone67);
        org.junit.Assert.assertEquals(timeZone67.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\u5354\u8abf\u4e16\u754c\u6642\u9593" + "'", str68, "\u5354\u8abf\u4e16\u754c\u6642\u9593");
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        java.io.File file1 = new java.io.File("");
        long long2 = file1.getFreeSpace();
        boolean boolean5 = file1.setWritable(true, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = file1.createNewFile();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler0 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file2 = new java.io.File("");
        java.io.File file4 = new java.io.File(file2, "hi!");
        boolean boolean5 = file2.exists();
        boolean boolean6 = file2.exists();
        boolean boolean8 = file2.setReadable(true);
        java.io.File file10 = new java.io.File("");
        java.lang.String str11 = file10.getCanonicalPath();
        boolean boolean13 = file10.setExecutable(true);
        java.io.File file15 = new java.io.File("");
        java.io.File file17 = new java.io.File(file15, "hi!");
        java.io.File file18 = file17.getParentFile();
        java.io.File file20 = new java.io.File("");
        java.io.File file22 = new java.io.File(file20, "hi!");
        long long23 = file22.getUsableSpace();
        boolean boolean24 = file22.mkdir();
        boolean boolean25 = file22.delete();
        java.io.File file27 = new java.io.File("");
        java.io.File file29 = new java.io.File(file27, "hi!");
        java.io.File file31 = new java.io.File("");
        java.lang.String str32 = file31.getCanonicalPath();
        boolean boolean35 = file31.setReadable(true, false);
        boolean boolean36 = file31.mkdir();
        java.io.File[] fileArray37 = new java.io.File[] { file10, file17, file22, file27, file31 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap38 = zoneInfoCompiler0.compile(file2, fileArray37);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertEquals(file4.getParent(), "/");
        org.junit.Assert.assertEquals(file4.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/experiment" + "'", str11, "/experiment");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull("file15.getParent() == null", file15.getParent());
        org.junit.Assert.assertEquals(file15.toString(), "");
        org.junit.Assert.assertEquals(file17.getParent(), "/");
        org.junit.Assert.assertEquals(file17.toString(), "/hi!");
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertNull("file18.getParent() == null", file18.getParent());
        org.junit.Assert.assertEquals(file18.toString(), "/");
        org.junit.Assert.assertNull("file20.getParent() == null", file20.getParent());
        org.junit.Assert.assertEquals(file20.toString(), "");
        org.junit.Assert.assertEquals(file22.getParent(), "/");
        org.junit.Assert.assertEquals(file22.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull("file27.getParent() == null", file27.getParent());
        org.junit.Assert.assertEquals(file27.toString(), "");
        org.junit.Assert.assertEquals(file29.getParent(), "/");
        org.junit.Assert.assertEquals(file29.toString(), "/hi!");
        org.junit.Assert.assertNull("file31.getParent() == null", file31.getParent());
        org.junit.Assert.assertEquals(file31.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "/experiment" + "'", str32, "/experiment");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(fileArray37);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray1 = strSet0.toArray();
        boolean boolean3 = strSet0.add("");
        java.util.Set<java.lang.String> strSet4 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray5 = strSet4.toArray();
        boolean boolean7 = strSet4.add("");
        java.util.stream.Stream<java.lang.String> strStream8 = strSet4.parallelStream();
        boolean boolean9 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet4);
        java.util.Set<java.lang.String> strSet10 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray11 = strSet10.toArray();
        boolean boolean12 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet13 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray14 = strSet13.toArray();
        boolean boolean16 = strSet13.add("");
        boolean boolean17 = strSet10.containsAll((java.util.Collection<java.lang.String>) strSet13);
        java.util.Spliterator<java.lang.String> strSpliterator18 = strSet10.spliterator();
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(objArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(objArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(objArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(objArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.size();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((java.lang.Object) property4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        long long4 = file3.getUsableSpace();
        java.io.File file5 = file3.getAbsoluteFile();
        boolean boolean6 = file3.isHidden();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "/");
        org.junit.Assert.assertEquals(file5.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        int int11 = property9.getMaximumValueOverall();
        java.lang.String str12 = property9.getName();
        org.joda.time.LocalDateTime localDateTime14 = property9.addToCopy(99);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withSecondOfMinute(304);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 304 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "yearOfCentury" + "'", str12, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.size();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.plusSeconds((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withWeekOfWeekyear(655);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 655 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.io.IOException iOException2 = new java.io.IOException("/experiment");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("german", (java.lang.Throwable) iOException3);
        java.lang.String str5 = iOException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: german" + "'", str5, "java.io.IOException: german");
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray1 = strSet0.toArray();
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        boolean boolean4 = strSet0.removeAll((java.util.Collection<java.lang.String>) strSet3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        int int7 = localDateTime6.size();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = property8.getLocalDateTime();
        long long10 = property8.remainder();
        org.joda.time.LocalDateTime localDateTime11 = property8.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime12 = property8.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = strSet0.contains((java.lang.Object) localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to org.joda.time.ReadablePartial");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(objArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3577809445L + "'", long10 == 3577809445L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        boolean boolean0 = org.joda.time.tz.ZoneInfoCompiler.verbose();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        long long4 = file3.getUsableSpace();
        boolean boolean7 = file3.setWritable(false, false);
        java.net.URI uRI8 = file3.toURI();
        boolean boolean10 = file3.setWritable(true);
        boolean boolean11 = file3.isDirectory();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        boolean boolean11 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime10);
        int int12 = localDateTime2.compareTo((org.joda.time.ReadablePartial) localDateTime6);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        boolean boolean19 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime18, chronology20);
        boolean boolean22 = localDateTime2.isAfter((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.Chronology chronology23 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(10L, chronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withEra((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese (taiwan)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file2 = java.io.File.createTempFile("22", "\u53f0\u7063");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Prefix string too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray1 = strSet0.toArray();
        boolean boolean3 = strSet0.add("");
        java.util.Set<java.lang.String> strSet4 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray5 = strSet4.toArray();
        boolean boolean7 = strSet4.add("");
        java.util.stream.Stream<java.lang.String> strStream8 = strSet4.parallelStream();
        boolean boolean9 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet4);
        java.util.Spliterator<java.lang.String> strSpliterator10 = strSet4.spliterator();
        java.util.Set<java.lang.String> strSet11 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray12 = strSet11.toArray();
        boolean boolean14 = strSet11.add("");
        java.util.stream.Stream<java.lang.String> strStream15 = strSet11.parallelStream();
        boolean boolean16 = strSet4.removeAll((java.util.Collection<java.lang.String>) strSet11);
        java.lang.String[] strArray18 = new java.lang.String[] { "/experiment" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        boolean boolean22 = strSet19.contains((java.lang.Object) (-1));
        java.util.Set<java.lang.String> strSet23 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray24 = strSet23.toArray();
        boolean boolean26 = strSet23.add("");
        boolean boolean27 = strSet19.retainAll((java.util.Collection<java.lang.String>) strSet23);
        boolean boolean28 = strSet11.removeAll((java.util.Collection<java.lang.String>) strSet23);
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(objArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(objArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(objArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.size();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYear((int) '4');
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withDayOfYear((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = localDateTime4.toDate();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -629 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        boolean boolean4 = file1.exists();
        boolean boolean5 = file1.exists();
        boolean boolean6 = file1.isHidden();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        boolean boolean5 = file3.setReadable(true);
        boolean boolean6 = file3.isHidden();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 304);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 304");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        long long4 = file3.getUsableSpace();
        boolean boolean7 = file3.setWritable(false, false);
        java.net.URI uRI8 = file3.toURI();
        boolean boolean10 = file3.setWritable(true);
        boolean boolean11 = file3.isAbsolute();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        int int4 = timeZone0.getRawOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId5 = timeZone0.toZoneId();
// flaky:             org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: 6");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        java.io.File file3 = new java.io.File("");
        java.io.File file5 = new java.io.File(file3, "hi!");
        long long6 = file5.getUsableSpace();
        boolean boolean7 = file5.mkdir();
        boolean boolean8 = file5.delete();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file9 = java.io.File.createTempFile("\u97d3\u6587", "en", file5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Prefix string too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "");
        org.junit.Assert.assertEquals(file5.getParent(), "/");
        org.junit.Assert.assertEquals(file5.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file2 = java.io.File.createTempFile("UTC", "java.io.IOException: /experiment");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unable to create temporary file, /tmp/UTC2997888554247470172java.io.IOException: /experiment");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("German", (double) 1.0f);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        boolean boolean9 = localDateTime4.isBefore((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.yearOfCentury();
        java.lang.String str13 = property12.getName();
        org.joda.time.LocalDateTime localDateTime15 = property12.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DurationField durationField16 = property12.getRangeDurationField();
        boolean boolean17 = languageRange2.equals((java.lang.Object) durationField16);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "yearOfCentury" + "'", str13, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.io.File file1 = new java.io.File("");
        boolean boolean2 = file1.canExecute();
        java.lang.String str3 = file1.getParent();
        boolean boolean4 = file1.mkdir();
        java.io.File file5 = file1.getAbsoluteFile();
        boolean boolean7 = file5.setExecutable(true);
        java.lang.String str8 = file5.toString();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(file5);
// flaky:         org.junit.Assert.assertEquals(file5.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file5.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/experiment" + "'", str8, "/experiment");
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.size();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYear((int) '4');
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withDayOfYear((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withHourOfDay(650);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 650 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        java.io.File file1 = new java.io.File("");
        java.lang.String str2 = file1.getCanonicalPath();
        boolean boolean5 = file1.setReadable(true, false);
        java.io.File file6 = file1.getParentFile();
        boolean boolean7 = file1.isDirectory();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/experiment" + "'", str2, "/experiment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        boolean boolean18 = localDateTime13.isBefore((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime17, chronology19);
        boolean boolean21 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.DateTime dateTime22 = localDateTime1.toDateTime();
        java.lang.Class<?> wildcardClass23 = localDateTime1.getClass();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Property[monthOfYear]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=property[monthofyear]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = dateTimeZone0.equals(obj1);
        java.lang.String str3 = dateTimeZone0.toString();
        java.lang.String str5 = dateTimeZone0.getShortName(1L);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        timeZone6.setID("\u53f0\u7063");
        int int9 = timeZone6.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.io.File file2 = new java.io.File("hi!", "hi!");
        boolean boolean3 = file2.mkdirs();
        boolean boolean4 = file2.isFile();
        org.junit.Assert.assertEquals(file2.getParent(), "hi!");
        org.junit.Assert.assertEquals(file2.toString(), "hi!/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        long long4 = file3.getUsableSpace();
        boolean boolean7 = file3.setWritable(false, false);
        java.net.URI uRI8 = file3.toURI();
        java.lang.String str9 = file3.getParent();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 280451203072L + "'", long4 == 280451203072L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DurationField durationField13 = property9.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime14 = property9.withMaximumValue();
        org.joda.time.DurationFieldType durationFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withFieldAdded(durationFieldType15, 35410486);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u82f1\u6587", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("2022-02-11T09:50:08.850");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-11t09:50:08.850");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        java.io.File file4 = new java.io.File("6", "6");
        java.lang.String str5 = file4.getPath();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = java.io.File.createTempFile("java.io.IOException: /experiment", "yearOfCentury", file4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(file4.getParent(), "6");
        org.junit.Assert.assertEquals(file4.toString(), "6/6");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6/6" + "'", str5, "6/6");
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        int int14 = localDateTime5.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.minusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime18 = localDateTime5.withEra((int) (short) 1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withDayOfMonth(257);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 257 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler0 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file2 = new java.io.File("");
        java.lang.String str3 = file2.getCanonicalPath();
        boolean boolean6 = file2.setReadable(true, false);
        boolean boolean9 = file2.setExecutable(true, true);
        java.net.URI uRI10 = file2.toURI();
        boolean boolean13 = file2.setReadable(true, false);
        java.io.File[] fileArray14 = new java.io.File[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap15 = zoneInfoCompiler0.compile(file2, fileArray14);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Destination directory doesn't exist: ");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/experiment" + "'", str3, "/experiment");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(uRI10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fileArray14);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        long long4 = file3.getUsableSpace();
        boolean boolean7 = file3.setWritable(false, false);
        java.net.URI uRI8 = file3.toURI();
        java.io.File file9 = new java.io.File(uRI8);
        java.lang.String str10 = file9.toString();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 280452956160L + "'", long4 == 280452956160L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertEquals(file9.getParent(), "/");
        org.junit.Assert.assertEquals(file9.toString(), "/hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/hi!" + "'", str10, "/hi!");
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        timeZone0.setID("");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeZone0.getOffset(646, 8, (int) (short) 0, 4, 655, 304);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        boolean boolean13 = localDateTime8.isBefore((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property16 = localDateTime12.yearOfCentury();
        java.lang.String str17 = property16.getName();
        org.joda.time.LocalDateTime localDateTime19 = property16.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        boolean boolean26 = localDateTime21.isBefore((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime25, chronology27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime25.toDateTime(readableInstant29);
        org.joda.time.DateTime dateTime31 = localDateTime19.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Instant instant32 = dateTime31.toInstant();
        org.joda.time.Chronology chronology33 = instant32.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(2022, 655, 35410486, (-1), 50, 0, 59, chronology33);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "yearOfCentury" + "'", str17, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(chronology33);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("9");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 9 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = dateTimeZone0.equals(obj1);
        java.lang.String str3 = dateTimeZone0.toString();
        java.lang.String str5 = dateTimeZone0.getShortName(1L);
        java.lang.String str6 = dateTimeZone0.getID();
        long long8 = dateTimeZone0.convertUTCToLocal((long) 898);
        int int10 = dateTimeZone0.getOffsetFromLocal(280449576960L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 898L + "'", long8 == 898L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        boolean boolean18 = localDateTime13.isBefore((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime17, chronology19);
        boolean boolean21 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYear((int) (byte) -1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray24 = localDateTime20.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = localDateTime20.withDate((-1), (int) ' ', 50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray24);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        timeZone0.setRawOffset(22);
        boolean boolean4 = timeZone0.observesDaylightTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = timeZone0.getDisplayName(false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6" + "'", str1, "6");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        boolean boolean5 = file1.setLastModified((long) ':');
        java.net.URI uRI6 = file1.toURI();
        boolean boolean7 = file1.isAbsolute();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(uRI6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime8.getFields();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readablePeriod10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusWeeks(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMinuteOfHour((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(8);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        boolean boolean9 = localDateTime4.isBefore((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime8, chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMinuteOfHour(1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMinuteOfHour(3);
        boolean boolean16 = locale0.equals((java.lang.Object) localDateTime15);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.size();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.dayOfYear();
        int int5 = localDateTime1.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withDayOfYear(35410486);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35410486 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        long long4 = file3.getUsableSpace();
        boolean boolean5 = file3.isHidden();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 280452530176L + "'", long4 == 280452530176L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(774, (int) (byte) 0, (-1), 346, 50, (int) (short) 10, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 346 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        timeZone0.setRawOffset(22);
        boolean boolean4 = timeZone0.observesDaylightTime();
        java.lang.String str5 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6" + "'", str1, "6");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GMT+00:00" + "'", str5, "GMT+00:00");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DurationField durationField13 = property9.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime14 = property9.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property9.getFieldType();
        org.joda.time.LocalDateTime localDateTime16 = property9.roundHalfFloorCopy();
        org.joda.time.ReadableInstant readableInstant17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = property9.compareTo(readableInstant17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Taiwan", (double) 933);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=933.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        boolean boolean5 = file1.setLastModified((long) ':');
        boolean boolean6 = file1.isFile();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        long long4 = file3.getUsableSpace();
        boolean boolean7 = file3.setWritable(false, false);
        java.lang.String str8 = file3.getParent();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 280448475136L + "'", long4 == 280448475136L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/" + "'", str8, "/");
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        boolean boolean18 = localDateTime13.isBefore((org.joda.time.ReadablePartial) localDateTime17);
        int int19 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        boolean boolean26 = localDateTime21.isBefore((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime25, chronology27);
        boolean boolean29 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.Chronology chronology30 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(10L, chronology30);
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(chronology30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((int) 'x', 3, (int) 'x', (int) (byte) 0, 655, 12, 370, chronology30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 655 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("CN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"CN\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setScript("6");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 6 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        long long4 = file3.getUsableSpace();
        boolean boolean7 = file3.setWritable(false, false);
        java.net.URI uRI8 = file3.toURI();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusDays((int) ':');
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.minusYears((int) (byte) 10);
        boolean boolean15 = file3.equals((java.lang.Object) localDateTime14);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 280449884160L + "'", long4 == 280449884160L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setVariant("en");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: en [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("dayOfYear");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: dayOfYear [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) 100, 0, 92, 92, 92, 100, 8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 92 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime8.getFields();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readablePeriod10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        int int13 = localDateTime11.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withYearOfCentury(489);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 489 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 498 + "'", int13 == 498);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime8.getFields();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusMonths((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property12.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = property12.setCopy(59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime8.getFields();
        int int10 = localDateTime8.getYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = localDateTime8.toString(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022-04-22T09:50:14.828" + "'", str12, "2022-04-22T09:50:14.828");
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setLanguage("minuteOfHour");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: minuteOfHour [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(898);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        boolean boolean4 = file1.exists();
        boolean boolean5 = file1.exists();
        boolean boolean7 = file1.setReadable(true);
        long long8 = file1.getFreeSpace();
        boolean boolean9 = file1.isFile();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        int int11 = property9.getMaximumValueOverall();
        org.joda.time.DurationField durationField12 = property9.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj15 = new java.lang.Object();
        boolean boolean16 = dateTimeZone14.equals(obj15);
        java.lang.String str17 = dateTimeZone14.toString();
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.util.Locale locale21 = java.util.Locale.US;
        java.lang.String str22 = locale19.getDisplayScript(locale21);
        java.lang.String str23 = dateTimeZone14.getName((long) ':', locale21);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfYear();
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.lang.String str27 = locale26.getDisplayLanguage();
        boolean boolean28 = locale26.hasExtensions();
        java.util.Set<java.lang.String> strSet29 = locale26.getUnicodeLocaleAttributes();
        int int30 = property25.getMaximumShortTextLength(locale26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime31 = property9.setCopy("\u5fb7\u6587", locale26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u5fb7\u6587" + "'", str20, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u5fb7\u6587" + "'", str27, "\u5fb7\u6587");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        int int11 = property9.getMaximumValueOverall();
        org.joda.time.DurationField durationField12 = property9.getRangeDurationField();
        org.joda.time.DurationField durationField13 = property9.getRangeDurationField();
        java.lang.String str14 = property9.getAsText();
        org.joda.time.LocalDateTime localDateTime15 = property9.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = property9.setCopy("2021-02-11T09:50:14.960Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2021-02-11T09:50:14.960Z\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "22" + "'", str14, "22");
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale2.getDisplayScript(locale4);
        java.lang.String str6 = timeZone0.getDisplayName(locale4);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u5fb7\u6587" + "'", str3, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GMT+00:00" + "'", str6, "GMT+00:00");
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = dateTimeZone0.equals(obj1);
        java.lang.String str3 = dateTimeZone0.toString();
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale5.getDisplayScript(locale7);
        java.lang.String str9 = dateTimeZone0.getName((long) ':', locale7);
        java.util.TimeZone timeZone10 = dateTimeZone0.toTimeZone();
        int int12 = timeZone10.getOffset(120L);
        java.lang.String str13 = timeZone10.getDisplayName();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u5fb7\u6587" + "'", str6, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u5354\u8abf\u4e16\u754c\u6642\u9593" + "'", str13, "\u5354\u8abf\u4e16\u754c\u6642\u9593");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        int int11 = property9.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime12 = property9.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, (int) '4');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.plusWeeks((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime12.withDayOfWeek(346);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 346 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        boolean boolean4 = file1.exists();
        boolean boolean6 = file1.setReadable(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = file1.createNewFile();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u4e2d\u6587\u53f0\u7063)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??(??)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("German", (double) 1.0f);
        double double3 = languageRange2.getWeight();
        java.lang.String str4 = languageRange2.getRange();
        double double5 = languageRange2.getWeight();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        boolean boolean12 = localDateTime7.isBefore((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property15 = localDateTime11.yearOfCentury();
        java.lang.String str16 = property15.getName();
        org.joda.time.LocalDateTime localDateTime18 = property15.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DurationField durationField19 = property15.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime20 = property15.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj22 = new java.lang.Object();
        boolean boolean23 = dateTimeZone21.equals(obj22);
        java.lang.String str24 = dateTimeZone21.toString();
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.lang.String str27 = locale26.getDisplayLanguage();
        java.util.Locale locale28 = java.util.Locale.US;
        java.lang.String str29 = locale26.getDisplayScript(locale28);
        java.lang.String str30 = dateTimeZone21.getName((long) ':', locale28);
        java.lang.String str31 = locale28.getLanguage();
        org.joda.time.tz.NameProvider nameProvider32 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.lang.String str34 = locale33.getCountry();
        java.lang.String str35 = locale33.getDisplayScript();
        java.lang.String str38 = nameProvider32.getName(locale33, "hi!", "");
        java.util.Locale locale39 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleKeys();
        java.lang.String str43 = nameProvider32.getName(locale39, "\u5fb7\u6587", "");
        java.lang.String str44 = locale28.getDisplayVariant(locale39);
        int int45 = property15.getMaximumTextLength(locale28);
        boolean boolean46 = languageRange2.equals((java.lang.Object) int45);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "german" + "'", str4, "german");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "yearOfCentury" + "'", str16, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u5fb7\u6587" + "'", str27, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "en" + "'", str31, "en");
        org.junit.Assert.assertNotNull(nameProvider32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DurationFieldType durationFieldType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withFieldAdded(durationFieldType4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u53f0\u7063");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale[] localeArray7 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList8 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList8, localeArray7);
        java.util.Locale.FilteringMode filteringMode10 = null;
        java.util.List<java.util.Locale> localeList11 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList8, filteringMode10);
        java.util.Locale.FilteringMode filteringMode12 = null;
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList8, filteringMode12);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale[] localeArray20 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.Locale.FilteringMode filteringMode23 = null;
        java.util.List<java.util.Locale> localeList24 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList21, filteringMode23);
        java.util.Locale.FilteringMode filteringMode25 = null;
        java.util.List<java.util.Locale> localeList26 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.util.Locale>) localeList21, filteringMode25);
        java.util.Locale.FilteringMode filteringMode27 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList28 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList26, filteringMode27);
        java.util.Locale.LanguageRange languageRange31 = new java.util.Locale.LanguageRange("German", (double) 1.0f);
        java.lang.String str32 = languageRange31.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] { languageRange31 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap39 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strMap39);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap44 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList45 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, strMap44);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.util.Locale[] localeArray49 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList50 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList50, localeArray49);
        java.util.Locale.FilteringMode filteringMode52 = null;
        java.util.List<java.util.Locale> localeList53 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.util.Locale>) localeList50, filteringMode52);
        java.util.Locale locale54 = java.util.Locale.lookup(languageRangeList45, (java.util.Collection<java.util.Locale>) localeList50);
        java.util.Collection<java.util.Locale> localeCollection55 = null;
        java.util.Locale.FilteringMode filteringMode56 = null;
        java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter(languageRangeList45, localeCollection55, filteringMode56);
        java.util.Locale locale58 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList57);
        java.util.Locale.FilteringMode filteringMode59 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList60 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList57, filteringMode59);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.util.Locale[] localeArray64 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList65 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList65, localeArray64);
        java.util.Locale.FilteringMode filteringMode67 = null;
        java.util.List<java.util.Locale> localeList68 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.util.Locale>) localeList65, filteringMode67);
        java.util.Locale.FilteringMode filteringMode69 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList65, filteringMode69);
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList65);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localeList11);
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localeList24);
        org.junit.Assert.assertNotNull(localeList26);
        org.junit.Assert.assertTrue("'" + filteringMode27 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode27.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "german" + "'", str32, "german");
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(languageRangeList45);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(localeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(localeList53);
        org.junit.Assert.assertNull(locale54);
        org.junit.Assert.assertNotNull(localeList57);
        org.junit.Assert.assertNull(locale58);
        org.junit.Assert.assertTrue("'" + filteringMode59 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode59.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(localeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(localeList68);
        org.junit.Assert.assertTrue("'" + filteringMode69 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode69.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertNotNull(localeList71);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(304);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("2022-02-11T09:50:13.471");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-02-11T09:50:13.471 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray1 = strSet0.toArray();
        boolean boolean3 = strSet0.add("");
        java.util.Set<java.lang.String> strSet4 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray5 = strSet4.toArray();
        boolean boolean7 = strSet4.add("");
        java.util.stream.Stream<java.lang.String> strStream8 = strSet4.parallelStream();
        boolean boolean9 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet4);
        java.util.Set<java.lang.String> strSet10 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray11 = strSet10.toArray();
        boolean boolean12 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet13 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray14 = strSet13.toArray();
        boolean boolean16 = strSet13.add("");
        boolean boolean17 = strSet10.containsAll((java.util.Collection<java.lang.String>) strSet13);
        java.util.Spliterator<java.lang.String> strSpliterator18 = strSet13.spliterator();
        org.joda.time.tz.NameProvider nameProvider19 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.lang.String str21 = locale20.getCountry();
        java.lang.String str22 = locale20.getDisplayScript();
        java.lang.String str25 = nameProvider19.getName(locale20, "hi!", "");
        boolean boolean26 = strSet13.contains((java.lang.Object) "hi!");
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        boolean boolean33 = localDateTime28.isBefore((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property36 = localDateTime32.yearOfCentury();
        java.lang.String str37 = property36.getName();
        int int38 = property36.getMaximumValueOverall();
        java.lang.String str39 = property36.getName();
        java.util.Locale locale40 = java.util.Locale.KOREA;
        java.lang.String str42 = locale40.getExtension('a');
        int int43 = property36.getMaximumShortTextLength(locale40);
        org.joda.time.Interval interval44 = property36.toInterval();
        boolean boolean45 = strSet13.equals((java.lang.Object) property36);
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertNotNull(nameProvider19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "yearOfCentury" + "'", str37, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 99 + "'", int38 == 99);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "yearOfCentury" + "'", str39, "yearOfCentury");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ko_KR");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) ':', 3, 747, (int) '#', 933, (int) ':');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.size();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusDays((int) '4');
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property6.setCopy((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.io.File file1 = new java.io.File("");
        java.io.File file2 = file1.getCanonicalFile();
        boolean boolean3 = file1.mkdir();
        java.io.File file4 = file1.getAbsoluteFile();
        java.lang.String str5 = file1.toString();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertNotNull(file2);
// flaky:         org.junit.Assert.assertEquals(file2.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(file4);
// flaky:         org.junit.Assert.assertEquals(file4.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file4.toString(), "/experiment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone0.hasSameRules(timeZone4);
        timeZone0.setID("German");
        timeZone0.setRawOffset((int) (byte) 100);
        java.util.Locale locale12 = new java.util.Locale(":", "");
        java.lang.String str14 = locale12.getExtension('u');
        java.lang.String str15 = locale12.getDisplayName();
        java.lang.String str16 = timeZone0.getDisplayName(locale12);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals(locale12.toString(), ":");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":" + "'", str15, ":");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GMT+00:00" + "'", str16, "GMT+00:00");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        long long4 = file3.getUsableSpace();
        java.io.File file5 = file3.getAbsoluteFile();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = dateTimeZone6.equals(obj7);
        java.lang.String str9 = dateTimeZone6.toString();
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = locale11.getDisplayScript(locale13);
        java.lang.String str15 = dateTimeZone6.getName((long) ':', locale13);
        java.lang.String str16 = locale13.getLanguage();
        org.joda.time.tz.NameProvider nameProvider17 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.lang.String str19 = locale18.getCountry();
        java.lang.String str20 = locale18.getDisplayScript();
        java.lang.String str23 = nameProvider17.getName(locale18, "hi!", "");
        java.util.Locale locale24 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleKeys();
        java.lang.String str28 = nameProvider17.getName(locale24, "\u5fb7\u6587", "");
        java.lang.String str29 = locale13.getDisplayVariant(locale24);
        boolean boolean30 = file3.equals((java.lang.Object) locale13);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "/");
        org.junit.Assert.assertEquals(file5.toString(), "/hi!");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\ub3c5\uc77c\uc5b4" + "'", str12, "\ub3c5\uc77c\uc5b4");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en" + "'", str16, "en");
        org.junit.Assert.assertNotNull(nameProvider17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone0.hasSameRules(timeZone4);
        boolean boolean6 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.size();
        int int3 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusMillis((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withDate(623, 92, 346);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 92 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone0.hasSameRules(timeZone4);
        int int6 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (short) 0);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime8.getFields();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readablePeriod10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        int int13 = localDateTime11.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusSeconds((int) 'x');
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        boolean boolean22 = localDateTime17.isBefore((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property25 = localDateTime21.yearOfCentury();
        java.lang.String str26 = property25.getName();
        org.joda.time.LocalDateTime localDateTime28 = property25.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        boolean boolean35 = localDateTime30.isBefore((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime34, chronology36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.DateTime dateTime39 = localDateTime34.toDateTime(readableInstant38);
        org.joda.time.DateTime dateTime40 = localDateTime28.toDateTime((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime40.getZone();
        org.joda.time.DateTime dateTime42 = localDateTime11.toDateTime(dateTimeZone41);
        java.lang.Class<?> wildcardClass43 = dateTime42.getClass();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 279 + "'", int13 == 279);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "yearOfCentury" + "'", str26, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        java.io.File file1 = new java.io.File("");
        boolean boolean2 = file1.canExecute();
        java.lang.String str3 = file1.getParent();
        boolean boolean4 = file1.mkdir();
        java.io.File file5 = file1.getAbsoluteFile();
        java.lang.String str6 = file1.getName();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        boolean boolean13 = localDateTime8.isBefore((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localDateTime15.getFields();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.plus(readablePeriod17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        int int20 = localDateTime18.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.minusSeconds((int) 'x');
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.plus(readableDuration23);
        org.joda.time.DateTime dateTime25 = localDateTime24.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        boolean boolean32 = localDateTime27.isBefore((org.joda.time.ReadablePartial) localDateTime31);
        int int33 = localDateTime31.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime24.withFields((org.joda.time.ReadablePartial) localDateTime31);
        boolean boolean35 = file1.equals((java.lang.Object) localDateTime31);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(file5);
// flaky:         org.junit.Assert.assertEquals(file5.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file5.toString(), "/experiment");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 368 + "'", int20 == 368);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        boolean boolean19 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime18, chronology20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime18.toDateTime(readableInstant22);
        org.joda.time.DateTime dateTime24 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime24.getZone();
        java.lang.String str27 = dateTimeZone25.getName((long) '#');
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        int int30 = localDateTime29.size();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.yearOfCentury();
        boolean boolean32 = dateTimeZone25.isLocalDateTimeGap(localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        boolean boolean43 = localDateTime38.isBefore((org.joda.time.ReadablePartial) localDateTime42);
        int int44 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        int int45 = localDateTime38.getYear();
        int int46 = localDateTime38.getYearOfEra();
        boolean boolean47 = dateTimeZone25.isLocalDateTimeGap(localDateTime38);
        int int49 = dateTimeZone25.getOffsetFromLocal(280452325376L);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(dateTimeZone54);
        boolean boolean56 = localDateTime51.isBefore((org.joda.time.ReadablePartial) localDateTime55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray59 = localDateTime58.getFields();
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.plus(readablePeriod60);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.millisOfSecond();
        int int63 = localDateTime61.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime61.minusSeconds((int) 'x');
        boolean boolean66 = dateTimeZone25.isLocalDateTimeGap(localDateTime65);
        java.util.TimeZone timeZone67 = dateTimeZone25.toTimeZone();
        java.util.Date date68 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean69 = timeZone67.inDaylightTime(date68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2022 + "'", int45 == 2022);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2022 + "'", int46 == 2022);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(dateTimeFieldArray59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(property62);
// flaky:         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 416 + "'", int63 == 416);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(timeZone67);
// flaky:         org.junit.Assert.assertEquals(timeZone67.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        boolean boolean19 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime18, chronology20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime18.toDateTime(readableInstant22);
        org.joda.time.DateTime dateTime24 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime24.getZone();
        java.lang.String str27 = dateTimeZone25.getName((long) '#');
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        int int30 = localDateTime29.size();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.yearOfCentury();
        boolean boolean32 = dateTimeZone25.isLocalDateTimeGap(localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        boolean boolean43 = localDateTime38.isBefore((org.joda.time.ReadablePartial) localDateTime42);
        int int44 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        int int45 = localDateTime38.getYear();
        int int46 = localDateTime38.getYearOfEra();
        boolean boolean47 = dateTimeZone25.isLocalDateTimeGap(localDateTime38);
        int int49 = dateTimeZone25.getOffsetFromLocal(280452325376L);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(dateTimeZone54);
        boolean boolean56 = localDateTime51.isBefore((org.joda.time.ReadablePartial) localDateTime55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray59 = localDateTime58.getFields();
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.plus(readablePeriod60);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.millisOfSecond();
        int int63 = localDateTime61.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime61.minusSeconds((int) 'x');
        boolean boolean66 = dateTimeZone25.isLocalDateTimeGap(localDateTime65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime65.hourOfDay();
        java.lang.String str68 = property67.getAsShortText();
        java.lang.String str69 = property67.getAsString();
        java.lang.String str70 = property67.getAsString();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2022 + "'", int45 == 2022);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2022 + "'", int46 == 2022);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(dateTimeFieldArray59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(property62);
// flaky:         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 463 + "'", int63 == 463);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "9" + "'", str68, "9");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "9" + "'", str69, "9");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "9" + "'", str70, "9");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.io.IOException iOException2 = new java.io.IOException("/experiment");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException("CN", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray6 = iOException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        int int14 = localDateTime5.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.minusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime18 = localDateTime5.withEra((int) (short) 1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime21 = property19.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField23 = localDateTime21.getField(747);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 747");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        int int11 = property9.getMaximumValueOverall();
        org.joda.time.DurationField durationField12 = property9.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        boolean boolean19 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime18, chronology20);
        int int22 = localDateTime18.size();
        org.joda.time.LocalDateTime.Property property23 = localDateTime18.dayOfYear();
        int int24 = property9.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime25 = property9.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withWeekOfWeekyear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(650, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setUnicodeLocaleKeyword("millisOfSecond", "2022-02-11T09:50:14.162");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: millisOfSecond [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setScript("Property[yearOfCentury]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Property[yearOfCentury] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "Italien");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setLanguageTag("2022-02-11T09:50:10.822");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 2022 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        int int11 = property9.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime12 = property9.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYearOfCentury(576);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 576 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str3 = locale1.getDisplayScript();
        java.lang.String str6 = nameProvider0.getName(locale1, "hi!", "");
        java.util.Locale locale7 = java.util.Locale.JAPAN;
        java.lang.String str8 = locale1.getDisplayName(locale7);
        java.util.Set<java.lang.String> strSet9 = locale1.getUnicodeLocaleKeys();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        boolean boolean16 = localDateTime11.isBefore((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.yearOfCentury();
        java.lang.String str20 = property19.getName();
        int int21 = property19.getMaximumValueOverall();
        java.lang.String str22 = property19.getName();
        org.joda.time.LocalDateTime localDateTime24 = property19.addToCopy(99);
        boolean boolean25 = property19.isLeap();
        org.joda.time.Interval interval26 = property19.toInterval();
        org.joda.time.DurationField durationField27 = property19.getDurationField();
        boolean boolean28 = locale1.equals((java.lang.Object) property19);
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u30c9\u30a4\u30c4\u8a9e" + "'", str8, "\u30c9\u30a4\u30c4\u8a9e");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "yearOfCentury" + "'", str20, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "yearOfCentury" + "'", str22, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        boolean boolean4 = file1.exists();
        boolean boolean5 = file1.exists();
        java.io.File file7 = new java.io.File("");
        java.io.File file9 = new java.io.File(file7, "hi!");
        long long10 = file9.getUsableSpace();
        boolean boolean11 = file9.mkdir();
        int int12 = file1.compareTo(file9);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "");
        org.junit.Assert.assertEquals(file9.getParent(), "/");
        org.junit.Assert.assertEquals(file9.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 280450363392L + "'", long10 == 280450363392L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        java.io.File file1 = new java.io.File("");
        java.lang.String str2 = file1.getCanonicalPath();
        boolean boolean5 = file1.setReadable(true, false);
        java.lang.String str6 = file1.getPath();
        java.lang.Class<?> wildcardClass7 = file1.getClass();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/experiment" + "'", str2, "/experiment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Set<java.lang.String> strSet5 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale.FilteringMode filteringMode6 = null;
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strSet5, filteringMode6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap8);
        java.util.Set<java.lang.String> strSet10 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray11 = strSet10.toArray();
        boolean boolean13 = strSet10.add("");
        java.util.Set<java.lang.String> strSet14 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray15 = strSet14.toArray();
        boolean boolean17 = strSet14.add("");
        java.util.stream.Stream<java.lang.String> strStream18 = strSet14.parallelStream();
        boolean boolean19 = strSet10.retainAll((java.util.Collection<java.lang.String>) strSet14);
        java.util.Spliterator<java.lang.String> strSpliterator20 = strSet14.spliterator();
        java.util.Set<java.lang.String> strSet21 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray22 = strSet21.toArray();
        boolean boolean24 = strSet21.add("");
        java.util.stream.Stream<java.lang.String> strStream25 = strSet21.parallelStream();
        boolean boolean26 = strSet14.removeAll((java.util.Collection<java.lang.String>) strSet21);
        strSet14.clear();
        java.util.Locale.FilteringMode filteringMode28 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags(languageRangeList9, (java.util.Collection<java.lang.String>) strSet14, filteringMode28);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj31 = new java.lang.Object();
        boolean boolean32 = dateTimeZone30.equals(obj31);
        java.lang.String str33 = dateTimeZone30.toString();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        long long36 = dateTimeZone30.getMillisKeepLocal(dateTimeZone34, (long) (byte) -1);
        int int38 = dateTimeZone30.getStandardOffset(4096L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((java.lang.Object) strSet14, dateTimeZone30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.TreeSet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + filteringMode28 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode28.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime8.getFields();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readablePeriod10);
        org.joda.time.DateTime dateTime12 = localDateTime8.toDateTime();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withWeekyear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField16 = localDateTime14.getField((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setVariant("2021-02-11T09:50:15.251Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 2021-02-11T09:50:15.251Z [at index 5]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        boolean boolean23 = localDateTime18.isBefore((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = localDateTime14.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime18.plusMillis((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        boolean boolean33 = localDateTime28.isBefore((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property36 = localDateTime32.yearOfCentury();
        java.lang.String str37 = property36.getName();
        org.joda.time.LocalDateTime localDateTime39 = property36.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DurationField durationField40 = property36.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime41 = property36.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property36.getFieldType();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime18.withField(dateTimeFieldType42, (int) (byte) 0);
        org.joda.time.LocalDateTime.Property property45 = localDateTime12.property(dateTimeFieldType42);
        org.joda.time.tz.NameProvider nameProvider47 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.lang.String str49 = locale48.getCountry();
        java.lang.String str50 = locale48.getDisplayScript();
        java.lang.String str53 = nameProvider47.getName(locale48, "hi!", "");
        java.util.Locale locale54 = java.util.Locale.GERMAN;
        java.lang.String str55 = locale54.getCountry();
        java.util.Locale locale56 = java.util.Locale.ITALY;
        org.joda.time.tz.NameProvider nameProvider57 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale58 = java.util.Locale.GERMAN;
        java.lang.String str59 = locale58.getCountry();
        java.lang.String str60 = locale58.getDisplayScript();
        java.lang.String str63 = nameProvider57.getName(locale58, "hi!", "");
        java.lang.String str64 = locale56.getDisplayCountry(locale58);
        java.lang.String str65 = locale54.getDisplayVariant(locale58);
        java.util.Locale locale66 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.setDefault(locale66);
        java.util.Locale locale68 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet69 = locale68.getUnicodeLocaleKeys();
        java.lang.String str70 = locale66.getDisplayName(locale68);
        java.lang.String str71 = locale54.getDisplayScript(locale68);
        java.lang.String str74 = nameProvider47.getName(locale68, "/experiment", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str75 = localDateTime12.toString("2022-02-11T09:50:15.138", locale68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "yearOfCentury" + "'", str37, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(nameProvider47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "de");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "de");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "it_IT");
        org.junit.Assert.assertNotNull(nameProvider57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "de");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Italien" + "'", str64, "Italien");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en");
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Chinese (Taiwan)" + "'", str70, "Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone0.hasSameRules(timeZone4);
        timeZone0.setID("German");
        java.lang.String str8 = timeZone0.getID();
        boolean boolean9 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "German" + "'", str8, "German");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeZone1.getOffset(124, (int) (byte) 1, 774, (int) (short) 0, (-1), 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withDate(0, (int) 'a', (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        boolean boolean18 = localDateTime13.isBefore((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime17, chronology19);
        boolean boolean21 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime20);
        int int22 = localDateTime20.getEra();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = localDateTime20.getValue(919);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 919");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (short) -1, (int) (short) -1, 42, 17, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime5, chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMinuteOfHour(1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withMinuteOfHour(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withTime(448, 655, (int) 'u', 463);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 448 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        int int14 = localDateTime5.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.minusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusSeconds(2022);
        java.lang.String str19 = localDateTime18.toString();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2022-02-18T10:23:59.961" + "'", str19, "2022-02-18T10:23:59.961");
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.size();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusDays((int) '4');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMonths((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDateTime7.getValue(17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 17");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        int int14 = localDateTime5.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.minusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime18 = localDateTime5.minusWeeks(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime5.withTime(0, 774, 17, 124);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 774 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        int int11 = property9.getMaximumValueOverall();
        java.lang.String str12 = property9.getName();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str15 = locale13.getExtension('a');
        int int16 = property9.getMaximumShortTextLength(locale13);
        org.joda.time.Interval interval17 = property9.toInterval();
        int int18 = property9.getLeapAmount();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "yearOfCentury" + "'", str12, "yearOfCentury");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getISO3Language();
        java.lang.String str3 = locale0.getVariant();
        boolean boolean4 = locale0.hasExtensions();
        java.lang.String str5 = locale0.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        int int14 = localDateTime5.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.minusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime18 = localDateTime5.withEra((int) (short) 1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType21 = localDateTime18.getFieldType(14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 14");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime5, chronology7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withHourOfDay(346);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 346 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        java.io.IOException iOException0 = new java.io.IOException();
        java.lang.String str1 = iOException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.io.IOException" + "'", str1, "java.io.IOException");
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.weekOfWeekyear();
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.lang.String str14 = locale13.getDisplayLanguage();
        boolean boolean15 = locale13.hasExtensions();
        int int16 = property12.getMaximumTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusMillis(99);
        int int20 = property12.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property12.getFieldType();
        boolean boolean22 = localDateTime5.isSupported(dateTimeFieldType21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime5.withMonthOfYear(368);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 368 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u5fb7\u6587" + "'", str14, "\u5fb7\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("2022-04-22T09:50:12.989");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-04-22T09:50:12.989 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en", (double) 793);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=793.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime8.getFields();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readablePeriod10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        int int13 = localDateTime11.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusSeconds((int) 'x');
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plus(readableDuration16);
        org.joda.time.DateTime dateTime18 = localDateTime17.toDateTime();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withWeekyear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withMonthOfYear(368);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 368 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 935 + "'", int13 == 935);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setScript("2022-02-11T09:50:16.973");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 2022-02-11T09:50:16.973 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("German", (double) 1.0f);
        java.lang.String str4 = languageRange3.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] { languageRange3 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, strMap11);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, strMap16);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.util.Locale[] localeArray21 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList22 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList22, localeArray21);
        java.util.Locale.FilteringMode filteringMode24 = null;
        java.util.List<java.util.Locale> localeList25 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.util.Locale>) localeList22, filteringMode24);
        java.util.Locale locale26 = java.util.Locale.lookup(languageRangeList17, (java.util.Collection<java.util.Locale>) localeList22);
        java.util.Collection<java.util.Locale> localeCollection27 = null;
        java.util.Locale.FilteringMode filteringMode28 = null;
        java.util.List<java.util.Locale> localeList29 = java.util.Locale.filter(languageRangeList17, localeCollection27, filteringMode28);
        java.util.Locale locale30 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.util.Locale>) localeList29);
        java.util.Locale.FilteringMode filteringMode31 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList32 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList29, filteringMode31);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Locale[] localeArray39 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList40 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList40, localeArray39);
        java.util.Locale.FilteringMode filteringMode42 = null;
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList40, filteringMode42);
        java.util.Locale.FilteringMode filteringMode44 = null;
        java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList40, filteringMode44);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.util.Locale[] localeArray52 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList53 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList53, localeArray52);
        java.util.Locale.FilteringMode filteringMode55 = null;
        java.util.List<java.util.Locale> localeList56 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.util.Locale>) localeList53, filteringMode55);
        java.util.Locale.FilteringMode filteringMode57 = null;
        java.util.List<java.util.Locale> localeList58 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.util.Locale>) localeList53, filteringMode57);
        java.util.Locale.FilteringMode filteringMode59 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList60 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList58, filteringMode59);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList61 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList32, filteringMode59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "german" + "'", str4, "german");
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localeList25);
        org.junit.Assert.assertNull(locale26);
        org.junit.Assert.assertNotNull(localeList29);
        org.junit.Assert.assertNull(locale30);
        org.junit.Assert.assertTrue("'" + filteringMode31 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode31.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(localeList43);
        org.junit.Assert.assertNotNull(localeList45);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(localeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(localeList56);
        org.junit.Assert.assertNotNull(localeList58);
        org.junit.Assert.assertTrue("'" + filteringMode59 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode59.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList60);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        java.io.File file3 = new java.io.File("/");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file4 = java.io.File.createTempFile("\u53f0\u7063", "2021-02-11T09:50:15.251Z", file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Prefix string too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "/");
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file2 = java.io.File.createTempFile("\u5fb7\u6587", "2022-04-22T09:50:14.828");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Prefix string too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setRegion("\u5fb7\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        java.util.Locale locale2 = new java.util.Locale("Italien", "UTC");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for italien");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "italien_UTC");
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone0.hasSameRules(timeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays((int) ':');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusHours(2022);
        java.util.Date date12 = localDateTime9.toDate();
        boolean boolean13 = timeZone4.inDaylightTime(date12);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Wed Dec 15 09:50:19 UTC 2021");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) 'x');
        java.lang.String str4 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u5354\u8abf\u4e16\u754c\u6642\u9593" + "'", str4, "\u5354\u8abf\u4e16\u754c\u6642\u9593");
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "Italien");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setExtension('4', "2021-02-11T09:50:15.251Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(774, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Set<java.lang.String> strSet5 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale.FilteringMode filteringMode6 = null;
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strSet5, filteringMode6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap8);
        java.util.Set<java.lang.String> strSet10 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray11 = strSet10.toArray();
        boolean boolean13 = strSet10.add("");
        java.util.Set<java.lang.String> strSet14 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray15 = strSet14.toArray();
        boolean boolean17 = strSet14.add("");
        java.util.stream.Stream<java.lang.String> strStream18 = strSet14.parallelStream();
        boolean boolean19 = strSet10.retainAll((java.util.Collection<java.lang.String>) strSet14);
        java.util.Spliterator<java.lang.String> strSpliterator20 = strSet14.spliterator();
        java.util.Set<java.lang.String> strSet21 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray22 = strSet21.toArray();
        boolean boolean24 = strSet21.add("");
        java.util.stream.Stream<java.lang.String> strStream25 = strSet21.parallelStream();
        boolean boolean26 = strSet14.removeAll((java.util.Collection<java.lang.String>) strSet21);
        strSet14.clear();
        java.util.Locale.FilteringMode filteringMode28 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags(languageRangeList9, (java.util.Collection<java.lang.String>) strSet14, filteringMode28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((java.lang.Object) strList29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.ArrayList");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + filteringMode28 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode28.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale5 = new java.util.Locale("Taiwan", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = timeZone0.getDisplayName(true, 949, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 949");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertEquals(locale5.toString(), "taiwan_HI!");
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguageTag("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Etc/UTC [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime8.getFields();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readablePeriod10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        int int13 = localDateTime11.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusSeconds((int) 'x');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withYearOfEra(898);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime15.withTime(346, (int) (byte) -1, 17, (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 346 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        java.io.IOException iOException1 = new java.io.IOException("/experiment");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException7 = new java.io.IOException("/experiment");
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException("german", (java.lang.Throwable) iOException8);
        iOException4.addSuppressed((java.lang.Throwable) iOException8);
        java.lang.Throwable[] throwableArray11 = iOException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusDays((int) ':');
        int int14 = property9.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        boolean boolean25 = localDateTime20.isBefore((org.joda.time.ReadablePartial) localDateTime24);
        int int26 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        boolean boolean33 = localDateTime28.isBefore((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime32, chronology34);
        boolean boolean36 = localDateTime16.isAfter((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.DateTime dateTime37 = localDateTime16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        boolean boolean44 = localDateTime39.isBefore((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property47 = localDateTime43.yearOfCentury();
        java.lang.String str48 = property47.getName();
        org.joda.time.LocalDateTime localDateTime50 = property47.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone55);
        boolean boolean57 = localDateTime52.isBefore((org.joda.time.ReadablePartial) localDateTime56);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime56, chronology58);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.DateTime dateTime61 = localDateTime56.toDateTime(readableInstant60);
        org.joda.time.DateTime dateTime62 = localDateTime50.toDateTime((org.joda.time.ReadableInstant) dateTime61);
        boolean boolean63 = dateTime37.isAfter((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Chronology chronology64 = dateTime62.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((java.lang.Object) int14, chronology64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "yearOfCentury" + "'", str48, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(chronology64);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguage("java.io.IOException: /experiment");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: java.io.IOException: /experiment [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setScript("2022-02-11T09:50:08.850");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 2022-02-11T09:50:08.850 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime8.getFields();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readablePeriod10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = property12.setCopy(1);
        org.joda.time.LocalDateTime localDateTime15 = property12.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        boolean boolean22 = localDateTime17.isBefore((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property25 = localDateTime21.yearOfCentury();
        java.lang.String str26 = property25.getName();
        org.joda.time.LocalDateTime localDateTime28 = property25.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        boolean boolean35 = localDateTime30.isBefore((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime34, chronology36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.DateTime dateTime39 = localDateTime34.toDateTime(readableInstant38);
        org.joda.time.DateTime dateTime40 = localDateTime28.toDateTime((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Instant instant41 = dateTime40.toInstant();
        java.lang.String str42 = instant41.toString();
        int int43 = property12.compareTo((org.joda.time.ReadableInstant) instant41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime45 = property12.setCopy("0010-04-23T09:50:19.429");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0010-04-23T09:50:19.429\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "yearOfCentury" + "'", str26, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(instant41);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2021-02-11T09:50:20.551Z" + "'", str42, "2021-02-11T09:50:20.551Z");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Set<java.lang.String> strSet5 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale.FilteringMode filteringMode6 = null;
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strSet5, filteringMode6);
        java.util.stream.Stream<java.lang.String> strStream8 = strList7.parallelStream();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strStream8);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone0.hasSameRules(timeZone4);
        timeZone0.setID("German");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        boolean boolean14 = localDateTime9.isBefore((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusMonths((int) ':');
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfCentury();
        java.util.Date date18 = localDateTime16.toDate();
        boolean boolean19 = timeZone0.inDaylightTime(date18);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(localDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Apr 11 09:50:20 UTC 2017");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone0.hasSameRules(timeZone4);
        timeZone0.setID("German");
        boolean boolean8 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(reader0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = localDateTime3.toString("Property[weekyear]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("2021", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("Property[yearOfCentury]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Property[yearOfCentury] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.lang.String str4 = locale0.getDisplayName(locale2);
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.lang.String str7 = locale5.getISO3Language();
        java.lang.String str8 = locale5.getVariant();
        boolean boolean9 = locale5.hasExtensions();
        java.lang.String str10 = locale0.getDisplayScript(locale5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) str10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinese (Taiwan)" + "'", str4, "Chinese (Taiwan)");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zho" + "'", str7, "zho");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray1 = strSet0.toArray();
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        boolean boolean4 = strSet0.removeAll((java.util.Collection<java.lang.String>) strSet3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        boolean boolean11 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime13.getFields();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.plus(readablePeriod15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withWeekyear((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusMonths(100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = strSet0.contains((java.lang.Object) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray1 = strSet0.toArray();
        java.io.File file3 = new java.io.File("");
        java.io.File file5 = new java.io.File(file3, "hi!");
        boolean boolean6 = file3.exists();
        boolean boolean7 = file3.mkdirs();
        boolean boolean8 = file3.setReadOnly();
        java.lang.String str9 = file3.getName();
        java.lang.String str10 = file3.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = strSet0.contains((java.lang.Object) file3);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.io.File");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "");
        org.junit.Assert.assertEquals(file5.getParent(), "/");
        org.junit.Assert.assertEquals(file5.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        int int14 = localDateTime5.getWeekyear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime5.monthOfYear();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime5.minus(readableDuration16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        java.util.Locale.Category category20 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale21 = java.util.Locale.getDefault(category20);
        java.util.Locale locale22 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet23 = locale22.getExtensionKeys();
        java.lang.String str24 = locale22.getISO3Language();
        java.lang.String str25 = locale22.getVariant();
        java.util.Locale.setDefault(category20, locale22);
        java.util.Locale locale27 = locale22.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = property18.setCopy("\ud504\ub791\uc2a4\uc5b4", locale22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"?????????\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category20.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "zho" + "'", str24, "zho");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        int int11 = property9.getMaximumValueOverall();
        java.lang.String str12 = property9.getName();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str15 = locale13.getExtension('a');
        int int16 = property9.getMaximumShortTextLength(locale13);
        org.joda.time.DurationField durationField17 = property9.getRangeDurationField();
        int int18 = property9.getMinimumValue();
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.lang.String str21 = locale20.getCountry();
        java.util.Locale locale22 = java.util.Locale.ITALY;
        org.joda.time.tz.NameProvider nameProvider23 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.lang.String str25 = locale24.getCountry();
        java.lang.String str26 = locale24.getDisplayScript();
        java.lang.String str29 = nameProvider23.getName(locale24, "hi!", "");
        java.lang.String str30 = locale22.getDisplayCountry(locale24);
        java.lang.String str31 = locale20.getDisplayVariant(locale24);
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.lang.String str33 = locale32.getCountry();
        java.lang.String str34 = locale32.getDisplayScript();
        java.lang.String str35 = locale24.getDisplayScript(locale32);
        java.util.Set<java.lang.String> strSet36 = locale32.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime37 = property9.setCopy("\ub3c5\uc77c\uc5b4", locale32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"????????\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "yearOfCentury" + "'", str12, "yearOfCentury");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it_IT");
        org.junit.Assert.assertNotNull(nameProvider23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Italien" + "'", str30, "Italien");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "de");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone0.hasSameRules(timeZone4);
        timeZone0.setID("German");
        java.lang.String str8 = timeZone0.getID();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        boolean boolean10 = timeZone9.observesDaylightTime();
        int int12 = timeZone9.getOffset((long) (byte) 0);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        boolean boolean14 = timeZone9.hasSameRules(timeZone13);
        timeZone9.setID("German");
        boolean boolean17 = timeZone0.hasSameRules(timeZone9);
        int int18 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "German" + "'", str8, "German");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        boolean boolean4 = file1.exists();
        boolean boolean5 = file1.exists();
        java.io.File file6 = file1.getCanonicalFile();
        long long7 = file6.getUsableSpace();
        java.io.File file8 = file6.getAbsoluteFile();
        boolean boolean11 = file8.setWritable(true, false);
        java.net.URI uRI12 = file8.toURI();
        boolean boolean13 = file8.isFile();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(file6);
// flaky:         org.junit.Assert.assertEquals(file6.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), "/experiment");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 280448671744L + "'", long7 == 280448671744L);
        org.junit.Assert.assertNotNull(file8);
// flaky:         org.junit.Assert.assertEquals(file8.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file8.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(uRI12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime8.getFields();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readablePeriod10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = property12.setCopy(1);
        org.joda.time.LocalDateTime localDateTime15 = property12.roundHalfEvenCopy();
        boolean boolean17 = property12.equals((java.lang.Object) "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        java.lang.String str4 = timeZone0.getID();
        java.lang.String str5 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u5354\u8abf\u4e16\u754c\u6642\u9593" + "'", str5, "\u5354\u8abf\u4e16\u754c\u6642\u9593");
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray1 = strSet0.toArray();
        boolean boolean3 = strSet0.add("");
        java.util.Set<java.lang.String> strSet4 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray5 = strSet4.toArray();
        boolean boolean7 = strSet4.add("");
        java.util.stream.Stream<java.lang.String> strStream8 = strSet4.parallelStream();
        boolean boolean9 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet4);
        java.util.Spliterator<java.lang.String> strSpliterator10 = strSet4.spliterator();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = strSet4.contains((java.lang.Object) property13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.joda.time.LocalDateTime$Property cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(objArray1);
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withMonthOfYear(2);
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder14 = builder12.setLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localDateTime10.toString("Property[minuteOfHour]", locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("2022-02-11T09:50:16.973");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '2022-02-11T09:50:16.973' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        java.time.ZoneId zoneId2 = timeZone0.toZoneId();
        java.util.TimeZone.setDefault(timeZone0);
        int int4 = timeZone0.getRawOffset();
        boolean boolean5 = timeZone0.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setUnicodeLocaleKeyword("Taiwan", "Property[minuteOfHour]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Taiwan [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        timeZone0.setRawOffset(22);
        boolean boolean4 = timeZone0.observesDaylightTime();
        java.util.TimeZone timeZone5 = null;
        boolean boolean6 = timeZone0.hasSameRules(timeZone5);
        int int7 = timeZone0.getRawOffset();
        java.util.TimeZone.setDefault(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = timeZone0.getDisplayName(true, 346);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 346");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(18, 131, (int) 'u', 919, 17, 47, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 919 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        long long4 = file3.getUsableSpace();
        java.io.File file5 = file3.getAbsoluteFile();
        java.io.File file7 = new java.io.File("");
        java.io.File file9 = new java.io.File(file7, "hi!");
        boolean boolean10 = file7.exists();
        boolean boolean12 = file7.setReadable(true);
        java.net.URL uRL13 = file7.toURL();
        boolean boolean14 = file3.renameTo(file7);
        java.io.File file16 = new java.io.File("");
        boolean boolean17 = file16.canExecute();
        java.lang.String str18 = file16.getParent();
        boolean boolean19 = file16.mkdir();
        java.io.File file20 = file16.getAbsoluteFile();
        java.io.File file21 = file20.getAbsoluteFile();
        long long22 = file21.length();
        boolean boolean24 = file21.setWritable(false);
        int int25 = file7.compareTo(file21);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 280452014080L + "'", long4 == 280452014080L);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "/");
        org.junit.Assert.assertEquals(file5.toString(), "/hi!");
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "");
        org.junit.Assert.assertEquals(file9.getParent(), "/");
        org.junit.Assert.assertEquals(file9.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(uRL13);
// flaky:         org.junit.Assert.assertEquals(uRL13.toString(), "file:/experiment");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull("file16.getParent() == null", file16.getParent());
        org.junit.Assert.assertEquals(file16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(file20);
// flaky:         org.junit.Assert.assertEquals(file20.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file20.toString(), "/experiment");
        org.junit.Assert.assertNotNull(file21);
// flaky:         org.junit.Assert.assertEquals(file21.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file21.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 4096L + "'", long22 == 4096L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-11) + "'", int25 == (-11));
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(12, 100, 21, 933, 9, 35410486);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 933 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        long long4 = file3.getUsableSpace();
        boolean boolean7 = file3.setWritable(false, false);
        java.net.URI uRI8 = file3.toURI();
        boolean boolean9 = file3.mkdirs();
        boolean boolean10 = file3.createNewFile();
        java.lang.String str11 = file3.toString();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 280452911104L + "'", long4 == 280452911104L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/hi!" + "'", str11, "/hi!");
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        boolean boolean19 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime18, chronology20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime18.toDateTime(readableInstant22);
        org.joda.time.DateTime dateTime24 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime24.getZone();
        java.lang.String str27 = dateTimeZone25.getName((long) '#');
        int int29 = dateTimeZone25.getStandardOffset(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = dateTimeZone0.equals(obj1);
        java.lang.String str3 = dateTimeZone0.toString();
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale5.getDisplayScript(locale7);
        java.lang.String str9 = dateTimeZone0.getName((long) ':', locale7);
        java.lang.String str10 = locale7.getLanguage();
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        boolean boolean18 = localDateTime13.isBefore((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property21 = localDateTime17.yearOfCentury();
        java.lang.String str22 = property21.getName();
        int int23 = property21.getMaximumValueOverall();
        org.joda.time.DurationField durationField24 = property21.getRangeDurationField();
        org.joda.time.DurationField durationField25 = property21.getRangeDurationField();
        java.lang.String str26 = property21.getAsText();
        org.joda.time.LocalDateTime localDateTime28 = property21.addWrapFieldToCopy((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime29 = property21.roundHalfFloorCopy();
        boolean boolean30 = locale7.equals((java.lang.Object) property21);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u5fb7\u6587" + "'", str6, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "yearOfCentury" + "'", str22, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 99 + "'", int23 == 99);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "22" + "'", str26, "22");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(280452325376L);
        int int2 = localDateTime1.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withWeekOfWeekyear(99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(2022, 774, 809, 584, 329);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 584 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "Italien");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setLanguage("\ud504\ub791\uc2a4\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ????????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        char char0 = java.io.File.separatorChar;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '/' + "'", char0 == '/');
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("/", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\ud504\ub791\uc2a4\uc5b4", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?????????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler0 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file1 = null;
        java.io.File file3 = new java.io.File("");
        java.io.File file5 = new java.io.File(file3, "hi!");
        boolean boolean7 = file5.setReadable(true);
        file5.deleteOnExit();
        java.io.File file10 = new java.io.File("");
        java.lang.String str11 = file10.getCanonicalPath();
        boolean boolean14 = file10.setReadable(true, false);
        java.lang.String str15 = file10.getPath();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        int int18 = localDateTime17.size();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.yearOfCentury();
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.dayOfYear();
        java.io.File file22 = new java.io.File("");
        boolean boolean23 = file22.canExecute();
        java.lang.String str24 = file22.getParent();
        boolean boolean25 = file22.mkdir();
        java.io.File file26 = file22.getAbsoluteFile();
        java.io.File file27 = file26.getAbsoluteFile();
        long long28 = file27.length();
        boolean boolean29 = property20.equals((java.lang.Object) file27);
        boolean boolean30 = file10.renameTo(file27);
        java.io.File[] fileArray31 = new java.io.File[] { file5, file10 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap32 = zoneInfoCompiler0.compile(file1, fileArray31);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "");
        org.junit.Assert.assertEquals(file5.getParent(), "/");
        org.junit.Assert.assertEquals(file5.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/experiment" + "'", str11, "/experiment");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNull("file22.getParent() == null", file22.getParent());
        org.junit.Assert.assertEquals(file22.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(file26);
// flaky:         org.junit.Assert.assertEquals(file26.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file26.toString(), "/experiment");
        org.junit.Assert.assertNotNull(file27);
// flaky:         org.junit.Assert.assertEquals(file27.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file27.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 4096L + "'", long28 == 4096L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fileArray31);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(346, (int) ' ', 779, 8, 779);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 779 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime5, chronology7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime5.toDateTime(readableInstant9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime5.weekyear();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime14 = property11.addToCopy(17);
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = localDateTime14.toString("Property[weekyear]", locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.size();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.yearOfCentury();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        int int5 = property3.getMaximumValueOverall();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 99 + "'", int5 == 99);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        boolean boolean1 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getISO3Language();
        java.lang.String str3 = locale0.getVariant();
        boolean boolean4 = locale0.hasExtensions();
        java.lang.String str5 = locale0.getDisplayScript();
        java.lang.String str6 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh_TW" + "'", str6, "zh_TW");
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int2 = timeZone0.getOffset((long) 335);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = timeZone0.getDisplayName(false, 35422094);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 35422094");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        timeZone0.setID("");
        java.lang.String str6 = timeZone0.getID();
        int int7 = timeZone0.getRawOffset();
        java.lang.String str8 = timeZone0.getID();
        boolean boolean9 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getCountry();
        java.util.Locale locale2 = java.util.Locale.ITALY;
        org.joda.time.tz.NameProvider nameProvider3 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.lang.String str5 = locale4.getCountry();
        java.lang.String str6 = locale4.getDisplayScript();
        java.lang.String str9 = nameProvider3.getName(locale4, "hi!", "");
        java.lang.String str10 = locale2.getDisplayCountry(locale4);
        java.lang.String str11 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.lang.String str13 = locale12.getCountry();
        java.lang.String str14 = locale12.getDisplayScript();
        java.lang.String str15 = locale4.getDisplayScript(locale12);
        java.lang.String str16 = locale4.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
        org.junit.Assert.assertNotNull(nameProvider3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italien" + "'", str10, "Italien");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        int int11 = property9.getMaximumValueOverall();
        org.joda.time.DurationField durationField12 = property9.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        boolean boolean19 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime18, chronology20);
        int int22 = localDateTime18.size();
        org.joda.time.LocalDateTime.Property property23 = localDateTime18.dayOfYear();
        int int24 = property9.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.DurationFieldType durationFieldType25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = localDateTime18.withFieldAdded(durationFieldType25, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        boolean boolean4 = file1.exists();
        boolean boolean5 = file1.exists();
        java.io.File file6 = file1.getCanonicalFile();
        long long7 = file6.getUsableSpace();
        java.io.File file8 = file6.getAbsoluteFile();
        boolean boolean11 = file8.setWritable(true, false);
        java.net.URI uRI12 = file8.toURI();
        boolean boolean15 = file8.setWritable(false, true);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(file6);
// flaky:         org.junit.Assert.assertEquals(file6.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), "/experiment");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 280449839104L + "'", long7 == 280449839104L);
        org.junit.Assert.assertNotNull(file8);
// flaky:         org.junit.Assert.assertEquals(file8.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file8.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(uRI12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        int int11 = property9.getMaximumValueOverall();
        org.joda.time.DurationField durationField12 = property9.getRangeDurationField();
        java.lang.String str13 = property9.getAsText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = property9.setCopy(384);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 384 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "22" + "'", str13, "22");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 100, chronology1);
        int int3 = localDateTime2.getMillisOfDay();
        int int4 = localDateTime2.getYearOfCentury();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("9", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "Italien");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setLanguageTag("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("2021-02-11T09:50:10.005Z", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2021-02-11t09:50:10.005z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        boolean boolean13 = localDateTime8.isBefore((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime12, chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMinuteOfHour(1);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(18, 898, (int) '#', 1, 646, 0, 124, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 646 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setScript("42");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 42 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        boolean boolean4 = file1.exists();
        boolean boolean5 = file1.exists();
        boolean boolean7 = file1.setReadable(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = file1.setLastModified((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative time");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        boolean boolean19 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime18, chronology20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime18.toDateTime(readableInstant22);
        org.joda.time.DateTime dateTime24 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime24.getZone();
        java.lang.String str27 = dateTimeZone25.getName((long) '#');
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        int int30 = localDateTime29.size();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.yearOfCentury();
        boolean boolean32 = dateTimeZone25.isLocalDateTimeGap(localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        boolean boolean43 = localDateTime38.isBefore((org.joda.time.ReadablePartial) localDateTime42);
        int int44 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        int int45 = localDateTime38.getYear();
        int int46 = localDateTime38.getYearOfEra();
        boolean boolean47 = dateTimeZone25.isLocalDateTimeGap(localDateTime38);
        int int49 = dateTimeZone25.getOffsetFromLocal(280452325376L);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(dateTimeZone54);
        boolean boolean56 = localDateTime51.isBefore((org.joda.time.ReadablePartial) localDateTime55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray59 = localDateTime58.getFields();
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.plus(readablePeriod60);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.millisOfSecond();
        int int63 = localDateTime61.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime61.minusSeconds((int) 'x');
        boolean boolean66 = dateTimeZone25.isLocalDateTimeGap(localDateTime65);
        long long70 = dateTimeZone25.convertLocalToUTC((long) 976, true, (long) 21);
        long long74 = dateTimeZone25.convertLocalToUTC(1644573023322L, false, 1644573005474L);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2022 + "'", int45 == 2022);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2022 + "'", int46 == 2022);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(dateTimeFieldArray59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(property62);
// flaky:         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 583 + "'", int63 == 583);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 976L + "'", long70 == 976L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1644573023322L + "'", long74 == 1644573023322L);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("Englisch", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setLanguageTag("yearOfCentury");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: yearOfCentury [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = dateTimeZone0.equals(obj1);
        java.lang.String str3 = dateTimeZone0.toString();
        java.lang.String str5 = dateTimeZone0.getShortName(1L);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int7 = timeZone6.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("yearOfCentury", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=yearofcentury");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        int int11 = property9.getMaximumValueOverall();
        org.joda.time.DurationField durationField12 = property9.getRangeDurationField();
        int int13 = property9.getMaximumValue();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        boolean boolean4 = file1.exists();
        java.io.File file5 = file1.getParentFile();
        boolean boolean6 = file1.isFile();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime8.getFields();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readablePeriod10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plus(readableDuration13);
        int[] intArray15 = localDateTime11.getValues();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(intArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[2022, 4, 22, 35425890]");
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("en-US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'en-US' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("millisOfSecond", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler0 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file2 = new java.io.File("");
        java.io.File file4 = new java.io.File(file2, "hi!");
        boolean boolean5 = file2.exists();
        boolean boolean6 = file2.exists();
        boolean boolean8 = file2.setReadable(true);
        long long9 = file2.getFreeSpace();
        java.io.File[] fileArray10 = new java.io.File[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap11 = zoneInfoCompiler0.compile(file2, fileArray10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Destination directory doesn't exist: ");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertEquals(file4.getParent(), "/");
        org.junit.Assert.assertEquals(file4.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(fileArray10);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        java.util.Locale locale1 = new java.util.Locale("\u5fb7\u6587");
        java.lang.String str2 = locale1.getISO3Country();
        org.junit.Assert.assertEquals(locale1.toString(), "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = dateTimeZone0.equals(obj1);
        java.lang.String str3 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, (long) (byte) -1);
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.lang.String str9 = dateTimeZone4.getName((long) (byte) 10, locale8);
        java.util.Locale locale11 = java.util.Locale.ITALY;
        org.joda.time.tz.NameProvider nameProvider12 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.lang.String str14 = locale13.getCountry();
        java.lang.String str15 = locale13.getDisplayScript();
        java.lang.String str18 = nameProvider12.getName(locale13, "hi!", "");
        java.lang.String str19 = locale11.getDisplayCountry(locale13);
        java.lang.String str20 = dateTimeZone4.getShortName((long) 50, locale11);
        java.lang.String str21 = locale11.getDisplayVariant();
        java.lang.Object obj22 = locale11.clone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it_IT");
        org.junit.Assert.assertNotNull(nameProvider12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Italien" + "'", str19, "Italien");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "it_IT");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "it_IT");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "it_IT");
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("German", (double) 1.0f);
        double double3 = languageRange2.getWeight();
        java.io.File file5 = new java.io.File("");
        java.io.File file6 = file5.getCanonicalFile();
        boolean boolean7 = file5.mkdir();
        java.io.File file8 = file5.getAbsoluteFile();
        boolean boolean9 = languageRange2.equals((java.lang.Object) file8);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "");
        org.junit.Assert.assertNotNull(file6);
// flaky:         org.junit.Assert.assertEquals(file6.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(file8);
// flaky:         org.junit.Assert.assertEquals(file8.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file8.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(42);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        long long4 = file3.getUsableSpace();
        java.io.File file5 = file3.getAbsoluteFile();
        java.io.File file7 = new java.io.File("");
        java.io.File file9 = new java.io.File(file7, "hi!");
        boolean boolean10 = file7.exists();
        boolean boolean12 = file7.setReadable(true);
        java.net.URL uRL13 = file7.toURL();
        boolean boolean14 = file3.renameTo(file7);
        boolean boolean15 = file3.isAbsolute();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 280451805184L + "'", long4 == 280451805184L);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "/");
        org.junit.Assert.assertEquals(file5.toString(), "/hi!");
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "");
        org.junit.Assert.assertEquals(file9.getParent(), "/");
        org.junit.Assert.assertEquals(file9.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(uRL13);
// flaky:         org.junit.Assert.assertEquals(uRL13.toString(), "file:/experiment");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file2 = java.io.File.createTempFile("\u5fb7\u6587", "Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Prefix string too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = dateTimeZone0.equals(obj1);
        java.lang.String str3 = dateTimeZone0.toString();
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale5.getDisplayScript(locale7);
        java.lang.String str9 = dateTimeZone0.getName((long) ':', locale7);
        java.lang.String str10 = locale7.getLanguage();
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleAttributes();
        java.util.Collection<java.lang.String> strCollection12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = strSet11.removeAll(strCollection12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u5fb7\u6587" + "'", str6, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getExtension('/');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: /");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray1 = strSet0.toArray();
        boolean boolean3 = strSet0.add("");
        java.util.Set<java.lang.String> strSet4 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray5 = strSet4.toArray();
        boolean boolean7 = strSet4.add("");
        java.util.stream.Stream<java.lang.String> strStream8 = strSet4.parallelStream();
        boolean boolean9 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet4);
        java.lang.String[] strArray11 = new java.lang.String[] { "/experiment" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        boolean boolean15 = strSet12.contains((java.lang.Object) (-1));
        boolean boolean16 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet12);
        java.util.stream.Stream<java.lang.String> strStream17 = strSet0.stream();
        boolean boolean19 = strSet0.add("USA");
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strStream17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        int int14 = localDateTime5.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.minusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime18 = localDateTime5.withEra((int) (short) 1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundHalfCeilingCopy();
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        int int22 = property19.getMaximumShortTextLength(locale21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        boolean boolean29 = localDateTime24.isBefore((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property32 = localDateTime28.yearOfCentury();
        java.lang.String str33 = property32.getName();
        org.joda.time.LocalDateTime localDateTime35 = property32.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        boolean boolean42 = localDateTime37.isBefore((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime41, chronology43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.DateTime dateTime46 = localDateTime41.toDateTime(readableInstant45);
        org.joda.time.DateTime dateTime47 = localDateTime35.toDateTime((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTime47.getZone();
        java.lang.String str50 = dateTimeZone48.getName((long) '#');
        int int52 = dateTimeZone48.getStandardOffset(1L);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone48);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((java.lang.Object) property19, dateTimeZone48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "yearOfCentury" + "'", str33, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00" + "'", str50, "+00:00");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) (short) -1);
        int int13 = property9.getMaximumValue();
        int int14 = property9.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime15 = property9.getLocalDateTime();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        int int14 = localDateTime5.getWeekyear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        boolean boolean23 = localDateTime18.isBefore((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray26 = localDateTime25.getFields();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.plus(readablePeriod27);
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime();
        org.joda.time.Instant instant30 = dateTime29.toInstant();
        boolean boolean31 = property15.equals((java.lang.Object) instant30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime33 = property15.setCopy("Englisch");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Englisch\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldArray26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "Italien");
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setRegion("2022-02-11T09:50:19.923");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 2022-02-11T09:50:19.923 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDateTime5.getValue(793);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 793");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '??' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("German", (double) 1.0f);
        java.lang.String str3 = languageRange2.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] { languageRange2 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap15);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale[] localeArray20 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.Locale.FilteringMode filteringMode23 = null;
        java.util.List<java.util.Locale> localeList24 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList21, filteringMode23);
        java.util.Locale locale25 = java.util.Locale.lookup(languageRangeList16, (java.util.Collection<java.util.Locale>) localeList21);
        java.util.Collection<java.util.Locale> localeCollection26 = null;
        java.util.Locale.FilteringMode filteringMode27 = null;
        java.util.List<java.util.Locale> localeList28 = java.util.Locale.filter(languageRangeList16, localeCollection26, filteringMode27);
        java.util.Locale locale29 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList28);
        java.util.Locale.FilteringMode filteringMode30 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList31 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList28, filteringMode30);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Locale[] localeArray35 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.Locale.FilteringMode filteringMode38 = null;
        java.util.List<java.util.Locale> localeList39 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.util.Locale>) localeList36, filteringMode38);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList36, filteringMode40);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj43 = new java.lang.Object();
        boolean boolean44 = dateTimeZone42.equals(obj43);
        java.lang.String str45 = dateTimeZone42.toString();
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.lang.String str48 = locale47.getDisplayLanguage();
        java.util.Locale locale49 = java.util.Locale.US;
        java.lang.String str50 = locale47.getDisplayScript(locale49);
        java.lang.String str51 = dateTimeZone42.getName((long) ':', locale49);
        java.lang.String str52 = locale49.getLanguage();
        org.joda.time.tz.NameProvider nameProvider53 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale54 = java.util.Locale.GERMAN;
        java.lang.String str55 = locale54.getCountry();
        java.lang.String str56 = locale54.getDisplayScript();
        java.lang.String str59 = nameProvider53.getName(locale54, "hi!", "");
        java.util.Locale locale60 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet61 = locale60.getUnicodeLocaleKeys();
        java.lang.String str64 = nameProvider53.getName(locale60, "\u5fb7\u6587", "");
        java.lang.String str65 = locale49.getDisplayVariant(locale60);
        java.util.Set<java.lang.String> strSet66 = locale49.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strSet66);
        java.util.Collection<java.lang.String> strCollection68 = null;
        java.util.Locale.LanguageRange[] languageRangeArray69 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList70 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70, languageRangeArray69);
        java.util.Locale[] localeArray72 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList73 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList73, localeArray72);
        java.util.Locale.FilteringMode filteringMode75 = null;
        java.util.List<java.util.Locale> localeList76 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList70, (java.util.Collection<java.util.Locale>) localeList73, filteringMode75);
        java.util.Set<java.lang.String> strSet77 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray78 = strSet77.toArray();
        boolean boolean80 = strSet77.add("");
        java.util.stream.Stream<java.lang.String> strStream81 = strSet77.parallelStream();
        java.util.Set<java.lang.String> strSet82 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray83 = strSet82.toArray();
        boolean boolean85 = strSet82.add("");
        java.util.Set<java.lang.String> strSet86 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray87 = strSet86.toArray();
        boolean boolean88 = strSet82.addAll((java.util.Collection<java.lang.String>) strSet86);
        boolean boolean89 = strSet77.retainAll((java.util.Collection<java.lang.String>) strSet82);
        java.util.Locale.FilteringMode filteringMode90 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList91 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList70, (java.util.Collection<java.lang.String>) strSet82, filteringMode90);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strCollection68, filteringMode90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "german" + "'", str3, "german");
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localeList24);
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertNotNull(localeList28);
        org.junit.Assert.assertNull(locale29);
        org.junit.Assert.assertTrue("'" + filteringMode30 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode30.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localeList39);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UTC" + "'", str45, "UTC");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "de");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\u5fb7\u6587" + "'", str48, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00" + "'", str51, "+00:00");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "en" + "'", str52, "en");
        org.junit.Assert.assertNotNull(nameProvider53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "de");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en");
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(languageRangeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(localeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(localeList76);
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[USA]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[USA]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(strStream81);
        org.junit.Assert.assertNotNull(strSet82);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[, USA]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[, USA]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(strSet86);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray87), "[, USA]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray87), "[, USA]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + filteringMode90 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode90.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList91);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.size();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.dayOfYear();
        int int5 = localDateTime1.getWeekOfWeekyear();
        java.lang.String str6 = localDateTime1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDateTime1.getValue(92);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 92");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022-02-11T09:50:27.183" + "'", str6, "2022-02-11T09:50:27.183");
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        java.io.File file1 = new java.io.File("minuteOfHour");
        java.lang.String str2 = file1.toString();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "minuteOfHour");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "minuteOfHour" + "'", str2, "minuteOfHour");
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setRegion("en-US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: en-US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        int int14 = localDateTime5.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.minusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime18 = localDateTime5.plusMillis(22);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime5.withEra(1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusDays(919);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withMonthOfYear(92);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 92 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("German");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = locale1.getLanguage();
        java.lang.String str5 = locale1.getExtension('x');
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "german");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "german" + "'", str3, "german");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime8.getFields();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readablePeriod10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        int int13 = localDateTime11.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusSeconds((int) 'x');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withYearOfEra(898);
        org.joda.time.DurationFieldType durationFieldType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withFieldAdded(durationFieldType18, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 453 + "'", int13 == 453);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        boolean boolean19 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime18, chronology20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime18.toDateTime(readableInstant22);
        org.joda.time.DateTime dateTime24 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Instant instant25 = dateTime24.toInstant();
        org.joda.time.Chronology chronology26 = instant25.getChronology();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        boolean boolean34 = localDateTime29.isBefore((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime33, chronology35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localDateTime33.toDateTime(readableInstant37);
        long long39 = dateTime38.getMillis();
        org.joda.time.DateTime dateTime40 = localDateTime27.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime42 = localDateTime27.withDayOfWeek(18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 18 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTime38);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1644573027507L + "'", long39 == 1644573027507L);
        org.junit.Assert.assertNotNull(dateTime40);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Property[monthOfYear]", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=property[monthofyear]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Set<java.lang.String> strSet1 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray2 = strSet1.toArray();
        boolean boolean4 = strSet1.add("");
        java.util.Set<java.lang.String> strSet5 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray6 = strSet5.toArray();
        boolean boolean8 = strSet5.add("");
        java.util.stream.Stream<java.lang.String> strStream9 = strSet5.parallelStream();
        boolean boolean10 = strSet1.retainAll((java.util.Collection<java.lang.String>) strSet5);
        boolean boolean11 = strSet5.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap15);
        java.util.Set<java.lang.String> strSet17 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale.FilteringMode filteringMode18 = null;
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags(languageRangeList16, (java.util.Collection<java.lang.String>) strSet17, filteringMode18);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList16, strMap20);
        java.util.Set<java.lang.String> strSet22 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray23 = strSet22.toArray();
        boolean boolean25 = strSet22.add("");
        java.util.Set<java.lang.String> strSet26 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray27 = strSet26.toArray();
        boolean boolean29 = strSet26.add("");
        java.util.stream.Stream<java.lang.String> strStream30 = strSet26.parallelStream();
        boolean boolean31 = strSet22.retainAll((java.util.Collection<java.lang.String>) strSet26);
        java.util.Spliterator<java.lang.String> strSpliterator32 = strSet26.spliterator();
        java.util.Set<java.lang.String> strSet33 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray34 = strSet33.toArray();
        boolean boolean36 = strSet33.add("");
        java.util.stream.Stream<java.lang.String> strStream37 = strSet33.parallelStream();
        boolean boolean38 = strSet26.removeAll((java.util.Collection<java.lang.String>) strSet33);
        strSet26.clear();
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags(languageRangeList21, (java.util.Collection<java.lang.String>) strSet26, filteringMode40);
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, strMap45);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.util.Locale[] localeArray50 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList51 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList51, localeArray50);
        java.util.Locale.FilteringMode filteringMode53 = null;
        java.util.List<java.util.Locale> localeList54 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.util.Locale>) localeList51, filteringMode53);
        java.util.Locale.FilteringMode filteringMode55 = null;
        java.util.List<java.util.Locale> localeList56 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.util.Locale>) localeList51, filteringMode55);
        java.util.Locale.LanguageRange[] languageRangeArray57 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList58 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58, languageRangeArray57);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap60 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, strMap60);
        java.util.Set<java.lang.String> strSet62 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale.FilteringMode filteringMode63 = null;
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags(languageRangeList61, (java.util.Collection<java.lang.String>) strSet62, filteringMode63);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap65 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList66 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList61, strMap65);
        java.util.Set<java.lang.String> strSet67 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray68 = strSet67.toArray();
        boolean boolean70 = strSet67.add("");
        java.util.Set<java.lang.String> strSet71 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray72 = strSet71.toArray();
        boolean boolean74 = strSet71.add("");
        java.util.stream.Stream<java.lang.String> strStream75 = strSet71.parallelStream();
        boolean boolean76 = strSet67.retainAll((java.util.Collection<java.lang.String>) strSet71);
        java.util.Spliterator<java.lang.String> strSpliterator77 = strSet71.spliterator();
        java.util.Set<java.lang.String> strSet78 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray79 = strSet78.toArray();
        boolean boolean81 = strSet78.add("");
        java.util.stream.Stream<java.lang.String> strStream82 = strSet78.parallelStream();
        boolean boolean83 = strSet71.removeAll((java.util.Collection<java.lang.String>) strSet78);
        strSet71.clear();
        java.util.Locale.FilteringMode filteringMode85 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags(languageRangeList66, (java.util.Collection<java.lang.String>) strSet71, filteringMode85);
        java.util.List<java.util.Locale> localeList87 = java.util.Locale.filter(languageRangeList21, (java.util.Collection<java.util.Locale>) localeList56, filteringMode85);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strSet5, filteringMode85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[, USA]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[, USA]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, USA]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, USA]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[, USA]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[, USA]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[, USA]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[, USA]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strStream30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strSpliterator32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[, USA]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[, USA]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strStream37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(localeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(localeList54);
        org.junit.Assert.assertNotNull(localeList56);
        org.junit.Assert.assertNotNull(languageRangeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(languageRangeList66);
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strStream75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strSpliterator77);
        org.junit.Assert.assertNotNull(strSet78);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(strStream82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + filteringMode85 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode85.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(localeList87);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("2021-02-11T09:50:18.640Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2021-02-11T09:50:18.640Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.US;
        java.lang.String str3 = locale0.getDisplayScript(locale2);
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = strSet4.add("CN");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Deutsch" + "'", str1, "Deutsch");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        java.io.File file1 = new java.io.File("");
        long long2 = file1.getFreeSpace();
        boolean boolean5 = file1.setWritable(true, false);
        boolean boolean6 = file1.setReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = file1.createNewFile();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        int int11 = property9.getMaximumValueOverall();
        java.lang.String str12 = property9.getName();
        org.joda.time.LocalDateTime localDateTime14 = property9.addToCopy(99);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.centuryOfEra();
        java.util.Locale locale17 = java.util.Locale.ITALY;
        org.joda.time.tz.NameProvider nameProvider18 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.lang.String str20 = locale19.getCountry();
        java.lang.String str21 = locale19.getDisplayScript();
        java.lang.String str24 = nameProvider18.getName(locale19, "hi!", "");
        java.lang.String str25 = locale17.getDisplayCountry(locale19);
        java.lang.String str26 = locale19.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = property15.setCopy("2022-02-11T09:50:22.869", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:50:22.869\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "yearOfCentury" + "'", str12, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it_IT");
        org.junit.Assert.assertNotNull(nameProvider18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Italien" + "'", str25, "Italien");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setVariant("Property[weekyear]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Property[weekyear] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("de");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"de\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(35424224, 793);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 793");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        timeZone0.setRawOffset(22);
        boolean boolean4 = timeZone0.observesDaylightTime();
        java.util.TimeZone timeZone5 = null;
        boolean boolean6 = timeZone0.hasSameRules(timeZone5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) 100, chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear(0);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        boolean boolean21 = localDateTime16.isBefore((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray24 = localDateTime23.getFields();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.plus(readablePeriod25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusWeeks(1);
        boolean boolean29 = localDateTime10.isBefore((org.joda.time.ReadablePartial) localDateTime26);
        boolean boolean30 = localDateTime7.isBefore((org.joda.time.ReadablePartial) localDateTime10);
        java.util.Date date31 = localDateTime7.toDate();
        boolean boolean32 = timeZone0.inDaylightTime(date31);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldArray24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Fri Feb 11 09:50:28 GMT+00:00 2022");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("feb");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"feb\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setVariant("2021-02-11T09:50:18.640Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 2021-02-11T09:50:18.640Z [at index 5]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        boolean boolean7 = localDateTime2.isBefore((org.joda.time.ReadablePartial) localDateTime6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime6, chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime6.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        boolean boolean17 = localDateTime12.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property20 = localDateTime16.yearOfCentury();
        java.lang.String str21 = property20.getName();
        org.joda.time.LocalDateTime localDateTime23 = property20.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        boolean boolean30 = localDateTime25.isBefore((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime29, chronology31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.DateTime dateTime34 = localDateTime29.toDateTime(readableInstant33);
        org.joda.time.DateTime dateTime35 = localDateTime23.toDateTime((org.joda.time.ReadableInstant) dateTime34);
        int int36 = property10.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        boolean boolean43 = localDateTime38.isBefore((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime42, chronology44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.DateTime dateTime47 = localDateTime42.toDateTime(readableInstant46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime42.weekyear();
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.lang.String str51 = locale50.getDisplayLanguage();
        boolean boolean52 = locale50.hasExtensions();
        java.util.Set<java.lang.String> strSet53 = locale50.getUnicodeLocaleAttributes();
        org.joda.time.LocalDateTime localDateTime54 = property48.setCopy("22", locale50);
        boolean boolean55 = property10.equals((java.lang.Object) locale50);
        boolean boolean56 = locale0.equals((java.lang.Object) property10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "yearOfCentury" + "'", str21, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Deutsch" + "'", str51, "Deutsch");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        boolean boolean19 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        int int20 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        boolean boolean27 = localDateTime22.isBefore((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime26, chronology28);
        boolean boolean30 = localDateTime10.isAfter((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.Chronology chronology31 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 793, chronology31);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 52, chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(6, 335, (int) (byte) 100, 17, 622, 400, 463, chronology31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 622 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(chronology31);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) ':', 209, (int) '/', (int) (byte) 10, 580);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 580 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(824);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime8.getFields();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readablePeriod10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plus(readableDuration13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withYearOfEra(489);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfCentury();
        org.joda.time.tz.NameProvider nameProvider19 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.weekOfWeekyear();
        java.lang.String str23 = property22.getAsShortText();
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.lang.String str25 = locale24.getCountry();
        java.util.Locale locale26 = java.util.Locale.ITALY;
        org.joda.time.tz.NameProvider nameProvider27 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.lang.String str29 = locale28.getCountry();
        java.lang.String str30 = locale28.getDisplayScript();
        java.lang.String str33 = nameProvider27.getName(locale28, "hi!", "");
        java.lang.String str34 = locale26.getDisplayCountry(locale28);
        java.lang.String str35 = locale24.getDisplayVariant(locale28);
        int int36 = property22.getMaximumShortTextLength(locale24);
        java.lang.String str39 = nameProvider19.getName(locale24, "CN", "java.io.IOException: german");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime40 = property17.setCopy("Property[weekyear]", locale24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[weekyear]\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(nameProvider19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "6" + "'", str23, "6");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it_IT");
        org.junit.Assert.assertNotNull(nameProvider27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Italien" + "'", str34, "Italien");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale.FilteringMode filteringMode6 = null;
        java.util.List<java.util.Locale> localeList7 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4, filteringMode6);
        java.util.Set<java.lang.String> strSet8 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray9 = strSet8.toArray();
        boolean boolean11 = strSet8.add("");
        java.util.stream.Stream<java.lang.String> strStream12 = strSet8.parallelStream();
        java.util.Set<java.lang.String> strSet13 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray14 = strSet13.toArray();
        boolean boolean16 = strSet13.add("");
        java.util.Set<java.lang.String> strSet17 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray18 = strSet17.toArray();
        boolean boolean19 = strSet13.addAll((java.util.Collection<java.lang.String>) strSet17);
        boolean boolean20 = strSet8.retainAll((java.util.Collection<java.lang.String>) strSet13);
        java.util.Locale.FilteringMode filteringMode21 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet13, filteringMode21);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Locale[] localeArray29 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList30 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList30, localeArray29);
        java.util.Locale.FilteringMode filteringMode32 = null;
        java.util.List<java.util.Locale> localeList33 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.util.Locale>) localeList30, filteringMode32);
        java.util.Locale.FilteringMode filteringMode34 = null;
        java.util.List<java.util.Locale> localeList35 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.util.Locale>) localeList30, filteringMode34);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.util.Locale[] localeArray42 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList43 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList43, localeArray42);
        java.util.Locale.FilteringMode filteringMode45 = null;
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.util.Locale>) localeList43, filteringMode45);
        java.util.Locale.FilteringMode filteringMode47 = null;
        java.util.List<java.util.Locale> localeList48 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList43, filteringMode47);
        java.util.Locale.FilteringMode filteringMode49 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList50 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.util.Locale>) localeList48, filteringMode49);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = strSet13.remove((java.lang.Object) localeList48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.ArrayList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localeList7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + filteringMode21 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode21.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localeList33);
        org.junit.Assert.assertNotNull(localeList35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(localeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(localeList48);
        org.junit.Assert.assertTrue("'" + filteringMode49 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode49.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList50);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setScript("15");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 15 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str5 = nameProvider0.getShortName(locale1, "/hi!", "2022-04-15T09:50:26.425");
        java.lang.Object obj6 = locale1.clone();
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "fr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "fr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "fr");
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = dateTimeZone8.equals(obj9);
        java.lang.String str11 = dateTimeZone8.toString();
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.util.Locale locale15 = java.util.Locale.US;
        java.lang.String str16 = locale13.getDisplayScript(locale15);
        java.lang.String str17 = dateTimeZone8.getName((long) ':', locale15);
        java.lang.String str18 = locale15.getLanguage();
        java.util.Set<java.lang.String> strSet19 = locale15.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (byte) 100, chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withWeekyear(0);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.minus(readablePeriod25);
        boolean boolean27 = strSet19.remove((java.lang.Object) localDateTime22);
        org.joda.time.Chronology chronology28 = localDateTime22.getChronology();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(4096L, chronology28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((int) '#', 24, 25, (int) (short) -1, 501, 0, 59, chronology28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Deutsch" + "'", str14, "Deutsch");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en" + "'", str18, "en");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(chronology28);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) 'x');
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = dateTimeZone0.equals(obj1);
        java.lang.String str3 = dateTimeZone0.toString();
        java.lang.String str5 = dateTimeZone0.getShortName(1L);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        timeZone6.setID("\u53f0\u7063");
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        boolean boolean15 = localDateTime10.isBefore((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property18 = localDateTime14.yearOfCentury();
        java.lang.String str19 = property18.getName();
        org.joda.time.LocalDateTime localDateTime21 = property18.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        boolean boolean28 = localDateTime23.isBefore((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime27, chronology29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.DateTime dateTime32 = localDateTime27.toDateTime(readableInstant31);
        org.joda.time.DateTime dateTime33 = localDateTime21.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        java.util.Date date34 = localDateTime21.toDate();
        boolean boolean35 = timeZone6.inDaylightTime(date34);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "yearOfCentury" + "'", str19, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Thu Feb 11 09:50:29 GMT+00:00 2021");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        int int12 = localDateTime5.getYear();
        int int13 = localDateTime5.getYearOfEra();
        org.joda.time.LocalDateTime.Property property14 = localDateTime5.year();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.withDayOfYear(329);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withMinuteOfHour(501);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 501 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        boolean boolean18 = localDateTime13.isBefore((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime17, chronology19);
        boolean boolean21 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.Chronology chronology22 = localDateTime1.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField24 = localDateTime1.getField(501);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 501");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        boolean boolean19 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime18, chronology20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime18.toDateTime(readableInstant22);
        org.joda.time.DateTime dateTime24 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime24.getZone();
        java.lang.String str27 = dateTimeZone25.getName((long) '#');
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        int int30 = localDateTime29.size();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.yearOfCentury();
        boolean boolean32 = dateTimeZone25.isLocalDateTimeGap(localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        boolean boolean43 = localDateTime38.isBefore((org.joda.time.ReadablePartial) localDateTime42);
        int int44 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        int int45 = localDateTime38.getYear();
        int int46 = localDateTime38.getYearOfEra();
        boolean boolean47 = dateTimeZone25.isLocalDateTimeGap(localDateTime38);
        int int49 = dateTimeZone25.getOffsetFromLocal(280452325376L);
        java.lang.String str51 = dateTimeZone25.getNameKey((long) 14);
        boolean boolean53 = dateTimeZone25.isStandardOffset(899418565L);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2022 + "'", int45 == 2022);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2022 + "'", int46 == 2022);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "UTC" + "'", str51, "UTC");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("German", (double) 1.0f);
        java.lang.String str3 = languageRange2.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] { languageRange2 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap15);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale[] localeArray20 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.Locale.FilteringMode filteringMode23 = null;
        java.util.List<java.util.Locale> localeList24 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList21, filteringMode23);
        java.util.Locale locale25 = java.util.Locale.lookup(languageRangeList16, (java.util.Collection<java.util.Locale>) localeList21);
        java.util.Collection<java.util.Locale> localeCollection26 = null;
        java.util.Locale.FilteringMode filteringMode27 = null;
        java.util.List<java.util.Locale> localeList28 = java.util.Locale.filter(languageRangeList16, localeCollection26, filteringMode27);
        java.util.Locale locale29 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList28);
        java.util.Locale.FilteringMode filteringMode30 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList31 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList28, filteringMode30);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Locale[] localeArray35 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.Locale.FilteringMode filteringMode38 = null;
        java.util.List<java.util.Locale> localeList39 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.util.Locale>) localeList36, filteringMode38);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList36, filteringMode40);
        java.util.Set<java.lang.String> strSet42 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray43 = strSet42.toArray();
        boolean boolean45 = strSet42.add("");
        java.util.Set<java.lang.String> strSet46 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray47 = strSet46.toArray();
        boolean boolean49 = strSet46.add("");
        java.util.stream.Stream<java.lang.String> strStream50 = strSet46.parallelStream();
        boolean boolean51 = strSet42.retainAll((java.util.Collection<java.lang.String>) strSet46);
        java.util.Spliterator<java.lang.String> strSpliterator52 = strSet46.spliterator();
        java.util.Set<java.lang.String> strSet53 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray54 = strSet53.toArray();
        boolean boolean56 = strSet53.add("");
        java.util.stream.Stream<java.lang.String> strStream57 = strSet53.parallelStream();
        boolean boolean58 = strSet46.removeAll((java.util.Collection<java.lang.String>) strSet53);
        java.util.Locale.LanguageRange[] languageRangeArray59 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList60 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60, languageRangeArray59);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap62 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, strMap62);
        java.util.Set<java.lang.String> strSet64 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale.FilteringMode filteringMode65 = null;
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags(languageRangeList63, (java.util.Collection<java.lang.String>) strSet64, filteringMode65);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList63, strMap67);
        java.util.Set<java.lang.String> strSet69 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray70 = strSet69.toArray();
        boolean boolean72 = strSet69.add("");
        java.util.Set<java.lang.String> strSet73 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray74 = strSet73.toArray();
        boolean boolean76 = strSet73.add("");
        java.util.stream.Stream<java.lang.String> strStream77 = strSet73.parallelStream();
        boolean boolean78 = strSet69.retainAll((java.util.Collection<java.lang.String>) strSet73);
        java.util.Spliterator<java.lang.String> strSpliterator79 = strSet73.spliterator();
        java.util.Set<java.lang.String> strSet80 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray81 = strSet80.toArray();
        boolean boolean83 = strSet80.add("");
        java.util.stream.Stream<java.lang.String> strStream84 = strSet80.parallelStream();
        boolean boolean85 = strSet73.removeAll((java.util.Collection<java.lang.String>) strSet80);
        strSet73.clear();
        java.util.Locale.FilteringMode filteringMode87 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags(languageRangeList68, (java.util.Collection<java.lang.String>) strSet73, filteringMode87);
        java.util.List<java.lang.String> strList89 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strSet46, filteringMode87);
        java.util.Locale locale90 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet91 = locale90.getUnicodeLocaleKeys();
        java.lang.Object[] objArray92 = strSet91.toArray();
        java.net.URI[] uRIArray93 = new java.net.URI[] {};
        java.net.URI[] uRIArray94 = strSet91.toArray(uRIArray93);
        java.lang.String str95 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strSet91);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "german" + "'", str3, "german");
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localeList24);
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertNotNull(localeList28);
        org.junit.Assert.assertNull(locale29);
        org.junit.Assert.assertTrue("'" + filteringMode30 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode30.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localeList39);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strStream50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strSpliterator52);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strStream57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(languageRangeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(languageRangeList63);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strStream77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strSpliterator79);
        org.junit.Assert.assertNotNull(strSet80);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(strStream84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + filteringMode87 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode87.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "en");
        org.junit.Assert.assertNotNull(strSet91);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[]");
        org.junit.Assert.assertNotNull(uRIArray93);
        org.junit.Assert.assertNotNull(uRIArray94);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setExtension('a', "dayOfYear");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: dayOfYear [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        java.io.File file3 = new java.io.File("");
        java.io.File file4 = file3.getCanonicalFile();
        long long5 = file3.getFreeSpace();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = java.io.File.createTempFile("15", "15", file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Prefix string too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "");
        org.junit.Assert.assertNotNull(file4);
// flaky:         org.junit.Assert.assertEquals(file4.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file4.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        boolean boolean12 = localDateTime7.isBefore((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property15 = localDateTime11.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekOfWeekyear();
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.lang.String str20 = locale19.getDisplayLanguage();
        boolean boolean21 = locale19.hasExtensions();
        int int22 = property18.getMaximumTextLength(locale19);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusMillis(99);
        int int26 = property18.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property18.getFieldType();
        boolean boolean28 = localDateTime11.isSupported(dateTimeFieldType27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = localDateTime5.withField(dateTimeFieldType27, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u5fb7\u6587" + "'", str20, "\u5fb7\u6587");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        java.io.File file1 = new java.io.File("");
        boolean boolean2 = file1.canExecute();
        java.lang.String str3 = file1.getParent();
        boolean boolean4 = file1.mkdir();
        java.io.File file5 = file1.getAbsoluteFile();
        java.io.File file6 = file5.getAbsoluteFile();
        long long7 = file6.length();
        java.lang.String str8 = file6.getParent();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(file5);
// flaky:         org.junit.Assert.assertEquals(file5.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file5.toString(), "/experiment");
        org.junit.Assert.assertNotNull(file6);
// flaky:         org.junit.Assert.assertEquals(file6.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4096L + "'", long7 == 4096L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/" + "'", str8, "/");
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        boolean boolean2 = timeZone0.observesDaylightTime();
        timeZone0.setRawOffset(584);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = timeZone0.getOffset(824, 53, 793, 583, 0, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era 824");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        java.lang.String str4 = timeZone0.getID();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = timeZone0.getDisplayName(false, 209);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 209");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusMillis(99);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfDay((-4));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        int int14 = localDateTime5.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.minusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime18 = localDateTime5.plusMillis(22);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime5.minusYears(576);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusWeeks(0);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.plusWeeks((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = localDateTime22.withMinuteOfHour((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        timeZone0.setRawOffset(22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        int int11 = property9.getMaximumValueOverall();
        java.lang.String str12 = property9.getName();
        org.joda.time.LocalDateTime localDateTime14 = property9.addToCopy(99);
        boolean boolean15 = property9.isLeap();
        org.joda.time.Interval interval16 = property9.toInterval();
        int int17 = property9.getMinimumValueOverall();
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.lang.String str20 = locale19.getISO3Country();
        java.util.Set<java.lang.String> strSet21 = locale19.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = property9.setCopy("2022-02-18T10:23:59.961", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-18T10:23:59.961\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "yearOfCentury" + "'", str12, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        long long4 = file3.getUsableSpace();
        java.io.File file5 = file3.getAbsoluteFile();
        java.io.File file8 = new java.io.File("hi!", "hi!");
        boolean boolean9 = file8.mkdirs();
        boolean boolean10 = file3.renameTo(file8);
        boolean boolean11 = file8.canWrite();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 280451264512L + "'", long4 == 280451264512L);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "/");
        org.junit.Assert.assertEquals(file5.toString(), "/hi!");
        org.junit.Assert.assertEquals(file8.getParent(), "hi!");
        org.junit.Assert.assertEquals(file8.toString(), "hi!/hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        java.util.Locale locale2 = new java.util.Locale("2022-02-18T10:23:59.961", "9");
        java.lang.String str3 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "2022-02-18t10:23:59.961_9");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-18t10:23:59.961_9" + "'", str3, "2022-02-18t10:23:59.961_9");
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        timeZone0.setID("");
        timeZone0.setRawOffset(10);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        boolean boolean9 = timeZone8.observesDaylightTime();
        int int11 = timeZone8.getOffset((long) (byte) 0);
        timeZone8.setID("");
        boolean boolean14 = timeZone0.hasSameRules(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        boolean boolean21 = localDateTime16.isBefore((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property24 = localDateTime20.yearOfCentury();
        java.lang.String str25 = property24.getName();
        org.joda.time.LocalDateTime localDateTime27 = property24.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        boolean boolean34 = localDateTime29.isBefore((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime33, chronology35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localDateTime33.toDateTime(readableInstant37);
        org.joda.time.DateTime dateTime39 = localDateTime27.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        java.util.Date date40 = localDateTime27.toDate();
        boolean boolean41 = timeZone0.inDaylightTime(date40);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 22 + "'", int11 == 22);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "yearOfCentury" + "'", str25, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Thu Feb 11 09:50:30 GMT+00:00 2021");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.size();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusDays((int) '4');
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.minuteOfHour();
        int int7 = localDateTime5.size();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusHours(576);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "Italien");
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setExtension('/', "\u7f8e\u570b");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: / [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\ub3c5\uc77c\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        java.io.File file4 = file3.getParentFile();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        boolean boolean11 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime10.yearOfCentury();
        java.lang.String str15 = property14.getName();
        org.joda.time.LocalDateTime localDateTime17 = property14.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        boolean boolean24 = localDateTime19.isBefore((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime23, chronology25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.DateTime dateTime28 = localDateTime23.toDateTime(readableInstant27);
        org.joda.time.DateTime dateTime29 = localDateTime17.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime29.getZone();
        java.lang.String str32 = dateTimeZone30.getName((long) '#');
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        int int35 = localDateTime34.size();
        org.joda.time.LocalDateTime.Property property36 = localDateTime34.yearOfCentury();
        boolean boolean37 = dateTimeZone30.isLocalDateTimeGap(localDateTime34);
        boolean boolean38 = file3.equals((java.lang.Object) dateTimeZone30);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "/");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "yearOfCentury" + "'", str15, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Set<java.lang.String> strSet5 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale.FilteringMode filteringMode6 = null;
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strSet5, filteringMode6);
        java.util.Set<java.lang.String> strSet8 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray9 = strSet8.toArray();
        boolean boolean11 = strSet8.add("");
        java.util.Set<java.lang.String> strSet12 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray13 = strSet12.toArray();
        boolean boolean15 = strSet12.add("");
        java.util.stream.Stream<java.lang.String> strStream16 = strSet12.parallelStream();
        boolean boolean17 = strSet8.retainAll((java.util.Collection<java.lang.String>) strSet12);
        java.util.Spliterator<java.lang.String> strSpliterator18 = strSet12.spliterator();
        boolean boolean19 = strSet5.containsAll((java.util.Collection<java.lang.String>) strSet12);
        java.util.Set<java.lang.String> strSet20 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray21 = strSet20.toArray();
        boolean boolean23 = strSet20.add("");
        java.util.Set<java.lang.String> strSet24 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray25 = strSet24.toArray();
        boolean boolean27 = strSet24.add("");
        java.util.stream.Stream<java.lang.String> strStream28 = strSet24.parallelStream();
        boolean boolean29 = strSet20.retainAll((java.util.Collection<java.lang.String>) strSet24);
        boolean boolean30 = strSet24.isEmpty();
        boolean boolean31 = strSet12.addAll((java.util.Collection<java.lang.String>) strSet24);
        java.lang.Object obj32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = strSet24.contains(obj32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[, 2022]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[, 2022]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[, 2022]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[, 2022]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[, 2022]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[, 2022]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(objArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[, 2022]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[, 2022]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        org.joda.time.tz.NameProvider nameProvider1 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.lang.String str3 = locale2.getCountry();
        java.lang.String str4 = locale2.getDisplayScript();
        java.lang.String str7 = nameProvider1.getName(locale2, "hi!", "");
        java.lang.String str8 = locale0.getDisplayCountry(locale2);
        java.lang.String str9 = locale2.getDisplayVariant();
        java.lang.String str10 = locale2.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(nameProvider1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italien" + "'", str8, "Italien");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "de" + "'", str10, "de");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler0 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file2 = new java.io.File("");
        java.io.File file4 = new java.io.File(file2, "hi!");
        long long5 = file4.length();
        java.io.File file8 = java.io.File.createTempFile("german", "feb");
        java.io.File file10 = new java.io.File("");
        java.io.File file12 = new java.io.File(file10, "hi!");
        boolean boolean13 = file10.exists();
        java.io.File[] fileArray14 = new java.io.File[] { file8, file10 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap15 = zoneInfoCompiler0.compile(file4, fileArray14);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertEquals(file4.getParent(), "/");
        org.junit.Assert.assertEquals(file4.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 4096L + "'", long5 == 4096L);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file8.toString(), "/tmp/german5836349934680158348feb");
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "");
        org.junit.Assert.assertEquals(file12.getParent(), "/");
        org.junit.Assert.assertEquals(file12.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fileArray14);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(reader0, (int) ':');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(reader0, 92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        java.util.Locale locale1 = new java.util.Locale("JPN");
        org.junit.Assert.assertEquals(locale1.toString(), "jpn");
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        timeZone0.setID("");
        timeZone0.setRawOffset(10);
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = timeZone0.getDisplayName(true, 100, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("\u4e2d\u6587\u53f0\u7063)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"?? (??)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getISO3Language();
        java.lang.String str3 = locale0.getVariant();
        boolean boolean4 = locale0.hasExtensions();
        java.lang.String str5 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh_TW" + "'", str5, "zh_TW");
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId4 = timeZone0.toZoneId();
// flaky:             org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: ");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "Italien");
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.size();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYear(630);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(683);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 683 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getLanguage();
        java.lang.Object obj3 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "zh_TW");
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str2 = locale0.getExtension('a');
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        boolean boolean9 = localDateTime4.isBefore((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.yearOfCentury();
        java.lang.String str13 = property12.getName();
        int int14 = property12.getMaximumValueOverall();
        java.lang.String str15 = property12.getName();
        org.joda.time.LocalDateTime localDateTime17 = property12.addToCopy(99);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.weekOfWeekyear();
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.lang.String str22 = locale21.getDisplayLanguage();
        boolean boolean23 = locale21.hasExtensions();
        int int24 = property20.getMaximumTextLength(locale21);
        java.lang.String str25 = property12.getAsShortText(locale21);
        java.lang.String str26 = locale0.getDisplayCountry(locale21);
        java.lang.String str28 = locale21.getExtension('a');
        java.util.Locale locale29 = locale21.stripExtensions();
        java.lang.String str30 = locale21.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = locale21.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "yearOfCentury" + "'", str13, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "yearOfCentury" + "'", str15, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u5fb7\u6587" + "'", str22, "\u5fb7\u6587");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "22" + "'", str25, "22");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "S\374dkorea" + "'", str26, "S\374dkorea");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.io.IOException iOException2 = new java.io.IOException("/experiment");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("german", (java.lang.Throwable) iOException3);
        java.io.IOException iOException7 = new java.io.IOException("/experiment");
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException("german", (java.lang.Throwable) iOException8);
        iOException4.addSuppressed((java.lang.Throwable) iOException8);
        java.lang.String str11 = iOException4.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.io.IOException: german" + "'", str11, "java.io.IOException: german");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.weekOfWeekyear();
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.lang.String str4 = locale3.getDisplayLanguage();
        boolean boolean5 = locale3.hasExtensions();
        int int6 = property2.getMaximumTextLength(locale3);
        java.lang.String str7 = property2.getAsString();
        int int8 = property2.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u5fb7\u6587" + "'", str4, "\u5fb7\u6587");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6" + "'", str7, "6");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2021-02-11T09:50:29.734Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2021-02-11T09:50:29.734Z\" is malformed at \"Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        timeZone0.setID("");
        java.lang.String str6 = timeZone0.getID();
        int int7 = timeZone0.getRawOffset();
        java.lang.String str8 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GMT+00:00" + "'", str8, "GMT+00:00");
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone0.hasSameRules(timeZone4);
        java.lang.String str6 = timeZone4.getID();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId7 = timeZone4.toZoneId();
// flaky:             org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: ");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime8.getFields();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readablePeriod10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = property12.setCopy(1);
        org.joda.time.LocalDateTime localDateTime16 = property12.addToCopy(1644573011559L);
        java.lang.String str17 = property12.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = property12.setCopy("Property[monthOfYear]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[monthOfYear]\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "millisOfSecond" + "'", str17, "millisOfSecond");
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        boolean boolean5 = file1.setLastModified((long) ':');
        java.net.URI uRI6 = file1.toURI();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = file1.createNewFile();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(uRI6);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.size();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusYears((int) (short) 100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        boolean boolean12 = localDateTime7.isBefore((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property15 = localDateTime11.yearOfCentury();
        java.lang.String str16 = property15.getName();
        org.joda.time.LocalDateTime localDateTime18 = property15.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        boolean boolean25 = localDateTime20.isBefore((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime24, chronology26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime24.toDateTime(readableInstant28);
        org.joda.time.DateTime dateTime30 = localDateTime18.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime30.getZone();
        org.joda.time.Instant instant32 = dateTime30.toInstant();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone37);
        boolean boolean39 = localDateTime34.isBefore((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray42 = localDateTime41.getFields();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.minusMonths((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property45 = localDateTime41.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property45.getFieldType();
        boolean boolean47 = instant32.isSupported(dateTimeFieldType46);
        org.joda.time.Chronology chronology48 = instant32.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((java.lang.Object) property5, chronology48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "yearOfCentury" + "'", str16, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldArray42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(chronology48);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str2 = locale0.getISO3Country();
        java.lang.String str3 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        int int14 = localDateTime5.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.minusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime18 = localDateTime5.minusYears((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField21 = localDateTime18.getField((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone0.hasSameRules(timeZone4);
        timeZone0.setID("German");
        timeZone0.setRawOffset((int) (byte) 100);
        int int10 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "Italien");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setExtension('u', "\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setRegion("2022-02-11T09:50:22.869");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 2022-02-11T09:50:22.869 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "Italien");
        java.util.Locale.Builder builder4 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("2021-02-11T09:50:14.960Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2021-02-11T09:50:14.960Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        boolean boolean4 = file1.exists();
        boolean boolean6 = file1.setReadable(true);
        java.net.URL uRL7 = file1.toURL();
        long long8 = file1.getTotalSpace();
        boolean boolean9 = file1.setReadOnly();
        java.lang.String str10 = file1.toString();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(uRL7);
// flaky:         org.junit.Assert.assertEquals(uRL7.toString(), "file:/experiment");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) 'x', (int) 'a', 629, 346, 680, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 346 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        timeZone0.setID("");
        java.lang.String str6 = timeZone0.getID();
        timeZone0.setRawOffset(124);
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        java.lang.String str10 = timeZone9.getID();
        timeZone9.setRawOffset(22);
        boolean boolean13 = timeZone9.observesDaylightTime();
        java.util.TimeZone timeZone14 = null;
        boolean boolean15 = timeZone9.hasSameRules(timeZone14);
        int int16 = timeZone9.getRawOffset();
        boolean boolean17 = timeZone0.hasSameRules(timeZone9);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (byte) 100, chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withWeekyear(0);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.minus(readablePeriod24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        boolean boolean32 = localDateTime27.isBefore((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray35 = localDateTime34.getFields();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.plus(readablePeriod36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusWeeks(1);
        boolean boolean40 = localDateTime21.isBefore((org.joda.time.ReadablePartial) localDateTime37);
        boolean boolean41 = localDateTime18.isBefore((org.joda.time.ReadablePartial) localDateTime21);
        java.util.Date date42 = localDateTime18.toDate();
        boolean boolean43 = timeZone0.inDaylightTime(date42);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldArray35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Fri Feb 11 09:50:33 GMT+00:00 2022");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.io.File file2 = java.io.File.createTempFile("java.io.IOException: /experiment", "2021-02-11T09:50:10.005Z");
        boolean boolean5 = file2.setWritable(false, false);
        java.lang.String str6 = file2.getParent();
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/tmp/experiment91136737499199081052021-02-11T09:50:10.005Z");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/tmp" + "'", str6, "/tmp");
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = locale2.getISO3Language();
        java.lang.String str5 = locale2.getVariant();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale7 = locale2.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale2.getExtension(':');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: :");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zho" + "'", str4, "zho");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler0 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file2 = new java.io.File("");
        java.lang.String str3 = file2.getCanonicalPath();
        boolean boolean6 = file2.setReadable(true, false);
        boolean boolean9 = file2.setExecutable(true, true);
        boolean boolean11 = file2.setLastModified((long) 'u');
        java.io.File[] fileArray12 = new java.io.File[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = zoneInfoCompiler0.compile(file2, fileArray12);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Destination directory doesn't exist: ");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/experiment" + "'", str3, "/experiment");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(fileArray12);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "Italien");
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.removeUnicodeLocaleAttribute("\u5fb7\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("German", (double) 1.0f);
        java.lang.String str3 = languageRange2.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] { languageRange2 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap15);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale[] localeArray20 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.Locale.FilteringMode filteringMode23 = null;
        java.util.List<java.util.Locale> localeList24 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList21, filteringMode23);
        java.util.Locale locale25 = java.util.Locale.lookup(languageRangeList16, (java.util.Collection<java.util.Locale>) localeList21);
        java.util.Collection<java.util.Locale> localeCollection26 = null;
        java.util.Locale.FilteringMode filteringMode27 = null;
        java.util.List<java.util.Locale> localeList28 = java.util.Locale.filter(languageRangeList16, localeCollection26, filteringMode27);
        java.util.Locale locale29 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList28);
        java.util.Locale.FilteringMode filteringMode30 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList31 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList28, filteringMode30);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Locale[] localeArray35 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.Locale.FilteringMode filteringMode38 = null;
        java.util.List<java.util.Locale> localeList39 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.util.Locale>) localeList36, filteringMode38);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList36, filteringMode40);
        java.util.Set<java.lang.String> strSet42 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray43 = strSet42.toArray();
        boolean boolean45 = strSet42.add("");
        java.util.Set<java.lang.String> strSet46 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray47 = strSet46.toArray();
        boolean boolean48 = strSet42.addAll((java.util.Collection<java.lang.String>) strSet46);
        java.lang.String str49 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strSet42);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = strSet42.contains((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.lang.Byte");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "german" + "'", str3, "german");
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localeList24);
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertNotNull(localeList28);
        org.junit.Assert.assertNull(locale29);
        org.junit.Assert.assertTrue("'" + filteringMode30 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode30.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localeList39);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(objArray43);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[, /tmp/UTC21839596354106745032022-04-22T09:50:12.989, 2022]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[, /tmp/UTC21839596354106745032022-04-22T09:50:12.989, 2022]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(objArray47);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[, /tmp/UTC21839596354106745032022-04-22T09:50:12.989, 2022]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[, /tmp/UTC21839596354106745032022-04-22T09:50:12.989, 2022]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DurationField durationField13 = property9.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime14 = property9.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property9.getFieldType();
        org.joda.time.LocalDateTime localDateTime16 = property9.roundHalfFloorCopy();
        org.joda.time.DurationField durationField17 = property9.getLeapDurationField();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNull(durationField17);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusMillis(99);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusDays(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-11T09:50:10.822");
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str5 = locale4.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = timeZone1.getDisplayName(true, 3, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("java.io.IOException: /experiment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.io.ioexception: /experiment");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        boolean boolean4 = file1.exists();
        boolean boolean5 = file1.exists();
        java.io.File file6 = file1.getCanonicalFile();
        long long7 = file6.getUsableSpace();
        boolean boolean10 = file6.setWritable(true, false);
        boolean boolean13 = file6.setReadable(true, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = file6.setLastModified((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative time");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(file6);
// flaky:         org.junit.Assert.assertEquals(file6.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), "/experiment");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 280449097728L + "'", long7 == 280449097728L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de" + "'", str2, "de");
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(368);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        int int14 = localDateTime5.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.minusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime18 = localDateTime5.plusMillis(22);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime5.minusYears(576);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        boolean boolean31 = localDateTime26.isBefore((org.joda.time.ReadablePartial) localDateTime30);
        int int32 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        int int33 = localDateTime26.getYear();
        int int34 = localDateTime26.getYearOfEra();
        org.joda.time.LocalDateTime.Property property35 = localDateTime26.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        boolean boolean42 = localDateTime37.isBefore((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray45 = localDateTime44.getFields();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.minusMonths((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property48 = localDateTime44.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property48.getFieldType();
        int int50 = localDateTime26.indexOf(dateTimeFieldType49);
        int int51 = localDateTime20.indexOf(dateTimeFieldType49);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime20.withMillisOfDay(463);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = localDateTime20.getValue(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 11");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2022 + "'", int33 == 2022);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2022 + "'", int34 == 2022);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(dateTimeFieldArray45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(localDateTime53);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        java.io.File file1 = new java.io.File("");
        boolean boolean2 = file1.canExecute();
        java.lang.String str3 = file1.getParent();
        boolean boolean5 = file1.setLastModified((long) 'a');
        java.io.File file6 = file1.getCanonicalFile();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        boolean boolean13 = localDateTime8.isBefore((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property16 = localDateTime12.yearOfCentury();
        java.lang.String str17 = property16.getName();
        org.joda.time.LocalDateTime localDateTime19 = property16.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        boolean boolean26 = localDateTime21.isBefore((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime25, chronology27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime25.toDateTime(readableInstant29);
        org.joda.time.DateTime dateTime31 = localDateTime19.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime31.getZone();
        java.lang.String str34 = dateTimeZone32.getName((long) '#');
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        int int37 = localDateTime36.size();
        org.joda.time.LocalDateTime.Property property38 = localDateTime36.yearOfCentury();
        boolean boolean39 = dateTimeZone32.isLocalDateTimeGap(localDateTime36);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(dateTimeZone48);
        boolean boolean50 = localDateTime45.isBefore((org.joda.time.ReadablePartial) localDateTime49);
        int int51 = localDateTime41.compareTo((org.joda.time.ReadablePartial) localDateTime45);
        int int52 = localDateTime45.getYear();
        int int53 = localDateTime45.getYearOfEra();
        boolean boolean54 = dateTimeZone32.isLocalDateTimeGap(localDateTime45);
        int int56 = dateTimeZone32.getOffsetFromLocal(280452325376L);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(dateTimeZone61);
        boolean boolean63 = localDateTime58.isBefore((org.joda.time.ReadablePartial) localDateTime62);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime62.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray66 = localDateTime65.getFields();
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalDateTime localDateTime68 = localDateTime65.plus(readablePeriod67);
        org.joda.time.LocalDateTime.Property property69 = localDateTime68.millisOfSecond();
        int int70 = localDateTime68.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime68.minusSeconds((int) 'x');
        boolean boolean73 = dateTimeZone32.isLocalDateTimeGap(localDateTime72);
        int int75 = dateTimeZone32.getStandardOffset((long) 304);
        int int77 = dateTimeZone32.getStandardOffset((long) 'x');
        java.lang.String str78 = dateTimeZone32.getID();
        boolean boolean79 = file6.equals((java.lang.Object) dateTimeZone32);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(file6);
// flaky:         org.junit.Assert.assertEquals(file6.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), "/experiment");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "yearOfCentury" + "'", str17, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2022 + "'", int52 == 2022);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2022 + "'", int53 == 2022);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(dateTimeFieldArray66);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(property69);
// flaky:         org.junit.Assert.assertTrue("'" + int70 + "' != '" + 247 + "'", int70 == 247);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "UTC" + "'", str78, "UTC");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("en", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.lang.String[] strArray51 = new java.lang.String[] { "UTC", "2022-02-11T09:50:14.162", "9", "german", "2022-04-22T09:50:12.989", "11", ":", "hi!", "2022-02-11T09:50:13.471", "", "9", "\u53f0\u7063", "zho", "Taiwan", "\u53f0\u7063", "zho", "2021-02-11T09:50:10.005Z", "en", "Property[yearOfCentury]", "6/6", "+00:00", "Taiwan", "minuteOfHour", "zho", "2022-02-11T09:50:14.162", "\u5354\u8abf\u4e16\u754c\u6642\u9593", "22", "2022-02-11T09:50:13.471", "", "experiment", "dayOfYear", "6", "\u5fb7\u6587", "CN", "minuteOfHour", "GMT+00:00", "11", "/", "java.io.IOException: /experiment", "9", "6/6", "11", "6/6", "java.io.IOException: /experiment", "GMT+00:00", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(dateTimeZone54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(dateTimeZone58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime(dateTimeZone62);
        boolean boolean64 = localDateTime59.isBefore((org.joda.time.ReadablePartial) localDateTime63);
        int int65 = localDateTime55.compareTo((org.joda.time.ReadablePartial) localDateTime59);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime59.plusMillis((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime59.withMillisOfSecond(10);
        boolean boolean70 = strSet52.remove((java.lang.Object) 10);
        java.lang.String str71 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet52);
        strSet52.clear();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "en" + "'", str71, "en");
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusDays((int) ':');
        int int14 = property9.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) int14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withSecondOfMinute(22);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minus(readableDuration6);
        java.util.Locale locale9 = java.util.Locale.CANADA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localDateTime7.toString("2022-02-11T09:50:22.869", locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.io.File file1 = new java.io.File("");
        boolean boolean2 = file1.canExecute();
        java.lang.String str3 = file1.getParent();
        boolean boolean4 = file1.mkdir();
        java.io.File file5 = file1.getAbsoluteFile();
        java.io.File file7 = new java.io.File("");
        java.io.File file9 = new java.io.File(file7, "hi!");
        boolean boolean10 = file7.exists();
        boolean boolean11 = file7.exists();
        boolean boolean13 = file7.setExecutable(true);
        boolean boolean16 = file7.setWritable(true, false);
        long long17 = file7.getUsableSpace();
        int int18 = file1.compareTo(file7);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(file5);
// flaky:         org.junit.Assert.assertEquals(file5.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file5.toString(), "/experiment");
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "");
        org.junit.Assert.assertEquals(file9.getParent(), "/");
        org.junit.Assert.assertEquals(file9.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("2022-02-11T09:50:15.138", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-11t09:50:15.138");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("2021-02-11T09:50:17.229Z");
        org.joda.time.DateTimeZone dateTimeZone4 = provider0.getZone("2021");
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone2);
        org.junit.Assert.assertNull(dateTimeZone4);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("2022", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("\u4e2d\u6587", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = dateTimeZone0.equals(obj1);
        java.lang.String str3 = dateTimeZone0.toString();
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale5.getDisplayScript(locale7);
        java.lang.String str9 = dateTimeZone0.getName((long) ':', locale7);
        long long13 = dateTimeZone0.convertLocalToUTC((long) 655, true, (long) 92);
        long long16 = dateTimeZone0.convertLocalToUTC(3577805738L, true);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        boolean boolean23 = localDateTime18.isBefore((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray26 = localDateTime25.getFields();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.plus(readablePeriod27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.year();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withMillisOfDay(50);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime28.withYear(0);
        boolean boolean34 = dateTimeZone0.equals((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u5fb7\u6587" + "'", str6, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 655L + "'", long13 == 655L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3577805738L + "'", long16 == 3577805738L);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldArray26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        java.io.File file3 = new java.io.File("");
        java.io.File file4 = file3.getCanonicalFile();
        boolean boolean5 = file3.mkdir();
        java.io.File file6 = file3.getAbsoluteFile();
        boolean boolean9 = file3.setReadable(false, true);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file10 = java.io.File.createTempFile("\u4e2d\u6587", "zho", file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Prefix string too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "");
        org.junit.Assert.assertNotNull(file4);
// flaky:         org.junit.Assert.assertEquals(file4.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file4.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(file6);
// flaky:         org.junit.Assert.assertEquals(file6.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        int int14 = localDateTime5.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.minusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime18 = localDateTime5.plusMillis(22);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime5.withEra(1);
        org.joda.time.DurationFieldType durationFieldType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withFieldAdded(durationFieldType21, 779);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        boolean boolean18 = localDateTime13.isBefore((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime17, chronology19);
        boolean boolean21 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYear((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withDayOfMonth(2068);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2068 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone0.hasSameRules(timeZone4);
        timeZone0.setID("2021-02-11T09:50:19.205Z");
        java.lang.String str8 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GMT+00:00" + "'", str8, "GMT+00:00");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DurationField durationField13 = property9.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime14 = property9.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property9.getFieldType();
        org.joda.time.LocalDateTime localDateTime16 = property9.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = property9.addWrapFieldToCopy(346);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plus(readableDuration19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withDurationAdded(readableDuration21, 0);
        int[] intArray24 = localDateTime20.getValues();
        int int25 = localDateTime20.getMillisOfDay();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(intArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[2068, 2, 11, 35434484]");
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35434484 + "'", int25 == 35434484);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime5.minusMinutes((int) '4');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withSecondOfMinute(26);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withYearOfEra(21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withHourOfDay(279);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 279 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = dateTimeZone10.equals(obj11);
        java.lang.String str13 = dateTimeZone10.toString();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.util.Locale locale17 = java.util.Locale.US;
        java.lang.String str18 = locale15.getDisplayScript(locale17);
        java.lang.String str19 = dateTimeZone10.getName((long) ':', locale17);
        java.lang.String str20 = locale17.getLanguage();
        org.joda.time.tz.NameProvider nameProvider21 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.lang.String str23 = locale22.getCountry();
        java.lang.String str24 = locale22.getDisplayScript();
        java.lang.String str27 = nameProvider21.getName(locale22, "hi!", "");
        java.util.Locale locale28 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet29 = locale28.getUnicodeLocaleKeys();
        java.lang.String str32 = nameProvider21.getName(locale28, "\u5fb7\u6587", "");
        java.lang.String str33 = locale17.getDisplayVariant(locale28);
        int int34 = property9.getMaximumTextLength(locale28);
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.lang.String str36 = locale35.getCountry();
        java.lang.String str37 = locale35.getDisplayScript();
        java.lang.String str38 = locale28.getDisplayLanguage(locale35);
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet40 = locale39.getExtensionKeys();
        java.lang.String str41 = locale39.getISO3Language();
        java.lang.String str42 = locale35.getDisplayCountry(locale39);
        java.lang.Object obj43 = locale39.clone();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u5fb7\u6587" + "'", str16, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(nameProvider21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Englisch" + "'", str38, "Englisch");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "zho" + "'", str41, "zho");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "zh_TW");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        int int7 = localDateTime5.getMonthOfYear();
        int int8 = localDateTime5.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.dayOfYear();
        int int10 = property9.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        boolean boolean19 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime18, chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime18.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        boolean boolean29 = localDateTime24.isBefore((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime28, chronology30);
        boolean boolean32 = localDateTime18.isAfter((org.joda.time.ReadablePartial) localDateTime28);
        boolean boolean33 = dateTimeZone12.isLocalDateTimeGap(localDateTime18);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        boolean boolean40 = localDateTime35.isBefore((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime39, chronology41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.withMinuteOfHour(1);
        org.joda.time.LocalDateTime.Property property45 = localDateTime42.dayOfYear();
        boolean boolean46 = dateTimeZone12.isLocalDateTimeGap(localDateTime42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((java.lang.Object) int10, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 365 + "'", int10 == 365);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Chinese", (double) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=50.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.io.File file1 = new java.io.File("");
        java.lang.String str2 = file1.getCanonicalPath();
        boolean boolean5 = file1.setReadable(true, false);
        boolean boolean6 = file1.mkdir();
        java.io.File file7 = file1.getParentFile();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = file7.canExecute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/experiment" + "'", str2, "/experiment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(file7);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"zh_TW\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getISO3Language();
        java.lang.String str3 = locale0.getVariant();
        boolean boolean4 = locale0.hasExtensions();
        java.lang.String str5 = locale0.getDisplayScript();
        java.lang.String str6 = locale0.getVariant();
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str11 = locale9.getExtension('a');
        java.util.Set<java.lang.String> strSet12 = locale9.getUnicodeLocaleKeys();
        java.lang.String str13 = locale7.getDisplayName(locale9);
        java.lang.String str14 = locale0.getDisplayScript(locale9);
        java.lang.Object obj15 = locale9.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str13, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "ko_KR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "ko_KR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "ko_KR");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        boolean boolean19 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime18, chronology20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime18.toDateTime(readableInstant22);
        org.joda.time.DateTime dateTime24 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime24.getZone();
        java.lang.String str27 = dateTimeZone25.getName((long) '#');
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        int int30 = localDateTime29.size();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.yearOfCentury();
        boolean boolean32 = dateTimeZone25.isLocalDateTimeGap(localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        boolean boolean43 = localDateTime38.isBefore((org.joda.time.ReadablePartial) localDateTime42);
        int int44 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        int int45 = localDateTime38.getYear();
        int int46 = localDateTime38.getYearOfEra();
        boolean boolean47 = dateTimeZone25.isLocalDateTimeGap(localDateTime38);
        int int49 = dateTimeZone25.getOffsetFromLocal(280452325376L);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(dateTimeZone54);
        boolean boolean56 = localDateTime51.isBefore((org.joda.time.ReadablePartial) localDateTime55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray59 = localDateTime58.getFields();
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.plus(readablePeriod60);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.millisOfSecond();
        int int63 = localDateTime61.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime61.minusSeconds((int) 'x');
        boolean boolean66 = dateTimeZone25.isLocalDateTimeGap(localDateTime65);
        java.util.TimeZone timeZone67 = dateTimeZone25.toTimeZone();
        int int68 = timeZone67.getRawOffset();
        int int69 = timeZone67.getDSTSavings();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2022 + "'", int45 == 2022);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2022 + "'", int46 == 2022);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(dateTimeFieldArray59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(property62);
// flaky:         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 829 + "'", int63 == 829);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(timeZone67);
// flaky:         org.junit.Assert.assertEquals(timeZone67.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        timeZone0.setID("");
        java.lang.String str6 = timeZone0.getID();
        int int7 = timeZone0.getRawOffset();
        java.lang.String str8 = timeZone0.getID();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId9 = timeZone0.toZoneId();
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: ");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = dateTimeZone0.equals(obj1);
        java.lang.String str3 = dateTimeZone0.toString();
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale5.getDisplayScript(locale7);
        java.lang.String str9 = dateTimeZone0.getName((long) ':', locale7);
        java.lang.String str10 = locale7.getLanguage();
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (byte) 100, chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withWeekyear(0);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minus(readablePeriod17);
        boolean boolean19 = strSet11.remove((java.lang.Object) localDateTime14);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        boolean boolean30 = localDateTime25.isBefore((org.joda.time.ReadablePartial) localDateTime29);
        int int31 = localDateTime21.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        boolean boolean38 = localDateTime33.isBefore((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime37, chronology39);
        boolean boolean41 = localDateTime21.isAfter((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.DateTime dateTime42 = localDateTime21.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(dateTimeZone47);
        boolean boolean49 = localDateTime44.isBefore((org.joda.time.ReadablePartial) localDateTime48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property52 = localDateTime48.yearOfCentury();
        java.lang.String str53 = property52.getName();
        org.joda.time.LocalDateTime localDateTime55 = property52.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(dateTimeZone56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime(dateTimeZone60);
        boolean boolean62 = localDateTime57.isBefore((org.joda.time.ReadablePartial) localDateTime61);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime61, chronology63);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.DateTime dateTime66 = localDateTime61.toDateTime(readableInstant65);
        org.joda.time.DateTime dateTime67 = localDateTime55.toDateTime((org.joda.time.ReadableInstant) dateTime66);
        boolean boolean68 = dateTime42.isAfter((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime(dateTimeZone69);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime(dateTimeZone73);
        boolean boolean75 = localDateTime70.isBefore((org.joda.time.ReadablePartial) localDateTime74);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime74.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property78 = localDateTime74.yearOfCentury();
        java.lang.String str79 = property78.getName();
        org.joda.time.LocalDateTime localDateTime81 = property78.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone82 = null;
        org.joda.time.LocalDateTime localDateTime83 = new org.joda.time.LocalDateTime(dateTimeZone82);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime83.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.LocalDateTime localDateTime87 = new org.joda.time.LocalDateTime(dateTimeZone86);
        boolean boolean88 = localDateTime83.isBefore((org.joda.time.ReadablePartial) localDateTime87);
        org.joda.time.Chronology chronology89 = null;
        org.joda.time.LocalDateTime localDateTime90 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime87, chronology89);
        org.joda.time.ReadableInstant readableInstant91 = null;
        org.joda.time.DateTime dateTime92 = localDateTime87.toDateTime(readableInstant91);
        org.joda.time.DateTime dateTime93 = localDateTime81.toDateTime((org.joda.time.ReadableInstant) dateTime92);
        boolean boolean94 = dateTime67.equals((java.lang.Object) dateTime92);
        boolean boolean95 = localDateTime14.equals((java.lang.Object) boolean94);
        org.joda.time.LocalDateTime.Property property96 = localDateTime14.yearOfEra();
        java.lang.String str97 = property96.getAsText();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u5fb7\u6587" + "'", str6, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "yearOfCentury" + "'", str53, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "yearOfCentury" + "'", str79, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(localDateTime85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(dateTime92);
        org.junit.Assert.assertNotNull(dateTime93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(property96);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "1970" + "'", str97, "1970");
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(70, 18, 35423158, 649, 829, 335);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 649 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(42, 2, 447, (int) (byte) 100, 35422094, 14, 14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setLanguage("/");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: / [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        int int11 = property9.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime12 = property9.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, (int) '4');
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        boolean boolean23 = localDateTime18.isBefore((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.plus(readableDuration24);
        org.joda.time.DateTime dateTime26 = localDateTime18.toDateTime();
        long long27 = dateTime26.getMillis();
        org.joda.time.Instant instant28 = dateTime26.toInstant();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        int int31 = localDateTime30.size();
        org.joda.time.LocalDateTime.Property property32 = localDateTime30.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone37);
        boolean boolean39 = localDateTime34.isBefore((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray42 = localDateTime41.getFields();
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.plus(readablePeriod43);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime30.withFields((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        boolean boolean52 = localDateTime47.isBefore((org.joda.time.ReadablePartial) localDateTime51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property55 = localDateTime51.yearOfCentury();
        java.lang.String str56 = property55.getName();
        org.joda.time.LocalDateTime localDateTime58 = property55.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DurationField durationField59 = property55.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime60 = property55.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = property55.getFieldType();
        boolean boolean62 = localDateTime44.isSupported(dateTimeFieldType61);
        int int63 = dateTime26.get(dateTimeFieldType61);
        org.joda.time.LocalDateTime.Property property64 = localDateTime15.property(dateTimeFieldType61);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj66 = new java.lang.Object();
        boolean boolean67 = dateTimeZone65.equals(obj66);
        java.lang.String str68 = dateTimeZone65.toString();
        java.util.Locale locale70 = java.util.Locale.GERMAN;
        java.lang.String str71 = locale70.getDisplayLanguage();
        java.util.Locale locale72 = java.util.Locale.US;
        java.lang.String str73 = locale70.getDisplayScript(locale72);
        java.lang.String str74 = dateTimeZone65.getName((long) ':', locale72);
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime(dateTimeZone65);
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime(dateTimeZone65);
        boolean boolean77 = localDateTime15.isEqual((org.joda.time.ReadablePartial) localDateTime76);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime15.minusMonths(35410486);
        int int80 = localDateTime79.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date81 = localDateTime79.toDate();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -22 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1644573035196L + "'", long27 == 1644573035196L);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldArray42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "yearOfCentury" + "'", str56, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(durationField59);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 22 + "'", int63 == 22);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "UTC" + "'", str68, "UTC");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "de");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "\u5fb7\u6587" + "'", str71, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "+00:00" + "'", str74, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(localDateTime79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        int int12 = localDateTime5.getYear();
        int int13 = localDateTime5.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime5.plusMinutes(3);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime5.withMillisOfDay(400);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime5.withHourOfDay(169);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 169 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("2021-02-11T09:50:21.544Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2021-02-11T09:50:21.544Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.util.Locale locale1 = new java.util.Locale("\u5fb7\u6587");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "\u5fb7\u6587");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "\u5fb7\u6587");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "\u5fb7\u6587");
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        java.io.File file4 = file3.getParentFile();
        java.io.File file5 = file4.getParentFile();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "/");
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.io.IOException iOException2 = new java.io.IOException("/experiment");
        java.io.IOException iOException3 = new java.io.IOException("millisOfSecond", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.lang.String str5 = iOException3.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: millisOfSecond" + "'", str5, "java.io.IOException: millisOfSecond");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        java.io.File file1 = new java.io.File("");
        java.lang.String str2 = file1.getCanonicalPath();
        boolean boolean5 = file1.setReadable(true, false);
        java.lang.String str6 = file1.getPath();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        int int9 = localDateTime8.size();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.yearOfCentury();
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.dayOfYear();
        java.io.File file13 = new java.io.File("");
        boolean boolean14 = file13.canExecute();
        java.lang.String str15 = file13.getParent();
        boolean boolean16 = file13.mkdir();
        java.io.File file17 = file13.getAbsoluteFile();
        java.io.File file18 = file17.getAbsoluteFile();
        long long19 = file18.length();
        boolean boolean20 = property11.equals((java.lang.Object) file18);
        boolean boolean21 = file1.renameTo(file18);
        java.lang.String str22 = file18.getPath();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/experiment" + "'", str2, "/experiment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(file17);
// flaky:         org.junit.Assert.assertEquals(file17.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file17.toString(), "/experiment");
        org.junit.Assert.assertNotNull(file18);
// flaky:         org.junit.Assert.assertEquals(file18.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file18.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4096L + "'", long19 == 4096L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/experiment" + "'", str22, "/experiment");
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setExtension(':', "weekOfWeekyear");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: : [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.io.File file1 = new java.io.File("");
        java.lang.String str2 = file1.getCanonicalPath();
        boolean boolean5 = file1.setReadable(true, false);
        boolean boolean8 = file1.setExecutable(true, true);
        java.net.URI uRI9 = file1.toURI();
        java.io.File file10 = new java.io.File(uRI9);
        java.lang.String str11 = file10.getCanonicalPath();
        boolean boolean12 = file10.delete();
        boolean boolean13 = file10.isHidden();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/experiment" + "'", str2, "/experiment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(uRI9);
// flaky:         org.junit.Assert.assertEquals(file10.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file10.toString(), "/experiment");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/experiment" + "'", str11, "/experiment");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.size();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYear((int) '4');
        java.lang.String str6 = localDateTime1.toString("\u5fb7\u6587");
        java.lang.String str7 = localDateTime1.toString();
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMonthOfYear(747);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 747 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u5fb7\u6587" + "'", str6, "\u5fb7\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-11T09:50:35.850" + "'", str7, "2022-02-11T09:50:35.850");
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        java.io.File file1 = new java.io.File("");
        java.lang.String str2 = file1.getCanonicalPath();
        boolean boolean5 = file1.setReadable(true, false);
        boolean boolean8 = file1.setExecutable(true, true);
        java.net.URI uRI9 = file1.toURI();
        boolean boolean12 = file1.setExecutable(false, true);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        boolean boolean24 = localDateTime19.isBefore((org.joda.time.ReadablePartial) localDateTime23);
        int int25 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        boolean boolean32 = localDateTime27.isBefore((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime31, chronology33);
        boolean boolean35 = localDateTime15.isAfter((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.Chronology chronology36 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(10L, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        boolean boolean48 = localDateTime43.isBefore((org.joda.time.ReadablePartial) localDateTime47);
        int int49 = localDateTime39.compareTo((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime43.plusMillis((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(dateTimeZone56);
        boolean boolean58 = localDateTime53.isBefore((org.joda.time.ReadablePartial) localDateTime57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property61 = localDateTime57.yearOfCentury();
        java.lang.String str62 = property61.getName();
        org.joda.time.LocalDateTime localDateTime64 = property61.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DurationField durationField65 = property61.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime66 = property61.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = property61.getFieldType();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime43.withField(dateTimeFieldType67, (int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = localDateTime43.getFieldType(0);
        boolean boolean72 = localDateTime37.isSupported(dateTimeFieldType71);
        boolean boolean73 = file1.equals((java.lang.Object) boolean72);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/experiment" + "'", str2, "/experiment");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "yearOfCentury" + "'", str62, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(dateTimeFieldType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = dateTimeZone0.equals(obj1);
        java.lang.String str3 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, (long) (byte) -1);
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.lang.String str9 = dateTimeZone4.getName((long) (byte) 10, locale8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        boolean boolean16 = localDateTime11.isBefore((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.yearOfCentury();
        java.lang.String str20 = property19.getName();
        org.joda.time.LocalDateTime localDateTime22 = property19.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        boolean boolean29 = localDateTime24.isBefore((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime28, chronology30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.DateTime dateTime33 = localDateTime28.toDateTime(readableInstant32);
        org.joda.time.DateTime dateTime34 = localDateTime22.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime34.getZone();
        java.lang.String str37 = dateTimeZone35.getName((long) '#');
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        int int40 = localDateTime39.size();
        org.joda.time.LocalDateTime.Property property41 = localDateTime39.yearOfCentury();
        boolean boolean42 = dateTimeZone35.isLocalDateTimeGap(localDateTime39);
        long long44 = dateTimeZone4.getMillisKeepLocal(dateTimeZone35, (-1L));
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = localDateTime45.toString("0010-04-23T09:50:19.429");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "yearOfCentury" + "'", str20, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        boolean boolean4 = file1.exists();
        boolean boolean5 = file1.mkdirs();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = dateTimeZone6.equals(obj7);
        java.lang.String str9 = dateTimeZone6.toString();
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = locale11.getDisplayScript(locale13);
        java.lang.String str15 = dateTimeZone6.getName((long) ':', locale13);
        java.lang.String str16 = locale13.getLanguage();
        java.util.Set<java.lang.String> strSet17 = locale13.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (byte) 100, chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withWeekyear(0);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.minus(readablePeriod23);
        boolean boolean25 = strSet17.remove((java.lang.Object) localDateTime20);
        org.joda.time.Chronology chronology26 = localDateTime20.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) boolean5, chronology26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u5fb7\u6587" + "'", str12, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en" + "'", str16, "en");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("experiment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=experiment");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(reader0, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        long long4 = file3.getUsableSpace();
        java.io.File file5 = file3.getAbsoluteFile();
        java.lang.String str6 = file5.getName();
        java.lang.String str7 = file5.getParent();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 280453173248L + "'", long4 == 280453173248L);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "/");
        org.junit.Assert.assertEquals(file5.toString(), "/hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = dateTimeZone1.equals(obj2);
        java.lang.String str4 = dateTimeZone1.toString();
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Locale locale8 = java.util.Locale.US;
        java.lang.String str9 = locale6.getDisplayScript(locale8);
        java.lang.String str10 = dateTimeZone1.getName((long) ':', locale8);
        java.lang.String str11 = locale8.getLanguage();
        java.util.Set<java.lang.String> strSet12 = locale8.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (byte) 100, chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withWeekyear(0);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.minus(readablePeriod18);
        boolean boolean20 = strSet12.remove((java.lang.Object) localDateTime15);
        org.joda.time.Chronology chronology21 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(4096L, chronology21);
        int int23 = localDateTime22.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withYearOfEra(2);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfMonth();
        int int27 = property26.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u5fb7\u6587" + "'", str7, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en" + "'", str11, "en");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = dateTimeZone0.equals(obj1);
        java.lang.String str3 = dateTimeZone0.toString();
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale5.getDisplayScript(locale7);
        java.lang.String str9 = dateTimeZone0.getName((long) ':', locale7);
        java.lang.String str10 = locale7.getLanguage();
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        int int14 = localDateTime13.size();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.yearOfCentury();
        org.joda.time.DurationField durationField16 = property15.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime17 = property15.roundCeilingCopy();
        boolean boolean18 = locale7.equals((java.lang.Object) property15);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u5fb7\u6587" + "'", str6, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime5.withCenturyOfEra(10);
        int int16 = localDateTime5.getYearOfEra();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray1 = strSet0.toArray();
        boolean boolean3 = strSet0.add("");
        java.util.Set<java.lang.String> strSet4 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray5 = strSet4.toArray();
        boolean boolean6 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        int int9 = localDateTime8.size();
        int int10 = localDateTime8.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.minusMillis((int) 'u');
        boolean boolean13 = strSet0.equals((java.lang.Object) localDateTime8);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray14 = new java.lang.reflect.AnnotatedElement[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement[] annotatedElementArray15 = strSet0.toArray(annotatedElementArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(objArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[, TW]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[, TW]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(objArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[, TW]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[, TW]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(annotatedElementArray14);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.io.File file1 = new java.io.File("");
        boolean boolean2 = file1.canExecute();
        java.lang.String str3 = file1.getParent();
        boolean boolean4 = file1.mkdir();
        java.io.File file5 = file1.getAbsoluteFile();
        java.io.File file6 = file5.getAbsoluteFile();
        java.io.File file7 = file5.getAbsoluteFile();
        boolean boolean8 = file7.isHidden();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(file5);
// flaky:         org.junit.Assert.assertEquals(file5.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file5.toString(), "/experiment");
        org.junit.Assert.assertNotNull(file6);
// flaky:         org.junit.Assert.assertEquals(file6.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), "/experiment");
        org.junit.Assert.assertNotNull(file7);
// flaky:         org.junit.Assert.assertEquals(file7.getParent(), "/");
// flaky:         org.junit.Assert.assertEquals(file7.toString(), "/experiment");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withDurationAdded(readableDuration4, (int) (short) 0);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.minusWeeks(10);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYear(92);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withDayOfYear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        boolean boolean21 = localDateTime16.isBefore((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property24 = localDateTime20.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.weekOfWeekyear();
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.lang.String str29 = locale28.getDisplayLanguage();
        boolean boolean30 = locale28.hasExtensions();
        int int31 = property27.getMaximumTextLength(locale28);
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusMillis(99);
        int int35 = property27.compareTo((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property27.getFieldType();
        boolean boolean37 = localDateTime20.isSupported(dateTimeFieldType36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime39 = localDateTime14.withField(dateTimeFieldType36, (int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u5fb7\u6587" + "'", str29, "\u5fb7\u6587");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        boolean boolean10 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime9);
        int int11 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusMillis((int) (short) 0);
        int int14 = localDateTime5.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.minusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime18 = localDateTime5.withEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMinuteOfHour(6);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withDayOfYear(24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime18.withDayOfMonth(622);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 622 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        int int11 = property9.getMaximumValueOverall();
        org.joda.time.DurationField durationField12 = property9.getRangeDurationField();
        long long13 = property9.remainder();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) property9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertNotNull(durationField12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3577836593L + "'", long13 == 3577836593L);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setLanguage("/experiment/minuteOfHour");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: /experiment/minuteOfHour [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.weekOfWeekyear();
        java.lang.String str3 = property2.getAsShortText();
        java.lang.String str4 = property2.getName();
        org.joda.time.DurationField durationField5 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6" + "'", str3, "6");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "weekOfWeekyear" + "'", str4, "weekOfWeekyear");
        org.junit.Assert.assertNull(durationField5);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.io.File file1 = new java.io.File("");
        java.io.File file3 = new java.io.File(file1, "hi!");
        boolean boolean4 = file1.exists();
        boolean boolean6 = file1.setReadable(true);
        java.net.URL uRL7 = file1.toURL();
        java.io.File file10 = new java.io.File("hi!", "hi!");
        boolean boolean11 = file1.renameTo(file10);
        boolean boolean12 = file10.canWrite();
        boolean boolean13 = file10.isFile();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
        org.junit.Assert.assertEquals(file3.getParent(), "/");
        org.junit.Assert.assertEquals(file3.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(uRL7);
// flaky:         org.junit.Assert.assertEquals(uRL7.toString(), "file:/experiment");
        org.junit.Assert.assertEquals(file10.getParent(), "hi!");
        org.junit.Assert.assertEquals(file10.toString(), "hi!/hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        org.joda.time.LocalDateTime localDateTime12 = property9.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.DurationField durationField13 = property9.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime14 = property9.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property9.getFieldType();
        org.joda.time.LocalDateTime localDateTime16 = property9.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = property9.addWrapFieldToCopy(346);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plus(readableDuration19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withDurationAdded(readableDuration21, 0);
        int int24 = localDateTime20.getMillisOfDay();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35436777 + "'", int24 == 35436777);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime8.getFields();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plus(readablePeriod10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plus(readableDuration13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withYearOfEra(489);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfCentury();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.weekyear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = dateTimeZone20.equals(obj21);
        java.lang.String str23 = dateTimeZone20.toString();
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.lang.String str26 = locale25.getDisplayLanguage();
        java.util.Locale locale27 = java.util.Locale.US;
        java.lang.String str28 = locale25.getDisplayScript(locale27);
        java.lang.String str29 = dateTimeZone20.getName((long) ':', locale27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = property18.setCopy("2021-02-11T09:50:16.395Z", locale27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2021-02-11T09:50:16.395Z\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u5fb7\u6587" + "'", str26, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        java.io.File file3 = new java.io.File("");
        java.io.File file5 = new java.io.File(file3, "hi!");
        long long6 = file5.getUsableSpace();
        boolean boolean9 = file5.setWritable(false, false);
        java.net.URI uRI10 = file5.toURI();
        java.io.File file11 = null; // flaky: java.io.File.createTempFile("\ud504\ub791\uc2a4\uc5b4", "2022-02-11T09:50:16.973", file5);
        java.io.File file13 = new java.io.File("");
        java.io.File file15 = new java.io.File(file13, "hi!");
        boolean boolean16 = file13.exists();
        boolean boolean17 = file13.exists();
        boolean boolean19 = file13.setReadable(true);
        java.io.File file20 = file13.getParentFile();
        int int21 = file5.compareTo(file13);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "");
        org.junit.Assert.assertEquals(file5.getParent(), "/");
        org.junit.Assert.assertEquals(file5.toString(), "/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 280451792896L + "'", long6 == 280451792896L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(uRI10);
// flaky:         org.junit.Assert.assertNotNull(file11);
// flaky:         org.junit.Assert.assertEquals(file11.getParent(), "/hi!");
// flaky:         org.junit.Assert.assertEquals(file11.toString(), "\ud504\ub791\uc2a4\uc5b412034189252922284902022-02-11T09:50:16.973");
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "");
        org.junit.Assert.assertEquals(file15.getParent(), "/");
        org.junit.Assert.assertEquals(file15.toString(), "/hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(file20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int3 = timeZone0.getOffset((long) (byte) 0);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone0.hasSameRules(timeZone4);
        timeZone0.setID("German");
        java.lang.String str8 = timeZone0.getID();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        boolean boolean10 = timeZone9.observesDaylightTime();
        int int12 = timeZone9.getOffset((long) (byte) 0);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        boolean boolean14 = timeZone9.hasSameRules(timeZone13);
        timeZone9.setID("German");
        boolean boolean17 = timeZone0.hasSameRules(timeZone9);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        boolean boolean19 = timeZone18.observesDaylightTime();
        int int21 = timeZone18.getOffset((long) (byte) 0);
        boolean boolean22 = timeZone9.hasSameRules(timeZone18);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = timeZone18.getOffset(774, 35436777, 747, 52, 623, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "German" + "'", str8, "German");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky:         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.io.File file1 = new java.io.File("dayOfYear");
        boolean boolean2 = file1.isHidden();
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "dayOfYear");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        int int11 = property9.getMaximumValueOverall();
        java.lang.String str12 = property9.getName();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str15 = locale13.getExtension('a');
        int int16 = property9.getMaximumShortTextLength(locale13);
        org.joda.time.Interval interval17 = property9.toInterval();
        java.util.Locale locale18 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        java.lang.String str20 = locale18.getISO3Language();
        java.lang.String str21 = locale18.getVariant();
        boolean boolean22 = locale18.hasExtensions();
        java.lang.String str23 = locale18.getDisplayScript();
        int int24 = property9.getMaximumTextLength(locale18);
        java.lang.Object obj25 = locale18.clone();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "yearOfCentury" + "'", str12, "yearOfCentury");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zho" + "'", str20, "zho");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "zh_TW");
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays((int) ':');
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        boolean boolean6 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfCentury();
        java.lang.String str10 = property9.getName();
        int int11 = property9.getMaximumValueOverall();
        java.lang.String str12 = property9.getName();
        org.joda.time.LocalDateTime localDateTime13 = property9.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localDateTime13.toString("/tmp");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yearOfCentury" + "'", str10, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "yearOfCentury" + "'", str12, "yearOfCentury");
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getISO3Language();
        java.lang.String str3 = locale0.getVariant();
        java.lang.String str4 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh_TW" + "'", str4, "zh_TW");
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse(":", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}
