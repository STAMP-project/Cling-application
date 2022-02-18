import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

    public static boolean debug = false;

    @Test
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.setReplaceIdGenerators(true);
        compilerOptions0.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel9 = null;
        compilerOptions0.setReportMissingOverride(checkLevel9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions11.setRewriteNewDateGoogNow(true);
        boolean boolean14 = compilerOptions11.extractPrototypeMemberDeclarations;
        boolean boolean15 = compilerOptions11.jqueryPass;
        compilerOptions11.collapseAnonymousFunctions = false;
        boolean boolean18 = compilerOptions11.checkTypes;
        compilerOptions11.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions21.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention24 = null;
        compilerOptions21.setCodingConvention(codingConvention24);
        compilerOptions21.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet29 = compilerOptions28.stripNamePrefixes;
        compilerOptions21.setIdGenerators(strSet29);
        compilerOptions11.setStripNameSuffixes(strSet29);
        compilerOptions11.prettyPrint = false;
        java.lang.String str34 = compilerOptions11.sourceMapOutputPath;
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet36 = compilerOptions35.stripNamePrefixes;
        compilerOptions11.setStripTypePrefixes(strSet36);
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions38.setRewriteNewDateGoogNow(true);
        boolean boolean41 = compilerOptions38.extractPrototypeMemberDeclarations;
        boolean boolean42 = compilerOptions38.jqueryPass;
        boolean boolean43 = compilerOptions38.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions44.setLabelRenaming(true);
        compilerOptions44.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean49 = compilerOptions44.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format50 = compilerOptions44.sourceMapFormat;
        compilerOptions38.setSourceMapFormat(format50);
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions52.setRewriteNewDateGoogNow(true);
        boolean boolean55 = compilerOptions52.extractPrototypeMemberDeclarations;
        compilerOptions52.setCollapseProperties(false);
        compilerOptions52.setClosurePass(true);
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions52.setInputPropertyMapSerialized(byteArray65);
        compilerOptions52.setFlowSensitiveInlineVariables(true);
        boolean boolean69 = compilerOptions52.exportTestFunctions;
        compilerOptions52.closurePass = false;
        com.google.javascript.jscomp.ErrorFormat errorFormat72 = compilerOptions52.errorFormat;
        compilerOptions38.setErrorFormat(errorFormat72);
        compilerOptions11.setErrorFormat(errorFormat72);
        compilerOptions0.setErrorFormat(errorFormat72);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing76 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF;
        boolean boolean77 = tweakProcessing76.shouldStrip();
        boolean boolean78 = tweakProcessing76.isOn();
        compilerOptions0.setTweakProcessing(tweakProcessing76);
        boolean boolean80 = tweakProcessing76.shouldStrip();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(format50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(errorFormat72);
        org.junit.Assert.assertTrue("'" + tweakProcessing76 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing76.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        compilerOptions0.setLocale("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        boolean boolean9 = compilerOptions0.deadAssignmentElimination;
        compilerOptions0.optimizeCalls = false;
        compilerOptions0.instrumentationTemplate = "java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        compilerOptions0.collapseVariableDeclarations = true;
        boolean boolean16 = compilerOptions0.removeUnusedVars;
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setLabelRenaming(true);
        compilerOptions17.syntheticBlockStartMarker = "java.io.IOException";
        compilerOptions17.locale = "2019/07/12 07:12";
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap24 = compilerOptions17.cssRenamingMap;
        compilerOptions17.setRuntimeTypeCheck(true);
        compilerOptions17.inlineVariables = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions29.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention32 = null;
        compilerOptions29.setCodingConvention(codingConvention32);
        compilerOptions29.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel36 = compilerOptions29.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray37 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList38 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList38, locationMappingArray37);
        compilerOptions29.sourceMapLocationMappings = locationMappingList38;
        com.google.javascript.jscomp.CheckLevel checkLevel41 = compilerOptions29.aggressiveVarCheck;
        compilerOptions17.checkGlobalThisLevel = checkLevel41;
        compilerOptions0.setReportMissingOverride(checkLevel41);
        compilerOptions0.setComputeFunctionSideEffects(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(cssRenamingMap24);
        org.junit.Assert.assertTrue("'" + checkLevel36 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel36.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + checkLevel41 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel41.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        java.lang.String[] strArray9 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        compilerOptions0.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList10);
        compilerOptions0.setDeadAssignmentElimination(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions15.setLabelRenaming(true);
        compilerOptions15.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CheckLevel checkLevel20 = compilerOptions15.checkGlobalThisLevel;
        compilerOptions15.setOutputJsStringUsage(false);
        com.google.javascript.jscomp.ErrorFormat errorFormat23 = compilerOptions15.errorFormat;
        byte[] byteArray24 = compilerOptions15.inputVariableMapSerialized;
        compilerOptions15.setDefineToDoubleLiteral("java.io.IOException: ", (double) (byte) 10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet29 = compilerOptions28.stripNamePrefixes;
        byte[] byteArray30 = compilerOptions28.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup31 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup31;
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions33.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention36 = null;
        compilerOptions33.setCodingConvention(codingConvention36);
        compilerOptions33.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel40 = compilerOptions33.checkProvides;
        compilerOptions28.setWarningLevel(diagnosticGroup31, checkLevel40);
        java.util.Set<java.lang.String> strSet42 = compilerOptions28.stripNamePrefixes;
        compilerOptions28.setComputeFunctionSideEffects(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions45.setRewriteNewDateGoogNow(true);
        boolean boolean48 = compilerOptions45.extractPrototypeMemberDeclarations;
        compilerOptions45.setCollapseProperties(false);
        compilerOptions45.setClosurePass(true);
        byte[] byteArray58 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions45.setInputPropertyMapSerialized(byteArray58);
        compilerOptions45.setFlowSensitiveInlineVariables(true);
        boolean boolean62 = compilerOptions45.exportTestFunctions;
        compilerOptions45.closurePass = false;
        compilerOptions45.renamePrefix = "Unversioned directory";
        compilerOptions45.setMoveFunctionDeclarations(false);
        compilerOptions45.setProcessObjectPropertyString(false);
        com.google.javascript.jscomp.CheckLevel checkLevel71 = compilerOptions45.checkGlobalThisLevel;
        compilerOptions28.setCheckGlobalThisLevel(checkLevel71);
        compilerOptions15.reportMissingOverride = checkLevel71;
        compilerOptions0.checkProvides = checkLevel71;
        compilerOptions0.instrumentationTemplate = "-1";
        boolean boolean77 = compilerOptions0.preferLineBreakAtEndOfFile;
        compilerOptions0.setIgnoreCajaProperties(false);
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + checkLevel20 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel20.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(errorFormat23);
        org.junit.Assert.assertNull(byteArray24);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNull(byteArray30);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup31);
        org.junit.Assert.assertTrue("'" + checkLevel40 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel40.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + checkLevel71 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel71.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.exportTestFunctions = true;
        compilerOptions0.setAcceptConstKeyword(false);
        com.google.javascript.jscomp.MessageBundle messageBundle10 = null;
        compilerOptions0.messageBundle = messageBundle10;
        boolean boolean12 = compilerOptions0.optimizeCalls;
        boolean boolean13 = compilerOptions0.smartNameRemoval;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode14 = compilerOptions0.getLanguageOut();
        boolean boolean15 = compilerOptions0.aliasAllStrings;
        com.google.javascript.jscomp.SourceMap.Format format16 = compilerOptions0.sourceMapFormat;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(languageMode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(format16);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT;
        printStream1.println((java.lang.Object) diagnosticGroup18);
        java.io.PrintStream printStream20 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        printStream20.println();
        printStream20.print("Unversioned directory");
        java.io.PrintStream printStream25 = new java.io.PrintStream((java.io.OutputStream) printStream20, false);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
// flaky:         org.junit.Assert.assertNull(diagnosticGroup18);
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK;
        com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup3;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = com.google.javascript.jscomp.DiagnosticGroups.TWEAKS;
        com.google.javascript.jscomp.SourceFile.Builder builder6 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator8 = null;
        com.google.javascript.jscomp.SourceFile sourceFile9 = builder6.buildFromGenerator("hi!", generator8);
        java.lang.Object[] objArray10 = new java.lang.Object[] { diagnosticGroup3, diagnosticGroup5, sourceFile9 };
        java.io.PrintStream printStream11 = printStream1.printf("2019/07/12 07:12", objArray10);
        printStream1.println((float) (-1));
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream1);
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler14.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = null;
        compiler14.tracker = performanceTracker16;
        com.google.javascript.rhino.Node node18 = compiler14.getRoot();
// flaky:         org.junit.Assert.assertNull(diagnosticGroup3);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup5);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null, null, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null, null, hi!]");
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("hi!");
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder11 = builder0.withCharset(charset10);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder13 = builder11.withCharset(charset12);
        com.google.javascript.jscomp.SourceFile sourceFile15 = builder13.buildFromFile("2019/07/12 07:12");
        com.google.javascript.jscomp.SourceFile.Builder builder17 = builder13.withOriginalPath("java.io.IOException");
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder19 = builder13.withCharset(charset18);
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder21 = builder19.withCharset(charset20);
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(sourceFile15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        compilerOptions0.setDefineToDoubleLiteral("java.io.IOException: ", (double) 0L);
        com.google.javascript.jscomp.CheckLevel checkLevel11 = compilerOptions0.checkGlobalThisLevel;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention15 = null;
        compilerOptions12.setCodingConvention(codingConvention15);
        compilerOptions12.setGeneratePseudoNames(true);
        compilerOptions12.inlineLocalFunctions = false;
        compilerOptions12.setInlineLocalVariables(true);
        boolean boolean23 = compilerOptions12.optimizeParameters;
        compilerOptions12.renamePrefixNamespace = "2019/07/12 07:12";
        compilerOptions12.closurePass = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions28.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention31 = null;
        compilerOptions28.setCodingConvention(codingConvention31);
        compilerOptions28.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel35 = compilerOptions28.checkProvides;
        java.util.Set<java.lang.String> strSet36 = compilerOptions28.stripTypes;
        compilerOptions12.setStripNamePrefixes(strSet36);
        compilerOptions0.aliasableStrings = strSet36;
        compilerOptions0.setClosurePass(false);
        compilerOptions0.setCoalesceVariableNames(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel11 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel11.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + checkLevel35 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel35.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setPropertyAffinity(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions7.setRewriteNewDateGoogNow(true);
        boolean boolean10 = compilerOptions7.extractPrototypeMemberDeclarations;
        compilerOptions7.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel13 = compilerOptions7.checkGlobalThisLevel;
        compilerOptions7.setDevirtualizePrototypeMethods(true);
        com.google.javascript.jscomp.MessageBundle messageBundle16 = null;
        compilerOptions7.setMessageBundle(messageBundle16);
        boolean boolean18 = compilerOptions7.recordFunctionInformation;
        boolean boolean19 = compilerOptions7.checkControlStructures;
        com.google.javascript.jscomp.CompilerOptions.Reach reach20 = com.google.javascript.jscomp.CompilerOptions.Reach.NONE;
        compilerOptions7.setInlineFunctions(reach20);
        compilerOptions0.setInlineVariables(reach20);
        compilerOptions0.setDebugFunctionSideEffectsPath("java.io.IOException: java.io.IOException: ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + checkLevel13 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel13.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + reach20 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.NONE + "'", reach20.equals(com.google.javascript.jscomp.CompilerOptions.Reach.NONE));
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        java.lang.String str2 = codeBuilder0.toString();
        java.lang.String str3 = codeBuilder0.toString();
        int int4 = codeBuilder0.getLength();
        java.lang.String str5 = codeBuilder0.toString();
        int int6 = codeBuilder0.getLength();
        int int7 = codeBuilder0.getLength();
        int int8 = codeBuilder0.getLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.computeFunctionSideEffects;
        boolean boolean6 = compilerOptions0.printInputDelimiter;
        compilerOptions0.setGeneratePseudoNames(true);
        boolean boolean9 = compilerOptions0.disambiguateProperties;
        java.util.Set<java.lang.String> strSet10 = compilerOptions0.aliasableStrings;
        compilerOptions0.coalesceVariableNames = true;
        compilerOptions0.coalesceVariableNames = false;
        compilerOptions0.setInlineVariables(true);
        compilerOptions0.sourceMapOutputPath = "java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet6 = compilerOptions0.stripTypePrefixes;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compilerOptions0.cssRenamingMap;
        com.google.javascript.jscomp.MessageBundle messageBundle8 = compilerOptions0.messageBundle;
        compilerOptions0.setOptimizeReturns(true);
        compilerOptions0.setTweakToStringLiteral("hi!", "java.io.IOException");
        compilerOptions0.setRuntimeTypeCheckLogFunction("java.io.IOException: ");
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions16.setRewriteNewDateGoogNow(true);
        boolean boolean19 = compilerOptions16.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach20 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions16.setInlineVariables(reach20);
        compilerOptions16.setPrintInputDelimiter(true);
        boolean boolean24 = compilerOptions16.closurePass;
        com.google.javascript.jscomp.MessageBundle messageBundle25 = null;
        compilerOptions16.messageBundle = messageBundle25;
        compilerOptions16.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap29 = null;
        compilerOptions16.cssRenamingMap = cssRenamingMap29;
        java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList31 = compilerOptions16.sourceMapLocationMappings;
        locationMappingList31.clear();
        compilerOptions0.setSourceMapLocationMappings(locationMappingList31);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = locationMappingList31.add(locationMapping34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(cssRenamingMap7);
        org.junit.Assert.assertNull(messageBundle8);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + reach20 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach20.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locationMappingList31);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        boolean boolean8 = compilerOptions0.optimizeReturns;
        compilerOptions0.smartNameRemoval = true;
        java.util.Set<java.lang.String> strSet11 = compilerOptions0.aliasableStrings;
        compilerOptions0.generateExports = false;
        boolean boolean14 = compilerOptions0.assumeStrictThis();
        compilerOptions0.setReserveRawExports(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention20 = null;
        compilerOptions17.setCodingConvention(codingConvention20);
        compilerOptions17.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet25 = compilerOptions24.stripNamePrefixes;
        compilerOptions17.setIdGenerators(strSet25);
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention30 = null;
        compilerOptions27.setCodingConvention(codingConvention30);
        compilerOptions27.setGeneratePseudoNames(true);
        compilerOptions27.inlineLocalFunctions = false;
        compilerOptions27.setIdeMode(true);
        compilerOptions27.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions40.setRewriteNewDateGoogNow(true);
        boolean boolean43 = compilerOptions40.extractPrototypeMemberDeclarations;
        compilerOptions40.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel46 = compilerOptions40.checkGlobalThisLevel;
        compilerOptions27.checkMissingReturn = checkLevel46;
        compilerOptions17.aggressiveVarCheck = checkLevel46;
        compilerOptions0.checkUnreachableCode = checkLevel46;
        compilerOptions0.setTweakToDoubleLiteral("", 0.0d);
        java.lang.String str53 = compilerOptions0.syntheticBlockEndMarker;
        boolean boolean54 = compilerOptions0.optimizeCalls;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + checkLevel46 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel46.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("hi!");
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder11 = builder0.withCharset(charset10);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder13 = builder11.withCharset(charset12);
        com.google.javascript.jscomp.SourceFile sourceFile15 = builder13.buildFromFile("2019/07/12 07:12");
        com.google.javascript.jscomp.SourceFile.Builder builder17 = builder13.withOriginalPath("java.io.IOException");
        com.google.javascript.jscomp.SourceFile.Builder builder19 = builder17.withOriginalPath("2019/07/12 07:12");
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(sourceFile15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        boolean boolean8 = compilerOptions0.closurePass;
        compilerOptions0.checkMissingGetCssNameBlacklist = "Unversioned directory";
        boolean boolean11 = compilerOptions0.markNoSideEffectCalls;
        java.util.Set<java.lang.String> strSet12 = compilerOptions0.aliasableStrings;
        com.google.javascript.jscomp.WarningsGuard warningsGuard13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.addWarningsGuard(warningsGuard13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.gatherCssNames;
        com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard9 = null;
        compilerOptions0.setWarningsGuard(composeWarningsGuard9);
        compilerOptions0.setInstrumentationTemplate("2019/07/12 07:12");
        com.google.javascript.jscomp.CompilerOptions.Reach reach13 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineFunctions(reach13);
        compilerOptions0.setColorizeErrorOutput(true);
        boolean boolean17 = compilerOptions0.reserveRawExports;
        compilerOptions0.setRemoveUnusedLocalVars(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + reach13 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach13.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        compilerOptions0.setCheckSuspiciousCode(true);
        compilerOptions0.setFlowSensitiveInlineVariables(true);
        compilerOptions0.setCrossModuleMethodMotion(true);
        java.util.Set<java.lang.String> strSet9 = compilerOptions0.stripNameSuffixes;
        boolean boolean10 = compilerOptions0.optimizeArgumentsArray;
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        com.google.javascript.jscomp.MessageBundle messageBundle2 = null;
        compilerOptions0.messageBundle = messageBundle2;
        compilerOptions0.setCoalesceVariableNames(false);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing6 = compilerOptions0.getTweakProcessing();
        compilerOptions0.skipAllCompilerPasses();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + tweakProcessing6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing6.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        java.io.IOException iOException3 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException3);
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray7 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList8 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList8, locationMappingArray7);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setRewriteNewDateGoogNow(true);
        boolean boolean13 = compilerOptions10.extractPrototypeMemberDeclarations;
        compilerOptions10.setCollapseProperties(false);
        compilerOptions10.setClosurePass(true);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions10.setInputPropertyMapSerialized(byteArray23);
        compilerOptions10.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        boolean boolean30 = compilerOptions27.extractPrototypeMemberDeclarations;
        compilerOptions27.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet33 = compilerOptions27.stripTypePrefixes;
        compilerOptions10.aliasableStrings = strSet33;
        boolean boolean35 = locationMappingList8.removeAll((java.util.Collection<java.lang.String>) strSet33);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup36 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup36;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup36;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup36;
        boolean boolean40 = locationMappingList8.contains((java.lang.Object) diagnosticGroup36);
        java.io.IOException iOException43 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException44 = new java.io.IOException("Unversioned directory", (java.lang.Throwable) iOException43);
        java.lang.Throwable[] throwableArray45 = iOException43.getSuppressed();
        java.io.IOException iOException46 = new java.io.IOException((java.lang.Throwable) iOException43);
        int int47 = locationMappingList8.indexOf((java.lang.Object) iOException43);
        iOException3.addSuppressed((java.lang.Throwable) iOException43);
        java.io.IOException iOException49 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException50 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12", (java.lang.Throwable) iOException49);
        org.junit.Assert.assertNotNull(locationMappingArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setExtractPrototypeMemberDeclarations(false);
        compilerOptions0.resetWarningsGuard();
        compilerOptions0.removeUnusedLocalVars = true;
        com.google.javascript.jscomp.CheckLevel checkLevel13 = null;
        compilerOptions0.brokenClosureRequiresLevel = checkLevel13;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = com.google.javascript.jscomp.SourceFile.builder();
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder2 = builder0.withCharset(charset1);
        java.nio.charset.Charset charset3 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder4 = builder2.withCharset(charset3);
        com.google.javascript.jscomp.SourceFile sourceFile7 = builder2.buildFromCode("\ufffd\nddd", "java.io.IOException: java.io.IOException: java.io.IOException");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(sourceFile7);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        compilerOptions0.resetWarningsGuard();
        compilerOptions0.convertToDottedProperties = true;
        compilerOptions0.setNameReferenceReportPath("java.io.IOException: Unversioned directory");
        compilerOptions0.setReserveRawExports(false);
        compilerOptions0.setRemoveClosureAsserts(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions15.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention18 = null;
        compilerOptions15.setCodingConvention(codingConvention18);
        compilerOptions15.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel22 = compilerOptions15.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray23 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList24 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24, locationMappingArray23);
        compilerOptions15.sourceMapLocationMappings = locationMappingList24;
        boolean boolean27 = compilerOptions15.inlineVariables;
        compilerOptions15.setRecordFunctionInformation(false);
        compilerOptions15.foldConstants = true;
        boolean boolean32 = compilerOptions15.removeUnusedPrototypePropertiesInExterns;
        compilerOptions15.setAliasKeywords(false);
        compilerOptions15.setExtractPrototypeMemberDeclarations(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet38 = compilerOptions37.stripNamePrefixes;
        byte[] byteArray39 = compilerOptions37.inputVariableMapSerialized;
        boolean boolean40 = compilerOptions37.disambiguateProperties;
        compilerOptions37.setDefineToNumberLiteral("2019/07/12 07:12", (int) '#');
        java.lang.String str44 = compilerOptions37.instrumentationTemplate;
        compilerOptions37.setCollapsePropertiesOnExternTypes(false);
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray47 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList48 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList48, locationMappingArray47);
        java.lang.String[] strArray57 = new java.lang.String[] { "// Input %num%", "java.io.IOException", "", "// Input %num%", "java.io.IOException: java.io.IOException: 2019/07/12 07:12", "Unversioned directory", "java.io.IOException: java.io.IOException: 2019/07/12 07:12" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        boolean boolean60 = locationMappingList48.removeAll((java.util.Collection<java.lang.String>) strList58);
        compilerOptions37.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList58);
        compilerOptions15.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList58);
        compilerOptions0.setManageClosureDependencies((java.util.List<java.lang.String>) strList58);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel22 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel22.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNull(byteArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(locationMappingArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup3;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = com.google.javascript.jscomp.DiagnosticGroups.TWEAKS;
        com.google.javascript.jscomp.SourceFile.Builder builder6 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator8 = null;
        com.google.javascript.jscomp.SourceFile sourceFile9 = builder6.buildFromGenerator("hi!", generator8);
        java.lang.Object[] objArray10 = new java.lang.Object[] { diagnosticGroup3, diagnosticGroup5, sourceFile9 };
        java.io.PrintStream printStream11 = printStream1.printf("2019/07/12 07:12", objArray10);
        java.io.PrintStream printStream14 = new java.io.PrintStream("Unversioned directory");
        char[] charArray17 = new char[] { '4', '4' };
        printStream14.print(charArray17);
        printStream14.print((int) ' ');
        java.io.PrintStream printStream22 = new java.io.PrintStream((java.io.OutputStream) printStream14, false);
        printStream14.write((int) '#');
        java.util.Locale locale25 = null;
        java.lang.Object[] objArray28 = new java.lang.Object[] { "Unversioned directory" };
        java.io.PrintStream printStream29 = printStream14.format(locale25, "Unversioned directory", objArray28);
        java.io.PrintStream printStream30 = printStream11.format("hi!", objArray28);
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler(printStream30);
        compiler31.disableThreads();
// flaky:         org.junit.Assert.assertNull(diagnosticGroup3);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup5);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null, null, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null, null, hi!]");
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[Unversioned directory]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[Unversioned directory]");
        org.junit.Assert.assertNotNull(printStream29);
        org.junit.Assert.assertNotNull(printStream30);
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setPropertyAffinity(true);
        boolean boolean7 = compilerOptions0.closurePass;
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy8 = compilerOptions0.anonymousFunctionNaming;
        compilerOptions0.setTweakToDoubleLiteral("java.io.IOException: -1", 1.0d);
        compilerOptions0.prettyPrint = false;
        compilerOptions0.setGroupVariableDeclarations(false);
        compilerOptions0.setClosurePass(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy8 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy8.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TYPE_INVALIDATION = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.removeUnusedClassProperties = true;
        compilerOptions0.setAppNameStr("");
        compilerOptions0.setDisambiguateProperties(false);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions1.setRewriteNewDateGoogNow(true);
        boolean boolean4 = compilerOptions1.extractPrototypeMemberDeclarations;
        compilerOptions1.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet7 = compilerOptions1.stripTypePrefixes;
        compilerOptions0.stripTypePrefixes = strSet7;
        compilerOptions0.removeUnusedVars = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions11.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention14 = null;
        compilerOptions11.setCodingConvention(codingConvention14);
        compilerOptions11.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet19 = compilerOptions18.stripNamePrefixes;
        compilerOptions11.setIdGenerators(strSet19);
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions21.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention24 = null;
        compilerOptions21.setCodingConvention(codingConvention24);
        compilerOptions21.setGeneratePseudoNames(true);
        compilerOptions21.inlineLocalFunctions = false;
        compilerOptions21.setIdeMode(true);
        compilerOptions21.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions34.setRewriteNewDateGoogNow(true);
        boolean boolean37 = compilerOptions34.extractPrototypeMemberDeclarations;
        compilerOptions34.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel40 = compilerOptions34.checkGlobalThisLevel;
        compilerOptions21.checkMissingReturn = checkLevel40;
        compilerOptions11.aggressiveVarCheck = checkLevel40;
        com.google.javascript.jscomp.CheckLevel checkLevel43 = compilerOptions11.reportMissingOverride;
        compilerOptions0.checkGlobalThisLevel = checkLevel43;
        boolean boolean45 = compilerOptions0.checkTypes;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + checkLevel40 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel40.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel43 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel43.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        compilerOptions0.setCollapseProperties(false);
        boolean boolean9 = compilerOptions0.inlineVariables;
        boolean boolean10 = compilerOptions0.generateExports;
        compilerOptions0.setAmbiguateProperties(true);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setAliasableGlobals("java.io.IOException: Unversioned directory");
        boolean boolean17 = compilerOptions0.isExternExportsEnabled();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        boolean boolean8 = compilerOptions0.optimizeReturns;
        compilerOptions0.smartNameRemoval = true;
        compilerOptions0.skipAllCompilerPasses();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet13 = compilerOptions12.stripNamePrefixes;
        byte[] byteArray14 = compilerOptions12.inputVariableMapSerialized;
        boolean boolean15 = compilerOptions12.exportTestFunctions;
        compilerOptions12.lineBreak = false;
        compilerOptions12.collapseVariableDeclarations = true;
        compilerOptions12.setRemoveUnusedVars(false);
        boolean boolean22 = compilerOptions12.deadAssignmentElimination;
        compilerOptions12.removeTryCatchFinally = true;
        com.google.javascript.jscomp.CheckLevel checkLevel25 = compilerOptions12.checkRequires;
        compilerOptions0.checkProvides = checkLevel25;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + checkLevel25 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel25.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        double double5 = compiler4.getProgress();
        compiler4.reportCodeChange();
        com.google.javascript.jscomp.Scope scope7 = compiler4.getTopScope();
        compiler4.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        compiler0.setState(intermediateState9);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler0.tracker = performanceTracker11;
        com.google.javascript.rhino.Node node13 = compiler0.getRoot();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions0.setInputPropertyMapSerialized(byteArray13);
        compilerOptions0.setCheckControlStructures(true);
        boolean boolean17 = compilerOptions0.printInputDelimiter;
        compilerOptions0.collapseAnonymousFunctions = false;
        compilerOptions0.setLooseTypes(false);
        java.util.Set<java.lang.String> strSet22 = compilerOptions0.stripTypePrefixes;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode5 = compilerOptions0.getTracerMode();
        compilerOptions0.lineBreak = false;
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(false);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setInlineProperties(true);
        compilerOptions0.setLineLengthThreshold((int) (byte) 0);
        compilerOptions0.setGroupVariableDeclarations(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel18 = compilerOptions0.sourceMapDetailLevel;
        org.junit.Assert.assertTrue("'" + tracerMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode5.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertNotNull(detailLevel18);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TYPE_INVALIDATION = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        com.google.javascript.jscomp.SourceFile.Builder builder1 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator3 = null;
        com.google.javascript.jscomp.SourceFile sourceFile4 = builder1.buildFromGenerator("hi!", generator3);
        java.nio.charset.Charset charset5 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder6 = builder1.withCharset(charset5);
        com.google.javascript.jscomp.SourceFile.Generator generator8 = null;
        com.google.javascript.jscomp.SourceFile sourceFile9 = builder6.buildFromGenerator("hi!", generator8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder11 = builder6.withCharset(charset10);
        com.google.javascript.jscomp.SourceFile sourceFile13 = builder6.buildFromFile("java.io.IOException: Unversioned directory");
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder15 = builder6.withCharset(charset14);
        com.google.javascript.jscomp.SourceFile.Builder builder17 = builder6.withOriginalPath("2019/07/12 07:12");
        com.google.javascript.jscomp.SourceFile.Builder builder20 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator22 = null;
        com.google.javascript.jscomp.SourceFile sourceFile23 = builder20.buildFromGenerator("hi!", generator22);
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder25 = builder20.withCharset(charset24);
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder27 = builder20.withCharset(charset26);
        com.google.javascript.jscomp.SourceFile.Builder builder29 = builder20.withOriginalPath("hi!");
        com.google.javascript.jscomp.SourceFile sourceFile32 = builder20.buildFromCode("// Input %num%", "hi!");
        boolean boolean33 = sourceFile32.isExtern();
        java.io.Reader reader34 = sourceFile32.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile35 = com.google.javascript.jscomp.SourceFile.fromReader("java.io.IOException: java.io.IOException: 2019/07/12 07:12", reader34);
        com.google.javascript.jscomp.SourceFile sourceFile36 = builder6.buildFromReader("java.io.IOException: Unversioned directory", reader34);
        com.google.javascript.jscomp.SourceFile sourceFile37 = com.google.javascript.jscomp.SourceFile.fromReader("java.io.IOException: ", reader34);
        sourceFile37.setOriginalPath("\ufffd\nddd");
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(sourceFile23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(sourceFile32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(reader34);
        org.junit.Assert.assertNotNull(sourceFile35);
        org.junit.Assert.assertNotNull(sourceFile36);
        org.junit.Assert.assertNotNull(sourceFile37);
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions0.setInputPropertyMapSerialized(byteArray13);
        compilerOptions0.setAliasAllStrings(false);
        com.google.javascript.jscomp.CheckLevel checkLevel17 = compilerOptions0.reportMissingOverride;
        compilerOptions0.removeUnusedLocalVars = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet21 = compilerOptions20.stripNamePrefixes;
        byte[] byteArray22 = compilerOptions20.inputVariableMapSerialized;
        compilerOptions20.checkSymbols = false;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap25 = null;
        compilerOptions20.setCssRenamingMap(cssRenamingMap25);
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        boolean boolean30 = compilerOptions27.extractPrototypeMemberDeclarations;
        compilerOptions27.convertToDottedProperties = true;
        boolean boolean33 = compilerOptions27.inlineConstantVars;
        compilerOptions27.aliasAllStrings = false;
        boolean boolean36 = compilerOptions27.smartNameRemoval;
        compilerOptions27.gatherCssNames = true;
        com.google.javascript.jscomp.CheckLevel checkLevel39 = compilerOptions27.checkGlobalNamesLevel;
        compilerOptions20.setCheckProvides(checkLevel39);
        compilerOptions0.setCheckGlobalNamesLevel(checkLevel39);
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap42 = compilerOptions0.getTweakReplacements();
        boolean boolean43 = compilerOptions0.flowSensitiveInlineVariables;
        compilerOptions0.setOutputCharset("// Input %num%");
        java.util.Set<java.lang.String> strSet46 = compilerOptions0.stripNameSuffixes;
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + checkLevel17 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel17.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + checkLevel39 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel39.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strSet46);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        compilerOptions0.setCheckSuspiciousCode(true);
        compilerOptions0.setReserveRawExports(false);
        java.util.Set<java.lang.String> strSet7 = compilerOptions0.stripNameSuffixes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.setRewriteNewDateGoogNow(true);
        boolean boolean11 = compilerOptions8.extractPrototypeMemberDeclarations;
        boolean boolean12 = compilerOptions8.jqueryPass;
        compilerOptions8.collapseAnonymousFunctions = false;
        compilerOptions8.setManageClosureDependencies(true);
        compilerOptions8.setMarkAsCompiled(true);
        compilerOptions8.setAliasableGlobals("java.io.IOException: ");
        com.google.javascript.jscomp.CheckLevel checkLevel21 = null;
        compilerOptions8.setBrokenClosureRequiresLevel(checkLevel21);
        compilerOptions8.setSummaryDetailLevel((int) (byte) 1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions25.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention28 = null;
        compilerOptions25.setCodingConvention(codingConvention28);
        compilerOptions25.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel32 = compilerOptions25.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray33 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList34 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList34, locationMappingArray33);
        compilerOptions25.sourceMapLocationMappings = locationMappingList34;
        java.lang.Object[] objArray37 = locationMappingList34.toArray();
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions38.setRewriteNewDateGoogNow(true);
        boolean boolean41 = compilerOptions38.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach42 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions38.setInlineVariables(reach42);
        compilerOptions38.setPrintInputDelimiter(true);
        boolean boolean46 = compilerOptions38.closurePass;
        com.google.javascript.jscomp.MessageBundle messageBundle47 = null;
        compilerOptions38.messageBundle = messageBundle47;
        compilerOptions38.setDeadAssignmentElimination(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions52.setRewriteNewDateGoogNow(true);
        boolean boolean55 = compilerOptions52.extractPrototypeMemberDeclarations;
        compilerOptions52.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet58 = compilerOptions52.stripTypePrefixes;
        compilerOptions51.stripTypePrefixes = strSet58;
        compilerOptions38.setAliasableStrings(strSet58);
        boolean boolean61 = locationMappingList34.containsAll((java.util.Collection<java.lang.String>) strSet58);
        compilerOptions8.stripNameSuffixes = strSet58;
        compilerOptions0.setStripNamePrefixes(strSet58);
        compilerOptions0.setFoldConstants(false);
        compilerOptions0.optimizeArgumentsArray = true;
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + checkLevel32 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel32.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + reach42 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach42.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        com.google.javascript.jscomp.CheckLevel checkLevel3 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.CheckLevel checkLevel4 = compilerOptions0.reportMissingOverride;
        boolean boolean5 = compilerOptions0.ideMode;
        compilerOptions0.setExtractPrototypeMemberDeclarations(false);
        compilerOptions0.setProcessCommonJSModules(true);
        compilerOptions0.moveFunctionDeclarations = false;
        compilerOptions0.setCommonJSModulePathPrefix("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        org.junit.Assert.assertTrue("'" + checkLevel3 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel3.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel4 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel4.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        boolean boolean8 = compilerOptions0.optimizeReturns;
        compilerOptions0.smartNameRemoval = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention15 = null;
        compilerOptions12.setCodingConvention(codingConvention15);
        compilerOptions12.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel19 = compilerOptions12.checkProvides;
        java.lang.String[] strArray21 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        compilerOptions12.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList22);
        java.util.stream.Stream<java.lang.String> strStream25 = strList22.stream();
        compilerOptions0.setReplaceStringsConfiguration("hi!", (java.util.List<java.lang.String>) strList22);
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention30 = null;
        compilerOptions27.setCodingConvention(codingConvention30);
        compilerOptions27.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel34 = compilerOptions27.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray35 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList36 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList36, locationMappingArray35);
        compilerOptions27.sourceMapLocationMappings = locationMappingList36;
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions39.setRewriteNewDateGoogNow(true);
        boolean boolean42 = compilerOptions39.extractPrototypeMemberDeclarations;
        boolean boolean43 = compilerOptions39.jqueryPass;
        compilerOptions39.collapseAnonymousFunctions = false;
        boolean boolean46 = compilerOptions39.checkTypes;
        compilerOptions39.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CheckLevel checkLevel49 = compilerOptions39.checkProvides;
        compilerOptions27.checkUnreachableCode = checkLevel49;
        compilerOptions0.checkUnreachableCode = checkLevel49;
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions52.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention55 = null;
        compilerOptions52.setCodingConvention(codingConvention55);
        compilerOptions52.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions59 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet60 = compilerOptions59.stripNamePrefixes;
        compilerOptions52.setIdGenerators(strSet60);
        compilerOptions52.sourceMapOutputPath = "java.io.IOException: ";
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler64 = compilerOptions52.getAliasTransformationHandler();
        compilerOptions0.setAliasTransformationHandler(aliasTransformationHandler64);
        com.google.javascript.rhino.SourcePosition<com.google.javascript.jscomp.CompilerOptions.AliasTransformation> aliasTransformationSourcePosition67 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerOptions.AliasTransformation aliasTransformation68 = aliasTransformationHandler64.logAliasTransformation("java.io.IOException: java.io.IOException: java.io.IOException", aliasTransformationSourcePosition67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strStream25);
        org.junit.Assert.assertTrue("'" + checkLevel34 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel34.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + checkLevel49 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel49.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNotNull(aliasTransformationHandler64);
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions0.setInputPropertyMapSerialized(byteArray13);
        compilerOptions0.setAliasAllStrings(false);
        com.google.javascript.jscomp.CheckLevel checkLevel17 = compilerOptions0.reportMissingOverride;
        compilerOptions0.setNameReferenceReportPath("java.io.IOException: ");
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing20 = compilerOptions0.getTweakProcessing();
        compilerOptions0.setRemoveTryCatchFinally(true);
        compilerOptions0.setCoalesceVariableNames(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + checkLevel17 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel17.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + tweakProcessing20 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing20.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        compilerOptions0.setRemoveUnusedVars(true);
        boolean boolean8 = compilerOptions0.labelRenaming;
        boolean boolean9 = compilerOptions0.inlineVariables;
        compilerOptions0.setPreferLineBreakAtEndOfFile(false);
        compilerOptions0.disableRuntimeTypeCheck();
        compilerOptions0.skipAllCompilerPasses();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions0.setInputPropertyMapSerialized(byteArray13);
        compilerOptions0.setFlowSensitiveInlineVariables(true);
        boolean boolean17 = compilerOptions0.exportTestFunctions;
        compilerOptions0.closurePass = false;
        compilerOptions0.renamePrefix = "Unversioned directory";
        compilerOptions0.setMoveFunctionDeclarations(false);
        compilerOptions0.setProcessObjectPropertyString(false);
        boolean boolean26 = compilerOptions0.optimizeCalls;
        compilerOptions0.setExternExportsPath("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGeneratePseudoNames(true);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setIdeMode(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions11.setRewriteNewDateGoogNow(true);
        boolean boolean14 = compilerOptions11.extractPrototypeMemberDeclarations;
        compilerOptions11.convertToDottedProperties = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention20 = null;
        compilerOptions17.setCodingConvention(codingConvention20);
        compilerOptions17.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel24 = compilerOptions17.checkProvides;
        compilerOptions11.setReportUnknownTypes(checkLevel24);
        compilerOptions0.setCheckGlobalNamesLevel(checkLevel24);
        compilerOptions0.skipAllCompilerPasses();
        compilerOptions0.checkMissingGetCssNameBlacklist = "hi!";
        boolean boolean30 = compilerOptions0.devirtualizePrototypeMethods;
        compilerOptions0.crossModuleMethodMotion = false;
        boolean boolean33 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        compilerOptions0.setGroupVariableDeclarations(false);
        boolean boolean36 = compilerOptions0.printInputDelimiter;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + checkLevel24 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel24.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT;
        printStream1.println((java.lang.Object) diagnosticGroup18);
        com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK = diagnosticGroup18;
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
// flaky:         org.junit.Assert.assertNull(diagnosticGroup18);
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions0.setInputPropertyMapSerialized(byteArray13);
        compilerOptions0.setFlowSensitiveInlineVariables(true);
        boolean boolean17 = compilerOptions0.exportTestFunctions;
        compilerOptions0.setTweakToNumberLiteral("java.io.IOException", (int) (short) 0);
        compilerOptions0.disambiguateProperties = false;
        compilerOptions0.setFlowSensitiveInlineVariables(false);
        boolean boolean25 = compilerOptions0.preferLineBreakAtEndOfFile;
        boolean boolean26 = compilerOptions0.collapseAnonymousFunctions;
        compilerOptions0.setExternExports(false);
        compilerOptions0.optimizeReturns = false;
        boolean boolean31 = compilerOptions0.inlineFunctions;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str2 = sourceFile1.getName();
        java.lang.String str3 = sourceFile1.toString();
        org.junit.Assert.assertNotNull(sourceFile1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        compilerOptions0.setTweakToNumberLiteral("2019/07/12 07:12", 10);
        compilerOptions0.setNameReferenceGraphPath("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet11 = compilerOptions10.stripNamePrefixes;
        byte[] byteArray12 = compilerOptions10.inputVariableMapSerialized;
        boolean boolean13 = compilerOptions10.exportTestFunctions;
        compilerOptions10.lineBreak = false;
        boolean boolean16 = compilerOptions10.optimizeParameters;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode17 = com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
        compilerOptions10.setLanguageOut(languageMode17);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel19 = compilerOptions10.sourceMapDetailLevel;
        compilerOptions0.setSourceMapDetailLevel(detailLevel19);
        compilerOptions0.crossModuleMethodMotion = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention26 = null;
        compilerOptions23.setCodingConvention(codingConvention26);
        boolean boolean28 = compilerOptions23.generateExports;
        compilerOptions23.deadAssignmentElimination = false;
        compilerOptions23.setIdeMode(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions33.setRewriteNewDateGoogNow(true);
        boolean boolean36 = compilerOptions33.extractPrototypeMemberDeclarations;
        boolean boolean37 = compilerOptions33.jqueryPass;
        compilerOptions33.collapseAnonymousFunctions = false;
        java.lang.String str40 = compilerOptions33.aliasStringsBlacklist;
        compilerOptions33.inlineGetters = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions43.setRewriteNewDateGoogNow(true);
        boolean boolean46 = compilerOptions43.extractPrototypeMemberDeclarations;
        boolean boolean47 = compilerOptions43.jqueryPass;
        compilerOptions43.setRemoveUnusedClassProperties(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions50.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention53 = null;
        compilerOptions50.setCodingConvention(codingConvention53);
        compilerOptions50.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel57 = compilerOptions50.checkProvides;
        compilerOptions43.brokenClosureRequiresLevel = checkLevel57;
        compilerOptions33.setCheckGlobalThisLevel(checkLevel57);
        compilerOptions23.aggressiveVarCheck = checkLevel57;
        compilerOptions23.collapseVariableDeclarations = false;
        compilerOptions23.removeUnusedPrototypeProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel65 = compilerOptions23.aggressiveVarCheck;
        compilerOptions0.setCheckGlobalNamesLevel(checkLevel65);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + languageMode17 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT + "'", languageMode17.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT));
        org.junit.Assert.assertNotNull(detailLevel19);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + checkLevel57 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel57.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel65 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel65.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.JsAst jsAst7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.replaceScript(jsAst7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        boolean boolean5 = compilerOptions0.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setLabelRenaming(true);
        compilerOptions6.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean11 = compilerOptions6.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format12 = compilerOptions6.sourceMapFormat;
        compilerOptions0.setSourceMapFormat(format12);
        boolean boolean14 = compilerOptions0.ideMode;
        compilerOptions0.checkTypes = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        boolean boolean20 = compilerOptions17.extractPrototypeMemberDeclarations;
        compilerOptions17.convertToDottedProperties = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention26 = null;
        compilerOptions23.setCodingConvention(codingConvention26);
        compilerOptions23.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel30 = compilerOptions23.checkProvides;
        compilerOptions17.checkGlobalNamesLevel = checkLevel30;
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap32 = null;
        compilerOptions17.setCustomPasses(customPassExecutionTimeMultimap32);
        com.google.javascript.jscomp.CheckLevel checkLevel34 = compilerOptions17.checkGlobalNamesLevel;
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions35.setRewriteNewDateGoogNow(true);
        boolean boolean38 = compilerOptions35.extractPrototypeMemberDeclarations;
        compilerOptions35.setCollapseProperties(false);
        compilerOptions35.setClosurePass(true);
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions35.setInputPropertyMapSerialized(byteArray48);
        compilerOptions35.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions52.setRewriteNewDateGoogNow(true);
        boolean boolean55 = compilerOptions52.extractPrototypeMemberDeclarations;
        compilerOptions52.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet58 = compilerOptions52.stripTypePrefixes;
        compilerOptions35.aliasableStrings = strSet58;
        compilerOptions35.setRemoveUnusedVars(false);
        compilerOptions35.checkSuspiciousCode = false;
        java.lang.String str64 = compilerOptions35.locale;
        com.google.javascript.jscomp.CheckLevel checkLevel65 = compilerOptions35.checkUnreachableCode;
        compilerOptions17.setReportUnknownTypes(checkLevel65);
        compilerOptions0.setCheckUnreachableCode(checkLevel65);
        compilerOptions0.rewriteFunctionExpressions = false;
        compilerOptions0.setRemoveDeadCode(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(format12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + checkLevel30 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel30.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel34 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel34.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + checkLevel65 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel65.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setProcessCommonJSModules(false);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        boolean boolean8 = compilerOptions0.closurePass;
        compilerOptions0.setOutputCharset("java.io.IOException");
        compilerOptions0.reserveRawExports = true;
        compilerOptions0.setAcceptConstKeyword(false);
        boolean boolean15 = compilerOptions0.computeFunctionSideEffects;
        compilerOptions0.setGenerateExports(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("hi!");
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder11 = builder0.withCharset(charset10);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder13 = builder11.withCharset(charset12);
        com.google.javascript.jscomp.SourceFile sourceFile15 = builder13.buildFromFile("-1");
        sourceFile15.setOriginalPath("2019/07/12 07:12");
        int int19 = sourceFile15.getLineOfOffset((int) (short) 10);
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(sourceFile15);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("java.io.IOException: Unversioned directory", "java.io.IOException", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.disambiguateProperties;
        compilerOptions0.setReplaceStringsPlaceholderToken("java.io.IOException: ");
        compilerOptions0.setAliasKeywords(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.setRewriteNewDateGoogNow(true);
        boolean boolean11 = compilerOptions8.extractPrototypeMemberDeclarations;
        compilerOptions8.setCollapseProperties(false);
        compilerOptions8.setClosurePass(true);
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions8.setInputPropertyMapSerialized(byteArray21);
        compilerOptions8.setFlowSensitiveInlineVariables(true);
        boolean boolean25 = compilerOptions8.exportTestFunctions;
        compilerOptions8.setFlowSensitiveInlineVariables(false);
        compilerOptions8.checkSymbols = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions30.enableExternExports(true);
        compilerOptions30.setCrossModuleCodeMotion(false);
        java.util.Set<java.lang.String> strSet35 = compilerOptions30.stripNamePrefixes;
        compilerOptions30.setCheckControlStructures(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions38.setLabelRenaming(true);
        compilerOptions38.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CheckLevel checkLevel43 = compilerOptions38.checkGlobalThisLevel;
        compilerOptions38.setExportTestFunctions(false);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing46 = compilerOptions38.getTweakProcessing();
        compilerOptions30.setTweakProcessing(tweakProcessing46);
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy48 = compilerOptions30.anonymousFunctionNaming;
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = null;
        compilerOptions30.setTweakReplacements(strMap49);
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions51.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention54 = null;
        compilerOptions51.setCodingConvention(codingConvention54);
        boolean boolean56 = compilerOptions51.computeFunctionSideEffects;
        boolean boolean57 = compilerOptions51.printInputDelimiter;
        compilerOptions51.syntheticBlockEndMarker = "java.io.IOException";
        compilerOptions51.enableRuntimeTypeCheck("java.io.IOException: ");
        compilerOptions51.setRemoveUnusedPrototypePropertiesInExterns(true);
        byte[] byteArray66 = new byte[] { (byte) 0, (byte) 10 };
        compilerOptions51.setInputPropertyMapSerialized(byteArray66);
        compilerOptions30.inputVariableMapSerialized = byteArray66;
        compilerOptions8.setInputPropertyMapSerialized(byteArray66);
        compilerOptions0.inputVariableMapSerialized = byteArray66;
        compilerOptions0.setTightenTypes(true);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertTrue("'" + checkLevel43 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel43.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + tweakProcessing46 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing46.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy48 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy48.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[0, 10]");
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGeneratePseudoNames(true);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setIdeMode(true);
        compilerOptions0.computeFunctionSideEffects = false;
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap13 = null;
        compilerOptions0.setCustomPasses(customPassExecutionTimeMultimap13);
        java.util.Set<java.lang.String> strSet15 = compilerOptions0.stripNameSuffixes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions16.setRewriteNewDateGoogNow(true);
        boolean boolean19 = compilerOptions16.extractPrototypeMemberDeclarations;
        boolean boolean20 = compilerOptions16.jqueryPass;
        compilerOptions16.setClosurePass(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.setRewriteNewDateGoogNow(true);
        boolean boolean26 = compilerOptions23.extractPrototypeMemberDeclarations;
        compilerOptions23.setCollapseProperties(false);
        compilerOptions23.setClosurePass(true);
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions23.setInputPropertyMapSerialized(byteArray36);
        compilerOptions23.setFlowSensitiveInlineVariables(true);
        boolean boolean40 = compilerOptions23.exportTestFunctions;
        compilerOptions23.setTweakToNumberLiteral("java.io.IOException", (int) (short) 0);
        com.google.javascript.jscomp.CompilerOptions.Reach reach44 = com.google.javascript.jscomp.CompilerOptions.Reach.NONE;
        compilerOptions23.setInlineFunctions(reach44);
        compilerOptions16.setInlineVariables(reach44);
        compilerOptions16.setNameReferenceGraphPath("java.io.IOException: ");
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions49.setRewriteNewDateGoogNow(true);
        boolean boolean52 = compilerOptions49.extractPrototypeMemberDeclarations;
        boolean boolean53 = compilerOptions49.jqueryPass;
        compilerOptions49.collapseAnonymousFunctions = false;
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap56 = compilerOptions49.getDefineReplacements();
        compilerOptions49.extractPrototypeMemberDeclarations = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions59 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions59.setRewriteNewDateGoogNow(true);
        boolean boolean62 = compilerOptions59.extractPrototypeMemberDeclarations;
        compilerOptions59.setCollapseProperties(false);
        compilerOptions59.setClosurePass(true);
        byte[] byteArray72 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions59.setInputPropertyMapSerialized(byteArray72);
        com.google.javascript.jscomp.CheckLevel checkLevel74 = compilerOptions59.checkMissingGetCssNameLevel;
        compilerOptions49.checkProvides = checkLevel74;
        compilerOptions16.setAggressiveVarCheck(checkLevel74);
        compilerOptions0.setCheckMissingGetCssNameLevel(checkLevel74);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + reach44 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.NONE + "'", reach44.equals(com.google.javascript.jscomp.CompilerOptions.Reach.NONE));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + checkLevel74 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel74.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.enableExternExports(true);
        java.util.Set<java.lang.String> strSet3 = compilerOptions0.stripTypes;
        compilerOptions0.inlineFunctions = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet7 = compilerOptions6.stripNamePrefixes;
        byte[] byteArray8 = compilerOptions6.inputVariableMapSerialized;
        com.google.javascript.jscomp.CompilerOptions.Reach reach9 = com.google.javascript.jscomp.CompilerOptions.Reach.NONE;
        compilerOptions6.setInlineFunctions(reach9);
        compilerOptions0.setInlineFunctions(reach9);
        boolean boolean12 = compilerOptions0.jqueryPass;
        compilerOptions0.setProcessObjectPropertyString(true);
        compilerOptions0.setRemoveUnusedClassProperties(false);
        compilerOptions0.setTweakToDoubleLiteral("java.io.IOException", (double) (byte) 0);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(byteArray8);
        org.junit.Assert.assertTrue("'" + reach9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.NONE + "'", reach9.equals(com.google.javascript.jscomp.CompilerOptions.Reach.NONE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions0.setInputPropertyMapSerialized(byteArray13);
        compilerOptions0.setFlowSensitiveInlineVariables(true);
        boolean boolean17 = compilerOptions0.exportTestFunctions;
        compilerOptions0.setTweakToNumberLiteral("java.io.IOException", (int) (short) 0);
        compilerOptions0.setOptimizeCalls(true);
        compilerOptions0.setExtractPrototypeMemberDeclarations(true);
        boolean boolean25 = compilerOptions0.aliasKeywords;
        boolean boolean26 = compilerOptions0.shouldColorizeErrorOutput();
        compilerOptions0.setLocale("java.io.IOException: ");
        compilerOptions0.removeTryCatchFinally = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.setClosurePass(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions7.setRewriteNewDateGoogNow(true);
        boolean boolean10 = compilerOptions7.extractPrototypeMemberDeclarations;
        compilerOptions7.setCollapseProperties(false);
        compilerOptions7.setClosurePass(true);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions7.setInputPropertyMapSerialized(byteArray20);
        compilerOptions7.setFlowSensitiveInlineVariables(true);
        boolean boolean24 = compilerOptions7.exportTestFunctions;
        compilerOptions7.setTweakToNumberLiteral("java.io.IOException", (int) (short) 0);
        com.google.javascript.jscomp.CompilerOptions.Reach reach28 = com.google.javascript.jscomp.CompilerOptions.Reach.NONE;
        compilerOptions7.setInlineFunctions(reach28);
        compilerOptions0.setInlineVariables(reach28);
        boolean boolean31 = compilerOptions0.aliasAllStrings;
        compilerOptions0.setLineBreak(false);
        compilerOptions0.setTransformAMDToCJSModules(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + reach28 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.NONE + "'", reach28.equals(com.google.javascript.jscomp.CompilerOptions.Reach.NONE));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions0.setInputPropertyMapSerialized(byteArray13);
        compilerOptions0.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        boolean boolean20 = compilerOptions17.extractPrototypeMemberDeclarations;
        compilerOptions17.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet23 = compilerOptions17.stripTypePrefixes;
        compilerOptions0.aliasableStrings = strSet23;
        compilerOptions0.setRemoveUnusedVars(false);
        compilerOptions0.checkSuspiciousCode = false;
        boolean boolean29 = compilerOptions0.prettyPrint;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet6 = compilerOptions0.stripTypePrefixes;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compilerOptions0.cssRenamingMap;
        compilerOptions0.reserveRawExports = true;
        boolean boolean10 = compilerOptions0.collapseVariableDeclarations;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions11.setRewriteNewDateGoogNow(true);
        boolean boolean14 = compilerOptions11.extractPrototypeMemberDeclarations;
        compilerOptions11.convertToDottedProperties = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention20 = null;
        compilerOptions17.setCodingConvention(codingConvention20);
        compilerOptions17.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel24 = compilerOptions17.checkProvides;
        compilerOptions11.checkGlobalNamesLevel = checkLevel24;
        compilerOptions0.setCheckProvides(checkLevel24);
        com.google.javascript.jscomp.SourceMap.Format format27 = compilerOptions0.sourceMapFormat;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(cssRenamingMap7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + checkLevel24 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel24.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(format27);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.reserveRawExports;
        compilerOptions0.computeFunctionSideEffects = false;
        compilerOptions0.setOptimizeCalls(true);
        java.lang.String str13 = compilerOptions0.syntheticBlockStartMarker;
        compilerOptions0.setLineBreak(true);
        java.lang.String str16 = compilerOptions0.checkMissingGetCssNameBlacklist;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean5 = compilerOptions0.labelRenaming;
        compilerOptions0.ambiguateProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet9 = compilerOptions8.stripNamePrefixes;
        byte[] byteArray10 = compilerOptions8.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup11;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention16 = null;
        compilerOptions13.setCodingConvention(codingConvention16);
        compilerOptions13.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel20 = compilerOptions13.checkProvides;
        compilerOptions8.setWarningLevel(diagnosticGroup11, checkLevel20);
        compilerOptions0.checkUnreachableCode = checkLevel20;
        compilerOptions0.setAliasableGlobals("");
        boolean boolean25 = compilerOptions0.checkControlStructures;
        compilerOptions0.setCollapseAnonymousFunctions(true);
        compilerOptions0.setCollapsePropertiesOnExternTypes(false);
        compilerOptions0.setRecordFunctionInformation(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(byteArray10);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup11);
        org.junit.Assert.assertTrue("'" + checkLevel20 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel20.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGeneratePseudoNames(true);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setIdeMode(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions11.setRewriteNewDateGoogNow(true);
        boolean boolean14 = compilerOptions11.extractPrototypeMemberDeclarations;
        compilerOptions11.convertToDottedProperties = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention20 = null;
        compilerOptions17.setCodingConvention(codingConvention20);
        compilerOptions17.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel24 = compilerOptions17.checkProvides;
        compilerOptions11.setReportUnknownTypes(checkLevel24);
        compilerOptions0.setCheckGlobalNamesLevel(checkLevel24);
        compilerOptions0.checkMissingGetCssNameBlacklist = "";
        boolean boolean29 = compilerOptions0.foldConstants;
        compilerOptions0.optimizeReturns = true;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + checkLevel24 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel24.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions1.setRewriteNewDateGoogNow(true);
        boolean boolean4 = compilerOptions1.extractPrototypeMemberDeclarations;
        compilerOptions1.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet7 = compilerOptions1.stripTypePrefixes;
        compilerOptions0.stripTypePrefixes = strSet7;
        compilerOptions0.setChainCalls(true);
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap11 = null;
        compilerOptions0.setCustomPasses(customPassExecutionTimeMultimap11);
        compilerOptions0.setClosurePass(true);
        compilerOptions0.setSourceMapOutputPath("hi!");
        compilerOptions0.prettyPrint = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions19.setRewriteNewDateGoogNow(true);
        boolean boolean22 = compilerOptions19.extractPrototypeMemberDeclarations;
        boolean boolean23 = compilerOptions19.jqueryPass;
        boolean boolean24 = compilerOptions19.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions25.setLabelRenaming(true);
        compilerOptions25.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean30 = compilerOptions25.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format31 = compilerOptions25.sourceMapFormat;
        compilerOptions19.sourceMapFormat = format31;
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions33.setRewriteNewDateGoogNow(true);
        boolean boolean36 = compilerOptions33.extractPrototypeMemberDeclarations;
        compilerOptions33.setCollapseProperties(false);
        boolean boolean39 = compilerOptions33.printInputDelimiter;
        com.google.javascript.jscomp.ErrorFormat errorFormat40 = compilerOptions33.errorFormat;
        compilerOptions19.setErrorFormat(errorFormat40);
        compilerOptions19.removeUnusedClassProperties = false;
        compilerOptions19.setAmbiguateProperties(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions46.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention49 = null;
        compilerOptions46.setCodingConvention(codingConvention49);
        boolean boolean51 = compilerOptions46.generateExports;
        compilerOptions46.gatherCssNames = false;
        boolean boolean54 = compilerOptions46.optimizeReturns;
        compilerOptions46.smartNameRemoval = true;
        java.util.Set<java.lang.String> strSet57 = compilerOptions46.aliasableStrings;
        compilerOptions46.generateExports = false;
        compilerOptions46.setClosurePass(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions62 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet63 = compilerOptions62.stripNamePrefixes;
        byte[] byteArray64 = compilerOptions62.inputVariableMapSerialized;
        compilerOptions62.setNameReferenceReportPath("java.io.IOException: Unversioned directory");
        compilerOptions62.setDeadAssignmentElimination(true);
        compilerOptions62.setShadowVariables(true);
        java.lang.String str71 = compilerOptions62.inputDelimiter;
        compilerOptions62.setComputeFunctionSideEffects(true);
        com.google.javascript.jscomp.CheckLevel checkLevel74 = compilerOptions62.checkMissingReturn;
        compilerOptions46.aggressiveVarCheck = checkLevel74;
        compilerOptions19.checkRequires = checkLevel74;
        compilerOptions0.checkMissingReturn = checkLevel74;
        compilerOptions0.setInlineLocalVariables(true);
        compilerOptions0.enableRuntimeTypeCheck("2019/07/12 07:12");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(format31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(errorFormat40);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNull(byteArray64);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "// Input %num%" + "'", str71, "// Input %num%");
        org.junit.Assert.assertTrue("'" + checkLevel74 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel74.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        compilerOptions0.setRemoveUnusedVars(true);
        boolean boolean8 = compilerOptions0.labelRenaming;
        boolean boolean9 = compilerOptions0.inlineVariables;
        compilerOptions0.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.SourceMap.Format format12 = compilerOptions0.sourceMapFormat;
        compilerOptions0.setRecordFunctionInformation(true);
        java.util.Set<java.lang.String> strSet15 = compilerOptions0.stripNamePrefixes;
        compilerOptions0.setSyntheticBlockStartMarker("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(format12);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup3;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = com.google.javascript.jscomp.DiagnosticGroups.TWEAKS;
        com.google.javascript.jscomp.SourceFile.Builder builder6 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator8 = null;
        com.google.javascript.jscomp.SourceFile sourceFile9 = builder6.buildFromGenerator("hi!", generator8);
        java.lang.Object[] objArray10 = new java.lang.Object[] { diagnosticGroup3, diagnosticGroup5, sourceFile9 };
        java.io.PrintStream printStream11 = printStream1.printf("2019/07/12 07:12", objArray10);
        printStream11.println();
        printStream11.write((int) (byte) 100);
        java.io.PrintStream printStream16 = new java.io.PrintStream("Unversioned directory");
        char[] charArray19 = new char[] { '4', '4' };
        printStream16.print(charArray19);
        printStream11.print(charArray19);
        boolean boolean22 = printStream11.checkError();
        boolean boolean23 = printStream11.checkError();
// flaky:         org.junit.Assert.assertNull(diagnosticGroup3);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup5);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null, null, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null, null, hi!]");
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, 4]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        boolean boolean8 = compilerOptions0.closurePass;
        com.google.javascript.jscomp.MessageBundle messageBundle9 = null;
        compilerOptions0.messageBundle = messageBundle9;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention15 = null;
        compilerOptions12.setCodingConvention(codingConvention15);
        boolean boolean17 = compilerOptions12.generateExports;
        compilerOptions12.gatherCssNames = false;
        boolean boolean20 = compilerOptions12.optimizeReturns;
        compilerOptions12.smartNameRemoval = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions24.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention27 = null;
        compilerOptions24.setCodingConvention(codingConvention27);
        compilerOptions24.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel31 = compilerOptions24.checkProvides;
        java.lang.String[] strArray33 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        compilerOptions24.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList34);
        java.util.stream.Stream<java.lang.String> strStream37 = strList34.stream();
        compilerOptions12.setReplaceStringsConfiguration("hi!", (java.util.List<java.lang.String>) strList34);
        compilerOptions0.setReplaceStringsConfiguration("java.io.IOException: java.io.IOException: 2019/07/12 07:12", (java.util.List<java.lang.String>) strList34);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        compilerOptions0.setProcessCommonJSModules(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions44.setRewriteNewDateGoogNow(true);
        boolean boolean47 = compilerOptions44.extractPrototypeMemberDeclarations;
        compilerOptions44.setCollapseProperties(false);
        compilerOptions44.setClosurePass(true);
        byte[] byteArray57 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions44.setInputPropertyMapSerialized(byteArray57);
        compilerOptions44.setFlowSensitiveInlineVariables(true);
        boolean boolean61 = compilerOptions44.exportTestFunctions;
        compilerOptions44.closurePass = false;
        compilerOptions44.renamePrefix = "Unversioned directory";
        compilerOptions44.setMoveFunctionDeclarations(false);
        compilerOptions44.setCheckSuspiciousCode(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions70 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions70.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention73 = null;
        compilerOptions70.setCodingConvention(codingConvention73);
        boolean boolean75 = compilerOptions70.generateExports;
        compilerOptions70.collapseVariableDeclarations = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions78 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions78.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention81 = null;
        compilerOptions78.setCodingConvention(codingConvention81);
        compilerOptions78.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel85 = compilerOptions78.checkProvides;
        java.lang.String[] strArray87 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        compilerOptions78.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList88);
        compilerOptions70.setManageClosureDependencies((java.util.List<java.lang.String>) strList88);
        compilerOptions44.setManageClosureDependencies((java.util.List<java.lang.String>) strList88);
        compilerOptions0.setManageClosureDependencies((java.util.List<java.lang.String>) strList88);
        com.google.javascript.jscomp.CheckLevel checkLevel94 = compilerOptions0.aggressiveVarCheck;
        compilerOptions0.setCollapseVariableDeclarations(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + checkLevel31 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel31.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strStream37);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + checkLevel85 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel85.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + checkLevel94 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel94.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap5 = null;
        compilerOptions0.setCssRenamingMap(cssRenamingMap5);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.reportMissingOverride;
        boolean boolean8 = compilerOptions0.smartNameRemoval;
        compilerOptions0.recordFunctionInformation = false;
        compilerOptions0.setSyntheticBlockEndMarker("java.io.IOException: Unversioned directory");
        compilerOptions0.setTweakToDoubleLiteral("java.io.IOException: java.io.IOException: 2019/07/12 07:12", (double) 100);
        boolean boolean16 = compilerOptions0.preferLineBreakAtEndOfFile;
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap17 = compilerOptions0.customPasses;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(customPassExecutionTimeMultimap17);
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CONST = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_REGEXP = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        java.io.IOException iOException2 = new java.io.IOException("java.io.IOException: Unversioned directory");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException2);
        java.lang.String str5 = iOException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: java.io.IOException: Unversioned directory" + "'", str5, "java.io.IOException: java.io.IOException: Unversioned directory");
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        java.util.function.UnaryOperator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            locationMappingList9.replaceAll(locationMappingUnaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        java.util.Set<java.lang.String> strSet8 = compilerOptions0.stripTypes;
        compilerOptions0.coalesceVariableNames = true;
        compilerOptions0.setRemoveUnusedClassProperties(false);
        compilerOptions0.ideMode = true;
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy6 = compilerOptions0.variableRenaming;
        compilerOptions0.setOptimizeParameters(false);
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler9 = compilerOptions0.getAliasTransformationHandler();
        compilerOptions0.prettyPrint = true;
        com.google.javascript.jscomp.CheckLevel checkLevel12 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.setCheckControlStructures(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions15.setRewriteNewDateGoogNow(true);
        boolean boolean18 = compilerOptions15.extractPrototypeMemberDeclarations;
        boolean boolean19 = compilerOptions15.jqueryPass;
        compilerOptions15.setRemoveUnusedClassProperties(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions22.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention25 = null;
        compilerOptions22.setCodingConvention(codingConvention25);
        compilerOptions22.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel29 = compilerOptions22.checkProvides;
        compilerOptions15.brokenClosureRequiresLevel = checkLevel29;
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = null;
        compilerOptions15.setTweakReplacements(strMap31);
        com.google.javascript.jscomp.SourceMap.Format format33 = compilerOptions15.sourceMapFormat;
        compilerOptions0.setSourceMapFormat(format33);
        compilerOptions0.setSummaryDetailLevel(35);
        boolean boolean37 = compilerOptions0.inlineVariables;
        compilerOptions0.removeUnusedPrototypeProperties = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy6 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.OFF + "'", variableRenamingPolicy6.equals(com.google.javascript.jscomp.VariableRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(aliasTransformationHandler9);
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + checkLevel29 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel29.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(format33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_USELESS_CODE = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_USELESS_CODE = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup3;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions5.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention8 = null;
        compilerOptions5.setCodingConvention(codingConvention8);
        compilerOptions5.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel12 = compilerOptions5.checkProvides;
        compilerOptions0.setWarningLevel(diagnosticGroup3, checkLevel12);
        java.util.Set<java.lang.String> strSet14 = compilerOptions0.stripNamePrefixes;
        boolean boolean15 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCheckTypes(false);
        compilerOptions0.setClosurePass(true);
        boolean boolean20 = compilerOptions0.flowSensitiveInlineVariables;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup3);
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        double double3 = compiler1.getProgress();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler1.getSourceMap();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        double double7 = compiler6.getProgress();
        compiler6.reportCodeChange();
        com.google.javascript.jscomp.Scope scope9 = compiler6.getTopScope();
        double double10 = compiler6.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler6.getState();
        compiler1.setState(intermediateState11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = compiler1.acceptConstKeyword();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(intermediateState11);
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        compilerOptions0.aliasAllStrings = false;
        boolean boolean9 = compilerOptions0.smartNameRemoval;
        compilerOptions0.gatherCssNames = true;
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap12 = null;
        compilerOptions0.setCustomPasses(customPassExecutionTimeMultimap12);
        byte[] byteArray14 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.setSpecializeInitialModule(true);
        com.google.javascript.jscomp.CheckLevel checkLevel17 = compilerOptions0.reportMissingOverride;
        compilerOptions0.setLineLengthThreshold(0);
        compilerOptions0.inlineGetters = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertTrue("'" + checkLevel17 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel17.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        boolean boolean6 = compilerOptions0.removeUnusedVars;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = null;
        compilerOptions0.cssRenamingMap = cssRenamingMap7;
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing9 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF;
        compilerOptions0.setTweakProcessing(tweakProcessing9);
        compilerOptions0.setDefineToNumberLiteral("java.io.IOException: ", (int) (short) 10);
        compilerOptions0.renamePrefixNamespace = "java.io.IOException: ";
        java.util.Set<java.lang.String> strSet16 = compilerOptions0.aliasableStrings;
        boolean boolean17 = compilerOptions0.inlineGetters;
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions18.setRewriteNewDateGoogNow(true);
        boolean boolean21 = compilerOptions18.extractPrototypeMemberDeclarations;
        compilerOptions18.convertToDottedProperties = true;
        boolean boolean24 = compilerOptions18.inlineConstantVars;
        compilerOptions18.aliasAllStrings = false;
        com.google.javascript.jscomp.CheckLevel checkLevel27 = compilerOptions18.checkRequires;
        compilerOptions18.setOutputCharset("java.io.IOException: ");
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap30 = null;
        compilerOptions18.customPasses = customPassExecutionTimeMultimap30;
        compilerOptions18.setRemoveUnusedPrototypePropertiesInExterns(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions34.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention37 = null;
        compilerOptions34.setCodingConvention(codingConvention37);
        compilerOptions34.setGeneratePseudoNames(true);
        compilerOptions34.inlineLocalFunctions = false;
        compilerOptions34.setIdeMode(true);
        boolean boolean45 = compilerOptions34.crossModuleMethodMotion;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup46 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_USELESS_CODE = diagnosticGroup46;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup46;
        com.google.javascript.jscomp.DiagnosticGroups.VISIBILITY = diagnosticGroup46;
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet51 = compilerOptions50.stripNamePrefixes;
        byte[] byteArray52 = compilerOptions50.inputVariableMapSerialized;
        boolean boolean53 = compilerOptions50.exportTestFunctions;
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions54.setLabelRenaming(true);
        compilerOptions54.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CheckLevel checkLevel59 = compilerOptions54.checkGlobalThisLevel;
        compilerOptions50.setCheckGlobalNamesLevel(checkLevel59);
        com.google.javascript.jscomp.CompilerOptions compilerOptions61 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions61.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention64 = null;
        compilerOptions61.setCodingConvention(codingConvention64);
        boolean boolean66 = compilerOptions61.computeFunctionSideEffects;
        boolean boolean67 = compilerOptions61.printInputDelimiter;
        compilerOptions61.setGeneratePseudoNames(true);
        boolean boolean70 = compilerOptions61.disambiguateProperties;
        java.util.Set<java.lang.String> strSet71 = compilerOptions61.aliasableStrings;
        compilerOptions50.stripNameSuffixes = strSet71;
        com.google.javascript.jscomp.CheckLevel checkLevel73 = compilerOptions50.checkProvides;
        compilerOptions34.setWarningLevel(diagnosticGroup46, checkLevel73);
        compilerOptions18.checkGlobalNamesLevel = checkLevel73;
        compilerOptions0.reportMissingOverride = checkLevel73;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tweakProcessing9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing9.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + checkLevel27 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel27.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup46);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNull(byteArray52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + checkLevel59 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel59.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertTrue("'" + checkLevel73 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel73.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.disambiguateProperties;
        compilerOptions0.setDefineToNumberLiteral("2019/07/12 07:12", (int) '#');
        java.lang.String str7 = compilerOptions0.instrumentationTemplate;
        compilerOptions0.setComputeFunctionSideEffects(false);
        compilerOptions0.setProcessObjectPropertyString(false);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        compilerOptions0.optimizeParameters = true;
        compilerOptions0.setAliasAllStrings(true);
        compilerOptions0.setNameReferenceGraphPath("java.io.IOException");
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention12 = null;
        compilerOptions9.setCodingConvention(codingConvention12);
        compilerOptions9.setGeneratePseudoNames(true);
        compilerOptions9.inlineLocalFunctions = false;
        compilerOptions9.setIdeMode(true);
        boolean boolean20 = compilerOptions9.crossModuleMethodMotion;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_USELESS_CODE = diagnosticGroup21;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup21;
        com.google.javascript.jscomp.DiagnosticGroups.VISIBILITY = diagnosticGroup21;
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet26 = compilerOptions25.stripNamePrefixes;
        byte[] byteArray27 = compilerOptions25.inputVariableMapSerialized;
        boolean boolean28 = compilerOptions25.exportTestFunctions;
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions29.setLabelRenaming(true);
        compilerOptions29.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CheckLevel checkLevel34 = compilerOptions29.checkGlobalThisLevel;
        compilerOptions25.setCheckGlobalNamesLevel(checkLevel34);
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions36.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention39 = null;
        compilerOptions36.setCodingConvention(codingConvention39);
        boolean boolean41 = compilerOptions36.computeFunctionSideEffects;
        boolean boolean42 = compilerOptions36.printInputDelimiter;
        compilerOptions36.setGeneratePseudoNames(true);
        boolean boolean45 = compilerOptions36.disambiguateProperties;
        java.util.Set<java.lang.String> strSet46 = compilerOptions36.aliasableStrings;
        compilerOptions25.stripNameSuffixes = strSet46;
        com.google.javascript.jscomp.CheckLevel checkLevel48 = compilerOptions25.checkProvides;
        compilerOptions9.setWarningLevel(diagnosticGroup21, checkLevel48);
        compilerOptions0.setCheckRequires(checkLevel48);
        compilerOptions0.setInputDelimiter("java.io.IOException: java.io.IOException: java.io.IOException");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup21);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(byteArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + checkLevel34 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel34.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertTrue("'" + checkLevel48 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel48.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing8 = compilerOptions0.getTweakProcessing();
        compilerOptions0.setPreferLineBreakAtEndOfFile(false);
        compilerOptions0.setGenerateExports(false);
        compilerOptions0.setRemoveUnusedVars(true);
        compilerOptions0.setLooseTypes(true);
        compilerOptions0.setAssumeStrictThis(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + tweakProcessing8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing8.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode5 = compilerOptions0.getTracerMode();
        compilerOptions0.lineBreak = false;
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(false);
        compilerOptions0.inlineLocalFunctions = false;
        java.io.PrintStream printStream13 = new java.io.PrintStream("Unversioned directory");
        printStream13.write((-1));
        printStream13.println('#');
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = com.google.javascript.jscomp.DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL;
        com.google.javascript.jscomp.DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL = diagnosticGroup18;
        printStream13.print((java.lang.Object) diagnosticGroup18);
        java.io.PrintStream printStream22 = new java.io.PrintStream("Unversioned directory");
        char[] charArray25 = new char[] { '4', '4' };
        printStream22.print(charArray25);
        printStream22.print((int) ' ');
        byte[] byteArray35 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream22.write(byteArray35, (int) (byte) 0, (int) (byte) 1);
        printStream13.write(byteArray35, 0, 0);
        compilerOptions0.setInputPropertyMapSerialized(byteArray35);
        java.util.Set<java.lang.String> strSet43 = compilerOptions0.aliasableStrings;
        org.junit.Assert.assertTrue("'" + tracerMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode5.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
// flaky:         org.junit.Assert.assertNull(diagnosticGroup18);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(strSet43);
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream9 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        printStream1.write((int) '#');
        printStream1.print((float) (short) 0);
        java.io.PrintStream printStream15 = new java.io.PrintStream("Unversioned directory");
        char[] charArray18 = new char[] { '4', '4' };
        printStream15.print(charArray18);
        printStream15.print((int) ' ');
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream15.write(byteArray28, (int) (byte) 0, (int) (byte) 1);
        printStream1.write(byteArray28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions33.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention36 = null;
        compilerOptions33.setCodingConvention(codingConvention36);
        compilerOptions33.setGeneratePseudoNames(true);
        compilerOptions33.inlineLocalFunctions = false;
        compilerOptions33.setIdeMode(true);
        compilerOptions33.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions46.setRewriteNewDateGoogNow(true);
        boolean boolean49 = compilerOptions46.extractPrototypeMemberDeclarations;
        compilerOptions46.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel52 = compilerOptions46.checkGlobalThisLevel;
        compilerOptions33.checkMissingReturn = checkLevel52;
        printStream1.println((java.lang.Object) compilerOptions33);
        printStream1.print((long) (short) 0);
        printStream1.println();
        printStream1.println("java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + checkLevel52 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel52.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        boolean boolean5 = compilerOptions0.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setLabelRenaming(true);
        compilerOptions6.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean11 = compilerOptions6.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format12 = compilerOptions6.sourceMapFormat;
        compilerOptions0.sourceMapFormat = format12;
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setRewriteNewDateGoogNow(true);
        boolean boolean17 = compilerOptions14.extractPrototypeMemberDeclarations;
        compilerOptions14.setCollapseProperties(false);
        boolean boolean20 = compilerOptions14.printInputDelimiter;
        com.google.javascript.jscomp.ErrorFormat errorFormat21 = compilerOptions14.errorFormat;
        compilerOptions0.setErrorFormat(errorFormat21);
        boolean boolean23 = compilerOptions0.removeTryCatchFinally;
        compilerOptions0.flowSensitiveInlineVariables = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions26.setRewriteNewDateGoogNow(true);
        boolean boolean29 = compilerOptions26.extractPrototypeMemberDeclarations;
        compilerOptions26.flowSensitiveInlineVariables = false;
        compilerOptions26.checkMissingGetCssNameBlacklist = "java.io.IOException: ";
        compilerOptions26.removeUnusedVars = true;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode36 = com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3;
        compilerOptions26.setLanguageOut(languageMode36);
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions38.setRewriteNewDateGoogNow(true);
        boolean boolean41 = compilerOptions38.extractPrototypeMemberDeclarations;
        compilerOptions38.setCollapseProperties(false);
        compilerOptions38.setClosurePass(true);
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions38.setInputPropertyMapSerialized(byteArray51);
        compilerOptions38.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.MessageBundle messageBundle55 = null;
        compilerOptions38.messageBundle = messageBundle55;
        com.google.javascript.jscomp.CheckLevel checkLevel57 = compilerOptions38.checkProvides;
        compilerOptions26.setCheckRequires(checkLevel57);
        compilerOptions0.checkMissingGetCssNameLevel = checkLevel57;
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy60 = compilerOptions0.anonymousFunctionNaming;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(format12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(errorFormat21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + languageMode36 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode36.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + checkLevel57 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel57.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy60 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy60.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        java.io.PrintStream printStream1 = new java.io.PrintStream("4432#Unversionedhi!rector true\n0\n");
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention9 = null;
        compilerOptions6.setCodingConvention(codingConvention9);
        compilerOptions6.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel13 = compilerOptions6.checkProvides;
        compilerOptions0.setReportUnknownTypes(checkLevel13);
        compilerOptions0.setCrossModuleCodeMotion(true);
        compilerOptions0.setShadowVariables(false);
        compilerOptions0.setCheckSuspiciousCode(false);
        boolean boolean21 = compilerOptions0.checkControlStructures;
        boolean boolean22 = compilerOptions0.checkControlStructures;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel13 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel13.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        compilerOptions0.resetWarningsGuard();
        compilerOptions0.convertToDottedProperties = true;
        compilerOptions0.setNameReferenceReportPath("java.io.IOException: Unversioned directory");
        compilerOptions0.setReserveRawExports(false);
        compilerOptions0.setPreferLineBreakAtEndOfFile(true);
        java.lang.String str15 = compilerOptions0.aliasStringsBlacklist;
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        boolean boolean8 = compilerOptions0.optimizeReturns;
        compilerOptions0.smartNameRemoval = true;
        java.util.Set<java.lang.String> strSet11 = compilerOptions0.aliasableStrings;
        compilerOptions0.generateExports = false;
        boolean boolean14 = compilerOptions0.assumeStrictThis();
        compilerOptions0.setReserveRawExports(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention20 = null;
        compilerOptions17.setCodingConvention(codingConvention20);
        compilerOptions17.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet25 = compilerOptions24.stripNamePrefixes;
        compilerOptions17.setIdGenerators(strSet25);
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention30 = null;
        compilerOptions27.setCodingConvention(codingConvention30);
        compilerOptions27.setGeneratePseudoNames(true);
        compilerOptions27.inlineLocalFunctions = false;
        compilerOptions27.setIdeMode(true);
        compilerOptions27.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions40.setRewriteNewDateGoogNow(true);
        boolean boolean43 = compilerOptions40.extractPrototypeMemberDeclarations;
        compilerOptions40.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel46 = compilerOptions40.checkGlobalThisLevel;
        compilerOptions27.checkMissingReturn = checkLevel46;
        compilerOptions17.aggressiveVarCheck = checkLevel46;
        compilerOptions0.checkUnreachableCode = checkLevel46;
        compilerOptions0.setCheckCaja(true);
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap52 = compilerOptions0.getTweakReplacements();
        compilerOptions0.setUnaliasableGlobals("");
        compilerOptions0.syntheticBlockEndMarker = "java.io.IOException: java.io.IOException: Unversioned directory";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + checkLevel46 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel46.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strMap52);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        boolean boolean8 = compilerOptions0.optimizeReturns;
        compilerOptions0.smartNameRemoval = true;
        java.util.Set<java.lang.String> strSet11 = compilerOptions0.aliasableStrings;
        compilerOptions0.generateExports = false;
        boolean boolean14 = compilerOptions0.assumeStrictThis();
        boolean boolean15 = compilerOptions0.markNoSideEffectCalls;
        java.util.Set<java.lang.String> strSet16 = compilerOptions0.stripNamePrefixes;
        compilerOptions0.setPrettyPrint(true);
        compilerOptions0.setDisambiguateProperties(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet22 = compilerOptions21.stripNamePrefixes;
        byte[] byteArray23 = compilerOptions21.inputVariableMapSerialized;
        boolean boolean24 = compilerOptions21.exportTestFunctions;
        compilerOptions21.setExtractPrototypeMemberDeclarations(true);
        compilerOptions21.reserveRawExports = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions29.setRewriteNewDateGoogNow(true);
        boolean boolean32 = compilerOptions29.extractPrototypeMemberDeclarations;
        compilerOptions29.convertToDottedProperties = true;
        boolean boolean35 = compilerOptions29.inlineConstantVars;
        boolean boolean36 = compilerOptions29.extractPrototypeMemberDeclarations;
        compilerOptions29.optimizeCalls = true;
        compilerOptions29.removeUnusedPrototypeProperties = false;
        compilerOptions29.setExternExports(true);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode43 = compilerOptions29.getTracerMode();
        com.google.javascript.jscomp.CheckLevel checkLevel44 = compilerOptions29.checkProvides;
        compilerOptions21.setCheckRequires(checkLevel44);
        boolean boolean46 = compilerOptions21.optimizeCalls;
        java.util.Set<java.lang.String> strSet47 = compilerOptions21.stripNamePrefixes;
        compilerOptions0.setStripNamePrefixes(strSet47);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + tracerMode43 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode43.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel44 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel44.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strSet47);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions0.setInputPropertyMapSerialized(byteArray13);
        compilerOptions0.setCheckControlStructures(true);
        compilerOptions0.setInlineLocalFunctions(true);
        com.google.javascript.jscomp.SourceMap.Format format19 = compilerOptions0.sourceMapFormat;
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setRewriteNewDateGoogNow(true);
        boolean boolean23 = compilerOptions20.extractPrototypeMemberDeclarations;
        boolean boolean24 = compilerOptions20.jqueryPass;
        compilerOptions20.setRemoveUnusedClassProperties(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention30 = null;
        compilerOptions27.setCodingConvention(codingConvention30);
        compilerOptions27.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel34 = compilerOptions27.checkProvides;
        compilerOptions20.brokenClosureRequiresLevel = checkLevel34;
        compilerOptions0.checkGlobalNamesLevel = checkLevel34;
        compilerOptions0.generateExports = false;
        compilerOptions0.removeTryCatchFinally = false;
        boolean boolean41 = compilerOptions0.inlineVariables;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertNotNull(format19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + checkLevel34 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel34.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        boolean boolean6 = compilerOptions0.removeUnusedVars;
        boolean boolean7 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        compilerOptions0.setProcessObjectPropertyString(false);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean12 = compilerOptions0.removeDeadCode;
        com.google.javascript.jscomp.CheckLevel checkLevel13 = compilerOptions0.checkGlobalNamesLevel;
        compilerOptions0.closurePass = false;
        compilerOptions0.renamePrefix = "-1";
        boolean boolean18 = compilerOptions0.smartNameRemoval;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + checkLevel13 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel13.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        com.google.javascript.jscomp.Region region9 = compiler0.getSourceRegion("-1", (-1));
        com.google.javascript.jscomp.Region region12 = compiler0.getSourceRegion("java.io.IOException: java.io.IOException: java.io.IOException: ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNull(region12);
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = com.google.javascript.jscomp.SourceFile.builder();
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder2 = builder0.withCharset(charset1);
        com.google.javascript.jscomp.SourceFile sourceFile5 = builder0.buildFromCode("Unversioned directory", "Unversioned directory");
        int int7 = sourceFile5.getLineOfOffset((int) (short) -1);
        java.lang.String str8 = sourceFile5.toString();
        java.lang.String str9 = sourceFile5.getOriginalPath();
        sourceFile5.clearCachedSource();
        sourceFile5.clearCachedSource();
        java.io.Reader reader12 = sourceFile5.getCodeReader();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Unversioned directory" + "'", str8, "Unversioned directory");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Unversioned directory" + "'", str9, "Unversioned directory");
        org.junit.Assert.assertNotNull(reader12);
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.exportTestFunctions;
        compilerOptions0.lineBreak = false;
        compilerOptions0.resetWarningsGuard();
        compilerOptions0.setDefineToNumberLiteral("-1", 35);
        boolean boolean10 = compilerOptions0.reserveRawExports;
        boolean boolean11 = compilerOptions0.moveFunctionDeclarations;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream8 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray9 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList10 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList10, locationMappingArray9);
        com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "java.io.IOException: ");
        boolean boolean15 = locationMappingList10.remove((java.lang.Object) "hi!");
        boolean boolean16 = locationMappingList10.isEmpty();
        printStream8.println((java.lang.Object) boolean16);
        printStream8.close();
        printStream8.println((float) (short) 1);
        java.io.PrintStream printStream22 = printStream8.append('#');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(locationMappingArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sourceFile14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(printStream22);
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.removeUnusedVars = true;
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap6 = compilerOptions0.getDefineReplacements();
        com.google.javascript.jscomp.MessageBundle messageBundle7 = compilerOptions0.messageBundle;
        compilerOptions0.labelRenaming = false;
        com.google.javascript.jscomp.CheckLevel checkLevel10 = compilerOptions0.checkGlobalNamesLevel;
        boolean boolean11 = compilerOptions0.aliasKeywords;
        java.lang.String str12 = compilerOptions0.renamePrefix;
        java.util.Set<java.lang.String> strSet13 = compilerOptions0.aliasableStrings;
        com.google.javascript.jscomp.MessageBundle messageBundle14 = null;
        compilerOptions0.messageBundle = messageBundle14;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(messageBundle7);
        org.junit.Assert.assertTrue("'" + checkLevel10 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel10.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap5 = null;
        compilerOptions0.setCssRenamingMap(cssRenamingMap5);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.reportMissingOverride;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.setLabelRenaming(true);
        com.google.javascript.jscomp.CheckLevel checkLevel11 = compilerOptions8.checkProvides;
        com.google.javascript.jscomp.CheckLevel checkLevel12 = compilerOptions8.reportMissingOverride;
        compilerOptions0.checkMissingGetCssNameLevel = checkLevel12;
        compilerOptions0.setCollapsePropertiesOnExternTypes(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions16.setRewriteNewDateGoogNow(true);
        boolean boolean19 = compilerOptions16.extractPrototypeMemberDeclarations;
        compilerOptions16.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel22 = compilerOptions16.checkGlobalThisLevel;
        compilerOptions16.setDevirtualizePrototypeMethods(true);
        com.google.javascript.jscomp.MessageBundle messageBundle25 = null;
        compilerOptions16.setMessageBundle(messageBundle25);
        boolean boolean27 = compilerOptions16.recordFunctionInformation;
        boolean boolean28 = compilerOptions16.moveFunctionDeclarations;
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions29.setRewriteNewDateGoogNow(true);
        boolean boolean32 = compilerOptions29.extractPrototypeMemberDeclarations;
        boolean boolean33 = compilerOptions29.jqueryPass;
        compilerOptions29.collapseAnonymousFunctions = false;
        boolean boolean36 = compilerOptions29.checkTypes;
        compilerOptions29.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CheckLevel checkLevel39 = compilerOptions29.checkProvides;
        compilerOptions16.setCheckGlobalNamesLevel(checkLevel39);
        com.google.javascript.jscomp.CompilerOptions compilerOptions41 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet42 = compilerOptions41.stripNamePrefixes;
        byte[] byteArray43 = compilerOptions41.inputVariableMapSerialized;
        boolean boolean44 = compilerOptions41.exportTestFunctions;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode45 = com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
        compilerOptions41.setLanguageIn(languageMode45);
        compilerOptions41.setNameAnonymousFunctionsOnly(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions49.setRewriteNewDateGoogNow(true);
        boolean boolean52 = compilerOptions49.extractPrototypeMemberDeclarations;
        compilerOptions49.setCollapseProperties(false);
        compilerOptions49.setClosurePass(true);
        byte[] byteArray62 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions49.setInputPropertyMapSerialized(byteArray62);
        compilerOptions49.setAliasAllStrings(false);
        com.google.javascript.jscomp.CheckLevel checkLevel66 = compilerOptions49.reportMissingOverride;
        compilerOptions41.setCheckGlobalNamesLevel(checkLevel66);
        compilerOptions16.checkMissingGetCssNameLevel = checkLevel66;
        compilerOptions0.checkUnreachableCode = checkLevel66;
        compilerOptions0.setAliasExternals(false);
        compilerOptions0.closurePass = true;
        boolean boolean74 = compilerOptions0.optimizeReturns;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel11 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel11.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + checkLevel22 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel22.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + checkLevel39 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel39.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNull(byteArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + languageMode45 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT + "'", languageMode45.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + checkLevel66 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel66.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        boolean boolean5 = compilerOptions0.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setLabelRenaming(true);
        compilerOptions6.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean11 = compilerOptions6.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format12 = compilerOptions6.sourceMapFormat;
        compilerOptions0.setSourceMapFormat(format12);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setRewriteNewDateGoogNow(true);
        boolean boolean17 = compilerOptions14.extractPrototypeMemberDeclarations;
        compilerOptions14.setCollapseProperties(false);
        compilerOptions14.setClosurePass(true);
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions14.setInputPropertyMapSerialized(byteArray27);
        compilerOptions14.setFlowSensitiveInlineVariables(true);
        boolean boolean31 = compilerOptions14.exportTestFunctions;
        compilerOptions14.closurePass = false;
        com.google.javascript.jscomp.ErrorFormat errorFormat34 = compilerOptions14.errorFormat;
        compilerOptions0.setErrorFormat(errorFormat34);
        compilerOptions0.aliasStringsBlacklist = "java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        com.google.javascript.jscomp.SourceMap.Format format38 = compilerOptions0.sourceMapFormat;
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet40 = compilerOptions39.stripNamePrefixes;
        byte[] byteArray41 = compilerOptions39.inputVariableMapSerialized;
        compilerOptions39.checkSymbols = false;
        compilerOptions39.setOutputJsStringUsage(false);
        com.google.javascript.jscomp.SourceMap.Format format46 = compilerOptions39.sourceMapFormat;
        compilerOptions0.sourceMapFormat = format46;
        boolean boolean48 = compilerOptions0.checkSuspiciousCode;
        boolean boolean49 = compilerOptions0.getInferTypes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(format12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(errorFormat34);
        org.junit.Assert.assertNotNull(format38);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNull(byteArray41);
        org.junit.Assert.assertNotNull(format46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.gatherCssNames;
        com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard9 = null;
        compilerOptions0.setWarningsGuard(composeWarningsGuard9);
        compilerOptions0.setPreferLineBreakAtEndOfFile(true);
        compilerOptions0.coalesceVariableNames = false;
        boolean boolean15 = compilerOptions0.crossModuleMethodMotion;
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions16.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention19 = null;
        compilerOptions16.setCodingConvention(codingConvention19);
        compilerOptions16.setPropertyAffinity(true);
        boolean boolean23 = compilerOptions16.closurePass;
        compilerOptions16.setCheckCaja(true);
        compilerOptions16.closurePass = true;
        java.util.Set<java.lang.String> strSet28 = compilerOptions16.stripTypes;
        compilerOptions0.setStripTypes(strSet28);
        compilerOptions0.foldConstants = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream8 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        java.io.PrintStream printStream10 = new java.io.PrintStream("Unversioned directory");
        char[] charArray13 = new char[] { '4', '4' };
        printStream10.print(charArray13);
        printStream1.println(charArray13);
        java.util.Locale locale16 = null;
        java.io.PrintStream printStream19 = new java.io.PrintStream("Unversioned directory");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup21;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = com.google.javascript.jscomp.DiagnosticGroups.TWEAKS;
        com.google.javascript.jscomp.SourceFile.Builder builder24 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator26 = null;
        com.google.javascript.jscomp.SourceFile sourceFile27 = builder24.buildFromGenerator("hi!", generator26);
        java.lang.Object[] objArray28 = new java.lang.Object[] { diagnosticGroup21, diagnosticGroup23, sourceFile27 };
        java.io.PrintStream printStream29 = printStream19.printf("2019/07/12 07:12", objArray28);
        java.io.PrintStream printStream32 = new java.io.PrintStream("Unversioned directory");
        char[] charArray35 = new char[] { '4', '4' };
        printStream32.print(charArray35);
        printStream32.print((int) ' ');
        java.io.PrintStream printStream40 = new java.io.PrintStream((java.io.OutputStream) printStream32, false);
        printStream32.write((int) '#');
        java.util.Locale locale43 = null;
        java.lang.Object[] objArray46 = new java.lang.Object[] { "Unversioned directory" };
        java.io.PrintStream printStream47 = printStream32.format(locale43, "Unversioned directory", objArray46);
        java.io.PrintStream printStream48 = printStream29.format("hi!", objArray46);
        java.io.PrintStream printStream49 = printStream1.printf(locale16, "java.io.IOException: ", objArray46);
        printStream49.print("java.io.IOException");
        printStream49.println((long) (short) 0);
        printStream49.print(100);
        printStream49.flush();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4]");
// flaky:         org.junit.Assert.assertNull(diagnosticGroup21);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup23);
        org.junit.Assert.assertNotNull(sourceFile27);
        org.junit.Assert.assertNotNull(objArray28);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[null, null, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[null, null, hi!]");
        org.junit.Assert.assertNotNull(printStream29);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[Unversioned directory]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[Unversioned directory]");
        org.junit.Assert.assertNotNull(printStream47);
        org.junit.Assert.assertNotNull(printStream48);
        org.junit.Assert.assertNotNull(printStream49);
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        compilerOptions0.setDefineToDoubleLiteral("java.io.IOException: ", (double) 0L);
        boolean boolean11 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap12 = compilerOptions0.customPasses;
        compilerOptions0.setInlineLocalVariables(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet17 = compilerOptions16.stripNamePrefixes;
        byte[] byteArray18 = compilerOptions16.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup19 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup19;
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions21.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention24 = null;
        compilerOptions21.setCodingConvention(codingConvention24);
        compilerOptions21.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel28 = compilerOptions21.checkProvides;
        compilerOptions16.setWarningLevel(diagnosticGroup19, checkLevel28);
        java.util.Set<java.lang.String> strSet30 = compilerOptions16.stripNamePrefixes;
        boolean boolean31 = compilerOptions16.extractPrototypeMemberDeclarations;
        boolean boolean32 = compilerOptions16.removeUnusedClassProperties;
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions33.setRewriteNewDateGoogNow(true);
        boolean boolean36 = compilerOptions33.extractPrototypeMemberDeclarations;
        boolean boolean37 = compilerOptions33.jqueryPass;
        compilerOptions33.setRemoveUnusedClassProperties(true);
        boolean boolean40 = compilerOptions33.convertToDottedProperties;
        compilerOptions33.printInputDelimiter = true;
        com.google.javascript.jscomp.CompilerOptions.Reach reach43 = com.google.javascript.jscomp.CompilerOptions.Reach.LOCAL_ONLY;
        compilerOptions33.setRemoveUnusedVariables(reach43);
        compilerOptions16.setInlineVariables(reach43);
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions47.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention50 = null;
        compilerOptions47.setCodingConvention(codingConvention50);
        compilerOptions47.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet55 = compilerOptions54.stripNamePrefixes;
        compilerOptions47.setIdGenerators(strSet55);
        java.lang.String[] strArray61 = new java.lang.String[] { "java.io.IOException: java.io.IOException: 2019/07/12 07:12", "java.io.IOException: Unversioned directory", "java.io.IOException: Unversioned directory", "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        compilerOptions47.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList62);
        compilerOptions16.setReplaceStringsConfiguration("java.io.IOException", (java.util.List<java.lang.String>) strList62);
        compilerOptions0.setReplaceStringsConfiguration("4432#Unversionedhi!rector true\n0\n", (java.util.List<java.lang.String>) strList62);
        com.google.javascript.jscomp.CheckLevel checkLevel67 = compilerOptions0.checkMissingReturn;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(customPassExecutionTimeMultimap12);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(byteArray18);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup19);
        org.junit.Assert.assertTrue("'" + checkLevel28 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel28.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + reach43 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.LOCAL_ONLY + "'", reach43.equals(com.google.javascript.jscomp.CompilerOptions.Reach.LOCAL_ONLY));
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + checkLevel67 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel67.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions0.setInputPropertyMapSerialized(byteArray13);
        compilerOptions0.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        boolean boolean20 = compilerOptions17.extractPrototypeMemberDeclarations;
        compilerOptions17.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet23 = compilerOptions17.stripTypePrefixes;
        compilerOptions0.aliasableStrings = strSet23;
        compilerOptions0.setRemoveUnusedVars(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        boolean boolean30 = compilerOptions27.extractPrototypeMemberDeclarations;
        boolean boolean31 = compilerOptions27.jqueryPass;
        compilerOptions27.collapseAnonymousFunctions = false;
        boolean boolean34 = compilerOptions27.checkTypes;
        compilerOptions27.setRemoveTryCatchFinally(false);
        java.lang.String str37 = compilerOptions27.syntheticBlockEndMarker;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode38 = compilerOptions27.getLanguageIn();
        compilerOptions0.setLanguageOut(languageMode38);
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions40.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention43 = null;
        compilerOptions40.setCodingConvention(codingConvention43);
        compilerOptions40.setGenerateExports(true);
        compilerOptions40.setCollapseProperties(false);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup49 = com.google.javascript.jscomp.DiagnosticGroups.TWEAKS;
        com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK = diagnosticGroup49;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES = diagnosticGroup49;
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions52.setRewriteNewDateGoogNow(true);
        boolean boolean55 = compilerOptions52.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach56 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions52.setInlineVariables(reach56);
        compilerOptions52.setPrintInputDelimiter(true);
        boolean boolean60 = compilerOptions52.closurePass;
        boolean boolean61 = compilerOptions52.shouldColorizeErrorOutput();
        com.google.javascript.jscomp.CheckLevel checkLevel62 = compilerOptions52.checkMissingGetCssNameLevel;
        compilerOptions40.setWarningLevel(diagnosticGroup49, checkLevel62);
        compilerOptions0.setCheckUnreachableCode(checkLevel62);
        boolean boolean65 = compilerOptions0.removeTryCatchFinally;
        compilerOptions0.setIgnoreCajaProperties(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + languageMode38 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode38.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
// flaky:         org.junit.Assert.assertNull(diagnosticGroup49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + reach56 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach56.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + checkLevel62 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel62.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        compilerOptions0.aliasAllStrings = false;
        boolean boolean9 = compilerOptions0.smartNameRemoval;
        compilerOptions0.gatherCssNames = true;
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap12 = null;
        compilerOptions0.setCustomPasses(customPassExecutionTimeMultimap12);
        byte[] byteArray14 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.setFoldConstants(false);
        boolean boolean17 = compilerOptions0.convertToDottedProperties;
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions18.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention21 = null;
        compilerOptions18.setCodingConvention(codingConvention21);
        compilerOptions18.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel25 = compilerOptions18.checkProvides;
        java.lang.String[] strArray27 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        compilerOptions18.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList28);
        compilerOptions18.setDeadAssignmentElimination(false);
        java.io.PrintStream printStream34 = new java.io.PrintStream("Unversioned directory");
        char[] charArray37 = new char[] { '4', '4' };
        printStream34.print(charArray37);
        printStream34.print((int) ' ');
        java.io.PrintStream printStream42 = new java.io.PrintStream((java.io.OutputStream) printStream34, false);
        printStream34.write((int) '#');
        printStream34.print((float) (short) 0);
        java.io.PrintStream printStream48 = new java.io.PrintStream("Unversioned directory");
        char[] charArray51 = new char[] { '4', '4' };
        printStream48.print(charArray51);
        printStream48.print((int) ' ');
        byte[] byteArray61 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream48.write(byteArray61, (int) (byte) 0, (int) (byte) 1);
        printStream34.write(byteArray61);
        compilerOptions18.setInputVariableMapSerialized(byteArray61);
        compilerOptions0.setInputVariableMapSerialized(byteArray61);
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(false);
        compilerOptions0.generateExports = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + checkLevel25 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel25.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[4, 4]");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[100, -1, 10, 100, 100, 100]");
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean5 = compilerOptions0.labelRenaming;
        compilerOptions0.ambiguateProperties = false;
        boolean boolean8 = compilerOptions0.shouldColorizeErrorOutput();
        compilerOptions0.crossModuleCodeMotion = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions11.setRewriteNewDateGoogNow(true);
        boolean boolean14 = compilerOptions11.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach15 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions11.setInlineVariables(reach15);
        boolean boolean17 = compilerOptions11.removeUnusedVars;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap18 = null;
        compilerOptions11.cssRenamingMap = cssRenamingMap18;
        boolean boolean20 = compilerOptions11.assumeClosuresOnlyCaptureReferences();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions21.setRewriteNewDateGoogNow(true);
        boolean boolean24 = compilerOptions21.extractPrototypeMemberDeclarations;
        compilerOptions21.setCollapseProperties(false);
        compilerOptions21.setClosurePass(true);
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions21.setInputPropertyMapSerialized(byteArray34);
        compilerOptions21.setFlowSensitiveInlineVariables(true);
        boolean boolean38 = compilerOptions21.exportTestFunctions;
        compilerOptions21.closurePass = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions41 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions41.setRewriteNewDateGoogNow(true);
        boolean boolean44 = compilerOptions41.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach45 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions41.setInlineVariables(reach45);
        compilerOptions41.setPrintInputDelimiter(true);
        boolean boolean49 = compilerOptions41.closurePass;
        boolean boolean50 = compilerOptions41.shouldColorizeErrorOutput();
        com.google.javascript.jscomp.CheckLevel checkLevel51 = compilerOptions41.checkMissingGetCssNameLevel;
        compilerOptions21.setCheckMissingGetCssNameLevel(checkLevel51);
        compilerOptions11.checkGlobalNamesLevel = checkLevel51;
        compilerOptions0.setReportUnknownTypes(checkLevel51);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + reach15 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach15.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + reach45 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach45.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + checkLevel51 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel51.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel6 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.setIgnoreCajaProperties(false);
        compilerOptions0.removeUnusedClassProperties = true;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler11 = compilerOptions0.getAliasTransformationHandler();
        com.google.javascript.jscomp.CheckLevel checkLevel12 = compilerOptions0.aggressiveVarCheck;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel6 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel6.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(aliasTransformationHandler11);
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.computeFunctionSideEffects;
        boolean boolean6 = compilerOptions0.printInputDelimiter;
        compilerOptions0.syntheticBlockEndMarker = "java.io.IOException";
        compilerOptions0.setPrettyPrint(false);
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler11 = compilerOptions0.getAliasTransformationHandler();
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        boolean boolean15 = compilerOptions12.extractPrototypeMemberDeclarations;
        boolean boolean16 = compilerOptions12.assumeClosuresOnlyCaptureReferences();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap17 = null;
        compilerOptions12.setCssRenamingMap(cssRenamingMap17);
        byte[] byteArray19 = compilerOptions12.inputVariableMapSerialized;
        compilerOptions12.setChainCalls(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions22.setRewriteNewDateGoogNow(true);
        boolean boolean25 = compilerOptions22.extractPrototypeMemberDeclarations;
        compilerOptions22.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel28 = compilerOptions22.checkGlobalThisLevel;
        compilerOptions22.setDevirtualizePrototypeMethods(true);
        com.google.javascript.jscomp.CheckLevel checkLevel31 = compilerOptions22.checkMissingGetCssNameLevel;
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet33 = compilerOptions32.stripNamePrefixes;
        byte[] byteArray34 = compilerOptions32.inputVariableMapSerialized;
        boolean boolean35 = compilerOptions32.exportTestFunctions;
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions36.setLabelRenaming(true);
        compilerOptions36.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CheckLevel checkLevel41 = compilerOptions36.checkGlobalThisLevel;
        compilerOptions32.setCheckGlobalNamesLevel(checkLevel41);
        compilerOptions22.setCheckMissingGetCssNameLevel(checkLevel41);
        compilerOptions22.setCheckTypes(true);
        compilerOptions22.setFoldConstants(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet49 = compilerOptions48.stripNamePrefixes;
        byte[] byteArray50 = compilerOptions48.inputVariableMapSerialized;
        compilerOptions48.removeUnusedClassProperties = true;
        com.google.javascript.jscomp.ErrorFormat errorFormat53 = compilerOptions48.errorFormat;
        compilerOptions22.setErrorFormat(errorFormat53);
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions55.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention58 = null;
        compilerOptions55.setCodingConvention(codingConvention58);
        boolean boolean60 = compilerOptions55.generateExports;
        compilerOptions55.gatherCssNames = false;
        boolean boolean63 = compilerOptions55.optimizeReturns;
        compilerOptions55.smartNameRemoval = true;
        compilerOptions55.removeUnusedPrototypePropertiesInExterns = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions68.setLabelRenaming(true);
        compilerOptions68.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy73 = compilerOptions68.anonymousFunctionNaming;
        compilerOptions55.setAnonymousFunctionNaming(anonymousFunctionNamingPolicy73);
        compilerOptions22.anonymousFunctionNaming = anonymousFunctionNamingPolicy73;
        compilerOptions12.setAnonymousFunctionNaming(anonymousFunctionNamingPolicy73);
        compilerOptions0.anonymousFunctionNaming = anonymousFunctionNamingPolicy73;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(aliasTransformationHandler11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(byteArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + checkLevel28 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel28.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel31 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel31.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNull(byteArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + checkLevel41 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel41.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNull(byteArray50);
        org.junit.Assert.assertNotNull(errorFormat53);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy73 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy73.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.collapseAnonymousFunctions = false;
        compilerOptions0.setManageClosureDependencies(true);
        compilerOptions0.setMarkAsCompiled(true);
        compilerOptions0.setAliasableGlobals("java.io.IOException: ");
        com.google.javascript.jscomp.CheckLevel checkLevel13 = null;
        compilerOptions0.setBrokenClosureRequiresLevel(checkLevel13);
        boolean boolean15 = compilerOptions0.checkTypes;
        compilerOptions0.crossModuleMethodMotion = false;
        compilerOptions0.setLooseTypes(true);
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode20 = compilerOptions0.getLanguageIn();
        compilerOptions0.setClosurePass(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.enableExternExports(true);
        compilerOptions23.setCrossModuleCodeMotion(false);
        java.util.Set<java.lang.String> strSet28 = compilerOptions23.stripNamePrefixes;
        compilerOptions23.setCheckControlStructures(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions31.setLabelRenaming(true);
        compilerOptions31.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CheckLevel checkLevel36 = compilerOptions31.checkGlobalThisLevel;
        compilerOptions31.setExportTestFunctions(false);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing39 = compilerOptions31.getTweakProcessing();
        compilerOptions23.setTweakProcessing(tweakProcessing39);
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy41 = compilerOptions23.anonymousFunctionNaming;
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = null;
        compilerOptions23.setTweakReplacements(strMap42);
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions44.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention47 = null;
        compilerOptions44.setCodingConvention(codingConvention47);
        boolean boolean49 = compilerOptions44.computeFunctionSideEffects;
        boolean boolean50 = compilerOptions44.printInputDelimiter;
        compilerOptions44.syntheticBlockEndMarker = "java.io.IOException";
        compilerOptions44.enableRuntimeTypeCheck("java.io.IOException: ");
        compilerOptions44.setRemoveUnusedPrototypePropertiesInExterns(true);
        byte[] byteArray59 = new byte[] { (byte) 0, (byte) 10 };
        compilerOptions44.setInputPropertyMapSerialized(byteArray59);
        compilerOptions23.inputVariableMapSerialized = byteArray59;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode62 = compilerOptions23.getLanguageIn();
        compilerOptions0.setLanguageIn(languageMode62);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + languageMode20 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode20.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertTrue("'" + checkLevel36 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel36.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + tweakProcessing39 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing39.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy41 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy41.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[0, 10]");
        org.junit.Assert.assertTrue("'" + languageMode62 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode62.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode5 = compilerOptions0.getTracerMode();
        compilerOptions0.lineBreak = false;
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(false);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setInlineProperties(true);
        compilerOptions0.inlineGetters = true;
        compilerOptions0.setRuntimeTypeCheckLogFunction("java.io.IOException");
        java.util.Map<java.lang.String, com.google.javascript.jscomp.CheckLevel> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.setPropertyInvalidationErrors(strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tracerMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode5.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        com.google.javascript.jscomp.CompilerOptions.Reach reach3 = com.google.javascript.jscomp.CompilerOptions.Reach.NONE;
        compilerOptions0.setInlineFunctions(reach3);
        compilerOptions0.setCollapsePropertiesOnExternTypes(false);
        compilerOptions0.gatherCssNames = false;
        boolean boolean9 = compilerOptions0.foldConstants;
        compilerOptions0.devirtualizePrototypeMethods = true;
        compilerOptions0.setLooseTypes(false);
        compilerOptions0.setComputeFunctionSideEffects(true);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + reach3 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.NONE + "'", reach3.equals(com.google.javascript.jscomp.CompilerOptions.Reach.NONE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions0.setInputPropertyMapSerialized(byteArray13);
        compilerOptions0.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.MessageBundle messageBundle17 = null;
        compilerOptions0.messageBundle = messageBundle17;
        boolean boolean19 = compilerOptions0.generatePseudoNames;
        compilerOptions0.checkTypes = true;
        compilerOptions0.setChainCalls(false);
        compilerOptions0.deadAssignmentElimination = true;
        compilerOptions0.setRemoveUnusedVars(false);
        com.google.javascript.jscomp.WarningsGuard warningsGuard28 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.addWarningsGuard(warningsGuard28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        com.google.javascript.jscomp.CheckLevel checkLevel3 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.CheckLevel checkLevel4 = compilerOptions0.reportMissingOverride;
        compilerOptions0.checkControlStructures = true;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = null;
        compilerOptions0.setCssRenamingMap(cssRenamingMap7);
        compilerOptions0.inputDelimiter = "java.io.IOException: Unversioned directory";
        boolean boolean11 = compilerOptions0.computeFunctionSideEffects;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray12 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList13 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList13, locationMappingArray12);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions15.setRewriteNewDateGoogNow(true);
        boolean boolean18 = compilerOptions15.extractPrototypeMemberDeclarations;
        compilerOptions15.convertToDottedProperties = true;
        boolean boolean21 = compilerOptions15.inlineConstantVars;
        boolean boolean22 = compilerOptions15.extractPrototypeMemberDeclarations;
        boolean boolean23 = compilerOptions15.reserveRawExports;
        boolean boolean24 = locationMappingList13.remove((java.lang.Object) boolean23);
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions25.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention28 = null;
        compilerOptions25.setCodingConvention(codingConvention28);
        compilerOptions25.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet33 = compilerOptions32.stripNamePrefixes;
        compilerOptions25.setIdGenerators(strSet33);
        java.util.stream.Stream<java.lang.String> strStream35 = strSet33.stream();
        boolean boolean36 = locationMappingList13.retainAll((java.util.Collection<java.lang.String>) strSet33);
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions37.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention40 = null;
        compilerOptions37.setCodingConvention(codingConvention40);
        compilerOptions37.setGenerateExports(true);
        compilerOptions37.setCollapseProperties(false);
        boolean boolean46 = compilerOptions37.inlineVariables;
        com.google.javascript.jscomp.CheckLevel checkLevel47 = compilerOptions37.aggressiveVarCheck;
        compilerOptions37.setCheckSymbols(true);
        boolean boolean50 = compilerOptions37.devirtualizePrototypeMethods;
        boolean boolean51 = locationMappingList13.equals((java.lang.Object) compilerOptions37);
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet53 = compilerOptions52.stripNamePrefixes;
        com.google.javascript.jscomp.MessageBundle messageBundle54 = null;
        compilerOptions52.messageBundle = messageBundle54;
        compilerOptions52.setUnaliasableGlobals("Unversioned directory");
        boolean boolean58 = compilerOptions52.markNoSideEffectCalls;
        boolean boolean59 = compilerOptions52.assumeClosuresOnlyCaptureReferences();
        compilerOptions52.ambiguateProperties = true;
        java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList62 = compilerOptions52.sourceMapLocationMappings;
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions63.setRewriteNewDateGoogNow(true);
        boolean boolean66 = compilerOptions63.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach67 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions63.setInlineVariables(reach67);
        boolean boolean69 = compilerOptions63.removeUnusedVars;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap70 = null;
        compilerOptions63.cssRenamingMap = cssRenamingMap70;
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing72 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF;
        compilerOptions63.setTweakProcessing(tweakProcessing72);
        compilerOptions63.setDefineToNumberLiteral("java.io.IOException: ", (int) (short) 10);
        compilerOptions63.renamePrefixNamespace = "java.io.IOException: ";
        java.util.Set<java.lang.String> strSet79 = compilerOptions63.aliasableStrings;
        compilerOptions52.setStripTypePrefixes(strSet79);
        boolean boolean81 = locationMappingList13.retainAll((java.util.Collection<java.lang.String>) strSet79);
        compilerOptions0.setIdGenerators(strSet79);
        org.junit.Assert.assertTrue("'" + checkLevel3 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel3.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel4 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel4.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(locationMappingArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(strStream35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + checkLevel47 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel47.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(locationMappingList62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + reach67 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach67.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + tweakProcessing72 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing72.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet4 = compilerOptions3.stripNamePrefixes;
        byte[] byteArray5 = compilerOptions3.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup6;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention11 = null;
        compilerOptions8.setCodingConvention(codingConvention11);
        compilerOptions8.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel15 = compilerOptions8.checkProvides;
        compilerOptions3.setWarningLevel(diagnosticGroup6, checkLevel15);
        compilerOptions0.setAggressiveVarCheck(checkLevel15);
        compilerOptions0.setRenamePrefix("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        compilerOptions0.computeFunctionSideEffects = true;
        boolean boolean22 = compilerOptions0.generatePseudoNames;
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention26 = null;
        compilerOptions23.setCodingConvention(codingConvention26);
        boolean boolean28 = compilerOptions23.generateExports;
        compilerOptions23.gatherCssNames = false;
        boolean boolean31 = compilerOptions23.optimizeReturns;
        compilerOptions23.smartNameRemoval = true;
        boolean boolean34 = compilerOptions23.lineBreak;
        compilerOptions23.setDebugFunctionSideEffectsPath("hi!");
        java.util.Set<java.lang.String> strSet37 = compilerOptions23.stripNamePrefixes;
        compilerOptions0.setIdGenerators(strSet37);
        boolean boolean39 = compilerOptions0.reserveRawExports;
        compilerOptions0.preferLineBreakAtEndOfFile = false;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(byteArray5);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup6);
        org.junit.Assert.assertTrue("'" + checkLevel15 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel15.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.collapseAnonymousFunctions = false;
        boolean boolean7 = compilerOptions0.checkTypes;
        java.lang.String str8 = compilerOptions0.aliasStringsBlacklist;
        compilerOptions0.setCollapseVariableDeclarations(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGeneratePseudoNames(true);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setIdeMode(true);
        compilerOptions0.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setRewriteNewDateGoogNow(true);
        boolean boolean16 = compilerOptions13.extractPrototypeMemberDeclarations;
        compilerOptions13.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel19 = compilerOptions13.checkGlobalThisLevel;
        compilerOptions0.checkMissingReturn = checkLevel19;
        compilerOptions0.setMarkAsCompiled(false);
        compilerOptions0.setNameReferenceReportPath("java.io.IOException: ");
        compilerOptions0.resetWarningsGuard();
        boolean boolean26 = compilerOptions0.gatherCssNames;
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet8 = compilerOptions7.stripNamePrefixes;
        compilerOptions0.setIdGenerators(strSet8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = null;
        compilerOptions10.setCodingConvention(codingConvention13);
        compilerOptions10.setGeneratePseudoNames(true);
        compilerOptions10.inlineLocalFunctions = false;
        compilerOptions10.setIdeMode(true);
        compilerOptions10.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.setRewriteNewDateGoogNow(true);
        boolean boolean26 = compilerOptions23.extractPrototypeMemberDeclarations;
        compilerOptions23.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel29 = compilerOptions23.checkGlobalThisLevel;
        compilerOptions10.checkMissingReturn = checkLevel29;
        compilerOptions0.aggressiveVarCheck = checkLevel29;
        com.google.javascript.jscomp.CheckLevel checkLevel32 = compilerOptions0.reportMissingOverride;
        boolean boolean33 = compilerOptions0.removeUnusedPrototypePropertiesInExterns;
        compilerOptions0.aliasAllStrings = true;
        compilerOptions0.coalesceVariableNames = false;
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + checkLevel29 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel29.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel32 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel32.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel6 = compilerOptions0.checkGlobalThisLevel;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel7 = null;
        compilerOptions0.sourceMapDetailLevel = detailLevel7;
        compilerOptions0.inputDelimiter = "4432#Unversionedhi!rector true\n0\n";
        boolean boolean11 = compilerOptions0.removeUnusedPrototypePropertiesInExterns;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel6 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel6.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        compilerOptions0.aliasAllStrings = false;
        boolean boolean9 = compilerOptions0.smartNameRemoval;
        compilerOptions0.collapseAnonymousFunctions = false;
        boolean boolean12 = compilerOptions0.removeUnusedPrototypePropertiesInExterns;
        compilerOptions0.checkMissingGetCssNameBlacklist = "java.io.IOException: -1";
        compilerOptions0.setPreferLineBreakAtEndOfFile(false);
        compilerOptions0.setGeneratePseudoNames(false);
        compilerOptions0.generateExports = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet8 = compilerOptions7.stripNamePrefixes;
        compilerOptions0.setIdGenerators(strSet8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = null;
        compilerOptions10.setCodingConvention(codingConvention13);
        compilerOptions10.setGeneratePseudoNames(true);
        compilerOptions10.inlineLocalFunctions = false;
        compilerOptions10.setIdeMode(true);
        compilerOptions10.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.setRewriteNewDateGoogNow(true);
        boolean boolean26 = compilerOptions23.extractPrototypeMemberDeclarations;
        compilerOptions23.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel29 = compilerOptions23.checkGlobalThisLevel;
        compilerOptions10.checkMissingReturn = checkLevel29;
        compilerOptions0.aggressiveVarCheck = checkLevel29;
        compilerOptions0.setCheckSuspiciousCode(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions34.setRewriteNewDateGoogNow(true);
        boolean boolean37 = compilerOptions34.extractPrototypeMemberDeclarations;
        compilerOptions34.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel40 = compilerOptions34.checkGlobalThisLevel;
        compilerOptions34.setDevirtualizePrototypeMethods(true);
        com.google.javascript.jscomp.MessageBundle messageBundle43 = null;
        compilerOptions34.setMessageBundle(messageBundle43);
        boolean boolean45 = compilerOptions34.recordFunctionInformation;
        boolean boolean46 = compilerOptions34.moveFunctionDeclarations;
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions47.setRewriteNewDateGoogNow(true);
        boolean boolean50 = compilerOptions47.extractPrototypeMemberDeclarations;
        compilerOptions47.setCollapseProperties(false);
        compilerOptions47.setClosurePass(true);
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions47.setInputPropertyMapSerialized(byteArray60);
        compilerOptions47.setAliasAllStrings(false);
        com.google.javascript.jscomp.CheckLevel checkLevel64 = compilerOptions47.reportMissingOverride;
        compilerOptions47.removeUnusedLocalVars = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions67 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet68 = compilerOptions67.stripNamePrefixes;
        byte[] byteArray69 = compilerOptions67.inputVariableMapSerialized;
        compilerOptions67.checkSymbols = false;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap72 = null;
        compilerOptions67.setCssRenamingMap(cssRenamingMap72);
        com.google.javascript.jscomp.CompilerOptions compilerOptions74 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions74.setRewriteNewDateGoogNow(true);
        boolean boolean77 = compilerOptions74.extractPrototypeMemberDeclarations;
        compilerOptions74.convertToDottedProperties = true;
        boolean boolean80 = compilerOptions74.inlineConstantVars;
        compilerOptions74.aliasAllStrings = false;
        boolean boolean83 = compilerOptions74.smartNameRemoval;
        compilerOptions74.gatherCssNames = true;
        com.google.javascript.jscomp.CheckLevel checkLevel86 = compilerOptions74.checkGlobalNamesLevel;
        compilerOptions67.setCheckProvides(checkLevel86);
        compilerOptions47.setCheckGlobalNamesLevel(checkLevel86);
        compilerOptions34.checkMissingGetCssNameLevel = checkLevel86;
        compilerOptions34.setIgnoreCajaProperties(true);
        com.google.javascript.jscomp.CheckLevel checkLevel92 = compilerOptions34.aggressiveVarCheck;
        compilerOptions0.setCheckProvides(checkLevel92);
        boolean boolean94 = compilerOptions0.closurePass;
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + checkLevel29 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel29.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + checkLevel40 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel40.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + checkLevel64 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel64.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNull(byteArray69);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + checkLevel86 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel86.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel92 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel92.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions0.setInputPropertyMapSerialized(byteArray13);
        compilerOptions0.setAliasAllStrings(false);
        com.google.javascript.jscomp.CheckLevel checkLevel17 = compilerOptions0.reportMissingOverride;
        compilerOptions0.removeUnusedLocalVars = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet21 = compilerOptions20.stripNamePrefixes;
        byte[] byteArray22 = compilerOptions20.inputVariableMapSerialized;
        compilerOptions20.checkSymbols = false;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap25 = null;
        compilerOptions20.setCssRenamingMap(cssRenamingMap25);
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        boolean boolean30 = compilerOptions27.extractPrototypeMemberDeclarations;
        compilerOptions27.convertToDottedProperties = true;
        boolean boolean33 = compilerOptions27.inlineConstantVars;
        compilerOptions27.aliasAllStrings = false;
        boolean boolean36 = compilerOptions27.smartNameRemoval;
        compilerOptions27.gatherCssNames = true;
        com.google.javascript.jscomp.CheckLevel checkLevel39 = compilerOptions27.checkGlobalNamesLevel;
        compilerOptions20.setCheckProvides(checkLevel39);
        compilerOptions0.setCheckGlobalNamesLevel(checkLevel39);
        boolean boolean42 = compilerOptions0.optimizeReturns;
        compilerOptions0.setRemoveUnusedVars(false);
        compilerOptions0.convertToDottedProperties = true;
        compilerOptions0.setInlineVariables(false);
        compilerOptions0.setPrettyPrint(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + checkLevel17 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel17.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + checkLevel39 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel39.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        com.google.javascript.jscomp.CheckLevel checkLevel3 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.CheckLevel checkLevel4 = compilerOptions0.reportMissingOverride;
        boolean boolean5 = compilerOptions0.collapseAnonymousFunctions;
        com.google.javascript.jscomp.CheckLevel checkLevel6 = compilerOptions0.checkMissingReturn;
        org.junit.Assert.assertTrue("'" + checkLevel3 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel3.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel4 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel4.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + checkLevel6 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel6.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean5 = compilerOptions0.labelRenaming;
        compilerOptions0.ambiguateProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet9 = compilerOptions8.stripNamePrefixes;
        byte[] byteArray10 = compilerOptions8.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup11;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention16 = null;
        compilerOptions13.setCodingConvention(codingConvention16);
        compilerOptions13.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel20 = compilerOptions13.checkProvides;
        compilerOptions8.setWarningLevel(diagnosticGroup11, checkLevel20);
        compilerOptions0.checkUnreachableCode = checkLevel20;
        compilerOptions0.setCrossModuleCodeMotion(true);
        compilerOptions0.setInlineGetters(false);
        compilerOptions0.sourceMapOutputPath = "// Input %num%";
        compilerOptions0.setRuntimeTypeCheck(false);
        compilerOptions0.flowSensitiveInlineVariables = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions33.setRewriteNewDateGoogNow(true);
        boolean boolean36 = compilerOptions33.extractPrototypeMemberDeclarations;
        compilerOptions33.setCollapseProperties(false);
        compilerOptions33.setClosurePass(true);
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions33.setInputPropertyMapSerialized(byteArray46);
        compilerOptions33.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.MessageBundle messageBundle50 = null;
        compilerOptions33.messageBundle = messageBundle50;
        compilerOptions33.setInlineGetters(true);
        compilerOptions33.removeUnusedPrototypeProperties = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions56.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention59 = null;
        compilerOptions56.setCodingConvention(codingConvention59);
        boolean boolean61 = compilerOptions56.computeFunctionSideEffects;
        boolean boolean62 = compilerOptions56.printInputDelimiter;
        compilerOptions56.setGeneratePseudoNames(true);
        boolean boolean65 = compilerOptions56.disambiguateProperties;
        java.util.Set<java.lang.String> strSet66 = compilerOptions56.aliasableStrings;
        compilerOptions33.stripNameSuffixes = strSet66;
        compilerOptions0.stripNameSuffixes = strSet66;
        compilerOptions0.setRewriteNewDateGoogNow(false);
        boolean boolean71 = compilerOptions0.markAsCompiled;
        compilerOptions0.generatePseudoNames = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(byteArray10);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup11);
        org.junit.Assert.assertTrue("'" + checkLevel20 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel20.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean5 = compilerOptions0.labelRenaming;
        compilerOptions0.ambiguateProperties = false;
        boolean boolean8 = compilerOptions0.shouldColorizeErrorOutput();
        boolean boolean9 = compilerOptions0.crossModuleMethodMotion;
        com.google.javascript.jscomp.CheckLevel checkLevel10 = compilerOptions0.checkMissingGetCssNameLevel;
        compilerOptions0.enableExternExports(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention16 = null;
        compilerOptions13.setCodingConvention(codingConvention16);
        compilerOptions13.setPropertyAffinity(true);
        boolean boolean20 = compilerOptions13.closurePass;
        compilerOptions13.setCheckCaja(true);
        compilerOptions13.closurePass = true;
        compilerOptions13.setMarkAsCompiled(true);
        compilerOptions13.setGeneratePseudoNames(false);
        compilerOptions13.setInlineLocalFunctions(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions31.setRewriteNewDateGoogNow(true);
        boolean boolean34 = compilerOptions31.extractPrototypeMemberDeclarations;
        compilerOptions31.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel37 = compilerOptions31.brokenClosureRequiresLevel;
        java.util.Set<java.lang.String> strSet38 = compilerOptions31.stripTypes;
        compilerOptions13.setStripTypePrefixes(strSet38);
        java.util.Set<java.lang.String> strSet40 = compilerOptions13.stripTypePrefixes;
        compilerOptions0.aliasableStrings = strSet40;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + checkLevel10 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel10.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + checkLevel37 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel37.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(strSet40);
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions0.setInputPropertyMapSerialized(byteArray13);
        compilerOptions0.setFlowSensitiveInlineVariables(true);
        boolean boolean17 = compilerOptions0.exportTestFunctions;
        compilerOptions0.setTweakToNumberLiteral("java.io.IOException", (int) (short) 0);
        compilerOptions0.setInlineFunctions(false);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing23 = compilerOptions0.getTweakProcessing();
        boolean boolean24 = compilerOptions0.moveFunctionDeclarations;
        boolean boolean25 = compilerOptions0.checkTypes;
        compilerOptions0.prettyPrint = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tweakProcessing23 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing23.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.exportTestFunctions;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
        compilerOptions0.setLanguageIn(languageMode4);
        boolean boolean6 = compilerOptions0.flowSensitiveInlineVariables;
        boolean boolean7 = compilerOptions0.disambiguateProperties;
        compilerOptions0.lineBreak = false;
        compilerOptions0.setRemoveDeadCode(true);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream9 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        printStream1.write((int) '#');
        printStream1.print((float) (short) 0);
        boolean boolean14 = printStream1.checkError();
        java.io.PrintStream printStream16 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup17 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup17;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup17;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup17;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup17;
        com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK = diagnosticGroup17;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup17;
        printStream1.println((java.lang.Object) diagnosticGroup17);
        printStream1.print(1L);
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(printStream1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray28 = compiler27.getErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup17);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.reserveRawExports;
        java.util.Set<java.lang.String> strSet9 = compilerOptions0.stripNamePrefixes;
        compilerOptions0.rewriteFunctionExpressions = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.setReplaceIdGenerators(true);
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap7 = compilerOptions0.getDefineReplacements();
        com.google.javascript.jscomp.CheckLevel checkLevel8 = null;
        compilerOptions0.setReportUnknownTypes(checkLevel8);
        boolean boolean10 = compilerOptions0.collapseProperties;
        com.google.javascript.jscomp.CheckLevel checkLevel11 = compilerOptions0.checkGlobalNamesLevel;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + checkLevel11 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel11.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream9 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        printStream1.write((int) '#');
        printStream1.print((float) (short) 0);
        printStream1.print(10L);
        printStream1.write(1);
        printStream1.println(0L);
        java.util.Locale locale20 = null;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray22 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList23 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList23, locationMappingArray22);
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions25.setRewriteNewDateGoogNow(true);
        boolean boolean28 = compilerOptions25.extractPrototypeMemberDeclarations;
        compilerOptions25.setCollapseProperties(false);
        compilerOptions25.setClosurePass(true);
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions25.setInputPropertyMapSerialized(byteArray38);
        compilerOptions25.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions42.setRewriteNewDateGoogNow(true);
        boolean boolean45 = compilerOptions42.extractPrototypeMemberDeclarations;
        compilerOptions42.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet48 = compilerOptions42.stripTypePrefixes;
        compilerOptions25.aliasableStrings = strSet48;
        boolean boolean50 = locationMappingList23.removeAll((java.util.Collection<java.lang.String>) strSet48);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup51 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup51;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup51;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup51;
        boolean boolean55 = locationMappingList23.contains((java.lang.Object) diagnosticGroup51);
        java.util.Spliterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingSpliterator56 = locationMappingList23.spliterator();
        com.google.javascript.jscomp.CompilerOptions.TracerMode[] tracerModeArray57 = new com.google.javascript.jscomp.CompilerOptions.TracerMode[] {};
        com.google.javascript.jscomp.CompilerOptions.TracerMode[] tracerModeArray58 = locationMappingList23.toArray(tracerModeArray57);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream59 = printStream1.format(locale20, "java.io.IOException: // Input %num%", (java.lang.Object[]) tracerModeArray58);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '%'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(locationMappingArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(locationMappingSpliterator56);
        org.junit.Assert.assertNotNull(tracerModeArray57);
        org.junit.Assert.assertNotNull(tracerModeArray58);
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy8 = null;
        compilerOptions0.setPropertyRenaming(propertyRenamingPolicy8);
        compilerOptions0.setInlineConstantVars(true);
        compilerOptions0.aliasExternals = true;
        compilerOptions0.labelRenaming = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions16.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention19 = null;
        compilerOptions16.setCodingConvention(codingConvention19);
        compilerOptions16.setGeneratePseudoNames(true);
        compilerOptions16.inlineLocalFunctions = false;
        compilerOptions16.setInlineLocalVariables(true);
        boolean boolean27 = compilerOptions16.optimizeParameters;
        compilerOptions16.renamePrefixNamespace = "2019/07/12 07:12";
        compilerOptions16.closurePass = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions32.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention35 = null;
        compilerOptions32.setCodingConvention(codingConvention35);
        compilerOptions32.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel39 = compilerOptions32.checkProvides;
        java.util.Set<java.lang.String> strSet40 = compilerOptions32.stripTypes;
        compilerOptions16.setStripNamePrefixes(strSet40);
        compilerOptions0.stripTypePrefixes = strSet40;
        boolean boolean43 = compilerOptions0.assumeStrictThis();
        compilerOptions0.syntheticBlockEndMarker = "Unversioned directory";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + checkLevel39 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel39.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention9 = null;
        compilerOptions6.setCodingConvention(codingConvention9);
        compilerOptions6.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel13 = compilerOptions6.checkProvides;
        compilerOptions0.setReportUnknownTypes(checkLevel13);
        compilerOptions0.setCrossModuleCodeMotion(true);
        java.lang.String str17 = compilerOptions0.inputDelimiter;
        java.lang.String str18 = compilerOptions0.renamePrefixNamespace;
        compilerOptions0.setInlineFunctions(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions21.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention24 = null;
        compilerOptions21.setCodingConvention(codingConvention24);
        compilerOptions21.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel28 = compilerOptions21.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray29 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList30 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList30, locationMappingArray29);
        compilerOptions21.sourceMapLocationMappings = locationMappingList30;
        com.google.javascript.jscomp.CheckLevel checkLevel33 = compilerOptions21.aggressiveVarCheck;
        boolean boolean34 = compilerOptions21.aliasAllStrings;
        compilerOptions21.setDefineToNumberLiteral("java.io.IOException", 100);
        compilerOptions21.setCollapseProperties(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions40.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention43 = null;
        compilerOptions40.setCodingConvention(codingConvention43);
        compilerOptions40.setGeneratePseudoNames(true);
        compilerOptions40.inlineLocalFunctions = false;
        compilerOptions40.setIdeMode(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions51.setRewriteNewDateGoogNow(true);
        boolean boolean54 = compilerOptions51.extractPrototypeMemberDeclarations;
        compilerOptions51.convertToDottedProperties = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions57 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions57.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention60 = null;
        compilerOptions57.setCodingConvention(codingConvention60);
        compilerOptions57.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel64 = compilerOptions57.checkProvides;
        compilerOptions51.setReportUnknownTypes(checkLevel64);
        compilerOptions40.setCheckGlobalNamesLevel(checkLevel64);
        compilerOptions21.setCheckMissingReturn(checkLevel64);
        compilerOptions0.setCheckProvides(checkLevel64);
        compilerOptions0.prettyPrint = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel13 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel13.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "// Input %num%" + "'", str17, "// Input %num%");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + checkLevel28 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel28.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + checkLevel33 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel33.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + checkLevel64 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel64.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_USELESS_CODE = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        java.lang.Throwable throwable21 = null;
        java.io.IOException iOException22 = new java.io.IOException("", throwable21);
        java.lang.Throwable throwable24 = null;
        java.io.IOException iOException25 = new java.io.IOException("", throwable24);
        iOException22.addSuppressed((java.lang.Throwable) iOException25);
        java.io.IOException iOException27 = new java.io.IOException("", (java.lang.Throwable) iOException22);
        java.lang.Throwable[] throwableArray28 = iOException27.getSuppressed();
        java.io.PrintStream printStream29 = printStream1.format("java.io.IOException: Unversioned directory", (java.lang.Object[]) throwableArray28);
        printStream1.flush();
        printStream1.println((float) (byte) -1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions33.setRewriteNewDateGoogNow(true);
        boolean boolean36 = compilerOptions33.extractPrototypeMemberDeclarations;
        compilerOptions33.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet39 = compilerOptions33.stripTypePrefixes;
        com.google.javascript.jscomp.CheckLevel checkLevel40 = null;
        compilerOptions33.setCheckGlobalThisLevel(checkLevel40);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode42 = compilerOptions33.getTracerMode();
        printStream1.print((java.lang.Object) tracerMode42);
        printStream1.write((int) ' ');
        printStream1.println((-1.0d));
        printStream1.println((long) ' ');
        java.util.Locale locale50 = null;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray52 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList53 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53, locationMappingArray52);
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions55.setRewriteNewDateGoogNow(true);
        boolean boolean58 = compilerOptions55.extractPrototypeMemberDeclarations;
        compilerOptions55.convertToDottedProperties = true;
        boolean boolean61 = compilerOptions55.inlineConstantVars;
        boolean boolean62 = compilerOptions55.extractPrototypeMemberDeclarations;
        boolean boolean63 = compilerOptions55.reserveRawExports;
        boolean boolean64 = locationMappingList53.remove((java.lang.Object) boolean63);
        com.google.javascript.jscomp.CompilerOptions compilerOptions65 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions65.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention68 = null;
        compilerOptions65.setCodingConvention(codingConvention68);
        compilerOptions65.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions72 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet73 = compilerOptions72.stripNamePrefixes;
        compilerOptions65.setIdGenerators(strSet73);
        java.util.stream.Stream<java.lang.String> strStream75 = strSet73.stream();
        boolean boolean76 = locationMappingList53.retainAll((java.util.Collection<java.lang.String>) strSet73);
        boolean boolean78 = locationMappingList53.remove((java.lang.Object) (byte) 0);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping79 = null;
        boolean boolean80 = locationMappingList53.add(locationMapping79);
        int int81 = locationMappingList53.size();
        com.google.javascript.jscomp.Result[] resultArray82 = new com.google.javascript.jscomp.Result[] {};
        com.google.javascript.jscomp.Result[] resultArray83 = locationMappingList53.toArray(resultArray82);
        java.io.PrintStream printStream84 = printStream1.format(locale50, "java.io.IOException: ", (java.lang.Object[]) resultArray83);
        java.io.PrintStream printStream85 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(printStream29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertTrue("'" + tracerMode42 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode42.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(strStream75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(resultArray82);
        org.junit.Assert.assertNotNull(resultArray83);
        org.junit.Assert.assertNotNull(printStream84);
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean5 = compilerOptions0.isExternExportsEnabled();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setRewriteNewDateGoogNow(true);
        boolean boolean9 = compilerOptions6.extractPrototypeMemberDeclarations;
        compilerOptions6.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel12 = compilerOptions6.checkGlobalThisLevel;
        compilerOptions0.setAggressiveVarCheck(checkLevel12);
        compilerOptions0.setOutputCharset("java.io.IOException");
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet17 = compilerOptions16.stripNamePrefixes;
        byte[] byteArray18 = compilerOptions16.inputVariableMapSerialized;
        com.google.javascript.jscomp.CompilerOptions.Reach reach19 = com.google.javascript.jscomp.CompilerOptions.Reach.NONE;
        compilerOptions16.setInlineFunctions(reach19);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel21 = null;
        compilerOptions16.sourceMapDetailLevel = detailLevel21;
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.setLabelRenaming(true);
        compilerOptions23.reserveRawExports = true;
        compilerOptions23.setCollapsePropertiesOnExternTypes(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet31 = compilerOptions30.stripNamePrefixes;
        byte[] byteArray32 = compilerOptions30.inputVariableMapSerialized;
        compilerOptions30.checkSymbols = false;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler35 = compilerOptions30.getAliasTransformationHandler();
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy36 = compilerOptions30.propertyRenaming;
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions37.setRewriteNewDateGoogNow(true);
        boolean boolean40 = compilerOptions37.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach41 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions37.setInlineVariables(reach41);
        compilerOptions37.setPrintInputDelimiter(true);
        boolean boolean45 = compilerOptions37.closurePass;
        com.google.javascript.jscomp.MessageBundle messageBundle46 = null;
        compilerOptions37.messageBundle = messageBundle46;
        compilerOptions37.setDeadAssignmentElimination(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions51.setRewriteNewDateGoogNow(true);
        boolean boolean54 = compilerOptions51.extractPrototypeMemberDeclarations;
        compilerOptions51.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet57 = compilerOptions51.stripTypePrefixes;
        compilerOptions50.stripTypePrefixes = strSet57;
        compilerOptions37.setAliasableStrings(strSet57);
        compilerOptions30.stripTypePrefixes = strSet57;
        compilerOptions23.setStripNameSuffixes(strSet57);
        compilerOptions16.setAliasableStrings(strSet57);
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions63.setRewriteNewDateGoogNow(true);
        boolean boolean66 = compilerOptions63.extractPrototypeMemberDeclarations;
        boolean boolean67 = compilerOptions63.jqueryPass;
        compilerOptions63.collapseAnonymousFunctions = false;
        boolean boolean70 = compilerOptions63.checkTypes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions71 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions71.setLabelRenaming(true);
        compilerOptions71.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean76 = compilerOptions71.labelRenaming;
        compilerOptions71.ambiguateProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions79 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet80 = compilerOptions79.stripNamePrefixes;
        byte[] byteArray81 = compilerOptions79.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup82 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup82;
        com.google.javascript.jscomp.CompilerOptions compilerOptions84 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions84.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention87 = null;
        compilerOptions84.setCodingConvention(codingConvention87);
        compilerOptions84.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel91 = compilerOptions84.checkProvides;
        compilerOptions79.setWarningLevel(diagnosticGroup82, checkLevel91);
        compilerOptions71.checkUnreachableCode = checkLevel91;
        compilerOptions63.setAggressiveVarCheck(checkLevel91);
        compilerOptions16.setCheckMissingGetCssNameLevel(checkLevel91);
        compilerOptions0.checkUnreachableCode = checkLevel91;
        compilerOptions0.optimizeReturns = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(byteArray18);
        org.junit.Assert.assertTrue("'" + reach19 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.NONE + "'", reach19.equals(com.google.javascript.jscomp.CompilerOptions.Reach.NONE));
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(byteArray32);
        org.junit.Assert.assertNotNull(aliasTransformationHandler35);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy36 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy36.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + reach41 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach41.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strSet80);
        org.junit.Assert.assertNull(byteArray81);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup82);
        org.junit.Assert.assertTrue("'" + checkLevel91 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel91.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.collapseAnonymousFunctions = false;
        compilerOptions0.setManageClosureDependencies(true);
        compilerOptions0.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions11.setLabelRenaming(true);
        compilerOptions11.syntheticBlockStartMarker = "java.io.IOException";
        compilerOptions11.locale = "2019/07/12 07:12";
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap18 = compilerOptions11.cssRenamingMap;
        compilerOptions11.setRuntimeTypeCheck(true);
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler21 = compilerOptions11.getAliasTransformationHandler();
        compilerOptions11.setLineLengthThreshold((int) ' ');
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions24.setRewriteNewDateGoogNow(true);
        boolean boolean27 = compilerOptions24.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach28 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions24.setInlineVariables(reach28);
        compilerOptions24.setPrintInputDelimiter(true);
        boolean boolean32 = compilerOptions24.closurePass;
        boolean boolean33 = compilerOptions24.shouldColorizeErrorOutput();
        com.google.javascript.jscomp.CheckLevel checkLevel34 = compilerOptions24.checkMissingGetCssNameLevel;
        compilerOptions11.setCheckGlobalThisLevel(checkLevel34);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel36 = compilerOptions11.sourceMapDetailLevel;
        compilerOptions0.setSourceMapDetailLevel(detailLevel36);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(cssRenamingMap18);
        org.junit.Assert.assertNotNull(aliasTransformationHandler21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + reach28 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach28.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + checkLevel34 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel34.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(detailLevel36);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.gatherCssNames;
        boolean boolean9 = compilerOptions0.markAsCompiled;
        compilerOptions0.setTransformAMDToCJSModules(false);
        boolean boolean12 = compilerOptions0.checkTypes;
        compilerOptions0.sourceMapOutputPath = "java.io.IOException";
        compilerOptions0.setInlineProperties(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention20 = null;
        compilerOptions17.setCodingConvention(codingConvention20);
        compilerOptions17.setPropertyAffinity(true);
        boolean boolean24 = compilerOptions17.closurePass;
        compilerOptions17.setCheckCaja(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet28 = compilerOptions27.stripNamePrefixes;
        byte[] byteArray29 = compilerOptions27.inputVariableMapSerialized;
        com.google.javascript.jscomp.CompilerOptions.Reach reach30 = com.google.javascript.jscomp.CompilerOptions.Reach.NONE;
        compilerOptions27.setInlineFunctions(reach30);
        compilerOptions17.setRemoveUnusedVariables(reach30);
        compilerOptions0.setInlineFunctions(reach30);
        compilerOptions0.setPreferLineBreakAtEndOfFile(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(byteArray29);
        org.junit.Assert.assertTrue("'" + reach30 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.NONE + "'", reach30.equals(com.google.javascript.jscomp.CompilerOptions.Reach.NONE));
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap5 = null;
        compilerOptions0.setCssRenamingMap(cssRenamingMap5);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.reportMissingOverride;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.setLabelRenaming(true);
        com.google.javascript.jscomp.CheckLevel checkLevel11 = compilerOptions8.checkProvides;
        com.google.javascript.jscomp.CheckLevel checkLevel12 = compilerOptions8.reportMissingOverride;
        compilerOptions0.checkMissingGetCssNameLevel = checkLevel12;
        compilerOptions0.setCollapsePropertiesOnExternTypes(true);
        compilerOptions0.setTweakToNumberLiteral("java.io.IOException: ", (int) (byte) 0);
        compilerOptions0.setGroupVariableDeclarations(false);
        compilerOptions0.checkMissingGetCssNameBlacklist = "";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel11 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel11.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        boolean boolean15 = compilerOptions12.extractPrototypeMemberDeclarations;
        boolean boolean16 = compilerOptions12.jqueryPass;
        compilerOptions12.collapseAnonymousFunctions = false;
        boolean boolean19 = compilerOptions12.checkTypes;
        compilerOptions12.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CheckLevel checkLevel22 = compilerOptions12.checkProvides;
        compilerOptions0.checkUnreachableCode = checkLevel22;
        compilerOptions0.rewriteFunctionExpressions = false;
        compilerOptions0.setManageClosureDependencies(false);
        compilerOptions0.setDefineToStringLiteral("hi!", "4432#Unversionedhi!rector true\n0\n");
        compilerOptions0.setInlineGetters(true);
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + checkLevel22 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel22.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.setRemoveUnusedClassProperties(true);
        java.lang.String str5 = compilerOptions0.inputDelimiter;
        compilerOptions0.setComputeFunctionSideEffects(false);
        compilerOptions0.setInlineFunctions(true);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "// Input %num%" + "'", str5, "// Input %num%");
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        compilerOptions0.setInstrumentationTemplate("hi!");
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.brokenClosureRequiresLevel;
        boolean boolean8 = compilerOptions0.optimizeReturns;
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CheckLevel checkLevel5 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.setOutputJsStringUsage(false);
        com.google.javascript.jscomp.ErrorFormat errorFormat8 = compilerOptions0.errorFormat;
        byte[] byteArray9 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.reserveRawExports = false;
        boolean boolean12 = compilerOptions0.smartNameRemoval;
        org.junit.Assert.assertTrue("'" + checkLevel5 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel5.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(errorFormat8);
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        compilerOptions0.resetWarningsGuard();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions7.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention10 = null;
        compilerOptions7.setCodingConvention(codingConvention10);
        boolean boolean12 = compilerOptions7.generateExports;
        compilerOptions7.printInputDelimiter = false;
        compilerOptions7.prettyPrint = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention20 = null;
        compilerOptions17.setCodingConvention(codingConvention20);
        compilerOptions17.setGenerateExports(true);
        compilerOptions17.setLocale("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        boolean boolean26 = compilerOptions17.deadAssignmentElimination;
        compilerOptions17.optimizeCalls = false;
        compilerOptions17.instrumentationTemplate = "java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        boolean boolean31 = compilerOptions17.jqueryPass;
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions32.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention35 = null;
        compilerOptions32.setCodingConvention(codingConvention35);
        compilerOptions32.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel39 = compilerOptions32.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray40 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList41 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList41, locationMappingArray40);
        compilerOptions32.sourceMapLocationMappings = locationMappingList41;
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions44.setRewriteNewDateGoogNow(true);
        boolean boolean47 = compilerOptions44.extractPrototypeMemberDeclarations;
        boolean boolean48 = compilerOptions44.jqueryPass;
        compilerOptions44.collapseAnonymousFunctions = false;
        boolean boolean51 = compilerOptions44.checkTypes;
        compilerOptions44.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CheckLevel checkLevel54 = compilerOptions44.checkProvides;
        compilerOptions32.checkUnreachableCode = checkLevel54;
        compilerOptions32.rewriteFunctionExpressions = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions58 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions58.setRewriteNewDateGoogNow(true);
        boolean boolean61 = compilerOptions58.extractPrototypeMemberDeclarations;
        boolean boolean62 = compilerOptions58.jqueryPass;
        compilerOptions58.collapseAnonymousFunctions = false;
        boolean boolean65 = compilerOptions58.checkTypes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions66 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions66.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention69 = null;
        compilerOptions66.setCodingConvention(codingConvention69);
        compilerOptions66.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions73 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet74 = compilerOptions73.stripNamePrefixes;
        compilerOptions66.setIdGenerators(strSet74);
        compilerOptions58.stripNamePrefixes = strSet74;
        compilerOptions32.setIdGenerators(strSet74);
        compilerOptions17.stripTypePrefixes = strSet74;
        compilerOptions7.stripNameSuffixes = strSet74;
        compilerOptions0.setStripNamePrefixes(strSet74);
        java.util.Set<java.lang.String> strSet81 = compilerOptions0.aliasableStrings;
        boolean boolean82 = compilerOptions0.devirtualizePrototypeMethods;
        boolean boolean83 = compilerOptions0.removeDeadCode;
        boolean boolean84 = compilerOptions0.removeDeadCode;
        com.google.javascript.jscomp.CheckLevel checkLevel85 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.rewriteFunctionExpressions = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + checkLevel39 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel39.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + checkLevel54 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel54.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + checkLevel85 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel85.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.setNameReferenceReportPath("java.io.IOException: Unversioned directory");
        compilerOptions0.setDeadAssignmentElimination(true);
        compilerOptions0.setShadowVariables(true);
        java.lang.String str9 = compilerOptions0.inputDelimiter;
        compilerOptions0.setComputeFunctionSideEffects(true);
        boolean boolean12 = compilerOptions0.inlineVariables;
        com.google.javascript.jscomp.DependencyOptions dependencyOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.setDependencyOptions(dependencyOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "// Input %num%" + "'", str9, "// Input %num%");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        boolean boolean8 = compilerOptions0.optimizeReturns;
        compilerOptions0.smartNameRemoval = true;
        java.util.Set<java.lang.String> strSet11 = compilerOptions0.aliasableStrings;
        compilerOptions0.generateExports = false;
        boolean boolean14 = compilerOptions0.assumeStrictThis();
        com.google.javascript.jscomp.CheckLevel checkLevel15 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.setAppNameStr("java.io.IOException");
        com.google.javascript.jscomp.CodingConvention codingConvention18 = compilerOptions0.getCodingConvention();
        compilerOptions0.setConvertToDottedProperties(true);
        compilerOptions0.setGeneratePseudoNames(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions24.setRewriteNewDateGoogNow(true);
        boolean boolean27 = compilerOptions24.extractPrototypeMemberDeclarations;
        compilerOptions24.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet30 = compilerOptions24.stripTypePrefixes;
        compilerOptions23.stripTypePrefixes = strSet30;
        compilerOptions23.setChainCalls(true);
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap34 = null;
        compilerOptions23.setCustomPasses(customPassExecutionTimeMultimap34);
        compilerOptions23.setClosurePass(true);
        compilerOptions23.setSourceMapOutputPath("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet41 = compilerOptions40.stripNamePrefixes;
        byte[] byteArray42 = compilerOptions40.inputVariableMapSerialized;
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet44 = compilerOptions43.stripNamePrefixes;
        byte[] byteArray45 = compilerOptions43.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup46 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup46;
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions48.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention51 = null;
        compilerOptions48.setCodingConvention(codingConvention51);
        compilerOptions48.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel55 = compilerOptions48.checkProvides;
        compilerOptions43.setWarningLevel(diagnosticGroup46, checkLevel55);
        compilerOptions40.setAggressiveVarCheck(checkLevel55);
        compilerOptions40.setSkipAllPasses(true);
        compilerOptions40.setOptimizeReturns(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions62 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions62.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions65 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions65.setRewriteNewDateGoogNow(true);
        boolean boolean68 = compilerOptions65.extractPrototypeMemberDeclarations;
        boolean boolean69 = compilerOptions65.jqueryPass;
        boolean boolean70 = compilerOptions65.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions71 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions71.setLabelRenaming(true);
        compilerOptions71.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean76 = compilerOptions71.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format77 = compilerOptions71.sourceMapFormat;
        compilerOptions65.setSourceMapFormat(format77);
        compilerOptions62.setSourceMapFormat(format77);
        compilerOptions40.sourceMapFormat = format77;
        com.google.javascript.jscomp.CompilerOptions compilerOptions81 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions81.setLabelRenaming(true);
        com.google.javascript.jscomp.CheckLevel checkLevel84 = compilerOptions81.checkProvides;
        com.google.javascript.jscomp.CheckLevel checkLevel85 = compilerOptions81.reportMissingOverride;
        boolean boolean86 = compilerOptions81.ideMode;
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy87 = compilerOptions81.anonymousFunctionNaming;
        compilerOptions40.setAnonymousFunctionNaming(anonymousFunctionNamingPolicy87);
        compilerOptions23.setAnonymousFunctionNaming(anonymousFunctionNamingPolicy87);
        compilerOptions0.setAnonymousFunctionNaming(anonymousFunctionNamingPolicy87);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + checkLevel15 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel15.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(codingConvention18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNull(byteArray42);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNull(byteArray45);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup46);
        org.junit.Assert.assertTrue("'" + checkLevel55 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel55.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(format77);
        org.junit.Assert.assertTrue("'" + checkLevel84 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel84.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel85 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel85.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy87 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy87.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGeneratePseudoNames(true);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setIdeMode(true);
        compilerOptions0.computeFunctionSideEffects = false;
        boolean boolean13 = compilerOptions0.removeUnusedPrototypePropertiesInExterns;
        java.lang.String str14 = compilerOptions0.syntheticBlockEndMarker;
        boolean boolean15 = compilerOptions0.checkSuspiciousCode;
        boolean boolean16 = compilerOptions0.reserveRawExports;
        compilerOptions0.coalesceVariableNames = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions19.setRewriteNewDateGoogNow(true);
        boolean boolean22 = compilerOptions19.extractPrototypeMemberDeclarations;
        compilerOptions19.setCollapseProperties(false);
        compilerOptions19.setClosurePass(true);
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions19.setInputPropertyMapSerialized(byteArray32);
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions34.setRewriteNewDateGoogNow(true);
        boolean boolean37 = compilerOptions34.extractPrototypeMemberDeclarations;
        compilerOptions34.convertToDottedProperties = true;
        compilerOptions34.setRemoveUnusedVars(true);
        compilerOptions34.removeUnusedClassProperties = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy44 = compilerOptions34.propertyRenaming;
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions45.setLabelRenaming(true);
        compilerOptions45.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean50 = compilerOptions45.isExternExportsEnabled();
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions51.setRewriteNewDateGoogNow(true);
        boolean boolean54 = compilerOptions51.extractPrototypeMemberDeclarations;
        compilerOptions51.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel57 = compilerOptions51.checkGlobalThisLevel;
        compilerOptions45.setAggressiveVarCheck(checkLevel57);
        compilerOptions34.setCheckRequires(checkLevel57);
        compilerOptions19.setBrokenClosureRequiresLevel(checkLevel57);
        compilerOptions0.setCheckGlobalNamesLevel(checkLevel57);
        compilerOptions0.setReportPath("java.io.IOException: java.io.IOException");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy44 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy44.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + checkLevel57 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel57.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.gatherCssNames;
        com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard9 = null;
        compilerOptions0.setWarningsGuard(composeWarningsGuard9);
        compilerOptions0.setPreferLineBreakAtEndOfFile(true);
        compilerOptions0.setLabelRenaming(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions15.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention18 = null;
        compilerOptions15.setCodingConvention(codingConvention18);
        compilerOptions15.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel22 = compilerOptions15.checkProvides;
        boolean boolean23 = compilerOptions15.smartNameRemoval;
        java.util.Set<java.lang.String> strSet24 = compilerOptions15.aliasableStrings;
        java.lang.String str25 = compilerOptions15.sourceMapOutputPath;
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet27 = compilerOptions26.stripNamePrefixes;
        byte[] byteArray28 = compilerOptions26.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup29 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup29;
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions31.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention34 = null;
        compilerOptions31.setCodingConvention(codingConvention34);
        compilerOptions31.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel38 = compilerOptions31.checkProvides;
        compilerOptions26.setWarningLevel(diagnosticGroup29, checkLevel38);
        java.util.Set<java.lang.String> strSet40 = compilerOptions26.stripNamePrefixes;
        compilerOptions26.setComputeFunctionSideEffects(true);
        boolean boolean43 = compilerOptions26.coalesceVariableNames;
        boolean boolean44 = compilerOptions26.optimizeReturns;
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions45.setRewriteNewDateGoogNow(true);
        boolean boolean48 = compilerOptions45.extractPrototypeMemberDeclarations;
        compilerOptions45.convertToDottedProperties = true;
        boolean boolean51 = compilerOptions45.inlineConstantVars;
        boolean boolean52 = compilerOptions45.extractPrototypeMemberDeclarations;
        boolean boolean53 = compilerOptions45.gatherCssNames;
        boolean boolean54 = compilerOptions45.markAsCompiled;
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing55 = compilerOptions45.getTweakProcessing();
        compilerOptions45.devirtualizePrototypeMethods = true;
        boolean boolean58 = compilerOptions45.labelRenaming;
        com.google.javascript.jscomp.CompilerOptions compilerOptions59 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions59.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention62 = null;
        compilerOptions59.setCodingConvention(codingConvention62);
        compilerOptions59.setPropertyAffinity(true);
        boolean boolean66 = compilerOptions59.closurePass;
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy67 = compilerOptions59.anonymousFunctionNaming;
        compilerOptions59.setReportPath("Unversioned directory");
        compilerOptions59.optimizeReturns = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions72 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions72.setRewriteNewDateGoogNow(true);
        boolean boolean75 = compilerOptions72.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach76 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions72.setInlineVariables(reach76);
        compilerOptions72.setPrintInputDelimiter(true);
        boolean boolean80 = compilerOptions72.closurePass;
        boolean boolean81 = compilerOptions72.shouldColorizeErrorOutput();
        com.google.javascript.jscomp.CheckLevel checkLevel82 = compilerOptions72.checkMissingGetCssNameLevel;
        compilerOptions59.setCheckGlobalNamesLevel(checkLevel82);
        compilerOptions45.setReportMissingOverride(checkLevel82);
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler85 = compilerOptions45.getAliasTransformationHandler();
        compilerOptions26.setAliasTransformationHandler(aliasTransformationHandler85);
        compilerOptions15.setAliasTransformationHandler(aliasTransformationHandler85);
        compilerOptions0.setAliasTransformationHandler(aliasTransformationHandler85);
        com.google.javascript.rhino.SourcePosition<com.google.javascript.jscomp.CompilerOptions.AliasTransformation> aliasTransformationSourcePosition90 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerOptions.AliasTransformation aliasTransformation91 = aliasTransformationHandler85.logAliasTransformation("java.io.IOException: Unversioned directory", aliasTransformationSourcePosition90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + checkLevel22 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel22.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(byteArray28);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup29);
        org.junit.Assert.assertTrue("'" + checkLevel38 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel38.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + tweakProcessing55 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing55.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy67 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy67.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + reach76 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach76.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + checkLevel82 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel82.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(aliasTransformationHandler85);
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel6 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.setAcceptConstKeyword(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        boolean boolean12 = compilerOptions9.extractPrototypeMemberDeclarations;
        compilerOptions9.setCollapseProperties(false);
        compilerOptions9.setClosurePass(true);
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions9.setInputPropertyMapSerialized(byteArray22);
        compilerOptions9.setFlowSensitiveInlineVariables(true);
        compilerOptions9.setPropertyAffinity(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions28.setRewriteNewDateGoogNow(true);
        boolean boolean31 = compilerOptions28.extractPrototypeMemberDeclarations;
        compilerOptions28.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet34 = compilerOptions28.stripTypePrefixes;
        java.util.stream.Stream<java.lang.String> strStream35 = strSet34.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream36 = strSet34.parallelStream();
        compilerOptions9.stripNameSuffixes = strSet34;
        compilerOptions0.setStripTypePrefixes(strSet34);
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy39 = compilerOptions0.anonymousFunctionNaming;
        compilerOptions0.setColorizeErrorOutput(true);
        compilerOptions0.setReserveRawExports(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel6 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel6.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strStream35);
        org.junit.Assert.assertNotNull(strStream36);
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy39 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy39.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        compilerOptions0.setLocale("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        boolean boolean9 = compilerOptions0.foldConstants;
        com.google.javascript.jscomp.CheckLevel checkLevel10 = compilerOptions0.brokenClosureRequiresLevel;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions11.setRewriteNewDateGoogNow(true);
        boolean boolean14 = compilerOptions11.extractPrototypeMemberDeclarations;
        boolean boolean15 = compilerOptions11.jqueryPass;
        compilerOptions11.collapseAnonymousFunctions = false;
        java.lang.String str18 = compilerOptions11.aliasStringsBlacklist;
        compilerOptions11.inlineGetters = false;
        boolean boolean21 = compilerOptions11.exportTestFunctions;
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions22.setRewriteNewDateGoogNow(true);
        boolean boolean25 = compilerOptions22.extractPrototypeMemberDeclarations;
        compilerOptions22.setCollapseProperties(false);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy28 = compilerOptions22.variableRenaming;
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet30 = compilerOptions29.stripNamePrefixes;
        byte[] byteArray31 = compilerOptions29.inputVariableMapSerialized;
        compilerOptions29.checkSymbols = false;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler34 = compilerOptions29.getAliasTransformationHandler();
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy35 = compilerOptions29.propertyRenaming;
        compilerOptions11.setRenamingPolicy(variableRenamingPolicy28, propertyRenamingPolicy35);
        compilerOptions0.setVariableRenaming(variableRenamingPolicy28);
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy38 = compilerOptions0.anonymousFunctionNaming;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + checkLevel10 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel10.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy28 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.OFF + "'", variableRenamingPolicy28.equals(com.google.javascript.jscomp.VariableRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNull(byteArray31);
        org.junit.Assert.assertNotNull(aliasTransformationHandler34);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy35 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy35.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy38 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy38.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.collapseAnonymousFunctions = false;
        compilerOptions0.setManageClosureDependencies(true);
        compilerOptions0.setMarkAsCompiled(true);
        boolean boolean11 = compilerOptions0.ideMode;
        boolean boolean12 = compilerOptions0.collapseProperties;
        compilerOptions0.enableExternExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions15.setRewriteNewDateGoogNow(true);
        boolean boolean18 = compilerOptions15.extractPrototypeMemberDeclarations;
        compilerOptions15.convertToDottedProperties = true;
        boolean boolean21 = compilerOptions15.inlineConstantVars;
        boolean boolean22 = compilerOptions15.extractPrototypeMemberDeclarations;
        boolean boolean23 = compilerOptions15.gatherCssNames;
        com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard24 = null;
        compilerOptions15.setWarningsGuard(composeWarningsGuard24);
        compilerOptions15.setInstrumentationTemplate("2019/07/12 07:12");
        com.google.javascript.jscomp.CompilerOptions.Reach reach28 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions15.setInlineFunctions(reach28);
        compilerOptions0.setRemoveUnusedVariables(reach28);
        compilerOptions0.ambiguateProperties = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + reach28 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach28.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        boolean boolean15 = compilerOptions12.extractPrototypeMemberDeclarations;
        boolean boolean16 = compilerOptions12.jqueryPass;
        compilerOptions12.collapseAnonymousFunctions = false;
        boolean boolean19 = compilerOptions12.checkTypes;
        compilerOptions12.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CheckLevel checkLevel22 = compilerOptions12.checkProvides;
        compilerOptions0.checkUnreachableCode = checkLevel22;
        compilerOptions0.rewriteFunctionExpressions = false;
        boolean boolean26 = compilerOptions0.removeUnusedClassProperties;
        compilerOptions0.setSourceMapOutputPath("java.io.IOException: -1");
        boolean boolean29 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap30 = null;
        compilerOptions0.customPasses = customPassExecutionTimeMultimap30;
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + checkLevel22 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel22.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.JSModule jSModule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = compiler0.toSourceArray(jSModule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(intermediateState5);
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.computeFunctionSideEffects;
        boolean boolean6 = compilerOptions0.printInputDelimiter;
        compilerOptions0.setGeneratePseudoNames(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention12 = null;
        compilerOptions9.setCodingConvention(codingConvention12);
        compilerOptions9.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet17 = compilerOptions16.stripNamePrefixes;
        compilerOptions9.setIdGenerators(strSet17);
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions19.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention22 = null;
        compilerOptions19.setCodingConvention(codingConvention22);
        compilerOptions19.setGeneratePseudoNames(true);
        compilerOptions19.inlineLocalFunctions = false;
        compilerOptions19.setIdeMode(true);
        compilerOptions19.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions32.setRewriteNewDateGoogNow(true);
        boolean boolean35 = compilerOptions32.extractPrototypeMemberDeclarations;
        compilerOptions32.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel38 = compilerOptions32.checkGlobalThisLevel;
        compilerOptions19.checkMissingReturn = checkLevel38;
        compilerOptions9.aggressiveVarCheck = checkLevel38;
        compilerOptions0.reportMissingOverride = checkLevel38;
        compilerOptions0.setReportPath("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        java.util.Set<java.lang.String> strSet44 = compilerOptions0.stripNamePrefixes;
        boolean boolean45 = compilerOptions0.isExternExportsEnabled();
        boolean boolean46 = compilerOptions0.preferLineBreakAtEndOfFile;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + checkLevel38 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel38.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet8 = compilerOptions7.stripNamePrefixes;
        compilerOptions0.setIdGenerators(strSet8);
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap10 = compilerOptions0.getTweakReplacements();
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        compilerOptions0.aliasAllStrings = false;
        com.google.javascript.jscomp.CheckLevel checkLevel9 = compilerOptions0.checkRequires;
        compilerOptions0.setOutputCharset("java.io.IOException: ");
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap12 = null;
        compilerOptions0.customPasses = customPassExecutionTimeMultimap12;
        compilerOptions0.setRemoveUnusedPrototypePropertiesInExterns(true);
        compilerOptions0.setOptimizeCalls(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + checkLevel9 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel9.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions5.setRewriteNewDateGoogNow(true);
        boolean boolean8 = compilerOptions5.extractPrototypeMemberDeclarations;
        compilerOptions5.setCollapseProperties(false);
        compilerOptions5.setClosurePass(true);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions5.setInputPropertyMapSerialized(byteArray18);
        compilerOptions5.setAliasAllStrings(false);
        com.google.javascript.jscomp.CheckLevel checkLevel22 = compilerOptions5.reportMissingOverride;
        compilerOptions5.removeUnusedLocalVars = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet26 = compilerOptions25.stripNamePrefixes;
        byte[] byteArray27 = compilerOptions25.inputVariableMapSerialized;
        compilerOptions25.checkSymbols = false;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap30 = null;
        compilerOptions25.setCssRenamingMap(cssRenamingMap30);
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions32.setRewriteNewDateGoogNow(true);
        boolean boolean35 = compilerOptions32.extractPrototypeMemberDeclarations;
        compilerOptions32.convertToDottedProperties = true;
        boolean boolean38 = compilerOptions32.inlineConstantVars;
        compilerOptions32.aliasAllStrings = false;
        boolean boolean41 = compilerOptions32.smartNameRemoval;
        compilerOptions32.gatherCssNames = true;
        com.google.javascript.jscomp.CheckLevel checkLevel44 = compilerOptions32.checkGlobalNamesLevel;
        compilerOptions25.setCheckProvides(checkLevel44);
        compilerOptions5.setCheckGlobalNamesLevel(checkLevel44);
        compilerOptions0.setReportUnknownTypes(checkLevel44);
        boolean boolean48 = compilerOptions0.removeUnusedPrototypeProperties;
        boolean boolean49 = compilerOptions0.disambiguateProperties;
        boolean boolean50 = compilerOptions0.checkTypes;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + checkLevel22 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel22.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(byteArray27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + checkLevel44 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel44.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setExportTestFunctions(true);
    }
}
