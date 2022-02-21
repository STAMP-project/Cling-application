import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        java.net.URISyntaxException uRISyntaxException3 = new java.net.URISyntaxException("MethodDescriptorProto", "goog.global", 15);
        java.util.Optional<java.net.URISyntaxException> uRISyntaxExceptionOptional4 = java.util.Optional.of(uRISyntaxException3);
        java.net.URISyntaxException uRISyntaxException5 = uRISyntaxExceptionOptional4.get();
        org.junit.Assert.assertNotNull(uRISyntaxExceptionOptional4);
        org.junit.Assert.assertNotNull(uRISyntaxException5);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean4 = node3.isVar();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean9 = node8.isStringKey();
        boolean boolean10 = node8.isThrow();
        boolean boolean11 = node8.isVarArgs();
        boolean boolean12 = node8.isHook();
        com.google.javascript.rhino.Node node13 = node8.cloneNode();
        com.google.javascript.rhino.Node node14 = node3.useSourceInfoIfMissingFromForTree(node13);
        boolean boolean15 = node14.isAdd();
        java.lang.Object obj17 = node14.getProp(36);
        boolean boolean18 = node14.isEmpty();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        float float2 = charsetDecoder1.maxCharsPerByte();
        float float3 = charsetDecoder1.averageCharsPerByte();
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_MESSAGE = diagnosticGroup0;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.optimizeCalls = false;
        compilerOptions3.preferLineBreakAtEndOfFile = false;
        boolean boolean8 = compilerOptions3.markNoSideEffectCalls;
        boolean boolean9 = compilerOptions3.labelRenaming;
        com.google.javascript.jscomp.DependencyOptions dependencyOptions10 = new com.google.javascript.jscomp.DependencyOptions();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        boolean boolean17 = strSet15.isEmpty();
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate(100);
        boolean boolean20 = strSet15.equals((java.lang.Object) byteBuffer19);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        boolean boolean27 = strSet25.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream28 = strSet25.stream();
        boolean boolean29 = strSet15.retainAll((java.util.Collection<java.lang.String>) strSet25);
        com.google.javascript.jscomp.DependencyOptions dependencyOptions30 = dependencyOptions10.setEntryPoints((java.util.Collection<java.lang.String>) strSet15);
        compilerOptions3.setDependencyOptions(dependencyOptions10);
        com.google.javascript.jscomp.CheckLevel checkLevel32 = compilerOptions3.checkGlobalThisLevel;
        com.google.javascript.jscomp.DiagnosticType diagnosticType33 = com.google.javascript.jscomp.Compiler.MOTION_ITERATIONS_ERROR;
        java.lang.String[] strArray34 = null;
        com.google.javascript.jscomp.JSError jSError35 = com.google.javascript.jscomp.JSError.make("goog.abstractMethod", 37, (int) (byte) -1, checkLevel32, diagnosticType33, strArray34);
        int int36 = jSError35.getNodeLength();
        java.lang.String str37 = jSError35.description;
        java.lang.String str38 = jSError35.sourceName;
        int int39 = jSError35.getCharno();
        com.google.javascript.jscomp.CheckLevel checkLevel40 = jSError35.level;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dependencyOptions30);
        org.junit.Assert.assertTrue("'" + checkLevel32 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel32.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(diagnosticType33);
        org.junit.Assert.assertNotNull(jSError35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Exceeded max number of code motion iterations: {0}" + "'", str37, "Exceeded max number of code motion iterations: {0}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "goog.abstractMethod" + "'", str38, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + checkLevel40 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel40.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset4);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset4);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.minusDays((long) (short) 100);
        java.lang.String str9 = offsetDateTime6.toString();
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime6.minusMonths(0L);
        java.util.stream.LongStream longStream13 = java.util.stream.LongStream.of((long) (-1));
        java.util.stream.LongStream longStream14 = longStream13.distinct();
        java.util.stream.LongStream longStream16 = java.util.stream.LongStream.of((long) (-1));
        java.util.stream.LongStream longStream17 = java.util.stream.LongStream.concat(longStream14, longStream16);
        boolean boolean18 = offsetDateTime11.equals((java.lang.Object) longStream17);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T00:00:52+00:00:52" + "'", str9, "1970-01-01T00:00:52+00:00:52");
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(longStream16);
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        java.util.LongSummaryStatistics longSummaryStatistics0 = new java.util.LongSummaryStatistics();
        long long1 = longSummaryStatistics0.getCount();
        org.junit.Assert.assertEquals(longSummaryStatistics0.toString(), "LongSummaryStatistics{count=0, sum=0, min=9223372036854775807, average=0.000000, max=-9223372036854775808}");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        compilerOptions0.setCheckCaja(false);
        java.util.Set<java.lang.String> strSet15 = compilerOptions0.stripNameSuffixes;
        java.util.stream.Stream<java.lang.String> strStream16 = strSet15.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream17 = strStream16.sequential();
        java.util.stream.Stream<java.lang.String> strStream18 = strStream16.distinct();
        java.util.stream.Stream<java.lang.String> strStream19 = strStream18.sorted();
        org.junit.Assert.assertNotNull(errorFormat3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strStream16);
        org.junit.Assert.assertNotNull(strStream17);
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertNotNull(strStream19);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        com.google.protobuf.UnknownFieldSet unknownFieldSet12 = builder7.getUnknownFields();
        com.google.protobuf.CodedOutputStream codedOutputStream13 = null;
        unknownFieldSet12.writeTo(codedOutputStream13);
        byte[] byteArray15 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite16 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions17 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray15, extensionRegistryLite16);
        com.google.protobuf.CodedOutputStream codedOutputStream20 = com.google.protobuf.CodedOutputStream.newInstance(byteArray15, (int) (short) 0, 1);
        com.google.protobuf.CodedOutputStream codedOutputStream23 = com.google.protobuf.CodedOutputStream.newInstance(byteArray15, (int) ' ', 0);
        java.io.InputStream inputStream24 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location location25 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.parseFrom(inputStream24);
        boolean boolean26 = location25.isInitialized();
        codedOutputStream23.writeGroupNoTag((com.google.protobuf.MessageLite) location25);
        unknownFieldSet12.writeAsMessageSetTo(codedOutputStream23);
        byte[] byteArray29 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite30 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions31 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray29, extensionRegistryLite30);
        com.google.protobuf.CodedOutputStream codedOutputStream34 = com.google.protobuf.CodedOutputStream.newInstance(byteArray29, (int) (short) 0, 1);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite35 = null;
        com.google.protobuf.DescriptorProtos.FileDescriptorProto fileDescriptorProto36 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(byteArray29, extensionRegistryLite35);
        com.google.protobuf.CodedOutputStream codedOutputStream37 = com.google.protobuf.CodedOutputStream.newInstance(byteArray29);
        unknownFieldSet12.writeAsMessageSetTo(codedOutputStream37);
        boolean boolean39 = unknownFieldSet12.isInitialized();
        java.io.File file42 = null;
        java.io.File file43 = java.io.File.createTempFile("hi!", "ISO", file42);
        boolean boolean46 = file43.setWritable(false, false);
        java.net.URI uRI47 = file43.toURI();
        java.io.PrintStream printStream48 = new java.io.PrintStream(file43);
        printStream48.print((int) (byte) 0);
        printStream48.print(10.0d);
        printStream48.print((int) 'a');
        unknownFieldSet12.writeDelimitedTo((java.io.OutputStream) printStream48);
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
        org.junit.Assert.assertNotNull(unknownFieldSet12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(methodOptions17);
        org.junit.Assert.assertNotNull(codedOutputStream20);
        org.junit.Assert.assertNotNull(codedOutputStream23);
        org.junit.Assert.assertNotNull(location25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(methodOptions31);
        org.junit.Assert.assertNotNull(codedOutputStream34);
        org.junit.Assert.assertNotNull(fileDescriptorProto36);
        org.junit.Assert.assertNotNull(codedOutputStream37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(file43);
        org.junit.Assert.assertEquals(file43.getParent(), "/tmp");
        org.junit.Assert.assertEquals(file43.toString(), "/tmp/hi!430128248528236152ISO");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(uRI47);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        int int5 = localDateTime4.getYear();
        java.time.LocalDate localDate6 = localDateTime4.toLocalDate();
        java.time.LocalDate localDate8 = localDate6.plusDays((long) '#');
        java.time.LocalDate localDate10 = localDate8.plusWeeks((long) 52);
        long long11 = localDate10.toEpochDay();
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 399L + "'", long11 == 399L);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.util.Set<java.lang.String> strSet1 = strMap0.keySet();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.parallelStream();
        java.util.Iterator<java.lang.String> strItor3 = strStream2.iterator();
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strStream2);
        org.junit.Assert.assertNotNull(strItor3);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto0 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.getDefaultInstance();
        boolean boolean1 = methodDescriptorProto0.hasOutputType();
        com.google.protobuf.CodedOutputStream codedOutputStream2 = null;
        methodDescriptorProto0.writeTo(codedOutputStream2);
        boolean boolean4 = methodDescriptorProto0.hasOutputType();
        boolean boolean5 = methodDescriptorProto0.hasOutputType();
        boolean boolean6 = methodDescriptorProto0.hasOptions();
        org.junit.Assert.assertNotNull(methodDescriptorProto0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.security.InvalidKeyException invalidKeyException1 = new java.security.InvalidKeyException("DiagnosticGroup<undefinedNames>");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.nio.file.attribute.FileTime fileTime1 = java.nio.file.attribute.FileTime.from(instant0);
        java.time.Instant instant2 = java.time.Instant.EPOCH;
        java.nio.file.attribute.FileTime fileTime3 = java.nio.file.attribute.FileTime.from(instant2);
        java.util.concurrent.TimeUnit timeUnit4 = java.util.concurrent.TimeUnit.NANOSECONDS;
        long long5 = fileTime3.to(timeUnit4);
        int int6 = fileTime1.compareTo(fileTime3);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(fileTime1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(fileTime3);
        org.junit.Assert.assertNotNull(timeUnit4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        boolean boolean6 = strSet4.isEmpty();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(100);
        boolean boolean9 = strSet4.equals((java.lang.Object) byteBuffer8);
        java.nio.IntBuffer intBuffer10 = byteBuffer8.asIntBuffer();
        java.nio.IntBuffer intBuffer11 = intBuffer10.duplicate();
        java.nio.IntBuffer intBuffer12 = intBuffer11.duplicate();
        java.nio.IntBuffer intBuffer13 = intBuffer12.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intBuffer13.get(97);
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
        org.junit.Assert.assertNotNull(intBuffer11);
        org.junit.Assert.assertNotNull(intBuffer12);
        org.junit.Assert.assertNotNull(intBuffer13);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto1 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.parseFrom(inputStream0);
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder2 = enumValueDescriptorProto1.toBuilder();
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder4 = builder2.setName("ISO");
        com.google.protobuf.UnknownFieldSet unknownFieldSet5 = builder2.getUnknownFields();
        org.junit.Assert.assertNotNull(enumValueDescriptorProto1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(unknownFieldSet5);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean4 = node3.isTry();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean9 = node8.isStringKey();
        boolean boolean10 = node8.isThrow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = null;
        node8.setJSDocInfo(jSDocInfo11);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node8.getStaticSourceFile();
        boolean boolean14 = node8.isWhile();
        com.google.javascript.rhino.Node node15 = node3.clonePropsFrom(node8);
        int int16 = node15.getSourceOffset();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        com.google.protobuf.CodedInputStream codedInputStream8 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 0, (int) (short) 10);
        int int10 = codedInputStream8.setRecursionLimit((int) 'a');
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto11 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.getDefaultInstance();
        boolean boolean12 = serviceDescriptorProto11.hasOptions();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder13 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.newBuilder(serviceDescriptorProto11);
        byte[] byteArray14 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite15 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions16 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray14, extensionRegistryLite15);
        com.google.protobuf.CodedInputStream codedInputStream19 = com.google.protobuf.CodedInputStream.newInstance(byteArray14, 16, (int) 'a');
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder20 = builder13.mergeFrom(byteArray14);
        java.util.List<com.google.protobuf.DescriptorProtos.MethodDescriptorProto> methodDescriptorProtoList21 = builder20.getMethodList();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder22 = builder20.clearMethod();
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto23 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.getDefaultInstance();
        boolean boolean24 = methodDescriptorProto23.hasOutputType();
        com.google.protobuf.CodedOutputStream codedOutputStream25 = null;
        methodDescriptorProto23.writeTo(codedOutputStream25);
        boolean boolean27 = methodDescriptorProto23.hasOutputType();
        boolean boolean28 = methodDescriptorProto23.hasOutputType();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder29 = builder22.addMethod(methodDescriptorProto23);
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder30 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder32 = builder30.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder33 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label34 = builder33.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder35 = builder30.addExtension(builder33);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder36 = builder30.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder37 = builder36.getOptionsBuilder();
        java.io.InputStream inputStream38 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions39 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream38);
        boolean boolean40 = enumOptions39.isInitialized();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder41 = builder37.mergeFrom(enumOptions39);
        com.google.protobuf.UnknownFieldSet unknownFieldSet42 = builder37.getUnknownFields();
        byte[] byteArray43 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite44 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions45 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray43, extensionRegistryLite44);
        com.google.protobuf.CodedOutputStream codedOutputStream48 = com.google.protobuf.CodedOutputStream.newInstance(byteArray43, (int) (short) 0, 1);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite49 = null;
        com.google.protobuf.DescriptorProtos.FileDescriptorProto fileDescriptorProto50 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(byteArray43, extensionRegistryLite49);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite51 = null;
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto52 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.parseFrom(byteArray43, extensionRegistryLite51);
        com.google.protobuf.UnknownFieldSet unknownFieldSet53 = com.google.protobuf.UnknownFieldSet.parseFrom(byteArray43);
        com.google.protobuf.ByteString byteString54 = unknownFieldSet53.toByteString();
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite55 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder56 = builder37.mergeFrom(byteString54, extensionRegistryLite55);
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder57 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder58 = builder57.clearCcGenericServices();
        boolean boolean59 = builder57.isInitialized();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder61 = builder57.setCcGenericServices(true);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder62 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label63 = builder62.getLabel();
        com.google.protobuf.ByteString byteString64 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder65 = builder62.mergeFrom(byteString64);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite66 = null;
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder67 = builder61.mergeFrom(byteString64, extensionRegistryLite66);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite68 = null;
        com.google.protobuf.DescriptorProtos.EnumValueOptions enumValueOptions69 = com.google.protobuf.DescriptorProtos.EnumValueOptions.parseFrom(byteString64, extensionRegistryLite68);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite70 = com.google.protobuf.ExtensionRegistryLite.newInstance();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto71 = com.google.protobuf.DescriptorProtos.DescriptorProto.parseFrom(byteString64, extensionRegistryLite70);
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder72 = builder29.mergeFrom(byteString54, extensionRegistryLite70);
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MethodOptions methodOptions73 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(codedInputStream8, extensionRegistryLite70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(methodOptions2);
        org.junit.Assert.assertNotNull(codedInputStream5);
        org.junit.Assert.assertNotNull(codedInputStream8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(serviceDescriptorProto11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(methodOptions16);
        org.junit.Assert.assertNotNull(codedInputStream19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(methodDescriptorProtoList21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(methodDescriptorProto23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + label34 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label34.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(enumOptions39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(unknownFieldSet42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertNotNull(methodOptions45);
        org.junit.Assert.assertNotNull(codedOutputStream48);
        org.junit.Assert.assertNotNull(fileDescriptorProto50);
        org.junit.Assert.assertNotNull(serviceDescriptorProto52);
        org.junit.Assert.assertNotNull(unknownFieldSet53);
        org.junit.Assert.assertNotNull(byteString54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertTrue("'" + label63 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label63.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(byteString64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(enumValueOptions69);
        org.junit.Assert.assertNotNull(extensionRegistryLite70);
        org.junit.Assert.assertNotNull(descriptorProto71);
        org.junit.Assert.assertNotNull(builder72);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLoopbackAddress();
        java.net.NetworkInterface networkInterface1 = java.net.NetworkInterface.getByInetAddress(inetAddress0);
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertNotNull(networkInterface1);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.google.protobuf.DescriptorProtos.FieldOptions fieldOptions0 = com.google.protobuf.DescriptorProtos.FieldOptions.getDefaultInstance();
        com.google.protobuf.DescriptorProtos.FieldOptions.Builder builder1 = fieldOptions0.toBuilder();
        org.junit.Assert.assertNotNull(fieldOptions0);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_MONTH;
        boolean boolean1 = chronoField0.isDateBased();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_MONTH + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_MONTH));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = jSTypeRegistry7.createObjectType(objectType8);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair10 = objectType4.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType9);
        boolean boolean11 = objectType9.isNullable();
        boolean boolean13 = objectType9.isPropertyTypeInferred("java.nio.HeapShortBuffer[pos=0 lim=1 cap=1]");
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(typePair10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.DescriptorProtos.FieldOptions fieldOptions1 = com.google.protobuf.DescriptorProtos.FieldOptions.parseFrom(inputStream0);
        boolean boolean2 = fieldOptions1.hasExperimentalMapKey();
        com.google.protobuf.DescriptorProtos.FieldOptions.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldOptions.newBuilder(fieldOptions1);
        com.google.javascript.jscomp.FunctionInformationMap.Module.Builder builder4 = com.google.javascript.jscomp.FunctionInformationMap.Module.newBuilder();
        java.lang.String str5 = builder4.getCompiledSource();
        boolean boolean6 = builder4.hasName();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder7 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder9 = builder7.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder10 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label11 = builder10.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder12 = builder7.addExtension(builder10);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder13 = builder7.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder14 = builder13.getOptionsBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder15 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder17 = builder15.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder18 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label19 = builder18.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder20 = builder15.addExtension(builder18);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder21 = builder15.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder22 = builder21.getOptionsBuilder();
        java.io.InputStream inputStream23 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions24 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream23);
        boolean boolean25 = enumOptions24.isInitialized();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder26 = builder22.mergeFrom(enumOptions24);
        com.google.protobuf.UnknownFieldSet unknownFieldSet27 = builder22.getUnknownFields();
        com.google.protobuf.CodedOutputStream codedOutputStream28 = null;
        unknownFieldSet27.writeTo(codedOutputStream28);
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder30 = builder14.setUnknownFields(unknownFieldSet27);
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto31 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.getDefaultInstance();
        boolean boolean32 = methodDescriptorProto31.hasOutputType();
        byte[] byteArray33 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite34 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions35 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray33, extensionRegistryLite34);
        com.google.protobuf.CodedOutputStream codedOutputStream38 = com.google.protobuf.CodedOutputStream.newInstance(byteArray33, (int) (short) 0, 1);
        methodDescriptorProto31.writeTo(codedOutputStream38);
        unknownFieldSet27.writeTo(codedOutputStream38);
        com.google.javascript.jscomp.FunctionInformationMap.Module.Builder builder41 = builder4.setUnknownFields(unknownFieldSet27);
        boolean boolean43 = unknownFieldSet27.hasField(4096);
        com.google.protobuf.DescriptorProtos.FieldOptions.Builder builder44 = builder3.mergeUnknownFields(unknownFieldSet27);
        com.google.protobuf.DescriptorProtos.FieldOptions.Builder builder45 = builder3.clear();
        com.google.protobuf.DescriptorProtos.FieldOptions.Builder builder46 = builder45.clearExperimentalMapKey();
        org.junit.Assert.assertNotNull(fieldOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + label11 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label11.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + label19 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label19.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(enumOptions24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(unknownFieldSet27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(methodDescriptorProto31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(methodOptions35);
        org.junit.Assert.assertNotNull(codedOutputStream38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy5 = null;
        compilerOptions0.variableRenaming = variableRenamingPolicy5;
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode7 = compilerOptions0.getTracerMode();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder8 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder10 = builder8.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder11 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label12 = builder11.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder13 = builder8.addExtension(builder11);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder14 = builder8.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder15 = builder14.getOptionsBuilder();
        java.io.InputStream inputStream16 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions17 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream16);
        boolean boolean18 = enumOptions17.isInitialized();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder19 = builder15.mergeFrom(enumOptions17);
        byte[] byteArray20 = enumOptions17.toByteArray();
        compilerOptions0.setInputPropertyMapSerialized(byteArray20);
        java.lang.String str22 = compilerOptions0.inputDelimiter;
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat26 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions23.errorFormat = errorFormat26;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy28 = null;
        compilerOptions23.variableRenaming = variableRenamingPolicy28;
        compilerOptions23.setSpecializeInitialModule(true);
        compilerOptions23.setAliasKeywords(true);
        boolean boolean34 = compilerOptions23.isRemoveUnusedClassProperties();
        com.google.javascript.jscomp.CheckLevel checkLevel35 = compilerOptions23.checkGlobalNamesLevel;
        compilerOptions0.setCheckGlobalThisLevel(checkLevel35);
        org.junit.Assert.assertNotNull(errorFormat3);
        org.junit.Assert.assertTrue("'" + tracerMode7 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode7.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + label12 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label12.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(enumOptions17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "// Input %num%" + "'", str22, "// Input %num%");
        org.junit.Assert.assertNotNull(errorFormat26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + checkLevel35 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel35.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        com.google.protobuf.UnknownFieldSet unknownFieldSet0 = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        org.junit.Assert.assertNotNull(unknownFieldSet0);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output2 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream4 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output2, (int) 'a');
        byte[] byteArray5 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions7 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray5, extensionRegistryLite6);
        output2.write(byteArray5);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder9 = builder0.mergeFrom(byteArray5);
        boolean boolean10 = builder9.isInitialized();
        com.google.protobuf.DescriptorProtos.FileOptions fileOptions11 = com.google.protobuf.DescriptorProtos.FileOptions.getDefaultInstance();
        java.util.List<com.google.protobuf.DescriptorProtos.UninterpretedOption> uninterpretedOptionList12 = fileOptions11.getUninterpretedOptionList();
        com.google.protobuf.DescriptorProtos.FileOptions fileOptions13 = fileOptions11.getDefaultInstanceForType();
        com.google.protobuf.ByteString byteString14 = fileOptions13.toByteString();
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder15 = builder9.mergeFrom(byteString14);
        int int16 = builder15.getUninterpretedOptionCount();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(output2);
        org.junit.Assert.assertNotNull(codedOutputStream4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(methodOptions7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(fileOptions11);
        org.junit.Assert.assertNotNull(uninterpretedOptionList12);
        org.junit.Assert.assertNotNull(fileOptions13);
        org.junit.Assert.assertNotNull(byteString14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean4 = node3.isFromExterns();
        java.util.Set<java.lang.String> strSet5 = node3.getDirectives();
        java.lang.String str9 = node3.toString(true, false, true);
        node3.addSuppression("{926447896}");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "NUMBER 52.0 0" + "'", str9, "NUMBER 52.0 0");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        int int5 = localDateTime4.getYear();
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset9);
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset14);
        java.time.ZonedDateTime zonedDateTime16 = java.time.ZonedDateTime.of(localDateTime10, (java.time.ZoneId) zoneOffset14);
        boolean boolean17 = localDateTime4.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime10);
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder18 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder20 = builder18.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder21 = builder20.clearSourceCodeInfo();
        boolean boolean22 = builder20.hasOptions();
        boolean boolean23 = localDateTime4.equals((java.lang.Object) builder20);
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder24 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder26 = builder24.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder27 = builder26.clearSourceCodeInfo();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder28 = builder27.clearService();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo29 = builder27.getSourceCodeInfo();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder30 = builder20.mergeSourceCodeInfo(sourceCodeInfo29);
        java.io.InputStream inputStream31 = null;
        java.io.InputStream inputStream32 = null;
        byte[] byteArray33 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite34 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions35 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray33, extensionRegistryLite34);
        com.google.protobuf.DescriptorProtos.UninterpretedOption uninterpretedOption36 = com.google.protobuf.DescriptorProtos.UninterpretedOption.parseFrom(byteArray33);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder37 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label38 = builder37.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto39 = builder37.buildPartial();
        int int40 = fieldDescriptorProto39.getSerializedSize();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder41 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder(fieldDescriptorProto39);
        java.io.InputStream inputStream42 = null;
        java.io.InputStream inputStream43 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite44 = com.google.protobuf.ExtensionRegistryLite.newInstance();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location location45 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.parseFrom(inputStream43, extensionRegistryLite44);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder46 = builder41.mergeFrom(inputStream42, extensionRegistryLite44);
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap47 = com.google.javascript.jscomp.FunctionInformationMap.parseFrom(byteArray33, extensionRegistryLite44);
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto48 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.parseFrom(inputStream32, extensionRegistryLite44);
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder49 = builder20.mergeFrom(inputStream31, extensionRegistryLite44);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(sourceCodeInfo29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(methodOptions35);
        org.junit.Assert.assertNotNull(uninterpretedOption36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + label38 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label38.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(fieldDescriptorProto39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(extensionRegistryLite44);
        org.junit.Assert.assertNotNull(location45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(functionInformationMap47);
        org.junit.Assert.assertNotNull(serviceDescriptorProto48);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder1 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.newBuilder();
        byte[] byteArray2 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions4 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray2, extensionRegistryLite3);
        com.google.protobuf.CodedInputStream codedInputStream7 = com.google.protobuf.CodedInputStream.newInstance(byteArray2, 16, (int) 'a');
        com.google.protobuf.CodedInputStream codedInputStream10 = com.google.protobuf.CodedInputStream.newInstance(byteArray2, 0, (int) (short) 10);
        com.google.protobuf.MessageLite.Builder builder11 = builder1.mergeFrom(byteArray2);
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder12 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder14 = builder12.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder fileOptionsOrBuilder15 = builder14.getOptionsOrBuilder();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto16 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.getDefaultInstance();
        boolean boolean17 = serviceDescriptorProto16.hasOptions();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder18 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.newBuilder(serviceDescriptorProto16);
        byte[] byteArray19 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite20 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions21 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray19, extensionRegistryLite20);
        com.google.protobuf.CodedInputStream codedInputStream24 = com.google.protobuf.CodedInputStream.newInstance(byteArray19, 16, (int) 'a');
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder25 = builder18.mergeFrom(byteArray19);
        java.util.List<com.google.protobuf.DescriptorProtos.MethodDescriptorProto> methodDescriptorProtoList26 = builder25.getMethodList();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder27 = builder25.clearMethod();
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto28 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.getDefaultInstance();
        boolean boolean29 = methodDescriptorProto28.hasOutputType();
        com.google.protobuf.CodedOutputStream codedOutputStream30 = null;
        methodDescriptorProto28.writeTo(codedOutputStream30);
        boolean boolean32 = methodDescriptorProto28.hasOutputType();
        boolean boolean33 = methodDescriptorProto28.hasOutputType();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder34 = builder27.addMethod(methodDescriptorProto28);
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder35 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder36 = builder35.clearCcGenericServices();
        boolean boolean37 = builder35.isInitialized();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder39 = builder35.setCcGenericServices(true);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder40 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label41 = builder40.getLabel();
        com.google.protobuf.ByteString byteString42 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder43 = builder40.mergeFrom(byteString42);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite44 = null;
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder45 = builder39.mergeFrom(byteString42, extensionRegistryLite44);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite46 = null;
        com.google.protobuf.DescriptorProtos.EnumValueOptions enumValueOptions47 = com.google.protobuf.DescriptorProtos.EnumValueOptions.parseFrom(byteString42, extensionRegistryLite46);
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder48 = builder34.mergeFrom(byteString42);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder49 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output51 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream53 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output51, (int) 'a');
        byte[] byteArray54 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite55 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions56 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray54, extensionRegistryLite55);
        output51.write(byteArray54);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder58 = builder49.mergeFrom(byteArray54);
        java.util.List<com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder> builderList59 = builder58.getUninterpretedOptionBuilderList();
        java.util.List<com.google.protobuf.DescriptorProtos.UninterpretedOption> uninterpretedOptionList60 = builder58.getUninterpretedOptionList();
        java.io.InputStream inputStream61 = null;
        com.google.protobuf.DescriptorProtos.EnumValueOptions enumValueOptions62 = com.google.protobuf.DescriptorProtos.EnumValueOptions.getDefaultInstance();
        com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder builder63 = com.google.protobuf.DescriptorProtos.EnumValueOptions.newBuilder(enumValueOptions62);
        java.io.InputStream inputStream64 = null;
        com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder builder65 = builder63.mergeFrom(inputStream64);
        com.google.protobuf.ByteString byteString66 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto67 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.parseFrom(byteString66);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite68 = null;
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto69 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.parseFrom(byteString66, extensionRegistryLite68);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite70 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions71 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteString66, extensionRegistryLite70);
        java.io.InputStream inputStream72 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite73 = com.google.protobuf.ExtensionRegistryLite.newInstance();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location location74 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.parseFrom(inputStream72, extensionRegistryLite73);
        com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder builder75 = builder65.mergeFrom(byteString66, extensionRegistryLite73);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder76 = builder58.mergeFrom(inputStream61, extensionRegistryLite73);
        com.google.protobuf.Message.Builder builder77 = builder14.mergeFrom(byteString42, extensionRegistryLite73);
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder builder78 = builder0.mergeFrom(byteArray2, extensionRegistryLite73);
        com.google.protobuf.Descriptors.Descriptor descriptor79 = builder78.getDescriptorForType();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(methodOptions4);
        org.junit.Assert.assertNotNull(codedInputStream7);
        org.junit.Assert.assertNotNull(codedInputStream10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(fileOptionsOrBuilder15);
        org.junit.Assert.assertNotNull(serviceDescriptorProto16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(methodOptions21);
        org.junit.Assert.assertNotNull(codedInputStream24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(methodDescriptorProtoList26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(methodDescriptorProto28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + label41 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label41.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(byteString42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(enumValueOptions47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(output51);
        org.junit.Assert.assertNotNull(codedOutputStream53);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertNotNull(methodOptions56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builderList59);
        org.junit.Assert.assertNotNull(uninterpretedOptionList60);
        org.junit.Assert.assertNotNull(enumValueOptions62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(byteString66);
        org.junit.Assert.assertNotNull(methodDescriptorProto67);
        org.junit.Assert.assertNotNull(enumValueDescriptorProto69);
        org.junit.Assert.assertNotNull(methodOptions71);
        org.junit.Assert.assertNotNull(extensionRegistryLite73);
        org.junit.Assert.assertNotNull(location74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(descriptor79);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder1 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder3 = builder1.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder4 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label5 = builder4.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder6 = builder1.addExtension(builder4);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder7 = builder1.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder8 = builder7.getOptionsBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder9 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder11 = builder9.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder12 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label13 = builder12.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder14 = builder9.addExtension(builder12);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder15 = builder9.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder16 = builder15.getOptionsBuilder();
        java.io.InputStream inputStream17 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions18 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream17);
        boolean boolean19 = enumOptions18.isInitialized();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder20 = builder16.mergeFrom(enumOptions18);
        com.google.protobuf.UnknownFieldSet unknownFieldSet21 = builder16.getUnknownFields();
        com.google.protobuf.CodedOutputStream codedOutputStream22 = null;
        unknownFieldSet21.writeTo(codedOutputStream22);
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder24 = builder8.setUnknownFields(unknownFieldSet21);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder25 = builder0.mergeUnknownFields(unknownFieldSet21);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder26 = builder0.clone();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + label5 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label5.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + label13 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label13.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(enumOptions18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(unknownFieldSet21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.time.Instant instant0 = java.time.Instant.MIN;
        org.junit.Assert.assertNotNull(instant0);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        int[] intArray4 = new int[] { 16, ':', 43, (short) 100 };
        java.util.stream.IntStream intStream5 = java.util.stream.IntStream.of(intArray4);
        java.util.OptionalInt optionalInt6 = intStream5.findAny();
        java.util.stream.IntStream.Builder builder7 = java.util.stream.IntStream.builder();
        optionalInt6.ifPresent((java.util.function.IntConsumer) builder7);
        java.util.stream.IntStream.Builder builder10 = builder7.add(28);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[16, 58, 43, 100]");
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.nio.file.attribute.FileTime fileTime1 = java.nio.file.attribute.FileTime.from(instant0);
        java.time.Instant instant3 = instant0.plusNanos((long) 32);
        java.time.Period period4 = java.time.Period.ZERO;
        java.time.Period period6 = period4.plusMonths(0L);
        int int7 = period4.getMonths();
        java.time.Period period9 = period4.multipliedBy(6);
        java.time.temporal.Temporal temporal10 = instant0.plus((java.time.temporal.TemporalAmount) period4);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(fileTime1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(temporal10);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        java.io.InputStream inputStream2 = null;
        com.google.protobuf.MessageLite.Builder builder3 = builder0.mergeFrom(inputStream2);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type type4 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_BYTES;
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder5 = builder0.setType(type4);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder6 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label7 = builder6.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto8 = builder6.buildPartial();
        int int9 = fieldDescriptorProto8.getSerializedSize();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto10 = fieldDescriptorProto8.getDefaultInstanceForType();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder11 = builder5.mergeFrom(fieldDescriptorProto10);
        com.google.protobuf.Descriptors.Descriptor descriptor12 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto13 = descriptor12.toProto();
        boolean boolean14 = descriptorProto13.isInitialized();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions15 = descriptorProto13.getOptions();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions16 = descriptorProto13.getOptions();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions17 = descriptorProto13.getOptions();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto18 = descriptorProto13.getDefaultInstanceForType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder19 = builder11.mergeFrom((com.google.protobuf.Message) descriptorProto13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: mergeFrom(Message) can only merge messages of the same type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_BYTES + "'", type4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_BYTES));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + label7 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label7.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(fieldDescriptorProto8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fieldDescriptorProto10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(descriptor12);
        org.junit.Assert.assertNotNull(descriptorProto13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(messageOptions15);
        org.junit.Assert.assertNotNull(messageOptions16);
        org.junit.Assert.assertNotNull(messageOptions17);
        org.junit.Assert.assertNotNull(descriptorProto18);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange extensionRange2 = com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.parseFrom(inputStream0, extensionRegistryLite1);
        int int3 = extensionRange2.getEnd();
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions4 = com.google.protobuf.DescriptorProtos.MethodOptions.getDefaultInstance();
        com.google.protobuf.Descriptors.Descriptor descriptor5 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto6 = descriptor5.toProto();
        boolean boolean7 = descriptorProto6.isInitialized();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions8 = descriptorProto6.getOptions();
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder9 = messageOptions8.newBuilderForType();
        boolean boolean10 = messageOptions8.hasNoStandardDescriptorAccessor();
        byte[] byteArray11 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite12 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions13 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray11, extensionRegistryLite12);
        com.google.protobuf.CodedOutputStream codedOutputStream16 = com.google.protobuf.CodedOutputStream.newInstance(byteArray11, (int) (short) 0, 1);
        com.google.protobuf.CodedOutputStream codedOutputStream19 = com.google.protobuf.CodedOutputStream.newInstance(byteArray11, (int) ' ', 0);
        messageOptions8.writeTo(codedOutputStream19);
        methodOptions4.writeTo(codedOutputStream19);
        extensionRange2.writeTo(codedOutputStream19);
        // The following exception was thrown during execution in test generation
        try {
            codedOutputStream19.writeDouble(15, (double) 256);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.CodedOutputStream.OutOfSpaceException; message: CodedOutputStream was writing to a flat byte array and ran out of space.");
        } catch (com.google.protobuf.CodedOutputStream.OutOfSpaceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extensionRange2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(methodOptions4);
        org.junit.Assert.assertNotNull(descriptor5);
        org.junit.Assert.assertNotNull(descriptorProto6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(messageOptions8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(methodOptions13);
        org.junit.Assert.assertNotNull(codedOutputStream16);
        org.junit.Assert.assertNotNull(codedOutputStream19);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
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
        com.google.protobuf.UnknownFieldSet unknownFieldSet12 = builder7.getUnknownFields();
        byte[] byteArray13 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite14 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions15 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray13, extensionRegistryLite14);
        com.google.protobuf.CodedOutputStream codedOutputStream18 = com.google.protobuf.CodedOutputStream.newInstance(byteArray13, (int) (short) 0, 1);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite19 = null;
        com.google.protobuf.DescriptorProtos.FileDescriptorProto fileDescriptorProto20 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(byteArray13, extensionRegistryLite19);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite21 = null;
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto22 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.parseFrom(byteArray13, extensionRegistryLite21);
        com.google.protobuf.UnknownFieldSet unknownFieldSet23 = com.google.protobuf.UnknownFieldSet.parseFrom(byteArray13);
        com.google.protobuf.ByteString byteString24 = unknownFieldSet23.toByteString();
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite25 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder26 = builder7.mergeFrom(byteString24, extensionRegistryLite25);
        com.google.protobuf.DescriptorProtos.FieldOptions fieldOptions27 = com.google.protobuf.DescriptorProtos.FieldOptions.parseFrom(byteString24);
        com.google.protobuf.DescriptorProtos.FieldOptions.Builder builder28 = fieldOptions27.newBuilderForType();
        com.google.protobuf.DescriptorProtos.FieldOptions.Builder builder29 = builder28.clone();
        boolean boolean30 = builder28.hasExperimentalMapKey();
        com.google.protobuf.Descriptors.Descriptor descriptor32 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto33 = descriptor32.toProto();
        boolean boolean34 = descriptorProto33.isInitialized();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions35 = descriptorProto33.getOptions();
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder36 = messageOptions35.newBuilderForType();
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder38 = builder36.setMessageSetWireFormat(false);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder39 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output41 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream43 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output41, (int) 'a');
        byte[] byteArray44 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite45 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions46 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray44, extensionRegistryLite45);
        output41.write(byteArray44);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder48 = builder39.mergeFrom(byteArray44);
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions49 = builder39.buildPartial();
        com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder builder50 = builder39.addUninterpretedOptionBuilder();
        com.google.protobuf.DescriptorProtos.UninterpretedOption uninterpretedOption51 = builder50.buildPartial();
        java.lang.String str52 = uninterpretedOption51.getIdentifierValue();
        int int53 = uninterpretedOption51.getNameCount();
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder54 = builder38.addUninterpretedOption(uninterpretedOption51);
        com.google.protobuf.DescriptorProtos.UninterpretedOption uninterpretedOption55 = uninterpretedOption51.getDefaultInstanceForType();
        java.lang.String str56 = uninterpretedOption55.getAggregateValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldOptions.Builder builder57 = builder28.addUninterpretedOption((-1), uninterpretedOption55);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 0");
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
        org.junit.Assert.assertNotNull(unknownFieldSet12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(methodOptions15);
        org.junit.Assert.assertNotNull(codedOutputStream18);
        org.junit.Assert.assertNotNull(fileDescriptorProto20);
        org.junit.Assert.assertNotNull(serviceDescriptorProto22);
        org.junit.Assert.assertNotNull(unknownFieldSet23);
        org.junit.Assert.assertNotNull(byteString24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(fieldOptions27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(descriptor32);
        org.junit.Assert.assertNotNull(descriptorProto33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(messageOptions35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(output41);
        org.junit.Assert.assertNotNull(codedOutputStream43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertNotNull(methodOptions46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(methodOptions49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(uninterpretedOption51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(uninterpretedOption55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        boolean boolean6 = strSet4.isEmpty();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(100);
        boolean boolean9 = strSet4.equals((java.lang.Object) byteBuffer8);
        java.nio.IntBuffer intBuffer10 = byteBuffer8.asIntBuffer();
        double double11 = byteBuffer8.getDouble();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer8.asReadOnlyBuffer();
        boolean boolean13 = byteBuffer8.hasArray();
        short short14 = byteBuffer8.getShort();
        java.nio.DoubleBuffer doubleBuffer15 = byteBuffer8.asDoubleBuffer();
        java.nio.DoubleBuffer doubleBuffer16 = doubleBuffer15.slice();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intBuffer10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertNotNull(doubleBuffer15);
        org.junit.Assert.assertNotNull(doubleBuffer16);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy5 = null;
        compilerOptions0.variableRenaming = variableRenamingPolicy5;
        compilerOptions0.setSummaryDetailLevel(999);
        compilerOptions0.checkSuspiciousCode = true;
        byte[] byteArray11 = compilerOptions0.inputPropertyMapSerialized;
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder12 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label13 = builder12.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto14 = builder12.buildPartial();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder15 = builder12.clear();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder17 = builder15.setNumber((int) (short) 100);
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder18 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder20 = builder18.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder fileOptionsOrBuilder21 = builder20.getOptionsOrBuilder();
        byte[] byteArray22 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite23 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions24 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray22, extensionRegistryLite23);
        com.google.protobuf.CodedOutputStream codedOutputStream27 = com.google.protobuf.CodedOutputStream.newInstance(byteArray22, (int) (short) 0, 1);
        com.google.protobuf.CodedOutputStream codedOutputStream30 = com.google.protobuf.CodedOutputStream.newInstance(byteArray22, (int) ' ', 0);
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder31 = builder20.mergeFrom(byteArray22);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder32 = builder15.mergeFrom(byteArray22);
        com.google.protobuf.DescriptorProtos.ServiceOptions serviceOptions33 = com.google.protobuf.DescriptorProtos.ServiceOptions.parseFrom(byteArray22);
        compilerOptions0.setInputVariableMapSerialized(byteArray22);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy35 = compilerOptions0.variableRenaming;
        org.junit.Assert.assertNotNull(errorFormat3);
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + label13 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label13.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(fieldDescriptorProto14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(fileOptionsOrBuilder21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(methodOptions24);
        org.junit.Assert.assertNotNull(codedOutputStream27);
        org.junit.Assert.assertNotNull(codedOutputStream30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(serviceOptions33);
        org.junit.Assert.assertNull(variableRenamingPolicy35);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean4 = node3.isVar();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean9 = node8.isStringKey();
        boolean boolean10 = node8.isThrow();
        boolean boolean11 = node8.isVarArgs();
        boolean boolean12 = node8.isHook();
        com.google.javascript.rhino.Node node13 = node8.cloneNode();
        com.google.javascript.rhino.Node node14 = node3.useSourceInfoIfMissingFromForTree(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean19 = node18.isFromExterns();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean24 = node23.isFromExterns();
        java.lang.String str25 = node23.toString();
        com.google.javascript.rhino.Node node26 = node18.copyInformationFrom(node23);
        int int27 = node18.getLineno();
        boolean boolean28 = node18.isLabel();
        java.lang.String str29 = node18.getSourceFileName();
        boolean boolean30 = node18.isDec();
        com.google.javascript.rhino.Node node31 = node13.useSourceInfoFrom(node18);
        boolean boolean32 = node31.isParamList();
        com.google.javascript.rhino.Node node33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = node31.isEquivalentToTyped(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NUMBER 52.0 0" + "'", str25, "NUMBER 52.0 0");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset4);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset4);
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset10);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset15);
        java.time.ZonedDateTime zonedDateTime17 = java.time.ZonedDateTime.of(localDateTime11, (java.time.ZoneId) zoneOffset15);
        java.time.Clock clock18 = java.time.Clock.fixed(instant0, (java.time.ZoneId) zoneOffset15);
        java.time.LocalDateTime localDateTime19 = java.time.LocalDateTime.now(clock18);
        java.time.LocalDate localDate20 = java.time.LocalDate.now(clock18);
        com.google.protobuf.Descriptors.Descriptor descriptor21 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto22 = descriptor21.toProto();
        boolean boolean23 = descriptorProto22.isInitialized();
        java.util.List<com.google.protobuf.DescriptorProtos.DescriptorProto> descriptorProtoList24 = descriptorProto22.getNestedTypeList();
        int int25 = descriptorProto22.getExtensionRangeCount();
        boolean boolean26 = localDate20.equals((java.lang.Object) descriptorProto22);
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions27 = descriptorProto22.getOptions();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertNotNull(clock18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(descriptor21);
        org.junit.Assert.assertNotNull(descriptorProto22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(descriptorProtoList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(messageOptions27);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite> priorityMap0 = new java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>();
        java.lang.Object obj1 = priorityMap0.clone();
        boolean boolean2 = priorityMap0.isEmpty();
        java.lang.String str3 = priorityMap0.toString();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder4 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder5 = builder4.clearCcGenericServices();
        boolean boolean6 = builder4.isInitialized();
        com.google.protobuf.MessageLite messageLite7 = priorityMap0.get((java.lang.Object) builder4);
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder9 = builder4.setPyGenericServices(false);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder10 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label11 = builder10.getLabel();
        com.google.protobuf.ByteString byteString12 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder13 = builder10.mergeFrom(byteString12);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite14 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location location15 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.parseFrom(byteString12, extensionRegistryLite14);
        com.google.protobuf.MessageLite.Builder builder16 = builder4.mergeFrom(byteString12);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite17 = com.google.protobuf.ExtensionRegistryLite.newInstance();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap18 = com.google.javascript.jscomp.FunctionInformationMap.parseFrom(byteString12, extensionRegistryLite17);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder19 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output21 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream23 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output21, (int) 'a');
        byte[] byteArray24 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite25 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions26 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray24, extensionRegistryLite25);
        output21.write(byteArray24);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder28 = builder19.mergeFrom(byteArray24);
        boolean boolean29 = builder28.isInitialized();
        com.google.protobuf.DescriptorProtos.FileOptions fileOptions30 = com.google.protobuf.DescriptorProtos.FileOptions.getDefaultInstance();
        java.util.List<com.google.protobuf.DescriptorProtos.UninterpretedOption> uninterpretedOptionList31 = fileOptions30.getUninterpretedOptionList();
        com.google.protobuf.DescriptorProtos.FileOptions fileOptions32 = fileOptions30.getDefaultInstanceForType();
        com.google.protobuf.ByteString byteString33 = fileOptions32.toByteString();
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder34 = builder28.mergeFrom(byteString33);
        com.google.javascript.jscomp.FunctionInformationMap.Entry.Builder builder35 = com.google.javascript.jscomp.FunctionInformationMap.Entry.newBuilder();
        boolean boolean36 = builder35.hasSourceName();
        com.google.javascript.jscomp.FunctionInformationMap.Entry entry37 = builder35.getDefaultInstanceForType();
        com.google.javascript.jscomp.FunctionInformationMap.Entry.Builder builder39 = builder35.setLineNumber(7);
        java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite> priorityMap40 = new java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>();
        java.lang.Object obj41 = priorityMap40.clone();
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder42 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.newBuilder();
        boolean boolean43 = priorityMap40.containsValue((java.lang.Object) builder42);
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder45 = builder42.setName("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=12 cap=12]");
        com.google.protobuf.ByteString byteString46 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder47 = builder42.mergeFrom(byteString46);
        com.google.protobuf.ByteString byteString48 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite49 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions50 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(byteString48, extensionRegistryLite49);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder51 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label52 = builder51.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto53 = builder51.buildPartial();
        int int54 = fieldDescriptorProto53.getSerializedSize();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder55 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder(fieldDescriptorProto53);
        java.io.InputStream inputStream56 = null;
        java.io.InputStream inputStream57 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite58 = com.google.protobuf.ExtensionRegistryLite.newInstance();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location location59 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.parseFrom(inputStream57, extensionRegistryLite58);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder60 = builder55.mergeFrom(inputStream56, extensionRegistryLite58);
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap61 = com.google.javascript.jscomp.FunctionInformationMap.parseFrom(byteString48, extensionRegistryLite58);
        com.google.javascript.jscomp.FunctionInformationMap.Entry.Builder builder62 = builder39.mergeFrom(byteString46, extensionRegistryLite58);
        com.google.protobuf.DescriptorProtos.FileOptions fileOptions63 = com.google.protobuf.DescriptorProtos.FileOptions.parseFrom(byteString33, extensionRegistryLite58);
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto64 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.parseFrom(byteString12, extensionRegistryLite58);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{}" + "'", str3, "{}");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(messageLite7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + label11 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label11.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(byteString12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(location15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(extensionRegistryLite17);
        org.junit.Assert.assertNotNull(functionInformationMap18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(output21);
        org.junit.Assert.assertNotNull(codedOutputStream23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(methodOptions26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(fileOptions30);
        org.junit.Assert.assertNotNull(uninterpretedOptionList31);
        org.junit.Assert.assertNotNull(fileOptions32);
        org.junit.Assert.assertNotNull(byteString33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(entry37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "{}");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(byteString46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(byteString48);
        org.junit.Assert.assertNotNull(enumOptions50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + label52 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label52.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(fieldDescriptorProto53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(extensionRegistryLite58);
        org.junit.Assert.assertNotNull(location59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(functionInformationMap61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(fileOptions63);
        org.junit.Assert.assertNotNull(enumValueDescriptorProto64);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.time.format.TextStyle textStyle0 = java.time.format.TextStyle.NARROW;
        java.time.format.TextStyle textStyle1 = textStyle0.asNormal();
        java.time.format.TextStyle textStyle2 = textStyle1.asNormal();
        org.junit.Assert.assertTrue("'" + textStyle0 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle0.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle1 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle1.equals(java.time.format.TextStyle.NARROW));
        org.junit.Assert.assertTrue("'" + textStyle2 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle2.equals(java.time.format.TextStyle.NARROW));
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.time.LocalTime localTime0 = java.time.LocalTime.MIN;
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit2 = chronoField1.getBaseUnit();
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset6);
        java.time.ZoneOffset zoneOffset11 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset11);
        java.time.ZonedDateTime zonedDateTime13 = java.time.ZonedDateTime.of(localDateTime7, (java.time.ZoneId) zoneOffset11);
        java.time.ZonedDateTime zonedDateTime15 = zonedDateTime13.withYear((int) (short) 1);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset19);
        int int21 = localDateTime20.getYear();
        java.time.LocalDate localDate22 = localDateTime20.toLocalDate();
        java.time.ZoneOffset zoneOffset26 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime27 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset26);
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime32 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset31);
        java.time.ZonedDateTime zonedDateTime33 = java.time.ZonedDateTime.of(localDateTime27, (java.time.ZoneId) zoneOffset31);
        java.time.temporal.ChronoField chronoField35 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit36 = chronoField35.getBaseUnit();
        java.time.LocalDateTime localDateTime37 = localDateTime27.plus((long) 1970, temporalUnit36);
        java.time.LocalTime localTime38 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime37);
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime43 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset42);
        java.time.OffsetDateTime offsetDateTime44 = java.time.OffsetDateTime.of(localDate22, localTime38, zoneOffset42);
        java.time.ZonedDateTime zonedDateTime45 = zonedDateTime13.withZoneSameInstant((java.time.ZoneId) zoneOffset42);
        boolean boolean46 = temporalUnit2.isSupportedBy((java.time.temporal.Temporal) zonedDateTime13);
        java.time.LocalTime localTime47 = zonedDateTime13.toLocalTime();
        int int48 = localTime47.toSecondOfDay();
        java.time.Period period49 = java.time.Period.ZERO;
        java.time.chrono.ChronoPeriod chronoPeriod50 = period49.normalized();
        java.time.chrono.ChronoPeriod chronoPeriod51 = chronoPeriod50.normalized();
        java.time.LocalTime localTime52 = localTime47.minus((java.time.temporal.TemporalAmount) chronoPeriod51);
        int int53 = localTime0.compareTo(localTime52);
        java.time.Instant instant54 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset58 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime59 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset58);
        java.time.OffsetDateTime offsetDateTime60 = java.time.OffsetDateTime.ofInstant(instant54, (java.time.ZoneId) zoneOffset58);
        boolean boolean61 = localTime52.equals((java.lang.Object) instant54);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField1.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit2 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit2.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(zoneOffset26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(zonedDateTime33);
        org.junit.Assert.assertTrue("'" + chronoField35 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField35.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit36 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit36.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(offsetDateTime44);
        org.junit.Assert.assertNotNull(zonedDateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 152 + "'", int48 == 152);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(chronoPeriod50);
        org.junit.Assert.assertNotNull(chronoPeriod51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(instant54);
        org.junit.Assert.assertNotNull(zoneOffset58);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(offsetDateTime60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        int int0 = com.google.javascript.rhino.Node.LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 52 + "'", int0 == 52);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_MESSAGE = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup0;
        java.lang.Iterable<com.google.javascript.jscomp.DiagnosticType> diagnosticTypeIterable3 = diagnosticGroup0.getTypes();
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_REGEXP = diagnosticGroup0;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
        org.junit.Assert.assertNotNull(diagnosticTypeIterable3);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean6 = node5.isStringKey();
        boolean boolean7 = node5.isThrow();
        boolean boolean8 = node5.isVarArgs();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean13 = node12.isFromExterns();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean18 = node17.isFromExterns();
        java.lang.String str19 = node17.toString();
        com.google.javascript.rhino.Node node20 = node12.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean25 = node24.isStringKey();
        boolean boolean26 = node24.isThrow();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean31 = node30.isStringKey();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node5, node17, node24, node30, 16384, 16);
        com.google.javascript.rhino.Node node35 = node30.getLastChild();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean40 = node39.isStringKey();
        boolean boolean41 = node39.isThrow();
        boolean boolean42 = node39.isVarArgs();
        boolean boolean43 = node39.isHook();
        boolean boolean44 = node39.isAssign();
        boolean boolean45 = node39.isVar();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder46 = node39.getJsDocBuilderForNode();
        node39.setSourceFileForTesting("NUMBER 52.0 0 (hi!)");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (short) 0, node35, node39, 36, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "NUMBER 52.0 0" + "'", str19, "NUMBER 52.0 0");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder46);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = null;
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto enumDescriptorProto4 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.parseFrom(byteArray0, extensionRegistryLite3);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder5 = enumDescriptorProto4.newBuilderForType();
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto enumDescriptorProto6 = builder5.build();
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder7 = builder5.clearName();
        java.io.InputStream inputStream8 = null;
        java.time.Instant instant9 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset13 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime14 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset13);
        java.time.OffsetDateTime offsetDateTime15 = java.time.OffsetDateTime.ofInstant(instant9, (java.time.ZoneId) zoneOffset13);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset19);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime25 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset24);
        java.time.ZonedDateTime zonedDateTime26 = java.time.ZonedDateTime.of(localDateTime20, (java.time.ZoneId) zoneOffset24);
        java.time.Clock clock27 = java.time.Clock.fixed(instant9, (java.time.ZoneId) zoneOffset24);
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.now(clock27);
        java.time.LocalDate localDate29 = java.time.LocalDate.now(clock27);
        com.google.protobuf.Descriptors.Descriptor descriptor30 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto31 = descriptor30.toProto();
        boolean boolean32 = descriptorProto31.isInitialized();
        java.util.List<com.google.protobuf.DescriptorProtos.DescriptorProto> descriptorProtoList33 = descriptorProto31.getNestedTypeList();
        int int34 = descriptorProto31.getExtensionRangeCount();
        boolean boolean35 = localDate29.equals((java.lang.Object) descriptorProto31);
        com.google.protobuf.DescriptorProtos.DescriptorProto.Builder builder36 = descriptorProto31.newBuilderForType();
        java.util.List<com.google.protobuf.DescriptorProtos.DescriptorProto> descriptorProtoList37 = builder36.getNestedTypeList();
        com.google.protobuf.UnknownFieldSet unknownFieldSet38 = builder36.getUnknownFields();
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder39 = builder36.addEnumTypeBuilder();
        com.google.protobuf.ByteString byteString40 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite41 = null;
        com.google.protobuf.DescriptorProtos.FileDescriptorProto fileDescriptorProto42 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(byteString40, extensionRegistryLite41);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder43 = builder39.mergeFrom(byteString40);
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder44 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder46 = builder44.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder47 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label48 = builder47.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder49 = builder44.addExtension(builder47);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder50 = builder44.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder51 = builder50.getOptionsBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions52 = builder51.getDefaultInstanceForType();
        com.google.protobuf.Descriptors.Descriptor descriptor53 = builder51.getDescriptorForType();
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder54 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output56 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream58 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output56, (int) 'a');
        byte[] byteArray59 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite60 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions61 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray59, extensionRegistryLite60);
        output56.write(byteArray59);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder63 = builder54.mergeFrom(byteArray59);
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions64 = builder54.buildPartial();
        com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder builder65 = builder54.addUninterpretedOptionBuilder();
        com.google.protobuf.DescriptorProtos.UninterpretedOption uninterpretedOption66 = builder65.buildPartial();
        java.lang.String str67 = uninterpretedOption66.getIdentifierValue();
        int int68 = uninterpretedOption66.getNameCount();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder69 = builder51.addUninterpretedOption(uninterpretedOption66);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder70 = builder39.setOptions(builder51);
        java.io.InputStream inputStream71 = null;
        com.google.protobuf.ByteString byteString72 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite73 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions74 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(byteString72, extensionRegistryLite73);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder75 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label76 = builder75.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto77 = builder75.buildPartial();
        int int78 = fieldDescriptorProto77.getSerializedSize();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder79 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder(fieldDescriptorProto77);
        java.io.InputStream inputStream80 = null;
        java.io.InputStream inputStream81 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite82 = com.google.protobuf.ExtensionRegistryLite.newInstance();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location location83 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.parseFrom(inputStream81, extensionRegistryLite82);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder84 = builder79.mergeFrom(inputStream80, extensionRegistryLite82);
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap85 = com.google.javascript.jscomp.FunctionInformationMap.parseFrom(byteString72, extensionRegistryLite82);
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder86 = builder51.mergeFrom(inputStream71, extensionRegistryLite82);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean87 = builder7.mergeDelimitedFrom(inputStream8, extensionRegistryLite82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(methodOptions2);
        org.junit.Assert.assertNotNull(enumDescriptorProto4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(enumDescriptorProto6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(zoneOffset13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(zonedDateTime26);
        org.junit.Assert.assertNotNull(clock27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(descriptor30);
        org.junit.Assert.assertNotNull(descriptorProto31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(descriptorProtoList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(descriptorProtoList37);
        org.junit.Assert.assertNotNull(unknownFieldSet38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(byteString40);
        org.junit.Assert.assertNotNull(fileDescriptorProto42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertTrue("'" + label48 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label48.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(enumOptions52);
        org.junit.Assert.assertNotNull(descriptor53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(output56);
        org.junit.Assert.assertNotNull(codedOutputStream58);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[]");
        org.junit.Assert.assertNotNull(methodOptions61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(methodOptions64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(uninterpretedOption66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(byteString72);
        org.junit.Assert.assertNotNull(enumOptions74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertTrue("'" + label76 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label76.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(fieldDescriptorProto77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(extensionRegistryLite82);
        org.junit.Assert.assertNotNull(location83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(functionInformationMap85);
        org.junit.Assert.assertNotNull(builder86);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        java.lang.String str1 = localDate0.toString();
        java.time.chrono.IsoChronology isoChronology2 = localDate0.getChronology();
        java.lang.String str3 = isoChronology2.getCalendarType();
        java.util.List<java.time.chrono.Era> eraList4 = isoChronology2.eras();
        java.lang.String str5 = isoChronology2.toString();
        java.lang.String str6 = isoChronology2.getId();
        java.time.Instant instant7 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset11 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset11);
        java.time.OffsetDateTime offsetDateTime13 = java.time.OffsetDateTime.ofInstant(instant7, (java.time.ZoneId) zoneOffset11);
        java.time.OffsetDateTime offsetDateTime15 = offsetDateTime13.minusDays((long) (short) 100);
        java.lang.String str16 = offsetDateTime13.toString();
        java.time.ZoneOffset zoneOffset17 = offsetDateTime13.getOffset();
        java.time.LocalTime localTime18 = offsetDateTime13.toLocalTime();
        java.time.Instant instant19 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset23);
        java.time.OffsetDateTime offsetDateTime25 = java.time.OffsetDateTime.ofInstant(instant19, (java.time.ZoneId) zoneOffset23);
        java.time.OffsetDateTime offsetDateTime27 = offsetDateTime25.minusDays((long) (short) 100);
        java.lang.String str28 = offsetDateTime25.toString();
        java.time.temporal.ChronoField chronoField29 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        int int30 = offsetDateTime25.get((java.time.temporal.TemporalField) chronoField29);
        long long31 = localTime18.getLong((java.time.temporal.TemporalField) chronoField29);
        java.time.temporal.ValueRange valueRange32 = isoChronology2.range(chronoField29);
        boolean boolean33 = valueRange32.isFixed();
        java.time.chrono.IsoChronology isoChronology35 = java.time.chrono.IsoChronology.INSTANCE;
        java.lang.String str36 = isoChronology35.getId();
        java.time.Month month37 = java.time.Month.APRIL;
        java.time.chrono.Chronology chronology38 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) month37);
        java.lang.String str39 = chronology38.toString();
        java.time.Instant instant40 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset44 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime45 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset44);
        java.time.OffsetDateTime offsetDateTime46 = java.time.OffsetDateTime.ofInstant(instant40, (java.time.ZoneId) zoneOffset44);
        java.time.ZoneOffset zoneOffset50 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime51 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset50);
        java.time.ZoneOffset zoneOffset55 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime56 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset55);
        java.time.ZonedDateTime zonedDateTime57 = java.time.ZonedDateTime.of(localDateTime51, (java.time.ZoneId) zoneOffset55);
        java.time.Clock clock58 = java.time.Clock.fixed(instant40, (java.time.ZoneId) zoneOffset55);
        java.time.chrono.ChronoLocalDate chronoLocalDate59 = chronology38.dateNow(clock58);
        java.time.chrono.ChronoLocalDate chronoLocalDate60 = isoChronology35.dateNow(clock58);
        java.time.Month month61 = java.time.Month.AUGUST;
        java.time.ZoneOffset zoneOffset65 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime66 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset65);
        java.time.ZoneOffset zoneOffset70 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime71 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset70);
        java.time.ZonedDateTime zonedDateTime72 = java.time.ZonedDateTime.of(localDateTime66, (java.time.ZoneId) zoneOffset70);
        java.time.temporal.ChronoField chronoField73 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean74 = localDateTime66.isSupported((java.time.temporal.TemporalField) chronoField73);
        boolean boolean75 = month61.isSupported((java.time.temporal.TemporalField) chronoField73);
        java.time.temporal.ValueRange valueRange76 = isoChronology35.range(chronoField73);
        // The following exception was thrown during execution in test generation
        try {
            long long77 = valueRange32.checkValidValue((long) 55, (java.time.temporal.TemporalField) chronoField73);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for ClockHourOfAmPm (valid values 1 - 12): 55");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2022-02-21" + "'", str1, "2022-02-21");
        org.junit.Assert.assertNotNull(isoChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iso8601" + "'", str3, "iso8601");
        org.junit.Assert.assertNotNull(eraList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISO" + "'", str5, "ISO");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISO" + "'", str6, "ISO");
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(offsetDateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01T00:00:52+00:00:52" + "'", str16, "1970-01-01T00:00:52+00:00:52");
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertNotNull(offsetDateTime27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01T00:00:52+00:00:52" + "'", str28, "1970-01-01T00:00:52+00:00:52");
        org.junit.Assert.assertTrue("'" + chronoField29 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField29.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12 + "'", int30 == 12);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 12L + "'", long31 == 12L);
        org.junit.Assert.assertNotNull(valueRange32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(isoChronology35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ISO" + "'", str36, "ISO");
        org.junit.Assert.assertTrue("'" + month37 + "' != '" + java.time.Month.APRIL + "'", month37.equals(java.time.Month.APRIL));
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ISO" + "'", str39, "ISO");
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertNotNull(zoneOffset44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(offsetDateTime46);
        org.junit.Assert.assertNotNull(zoneOffset50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(zoneOffset55);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(zonedDateTime57);
        org.junit.Assert.assertNotNull(clock58);
        org.junit.Assert.assertNotNull(chronoLocalDate59);
        org.junit.Assert.assertNotNull(chronoLocalDate60);
        org.junit.Assert.assertTrue("'" + month61 + "' != '" + java.time.Month.AUGUST + "'", month61.equals(java.time.Month.AUGUST));
        org.junit.Assert.assertNotNull(zoneOffset65);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(zoneOffset70);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(zonedDateTime72);
        org.junit.Assert.assertTrue("'" + chronoField73 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField73.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(valueRange76);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.NANOSECONDS;
        timeUnit0.sleep(365249999634L);
        long long4 = timeUnit0.toDays(6603384152749567654L);
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 76428L + "'", long4 == 76428L);
    }
}

