import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.parse((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder1 = node0.new FileLevelJsDocBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.google.javascript.rhino.Node$FileLevelJsDocBuilder with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            java.time.DayOfWeek dayOfWeek1 = java.time.DayOfWeek.of((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfWeek: 97");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.UNKNOWN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Unknown class name" + "'", str0, "Unknown class name");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int int0 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.NAME_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.google.javascript.jscomp.WarningsGuard.Priority priority0 = com.google.javascript.jscomp.WarningsGuard.Priority.STRICT;
        org.junit.Assert.assertTrue("'" + priority0 + "' != '" + com.google.javascript.jscomp.WarningsGuard.Priority.STRICT + "'", priority0.equals(com.google.javascript.jscomp.WarningsGuard.Priority.STRICT));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumDescriptorProto enumDescriptorProto2 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.parseDelimitedFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.security.Provider provider0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "Unknown class name", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.security.Provider.Service service10 = new java.security.Provider.Service(provider0, "hi!", "", "hi!", (java.util.List<java.lang.String>) strList7, strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int1 = com.google.protobuf.CodedInputStream.decodeZigZag32((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int0 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.SPAN_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.security.GeneralSecurityException generalSecurityException1 = new java.security.GeneralSecurityException("Unknown class name");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
        com.google.javascript.jscomp.DiagnosticGroups.TWEAKS = diagnosticGroup0;
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange extensionRange0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder builder1 = com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.newBuilder(extensionRange0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.google.protobuf.ByteString byteString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MethodOptions methodOptions1 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.google.protobuf.ByteString byteString0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.ServiceOptions serviceOptions2 = com.google.protobuf.DescriptorProtos.ServiceOptions.parseFrom(byteString0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setState(intermediateState2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset3 = strMap0.get((java.lang.Object) zoneOffset2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.time.ZoneOffset cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(zoneOffset2);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.nio.file.AccessMode accessMode0 = java.nio.file.AccessMode.EXECUTE;
        org.junit.Assert.assertTrue("'" + accessMode0 + "' != '" + java.nio.file.AccessMode.EXECUTE + "'", accessMode0.equals(java.nio.file.AccessMode.EXECUTE));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative0 = com.google.javascript.rhino.jstype.JSTypeNative.DATE_TYPE;
        org.junit.Assert.assertTrue("'" + jSTypeNative0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.DATE_TYPE + "'", jSTypeNative0.equals(com.google.javascript.rhino.jstype.JSTypeNative.DATE_TYPE));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        long[] longArray0 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer3 = java.nio.LongBuffer.wrap(longArray0, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.temporal.TemporalField temporalField5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = zoneOffset3.get(temporalField5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: field");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions1 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream0);
        java.io.InputStream inputStream2 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions3 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream2);
        java.io.InputStream inputStream4 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions5 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream4);
        java.io.InputStream inputStream6 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions7 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream6);
        com.google.protobuf.MessageOrBuilder messageOrBuilder8 = null;
        java.io.InputStream inputStream9 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions10 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream9);
        java.io.InputStream inputStream11 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions12 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.protobuf.MessageOrBuilder> messageOrBuilderList13 = com.google.common.collect.ImmutableList.of((com.google.protobuf.MessageOrBuilder) enumOptions1, (com.google.protobuf.MessageOrBuilder) enumOptions3, (com.google.protobuf.MessageOrBuilder) enumOptions5, (com.google.protobuf.MessageOrBuilder) enumOptions7, messageOrBuilder8, (com.google.protobuf.MessageOrBuilder) enumOptions10, (com.google.protobuf.MessageOrBuilder) enumOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 4");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(enumOptions1);
        org.junit.Assert.assertNotNull(enumOptions3);
        org.junit.Assert.assertNotNull(enumOptions5);
        org.junit.Assert.assertNotNull(enumOptions7);
        org.junit.Assert.assertNotNull(enumOptions10);
        org.junit.Assert.assertNotNull(enumOptions12);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean4 = node3.isVar();
        com.google.javascript.rhino.Node node5 = node3.getParent();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = null;
        // The following exception was thrown during execution in test generation
        try {
            node5.setJSDocInfo(jSDocInfo6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        int int0 = java.util.Spliterator.SUBSIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16384 + "'", int0 == 16384);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOption uninterpretedOption2 = com.google.protobuf.DescriptorProtos.UninterpretedOption.parseDelimitedFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate5 = java.time.LocalDate.from((java.time.temporal.TemporalAccessor) zoneOffset3);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDate from TemporalAccessor: +00:00:52 of type java.time.ZoneOffset");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative0 = com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
        org.junit.Assert.assertTrue("'" + jSTypeNative0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE + "'", jSTypeNative0.equals(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.ByteString byteString9 = com.google.protobuf.ByteString.copyFrom(byteArray6, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, -1, 0, 100, 0]");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.time.Instant instant0 = null;
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime3 = java.time.OffsetDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: instant");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset2);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        int int0 = com.google.protobuf.DescriptorProtos.FieldOptions.EXPERIMENTAL_MAP_KEY_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.time.Month month0 = java.time.Month.APRIL;
        java.time.format.TextStyle textStyle1 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = month0.getDisplayName(textStyle1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: textStyle");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.APRIL + "'", month0.equals(java.time.Month.APRIL));
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        int int0 = com.google.javascript.rhino.Node.FLAG_THIS_UNMODIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.of((int) (short) 0, (int) (short) 0, (int) (byte) -1, 0, 16384, (int) ' ', 9, zoneOffset10);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.temporal.ChronoField chronoField11 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime13 = zonedDateTime10.with((java.time.temporal.TemporalField) chronoField11, (long) 256);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for ClockHourOfAmPm (valid values 1 - 12): 256");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + chronoField11 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField11.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Month month1 = java.time.Month.of((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear: 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI7 = new java.net.URI("", "NUMBER 52.0 0", "Unknown class name", 0, "Unknown class name", "", "NUMBER 52.0 0");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Relative path in absolute URI: ://NUMBER%2052.0%200@Unknown class name:0Unknown%20class%20name?#NUMBER%2052.0%200");
        } catch (java.net.URISyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput1 = new com.google.javascript.jscomp.CompilerInput(sourceAst0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileOptions fileOptions5 = com.google.protobuf.DescriptorProtos.FileOptions.parseFrom(byteArray3, extensionRegistryLite4);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 10, 1]");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions1 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream0);
        java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite> priorityMap2 = new java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>();
        java.lang.Object obj3 = priorityMap2.clone();
        java.io.InputStream inputStream4 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions5 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream4);
        java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite> priorityMap6 = new java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>();
        java.io.InputStream inputStream7 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions8 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream7);
        java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite> priorityMap9 = new java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>();
        java.lang.Object obj10 = priorityMap9.clone();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableMap<com.google.protobuf.GeneratedMessage.ExtendableMessage<com.google.protobuf.DescriptorProtos.EnumOptions>, java.util.Dictionary<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>> enumOptionsExtendableMessageMap11 = com.google.common.collect.ImmutableMap.of((com.google.protobuf.GeneratedMessage.ExtendableMessage<com.google.protobuf.DescriptorProtos.EnumOptions>) enumOptions1, (java.util.Dictionary<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>) priorityMap2, (com.google.protobuf.GeneratedMessage.ExtendableMessage<com.google.protobuf.DescriptorProtos.EnumOptions>) enumOptions5, (java.util.Dictionary<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>) priorityMap6, (com.google.protobuf.GeneratedMessage.ExtendableMessage<com.google.protobuf.DescriptorProtos.EnumOptions>) enumOptions8, (java.util.Dictionary<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>) priorityMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: duplicate key: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(enumOptions1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertNotNull(enumOptions5);
        org.junit.Assert.assertNotNull(enumOptions8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "{}");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
        com.google.javascript.jscomp.DiagnosticGroups.VISIBILITY = diagnosticGroup0;
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.util.Date date6 = new java.util.Date((int) (byte) -1, (int) (short) 0, 1, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset7 = strMap0.remove((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 01 10:00:00 UTC 1899");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period1 = java.time.Period.parse((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Period");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.google.protobuf.ByteString byteString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto1 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.parseFrom(byteString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
        com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY = diagnosticGroup0;
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.time.ZoneOffset zoneOffset1 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.from((java.time.temporal.TemporalAccessor) zoneOffset1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZonedDateTime from TemporalAccessor: +00:00:52 of type java.time.ZoneOffset");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset1);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap.Entry entry1 = com.google.javascript.jscomp.FunctionInformationMap.Entry.parseFrom(byteArray0);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: Message missing required fields: id, source_name, line_number, module_name, size, name, compiled_source");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto1 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.parseDelimitedFrom(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode0 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        org.junit.Assert.assertTrue("'" + resolveMode0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode0.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.time.Period period0 = java.time.Period.ZERO;
        java.time.chrono.ChronoPeriod chronoPeriod1 = period0.normalized();
        java.time.temporal.TemporalAmount temporalAmount2 = null;
        java.time.Period period3 = java.time.Period.ZERO;
        java.time.chrono.ChronoPeriod chronoPeriod4 = period3.normalized();
        java.time.Period period5 = java.time.Period.ZERO;
        java.time.Period period7 = period5.plusMonths(0L);
        java.time.Period period8 = java.time.Period.ZERO;
        java.time.chrono.ChronoPeriod chronoPeriod9 = period8.normalized();
        java.time.Period period10 = java.time.Period.ZERO;
        java.time.Period period12 = period10.plusMonths(0L);
        int int13 = period10.getMonths();
        java.time.Period period14 = java.time.Period.ZERO;
        java.time.chrono.ChronoPeriod chronoPeriod15 = period14.normalized();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.time.temporal.TemporalAmount> temporalAmountList16 = com.google.common.collect.ImmutableList.of((java.time.temporal.TemporalAmount) period0, temporalAmount2, (java.time.temporal.TemporalAmount) period3, (java.time.temporal.TemporalAmount) period5, (java.time.temporal.TemporalAmount) chronoPeriod9, (java.time.temporal.TemporalAmount) period10, (java.time.temporal.TemporalAmount) chronoPeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(chronoPeriod1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(chronoPeriod4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(chronoPeriod9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(chronoPeriod15);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.security.SignatureException signatureException0 = new java.security.SignatureException();
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.util.Date date3 = new java.util.Date((int) (short) 100, (int) (short) 0, (int) (byte) 0);
        java.util.Date date9 = new java.util.Date((int) (byte) -1, (int) (short) 0, 1, 10, 0);
        int int10 = date3.compareTo(date9);
        org.junit.Assert.assertEquals(date3.toString(), "Fri Dec 31 00:00:00 UTC 1999");
        org.junit.Assert.assertEquals(date9.toString(), "Sun Jan 01 10:00:00 UTC 1899");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress3 = java.net.InetAddress.getByAddress(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: addr is of illegal length");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.function.DoubleSupplier doubleSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = optionalDouble0.orElseGet(doubleSupplier1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress7 = java.net.InetAddress.getByAddress("Unknown class name", byteArray6);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: addr is of illegal length");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, -1, -1]");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        int int0 = com.google.javascript.rhino.Node.IS_CONSTANT_NAME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 43 + "'", int0 == 43);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.ServiceOptions serviceOptions2 = com.google.protobuf.DescriptorProtos.ServiceOptions.parseFrom(codedInputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CheckLevel checkLevel3 = null;
        com.google.javascript.jscomp.JSError jSError4 = null;
        // The following exception was thrown during execution in test generation
        try {
            errorManager2.report(checkLevel3, jSError4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager2);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.EMPTY_TYPE_COMPONENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Named type with empty name component" + "'", str0, "Named type with empty name component");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions1 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream0);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = enumOptions1.getRepeatedField(fieldDescriptor2, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(enumOptions1);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.io.FileNotFoundException fileNotFoundException0 = new java.io.FileNotFoundException();
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap functionInformationMap1 = com.google.javascript.jscomp.FunctionInformationMap.parseDelimitedFrom(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime10.withHour(16);
        java.time.ZoneId zoneId13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime14 = zonedDateTime12.withZoneSameLocal(zoneId13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative0 = com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING;
        org.junit.Assert.assertTrue("'" + jSTypeNative0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING + "'", jSTypeNative0.equals(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode0 = com.google.javascript.jscomp.CompilerOptions.TracerMode.ALL;
        org.junit.Assert.assertTrue("'" + tracerMode0 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.ALL + "'", tracerMode0.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.ALL));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap.Module module7 = com.google.javascript.jscomp.FunctionInformationMap.Module.parseFrom(byteArray6);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: Protocol message tag had invalid wire type.");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, -1, -1, 0]");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.MessageOptions.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(100);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = byteBuffer1.getInt((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        int int0 = java.util.Spliterator.SIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileDescriptorProto fileDescriptorProto8 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(byteArray6, extensionRegistryLite7);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: Protocol message end-group tag did not match expected tag.");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 100, -1, 0, -1]");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit13 = chronoField12.getBaseUnit();
        java.time.LocalDateTime localDateTime14 = localDateTime4.plus((long) 1970, temporalUnit13);
        java.time.temporal.Temporal temporal15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = temporalUnit13.isSupportedBy(temporal15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField12.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit13 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit13.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.Iterable<java.lang.String> strIterable0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = strSet5.isEmpty();
        java.util.Set<java.lang.String> strSet8 = java.time.ZoneId.getAvailableZoneIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableSet<java.lang.Iterable<java.lang.String>> strIterableSet9 = com.google.common.collect.ImmutableSet.of(strIterable0, (java.lang.Iterable<java.lang.String>) strSet5, (java.lang.Iterable<java.lang.String>) strSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator0 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator1 = wildcardChronoZonedDateTimeComparator0.reversed();
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator0);
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator1);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream1 = new java.io.PrintStream("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit1 = chronoField0.getBaseUnit();
        java.time.DayOfWeek dayOfWeek2 = java.time.DayOfWeek.FRIDAY;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = chronoField0.getFrom((java.time.temporal.TemporalAccessor) dayOfWeek2);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfAmPm");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField0.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit1 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit1.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertTrue("'" + dayOfWeek2 + "' != '" + java.time.DayOfWeek.FRIDAY + "'", dayOfWeek2.equals(java.time.DayOfWeek.FRIDAY));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        int int0 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.INPUT_TYPE_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        int int2 = com.google.protobuf.CodedOutputStream.computeFixed32Size(64, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        int int5 = localDateTime4.getYear();
        java.time.LocalDate localDate6 = localDateTime4.toLocalDate();
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.MICRO_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate9 = localDate6.with((java.time.temporal.TemporalField) chronoField7, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MicroOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_DAY + "'", chronoField7.equals(java.time.temporal.ChronoField.MICRO_OF_DAY));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.util.Comparator<java.time.chrono.ChronoLocalDate> chronoLocalDateComparator0 = java.time.chrono.ChronoLocalDate.timeLineOrder();
        org.junit.Assert.assertNotNull(chronoLocalDateComparator0);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.google.protobuf.ByteString byteString0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MessageOptions messageOptions2 = com.google.protobuf.DescriptorProtos.MessageOptions.parseFrom(byteString0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.time.Clock clock0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = java.time.LocalDate.now(clock0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: clock");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter1 = new java.io.PrintWriter(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldOptions fieldOptions2 = com.google.protobuf.DescriptorProtos.FieldOptions.parseDelimitedFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange extensionRange1 = com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.parseDelimitedFrom(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.time.format.FormatStyle formatStyle0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofLocalizedDate(formatStyle0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: dateStyle");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.google.protobuf.WireFormat.FieldType fieldType0 = com.google.protobuf.WireFormat.FieldType.UINT32;
        org.junit.Assert.assertTrue("'" + fieldType0 + "' != '" + com.google.protobuf.WireFormat.FieldType.UINT32 + "'", fieldType0.equals(com.google.protobuf.WireFormat.FieldType.UINT32));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 10 };
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location location7 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.parseFrom(byteArray5, extensionRegistryLite6);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: Protocol message end-group tag did not match expected tag.");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 1, 10, 10]");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset13);
        java.time.ZonedDateTime zonedDateTime15 = java.time.ZonedDateTime.of(localDateTime9, (java.time.ZoneId) zoneOffset13);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean17 = localDateTime9.isSupported((java.time.temporal.TemporalField) chronoField16);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = zoneOffset3.get((java.time.temporal.TemporalField) chronoField16);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfAmPm");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField16.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        int int0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.SOURCE_CODE_INFO_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSSourceFile jSSourceFile1 = com.google.javascript.jscomp.JSSourceFile.fromFile(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.MICRO_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant3 = instant0.with((java.time.temporal.TemporalField) chronoField1, (long) 64);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MicroOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.MICRO_OF_DAY));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor2 = null;
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.Message.Builder builder5 = builder0.setField(fieldDescriptor2, (java.lang.Object) builder3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + label4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = compiler1.getErrorCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.google.protobuf.Descriptors.FieldDescriptor.JavaType javaType0 = com.google.protobuf.Descriptors.FieldDescriptor.JavaType.BOOLEAN;
        org.junit.Assert.assertTrue("'" + javaType0 + "' != '" + com.google.protobuf.Descriptors.FieldDescriptor.JavaType.BOOLEAN + "'", javaType0.equals(com.google.protobuf.Descriptors.FieldDescriptor.JavaType.BOOLEAN));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        boolean boolean6 = strSet4.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream7 = strSet4.stream();
        boolean boolean8 = strSet4.isEmpty();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.google.protobuf.DescriptorProtos.FieldOptions.CType cType0 = com.google.protobuf.DescriptorProtos.FieldOptions.CType.STRING;
        int int1 = cType0.getNumber();
        org.junit.Assert.assertTrue("'" + cType0 + "' != '" + com.google.protobuf.DescriptorProtos.FieldOptions.CType.STRING + "'", cType0.equals(com.google.protobuf.DescriptorProtos.FieldOptions.CType.STRING));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumOptions enumOptions2 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(codedInputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.FRIDAY;
        java.time.format.TextStyle textStyle1 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dayOfWeek0.getDisplayName(textStyle1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: textStyle");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.FRIDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.FRIDAY));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime10.minusSeconds((long) '#');
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset16);
        java.time.ZoneOffset zoneOffset21 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset21);
        java.time.ZonedDateTime zonedDateTime23 = java.time.ZonedDateTime.of(localDateTime17, (java.time.ZoneId) zoneOffset21);
        boolean boolean24 = zonedDateTime10.isBefore((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime23);
        java.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = zonedDateTime10.format(dateTimeFormatter25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatter");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        char char0 = java.io.File.pathSeparatorChar;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + ':' + "'", char0 == ':');
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.NANOSECONDS;
        long long2 = timeUnit0.toDays((long) (byte) 10);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = compilerInput3.getPathRelativeToClosureBase();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) -1, (byte) 10 };
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumOptions enumOptions7 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(byteArray5, extensionRegistryLite6);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 10, 100, -1, 10]");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        int int0 = com.google.javascript.rhino.Node.FLAG_NO_THROWS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.String> strCollection4 = compilerInput3.getRequires();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        int int5 = localDateTime4.getYear();
        java.time.LocalDate localDate6 = localDateTime4.toLocalDate();
        java.time.LocalDate localDate8 = localDate6.plusDays((long) '#');
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate11 = localDate6.with((java.time.temporal.TemporalField) chronoField9, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField9.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.google.protobuf.Descriptors.FieldDescriptor.Type type0 = com.google.protobuf.Descriptors.FieldDescriptor.Type.BOOL;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.google.protobuf.Descriptors.FieldDescriptor.Type.BOOL + "'", type0.equals(com.google.protobuf.Descriptors.FieldDescriptor.Type.BOOL));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY = diagnosticGroup0;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.time.Period period0 = java.time.Period.ZERO;
        java.time.chrono.ChronoPeriod chronoPeriod1 = period0.normalized();
        java.time.Period period3 = period0.plusMonths((long) ' ');
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset7);
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime13 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset12);
        java.time.ZonedDateTime zonedDateTime14 = java.time.ZonedDateTime.of(localDateTime8, (java.time.ZoneId) zoneOffset12);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit17 = chronoField16.getBaseUnit();
        java.time.LocalDateTime localDateTime18 = localDateTime8.plus((long) 1970, temporalUnit17);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = period3.get(temporalUnit17);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Hours");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(chronoPeriod1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField16.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit17 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit17.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = new java.net.URL("");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.Message.Builder builder4 = builder0.addRepeatedField(fieldDescriptor2, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.javascript.jscomp.FunctionInformationMap.Entry.Builder.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumOptions enumOptions2 = com.google.protobuf.DescriptorProtos.EnumOptions.parseDelimitedFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.google.protobuf.ByteString byteString0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumOptions enumOptions2 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(byteString0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        java.io.InputStream inputStream1 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = builder0.mergeDelimitedFrom(inputStream1, extensionRegistryLite2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.google.protobuf.WireFormat.FieldType fieldType0 = com.google.protobuf.WireFormat.FieldType.SINT64;
        org.junit.Assert.assertTrue("'" + fieldType0 + "' != '" + com.google.protobuf.WireFormat.FieldType.SINT64 + "'", fieldType0.equals(com.google.protobuf.WireFormat.FieldType.SINT64));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange extensionRange2 = com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.parseFrom(codedInputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.FRIDAY;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange2 = dayOfWeek0.range((java.time.temporal.TemporalField) chronoField1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfAmPm");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.FRIDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.FRIDAY));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField1.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.InvalidPropertiesFormatException invalidPropertiesFormatException1 = new java.util.InvalidPropertiesFormatException("Named type with empty name component");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.javascript.jscomp.FunctionInformationMap.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = compilerInput3.getAstRoot((com.google.javascript.jscomp.AbstractCompiler) compiler5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate((int) ' ');
        boolean boolean2 = charBuffer1.isDirect();
        java.nio.CharBuffer charBuffer4 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer6 = charBuffer4.put('a');
        char[] charArray8 = new char[] { '4' };
        java.nio.CharBuffer charBuffer9 = charBuffer6.get(charArray8);
        java.nio.CharBuffer charBuffer10 = charBuffer6.compact();
        java.nio.CharBuffer charBuffer12 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer14 = charBuffer12.put('a');
        java.nio.CharBuffer charBuffer16 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer18 = charBuffer16.put('a');
        char[] charArray20 = new char[] { '4' };
        java.nio.CharBuffer charBuffer21 = charBuffer18.get(charArray20);
        java.nio.CharBuffer charBuffer22 = charBuffer18.compact();
        com.google.common.collect.ImmutableSet<java.lang.Appendable> appendableSet23 = com.google.common.collect.ImmutableSet.of((java.lang.Appendable) charBuffer1, (java.lang.Appendable) charBuffer6, (java.lang.Appendable) charBuffer12, (java.lang.Appendable) charBuffer22);
        // The following exception was thrown during execution in test generation
        try {
            appendableSet23.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(charBuffer4);
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer9);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(charBuffer12);
        org.junit.Assert.assertNotNull(charBuffer14);
        org.junit.Assert.assertNotNull(charBuffer16);
        org.junit.Assert.assertNotNull(charBuffer18);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer21);
        org.junit.Assert.assertNotNull(charBuffer22);
        org.junit.Assert.assertNotNull(appendableSet23);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI7 = new java.net.URI("NUMBER 52.0 0", "hi!", "", 16, "hi!", "Unknown class name", "Unknown class name");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Relative path in absolute URI: NUMBER 52.0 0://hi!@:16hi!?Unknown%20class%20name#Unknown%20class%20name");
        } catch (java.net.URISyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.Message.Builder builder6 = builder0.mergeFrom(byteArray3, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        boolean boolean6 = strSet4.isEmpty();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(100);
        boolean boolean9 = strSet4.equals((java.lang.Object) byteBuffer8);
        java.nio.IntBuffer intBuffer10 = byteBuffer8.asIntBuffer();
        double double11 = byteBuffer8.getDouble();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer8.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = byteBuffer12.putShort((int) (byte) 0, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intBuffer10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(byteBuffer12);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.lang.String str0 = java.io.File.separator;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/" + "'", str0, "/");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.Descriptors.Descriptor descriptor2 = descriptor0.findNestedTypeByName("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.protobuf.Descriptors.Descriptor> descriptorList3 = descriptor2.getNestedTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNull(descriptor2);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset7);
        int int9 = localDateTime8.getYear();
        java.time.Instant instant10 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset14);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.ofInstant(instant10, (java.time.ZoneId) zoneOffset14);
        java.time.Instant instant17 = localDateTime8.toInstant(zoneOffset14);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime18 = java.time.OffsetTime.of(64, 64, 100, (int) (short) 10, zoneOffset14);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 64");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(instant17);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        int int0 = com.google.protobuf.DescriptorProtos.FileOptions.JAVA_PACKAGE_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        int int0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.LABEL_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.jstype.FunctionType functionType5 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, false);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = jSTypeRegistry8.createObjectType(objectType9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry2.createFunctionTypeWithNewReturnType(functionType5, (com.google.javascript.rhino.jstype.JSType) objectType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType10);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder2 = charset1.newDecoder();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromFile(file0, charset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charsetDecoder2);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, false);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = jSTypeRegistry10.createObjectType(objectType11);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray33 = new com.google.javascript.rhino.jstype.JSType[] { objectType6, objectType12, objectType17, objectType22, objectType26, objectType31 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node34 = jSTypeRegistry2.createOptionalParameters(jSTypeArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(jSTypeArray33);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy0 = com.google.javascript.jscomp.PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC;
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy0 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC + "'", propertyRenamingPolicy0.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = compilerInput3.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.Message.Builder builder2 = builder0.newBuilderForField(fieldDescriptor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.google.protobuf.WireFormat.FieldType fieldType0 = com.google.protobuf.WireFormat.FieldType.INT64;
        org.junit.Assert.assertTrue("'" + fieldType0 + "' != '" + com.google.protobuf.WireFormat.FieldType.INT64 + "'", fieldType0.equals(com.google.protobuf.WireFormat.FieldType.INT64));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto1 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.getDefaultInstance();
        int int2 = com.google.protobuf.CodedOutputStream.computeMessageSetExtensionSize((int) (byte) -1, (com.google.protobuf.MessageLite) methodDescriptorProto1);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = methodDescriptorProto1.getRepeatedField(fieldDescriptor3, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(methodDescriptorProto1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean4 = node3.isStringKey();
        com.google.javascript.rhino.Node node5 = node3.removeFirstChild();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        boolean boolean6 = strSet4.isEmpty();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(100);
        boolean boolean9 = strSet4.equals((java.lang.Object) byteBuffer8);
        java.nio.IntBuffer intBuffer10 = byteBuffer8.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = byteBuffer8.getLong(16384);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intBuffer10);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.google.protobuf.Internal.EnumLiteMap<com.google.protobuf.DescriptorProtos.FieldOptions.CType> cTypeEnumLiteMap0 = com.google.protobuf.DescriptorProtos.FieldOptions.CType.internalGetValueMap();
        org.junit.Assert.assertNotNull(cTypeEnumLiteMap0);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        compilerInput3.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler5);
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler5.getCodingConvention();
        com.google.javascript.rhino.InputId inputId10 = new com.google.javascript.rhino.InputId("NUMBER 52.0 0");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput11 = compiler5.getInput(inputId10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(codingConvention8);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        int int5 = localDateTime4.getYear();
        java.time.Instant instant6 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset10);
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.ofInstant(instant6, (java.time.ZoneId) zoneOffset10);
        java.time.Instant instant13 = localDateTime4.toInstant(zoneOffset10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime15 = localDateTime4.withDayOfMonth((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(instant13);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = builder0.getField(fieldDescriptor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        int int0 = com.google.protobuf.DescriptorProtos.ServiceOptions.UNINTERPRETED_OPTION_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 999 + "'", int0 == 999);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean5 = node4.isStringKey();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = node4.getExistingIntProp(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = builder0.clearField(fieldDescriptor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.time.Instant instant0 = null;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset4);
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset9);
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.of(localDateTime5, (java.time.ZoneId) zoneOffset9);
        java.time.chrono.Chronology chronology12 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) zoneOffset9);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime13 = java.time.OffsetTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: instant");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto0 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.getDefaultInstance();
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions1 = methodDescriptorProto0.getOptions();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = methodOptions1.getField(fieldDescriptor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(methodDescriptorProto0);
        org.junit.Assert.assertNotNull(methodOptions1);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.EPOCH_DAY;
        java.time.Instant instant1 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset5);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.ofInstant(instant1, (java.time.ZoneId) zoneOffset5);
        java.time.temporal.ValueRange valueRange8 = chronoField0.rangeRefinedBy((java.time.temporal.TemporalAccessor) offsetDateTime7);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime10 = offsetDateTime7.withMinute((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): 97");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.EPOCH_DAY + "'", chronoField0.equals(java.time.temporal.ChronoField.EPOCH_DAY));
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(valueRange8);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.util.Date date3 = new java.util.Date((int) (short) 100, (int) (short) 0, (int) (byte) 0);
        java.lang.Object obj4 = date3.clone();
        org.junit.Assert.assertEquals(date3.toString(), "Fri Dec 31 00:00:00 UTC 1999");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "Fri Dec 31 00:00:00 UTC 1999");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "Fri Dec 31 00:00:00 UTC 1999");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "Fri Dec 31 00:00:00 UTC 1999");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.nio.file.Path path0 = null;
        java.nio.file.OpenOption[] openOptionArray1 = new java.nio.file.OpenOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.FileChannel fileChannel2 = java.nio.channels.FileChannel.open(path0, openOptionArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(openOptionArray1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        boolean boolean6 = strSet4.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream7 = strSet4.stream();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        boolean boolean14 = strSet12.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream15 = strSet12.stream();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        boolean boolean22 = strSet20.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream23 = strSet20.stream();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        boolean boolean30 = strSet28.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream31 = strSet28.stream();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        boolean boolean38 = strSet36.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream39 = strSet36.stream();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        boolean boolean46 = strSet44.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream47 = strSet44.stream();
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        boolean boolean54 = strSet52.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream55 = strSet52.stream();
        java.util.stream.Stream[] streamArray57 = new java.util.stream.Stream[6];
        @SuppressWarnings("unchecked")
        java.util.stream.Stream<java.lang.String>[] strStreamArray58 = (java.util.stream.Stream<java.lang.String>[]) streamArray57;
        strStreamArray58[0] = strStream15;
        strStreamArray58[1] = strStream23;
        strStreamArray58[2] = strStream31;
        strStreamArray58[3] = strStream39;
        strStreamArray58[4] = strStream47;
        strStreamArray58[5] = strStream55;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.String>[] strStreamArray71 = strSet4.toArray(strStreamArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strStream15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strStream23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strStream31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strStream39);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strStream47);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strStream55);
        org.junit.Assert.assertNotNull(streamArray57);
        org.junit.Assert.assertNotNull(strStreamArray58);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative0 = com.google.javascript.rhino.jstype.JSTypeNative.ERROR_FUNCTION_TYPE;
        org.junit.Assert.assertTrue("'" + jSTypeNative0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.ERROR_FUNCTION_TYPE + "'", jSTypeNative0.equals(com.google.javascript.rhino.jstype.JSTypeNative.ERROR_FUNCTION_TYPE));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        int int5 = localDateTime4.getYear();
        java.time.LocalDate localDate6 = localDateTime4.toLocalDate();
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset10);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset15);
        java.time.ZonedDateTime zonedDateTime17 = java.time.ZonedDateTime.of(localDateTime11, (java.time.ZoneId) zoneOffset15);
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit20 = chronoField19.getBaseUnit();
        java.time.LocalDateTime localDateTime21 = localDateTime11.plus((long) 1970, temporalUnit20);
        java.time.LocalTime localTime22 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime21);
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime27 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset26);
        java.time.OffsetDateTime offsetDateTime28 = java.time.OffsetDateTime.of(localDate6, localTime22, zoneOffset26);
        java.time.LocalDate localDate29 = java.time.LocalDate.now();
        java.time.temporal.ChronoField chronoField30 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit31 = chronoField30.getBaseUnit();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = localTime22.until((java.time.temporal.Temporal) localDate29, temporalUnit31);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalTime from TemporalAccessor: 2022-02-21 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField19.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit20 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit20.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(offsetDateTime28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + chronoField30 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField30.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit31 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit31.equals(java.time.temporal.ChronoUnit.HOURS));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator0 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        boolean boolean2 = wildcardChronoZonedDateTimeComparator0.equals((java.lang.Object) ':');
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange extensionRange1 = com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.parseFrom(codedInputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder2 = builder0.clearOptions();
        java.io.InputStream inputStream3 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = builder0.mergeDelimitedFrom(inputStream3, extensionRegistryLite4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder2 = builder0.clearOptions();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor3 = null;
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset7);
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime13 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset12);
        java.time.ZonedDateTime zonedDateTime14 = java.time.ZonedDateTime.of(localDateTime8, (java.time.ZoneId) zoneOffset12);
        java.time.ZonedDateTime zonedDateTime16 = zonedDateTime14.withYear((int) (short) 1);
        java.time.ZonedDateTime zonedDateTime18 = zonedDateTime16.minusSeconds((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder19 = builder2.addRepeatedField(fieldDescriptor3, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertNotNull(zonedDateTime18);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.net.SocketException socketException1 = new java.net.SocketException("/");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.google.protobuf.ByteString byteString0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumValueOptions enumValueOptions2 = com.google.protobuf.DescriptorProtos.EnumValueOptions.parseFrom(byteString0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart namePart2 = com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.parseFrom(codedInputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto0 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.getDefaultInstance();
        java.lang.String str1 = methodDescriptorProto0.getOutputType();
        boolean boolean2 = methodDescriptorProto0.hasInputType();
        org.junit.Assert.assertNotNull(methodDescriptorProto0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        int int1 = com.google.protobuf.CodedOutputStream.computeFixed32SizeNoTag((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit1 = chronoField0.getBaseUnit();
        java.time.Month month2 = java.time.Month.AUGUST;
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset6);
        java.time.ZoneOffset zoneOffset11 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset11);
        java.time.ZonedDateTime zonedDateTime13 = java.time.ZonedDateTime.of(localDateTime7, (java.time.ZoneId) zoneOffset11);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean15 = localDateTime7.isSupported((java.time.temporal.TemporalField) chronoField14);
        boolean boolean16 = month2.isSupported((java.time.temporal.TemporalField) chronoField14);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = chronoField0.getFrom((java.time.temporal.TemporalAccessor) month2);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfAmPm");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField0.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit1 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit1.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.AUGUST + "'", month2.equals(java.time.Month.AUGUST));
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField14.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.MICRO_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate3 = localDate0.with((java.time.temporal.TemporalField) chronoField1, 1L);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MicroOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.MICRO_OF_DAY));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean6 = node5.isStringKey();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean11 = node10.isVar();
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] { node5, node10 };
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, nodeArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(43, nodeArray12, (int) (short) -1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: duplicate child");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeArray12);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder2 = builder0.clearOptions();
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = builder2.mergeDelimitedFrom(inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) -1 };
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MessageOptions messageOptions4 = com.google.protobuf.DescriptorProtos.MessageOptions.parseFrom(byteArray2, extensionRegistryLite3);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: Protocol message contained an invalid tag (zero).");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, -1]");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = com.google.protobuf.DescriptorProtos.DescriptorProto.parseDelimitedFrom(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration1 = java.time.Duration.parse((java.lang.CharSequence) "Unknown class name");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Duration");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo2 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.parseFrom(inputStream0, extensionRegistryLite1);
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder3 = sourceCodeInfo2.newBuilderForType();
        byte[] byteArray5 = new byte[] { (byte) -1 };
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder9 = builder3.mergeFrom(byteArray5, (int) (byte) 0, 2, extensionRegistryLite8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceCodeInfo2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1]");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress1 = java.net.InetAddress.getByName("ISO");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ISO: Name or service not known");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        // The following exception was thrown during execution in test generation
        try {
            java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofPattern("ISO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = descriptor0.toProto();
        boolean boolean2 = descriptorProto1.isInitialized();
        java.util.List<com.google.protobuf.DescriptorProtos.DescriptorProto> descriptorProtoList3 = descriptorProto1.getNestedTypeList();
        com.google.protobuf.CodedOutputStream codedOutputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            descriptorProto1.writeTo(codedOutputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(descriptorProto1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(descriptorProtoList3);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.Compiler.MOTION_ITERATIONS_ERROR;
        com.google.javascript.jscomp.DiagnosticType[] diagnosticTypeArray1 = new com.google.javascript.jscomp.DiagnosticType[] { diagnosticType0 };
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup2 = new com.google.javascript.jscomp.DiagnosticGroup(diagnosticTypeArray1);
        org.junit.Assert.assertNotNull(diagnosticType0);
        org.junit.Assert.assertNotNull(diagnosticTypeArray1);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.CodedInputStream codedInputStream1 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder3 = builder0.mergeFrom(codedInputStream1, extensionRegistryLite2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.google.protobuf.Descriptors.FieldDescriptor.Type type0 = com.google.protobuf.Descriptors.FieldDescriptor.Type.SFIXED64;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.google.protobuf.Descriptors.FieldDescriptor.Type.SFIXED64 + "'", type0.equals(com.google.protobuf.Descriptors.FieldDescriptor.Type.SFIXED64));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.getDescriptor();
        java.util.List<com.google.protobuf.Descriptors.EnumDescriptor> enumDescriptorList1 = descriptor0.getEnumTypes();
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(enumDescriptorList1);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap functionInformationMap2 = com.google.javascript.jscomp.FunctionInformationMap.parseFrom(codedInputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo2 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.parseFrom(inputStream0, extensionRegistryLite1);
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder3 = sourceCodeInfo2.newBuilderForType();
        boolean boolean4 = builder3.isInitialized();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location location6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder7 = builder3.setLocation((int) (byte) 10, location6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceCodeInfo2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.parse((java.lang.CharSequence) charBuffer1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '????????????????????????????????' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder2.setMessageType((int) (byte) 0, descriptorProto4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder2 = charset1.newDecoder();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSSourceFile jSSourceFile3 = com.google.javascript.jscomp.JSSourceFile.fromFile(file0, charset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charsetDecoder2);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = descriptor0.toProto();
        boolean boolean2 = descriptorProto1.isInitialized();
        java.util.List<com.google.protobuf.DescriptorProtos.DescriptorProto> descriptorProtoList3 = descriptorProto1.getNestedTypeList();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto5 = descriptorProto1.getExtension((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(descriptorProto1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(descriptorProtoList3);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto1 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.parseFrom(codedInputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.util.logging.Level level0 = java.util.logging.Level.CONFIG;
        org.junit.Assert.assertNotNull(level0);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean5 = strMap0.containsValue((java.lang.Object) '4');
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, false);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = jSTypeRegistry8.createObjectType(objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = jSTypeRegistry13.createObjectType(objectType14);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair16 = objectType10.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType15);
        java.nio.charset.Charset charset17 = java.nio.charset.Charset.defaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset18 = strMap0.getOrDefault((java.lang.Object) objectType10, charset17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objectType10);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(typePair16);
        org.junit.Assert.assertNotNull(charset17);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.lang.String[] strArray0 = null;
        com.google.protobuf.Descriptors.FileDescriptor fileDescriptor1 = null;
        com.google.protobuf.Descriptors.FileDescriptor[] fileDescriptorArray2 = new com.google.protobuf.Descriptors.FileDescriptor[] { fileDescriptor1 };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner internalDescriptorAssigner3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(strArray0, fileDescriptorArray2, internalDescriptorAssigner3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileDescriptorArray2);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        int int0 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.NAME_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap.Entry entry2 = com.google.javascript.jscomp.FunctionInformationMap.Entry.parseFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: Message missing required fields: id, source_name, line_number, module_name, size, name, compiled_source");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        int int0 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.OPTIONS_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto1 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.parseDelimitedFrom(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        int int5 = localDateTime4.getYear();
        java.time.LocalDate localDate6 = localDateTime4.toLocalDate();
        java.time.chrono.Chronology chronology7 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localDate6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.Era era9 = chronology7.eraOf((-1));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid era: -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.newBuilder();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = builder0.getRepeatedField(fieldDescriptor1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean4 = node3.isStringKey();
        boolean boolean5 = node3.isThrow();
        boolean boolean6 = node3.isVarArgs();
        boolean boolean7 = node3.isStringKey();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean12 = node11.isFromExterns();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean17 = node16.isFromExterns();
        java.lang.String str18 = node16.toString();
        com.google.javascript.rhino.Node node19 = node11.copyInformationFrom(node16);
        int int20 = node11.getLineno();
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime25 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset24);
        int int26 = localDateTime25.getYear();
        java.time.LocalDate localDate27 = localDateTime25.toLocalDate();
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime32 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset31);
        java.time.ZoneOffset zoneOffset36 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime37 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset36);
        java.time.ZonedDateTime zonedDateTime38 = java.time.ZonedDateTime.of(localDateTime32, (java.time.ZoneId) zoneOffset36);
        java.time.temporal.ChronoField chronoField40 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit41 = chronoField40.getBaseUnit();
        java.time.LocalDateTime localDateTime42 = localDateTime32.plus((long) 1970, temporalUnit41);
        java.time.LocalTime localTime43 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime42);
        java.time.ZoneOffset zoneOffset47 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime48 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset47);
        java.time.OffsetDateTime offsetDateTime49 = java.time.OffsetDateTime.of(localDate27, localTime43, zoneOffset47);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean54 = node53.isFromExterns();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean59 = node58.isFromExterns();
        java.lang.String str60 = node58.toString();
        com.google.javascript.rhino.Node node61 = node53.copyInformationFrom(node58);
        boolean boolean62 = zoneOffset47.equals((java.lang.Object) node58);
        // The following exception was thrown during execution in test generation
        try {
            node3.addChildAfter(node11, node58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NUMBER 52.0 0" + "'", str18, "NUMBER 52.0 0");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(zoneOffset36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(zonedDateTime38);
        org.junit.Assert.assertTrue("'" + chronoField40 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField40.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit41 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit41.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(zoneOffset47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(offsetDateTime49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "NUMBER 52.0 0" + "'", str60, "NUMBER 52.0 0");
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean4 = node3.isStringKey();
        boolean boolean5 = node3.isThrow();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = node3.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit13 = chronoField12.getBaseUnit();
        java.time.LocalDateTime localDateTime14 = localDateTime4.plus((long) 1970, temporalUnit13);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset19);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime25 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset24);
        java.time.ZonedDateTime zonedDateTime26 = java.time.ZonedDateTime.of(localDateTime20, (java.time.ZoneId) zoneOffset24);
        java.time.temporal.ChronoField chronoField28 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit29 = chronoField28.getBaseUnit();
        java.time.LocalDateTime localDateTime30 = localDateTime20.plus((long) 1970, temporalUnit29);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime31 = localDateTime14.minus((long) 43, temporalUnit29);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime32 = java.time.OffsetDateTime.from((java.time.temporal.TemporalAccessor) localDateChronoLocalDateTime31);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain OffsetDateTime from TemporalAccessor: 1970-03-22T07:02:32 of type java.time.LocalDateTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField12.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit13 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit13.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(zonedDateTime26);
        org.junit.Assert.assertTrue("'" + chronoField28 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField28.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit29 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit29.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime31);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.util.Locale locale3 = new java.util.Locale("", "NUMBER 52.0 0", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getUnicodeLocaleType("goog.global");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: goog.global");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "_NUMBER 52.0 0_hi!");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        compilerInput3.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = compilerInput3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        java.util.stream.LongStream longStream4 = java.util.stream.LongStream.of((long) (-1));
        com.google.common.collect.ImmutableMap<com.google.javascript.jscomp.Compiler, java.util.stream.LongStream> compilerMap5 = com.google.common.collect.ImmutableMap.of(compiler1, longStream4);
        java.util.stream.DoubleStream doubleStream6 = longStream4.asDoubleStream();
        java.util.OptionalDouble optionalDouble7 = doubleStream6.findAny();
        java.util.function.DoubleBinaryOperator doubleBinaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble9 = doubleStream6.reduce(doubleBinaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(compilerMap5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(optionalDouble7);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.temporal.ChronoField chronoField11 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean12 = localDateTime4.isSupported((java.time.temporal.TemporalField) chronoField11);
        java.lang.String str13 = chronoField11.toString();
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + chronoField11 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField11.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ClockHourOfAmPm" + "'", str13, "ClockHourOfAmPm");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions1 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream0);
        java.util.List<com.google.protobuf.DescriptorProtos.UninterpretedOption> uninterpretedOptionList2 = enumOptions1.getUninterpretedOptionList();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOption uninterpretedOption4 = enumOptions1.getUninterpretedOption((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(enumOptions1);
        org.junit.Assert.assertNotNull(uninterpretedOptionList2);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto4 = builder0.getExtension(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        int[] intArray4 = new int[] { 16, ':', 43, (short) 100 };
        java.util.stream.IntStream intStream5 = java.util.stream.IntStream.of(intArray4);
        java.util.function.IntBinaryOperator intBinaryOperator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalInt optionalInt7 = intStream5.reduce(intBinaryOperator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[16, 58, 43, 100]");
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto0 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.getDefaultInstance();
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions1 = methodDescriptorProto0.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder uninterpretedOptionOrBuilder3 = methodOptions1.getUninterpretedOptionOrBuilder(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(methodDescriptorProto0);
        org.junit.Assert.assertNotNull(methodOptions1);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        java.io.InputStream inputStream3 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = builder0.mergeDelimitedFrom(inputStream3, extensionRegistryLite4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        int int5 = localDateTime4.getYear();
        java.time.LocalDate localDate6 = localDateTime4.toLocalDate();
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset10);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset15);
        java.time.ZonedDateTime zonedDateTime17 = java.time.ZonedDateTime.of(localDateTime11, (java.time.ZoneId) zoneOffset15);
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit20 = chronoField19.getBaseUnit();
        java.time.LocalDateTime localDateTime21 = localDateTime11.plus((long) 1970, temporalUnit20);
        java.time.LocalTime localTime22 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime21);
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime27 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset26);
        java.time.OffsetDateTime offsetDateTime28 = java.time.OffsetDateTime.of(localDate6, localTime22, zoneOffset26);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime30 = localTime22.withSecond((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfMinute (valid values 0 - 59): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField19.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit20 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit20.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(offsetDateTime28);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(codedInputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        int int1 = com.google.protobuf.CodedOutputStream.computeTagSize(50);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto2 = builder0.buildPartial();
        int int3 = fieldDescriptorProto2.getSerializedSize();
        boolean boolean4 = fieldDescriptorProto2.hasExtendee();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(fieldDescriptorProto2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumDescriptorProto enumDescriptorProto1 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.parseDelimitedFrom(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        int int2 = com.google.protobuf.CodedOutputStream.computeInt64Size((int) (byte) 100, (long) 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        java.io.InputStream inputStream2 = null;
        com.google.protobuf.MessageLite.Builder builder3 = builder0.mergeFrom(inputStream2);
        com.google.protobuf.CodedInputStream codedInputStream4 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder6 = builder0.mergeFrom(codedInputStream4, extensionRegistryLite5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder3 = charset2.newDecoder();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset4 = strMap0.putIfAbsent("NUMBER 52.0 0", charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNotNull(charsetDecoder3);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = jSTypeRegistry7.createObjectType(objectType8);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair10 = objectType4.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType9);
        com.google.javascript.rhino.Node node11 = objectType4.getRootNode();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, false);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = jSTypeRegistry14.createObjectType(objectType15);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry19.createObjectType(objectType20);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair22 = objectType16.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = objectType4.testForEquality((com.google.javascript.rhino.jstype.JSType) objectType16);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType.TypePair typePair25 = objectType4.getTypesUnderEquality(jSType24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(typePair10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(typePair22);
        org.junit.Assert.assertNotNull(ternaryValue23);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream1 = new java.io.PrintStream(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.getDescriptor();
        com.google.protobuf.Descriptors.EnumDescriptor enumDescriptor2 = descriptor0.findEnumTypeByName("ISO");
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor4 = descriptor0.findFieldByNumber(43);
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNull(enumDescriptor2);
        org.junit.Assert.assertNull(fieldDescriptor4);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler1.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.CheckLevel checkLevel4 = null;
        com.google.javascript.jscomp.JSError jSError5 = null;
        // The following exception was thrown during execution in test generation
        try {
            errorManager3.report(checkLevel4, jSError5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNotNull(errorManager3);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.util.Comparator<java.time.OffsetDateTime> offsetDateTimeComparator0 = java.time.OffsetDateTime.timeLineOrder();
        org.junit.Assert.assertNotNull(offsetDateTimeComparator0);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative0 = com.google.javascript.rhino.jstype.JSTypeNative.RANGE_ERROR_TYPE;
        org.junit.Assert.assertTrue("'" + jSTypeNative0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.RANGE_ERROR_TYPE + "'", jSTypeNative0.equals(com.google.javascript.rhino.jstype.JSTypeNative.RANGE_ERROR_TYPE));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate3 = isoChronology0.dateYearDay((int) (short) 10, 1024);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 1024");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        short[] shortArray1 = new short[] { (byte) 1 };
        java.nio.ShortBuffer shortBuffer2 = java.nio.ShortBuffer.wrap(shortArray1);
        short[] shortArray4 = new short[] { (byte) 1 };
        java.nio.ShortBuffer shortBuffer5 = java.nio.ShortBuffer.wrap(shortArray4);
        int int6 = shortBuffer2.compareTo(shortBuffer5);
        boolean boolean7 = shortBuffer2.hasArray();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[1]");
        org.junit.Assert.assertNotNull(shortBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.Message.Builder builder4 = builder0.newBuilderForField(fieldDescriptor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MessageOptions messageOptions2 = com.google.protobuf.DescriptorProtos.MessageOptions.parseFrom(codedInputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.String str0 = java.io.File.pathSeparator;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ":" + "'", str0, ":");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        int int5 = localDateTime4.getYear();
        java.time.LocalDate localDate6 = localDateTime4.toLocalDate();
        java.time.chrono.Chronology chronology7 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localDate6);
        java.time.format.TextStyle textStyle8 = null;
        java.util.Locale locale11 = new java.util.Locale("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=12 cap=12]", "2022-02-21");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = chronology7.getDisplayName(textStyle8, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: textStyle");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals(locale11.toString(), "java.nio.bytebufferasdoublebufferb[pos=0 lim=12 cap=12]_2022-02-21");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.google.protobuf.ByteString byteString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart namePart1 = com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.parseFrom(byteString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of((long) (-1));
        java.util.stream.LongStream longStream2 = longStream1.distinct();
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream4 = longStream2.onClose(runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        compilerInput3.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler5);
        com.google.javascript.jscomp.Scope scope8 = compiler5.getTopScope();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler5.compile(jSSourceFileArray9, jSSourceFileArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        char char0 = java.io.File.separatorChar;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '/' + "'", char0 == '/');
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        boolean boolean6 = strSet4.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream7 = strSet4.stream();
        java.util.stream.Stream<java.lang.String> strStream8 = strStream7.distinct();
        java.util.stream.Stream<java.lang.String> strStream10 = strStream8.skip((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.String> strStream11 = strStream8.distinct();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(strStream10);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.Descriptors.Descriptor descriptor4 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto5 = descriptor4.toProto();
        boolean boolean6 = descriptorProto5.isInitialized();
        com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder messageOptionsOrBuilder7 = descriptorProto5.getOptionsOrBuilder();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder8 = builder2.setMessageType(16384, descriptorProto5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 16384, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(descriptor4);
        org.junit.Assert.assertNotNull(descriptorProto5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(messageOptionsOrBuilder7);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.google.protobuf.Descriptors.FieldDescriptor.Type type0 = com.google.protobuf.Descriptors.FieldDescriptor.Type.STRING;
        com.google.protobuf.Descriptors.FieldDescriptor.JavaType javaType1 = type0.getJavaType();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type type2 = type0.toProto();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.google.protobuf.Descriptors.FieldDescriptor.Type.STRING + "'", type0.equals(com.google.protobuf.Descriptors.FieldDescriptor.Type.STRING));
        org.junit.Assert.assertTrue("'" + javaType1 + "' != '" + com.google.protobuf.Descriptors.FieldDescriptor.JavaType.STRING + "'", javaType1.equals(com.google.protobuf.Descriptors.FieldDescriptor.JavaType.STRING));
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_STRING + "'", type2.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_STRING));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode0 = com.google.javascript.jscomp.CompilerOptions.TracerMode.TIMING_ONLY;
        org.junit.Assert.assertTrue("'" + tracerMode0 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.TIMING_ONLY + "'", tracerMode0.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.TIMING_ONLY));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing0 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK;
        boolean boolean1 = tweakProcessing0.shouldStrip();
        org.junit.Assert.assertTrue("'" + tweakProcessing0 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK + "'", tweakProcessing0.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.ServiceOptions serviceOptions2 = com.google.protobuf.DescriptorProtos.ServiceOptions.parseFrom(byteArray1);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo2 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.parseFrom(inputStream0, extensionRegistryLite1);
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder3 = sourceCodeInfo2.newBuilderForType();
        boolean boolean4 = builder3.isInitialized();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo5 = builder3.build();
        java.io.InputStream inputStream6 = null;
        com.google.protobuf.MessageLite.Builder builder7 = builder3.mergeFrom(inputStream6);
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder builder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder10 = builder3.addLocation((int) '#', builder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceCodeInfo2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(sourceCodeInfo5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.String> strCollection4 = compilerInput3.getProvides();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto0 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.getDefaultInstance();
        java.lang.String str1 = methodDescriptorProto0.getOutputType();
        boolean boolean2 = methodDescriptorProto0.hasOptions();
        org.junit.Assert.assertNotNull(methodDescriptorProto0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSSourceFile jSSourceFile1 = com.google.javascript.jscomp.JSSourceFile.fromFile("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHoursMinutesSeconds(64, (int) (short) 1, 1970);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset hours not in valid range: value 64 is not in the range -18 to 18");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of((long) (-1));
        java.util.stream.LongStream longStream2 = longStream1.distinct();
        java.util.function.LongPredicate longPredicate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = longStream2.noneMatch(longPredicate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto3 = com.google.protobuf.DescriptorProtos.DescriptorProto.parseFrom(byteArray1, extensionRegistryLite2);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder3 = builder2.addEnumTypeBuilder();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto5 = builder3.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder3 = builder2.clearSourceCodeInfo();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder2.setOptions(builder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.util.function.DoubleSupplier doubleSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.generate(doubleSupplier0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.nio.channels.ClosedChannelException closedChannelException0 = new java.nio.channels.ClosedChannelException();
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto2 = builder0.buildPartial();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = fieldDescriptorProto2.newBuilderForType();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder8 = builder3.mergeFrom(byteArray7);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: Protocol message tag had invalid wire type.");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(fieldDescriptorProto2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0]");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.io.UnsupportedEncodingException unsupportedEncodingException1 = new java.io.UnsupportedEncodingException("hi!");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap.Module module1 = com.google.javascript.jscomp.FunctionInformationMap.Module.parseFrom(codedInputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 0 };
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.ServiceOptions serviceOptions8 = com.google.protobuf.DescriptorProtos.ServiceOptions.parseFrom(byteArray6, extensionRegistryLite7);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: Protocol message contained an invalid tag (zero).");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 100, 100, 10, 0]");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        java.io.InputStream inputStream2 = null;
        com.google.protobuf.MessageLite.Builder builder3 = builder0.mergeFrom(inputStream2);
        com.google.protobuf.UnknownFieldSet unknownFieldSet4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder5 = builder0.mergeUnknownFields(unknownFieldSet4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.net.URLStreamHandlerFactory uRLStreamHandlerFactory0 = null;
        java.net.URL.setURLStreamHandlerFactory(uRLStreamHandlerFactory0);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.newBuilder();
        byte[] byteArray2 = new byte[] { (byte) -1 };
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder4 = builder0.mergeFrom(byteArray2, extensionRegistryLite3);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder3 = builder2.addEnumTypeBuilder();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = builder3.hasField(fieldDescriptor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        int int0 = com.google.protobuf.DescriptorProtos.UninterpretedOption.POSITIVE_INT_VALUE_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean4 = node3.isStringKey();
        boolean boolean5 = node3.isTrue();
        com.google.javascript.rhino.InputId inputId7 = new com.google.javascript.rhino.InputId("NUMBER 52.0 0");
        node3.setInputId(inputId7);
        com.google.javascript.jscomp.SourceAst sourceAst9 = null;
        com.google.javascript.rhino.InputId inputId10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = new com.google.javascript.jscomp.CompilerInput(sourceAst9, inputId10, true);
        java.io.PrintStream printStream13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream13);
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler14.getErrorManager();
        compilerInput12.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler14);
        com.google.javascript.jscomp.CodingConvention codingConvention17 = compiler14.getCodingConvention();
        boolean boolean18 = inputId7.equals((java.lang.Object) compiler14);
        com.google.javascript.jscomp.JSError[] jSErrorArray19 = compiler14.getErrors();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(codingConvention17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSErrorArray19);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        boolean boolean1 = localDate0.isLeapYear();
        java.lang.String str2 = localDate0.toString();
        java.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = localDate0.format(dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatter");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21" + "'", str2, "2022-02-21");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart namePart7 = com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.parseFrom(byteArray6);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: Protocol message end-group tag did not match expected tag.");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 100, 10, 10, 1]");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.UnknownFieldSet unknownFieldSet2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = builder0.mergeUnknownFields(unknownFieldSet2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.net.UnknownHostException unknownHostException0 = new java.net.UnknownHostException();
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.google.protobuf.ByteString byteString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumValueOptions enumValueOptions1 = com.google.protobuf.DescriptorProtos.EnumValueOptions.parseFrom(byteString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        java.util.stream.LongStream longStream4 = java.util.stream.LongStream.of((long) (-1));
        com.google.common.collect.ImmutableMap<com.google.javascript.jscomp.Compiler, java.util.stream.LongStream> compilerMap5 = com.google.common.collect.ImmutableMap.of(compiler1, longStream4);
        com.google.common.collect.Ordering<com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode> optimizeModeOrdering6 = com.google.common.collect.Ordering.natural();
        com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode optimizeMode7 = com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.CODE_SIZE;
        com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode optimizeMode8 = com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.CODE_SIZE;
        com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode optimizeMode9 = optimizeModeOrdering6.min(optimizeMode7, optimizeMode8);
        com.google.protobuf.Descriptors.EnumDescriptor enumDescriptor10 = optimizeMode9.getDescriptorForType();
        boolean boolean11 = compilerMap5.equals((java.lang.Object) enumDescriptor10);
        com.google.protobuf.Descriptors.EnumValueDescriptor enumValueDescriptor13 = enumDescriptor10.findValueByNumber((int) '/');
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(compilerMap5);
        org.junit.Assert.assertNotNull(optimizeModeOrdering6);
        org.junit.Assert.assertTrue("'" + optimizeMode7 + "' != '" + com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.CODE_SIZE + "'", optimizeMode7.equals(com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.CODE_SIZE));
        org.junit.Assert.assertTrue("'" + optimizeMode8 + "' != '" + com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.CODE_SIZE + "'", optimizeMode8.equals(com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.CODE_SIZE));
        org.junit.Assert.assertTrue("'" + optimizeMode9 + "' != '" + com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.CODE_SIZE + "'", optimizeMode9.equals(com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.CODE_SIZE));
        org.junit.Assert.assertNotNull(enumDescriptor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(enumValueDescriptor13);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        boolean boolean6 = strSet4.isEmpty();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(100);
        boolean boolean9 = strSet4.equals((java.lang.Object) byteBuffer8);
        java.nio.IntBuffer intBuffer10 = byteBuffer8.asIntBuffer();
        int[] intArray15 = new int[] { 16, ':', 43, (short) 100 };
        java.util.stream.IntStream intStream16 = java.util.stream.IntStream.of(intArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.IntBuffer intBuffer19 = intBuffer10.put(intArray15, 12, 999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intBuffer10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[16, 58, 43, 100]");
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto0 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.getDefaultInstance();
        org.junit.Assert.assertNotNull(enumValueDescriptorProto0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean5 = node4.isStringKey();
        boolean boolean6 = node4.isThrow();
        boolean boolean7 = node4.isVarArgs();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean12 = node11.isFromExterns();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean17 = node16.isFromExterns();
        java.lang.String str18 = node16.toString();
        com.google.javascript.rhino.Node node19 = node11.copyInformationFrom(node16);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean24 = node23.isStringKey();
        boolean boolean25 = node23.isThrow();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean30 = node29.isStringKey();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((-1), node4, node16, node23, node29, 16384, 16);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean39 = node38.isStringKey();
        boolean boolean40 = node38.isThrow();
        boolean boolean41 = node38.isVarArgs();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean46 = node45.isFromExterns();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean51 = node50.isFromExterns();
        java.lang.String str52 = node50.toString();
        com.google.javascript.rhino.Node node53 = node45.copyInformationFrom(node50);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean58 = node57.isStringKey();
        boolean boolean59 = node57.isThrow();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean64 = node63.isStringKey();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node((-1), node38, node50, node57, node63, 16384, 16);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile68 = node57.getStaticSourceFile();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean73 = node72.isTry();
        // The following exception was thrown during execution in test generation
        try {
            node33.addChildBefore(node57, node72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NUMBER 52.0 0" + "'", str18, "NUMBER 52.0 0");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NUMBER 52.0 0" + "'", str52, "NUMBER 52.0 0");
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(staticSourceFile68);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        int int5 = localDateTime4.getYear();
        java.time.LocalDate localDate6 = localDateTime4.toLocalDate();
        java.time.LocalDate localDate8 = localDate6.plusDays((long) '#');
        java.time.LocalDate localDate9 = java.time.LocalDate.now();
        java.time.chrono.ChronoPeriod chronoPeriod10 = localDate6.until((java.time.chrono.ChronoLocalDate) localDate9);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime13 = localDate6.atTime(1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronoPeriod10);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.addExtension(builder3);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor6 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean11 = node10.isStringKey();
        boolean boolean12 = node10.isThrow();
        boolean boolean13 = node10.isVarArgs();
        boolean boolean14 = node10.isStringKey();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder15 = builder0.addRepeatedField(fieldDescriptor6, (java.lang.Object) node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + label4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MethodOptions methodOptions1 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(codedInputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset4);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset4);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.minusDays((long) (short) 100);
        java.lang.String str9 = offsetDateTime6.toString();
        java.time.LocalTime localTime10 = offsetDateTime6.toLocalTime();
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset14);
        int int16 = localDateTime15.getYear();
        java.time.Instant instant17 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset21 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset21);
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.ofInstant(instant17, (java.time.ZoneId) zoneOffset21);
        java.time.Instant instant24 = localDateTime15.toInstant(zoneOffset21);
        java.time.ZoneOffset zoneOffset29 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime30 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset29);
        java.time.ZoneOffset zoneOffset34 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset34);
        java.time.ZonedDateTime zonedDateTime36 = java.time.ZonedDateTime.of(localDateTime30, (java.time.ZoneId) zoneOffset34);
        java.time.temporal.ChronoField chronoField38 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit39 = chronoField38.getBaseUnit();
        java.time.LocalDateTime localDateTime40 = localDateTime30.plus((long) 1970, temporalUnit39);
        java.time.ZoneOffset zoneOffset45 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime46 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset45);
        java.time.ZoneOffset zoneOffset50 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime51 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset50);
        java.time.ZonedDateTime zonedDateTime52 = java.time.ZonedDateTime.of(localDateTime46, (java.time.ZoneId) zoneOffset50);
        java.time.temporal.ChronoField chronoField54 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit55 = chronoField54.getBaseUnit();
        java.time.LocalDateTime localDateTime56 = localDateTime46.plus((long) 1970, temporalUnit55);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime57 = localDateTime40.minus((long) 43, temporalUnit55);
        java.time.Instant instant58 = instant24.plus((long) 16384, temporalUnit55);
        java.time.ZoneOffset zoneOffset62 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime63 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset62);
        java.time.ZoneOffset zoneOffset67 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime68 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset67);
        java.time.ZonedDateTime zonedDateTime69 = java.time.ZonedDateTime.of(localDateTime63, (java.time.ZoneId) zoneOffset67);
        java.time.ZonedDateTime zonedDateTime71 = zonedDateTime69.withHour(16);
        java.time.ZoneOffset zoneOffset75 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime76 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset75);
        java.time.ZoneOffset zoneOffset80 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime81 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset80);
        java.time.ZonedDateTime zonedDateTime82 = java.time.ZonedDateTime.of(localDateTime76, (java.time.ZoneId) zoneOffset80);
        java.time.ZonedDateTime zonedDateTime84 = zonedDateTime82.withYear((int) (short) 1);
        java.time.temporal.ChronoField chronoField85 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit86 = chronoField85.getBaseUnit();
        java.time.ZonedDateTime zonedDateTime87 = zonedDateTime82.truncatedTo(temporalUnit86);
        long long88 = instant24.until((java.time.temporal.Temporal) zonedDateTime71, temporalUnit86);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime89 = localTime10.with((java.time.temporal.TemporalAdjuster) instant24);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: InstantSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T00:00:52+00:00:52" + "'", str9, "1970-01-01T00:00:52+00:00:52");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(zoneOffset21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(offsetDateTime23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(zoneOffset29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(zoneOffset34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(zonedDateTime36);
        org.junit.Assert.assertTrue("'" + chronoField38 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField38.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit39 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit39.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(zoneOffset45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(zoneOffset50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(zonedDateTime52);
        org.junit.Assert.assertTrue("'" + chronoField54 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField54.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit55 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit55.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime57);
        org.junit.Assert.assertNotNull(instant58);
        org.junit.Assert.assertNotNull(zoneOffset62);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(zoneOffset67);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(zonedDateTime69);
        org.junit.Assert.assertNotNull(zonedDateTime71);
        org.junit.Assert.assertNotNull(zoneOffset75);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(zoneOffset80);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(zonedDateTime82);
        org.junit.Assert.assertNotNull(zonedDateTime84);
        org.junit.Assert.assertTrue("'" + chronoField85 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField85.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit86 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit86.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(zonedDateTime87);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 16L + "'", long88 == 16L);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean5 = node4.isStringKey();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean10 = node9.isVar();
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] { node4, node9 };
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(10, nodeArray11);
        boolean boolean13 = node12.isInc();
        node12.putProp(9, (java.lang.Object) "Named type with empty name component");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        int int0 = java.util.Spliterator.NONNULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.CodingErrorAction codingErrorAction2 = charsetDecoder1.malformedInputAction();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = charsetDecoder1.isCharsetDetected();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(codingErrorAction2);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = descriptor0.toProto();
        boolean boolean2 = descriptorProto1.isInitialized();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions3 = descriptorProto1.getOptions();
        java.util.List<com.google.protobuf.DescriptorProtos.UninterpretedOption> uninterpretedOptionList4 = messageOptions3.getUninterpretedOptionList();
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(descriptorProto1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(messageOptions3);
        org.junit.Assert.assertNotNull(uninterpretedOptionList4);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        compilerInput3.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = compilerInput3.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder3 = builder2.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto enumDescriptorProto4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder5 = builder3.mergeFrom(enumDescriptorProto4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V1;
        org.junit.Assert.assertNotNull(format0);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) -1, (byte) 0 };
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange extensionRange5 = com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.parseFrom(byteArray3, extensionRegistryLite4);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: Protocol message contained an invalid tag (zero).");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, -1, 0]");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto0 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.getDefaultInstance();
        boolean boolean1 = serviceDescriptorProto0.hasOptions();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder2 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.newBuilder(serviceDescriptorProto0);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = builder2.hasField(fieldDescriptor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceDescriptorProto0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.time.ZoneOffset zoneOffset0 = java.time.ZoneOffset.MIN;
        org.junit.Assert.assertNotNull(zoneOffset0);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.util.logging.Level level0 = java.util.logging.Level.FINER;
        org.junit.Assert.assertNotNull(level0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period1 = java.time.Period.parse((java.lang.CharSequence) "Named type with empty name component");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Period");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.javascript.jscomp.FunctionInformationMap.Entry.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        java.io.InputStream inputStream2 = null;
        com.google.protobuf.MessageLite.Builder builder3 = builder0.mergeFrom(inputStream2);
        java.io.InputStream inputStream4 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = builder0.mergeDelimitedFrom(inputStream4, extensionRegistryLite5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        java.util.stream.LongStream longStream4 = java.util.stream.LongStream.of((long) (-1));
        com.google.common.collect.ImmutableMap<com.google.javascript.jscomp.Compiler, java.util.stream.LongStream> compilerMap5 = com.google.common.collect.ImmutableMap.of(compiler1, longStream4);
        java.util.stream.DoubleStream doubleStream6 = longStream4.asDoubleStream();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream8 = doubleStream6.onClose(runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(compilerMap5);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = new java.net.URL(uRL0, "goog.global");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: goog.global");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.google.protobuf.ByteString byteString0 = com.google.protobuf.ByteString.EMPTY;
        byte[] byteArray1 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            byteString0.copyTo(byteArray1, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteString0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit13 = chronoField12.getBaseUnit();
        java.time.LocalDateTime localDateTime14 = localDateTime4.plus((long) 1970, temporalUnit13);
        java.time.LocalDateTime localDateTime16 = localDateTime4.withHour((int) (short) 1);
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.OffsetDateTime offsetDateTime19 = java.time.OffsetDateTime.of(localDateTime4, zoneOffset18);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.EPOCH_DAY;
        java.time.Instant instant21 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset25);
        java.time.OffsetDateTime offsetDateTime27 = java.time.OffsetDateTime.ofInstant(instant21, (java.time.ZoneId) zoneOffset25);
        java.time.temporal.ValueRange valueRange28 = chronoField20.rangeRefinedBy((java.time.temporal.TemporalAccessor) offsetDateTime27);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = offsetDateTime19.get((java.time.temporal.TemporalField) chronoField20);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Invalid field 'EpochDay' for get() method, use getLong() instead");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField12.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit13 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit13.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(offsetDateTime19);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.EPOCH_DAY + "'", chronoField20.equals(java.time.temporal.ChronoField.EPOCH_DAY));
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(offsetDateTime27);
        org.junit.Assert.assertNotNull(valueRange28);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        java.nio.CharBuffer charBuffer2 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer4 = charBuffer2.put('a');
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor6 = dateTimeFormatter0.parseUnresolved((java.lang.CharSequence) charBuffer4, parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: position");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(charBuffer2);
        org.junit.Assert.assertNotNull(charBuffer4);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.newBuilder();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder2 = builder0.clearField(fieldDescriptor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime10.minusSeconds((long) '#');
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField13.getBaseUnit();
        boolean boolean15 = zonedDateTime12.isSupported(temporalUnit14);
        java.time.LocalDate localDate16 = java.time.LocalDate.now();
        java.lang.String str17 = localDate16.toString();
        boolean boolean18 = temporalUnit14.isSupportedBy((java.time.temporal.Temporal) localDate16);
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset22);
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset27);
        java.time.ZonedDateTime zonedDateTime29 = java.time.ZonedDateTime.of(localDateTime23, (java.time.ZoneId) zoneOffset27);
        java.time.ZonedDateTime zonedDateTime31 = zonedDateTime29.withYear((int) (short) 1);
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit33 = chronoField32.getBaseUnit();
        java.time.ZonedDateTime zonedDateTime34 = zonedDateTime29.truncatedTo(temporalUnit33);
        java.time.Duration duration35 = temporalUnit33.getDuration();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate36 = localDate16.minus((java.time.temporal.TemporalAmount) duration35);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Seconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField13.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2022-02-21" + "'", str17, "2022-02-21");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertNotNull(zonedDateTime31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField32.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit33 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit33.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(zonedDateTime34);
        org.junit.Assert.assertNotNull(duration35);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.time.Month month0 = java.time.Month.JUNE;
        java.time.format.TextStyle textStyle1 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = month0.getDisplayName(textStyle1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: textStyle");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.JUNE + "'", month0.equals(java.time.Month.JUNE));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler1.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler1.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setState(intermediateState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNotNull(errorManager3);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.time.ZoneId zoneId0 = java.time.ZoneId.systemDefault();
        org.junit.Assert.assertNotNull(zoneId0);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        boolean boolean1 = localDate0.isLeapYear();
        java.time.chrono.Era era2 = localDate0.getEra();
        java.time.format.TextStyle textStyle3 = null;
        java.util.Locale locale6 = new java.util.Locale("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=12 cap=12]", "2022-02-21");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = era2.getDisplayName(textStyle3, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: textStyle");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + era2 + "' != '" + java.time.chrono.IsoEra.CE + "'", era2.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertEquals(locale6.toString(), "java.nio.bytebufferasdoublebufferb[pos=0 lim=12 cap=12]_2022-02-21");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        int int0 = com.google.protobuf.DescriptorProtos.FileOptions.PY_GENERIC_SERVICES_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 18 + "'", int0 == 18);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumValueOptions enumValueOptions2 = com.google.protobuf.DescriptorProtos.EnumValueOptions.parseDelimitedFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.net.URISyntaxException uRISyntaxException3 = new java.net.URISyntaxException("", "Named type with empty name component", 4096);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.google.javascript.jscomp.CustomPassExecutionTime customPassExecutionTime0 = com.google.javascript.jscomp.CustomPassExecutionTime.BEFORE_OPTIMIZATIONS;
        org.junit.Assert.assertTrue("'" + customPassExecutionTime0 + "' != '" + com.google.javascript.jscomp.CustomPassExecutionTime.BEFORE_OPTIMIZATIONS + "'", customPassExecutionTime0.equals(com.google.javascript.jscomp.CustomPassExecutionTime.BEFORE_OPTIMIZATIONS));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.parse((java.lang.CharSequence) "Named type with empty name component");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Named type with empty name component' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto2 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.parseDelimitedFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset4);
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset9);
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.of(localDateTime5, (java.time.ZoneId) zoneOffset9);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField13.getBaseUnit();
        java.time.LocalDateTime localDateTime15 = localDateTime5.plus((long) 1970, temporalUnit14);
        java.time.LocalDateTime localDateTime17 = localDateTime5.withHour((int) (short) 1);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.OffsetDateTime offsetDateTime20 = java.time.OffsetDateTime.of(localDateTime5, zoneOffset19);
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset19);
        java.time.format.DateTimeFormatter dateTimeFormatter22 = java.time.format.DateTimeFormatter.ISO_DATE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = offsetTime21.format(dateTimeFormatter22);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField13.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        java.util.stream.LongStream longStream4 = java.util.stream.LongStream.of((long) (-1));
        com.google.common.collect.ImmutableMap<com.google.javascript.jscomp.Compiler, java.util.stream.LongStream> compilerMap5 = com.google.common.collect.ImmutableMap.of(compiler1, longStream4);
        java.util.stream.DoubleStream doubleStream6 = longStream4.asDoubleStream();
        double[] doubleArray7 = doubleStream6.toArray();
        java.util.function.DoublePredicate doublePredicate8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = doubleStream6.filter(doublePredicate8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(compilerMap5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0]");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime10.withYear((int) (short) 1);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.MICRO_OF_DAY;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = zonedDateTime12.get((java.time.temporal.TemporalField) chronoField13);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Invalid field 'MicroOfDay' for get() method, use getLong() instead");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_DAY + "'", chronoField13.equals(java.time.temporal.ChronoField.MICRO_OF_DAY));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor3 = dateTimeFormatter0.parse((java.lang.CharSequence) "OffsetSeconds", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: position");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit13 = chronoField12.getBaseUnit();
        java.time.LocalDateTime localDateTime14 = localDateTime4.plus((long) 1970, temporalUnit13);
        java.time.LocalDateTime localDateTime16 = localDateTime4.withHour((int) (short) 1);
        java.time.LocalDateTime localDateTime18 = localDateTime16.minusDays((long) 999);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField12.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit13 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit13.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.net.Proxy.Type type0 = java.net.Proxy.Type.SOCKS;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + java.net.Proxy.Type.SOCKS + "'", type0.equals(java.net.Proxy.Type.SOCKS));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.addExtension(builder3);
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto7 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.getDefaultInstance();
        boolean boolean8 = serviceDescriptorProto7.hasOptions();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder9 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.newBuilder(serviceDescriptorProto7);
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder10 = builder0.addService(4096, builder9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4096, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + label4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(serviceDescriptorProto7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.util.Map<java.time.temporal.TemporalField, java.lang.Long> temporalFieldMap1 = null;
        java.time.format.ResolverStyle resolverStyle2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate3 = isoChronology0.resolveDate(temporalFieldMap1, resolverStyle2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.google.protobuf.DescriptorProtos.FileOptions fileOptions0 = com.google.protobuf.DescriptorProtos.FileOptions.getDefaultInstance();
        com.google.protobuf.MessageLite messageLite1 = fileOptions0.getDefaultInstanceForType();
        org.junit.Assert.assertNotNull(fileOptions0);
        org.junit.Assert.assertNotNull(messageLite1);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.allocate(6);
        java.nio.FloatBuffer floatBuffer2 = floatBuffer1.asReadOnlyBuffer();
        boolean boolean3 = floatBuffer2.isDirect();
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        int int5 = localDateTime4.getYear();
        java.time.LocalDate localDate6 = localDateTime4.toLocalDate();
        java.time.LocalDate localDate8 = localDate6.plusDays((long) '#');
        java.time.LocalDate localDate9 = java.time.LocalDate.now();
        java.time.chrono.ChronoPeriod chronoPeriod10 = localDate6.until((java.time.chrono.ChronoLocalDate) localDate9);
        java.lang.String str11 = localDate6.toString();
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronoPeriod10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01" + "'", str11, "1970-01-01");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative0 = com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_NUMBER_STRING;
        org.junit.Assert.assertTrue("'" + jSTypeNative0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_NUMBER_STRING + "'", jSTypeNative0.equals(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_NUMBER_STRING));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto2 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.parseFrom(codedInputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        boolean boolean6 = strSet4.isEmpty();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(100);
        boolean boolean9 = strSet4.equals((java.lang.Object) byteBuffer8);
        java.nio.IntBuffer intBuffer10 = byteBuffer8.asIntBuffer();
        java.nio.IntBuffer intBuffer12 = intBuffer10.put(16);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = intBuffer12.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intBuffer10);
        org.junit.Assert.assertNotNull(intBuffer12);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        int int5 = localDateTime4.getYear();
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset9);
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset14);
        java.time.ZonedDateTime zonedDateTime16 = java.time.ZonedDateTime.of(localDateTime10, (java.time.ZoneId) zoneOffset14);
        boolean boolean17 = localDateTime4.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime10);
        java.time.LocalDateTime localDateTime19 = localDateTime10.minusHours((long) ' ');
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        boolean boolean3 = builder0.hasPackage();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto fileDescriptorProto4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.mergeFrom(fileDescriptorProto4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        int int5 = localDateTime4.getYear();
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset9);
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset14);
        java.time.ZonedDateTime zonedDateTime16 = java.time.ZonedDateTime.of(localDateTime10, (java.time.ZoneId) zoneOffset14);
        boolean boolean17 = localDateTime4.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime10);
        java.time.ZoneOffset zoneOffset21 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset21);
        int int23 = localDateTime22.getYear();
        java.time.LocalDate localDate24 = localDateTime22.toLocalDate();
        int int25 = localDateTime4.compareTo((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime22);
        java.time.ZoneOffset zoneOffset29 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime30 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset29);
        int int31 = localDateTime30.getYear();
        java.time.LocalDate localDate32 = localDateTime30.toLocalDate();
        boolean boolean33 = localDateTime4.isBefore((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime30);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(zoneOffset21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(zoneOffset29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1970 + "'", int31 == 1970);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        int int1 = com.google.protobuf.CodedOutputStream.computeSInt64SizeNoTag((-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.time.Period period0 = java.time.Period.ZERO;
        java.time.chrono.ChronoPeriod chronoPeriod1 = period0.normalized();
        int int2 = period0.getYears();
        java.time.Period period3 = period0.negated();
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit5 = chronoField4.getBaseUnit();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = period3.get(temporalUnit5);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Hours");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(chronoPeriod1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField4.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit5 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit5.equals(java.time.temporal.ChronoUnit.HOURS));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        boolean boolean1 = localDate0.isLeapYear();
        java.time.chrono.Era era2 = localDate0.getEra();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime3 = java.time.chrono.ChronoLocalDateTime.from((java.time.temporal.TemporalAccessor) localDate0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDateTime from TemporalAccessor: 2022-02-21 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + era2 + "' != '" + java.time.chrono.IsoEra.CE + "'", era2.equals(java.time.chrono.IsoEra.CE));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime10.plusDays((long) '4');
        java.time.ZonedDateTime zonedDateTime13 = zonedDateTime10.withFixedOffsetZone();
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime18 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset17);
        int int19 = localDateTime18.getYear();
        java.time.Instant instant20 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime25 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset24);
        java.time.OffsetDateTime offsetDateTime26 = java.time.OffsetDateTime.ofInstant(instant20, (java.time.ZoneId) zoneOffset24);
        java.time.Instant instant27 = localDateTime18.toInstant(zoneOffset24);
        java.time.ZoneOffset zoneOffset32 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime33 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset32);
        java.time.ZoneOffset zoneOffset37 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime38 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset37);
        java.time.ZonedDateTime zonedDateTime39 = java.time.ZonedDateTime.of(localDateTime33, (java.time.ZoneId) zoneOffset37);
        java.time.temporal.ChronoField chronoField41 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit42 = chronoField41.getBaseUnit();
        java.time.LocalDateTime localDateTime43 = localDateTime33.plus((long) 1970, temporalUnit42);
        java.time.ZoneOffset zoneOffset48 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime49 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset48);
        java.time.ZoneOffset zoneOffset53 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime54 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset53);
        java.time.ZonedDateTime zonedDateTime55 = java.time.ZonedDateTime.of(localDateTime49, (java.time.ZoneId) zoneOffset53);
        java.time.temporal.ChronoField chronoField57 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit58 = chronoField57.getBaseUnit();
        java.time.LocalDateTime localDateTime59 = localDateTime49.plus((long) 1970, temporalUnit58);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime60 = localDateTime43.minus((long) 43, temporalUnit58);
        java.time.Instant instant61 = instant27.plus((long) 16384, temporalUnit58);
        java.time.ZoneOffset zoneOffset65 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime66 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset65);
        java.time.ZoneOffset zoneOffset70 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime71 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset70);
        java.time.ZonedDateTime zonedDateTime72 = java.time.ZonedDateTime.of(localDateTime66, (java.time.ZoneId) zoneOffset70);
        java.time.ZonedDateTime zonedDateTime74 = zonedDateTime72.withHour(16);
        java.time.ZoneOffset zoneOffset78 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime79 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset78);
        java.time.ZoneOffset zoneOffset83 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime84 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset83);
        java.time.ZonedDateTime zonedDateTime85 = java.time.ZonedDateTime.of(localDateTime79, (java.time.ZoneId) zoneOffset83);
        java.time.ZonedDateTime zonedDateTime87 = zonedDateTime85.withYear((int) (short) 1);
        java.time.temporal.ChronoField chronoField88 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit89 = chronoField88.getBaseUnit();
        java.time.ZonedDateTime zonedDateTime90 = zonedDateTime85.truncatedTo(temporalUnit89);
        long long91 = instant27.until((java.time.temporal.Temporal) zonedDateTime74, temporalUnit89);
        boolean boolean92 = zonedDateTime13.isSupported(temporalUnit89);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(offsetDateTime26);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(zoneOffset32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(zoneOffset37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(zonedDateTime39);
        org.junit.Assert.assertTrue("'" + chronoField41 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField41.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit42 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit42.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(zoneOffset48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(zoneOffset53);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(zonedDateTime55);
        org.junit.Assert.assertTrue("'" + chronoField57 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField57.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit58 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit58.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime60);
        org.junit.Assert.assertNotNull(instant61);
        org.junit.Assert.assertNotNull(zoneOffset65);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(zoneOffset70);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(zonedDateTime72);
        org.junit.Assert.assertNotNull(zonedDateTime74);
        org.junit.Assert.assertNotNull(zoneOffset78);
        org.junit.Assert.assertNotNull(localDateTime79);
        org.junit.Assert.assertNotNull(zoneOffset83);
        org.junit.Assert.assertNotNull(localDateTime84);
        org.junit.Assert.assertNotNull(zonedDateTime85);
        org.junit.Assert.assertNotNull(zonedDateTime87);
        org.junit.Assert.assertTrue("'" + chronoField88 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField88.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit89 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit89.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(zonedDateTime90);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 16L + "'", long91 == 16L);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap functionInformationMap4 = com.google.javascript.jscomp.FunctionInformationMap.parseFrom(byteArray2, extensionRegistryLite3);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: Protocol message contained an invalid tag (zero).");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo2 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.parseFrom(inputStream0, extensionRegistryLite1);
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder3 = sourceCodeInfo2.newBuilderForType();
        boolean boolean4 = builder3.isInitialized();
        com.google.protobuf.CodedInputStream codedInputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder6 = builder3.mergeFrom(codedInputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceCodeInfo2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.addExtension(builder3);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.Message.Builder builder7 = builder0.clearField(fieldDescriptor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + label4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo2 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.parseFrom(inputStream0, extensionRegistryLite1);
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder3 = sourceCodeInfo2.newBuilderForType();
        boolean boolean4 = builder3.isInitialized();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo5 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder locationOrBuilder7 = sourceCodeInfo5.getLocationOrBuilder(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceCodeInfo2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(sourceCodeInfo5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        float[] floatArray5 = new float[] { 3, (byte) 0, '#', 4, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.FloatBuffer floatBuffer8 = java.nio.FloatBuffer.wrap(floatArray5, (int) (short) 0, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[3.0, 0.0, 35.0, 4.0, 0.0]");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        int int0 = com.google.protobuf.DescriptorProtos.UninterpretedOption.STRING_VALUE_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder enumDescriptorProtoOrBuilder4 = builder2.getEnumTypeOrBuilder(1970);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1970");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto1 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.parseFrom(codedInputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        int int2 = com.google.protobuf.CodedOutputStream.computeUInt32Size(18, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = descriptor0.toProto();
        boolean boolean2 = descriptorProto1.isInitialized();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions3 = descriptorProto1.getOptions();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = messageOptions3.getField(fieldDescriptor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(descriptorProto1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(messageOptions3);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.time.LocalTime localTime0 = java.time.LocalTime.MIN;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        java.time.temporal.TemporalUnit temporalUnit2 = chronoField1.getRangeUnit();
        long long4 = chronoField1.checkValidValue((long) 2);
        java.util.Locale locale8 = new java.util.Locale("", "NUMBER 52.0 0", "hi!");
        java.lang.String str9 = chronoField1.getDisplayName(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime11 = localTime0.with((java.time.temporal.TemporalField) chronoField1, 0L);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField1.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
        org.junit.Assert.assertTrue("'" + temporalUnit2 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit2.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertEquals(locale8.toString(), "_NUMBER 52.0 0_hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OffsetSeconds" + "'", str9, "OffsetSeconds");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        compilerInput3.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region9 = compilerInput3.getRegion(16384);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset4);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset4);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.minusDays((long) (short) 100);
        java.lang.String str9 = offsetDateTime6.toString();
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        int int11 = offsetDateTime6.get((java.time.temporal.TemporalField) chronoField10);
        java.time.OffsetDateTime offsetDateTime13 = offsetDateTime6.withDayOfMonth((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime15 = offsetDateTime13.withMinute(1024);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): 1024");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T00:00:52+00:00:52" + "'", str9, "1970-01-01T00:00:52+00:00:52");
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField10.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder1 = builder0.clearCcGenericServices();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor2 = null;
        java.time.Clock clock4 = java.time.Clock.systemDefaultZone();
        java.time.ZonedDateTime zonedDateTime5 = java.time.ZonedDateTime.now(clock4);
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileOptions.Builder builder6 = builder0.setRepeatedField(fieldDescriptor2, (int) ' ', (java.lang.Object) clock4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(clock4);
        org.junit.Assert.assertNotNull(zonedDateTime5);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite> priorityMap0 = new java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>();
        java.lang.Object obj1 = priorityMap0.clone();
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder2 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.newBuilder();
        boolean boolean3 = priorityMap0.containsValue((java.lang.Object) builder2);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder5 = builder2.clearField(fieldDescriptor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{}");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto1 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.getDefaultInstance();
        int int2 = com.google.protobuf.CodedOutputStream.computeMessageSetExtensionSize((int) (byte) -1, (com.google.protobuf.MessageLite) methodDescriptorProto1);
        com.google.protobuf.CodedOutputStream codedOutputStream3 = null;
        methodDescriptorProto1.writeTo(codedOutputStream3);
        boolean boolean5 = methodDescriptorProto1.hasInputType();
        boolean boolean6 = methodDescriptorProto1.hasName();
        org.junit.Assert.assertNotNull(methodDescriptorProto1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart namePart0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder builder1 = com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.newBuilder(namePart0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.addExtension(builder3);
        com.google.protobuf.CodedInputStream codedInputStream6 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder8 = builder0.mergeFrom(codedInputStream6, extensionRegistryLite7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + label4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime10.withYear((int) (short) 1);
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset16);
        int int18 = localDateTime17.getYear();
        java.time.LocalDate localDate19 = localDateTime17.toLocalDate();
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset23);
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime29 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset28);
        java.time.ZonedDateTime zonedDateTime30 = java.time.ZonedDateTime.of(localDateTime24, (java.time.ZoneId) zoneOffset28);
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit33 = chronoField32.getBaseUnit();
        java.time.LocalDateTime localDateTime34 = localDateTime24.plus((long) 1970, temporalUnit33);
        java.time.LocalTime localTime35 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime34);
        java.time.ZoneOffset zoneOffset39 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime40 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset39);
        java.time.OffsetDateTime offsetDateTime41 = java.time.OffsetDateTime.of(localDate19, localTime35, zoneOffset39);
        java.time.ZonedDateTime zonedDateTime42 = zonedDateTime10.withZoneSameInstant((java.time.ZoneId) zoneOffset39);
        int int43 = zoneOffset39.getTotalSeconds();
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField32.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit33 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit33.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(zoneOffset39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(offsetDateTime41);
        org.junit.Assert.assertNotNull(zonedDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder1 = builder0.clearCcGenericServices();
        java.io.InputStream inputStream2 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = builder0.mergeDelimitedFrom(inputStream2, extensionRegistryLite3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        byte[] byteArray1 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions3 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray1, extensionRegistryLite2);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite4 = null;
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto enumDescriptorProto5 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.parseFrom(byteArray1, extensionRegistryLite4);
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileOptions.Builder builder8 = builder0.mergeFrom(byteArray1, 4096, 171);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4096");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(methodOptions3);
        org.junit.Assert.assertNotNull(enumDescriptorProto5);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.google.javascript.jscomp.FunctionInformationMap.Module.Builder builder0 = com.google.javascript.jscomp.FunctionInformationMap.Module.newBuilder();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor1 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean7 = node6.isFromExterns();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(1);
        com.google.javascript.rhino.Node node10 = node6.clonePropsFrom(node9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap.Module.Builder builder11 = builder0.setRepeatedField(fieldDescriptor1, 1024, (java.lang.Object) node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Month month1 = java.time.Month.of(43);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear: 43");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit13 = chronoField12.getBaseUnit();
        java.time.LocalDateTime localDateTime14 = localDateTime4.plus((long) 1970, temporalUnit13);
        java.time.LocalTime localTime15 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime14);
        java.time.ZoneOffset zoneOffset16 = null;
        java.time.ZoneOffset zoneOffset20 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime21 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset20);
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset25);
        java.time.ZonedDateTime zonedDateTime27 = java.time.ZonedDateTime.of(localDateTime21, (java.time.ZoneId) zoneOffset25);
        java.time.chrono.Chronology chronology28 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) zoneOffset25);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime29 = java.time.ZonedDateTime.ofInstant(localDateTime14, zoneOffset16, (java.time.ZoneId) zoneOffset25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField12.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit13 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit13.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(zoneOffset20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertNotNull(chronology28);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.time.Instant instant1 = java.time.Instant.ofEpochSecond((long) (-1));
        java.time.Instant instant3 = instant1.plusMillis((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate4 = java.time.chrono.ChronoLocalDate.from((java.time.temporal.TemporalAccessor) instant3);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ChronoLocalDate from TemporalAccessor: class java.time.Instant");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.EPOCH_DAY;
        java.time.Instant instant1 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset5);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.ofInstant(instant1, (java.time.ZoneId) zoneOffset5);
        java.time.temporal.ValueRange valueRange8 = chronoField0.rangeRefinedBy((java.time.temporal.TemporalAccessor) offsetDateTime7);
        long long9 = valueRange8.getSmallestMaximum();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.EPOCH_DAY + "'", chronoField0.equals(java.time.temporal.ChronoField.EPOCH_DAY));
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(valueRange8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 365249999634L + "'", long9 == 365249999634L);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo2 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.parseFrom(inputStream0, extensionRegistryLite1);
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder3 = sourceCodeInfo2.newBuilderForType();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder builder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder6 = builder3.setLocation(39, builder5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceCodeInfo2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset4);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset4);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.minusDays((long) (short) 100);
        java.lang.String str9 = offsetDateTime6.toString();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime6.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime12 = offsetDateTime6.withMonth(4096);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 4096");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T00:00:52+00:00:52" + "'", str9, "1970-01-01T00:00:52+00:00:52");
        org.junit.Assert.assertNotNull(zoneOffset10);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = jSTypeRegistry7.createObjectType(objectType8);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair10 = objectType4.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType9);
        com.google.javascript.rhino.Node node11 = objectType4.getRootNode();
        com.google.javascript.rhino.jstype.EnumType enumType12 = objectType4.toMaybeEnumType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = enumType12.hasDisplayName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(typePair10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(enumType12);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.net.Proxy.Type type0 = java.net.Proxy.Type.DIRECT;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + java.net.Proxy.Type.DIRECT + "'", type0.equals(java.net.Proxy.Type.DIRECT));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileDescriptorProto fileDescriptorProto1 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(codedInputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.nio.charset.CodingErrorAction codingErrorAction0 = java.nio.charset.CodingErrorAction.REPLACE;
        org.junit.Assert.assertNotNull(codingErrorAction0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.net.NetworkInterface networkInterface1 = java.net.NetworkInterface.getByName(":");
        org.junit.Assert.assertNull(networkInterface1);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        int[] intArray4 = new int[] { 16, ':', 43, (short) 100 };
        java.util.stream.IntStream intStream5 = java.util.stream.IntStream.of(intArray4);
        int[] intArray6 = intStream5.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream7 = intStream5.distinct();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[16, 58, 43, 100]");
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[16, 58, 43, 100]");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions1 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream0);
        java.util.List<com.google.protobuf.DescriptorProtos.UninterpretedOption> uninterpretedOptionList2 = enumOptions1.getUninterpretedOptionList();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = enumOptions1.getRepeatedFieldCount(fieldDescriptor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(enumOptions1);
        org.junit.Assert.assertNotNull(uninterpretedOptionList2);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        java.io.InputStream inputStream2 = null;
        com.google.protobuf.MessageLite.Builder builder3 = builder0.mergeFrom(inputStream2);
        boolean boolean4 = builder0.hasLabel();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        long long0 = java.security.Key.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 6603384152749567654L + "'", long0 == 6603384152749567654L);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime10.minusSeconds((long) '#');
        java.time.OffsetDateTime offsetDateTime13 = zonedDateTime10.toOffsetDateTime();
        long long14 = offsetDateTime13.toEpochSecond();
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        int int0 = com.google.javascript.jscomp.FunctionInformationMap.Entry.LINE_NUMBER_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto0 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.getDefaultInstance();
        boolean boolean1 = serviceDescriptorProto0.hasOptions();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder2 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.newBuilder(serviceDescriptorProto0);
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto3 = builder2.buildPartial();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto5 = serviceDescriptorProto3.getMethod((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceDescriptorProto0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(serviceDescriptorProto3);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder.getDescriptor();
        java.util.List<com.google.protobuf.Descriptors.FieldDescriptor> fieldDescriptorList1 = descriptor0.getFields();
        java.util.List<com.google.protobuf.Descriptors.FieldDescriptor> fieldDescriptorList2 = descriptor0.getFields();
        com.google.protobuf.Descriptors.Descriptor descriptor3 = descriptor0.getContainingType();
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(fieldDescriptorList1);
        org.junit.Assert.assertNotNull(fieldDescriptorList2);
        org.junit.Assert.assertNull(descriptor3);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.MessageOptions.newBuilder();
        java.io.InputStream inputStream1 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = builder0.mergeDelimitedFrom(inputStream1, extensionRegistryLite2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        byte[] byteArray3 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite4 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions5 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray3, extensionRegistryLite4);
        com.google.protobuf.CodedOutputStream codedOutputStream8 = com.google.protobuf.CodedOutputStream.newInstance(byteArray3, (int) (short) 0, 1);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder12 = builder0.mergeFrom(byteArray3, 18, 8, extensionRegistryLite11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(methodOptions5);
        org.junit.Assert.assertNotNull(codedOutputStream8);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto1 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.parseFrom(inputStream0);
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder2 = enumValueDescriptorProto1.toBuilder();
        boolean boolean3 = enumValueDescriptorProto1.isInitialized();
        org.junit.Assert.assertNotNull(enumValueDescriptorProto1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumValueOptions enumValueOptions1 = com.google.protobuf.DescriptorProtos.EnumValueOptions.parseDelimitedFrom(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo2 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.parseFrom(inputStream0, extensionRegistryLite1);
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder3 = sourceCodeInfo2.newBuilderForType();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = builder3.hasField(fieldDescriptor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceCodeInfo2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100 };
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileOptions.Builder builder9 = builder0.mergeFrom(byteArray5, (int) '#', (int) (short) 1, extensionRegistryLite8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100]");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder builder1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder2 = builder0.addUninterpretedOption(builder1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative0 = com.google.javascript.rhino.jstype.JSTypeNative.STRING_VALUE_OR_OBJECT_TYPE;
        org.junit.Assert.assertTrue("'" + jSTypeNative0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.STRING_VALUE_OR_OBJECT_TYPE + "'", jSTypeNative0.equals(com.google.javascript.rhino.jstype.JSTypeNative.STRING_VALUE_OR_OBJECT_TYPE));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime10.withYear((int) (short) 1);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField13.getBaseUnit();
        java.time.ZonedDateTime zonedDateTime15 = zonedDateTime10.truncatedTo(temporalUnit14);
        boolean boolean16 = temporalUnit14.isTimeBased();
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField13.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto2 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.parseFrom(inputStream0, extensionRegistryLite1);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto3 = fieldDescriptorProto2.getDefaultInstanceForType();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder4 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder(fieldDescriptorProto2);
        org.junit.Assert.assertNotNull(fieldDescriptorProto2);
        org.junit.Assert.assertNotNull(fieldDescriptorProto3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative0 = com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE;
        org.junit.Assert.assertTrue("'" + jSTypeNative0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE + "'", jSTypeNative0.equals(com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime10.withYear((int) (short) 1);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField13.getBaseUnit();
        java.time.ZonedDateTime zonedDateTime15 = zonedDateTime10.truncatedTo(temporalUnit14);
        java.time.ZonedDateTime zonedDateTime17 = zonedDateTime15.withDayOfYear((int) ':');
        java.time.Instant instant18 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset22);
        java.time.OffsetDateTime offsetDateTime24 = java.time.OffsetDateTime.ofInstant(instant18, (java.time.ZoneId) zoneOffset22);
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime29 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset28);
        java.time.ZoneOffset zoneOffset33 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime34 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset33);
        java.time.ZonedDateTime zonedDateTime35 = java.time.ZonedDateTime.of(localDateTime29, (java.time.ZoneId) zoneOffset33);
        java.time.Clock clock36 = java.time.Clock.fixed(instant18, (java.time.ZoneId) zoneOffset33);
        java.time.LocalDateTime localDateTime37 = java.time.LocalDateTime.now(clock36);
        java.time.LocalDate localDate38 = java.time.LocalDate.now(clock36);
        java.time.temporal.ChronoField chronoField39 = java.time.temporal.ChronoField.EPOCH_DAY;
        java.time.temporal.TemporalUnit temporalUnit40 = chronoField39.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            long long41 = zonedDateTime17.until((java.time.temporal.Temporal) localDate38, temporalUnit40);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZonedDateTime from TemporalAccessor: 1970-01-01 of type java.time.LocalDate");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField13.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(zoneOffset33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(zonedDateTime35);
        org.junit.Assert.assertNotNull(clock36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertTrue("'" + chronoField39 + "' != '" + java.time.temporal.ChronoField.EPOCH_DAY + "'", chronoField39.equals(java.time.temporal.ChronoField.EPOCH_DAY));
        org.junit.Assert.assertTrue("'" + temporalUnit40 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit40.equals(java.time.temporal.ChronoUnit.FOREVER));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        int int2 = com.google.protobuf.CodedOutputStream.computeBoolSize((int) (short) -1, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        boolean boolean6 = strSet4.isEmpty();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(100);
        boolean boolean9 = strSet4.equals((java.lang.Object) byteBuffer8);
        java.util.Iterator<java.lang.String> strItor10 = strSet4.iterator();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strItor10);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto0 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.getDefaultInstance();
        boolean boolean1 = serviceDescriptorProto0.hasOptions();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder2 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.newBuilder(serviceDescriptorProto0);
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto3 = builder2.buildPartial();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto5 = builder2.getMethod(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceDescriptorProto0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(serviceDescriptorProto3);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        int int0 = com.google.protobuf.DescriptorProtos.DescriptorProto.NESTED_TYPE_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = descriptor0.toProto();
        boolean boolean2 = descriptorProto1.isInitialized();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = descriptorProto1.getRepeatedField(fieldDescriptor3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(descriptorProto1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        int int0 = java.util.Spliterator.DISTINCT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.text.MessageFormat messageFormat1 = new java.text.MessageFormat("hi!");
        java.util.Locale locale2 = messageFormat1.getLocale();
        java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite> priorityMap3 = new java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>();
        java.lang.Object obj4 = priorityMap3.clone();
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder5 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.newBuilder();
        boolean boolean6 = priorityMap3.containsValue((java.lang.Object) builder5);
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder8 = builder5.setName("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=12 cap=12]");
        com.google.protobuf.ByteString byteString9 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder10 = builder5.mergeFrom(byteString9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = messageFormat1.format((java.lang.Object) builder5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto$Builder cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "{}");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(byteString9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        long[] longArray2 = new long[] { 256, 10 };
        java.util.stream.LongStream longStream3 = java.util.stream.LongStream.of(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[256, 10]");
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("/");
        java.lang.String str3 = sourceFile1.getLine((int) 'a');
        int int5 = sourceFile1.getLineOfOffset(43);
        java.lang.String str6 = sourceFile1.getOriginalPath();
        org.junit.Assert.assertNotNull(sourceFile1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.addExtension(builder3);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder6 = builder0.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder8 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.newBuilder();
        java.io.InputStream inputStream9 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite10 = null;
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder11 = builder8.mergeFrom(inputStream9, extensionRegistryLite10);
        boolean boolean12 = builder11.hasOptions();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder13 = builder6.addValue(7, builder11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + label4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.Month month1 = java.time.Month.AUGUST;
        int int2 = month1.getValue();
        // The following exception was thrown during execution in test generation
        try {
            long long3 = chronoField0.getFrom((java.time.temporal.TemporalAccessor) month1);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfAmPm");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField0.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.AUGUST + "'", month1.equals(java.time.Month.AUGUST));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.CodingErrorAction codingErrorAction2 = charsetDecoder1.malformedInputAction();
        java.nio.charset.CodingErrorAction codingErrorAction3 = charsetDecoder1.unmappableCharacterAction();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.CharsetDecoder charsetDecoder5 = charsetDecoder1.replaceWith("1970-01-01T00:00:52+00:00:52");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Replacement too long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(codingErrorAction2);
        org.junit.Assert.assertNotNull(codingErrorAction3);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId2 = java.time.ZoneId.of("OptionalDouble[-1.0]", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: aliasMap");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.google.protobuf.Descriptors.FieldDescriptor.Type type0 = com.google.protobuf.Descriptors.FieldDescriptor.Type.STRING;
        com.google.protobuf.Descriptors.FieldDescriptor.Type type1 = com.google.protobuf.Descriptors.FieldDescriptor.Type.STRING;
        com.google.protobuf.Descriptors.FieldDescriptor.Type type2 = com.google.protobuf.Descriptors.FieldDescriptor.Type.INT64;
        com.google.protobuf.Descriptors.FieldDescriptor.Type type3 = com.google.protobuf.Descriptors.FieldDescriptor.Type.BYTES;
        com.google.protobuf.Descriptors.FieldDescriptor.Type type4 = com.google.protobuf.Descriptors.FieldDescriptor.Type.STRING;
        com.google.common.collect.ImmutableList<com.google.protobuf.Descriptors.FieldDescriptor.Type> typeList5 = com.google.common.collect.ImmutableList.of(type0, type1, type2, type3, type4);
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.google.protobuf.Descriptors.FieldDescriptor.Type.STRING + "'", type0.equals(com.google.protobuf.Descriptors.FieldDescriptor.Type.STRING));
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + com.google.protobuf.Descriptors.FieldDescriptor.Type.STRING + "'", type1.equals(com.google.protobuf.Descriptors.FieldDescriptor.Type.STRING));
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + com.google.protobuf.Descriptors.FieldDescriptor.Type.INT64 + "'", type2.equals(com.google.protobuf.Descriptors.FieldDescriptor.Type.INT64));
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + com.google.protobuf.Descriptors.FieldDescriptor.Type.BYTES + "'", type3.equals(com.google.protobuf.Descriptors.FieldDescriptor.Type.BYTES));
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.google.protobuf.Descriptors.FieldDescriptor.Type.STRING + "'", type4.equals(com.google.protobuf.Descriptors.FieldDescriptor.Type.STRING));
        org.junit.Assert.assertNotNull(typeList5);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MethodOptions methodOptions1 = com.google.protobuf.DescriptorProtos.MethodOptions.parseDelimitedFrom(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.UnknownFieldSet unknownFieldSet6 = com.google.protobuf.UnknownFieldSet.parseFrom(codedInputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(methodOptions2);
        org.junit.Assert.assertNotNull(codedInputStream5);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        java.io.InputStream inputStream2 = null;
        com.google.protobuf.MessageLite.Builder builder3 = builder0.mergeFrom(inputStream2);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type type4 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_BYTES;
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder5 = builder0.setType(type4);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = builder0.getField(fieldDescriptor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_BYTES + "'", type4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_BYTES));
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.MessageOptions.newBuilder();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = builder0.getField(fieldDescriptor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean5 = node4.isStringKey();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node4);
        boolean boolean7 = node6.isFor();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean12 = node11.isVar();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean17 = node16.isStringKey();
        boolean boolean18 = node16.isThrow();
        boolean boolean19 = node16.isVarArgs();
        boolean boolean20 = node16.isHook();
        com.google.javascript.rhino.Node node21 = node16.cloneNode();
        com.google.javascript.rhino.Node node22 = node11.useSourceInfoIfMissingFromForTree(node21);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean27 = node26.isFromExterns();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean32 = node31.isFromExterns();
        java.lang.String str33 = node31.toString();
        com.google.javascript.rhino.Node node34 = node26.copyInformationFrom(node31);
        int int35 = node26.getLineno();
        boolean boolean36 = node26.isLabel();
        java.lang.String str37 = node26.getSourceFileName();
        boolean boolean38 = node26.isDec();
        com.google.javascript.rhino.Node node39 = node21.useSourceInfoFrom(node26);
        boolean boolean40 = node21.isFor();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean46 = node45.isStringKey();
        boolean boolean47 = node45.isThrow();
        boolean boolean48 = node45.isVarArgs();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean53 = node52.isFromExterns();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean58 = node57.isFromExterns();
        java.lang.String str59 = node57.toString();
        com.google.javascript.rhino.Node node60 = node52.copyInformationFrom(node57);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean65 = node64.isStringKey();
        boolean boolean66 = node64.isThrow();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean71 = node70.isStringKey();
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((-1), node45, node57, node64, node70, 16384, 16);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile75 = node64.getStaticSourceFile();
        // The following exception was thrown during execution in test generation
        try {
            node6.addChildrenAfter(node21, node64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "NUMBER 52.0 0" + "'", str33, "NUMBER 52.0 0");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "NUMBER 52.0 0" + "'", str59, "NUMBER 52.0 0");
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(staticSourceFile75);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.google.javascript.jscomp.DependencyOptions dependencyOptions0 = new com.google.javascript.jscomp.DependencyOptions();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = strSet5.isEmpty();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(100);
        boolean boolean10 = strSet5.equals((java.lang.Object) byteBuffer9);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        boolean boolean17 = strSet15.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream18 = strSet15.stream();
        boolean boolean19 = strSet5.retainAll((java.util.Collection<java.lang.String>) strSet15);
        com.google.javascript.jscomp.DependencyOptions dependencyOptions20 = dependencyOptions0.setEntryPoints((java.util.Collection<java.lang.String>) strSet5);
        com.google.javascript.jscomp.DependencyOptions dependencyOptions22 = dependencyOptions20.setMoocherDropping(false);
        com.google.javascript.jscomp.DependencyOptions dependencyOptions24 = dependencyOptions20.setDependencySorting(false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dependencyOptions20);
        org.junit.Assert.assertNotNull(dependencyOptions22);
        org.junit.Assert.assertNotNull(dependencyOptions24);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        int int2 = com.google.protobuf.CodedOutputStream.computeSFixed64Size((int) '/', (long) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        short[] shortArray1 = new short[] { (byte) 1 };
        java.nio.ShortBuffer shortBuffer2 = java.nio.ShortBuffer.wrap(shortArray1);
        java.nio.Buffer buffer3 = shortBuffer2.flip();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(buffer3);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.google.javascript.jscomp.JSModule[] jSModuleArray0 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList1 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList1, jSModuleArray0);
        com.google.javascript.jscomp.JSModule[] jSModuleArray3 = com.google.javascript.jscomp.JSModule.sortJsModules((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList1);
        org.junit.Assert.assertNotNull(jSModuleArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSModuleArray3);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        java.io.InputStream inputStream2 = null;
        com.google.protobuf.MessageLite.Builder builder3 = builder0.mergeFrom(inputStream2);
        com.google.protobuf.UnknownFieldSet unknownFieldSet4 = null;
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder5 = builder0.setUnknownFields(unknownFieldSet4);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = builder0.hasField(fieldDescriptor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite> priorityMap0 = new java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>();
        java.lang.Object obj1 = priorityMap0.clone();
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder2 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.newBuilder();
        boolean boolean3 = priorityMap0.containsValue((java.lang.Object) builder2);
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder5 = builder2.setName("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=12 cap=12]");
        com.google.protobuf.ByteString byteString6 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder7 = builder2.mergeFrom(byteString6);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = builder2.hasField(fieldDescriptor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{}");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(byteString6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.InvalidPropertiesFormatException invalidPropertiesFormatException1 = new java.util.InvalidPropertiesFormatException("South Korea");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        int int0 = java.util.Spliterator.DISTINCT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.Descriptors.Descriptor descriptor2 = descriptor0.findNestedTypeByName("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.Descriptors.Descriptor descriptor3 = descriptor2.getContainingType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNull(descriptor2);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.addExtension(builder3);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder6 = builder0.addEnumTypeBuilder();
        com.google.protobuf.ByteString.Output output8 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream10 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output8, (int) 'a');
        byte[] byteArray11 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite12 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions13 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray11, extensionRegistryLite12);
        output8.write(byteArray11);
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder15 = builder0.mergeFrom(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder17 = builder0.removeExtension(999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 999, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + label4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(output8);
        org.junit.Assert.assertNotNull(codedOutputStream10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(methodOptions13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime4 = java.time.LocalTime.of((-1), 16, (int) ':', 1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto0 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.getDefaultInstance();
        boolean boolean1 = serviceDescriptorProto0.hasOptions();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder2 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.newBuilder(serviceDescriptorProto0);
        java.io.InputStream inputStream3 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = builder2.mergeDelimitedFrom(inputStream3, extensionRegistryLite4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceDescriptorProto0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.google.debugging.sourcemap.FilePosition filePosition2 = new com.google.debugging.sourcemap.FilePosition(12, (int) (short) -1);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        compilerOptions0.setRemoveDeadCode(false);
        java.lang.Object obj7 = compilerOptions0.clone();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap8 = null;
        compilerOptions0.setCssRenamingMap(cssRenamingMap8);
        org.junit.Assert.assertNotNull(errorFormat3);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset4);
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset9);
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.of(localDateTime5, (java.time.ZoneId) zoneOffset9);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField13.getBaseUnit();
        java.time.LocalDateTime localDateTime15 = localDateTime5.plus((long) 1970, temporalUnit14);
        java.time.LocalDateTime localDateTime17 = localDateTime5.withHour((int) (short) 1);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.OffsetDateTime offsetDateTime20 = java.time.OffsetDateTime.of(localDateTime5, zoneOffset19);
        java.time.OffsetTime offsetTime21 = java.time.OffsetTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset19);
        java.time.Instant instant22 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime27 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset26);
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime32 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset31);
        java.time.ZonedDateTime zonedDateTime33 = java.time.ZonedDateTime.of(localDateTime27, (java.time.ZoneId) zoneOffset31);
        java.time.temporal.ChronoField chronoField35 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit36 = chronoField35.getBaseUnit();
        java.time.LocalDateTime localDateTime37 = localDateTime27.plus((long) 1970, temporalUnit36);
        java.time.LocalDateTime localDateTime39 = localDateTime27.withHour((int) (short) 1);
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.OffsetDateTime offsetDateTime42 = java.time.OffsetDateTime.of(localDateTime27, zoneOffset41);
        java.time.OffsetTime offsetTime43 = java.time.OffsetTime.ofInstant(instant22, (java.time.ZoneId) zoneOffset41);
        boolean boolean44 = offsetTime21.isAfter(offsetTime43);
        int int45 = offsetTime43.getMinute();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField13.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(offsetDateTime20);
        org.junit.Assert.assertNotNull(offsetTime21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(zonedDateTime33);
        org.junit.Assert.assertTrue("'" + chronoField35 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField35.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit36 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit36.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertNotNull(offsetDateTime42);
        org.junit.Assert.assertNotNull(offsetTime43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        int[] intArray4 = new int[] { 16, ':', 43, (short) 100 };
        java.util.stream.IntStream intStream5 = java.util.stream.IntStream.of(intArray4);
        java.util.OptionalInt optionalInt6 = intStream5.findAny();
        java.util.function.IntPredicate intPredicate7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream8 = intStream5.filter(intPredicate7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[16, 58, 43, 100]");
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(optionalInt6);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.io.IOException iOException1 = new java.io.IOException("iso8601");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler1.getErrorManager();
        double double3 = errorManager2.getTypedPercent();
        com.google.javascript.jscomp.CheckLevel checkLevel4 = null;
        com.google.javascript.jscomp.JSError jSError5 = null;
        // The following exception was thrown during execution in test generation
        try {
            errorManager2.report(checkLevel4, jSError5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.net.SocketException socketException1 = new java.net.SocketException("Named type with empty name component");
        java.security.cert.CertificateException certificateException2 = new java.security.cert.CertificateException((java.lang.Throwable) socketException1);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime10.withYear((int) (short) 1);
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime12.minusSeconds((long) (short) 100);
        int int15 = zonedDateTime12.getHour();
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.MessageOptions.newBuilder();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor1 = null;
        java.time.Period period3 = java.time.Period.ZERO;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder4 = builder0.setRepeatedField(fieldDescriptor1, 43, (java.lang.Object) period3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset4);
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset9);
        java.time.ZonedDateTime zonedDateTime11 = java.time.ZonedDateTime.of(localDateTime5, (java.time.ZoneId) zoneOffset9);
        java.time.ZonedDateTime zonedDateTime13 = zonedDateTime11.withHour(16);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime14 = zonedDateTime13.toLocalDateTime();
        java.time.chrono.Chronology chronology15 = localDateChronoLocalDateTime14.getChronology();
        int int16 = isoChronology0.compareTo(chronology15);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.MAX;
        java.time.LocalDate localDate18 = isoChronology0.dateNow((java.time.ZoneId) zoneOffset17);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate22 = isoChronology0.date(2, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -1");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup1 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup2 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES = diagnosticGroup2;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY = diagnosticGroup4;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES = diagnosticGroup6;
        com.google.javascript.jscomp.DiagnosticType diagnosticType8 = com.google.javascript.jscomp.Compiler.MOTION_ITERATIONS_ERROR;
        com.google.javascript.jscomp.DiagnosticType[] diagnosticTypeArray9 = new com.google.javascript.jscomp.DiagnosticType[] { diagnosticType8 };
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = new com.google.javascript.jscomp.DiagnosticGroup(diagnosticTypeArray9);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_MESSAGE = diagnosticGroup11;
        com.google.javascript.jscomp.DiagnosticGroup[] diagnosticGroupArray13 = new com.google.javascript.jscomp.DiagnosticGroup[] { diagnosticGroup1, diagnosticGroup2, diagnosticGroup4, diagnosticGroup6, diagnosticGroup10, diagnosticGroup11 };
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup14 = new com.google.javascript.jscomp.DiagnosticGroup("ISO", diagnosticGroupArray13);
        org.junit.Assert.assertNotNull(diagnosticGroup1);
        org.junit.Assert.assertNotNull(diagnosticGroup2);
        org.junit.Assert.assertNotNull(diagnosticGroup4);
        org.junit.Assert.assertNotNull(diagnosticGroup6);
        org.junit.Assert.assertNotNull(diagnosticType8);
        org.junit.Assert.assertNotNull(diagnosticTypeArray9);
        org.junit.Assert.assertNotNull(diagnosticGroup11);
        org.junit.Assert.assertNotNull(diagnosticGroupArray13);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative0 = com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_TYPE;
        org.junit.Assert.assertTrue("'" + jSTypeNative0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_TYPE + "'", jSTypeNative0.equals(com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_TYPE));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap.Module module1 = com.google.javascript.jscomp.FunctionInformationMap.Module.parseDelimitedFrom(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto7 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.parseFrom(codedInputStream5, extensionRegistryLite6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(methodOptions2);
        org.junit.Assert.assertNotNull(codedInputStream5);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        java.time.temporal.TemporalUnit temporalUnit1 = chronoField0.getRangeUnit();
        long long3 = chronoField0.checkValidValue((long) 2);
        boolean boolean4 = chronoField0.isTimeBased();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField0.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
        org.junit.Assert.assertTrue("'" + temporalUnit1 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit1.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.time.Instant instant0 = java.time.Instant.now();
        org.junit.Assert.assertNotNull(instant0);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of((long) (-1));
        java.util.function.LongConsumer longConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            longStream1.forEach(longConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder1 = builder0.clearCcGenericServices();
        boolean boolean2 = builder0.isInitialized();
        boolean boolean3 = builder0.getJavaGenericServices();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOption uninterpretedOption5 = builder0.getUninterpretedOption((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedOutputStream codedOutputStream5 = com.google.protobuf.CodedOutputStream.newInstance(byteArray0, (int) (short) 0, 1);
        com.google.protobuf.CodedOutputStream codedOutputStream8 = com.google.protobuf.CodedOutputStream.newInstance(byteArray0, (int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            codedOutputStream8.writeRawVarint32((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.CodedOutputStream.OutOfSpaceException; message: CodedOutputStream was writing to a flat byte array and ran out of space.");
        } catch (com.google.protobuf.CodedOutputStream.OutOfSpaceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(methodOptions2);
        org.junit.Assert.assertNotNull(codedOutputStream5);
        org.junit.Assert.assertNotNull(codedOutputStream8);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto2 = builder0.buildPartial();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = builder0.hasField(fieldDescriptor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(fieldDescriptorProto2);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.google.protobuf.Descriptors.FieldDescriptor.Type type0 = com.google.protobuf.Descriptors.FieldDescriptor.Type.FIXED32;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.google.protobuf.Descriptors.FieldDescriptor.Type.FIXED32 + "'", type0.equals(com.google.protobuf.Descriptors.FieldDescriptor.Type.FIXED32));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto2 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.parseDelimitedFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.google.protobuf.DescriptorProtos.ServiceOptions serviceOptions0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.ServiceOptions.Builder builder1 = com.google.protobuf.DescriptorProtos.ServiceOptions.newBuilder(serviceOptions0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.ServiceOptions serviceOptions1 = com.google.protobuf.DescriptorProtos.ServiceOptions.parseDelimitedFrom(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit1 = chronoField0.getBaseUnit();
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset5);
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset10);
        java.time.ZonedDateTime zonedDateTime12 = java.time.ZonedDateTime.of(localDateTime6, (java.time.ZoneId) zoneOffset10);
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime12.withYear((int) (short) 1);
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime19 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset18);
        int int20 = localDateTime19.getYear();
        java.time.LocalDate localDate21 = localDateTime19.toLocalDate();
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset25);
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime31 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset30);
        java.time.ZonedDateTime zonedDateTime32 = java.time.ZonedDateTime.of(localDateTime26, (java.time.ZoneId) zoneOffset30);
        java.time.temporal.ChronoField chronoField34 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit35 = chronoField34.getBaseUnit();
        java.time.LocalDateTime localDateTime36 = localDateTime26.plus((long) 1970, temporalUnit35);
        java.time.LocalTime localTime37 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime36);
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime42 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset41);
        java.time.OffsetDateTime offsetDateTime43 = java.time.OffsetDateTime.of(localDate21, localTime37, zoneOffset41);
        java.time.ZonedDateTime zonedDateTime44 = zonedDateTime12.withZoneSameInstant((java.time.ZoneId) zoneOffset41);
        boolean boolean45 = temporalUnit1.isSupportedBy((java.time.temporal.Temporal) zonedDateTime12);
        java.time.LocalTime localTime46 = zonedDateTime12.toLocalTime();
        java.time.Instant instant47 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset51 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime52 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset51);
        java.time.OffsetDateTime offsetDateTime53 = java.time.OffsetDateTime.ofInstant(instant47, (java.time.ZoneId) zoneOffset51);
        java.time.OffsetDateTime offsetDateTime55 = offsetDateTime53.minusDays((long) (short) 100);
        java.lang.String str56 = offsetDateTime53.toString();
        java.time.temporal.ChronoField chronoField57 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        java.time.temporal.TemporalUnit temporalUnit58 = chronoField57.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            long long59 = localTime46.until((java.time.temporal.Temporal) offsetDateTime53, temporalUnit58);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField0.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit1 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit1.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertTrue("'" + chronoField34 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField34.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit35 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit35.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(offsetDateTime43);
        org.junit.Assert.assertNotNull(zonedDateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertNotNull(zoneOffset51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(offsetDateTime53);
        org.junit.Assert.assertNotNull(offsetDateTime55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1970-01-01T00:00:52+00:00:52" + "'", str56, "1970-01-01T00:00:52+00:00:52");
        org.junit.Assert.assertTrue("'" + chronoField57 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField57.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
        org.junit.Assert.assertTrue("'" + temporalUnit58 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit58.equals(java.time.temporal.ChronoUnit.FOREVER));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.security.cert.CertificateException certificateException1 = new java.security.cert.CertificateException("Named type with empty name component");
        java.util.stream.Stream<java.lang.Throwable> throwableStream2 = java.util.stream.Stream.of((java.lang.Throwable) certificateException1);
        org.junit.Assert.assertNotNull(throwableStream2);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.google.common.collect.Ordering<java.lang.Object> objOrdering0 = com.google.common.collect.Ordering.usingToString();
        org.junit.Assert.assertNotNull(objOrdering0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "ISO", file2);
        boolean boolean6 = file3.setWritable(false, false);
        java.net.URI uRI7 = file3.toURI();
        java.io.PrintStream printStream8 = new java.io.PrintStream(file3);
        byte[] byteArray9 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite10 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions11 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray9, extensionRegistryLite10);
        com.google.protobuf.CodedOutputStream codedOutputStream14 = com.google.protobuf.CodedOutputStream.newInstance(byteArray9, (int) (short) 0, 1);
        com.google.protobuf.CodedOutputStream codedOutputStream17 = com.google.protobuf.CodedOutputStream.newInstance(byteArray9, (int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            printStream8.write(byteArray9, (int) ':', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!8261868836356297925ISO");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(uRI7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(methodOptions11);
        org.junit.Assert.assertNotNull(codedOutputStream14);
        org.junit.Assert.assertNotNull(codedOutputStream17);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto0 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.getDefaultInstance();
        int int1 = serviceDescriptorProto0.getSerializedSize();
        org.junit.Assert.assertNotNull(serviceDescriptorProto0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        int int7 = codedInputStream5.pushLimit((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileDescriptorProto fileDescriptorProto8 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(codedInputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(methodOptions2);
        org.junit.Assert.assertNotNull(codedInputStream5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.addExtension(builder3);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder6 = builder0.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder7 = builder6.getOptionsBuilder();
        java.io.InputStream inputStream8 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions9 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream8);
        boolean boolean10 = enumOptions9.isInitialized();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder11 = builder7.mergeFrom(enumOptions9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder uninterpretedOptionOrBuilder13 = enumOptions9.getUninterpretedOptionOrBuilder(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + label4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(enumOptions9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite> priorityMap0 = new java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>();
        java.lang.Object obj1 = priorityMap0.clone();
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder2 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.newBuilder();
        boolean boolean3 = priorityMap0.containsValue((java.lang.Object) builder2);
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder5 = builder2.setName("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=12 cap=12]");
        com.google.protobuf.ByteString byteString6 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder7 = builder2.mergeFrom(byteString6);
        com.google.protobuf.DescriptorProtos.EnumValueOptions enumValueOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder9 = builder2.setOptions(enumValueOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{}");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(byteString6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        int int0 = com.google.javascript.rhino.Node.FREE_CALL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 50 + "'", int0 == 50);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto0 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.getDefaultInstance();
        boolean boolean1 = serviceDescriptorProto0.hasOptions();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder2 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.newBuilder(serviceDescriptorProto0);
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto3 = builder2.buildPartial();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto4 = builder2.build();
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder builder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder6 = builder2.addMethod(builder5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceDescriptorProto0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(serviceDescriptorProto3);
        org.junit.Assert.assertNotNull(serviceDescriptorProto4);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean4 = node3.isFromExterns();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean9 = node8.isFromExterns();
        java.lang.String str10 = node8.toString();
        com.google.javascript.rhino.Node node11 = node3.copyInformationFrom(node8);
        int int12 = node3.getLineno();
        boolean boolean13 = node3.isLocalResultCall();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NUMBER 52.0 0" + "'", str10, "NUMBER 52.0 0");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.javascript.jscomp.FunctionInformationMap.Module.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.wrap(byteArray0, 1970, (int) '/');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(methodOptions2);
        org.junit.Assert.assertNotNull(codedInputStream5);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset4);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset4);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.minusDays((long) (short) 100);
        java.lang.String str9 = offsetDateTime6.toString();
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        int int11 = offsetDateTime6.get((java.time.temporal.TemporalField) chronoField10);
        java.time.OffsetDateTime offsetDateTime13 = offsetDateTime6.withDayOfMonth((int) (short) 10);
        java.time.temporal.TemporalField temporalField14 = null;
        boolean boolean15 = offsetDateTime6.isSupported(temporalField14);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T00:00:52+00:00:52" + "'", str9, "1970-01-01T00:00:52+00:00:52");
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField10.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo2 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.parseFrom(inputStream0, extensionRegistryLite1);
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder3 = sourceCodeInfo2.newBuilderForType();
        boolean boolean4 = builder3.isInitialized();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo5 = builder3.build();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = builder3.getRepeatedFieldCount(fieldDescriptor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceCodeInfo2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(sourceCodeInfo5);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto0 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.getDefaultInstance();
        boolean boolean1 = serviceDescriptorProto0.hasOptions();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder2 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.newBuilder(serviceDescriptorProto0);
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto3 = builder2.buildPartial();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto4 = builder2.build();
        byte[] byteArray5 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions7 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray5, extensionRegistryLite6);
        com.google.protobuf.CodedInputStream codedInputStream10 = com.google.protobuf.CodedInputStream.newInstance(byteArray5, 16, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder13 = builder2.mergeFrom(byteArray5, (int) (byte) 100, (int) ':');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceDescriptorProto0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(serviceDescriptorProto3);
        org.junit.Assert.assertNotNull(serviceDescriptorProto4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(methodOptions7);
        org.junit.Assert.assertNotNull(codedInputStream10);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        java.util.List<com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder> builderList3 = builder0.getServiceBuilderList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = builder0.getDependency(999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 999, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builderList3);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.time.chrono.IsoChronology isoChronology0 = java.time.chrono.IsoChronology.INSTANCE;
        java.lang.String str1 = isoChronology0.getId();
        java.util.Map<java.time.temporal.TemporalField, java.lang.Long> temporalFieldMap2 = null;
        java.time.format.ResolverStyle resolverStyle3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate4 = isoChronology0.resolveDate(temporalFieldMap2, resolverStyle3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(isoChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ISO" + "'", str1, "ISO");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = descriptor0.toProto();
        boolean boolean2 = descriptorProto1.isInitialized();
        int int3 = descriptorProto1.getExtensionCount();
        java.util.List<com.google.protobuf.DescriptorProtos.DescriptorProto> descriptorProtoList4 = descriptorProto1.getNestedTypeList();
        int int5 = descriptorProto1.getNestedTypeCount();
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(descriptorProto1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(descriptorProtoList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions1 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream0);
        boolean boolean2 = enumOptions1.isInitialized();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = enumOptions1.getRepeatedFieldCount(fieldDescriptor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(enumOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.google.protobuf.DescriptorProtos.FileOptions fileOptions0 = com.google.protobuf.DescriptorProtos.FileOptions.getDefaultInstance();
        java.util.List<com.google.protobuf.DescriptorProtos.UninterpretedOption> uninterpretedOptionList1 = fileOptions0.getUninterpretedOptionList();
        boolean boolean2 = fileOptions0.getJavaMultipleFiles();
        org.junit.Assert.assertNotNull(fileOptions0);
        org.junit.Assert.assertNotNull(uninterpretedOptionList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo2 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.parseFrom(inputStream0, extensionRegistryLite1);
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder3 = sourceCodeInfo2.newBuilderForType();
        boolean boolean4 = builder3.isInitialized();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = builder3.getField(fieldDescriptor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceCodeInfo2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.getDescriptor();
        java.util.List<com.google.protobuf.Descriptors.FieldDescriptor> fieldDescriptorList1 = descriptor0.getExtensions();
        com.google.protobuf.Descriptors.Descriptor descriptor3 = descriptor0.findNestedTypeByName("goog.abstractMethod");
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(fieldDescriptorList1);
        org.junit.Assert.assertNull(descriptor3);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.time.format.FormatStyle formatStyle0 = java.time.format.FormatStyle.SHORT;
        org.junit.Assert.assertTrue("'" + formatStyle0 + "' != '" + java.time.format.FormatStyle.SHORT + "'", formatStyle0.equals(java.time.format.FormatStyle.SHORT));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        boolean boolean1 = localDate0.isLeapYear();
        java.time.chrono.Era era2 = localDate0.getEra();
        java.time.format.TextStyle textStyle3 = null;
        java.util.Locale locale7 = new java.util.Locale("", "NUMBER 52.0 0", "hi!");
        java.util.Locale locale11 = new java.util.Locale("", "NUMBER 52.0 0", "hi!");
        java.lang.String str12 = locale7.getDisplayLanguage(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = era2.getDisplayName(textStyle3, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: textStyle");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + era2 + "' != '" + java.time.chrono.IsoEra.CE + "'", era2.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertEquals(locale7.toString(), "_NUMBER 52.0 0_hi!");
        org.junit.Assert.assertEquals(locale11.toString(), "_NUMBER 52.0 0_hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(writer0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.google.protobuf.WireFormat.JavaType javaType0 = com.google.protobuf.WireFormat.JavaType.MESSAGE;
        org.junit.Assert.assertTrue("'" + javaType0 + "' != '" + com.google.protobuf.WireFormat.JavaType.MESSAGE + "'", javaType0.equals(com.google.protobuf.WireFormat.JavaType.MESSAGE));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto0 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.getDefaultInstance();
        boolean boolean1 = serviceDescriptorProto0.hasOptions();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder2 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.newBuilder(serviceDescriptorProto0);
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto3 = builder2.buildPartial();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto4 = builder2.build();
        boolean boolean5 = serviceDescriptorProto4.isInitialized();
        org.junit.Assert.assertNotNull(serviceDescriptorProto0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(serviceDescriptorProto3);
        org.junit.Assert.assertNotNull(serviceDescriptorProto4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy5 = null;
        compilerOptions0.variableRenaming = variableRenamingPolicy5;
        compilerOptions0.setSummaryDetailLevel(999);
        boolean boolean9 = compilerOptions0.getInferTypes();
        boolean boolean10 = compilerOptions0.ideMode;
        compilerOptions0.setGroupVariableDeclarations(true);
        compilerOptions0.lineBreak = true;
        org.junit.Assert.assertNotNull(errorFormat3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        compilerInput3.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler5);
        com.google.javascript.jscomp.Scope scope8 = compiler5.getTopScope();
        java.lang.String str11 = compiler5.getSourceLine("US-ASCII", 0);
        // The following exception was thrown during execution in test generation
        try {
            compiler5.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        compilerInput3.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler5);
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler5.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler5.getMessages();
        // The following exception was thrown during execution in test generation
        try {
            compiler5.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime2 = java.time.OffsetTime.parse((java.lang.CharSequence) "goog.abstractMethod", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatter");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        compilerInput3.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler5);
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler5.getCodingConvention();
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler5.getMessages();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = compiler5.toSource(jSModule10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder1 = builder0.clearCcGenericServices();
        boolean boolean2 = builder0.isInitialized();
        boolean boolean3 = builder0.getJavaGenericServices();
        com.google.protobuf.DescriptorProtos.UninterpretedOption uninterpretedOption4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileOptions.Builder builder5 = builder0.addUninterpretedOption(uninterpretedOption4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.FRIDAY;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        java.time.temporal.TemporalUnit temporalUnit2 = chronoField1.getRangeUnit();
        long long4 = chronoField1.checkValidValue((long) 2);
        boolean boolean5 = dayOfWeek0.isSupported((java.time.temporal.TemporalField) chronoField1);
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset9);
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset14);
        java.time.ZonedDateTime zonedDateTime16 = java.time.ZonedDateTime.of(localDateTime10, (java.time.ZoneId) zoneOffset14);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit19 = chronoField18.getBaseUnit();
        java.time.LocalDateTime localDateTime20 = localDateTime10.plus((long) 1970, temporalUnit19);
        java.time.LocalTime localTime21 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime20);
        java.time.Period period22 = java.time.Period.ZERO;
        java.time.chrono.ChronoPeriod chronoPeriod23 = period22.normalized();
        java.time.Period period25 = period22.plusMonths((long) ' ');
        java.time.LocalDateTime localDateTime26 = localDateTime20.minus((java.time.temporal.TemporalAmount) period22);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange27 = chronoField1.rangeRefinedBy((java.time.temporal.TemporalAccessor) localDateTime26);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.FRIDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.FRIDAY));
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField1.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
        org.junit.Assert.assertTrue("'" + temporalUnit2 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit2.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField18.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit19 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit19.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(chronoPeriod23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=/");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        int int0 = com.google.protobuf.DescriptorProtos.FieldOptions.UNINTERPRETED_OPTION_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 999 + "'", int0 == 999);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.google.javascript.jscomp.CustomPassExecutionTime customPassExecutionTime0 = com.google.javascript.jscomp.CustomPassExecutionTime.BEFORE_CHECKS;
        org.junit.Assert.assertTrue("'" + customPassExecutionTime0 + "' != '" + com.google.javascript.jscomp.CustomPassExecutionTime.BEFORE_CHECKS + "'", customPassExecutionTime0.equals(com.google.javascript.jscomp.CustomPassExecutionTime.BEFORE_CHECKS));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.initOptions(compilerOptions2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.ServiceOptions serviceOptions2 = com.google.protobuf.DescriptorProtos.ServiceOptions.parseDelimitedFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.MessageOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder builder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder3 = builder0.setUninterpretedOption(43, builder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.time.Period period1 = java.time.Period.ofMonths(171);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        boolean boolean6 = strSet4.isEmpty();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(100);
        boolean boolean9 = strSet4.equals((java.lang.Object) byteBuffer8);
        java.nio.IntBuffer intBuffer10 = byteBuffer8.asIntBuffer();
        java.nio.ByteOrder byteOrder11 = intBuffer10.order();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intBuffer10.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intBuffer10);
        org.junit.Assert.assertNotNull(byteOrder11);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        int int0 = java.util.Spliterator.IMMUTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region5 = compilerInput3.getRegion(12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset4);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset4);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.minusDays((long) (short) 100);
        java.lang.String str9 = offsetDateTime6.toString();
        java.time.LocalTime localTime10 = offsetDateTime6.toLocalTime();
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset15);
        int int17 = localDateTime16.getYear();
        java.time.Instant instant18 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset22);
        java.time.OffsetDateTime offsetDateTime24 = java.time.OffsetDateTime.ofInstant(instant18, (java.time.ZoneId) zoneOffset22);
        java.time.Instant instant25 = localDateTime16.toInstant(zoneOffset22);
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime31 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset30);
        java.time.ZoneOffset zoneOffset35 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime36 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset35);
        java.time.ZonedDateTime zonedDateTime37 = java.time.ZonedDateTime.of(localDateTime31, (java.time.ZoneId) zoneOffset35);
        java.time.temporal.ChronoField chronoField39 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit40 = chronoField39.getBaseUnit();
        java.time.LocalDateTime localDateTime41 = localDateTime31.plus((long) 1970, temporalUnit40);
        java.time.ZoneOffset zoneOffset46 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime47 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset46);
        java.time.ZoneOffset zoneOffset51 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime52 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset51);
        java.time.ZonedDateTime zonedDateTime53 = java.time.ZonedDateTime.of(localDateTime47, (java.time.ZoneId) zoneOffset51);
        java.time.temporal.ChronoField chronoField55 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit56 = chronoField55.getBaseUnit();
        java.time.LocalDateTime localDateTime57 = localDateTime47.plus((long) 1970, temporalUnit56);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime58 = localDateTime41.minus((long) 43, temporalUnit56);
        java.time.Instant instant59 = instant25.plus((long) 16384, temporalUnit56);
        java.time.LocalTime localTime60 = localTime10.plus((long) 64, temporalUnit56);
        java.time.ZoneOffset zoneOffset64 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime65 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset64);
        java.time.ZoneOffset zoneOffset69 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime70 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset69);
        java.time.ZonedDateTime zonedDateTime71 = java.time.ZonedDateTime.of(localDateTime65, (java.time.ZoneId) zoneOffset69);
        java.time.OffsetTime offsetTime72 = java.time.OffsetTime.of(localTime60, zoneOffset69);
        java.lang.String str73 = offsetTime72.toString();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T00:00:52+00:00:52" + "'", str9, "1970-01-01T00:00:52+00:00:52");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(zoneOffset35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(zonedDateTime37);
        org.junit.Assert.assertTrue("'" + chronoField39 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField39.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit40 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit40.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(zoneOffset46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(zoneOffset51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(zonedDateTime53);
        org.junit.Assert.assertTrue("'" + chronoField55 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField55.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit56 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit56.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime58);
        org.junit.Assert.assertNotNull(instant59);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(zoneOffset64);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(zoneOffset69);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(zonedDateTime71);
        org.junit.Assert.assertNotNull(offsetTime72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "16:00:52+00:00:52" + "'", str73, "16:00:52+00:00:52");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        byte[] byteArray1 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions3 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray1, extensionRegistryLite2);
        com.google.protobuf.CodedInputStream codedInputStream6 = com.google.protobuf.CodedInputStream.newInstance(byteArray1, 16, (int) 'a');
        com.google.javascript.jscomp.VariableMap variableMap7 = com.google.javascript.jscomp.VariableMap.fromBytes(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileOptions.Builder builder10 = builder0.mergeFrom(byteArray1, (int) '#', 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(methodOptions3);
        org.junit.Assert.assertNotNull(codedInputStream6);
        org.junit.Assert.assertNotNull(variableMap7);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto0 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.getDefaultInstance();
        boolean boolean1 = serviceDescriptorProto0.hasOptions();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder2 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.newBuilder(serviceDescriptorProto0);
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto3 = builder2.buildPartial();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.Message.Builder builder5 = builder2.newBuilderForField(fieldDescriptor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceDescriptorProto0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(serviceDescriptorProto3);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output2 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream4 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output2, (int) 'a');
        byte[] byteArray5 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions7 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray5, extensionRegistryLite6);
        output2.write(byteArray5);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder9 = builder0.mergeFrom(byteArray5);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = builder9.getRepeatedFieldCount(fieldDescriptor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(output2);
        org.junit.Assert.assertNotNull(codedOutputStream4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(methodOptions7);
        org.junit.Assert.assertNotNull(builder9);
    }
}
