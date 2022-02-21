import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        java.io.InputStream inputStream2 = null;
        com.google.protobuf.MessageLite.Builder builder3 = builder0.mergeFrom(inputStream2);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type type4 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_BYTES;
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder5 = builder0.setType(type4);
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = builder5.mergeDelimitedFrom(inputStream6);
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
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "ISO", file2);
        boolean boolean6 = file3.setWritable(false, false);
        java.net.URI uRI7 = file3.toURI();
        java.io.PrintStream printStream8 = new java.io.PrintStream(file3);
        file3.deleteOnExit();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!7088804500102570671ISO");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(uRI7);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy5 = null;
        compilerOptions0.variableRenaming = variableRenamingPolicy5;
        compilerOptions0.setSummaryDetailLevel(999);
        compilerOptions0.optimizeReturns = true;
        org.junit.Assert.assertNotNull(errorFormat3);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        java.io.PrintStream printStream1 = new java.io.PrintStream("1970-01-01");
        java.io.FilterOutputStream filterOutputStream2 = new java.io.FilterOutputStream((java.io.OutputStream) printStream1);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter(writer0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumOptions enumOptions1 = com.google.protobuf.DescriptorProtos.EnumOptions.parseDelimitedFrom(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        java.io.InputStream inputStream21 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite22 = null;
        com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange extensionRange23 = com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.parseFrom(inputStream21, extensionRegistryLite22);
        int int24 = extensionRange23.getEnd();
        java.io.InputStream inputStream25 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite26 = null;
        com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange extensionRange27 = com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.parseFrom(inputStream25, extensionRegistryLite26);
        java.io.InputStream inputStream28 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite29 = null;
        com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange extensionRange30 = com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.parseFrom(inputStream28, extensionRegistryLite29);
        java.io.InputStream inputStream31 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite32 = null;
        com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange extensionRange33 = com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.parseFrom(inputStream31, extensionRegistryLite32);
        com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange[] extensionRangeArray34 = new com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange[] { extensionRange23, extensionRange27, extensionRange30, extensionRange33 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange[] extensionRangeArray35 = strSet5.toArray(extensionRangeArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(extensionRange23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(extensionRange27);
        org.junit.Assert.assertNotNull(extensionRange30);
        org.junit.Assert.assertNotNull(extensionRange33);
        org.junit.Assert.assertNotNull(extensionRangeArray34);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        int int0 = com.google.javascript.rhino.Node.SIDE_EFFECT_FLAGS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 42 + "'", int0 == 42);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumDescriptorProto enumDescriptorProto7 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.parseFrom(codedInputStream5, extensionRegistryLite6);
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
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.google.protobuf.ByteString byteString0 = com.google.protobuf.ByteString.EMPTY;
        byte[] byteArray1 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions3 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray1, extensionRegistryLite2);
        // The following exception was thrown during execution in test generation
        try {
            byteString0.copyTo(byteArray1, (-1), 64, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteString0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(methodOptions3);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.optimizeCalls = false;
        compilerOptions0.preferLineBreakAtEndOfFile = false;
        compilerOptions0.setProcessCommonJSModules(true);
        compilerOptions0.resetWarningsGuard();
        boolean boolean8 = compilerOptions0.lineBreak;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer3 = charBuffer1.put('a');
        char[] charArray5 = new char[] { '4' };
        java.nio.CharBuffer charBuffer6 = charBuffer3.get(charArray5);
        java.nio.CharBuffer charBuffer8 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer10 = charBuffer8.put('a');
        char[] charArray12 = new char[] { '4' };
        java.nio.CharBuffer charBuffer13 = charBuffer10.get(charArray12);
        java.nio.CharBuffer charBuffer14 = charBuffer3.put(charArray12);
        java.nio.CharBuffer charBuffer15 = charBuffer3.slice();
        java.nio.CharBuffer charBuffer17 = charBuffer3.append('#');
        int int18 = charBuffer17.length();
        java.nio.CharBuffer charBuffer19 = charBuffer17.slice();
        char[] charArray24 = new char[] { '#', ' ', ':', ' ' };
        java.nio.CharBuffer charBuffer25 = java.nio.CharBuffer.wrap(charArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer28 = charBuffer19.put(charArray24, 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertNotNull(charBuffer8);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer13);
        org.junit.Assert.assertNotNull(charBuffer14);
        org.junit.Assert.assertNotNull(charBuffer15);
        org.junit.Assert.assertNotNull(charBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 28 + "'", int18 == 28);
        org.junit.Assert.assertNotNull(charBuffer19);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "# : ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "# : ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#,  , :,  ]");
        org.junit.Assert.assertNotNull(charBuffer25);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        int int0 = com.google.javascript.rhino.Node.OPT_ARG_NAME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 37 + "'", int0 == 37);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location location1 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.parseFrom(inputStream0);
        boolean boolean2 = location1.isInitialized();
        boolean boolean3 = location1.isInitialized();
        org.junit.Assert.assertNotNull(location1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.ServiceOptions.Builder.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        java.nio.CharBuffer charBuffer24 = java.nio.CharBuffer.wrap((java.lang.CharSequence) charBuffer1);
        java.nio.CharBuffer charBuffer26 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer28 = charBuffer26.put('a');
        char[] charArray30 = new char[] { '4' };
        java.nio.CharBuffer charBuffer31 = charBuffer28.get(charArray30);
        java.nio.CharBuffer charBuffer33 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer35 = charBuffer33.put('a');
        char[] charArray37 = new char[] { '4' };
        java.nio.CharBuffer charBuffer38 = charBuffer35.get(charArray37);
        java.nio.CharBuffer charBuffer39 = charBuffer28.put(charArray37);
        java.nio.CharBuffer charBuffer40 = charBuffer28.slice();
        char[] charArray45 = new char[] { '#', ' ', ':', ' ' };
        java.nio.CharBuffer charBuffer46 = java.nio.CharBuffer.wrap(charArray45);
        java.nio.CharBuffer charBuffer47 = charBuffer40.get(charArray45);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer50 = charBuffer24.get(charArray45, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(charBuffer24);
        org.junit.Assert.assertNotNull(charBuffer26);
        org.junit.Assert.assertNotNull(charBuffer28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer31);
        org.junit.Assert.assertNotNull(charBuffer33);
        org.junit.Assert.assertNotNull(charBuffer35);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer38);
        org.junit.Assert.assertNotNull(charBuffer39);
        org.junit.Assert.assertNotNull(charBuffer40);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charBuffer46);
        org.junit.Assert.assertNotNull(charBuffer47);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileDescriptorProto fileDescriptorProto2 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseDelimitedFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer8.putShort(171, (short) 10);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location location1 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.parseFrom(inputStream0);
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location location2 = location1.getDefaultInstanceForType();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = location2.getPath(4096);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4096");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(location1);
        org.junit.Assert.assertNotNull(location2);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
            long long14 = byteBuffer12.getLong(171);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(byteBuffer12);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder3 = builder2.clearSourceCodeInfo();
        boolean boolean4 = builder2.hasOptions();
        int int5 = builder2.getMessageTypeCount();
        com.google.protobuf.DescriptorProtos.FileOptions fileOptions6 = builder2.getOptions();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fileOptions6);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        char[] charArray4 = new char[] { '#', ' ', ':', ' ' };
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer8 = java.nio.CharBuffer.wrap(charArray4, 256, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "# : ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "# : ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#,  , :,  ]");
        org.junit.Assert.assertNotNull(charBuffer5);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean4 = node3.isVar();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean13 = node12.isStringKey();
        boolean boolean14 = node12.isThrow();
        boolean boolean15 = node12.isVarArgs();
        node12.setCharno(32);
        // The following exception was thrown during execution in test generation
        try {
            node3.addChildBefore(node8, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy5 = null;
        compilerOptions0.variableRenaming = variableRenamingPolicy5;
        compilerOptions0.setSummaryDetailLevel(999);
        compilerOptions0.setRemoveClosureAsserts(false);
        compilerOptions0.setReserveRawExports(false);
        org.junit.Assert.assertNotNull(errorFormat3);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.time.ZoneId zoneId0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime1 = java.time.OffsetTime.now(zoneId0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: zone");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder3 = builder2.clearSourceCodeInfo();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder4 = builder2.getSourceCodeInfoBuilder();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo5 = builder4.getDefaultInstanceForType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location location7 = sourceCodeInfo5.getLocation(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(sourceCodeInfo5);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap.Module module1 = com.google.javascript.jscomp.FunctionInformationMap.Module.parseFrom(inputStream0);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: Message missing required fields: name, compiled_source");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            byte byte6 = codedInputStream5.readRawByte();
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
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.text.MessageFormat messageFormat1 = new java.text.MessageFormat("hi!");
        java.util.Locale locale2 = messageFormat1.getLocale();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean7 = node6.isFromExterns();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean12 = node11.isFromExterns();
        java.lang.String str13 = node11.toString();
        com.google.javascript.rhino.Node node14 = node6.copyInformationFrom(node11);
        int int15 = node6.getLineno();
        boolean boolean16 = node6.isGetElem();
        java.lang.StringBuffer stringBuffer17 = null;
        java.text.Format.Field field18 = null;
        java.text.FieldPosition fieldPosition20 = new java.text.FieldPosition(field18, (int) (byte) 1);
        int int21 = fieldPosition20.getField();
        int int22 = fieldPosition20.getBeginIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = messageFormat1.format((java.lang.Object) boolean16, stringBuffer17, fieldPosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to [Ljava.lang.Object;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "NUMBER 52.0 0" + "'", str13, "NUMBER 52.0 0");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.google.protobuf.Descriptors.FieldDescriptor.JavaType javaType0 = com.google.protobuf.Descriptors.FieldDescriptor.JavaType.BYTE_STRING;
        org.junit.Assert.assertTrue("'" + javaType0 + "' != '" + com.google.protobuf.Descriptors.FieldDescriptor.JavaType.BYTE_STRING + "'", javaType0.equals(com.google.protobuf.Descriptors.FieldDescriptor.JavaType.BYTE_STRING));
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        java.io.InputStream inputStream1 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2 = null;
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = builder0.mergeFrom(inputStream1, extensionRegistryLite2);
        java.lang.String str4 = builder3.getName();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.google.javascript.jscomp.FunctionInformationMap.Module.Builder builder0 = com.google.javascript.jscomp.FunctionInformationMap.Module.newBuilder();
        boolean boolean1 = builder0.hasName();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = builder0.getRepeatedFieldCount(fieldDescriptor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
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
        compilerOptions0.setExtraAnnotationNames((java.util.Set<java.lang.String>) strSet15);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        compilerOptions0.setDefineReplacements(strMap21);
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
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHoursMinutes((int) (byte) 1, 16384);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset minutes not in valid range: value 16384 is not in the range -59 to 59");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.util.function.IntUnaryOperator intUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream2 = java.util.stream.IntStream.iterate((int) (byte) -1, intUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.net.URISyntaxException uRISyntaxException3 = new java.net.URISyntaxException("hi!", "");
        boolean boolean4 = strMap0.containsKey((java.lang.Object) "");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap5 = java.nio.charset.Charset.availableCharsets();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean10 = strMap5.containsValue((java.lang.Object) '4');
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap11 = java.nio.charset.Charset.availableCharsets();
        java.net.URISyntaxException uRISyntaxException14 = new java.net.URISyntaxException("hi!", "");
        boolean boolean15 = strMap11.containsKey((java.lang.Object) "");
        int int16 = strMap11.size();
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap17 = java.nio.charset.Charset.availableCharsets();
        java.util.Set<java.lang.String> strSet18 = strMap17.keySet();
        java.util.Set<java.lang.String> strSet19 = strMap17.keySet();
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap20 = java.nio.charset.Charset.availableCharsets();
        java.net.URISyntaxException uRISyntaxException23 = new java.net.URISyntaxException("hi!", "");
        boolean boolean24 = strMap20.containsKey((java.lang.Object) "");
        int int25 = strMap20.size();
        com.google.common.collect.ImmutableList<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>> strMapList26 = com.google.common.collect.ImmutableList.of(strMap0, strMap5, strMap11, strMap17, strMap20);
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap27 = java.nio.charset.Charset.availableCharsets();
        // The following exception was thrown during execution in test generation
        try {
            strMap11.putAll((java.util.Map<java.lang.String, java.nio.charset.Charset>) strMap27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 171 + "'", int16 == 171);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 171 + "'", int25 == 171);
        org.junit.Assert.assertNotNull(strMapList26);
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.newBuilder();
        java.io.InputStream inputStream1 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2 = null;
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder3 = builder0.mergeFrom(inputStream1, extensionRegistryLite2);
        boolean boolean4 = builder3.hasOptions();
        int int5 = builder3.getNumber();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = null;
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto enumDescriptorProto4 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.parseFrom(byteArray0, extensionRegistryLite3);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder5 = enumDescriptorProto4.newBuilderForType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder enumValueDescriptorProtoOrBuilder7 = builder5.getValueOrBuilder(999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 999");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(methodOptions2);
        org.junit.Assert.assertNotNull(enumDescriptorProto4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOption uninterpretedOption14 = builder7.getUninterpretedOption(50);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 50");
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
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.addExtension(builder3);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder6 = builder0.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder7 = builder6.getOptionsBuilder();
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
        com.google.protobuf.UnknownFieldSet unknownFieldSet20 = builder15.getUnknownFields();
        com.google.protobuf.CodedOutputStream codedOutputStream21 = null;
        unknownFieldSet20.writeTo(codedOutputStream21);
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder23 = builder7.setUnknownFields(unknownFieldSet20);
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder uninterpretedOptionOrBuilder25 = builder7.getUninterpretedOptionOrBuilder(28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 28");
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
        org.junit.Assert.assertNotNull(unknownFieldSet20);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRecordFunctionInformation(true);
        compilerOptions0.setMoveFunctionDeclarations(true);
        compilerOptions0.setGeneratePseudoNames(false);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.google.javascript.jscomp.CssRenamingMap.Style style0 = com.google.javascript.jscomp.CssRenamingMap.Style.BY_PART;
        org.junit.Assert.assertTrue("'" + style0 + "' != '" + com.google.javascript.jscomp.CssRenamingMap.Style.BY_PART + "'", style0.equals(com.google.javascript.jscomp.CssRenamingMap.Style.BY_PART));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        int int0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.PACKAGE_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative0 = com.google.javascript.rhino.jstype.JSTypeNative.U2U_FUNCTION_TYPE;
        org.junit.Assert.assertTrue("'" + jSTypeNative0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.U2U_FUNCTION_TYPE + "'", jSTypeNative0.equals(com.google.javascript.rhino.jstype.JSTypeNative.U2U_FUNCTION_TYPE));
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        int int7 = codedInputStream5.pushLimit((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            codedInputStream5.skipMessage();
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
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        boolean boolean6 = strSet4.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream7 = strSet4.stream();
        java.util.stream.Stream<java.lang.String> strStream8 = strStream7.distinct();
        java.util.stream.Stream<java.lang.String> strStream10 = strStream8.skip((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.String> strStream12 = strStream8.limit(28147497671065600L);
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
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset27);
        int int29 = localDateTime28.getYear();
        java.time.Instant instant30 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset34 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset34);
        java.time.OffsetDateTime offsetDateTime36 = java.time.OffsetDateTime.ofInstant(instant30, (java.time.ZoneId) zoneOffset34);
        java.time.Instant instant37 = localDateTime28.toInstant(zoneOffset34);
        boolean boolean38 = appendableSet23.equals((java.lang.Object) zoneOffset34);
        java.lang.Object[] objArray39 = appendableSet23.toArray();
        java.util.concurrent.TimeUnit timeUnit40 = java.util.concurrent.TimeUnit.HOURS;
        boolean boolean41 = appendableSet23.contains((java.lang.Object) timeUnit40);
        com.google.common.collect.ImmutableList<java.lang.Appendable> appendableList42 = appendableSet23.asList();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.UnmodifiableListIterator<java.lang.Appendable> appendableItor44 = appendableList42.listIterator(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (8) must not be greater than size (3)");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1970 + "'", int29 == 1970);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(zoneOffset34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(offsetDateTime36);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000, \000\000, \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000, \000\000, \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000]");
        org.junit.Assert.assertNotNull(timeUnit40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(appendableList42);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        java.time.ZoneOffset zoneOffset25 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime26 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset25);
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime31 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset30);
        java.time.ZonedDateTime zonedDateTime32 = java.time.ZonedDateTime.of(localDateTime26, (java.time.ZoneId) zoneOffset30);
        java.time.temporal.ChronoField chronoField34 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit35 = chronoField34.getBaseUnit();
        java.time.LocalDateTime localDateTime36 = localDateTime26.plus((long) 1970, temporalUnit35);
        java.time.LocalDateTime localDateTime38 = localDateTime26.withHour((int) (short) 1);
        java.time.ZoneOffset zoneOffset42 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime43 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset42);
        java.time.ZoneOffset zoneOffset47 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime48 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset47);
        java.time.ZonedDateTime zonedDateTime49 = java.time.ZonedDateTime.of(localDateTime43, (java.time.ZoneId) zoneOffset47);
        java.time.temporal.ChronoField chronoField51 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit52 = chronoField51.getBaseUnit();
        java.time.LocalDateTime localDateTime53 = localDateTime43.plus((long) 1970, temporalUnit52);
        java.time.ZoneOffset zoneOffset58 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime59 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset58);
        java.time.ZoneOffset zoneOffset63 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime64 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset63);
        java.time.ZonedDateTime zonedDateTime65 = java.time.ZonedDateTime.of(localDateTime59, (java.time.ZoneId) zoneOffset63);
        java.time.temporal.ChronoField chronoField67 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit68 = chronoField67.getBaseUnit();
        java.time.LocalDateTime localDateTime69 = localDateTime59.plus((long) 1970, temporalUnit68);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime70 = localDateTime53.minus((long) 43, temporalUnit68);
        java.time.LocalDateTime localDateTime72 = localDateTime53.minusHours((long) 1024);
        java.time.LocalDateTime localDateTime74 = localDateTime72.plusHours((long) 0);
        java.time.ZoneOffset zoneOffset78 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime79 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset78);
        java.time.ZoneOffset zoneOffset83 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime84 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset83);
        java.time.ZonedDateTime zonedDateTime85 = java.time.ZonedDateTime.of(localDateTime79, (java.time.ZoneId) zoneOffset83);
        java.time.ZonedDateTime zonedDateTime87 = zonedDateTime85.minusSeconds((long) '#');
        java.time.temporal.ChronoField chronoField88 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit89 = chronoField88.getBaseUnit();
        boolean boolean90 = zonedDateTime87.isSupported(temporalUnit89);
        java.time.LocalDate localDate91 = java.time.LocalDate.now();
        java.lang.String str92 = localDate91.toString();
        boolean boolean93 = temporalUnit89.isSupportedBy((java.time.temporal.Temporal) localDate91);
        java.time.LocalDateTime localDateTime94 = localDateTime72.truncatedTo(temporalUnit89);
        // The following exception was thrown during execution in test generation
        try {
            long long95 = offsetTime21.until((java.time.temporal.Temporal) localDateTime38, temporalUnit89);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain OffsetTime from TemporalAccessor: 1970-01-01T01:02:32 of type java.time.LocalDateTime");
        } catch (java.time.DateTimeException e) {
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
        org.junit.Assert.assertNotNull(zoneOffset25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertTrue("'" + chronoField34 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField34.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit35 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit35.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(zoneOffset42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(zoneOffset47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(zonedDateTime49);
        org.junit.Assert.assertTrue("'" + chronoField51 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField51.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit52 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit52.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(zoneOffset58);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(zoneOffset63);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(zonedDateTime65);
        org.junit.Assert.assertTrue("'" + chronoField67 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField67.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit68 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit68.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime70);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(zoneOffset78);
        org.junit.Assert.assertNotNull(localDateTime79);
        org.junit.Assert.assertNotNull(zoneOffset83);
        org.junit.Assert.assertNotNull(localDateTime84);
        org.junit.Assert.assertNotNull(zonedDateTime85);
        org.junit.Assert.assertNotNull(zonedDateTime87);
        org.junit.Assert.assertTrue("'" + chronoField88 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField88.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit89 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit89.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(localDate91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "2022-02-21" + "'", str92, "2022-02-21");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(localDateTime94);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of((long) (-1));
        java.util.function.LongPredicate longPredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = longStream1.allMatch(longPredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
            java.lang.Object obj12 = builder9.getRepeatedField(fieldDescriptor10, 7);
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

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto2 = builder0.buildPartial();
        int int3 = fieldDescriptorProto2.getSerializedSize();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder4 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder(fieldDescriptorProto2);
        com.google.protobuf.DescriptorProtos.FieldOptions fieldOptions5 = builder4.getOptions();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fieldOptions5.getField(fieldDescriptor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(fieldDescriptorProto2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(fieldOptions5);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.google.protobuf.DescriptorProtos.FileOptions fileOptions0 = com.google.protobuf.DescriptorProtos.FileOptions.getDefaultInstance();
        java.util.List<com.google.protobuf.DescriptorProtos.UninterpretedOption> uninterpretedOptionList1 = fileOptions0.getUninterpretedOptionList();
        boolean boolean2 = fileOptions0.hasJavaGenerateEqualsAndHash();
        org.junit.Assert.assertNotNull(fileOptions0);
        org.junit.Assert.assertNotNull(uninterpretedOptionList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.IsoEra isoEra1 = java.time.chrono.IsoEra.of((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid era: 10");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        jSTypeRegistry2.forwardDeclareType("");
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, false);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSTypeRegistry9.createObjectType(objectType10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, false);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = jSTypeRegistry14.createObjectType(objectType15);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair17 = objectType11.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType16);
        boolean boolean18 = objectType11.isInterface();
        com.google.javascript.rhino.jstype.JSType jSType23 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType11, "NUMBER 52.0 0", "OffsetSeconds", 256, (int) (short) 10);
        com.google.javascript.rhino.jstype.FunctionType functionType24 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSTypeRegistry27.createObjectType(objectType28);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry32.createObjectType(objectType33);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair35 = objectType29.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType34);
        boolean boolean36 = objectType34.isTemplateType();
        boolean boolean37 = objectType34.isNativeObjectType();
        boolean boolean38 = objectType34.isNumberValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, false);
        com.google.javascript.rhino.jstype.ObjectType objectType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSTypeRegistry42.createObjectType(objectType43);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType49 = jSTypeRegistry47.createObjectType(objectType48);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair50 = objectType44.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType49);
        java.lang.String str51 = objectType49.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, false);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = jSTypeRegistry54.createObjectType(objectType55);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, false);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSTypeRegistry59.createObjectType(objectType60);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair62 = objectType56.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType61);
        boolean boolean63 = objectType61.isTemplateType();
        com.google.javascript.rhino.jstype.JSType jSType64 = objectType49.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) objectType61);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean69 = node68.isFromExterns();
        java.lang.String str70 = node68.toString();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable71 = node68.siblings();
        boolean boolean72 = objectType34.defineDeclaredProperty("", (com.google.javascript.rhino.jstype.JSType) objectType61, node68);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry2.createFunctionTypeWithNewThisType(functionType24, objectType34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(typePair17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType23);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(typePair35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertNotNull(typePair50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertNotNull(typePair62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jSType64);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "NUMBER 52.0 0" + "'", str70, "NUMBER 52.0 0");
        org.junit.Assert.assertNotNull(nodeIterable71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite> priorityMap0 = new java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>();
        int int1 = priorityMap0.size();
        int int2 = priorityMap0.size();
        int int3 = priorityMap0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean4 = node3.isStringKey();
        boolean boolean5 = node3.isTrue();
        int int6 = node3.getSourcePosition();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy5 = null;
        compilerOptions0.variableRenaming = variableRenamingPolicy5;
        compilerOptions0.setSummaryDetailLevel(999);
        boolean boolean9 = compilerOptions0.getInferTypes();
        compilerOptions0.setDefineToStringLiteral("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=12 cap=12]", "1970-01-01");
        java.lang.String str13 = compilerOptions0.renamePrefixNamespace;
        compilerOptions0.setExportTestFunctions(false);
        org.junit.Assert.assertNotNull(errorFormat3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder3 = builder2.clearSourceCodeInfo();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder4 = builder3.clearService();
        java.io.InputStream inputStream5 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = builder4.mergeDelimitedFrom(inputStream5, extensionRegistryLite6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.addExtension(builder3);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder6 = builder0.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder7 = builder6.getOptionsBuilder();
        byte[] byteArray8 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite9 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions10 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray8, extensionRegistryLite9);
        com.google.protobuf.CodedInputStream codedInputStream13 = com.google.protobuf.CodedInputStream.newInstance(byteArray8, 16, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder14 = builder7.mergeFrom(codedInputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + label4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(methodOptions10);
        org.junit.Assert.assertNotNull(codedInputStream13);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(37);
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto2 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.parseDelimitedFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo2 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.parseFrom(inputStream0, extensionRegistryLite1);
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder3 = sourceCodeInfo2.newBuilderForType();
        com.google.protobuf.UnknownFieldSet unknownFieldSet4 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder5 = builder3.setUnknownFields(unknownFieldSet4);
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder builder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder7 = builder3.addLocation(builder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceCodeInfo2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto0 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.getDefaultInstance();
        boolean boolean1 = serviceDescriptorProto0.hasOptions();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder2 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.newBuilder(serviceDescriptorProto0);
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder3.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder6 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label7 = builder6.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder8 = builder3.addExtension(builder6);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder9 = builder3.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions10 = builder9.getOptions();
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder11 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output13 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream15 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output13, (int) 'a');
        byte[] byteArray16 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite17 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions18 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray16, extensionRegistryLite17);
        output13.write(byteArray16);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder20 = builder11.mergeFrom(byteArray16);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder21 = builder9.mergeFrom(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder24 = builder2.mergeFrom(byteArray16, 37, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 37");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceDescriptorProto0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + label7 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label7.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(enumOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(output13);
        org.junit.Assert.assertNotNull(codedOutputStream15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(methodOptions18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        int int0 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.NUMBER_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart namePart6 = com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.parseFrom(codedInputStream5);
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
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.HOUR_OF_AMPM;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_AMPM + "'", chronoField0.equals(java.time.temporal.ChronoField.HOUR_OF_AMPM));
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        int int0 = java.util.Spliterator.SIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        int[] intArray4 = new int[] { 16, ':', 43, (short) 100 };
        java.util.stream.IntStream intStream5 = java.util.stream.IntStream.of(intArray4);
        java.util.stream.IntStream intStream6 = intStream5.parallel();
        java.util.function.IntUnaryOperator intUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream8 = intStream5.map(intUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[16, 58, 43, 100]");
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.EnumOptions.Builder.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.addExtension(builder3);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder6 = builder0.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder7 = builder6.getOptionsBuilder();
        com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder builder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder10 = builder7.addUninterpretedOption(1970, builder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + label4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.google.protobuf.Internal.EnumLiteMap<com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label> labelEnumLiteMap0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.internalGetValueMap();
        org.junit.Assert.assertNotNull(labelEnumLiteMap0);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        int int0 = com.google.javascript.rhino.Node.QUOTED_PROP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 36 + "'", int0 == 36);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        java.time.temporal.TemporalUnit temporalUnit4 = chronoField3.getRangeUnit();
        long long6 = chronoField3.checkValidValue((long) 2);
        java.util.Locale locale10 = new java.util.Locale("", "NUMBER 52.0 0", "hi!");
        java.lang.String str11 = chronoField3.getDisplayName(locale10);
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.lang.String str13 = locale10.getDisplayVariant(locale12);
        java.util.Locale.setDefault(locale12);
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.lang.String str16 = locale15.getDisplayCountry();
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale21 = new java.util.Locale("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=12 cap=12]", "2022-02-21");
        java.time.temporal.ChronoField chronoField22 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        java.time.temporal.TemporalUnit temporalUnit23 = chronoField22.getRangeUnit();
        long long25 = chronoField22.checkValidValue((long) 2);
        java.util.Locale locale29 = new java.util.Locale("", "NUMBER 52.0 0", "hi!");
        java.lang.String str30 = chronoField22.getDisplayName(locale29);
        java.util.Locale locale31 = java.util.Locale.KOREAN;
        java.lang.String str32 = locale29.getDisplayVariant(locale31);
        java.util.Locale.setDefault(locale31);
        java.util.Locale locale37 = new java.util.Locale("", "NUMBER 52.0 0", "hi!");
        java.time.temporal.ChronoField chronoField38 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        java.time.temporal.TemporalUnit temporalUnit39 = chronoField38.getRangeUnit();
        long long41 = chronoField38.checkValidValue((long) 2);
        java.util.Locale locale45 = new java.util.Locale("", "NUMBER 52.0 0", "hi!");
        java.lang.String str46 = chronoField38.getDisplayName(locale45);
        java.text.MessageFormat messageFormat48 = new java.text.MessageFormat("hi!");
        java.util.Locale locale49 = messageFormat48.getLocale();
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.util.Locale locale54 = new java.util.Locale("", "NUMBER 52.0 0", "hi!");
        java.util.Locale locale58 = new java.util.Locale("", "NUMBER 52.0 0", "hi!");
        java.util.Locale locale62 = new java.util.Locale("", "NUMBER 52.0 0", "hi!");
        java.lang.String str63 = locale58.getDisplayLanguage(locale62);
        java.lang.String str64 = locale62.getLanguage();
        java.time.temporal.ChronoField chronoField65 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        java.time.temporal.TemporalUnit temporalUnit66 = chronoField65.getRangeUnit();
        long long68 = chronoField65.checkValidValue((long) 2);
        java.util.Locale locale72 = new java.util.Locale("", "NUMBER 52.0 0", "hi!");
        java.lang.String str73 = chronoField65.getDisplayName(locale72);
        java.util.Locale locale74 = java.util.Locale.KOREAN;
        java.lang.String str75 = locale72.getDisplayVariant(locale74);
        java.util.Locale locale76 = java.util.Locale.KOREAN;
        java.util.Locale locale80 = new java.util.Locale("", "NUMBER 52.0 0", "hi!");
        java.time.format.DecimalStyle decimalStyle81 = java.time.format.DecimalStyle.of(locale80);
        java.util.Locale locale85 = new java.util.Locale("", "NUMBER 52.0 0", "hi!");
        java.util.Locale locale89 = new java.util.Locale("", "NUMBER 52.0 0", "hi!");
        java.lang.String str90 = locale85.getDisplayLanguage(locale89);
        java.util.Locale[] localeArray91 = new java.util.Locale[] { locale12, locale15, locale17, locale18, locale21, locale31, locale37, locale45, locale49, locale50, locale54, locale62, locale74, locale76, locale80, locale89 };
        java.util.ArrayList<java.util.Locale> localeList92 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList92, localeArray91);
        java.util.Locale.FilteringMode filteringMode94 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList92, filteringMode94);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField3.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
        org.junit.Assert.assertTrue("'" + temporalUnit4 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit4.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertEquals(locale10.toString(), "_NUMBER 52.0 0_hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OffsetSeconds" + "'", str11, "OffsetSeconds");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str16, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale21.toString(), "java.nio.bytebufferasdoublebufferb[pos=0 lim=12 cap=12]_2022-02-21");
        org.junit.Assert.assertTrue("'" + chronoField22 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField22.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
        org.junit.Assert.assertTrue("'" + temporalUnit23 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit23.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 2L + "'", long25 == 2L);
        org.junit.Assert.assertEquals(locale29.toString(), "_NUMBER 52.0 0_hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "OffsetSeconds" + "'", str30, "OffsetSeconds");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals(locale37.toString(), "_NUMBER 52.0 0_hi!");
        org.junit.Assert.assertTrue("'" + chronoField38 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField38.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
        org.junit.Assert.assertTrue("'" + temporalUnit39 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit39.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 2L + "'", long41 == 2L);
        org.junit.Assert.assertEquals(locale45.toString(), "_NUMBER 52.0 0_hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "OffsetSeconds" + "'", str46, "OffsetSeconds");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "de");
        org.junit.Assert.assertEquals(locale54.toString(), "_NUMBER 52.0 0_hi!");
        org.junit.Assert.assertEquals(locale58.toString(), "_NUMBER 52.0 0_hi!");
        org.junit.Assert.assertEquals(locale62.toString(), "_NUMBER 52.0 0_hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + chronoField65 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField65.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
        org.junit.Assert.assertTrue("'" + temporalUnit66 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit66.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 2L + "'", long68 == 2L);
        org.junit.Assert.assertEquals(locale72.toString(), "_NUMBER 52.0 0_hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "OffsetSeconds" + "'", str73, "OffsetSeconds");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "ko");
        org.junit.Assert.assertEquals(locale80.toString(), "_NUMBER 52.0 0_hi!");
        org.junit.Assert.assertNotNull(decimalStyle81);
        org.junit.Assert.assertEquals(locale85.toString(), "_NUMBER 52.0 0_hi!");
        org.junit.Assert.assertEquals(locale89.toString(), "_NUMBER 52.0 0_hi!");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(localeArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + filteringMode94 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode94.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList95);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.addExtension(builder3);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder6 = builder0.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions7 = builder6.getOptions();
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder8 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output10 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream12 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output10, (int) 'a');
        byte[] byteArray13 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite14 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions15 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray13, extensionRegistryLite14);
        output10.write(byteArray13);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder17 = builder8.mergeFrom(byteArray13);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder18 = builder6.mergeFrom(byteArray13);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.Message.Builder builder20 = builder6.newBuilderForField(fieldDescriptor19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + label4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(enumOptions7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(output10);
        org.junit.Assert.assertNotNull(codedOutputStream12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(methodOptions15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder1 = builder0.clearCcGenericServices();
        boolean boolean2 = builder0.isInitialized();
        boolean boolean3 = builder0.getJavaGenericServices();
        boolean boolean4 = builder0.getJavaMultipleFiles();
        com.google.protobuf.DescriptorProtos.UninterpretedOption uninterpretedOption6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileOptions.Builder builder7 = builder0.addUninterpretedOption(0, uninterpretedOption6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = descriptor0.toProto();
        boolean boolean2 = descriptorProto1.isInitialized();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions3 = descriptorProto1.getOptions();
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder4 = messageOptions3.newBuilderForType();
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder6 = builder4.setMessageSetWireFormat(false);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder8 = builder4.clearField(fieldDescriptor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(descriptorProto1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(messageOptions3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        int int7 = codedInputStream5.pushLimit((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo8 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.parseFrom(codedInputStream5);
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
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.NANOSECONDS;
        long long2 = timeUnit0.toNanos((long) 999);
        java.lang.Thread thread3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeUnit0.timedJoin(thread3, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 999L + "'", long2 == 999L);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        typePosition0.setPositionInformation(50, 0, 50, 50);
        int int6 = typePosition0.getPositionOnStartLine();
        int int7 = typePosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo2 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.parseFrom(inputStream0, extensionRegistryLite1);
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder3 = sourceCodeInfo2.newBuilderForType();
        com.google.protobuf.UnknownFieldSet unknownFieldSet4 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder5 = builder3.setUnknownFields(unknownFieldSet4);
        java.util.Map<com.google.protobuf.Descriptors.FieldDescriptor, java.lang.Object> fieldDescriptorMap6 = builder3.getAllFields();
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto7 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.getDefaultInstance();
        boolean boolean8 = methodDescriptorProto7.hasOutputType();
        boolean boolean9 = methodDescriptorProto7.hasOutputType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder10 = builder3.mergeFrom((com.google.protobuf.Message) methodDescriptorProto7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: mergeFrom(Message) can only merge messages of the same type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceCodeInfo2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(fieldDescriptorMap6);
        org.junit.Assert.assertNotNull(methodDescriptorProto7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.google.protobuf.WireFormat.FieldType fieldType0 = com.google.protobuf.WireFormat.FieldType.ENUM;
        com.google.protobuf.WireFormat.JavaType javaType1 = fieldType0.getJavaType();
        org.junit.Assert.assertTrue("'" + fieldType0 + "' != '" + com.google.protobuf.WireFormat.FieldType.ENUM + "'", fieldType0.equals(com.google.protobuf.WireFormat.FieldType.ENUM));
        org.junit.Assert.assertTrue("'" + javaType1 + "' != '" + com.google.protobuf.WireFormat.JavaType.ENUM + "'", javaType1.equals(com.google.protobuf.WireFormat.JavaType.ENUM));
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_ORDINAL_DATE;
        java.nio.CharBuffer charBuffer2 = java.nio.CharBuffer.allocate((int) ' ');
        boolean boolean3 = charBuffer2.isDirect();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer7 = charBuffer5.put('a');
        char[] charArray9 = new char[] { '4' };
        java.nio.CharBuffer charBuffer10 = charBuffer7.get(charArray9);
        java.nio.CharBuffer charBuffer11 = charBuffer7.compact();
        java.nio.CharBuffer charBuffer13 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer15 = charBuffer13.put('a');
        java.nio.CharBuffer charBuffer17 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer19 = charBuffer17.put('a');
        char[] charArray21 = new char[] { '4' };
        java.nio.CharBuffer charBuffer22 = charBuffer19.get(charArray21);
        java.nio.CharBuffer charBuffer23 = charBuffer19.compact();
        com.google.common.collect.ImmutableSet<java.lang.Appendable> appendableSet24 = com.google.common.collect.ImmutableSet.of((java.lang.Appendable) charBuffer2, (java.lang.Appendable) charBuffer7, (java.lang.Appendable) charBuffer13, (java.lang.Appendable) charBuffer23);
        java.nio.CharBuffer charBuffer25 = java.nio.CharBuffer.wrap((java.lang.CharSequence) charBuffer2);
        java.nio.CharBuffer charBuffer26 = charBuffer2.duplicate();
        java.text.ParsePosition parsePosition27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor28 = dateTimeFormatter0.parseUnresolved((java.lang.CharSequence) charBuffer2, parsePosition27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: position");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(charBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(charBuffer7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(charBuffer11);
        org.junit.Assert.assertNotNull(charBuffer13);
        org.junit.Assert.assertNotNull(charBuffer15);
        org.junit.Assert.assertNotNull(charBuffer17);
        org.junit.Assert.assertNotNull(charBuffer19);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer22);
        org.junit.Assert.assertNotNull(charBuffer23);
        org.junit.Assert.assertNotNull(appendableSet24);
        org.junit.Assert.assertNotNull(charBuffer25);
        org.junit.Assert.assertNotNull(charBuffer26);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = null;
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto enumDescriptorProto4 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.parseFrom(byteArray0, extensionRegistryLite3);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder5 = enumDescriptorProto4.newBuilderForType();
        com.google.protobuf.Descriptors.Descriptor descriptor6 = builder5.getDescriptorForType();
        java.util.List<com.google.protobuf.Descriptors.FieldDescriptor> fieldDescriptorList7 = descriptor6.getFields();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(methodOptions2);
        org.junit.Assert.assertNotNull(enumDescriptorProto4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(descriptor6);
        org.junit.Assert.assertNotNull(fieldDescriptorList7);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset4);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset4);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.minusDays((long) (short) 100);
        java.time.ZoneId zoneId9 = java.time.ZoneId.from((java.time.temporal.TemporalAccessor) offsetDateTime6);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(zoneId9);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.FileOptions fileOptions1 = builder0.getDefaultInstanceForType();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder3 = builder0.setPyGenericServices(false);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = builder0.getField(fieldDescriptor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(fileOptions1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "ISO", file2);
        boolean boolean6 = file3.setWritable(false, false);
        boolean boolean7 = file3.isHidden();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!278006929620058752ISO");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder3 = builder2.clearSourceCodeInfo();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder4 = builder2.getSourceCodeInfoBuilder();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo5 = builder4.getDefaultInstanceForType();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder6 = sourceCodeInfo5.newBuilderForType();
        java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite> priorityMap7 = new java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>();
        java.lang.Object obj8 = priorityMap7.clone();
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder9 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.newBuilder();
        boolean boolean10 = priorityMap7.containsValue((java.lang.Object) builder9);
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder12 = builder9.setName("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=12 cap=12]");
        com.google.protobuf.ByteString byteString13 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder14 = builder9.mergeFrom(byteString13);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite15 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder16 = builder6.mergeFrom(byteString13, extensionRegistryLite15);
        java.io.InputStream inputStream18 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location location19 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.parseFrom(inputStream18);
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location location20 = location19.getDefaultInstanceForType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder21 = builder6.addLocation(16, location20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 16, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(sourceCodeInfo5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{}");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(byteString13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(location19);
        org.junit.Assert.assertNotNull(location20);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        compilerOptions0.setOutputJsStringUsage(false);
        org.junit.Assert.assertNotNull(errorFormat3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder3 = builder2.clearSourceCodeInfo();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder descriptorProtoOrBuilder5 = builder3.getMessageTypeOrBuilder(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.google.common.collect.ImmutableSet.Builder<java.io.Flushable> flushableBuilder0 = com.google.common.collect.ImmutableSet.builder();
        org.junit.Assert.assertNotNull(flushableBuilder0);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "ISO", file2);
        boolean boolean6 = file3.setWritable(false, false);
        java.net.URI uRI7 = file3.toURI();
        java.io.PrintStream printStream8 = new java.io.PrintStream(file3);
        boolean boolean10 = file3.setReadable(true);
        java.io.File file13 = java.io.File.createTempFile("South Korea", "OptionalDouble[-1.0]");
        int int14 = file3.compareTo(file13);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!8723819120125242642ISO");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(uRI7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertEquals(file13.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file13.toString(), "/tmp/South Korea3620550779747156339OptionalDouble[-1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 21 + "'", int14 == 21);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) -1);
        node1.putIntProp((int) (byte) -1, 9);
        boolean boolean5 = node1.isLabel();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup0;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler1.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler1.getErrors();
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromFile("/");
        com.google.javascript.jscomp.SourceFile.Generator generator10 = null;
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat15 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions12.errorFormat = errorFormat15;
        compilerOptions12.setRemoveDeadCode(false);
        com.google.javascript.jscomp.Result result19 = compiler5.compile(sourceFile8, sourceFile11, compilerOptions12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node20 = compiler1.parse(sourceFile11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(errorFormat15);
        org.junit.Assert.assertNotNull(result19);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        java.lang.String[] strArray11 = new java.lang.String[] { "South Korea", "Unknown class name", "ISO", "OffsetSeconds", ":" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        compilerOptions0.setReplaceStringsConfiguration("1970-01-01+00:00:52", (java.util.List<java.lang.String>) strList12);
        compilerOptions0.setOptimizeArgumentsArray(true);
        org.junit.Assert.assertNotNull(errorFormat3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative0 = com.google.javascript.rhino.jstype.JSTypeNative.SYNTAX_ERROR_TYPE;
        org.junit.Assert.assertTrue("'" + jSTypeNative0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.SYNTAX_ERROR_TYPE + "'", jSTypeNative0.equals(com.google.javascript.rhino.jstype.JSTypeNative.SYNTAX_ERROR_TYPE));
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        java.util.stream.LongStream longStream4 = java.util.stream.LongStream.of((long) (-1));
        com.google.common.collect.ImmutableMap<com.google.javascript.jscomp.Compiler, java.util.stream.LongStream> compilerMap5 = com.google.common.collect.ImmutableMap.of(compiler1, longStream4);
        java.util.stream.DoubleStream doubleStream6 = longStream4.asDoubleStream();
        java.util.stream.LongStream longStream8 = longStream4.skip(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.Long> longStream9 = longStream8.boxed();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(compilerMap5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.google.protobuf.DescriptorProtos.EnumValueOptions enumValueOptions0 = com.google.protobuf.DescriptorProtos.EnumValueOptions.getDefaultInstance();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = enumValueOptions0.getRepeatedFieldCount(fieldDescriptor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(enumValueOptions0);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        compilerInput3.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler5);
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler5.getCodingConvention();
        java.lang.String str9 = codingConvention8.getGlobalObject();
        boolean boolean11 = codingConvention8.isExported("NUMBER 52.0 0");
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean17 = node16.isStringKey();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean22 = node21.isVar();
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] { node16, node21 };
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(10, nodeArray23);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast25 = codingConvention8.getObjectLiteralCast(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.global" + "'", str9, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeArray23);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        java.time.Instant instant19 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset23);
        java.time.ZoneOffset zoneOffset28 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime29 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset28);
        java.time.ZonedDateTime zonedDateTime30 = java.time.ZonedDateTime.of(localDateTime24, (java.time.ZoneId) zoneOffset28);
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit33 = chronoField32.getBaseUnit();
        java.time.LocalDateTime localDateTime34 = localDateTime24.plus((long) 1970, temporalUnit33);
        java.time.LocalDateTime localDateTime36 = localDateTime24.withHour((int) (short) 1);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.OffsetDateTime offsetDateTime39 = java.time.OffsetDateTime.of(localDateTime24, zoneOffset38);
        java.time.OffsetTime offsetTime40 = java.time.OffsetTime.ofInstant(instant19, (java.time.ZoneId) zoneOffset38);
        java.time.Instant instant41 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset45 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime46 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset45);
        java.time.ZoneOffset zoneOffset50 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime51 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset50);
        java.time.ZonedDateTime zonedDateTime52 = java.time.ZonedDateTime.of(localDateTime46, (java.time.ZoneId) zoneOffset50);
        java.time.temporal.ChronoField chronoField54 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit55 = chronoField54.getBaseUnit();
        java.time.LocalDateTime localDateTime56 = localDateTime46.plus((long) 1970, temporalUnit55);
        java.time.LocalDateTime localDateTime58 = localDateTime46.withHour((int) (short) 1);
        java.time.ZoneOffset zoneOffset60 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.OffsetDateTime offsetDateTime61 = java.time.OffsetDateTime.of(localDateTime46, zoneOffset60);
        java.time.OffsetTime offsetTime62 = java.time.OffsetTime.ofInstant(instant41, (java.time.ZoneId) zoneOffset60);
        boolean boolean63 = offsetTime40.isAfter(offsetTime62);
        int int64 = offsetTime40.getNano();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoZonedDateTime<? extends java.time.chrono.ChronoLocalDate> wildcardChronoZonedDateTime65 = isoChronology0.zonedDateTime((java.time.temporal.TemporalAccessor) offsetTime40);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZonedDateTime from TemporalAccessor: 00:00:52+00:00:52 of type java.time.OffsetTime");
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
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(zoneOffset28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField32.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit33 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit33.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertNotNull(offsetDateTime39);
        org.junit.Assert.assertNotNull(offsetTime40);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(zoneOffset45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(zoneOffset50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(zonedDateTime52);
        org.junit.Assert.assertTrue("'" + chronoField54 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField54.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit55 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit55.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(zoneOffset60);
        org.junit.Assert.assertNotNull(offsetDateTime61);
        org.junit.Assert.assertNotNull(offsetTime62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer3 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "1970-01-01+00:00:52", 1024, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo2 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.parseFrom(inputStream0, extensionRegistryLite1);
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder3 = sourceCodeInfo2.newBuilderForType();
        com.google.protobuf.UnknownFieldSet unknownFieldSet4 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder5 = builder3.setUnknownFields(unknownFieldSet4);
        com.google.protobuf.Descriptors.Descriptor descriptor6 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto7 = descriptor6.toProto();
        boolean boolean8 = descriptorProto7.isInitialized();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions9 = descriptorProto7.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder10 = builder5.mergeFrom((com.google.protobuf.Message) messageOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: mergeFrom(Message) can only merge messages of the same type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceCodeInfo2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(descriptor6);
        org.junit.Assert.assertNotNull(descriptorProto7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(messageOptions9);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo2 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.parseFrom(inputStream0, extensionRegistryLite1);
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder3 = sourceCodeInfo2.newBuilderForType();
        com.google.protobuf.UnknownFieldSet unknownFieldSet4 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder5 = builder3.setUnknownFields(unknownFieldSet4);
        java.util.Map<com.google.protobuf.Descriptors.FieldDescriptor, java.lang.Object> fieldDescriptorMap6 = builder3.getAllFields();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder7 = builder3.clearLocation();
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder9 = builder7.mergeFrom(inputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceCodeInfo2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(fieldDescriptorMap6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        java.lang.String[] strArray11 = new java.lang.String[] { "South Korea", "Unknown class name", "ISO", "OffsetSeconds", ":" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        compilerOptions0.setReplaceStringsConfiguration("1970-01-01+00:00:52", (java.util.List<java.lang.String>) strList12);
        boolean boolean15 = strList12.isEmpty();
        org.junit.Assert.assertNotNull(errorFormat3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto2 = builder0.buildPartial();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = fieldDescriptorProto2.newBuilderForType();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder4 = fieldDescriptorProto2.newBuilderForType();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto5 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.getDefaultInstance();
        boolean boolean6 = serviceDescriptorProto5.hasOptions();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder7 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.newBuilder(serviceDescriptorProto5);
        byte[] byteArray8 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite9 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions10 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray8, extensionRegistryLite9);
        com.google.protobuf.CodedInputStream codedInputStream13 = com.google.protobuf.CodedInputStream.newInstance(byteArray8, 16, (int) 'a');
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder14 = builder7.mergeFrom(byteArray8);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder18 = builder4.mergeFrom(byteArray8, 12, 4096, extensionRegistryLite17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(fieldDescriptorProto2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(serviceDescriptorProto5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(methodOptions10);
        org.junit.Assert.assertNotNull(codedInputStream13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.google.protobuf.Descriptors.FieldDescriptor.JavaType javaType0 = com.google.protobuf.Descriptors.FieldDescriptor.JavaType.ENUM;
        org.junit.Assert.assertTrue("'" + javaType0 + "' != '" + com.google.protobuf.Descriptors.FieldDescriptor.JavaType.ENUM + "'", javaType0.equals(com.google.protobuf.Descriptors.FieldDescriptor.JavaType.ENUM));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder1 = builder0.clearCcGenericServices();
        boolean boolean2 = builder0.isInitialized();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder4 = builder0.setCcGenericServices(true);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder5 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label6 = builder5.getLabel();
        com.google.protobuf.ByteString byteString7 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder8 = builder5.mergeFrom(byteString7);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite9 = null;
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder10 = builder4.mergeFrom(byteString7, extensionRegistryLite9);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor11 = null;
        java.io.InputStream inputStream13 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions14 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream13);
        java.util.List<com.google.protobuf.DescriptorProtos.UninterpretedOption> uninterpretedOptionList15 = enumOptions14.getUninterpretedOptionList();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileOptions.Builder builder16 = builder4.setRepeatedField(fieldDescriptor11, 100, (java.lang.Object) uninterpretedOptionList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + label6 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label6.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(byteString7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(enumOptions14);
        org.junit.Assert.assertNotNull(uninterpretedOptionList15);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        java.nio.FloatBuffer floatBuffer1 = java.nio.FloatBuffer.allocate(6);
        java.nio.FloatBuffer floatBuffer2 = floatBuffer1.asReadOnlyBuffer();
        java.nio.FloatBuffer floatBuffer4 = java.nio.FloatBuffer.allocate(6);
        java.nio.FloatBuffer floatBuffer5 = floatBuffer4.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.FloatBuffer floatBuffer6 = floatBuffer2.put(floatBuffer5);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer2);
        org.junit.Assert.assertNotNull(floatBuffer4);
        org.junit.Assert.assertNotNull(floatBuffer5);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        boolean boolean5 = objectType4.isInterface();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromInputStream("South Korea", inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        int int1 = com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative0 = com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_FUNCTION_TYPE;
        org.junit.Assert.assertTrue("'" + jSTypeNative0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_FUNCTION_TYPE + "'", jSTypeNative0.equals(com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_FUNCTION_TYPE));
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.util.Date date3 = new java.util.Date((int) (byte) -1, 43, 16384);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        boolean boolean10 = strSet8.isEmpty();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(100);
        boolean boolean13 = strSet8.equals((java.lang.Object) byteBuffer12);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        boolean boolean20 = strSet18.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream21 = strSet18.stream();
        boolean boolean22 = strSet8.retainAll((java.util.Collection<java.lang.String>) strSet18);
        boolean boolean23 = date3.equals((java.lang.Object) boolean22);
        org.junit.Assert.assertEquals(date3.toString(), "Mon Jun 09 00:00:00 UTC 1947");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap.Entry entry1 = com.google.javascript.jscomp.FunctionInformationMap.Entry.parseDelimitedFrom(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.ByteString byteString2 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = builder0.mergeFrom(byteString2);
        byte[] byteArray4 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite5 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions6 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray4, extensionRegistryLite5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder9 = builder3.mergeFrom(byteArray4, 42, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 42");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(byteString2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(methodOptions6);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = namePosition0.getItem();
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedOutputStream codedOutputStream5 = com.google.protobuf.CodedOutputStream.newInstance(byteArray0, (int) (short) 0, 1);
        com.google.protobuf.CodedOutputStream codedOutputStream8 = com.google.protobuf.CodedOutputStream.newInstance(byteArray0, (int) ' ', 0);
        java.io.InputStream inputStream9 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location location10 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.parseFrom(inputStream9);
        boolean boolean11 = location10.isInitialized();
        codedOutputStream8.writeGroupNoTag((com.google.protobuf.MessageLite) location10);
        // The following exception was thrown during execution in test generation
        try {
            codedOutputStream8.writeInt64NoTag(3600000L);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.CodedOutputStream.OutOfSpaceException; message: CodedOutputStream was writing to a flat byte array and ran out of space.");
        } catch (com.google.protobuf.CodedOutputStream.OutOfSpaceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(methodOptions2);
        org.junit.Assert.assertNotNull(codedOutputStream5);
        org.junit.Assert.assertNotNull(codedOutputStream8);
        org.junit.Assert.assertNotNull(location10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder0 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.newBuilder();
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder fileOptionsOrBuilder3 = builder2.getOptionsOrBuilder();
        byte[] byteArray4 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite5 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions6 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray4, extensionRegistryLite5);
        com.google.protobuf.CodedOutputStream codedOutputStream9 = com.google.protobuf.CodedOutputStream.newInstance(byteArray4, (int) (short) 0, 1);
        com.google.protobuf.CodedOutputStream codedOutputStream12 = com.google.protobuf.CodedOutputStream.newInstance(byteArray4, (int) ' ', 0);
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder13 = builder2.mergeFrom(byteArray4);
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder14 = builder13.clearExtension();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(fileOptionsOrBuilder3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(methodOptions6);
        org.junit.Assert.assertNotNull(codedOutputStream9);
        org.junit.Assert.assertNotNull(codedOutputStream12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder3 = builder2.clearSourceCodeInfo();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder4 = builder2.getSourceCodeInfoBuilder();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder builder6 = builder4.addLocationBuilder((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.addExtension(builder3);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder6 = builder0.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder7 = builder6.getOptionsBuilder();
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder8 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output10 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream12 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output10, (int) 'a');
        byte[] byteArray13 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite14 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions15 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray13, extensionRegistryLite14);
        output10.write(byteArray13);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder17 = builder8.mergeFrom(byteArray13);
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder18 = builder7.mergeFrom(byteArray13);
        java.io.InputStream inputStream19 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = builder7.mergeDelimitedFrom(inputStream19, extensionRegistryLite20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + label4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(output10);
        org.junit.Assert.assertNotNull(codedOutputStream12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(methodOptions15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.ByteString byteString2 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions4 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(byteString2, extensionRegistryLite3);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder5 = builder0.mergeFrom(byteString2);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor6 = null;
        com.google.protobuf.WireFormat.JavaType javaType7 = com.google.protobuf.WireFormat.JavaType.BYTE_STRING;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder8 = builder5.setField(fieldDescriptor6, (java.lang.Object) javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(byteString2);
        org.junit.Assert.assertNotNull(enumOptions4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + javaType7 + "' != '" + com.google.protobuf.WireFormat.JavaType.BYTE_STRING + "'", javaType7.equals(com.google.protobuf.WireFormat.JavaType.BYTE_STRING));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy5 = null;
        compilerOptions0.variableRenaming = variableRenamingPolicy5;
        compilerOptions0.setSummaryDetailLevel(999);
        boolean boolean9 = compilerOptions0.getInferTypes();
        compilerOptions0.resetWarningsGuard();
        boolean boolean11 = compilerOptions0.foldConstants;
        org.junit.Assert.assertNotNull(errorFormat3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.util.logging.Level level0 = java.util.logging.Level.ALL;
        org.junit.Assert.assertNotNull(level0);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap.Module module2 = com.google.javascript.jscomp.FunctionInformationMap.Module.parseFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: Message missing required fields: name, compiled_source");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        java.time.Instant instant1 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset5);
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.ofInstant(instant1, (java.time.ZoneId) zoneOffset5);
        java.time.OffsetDateTime offsetDateTime9 = offsetDateTime7.minusDays((long) (short) 100);
        java.lang.String str10 = offsetDateTime7.toString();
        java.time.temporal.ChronoField chronoField11 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        int int12 = offsetDateTime7.get((java.time.temporal.TemporalField) chronoField11);
        java.time.OffsetDateTime offsetDateTime14 = offsetDateTime7.withDayOfMonth((int) (short) 10);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.MAX;
        java.time.OffsetDateTime offsetDateTime16 = offsetDateTime14.withOffsetSameLocal(zoneOffset15);
        boolean boolean17 = chronoField0.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset15);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = chronoField0.checkValidValue(28147497671065600L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for OffsetSeconds (valid values -64800 - 64800): 28147497671065600");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField0.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T00:00:52+00:00:52" + "'", str10, "1970-01-01T00:00:52+00:00:52");
        org.junit.Assert.assertTrue("'" + chronoField11 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField11.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertNotNull(offsetDateTime14);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.google.javascript.jscomp.PerformanceTracker.Stats stats1 = new com.google.javascript.jscomp.PerformanceTracker.Stats("goog.global");
        stats1.diff = 8;
        java.lang.String str4 = stats1.pass;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite> priorityMap0 = new java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>();
        java.lang.Object obj1 = priorityMap0.clone();
        java.lang.Object obj2 = priorityMap0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{}");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "{}");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.time.Month month0 = java.time.Month.APRIL;
        java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) month0);
        java.time.Month month2 = month0.firstMonthOfQuarter();
        java.time.Period period3 = java.time.Period.ZERO;
        java.time.chrono.ChronoPeriod chronoPeriod4 = period3.normalized();
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.EPOCH_DAY;
        java.time.Instant instant6 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset10);
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.ofInstant(instant6, (java.time.ZoneId) zoneOffset10);
        java.time.temporal.ValueRange valueRange13 = chronoField5.rangeRefinedBy((java.time.temporal.TemporalAccessor) offsetDateTime12);
        java.time.temporal.Temporal temporal14 = period3.subtractFrom((java.time.temporal.Temporal) offsetDateTime12);
        java.time.Month month15 = java.time.Month.AUGUST;
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset19);
        java.time.ZoneOffset zoneOffset24 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime25 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset24);
        java.time.ZonedDateTime zonedDateTime26 = java.time.ZonedDateTime.of(localDateTime20, (java.time.ZoneId) zoneOffset24);
        java.time.temporal.ChronoField chronoField27 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean28 = localDateTime20.isSupported((java.time.temporal.TemporalField) chronoField27);
        boolean boolean29 = month15.isSupported((java.time.temporal.TemporalField) chronoField27);
        long long30 = offsetDateTime12.getLong((java.time.temporal.TemporalField) chronoField27);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange31 = month2.range((java.time.temporal.TemporalField) chronoField27);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfAmPm");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.APRIL + "'", month0.equals(java.time.Month.APRIL));
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.APRIL + "'", month2.equals(java.time.Month.APRIL));
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(chronoPeriod4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.EPOCH_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.EPOCH_DAY));
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(valueRange13);
        org.junit.Assert.assertNotNull(temporal14);
        org.junit.Assert.assertTrue("'" + month15 + "' != '" + java.time.Month.AUGUST + "'", month15.equals(java.time.Month.AUGUST));
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(zoneOffset24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(zonedDateTime26);
        org.junit.Assert.assertTrue("'" + chronoField27 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField27.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 12L + "'", long30 == 12L);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        int int1 = com.google.protobuf.CodedOutputStream.computeFixed32SizeNoTag(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        compilerInput3.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler5);
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler5.getCodingConvention();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler5.getErrorManager();
        boolean boolean10 = compiler5.acceptConstKeyword();
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = descriptor0.toProto();
        boolean boolean2 = descriptorProto1.isInitialized();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto3 = descriptorProto1.getDefaultInstanceForType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto5 = descriptorProto1.getField(39);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 39, Size: 9");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(descriptorProto1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(descriptorProto3);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output2 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream4 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output2, (int) 'a');
        byte[] byteArray5 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions7 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray5, extensionRegistryLite6);
        output2.write(byteArray5);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder9 = builder0.mergeFrom(byteArray5);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor10 = null;
        java.io.InputStream inputStream11 = null;
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto12 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.parseFrom(inputStream11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder13 = builder0.setField(fieldDescriptor10, (java.lang.Object) inputStream11);
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
        org.junit.Assert.assertNotNull(enumValueDescriptorProto12);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        int int0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.OPTIONS_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.DescriptorProto.Builder builder2 = builder0.getMessageTypeBuilder(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.google.protobuf.ByteString byteString0 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions2 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(byteString0, extensionRegistryLite1);
        // The following exception was thrown during execution in test generation
        try {
            byte byte4 = byteString0.byteAt((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteString0);
        org.junit.Assert.assertNotNull(enumOptions2);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean5 = node4.isStringKey();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean10 = node9.isVar();
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] { node4, node9 };
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(10, nodeArray11);
        boolean boolean13 = node12.isLocalResultCall();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.google.protobuf.Descriptors.FieldDescriptor.JavaType javaType0 = com.google.protobuf.Descriptors.FieldDescriptor.JavaType.MESSAGE;
        org.junit.Assert.assertTrue("'" + javaType0 + "' != '" + com.google.protobuf.Descriptors.FieldDescriptor.JavaType.MESSAGE + "'", javaType0.equals(com.google.protobuf.Descriptors.FieldDescriptor.JavaType.MESSAGE));
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        compilerInput3.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.String> strCollection8 = compilerInput3.getProvides();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto1 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.parseFrom(inputStream0);
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder2 = enumValueDescriptorProto1.toBuilder();
        byte[] byteArray3 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite4 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions5 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray3, extensionRegistryLite4);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto enumDescriptorProto7 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.parseFrom(byteArray3, extensionRegistryLite6);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder11 = builder2.mergeFrom(byteArray3, 42, 36, extensionRegistryLite10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 42");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(enumValueDescriptorProto1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(methodOptions5);
        org.junit.Assert.assertNotNull(enumDescriptorProto7);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedOutputStream codedOutputStream5 = com.google.protobuf.CodedOutputStream.newInstance(byteArray0, (int) (short) 0, 1);
        com.google.protobuf.CodedOutputStream codedOutputStream8 = com.google.protobuf.CodedOutputStream.newInstance(byteArray0, (int) ' ', 0);
        com.google.protobuf.Descriptors.Descriptor descriptor10 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto11 = descriptor10.toProto();
        boolean boolean12 = descriptorProto11.isInitialized();
        int int13 = descriptorProto11.getExtensionCount();
        java.util.List<com.google.protobuf.DescriptorProtos.DescriptorProto> descriptorProtoList14 = descriptorProto11.getNestedTypeList();
        // The following exception was thrown during execution in test generation
        try {
            codedOutputStream8.writeMessageSetExtension(4, (com.google.protobuf.MessageLite) descriptorProto11);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.CodedOutputStream.OutOfSpaceException; message: CodedOutputStream was writing to a flat byte array and ran out of space.");
        } catch (com.google.protobuf.CodedOutputStream.OutOfSpaceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(methodOptions2);
        org.junit.Assert.assertNotNull(codedOutputStream5);
        org.junit.Assert.assertNotNull(codedOutputStream8);
        org.junit.Assert.assertNotNull(descriptor10);
        org.junit.Assert.assertNotNull(descriptorProto11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(descriptorProtoList14);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        java.lang.String str1 = localDate0.toString();
        java.time.chrono.IsoChronology isoChronology2 = localDate0.getChronology();
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset7);
        int int9 = localDateTime8.getYear();
        java.time.Instant instant10 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset14);
        java.time.OffsetDateTime offsetDateTime16 = java.time.OffsetDateTime.ofInstant(instant10, (java.time.ZoneId) zoneOffset14);
        java.time.Instant instant17 = localDateTime8.toInstant(zoneOffset14);
        java.time.ZoneOffset zoneOffset22 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime23 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset22);
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset27);
        java.time.ZonedDateTime zonedDateTime29 = java.time.ZonedDateTime.of(localDateTime23, (java.time.ZoneId) zoneOffset27);
        java.time.temporal.ChronoField chronoField31 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit32 = chronoField31.getBaseUnit();
        java.time.LocalDateTime localDateTime33 = localDateTime23.plus((long) 1970, temporalUnit32);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime39 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset38);
        java.time.ZoneOffset zoneOffset43 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime44 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset43);
        java.time.ZonedDateTime zonedDateTime45 = java.time.ZonedDateTime.of(localDateTime39, (java.time.ZoneId) zoneOffset43);
        java.time.temporal.ChronoField chronoField47 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit48 = chronoField47.getBaseUnit();
        java.time.LocalDateTime localDateTime49 = localDateTime39.plus((long) 1970, temporalUnit48);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime50 = localDateTime33.minus((long) 43, temporalUnit48);
        java.time.Instant instant51 = instant17.plus((long) 16384, temporalUnit48);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate52 = localDate0.plus(16L, temporalUnit48);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Hours");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2022-02-21" + "'", str1, "2022-02-21");
        org.junit.Assert.assertNotNull(isoChronology2);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(zoneOffset22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertTrue("'" + chronoField31 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField31.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit32 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit32.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(zoneOffset43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(zonedDateTime45);
        org.junit.Assert.assertTrue("'" + chronoField47 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField47.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit48 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit48.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime50);
        org.junit.Assert.assertNotNull(instant51);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        int int7 = codedInputStream5.pushLimit((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            long long8 = codedInputStream5.readRawLittleEndian64();
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
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.addExtension(builder3);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder6 = builder0.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder7 = builder6.getOptionsBuilder();
        com.google.protobuf.Descriptors.Descriptor descriptor8 = builder6.getDescriptorForType();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.Message.Builder builder10 = builder6.clearField(fieldDescriptor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + label4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(descriptor8);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '/', 43, 97, 97);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.addExtension(builder3);
        com.google.protobuf.ByteString.Output output7 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream9 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output7, (int) 'a');
        byte[] byteArray10 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite11 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions12 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray10, extensionRegistryLite11);
        output7.write(byteArray10);
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder14 = builder0.mergeFrom(byteArray10);
        int int15 = builder0.getDependencyCount();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + label4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(output7);
        org.junit.Assert.assertNotNull(codedOutputStream9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(methodOptions12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        com.google.javascript.rhino.Node node34 = node29.getLastChild();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = node34.getQualifiedName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        java.util.stream.LongStream longStream4 = java.util.stream.LongStream.of((long) (-1));
        com.google.common.collect.ImmutableMap<com.google.javascript.jscomp.Compiler, java.util.stream.LongStream> compilerMap5 = com.google.common.collect.ImmutableMap.of(compiler1, longStream4);
        java.util.stream.DoubleStream doubleStream6 = longStream4.asDoubleStream();
        java.util.OptionalDouble optionalDouble7 = doubleStream6.findAny();
        doubleStream6.close();
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            doubleStream6.forEachOrdered(doubleConsumer9);
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
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.google.javascript.jscomp.FunctionInformationMap.Module.Builder builder0 = com.google.javascript.jscomp.FunctionInformationMap.Module.newBuilder();
        java.io.InputStream inputStream1 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2 = null;
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto3 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.parseFrom(inputStream1, extensionRegistryLite2);
        int int4 = enumValueDescriptorProto3.getNumber();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap.Module.Builder builder5 = builder0.mergeFrom((com.google.protobuf.Message) enumValueDescriptorProto3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: mergeFrom(Message) can only merge messages of the same type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(enumValueDescriptorProto3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = descriptor0.toProto();
        boolean boolean2 = descriptorProto1.isInitialized();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions3 = descriptorProto1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOption uninterpretedOption5 = messageOptions3.getUninterpretedOption(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(descriptorProto1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(messageOptions3);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime10.withYear((int) (short) 1);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField13.getBaseUnit();
        java.time.ZonedDateTime zonedDateTime15 = zonedDateTime10.truncatedTo(temporalUnit14);
        java.time.Duration duration16 = temporalUnit14.getDuration();
        long long17 = duration16.toDays();
        java.time.Duration duration19 = duration16.minusNanos((long) '/');
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField13.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit14 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit14.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(duration19);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.google.protobuf.WireFormat.FieldType fieldType0 = com.google.protobuf.WireFormat.FieldType.SFIXED64;
        org.junit.Assert.assertTrue("'" + fieldType0 + "' != '" + com.google.protobuf.WireFormat.FieldType.SFIXED64 + "'", fieldType0.equals(com.google.protobuf.WireFormat.FieldType.SFIXED64));
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        int[] intArray4 = new int[] { 16, ':', 43, (short) 100 };
        java.util.stream.IntStream intStream5 = java.util.stream.IntStream.of(intArray4);
        java.util.stream.IntStream intStream6 = intStream5.parallel();
        int[] intArray11 = new int[] { 16, ':', 43, (short) 100 };
        java.util.stream.IntStream intStream12 = java.util.stream.IntStream.of(intArray11);
        java.util.stream.IntStream intStream13 = intStream12.parallel();
        java.util.stream.Stream<java.lang.Integer> intStream14 = intStream13.boxed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream15 = java.util.stream.IntStream.concat(intStream6, intStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[16, 58, 43, 100]");
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[16, 58, 43, 100]");
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(intStream14);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedOutputStream codedOutputStream5 = com.google.protobuf.CodedOutputStream.newInstance(byteArray0, (int) (short) 0, 1);
        com.google.protobuf.CodedOutputStream codedOutputStream8 = com.google.protobuf.CodedOutputStream.newInstance(byteArray0, (int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            codedOutputStream8.writeRawLittleEndian64((long) '/');
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
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.net.URISyntaxException uRISyntaxException3 = new java.net.URISyntaxException("", "Unknown class name", 16);
        int int4 = uRISyntaxException3.getIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        int[] intArray4 = new int[] { 16, ':', 43, (short) 100 };
        java.util.stream.IntStream intStream5 = java.util.stream.IntStream.of(intArray4);
        long long6 = intStream5.count();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = intStream5.toArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[16, 58, 43, 100]");
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4L + "'", long6 == 4L);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.io.File file2 = null;
        java.io.File file3 = java.io.File.createTempFile("hi!", "ISO", file2);
        boolean boolean6 = file3.setWritable(false, false);
        java.net.URI uRI7 = file3.toURI();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile8 = com.google.javascript.jscomp.JSSourceFile.fromFile(file3);
        jSSourceFile8.clearCachedSource();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/tmp/hi!4888971665493328038ISO");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(uRI7);
        org.junit.Assert.assertNotNull(jSSourceFile8);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        short[] shortArray1 = new short[] { (byte) 1 };
        java.nio.ShortBuffer shortBuffer2 = java.nio.ShortBuffer.wrap(shortArray1);
        java.nio.ShortBuffer shortBuffer3 = shortBuffer2.asReadOnlyBuffer();
        java.nio.ShortBuffer shortBuffer4 = shortBuffer2.duplicate();
        java.nio.ShortBuffer shortBuffer5 = shortBuffer2.duplicate();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(shortBuffer4);
        org.junit.Assert.assertNotNull(shortBuffer5);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = descriptor0.toProto();
        boolean boolean2 = descriptorProto1.isInitialized();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions3 = descriptorProto1.getOptions();
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder4 = messageOptions3.newBuilderForType();
        com.google.protobuf.Message message5 = builder4.buildPartial();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder7 = builder4.removeUninterpretedOption((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(descriptorProto1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(messageOptions3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(message5);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto2 = builder0.buildPartial();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = builder0.clear();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder5 = builder3.setNumber((int) (short) 100);
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder6 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder8 = builder6.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder fileOptionsOrBuilder9 = builder8.getOptionsOrBuilder();
        byte[] byteArray10 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite11 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions12 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray10, extensionRegistryLite11);
        com.google.protobuf.CodedOutputStream codedOutputStream15 = com.google.protobuf.CodedOutputStream.newInstance(byteArray10, (int) (short) 0, 1);
        com.google.protobuf.CodedOutputStream codedOutputStream18 = com.google.protobuf.CodedOutputStream.newInstance(byteArray10, (int) ' ', 0);
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder19 = builder8.mergeFrom(byteArray10);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder20 = builder3.mergeFrom(byteArray10);
        byte[] byteArray21 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite22 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions23 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray21, extensionRegistryLite22);
        com.google.protobuf.CodedInputStream codedInputStream26 = com.google.protobuf.CodedInputStream.newInstance(byteArray21, 16, (int) 'a');
        int int28 = codedInputStream26.pushLimit((int) 'a');
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder30 = builder20.mergeFrom(codedInputStream26, extensionRegistryLite29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(fieldDescriptorProto2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(fileOptionsOrBuilder9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(methodOptions12);
        org.junit.Assert.assertNotNull(codedOutputStream15);
        org.junit.Assert.assertNotNull(codedOutputStream18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(methodOptions23);
        org.junit.Assert.assertNotNull(codedInputStream26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.google.javascript.jscomp.FunctionInformationMap.Module module0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap.Module.Builder builder1 = com.google.javascript.jscomp.FunctionInformationMap.Module.newBuilder(module0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.google.javascript.jscomp.WarningsGuard.Priority priority0 = com.google.javascript.jscomp.WarningsGuard.Priority.MIN;
        org.junit.Assert.assertTrue("'" + priority0 + "' != '" + com.google.javascript.jscomp.WarningsGuard.Priority.MIN + "'", priority0.equals(com.google.javascript.jscomp.WarningsGuard.Priority.MIN));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange extensionRange6 = com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.parseFrom(codedInputStream5);
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
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.google.javascript.jscomp.CssRenamingMap.Style style0 = com.google.javascript.jscomp.CssRenamingMap.Style.BY_WHOLE;
        org.junit.Assert.assertTrue("'" + style0 + "' != '" + com.google.javascript.jscomp.CssRenamingMap.Style.BY_WHOLE + "'", style0.equals(com.google.javascript.jscomp.CssRenamingMap.Style.BY_WHOLE));
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto1 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.parseFrom(inputStream0);
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder2 = enumValueDescriptorProto1.toBuilder();
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder4 = builder2.setName("ISO");
        java.util.Map<com.google.protobuf.Descriptors.FieldDescriptor, java.lang.Object> fieldDescriptorMap5 = builder2.getAllFields();
        org.junit.Assert.assertNotNull(enumValueDescriptorProto1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(fieldDescriptorMap5);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        com.google.javascript.jscomp.SourceAst sourceAst4 = null;
        com.google.javascript.rhino.InputId inputId5 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput(sourceAst4, inputId5, true);
        com.google.javascript.jscomp.SourceAst sourceAst8 = null;
        com.google.javascript.rhino.InputId inputId9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = new com.google.javascript.jscomp.CompilerInput(sourceAst8, inputId9, true);
        com.google.javascript.rhino.InputId inputId12 = compilerInput11.getInputId();
        com.google.javascript.jscomp.SourceAst sourceAst13 = null;
        com.google.javascript.rhino.InputId inputId14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = new com.google.javascript.jscomp.CompilerInput(sourceAst13, inputId14, true);
        com.google.javascript.rhino.InputId inputId17 = compilerInput16.getInputId();
        com.google.javascript.jscomp.SourceAst sourceAst18 = null;
        com.google.javascript.rhino.InputId inputId19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = new com.google.javascript.jscomp.CompilerInput(sourceAst18, inputId19, true);
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler23.getErrorManager();
        compilerInput21.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler23);
        com.google.javascript.jscomp.SourceAst sourceAst26 = null;
        com.google.javascript.rhino.InputId inputId27 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput29 = new com.google.javascript.jscomp.CompilerInput(sourceAst26, inputId27, true);
        com.google.javascript.rhino.InputId inputId30 = compilerInput29.getInputId();
        com.google.javascript.jscomp.SourceAst sourceAst31 = null;
        com.google.javascript.rhino.InputId inputId32 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput34 = new com.google.javascript.jscomp.CompilerInput(sourceAst31, inputId32, true);
        com.google.javascript.jscomp.SourceAst sourceAst35 = null;
        com.google.javascript.rhino.InputId inputId36 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput38 = new com.google.javascript.jscomp.CompilerInput(sourceAst35, inputId36, true);
        java.io.PrintStream printStream39 = null;
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler(printStream39);
        com.google.javascript.jscomp.ErrorManager errorManager41 = compiler40.getErrorManager();
        compilerInput38.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler40);
        com.google.javascript.jscomp.SourceAst sourceAst43 = null;
        com.google.javascript.rhino.InputId inputId44 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput46 = new com.google.javascript.jscomp.CompilerInput(sourceAst43, inputId44, true);
        com.google.javascript.jscomp.CompilerInput[] compilerInputArray47 = new com.google.javascript.jscomp.CompilerInput[] { compilerInput34, compilerInput38, compilerInput46 };
        com.google.common.collect.ImmutableSet<com.google.javascript.jscomp.CompilerInput> compilerInputSet48 = com.google.common.collect.ImmutableSet.of(compilerInput3, compilerInput7, compilerInput11, compilerInput16, compilerInput21, compilerInput29, compilerInputArray47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = compilerInput11.getLine(64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNull(inputId17);
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertNotNull(errorManager41);
        org.junit.Assert.assertNotNull(compilerInputArray47);
        org.junit.Assert.assertNotNull(compilerInputSet48);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        compilerInput3.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler5);
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler5.getCodingConvention();
        java.lang.String str9 = codingConvention8.getGlobalObject();
        boolean boolean11 = codingConvention8.isConstant("");
        java.lang.String str12 = codingConvention8.getGlobalObject();
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.global" + "'", str9, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean4 = node3.isFromExterns();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean9 = node8.isFromExterns();
        java.lang.String str10 = node8.toString();
        com.google.javascript.rhino.Node node11 = node3.copyInformationFrom(node8);
        int int12 = node3.getSourceOffset();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NUMBER 52.0 0" + "'", str10, "NUMBER 52.0 0");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.FileOptions fileOptions1 = builder0.getDefaultInstanceForType();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder3 = builder0.setPyGenericServices(false);
        byte[] byteArray4 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite5 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions6 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray4, extensionRegistryLite5);
        com.google.protobuf.CodedInputStream codedInputStream9 = com.google.protobuf.CodedInputStream.newInstance(byteArray4, 16, (int) 'a');
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.Message.Builder builder11 = builder0.mergeFrom(codedInputStream9, extensionRegistryLite10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(fileOptions1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(methodOptions6);
        org.junit.Assert.assertNotNull(codedInputStream9);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.util.Set<java.lang.String> strSet1 = strMap0.keySet();
        java.util.Iterator<java.lang.String> strItor2 = strSet1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            strItor2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strItor2);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto1 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.parseFrom(inputStream0);
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder2 = enumValueDescriptorProto1.toBuilder();
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder4 = builder2.setName("ISO");
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto5 = builder4.getDefaultInstanceForType();
        org.junit.Assert.assertNotNull(enumValueDescriptorProto1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(enumValueDescriptorProto5);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(100);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        java.util.stream.LongStream longStream7 = java.util.stream.LongStream.of((long) (-1));
        com.google.common.collect.ImmutableMap<com.google.javascript.jscomp.Compiler, java.util.stream.LongStream> compilerMap8 = com.google.common.collect.ImmutableMap.of(compiler4, longStream7);
        java.util.stream.DoubleStream doubleStream9 = longStream7.asDoubleStream();
        double[] doubleArray10 = doubleStream9.toArray();
        java.nio.DoubleBuffer doubleBuffer11 = doubleBuffer2.put(doubleArray10);
        java.nio.DoubleBuffer doubleBuffer14 = doubleBuffer2.put(10, (double) '/');
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(compilerMap8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleBuffer11);
        org.junit.Assert.assertNotNull(doubleBuffer14);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset4);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset4);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.minusDays((long) (short) 100);
        java.lang.String str9 = offsetDateTime6.toString();
        java.time.LocalTime localTime10 = offsetDateTime6.toLocalTime();
        java.time.LocalTime localTime12 = localTime10.withNano(28);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T00:00:52+00:00:52" + "'", str9, "1970-01-01T00:00:52+00:00:52");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset4);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset4);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.minusDays((long) (short) 100);
        java.time.OffsetDateTime offsetDateTime10 = offsetDateTime6.plusYears((long) (short) 10);
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset14);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset19);
        java.time.ZonedDateTime zonedDateTime21 = java.time.ZonedDateTime.of(localDateTime15, (java.time.ZoneId) zoneOffset19);
        java.time.ZonedDateTime zonedDateTime23 = zonedDateTime21.withHour(16);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime24 = zonedDateTime23.toLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal25 = offsetDateTime6.adjustInto((java.time.temporal.Temporal) localDateChronoLocalDateTime24);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: OffsetSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime10);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime24);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean6 = node5.isStringKey();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean11 = node10.isVar();
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] { node5, node10 };
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, nodeArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) 100, nodeArray12);
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
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.google.protobuf.DescriptorProtos.EnumValueOptions enumValueOptions0 = com.google.protobuf.DescriptorProtos.EnumValueOptions.getDefaultInstance();
        com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder builder1 = com.google.protobuf.DescriptorProtos.EnumValueOptions.newBuilder(enumValueOptions0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions2.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat5 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions2.errorFormat = errorFormat5;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy7 = null;
        compilerOptions2.variableRenaming = variableRenamingPolicy7;
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode9 = compilerOptions2.getTracerMode();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder10 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder12 = builder10.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder13 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label14 = builder13.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder15 = builder10.addExtension(builder13);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder16 = builder10.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder17 = builder16.getOptionsBuilder();
        java.io.InputStream inputStream18 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions19 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream18);
        boolean boolean20 = enumOptions19.isInitialized();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder21 = builder17.mergeFrom(enumOptions19);
        byte[] byteArray22 = enumOptions19.toByteArray();
        compilerOptions2.setInputPropertyMapSerialized(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder builder26 = builder1.mergeFrom(byteArray22, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(enumValueOptions0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(errorFormat5);
        org.junit.Assert.assertTrue("'" + tracerMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode9.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + label14 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label14.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(enumOptions19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = descriptor0.toProto();
        boolean boolean2 = descriptorProto1.isInitialized();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions3 = descriptorProto1.getOptions();
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder4 = messageOptions3.newBuilderForType();
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder6 = builder4.setMessageSetWireFormat(false);
        byte[] byteArray7 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite8 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions9 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray7, extensionRegistryLite8);
        com.google.protobuf.CodedInputStream codedInputStream12 = com.google.protobuf.CodedInputStream.newInstance(byteArray7, 16, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder13 = builder6.mergeFrom(codedInputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(descriptorProto1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(messageOptions3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(methodOptions9);
        org.junit.Assert.assertNotNull(codedInputStream12);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.google.common.collect.ImmutableSet.Builder<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>> strMapBuilder0 = new com.google.common.collect.ImmutableSet.Builder<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>>();
        com.google.common.collect.ImmutableCollection<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>> strMapCollection1 = strMapBuilder0.build();
        org.junit.Assert.assertNotNull(strMapCollection1);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean4 = node3.isStringKey();
        boolean boolean5 = node3.isThrow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = null;
        node3.setJSDocInfo(jSDocInfo6);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile8 = node3.getStaticSourceFile();
        boolean boolean9 = node3.isInc();
        com.google.javascript.rhino.Node node10 = node3.getParent();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        int int0 = java.util.Spliterator.ORDERED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        int int1 = com.google.protobuf.CodedOutputStream.computeBoolSizeNoTag(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        java.util.Set<java.time.temporal.TemporalField> temporalFieldSet2 = dateTimeFormatter1.getResolverFields();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime3 = java.time.OffsetTime.parse((java.lang.CharSequence) "\ub300\ud55c\ubbfc\uad6d", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '???????????' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNull(temporalFieldSet2);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean5 = node4.isFromExterns();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(1);
        com.google.javascript.rhino.Node node8 = node4.clonePropsFrom(node7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(16384, node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        java.util.stream.LongStream longStream4 = java.util.stream.LongStream.of((long) (-1));
        com.google.common.collect.ImmutableMap<com.google.javascript.jscomp.Compiler, java.util.stream.LongStream> compilerMap5 = com.google.common.collect.ImmutableMap.of(compiler1, longStream4);
        java.util.stream.DoubleStream doubleStream6 = longStream4.asDoubleStream();
        java.util.stream.LongStream longStream8 = longStream4.skip(0L);
        java.util.function.LongConsumer longConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            longStream8.forEach(longConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(compilerMap5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(longStream8);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy5 = null;
        compilerOptions0.variableRenaming = variableRenamingPolicy5;
        compilerOptions0.setRemoveUnusedLocalVars(false);
        compilerOptions0.setCheckTypes(true);
        org.junit.Assert.assertNotNull(errorFormat3);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = descriptor0.toProto();
        boolean boolean2 = descriptorProto1.isInitialized();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions3 = descriptorProto1.getOptions();
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder4 = messageOptions3.newBuilderForType();
        int int5 = messageOptions3.getUninterpretedOptionCount();
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(descriptorProto1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(messageOptions3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        java.util.stream.LongStream longStream4 = java.util.stream.LongStream.of((long) (-1));
        com.google.common.collect.ImmutableMap<com.google.javascript.jscomp.Compiler, java.util.stream.LongStream> compilerMap5 = com.google.common.collect.ImmutableMap.of(compiler1, longStream4);
        java.io.PrintStream printStream6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(printStream6);
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromFile("/");
        com.google.javascript.jscomp.SourceFile.Generator generator12 = null;
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator12);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat17 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions14.errorFormat = errorFormat17;
        compilerOptions14.setRemoveDeadCode(false);
        com.google.javascript.jscomp.Result result21 = compiler7.compile(sourceFile10, sourceFile13, compilerOptions14);
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler23.getErrorManager();
        com.google.javascript.jscomp.SourceFile sourceFile26 = com.google.javascript.jscomp.SourceFile.fromFile("/");
        com.google.javascript.jscomp.SourceFile.Generator generator28 = null;
        com.google.javascript.jscomp.SourceFile sourceFile29 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions30.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat33 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions30.errorFormat = errorFormat33;
        compilerOptions30.setRemoveDeadCode(false);
        com.google.javascript.jscomp.Result result37 = compiler23.compile(sourceFile26, sourceFile29, compilerOptions30);
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions38.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat41 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions38.errorFormat = errorFormat41;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy43 = null;
        compilerOptions38.variableRenaming = variableRenamingPolicy43;
        compilerOptions38.setSummaryDetailLevel(999);
        boolean boolean47 = compilerOptions38.getInferTypes();
        boolean boolean48 = compilerOptions38.ideMode;
        compilerOptions38.setGroupVariableDeclarations(true);
        compilerOptions38.optimizeReturns = false;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result53 = compiler1.compile(sourceFile13, sourceFile26, compilerOptions38);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(compilerMap5);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertNotNull(errorFormat17);
        org.junit.Assert.assertNotNull(result21);
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(sourceFile26);
        org.junit.Assert.assertNotNull(sourceFile29);
        org.junit.Assert.assertNotNull(errorFormat33);
        org.junit.Assert.assertNotNull(result37);
        org.junit.Assert.assertNotNull(errorFormat41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean5 = node4.isStringKey();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node4);
        boolean boolean7 = node6.isFunction();
        boolean boolean8 = node6.isWhile();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.google.protobuf.Descriptors.FieldDescriptor.JavaType javaType0 = com.google.protobuf.Descriptors.FieldDescriptor.JavaType.DOUBLE;
        org.junit.Assert.assertTrue("'" + javaType0 + "' != '" + com.google.protobuf.Descriptors.FieldDescriptor.JavaType.DOUBLE + "'", javaType0.equals(com.google.protobuf.Descriptors.FieldDescriptor.JavaType.DOUBLE));
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        int int0 = com.google.javascript.rhino.Node.POST_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder builder0 = com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.newBuilder();
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
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = descriptor0.toProto();
        boolean boolean2 = descriptorProto1.isInitialized();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto3 = descriptorProto1.getDefaultInstanceForType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto5 = descriptorProto3.getExtension(999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 999");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(descriptorProto1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(descriptorProto3);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset27);
        int int29 = localDateTime28.getYear();
        java.time.Instant instant30 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset34 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset34);
        java.time.OffsetDateTime offsetDateTime36 = java.time.OffsetDateTime.ofInstant(instant30, (java.time.ZoneId) zoneOffset34);
        java.time.Instant instant37 = localDateTime28.toInstant(zoneOffset34);
        boolean boolean38 = appendableSet23.equals((java.lang.Object) zoneOffset34);
        java.lang.Object[] objArray39 = appendableSet23.toArray();
        java.util.concurrent.TimeUnit timeUnit40 = java.util.concurrent.TimeUnit.HOURS;
        boolean boolean41 = appendableSet23.contains((java.lang.Object) timeUnit40);
        com.google.common.collect.ImmutableList<java.lang.Appendable> appendableList42 = appendableSet23.asList();
        java.nio.CharBuffer charBuffer45 = java.nio.CharBuffer.allocate((int) ' ');
        boolean boolean46 = charBuffer45.isDirect();
        java.nio.CharBuffer charBuffer48 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer50 = charBuffer48.put('a');
        char[] charArray52 = new char[] { '4' };
        java.nio.CharBuffer charBuffer53 = charBuffer50.get(charArray52);
        java.nio.CharBuffer charBuffer54 = charBuffer50.compact();
        java.nio.CharBuffer charBuffer56 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer58 = charBuffer56.put('a');
        java.nio.CharBuffer charBuffer60 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer62 = charBuffer60.put('a');
        char[] charArray64 = new char[] { '4' };
        java.nio.CharBuffer charBuffer65 = charBuffer62.get(charArray64);
        java.nio.CharBuffer charBuffer66 = charBuffer62.compact();
        com.google.common.collect.ImmutableSet<java.lang.Appendable> appendableSet67 = com.google.common.collect.ImmutableSet.of((java.lang.Appendable) charBuffer45, (java.lang.Appendable) charBuffer50, (java.lang.Appendable) charBuffer56, (java.lang.Appendable) charBuffer66);
        java.nio.CharBuffer charBuffer68 = java.nio.CharBuffer.wrap((java.lang.CharSequence) charBuffer45);
        java.nio.CharBuffer charBuffer69 = charBuffer45.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            appendableList42.add(1, (java.lang.Appendable) charBuffer69);
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
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1970 + "'", int29 == 1970);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(zoneOffset34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(offsetDateTime36);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000, \000\000, \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000, \000\000, \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000]");
        org.junit.Assert.assertNotNull(timeUnit40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(appendableList42);
        org.junit.Assert.assertNotNull(charBuffer45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(charBuffer48);
        org.junit.Assert.assertNotNull(charBuffer50);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer53);
        org.junit.Assert.assertNotNull(charBuffer54);
        org.junit.Assert.assertNotNull(charBuffer56);
        org.junit.Assert.assertNotNull(charBuffer58);
        org.junit.Assert.assertNotNull(charBuffer60);
        org.junit.Assert.assertNotNull(charBuffer62);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer65);
        org.junit.Assert.assertNotNull(charBuffer66);
        org.junit.Assert.assertNotNull(appendableSet67);
        org.junit.Assert.assertNotNull(charBuffer68);
        org.junit.Assert.assertNotNull(charBuffer69);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        compilerInput3.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler5);
        com.google.javascript.jscomp.Scope scope8 = compiler5.getTopScope();
        java.lang.String str11 = compiler5.getSourceLine("US-ASCII", 0);
        com.google.javascript.jscomp.CodingConvention codingConvention12 = compiler5.getCodingConvention();
        int int13 = compiler5.getWarningCount();
        java.lang.String str14 = compiler5.toSource();
        int int15 = compiler5.getErrorCount();
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(codingConvention12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.google.common.collect.ImmutableSet.Builder<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>> strMapBuilder0 = new com.google.common.collect.ImmutableSet.Builder<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>>();
        com.google.common.collect.ImmutableSet.Builder<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>> strMapBuilder1 = new com.google.common.collect.ImmutableSet.Builder<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>>();
        com.google.common.collect.ImmutableSet.Builder<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>> strMapBuilder2 = new com.google.common.collect.ImmutableSet.Builder<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>>();
        com.google.common.collect.ImmutableSet<com.google.common.collect.ImmutableCollection.Builder<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>>> strMapBuilderSet3 = com.google.common.collect.ImmutableSet.of((com.google.common.collect.ImmutableCollection.Builder<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>>) strMapBuilder0, (com.google.common.collect.ImmutableCollection.Builder<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>>) strMapBuilder1, (com.google.common.collect.ImmutableCollection.Builder<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>>) strMapBuilder2);
        org.junit.Assert.assertNotNull(strMapBuilderSet3);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative0 = com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE;
        org.junit.Assert.assertTrue("'" + jSTypeNative0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE + "'", jSTypeNative0.equals(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE));
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.google.javascript.jscomp.FunctionInformationMap.Module.Builder builder0 = com.google.javascript.jscomp.FunctionInformationMap.Module.newBuilder();
        java.io.InputStream inputStream1 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2 = null;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = com.google.javascript.jscomp.FunctionInformationMap.parseFrom(inputStream1, extensionRegistryLite2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap.Module.Builder builder4 = builder0.mergeFrom((com.google.protobuf.Message) functionInformationMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: mergeFrom(Message) can only merge messages of the same type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(functionInformationMap3);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        int int1 = com.google.protobuf.CodedOutputStream.computeFloatSizeNoTag((float) 64);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.MILLI_OF_SECOND;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.MILLI_OF_SECOND + "'", chronoField0.equals(java.time.temporal.ChronoField.MILLI_OF_SECOND));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder uninterpretedOptionOrBuilder2 = builder0.getUninterpretedOptionOrBuilder(39);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 39");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        java.util.List<com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder> builderList3 = builder0.getServiceBuilderList();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor4 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean10 = node9.isVar();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean15 = node14.isStringKey();
        boolean boolean16 = node14.isThrow();
        boolean boolean17 = node14.isVarArgs();
        boolean boolean18 = node14.isHook();
        com.google.javascript.rhino.Node node19 = node14.cloneNode();
        com.google.javascript.rhino.Node node20 = node9.useSourceInfoIfMissingFromForTree(node19);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean25 = node24.isFromExterns();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean30 = node29.isFromExterns();
        java.lang.String str31 = node29.toString();
        com.google.javascript.rhino.Node node32 = node24.copyInformationFrom(node29);
        int int33 = node24.getLineno();
        boolean boolean34 = node24.isLabel();
        java.lang.String str35 = node24.getSourceFileName();
        boolean boolean36 = node24.isDec();
        com.google.javascript.rhino.Node node37 = node19.useSourceInfoFrom(node24);
        boolean boolean38 = node19.isFor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder39 = builder0.setRepeatedField(fieldDescriptor4, (int) (byte) 10, (java.lang.Object) boolean38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builderList3);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "NUMBER 52.0 0" + "'", str31, "NUMBER 52.0 0");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative0 = com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
        org.junit.Assert.assertTrue("'" + jSTypeNative0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE + "'", jSTypeNative0.equals(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE));
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            codedInputStream5.skipMessage();
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
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        java.util.stream.LongStream longStream4 = java.util.stream.LongStream.of((long) (-1));
        com.google.common.collect.ImmutableMap<com.google.javascript.jscomp.Compiler, java.util.stream.LongStream> compilerMap5 = com.google.common.collect.ImmutableMap.of(compiler1, longStream4);
        java.util.stream.DoubleStream doubleStream6 = longStream4.asDoubleStream();
        java.util.OptionalDouble optionalDouble7 = doubleStream6.findAny();
        doubleStream6.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.PrimitiveIterator.OfDouble ofDouble9 = doubleStream6.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(compilerMap5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(optionalDouble7);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        java.util.stream.LongStream longStream4 = java.util.stream.LongStream.of((long) (-1));
        com.google.common.collect.ImmutableMap<com.google.javascript.jscomp.Compiler, java.util.stream.LongStream> compilerMap5 = com.google.common.collect.ImmutableMap.of(compiler1, longStream4);
        compiler1.reportCodeChange();
        com.google.javascript.rhino.Node node7 = compiler1.getRoot();
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(compilerMap5);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        int int0 = com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.END_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean4 = node3.isFromExterns();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(1);
        com.google.javascript.rhino.Node node7 = node3.clonePropsFrom(node6);
        node6.setType(37);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime10.withYear((int) (short) 1);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField13.getBaseUnit();
        java.time.ZonedDateTime zonedDateTime15 = zonedDateTime10.truncatedTo(temporalUnit14);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime17 = zonedDateTime15.withMinute((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): -1");
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
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset7);
        int int9 = localDateTime8.getYear();
        java.time.LocalDate localDate10 = localDateTime8.toLocalDate();
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset14);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset19);
        java.time.ZonedDateTime zonedDateTime21 = java.time.ZonedDateTime.of(localDateTime15, (java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField23 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit24 = chronoField23.getBaseUnit();
        java.time.LocalDateTime localDateTime25 = localDateTime15.plus((long) 1970, temporalUnit24);
        java.time.LocalTime localTime26 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime25);
        java.time.ZoneOffset zoneOffset30 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime31 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset30);
        java.time.OffsetDateTime offsetDateTime32 = java.time.OffsetDateTime.of(localDate10, localTime26, zoneOffset30);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean37 = node36.isFromExterns();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean42 = node41.isFromExterns();
        java.lang.String str43 = node41.toString();
        com.google.javascript.rhino.Node node44 = node36.copyInformationFrom(node41);
        boolean boolean45 = zoneOffset30.equals((java.lang.Object) node41);
        boolean boolean46 = node41.isVar();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean51 = node50.isFromExterns();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean56 = node55.isFromExterns();
        java.lang.String str57 = node55.toString();
        com.google.javascript.rhino.Node node58 = node50.copyInformationFrom(node55);
        int int59 = node50.getLineno();
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, false);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSTypeRegistry62.createObjectType(objectType63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, false);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = jSTypeRegistry67.createObjectType(objectType68);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair70 = objectType64.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType69);
        java.lang.String str71 = objectType69.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, false);
        com.google.javascript.rhino.jstype.ObjectType objectType75 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType76 = jSTypeRegistry74.createObjectType(objectType75);
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77, false);
        com.google.javascript.rhino.jstype.ObjectType objectType80 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSTypeRegistry79.createObjectType(objectType80);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair82 = objectType76.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType81);
        boolean boolean83 = objectType81.isTemplateType();
        com.google.javascript.rhino.jstype.JSType jSType84 = objectType69.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) objectType81);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry2.createConstructorType("Named type with empty name component", node41, node50, jSType84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertTrue("'" + chronoField23 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField23.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit24 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit24.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(zoneOffset30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "NUMBER 52.0 0" + "'", str43, "NUMBER 52.0 0");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "NUMBER 52.0 0" + "'", str57, "NUMBER 52.0 0");
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(typePair70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertNotNull(typePair82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jSType84);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        java.io.InputStream inputStream1 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2 = null;
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = builder0.mergeFrom(inputStream1, extensionRegistryLite2);
        com.google.protobuf.CodedInputStream codedInputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder5 = builder0.mergeFrom(codedInputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto2 = builder0.buildPartial();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = fieldDescriptorProto2.newBuilderForType();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder4 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder(fieldDescriptorProto2);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = builder4.getField(fieldDescriptor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(fieldDescriptorProto2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
            com.google.javascript.rhino.jstype.JSType jSType13 = enumType12.getParameterType();
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
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = jSTypeRegistry7.createObjectType(objectType8);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair10 = objectType4.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType9);
        boolean boolean12 = objectType4.isPropertyInExterns("hi!");
        boolean boolean13 = objectType4.isTemplateType();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(typePair10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        jSTypeRegistry2.identifyNonNullableName("/");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean11 = node10.isStringKey();
        boolean boolean12 = node10.isThrow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = null;
        node10.setJSDocInfo(jSDocInfo13);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile15 = node10.getStaticSourceFile();
        boolean boolean16 = node10.isInc();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair28 = objectType22.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType27);
        java.lang.String str29 = objectType27.getDisplayName();
        objectType27.clearResolved();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType31 = jSTypeRegistry2.createFromTypeNodes(node10, "{1572375491}", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: NUMBER 52.0 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(typePair28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.google.javascript.jscomp.DiagnosticType diagnosticType2 = com.google.javascript.jscomp.DiagnosticType.warning("", "Unknown class name");
        java.text.MessageFormat messageFormat3 = diagnosticType2.format;
        java.text.Format[] formatArray4 = messageFormat3.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = messageFormat3.parse("ISO");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(diagnosticType2);
        org.junit.Assert.assertNotNull(messageFormat3);
        org.junit.Assert.assertNotNull(formatArray4);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = descriptor0.toProto();
        boolean boolean2 = descriptorProto1.isInitialized();
        int int3 = descriptorProto1.getExtensionCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder fieldDescriptorProtoOrBuilder5 = descriptorProto1.getExtensionOrBuilder(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 16");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(descriptorProto1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location location2 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.parseDelimitedFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.google.common.collect.Ordering<java.lang.Object> objOrdering0 = com.google.common.collect.Ordering.arbitrary();
        org.junit.Assert.assertNotNull(objOrdering0);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet3 = booleanLiteralSet1.intersection(booleanLiteralSet2);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = booleanLiteralSet0.intersection(booleanLiteralSet2);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet2 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet2.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet3 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet3.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output2 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream4 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output2, (int) 'a');
        byte[] byteArray5 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions7 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray5, extensionRegistryLite6);
        output2.write(byteArray5);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder9 = builder0.mergeFrom(byteArray5);
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions10 = builder0.buildPartial();
        com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder builder11 = builder0.addUninterpretedOptionBuilder();
        com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder builder13 = builder11.addName(builder12);
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
        org.junit.Assert.assertNotNull(methodOptions10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.google.protobuf.UnknownFieldSet.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.UnknownFieldSet.Field.Builder builder1 = com.google.protobuf.UnknownFieldSet.Field.newBuilder(field0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.google.javascript.jscomp.FunctionInformationMap.Entry entry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap.Entry.Builder builder1 = com.google.javascript.jscomp.FunctionInformationMap.Entry.newBuilder(entry0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        com.google.protobuf.DescriptorProtos.DescriptorProto.Builder builder27 = descriptorProto22.newBuilderForType();
        java.util.List<com.google.protobuf.DescriptorProtos.DescriptorProto> descriptorProtoList28 = builder27.getNestedTypeList();
        com.google.protobuf.UnknownFieldSet unknownFieldSet29 = builder27.getUnknownFields();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = builder27.getRepeatedFieldCount(fieldDescriptor30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(descriptorProtoList28);
        org.junit.Assert.assertNotNull(unknownFieldSet29);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.google.javascript.jscomp.ErrorFormat errorFormat0 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        java.io.PrintStream printStream1 = null;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(printStream1);
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler2.getErrorManager();
        com.google.javascript.jscomp.MessageFormatter messageFormatter5 = errorFormat0.toFormatter((com.google.javascript.jscomp.SourceExcerptProvider) compiler2, false);
        com.google.javascript.jscomp.SourceAst sourceAst6 = null;
        com.google.javascript.rhino.InputId inputId7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput(sourceAst6, inputId7, true);
        java.io.PrintStream printStream10 = null;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(printStream10);
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        compilerInput9.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler11);
        com.google.javascript.jscomp.Scope scope14 = compiler11.getTopScope();
        java.lang.String str17 = compiler11.getSourceLine("US-ASCII", 0);
        com.google.javascript.jscomp.CodingConvention codingConvention18 = compiler11.getCodingConvention();
        int int19 = compiler11.getWarningCount();
        com.google.javascript.jscomp.MessageFormatter messageFormatter21 = errorFormat0.toFormatter((com.google.javascript.jscomp.SourceExcerptProvider) compiler11, true);
        org.junit.Assert.assertNotNull(errorFormat0);
        org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(messageFormatter5);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(codingConvention18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(messageFormatter21);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean5 = node4.isStringKey();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node4);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable7 = node4.getAncestors();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator8 = ancestorIterable7.spliterator();
        int int9 = nodeSpliterator8.characteristics();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<? super com.google.javascript.rhino.Node> wildcardComparator10 = nodeSpliterator8.getComparator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ancestorIterable7);
        org.junit.Assert.assertNotNull(nodeSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.lang.String[] strArray28 = new java.lang.String[] { "1970-01-01+00:00:52", "US-ASCII", "ClockHourOfAmPm", "\ub300\ud55c\ubbfc\uad6d", "Exceeded max number of code motion iterations: {0}", "/tmp/hi!4516073975838273390ISO", "{1572375491}", "Unknown class name", "1970-03-24T02:02:32", "1970-01-01", "java.nio.HeapFloatBuffer[pos=0 lim=6 cap=6]", "{}", "South Korea", "NUMBER 52.0 0", "java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=12 cap=12]", "ISO", "ClockHourOfAmPm", "1970-03-24T02:02:32", "java.nio.HeapFloatBuffer[pos=0 lim=6 cap=6]", "{}", "Unknown class name", "Unknown class name", "{1572375491}", "goog.abstractMethod", "+00:00:52", "1970-01-01", "OptionalDouble[-1.0]", "South Korea" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.Iterator<java.lang.String> strItor31 = strList29.iterator();
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strItor31);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.google.javascript.jscomp.PerformanceTracker.Stats stats1 = new com.google.javascript.jscomp.PerformanceTracker.Stats("/tmp/hi!346938731537444595ISO");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = descriptor0.toProto();
        boolean boolean2 = descriptorProto1.isInitialized();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions3 = descriptorProto1.getOptions();
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder4 = messageOptions3.newBuilderForType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder uninterpretedOptionOrBuilder6 = builder4.getUninterpretedOptionOrBuilder(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(descriptorProto1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(messageOptions3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.ServiceOptions serviceOptions7 = com.google.protobuf.DescriptorProtos.ServiceOptions.parseFrom(codedInputStream5, extensionRegistryLite6);
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
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output2 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream4 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output2, (int) 'a');
        byte[] byteArray5 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions7 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray5, extensionRegistryLite6);
        output2.write(byteArray5);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder9 = builder0.mergeFrom(byteArray5);
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions10 = builder0.buildPartial();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = methodOptions10.getField(fieldDescriptor11);
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
        org.junit.Assert.assertNotNull(methodOptions10);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId1 = java.time.ZoneId.of("ClockHourOfAmPm");
            org.junit.Assert.fail("Expected exception of type java.time.zone.ZoneRulesException; message: Unknown time-zone ID: ClockHourOfAmPm");
        } catch (java.time.zone.ZoneRulesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto2 = builder0.buildPartial();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = fieldDescriptorProto2.newBuilderForType();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder4 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder(fieldDescriptorProto2);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor5 = null;
        java.time.ZoneOffset zoneOffset9 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset9);
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset14);
        java.time.ZonedDateTime zonedDateTime16 = java.time.ZonedDateTime.of(localDateTime10, (java.time.ZoneId) zoneOffset14);
        java.time.ZonedDateTime zonedDateTime18 = zonedDateTime16.withYear((int) (short) 1);
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit20 = chronoField19.getBaseUnit();
        java.time.ZonedDateTime zonedDateTime21 = zonedDateTime16.truncatedTo(temporalUnit20);
        java.time.Duration duration22 = temporalUnit20.getDuration();
        long long23 = duration22.toDays();
        java.time.Duration duration24 = duration22.abs();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder25 = builder4.addRepeatedField(fieldDescriptor5, (java.lang.Object) duration24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(fieldDescriptorProto2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(zoneOffset9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField19.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit20 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit20.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(duration24);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileDescriptorProto fileDescriptorProto7 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(codedInputStream5, extensionRegistryLite6);
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
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime10.plusDays((long) '4');
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime10.withMinute((int) '#');
        java.time.ZonedDateTime zonedDateTime15 = zonedDateTime14.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(zonedDateTime15);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.util.Date date3 = new java.util.Date((int) (byte) -1, 43, 16384);
        date3.setSeconds(4);
        java.util.Date date9 = new java.util.Date((int) (byte) -1, 43, 16384);
        int int10 = date3.compareTo(date9);
        org.junit.Assert.assertEquals(date3.toString(), "Mon Jun 09 00:00:04 UTC 1947");
        org.junit.Assert.assertEquals(date9.toString(), "Mon Jun 09 00:00:00 UTC 1947");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.util.logging.Level level0 = java.util.logging.Level.FINEST;
        org.junit.Assert.assertNotNull(level0);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        int int5 = localDateTime4.getYear();
        java.time.LocalDate localDate6 = localDateTime4.toLocalDate();
        java.time.LocalDate localDate8 = localDate6.plusDays((long) '#');
        java.time.LocalDate localDate9 = java.time.LocalDate.now();
        java.time.chrono.ChronoPeriod chronoPeriod10 = localDate6.until((java.time.chrono.ChronoLocalDate) localDate9);
        java.time.chrono.Chronology chronology11 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) localDate9);
        java.time.Instant instant12 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset16);
        java.time.ZoneOffset zoneOffset21 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset21);
        java.time.ZonedDateTime zonedDateTime23 = java.time.ZonedDateTime.of(localDateTime17, (java.time.ZoneId) zoneOffset21);
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit26 = chronoField25.getBaseUnit();
        java.time.LocalDateTime localDateTime27 = localDateTime17.plus((long) 1970, temporalUnit26);
        java.time.LocalDateTime localDateTime29 = localDateTime17.withHour((int) (short) 1);
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.OffsetDateTime offsetDateTime32 = java.time.OffsetDateTime.of(localDateTime17, zoneOffset31);
        java.time.OffsetTime offsetTime33 = java.time.OffsetTime.ofInstant(instant12, (java.time.ZoneId) zoneOffset31);
        java.time.Instant instant34 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime39 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset38);
        java.time.ZoneOffset zoneOffset43 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime44 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset43);
        java.time.ZonedDateTime zonedDateTime45 = java.time.ZonedDateTime.of(localDateTime39, (java.time.ZoneId) zoneOffset43);
        java.time.temporal.ChronoField chronoField47 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit48 = chronoField47.getBaseUnit();
        java.time.LocalDateTime localDateTime49 = localDateTime39.plus((long) 1970, temporalUnit48);
        java.time.LocalDateTime localDateTime51 = localDateTime39.withHour((int) (short) 1);
        java.time.ZoneOffset zoneOffset53 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.OffsetDateTime offsetDateTime54 = java.time.OffsetDateTime.of(localDateTime39, zoneOffset53);
        java.time.OffsetTime offsetTime55 = java.time.OffsetTime.ofInstant(instant34, (java.time.ZoneId) zoneOffset53);
        boolean boolean56 = offsetTime33.isAfter(offsetTime55);
        java.time.OffsetDateTime offsetDateTime57 = localDate9.atTime(offsetTime33);
        int int58 = offsetTime33.getHour();
        java.time.OffsetTime offsetTime60 = offsetTime33.withSecond((int) (short) 0);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronoPeriod10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField25.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit26 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit26.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
        org.junit.Assert.assertNotNull(offsetTime33);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(zoneOffset43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(zonedDateTime45);
        org.junit.Assert.assertTrue("'" + chronoField47 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField47.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit48 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit48.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(zoneOffset53);
        org.junit.Assert.assertNotNull(offsetDateTime54);
        org.junit.Assert.assertNotNull(offsetTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(offsetDateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(offsetTime60);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions1 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream0);
        boolean boolean2 = enumOptions1.isInitialized();
        int int3 = enumOptions1.getUninterpretedOptionCount();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = enumOptions1.getField(fieldDescriptor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(enumOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset4);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset4);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.minusDays((long) (short) 100);
        java.lang.String str9 = offsetDateTime6.toString();
        java.time.ZoneOffset zoneOffset10 = offsetDateTime6.getOffset();
        int int11 = offsetDateTime6.getDayOfYear();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T00:00:52+00:00:52" + "'", str9, "1970-01-01T00:00:52+00:00:52");
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        jSTypeRegistry2.identifyNonNullableName("/");
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean12 = node11.isFromExterns();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean17 = node16.isFromExterns();
        java.lang.String str18 = node16.toString();
        com.google.javascript.rhino.Node node19 = node11.copyInformationFrom(node16);
        int int20 = node11.getLineno();
        int int21 = node11.getType();
        boolean boolean22 = node11.isQuotedString();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, false);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair36 = objectType30.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType35);
        java.lang.String str37 = objectType35.getDisplayName();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection38 = jSTypeRegistry25.getDirectImplementors(objectType35);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry2.createObjectType("US-ASCII", node11, objectType35);
        boolean boolean40 = node11.isNull();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NUMBER 52.0 0" + "'", str18, "NUMBER 52.0 0");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 39 + "'", int21 == 39);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(typePair36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(functionTypeCollection38);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        typePosition0.setPositionInformation(50, 0, 50, 50);
        com.google.javascript.rhino.Node node6 = typePosition0.getItem();
        typePosition0.setPositionInformation(0, 28, 43, 0);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset4);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset4);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.minusDays((long) (short) 100);
        java.lang.String str9 = offsetDateTime6.toString();
        java.time.temporal.ChronoField chronoField10 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        int int11 = offsetDateTime6.get((java.time.temporal.TemporalField) chronoField10);
        java.time.OffsetDateTime offsetDateTime13 = offsetDateTime6.withDayOfMonth((int) (short) 10);
        java.time.ZoneOffset zoneOffset14 = offsetDateTime6.getOffset();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T00:00:52+00:00:52" + "'", str9, "1970-01-01T00:00:52+00:00:52");
        org.junit.Assert.assertTrue("'" + chronoField10 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField10.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertNotNull(offsetDateTime13);
        org.junit.Assert.assertNotNull(zoneOffset14);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        int int7 = codedInputStream5.pushLimit((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = codedInputStream5.readString();
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
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type type0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_UINT64;
        int int1 = type0.getNumber();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_UINT64 + "'", type0.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_UINT64));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.CodingErrorAction codingErrorAction2 = charsetDecoder1.malformedInputAction();
        float float3 = charsetDecoder1.maxCharsPerByte();
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer7 = charBuffer5.put('a');
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.CoderResult coderResult8 = charsetDecoder1.flush(charBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Current state = RESET, new state = FLUSHED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(codingErrorAction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(charBuffer7);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        int int0 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.NAME_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("/", jSTypeNative1);
        org.junit.Assert.assertTrue("'" + jSTypeNative1 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE + "'", jSTypeNative1.equals(com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.google.javascript.jscomp.CustomPassExecutionTime customPassExecutionTime0 = com.google.javascript.jscomp.CustomPassExecutionTime.AFTER_OPTIMIZATION_LOOP;
        org.junit.Assert.assertTrue("'" + customPassExecutionTime0 + "' != '" + com.google.javascript.jscomp.CustomPassExecutionTime.AFTER_OPTIMIZATION_LOOP + "'", customPassExecutionTime0.equals(com.google.javascript.jscomp.CustomPassExecutionTime.AFTER_OPTIMIZATION_LOOP));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder builder0 = com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.newBuilder();
        java.io.InputStream inputStream1 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2 = null;
        com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder builder3 = builder0.mergeFrom(inputStream1, extensionRegistryLite2);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = builder0.getField(fieldDescriptor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy5 = null;
        compilerOptions0.variableRenaming = variableRenamingPolicy5;
        compilerOptions0.setSummaryDetailLevel(999);
        compilerOptions0.renamePrefixNamespace = "1970-01-01";
        compilerOptions0.printInputDelimiter = false;
        org.junit.Assert.assertNotNull(errorFormat3);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder.getDescriptor();
        java.util.List<com.google.protobuf.Descriptors.FieldDescriptor> fieldDescriptorList1 = descriptor0.getFields();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor3 = descriptor0.findFieldByName("1970-01-01+00:00:52");
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(fieldDescriptorList1);
        org.junit.Assert.assertNull(fieldDescriptor3);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite> priorityMap0 = new java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>();
        java.lang.Object obj1 = priorityMap0.clone();
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder2 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.newBuilder();
        boolean boolean3 = priorityMap0.containsValue((java.lang.Object) builder2);
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder5 = builder2.setName("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=12 cap=12]");
        com.google.protobuf.ByteString byteString6 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder7 = builder2.mergeFrom(byteString6);
        com.google.protobuf.DescriptorProtos.ServiceOptions serviceOptions8 = com.google.protobuf.DescriptorProtos.ServiceOptions.parseFrom(byteString6);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = serviceOptions8.getRepeatedField(fieldDescriptor9, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(serviceOptions8);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        int int5 = localDateTime4.getYear();
        java.time.Instant instant6 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset10);
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.ofInstant(instant6, (java.time.ZoneId) zoneOffset10);
        java.time.Instant instant13 = localDateTime4.toInstant(zoneOffset10);
        java.time.ZoneOffset zoneOffset18 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime19 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset18);
        java.time.ZoneOffset zoneOffset23 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime24 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset23);
        java.time.ZonedDateTime zonedDateTime25 = java.time.ZonedDateTime.of(localDateTime19, (java.time.ZoneId) zoneOffset23);
        java.time.temporal.ChronoField chronoField27 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit28 = chronoField27.getBaseUnit();
        java.time.LocalDateTime localDateTime29 = localDateTime19.plus((long) 1970, temporalUnit28);
        java.time.ZoneOffset zoneOffset34 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset34);
        java.time.ZoneOffset zoneOffset39 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime40 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset39);
        java.time.ZonedDateTime zonedDateTime41 = java.time.ZonedDateTime.of(localDateTime35, (java.time.ZoneId) zoneOffset39);
        java.time.temporal.ChronoField chronoField43 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit44 = chronoField43.getBaseUnit();
        java.time.LocalDateTime localDateTime45 = localDateTime35.plus((long) 1970, temporalUnit44);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime46 = localDateTime29.minus((long) 43, temporalUnit44);
        java.time.Instant instant47 = instant13.plus((long) 16384, temporalUnit44);
        java.time.ZoneOffset zoneOffset51 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime52 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset51);
        java.time.ZoneOffset zoneOffset56 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime57 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset56);
        java.time.ZonedDateTime zonedDateTime58 = java.time.ZonedDateTime.of(localDateTime52, (java.time.ZoneId) zoneOffset56);
        java.time.ZonedDateTime zonedDateTime60 = zonedDateTime58.withHour(16);
        java.time.ZoneOffset zoneOffset64 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime65 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset64);
        java.time.ZoneOffset zoneOffset69 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime70 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset69);
        java.time.ZonedDateTime zonedDateTime71 = java.time.ZonedDateTime.of(localDateTime65, (java.time.ZoneId) zoneOffset69);
        java.time.ZonedDateTime zonedDateTime73 = zonedDateTime71.withYear((int) (short) 1);
        java.time.temporal.ChronoField chronoField74 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit75 = chronoField74.getBaseUnit();
        java.time.ZonedDateTime zonedDateTime76 = zonedDateTime71.truncatedTo(temporalUnit75);
        long long77 = instant13.until((java.time.temporal.Temporal) zonedDateTime60, temporalUnit75);
        boolean boolean78 = temporalUnit75.isDateBased();
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(zoneOffset23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertTrue("'" + chronoField27 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField27.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit28 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit28.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(zoneOffset34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(zoneOffset39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(zonedDateTime41);
        org.junit.Assert.assertTrue("'" + chronoField43 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField43.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit44 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit44.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime46);
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertNotNull(zoneOffset51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(zoneOffset56);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(zonedDateTime58);
        org.junit.Assert.assertNotNull(zonedDateTime60);
        org.junit.Assert.assertNotNull(zoneOffset64);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(zoneOffset69);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(zonedDateTime71);
        org.junit.Assert.assertNotNull(zonedDateTime73);
        org.junit.Assert.assertTrue("'" + chronoField74 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField74.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit75 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit75.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(zonedDateTime76);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 16L + "'", long77 == 16L);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset4);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset4);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.minusDays((long) (short) 100);
        java.lang.String str9 = offsetDateTime6.toString();
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime6.minusMonths(0L);
        java.time.DayOfWeek dayOfWeek12 = java.time.DayOfWeek.from((java.time.temporal.TemporalAccessor) offsetDateTime11);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T00:00:52+00:00:52" + "'", str9, "1970-01-01T00:00:52+00:00:52");
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertTrue("'" + dayOfWeek12 + "' != '" + java.time.DayOfWeek.THURSDAY + "'", dayOfWeek12.equals(java.time.DayOfWeek.THURSDAY));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.ByteString byteString2 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = builder0.mergeFrom(byteString2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = byteString2.toString("");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(byteString2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = descriptor0.toProto();
        boolean boolean2 = descriptorProto1.isInitialized();
        int int3 = descriptorProto1.getExtensionCount();
        int int4 = descriptorProto1.getFieldCount();
        int int5 = descriptorProto1.getFieldCount();
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(descriptorProto1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.google.protobuf.DescriptorProtos.FileOptions fileOptions0 = com.google.protobuf.DescriptorProtos.FileOptions.getDefaultInstance();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = fileOptions0.getField(fieldDescriptor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileOptions0);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES;
        com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES = diagnosticGroup0;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        int int1 = com.google.protobuf.CodedOutputStream.computeInt64SizeNoTag((long) 2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumValueOptions enumValueOptions6 = com.google.protobuf.DescriptorProtos.EnumValueOptions.parseFrom(codedInputStream5);
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
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        java.nio.CharBuffer charBuffer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer25 = charBuffer12.put(charBuffer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        int int0 = com.google.javascript.rhino.Node.MAX_COLUMN_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4095 + "'", int0 == 4095);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.getDescriptor();
        java.lang.String str1 = descriptor0.getName();
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MethodDescriptorProto" + "'", str1, "MethodDescriptorProto");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder1 = builder0.clearCcGenericServices();
        boolean boolean2 = builder0.isInitialized();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = builder0.getRepeatedFieldCount(fieldDescriptor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = jSTypeRegistry7.createObjectType(objectType8);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair10 = objectType4.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType9);
        boolean boolean11 = objectType9.isTemplateType();
        com.google.javascript.rhino.jstype.EnumType enumType12 = objectType9.toMaybeEnumType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType.Property property14 = enumType12.getSlot("iso8601");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(typePair10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(enumType12);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite> priorityMap0 = new java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>();
        java.lang.Object obj1 = priorityMap0.clone();
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder2 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.newBuilder();
        boolean boolean3 = priorityMap0.containsValue((java.lang.Object) builder2);
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder5 = builder2.setName("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=12 cap=12]");
        boolean boolean6 = builder2.hasOptions();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = builder2.getRepeatedField(fieldDescriptor7, 4095);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder3 = builder2.clearSourceCodeInfo();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder4 = builder2.getSourceCodeInfoBuilder();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo5 = builder4.getDefaultInstanceForType();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder6 = sourceCodeInfo5.newBuilderForType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder locationOrBuilder8 = sourceCodeInfo5.getLocationOrBuilder((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(sourceCodeInfo5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldOptions fieldOptions1 = com.google.protobuf.DescriptorProtos.FieldOptions.parseFrom(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo2 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.parseFrom(inputStream0, extensionRegistryLite1);
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder3 = sourceCodeInfo2.newBuilderForType();
        com.google.protobuf.UnknownFieldSet unknownFieldSet4 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder5 = builder3.setUnknownFields(unknownFieldSet4);
        java.util.Map<com.google.protobuf.Descriptors.FieldDescriptor, java.lang.Object> fieldDescriptorMap6 = builder3.getAllFields();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder7 = builder3.clearLocation();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor8 = null;
        java.util.stream.Collector.Characteristics characteristics10 = java.util.stream.Collector.Characteristics.CONCURRENT;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder builder11 = builder7.setRepeatedField(fieldDescriptor8, 12, (java.lang.Object) characteristics10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceCodeInfo2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(fieldDescriptorMap6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + characteristics10 + "' != '" + java.util.stream.Collector.Characteristics.CONCURRENT + "'", characteristics10.equals(java.util.stream.Collector.Characteristics.CONCURRENT));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        int int0 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.LOCATION_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.range((long) 1, (long) (short) 1);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
            com.google.protobuf.Message.Builder builder11 = builder9.newBuilderForField(fieldDescriptor10);
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

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHoursMinutesSeconds(52, 152, 999);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset hours not in valid range: value 52 is not in the range -18 to 18");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        java.time.DayOfWeek dayOfWeek0 = java.time.DayOfWeek.FRIDAY;
        java.time.DayOfWeek dayOfWeek2 = dayOfWeek0.minus((long) ':');
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant3 = java.time.Instant.from((java.time.temporal.TemporalAccessor) dayOfWeek0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain Instant from TemporalAccessor: FRIDAY of type java.time.DayOfWeek");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dayOfWeek0 + "' != '" + java.time.DayOfWeek.FRIDAY + "'", dayOfWeek0.equals(java.time.DayOfWeek.FRIDAY));
        org.junit.Assert.assertTrue("'" + dayOfWeek2 + "' != '" + java.time.DayOfWeek.WEDNESDAY + "'", dayOfWeek2.equals(java.time.DayOfWeek.WEDNESDAY));
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.time.Month month0 = java.time.Month.NOVEMBER;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.NOVEMBER + "'", month0.equals(java.time.Month.NOVEMBER));
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto0 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.getDefaultInstance();
        boolean boolean1 = methodDescriptorProto0.hasOutputType();
        byte[] byteArray2 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions4 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray2, extensionRegistryLite3);
        com.google.protobuf.CodedOutputStream codedOutputStream7 = com.google.protobuf.CodedOutputStream.newInstance(byteArray2, (int) (short) 0, 1);
        methodDescriptorProto0.writeTo(codedOutputStream7);
        // The following exception was thrown during execution in test generation
        try {
            codedOutputStream7.writeUInt32NoTag(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(methodDescriptorProto0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(methodOptions4);
        org.junit.Assert.assertNotNull(codedOutputStream7);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.text.MessageFormat.Field field0 = java.text.MessageFormat.Field.ARGUMENT;
        java.lang.String str1 = field0.toString();
        org.junit.Assert.assertNotNull(field0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.text.MessageFormat$Field(message argument field)" + "'", str1, "java.text.MessageFormat$Field(message argument field)");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder1 = builder0.clearCcGenericServices();
        boolean boolean2 = builder0.isInitialized();
        boolean boolean3 = builder0.getJavaGenericServices();
        boolean boolean4 = builder0.getJavaMultipleFiles();
        boolean boolean5 = builder0.getJavaGenericServices();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.google.protobuf.WireFormat.FieldType fieldType0 = com.google.protobuf.WireFormat.FieldType.GROUP;
        org.junit.Assert.assertNotNull(fieldType0);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        int int0 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.VALUE_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        java.util.List<com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder> builderList3 = builder0.getServiceBuilderList();
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder4 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output6 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream8 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output6, (int) 'a');
        byte[] byteArray9 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite10 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions11 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray9, extensionRegistryLite10);
        output6.write(byteArray9);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder13 = builder4.mergeFrom(byteArray9);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.Message.Builder builder17 = builder0.mergeFrom(byteArray9, (int) (short) -1, 152, extensionRegistryLite16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builderList3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(output6);
        org.junit.Assert.assertNotNull(codedOutputStream8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(methodOptions11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        compilerOptions0.inlineGetters = false;
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
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.MethodOptions.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        com.google.protobuf.DescriptorProtos.DescriptorProto.Builder builder27 = descriptorProto22.newBuilderForType();
        java.io.InputStream inputStream28 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = builder27.mergeDelimitedFrom(inputStream28, extensionRegistryLite29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        com.google.protobuf.DescriptorProtos.DescriptorProto.Builder builder27 = descriptorProto22.newBuilderForType();
        byte[] byteArray29 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite30 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions31 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray29, extensionRegistryLite30);
        com.google.protobuf.CodedInputStream codedInputStream34 = com.google.protobuf.CodedInputStream.newInstance(byteArray29, 16, (int) 'a');
        com.google.javascript.jscomp.VariableMap variableMap35 = com.google.javascript.jscomp.VariableMap.fromBytes(byteArray29);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite36 = null;
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto enumDescriptorProto37 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.parseFrom(byteArray29, extensionRegistryLite36);
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.DescriptorProto.Builder builder38 = builder27.addEnumType((int) ':', enumDescriptorProto37);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 58, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(methodOptions31);
        org.junit.Assert.assertNotNull(codedInputStream34);
        org.junit.Assert.assertNotNull(variableMap35);
        org.junit.Assert.assertNotNull(enumDescriptorProto37);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative0 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_PROTOTYPE;
        org.junit.Assert.assertTrue("'" + jSTypeNative0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_PROTOTYPE + "'", jSTypeNative0.equals(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_PROTOTYPE));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy5 = null;
        compilerOptions0.variableRenaming = variableRenamingPolicy5;
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap7 = null;
        compilerOptions0.setCustomPasses(customPassExecutionTimeMultimap7);
        org.junit.Assert.assertNotNull(errorFormat3);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime10.withYear((int) (short) 1);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit14 = chronoField13.getBaseUnit();
        java.time.ZonedDateTime zonedDateTime15 = zonedDateTime10.truncatedTo(temporalUnit14);
        java.time.Duration duration16 = temporalUnit14.getDuration();
        long long17 = duration16.toDays();
        java.time.Duration duration18 = duration16.abs();
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        java.time.temporal.TemporalUnit temporalUnit20 = chronoField19.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = duration16.get(temporalUnit20);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
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
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField19.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
        org.junit.Assert.assertTrue("'" + temporalUnit20 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit20.equals(java.time.temporal.ChronoUnit.FOREVER));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.time.Month month0 = java.time.Month.APRIL;
        java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) month0);
        java.time.Month month2 = month0.firstMonthOfQuarter();
        java.time.Month month4 = month0.minus((long) 16);
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.APRIL + "'", month0.equals(java.time.Month.APRIL));
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.APRIL + "'", month2.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + month4 + "' != '" + java.time.Month.DECEMBER + "'", month4.equals(java.time.Month.DECEMBER));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        jSTypeRegistry2.identifyNonNullableName("/");
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean12 = node11.isFromExterns();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean17 = node16.isFromExterns();
        java.lang.String str18 = node16.toString();
        com.google.javascript.rhino.Node node19 = node11.copyInformationFrom(node16);
        int int20 = node11.getLineno();
        int int21 = node11.getType();
        boolean boolean22 = node11.isQuotedString();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, false);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair36 = objectType30.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType35);
        java.lang.String str37 = objectType35.getDisplayName();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection38 = jSTypeRegistry25.getDirectImplementors(objectType35);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry2.createObjectType("US-ASCII", node11, objectType35);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, false);
        com.google.javascript.rhino.jstype.ObjectType objectType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSTypeRegistry42.createObjectType(objectType43);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType49 = jSTypeRegistry47.createObjectType(objectType48);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair50 = objectType44.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType49);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, false);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = jSTypeRegistry54.createObjectType(objectType55);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, false);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSTypeRegistry59.createObjectType(objectType60);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair62 = objectType56.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType61);
        com.google.javascript.rhino.Node node63 = objectType56.getRootNode();
        com.google.javascript.rhino.jstype.EnumType enumType64 = objectType56.toMaybeEnumType();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean69 = node68.isStringKey();
        boolean boolean70 = node68.isThrow();
        boolean boolean71 = node68.isVarArgs();
        boolean boolean72 = node68.isStringKey();
        boolean boolean73 = objectType49.defineInferredProperty("Unknown class name", (com.google.javascript.rhino.jstype.JSType) objectType56, node68);
        com.google.javascript.rhino.jstype.JSType jSType74 = objectType49.getTypeOfThis();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, false);
        com.google.javascript.rhino.jstype.ObjectType objectType78 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType79 = jSTypeRegistry77.createObjectType(objectType78);
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80, false);
        com.google.javascript.rhino.jstype.ObjectType objectType83 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType84 = jSTypeRegistry82.createObjectType(objectType83);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair85 = objectType79.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType84);
        com.google.javascript.rhino.Node node86 = objectType79.getRootNode();
        com.google.javascript.rhino.jstype.EnumType enumType87 = objectType79.toMaybeEnumType();
        boolean boolean88 = objectType79.canBeCalled();
        java.util.List<com.google.javascript.rhino.jstype.JSType> jSTypeList89 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry2.createFunctionType(objectType49, (com.google.javascript.rhino.jstype.JSType) objectType79, jSTypeList89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NUMBER 52.0 0" + "'", str18, "NUMBER 52.0 0");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 39 + "'", int21 == 39);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(typePair36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(functionTypeCollection38);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertNotNull(typePair50);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertNotNull(typePair62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNull(enumType64);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertNotNull(objectType79);
        org.junit.Assert.assertNotNull(objectType84);
        org.junit.Assert.assertNotNull(typePair85);
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertNull(enumType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = com.google.javascript.rhino.jstype.JSTypeNative.EVAL_ERROR_FUNCTION_TYPE;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("goog.abstractMethod", jSTypeNative1);
        org.junit.Assert.assertTrue("'" + jSTypeNative1 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.EVAL_ERROR_FUNCTION_TYPE + "'", jSTypeNative1.equals(com.google.javascript.rhino.jstype.JSTypeNative.EVAL_ERROR_FUNCTION_TYPE));
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean5 = node4.isFromExterns();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean10 = node9.isFromExterns();
        java.lang.String str11 = node9.toString();
        com.google.javascript.rhino.Node node12 = node4.copyInformationFrom(node9);
        int int13 = node4.getLineno();
        boolean boolean14 = node4.isLabel();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean19 = node18.isStringKey();
        boolean boolean20 = node18.isTrue();
        com.google.javascript.rhino.InputId inputId22 = new com.google.javascript.rhino.InputId("NUMBER 52.0 0");
        node18.setInputId(inputId22);
        node4.setInputId(inputId22);
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions25.setRecordFunctionInformation(true);
        boolean boolean28 = compilerOptions25.checkControlStructures;
        compilerOptions25.setCollapseProperties(false);
        compilerOptions25.setAssumeStrictThis(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions33.optimizeCalls = false;
        compilerOptions33.preferLineBreakAtEndOfFile = false;
        boolean boolean38 = compilerOptions33.markNoSideEffectCalls;
        boolean boolean39 = compilerOptions33.labelRenaming;
        com.google.javascript.jscomp.DependencyOptions dependencyOptions40 = new com.google.javascript.jscomp.DependencyOptions();
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        boolean boolean47 = strSet45.isEmpty();
        java.nio.ByteBuffer byteBuffer49 = java.nio.ByteBuffer.allocate(100);
        boolean boolean50 = strSet45.equals((java.lang.Object) byteBuffer49);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        boolean boolean57 = strSet55.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream58 = strSet55.stream();
        boolean boolean59 = strSet45.retainAll((java.util.Collection<java.lang.String>) strSet55);
        com.google.javascript.jscomp.DependencyOptions dependencyOptions60 = dependencyOptions40.setEntryPoints((java.util.Collection<java.lang.String>) strSet45);
        compilerOptions33.setDependencyOptions(dependencyOptions40);
        com.google.javascript.jscomp.CheckLevel checkLevel62 = compilerOptions33.checkGlobalThisLevel;
        compilerOptions25.reportMissingOverride = checkLevel62;
        com.google.javascript.jscomp.DiagnosticType diagnosticType66 = com.google.javascript.jscomp.DiagnosticType.warning("", "Unknown class name");
        java.lang.String[] strArray71 = new java.lang.String[] { "2022-02-21", "2022-02-21", "hi!", "/tmp/hi!4516073975838273390ISO" };
        com.google.javascript.jscomp.JSError jSError72 = com.google.javascript.jscomp.JSError.make("{}", node4, checkLevel62, diagnosticType66, strArray71);
        java.time.temporal.ChronoField chronoField73 = java.time.temporal.ChronoField.EPOCH_DAY;
        java.time.Instant instant74 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset78 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime79 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset78);
        java.time.OffsetDateTime offsetDateTime80 = java.time.OffsetDateTime.ofInstant(instant74, (java.time.ZoneId) zoneOffset78);
        java.time.temporal.ValueRange valueRange81 = chronoField73.rangeRefinedBy((java.time.temporal.TemporalAccessor) offsetDateTime80);
        java.time.format.DateTimeFormatter dateTimeFormatter82 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.lang.String str83 = offsetDateTime80.format(dateTimeFormatter82);
        boolean boolean84 = jSError72.equals((java.lang.Object) dateTimeFormatter82);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor86 = dateTimeFormatter82.parse((java.lang.CharSequence) "java.text.MessageFormat$Field(message argument field)");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'java.text.MessageFormat$Field(message argument field)' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "NUMBER 52.0 0" + "'", str11, "NUMBER 52.0 0");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strStream58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(dependencyOptions60);
        org.junit.Assert.assertTrue("'" + checkLevel62 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel62.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(diagnosticType66);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(jSError72);
        org.junit.Assert.assertTrue("'" + chronoField73 + "' != '" + java.time.temporal.ChronoField.EPOCH_DAY + "'", chronoField73.equals(java.time.temporal.ChronoField.EPOCH_DAY));
        org.junit.Assert.assertNotNull(instant74);
        org.junit.Assert.assertNotNull(zoneOffset78);
        org.junit.Assert.assertNotNull(localDateTime79);
        org.junit.Assert.assertNotNull(offsetDateTime80);
        org.junit.Assert.assertNotNull(valueRange81);
        org.junit.Assert.assertNotNull(dateTimeFormatter82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "1970-01-01+00:00:52" + "'", str83, "1970-01-01+00:00:52");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        long long6 = java.util.Date.UTC((int) (short) -1, 28, 64, (int) (short) 100, 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2161280968000L) + "'", long6 == (-2161280968000L));
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = null;
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto enumDescriptorProto4 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.parseFrom(byteArray0, extensionRegistryLite3);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder5 = enumDescriptorProto4.newBuilderForType();
        com.google.protobuf.Descriptors.Descriptor descriptor6 = builder5.getDescriptorForType();
        com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder enumOptionsOrBuilder7 = builder5.getOptionsOrBuilder();
        java.io.InputStream inputStream8 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = builder5.mergeDelimitedFrom(inputStream8, extensionRegistryLite9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(methodOptions2);
        org.junit.Assert.assertNotNull(enumDescriptorProto4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(descriptor6);
        org.junit.Assert.assertNotNull(enumOptionsOrBuilder7);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset27);
        int int29 = localDateTime28.getYear();
        java.time.Instant instant30 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset34 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset34);
        java.time.OffsetDateTime offsetDateTime36 = java.time.OffsetDateTime.ofInstant(instant30, (java.time.ZoneId) zoneOffset34);
        java.time.Instant instant37 = localDateTime28.toInstant(zoneOffset34);
        boolean boolean38 = appendableSet23.equals((java.lang.Object) zoneOffset34);
        java.lang.Object[] objArray39 = appendableSet23.toArray();
        java.util.concurrent.TimeUnit timeUnit40 = java.util.concurrent.TimeUnit.HOURS;
        boolean boolean41 = appendableSet23.contains((java.lang.Object) timeUnit40);
        com.google.common.collect.ImmutableList<java.lang.Appendable> appendableList42 = appendableSet23.asList();
        java.nio.CharBuffer charBuffer45 = java.nio.CharBuffer.allocate((int) ' ');
        boolean boolean46 = charBuffer45.isDirect();
        java.nio.CharBuffer charBuffer48 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer50 = charBuffer48.put('a');
        char[] charArray52 = new char[] { '4' };
        java.nio.CharBuffer charBuffer53 = charBuffer50.get(charArray52);
        java.nio.CharBuffer charBuffer54 = charBuffer50.compact();
        java.nio.CharBuffer charBuffer56 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer58 = charBuffer56.put('a');
        java.nio.CharBuffer charBuffer60 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer62 = charBuffer60.put('a');
        char[] charArray64 = new char[] { '4' };
        java.nio.CharBuffer charBuffer65 = charBuffer62.get(charArray64);
        java.nio.CharBuffer charBuffer66 = charBuffer62.compact();
        com.google.common.collect.ImmutableSet<java.lang.Appendable> appendableSet67 = com.google.common.collect.ImmutableSet.of((java.lang.Appendable) charBuffer45, (java.lang.Appendable) charBuffer50, (java.lang.Appendable) charBuffer56, (java.lang.Appendable) charBuffer66);
        boolean boolean68 = charBuffer66.isDirect();
        char[] charArray69 = charBuffer66.array();
        java.nio.CharBuffer charBuffer71 = java.nio.CharBuffer.allocate((int) ' ');
        boolean boolean72 = charBuffer71.isDirect();
        java.nio.CharBuffer charBuffer74 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer76 = charBuffer74.put('a');
        char[] charArray78 = new char[] { '4' };
        java.nio.CharBuffer charBuffer79 = charBuffer76.get(charArray78);
        java.nio.CharBuffer charBuffer80 = charBuffer76.compact();
        java.nio.CharBuffer charBuffer82 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer84 = charBuffer82.put('a');
        java.nio.CharBuffer charBuffer86 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer88 = charBuffer86.put('a');
        char[] charArray90 = new char[] { '4' };
        java.nio.CharBuffer charBuffer91 = charBuffer88.get(charArray90);
        java.nio.CharBuffer charBuffer92 = charBuffer88.compact();
        com.google.common.collect.ImmutableSet<java.lang.Appendable> appendableSet93 = com.google.common.collect.ImmutableSet.of((java.lang.Appendable) charBuffer71, (java.lang.Appendable) charBuffer76, (java.lang.Appendable) charBuffer82, (java.lang.Appendable) charBuffer92);
        boolean boolean94 = charBuffer92.isDirect();
        int int95 = charBuffer66.read(charBuffer92);
        char[] charArray96 = new char[] {};
        java.nio.CharBuffer charBuffer97 = charBuffer66.get(charArray96);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable98 = appendableList42.set((int) (byte) 100, (java.lang.Appendable) charBuffer97);
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
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1970 + "'", int29 == 1970);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(zoneOffset34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(offsetDateTime36);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000, \000\000, \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000, \000\000, \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000]");
        org.junit.Assert.assertNotNull(timeUnit40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(appendableList42);
        org.junit.Assert.assertNotNull(charBuffer45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(charBuffer48);
        org.junit.Assert.assertNotNull(charBuffer50);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer53);
        org.junit.Assert.assertNotNull(charBuffer54);
        org.junit.Assert.assertNotNull(charBuffer56);
        org.junit.Assert.assertNotNull(charBuffer58);
        org.junit.Assert.assertNotNull(charBuffer60);
        org.junit.Assert.assertNotNull(charBuffer62);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer65);
        org.junit.Assert.assertNotNull(charBuffer66);
        org.junit.Assert.assertNotNull(appendableSet67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charBuffer71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(charBuffer74);
        org.junit.Assert.assertNotNull(charBuffer76);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer79);
        org.junit.Assert.assertNotNull(charBuffer80);
        org.junit.Assert.assertNotNull(charBuffer82);
        org.junit.Assert.assertNotNull(charBuffer84);
        org.junit.Assert.assertNotNull(charBuffer86);
        org.junit.Assert.assertNotNull(charBuffer88);
        org.junit.Assert.assertNotNull(charArray90);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray90), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray90), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray90), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer91);
        org.junit.Assert.assertNotNull(charBuffer92);
        org.junit.Assert.assertNotNull(appendableSet93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 2 + "'", int95 == 2);
        org.junit.Assert.assertNotNull(charArray96);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray96), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray96), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray96), "[]");
        org.junit.Assert.assertNotNull(charBuffer97);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.google.protobuf.DescriptorProtos.EnumValueOptions enumValueOptions0 = com.google.protobuf.DescriptorProtos.EnumValueOptions.getDefaultInstance();
        com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder builder1 = com.google.protobuf.DescriptorProtos.EnumValueOptions.newBuilder(enumValueOptions0);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder builder3 = builder1.clearField(fieldDescriptor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(enumValueOptions0);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile sourceFile2 = builder0.buildFromFile("ClockHourOfAmPm");
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile5 = builder0.buildFromInputStream("Exceeded max number of code motion iterations: {0}", inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        java.util.Set<java.time.chrono.Chronology> chronologySet0 = java.time.chrono.Chronology.getAvailableChronologies();
        org.junit.Assert.assertNotNull(chronologySet0);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto1 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.parseDelimitedFrom(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.google.protobuf.ByteString byteString0 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto1 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.parseFrom(byteString0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap.Entry entry2 = com.google.javascript.jscomp.FunctionInformationMap.Entry.parseFrom(byteString0);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: Message missing required fields: id, source_name, line_number, module_name, size, name, compiled_source");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteString0);
        org.junit.Assert.assertNotNull(methodDescriptorProto1);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        int int7 = codedInputStream5.pushLimit((int) 'a');
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto9 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.parseFrom(codedInputStream5, extensionRegistryLite8);
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
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder3 = builder2.clearSourceCodeInfo();
        boolean boolean4 = builder3.hasPackage();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder fieldDescriptorProtoOrBuilder6 = builder3.getExtensionOrBuilder((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        boolean boolean6 = strSet4.isEmpty();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(100);
        boolean boolean9 = strSet4.equals((java.lang.Object) byteBuffer8);
        java.nio.IntBuffer intBuffer10 = byteBuffer8.asIntBuffer();
        java.nio.ByteOrder byteOrder11 = byteBuffer8.order();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intBuffer10);
        org.junit.Assert.assertNotNull(byteOrder11);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.google.javascript.jscomp.PerformanceTracker.Stats stats1 = new com.google.javascript.jscomp.PerformanceTracker.Stats("goog.global");
        int int2 = stats1.diff;
        int int3 = stats1.runs;
        int int4 = stats1.size;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.time.Month month0 = java.time.Month.AUGUST;
        java.time.Month month1 = java.time.Month.AUGUST;
        java.time.ZoneOffset zoneOffset5 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset5);
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset10);
        java.time.ZonedDateTime zonedDateTime12 = java.time.ZonedDateTime.of(localDateTime6, (java.time.ZoneId) zoneOffset10);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        boolean boolean14 = localDateTime6.isSupported((java.time.temporal.TemporalField) chronoField13);
        boolean boolean15 = month1.isSupported((java.time.temporal.TemporalField) chronoField13);
        boolean boolean16 = month0.isSupported((java.time.temporal.TemporalField) chronoField13);
        java.time.Instant instant17 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset21 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset21);
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.ofInstant(instant17, (java.time.ZoneId) zoneOffset21);
        java.time.OffsetDateTime offsetDateTime25 = offsetDateTime23.minusDays((long) (short) 100);
        java.lang.String str26 = offsetDateTime23.toString();
        java.time.temporal.ChronoField chronoField27 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        int int28 = offsetDateTime23.get((java.time.temporal.TemporalField) chronoField27);
        java.time.OffsetDateTime offsetDateTime30 = offsetDateTime23.withDayOfMonth((int) (short) 10);
        long long31 = chronoField13.getFrom((java.time.temporal.TemporalAccessor) offsetDateTime23);
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.AUGUST + "'", month0.equals(java.time.Month.AUGUST));
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.AUGUST + "'", month1.equals(java.time.Month.AUGUST));
        org.junit.Assert.assertNotNull(zoneOffset5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField13.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(zoneOffset21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(offsetDateTime23);
        org.junit.Assert.assertNotNull(offsetDateTime25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01T00:00:52+00:00:52" + "'", str26, "1970-01-01T00:00:52+00:00:52");
        org.junit.Assert.assertTrue("'" + chronoField27 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField27.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 12 + "'", int28 == 12);
        org.junit.Assert.assertNotNull(offsetDateTime30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 12L + "'", long31 == 12L);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.security.GeneralSecurityException generalSecurityException1 = new java.security.GeneralSecurityException("\ub300\ud55c\ubbfc\uad6d");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        boolean boolean13 = objectType4.isNumberValueType();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(typePair10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(enumType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.nio.file.attribute.FileTime fileTime1 = java.nio.file.attribute.FileTime.from(instant0);
        long long2 = fileTime1.toMillis();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(fileTime1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        java.io.InputStream inputStream2 = null;
        com.google.protobuf.MessageLite.Builder builder3 = builder0.mergeFrom(inputStream2);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type type4 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_BYTES;
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder5 = builder0.setType(type4);
        boolean boolean6 = builder5.hasName();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_BYTES + "'", type4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_BYTES));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.google.protobuf.Descriptors.EnumDescriptor enumDescriptor0 = com.google.protobuf.DescriptorProtos.FieldOptions.CType.getDescriptor();
        int int1 = enumDescriptor0.getIndex();
        org.junit.Assert.assertNotNull(enumDescriptor0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.MessageOptions.newBuilder();
        java.util.List<com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder> builderList1 = builder0.getUninterpretedOptionBuilderList();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = builder0.hasField(fieldDescriptor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builderList1);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        java.nio.CharBuffer charBuffer24 = java.nio.CharBuffer.wrap((java.lang.CharSequence) charBuffer1);
        java.nio.CharBuffer charBuffer25 = charBuffer1.duplicate();
        boolean boolean26 = charBuffer25.hasArray();
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
        org.junit.Assert.assertNotNull(charBuffer24);
        org.junit.Assert.assertNotNull(charBuffer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder1 = builder0.clearCcGenericServices();
        boolean boolean2 = builder0.isInitialized();
        boolean boolean3 = builder0.getJavaGenericServices();
        boolean boolean4 = builder0.getJavaMultipleFiles();
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileOptions.Builder builder8 = builder0.mergeFrom(byteArray5, (int) '4', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.MessageOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions1 = builder0.getDefaultInstanceForType();
        com.google.protobuf.Descriptors.Descriptor descriptor2 = builder0.getDescriptorForType();
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder4 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output6 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream8 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output6, (int) 'a');
        byte[] byteArray9 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite10 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions11 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray9, extensionRegistryLite10);
        output6.write(byteArray9);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder13 = builder4.mergeFrom(byteArray9);
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions14 = builder4.buildPartial();
        com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder builder15 = builder4.addUninterpretedOptionBuilder();
        boolean boolean16 = builder15.hasNegativeIntValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder17 = builder0.addUninterpretedOption((-1), builder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(messageOptions1);
        org.junit.Assert.assertNotNull(descriptor2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(output6);
        org.junit.Assert.assertNotNull(codedOutputStream8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(methodOptions11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(methodOptions14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.ByteString byteString2 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions4 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(byteString2, extensionRegistryLite3);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder5 = builder0.mergeFrom(byteString2);
        boolean boolean6 = builder0.hasType();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = builder0.getRepeatedFieldCount(fieldDescriptor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(byteString2);
        org.junit.Assert.assertNotNull(enumOptions4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        java.time.temporal.ChronoField chronoField27 = java.time.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH;
        java.time.temporal.ValueRange valueRange28 = localDate20.range((java.time.temporal.TemporalField) chronoField27);
        boolean boolean30 = valueRange28.isValidValue((long) 55);
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
        org.junit.Assert.assertTrue("'" + chronoField27 + "' != '" + java.time.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH + "'", chronoField27.equals(java.time.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH));
        org.junit.Assert.assertNotNull(valueRange28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        org.junit.Assert.assertNotNull(longStream0);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_TIME;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap0 = com.google.javascript.jscomp.FunctionInformationMap.getDefaultInstance();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap.EntryOrBuilder entryOrBuilder2 = functionInformationMap0.getEntryOrBuilder((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionInformationMap0);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        boolean boolean6 = strSet4.isEmpty();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(100);
        boolean boolean9 = strSet4.equals((java.lang.Object) byteBuffer8);
        java.nio.IntBuffer intBuffer10 = byteBuffer8.asIntBuffer();
        java.nio.IntBuffer intBuffer12 = intBuffer10.put(16);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean19 = strSet17.isEmpty();
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocate(100);
        boolean boolean22 = strSet17.equals((java.lang.Object) byteBuffer21);
        java.nio.IntBuffer intBuffer23 = byteBuffer21.asIntBuffer();
        boolean boolean24 = intBuffer23.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.IntBuffer intBuffer25 = intBuffer10.put(intBuffer23);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intBuffer10);
        org.junit.Assert.assertNotNull(intBuffer12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intBuffer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder builder0 = com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.newBuilder();
        boolean boolean1 = builder0.hasEnd();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOption uninterpretedOption8 = com.google.protobuf.DescriptorProtos.UninterpretedOption.parseFrom(byteArray6, extensionRegistryLite7);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, -1, -1, -1, 0]");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        com.google.protobuf.DescriptorProtos.DescriptorProto.Builder builder27 = descriptorProto22.newBuilderForType();
        java.util.List<com.google.protobuf.DescriptorProtos.DescriptorProto> descriptorProtoList28 = builder27.getNestedTypeList();
        com.google.protobuf.UnknownFieldSet unknownFieldSet29 = builder27.getUnknownFields();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions30 = builder27.getOptions();
        byte[] byteArray31 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite32 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions33 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray31, extensionRegistryLite32);
        com.google.protobuf.CodedInputStream codedInputStream36 = com.google.protobuf.CodedInputStream.newInstance(byteArray31, 16, (int) 'a');
        int int38 = codedInputStream36.pushLimit((int) 'a');
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite39 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.DescriptorProto.Builder builder40 = builder27.mergeFrom(codedInputStream36, extensionRegistryLite39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(descriptorProtoList28);
        org.junit.Assert.assertNotNull(unknownFieldSet29);
        org.junit.Assert.assertNotNull(messageOptions30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(methodOptions33);
        org.junit.Assert.assertNotNull(codedInputStream36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto0 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.getDefaultInstance();
        boolean boolean1 = methodDescriptorProto0.hasOutputType();
        byte[] byteArray2 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions4 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray2, extensionRegistryLite3);
        com.google.protobuf.CodedOutputStream codedOutputStream7 = com.google.protobuf.CodedOutputStream.newInstance(byteArray2, (int) (short) 0, 1);
        methodDescriptorProto0.writeTo(codedOutputStream7);
        // The following exception was thrown during execution in test generation
        try {
            codedOutputStream7.writeSFixed64(12, (long) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(methodDescriptorProto0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(methodOptions4);
        org.junit.Assert.assertNotNull(codedOutputStream7);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative0 = com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_FUNCTION_TYPE;
        org.junit.Assert.assertTrue("'" + jSTypeNative0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_FUNCTION_TYPE + "'", jSTypeNative0.equals(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_FUNCTION_TYPE));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MessageOptions messageOptions7 = com.google.protobuf.DescriptorProtos.MessageOptions.parseFrom(codedInputStream5, extensionRegistryLite6);
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
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.io.PrintStream printStream1 = new java.io.PrintStream("1970-01-01");
        printStream1.println((float) (short) 1);
        printStream1.print('a');
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite> priorityMap0 = new java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>();
        java.lang.Object obj1 = priorityMap0.clone();
        boolean boolean2 = priorityMap0.isEmpty();
        java.lang.String str3 = priorityMap0.toString();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder4 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder5 = builder4.clearCcGenericServices();
        boolean boolean6 = builder4.isInitialized();
        com.google.protobuf.MessageLite messageLite7 = priorityMap0.get((java.lang.Object) builder4);
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder9 = builder4.setPyGenericServices(false);
        boolean boolean10 = builder9.hasJavaPackage();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = descriptor0.toProto();
        boolean boolean2 = descriptorProto1.isInitialized();
        int int3 = descriptorProto1.getExtensionCount();
        int int4 = descriptorProto1.getFieldCount();
        java.util.List<com.google.protobuf.DescriptorProtos.FieldDescriptorProto> fieldDescriptorProtoList5 = descriptorProto1.getFieldList();
        int int6 = descriptorProto1.getEnumTypeCount();
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(descriptorProto1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertNotNull(fieldDescriptorProtoList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output2 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream4 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output2, (int) 'a');
        byte[] byteArray5 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions7 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray5, extensionRegistryLite6);
        output2.write(byteArray5);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder9 = builder0.mergeFrom(byteArray5);
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions10 = builder0.buildPartial();
        com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder builder11 = builder0.addUninterpretedOptionBuilder();
        com.google.protobuf.DescriptorProtos.UninterpretedOption uninterpretedOption12 = builder11.buildPartial();
        com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder builder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder builder15 = builder11.addName((int) (byte) 0, builder14);
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
        org.junit.Assert.assertNotNull(methodOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(uninterpretedOption12);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder.getDescriptor();
        java.util.List<com.google.protobuf.Descriptors.FieldDescriptor> fieldDescriptorList1 = descriptor0.getExtensions();
        com.google.protobuf.Descriptors.Descriptor descriptor3 = descriptor0.findNestedTypeByName("/");
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(fieldDescriptorList1);
        org.junit.Assert.assertNull(descriptor3);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.nio.file.attribute.FileTime fileTime1 = java.nio.file.attribute.FileTime.from(instant0);
        java.time.Instant instant2 = java.time.Instant.EPOCH;
        java.nio.file.attribute.FileTime fileTime3 = java.nio.file.attribute.FileTime.from(instant2);
        java.time.Instant instant5 = instant2.plusNanos((long) 32);
        int int6 = instant0.compareTo(instant2);
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset10);
        int int12 = localDateTime11.getYear();
        java.time.LocalDate localDate13 = localDateTime11.toLocalDate();
        java.time.LocalDate localDate15 = localDate13.plusDays((long) '#');
        java.time.LocalDate localDate16 = java.time.LocalDate.now();
        java.time.chrono.ChronoPeriod chronoPeriod17 = localDate13.until((java.time.chrono.ChronoLocalDate) localDate16);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant18 = instant0.plus((java.time.temporal.TemporalAmount) chronoPeriod17);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Months");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(fileTime1);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(fileTime3);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronoPeriod17);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type type0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_SFIXED32;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_SFIXED32 + "'", type0.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_SFIXED32));
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        java.text.ParsePosition parsePosition3 = new java.text.ParsePosition(42);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor4 = dateTimeFormatter0.parseUnresolved((java.lang.CharSequence) "/tmp/hi!346938731537444595ISO", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 42");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        int int7 = codedInputStream5.pushLimit((int) 'a');
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location location9 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.parseFrom(codedInputStream5, extensionRegistryLite8);
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
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        java.lang.String str17 = isoChronology0.getCalendarType();
        java.util.Map<java.time.temporal.TemporalField, java.lang.Long> temporalFieldMap18 = null;
        java.time.format.ResolverStyle resolverStyle19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate20 = isoChronology0.resolveDate(temporalFieldMap18, resolverStyle19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "iso8601" + "'", str17, "iso8601");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        int int0 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.PATH_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        int[] intArray4 = new int[] { 16, ':', 43, (short) 100 };
        java.util.stream.IntStream intStream5 = java.util.stream.IntStream.of(intArray4);
        java.util.function.IntUnaryOperator intUnaryOperator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream7 = intStream5.map(intUnaryOperator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[16, 58, 43, 100]");
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.javascript.jscomp.FunctionInformationMap.Builder.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        com.google.protobuf.DescriptorProtos.DescriptorProto.Builder builder27 = descriptorProto22.newBuilderForType();
        boolean boolean28 = builder27.hasName();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto29 = builder27.buildPartial();
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
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(descriptorProto29);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter1 = new java.io.PrintWriter(outputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.addExtension(builder3);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder6 = builder0.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions7 = builder6.getOptions();
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder8 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output10 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream12 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output10, (int) 'a');
        byte[] byteArray13 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite14 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions15 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray13, extensionRegistryLite14);
        output10.write(byteArray13);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder17 = builder8.mergeFrom(byteArray13);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder18 = builder6.mergeFrom(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder20 = builder18.removeValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + label4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(enumOptions7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(output10);
        org.junit.Assert.assertNotNull(codedOutputStream12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(methodOptions15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder6 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.newBuilder();
        java.io.InputStream inputStream7 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite8 = null;
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder9 = builder6.mergeFrom(inputStream7, extensionRegistryLite8);
        boolean boolean10 = builder9.hasOptions();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder11 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder13 = builder11.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder14 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label15 = builder14.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder16 = builder11.addExtension(builder14);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder17 = builder11.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder18 = builder17.getOptionsBuilder();
        java.io.InputStream inputStream19 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions20 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream19);
        boolean boolean21 = enumOptions20.isInitialized();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder22 = builder18.mergeFrom(enumOptions20);
        com.google.protobuf.UnknownFieldSet unknownFieldSet23 = builder18.getUnknownFields();
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder builder24 = builder9.mergeUnknownFields(unknownFieldSet23);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite25 = null;
        // The following exception was thrown during execution in test generation
        try {
            codedInputStream5.readMessage((com.google.protobuf.MessageLite.Builder) builder9, extensionRegistryLite25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(methodOptions2);
        org.junit.Assert.assertNotNull(codedInputStream5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + label15 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label15.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(enumOptions20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(unknownFieldSet23);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        com.google.javascript.rhino.jstype.JSType.TypePair typePair13 = objectType7.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType12);
        java.lang.String str14 = objectType12.getDisplayName();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection15 = jSTypeRegistry2.getDirectImplementors(objectType12);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = jSTypeRegistry2.getEachReferenceTypeWithProperty("+00:00:52");
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair28 = objectType22.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType27);
        com.google.javascript.rhino.Node node29 = objectType22.getRootNode();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry32.createObjectType(objectType33);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, false);
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry37.createObjectType(objectType38);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair40 = objectType34.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType39);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = objectType22.testForEquality((com.google.javascript.rhino.jstype.JSType) objectType34);
        com.google.javascript.rhino.jstype.JSType jSType46 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType34, "1970-01-01T00:00:52+00:00:52", "goog.abstractMethod", (int) ':', (int) (byte) -1);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, false);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType52 = jSTypeRegistry50.createObjectType(objectType51);
        jSTypeRegistry50.forwardDeclareType("");
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, false);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry57.createObjectType(objectType58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, false);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSTypeRegistry62.createObjectType(objectType63);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair65 = objectType59.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType64);
        boolean boolean66 = objectType59.isInterface();
        com.google.javascript.rhino.jstype.JSType jSType71 = jSTypeRegistry50.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType59, "NUMBER 52.0 0", "OffsetSeconds", 256, (int) (short) 10);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = objectType59.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope73 = objectType59.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType74 = objectType34.resolve(errorReporter47, jSTypeStaticScope73);
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertNotNull(typePair13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(functionTypeCollection15);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(typePair28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertNotNull(typePair40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertNotNull(typePair65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jSType71);
        org.junit.Assert.assertNull(functionType72);
        org.junit.Assert.assertNotNull(jSTypeStaticScope73);
        org.junit.Assert.assertNotNull(jSType74);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHoursMinutes(28, 28);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset hours not in valid range: value 28 is not in the range -18 to 18");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        byte[] byteArray5 = compilerOptions0.inputPropertyMapSerialized;
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode6 = compilerOptions0.getTracerMode();
        compilerOptions0.collapseProperties = false;
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap9 = java.nio.charset.Charset.availableCharsets();
        java.util.Set<java.lang.String> strSet10 = strMap9.keySet();
        compilerOptions0.setStripTypePrefixes(strSet10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean17 = node16.isStringKey();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean22 = node21.isVar();
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] { node16, node21 };
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(10, nodeArray23);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node[] nodeArray25 = strSet10.toArray(nodeArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorFormat3);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + tracerMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode6.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeArray23);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
        java.nio.CharBuffer charBuffer25 = java.nio.CharBuffer.allocate((int) ' ');
        boolean boolean26 = charBuffer25.isDirect();
        java.nio.CharBuffer charBuffer28 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer30 = charBuffer28.put('a');
        char[] charArray32 = new char[] { '4' };
        java.nio.CharBuffer charBuffer33 = charBuffer30.get(charArray32);
        java.nio.CharBuffer charBuffer34 = charBuffer30.compact();
        java.nio.CharBuffer charBuffer36 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer38 = charBuffer36.put('a');
        java.nio.CharBuffer charBuffer40 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer42 = charBuffer40.put('a');
        char[] charArray44 = new char[] { '4' };
        java.nio.CharBuffer charBuffer45 = charBuffer42.get(charArray44);
        java.nio.CharBuffer charBuffer46 = charBuffer42.compact();
        com.google.common.collect.ImmutableSet<java.lang.Appendable> appendableSet47 = com.google.common.collect.ImmutableSet.of((java.lang.Appendable) charBuffer25, (java.lang.Appendable) charBuffer30, (java.lang.Appendable) charBuffer36, (java.lang.Appendable) charBuffer46);
        java.nio.CharBuffer charBuffer48 = java.nio.CharBuffer.wrap((java.lang.CharSequence) charBuffer25);
        char[] charArray49 = charBuffer25.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer52 = charBuffer22.get(charArray49, 97, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(charBuffer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charBuffer28);
        org.junit.Assert.assertNotNull(charBuffer30);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer33);
        org.junit.Assert.assertNotNull(charBuffer34);
        org.junit.Assert.assertNotNull(charBuffer36);
        org.junit.Assert.assertNotNull(charBuffer38);
        org.junit.Assert.assertNotNull(charBuffer40);
        org.junit.Assert.assertNotNull(charBuffer42);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer45);
        org.junit.Assert.assertNotNull(charBuffer46);
        org.junit.Assert.assertNotNull(appendableSet47);
        org.junit.Assert.assertNotNull(charBuffer48);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        com.google.protobuf.DescriptorProtos.DescriptorProto.Builder builder27 = descriptorProto22.newBuilderForType();
        java.util.List<com.google.protobuf.DescriptorProtos.FieldDescriptorProto> fieldDescriptorProtoList28 = builder27.getExtensionList();
        com.google.protobuf.DescriptorProtos.DescriptorProto.Builder builder29 = builder27.addNestedTypeBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder31 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label32 = builder31.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto33 = builder31.buildPartial();
        int int34 = fieldDescriptorProto33.getSerializedSize();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.DescriptorProto.Builder builder35 = builder27.setField(0, fieldDescriptorProto33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(fieldDescriptorProtoList28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + label32 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label32.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(fieldDescriptorProto33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        byte[] byteArray0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap functionInformationMap2 = com.google.javascript.jscomp.FunctionInformationMap.parseFrom(byteArray0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.util.logging.Level level0 = java.util.logging.Level.INFO;
        org.junit.Assert.assertNotNull(level0);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto2 = builder0.buildPartial();
        int int3 = fieldDescriptorProto2.getSerializedSize();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder4 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder(fieldDescriptorProto2);
        com.google.protobuf.DescriptorProtos.FieldOptions fieldOptions5 = builder4.getOptions();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fieldOptions5.getRepeatedField(fieldDescriptor6, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(fieldDescriptorProto2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(fieldOptions5);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(256);
        java.nio.IntBuffer intBuffer3 = intBuffer1.put(55);
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertNotNull(intBuffer3);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.util.function.UnaryOperator<com.google.javascript.jscomp.DiagnosticGroup> diagnosticGroupUnaryOperator0 = java.util.function.UnaryOperator.identity();
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup1 = com.google.javascript.jscomp.DiagnosticGroups.TYPE_INVALIDATION;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup2 = diagnosticGroupUnaryOperator0.apply(diagnosticGroup1);
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup1;
        com.google.javascript.jscomp.DiagnosticGroups.VISIBILITY = diagnosticGroup1;
        org.junit.Assert.assertNotNull(diagnosticGroupUnaryOperator0);
        org.junit.Assert.assertNotNull(diagnosticGroup1);
        org.junit.Assert.assertNotNull(diagnosticGroup2);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        int int0 = com.google.javascript.jscomp.FunctionInformationMap.Entry.COMPILED_SOURCE_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        compilerInput3.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler5);
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler5.getCodingConvention();
        java.lang.String str9 = codingConvention8.getGlobalObject();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean14 = node13.isStringKey();
        boolean boolean15 = node13.isThrow();
        boolean boolean16 = node13.isVarArgs();
        node13.setCharno(32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = codingConvention8.isInlinableFunction(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.global" + "'", str9, "goog.global");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        com.google.protobuf.DescriptorProtos.DescriptorProto.Builder builder27 = descriptorProto22.newBuilderForType();
        java.util.List<com.google.protobuf.DescriptorProtos.DescriptorProto> descriptorProtoList28 = builder27.getNestedTypeList();
        com.google.protobuf.UnknownFieldSet unknownFieldSet29 = builder27.getUnknownFields();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.DescriptorProto.Builder builder31 = builder27.clearField(fieldDescriptor30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(descriptorProtoList28);
        org.junit.Assert.assertNotNull(unknownFieldSet29);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.google.protobuf.WireFormat.JavaType javaType0 = com.google.protobuf.WireFormat.JavaType.INT;
        org.junit.Assert.assertTrue("'" + javaType0 + "' != '" + com.google.protobuf.WireFormat.JavaType.INT + "'", javaType0.equals(com.google.protobuf.WireFormat.JavaType.INT));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile sourceFile2 = builder0.buildFromFile("ClockHourOfAmPm");
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile5 = builder0.buildFromInputStream("// Input %num%", inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.net.URISyntaxException uRISyntaxException3 = new java.net.URISyntaxException("hi!", "");
        boolean boolean4 = strMap0.containsKey((java.lang.Object) "");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap5 = java.nio.charset.Charset.availableCharsets();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean10 = strMap5.containsValue((java.lang.Object) '4');
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap11 = java.nio.charset.Charset.availableCharsets();
        java.net.URISyntaxException uRISyntaxException14 = new java.net.URISyntaxException("hi!", "");
        boolean boolean15 = strMap11.containsKey((java.lang.Object) "");
        int int16 = strMap11.size();
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap17 = java.nio.charset.Charset.availableCharsets();
        java.util.Set<java.lang.String> strSet18 = strMap17.keySet();
        java.util.Set<java.lang.String> strSet19 = strMap17.keySet();
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap20 = java.nio.charset.Charset.availableCharsets();
        java.net.URISyntaxException uRISyntaxException23 = new java.net.URISyntaxException("hi!", "");
        boolean boolean24 = strMap20.containsKey((java.lang.Object) "");
        int int25 = strMap20.size();
        com.google.common.collect.ImmutableList<java.util.SortedMap<java.lang.String, java.nio.charset.Charset>> strMapList26 = com.google.common.collect.ImmutableList.of(strMap0, strMap5, strMap11, strMap17, strMap20);
        // The following exception was thrown during execution in test generation
        try {
            strMap20.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 171 + "'", int16 == 171);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 171 + "'", int25 == 171);
        org.junit.Assert.assertNotNull(strMapList26);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        boolean boolean9 = strSet7.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream10 = strSet7.stream();
        java.lang.String str11 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap12);
        java.nio.CharBuffer charBuffer15 = java.nio.CharBuffer.allocate((int) ' ');
        boolean boolean16 = charBuffer15.isDirect();
        java.nio.CharBuffer charBuffer18 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer20 = charBuffer18.put('a');
        char[] charArray22 = new char[] { '4' };
        java.nio.CharBuffer charBuffer23 = charBuffer20.get(charArray22);
        java.nio.CharBuffer charBuffer24 = charBuffer20.compact();
        java.nio.CharBuffer charBuffer26 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer28 = charBuffer26.put('a');
        java.nio.CharBuffer charBuffer30 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer32 = charBuffer30.put('a');
        char[] charArray34 = new char[] { '4' };
        java.nio.CharBuffer charBuffer35 = charBuffer32.get(charArray34);
        java.nio.CharBuffer charBuffer36 = charBuffer32.compact();
        com.google.common.collect.ImmutableSet<java.lang.Appendable> appendableSet37 = com.google.common.collect.ImmutableSet.of((java.lang.Appendable) charBuffer15, (java.lang.Appendable) charBuffer20, (java.lang.Appendable) charBuffer26, (java.lang.Appendable) charBuffer36);
        java.time.ZoneOffset zoneOffset41 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime42 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset41);
        int int43 = localDateTime42.getYear();
        java.time.Instant instant44 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset48 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime49 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset48);
        java.time.OffsetDateTime offsetDateTime50 = java.time.OffsetDateTime.ofInstant(instant44, (java.time.ZoneId) zoneOffset48);
        java.time.Instant instant51 = localDateTime42.toInstant(zoneOffset48);
        boolean boolean52 = appendableSet37.equals((java.lang.Object) zoneOffset48);
        java.lang.Object[] objArray53 = appendableSet37.toArray();
        java.util.concurrent.TimeUnit timeUnit54 = java.util.concurrent.TimeUnit.HOURS;
        boolean boolean55 = appendableSet37.contains((java.lang.Object) timeUnit54);
        com.google.common.collect.ImmutableList<java.lang.Appendable> appendableList56 = appendableSet37.asList();
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap57 = java.nio.charset.Charset.availableCharsets();
        java.net.URISyntaxException uRISyntaxException60 = new java.net.URISyntaxException("hi!", "");
        boolean boolean61 = strMap57.containsKey((java.lang.Object) "");
        java.util.Set<java.lang.String> strSet62 = strMap57.keySet();
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet67 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet67, strArray66);
        boolean boolean69 = strSet67.isEmpty();
        java.nio.ByteBuffer byteBuffer71 = java.nio.ByteBuffer.allocate(100);
        boolean boolean72 = strSet67.equals((java.lang.Object) byteBuffer71);
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet77 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet77, strArray76);
        boolean boolean79 = strSet77.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream80 = strSet77.stream();
        boolean boolean81 = strSet67.retainAll((java.util.Collection<java.lang.String>) strSet77);
        boolean boolean82 = strSet62.containsAll((java.util.Collection<java.lang.String>) strSet67);
        com.google.javascript.jscomp.CompilerOptions compilerOptions83 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions83.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat86 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions83.errorFormat = errorFormat86;
        byte[] byteArray88 = compilerOptions83.inputPropertyMapSerialized;
        compilerOptions83.setInstrumentationTemplate("{}");
        compilerOptions83.renamePrefixNamespace = "";
        boolean boolean93 = strSet67.equals((java.lang.Object) "");
        boolean boolean94 = appendableSet37.containsAll((java.util.Collection<java.lang.String>) strSet67);
        java.lang.String str95 = java.util.Locale.lookupTag(languageRangeList13, (java.util.Collection<java.lang.String>) strSet67);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(charBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charBuffer18);
        org.junit.Assert.assertNotNull(charBuffer20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer23);
        org.junit.Assert.assertNotNull(charBuffer24);
        org.junit.Assert.assertNotNull(charBuffer26);
        org.junit.Assert.assertNotNull(charBuffer28);
        org.junit.Assert.assertNotNull(charBuffer30);
        org.junit.Assert.assertNotNull(charBuffer32);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer35);
        org.junit.Assert.assertNotNull(charBuffer36);
        org.junit.Assert.assertNotNull(appendableSet37);
        org.junit.Assert.assertNotNull(zoneOffset41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1970 + "'", int43 == 1970);
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertNotNull(zoneOffset48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(offsetDateTime50);
        org.junit.Assert.assertNotNull(instant51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000, \000\000, \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000, \000\000, \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000]");
        org.junit.Assert.assertNotNull(timeUnit54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(appendableList56);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(byteBuffer71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strStream80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(errorFormat86);
        org.junit.Assert.assertNull(byteArray88);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        int[] intArray4 = new int[] { 16, ':', 43, (short) 100 };
        java.util.stream.IntStream intStream5 = java.util.stream.IntStream.of(intArray4);
        int[] intArray6 = intStream5.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.util.PrimitiveIterator.OfInt ofInt7 = intStream5.iterator();
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
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.optimizeCalls = false;
        compilerOptions0.preferLineBreakAtEndOfFile = false;
        boolean boolean5 = compilerOptions0.markNoSideEffectCalls;
        boolean boolean6 = compilerOptions0.labelRenaming;
        compilerOptions0.optimizeCalls = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        int int0 = java.util.Spliterator.SUBSIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16384 + "'", int0 == 16384);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileOptions fileOptions2 = com.google.protobuf.DescriptorProtos.FileOptions.parseDelimitedFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.time.Period period0 = java.time.Period.ZERO;
        java.time.chrono.ChronoPeriod chronoPeriod1 = period0.normalized();
        java.time.Period period3 = period0.plusMonths((long) ' ');
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset7);
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime13 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset12);
        java.time.ZonedDateTime zonedDateTime14 = java.time.ZonedDateTime.of(localDateTime8, (java.time.ZoneId) zoneOffset12);
        java.time.ZonedDateTime zonedDateTime16 = zonedDateTime14.withYear((int) (short) 1);
        java.time.temporal.ChronoField chronoField17 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit18 = chronoField17.getBaseUnit();
        java.time.ZonedDateTime zonedDateTime19 = zonedDateTime14.truncatedTo(temporalUnit18);
        java.time.Duration duration20 = temporalUnit18.getDuration();
        long long21 = duration20.toDays();
        java.time.Duration duration22 = duration20.negated();
        java.time.Instant instant23 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset27);
        java.time.OffsetDateTime offsetDateTime29 = java.time.OffsetDateTime.ofInstant(instant23, (java.time.ZoneId) zoneOffset27);
        java.time.ZoneOffset zoneOffset33 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime34 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset33);
        java.time.ZoneOffset zoneOffset38 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime39 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset38);
        java.time.ZonedDateTime zonedDateTime40 = java.time.ZonedDateTime.of(localDateTime34, (java.time.ZoneId) zoneOffset38);
        java.time.Clock clock41 = java.time.Clock.fixed(instant23, (java.time.ZoneId) zoneOffset38);
        java.time.ZoneOffset zoneOffset45 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime46 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset45);
        java.time.ZoneOffset zoneOffset50 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime51 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset50);
        java.time.ZonedDateTime zonedDateTime52 = java.time.ZonedDateTime.of(localDateTime46, (java.time.ZoneId) zoneOffset50);
        java.time.ZonedDateTime zonedDateTime54 = zonedDateTime52.withYear((int) (short) 1);
        java.time.temporal.ChronoField chronoField55 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit56 = chronoField55.getBaseUnit();
        java.time.ZonedDateTime zonedDateTime57 = zonedDateTime52.truncatedTo(temporalUnit56);
        java.time.Duration duration58 = temporalUnit56.getDuration();
        long long59 = duration58.toDays();
        java.time.Duration duration61 = duration58.minusDays(999L);
        java.time.Clock clock62 = java.time.Clock.tick(clock41, duration58);
        int int63 = duration20.compareTo(duration58);
        java.time.Duration duration65 = java.time.Duration.ofDays(52L);
        java.time.Duration duration66 = duration20.minus(duration65);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period67 = period3.minus((java.time.temporal.TemporalAmount) duration66);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unit must be Years, Months or Days, but was Seconds");
        } catch (java.time.DateTimeException e) {
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
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertTrue("'" + chronoField17 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField17.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit18 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit18.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(offsetDateTime29);
        org.junit.Assert.assertNotNull(zoneOffset33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(zoneOffset38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(zonedDateTime40);
        org.junit.Assert.assertNotNull(clock41);
        org.junit.Assert.assertNotNull(zoneOffset45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(zoneOffset50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(zonedDateTime52);
        org.junit.Assert.assertNotNull(zonedDateTime54);
        org.junit.Assert.assertTrue("'" + chronoField55 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField55.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit56 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit56.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(zonedDateTime57);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(clock62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(duration66);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        com.google.javascript.jscomp.SourceAst sourceAst38 = null;
        com.google.javascript.rhino.InputId inputId39 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput41 = new com.google.javascript.jscomp.CompilerInput(sourceAst38, inputId39, true);
        java.io.PrintStream printStream42 = null;
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler(printStream42);
        com.google.javascript.jscomp.ErrorManager errorManager44 = compiler43.getErrorManager();
        compilerInput41.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler43);
        com.google.javascript.jscomp.CodingConvention codingConvention46 = compiler43.getCodingConvention();
        com.google.javascript.jscomp.ErrorManager errorManager47 = compiler43.getErrorManager();
        boolean boolean48 = jSError35.equals((java.lang.Object) compiler43);
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
        org.junit.Assert.assertNotNull(errorManager44);
        org.junit.Assert.assertNotNull(codingConvention46);
        org.junit.Assert.assertNotNull(errorManager47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("java.nio.HeapFloatBuffer[pos=0 lim=6 cap=6]");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = descriptor0.toProto();
        boolean boolean2 = descriptorProto1.isInitialized();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions3 = descriptorProto1.getOptions();
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder4 = messageOptions3.newBuilderForType();
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder6 = builder4.setMessageSetWireFormat(false);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor7 = null;
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto8 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.getDefaultInstance();
        boolean boolean9 = fieldDescriptorProto8.hasExtendee();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.Message.Builder builder10 = builder6.setField(fieldDescriptor7, (java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(descriptorProto1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(messageOptions3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(fieldDescriptorProto8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        jSTypeRegistry2.identifyNonNullableName("/");
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, false);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSTypeRegistry9.createObjectType(objectType10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, false);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = jSTypeRegistry14.createObjectType(objectType15);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair17 = objectType11.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType16);
        com.google.javascript.rhino.Node node18 = objectType11.getRootNode();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, false);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSTypeRegistry21.createObjectType(objectType22);
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, false);
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = jSTypeRegistry26.createObjectType(objectType27);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair29 = objectType23.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType28);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = objectType11.testForEquality((com.google.javascript.rhino.jstype.JSType) objectType23);
        com.google.javascript.rhino.jstype.JSType jSType35 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType11, "ISO", "Named type with empty name component", 256, 9);
        com.google.javascript.rhino.JSDocInfo jSDocInfo36 = jSType35.getJSDocInfo();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(typePair17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertNotNull(typePair29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(jSType35);
        org.junit.Assert.assertNull(jSDocInfo36);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output2 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream4 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output2, (int) 'a');
        byte[] byteArray5 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions7 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray5, extensionRegistryLite6);
        output2.write(byteArray5);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder9 = builder0.mergeFrom(byteArray5);
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions10 = builder0.buildPartial();
        com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder builder11 = builder0.addUninterpretedOptionBuilder();
        boolean boolean12 = builder11.hasNegativeIntValue();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder builder14 = builder11.clearField(fieldDescriptor13);
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
        org.junit.Assert.assertNotNull(methodOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.nio.IntBuffer intBuffer1 = java.nio.IntBuffer.allocate(256);
        int[] intArray6 = new int[] { 16, ':', 43, (short) 100 };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        int[] intArray8 = intStream7.toArray();
        java.nio.IntBuffer intBuffer9 = intBuffer1.put(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.IntBuffer intBuffer12 = java.nio.IntBuffer.wrap(intArray8, 10, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intBuffer1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[16, 58, 43, 100]");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[16, 58, 43, 100]");
        org.junit.Assert.assertNotNull(intBuffer9);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        com.google.protobuf.DescriptorProtos.DescriptorProto.Builder builder27 = descriptorProto22.newBuilderForType();
        boolean boolean28 = builder27.hasName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder builder30 = builder27.addExtensionRangeBuilder(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite22 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo23 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.parseFrom(byteArray20, extensionRegistryLite22);
        int int24 = sourceCodeInfo23.getSerializedSize();
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
        org.junit.Assert.assertNotNull(sourceCodeInfo23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        java.util.stream.LongStream longStream4 = java.util.stream.LongStream.of((long) (-1));
        com.google.common.collect.ImmutableMap<com.google.javascript.jscomp.Compiler, java.util.stream.LongStream> compilerMap5 = com.google.common.collect.ImmutableMap.of(compiler1, longStream4);
        java.util.stream.DoubleStream doubleStream6 = longStream4.asDoubleStream();
        double[] doubleArray7 = doubleStream6.toArray();
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
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0]");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.google.javascript.jscomp.SourceMap.Format format0 = com.google.javascript.jscomp.SourceMap.Format.V2;
        org.junit.Assert.assertNotNull(format0);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.CodingErrorAction codingErrorAction2 = charsetDecoder1.malformedInputAction();
        java.nio.charset.CodingErrorAction codingErrorAction3 = charsetDecoder1.unmappableCharacterAction();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        boolean boolean10 = strSet8.isEmpty();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(100);
        boolean boolean13 = strSet8.equals((java.lang.Object) byteBuffer12);
        java.nio.IntBuffer intBuffer14 = byteBuffer12.asIntBuffer();
        double double15 = byteBuffer12.getDouble();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer12.asReadOnlyBuffer();
        java.nio.CharBuffer charBuffer17 = charsetDecoder1.decode(byteBuffer16);
        java.nio.ShortBuffer shortBuffer18 = byteBuffer16.asShortBuffer();
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(codingErrorAction2);
        org.junit.Assert.assertNotNull(codingErrorAction3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intBuffer14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(charBuffer17);
        org.junit.Assert.assertNotNull(shortBuffer18);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime21 = offsetDateTime19.withMonth(64);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 64");
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
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset18);
        org.junit.Assert.assertNotNull(offsetDateTime19);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type type0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_SINT32;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_SINT32 + "'", type0.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_SINT32));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.nio.channels.FileChannel.MapMode mapMode0 = java.nio.channels.FileChannel.MapMode.READ_WRITE;
        org.junit.Assert.assertNotNull(mapMode0);
        org.junit.Assert.assertEquals(mapMode0.toString(), "READ_WRITE");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.optimizeCalls = false;
        compilerOptions0.preferLineBreakAtEndOfFile = false;
        compilerOptions0.setProcessCommonJSModules(true);
        compilerOptions0.resetWarningsGuard();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.optimizeCalls = false;
        compilerOptions8.preferLineBreakAtEndOfFile = false;
        boolean boolean13 = compilerOptions8.markNoSideEffectCalls;
        boolean boolean14 = compilerOptions8.labelRenaming;
        com.google.javascript.jscomp.DependencyOptions dependencyOptions15 = new com.google.javascript.jscomp.DependencyOptions();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        boolean boolean22 = strSet20.isEmpty();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(100);
        boolean boolean25 = strSet20.equals((java.lang.Object) byteBuffer24);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        boolean boolean32 = strSet30.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream33 = strSet30.stream();
        boolean boolean34 = strSet20.retainAll((java.util.Collection<java.lang.String>) strSet30);
        com.google.javascript.jscomp.DependencyOptions dependencyOptions35 = dependencyOptions15.setEntryPoints((java.util.Collection<java.lang.String>) strSet20);
        compilerOptions8.setDependencyOptions(dependencyOptions15);
        com.google.javascript.jscomp.CheckLevel checkLevel37 = compilerOptions8.checkGlobalThisLevel;
        compilerOptions0.setCheckProvides(checkLevel37);
        com.google.javascript.jscomp.CompilerOptions.Reach reach39 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach39);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dependencyOptions35);
        org.junit.Assert.assertTrue("'" + checkLevel37 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel37.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + reach39 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach39.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        int int1 = com.google.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset4);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset4);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.minusDays((long) (short) 100);
        java.lang.String str9 = offsetDateTime6.toString();
        java.time.LocalTime localTime10 = offsetDateTime6.toLocalTime();
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime15 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset14);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset19);
        java.time.ZonedDateTime zonedDateTime21 = java.time.ZonedDateTime.of(localDateTime15, (java.time.ZoneId) zoneOffset19);
        java.time.temporal.ChronoField chronoField23 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit24 = chronoField23.getBaseUnit();
        java.time.LocalDateTime localDateTime25 = localDateTime15.plus((long) 1970, temporalUnit24);
        java.time.LocalTime localTime26 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localDateTime25);
        boolean boolean27 = localTime10.isBefore(localTime26);
        java.time.temporal.ChronoField chronoField28 = java.time.temporal.ChronoField.EPOCH_DAY;
        java.time.Instant instant29 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset33 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime34 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset33);
        java.time.OffsetDateTime offsetDateTime35 = java.time.OffsetDateTime.ofInstant(instant29, (java.time.ZoneId) zoneOffset33);
        java.time.temporal.ValueRange valueRange36 = chronoField28.rangeRefinedBy((java.time.temporal.TemporalAccessor) offsetDateTime35);
        java.time.format.DateTimeFormatter dateTimeFormatter37 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.lang.String str38 = offsetDateTime35.format(dateTimeFormatter37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = localTime10.format(dateTimeFormatter37);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: Year");
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
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertTrue("'" + chronoField23 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField23.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit24 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit24.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + chronoField28 + "' != '" + java.time.temporal.ChronoField.EPOCH_DAY + "'", chronoField28.equals(java.time.temporal.ChronoField.EPOCH_DAY));
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(zoneOffset33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(offsetDateTime35);
        org.junit.Assert.assertNotNull(valueRange36);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01+00:00:52" + "'", str38, "1970-01-01+00:00:52");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.google.common.collect.ImmutableList.Builder<java.util.function.LongUnaryOperator> longUnaryOperatorBuilder0 = com.google.common.collect.ImmutableList.builder();
        java.util.function.LongUnaryOperator longUnaryOperator1 = java.util.function.LongUnaryOperator.identity();
        com.google.common.collect.ImmutableList.Builder<java.util.function.LongUnaryOperator> longUnaryOperatorBuilder2 = longUnaryOperatorBuilder0.add(longUnaryOperator1);
        org.junit.Assert.assertNotNull(longUnaryOperatorBuilder0);
        org.junit.Assert.assertNotNull(longUnaryOperator1);
        org.junit.Assert.assertNotNull(longUnaryOperatorBuilder2);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer3 = charBuffer1.put('a');
        char[] charArray5 = new char[] { '4' };
        java.nio.CharBuffer charBuffer6 = charBuffer3.get(charArray5);
        java.nio.CharBuffer charBuffer8 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer10 = charBuffer8.put('a');
        char[] charArray12 = new char[] { '4' };
        java.nio.CharBuffer charBuffer13 = charBuffer10.get(charArray12);
        java.nio.CharBuffer charBuffer14 = charBuffer3.put(charArray12);
        java.nio.CharBuffer charBuffer15 = charBuffer3.slice();
        java.nio.CharBuffer charBuffer17 = charBuffer3.append('#');
        int int18 = charBuffer17.length();
        java.nio.CharBuffer charBuffer19 = charBuffer17.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period20 = java.time.Period.parse((java.lang.CharSequence) charBuffer19);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Period");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertNotNull(charBuffer8);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer13);
        org.junit.Assert.assertNotNull(charBuffer14);
        org.junit.Assert.assertNotNull(charBuffer15);
        org.junit.Assert.assertNotNull(charBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 28 + "'", int18 == 28);
        org.junit.Assert.assertNotNull(charBuffer19);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap functionInformationMap7 = com.google.javascript.jscomp.FunctionInformationMap.parseFrom(codedInputStream5, extensionRegistryLite6);
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
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        java.time.LocalDate localDate0 = java.time.LocalDate.now();
        java.lang.String str1 = localDate0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate3 = localDate0.minusYears(6603384152749567654L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -6603384152749565632");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2022-02-21" + "'", str1, "2022-02-21");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        int int0 = java.util.Spliterator.SIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.addExtension(builder3);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder6 = builder0.addEnumTypeBuilder();
        boolean boolean7 = builder0.hasName();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = builder0.hasField(fieldDescriptor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + label4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) ' ', node5, (int) 'a', 43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler1.getErrorManager();
        com.google.javascript.jscomp.SourceFile sourceFile4 = com.google.javascript.jscomp.SourceFile.fromFile("/");
        com.google.javascript.jscomp.SourceFile.Generator generator6 = null;
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator6);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat11 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions8.errorFormat = errorFormat11;
        compilerOptions8.setRemoveDeadCode(false);
        com.google.javascript.jscomp.Result result15 = compiler1.compile(sourceFile4, sourceFile7, compilerOptions8);
        com.google.javascript.jscomp.SourceMap sourceMap16 = result15.sourceMap;
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertNotNull(errorFormat11);
        org.junit.Assert.assertNotNull(result15);
        org.junit.Assert.assertNull(sourceMap16);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions1 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream0);
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder2 = enumOptions1.toBuilder();
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder3 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output5 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream7 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output5, (int) 'a');
        byte[] byteArray8 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite9 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions10 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray8, extensionRegistryLite9);
        output5.write(byteArray8);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder12 = builder3.mergeFrom(byteArray8);
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions13 = builder3.buildPartial();
        com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder builder14 = builder3.addUninterpretedOptionBuilder();
        com.google.protobuf.DescriptorProtos.UninterpretedOption uninterpretedOption15 = builder14.buildPartial();
        java.lang.String str16 = uninterpretedOption15.getIdentifierValue();
        int int17 = uninterpretedOption15.getNameCount();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder18 = builder2.addUninterpretedOption(uninterpretedOption15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder namePartOrBuilder20 = uninterpretedOption15.getNameOrBuilder(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(enumOptions1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(output5);
        org.junit.Assert.assertNotNull(codedOutputStream7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(methodOptions10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(methodOptions13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(uninterpretedOption15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.EPOCH_DAY;
        java.time.Instant instant2 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset6);
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.ofInstant(instant2, (java.time.ZoneId) zoneOffset6);
        java.time.temporal.ValueRange valueRange9 = chronoField1.rangeRefinedBy((java.time.temporal.TemporalAccessor) offsetDateTime8);
        java.time.format.DateTimeFormatter dateTimeFormatter10 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.lang.String str11 = offsetDateTime8.format(dateTimeFormatter10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetTime offsetTime12 = java.time.OffsetTime.parse((java.lang.CharSequence) "hi!", dateTimeFormatter10);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.EPOCH_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.EPOCH_DAY));
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertNotNull(valueRange9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01+00:00:52" + "'", str11, "1970-01-01+00:00:52");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        int int5 = localDateTime4.getYear();
        java.time.Instant instant6 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset10 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime11 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset10);
        java.time.OffsetDateTime offsetDateTime12 = java.time.OffsetDateTime.ofInstant(instant6, (java.time.ZoneId) zoneOffset10);
        java.time.Instant instant13 = localDateTime4.toInstant(zoneOffset10);
        java.lang.String str14 = instant13.toString();
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(zoneOffset10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(offsetDateTime12);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01T00:01:40Z" + "'", str14, "1970-01-01T00:01:40Z");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto2 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.parseFrom(inputStream0, extensionRegistryLite1);
        com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder serviceOptionsOrBuilder3 = serviceDescriptorProto2.getOptionsOrBuilder();
        org.junit.Assert.assertNotNull(serviceDescriptorProto2);
        org.junit.Assert.assertNotNull(serviceOptionsOrBuilder3);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        int int7 = codedInputStream5.pushLimit((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto8 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.parseFrom(codedInputStream5);
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
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("/");
        java.lang.String str3 = sourceFile1.getLine((int) 'a');
        int int5 = sourceFile1.getLineOfOffset(43);
        com.google.javascript.jscomp.CompilerInput compilerInput6 = new com.google.javascript.jscomp.CompilerInput(sourceFile1);
        sourceFile1.clearCachedSource();
        org.junit.Assert.assertNotNull(sourceFile1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.security.InvalidKeyException invalidKeyException1 = new java.security.InvalidKeyException();
        java.security.SignatureException signatureException2 = new java.security.SignatureException("hi!", (java.lang.Throwable) invalidKeyException1);
        java.util.InvalidPropertiesFormatException invalidPropertiesFormatException3 = new java.util.InvalidPropertiesFormatException((java.lang.Throwable) signatureException2);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder1 = builder0.clearCcGenericServices();
        boolean boolean2 = builder0.isInitialized();
        boolean boolean3 = builder0.getJavaGenericServices();
        java.lang.String str4 = builder0.getJavaOuterClassname();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.nio.ByteOrder byteOrder0 = java.nio.ByteOrder.BIG_ENDIAN;
        org.junit.Assert.assertNotNull(byteOrder0);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder12 = builder11.clear();
        java.io.InputStream inputStream13 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = builder12.mergeDelimitedFrom(inputStream13, extensionRegistryLite14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        boolean boolean9 = strSet7.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream10 = strSet7.stream();
        java.lang.String str11 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet7);
        java.util.Iterator<java.lang.String> strItor12 = strSet7.iterator();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strItor12);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = jSTypeRegistry7.createObjectType(objectType8);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair10 = objectType4.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, false);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = jSTypeRegistry14.createObjectType(objectType15);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry19.createObjectType(objectType20);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair22 = objectType16.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType21);
        com.google.javascript.rhino.Node node23 = objectType16.getRootNode();
        com.google.javascript.rhino.jstype.EnumType enumType24 = objectType16.toMaybeEnumType();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean29 = node28.isStringKey();
        boolean boolean30 = node28.isThrow();
        boolean boolean31 = node28.isVarArgs();
        boolean boolean32 = node28.isStringKey();
        boolean boolean33 = objectType9.defineInferredProperty("Unknown class name", (com.google.javascript.rhino.jstype.JSType) objectType16, node28);
        boolean boolean34 = node28.isVar();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(typePair10);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(typePair22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(enumType24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean5 = node4.isStringKey();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node4);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable7 = node4.getAncestors();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator8 = ancestorIterable7.spliterator();
        int int9 = nodeSpliterator8.characteristics();
        long long10 = nodeSpliterator8.estimateSize();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ancestorIterable7);
        org.junit.Assert.assertNotNull(nodeSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.nio.file.attribute.FileTime fileTime1 = java.nio.file.attribute.FileTime.from(instant0);
        java.time.Instant instant3 = instant0.plusNanos((long) 32);
        java.nio.file.attribute.FileTime fileTime4 = java.nio.file.attribute.FileTime.from(instant0);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(fileTime1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(fileTime4);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        com.google.javascript.jscomp.SourceAst sourceAst4 = null;
        com.google.javascript.rhino.InputId inputId5 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput(sourceAst4, inputId5, true);
        com.google.javascript.jscomp.SourceAst sourceAst8 = null;
        com.google.javascript.rhino.InputId inputId9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = new com.google.javascript.jscomp.CompilerInput(sourceAst8, inputId9, true);
        com.google.javascript.rhino.InputId inputId12 = compilerInput11.getInputId();
        com.google.javascript.jscomp.SourceAst sourceAst13 = null;
        com.google.javascript.rhino.InputId inputId14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = new com.google.javascript.jscomp.CompilerInput(sourceAst13, inputId14, true);
        com.google.javascript.rhino.InputId inputId17 = compilerInput16.getInputId();
        com.google.javascript.jscomp.SourceAst sourceAst18 = null;
        com.google.javascript.rhino.InputId inputId19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = new com.google.javascript.jscomp.CompilerInput(sourceAst18, inputId19, true);
        java.io.PrintStream printStream22 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler23.getErrorManager();
        compilerInput21.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler23);
        com.google.javascript.jscomp.SourceAst sourceAst26 = null;
        com.google.javascript.rhino.InputId inputId27 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput29 = new com.google.javascript.jscomp.CompilerInput(sourceAst26, inputId27, true);
        com.google.javascript.rhino.InputId inputId30 = compilerInput29.getInputId();
        com.google.javascript.jscomp.SourceAst sourceAst31 = null;
        com.google.javascript.rhino.InputId inputId32 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput34 = new com.google.javascript.jscomp.CompilerInput(sourceAst31, inputId32, true);
        com.google.javascript.jscomp.SourceAst sourceAst35 = null;
        com.google.javascript.rhino.InputId inputId36 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput38 = new com.google.javascript.jscomp.CompilerInput(sourceAst35, inputId36, true);
        java.io.PrintStream printStream39 = null;
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler(printStream39);
        com.google.javascript.jscomp.ErrorManager errorManager41 = compiler40.getErrorManager();
        compilerInput38.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler40);
        com.google.javascript.jscomp.SourceAst sourceAst43 = null;
        com.google.javascript.rhino.InputId inputId44 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput46 = new com.google.javascript.jscomp.CompilerInput(sourceAst43, inputId44, true);
        com.google.javascript.jscomp.CompilerInput[] compilerInputArray47 = new com.google.javascript.jscomp.CompilerInput[] { compilerInput34, compilerInput38, compilerInput46 };
        com.google.common.collect.ImmutableSet<com.google.javascript.jscomp.CompilerInput> compilerInputSet48 = com.google.common.collect.ImmutableSet.of(compilerInput3, compilerInput7, compilerInput11, compilerInput16, compilerInput21, compilerInput29, compilerInputArray47);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.String> strCollection49 = compilerInput3.getRequires();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNull(inputId17);
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertNotNull(errorManager41);
        org.junit.Assert.assertNotNull(compilerInputArray47);
        org.junit.Assert.assertNotNull(compilerInputSet48);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset3);
        java.time.ZoneOffset zoneOffset8 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset8);
        java.time.ZonedDateTime zonedDateTime10 = java.time.ZonedDateTime.of(localDateTime4, (java.time.ZoneId) zoneOffset8);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime10.withHour(16);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime13 = zonedDateTime12.toLocalDateTime();
        java.time.ZonedDateTime zonedDateTime14 = zonedDateTime12.withFixedOffsetZone();
        java.time.temporal.TemporalAdjuster temporalAdjuster15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime16 = zonedDateTime12.with(temporalAdjuster15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(zoneOffset8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto1 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.getDefaultInstance();
        int int2 = com.google.protobuf.CodedOutputStream.computeMessageSetExtensionSize((int) (byte) -1, (com.google.protobuf.MessageLite) methodDescriptorProto1);
        byte[] byteArray3 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite4 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions5 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray3, extensionRegistryLite4);
        com.google.protobuf.CodedOutputStream codedOutputStream8 = com.google.protobuf.CodedOutputStream.newInstance(byteArray3, (int) (short) 0, 1);
        com.google.protobuf.CodedOutputStream codedOutputStream11 = com.google.protobuf.CodedOutputStream.newInstance(byteArray3, (int) ' ', 0);
        int int12 = codedOutputStream11.spaceLeft();
        methodDescriptorProto1.writeTo(codedOutputStream11);
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
        byte[] byteArray28 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite29 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions30 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray28, extensionRegistryLite29);
        com.google.protobuf.CodedOutputStream codedOutputStream33 = com.google.protobuf.CodedOutputStream.newInstance(byteArray28, (int) (short) 0, 1);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite34 = null;
        com.google.protobuf.DescriptorProtos.FileDescriptorProto fileDescriptorProto35 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(byteArray28, extensionRegistryLite34);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite36 = null;
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto37 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.parseFrom(byteArray28, extensionRegistryLite36);
        com.google.protobuf.UnknownFieldSet unknownFieldSet38 = com.google.protobuf.UnknownFieldSet.parseFrom(byteArray28);
        com.google.protobuf.ByteString byteString39 = unknownFieldSet38.toByteString();
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite40 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder41 = builder22.mergeFrom(byteString39, extensionRegistryLite40);
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto42 = com.google.protobuf.DescriptorProtos.DescriptorProto.parseFrom(byteString39);
        // The following exception was thrown during execution in test generation
        try {
            codedOutputStream11.writeBytes(12, byteString39);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.CodedOutputStream.OutOfSpaceException; message: CodedOutputStream was writing to a flat byte array and ran out of space.");
        } catch (com.google.protobuf.CodedOutputStream.OutOfSpaceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(methodDescriptorProto1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(methodOptions5);
        org.junit.Assert.assertNotNull(codedOutputStream8);
        org.junit.Assert.assertNotNull(codedOutputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
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
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(methodOptions30);
        org.junit.Assert.assertNotNull(codedOutputStream33);
        org.junit.Assert.assertNotNull(fileDescriptorProto35);
        org.junit.Assert.assertNotNull(serviceDescriptorProto37);
        org.junit.Assert.assertNotNull(unknownFieldSet38);
        org.junit.Assert.assertNotNull(byteString39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(descriptorProto42);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        int int2 = com.google.protobuf.CodedOutputStream.computeSFixed32Size((int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.addExtension(builder3);
        boolean boolean6 = builder3.hasDefaultValue();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = builder3.getRepeatedField(fieldDescriptor7, 4095);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + label4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap0 = java.nio.charset.Charset.availableCharsets();
        java.util.Set<java.lang.String> strSet1 = strMap0.keySet();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.parallelStream();
        java.util.Spliterator<java.lang.String> strSpliterator3 = strSet1.spliterator();
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strStream2);
        org.junit.Assert.assertNotNull(strSpliterator3);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer3 = charBuffer1.put('a');
        char[] charArray5 = new char[] { '4' };
        java.nio.CharBuffer charBuffer6 = charBuffer3.get(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer9 = java.nio.CharBuffer.wrap(charArray5, 21, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
        org.junit.Assert.assertNotNull(charBuffer3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer6);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = compiler1.getErrorCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange3 = java.time.temporal.ValueRange.of(0L, 57600000000000L, 946598400000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Smallest maximum value must be less than largest maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.google.javascript.jscomp.DiagnosticType diagnosticType2 = com.google.javascript.jscomp.DiagnosticType.error("\uc11c\ub825\uae30\uc6d0", "// Input %num%");
        org.junit.Assert.assertNotNull(diagnosticType2);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.google.javascript.jscomp.DiagnosticType diagnosticType2 = com.google.javascript.jscomp.DiagnosticType.warning("", "Unknown class name");
        java.text.MessageFormat messageFormat3 = diagnosticType2.format;
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions7.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat10 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions7.errorFormat = errorFormat10;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy12 = null;
        compilerOptions7.variableRenaming = variableRenamingPolicy12;
        compilerOptions7.setSummaryDetailLevel(999);
        compilerOptions7.checkSuspiciousCode = true;
        byte[] byteArray18 = compilerOptions7.inputPropertyMapSerialized;
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions19.optimizeCalls = false;
        compilerOptions19.preferLineBreakAtEndOfFile = false;
        boolean boolean24 = compilerOptions19.markNoSideEffectCalls;
        boolean boolean25 = compilerOptions19.labelRenaming;
        com.google.javascript.jscomp.DependencyOptions dependencyOptions26 = new com.google.javascript.jscomp.DependencyOptions();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        boolean boolean33 = strSet31.isEmpty();
        java.nio.ByteBuffer byteBuffer35 = java.nio.ByteBuffer.allocate(100);
        boolean boolean36 = strSet31.equals((java.lang.Object) byteBuffer35);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        boolean boolean43 = strSet41.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream44 = strSet41.stream();
        boolean boolean45 = strSet31.retainAll((java.util.Collection<java.lang.String>) strSet41);
        com.google.javascript.jscomp.DependencyOptions dependencyOptions46 = dependencyOptions26.setEntryPoints((java.util.Collection<java.lang.String>) strSet31);
        compilerOptions19.setDependencyOptions(dependencyOptions26);
        com.google.javascript.jscomp.CheckLevel checkLevel48 = compilerOptions19.checkGlobalThisLevel;
        compilerOptions7.checkMissingReturn = checkLevel48;
        com.google.javascript.jscomp.DiagnosticType diagnosticType50 = com.google.javascript.jscomp.Compiler.MOTION_ITERATIONS_ERROR;
        java.lang.String[] strArray54 = new java.lang.String[] { "FileDescriptorProto", "16:00:52+00:00:52", "Exceeded max number of code motion iterations: {0}" };
        com.google.javascript.jscomp.JSError jSError55 = com.google.javascript.jscomp.JSError.make("java.nio.HeapFloatBuffer[pos=0 lim=6 cap=6]", (int) (short) 10, (int) ':', checkLevel48, diagnosticType50, strArray54);
        com.google.javascript.jscomp.JSError jSError56 = com.google.javascript.jscomp.JSError.make(diagnosticType2, strArray54);
        org.junit.Assert.assertNotNull(diagnosticType2);
        org.junit.Assert.assertNotNull(messageFormat3);
        org.junit.Assert.assertNotNull(errorFormat10);
        org.junit.Assert.assertNull(byteArray18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strStream44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dependencyOptions46);
        org.junit.Assert.assertTrue("'" + checkLevel48 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel48.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(diagnosticType50);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(jSError55);
        org.junit.Assert.assertNotNull(jSError56);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.time.Month month0 = java.time.Month.APRIL;
        java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) month0);
        java.lang.String str2 = chronology1.toString();
        java.io.File file5 = null;
        java.io.File file6 = java.io.File.createTempFile("hi!", "ISO", file5);
        boolean boolean9 = file6.setWritable(false, false);
        java.net.URI uRI10 = file6.toURI();
        java.io.PrintStream printStream11 = new java.io.PrintStream(file6);
        boolean boolean13 = file6.setReadable(true);
        boolean boolean14 = chronology1.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.APRIL + "'", month0.equals(java.time.Month.APRIL));
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISO" + "'", str2, "ISO");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), "/tmp/hi!2902990960493977625ISO");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(uRI10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy5 = null;
        compilerOptions0.variableRenaming = variableRenamingPolicy5;
        compilerOptions0.setSummaryDetailLevel(999);
        compilerOptions0.checkSuspiciousCode = true;
        byte[] byteArray11 = compilerOptions0.inputPropertyMapSerialized;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.optimizeCalls = false;
        compilerOptions12.preferLineBreakAtEndOfFile = false;
        boolean boolean17 = compilerOptions12.markNoSideEffectCalls;
        boolean boolean18 = compilerOptions12.labelRenaming;
        com.google.javascript.jscomp.DependencyOptions dependencyOptions19 = new com.google.javascript.jscomp.DependencyOptions();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        boolean boolean26 = strSet24.isEmpty();
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocate(100);
        boolean boolean29 = strSet24.equals((java.lang.Object) byteBuffer28);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        boolean boolean36 = strSet34.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream37 = strSet34.stream();
        boolean boolean38 = strSet24.retainAll((java.util.Collection<java.lang.String>) strSet34);
        com.google.javascript.jscomp.DependencyOptions dependencyOptions39 = dependencyOptions19.setEntryPoints((java.util.Collection<java.lang.String>) strSet24);
        compilerOptions12.setDependencyOptions(dependencyOptions19);
        com.google.javascript.jscomp.CheckLevel checkLevel41 = compilerOptions12.checkGlobalThisLevel;
        compilerOptions0.checkMissingReturn = checkLevel41;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy43 = com.google.javascript.jscomp.PropertyRenamingPolicy.ALL_UNQUOTED;
        compilerOptions0.propertyRenaming = propertyRenamingPolicy43;
        org.junit.Assert.assertNotNull(errorFormat3);
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strStream37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dependencyOptions39);
        org.junit.Assert.assertTrue("'" + checkLevel41 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel41.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy43 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.ALL_UNQUOTED + "'", propertyRenamingPolicy43.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.ALL_UNQUOTED));
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.nio.file.attribute.FileTime fileTime1 = java.nio.file.attribute.FileTime.from(instant0);
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.NANOSECONDS;
        long long3 = fileTime1.to(timeUnit2);
        java.lang.String str4 = fileTime1.toString();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(fileTime1);
        org.junit.Assert.assertNotNull(timeUnit2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00Z" + "'", str4, "1970-01-01T00:00:00Z");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy5 = null;
        compilerOptions0.variableRenaming = variableRenamingPolicy5;
        compilerOptions0.setSummaryDetailLevel(999);
        boolean boolean9 = compilerOptions0.getInferTypes();
        compilerOptions0.setDefineToStringLiteral("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=12 cap=12]", "1970-01-01");
        java.lang.String str13 = compilerOptions0.renamePrefixNamespace;
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setRecordFunctionInformation(true);
        boolean boolean17 = compilerOptions14.checkControlStructures;
        compilerOptions14.setCollapseProperties(false);
        compilerOptions14.setAssumeStrictThis(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions22.optimizeCalls = false;
        compilerOptions22.preferLineBreakAtEndOfFile = false;
        boolean boolean27 = compilerOptions22.markNoSideEffectCalls;
        boolean boolean28 = compilerOptions22.labelRenaming;
        com.google.javascript.jscomp.DependencyOptions dependencyOptions29 = new com.google.javascript.jscomp.DependencyOptions();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        boolean boolean36 = strSet34.isEmpty();
        java.nio.ByteBuffer byteBuffer38 = java.nio.ByteBuffer.allocate(100);
        boolean boolean39 = strSet34.equals((java.lang.Object) byteBuffer38);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        boolean boolean46 = strSet44.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream47 = strSet44.stream();
        boolean boolean48 = strSet34.retainAll((java.util.Collection<java.lang.String>) strSet44);
        com.google.javascript.jscomp.DependencyOptions dependencyOptions49 = dependencyOptions29.setEntryPoints((java.util.Collection<java.lang.String>) strSet34);
        compilerOptions22.setDependencyOptions(dependencyOptions29);
        com.google.javascript.jscomp.CheckLevel checkLevel51 = compilerOptions22.checkGlobalThisLevel;
        compilerOptions14.reportMissingOverride = checkLevel51;
        compilerOptions0.setCheckUnreachableCode(checkLevel51);
        compilerOptions0.inputDelimiter = ":";
        compilerOptions0.setRemoveUnusedVars(false);
        org.junit.Assert.assertNotNull(errorFormat3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strStream47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dependencyOptions49);
        org.junit.Assert.assertTrue("'" + checkLevel51 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel51.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        int int7 = codedInputStream5.pushLimit((int) 'a');
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap.Module module9 = com.google.javascript.jscomp.FunctionInformationMap.Module.parseFrom(codedInputStream5, extensionRegistryLite8);
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
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        int int7 = codedInputStream5.pushLimit((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.FunctionInformationMap.Entry entry8 = com.google.javascript.jscomp.FunctionInformationMap.Entry.parseFrom(codedInputStream5);
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
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        com.google.protobuf.DescriptorProtos.DescriptorProto.Builder builder27 = descriptorProto22.newBuilderForType();
        java.util.List<com.google.protobuf.DescriptorProtos.DescriptorProto> descriptorProtoList28 = builder27.getNestedTypeList();
        com.google.protobuf.UnknownFieldSet unknownFieldSet29 = builder27.getUnknownFields();
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder30 = builder27.addEnumTypeBuilder();
        byte[] byteArray32 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite33 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions34 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray32, extensionRegistryLite33);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite35 = null;
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto enumDescriptorProto36 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.parseFrom(byteArray32, extensionRegistryLite35);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto enumDescriptorProto37 = enumDescriptorProto36.getDefaultInstanceForType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.DescriptorProto.Builder builder38 = builder27.setEnumType(23, enumDescriptorProto37);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 23, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(descriptorProtoList28);
        org.junit.Assert.assertNotNull(unknownFieldSet29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(methodOptions34);
        org.junit.Assert.assertNotNull(enumDescriptorProto36);
        org.junit.Assert.assertNotNull(enumDescriptorProto37);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder12 = builder11.clear();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder14 = builder12.clearField(fieldDescriptor13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.google.protobuf.ByteString byteString0 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.FileDescriptorProto fileDescriptorProto2 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(byteString0, extensionRegistryLite1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto4 = fileDescriptorProto2.getExtension(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteString0);
        org.junit.Assert.assertNotNull(fileDescriptorProto2);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto2 = builder0.buildPartial();
        int int3 = fieldDescriptorProto2.getSerializedSize();
        boolean boolean4 = fieldDescriptorProto2.hasDefaultValue();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(fieldDescriptorProto2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection1 = jSDocInfo0.getAuthors();
        java.lang.String str2 = jSDocInfo0.getReturnDescription();
        boolean boolean3 = jSDocInfo0.isExport();
        org.junit.Assert.assertNull(strCollection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        int[] intArray4 = new int[] { 16, ':', 43, (short) 100 };
        java.util.stream.IntStream intStream5 = java.util.stream.IntStream.of(intArray4);
        java.util.stream.IntStream intStream6 = intStream5.parallel();
        java.util.Spliterator.OfInt ofInt7 = intStream6.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<? super java.lang.Integer> wildcardComparator8 = ofInt7.getComparator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[16, 58, 43, 100]");
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(ofInt7);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedOutputStream codedOutputStream5 = com.google.protobuf.CodedOutputStream.newInstance(byteArray0, (int) (short) 0, 1);
        com.google.protobuf.CodedOutputStream codedOutputStream8 = com.google.protobuf.CodedOutputStream.newInstance(byteArray0, (int) ' ', 0);
        int int9 = codedOutputStream8.spaceLeft();
        // The following exception was thrown during execution in test generation
        try {
            codedOutputStream8.writeSInt64NoTag(0L);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.CodedOutputStream.OutOfSpaceException; message: CodedOutputStream was writing to a flat byte array and ran out of space.");
        } catch (com.google.protobuf.CodedOutputStream.OutOfSpaceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(methodOptions2);
        org.junit.Assert.assertNotNull(codedOutputStream5);
        org.junit.Assert.assertNotNull(codedOutputStream8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.google.javascript.jscomp.PerformanceTracker.Stats stats1 = new com.google.javascript.jscomp.PerformanceTracker.Stats("goog.global");
        stats1.gzSize = 100;
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto2 = builder0.buildPartial();
        int int3 = fieldDescriptorProto2.getSerializedSize();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder4 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder(fieldDescriptorProto2);
        com.google.protobuf.DescriptorProtos.FieldOptions fieldOptions5 = builder4.getOptions();
        boolean boolean6 = fieldOptions5.getDeprecated();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(fieldDescriptorProto2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(fieldOptions5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        compilerInput3.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler5);
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler5.getCodingConvention();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection9 = codingConvention8.getAssertionFunctions();
        boolean boolean11 = codingConvention8.isConstantKey("US-ASCII");
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("/");
        java.lang.String str3 = sourceFile1.getLine((int) 'a');
        int int5 = sourceFile1.getLineOfOffset(43);
        com.google.javascript.jscomp.CompilerInput compilerInput6 = new com.google.javascript.jscomp.CompilerInput(sourceFile1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = sourceFile1.getLineOffset((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRecordFunctionInformation(true);
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder3.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder6 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label7 = builder6.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder8 = builder3.addExtension(builder6);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder9 = builder3.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions10 = builder9.getOptions();
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder11 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output13 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream15 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output13, (int) 'a');
        byte[] byteArray16 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite17 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions18 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray16, extensionRegistryLite17);
        output13.write(byteArray16);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder20 = builder11.mergeFrom(byteArray16);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder21 = builder9.mergeFrom(byteArray16);
        compilerOptions0.setInputVariableMapSerialized(byteArray16);
        boolean boolean23 = compilerOptions0.optimizeReturns;
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + label7 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label7.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(enumOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(output13);
        org.junit.Assert.assertNotNull(codedOutputStream15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(methodOptions18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = null;
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto enumDescriptorProto4 = com.google.protobuf.DescriptorProtos.EnumDescriptorProto.parseFrom(byteArray0, extensionRegistryLite3);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder5 = enumDescriptorProto4.newBuilderForType();
        boolean boolean6 = builder5.hasOptions();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder7 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder9 = builder7.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder10 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label11 = builder10.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder12 = builder7.addExtension(builder10);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder13 = builder7.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder14 = builder13.getOptionsBuilder();
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder15 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output17 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream19 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output17, (int) 'a');
        byte[] byteArray20 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite21 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions22 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray20, extensionRegistryLite21);
        output17.write(byteArray20);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder24 = builder15.mergeFrom(byteArray20);
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder25 = builder14.mergeFrom(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder28 = builder5.mergeFrom(byteArray20, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: com.google.protobuf.InvalidProtocolBufferException: CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(methodOptions2);
        org.junit.Assert.assertNotNull(enumDescriptorProto4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + label11 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label11.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(output17);
        org.junit.Assert.assertNotNull(codedOutputStream19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(methodOptions22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime28 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset27);
        int int29 = localDateTime28.getYear();
        java.time.Instant instant30 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset34 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime35 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset34);
        java.time.OffsetDateTime offsetDateTime36 = java.time.OffsetDateTime.ofInstant(instant30, (java.time.ZoneId) zoneOffset34);
        java.time.Instant instant37 = localDateTime28.toInstant(zoneOffset34);
        boolean boolean38 = appendableSet23.equals((java.lang.Object) zoneOffset34);
        java.lang.Object[] objArray39 = appendableSet23.toArray();
        java.util.concurrent.TimeUnit timeUnit40 = java.util.concurrent.TimeUnit.HOURS;
        boolean boolean41 = appendableSet23.contains((java.lang.Object) timeUnit40);
        com.google.common.collect.ImmutableList<java.lang.Appendable> appendableList42 = appendableSet23.asList();
        java.nio.CharBuffer charBuffer45 = java.nio.CharBuffer.allocate((int) ' ');
        boolean boolean46 = charBuffer45.isDirect();
        java.nio.CharBuffer charBuffer48 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer50 = charBuffer48.put('a');
        char[] charArray52 = new char[] { '4' };
        java.nio.CharBuffer charBuffer53 = charBuffer50.get(charArray52);
        java.nio.CharBuffer charBuffer54 = charBuffer50.compact();
        java.nio.CharBuffer charBuffer56 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer58 = charBuffer56.put('a');
        java.nio.CharBuffer charBuffer60 = java.nio.CharBuffer.allocate((int) ' ');
        java.nio.CharBuffer charBuffer62 = charBuffer60.put('a');
        char[] charArray64 = new char[] { '4' };
        java.nio.CharBuffer charBuffer65 = charBuffer62.get(charArray64);
        java.nio.CharBuffer charBuffer66 = charBuffer62.compact();
        com.google.common.collect.ImmutableSet<java.lang.Appendable> appendableSet67 = com.google.common.collect.ImmutableSet.of((java.lang.Appendable) charBuffer45, (java.lang.Appendable) charBuffer50, (java.lang.Appendable) charBuffer56, (java.lang.Appendable) charBuffer66);
        // The following exception was thrown during execution in test generation
        try {
            appendableList42.add(100, (java.lang.Appendable) charBuffer50);
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
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1970 + "'", int29 == 1970);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(zoneOffset34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(offsetDateTime36);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000, \000\000, \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000, \000\000, \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000]");
        org.junit.Assert.assertNotNull(timeUnit40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(appendableList42);
        org.junit.Assert.assertNotNull(charBuffer45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(charBuffer48);
        org.junit.Assert.assertNotNull(charBuffer50);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer53);
        org.junit.Assert.assertNotNull(charBuffer54);
        org.junit.Assert.assertNotNull(charBuffer56);
        org.junit.Assert.assertNotNull(charBuffer58);
        org.junit.Assert.assertNotNull(charBuffer60);
        org.junit.Assert.assertNotNull(charBuffer62);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[\000]");
        org.junit.Assert.assertNotNull(charBuffer65);
        org.junit.Assert.assertNotNull(charBuffer66);
        org.junit.Assert.assertNotNull(appendableSet67);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        boolean boolean12 = compilerMap5.isEmpty();
        java.time.ZoneOffset zoneOffset16 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime17 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset16);
        java.time.ZoneOffset zoneOffset21 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime22 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset21);
        java.time.ZonedDateTime zonedDateTime23 = java.time.ZonedDateTime.of(localDateTime17, (java.time.ZoneId) zoneOffset21);
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        java.time.temporal.TemporalUnit temporalUnit26 = chronoField25.getBaseUnit();
        java.time.LocalDateTime localDateTime27 = localDateTime17.plus((long) 1970, temporalUnit26);
        java.time.LocalDateTime localDateTime29 = localDateTime17.withHour((int) (short) 1);
        java.time.ZoneOffset zoneOffset31 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.OffsetDateTime offsetDateTime32 = java.time.OffsetDateTime.of(localDateTime17, zoneOffset31);
        boolean boolean33 = compilerMap5.equals((java.lang.Object) localDateTime17);
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(compilerMap5);
        org.junit.Assert.assertNotNull(optimizeModeOrdering6);
        org.junit.Assert.assertTrue("'" + optimizeMode7 + "' != '" + com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.CODE_SIZE + "'", optimizeMode7.equals(com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.CODE_SIZE));
        org.junit.Assert.assertTrue("'" + optimizeMode8 + "' != '" + com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.CODE_SIZE + "'", optimizeMode8.equals(com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.CODE_SIZE));
        org.junit.Assert.assertTrue("'" + optimizeMode9 + "' != '" + com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.CODE_SIZE + "'", optimizeMode9.equals(com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.CODE_SIZE));
        org.junit.Assert.assertNotNull(enumDescriptor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneOffset16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(zoneOffset21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField25.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + temporalUnit26 + "' != '" + java.time.temporal.ChronoUnit.HOURS + "'", temporalUnit26.equals(java.time.temporal.ChronoUnit.HOURS));
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(zoneOffset31);
        org.junit.Assert.assertNotNull(offsetDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto0 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.getDefaultInstance();
        boolean boolean1 = serviceDescriptorProto0.hasOptions();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder2 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.newBuilder(serviceDescriptorProto0);
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto3 = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.getDefaultInstance();
        boolean boolean4 = serviceDescriptorProto3.hasOptions();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder builder5 = builder2.mergeFrom(serviceDescriptorProto3);
        java.util.Map<com.google.protobuf.Descriptors.FieldDescriptor, java.lang.Object> fieldDescriptorMap6 = builder2.getAllFields();
        com.google.protobuf.DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto7 = builder2.build();
        org.junit.Assert.assertNotNull(serviceDescriptorProto0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(serviceDescriptorProto3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(fieldDescriptorMap6);
        org.junit.Assert.assertNotNull(serviceDescriptorProto7);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label1 = builder0.getLabel();
        com.google.protobuf.ByteString byteString2 = com.google.protobuf.ByteString.EMPTY;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions4 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(byteString2, extensionRegistryLite3);
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder5 = builder0.mergeFrom(byteString2);
        java.io.InputStream inputStream6 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite7 = null;
        com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto8 = com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.parseFrom(inputStream6, extensionRegistryLite7);
        int int9 = enumValueDescriptorProto8.getNumber();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder10 = builder5.mergeFrom((com.google.protobuf.Message) enumValueDescriptorProto8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: mergeFrom(Message) can only merge messages of the same type.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + label1 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label1.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(byteString2);
        org.junit.Assert.assertNotNull(enumOptions4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(enumValueDescriptorProto8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("", "java.nio.HeapFloatBuffer[pos=0 lim=6 cap=6]", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("1970-01-01+00:00:52");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(1970-01-01+00:00:52)" + "'", str1, "(1970-01-01+00:00:52)");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.time.temporal.ChronoField chronoField2 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        java.time.Instant instant3 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset7);
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.ofInstant(instant3, (java.time.ZoneId) zoneOffset7);
        java.time.OffsetDateTime offsetDateTime11 = offsetDateTime9.minusDays((long) (short) 100);
        java.lang.String str12 = offsetDateTime9.toString();
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        int int14 = offsetDateTime9.get((java.time.temporal.TemporalField) chronoField13);
        java.time.OffsetDateTime offsetDateTime16 = offsetDateTime9.withDayOfMonth((int) (short) 10);
        java.time.ZoneOffset zoneOffset17 = java.time.ZoneOffset.MAX;
        java.time.OffsetDateTime offsetDateTime18 = offsetDateTime16.withOffsetSameLocal(zoneOffset17);
        boolean boolean19 = chronoField2.isSupportedBy((java.time.temporal.TemporalAccessor) zoneOffset17);
        java.time.LocalDateTime localDateTime20 = java.time.LocalDateTime.ofEpochSecond((long) 8, 10, zoneOffset17);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime21 = java.time.ZonedDateTime.from((java.time.temporal.TemporalAccessor) localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain ZonedDateTime from TemporalAccessor: 1970-01-01T18:00:08.000000010 of type java.time.LocalDateTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + chronoField2 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField2.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01T00:00:52+00:00:52" + "'", str12, "1970-01-01T00:00:52+00:00:52");
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField13.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertNotNull(offsetDateTime16);
        org.junit.Assert.assertNotNull(zoneOffset17);
        org.junit.Assert.assertNotNull(offsetDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        java.util.List<com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder> builderList3 = builder0.getServiceBuilderList();
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo4 = null;
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.mergeSourceCodeInfo(sourceCodeInfo4);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builderList3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.security.ProtectionDomain protectionDomain0 = null;
        java.security.ProtectionDomain[] protectionDomainArray1 = new java.security.ProtectionDomain[] { protectionDomain0 };
        java.security.AccessControlContext accessControlContext2 = new java.security.AccessControlContext(protectionDomainArray1);
        java.security.Permission permission3 = null;
        // The following exception was thrown during execution in test generation
        try {
            accessControlContext2.checkPermission(permission3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: permission can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(protectionDomainArray1);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo2 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.parseFrom(codedInputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap2 = com.google.javascript.jscomp.FunctionInformationMap.parseFrom(inputStream0, extensionRegistryLite1);
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = functionInformationMap2.getDefaultInstanceForType();
        java.util.List<com.google.javascript.jscomp.FunctionInformationMap.Entry> entryList4 = functionInformationMap3.getEntryList();
        org.junit.Assert.assertNotNull(functionInformationMap2);
        org.junit.Assert.assertNotNull(functionInformationMap3);
        org.junit.Assert.assertNotNull(entryList4);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        short[] shortArray1 = new short[] { (byte) 1 };
        java.nio.ShortBuffer shortBuffer2 = java.nio.ShortBuffer.wrap(shortArray1);
        short[] shortArray4 = new short[] { (byte) 1 };
        java.nio.ShortBuffer shortBuffer5 = java.nio.ShortBuffer.wrap(shortArray4);
        int int6 = shortBuffer2.compareTo(shortBuffer5);
        short short7 = shortBuffer5.get();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer10 = shortBuffer5.put(256, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[1]");
        org.junit.Assert.assertNotNull(shortBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.util.stream.IntStream.Builder builder0 = java.util.stream.IntStream.builder();
        builder0.accept((int) '/');
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy5 = null;
        compilerOptions0.variableRenaming = variableRenamingPolicy5;
        compilerOptions0.setSpecializeInitialModule(true);
        compilerOptions0.setInlineVariables(false);
        org.junit.Assert.assertNotNull(errorFormat3);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        byte[] byteArray5 = compilerOptions0.inputPropertyMapSerialized;
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode6 = compilerOptions0.getTracerMode();
        compilerOptions0.collapseProperties = false;
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap9 = java.nio.charset.Charset.availableCharsets();
        java.util.Set<java.lang.String> strSet10 = strMap9.keySet();
        compilerOptions0.setStripTypePrefixes(strSet10);
        java.util.Spliterator<java.lang.String> strSpliterator12 = strSet10.spliterator();
        org.junit.Assert.assertNotNull(errorFormat3);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + tracerMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode6.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSpliterator12);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedInputStream codedInputStream5 = com.google.protobuf.CodedInputStream.newInstance(byteArray0, 16, (int) 'a');
        int int7 = codedInputStream5.pushLimit((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldOptions fieldOptions8 = com.google.protobuf.DescriptorProtos.FieldOptions.parseFrom(codedInputStream5);
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
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type type0 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_BOOL;
        com.google.protobuf.Descriptors.EnumDescriptor enumDescriptor1 = type0.getDescriptorForType();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_BOOL + "'", type0.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.TYPE_BOOL));
        org.junit.Assert.assertNotNull(enumDescriptor1);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.google.javascript.jscomp.FunctionInformationMap.Module.Builder builder0 = com.google.javascript.jscomp.FunctionInformationMap.Module.newBuilder();
        boolean boolean1 = builder0.hasName();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = builder0.getRepeatedField(fieldDescriptor2, 55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.time.Month month0 = java.time.Month.MARCH;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.MARCH + "'", month0.equals(java.time.Month.MARCH));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.google.protobuf.DescriptorProtos.EnumValueOptions enumValueOptions0 = com.google.protobuf.DescriptorProtos.EnumValueOptions.getDefaultInstance();
        com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder builder1 = com.google.protobuf.DescriptorProtos.EnumValueOptions.newBuilder(enumValueOptions0);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor2 = null;
        java.net.URISyntaxException uRISyntaxException8 = new java.net.URISyntaxException("ISO", "1970-01-01T00:00:52+00:00:52", 4);
        java.io.IOException iOException9 = new java.io.IOException("US-ASCII", (java.lang.Throwable) uRISyntaxException8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder builder10 = builder1.setRepeatedField(fieldDescriptor2, 4095, (java.lang.Object) uRISyntaxException8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(enumValueOptions0);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative0 = com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS;
        org.junit.Assert.assertTrue("'" + jSTypeNative0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS + "'", jSTypeNative0.equals(com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder3 = builder2.clearSourceCodeInfo();
        boolean boolean4 = builder2.hasOptions();
        int int5 = builder2.getMessageTypeCount();
        com.google.protobuf.UnknownFieldSet unknownFieldSet6 = builder2.getUnknownFields();
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = builder2.mergeDelimitedFrom(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(unknownFieldSet6);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder();
        com.google.protobuf.ByteString.Output output2 = com.google.protobuf.ByteString.newOutput(3);
        com.google.protobuf.CodedOutputStream codedOutputStream4 = com.google.protobuf.CodedOutputStream.newInstance((java.io.OutputStream) output2, (int) 'a');
        byte[] byteArray5 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions7 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray5, extensionRegistryLite6);
        output2.write(byteArray5);
        com.google.protobuf.DescriptorProtos.MethodOptions.Builder builder9 = builder0.mergeFrom(byteArray5);
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions10 = builder0.buildPartial();
        com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder builder11 = builder0.addUninterpretedOptionBuilder();
        boolean boolean12 = builder11.hasNegativeIntValue();
        com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder builder13 = builder11.clearStringValue();
        byte[] byteArray14 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite15 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions16 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray14, extensionRegistryLite15);
        com.google.protobuf.CodedInputStream codedInputStream19 = com.google.protobuf.CodedInputStream.newInstance(byteArray14, 16, (int) 'a');
        int int21 = codedInputStream19.pushLimit((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder builder22 = builder11.mergeFrom(codedInputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(output2);
        org.junit.Assert.assertNotNull(codedOutputStream4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(methodOptions7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(methodOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(methodOptions16);
        org.junit.Assert.assertNotNull(codedInputStream19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        java.time.OffsetTime offsetTime23 = offsetTime21.withSecond(18);
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
        org.junit.Assert.assertNotNull(offsetTime23);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.DAY_OF_WEEK + "'", chronoField0.equals(java.time.temporal.ChronoField.DAY_OF_WEEK));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection1 = jSDocInfo0.getAuthors();
        java.lang.String str2 = jSDocInfo0.getReturnDescription();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        org.junit.Assert.assertNull(strCollection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.MessageOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions1 = builder0.getDefaultInstanceForType();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor2 = null;
        java.time.ZoneOffset zoneOffset6 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset6);
        java.time.ZoneOffset zoneOffset11 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime12 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset11);
        java.time.ZonedDateTime zonedDateTime13 = java.time.ZonedDateTime.of(localDateTime7, (java.time.ZoneId) zoneOffset11);
        java.time.ZonedDateTime zonedDateTime15 = zonedDateTime13.withYear((int) (short) 1);
        java.time.OffsetDateTime offsetDateTime16 = zonedDateTime13.toOffsetDateTime();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder17 = builder0.addRepeatedField(fieldDescriptor2, (java.lang.Object) zonedDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(messageOptions1);
        org.junit.Assert.assertNotNull(zoneOffset6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(zoneOffset11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertNotNull(offsetDateTime16);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions1 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(inputStream0);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = methodOptions1.getField(fieldDescriptor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(methodOptions1);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location location1 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.parseFrom(inputStream0);
        boolean boolean2 = location1.isInitialized();
        java.util.List<java.lang.Integer> intList3 = location1.getPathList();
        java.util.List<java.lang.Integer> intList4 = location1.getPathList();
        com.google.protobuf.DescriptorProtos.MethodDescriptorProto methodDescriptorProto5 = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.getDefaultInstance();
        boolean boolean6 = methodDescriptorProto5.hasOutputType();
        byte[] byteArray7 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite8 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions9 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray7, extensionRegistryLite8);
        com.google.protobuf.CodedOutputStream codedOutputStream12 = com.google.protobuf.CodedOutputStream.newInstance(byteArray7, (int) (short) 0, 1);
        methodDescriptorProto5.writeTo(codedOutputStream12);
        location1.writeTo(codedOutputStream12);
        java.io.InputStream inputStream16 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite17 = null;
        com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange extensionRange18 = com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.parseFrom(inputStream16, extensionRegistryLite17);
        int int19 = extensionRange18.getEnd();
        boolean boolean20 = extensionRange18.hasStart();
        // The following exception was thrown during execution in test generation
        try {
            codedOutputStream12.writeMessageSetExtension(10, (com.google.protobuf.MessageLite) extensionRange18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(location1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(methodDescriptorProto5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(methodOptions9);
        org.junit.Assert.assertNotNull(codedOutputStream12);
        org.junit.Assert.assertNotNull(extensionRange18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.time.Month month0 = java.time.Month.APRIL;
        java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) month0);
        java.time.Month month2 = month0.firstMonthOfQuarter();
        java.time.Month month4 = month2.plus((-64800L));
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.APRIL + "'", month0.equals(java.time.Month.APRIL));
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.APRIL + "'", month2.equals(java.time.Month.APRIL));
        org.junit.Assert.assertTrue("'" + month4 + "' != '" + java.time.Month.APRIL + "'", month4.equals(java.time.Month.APRIL));
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.addExtension(builder3);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder6 = builder0.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder7 = builder6.getOptionsBuilder();
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
        com.google.protobuf.UnknownFieldSet unknownFieldSet20 = builder15.getUnknownFields();
        com.google.protobuf.CodedOutputStream codedOutputStream21 = null;
        unknownFieldSet20.writeTo(codedOutputStream21);
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder23 = builder7.setUnknownFields(unknownFieldSet20);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = builder23.hasField(fieldDescriptor24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + label4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
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
        org.junit.Assert.assertNotNull(unknownFieldSet20);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(1);
        com.google.javascript.rhino.Node node2 = node1.cloneNode();
        // The following exception was thrown during execution in test generation
        try {
            node2.setDouble((double) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.time.Month month0 = java.time.Month.APRIL;
        java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.from((java.time.temporal.TemporalAccessor) month0);
        java.lang.String str2 = chronology1.toString();
        java.time.chrono.IsoChronology isoChronology3 = java.time.chrono.IsoChronology.INSTANCE;
        java.time.ZoneOffset zoneOffset7 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset7);
        java.time.ZoneOffset zoneOffset12 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime13 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset12);
        java.time.ZonedDateTime zonedDateTime14 = java.time.ZonedDateTime.of(localDateTime8, (java.time.ZoneId) zoneOffset12);
        java.time.ZonedDateTime zonedDateTime16 = zonedDateTime14.withHour(16);
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime17 = zonedDateTime16.toLocalDateTime();
        java.time.chrono.Chronology chronology18 = localDateChronoLocalDateTime17.getChronology();
        int int19 = isoChronology3.compareTo(chronology18);
        java.lang.String str20 = isoChronology3.getCalendarType();
        int int21 = chronology1.compareTo((java.time.chrono.Chronology) isoChronology3);
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.APRIL + "'", month0.equals(java.time.Month.APRIL));
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISO" + "'", str2, "ISO");
        org.junit.Assert.assertNotNull(isoChronology3);
        org.junit.Assert.assertNotNull(zoneOffset7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(zoneOffset12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "iso8601" + "'", str20, "iso8601");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(100);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.io.PrintStream printStream3 = null;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream3);
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        java.util.stream.LongStream longStream7 = java.util.stream.LongStream.of((long) (-1));
        com.google.common.collect.ImmutableMap<com.google.javascript.jscomp.Compiler, java.util.stream.LongStream> compilerMap8 = com.google.common.collect.ImmutableMap.of(compiler4, longStream7);
        java.util.stream.DoubleStream doubleStream9 = longStream7.asDoubleStream();
        double[] doubleArray10 = doubleStream9.toArray();
        java.nio.DoubleBuffer doubleBuffer11 = doubleBuffer2.put(doubleArray10);
        java.nio.DoubleBuffer doubleBuffer14 = java.nio.DoubleBuffer.wrap(doubleArray10, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.DoubleBuffer doubleBuffer17 = java.nio.DoubleBuffer.wrap(doubleArray10, 52, 37);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(compilerMap8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleBuffer11);
        org.junit.Assert.assertNotNull(doubleBuffer14);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder.getDescriptor();
        com.google.protobuf.DescriptorProtos.DescriptorProto descriptorProto1 = descriptor0.toProto();
        boolean boolean2 = descriptorProto1.isInitialized();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions3 = descriptorProto1.getOptions();
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder4 = messageOptions3.newBuilderForType();
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder6 = builder4.setMessageSetWireFormat(false);
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder7 = com.google.protobuf.DescriptorProtos.MessageOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.MessageOptions messageOptions8 = builder7.getDefaultInstanceForType();
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder9 = builder6.mergeFrom(messageOptions8);
        com.google.protobuf.DescriptorProtos.MessageOptions.Builder builder10 = builder6.clear();
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertNotNull(descriptorProto1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(messageOptions3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(messageOptions8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.MessageOptions.Builder.getDescriptor();
        java.lang.String str1 = descriptor0.getName();
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MessageOptions" + "'", str1, "MessageOptions");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        java.lang.Class class0 = null;
        java.io.InputStream inputStream1 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions2 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream1);
        boolean boolean3 = enumOptions2.isInitialized();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.GeneratedMessage.GeneratedExtension<com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart, com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.protobuf.DescriptorProtos.MessageOptions, com.google.protobuf.DescriptorProtos.MessageOptions.Builder>> namePartGeneratedExtension4 = com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(class0, (com.google.protobuf.Message) enumOptions2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(enumOptions2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        com.google.protobuf.DescriptorProtos.MethodOptions methodOptions2 = com.google.protobuf.DescriptorProtos.MethodOptions.parseFrom(byteArray0, extensionRegistryLite1);
        com.google.protobuf.CodedOutputStream codedOutputStream5 = com.google.protobuf.CodedOutputStream.newInstance(byteArray0, (int) (short) 0, 1);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        com.google.protobuf.DescriptorProtos.FileDescriptorProto fileDescriptorProto7 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(byteArray0, extensionRegistryLite6);
        boolean boolean8 = fileDescriptorProto7.hasOptions();
        com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder fileOptionsOrBuilder9 = fileDescriptorProto7.getOptionsOrBuilder();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FieldDescriptorProto fieldDescriptorProto11 = fileDescriptorProto7.getExtension(18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 18");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(methodOptions2);
        org.junit.Assert.assertNotNull(codedOutputStream5);
        org.junit.Assert.assertNotNull(fileDescriptorProto7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fileOptionsOrBuilder9);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        com.google.javascript.rhino.InputId inputId4 = compilerInput3.getInputId();
        com.google.javascript.jscomp.SourceAst sourceAst5 = null;
        com.google.javascript.rhino.InputId inputId6 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = new com.google.javascript.jscomp.CompilerInput(sourceAst5, inputId6, true);
        java.io.PrintStream printStream9 = null;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream9);
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        compilerInput8.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler10);
        com.google.javascript.jscomp.Scope scope13 = compiler10.getTopScope();
        compilerInput3.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile15 = compilerInput3.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputId4);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNull(scope13);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.util.Hashtable<java.lang.String[], com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder> strArrayMap2 = new java.util.Hashtable<java.lang.String[], com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder>(6, (float) (byte) 10);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder0 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder2 = builder0.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder3 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label4 = builder3.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder5 = builder0.addExtension(builder3);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder6 = builder0.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions7 = builder6.getOptions();
        com.google.protobuf.DescriptorProtos.EnumValueOptions enumValueOptions8 = com.google.protobuf.DescriptorProtos.EnumValueOptions.getDefaultInstance();
        com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder builder9 = com.google.protobuf.DescriptorProtos.EnumValueOptions.newBuilder(enumValueOptions8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat13 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions10.errorFormat = errorFormat13;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy15 = null;
        compilerOptions10.variableRenaming = variableRenamingPolicy15;
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode17 = compilerOptions10.getTracerMode();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder18 = com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder20 = builder18.addDependency("Named type with empty name component");
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder builder21 = com.google.protobuf.DescriptorProtos.FieldDescriptorProto.newBuilder();
        com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label label22 = builder21.getLabel();
        com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builder23 = builder18.addExtension(builder21);
        com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder24 = builder18.addEnumTypeBuilder();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder25 = builder24.getOptionsBuilder();
        java.io.InputStream inputStream26 = null;
        com.google.protobuf.DescriptorProtos.EnumOptions enumOptions27 = com.google.protobuf.DescriptorProtos.EnumOptions.parseFrom(inputStream26);
        boolean boolean28 = enumOptions27.isInitialized();
        com.google.protobuf.DescriptorProtos.EnumOptions.Builder builder29 = builder25.mergeFrom(enumOptions27);
        byte[] byteArray30 = enumOptions27.toByteArray();
        compilerOptions10.setInputPropertyMapSerialized(byteArray30);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite32 = null;
        com.google.protobuf.DescriptorProtos.SourceCodeInfo sourceCodeInfo33 = com.google.protobuf.DescriptorProtos.SourceCodeInfo.parseFrom(byteArray30, extensionRegistryLite32);
        com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder builder34 = builder9.mergeFrom(byteArray30);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite37 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder builder38 = builder6.mergeFrom(byteArray30, 97, 42, extensionRegistryLite37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + label4 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label4.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(enumOptions7);
        org.junit.Assert.assertNotNull(enumValueOptions8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(errorFormat13);
        org.junit.Assert.assertTrue("'" + tracerMode17 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode17.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + label22 + "' != '" + com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL + "'", label22.equals(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(enumOptions27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(sourceCodeInfo33);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        int int1 = com.google.protobuf.CodedOutputStream.computeTagSize(999);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        boolean boolean6 = strSet4.isEmpty();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(100);
        boolean boolean9 = strSet4.equals((java.lang.Object) byteBuffer8);
        java.nio.IntBuffer intBuffer10 = byteBuffer8.asIntBuffer();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer8.put((int) (short) 1, (byte) 100);
        long long14 = byteBuffer8.getLong();
        long long15 = byteBuffer8.getLong();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 28147497671065600L + "'", long14 == 28147497671065600L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        byte[] byteArray5 = compilerOptions0.inputPropertyMapSerialized;
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode6 = compilerOptions0.getTracerMode();
        compilerOptions0.collapseProperties = false;
        java.util.SortedMap<java.lang.String, java.nio.charset.Charset> strMap9 = java.nio.charset.Charset.availableCharsets();
        java.util.Set<java.lang.String> strSet10 = strMap9.keySet();
        compilerOptions0.setStripTypePrefixes(strSet10);
        compilerOptions0.setShadowVariables(false);
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode14 = compilerOptions0.getLanguageIn();
        org.junit.Assert.assertNotNull(errorFormat3);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + tracerMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode6.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + languageMode14 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode14.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.google.protobuf.DescriptorProtos.UninterpretedOption.getDescriptor();
        int int1 = descriptor0.getIndex();
        org.junit.Assert.assertNotNull(descriptor0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.util.Date date3 = new java.util.Date((int) (byte) -1, 43, 16384);
        java.lang.String str4 = date3.toString();
        org.junit.Assert.assertEquals(date3.toString(), "Mon Jun 09 00:00:00 UTC 1947");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Mon Jun 09 00:00:00 UTC 1947" + "'", str4, "Mon Jun 09 00:00:00 UTC 1947");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean5 = node4.isStringKey();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node4);
        boolean boolean7 = node6.isFor();
        boolean boolean8 = node6.isWith();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean5 = node4.isFromExterns();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean10 = node9.isFromExterns();
        java.lang.String str11 = node9.toString();
        com.google.javascript.rhino.Node node12 = node4.copyInformationFrom(node9);
        int int13 = node4.getLineno();
        boolean boolean14 = node4.isLabel();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean19 = node18.isStringKey();
        boolean boolean20 = node18.isTrue();
        com.google.javascript.rhino.InputId inputId22 = new com.google.javascript.rhino.InputId("NUMBER 52.0 0");
        node18.setInputId(inputId22);
        node4.setInputId(inputId22);
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions25.setRecordFunctionInformation(true);
        boolean boolean28 = compilerOptions25.checkControlStructures;
        compilerOptions25.setCollapseProperties(false);
        compilerOptions25.setAssumeStrictThis(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions33.optimizeCalls = false;
        compilerOptions33.preferLineBreakAtEndOfFile = false;
        boolean boolean38 = compilerOptions33.markNoSideEffectCalls;
        boolean boolean39 = compilerOptions33.labelRenaming;
        com.google.javascript.jscomp.DependencyOptions dependencyOptions40 = new com.google.javascript.jscomp.DependencyOptions();
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        boolean boolean47 = strSet45.isEmpty();
        java.nio.ByteBuffer byteBuffer49 = java.nio.ByteBuffer.allocate(100);
        boolean boolean50 = strSet45.equals((java.lang.Object) byteBuffer49);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        boolean boolean57 = strSet55.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream58 = strSet55.stream();
        boolean boolean59 = strSet45.retainAll((java.util.Collection<java.lang.String>) strSet55);
        com.google.javascript.jscomp.DependencyOptions dependencyOptions60 = dependencyOptions40.setEntryPoints((java.util.Collection<java.lang.String>) strSet45);
        compilerOptions33.setDependencyOptions(dependencyOptions40);
        com.google.javascript.jscomp.CheckLevel checkLevel62 = compilerOptions33.checkGlobalThisLevel;
        compilerOptions25.reportMissingOverride = checkLevel62;
        com.google.javascript.jscomp.DiagnosticType diagnosticType66 = com.google.javascript.jscomp.DiagnosticType.warning("", "Unknown class name");
        java.lang.String[] strArray71 = new java.lang.String[] { "2022-02-21", "2022-02-21", "hi!", "/tmp/hi!4516073975838273390ISO" };
        com.google.javascript.jscomp.JSError jSError72 = com.google.javascript.jscomp.JSError.make("{}", node4, checkLevel62, diagnosticType66, strArray71);
        java.time.temporal.ChronoField chronoField73 = java.time.temporal.ChronoField.EPOCH_DAY;
        java.time.Instant instant74 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset78 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime79 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset78);
        java.time.OffsetDateTime offsetDateTime80 = java.time.OffsetDateTime.ofInstant(instant74, (java.time.ZoneId) zoneOffset78);
        java.time.temporal.ValueRange valueRange81 = chronoField73.rangeRefinedBy((java.time.temporal.TemporalAccessor) offsetDateTime80);
        java.time.format.DateTimeFormatter dateTimeFormatter82 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.lang.String str83 = offsetDateTime80.format(dateTimeFormatter82);
        boolean boolean84 = jSError72.equals((java.lang.Object) dateTimeFormatter82);
        java.time.format.DecimalStyle decimalStyle85 = dateTimeFormatter82.getDecimalStyle();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "NUMBER 52.0 0" + "'", str11, "NUMBER 52.0 0");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strStream58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(dependencyOptions60);
        org.junit.Assert.assertTrue("'" + checkLevel62 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel62.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(diagnosticType66);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(jSError72);
        org.junit.Assert.assertTrue("'" + chronoField73 + "' != '" + java.time.temporal.ChronoField.EPOCH_DAY + "'", chronoField73.equals(java.time.temporal.ChronoField.EPOCH_DAY));
        org.junit.Assert.assertNotNull(instant74);
        org.junit.Assert.assertNotNull(zoneOffset78);
        org.junit.Assert.assertNotNull(localDateTime79);
        org.junit.Assert.assertNotNull(offsetDateTime80);
        org.junit.Assert.assertNotNull(valueRange81);
        org.junit.Assert.assertNotNull(dateTimeFormatter82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "1970-01-01+00:00:52" + "'", str83, "1970-01-01+00:00:52");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(decimalStyle85);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        int int2 = com.google.protobuf.CodedOutputStream.computeSInt32Size(4096, (int) ':');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder0 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder1 = builder0.clearCcGenericServices();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder builder3 = builder1.getUninterpretedOptionBuilder((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHoursMinutesSeconds(28, 10, 1970);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Zone offset hours not in valid range: value 28 is not in the range -18 to 18");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder builder0 = com.google.protobuf.DescriptorProtos.UninterpretedOption.newBuilder();
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite> priorityMap0 = new java.util.Hashtable<com.google.javascript.jscomp.WarningsGuard.Priority, com.google.protobuf.MessageLite>();
        java.lang.Object obj1 = priorityMap0.clone();
        boolean boolean2 = priorityMap0.isEmpty();
        java.lang.String str3 = priorityMap0.toString();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder4 = com.google.protobuf.DescriptorProtos.FileOptions.newBuilder();
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder5 = builder4.clearCcGenericServices();
        boolean boolean6 = builder4.isInitialized();
        com.google.protobuf.MessageLite messageLite7 = priorityMap0.get((java.lang.Object) builder4);
        com.google.protobuf.DescriptorProtos.FileOptions.Builder builder9 = builder4.setPyGenericServices(false);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor10 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = jSTypeRegistry13.createObjectType(objectType14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, false);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair21 = objectType15.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType20);
        com.google.javascript.rhino.Node node22 = objectType15.getRootNode();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair33 = objectType27.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = objectType15.testForEquality((com.google.javascript.rhino.jstype.JSType) objectType27);
        java.lang.String str35 = objectType27.toDebugHashCodeString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.FileOptions.Builder builder36 = builder4.setField(fieldDescriptor10, (java.lang.Object) objectType27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(typePair21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(typePair33);
        org.junit.Assert.assertNotNull(ternaryValue34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "{1910229002}" + "'", str35, "{1910229002}");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.ErrorFormat errorFormat3 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        compilerOptions0.errorFormat = errorFormat3;
        byte[] byteArray5 = compilerOptions0.inputPropertyMapSerialized;
        compilerOptions0.setInstrumentationTemplate("{}");
        compilerOptions0.renamePrefixNamespace = "";
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel10 = com.google.javascript.jscomp.SourceMap.DetailLevel.ALL;
        compilerOptions0.sourceMapDetailLevel = detailLevel10;
        boolean boolean12 = compilerOptions0.ambiguateProperties;
        org.junit.Assert.assertNotNull(errorFormat3);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertNotNull(detailLevel10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        int int0 = com.google.javascript.jscomp.FunctionInformationMap.Entry.SOURCE_NAME_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart namePart1 = com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.parseDelimitedFrom(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        java.time.temporal.TemporalUnit temporalUnit1 = chronoField0.getRangeUnit();
        long long3 = chronoField0.checkValidValue((long) 2);
        java.util.Locale locale7 = new java.util.Locale("", "NUMBER 52.0 0", "hi!");
        java.lang.String str8 = chronoField0.getDisplayName(locale7);
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.lang.String str10 = locale7.getDisplayVariant(locale9);
        java.util.Locale.setDefault(locale9);
        java.lang.String str12 = locale9.getDisplayScript();
        java.lang.String str13 = locale9.getDisplayVariant();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField0.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
        org.junit.Assert.assertTrue("'" + temporalUnit1 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit1.equals(java.time.temporal.ChronoUnit.FOREVER));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        org.junit.Assert.assertEquals(locale7.toString(), "_NUMBER 52.0 0_hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OffsetSeconds" + "'", str8, "OffsetSeconds");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.time.Instant instant0 = java.time.Instant.EPOCH;
        java.time.ZoneOffset zoneOffset4 = java.time.ZoneOffset.ofTotalSeconds((int) '4');
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.ofEpochSecond((long) 100, 0, zoneOffset4);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.ofInstant(instant0, (java.time.ZoneId) zoneOffset4);
        java.time.OffsetDateTime offsetDateTime8 = offsetDateTime6.minusDays((long) (short) 100);
        java.lang.String str9 = offsetDateTime6.toString();
        java.time.LocalTime localTime10 = offsetDateTime6.toLocalTime();
        int int11 = localTime10.getHour();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(zoneOffset4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T00:00:52+00:00:52" + "'", str9, "1970-01-01T00:00:52+00:00:52");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.google.javascript.jscomp.FunctionInformationMap.Module.Builder builder0 = com.google.javascript.jscomp.FunctionInformationMap.Module.newBuilder();
        boolean boolean1 = builder0.hasName();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.Message.Builder builder3 = builder0.newBuilderForField(fieldDescriptor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}
