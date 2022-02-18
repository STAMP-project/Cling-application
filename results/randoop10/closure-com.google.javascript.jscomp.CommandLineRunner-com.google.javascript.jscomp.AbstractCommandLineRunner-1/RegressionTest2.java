import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        boolean boolean8 = compilerOptions0.closurePass;
        com.google.javascript.jscomp.MessageBundle messageBundle9 = null;
        compilerOptions0.messageBundle = messageBundle9;
        compilerOptions0.setRemoveTryCatchFinally(false);
        compilerOptions0.setAliasAllStrings(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_USELESS_CODE = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setRewriteNewDateGoogNow(true);
        boolean boolean23 = compilerOptions20.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach24 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions20.setInlineVariables(reach24);
        compilerOptions20.setPrintInputDelimiter(true);
        boolean boolean28 = compilerOptions20.closurePass;
        boolean boolean29 = compilerOptions20.shouldColorizeErrorOutput();
        com.google.javascript.jscomp.CheckLevel checkLevel30 = compilerOptions20.checkMissingGetCssNameLevel;
        compilerOptions0.setCheckMissingGetCssNameLevel(checkLevel30);
        compilerOptions0.crossModuleMethodMotion = false;
        compilerOptions0.crossModuleMethodMotion = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + reach24 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach24.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + checkLevel30 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel30.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        boolean boolean6 = compilerOptions0.closurePass;
        compilerOptions0.setRemoveAbstractMethods(true);
        compilerOptions0.recordFunctionInformation = false;
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap11 = null;
        compilerOptions0.customPasses = customPassExecutionTimeMultimap11;
        compilerOptions0.setCollapseObjectLiterals(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        compilerOptions0.setCollapseProperties(false);
        boolean boolean9 = compilerOptions0.inlineVariables;
        com.google.javascript.jscomp.CheckLevel checkLevel10 = compilerOptions0.aggressiveVarCheck;
        compilerOptions0.setGeneratePseudoNames(true);
        compilerOptions0.setCheckSuspiciousCode(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + checkLevel10 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel10.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        com.google.javascript.jscomp.JsAst jsAst8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.replaceScript(jsAst8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(intermediateState5);
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("Unversioned directory");
        com.google.javascript.jscomp.SourceFile sourceFile11 = builder9.buildFromFile("hi!");
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile14 = builder9.buildFromInputStream("java.io.IOException", inputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(sourceFile11);
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        boolean boolean6 = compilerOptions0.closurePass;
        compilerOptions0.setRemoveAbstractMethods(true);
        compilerOptions0.recordFunctionInformation = false;
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap11 = null;
        compilerOptions0.customPasses = customPassExecutionTimeMultimap11;
        compilerOptions0.exportTestFunctions = false;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray15 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList16 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList16, locationMappingArray15);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions18.setRewriteNewDateGoogNow(true);
        boolean boolean21 = compilerOptions18.extractPrototypeMemberDeclarations;
        compilerOptions18.setCollapseProperties(false);
        compilerOptions18.setClosurePass(true);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions18.setInputPropertyMapSerialized(byteArray31);
        compilerOptions18.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions35.setRewriteNewDateGoogNow(true);
        boolean boolean38 = compilerOptions35.extractPrototypeMemberDeclarations;
        compilerOptions35.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet41 = compilerOptions35.stripTypePrefixes;
        compilerOptions18.aliasableStrings = strSet41;
        boolean boolean43 = locationMappingList16.removeAll((java.util.Collection<java.lang.String>) strSet41);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup44 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup44;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup44;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup44;
        boolean boolean48 = locationMappingList16.contains((java.lang.Object) diagnosticGroup44);
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions49.setRewriteNewDateGoogNow(true);
        boolean boolean52 = compilerOptions49.extractPrototypeMemberDeclarations;
        boolean boolean53 = compilerOptions49.jqueryPass;
        boolean boolean54 = compilerOptions49.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions55.setLabelRenaming(true);
        compilerOptions55.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean60 = compilerOptions55.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format61 = compilerOptions55.sourceMapFormat;
        compilerOptions49.setSourceMapFormat(format61);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing63 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP;
        compilerOptions49.setTweakProcessing(tweakProcessing63);
        com.google.javascript.jscomp.CompilerOptions compilerOptions65 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions65.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention68 = null;
        compilerOptions65.setCodingConvention(codingConvention68);
        compilerOptions65.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel72 = compilerOptions65.checkProvides;
        java.util.Set<java.lang.String> strSet73 = compilerOptions65.stripTypes;
        java.util.stream.Stream<java.lang.String> strStream74 = strSet73.stream();
        compilerOptions49.stripTypes = strSet73;
        boolean boolean76 = locationMappingList16.removeAll((java.util.Collection<java.lang.String>) strSet73);
        compilerOptions0.sourceMapLocationMappings = locationMappingList16;
        java.util.function.UnaryOperator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingUnaryOperator78 = null;
        // The following exception was thrown during execution in test generation
        try {
            locationMappingList16.replaceAll(locationMappingUnaryOperator78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locationMappingArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(format61);
        org.junit.Assert.assertTrue("'" + tweakProcessing63 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP + "'", tweakProcessing63.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP));
        org.junit.Assert.assertTrue("'" + checkLevel72 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel72.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(strStream74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
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
        compilerOptions0.checkSuspiciousCode = true;
        compilerOptions0.setAmbiguateProperties(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + checkLevel46 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel46.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
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
        compilerOptions0.checkGlobalNamesLevel = checkLevel13;
        compilerOptions0.setLineBreak(true);
        boolean boolean17 = compilerOptions0.checkControlStructures;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel13 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel13.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.enableExternExports(true);
        compilerOptions0.setCrossModuleCodeMotion(false);
        java.util.Set<java.lang.String> strSet5 = compilerOptions0.stripNamePrefixes;
        compilerOptions0.flowSensitiveInlineVariables = true;
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions54.setRewriteNewDateGoogNow(true);
        boolean boolean57 = compilerOptions54.extractPrototypeMemberDeclarations;
        compilerOptions54.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel60 = compilerOptions54.brokenClosureRequiresLevel;
        java.util.Set<java.lang.String> strSet61 = compilerOptions54.stripTypes;
        compilerOptions0.setIdGenerators(strSet61);
        java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList63 = compilerOptions0.sourceMapLocationMappings;
        com.google.javascript.jscomp.CompilerOptions compilerOptions64 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions64.setRewriteNewDateGoogNow(true);
        boolean boolean67 = compilerOptions64.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach68 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions64.setInlineVariables(reach68);
        compilerOptions64.setPrintInputDelimiter(true);
        boolean boolean72 = compilerOptions64.closurePass;
        compilerOptions64.setOutputCharset("java.io.IOException");
        compilerOptions64.setCheckControlStructures(true);
        com.google.javascript.jscomp.CheckLevel checkLevel77 = compilerOptions64.aggressiveVarCheck;
        boolean boolean78 = locationMappingList63.contains((java.lang.Object) compilerOptions64);
        compilerOptions64.instrumentationTemplate = "Unversioned directory";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + checkLevel46 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel46.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + checkLevel60 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel60.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNotNull(locationMappingList63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + reach68 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach68.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + checkLevel77 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel77.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
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
        compilerOptions0.setReportPath("-1");
        boolean boolean14 = compilerOptions0.shouldColorizeErrorOutput();
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        compilerOptions0.aliasAllStrings = false;
        boolean boolean9 = compilerOptions0.smartNameRemoval;
        compilerOptions0.gatherCssNames = true;
        compilerOptions0.aliasExternals = true;
        compilerOptions0.instrumentationTemplate = "java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        compilerOptions0.setLineBreak(false);
        compilerOptions0.setPreferLineBreakAtEndOfFile(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        boolean boolean8 = compilerOptions0.closurePass;
        boolean boolean9 = compilerOptions0.shouldColorizeErrorOutput();
        compilerOptions0.lineBreak = false;
        compilerOptions0.setCheckSymbols(true);
        compilerOptions0.setNameAnonymousFunctionsOnly(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet6 = compilerOptions0.stripTypePrefixes;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compilerOptions0.cssRenamingMap;
        boolean boolean8 = compilerOptions0.preferLineBreakAtEndOfFile;
        java.lang.String str9 = compilerOptions0.aliasStringsBlacklist;
        compilerOptions0.setAppNameStr("2019/07/12 07:12");
        java.lang.Class<?> wildcardClass12 = compilerOptions0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(cssRenamingMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet6 = compilerOptions0.stripTypePrefixes;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compilerOptions0.cssRenamingMap;
        compilerOptions0.setOptimizeArgumentsArray(false);
        boolean boolean10 = compilerOptions0.collapseAnonymousFunctions;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(cssRenamingMap7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
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
        com.google.javascript.jscomp.DiagnosticGroups.CONST = diagnosticGroup3;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup3);
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.setRemoveUnusedClassProperties(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions7.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention10 = null;
        compilerOptions7.setCodingConvention(codingConvention10);
        compilerOptions7.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel14 = compilerOptions7.checkProvides;
        compilerOptions0.brokenClosureRequiresLevel = checkLevel14;
        boolean boolean16 = compilerOptions0.isRemoveUnusedClassProperties();
        boolean boolean17 = compilerOptions0.reserveRawExports;
        com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard18 = null;
        compilerOptions0.setWarningsGuard(composeWarningsGuard18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + checkLevel14 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel14.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode5 = compilerOptions0.getTracerMode();
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup6;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.setRewriteNewDateGoogNow(true);
        boolean boolean11 = compilerOptions8.extractPrototypeMemberDeclarations;
        compilerOptions8.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel14 = compilerOptions8.brokenClosureRequiresLevel;
        compilerOptions0.setWarningLevel(diagnosticGroup6, checkLevel14);
        com.google.javascript.jscomp.CheckLevel checkLevel16 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.markNoSideEffectCalls = false;
        boolean boolean19 = compilerOptions0.exportTestFunctions;
        org.junit.Assert.assertTrue("'" + tracerMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode5.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
// flaky:         org.junit.Assert.assertNull(diagnosticGroup6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + checkLevel14 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel14.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertTrue("'" + checkLevel16 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel16.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_MESSAGE = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_REGEXP = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
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
        compilerOptions0.prettyPrint = false;
        compilerOptions0.optimizeReturns = false;
        boolean boolean27 = compilerOptions0.shouldColorizeErrorOutput();
        byte[] byteArray28 = compilerOptions0.inputPropertyMapSerialized;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(byteArray10);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup11);
        org.junit.Assert.assertTrue("'" + checkLevel20 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel20.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(byteArray28);
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT;
        printStream1.println((java.lang.Object) diagnosticGroup18);
        java.io.PrintStream printStream20 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(printStream1);
        com.google.javascript.jscomp.Scope scope22 = compiler21.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            compiler21.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
// flaky:         org.junit.Assert.assertNull(diagnosticGroup18);
        org.junit.Assert.assertNull(scope22);
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TYPE_INVALIDATION = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        com.google.javascript.jscomp.SourceFile.Generator generator7 = null;
        com.google.javascript.jscomp.SourceFile sourceFile8 = builder5.buildFromGenerator("hi!", generator7);
        com.google.javascript.jscomp.SourceFile.Builder builder10 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator12 = null;
        com.google.javascript.jscomp.SourceFile sourceFile13 = builder10.buildFromGenerator("hi!", generator12);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder15 = builder10.withCharset(charset14);
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder17 = builder10.withCharset(charset16);
        com.google.javascript.jscomp.SourceFile.Builder builder19 = builder10.withOriginalPath("hi!");
        com.google.javascript.jscomp.SourceFile sourceFile22 = builder10.buildFromCode("java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12", "// Input %num%");
        java.io.Reader reader23 = sourceFile22.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile24 = builder5.buildFromReader("", reader23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(sourceFile22);
        org.junit.Assert.assertNotNull(reader23);
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.setCollapseProperties(false);
        compilerOptions3.setClosurePass(true);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions3.setInputPropertyMapSerialized(byteArray16);
        compilerOptions3.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setRewriteNewDateGoogNow(true);
        boolean boolean23 = compilerOptions20.extractPrototypeMemberDeclarations;
        compilerOptions20.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet26 = compilerOptions20.stripTypePrefixes;
        compilerOptions3.aliasableStrings = strSet26;
        boolean boolean28 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet26);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup29 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup29;
        boolean boolean33 = locationMappingList1.contains((java.lang.Object) diagnosticGroup29);
        java.util.Spliterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingSpliterator34 = locationMappingList1.spliterator();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping36 = null;
        // The following exception was thrown during execution in test generation
        try {
            locationMappingList1.add((int) '#', locationMapping36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(locationMappingSpliterator34);
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        boolean boolean6 = compilerOptions0.printInputDelimiter;
        com.google.javascript.jscomp.ErrorFormat errorFormat7 = compilerOptions0.errorFormat;
        boolean boolean8 = compilerOptions0.convertToDottedProperties;
        boolean boolean9 = compilerOptions0.removeTryCatchFinally;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(errorFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("2019/07/12 07:12", "java.io.IOException: -1", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        boolean boolean8 = compilerOptions0.closurePass;
        com.google.javascript.jscomp.MessageBundle messageBundle9 = null;
        compilerOptions0.messageBundle = messageBundle9;
        compilerOptions0.setDeadAssignmentElimination(false);
        compilerOptions0.extractPrototypeMemberDeclarations = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions15.setRewriteNewDateGoogNow(true);
        boolean boolean18 = compilerOptions15.extractPrototypeMemberDeclarations;
        compilerOptions15.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet21 = compilerOptions15.stripTypePrefixes;
        java.util.stream.Stream<java.lang.String> strStream22 = strSet21.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream23 = strSet21.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream24 = strSet21.parallelStream();
        compilerOptions0.stripNamePrefixes = strSet21;
        compilerOptions0.aliasExternals = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strStream22);
        org.junit.Assert.assertNotNull(strStream23);
        org.junit.Assert.assertNotNull(strStream24);
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions1.setRewriteNewDateGoogNow(true);
        boolean boolean4 = compilerOptions1.extractPrototypeMemberDeclarations;
        compilerOptions1.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet7 = compilerOptions1.stripTypePrefixes;
        compilerOptions0.stripTypePrefixes = strSet7;
        compilerOptions0.removeUnusedVars = true;
        compilerOptions0.setCrossModuleCodeMotion(true);
        compilerOptions0.setNameReferenceGraphPath("java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        compilerOptions0.setLocale("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        boolean boolean9 = compilerOptions0.deadAssignmentElimination;
        boolean boolean10 = compilerOptions0.removeUnusedLocalVars;
        compilerOptions0.setSkipAllPasses(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        double double3 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder5.withOriginalPath("");
        com.google.javascript.jscomp.SourceFile sourceFile10 = builder7.buildFromCode("-1", "java.io.IOException");
        sourceFile10.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = sourceFile10.getLineOffset((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(sourceFile10);
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
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
        com.google.javascript.rhino.Node node11 = compiler0.getRoot();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler0.tracker = performanceTracker12;
        com.google.javascript.jscomp.PassConfig passConfig14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(intermediateState9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        compilerOptions0.setCollapseProperties(false);
        boolean boolean9 = compilerOptions0.inlineVariables;
        boolean boolean10 = compilerOptions0.generateExports;
        boolean boolean11 = compilerOptions0.ambiguateProperties;
        compilerOptions0.setDefineToStringLiteral("java.io.IOException: -1", "-1");
        compilerOptions0.setSyntheticBlockEndMarker("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        com.google.javascript.jscomp.SourceFile.Generator generator7 = null;
        com.google.javascript.jscomp.SourceFile sourceFile8 = builder5.buildFromGenerator("hi!", generator7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = sourceFile8.getLineOfOffset((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(sourceFile8);
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        sourceFile2.setOriginalPath("hi!");
        sourceFile2.setOriginalPath("");
        boolean boolean7 = sourceFile2.isExtern();
        int int9 = sourceFile2.getLineOfOffset((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader10 = sourceFile2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_REGEXP = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing8 = compilerOptions0.getTweakProcessing();
        compilerOptions0.setProtectHiddenSideEffects(true);
        compilerOptions0.aliasAllStrings = true;
        compilerOptions0.setCheckSuspiciousCode(false);
        compilerOptions0.setShadowVariables(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + tweakProcessing8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing8.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.setCollapseProperties(false);
        compilerOptions3.setClosurePass(true);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions3.setInputPropertyMapSerialized(byteArray16);
        compilerOptions3.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setRewriteNewDateGoogNow(true);
        boolean boolean23 = compilerOptions20.extractPrototypeMemberDeclarations;
        compilerOptions20.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet26 = compilerOptions20.stripTypePrefixes;
        compilerOptions3.aliasableStrings = strSet26;
        boolean boolean28 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet26);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup29 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup29;
        boolean boolean33 = locationMappingList1.contains((java.lang.Object) diagnosticGroup29);
        java.util.Spliterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingSpliterator34 = locationMappingList1.spliterator();
        java.util.function.UnaryOperator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingUnaryOperator35 = null;
        // The following exception was thrown during execution in test generation
        try {
            locationMappingList1.replaceAll(locationMappingUnaryOperator35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(locationMappingSpliterator34);
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.disambiguateProperties;
        compilerOptions0.setReplaceStringsPlaceholderToken("java.io.IOException: ");
        compilerOptions0.setAliasKeywords(true);
        compilerOptions0.setLineLengthThreshold((int) ' ');
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
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
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup3;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup3);
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        sourceFile2.setOriginalPath("hi!");
        sourceFile2.setOriginalPath("");
        sourceFile2.setOriginalPath("");
        int int10 = sourceFile2.getColumnOfOffset(10);
        boolean boolean11 = sourceFile2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = sourceFile2.getColumnOfOffset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.VISIBILITY;
        com.google.javascript.jscomp.DiagnosticGroups.VISIBILITY = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
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
        compilerOptions0.markAsCompiled = false;
        java.lang.String str22 = compilerOptions0.renamePrefix;
        compilerOptions0.setCheckMissingGetCssNameBlacklist("2019/07/12 07:12");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + checkLevel17 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel17.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        compilerOptions0.setMarkAsCompiled(true);
        compilerOptions0.setCheckSuspiciousCode(false);
        compilerOptions0.setRemoveUnusedLocalVars(false);
        boolean boolean14 = compilerOptions0.ambiguateProperties;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.exportTestFunctions;
        compilerOptions0.lineBreak = false;
        compilerOptions0.resetWarningsGuard();
        compilerOptions0.setMarkNoSideEffectCalls(false);
        boolean boolean9 = compilerOptions0.checkSuspiciousCode;
        boolean boolean10 = compilerOptions0.inlineVariables;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
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
        java.lang.String str19 = compilerOptions12.aliasStringsBlacklist;
        boolean boolean20 = locationMappingList9.equals((java.lang.Object) str19);
        locationMappingList9.clear();
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
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
        compilerOptions0.setDefineToDoubleLiteral("hi!", 0.0d);
        java.lang.String str19 = compilerOptions0.locale;
        compilerOptions0.enableRuntimeTypeCheck("java.io.IOException");
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions22.setRewriteNewDateGoogNow(true);
        boolean boolean25 = compilerOptions22.extractPrototypeMemberDeclarations;
        compilerOptions22.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel28 = compilerOptions22.brokenClosureRequiresLevel;
        compilerOptions22.rewriteFunctionExpressions = false;
        java.util.Set<java.lang.String> strSet31 = compilerOptions22.aliasableStrings;
        compilerOptions0.setExtraAnnotationNames(strSet31);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + checkLevel28 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel28.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.setCollapseProperties(false);
        compilerOptions3.setClosurePass(true);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions3.setInputPropertyMapSerialized(byteArray16);
        compilerOptions3.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setRewriteNewDateGoogNow(true);
        boolean boolean23 = compilerOptions20.extractPrototypeMemberDeclarations;
        compilerOptions20.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet26 = compilerOptions20.stripTypePrefixes;
        compilerOptions3.aliasableStrings = strSet26;
        boolean boolean28 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet26);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup29 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup29;
        boolean boolean33 = locationMappingList1.contains((java.lang.Object) diagnosticGroup29);
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES = diagnosticGroup29;
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CONST = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean5 = compilerOptions0.isExternExportsEnabled();
        compilerOptions0.rewriteFunctionExpressions = false;
        com.google.javascript.jscomp.CheckLevel checkLevel8 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.inlineVariables = false;
        boolean boolean11 = compilerOptions0.inlineFunctions;
        boolean boolean12 = compilerOptions0.smartNameRemoval;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + checkLevel8 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel8.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable4 = compiler1.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNull(scope3);
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str2 = sourceFile1.getOriginalPath();
        java.lang.String str4 = sourceFile1.getLine(0);
        sourceFile1.setOriginalPath("");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = sourceFile1.getLineOffset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TWEAKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TWEAKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_REGEXP = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.collapseAnonymousFunctions = false;
        compilerOptions0.setManageClosureDependencies(true);
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler9 = compilerOptions0.getAliasTransformationHandler();
        java.lang.String str10 = compilerOptions0.instrumentationTemplate;
        compilerOptions0.setRemoveAbstractMethods(false);
        compilerOptions0.setRemoveAbstractMethods(true);
        compilerOptions0.aliasAllStrings = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(aliasTransformationHandler9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        sourceFile1.clearCachedSource();
        java.lang.String str3 = sourceFile1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CONST;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setPropertyAffinity(true);
        boolean boolean7 = compilerOptions0.closurePass;
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy8 = compilerOptions0.anonymousFunctionNaming;
        compilerOptions0.setReportPath("Unversioned directory");
        compilerOptions0.optimizeReturns = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setRewriteNewDateGoogNow(true);
        boolean boolean16 = compilerOptions13.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach17 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions13.setInlineVariables(reach17);
        compilerOptions13.setPrintInputDelimiter(true);
        boolean boolean21 = compilerOptions13.closurePass;
        boolean boolean22 = compilerOptions13.shouldColorizeErrorOutput();
        com.google.javascript.jscomp.CheckLevel checkLevel23 = compilerOptions13.checkMissingGetCssNameLevel;
        compilerOptions0.setCheckGlobalNamesLevel(checkLevel23);
        compilerOptions0.setAliasableGlobals("Unversioned directory");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy8 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy8.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + reach17 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach17.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + checkLevel23 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel23.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TWEAKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_USELESS_CODE = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.TWEAKS;
        com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        boolean boolean6 = compilerOptions0.jqueryPass;
        boolean boolean7 = compilerOptions0.collapseVariableDeclarations;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        java.io.PrintStream printStream19 = new java.io.PrintStream("Unversioned directory");
        char[] charArray22 = new char[] { '4', '4' };
        printStream19.print(charArray22);
        printStream19.print((int) ' ');
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream19.write(byteArray32, (int) (byte) 0, (int) (byte) 1);
        char[] charArray42 = new char[] { ' ', '#', '4', 'a', '#', 'a' };
        printStream19.print(charArray42);
        printStream1.println(charArray42);
        printStream1.print((long) (byte) 1);
        boolean boolean47 = printStream1.checkError();
        printStream1.write((int) (byte) 1);
        printStream1.println(false);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), " #4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), " #4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[ , #, 4, a, #, a]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withOriginalPath("hi!");
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile8 = builder0.buildFromInputStream("hi!", inputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.computeFunctionSideEffects;
        boolean boolean6 = compilerOptions0.printInputDelimiter;
        compilerOptions0.syntheticBlockEndMarker = "java.io.IOException";
        compilerOptions0.enableRuntimeTypeCheck("java.io.IOException: ");
        compilerOptions0.setRemoveUnusedPrototypePropertiesInExterns(true);
        java.io.PrintStream printStream14 = new java.io.PrintStream("Unversioned directory");
        char[] charArray17 = new char[] { '4', '4' };
        printStream14.print(charArray17);
        printStream14.print((int) ' ');
        java.io.PrintStream printStream22 = new java.io.PrintStream((java.io.OutputStream) printStream14, false);
        printStream14.write((int) '#');
        printStream14.print((float) (short) 0);
        printStream14.println("java.io.IOException");
        java.util.Locale locale29 = null;
        java.io.PrintStream printStream32 = new java.io.PrintStream("Unversioned directory");
        char[] charArray35 = new char[] { '4', '4' };
        printStream32.print(charArray35);
        printStream32.print((int) ' ');
        java.io.PrintStream printStream40 = new java.io.PrintStream((java.io.OutputStream) printStream32, false);
        printStream32.write((int) '#');
        java.util.Locale locale43 = null;
        java.lang.Object[] objArray46 = new java.lang.Object[] { "Unversioned directory" };
        java.io.PrintStream printStream47 = printStream32.format(locale43, "Unversioned directory", objArray46);
        java.io.PrintStream printStream48 = printStream14.printf(locale29, "Unversioned directory", objArray46);
        printStream48.flush();
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions50.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention53 = null;
        compilerOptions50.setCodingConvention(codingConvention53);
        boolean boolean55 = compilerOptions50.generateExports;
        compilerOptions50.printInputDelimiter = false;
        compilerOptions50.setCheckSymbols(true);
        byte[] byteArray64 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        compilerOptions50.setInputVariableMapSerialized(byteArray64);
        printStream48.write(byteArray64);
        compilerOptions0.setInputPropertyMapSerialized(byteArray64);
        compilerOptions0.setAcceptConstKeyword(false);
        compilerOptions0.setReserveRawExports(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, 4]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[Unversioned directory]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[Unversioned directory]");
        org.junit.Assert.assertNotNull(printStream47);
        org.junit.Assert.assertNotNull(printStream48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[-1, 100, 10, 10]");
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        compilerOptions0.resetWarningsGuard();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet8 = compilerOptions7.stripNamePrefixes;
        byte[] byteArray9 = compilerOptions7.inputVariableMapSerialized;
        compilerOptions7.removeUnusedClassProperties = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        boolean boolean15 = compilerOptions12.extractPrototypeMemberDeclarations;
        boolean boolean16 = compilerOptions12.jqueryPass;
        compilerOptions12.collapseAnonymousFunctions = false;
        java.lang.String str19 = compilerOptions12.aliasStringsBlacklist;
        compilerOptions12.instrumentationTemplate = "java.io.IOException";
        boolean boolean22 = compilerOptions12.crossModuleCodeMotion;
        com.google.javascript.jscomp.CheckLevel checkLevel23 = compilerOptions12.checkMissingGetCssNameLevel;
        compilerOptions7.checkUnreachableCode = checkLevel23;
        compilerOptions0.aggressiveVarCheck = checkLevel23;
        boolean boolean26 = compilerOptions0.crossModuleCodeMotion;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + checkLevel23 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel23.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.checkSymbols = false;
        compilerOptions0.setCheckTypes(true);
        compilerOptions0.setSummaryDetailLevel((int) ' ');
        compilerOptions0.setRemoveUnusedLocalVars(false);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.exportTestFunctions;
        compilerOptions0.lineBreak = false;
        boolean boolean6 = compilerOptions0.optimizeParameters;
        compilerOptions0.setCrossModuleMethodMotion(false);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
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
        boolean boolean12 = compilerOptions0.inlineVariables;
        boolean boolean13 = compilerOptions0.inlineLocalFunctions;
        compilerOptions0.setRenamePrefix("java.io.IOException: Unversioned directory");
        compilerOptions0.jqueryPass = false;
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
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
        printStream8.print((float) 1L);
        printStream8.print("hi!");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(locationMappingArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sourceFile14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.flowSensitiveInlineVariables = false;
        compilerOptions0.renamePrefix = "";
        com.google.javascript.jscomp.MessageBundle messageBundle8 = null;
        compilerOptions0.messageBundle = messageBundle8;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setRewriteNewDateGoogNow(true);
        boolean boolean13 = compilerOptions10.extractPrototypeMemberDeclarations;
        compilerOptions10.convertToDottedProperties = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions16.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention19 = null;
        compilerOptions16.setCodingConvention(codingConvention19);
        compilerOptions16.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel23 = compilerOptions16.checkProvides;
        compilerOptions10.setReportUnknownTypes(checkLevel23);
        compilerOptions0.checkGlobalThisLevel = checkLevel23;
        compilerOptions0.setSkipAllPasses(false);
        compilerOptions0.setTightenTypes(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + checkLevel23 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel23.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        java.lang.String str8 = compiler0.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.gatherCssNames;
        compilerOptions0.setCheckSymbols(false);
        boolean boolean11 = compilerOptions0.exportTestFunctions;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.computeFunctionSideEffects;
        boolean boolean6 = compilerOptions0.printInputDelimiter;
        compilerOptions0.syntheticBlockEndMarker = "java.io.IOException";
        compilerOptions0.enableRuntimeTypeCheck("java.io.IOException: ");
        compilerOptions0.setRemoveUnusedPrototypePropertiesInExterns(true);
        java.io.PrintStream printStream14 = new java.io.PrintStream("Unversioned directory");
        char[] charArray17 = new char[] { '4', '4' };
        printStream14.print(charArray17);
        printStream14.print((int) ' ');
        java.io.PrintStream printStream22 = new java.io.PrintStream((java.io.OutputStream) printStream14, false);
        printStream14.write((int) '#');
        printStream14.print((float) (short) 0);
        printStream14.println("java.io.IOException");
        java.util.Locale locale29 = null;
        java.io.PrintStream printStream32 = new java.io.PrintStream("Unversioned directory");
        char[] charArray35 = new char[] { '4', '4' };
        printStream32.print(charArray35);
        printStream32.print((int) ' ');
        java.io.PrintStream printStream40 = new java.io.PrintStream((java.io.OutputStream) printStream32, false);
        printStream32.write((int) '#');
        java.util.Locale locale43 = null;
        java.lang.Object[] objArray46 = new java.lang.Object[] { "Unversioned directory" };
        java.io.PrintStream printStream47 = printStream32.format(locale43, "Unversioned directory", objArray46);
        java.io.PrintStream printStream48 = printStream14.printf(locale29, "Unversioned directory", objArray46);
        printStream48.flush();
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions50.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention53 = null;
        compilerOptions50.setCodingConvention(codingConvention53);
        boolean boolean55 = compilerOptions50.generateExports;
        compilerOptions50.printInputDelimiter = false;
        compilerOptions50.setCheckSymbols(true);
        byte[] byteArray64 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        compilerOptions50.setInputVariableMapSerialized(byteArray64);
        printStream48.write(byteArray64);
        compilerOptions0.setInputPropertyMapSerialized(byteArray64);
        compilerOptions0.setDeadAssignmentElimination(true);
        compilerOptions0.setTightenTypes(false);
        compilerOptions0.removeDeadCode = true;
        java.lang.String str74 = compilerOptions0.aliasStringsBlacklist;
        compilerOptions0.smartNameRemoval = false;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, 4]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[Unversioned directory]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[Unversioned directory]");
        org.junit.Assert.assertNotNull(printStream47);
        org.junit.Assert.assertNotNull(printStream48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[-1, 100, 10, 10]");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setInlineConstantVars(true);
        compilerOptions0.setTweakToStringLiteral("", "java.io.IOException");
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setRewriteNewDateGoogNow(true);
        boolean boolean9 = compilerOptions6.extractPrototypeMemberDeclarations;
        compilerOptions6.setCollapseProperties(false);
        compilerOptions6.setClosurePass(true);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions6.setInputPropertyMapSerialized(byteArray19);
        compilerOptions6.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.MessageBundle messageBundle23 = null;
        compilerOptions6.messageBundle = messageBundle23;
        com.google.javascript.jscomp.MessageBundle messageBundle25 = null;
        compilerOptions6.messageBundle = messageBundle25;
        compilerOptions6.lineBreak = true;
        com.google.javascript.jscomp.CheckLevel checkLevel29 = compilerOptions6.checkMissingGetCssNameLevel;
        compilerOptions0.setAggressiveVarCheck(checkLevel29);
        java.util.Map<java.lang.String, com.google.javascript.jscomp.CheckLevel> strMap31 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.setPropertyInvalidationErrors(strMap31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + checkLevel29 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel29.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = com.google.javascript.jscomp.SourceFile.builder();
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromInputStream("java.io.IOException: Unversioned directory", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
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
        compilerOptions0.setComputeFunctionSideEffects(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        boolean boolean20 = compilerOptions17.extractPrototypeMemberDeclarations;
        compilerOptions17.setCollapseProperties(false);
        compilerOptions17.setClosurePass(true);
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions17.setInputPropertyMapSerialized(byteArray30);
        compilerOptions17.setFlowSensitiveInlineVariables(true);
        boolean boolean34 = compilerOptions17.exportTestFunctions;
        compilerOptions17.closurePass = false;
        compilerOptions17.renamePrefix = "Unversioned directory";
        compilerOptions17.setMoveFunctionDeclarations(false);
        compilerOptions17.setProcessObjectPropertyString(false);
        com.google.javascript.jscomp.CheckLevel checkLevel43 = compilerOptions17.checkGlobalThisLevel;
        compilerOptions0.setCheckGlobalThisLevel(checkLevel43);
        boolean boolean45 = compilerOptions0.checkControlStructures;
        boolean boolean46 = compilerOptions0.checkTypes;
        compilerOptions0.generateExports = true;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup3);
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + checkLevel43 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel43.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.exportTestFunctions;
        compilerOptions0.lineBreak = false;
        boolean boolean6 = compilerOptions0.optimizeParameters;
        java.util.Set<java.lang.String> strSet7 = null;
        compilerOptions0.setStripTypes(strSet7);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        boolean boolean12 = compilerOptions9.extractPrototypeMemberDeclarations;
        compilerOptions9.setCollapseProperties(false);
        compilerOptions9.setClosurePass(true);
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions9.setInputPropertyMapSerialized(byteArray22);
        compilerOptions9.setFlowSensitiveInlineVariables(true);
        boolean boolean26 = compilerOptions9.exportTestFunctions;
        compilerOptions9.setTweakToNumberLiteral("java.io.IOException", (int) (short) 0);
        com.google.javascript.jscomp.CompilerOptions.Reach reach30 = com.google.javascript.jscomp.CompilerOptions.Reach.NONE;
        compilerOptions9.setInlineFunctions(reach30);
        compilerOptions0.setInlineFunctions(reach30);
        compilerOptions0.setTweakToStringLiteral("java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12", "java.io.IOException: ");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + reach30 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.NONE + "'", reach30.equals(com.google.javascript.jscomp.CompilerOptions.Reach.NONE));
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        compilerOptions0.setDefineToDoubleLiteral("java.io.IOException: ", (double) 0L);
        boolean boolean11 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.enableRuntimeTypeCheck("");
        compilerOptions0.setCheckSymbols(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
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
        java.util.Set<java.lang.String> strSet24 = compilerOptions0.stripTypePrefixes;
        com.google.javascript.jscomp.CheckLevel checkLevel25 = compilerOptions0.checkGlobalNamesLevel;
        boolean boolean26 = compilerOptions0.crossModuleCodeMotion;
        compilerOptions0.setCollapseProperties(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + checkLevel25 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel25.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CONST = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel6 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.setDevirtualizePrototypeMethods(true);
        com.google.javascript.jscomp.MessageBundle messageBundle9 = null;
        compilerOptions0.setMessageBundle(messageBundle9);
        compilerOptions0.setAcceptConstKeyword(false);
        compilerOptions0.setExternExports(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel6 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel6.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("", throwable1);
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException();
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.String str6 = iOException4.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException" + "'", str6, "java.io.IOException");
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions0.setInputPropertyMapSerialized(byteArray13);
        compilerOptions0.setFlowSensitiveInlineVariables(true);
        boolean boolean17 = compilerOptions0.exportTestFunctions;
        compilerOptions0.setCheckMissingGetCssNameBlacklist("java.io.IOException: ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        printStream1.print(0);
        printStream1.print((float) (-1));
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.reserveRawExports;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel9 = null;
        compilerOptions0.sourceMapDetailLevel = detailLevel9;
        compilerOptions0.setSourceMapOutputPath("");
        compilerOptions0.setManageClosureDependencies(false);
        compilerOptions0.optimizeParameters = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention20 = null;
        compilerOptions17.setCodingConvention(codingConvention20);
        compilerOptions17.setPropertyAffinity(true);
        boolean boolean24 = compilerOptions17.closurePass;
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy25 = compilerOptions17.anonymousFunctionNaming;
        compilerOptions0.anonymousFunctionNaming = anonymousFunctionNamingPolicy25;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy25 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy25.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        sourceFile2.setOriginalPath("hi!");
        sourceFile2.setOriginalPath("");
        sourceFile2.setOriginalPath("");
        boolean boolean9 = sourceFile2.isExtern();
        java.lang.String str11 = sourceFile2.getLine((int) (byte) 1);
        boolean boolean12 = sourceFile2.isExtern();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
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
        boolean boolean33 = compilerOptions0.markNoSideEffectCalls;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(byteArray10);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup11);
        org.junit.Assert.assertTrue("'" + checkLevel20 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel20.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel6 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.setDevirtualizePrototypeMethods(true);
        com.google.javascript.jscomp.CheckLevel checkLevel9 = compilerOptions0.checkMissingGetCssNameLevel;
        compilerOptions0.locale = "java.io.IOException: ";
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        boolean boolean15 = compilerOptions12.extractPrototypeMemberDeclarations;
        boolean boolean16 = compilerOptions12.jqueryPass;
        compilerOptions12.collapseAnonymousFunctions = false;
        java.lang.String str19 = compilerOptions12.aliasStringsBlacklist;
        compilerOptions12.inlineGetters = false;
        boolean boolean22 = compilerOptions12.exportTestFunctions;
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.setRewriteNewDateGoogNow(true);
        boolean boolean26 = compilerOptions23.extractPrototypeMemberDeclarations;
        compilerOptions23.setCollapseProperties(false);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy29 = compilerOptions23.variableRenaming;
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet31 = compilerOptions30.stripNamePrefixes;
        byte[] byteArray32 = compilerOptions30.inputVariableMapSerialized;
        compilerOptions30.checkSymbols = false;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler35 = compilerOptions30.getAliasTransformationHandler();
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy36 = compilerOptions30.propertyRenaming;
        compilerOptions12.setRenamingPolicy(variableRenamingPolicy29, propertyRenamingPolicy36);
        compilerOptions0.propertyRenaming = propertyRenamingPolicy36;
        compilerOptions0.setOptimizeReturns(false);
        com.google.javascript.jscomp.MessageBundle messageBundle41 = null;
        compilerOptions0.messageBundle = messageBundle41;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel6 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel6.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel9 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel9.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy29 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.OFF + "'", variableRenamingPolicy29.equals(com.google.javascript.jscomp.VariableRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(byteArray32);
        org.junit.Assert.assertNotNull(aliasTransformationHandler35);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy36 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy36.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
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
        com.google.javascript.jscomp.JsAst jsAst15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler14.addNewScript(jsAst15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNull(diagnosticGroup3);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup5);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null, null, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null, null, hi!]");
        org.junit.Assert.assertNotNull(printStream11);
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("// Input %num%", "// Input %num%", "-1");
        java.lang.String str4 = sourceFile3.getCode();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
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
        com.google.javascript.jscomp.SourceFile sourceFile14 = builder11.buildFromCode("java.io.IOException: Unversioned directory", "java.io.IOException: Unversioned directory");
        com.google.javascript.jscomp.SourceFile.Generator generator16 = null;
        com.google.javascript.jscomp.SourceFile sourceFile17 = builder11.buildFromGenerator("java.io.IOException: Unversioned directory", generator16);
        boolean boolean18 = sourceFile17.isExtern();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(sourceFile14);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        boolean boolean8 = compilerOptions0.closurePass;
        com.google.javascript.jscomp.MessageBundle messageBundle9 = null;
        compilerOptions0.messageBundle = messageBundle9;
        compilerOptions0.setDeadAssignmentElimination(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setRewriteNewDateGoogNow(true);
        boolean boolean17 = compilerOptions14.extractPrototypeMemberDeclarations;
        compilerOptions14.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet20 = compilerOptions14.stripTypePrefixes;
        compilerOptions13.stripTypePrefixes = strSet20;
        compilerOptions0.setAliasableStrings(strSet20);
        compilerOptions0.checkSymbols = true;
        compilerOptions0.setRuntimeTypeCheck(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
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
        com.google.javascript.jscomp.CheckLevel checkLevel12 = compilerOptions0.aggressiveVarCheck;
        compilerOptions0.setExtractPrototypeMemberDeclarations(false);
        compilerOptions0.setAliasableGlobals("java.io.IOException");
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_REGEXP = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.rhino.Node node3 = compiler1.getRoot();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = compiler1.isIdeMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        compilerOptions0.locale = "2019/07/12 07:12";
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compilerOptions0.cssRenamingMap;
        compilerOptions0.setRuntimeTypeCheck(true);
        compilerOptions0.inlineVariables = false;
        compilerOptions0.aliasAllStrings = false;
        boolean boolean14 = compilerOptions0.inlineVariables;
        org.junit.Assert.assertNull(cssRenamingMap7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.convertToDottedProperties = true;
        boolean boolean9 = compilerOptions3.inlineConstantVars;
        boolean boolean10 = compilerOptions3.extractPrototypeMemberDeclarations;
        boolean boolean11 = compilerOptions3.reserveRawExports;
        boolean boolean12 = locationMappingList1.remove((java.lang.Object) boolean11);
        java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor13 = locationMappingList1.listIterator();
        java.util.Iterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor14 = locationMappingList1.iterator();
        java.util.function.UnaryOperator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingUnaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            locationMappingList1.replaceAll(locationMappingUnaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locationMappingItor13);
        org.junit.Assert.assertNotNull(locationMappingItor14);
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.flowSensitiveInlineVariables = false;
        compilerOptions0.renamePrefix = "";
        compilerOptions0.closurePass = false;
        compilerOptions0.setAliasStringsBlacklist("Unversioned directory");
        compilerOptions0.setCollapseVariableDeclarations(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
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
        compilerOptions20.setRewriteNewDateGoogNow(true);
        boolean boolean23 = compilerOptions20.extractPrototypeMemberDeclarations;
        compilerOptions20.setCollapseProperties(false);
        compilerOptions20.setClosurePass(true);
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions20.setInputPropertyMapSerialized(byteArray33);
        compilerOptions20.setFlowSensitiveInlineVariables(true);
        boolean boolean37 = compilerOptions20.exportTestFunctions;
        compilerOptions20.closurePass = false;
        compilerOptions20.renamePrefix = "Unversioned directory";
        compilerOptions20.setMoveFunctionDeclarations(false);
        java.util.Set<java.lang.String> strSet44 = compilerOptions20.stripTypePrefixes;
        compilerOptions0.stripNameSuffixes = strSet44;
        compilerOptions0.labelRenaming = true;
        java.lang.String str48 = compilerOptions0.checkMissingGetCssNameBlacklist;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + checkLevel17 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel17.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setPropertyAffinity(true);
        boolean boolean7 = compilerOptions0.closurePass;
        compilerOptions0.setCheckCaja(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet11 = compilerOptions10.stripNamePrefixes;
        byte[] byteArray12 = compilerOptions10.inputVariableMapSerialized;
        com.google.javascript.jscomp.CompilerOptions.Reach reach13 = com.google.javascript.jscomp.CompilerOptions.Reach.NONE;
        compilerOptions10.setInlineFunctions(reach13);
        compilerOptions0.setRemoveUnusedVariables(reach13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions16.setRewriteNewDateGoogNow(true);
        boolean boolean19 = compilerOptions16.extractPrototypeMemberDeclarations;
        compilerOptions16.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel22 = compilerOptions16.checkGlobalThisLevel;
        compilerOptions16.setDevirtualizePrototypeMethods(true);
        com.google.javascript.jscomp.CheckLevel checkLevel25 = compilerOptions16.checkMissingGetCssNameLevel;
        java.util.Set<java.lang.String> strSet26 = compilerOptions16.stripNamePrefixes;
        compilerOptions0.setReplaceStringsReservedStrings(strSet26);
        compilerOptions0.setRenamePrefixNamespace("");
        compilerOptions0.removeUnusedClassProperties = false;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertTrue("'" + reach13 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.NONE + "'", reach13.equals(com.google.javascript.jscomp.CompilerOptions.Reach.NONE));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + checkLevel22 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel22.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel25 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel25.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "java.io.IOException: ");
        boolean boolean6 = locationMappingList1.remove((java.lang.Object) "hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet8 = compilerOptions7.stripNamePrefixes;
        byte[] byteArray9 = compilerOptions7.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup10;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention15 = null;
        compilerOptions12.setCodingConvention(codingConvention15);
        compilerOptions12.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel19 = compilerOptions12.checkProvides;
        compilerOptions7.setWarningLevel(diagnosticGroup10, checkLevel19);
        java.util.Set<java.lang.String> strSet21 = compilerOptions7.stripNamePrefixes;
        boolean boolean22 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet21);
        java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor23 = locationMappingList1.listIterator();
        java.util.Spliterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingSpliterator24 = locationMappingList1.spliterator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet26 = compilerOptions25.stripNamePrefixes;
        byte[] byteArray27 = compilerOptions25.inputVariableMapSerialized;
        boolean boolean28 = compilerOptions25.exportTestFunctions;
        compilerOptions25.setExtractPrototypeMemberDeclarations(true);
        compilerOptions25.reserveRawExports = false;
        compilerOptions25.crossModuleCodeMotion = false;
        com.google.javascript.jscomp.CheckLevel checkLevel35 = compilerOptions25.aggressiveVarCheck;
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions36.setRewriteNewDateGoogNow(true);
        boolean boolean39 = compilerOptions36.extractPrototypeMemberDeclarations;
        boolean boolean40 = compilerOptions36.jqueryPass;
        boolean boolean41 = compilerOptions36.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions42.setLabelRenaming(true);
        compilerOptions42.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean47 = compilerOptions42.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format48 = compilerOptions42.sourceMapFormat;
        compilerOptions36.sourceMapFormat = format48;
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions50.setRewriteNewDateGoogNow(true);
        boolean boolean53 = compilerOptions50.extractPrototypeMemberDeclarations;
        compilerOptions50.setCollapseProperties(false);
        boolean boolean56 = compilerOptions50.printInputDelimiter;
        com.google.javascript.jscomp.ErrorFormat errorFormat57 = compilerOptions50.errorFormat;
        compilerOptions36.setErrorFormat(errorFormat57);
        compilerOptions25.setErrorFormat(errorFormat57);
        boolean boolean60 = locationMappingList1.remove((java.lang.Object) compilerOptions25);
        locationMappingList1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor63 = locationMappingList1.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(byteArray9);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup10);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locationMappingItor23);
        org.junit.Assert.assertNotNull(locationMappingSpliterator24);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(byteArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + checkLevel35 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel35.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(format48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(errorFormat57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.enableExternExports(true);
        compilerOptions0.setCrossModuleCodeMotion(false);
        java.util.Set<java.lang.String> strSet5 = compilerOptions0.stripNamePrefixes;
        compilerOptions0.setCheckControlStructures(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.setLabelRenaming(true);
        compilerOptions8.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CheckLevel checkLevel13 = compilerOptions8.checkGlobalThisLevel;
        compilerOptions8.setExportTestFunctions(false);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing16 = compilerOptions8.getTweakProcessing();
        compilerOptions0.setTweakProcessing(tweakProcessing16);
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler18 = compilerOptions0.getAliasTransformationHandler();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.jscomp.CompilerOptions.AliasTransformation> aliasTransformationSourcePosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerOptions.AliasTransformation aliasTransformation21 = aliasTransformationHandler18.logAliasTransformation("Unversioned directory", aliasTransformationSourcePosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + checkLevel13 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel13.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + tweakProcessing16 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing16.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertNotNull(aliasTransformationHandler18);
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TWEAKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_REGEXP = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.gatherCssNames;
        boolean boolean9 = compilerOptions0.markAsCompiled;
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing10 = compilerOptions0.getTweakProcessing();
        compilerOptions0.setTweakToNumberLiteral("java.io.IOException", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + tweakProcessing10 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing10.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TWEAKS = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        com.google.javascript.jscomp.PassConfig passConfig3 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        compilerOptions0.setRemoveUnusedVars(true);
        compilerOptions0.removeUnusedClassProperties = true;
        boolean boolean10 = compilerOptions0.aliasAllStrings;
        compilerOptions0.setTweakToBooleanLiteral("java.io.IOException", false);
        com.google.javascript.jscomp.WarningsGuard warningsGuard14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.addWarningsGuard(warningsGuard14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        com.google.javascript.jscomp.SourceFile.Builder builder1 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator3 = null;
        com.google.javascript.jscomp.SourceFile sourceFile4 = builder1.buildFromGenerator("hi!", generator3);
        java.nio.charset.Charset charset5 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder6 = builder1.withCharset(charset5);
        com.google.javascript.jscomp.SourceFile.Generator generator8 = null;
        com.google.javascript.jscomp.SourceFile sourceFile9 = builder6.buildFromGenerator("hi!", generator8);
        com.google.javascript.jscomp.SourceFile.Builder builder11 = builder6.withOriginalPath("");
        com.google.javascript.jscomp.SourceFile.Builder builder13 = builder11.withOriginalPath("java.io.IOException: ");
        com.google.javascript.jscomp.SourceFile.Builder builder15 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator17 = null;
        com.google.javascript.jscomp.SourceFile sourceFile18 = builder15.buildFromGenerator("hi!", generator17);
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder20 = builder15.withCharset(charset19);
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder22 = builder15.withCharset(charset21);
        com.google.javascript.jscomp.SourceFile.Builder builder24 = builder15.withOriginalPath("hi!");
        com.google.javascript.jscomp.SourceFile sourceFile27 = builder15.buildFromCode("// Input %num%", "hi!");
        boolean boolean28 = sourceFile27.isExtern();
        java.io.Reader reader29 = sourceFile27.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile30 = builder13.buildFromReader("java.io.IOException: -1", reader29);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile31 = com.google.javascript.jscomp.SourceFile.fromReader("", reader29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(sourceFile18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(sourceFile27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(reader29);
        org.junit.Assert.assertNotNull(sourceFile30);
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        boolean boolean8 = compilerOptions0.closurePass;
        com.google.javascript.jscomp.MessageBundle messageBundle9 = null;
        compilerOptions0.messageBundle = messageBundle9;
        compilerOptions0.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap13 = null;
        compilerOptions0.cssRenamingMap = cssRenamingMap13;
        java.util.Map<java.lang.String, com.google.javascript.jscomp.CheckLevel> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.setPropertyInvalidationErrors(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions24.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention27 = null;
        compilerOptions24.setCodingConvention(codingConvention27);
        compilerOptions24.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel31 = compilerOptions24.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray32 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList33 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList33, locationMappingArray32);
        compilerOptions24.sourceMapLocationMappings = locationMappingList33;
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions36.setRewriteNewDateGoogNow(true);
        boolean boolean39 = compilerOptions36.extractPrototypeMemberDeclarations;
        boolean boolean40 = compilerOptions36.jqueryPass;
        compilerOptions36.collapseAnonymousFunctions = false;
        boolean boolean43 = compilerOptions36.checkTypes;
        compilerOptions36.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CheckLevel checkLevel46 = compilerOptions36.checkProvides;
        compilerOptions24.checkUnreachableCode = checkLevel46;
        compilerOptions0.aggressiveVarCheck = checkLevel46;
        compilerOptions0.renamePrefixNamespace = "java.io.IOException: ";
        com.google.javascript.jscomp.SourceMap.Format format51 = compilerOptions0.sourceMapFormat;
        compilerOptions0.setSmartNameRemoval(true);
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + checkLevel22 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel22.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel31 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel31.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + checkLevel46 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel46.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(format51);
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
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
        java.util.Set<java.lang.String> strSet18 = compilerOptions0.stripTypes;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertTrue("'" + checkLevel17 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel17.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions54.setRewriteNewDateGoogNow(true);
        boolean boolean57 = compilerOptions54.extractPrototypeMemberDeclarations;
        compilerOptions54.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel60 = compilerOptions54.brokenClosureRequiresLevel;
        java.util.Set<java.lang.String> strSet61 = compilerOptions54.stripTypes;
        compilerOptions0.setIdGenerators(strSet61);
        java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList63 = compilerOptions0.sourceMapLocationMappings;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping65 = locationMappingList63.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + checkLevel46 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel46.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + checkLevel60 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel60.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNotNull(locationMappingList63);
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.enableExternExports(true);
        compilerOptions0.setCrossModuleCodeMotion(false);
        java.util.Set<java.lang.String> strSet5 = compilerOptions0.stripNamePrefixes;
        boolean boolean6 = compilerOptions0.removeUnusedLocalVars;
        com.google.javascript.jscomp.DependencyOptions dependencyOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.setDependencyOptions(dependencyOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions54.setRewriteNewDateGoogNow(true);
        boolean boolean57 = compilerOptions54.extractPrototypeMemberDeclarations;
        compilerOptions54.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel60 = compilerOptions54.brokenClosureRequiresLevel;
        java.util.Set<java.lang.String> strSet61 = compilerOptions54.stripTypes;
        compilerOptions0.setIdGenerators(strSet61);
        java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList63 = compilerOptions0.sourceMapLocationMappings;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping65 = locationMappingList63.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + checkLevel46 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel46.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + checkLevel60 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel60.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNotNull(locationMappingList63);
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
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
        compilerOptions0.setDisambiguateProperties(true);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap34 = null;
        compilerOptions0.setCssRenamingMap(cssRenamingMap34);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + checkLevel29 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel29.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup3;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = com.google.javascript.jscomp.DiagnosticGroups.TWEAKS;
        com.google.javascript.jscomp.SourceFile.Builder builder6 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator8 = null;
        com.google.javascript.jscomp.SourceFile sourceFile9 = builder6.buildFromGenerator("hi!", generator8);
        java.lang.Object[] objArray10 = new java.lang.Object[] { diagnosticGroup3, diagnosticGroup5, sourceFile9 };
        java.io.PrintStream printStream11 = printStream1.printf("2019/07/12 07:12", objArray10);
        printStream11.print(100);
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray15 = compiler14.getWarnings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNull(diagnosticGroup3);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup5);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null, null, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null, null, hi!]");
        org.junit.Assert.assertNotNull(printStream11);
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap5 = null;
        compilerOptions0.setCssRenamingMap(cssRenamingMap5);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.reportMissingOverride;
        boolean boolean8 = compilerOptions0.smartNameRemoval;
        compilerOptions0.setIgnoreCajaProperties(false);
        compilerOptions0.setAliasStringsBlacklist("Unversioned directory");
        compilerOptions0.crossModuleMethodMotion = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions15.setRewriteNewDateGoogNow(true);
        boolean boolean18 = compilerOptions15.extractPrototypeMemberDeclarations;
        compilerOptions15.setCollapseProperties(false);
        compilerOptions15.setClosurePass(true);
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions15.setInputPropertyMapSerialized(byteArray28);
        compilerOptions15.setFlowSensitiveInlineVariables(true);
        boolean boolean32 = compilerOptions15.exportTestFunctions;
        compilerOptions15.closurePass = false;
        compilerOptions15.renamePrefix = "Unversioned directory";
        compilerOptions15.setMoveFunctionDeclarations(false);
        java.util.Set<java.lang.String> strSet39 = compilerOptions15.stripTypePrefixes;
        compilerOptions15.setRemoveUnusedClassProperties(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions42.setRewriteNewDateGoogNow(true);
        boolean boolean45 = compilerOptions42.extractPrototypeMemberDeclarations;
        boolean boolean46 = compilerOptions42.jqueryPass;
        compilerOptions42.collapseAnonymousFunctions = false;
        java.lang.String str49 = compilerOptions42.aliasStringsBlacklist;
        compilerOptions42.inlineGetters = false;
        boolean boolean52 = compilerOptions42.exportTestFunctions;
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions53.setRewriteNewDateGoogNow(true);
        boolean boolean56 = compilerOptions53.extractPrototypeMemberDeclarations;
        compilerOptions53.setCollapseProperties(false);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy59 = compilerOptions53.variableRenaming;
        com.google.javascript.jscomp.CompilerOptions compilerOptions60 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet61 = compilerOptions60.stripNamePrefixes;
        byte[] byteArray62 = compilerOptions60.inputVariableMapSerialized;
        compilerOptions60.checkSymbols = false;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler65 = compilerOptions60.getAliasTransformationHandler();
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy66 = compilerOptions60.propertyRenaming;
        compilerOptions42.setRenamingPolicy(variableRenamingPolicy59, propertyRenamingPolicy66);
        compilerOptions15.propertyRenaming = propertyRenamingPolicy66;
        compilerOptions0.propertyRenaming = propertyRenamingPolicy66;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy59 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.OFF + "'", variableRenamingPolicy59.equals(com.google.javascript.jscomp.VariableRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNull(byteArray62);
        org.junit.Assert.assertNotNull(aliasTransformationHandler65);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy66 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy66.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("java.io.IOException: java.io.IOException: 2019/07/12 07:12", "2019/07/12 07:12", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        compilerOptions0.crossModuleCodeMotion = false;
        java.lang.String str7 = compilerOptions0.checkMissingGetCssNameBlacklist;
        boolean boolean8 = compilerOptions0.preferLineBreakAtEndOfFile;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        boolean boolean8 = compilerOptions0.closurePass;
        com.google.javascript.jscomp.MessageBundle messageBundle9 = null;
        compilerOptions0.messageBundle = messageBundle9;
        compilerOptions0.collapseVariableDeclarations = true;
        boolean boolean13 = compilerOptions0.removeUnusedPrototypeProperties;
        compilerOptions0.setTweakToBooleanLiteral("java.io.IOException: java.io.IOException: 2019/07/12 07:12", false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_REGEXP = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("hi!");
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile12 = builder9.buildFromInputStream("Unversioned directory", inputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        compilerOptions0.locale = "2019/07/12 07:12";
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
        compilerOptions0.setReplaceStringsReservedStrings(strSet33);
        compilerOptions0.rewriteFunctionExpressions = false;
        compilerOptions0.setAcceptConstKeyword(true);
        org.junit.Assert.assertNotNull(locationMappingArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setPropertyAffinity(true);
        compilerOptions0.setCrossModuleCodeMotion(false);
        compilerOptions0.preferLineBreakAtEndOfFile = true;
        boolean boolean11 = compilerOptions0.convertToDottedProperties;
        compilerOptions0.setSyntheticBlockStartMarker("-1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("", "java.io.IOException: Unversioned directory");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
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
        compilerOptions0.setCollapseProperties(false);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy22 = compilerOptions0.variableRenaming;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy22 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.OFF + "'", variableRenamingPolicy22.equals(com.google.javascript.jscomp.VariableRenamingPolicy.OFF));
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        java.io.PrintStream printStream19 = new java.io.PrintStream("Unversioned directory");
        char[] charArray22 = new char[] { '4', '4' };
        printStream19.print(charArray22);
        printStream19.print((int) ' ');
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream19.write(byteArray32, (int) (byte) 0, (int) (byte) 1);
        char[] charArray42 = new char[] { ' ', '#', '4', 'a', '#', 'a' };
        printStream19.print(charArray42);
        printStream1.println(charArray42);
        printStream1.println((long) '#');
        printStream1.close();
        printStream1.println((float) (byte) 10);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), " #4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), " #4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[ , #, 4, a, #, a]");
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing0 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF;
        boolean boolean1 = tweakProcessing0.shouldStrip();
        boolean boolean2 = tweakProcessing0.shouldStrip();
        org.junit.Assert.assertTrue("'" + tweakProcessing0 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing0.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setRewriteNewDateGoogNow(true);
        boolean boolean9 = compilerOptions6.extractPrototypeMemberDeclarations;
        compilerOptions6.setCollapseProperties(false);
        compilerOptions6.setClosurePass(true);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions6.setInputPropertyMapSerialized(byteArray19);
        com.google.javascript.jscomp.CheckLevel checkLevel21 = compilerOptions6.checkMissingGetCssNameLevel;
        compilerOptions0.checkGlobalThisLevel = checkLevel21;
        compilerOptions0.removeUnusedLocalVars = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + checkLevel21 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel21.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_REGEXP = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "java.io.IOException: ");
        boolean boolean6 = locationMappingList1.remove((java.lang.Object) "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping7 = null;
        boolean boolean8 = locationMappingList1.add(locationMapping7);
        java.lang.Object[] objArray9 = locationMappingList1.toArray();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet11 = compilerOptions10.stripNamePrefixes;
        byte[] byteArray12 = compilerOptions10.inputVariableMapSerialized;
        boolean boolean13 = compilerOptions10.exportTestFunctions;
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setLabelRenaming(true);
        compilerOptions14.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CheckLevel checkLevel19 = compilerOptions14.checkGlobalThisLevel;
        compilerOptions10.setCheckGlobalNamesLevel(checkLevel19);
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions21.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention24 = null;
        compilerOptions21.setCodingConvention(codingConvention24);
        boolean boolean26 = compilerOptions21.computeFunctionSideEffects;
        boolean boolean27 = compilerOptions21.printInputDelimiter;
        compilerOptions21.setGeneratePseudoNames(true);
        boolean boolean30 = compilerOptions21.disambiguateProperties;
        java.util.Set<java.lang.String> strSet31 = compilerOptions21.aliasableStrings;
        compilerOptions10.stripNameSuffixes = strSet31;
        boolean boolean33 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet31);
        java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor34 = locationMappingList1.listIterator();
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[null]");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(locationMappingItor34);
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.checkSymbols = false;
        compilerOptions0.setOutputJsStringUsage(false);
        com.google.javascript.jscomp.SourceMap.Format format7 = compilerOptions0.sourceMapFormat;
        compilerOptions0.setReserveRawExports(false);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(format7);
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        com.google.javascript.jscomp.CompilerOptions.Reach reach3 = com.google.javascript.jscomp.CompilerOptions.Reach.NONE;
        compilerOptions0.setInlineFunctions(reach3);
        compilerOptions0.setRecordFunctionInformation(true);
        compilerOptions0.setExtractPrototypeMemberDeclarations(true);
        compilerOptions0.inlineFunctions = false;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + reach3 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.NONE + "'", reach3.equals(com.google.javascript.jscomp.CompilerOptions.Reach.NONE));
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
        com.google.javascript.jscomp.DiagnosticGroups.TYPE_INVALIDATION = diagnosticGroup0;
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention20 = null;
        compilerOptions17.setCodingConvention(codingConvention20);
        boolean boolean22 = compilerOptions17.generateExports;
        compilerOptions17.gatherCssNames = false;
        boolean boolean25 = compilerOptions17.optimizeReturns;
        compilerOptions17.smartNameRemoval = true;
        java.util.Set<java.lang.String> strSet28 = compilerOptions17.aliasableStrings;
        compilerOptions17.generateExports = false;
        boolean boolean31 = compilerOptions17.assumeStrictThis();
        boolean boolean32 = compilerOptions17.markNoSideEffectCalls;
        java.util.Set<java.lang.String> strSet33 = compilerOptions17.stripNamePrefixes;
        com.google.javascript.jscomp.CheckLevel checkLevel34 = compilerOptions17.brokenClosureRequiresLevel;
        compilerOptions0.setReportUnknownTypes(checkLevel34);
        compilerOptions0.setComputeFunctionSideEffects(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel13 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel13.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + checkLevel34 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel34.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet6 = compilerOptions0.stripTypePrefixes;
        com.google.javascript.jscomp.CheckLevel checkLevel7 = null;
        compilerOptions0.setCheckGlobalThisLevel(checkLevel7);
        com.google.javascript.jscomp.SourceMap.Format format9 = compilerOptions0.sourceMapFormat;
        compilerOptions0.setOutputCharset("java.io.IOException: -1");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(format9);
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        com.google.javascript.jscomp.CompilerOptions.Reach reach3 = com.google.javascript.jscomp.CompilerOptions.Reach.NONE;
        compilerOptions0.setInlineFunctions(reach3);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel5 = null;
        compilerOptions0.sourceMapDetailLevel = detailLevel5;
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions7.setLabelRenaming(true);
        compilerOptions7.reserveRawExports = true;
        compilerOptions7.setCollapsePropertiesOnExternTypes(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet15 = compilerOptions14.stripNamePrefixes;
        byte[] byteArray16 = compilerOptions14.inputVariableMapSerialized;
        compilerOptions14.checkSymbols = false;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler19 = compilerOptions14.getAliasTransformationHandler();
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy20 = compilerOptions14.propertyRenaming;
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions21.setRewriteNewDateGoogNow(true);
        boolean boolean24 = compilerOptions21.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach25 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions21.setInlineVariables(reach25);
        compilerOptions21.setPrintInputDelimiter(true);
        boolean boolean29 = compilerOptions21.closurePass;
        com.google.javascript.jscomp.MessageBundle messageBundle30 = null;
        compilerOptions21.messageBundle = messageBundle30;
        compilerOptions21.setDeadAssignmentElimination(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions35.setRewriteNewDateGoogNow(true);
        boolean boolean38 = compilerOptions35.extractPrototypeMemberDeclarations;
        compilerOptions35.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet41 = compilerOptions35.stripTypePrefixes;
        compilerOptions34.stripTypePrefixes = strSet41;
        compilerOptions21.setAliasableStrings(strSet41);
        compilerOptions14.stripTypePrefixes = strSet41;
        compilerOptions7.setStripNameSuffixes(strSet41);
        compilerOptions0.setAliasableStrings(strSet41);
        compilerOptions0.setPrettyPrint(true);
        compilerOptions0.setRemoveAbstractMethods(true);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + reach3 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.NONE + "'", reach3.equals(com.google.javascript.jscomp.CompilerOptions.Reach.NONE));
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertNotNull(aliasTransformationHandler19);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy20 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy20.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + reach25 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach25.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strSet41);
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setDefineToBooleanLiteral("hi!", true);
        compilerOptions0.convertToDottedProperties = false;
        compilerOptions0.setExternExportsPath("java.io.IOException");
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str2 = sourceFile1.getOriginalPath();
        java.lang.String str4 = sourceFile1.getLine(0);
        int int6 = sourceFile1.getColumnOfOffset(0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = sourceFile1.getLineOffset((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
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
        printStream11.print('4');
        java.io.PrintStream printStream16 = printStream11.append('#');
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream19 = new java.io.PrintStream((java.io.OutputStream) printStream11, true, "2019/07/12 07:12");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 2019/07/12 07:12");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNull(diagnosticGroup3);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup5);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null, null, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null, null, hi!]");
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertNotNull(printStream16);
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TWEAKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12", "java.io.IOException: Unversioned directory");
        org.junit.Assert.assertNotNull(sourceFile2);
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
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
        com.google.javascript.jscomp.CompilerOptions.Reach reach21 = com.google.javascript.jscomp.CompilerOptions.Reach.NONE;
        compilerOptions0.setInlineFunctions(reach21);
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention26 = null;
        compilerOptions23.setCodingConvention(codingConvention26);
        compilerOptions23.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel30 = compilerOptions23.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray31 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList32 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList32, locationMappingArray31);
        compilerOptions23.sourceMapLocationMappings = locationMappingList32;
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions35.setRewriteNewDateGoogNow(true);
        boolean boolean38 = compilerOptions35.extractPrototypeMemberDeclarations;
        boolean boolean39 = compilerOptions35.jqueryPass;
        compilerOptions35.collapseAnonymousFunctions = false;
        boolean boolean42 = compilerOptions35.checkTypes;
        compilerOptions35.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CheckLevel checkLevel45 = compilerOptions35.checkProvides;
        compilerOptions23.checkUnreachableCode = checkLevel45;
        compilerOptions23.rewriteFunctionExpressions = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions49.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention52 = null;
        compilerOptions49.setCodingConvention(codingConvention52);
        compilerOptions49.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet57 = compilerOptions56.stripNamePrefixes;
        compilerOptions49.setIdGenerators(strSet57);
        com.google.javascript.jscomp.CompilerOptions compilerOptions59 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions59.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention62 = null;
        compilerOptions59.setCodingConvention(codingConvention62);
        compilerOptions59.setGeneratePseudoNames(true);
        compilerOptions59.inlineLocalFunctions = false;
        compilerOptions59.setIdeMode(true);
        compilerOptions59.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions72 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions72.setRewriteNewDateGoogNow(true);
        boolean boolean75 = compilerOptions72.extractPrototypeMemberDeclarations;
        compilerOptions72.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel78 = compilerOptions72.checkGlobalThisLevel;
        compilerOptions59.checkMissingReturn = checkLevel78;
        compilerOptions49.aggressiveVarCheck = checkLevel78;
        compilerOptions23.setCheckUnreachableCode(checkLevel78);
        compilerOptions0.setReportMissingOverride(checkLevel78);
        compilerOptions0.setTweakToStringLiteral("// Input %num%", "java.io.IOException: Unversioned directory");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + reach21 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.NONE + "'", reach21.equals(com.google.javascript.jscomp.CompilerOptions.Reach.NONE));
        org.junit.Assert.assertTrue("'" + checkLevel30 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel30.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + checkLevel45 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel45.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + checkLevel78 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel78.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        boolean boolean8 = compilerOptions0.closurePass;
        compilerOptions0.setOutputCharset("java.io.IOException");
        compilerOptions0.reserveRawExports = true;
        compilerOptions0.setCheckControlStructures(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
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
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap50 = null;
        compilerOptions0.setCustomPasses(customPassExecutionTimeMultimap50);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions54.setRewriteNewDateGoogNow(true);
        boolean boolean57 = compilerOptions54.extractPrototypeMemberDeclarations;
        compilerOptions54.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel60 = compilerOptions54.checkGlobalThisLevel;
        compilerOptions54.setMoveFunctionDeclarations(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions63.setRewriteNewDateGoogNow(true);
        boolean boolean66 = compilerOptions63.extractPrototypeMemberDeclarations;
        boolean boolean67 = compilerOptions63.jqueryPass;
        compilerOptions63.collapseAnonymousFunctions = false;
        boolean boolean70 = compilerOptions63.checkTypes;
        compilerOptions63.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions73 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions73.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention76 = null;
        compilerOptions73.setCodingConvention(codingConvention76);
        compilerOptions73.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions80 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet81 = compilerOptions80.stripNamePrefixes;
        compilerOptions73.setIdGenerators(strSet81);
        compilerOptions63.setStripNameSuffixes(strSet81);
        compilerOptions54.stripTypePrefixes = strSet81;
        compilerOptions0.stripTypePrefixes = strSet81;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + checkLevel46 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel46.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + checkLevel60 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel60.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strSet81);
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS;
        com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TWEAKS = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        boolean boolean8 = compilerOptions0.closurePass;
        com.google.javascript.jscomp.MessageBundle messageBundle9 = null;
        compilerOptions0.messageBundle = messageBundle9;
        compilerOptions0.setDeadAssignmentElimination(false);
        java.lang.String str13 = compilerOptions0.checkMissingGetCssNameBlacklist;
        compilerOptions0.setRemoveUnusedLocalVars(true);
        boolean boolean16 = compilerOptions0.optimizeParameters;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.disambiguateProperties;
        boolean boolean4 = compilerOptions0.deadAssignmentElimination;
        compilerOptions0.setPropertyAffinity(true);
        compilerOptions0.setCollapseAnonymousFunctions(false);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withOriginalPath("2019/07/12 07:12");
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile8 = builder0.buildFromInputStream("2019/07/12 07:12", inputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("", "// Input %num%");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
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
        printStream1.flush();
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
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.collapseAnonymousFunctions = false;
        java.lang.String str7 = compilerOptions0.aliasStringsBlacklist;
        compilerOptions0.instrumentationTemplate = "java.io.IOException";
        compilerOptions0.setProcessCommonJSModules(false);
        com.google.javascript.jscomp.CodingConvention codingConvention12 = compilerOptions0.getCodingConvention();
        compilerOptions0.inputDelimiter = "2019/07/12 07:12";
        compilerOptions0.markNoSideEffectCalls = false;
        compilerOptions0.setAliasKeywords(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(codingConvention12);
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
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
        compilerOptions0.setInlineLocalVariables(true);
        compilerOptions0.exportTestFunctions = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions36.setRewriteNewDateGoogNow(true);
        boolean boolean39 = compilerOptions36.extractPrototypeMemberDeclarations;
        boolean boolean40 = compilerOptions36.jqueryPass;
        compilerOptions36.collapseAnonymousFunctions = false;
        java.lang.String str43 = compilerOptions36.aliasStringsBlacklist;
        compilerOptions36.inlineGetters = false;
        boolean boolean46 = compilerOptions36.exportTestFunctions;
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions47.setRewriteNewDateGoogNow(true);
        boolean boolean50 = compilerOptions47.extractPrototypeMemberDeclarations;
        compilerOptions47.setCollapseProperties(false);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy53 = compilerOptions47.variableRenaming;
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet55 = compilerOptions54.stripNamePrefixes;
        byte[] byteArray56 = compilerOptions54.inputVariableMapSerialized;
        compilerOptions54.checkSymbols = false;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler59 = compilerOptions54.getAliasTransformationHandler();
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy60 = compilerOptions54.propertyRenaming;
        compilerOptions36.setRenamingPolicy(variableRenamingPolicy53, propertyRenamingPolicy60);
        compilerOptions0.setVariableRenaming(variableRenamingPolicy53);
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet64 = compilerOptions63.stripNamePrefixes;
        byte[] byteArray65 = compilerOptions63.inputVariableMapSerialized;
        compilerOptions63.removeUnusedClassProperties = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions68.setRewriteNewDateGoogNow(true);
        boolean boolean71 = compilerOptions68.extractPrototypeMemberDeclarations;
        boolean boolean72 = compilerOptions68.jqueryPass;
        compilerOptions68.collapseAnonymousFunctions = false;
        java.lang.String str75 = compilerOptions68.aliasStringsBlacklist;
        compilerOptions68.instrumentationTemplate = "java.io.IOException";
        boolean boolean78 = compilerOptions68.crossModuleCodeMotion;
        com.google.javascript.jscomp.CheckLevel checkLevel79 = compilerOptions68.checkMissingGetCssNameLevel;
        compilerOptions63.checkUnreachableCode = checkLevel79;
        compilerOptions0.checkProvides = checkLevel79;
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + checkLevel29 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel29.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy53 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.OFF + "'", variableRenamingPolicy53.equals(com.google.javascript.jscomp.VariableRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNull(byteArray56);
        org.junit.Assert.assertNotNull(aliasTransformationHandler59);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy60 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy60.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNull(byteArray65);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + checkLevel79 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel79.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("2019/07/12 07:12", "java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        com.google.javascript.rhino.Node node5 = compiler0.getRoot();
        com.google.javascript.jscomp.JSError jSError6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
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
        java.lang.Object[] objArray12 = locationMappingList9.toArray();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setRewriteNewDateGoogNow(true);
        boolean boolean16 = compilerOptions13.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach17 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions13.setInlineVariables(reach17);
        compilerOptions13.setPrintInputDelimiter(true);
        boolean boolean21 = compilerOptions13.closurePass;
        com.google.javascript.jscomp.MessageBundle messageBundle22 = null;
        compilerOptions13.messageBundle = messageBundle22;
        compilerOptions13.setDeadAssignmentElimination(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        boolean boolean30 = compilerOptions27.extractPrototypeMemberDeclarations;
        compilerOptions27.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet33 = compilerOptions27.stripTypePrefixes;
        compilerOptions26.stripTypePrefixes = strSet33;
        compilerOptions13.setAliasableStrings(strSet33);
        boolean boolean36 = locationMappingList9.containsAll((java.util.Collection<java.lang.String>) strSet33);
        java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor37 = locationMappingList9.listIterator();
        java.util.function.UnaryOperator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingUnaryOperator38 = null;
        // The following exception was thrown during execution in test generation
        try {
            locationMappingList9.replaceAll(locationMappingUnaryOperator38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + reach17 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach17.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(locationMappingItor37);
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT;
        printStream1.println((java.lang.Object) diagnosticGroup18);
        java.io.PrintStream printStream20 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(printStream1);
        com.google.javascript.rhino.Node node22 = compiler21.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention codingConvention23 = compiler21.getCodingConvention();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
// flaky:         org.junit.Assert.assertNull(diagnosticGroup18);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
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
        compilerOptions0.setInlineProperties(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel13 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel13.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "// Input %num%" + "'", str17, "// Input %num%");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        boolean boolean6 = compilerOptions0.removeUnusedVars;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = null;
        compilerOptions0.cssRenamingMap = cssRenamingMap7;
        compilerOptions0.enableExternExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions11.setRewriteNewDateGoogNow(true);
        boolean boolean14 = compilerOptions11.extractPrototypeMemberDeclarations;
        compilerOptions11.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet17 = compilerOptions11.stripTypePrefixes;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap18 = compilerOptions11.cssRenamingMap;
        com.google.javascript.jscomp.MessageBundle messageBundle19 = compilerOptions11.messageBundle;
        compilerOptions11.setOptimizeReturns(true);
        compilerOptions11.setCrossModuleCodeMotion(true);
        com.google.javascript.jscomp.CheckLevel checkLevel24 = compilerOptions11.aggressiveVarCheck;
        compilerOptions0.setCheckRequires(checkLevel24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(cssRenamingMap18);
        org.junit.Assert.assertNull(messageBundle19);
        org.junit.Assert.assertTrue("'" + checkLevel24 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel24.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION;
        com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CONST = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        printStream1.println(0);
        printStream1.print((long) (short) -1);
        printStream1.println((int) ' ');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions31.setLabelRenaming(true);
        compilerOptions31.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean36 = compilerOptions31.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format37 = compilerOptions31.sourceMapFormat;
        compilerOptions31.setCollapseAnonymousFunctions(true);
        printStream1.print((java.lang.Object) compilerOptions31);
        printStream1.println(false);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(printStream29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(format37);
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("", "2019/07/12 07:12", "java.io.IOException: java.io.IOException: 2019/07/12 07:12");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.setCollapseAnonymousFunctions(true);
        compilerOptions0.smartNameRemoval = true;
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("java.io.IOException: Unversioned directory", charset1);
        java.lang.String str3 = sourceFile2.toString();
        java.lang.String str5 = sourceFile2.getLine((int) (byte) -1);
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: Unversioned directory" + "'", str3, "java.io.IOException: Unversioned directory");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        boolean boolean6 = compilerOptions0.removeUnusedVars;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = null;
        compilerOptions0.cssRenamingMap = cssRenamingMap7;
        boolean boolean9 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setRewriteNewDateGoogNow(true);
        boolean boolean13 = compilerOptions10.extractPrototypeMemberDeclarations;
        compilerOptions10.setCollapseProperties(false);
        compilerOptions10.setClosurePass(true);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions10.setInputPropertyMapSerialized(byteArray23);
        compilerOptions10.setFlowSensitiveInlineVariables(true);
        boolean boolean27 = compilerOptions10.exportTestFunctions;
        compilerOptions10.closurePass = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions30.setRewriteNewDateGoogNow(true);
        boolean boolean33 = compilerOptions30.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach34 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions30.setInlineVariables(reach34);
        compilerOptions30.setPrintInputDelimiter(true);
        boolean boolean38 = compilerOptions30.closurePass;
        boolean boolean39 = compilerOptions30.shouldColorizeErrorOutput();
        com.google.javascript.jscomp.CheckLevel checkLevel40 = compilerOptions30.checkMissingGetCssNameLevel;
        compilerOptions10.setCheckMissingGetCssNameLevel(checkLevel40);
        compilerOptions0.checkGlobalNamesLevel = checkLevel40;
        boolean boolean43 = compilerOptions0.collapseVariableDeclarations;
        java.lang.Class<?> wildcardClass44 = compilerOptions0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + reach34 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach34.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + checkLevel40 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel40.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.setRemoveUnusedClassProperties(true);
        compilerOptions0.setCheckTypes(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        boolean boolean12 = compilerOptions9.extractPrototypeMemberDeclarations;
        boolean boolean13 = compilerOptions9.jqueryPass;
        compilerOptions9.collapseAnonymousFunctions = false;
        boolean boolean16 = compilerOptions9.checkTypes;
        compilerOptions9.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions19.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention22 = null;
        compilerOptions19.setCodingConvention(codingConvention22);
        compilerOptions19.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet27 = compilerOptions26.stripNamePrefixes;
        compilerOptions19.setIdGenerators(strSet27);
        compilerOptions9.setStripNameSuffixes(strSet27);
        compilerOptions9.prettyPrint = false;
        java.lang.String str32 = compilerOptions9.sourceMapOutputPath;
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet34 = compilerOptions33.stripNamePrefixes;
        compilerOptions9.setStripTypePrefixes(strSet34);
        compilerOptions0.setExtraAnnotationNames(strSet34);
        boolean boolean37 = compilerOptions0.moveFunctionDeclarations;
        java.lang.String str38 = compilerOptions0.locale;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
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
        compilerOptions0.setSpecializeInitialModule(true);
        compilerOptions0.generateExports = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel13 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel13.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGeneratePseudoNames(true);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setIdeMode(true);
        compilerOptions0.computeFunctionSideEffects = false;
        boolean boolean13 = compilerOptions0.removeUnusedPrototypePropertiesInExterns;
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setLabelRenaming(true);
        compilerOptions14.syntheticBlockStartMarker = "java.io.IOException";
        compilerOptions14.locale = "2019/07/12 07:12";
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray21 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList22 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22, locationMappingArray21);
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions24.setRewriteNewDateGoogNow(true);
        boolean boolean27 = compilerOptions24.extractPrototypeMemberDeclarations;
        compilerOptions24.setCollapseProperties(false);
        compilerOptions24.setClosurePass(true);
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions24.setInputPropertyMapSerialized(byteArray37);
        compilerOptions24.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions41 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions41.setRewriteNewDateGoogNow(true);
        boolean boolean44 = compilerOptions41.extractPrototypeMemberDeclarations;
        compilerOptions41.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet47 = compilerOptions41.stripTypePrefixes;
        compilerOptions24.aliasableStrings = strSet47;
        boolean boolean49 = locationMappingList22.removeAll((java.util.Collection<java.lang.String>) strSet47);
        compilerOptions14.setReplaceStringsReservedStrings(strSet47);
        java.util.stream.Stream<java.lang.String> strStream51 = strSet47.parallelStream();
        compilerOptions0.setStripTypePrefixes(strSet47);
        java.lang.Class<?> wildcardClass53 = strSet47.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locationMappingArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strStream51);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.exportTestFunctions;
        compilerOptions0.lineBreak = false;
        boolean boolean6 = compilerOptions0.optimizeParameters;
        java.util.Set<java.lang.String> strSet7 = null;
        compilerOptions0.setStripTypes(strSet7);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        boolean boolean12 = compilerOptions9.extractPrototypeMemberDeclarations;
        compilerOptions9.setCollapseProperties(false);
        compilerOptions9.setClosurePass(true);
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions9.setInputPropertyMapSerialized(byteArray22);
        compilerOptions9.setFlowSensitiveInlineVariables(true);
        boolean boolean26 = compilerOptions9.exportTestFunctions;
        compilerOptions9.setTweakToNumberLiteral("java.io.IOException", (int) (short) 0);
        com.google.javascript.jscomp.CompilerOptions.Reach reach30 = com.google.javascript.jscomp.CompilerOptions.Reach.NONE;
        compilerOptions9.setInlineFunctions(reach30);
        compilerOptions0.setInlineFunctions(reach30);
        com.google.javascript.jscomp.CheckLevel checkLevel33 = compilerOptions0.checkMissingReturn;
        boolean boolean34 = compilerOptions0.printInputDelimiter;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + reach30 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.NONE + "'", reach30.equals(com.google.javascript.jscomp.CompilerOptions.Reach.NONE));
        org.junit.Assert.assertTrue("'" + checkLevel33 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel33.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode5 = compilerOptions0.getTracerMode();
        boolean boolean6 = compilerOptions0.printInputDelimiter;
        compilerOptions0.collapseVariableDeclarations = false;
        compilerOptions0.inlineFunctions = true;
        org.junit.Assert.assertTrue("'" + tracerMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode5.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        compilerOptions0.setShadowVariables(true);
        compilerOptions0.setIdeMode(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        boolean boolean15 = compilerOptions12.extractPrototypeMemberDeclarations;
        compilerOptions12.setCollapseProperties(false);
        compilerOptions12.setClosurePass(true);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions12.setInputPropertyMapSerialized(byteArray25);
        compilerOptions12.setSyntheticBlockStartMarker("Unversioned directory");
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing29 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK;
        boolean boolean30 = tweakProcessing29.isOn();
        compilerOptions12.setTweakProcessing(tweakProcessing29);
        compilerOptions0.setTweakProcessing(tweakProcessing29);
        boolean boolean33 = tweakProcessing29.isOn();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + tweakProcessing29 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK + "'", tweakProcessing29.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.syntheticBlockStartMarker = "hi!";
        compilerOptions0.removeUnusedPrototypePropertiesInExterns = false;
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_MESSAGE = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        boolean boolean6 = compilerOptions0.removeUnusedVars;
        boolean boolean7 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        compilerOptions0.setProcessObjectPropertyString(false);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        compilerOptions0.setPrettyPrint(false);
        compilerOptions0.setRemoveUnusedVars(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
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
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup3;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup3);
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        boolean boolean6 = compilerOptions0.closurePass;
        compilerOptions0.setAppNameStr("");
        compilerOptions0.setAmbiguateProperties(true);
        compilerOptions0.setCheckCaja(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.computeFunctionSideEffects;
        boolean boolean6 = compilerOptions0.printInputDelimiter;
        compilerOptions0.setGeneratePseudoNames(true);
        com.google.javascript.jscomp.SourceMap.Format format9 = null;
        compilerOptions0.setSourceMapFormat(format9);
        compilerOptions0.instrumentationTemplate = "// Input %num%";
        compilerOptions0.setCollapseAnonymousFunctions(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        boolean boolean5 = compilerOptions0.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions7.setRewriteNewDateGoogNow(true);
        boolean boolean10 = compilerOptions7.extractPrototypeMemberDeclarations;
        compilerOptions7.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet13 = compilerOptions7.stripTypePrefixes;
        compilerOptions6.stripTypePrefixes = strSet13;
        compilerOptions6.removeUnusedVars = true;
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
        com.google.javascript.jscomp.CheckLevel checkLevel49 = compilerOptions17.reportMissingOverride;
        compilerOptions6.checkGlobalThisLevel = checkLevel49;
        compilerOptions0.setReportUnknownTypes(checkLevel49);
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions52.setRewriteNewDateGoogNow(true);
        boolean boolean55 = compilerOptions52.extractPrototypeMemberDeclarations;
        compilerOptions52.convertToDottedProperties = true;
        compilerOptions52.setRemoveUnusedVars(true);
        compilerOptions52.removeUnusedClassProperties = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy62 = compilerOptions52.propertyRenaming;
        compilerOptions0.propertyRenaming = propertyRenamingPolicy62;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + checkLevel46 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel46.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel49 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel49.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy62 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy62.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_REGEXP = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet7 = compilerOptions6.stripNamePrefixes;
        byte[] byteArray8 = compilerOptions6.inputVariableMapSerialized;
        com.google.javascript.jscomp.CompilerOptions.Reach reach9 = com.google.javascript.jscomp.CompilerOptions.Reach.NONE;
        compilerOptions6.setInlineFunctions(reach9);
        compilerOptions6.setRecordFunctionInformation(true);
        java.lang.String str13 = compilerOptions6.locale;
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
        compilerOptions14.renamePrefix = "Unversioned directory";
        compilerOptions14.setMoveFunctionDeclarations(false);
        boolean boolean38 = compilerOptions14.generateExports;
        compilerOptions14.setLooseTypes(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions41 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions41.setRewriteNewDateGoogNow(true);
        boolean boolean44 = compilerOptions41.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach45 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions41.setInlineVariables(reach45);
        compilerOptions41.setPrintInputDelimiter(true);
        boolean boolean49 = compilerOptions41.closurePass;
        com.google.javascript.jscomp.MessageBundle messageBundle50 = null;
        compilerOptions41.messageBundle = messageBundle50;
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions52.setRewriteNewDateGoogNow(true);
        boolean boolean55 = compilerOptions52.extractPrototypeMemberDeclarations;
        boolean boolean56 = compilerOptions52.jqueryPass;
        boolean boolean57 = compilerOptions52.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions58 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions58.setLabelRenaming(true);
        compilerOptions58.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean63 = compilerOptions58.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format64 = compilerOptions58.sourceMapFormat;
        compilerOptions52.setSourceMapFormat(format64);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing66 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP;
        compilerOptions52.setTweakProcessing(tweakProcessing66);
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions68.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention71 = null;
        compilerOptions68.setCodingConvention(codingConvention71);
        compilerOptions68.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel75 = compilerOptions68.checkProvides;
        java.util.Set<java.lang.String> strSet76 = compilerOptions68.stripTypes;
        java.util.stream.Stream<java.lang.String> strStream77 = strSet76.stream();
        compilerOptions52.stripTypes = strSet76;
        compilerOptions41.setAliasableStrings(strSet76);
        com.google.javascript.jscomp.CompilerOptions compilerOptions80 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions80.setLabelRenaming(true);
        compilerOptions80.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CheckLevel checkLevel85 = compilerOptions80.checkGlobalThisLevel;
        boolean boolean86 = compilerOptions80.collapseProperties;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel87 = compilerOptions80.sourceMapDetailLevel;
        compilerOptions41.setSourceMapDetailLevel(detailLevel87);
        compilerOptions14.setSourceMapDetailLevel(detailLevel87);
        compilerOptions6.sourceMapDetailLevel = detailLevel87;
        compilerOptions0.setSourceMapDetailLevel(detailLevel87);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(byteArray8);
        org.junit.Assert.assertTrue("'" + reach9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.NONE + "'", reach9.equals(com.google.javascript.jscomp.CompilerOptions.Reach.NONE));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + reach45 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach45.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(format64);
        org.junit.Assert.assertTrue("'" + tweakProcessing66 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP + "'", tweakProcessing66.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP));
        org.junit.Assert.assertTrue("'" + checkLevel75 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel75.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertNotNull(strStream77);
        org.junit.Assert.assertTrue("'" + checkLevel85 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel85.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(detailLevel87);
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap5 = null;
        compilerOptions0.setCssRenamingMap(cssRenamingMap5);
        compilerOptions0.checkMissingGetCssNameBlacklist = "";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        compilerOptions0.locale = "2019/07/12 07:12";
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compilerOptions0.cssRenamingMap;
        compilerOptions0.setRuntimeTypeCheck(true);
        compilerOptions0.inlineVariables = false;
        boolean boolean12 = compilerOptions0.assumeStrictThis();
        org.junit.Assert.assertNull(cssRenamingMap7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS;
        com.google.javascript.jscomp.DiagnosticGroups.TYPE_INVALIDATION = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
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
        compilerOptions0.jqueryPass = false;
        compilerOptions0.setReplaceIdGenerators(false);
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray20 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList21 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList21, locationMappingArray20);
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.setRewriteNewDateGoogNow(true);
        boolean boolean26 = compilerOptions23.extractPrototypeMemberDeclarations;
        compilerOptions23.setCollapseProperties(false);
        compilerOptions23.setClosurePass(true);
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions23.setInputPropertyMapSerialized(byteArray36);
        compilerOptions23.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions40.setRewriteNewDateGoogNow(true);
        boolean boolean43 = compilerOptions40.extractPrototypeMemberDeclarations;
        compilerOptions40.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet46 = compilerOptions40.stripTypePrefixes;
        compilerOptions23.aliasableStrings = strSet46;
        boolean boolean48 = locationMappingList21.removeAll((java.util.Collection<java.lang.String>) strSet46);
        java.util.stream.Stream<java.lang.String> strStream49 = strSet46.stream();
        compilerOptions0.stripTypes = strSet46;
        boolean boolean51 = compilerOptions0.coalesceVariableNames;
        compilerOptions0.convertToDottedProperties = false;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strStream49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str2 = sourceFile1.getOriginalPath();
        boolean boolean3 = sourceFile1.isExtern();
        java.lang.String str5 = sourceFile1.getLine((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = sourceFile1.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
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
        compilerOptions0.setAssumeStrictThis(false);
        compilerOptions0.optimizeReturns = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions28.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention31 = null;
        compilerOptions28.setCodingConvention(codingConvention31);
        boolean boolean33 = compilerOptions28.generateExports;
        compilerOptions28.collapseVariableDeclarations = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions36.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention39 = null;
        compilerOptions36.setCodingConvention(codingConvention39);
        compilerOptions36.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel43 = compilerOptions36.checkProvides;
        java.lang.String[] strArray45 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        compilerOptions36.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList46);
        compilerOptions28.setManageClosureDependencies((java.util.List<java.lang.String>) strList46);
        compilerOptions0.setReplaceStringsConfiguration("java.io.IOException: ", (java.util.List<java.lang.String>) strList46);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(byteArray10);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup11);
        org.junit.Assert.assertTrue("'" + checkLevel20 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel20.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + checkLevel43 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel43.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.enableExternExports(true);
        compilerOptions0.setCrossModuleCodeMotion(false);
        java.util.Set<java.lang.String> strSet5 = compilerOptions0.stripNamePrefixes;
        compilerOptions0.setCheckControlStructures(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.setLabelRenaming(true);
        compilerOptions8.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CheckLevel checkLevel13 = compilerOptions8.checkGlobalThisLevel;
        compilerOptions8.setExportTestFunctions(false);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing16 = compilerOptions8.getTweakProcessing();
        compilerOptions0.setTweakProcessing(tweakProcessing16);
        compilerOptions0.enableRuntimeTypeCheck("java.io.IOException");
        compilerOptions0.setProcessObjectPropertyString(false);
        compilerOptions0.preferLineBreakAtEndOfFile = false;
        compilerOptions0.preferLineBreakAtEndOfFile = true;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + checkLevel13 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel13.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + tweakProcessing16 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing16.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.exportTestFunctions;
        compilerOptions0.setExtractPrototypeMemberDeclarations(true);
        compilerOptions0.reserveRawExports = false;
        compilerOptions0.crossModuleCodeMotion = false;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap10 = compilerOptions0.cssRenamingMap;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(cssRenamingMap10);
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        boolean boolean6 = compilerOptions0.removeUnusedVars;
        boolean boolean7 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        compilerOptions0.setCheckControlStructures(true);
        compilerOptions0.aliasExternals = true;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup12 = com.google.javascript.jscomp.DiagnosticGroups.VISIBILITY;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup12;
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention17 = null;
        compilerOptions14.setCodingConvention(codingConvention17);
        boolean boolean19 = compilerOptions14.generateExports;
        compilerOptions14.gatherCssNames = false;
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing22 = compilerOptions14.getTweakProcessing();
        compilerOptions14.setProtectHiddenSideEffects(true);
        compilerOptions14.aliasAllStrings = true;
        compilerOptions14.setCheckSuspiciousCode(false);
        compilerOptions14.setCollapsePropertiesOnExternTypes(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions31.setRewriteNewDateGoogNow(true);
        boolean boolean34 = compilerOptions31.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach35 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions31.setInlineVariables(reach35);
        compilerOptions31.lineBreak = false;
        compilerOptions31.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions41 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions41.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention44 = null;
        compilerOptions41.setCodingConvention(codingConvention44);
        compilerOptions41.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet49 = compilerOptions48.stripNamePrefixes;
        compilerOptions41.setIdGenerators(strSet49);
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions51.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention54 = null;
        compilerOptions51.setCodingConvention(codingConvention54);
        compilerOptions51.setGeneratePseudoNames(true);
        compilerOptions51.inlineLocalFunctions = false;
        compilerOptions51.setIdeMode(true);
        compilerOptions51.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions64 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions64.setRewriteNewDateGoogNow(true);
        boolean boolean67 = compilerOptions64.extractPrototypeMemberDeclarations;
        compilerOptions64.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel70 = compilerOptions64.checkGlobalThisLevel;
        compilerOptions51.checkMissingReturn = checkLevel70;
        compilerOptions41.aggressiveVarCheck = checkLevel70;
        com.google.javascript.jscomp.CheckLevel checkLevel73 = compilerOptions41.reportMissingOverride;
        compilerOptions31.setReportUnknownTypes(checkLevel73);
        compilerOptions14.setCheckProvides(checkLevel73);
        compilerOptions0.setWarningLevel(diagnosticGroup12, checkLevel73);
        compilerOptions0.setLineLengthThreshold((int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + tweakProcessing22 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing22.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + reach35 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach35.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + checkLevel70 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel70.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel73 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel73.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TWEAKS = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setRewriteNewDateGoogNow(true);
        boolean boolean16 = compilerOptions13.extractPrototypeMemberDeclarations;
        compilerOptions13.flowSensitiveInlineVariables = false;
        compilerOptions13.checkMissingGetCssNameBlacklist = "java.io.IOException: ";
        java.io.PrintStream printStream22 = new java.io.PrintStream("Unversioned directory");
        char[] charArray25 = new char[] { '4', '4' };
        printStream22.print(charArray25);
        printStream22.print((int) ' ');
        java.io.PrintStream printStream30 = new java.io.PrintStream((java.io.OutputStream) printStream22, false);
        printStream22.write((int) '#');
        printStream22.print((float) (short) 0);
        printStream22.println("java.io.IOException");
        java.util.Locale locale37 = null;
        java.io.PrintStream printStream40 = new java.io.PrintStream("Unversioned directory");
        char[] charArray43 = new char[] { '4', '4' };
        printStream40.print(charArray43);
        printStream40.print((int) ' ');
        java.io.PrintStream printStream48 = new java.io.PrintStream((java.io.OutputStream) printStream40, false);
        printStream40.write((int) '#');
        java.util.Locale locale51 = null;
        java.lang.Object[] objArray54 = new java.lang.Object[] { "Unversioned directory" };
        java.io.PrintStream printStream55 = printStream40.format(locale51, "Unversioned directory", objArray54);
        java.io.PrintStream printStream56 = printStream22.printf(locale37, "Unversioned directory", objArray54);
        printStream56.flush();
        com.google.javascript.jscomp.CompilerOptions compilerOptions58 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions58.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention61 = null;
        compilerOptions58.setCodingConvention(codingConvention61);
        boolean boolean63 = compilerOptions58.generateExports;
        compilerOptions58.printInputDelimiter = false;
        compilerOptions58.setCheckSymbols(true);
        byte[] byteArray72 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        compilerOptions58.setInputVariableMapSerialized(byteArray72);
        printStream56.write(byteArray72);
        compilerOptions13.inputVariableMapSerialized = byteArray72;
        printStream11.write(byteArray72);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup3);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup5);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null, null, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null, null, hi!]");
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4, 4]");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[Unversioned directory]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[Unversioned directory]");
        org.junit.Assert.assertNotNull(printStream55);
        org.junit.Assert.assertNotNull(printStream56);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[-1, 100, 10, 10]");
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup3;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = com.google.javascript.jscomp.DiagnosticGroups.TWEAKS;
        com.google.javascript.jscomp.SourceFile.Builder builder6 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator8 = null;
        com.google.javascript.jscomp.SourceFile sourceFile9 = builder6.buildFromGenerator("hi!", generator8);
        java.lang.Object[] objArray10 = new java.lang.Object[] { diagnosticGroup3, diagnosticGroup5, sourceFile9 };
        java.io.PrintStream printStream11 = printStream1.printf("2019/07/12 07:12", objArray10);
        printStream11.print(100);
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler(printStream11);
        printStream11.println("java.io.IOException: -1");
// flaky:         org.junit.Assert.assertNull(diagnosticGroup3);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup5);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null, null, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null, null, hi!]");
        org.junit.Assert.assertNotNull(printStream11);
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
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
        printStream1.close();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_USELESS_CODE = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGeneratePseudoNames(true);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setIdeMode(true);
        compilerOptions0.computeFunctionSideEffects = false;
        boolean boolean13 = compilerOptions0.removeUnusedPrototypePropertiesInExterns;
        compilerOptions0.setCrossModuleMethodMotion(false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        compilerOptions0.setRemoveUnusedVars(true);
        compilerOptions0.removeUnusedClassProperties = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy10 = compilerOptions0.propertyRenaming;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions11.enableExternExports(true);
        compilerOptions11.setCrossModuleCodeMotion(false);
        java.util.Set<java.lang.String> strSet16 = compilerOptions11.stripNamePrefixes;
        compilerOptions11.setCheckControlStructures(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions19.setLabelRenaming(true);
        compilerOptions19.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CheckLevel checkLevel24 = compilerOptions19.checkGlobalThisLevel;
        compilerOptions19.setExportTestFunctions(false);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing27 = compilerOptions19.getTweakProcessing();
        compilerOptions11.setTweakProcessing(tweakProcessing27);
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler29 = compilerOptions11.getAliasTransformationHandler();
        compilerOptions0.setAliasTransformationHandler(aliasTransformationHandler29);
        com.google.javascript.rhino.SourcePosition<com.google.javascript.jscomp.CompilerOptions.AliasTransformation> aliasTransformationSourcePosition32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerOptions.AliasTransformation aliasTransformation33 = aliasTransformationHandler29.logAliasTransformation("java.io.IOException", aliasTransformationSourcePosition32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy10 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy10.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + checkLevel24 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel24.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + tweakProcessing27 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing27.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertNotNull(aliasTransformationHandler29);
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK;
        com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.gatherCssNames;
        compilerOptions0.setTweakToStringLiteral("2019/07/12 07:12", "java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        compilerOptions0.setRemoveDeadCode(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setRewriteNewDateGoogNow(true);
        boolean boolean17 = compilerOptions14.extractPrototypeMemberDeclarations;
        boolean boolean18 = compilerOptions14.jqueryPass;
        boolean boolean19 = compilerOptions14.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setLabelRenaming(true);
        compilerOptions20.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean25 = compilerOptions20.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format26 = compilerOptions20.sourceMapFormat;
        compilerOptions14.setSourceMapFormat(format26);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing28 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP;
        compilerOptions14.setTweakProcessing(tweakProcessing28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions30.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention33 = null;
        compilerOptions30.setCodingConvention(codingConvention33);
        compilerOptions30.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel37 = compilerOptions30.checkProvides;
        java.util.Set<java.lang.String> strSet38 = compilerOptions30.stripTypes;
        java.util.stream.Stream<java.lang.String> strStream39 = strSet38.stream();
        compilerOptions14.stripTypes = strSet38;
        compilerOptions0.setStripNameSuffixes(strSet38);
        compilerOptions0.sourceMapOutputPath = "java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode44 = com.google.javascript.jscomp.CompilerOptions.TracerMode.ALL;
        compilerOptions0.setTracer(tracerMode44);
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions46.setRewriteNewDateGoogNow(true);
        boolean boolean49 = compilerOptions46.extractPrototypeMemberDeclarations;
        boolean boolean50 = compilerOptions46.jqueryPass;
        compilerOptions46.collapseAnonymousFunctions = false;
        java.lang.String str53 = compilerOptions46.aliasStringsBlacklist;
        compilerOptions46.setAliasStringsBlacklist("Unversioned directory");
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions56.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode59 = com.google.javascript.jscomp.CompilerOptions.TracerMode.TIMING_ONLY;
        compilerOptions56.setTracer(tracerMode59);
        compilerOptions56.setSmartNameRemoval(false);
        compilerOptions56.setOptimizeReturns(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions65 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet66 = compilerOptions65.stripNamePrefixes;
        byte[] byteArray67 = compilerOptions65.inputVariableMapSerialized;
        boolean boolean68 = compilerOptions65.exportTestFunctions;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode69 = com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
        compilerOptions65.setLanguageIn(languageMode69);
        compilerOptions65.setNameAnonymousFunctionsOnly(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions73 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions73.setRewriteNewDateGoogNow(true);
        boolean boolean76 = compilerOptions73.extractPrototypeMemberDeclarations;
        compilerOptions73.setCollapseProperties(false);
        compilerOptions73.setClosurePass(true);
        byte[] byteArray86 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions73.setInputPropertyMapSerialized(byteArray86);
        compilerOptions73.setAliasAllStrings(false);
        com.google.javascript.jscomp.CheckLevel checkLevel90 = compilerOptions73.reportMissingOverride;
        compilerOptions65.setCheckGlobalNamesLevel(checkLevel90);
        compilerOptions56.checkProvides = checkLevel90;
        compilerOptions46.setCheckGlobalThisLevel(checkLevel90);
        compilerOptions0.setAggressiveVarCheck(checkLevel90);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(format26);
        org.junit.Assert.assertTrue("'" + tweakProcessing28 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP + "'", tweakProcessing28.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP));
        org.junit.Assert.assertTrue("'" + checkLevel37 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel37.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(strStream39);
        org.junit.Assert.assertTrue("'" + tracerMode44 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.ALL + "'", tracerMode44.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.ALL));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + tracerMode59 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.TIMING_ONLY + "'", tracerMode59.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.TIMING_ONLY));
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertNull(byteArray67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + languageMode69 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT + "'", languageMode69.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray86), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + checkLevel90 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel90.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.setOptimizeReturns(true);
        java.lang.String str8 = compilerOptions0.renamePrefix;
        compilerOptions0.gatherCssNames = false;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS;
        com.google.javascript.jscomp.DiagnosticGroups.TYPE_INVALIDATION = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean5 = compilerOptions0.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format6 = compilerOptions0.sourceMapFormat;
        boolean boolean7 = compilerOptions0.deadAssignmentElimination;
        compilerOptions0.syntheticBlockEndMarker = "java.io.IOException";
        compilerOptions0.ideMode = true;
        java.lang.Class<?> wildcardClass12 = compilerOptions0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(format6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        java.lang.String str8 = compiler0.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = compiler0.acceptConstKeyword();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.collapseAnonymousFunctions = false;
        boolean boolean7 = compilerOptions0.checkTypes;
        compilerOptions0.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setLabelRenaming(true);
        compilerOptions10.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean15 = compilerOptions10.labelRenaming;
        compilerOptions10.ambiguateProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet19 = compilerOptions18.stripNamePrefixes;
        byte[] byteArray20 = compilerOptions18.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup21;
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention26 = null;
        compilerOptions23.setCodingConvention(codingConvention26);
        compilerOptions23.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel30 = compilerOptions23.checkProvides;
        compilerOptions18.setWarningLevel(diagnosticGroup21, checkLevel30);
        compilerOptions10.checkUnreachableCode = checkLevel30;
        compilerOptions0.checkProvides = checkLevel30;
        compilerOptions0.setSkipAllPasses(false);
        com.google.javascript.jscomp.CheckLevel checkLevel36 = compilerOptions0.checkRequires;
        compilerOptions0.setReplaceStringsPlaceholderToken("java.io.IOException: Unversioned directory");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(byteArray20);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup21);
        org.junit.Assert.assertTrue("'" + checkLevel30 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel30.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel36 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel36.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        com.google.javascript.jscomp.SourceFile.Generator generator7 = null;
        com.google.javascript.jscomp.SourceFile sourceFile8 = builder5.buildFromGenerator("hi!", generator7);
        com.google.javascript.jscomp.SourceFile.Builder builder10 = builder5.withOriginalPath("");
        java.nio.charset.Charset charset11 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder12 = builder10.withCharset(charset11);
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder14 = builder10.withCharset(charset13);
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setPropertyAffinity(true);
        java.lang.String str7 = compilerOptions0.inputDelimiter;
        boolean boolean8 = compilerOptions0.printInputDelimiter;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "// Input %num%" + "'", str7, "// Input %num%");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("", "java.io.IOException");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: java.io.IOException");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CONST = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
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
        compilerOptions0.enableExternExports(false);
        com.google.javascript.jscomp.CheckLevel checkLevel47 = compilerOptions0.checkMissingReturn;
        compilerOptions0.inlineLocalFunctions = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + checkLevel38 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel38.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertTrue("'" + checkLevel47 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel47.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("java.io.IOException: ");
        org.junit.Assert.assertNotNull(sourceFile1);
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        boolean boolean8 = compilerOptions0.closurePass;
        compilerOptions0.setOutputCharset("java.io.IOException");
        compilerOptions0.setCheckControlStructures(true);
        com.google.javascript.jscomp.CheckLevel checkLevel13 = compilerOptions0.aggressiveVarCheck;
        compilerOptions0.optimizeReturns = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + checkLevel13 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel13.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_USELESS_CODE = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION;
        com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
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
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compilerOptions0.getCodingConvention();
        compilerOptions0.removeUnusedPrototypePropertiesInExterns = false;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + checkLevel15 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel15.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(codingConvention16);
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.gatherCssNames;
        com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard9 = null;
        compilerOptions0.setWarningsGuard(composeWarningsGuard9);
        compilerOptions0.ideMode = false;
        compilerOptions0.disambiguateProperties = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions15.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention18 = null;
        compilerOptions15.setCodingConvention(codingConvention18);
        boolean boolean20 = compilerOptions15.generateExports;
        compilerOptions15.gatherCssNames = false;
        boolean boolean23 = compilerOptions15.optimizeReturns;
        compilerOptions15.smartNameRemoval = true;
        java.util.Set<java.lang.String> strSet26 = compilerOptions15.stripTypes;
        compilerOptions0.stripTypePrefixes = strSet26;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        compilerOptions0.setLocale("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        boolean boolean9 = compilerOptions0.deadAssignmentElimination;
        compilerOptions0.optimizeCalls = false;
        compilerOptions0.instrumentationTemplate = "java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException: ";
        boolean boolean16 = compilerOptions0.rewriteFunctionExpressions;
        compilerOptions0.setSmartNameRemoval(false);
        boolean boolean19 = compilerOptions0.coalesceVariableNames;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.reserveRawExports = true;
        compilerOptions0.setCollapsePropertiesOnExternTypes(false);
        compilerOptions0.setSkipAllPasses(true);
        byte[] byteArray9 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.aliasExternals = false;
        org.junit.Assert.assertNull(byteArray9);
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy7 = compilerOptions0.propertyRenaming;
        compilerOptions0.setOutputCharset("Unversioned directory");
        boolean boolean10 = compilerOptions0.removeUnusedPrototypeProperties;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy7 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy7.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        java.lang.String str5 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.InputId inputId6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler0.getInput(inputId6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT;
        printStream1.println((java.lang.Object) diagnosticGroup18);
        java.io.PrintStream printStream20 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        java.io.PrintStream printStream22 = printStream1.append((java.lang.CharSequence) "");
        printStream22.print((float) 10);
        java.lang.Throwable throwable28 = null;
        java.io.IOException iOException29 = new java.io.IOException("", throwable28);
        java.lang.Throwable throwable31 = null;
        java.io.IOException iOException32 = new java.io.IOException("", throwable31);
        iOException29.addSuppressed((java.lang.Throwable) iOException32);
        java.lang.Throwable throwable36 = null;
        java.io.IOException iOException37 = new java.io.IOException("", throwable36);
        java.lang.Throwable throwable39 = null;
        java.io.IOException iOException40 = new java.io.IOException("", throwable39);
        iOException37.addSuppressed((java.lang.Throwable) iOException40);
        java.io.IOException iOException42 = new java.io.IOException("", (java.lang.Throwable) iOException37);
        iOException32.addSuppressed((java.lang.Throwable) iOException42);
        java.io.IOException iOException44 = new java.io.IOException("", (java.lang.Throwable) iOException32);
        java.lang.Throwable[] throwableArray45 = iOException44.getSuppressed();
        java.io.PrintStream printStream46 = printStream22.format("hi!", (java.lang.Object[]) throwableArray45);
        printStream46.println((float) '#');
        printStream46.print(1L);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
// flaky:         org.junit.Assert.assertNull(diagnosticGroup18);
        org.junit.Assert.assertNotNull(printStream22);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(printStream46);
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.lang.String str3 = iOException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: " + "'", str3, "java.io.IOException: ");
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_MESSAGE = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions54.setRewriteNewDateGoogNow(true);
        boolean boolean57 = compilerOptions54.extractPrototypeMemberDeclarations;
        compilerOptions54.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel60 = compilerOptions54.brokenClosureRequiresLevel;
        java.util.Set<java.lang.String> strSet61 = compilerOptions54.stripTypes;
        compilerOptions0.setIdGenerators(strSet61);
        java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList63 = compilerOptions0.sourceMapLocationMappings;
        com.google.javascript.jscomp.CompilerOptions compilerOptions64 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions64.setRewriteNewDateGoogNow(true);
        boolean boolean67 = compilerOptions64.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach68 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions64.setInlineVariables(reach68);
        compilerOptions64.setPrintInputDelimiter(true);
        boolean boolean72 = compilerOptions64.closurePass;
        compilerOptions64.setOutputCharset("java.io.IOException");
        compilerOptions64.setCheckControlStructures(true);
        com.google.javascript.jscomp.CheckLevel checkLevel77 = compilerOptions64.aggressiveVarCheck;
        boolean boolean78 = locationMappingList63.contains((java.lang.Object) compilerOptions64);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping80 = locationMappingList63.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + checkLevel46 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel46.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + checkLevel60 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel60.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNotNull(locationMappingList63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + reach68 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach68.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + checkLevel77 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel77.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        java.util.Set<java.lang.String> strSet8 = compilerOptions0.stripTypes;
        compilerOptions0.coalesceVariableNames = true;
        compilerOptions0.setAppNameStr("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        compilerOptions0.setColorizeErrorOutput(false);
        compilerOptions0.disambiguateProperties = true;
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
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
        boolean boolean45 = compilerOptions0.gatherCssNames;
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions46.setRewriteNewDateGoogNow(true);
        boolean boolean49 = compilerOptions46.extractPrototypeMemberDeclarations;
        compilerOptions46.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet52 = compilerOptions46.stripTypePrefixes;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap53 = compilerOptions46.cssRenamingMap;
        compilerOptions46.reserveRawExports = true;
        com.google.javascript.jscomp.CheckLevel checkLevel56 = compilerOptions46.brokenClosureRequiresLevel;
        compilerOptions0.setCheckGlobalNamesLevel(checkLevel56);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNull(cssRenamingMap53);
        org.junit.Assert.assertTrue("'" + checkLevel56 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel56.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
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
        compilerOptions0.setGroupVariableDeclarations(false);
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.setDisambiguateProperties(false);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(byteArray5);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup6);
        org.junit.Assert.assertTrue("'" + checkLevel15 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel15.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TYPE_INVALIDATION = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
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
        boolean boolean12 = compilerOptions0.inlineVariables;
        compilerOptions0.removeUnusedVars = false;
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        boolean boolean8 = compilerOptions0.closurePass;
        com.google.javascript.jscomp.MessageBundle messageBundle9 = null;
        compilerOptions0.messageBundle = messageBundle9;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions11.setRewriteNewDateGoogNow(true);
        boolean boolean14 = compilerOptions11.extractPrototypeMemberDeclarations;
        boolean boolean15 = compilerOptions11.jqueryPass;
        boolean boolean16 = compilerOptions11.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setLabelRenaming(true);
        compilerOptions17.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean22 = compilerOptions17.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format23 = compilerOptions17.sourceMapFormat;
        compilerOptions11.setSourceMapFormat(format23);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing25 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP;
        compilerOptions11.setTweakProcessing(tweakProcessing25);
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention30 = null;
        compilerOptions27.setCodingConvention(codingConvention30);
        compilerOptions27.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel34 = compilerOptions27.checkProvides;
        java.util.Set<java.lang.String> strSet35 = compilerOptions27.stripTypes;
        java.util.stream.Stream<java.lang.String> strStream36 = strSet35.stream();
        compilerOptions11.stripTypes = strSet35;
        compilerOptions0.setAliasableStrings(strSet35);
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions39.setLabelRenaming(true);
        compilerOptions39.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CheckLevel checkLevel44 = compilerOptions39.checkGlobalThisLevel;
        boolean boolean45 = compilerOptions39.collapseProperties;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel46 = compilerOptions39.sourceMapDetailLevel;
        compilerOptions0.setSourceMapDetailLevel(detailLevel46);
        compilerOptions0.printInputDelimiter = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions50.setRewriteNewDateGoogNow(true);
        boolean boolean53 = compilerOptions50.extractPrototypeMemberDeclarations;
        compilerOptions50.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel56 = compilerOptions50.checkGlobalThisLevel;
        compilerOptions50.setDevirtualizePrototypeMethods(true);
        com.google.javascript.jscomp.MessageBundle messageBundle59 = null;
        compilerOptions50.setMessageBundle(messageBundle59);
        boolean boolean61 = compilerOptions50.recordFunctionInformation;
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy62 = compilerOptions50.anonymousFunctionNaming;
        compilerOptions0.setAnonymousFunctionNaming(anonymousFunctionNamingPolicy62);
        byte[] byteArray64 = compilerOptions0.inputPropertyMapSerialized;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(format23);
        org.junit.Assert.assertTrue("'" + tweakProcessing25 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP + "'", tweakProcessing25.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP));
        org.junit.Assert.assertTrue("'" + checkLevel34 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel34.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strStream36);
        org.junit.Assert.assertTrue("'" + checkLevel44 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel44.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(detailLevel46);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + checkLevel56 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel56.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy62 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy62.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
        org.junit.Assert.assertNull(byteArray64);
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        compilerOptions0.optimizeParameters = true;
        com.google.javascript.jscomp.CheckLevel checkLevel5 = compilerOptions0.checkRequires;
        java.lang.String str6 = compilerOptions0.inputDelimiter;
        boolean boolean7 = compilerOptions0.ambiguateProperties;
        compilerOptions0.setExportTestFunctions(false);
        org.junit.Assert.assertTrue("'" + checkLevel5 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel5.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "// Input %num%" + "'", str6, "// Input %num%");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
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
        compilerOptions0.setRuntimeTypeCheckLogFunction("hi!");
        compilerOptions0.setExtractPrototypeMemberDeclarations(false);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup3);
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CONST = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
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
        printStream11.println(true);
        java.io.PrintStream printStream17 = new java.io.PrintStream((java.io.OutputStream) printStream11);
        java.io.PrintStream printStream19 = new java.io.PrintStream("Unversioned directory");
        java.io.PrintStream printStream21 = new java.io.PrintStream("Unversioned directory");
        char[] charArray24 = new char[] { '4', '4' };
        printStream21.print(charArray24);
        printStream19.print(charArray24);
        java.io.PrintStream printStream28 = new java.io.PrintStream("Unversioned directory");
        char[] charArray31 = new char[] { '4', '4' };
        printStream28.print(charArray31);
        printStream28.print((int) ' ');
        byte[] byteArray41 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream28.write(byteArray41, (int) (byte) 0, (int) (byte) 1);
        printStream19.write(byteArray41);
        printStream17.write(byteArray41);
        java.io.PrintStream printStream48 = printStream17.append('4');
        printStream48.print("java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12");
// flaky:         org.junit.Assert.assertNull(diagnosticGroup3);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup5);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null, null, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null, null, hi!]");
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4, 4]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(printStream48);
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
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
        // The following exception was thrown during execution in test generation
        try {
            compiler14.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNull(diagnosticGroup3);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup5);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null, null, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null, null, hi!]");
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertNull(sourceMap15);
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
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
        compilerOptions0.checkSymbols = true;
        compilerOptions0.lineBreak = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + checkLevel38 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel38.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet44);
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.checkSymbols = false;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler5 = compilerOptions0.getAliasTransformationHandler();
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy6 = compilerOptions0.propertyRenaming;
        compilerOptions0.checkMissingGetCssNameBlacklist = "Unversioned directory";
        compilerOptions0.inlineLocalFunctions = true;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(aliasTransformationHandler5);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy6 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy6.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("Unversioned directory");
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder11 = builder9.withCharset(charset10);
        com.google.javascript.jscomp.SourceFile sourceFile14 = builder11.buildFromCode("2019/07/12 07:12", "java.io.IOException: Unversioned directory");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = sourceFile14.getLineOffset((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(sourceFile14);
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.TYPE_INVALIDATION;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CONST = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
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
        java.lang.String str19 = compilerOptions0.sourceMapOutputPath;
        compilerOptions0.syntheticBlockStartMarker = "";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
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
        compilerOptions0.setInlineGetters(true);
        compilerOptions0.removeUnusedPrototypeProperties = true;
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("// Input %num%");
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        printStream1.write((-1));
        printStream1.println('#');
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = com.google.javascript.jscomp.DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL;
        com.google.javascript.jscomp.DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL = diagnosticGroup6;
        printStream1.print((java.lang.Object) diagnosticGroup6);
        printStream1.print((long) 100);
        java.io.PrintStream printStream12 = new java.io.PrintStream("Unversioned directory");
        char[] charArray15 = new char[] { '4', '4' };
        printStream12.print(charArray15);
        printStream12.print((int) ' ');
        java.io.PrintStream printStream20 = new java.io.PrintStream((java.io.OutputStream) printStream12, false);
        printStream12.write((int) '#');
        printStream12.print((float) (short) 0);
        printStream12.println("java.io.IOException");
        java.util.Locale locale27 = null;
        java.io.PrintStream printStream30 = new java.io.PrintStream("Unversioned directory");
        char[] charArray33 = new char[] { '4', '4' };
        printStream30.print(charArray33);
        printStream30.print((int) ' ');
        java.io.PrintStream printStream38 = new java.io.PrintStream((java.io.OutputStream) printStream30, false);
        printStream30.write((int) '#');
        java.util.Locale locale41 = null;
        java.lang.Object[] objArray44 = new java.lang.Object[] { "Unversioned directory" };
        java.io.PrintStream printStream45 = printStream30.format(locale41, "Unversioned directory", objArray44);
        java.io.PrintStream printStream46 = printStream12.printf(locale27, "Unversioned directory", objArray44);
        printStream46.flush();
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions48.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention51 = null;
        compilerOptions48.setCodingConvention(codingConvention51);
        boolean boolean53 = compilerOptions48.generateExports;
        compilerOptions48.printInputDelimiter = false;
        compilerOptions48.setCheckSymbols(true);
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        compilerOptions48.setInputVariableMapSerialized(byteArray62);
        printStream46.write(byteArray62);
        // The following exception was thrown during execution in test generation
        try {
            printStream1.write(byteArray62, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNull(diagnosticGroup6);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, 4]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[Unversioned directory]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[Unversioned directory]");
        org.junit.Assert.assertNotNull(printStream45);
        org.junit.Assert.assertNotNull(printStream46);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[-1, 100, 10, 10]");
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.enableExternExports(true);
        compilerOptions0.setCrossModuleCodeMotion(false);
        java.util.Set<java.lang.String> strSet5 = compilerOptions0.stripNamePrefixes;
        compilerOptions0.setCheckControlStructures(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.setLabelRenaming(true);
        compilerOptions8.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CheckLevel checkLevel13 = compilerOptions8.checkGlobalThisLevel;
        compilerOptions8.setExportTestFunctions(false);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing16 = compilerOptions8.getTweakProcessing();
        compilerOptions0.setTweakProcessing(tweakProcessing16);
        compilerOptions0.enableRuntimeTypeCheck("java.io.IOException");
        boolean boolean20 = compilerOptions0.shouldColorizeErrorOutput();
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap21 = compilerOptions0.getDefineReplacements();
        compilerOptions0.jqueryPass = false;
        compilerOptions0.setCollapsePropertiesOnExternTypes(false);
        compilerOptions0.removeUnusedPrototypePropertiesInExterns = false;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + checkLevel13 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel13.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + tweakProcessing16 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing16.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT;
        printStream1.println((java.lang.Object) diagnosticGroup18);
        java.io.PrintStream printStream20 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(printStream1);
        com.google.javascript.rhino.Node node22 = compiler21.getRoot();
        com.google.javascript.jscomp.JSModule jSModule23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray24 = compiler21.toSourceArray(jSModule23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
// flaky:         org.junit.Assert.assertNull(diagnosticGroup18);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.smartNameRemoval = true;
        compilerOptions0.setCollapseVariableDeclarations(true);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap13 = null;
        compilerOptions0.cssRenamingMap = cssRenamingMap13;
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.gatherCssNames;
        boolean boolean9 = compilerOptions0.markAsCompiled;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup10;
        com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION = diagnosticGroup10;
        com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK = diagnosticGroup10;
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setRewriteNewDateGoogNow(true);
        boolean boolean17 = compilerOptions14.extractPrototypeMemberDeclarations;
        boolean boolean18 = compilerOptions14.jqueryPass;
        compilerOptions14.collapseAnonymousFunctions = false;
        java.lang.String str21 = compilerOptions14.aliasStringsBlacklist;
        compilerOptions14.inlineGetters = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions24.setRewriteNewDateGoogNow(true);
        boolean boolean27 = compilerOptions24.extractPrototypeMemberDeclarations;
        boolean boolean28 = compilerOptions24.jqueryPass;
        compilerOptions24.setRemoveUnusedClassProperties(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions31.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention34 = null;
        compilerOptions31.setCodingConvention(codingConvention34);
        compilerOptions31.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel38 = compilerOptions31.checkProvides;
        compilerOptions24.brokenClosureRequiresLevel = checkLevel38;
        compilerOptions14.setCheckGlobalThisLevel(checkLevel38);
        compilerOptions0.setWarningLevel(diagnosticGroup10, checkLevel38);
        compilerOptions0.closurePass = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + checkLevel38 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel38.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        boolean boolean6 = compilerOptions0.lineBreak;
        compilerOptions0.recordFunctionInformation = false;
        com.google.javascript.jscomp.CheckLevel checkLevel9 = compilerOptions0.checkRequires;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + checkLevel9 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel9.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable9 = compiler0.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        boolean boolean3 = sourceFile2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = sourceFile2.getCode();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        compilerOptions0.optimizeParameters = true;
        com.google.javascript.jscomp.CheckLevel checkLevel5 = compilerOptions0.checkRequires;
        java.lang.String str6 = compilerOptions0.inputDelimiter;
        compilerOptions0.removeDeadCode = true;
        org.junit.Assert.assertTrue("'" + checkLevel5 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel5.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "// Input %num%" + "'", str6, "// Input %num%");
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.enableExternExports(true);
        compilerOptions0.setNameReferenceReportPath("java.io.IOException");
        boolean boolean5 = compilerOptions0.computeFunctionSideEffects;
        compilerOptions0.inlineVariables = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED;
        com.google.javascript.jscomp.DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.gatherCssNames;
        compilerOptions0.setTweakToStringLiteral("2019/07/12 07:12", "java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        compilerOptions0.setRemoveDeadCode(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setRewriteNewDateGoogNow(true);
        boolean boolean17 = compilerOptions14.extractPrototypeMemberDeclarations;
        boolean boolean18 = compilerOptions14.jqueryPass;
        boolean boolean19 = compilerOptions14.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setLabelRenaming(true);
        compilerOptions20.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean25 = compilerOptions20.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format26 = compilerOptions20.sourceMapFormat;
        compilerOptions14.setSourceMapFormat(format26);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing28 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP;
        compilerOptions14.setTweakProcessing(tweakProcessing28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions30.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention33 = null;
        compilerOptions30.setCodingConvention(codingConvention33);
        compilerOptions30.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel37 = compilerOptions30.checkProvides;
        java.util.Set<java.lang.String> strSet38 = compilerOptions30.stripTypes;
        java.util.stream.Stream<java.lang.String> strStream39 = strSet38.stream();
        compilerOptions14.stripTypes = strSet38;
        compilerOptions0.setStripNameSuffixes(strSet38);
        compilerOptions0.sourceMapOutputPath = "java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        compilerOptions0.setPrettyPrint(true);
        compilerOptions0.sourceMapOutputPath = "hi!";
        compilerOptions0.setCommonJSModulePathPrefix("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(format26);
        org.junit.Assert.assertTrue("'" + tweakProcessing28 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP + "'", tweakProcessing28.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP));
        org.junit.Assert.assertTrue("'" + checkLevel37 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel37.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(strStream39);
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.rhino.Node node3 = compiler1.getRoot();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler1.getReverseAbstractInterpreter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        compilerOptions0.setTweakReplacements(strMap16);
        compilerOptions0.computeFunctionSideEffects = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        boolean boolean6 = compilerOptions0.removeUnusedVars;
        boolean boolean7 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        compilerOptions0.setCheckControlStructures(true);
        boolean boolean10 = compilerOptions0.collapseAnonymousFunctions;
        compilerOptions0.setChainCalls(true);
        boolean boolean13 = compilerOptions0.checkSuspiciousCode;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet6 = compilerOptions0.stripTypePrefixes;
        com.google.javascript.jscomp.CheckLevel checkLevel7 = null;
        compilerOptions0.setCheckGlobalThisLevel(checkLevel7);
        com.google.javascript.jscomp.SourceMap.Format format9 = compilerOptions0.sourceMapFormat;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = null;
        compilerOptions10.setCodingConvention(codingConvention13);
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy15 = compilerOptions10.anonymousFunctionNaming;
        compilerOptions0.anonymousFunctionNaming = anonymousFunctionNamingPolicy15;
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention20 = null;
        compilerOptions17.setCodingConvention(codingConvention20);
        boolean boolean22 = compilerOptions17.generateExports;
        compilerOptions17.gatherCssNames = false;
        boolean boolean25 = compilerOptions17.optimizeReturns;
        compilerOptions17.smartNameRemoval = true;
        java.util.Set<java.lang.String> strSet28 = compilerOptions17.aliasableStrings;
        compilerOptions17.generateExports = false;
        boolean boolean31 = compilerOptions17.assumeStrictThis();
        compilerOptions17.setReserveRawExports(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions34.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention37 = null;
        compilerOptions34.setCodingConvention(codingConvention37);
        compilerOptions34.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions41 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet42 = compilerOptions41.stripNamePrefixes;
        compilerOptions34.setIdGenerators(strSet42);
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions44.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention47 = null;
        compilerOptions44.setCodingConvention(codingConvention47);
        compilerOptions44.setGeneratePseudoNames(true);
        compilerOptions44.inlineLocalFunctions = false;
        compilerOptions44.setIdeMode(true);
        compilerOptions44.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions57 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions57.setRewriteNewDateGoogNow(true);
        boolean boolean60 = compilerOptions57.extractPrototypeMemberDeclarations;
        compilerOptions57.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel63 = compilerOptions57.checkGlobalThisLevel;
        compilerOptions44.checkMissingReturn = checkLevel63;
        compilerOptions34.aggressiveVarCheck = checkLevel63;
        compilerOptions17.checkUnreachableCode = checkLevel63;
        compilerOptions17.setCheckCaja(true);
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap69 = compilerOptions17.getTweakReplacements();
        compilerOptions17.crossModuleMethodMotion = true;
        compilerOptions17.setAliasAllStrings(false);
        com.google.javascript.jscomp.CheckLevel checkLevel74 = compilerOptions17.checkMissingGetCssNameLevel;
        compilerOptions0.setReportMissingOverride(checkLevel74);
        com.google.javascript.jscomp.CompilerOptions compilerOptions76 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions76.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention79 = null;
        compilerOptions76.setCodingConvention(codingConvention79);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode81 = compilerOptions76.getTracerMode();
        compilerOptions0.setTracer(tracerMode81);
        boolean boolean83 = compilerOptions0.optimizeParameters;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(format9);
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy15 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy15.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + checkLevel63 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel63.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertTrue("'" + checkLevel74 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel74.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + tracerMode81 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode81.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.gatherCssNames;
        boolean boolean9 = compilerOptions0.markAsCompiled;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup10;
        com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION = diagnosticGroup10;
        com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK = diagnosticGroup10;
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setRewriteNewDateGoogNow(true);
        boolean boolean17 = compilerOptions14.extractPrototypeMemberDeclarations;
        boolean boolean18 = compilerOptions14.jqueryPass;
        compilerOptions14.collapseAnonymousFunctions = false;
        java.lang.String str21 = compilerOptions14.aliasStringsBlacklist;
        compilerOptions14.inlineGetters = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions24.setRewriteNewDateGoogNow(true);
        boolean boolean27 = compilerOptions24.extractPrototypeMemberDeclarations;
        boolean boolean28 = compilerOptions24.jqueryPass;
        compilerOptions24.setRemoveUnusedClassProperties(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions31.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention34 = null;
        compilerOptions31.setCodingConvention(codingConvention34);
        compilerOptions31.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel38 = compilerOptions31.checkProvides;
        compilerOptions24.brokenClosureRequiresLevel = checkLevel38;
        compilerOptions14.setCheckGlobalThisLevel(checkLevel38);
        compilerOptions0.setWarningLevel(diagnosticGroup10, checkLevel38);
        com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION = diagnosticGroup10;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + checkLevel38 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel38.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.computeFunctionSideEffects;
        boolean boolean6 = compilerOptions0.printInputDelimiter;
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet8 = compilerOptions7.stripNamePrefixes;
        byte[] byteArray9 = compilerOptions7.inputVariableMapSerialized;
        boolean boolean10 = compilerOptions7.exportTestFunctions;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode11 = com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
        compilerOptions7.setLanguageIn(languageMode11);
        compilerOptions0.setLanguageOut(languageMode11);
        compilerOptions0.syntheticBlockEndMarker = "java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + languageMode11 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT + "'", languageMode11.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT));
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "java.io.IOException: ");
        boolean boolean6 = locationMappingList1.remove((java.lang.Object) "hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet8 = compilerOptions7.stripNamePrefixes;
        byte[] byteArray9 = compilerOptions7.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup10;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention15 = null;
        compilerOptions12.setCodingConvention(codingConvention15);
        compilerOptions12.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel19 = compilerOptions12.checkProvides;
        compilerOptions7.setWarningLevel(diagnosticGroup10, checkLevel19);
        java.util.Set<java.lang.String> strSet21 = compilerOptions7.stripNamePrefixes;
        boolean boolean22 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet21);
        java.io.PrintStream printStream24 = new java.io.PrintStream("Unversioned directory");
        char[] charArray27 = new char[] { '4', '4' };
        printStream24.print(charArray27);
        printStream24.print((int) ' ');
        java.io.PrintStream printStream31 = new java.io.PrintStream((java.io.OutputStream) printStream24);
        com.google.javascript.jscomp.SourceFile.Builder builder33 = new com.google.javascript.jscomp.SourceFile.Builder();
        java.io.IOException iOException35 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException36 = new java.io.IOException((java.lang.Throwable) iOException35);
        java.lang.Object[] objArray38 = new java.lang.Object[] { builder33, iOException36, (byte) 10 };
        java.io.PrintStream printStream39 = printStream31.printf("", objArray38);
        printStream39.println((float) (-1L));
        java.io.PrintStream printStream43 = printStream39.append('#');
        java.io.PrintStream printStream45 = new java.io.PrintStream((java.io.OutputStream) printStream39, true);
        printStream45.write((int) (byte) 10);
        java.io.PrintStream printStream48 = new java.io.PrintStream((java.io.OutputStream) printStream45);
        boolean boolean49 = locationMappingList1.remove((java.lang.Object) printStream45);
        printStream45.print((long) (byte) 100);
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(byteArray9);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup10);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(printStream39);
        org.junit.Assert.assertNotNull(printStream43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
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
        java.util.Set<java.lang.String> strSet24 = compilerOptions0.stripTypePrefixes;
        com.google.javascript.jscomp.CheckLevel checkLevel25 = compilerOptions0.checkGlobalNamesLevel;
        compilerOptions0.setAssumeStrictThis(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + checkLevel25 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel25.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        printStream1.write((-1));
        printStream1.println('#');
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = com.google.javascript.jscomp.DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL;
        com.google.javascript.jscomp.DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL = diagnosticGroup6;
        printStream1.print((java.lang.Object) diagnosticGroup6);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention12 = null;
        compilerOptions9.setCodingConvention(codingConvention12);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode14 = compilerOptions9.getTracerMode();
        compilerOptions9.lineBreak = false;
        compilerOptions9.resetWarningsGuard();
        compilerOptions9.setRemoveUnusedClassProperties(true);
        compilerOptions9.aliasExternals = false;
        printStream1.print((java.lang.Object) false);
        printStream1.flush();
// flaky:         org.junit.Assert.assertNull(diagnosticGroup6);
        org.junit.Assert.assertTrue("'" + tracerMode14 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode14.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList5 = locationMappingList1.subList((int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setPropertyAffinity(true);
        compilerOptions0.setDisambiguateProperties(false);
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap9 = null;
        compilerOptions0.setCustomPasses(customPassExecutionTimeMultimap9);
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.VISIBILITY = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        compilerOptions0.setDefineReplacements(strMap21);
        compilerOptions0.labelRenaming = true;
        boolean boolean25 = compilerOptions0.removeTryCatchFinally;
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
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
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray25 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList26 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList26, locationMappingArray25);
        com.google.javascript.jscomp.SourceFile sourceFile30 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "java.io.IOException: ");
        boolean boolean31 = locationMappingList26.remove((java.lang.Object) "hi!");
        boolean boolean32 = locationMappingList26.isEmpty();
        compilerOptions0.setSourceMapLocationMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList26);
        java.util.Iterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor34 = locationMappingList26.iterator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(byteArray10);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup11);
        org.junit.Assert.assertTrue("'" + checkLevel20 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel20.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(sourceFile30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(locationMappingItor34);
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.setCollapseProperties(false);
        compilerOptions3.setClosurePass(true);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions3.setInputPropertyMapSerialized(byteArray16);
        compilerOptions3.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setRewriteNewDateGoogNow(true);
        boolean boolean23 = compilerOptions20.extractPrototypeMemberDeclarations;
        compilerOptions20.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet26 = compilerOptions20.stripTypePrefixes;
        compilerOptions3.aliasableStrings = strSet26;
        boolean boolean28 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet26);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup29 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup29;
        boolean boolean33 = locationMappingList1.contains((java.lang.Object) diagnosticGroup29);
        java.io.IOException iOException36 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException37 = new java.io.IOException("Unversioned directory", (java.lang.Throwable) iOException36);
        java.lang.Throwable[] throwableArray38 = iOException36.getSuppressed();
        java.io.IOException iOException39 = new java.io.IOException((java.lang.Throwable) iOException36);
        int int40 = locationMappingList1.indexOf((java.lang.Object) iOException36);
        java.util.Spliterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingSpliterator41 = locationMappingList1.spliterator();
        java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor42 = locationMappingList1.listIterator();
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(locationMappingSpliterator41);
        org.junit.Assert.assertNotNull(locationMappingItor42);
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.gatherCssNames;
        boolean boolean9 = compilerOptions0.markAsCompiled;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setRewriteNewDateGoogNow(true);
        boolean boolean13 = compilerOptions10.extractPrototypeMemberDeclarations;
        compilerOptions10.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet16 = compilerOptions10.stripTypePrefixes;
        com.google.javascript.jscomp.CheckLevel checkLevel17 = null;
        compilerOptions10.setCheckGlobalThisLevel(checkLevel17);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode19 = compilerOptions10.getTracerMode();
        compilerOptions0.setTracer(tracerMode19);
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions21.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention24 = null;
        compilerOptions21.setCodingConvention(codingConvention24);
        compilerOptions21.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel28 = compilerOptions21.checkProvides;
        boolean boolean29 = compilerOptions21.smartNameRemoval;
        java.util.Set<java.lang.String> strSet30 = compilerOptions21.aliasableStrings;
        compilerOptions0.stripNamePrefixes = strSet30;
        compilerOptions0.setRuntimeTypeCheck(true);
        compilerOptions0.setInlineLocalVariables(true);
        compilerOptions0.instrumentationTemplate = "java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        compilerOptions0.computeFunctionSideEffects = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + tracerMode19 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode19.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel28 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel28.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK;
        com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel6 = compilerOptions0.brokenClosureRequiresLevel;
        compilerOptions0.setAliasAllStrings(false);
        compilerOptions0.setSkipAllPasses(true);
        compilerOptions0.setLineLengthThreshold((int) '#');
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap13 = null;
        compilerOptions0.cssRenamingMap = cssRenamingMap13;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel6 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel6.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        boolean boolean8 = compilerOptions0.optimizeReturns;
        compilerOptions0.smartNameRemoval = true;
        boolean boolean11 = compilerOptions0.lineBreak;
        compilerOptions0.setGroupVariableDeclarations(true);
        compilerOptions0.setSyntheticBlockEndMarker("");
        compilerOptions0.computeFunctionSideEffects = true;
        byte[] byteArray18 = compilerOptions0.inputPropertyMapSerialized;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteArray18);
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.TWEAKS;
        com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset8);
        boolean boolean10 = sourceFile9.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = compiler0.parse(sourceFile9);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNotNull(intermediateState6);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
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
        java.lang.String str17 = compilerOptions0.inputDelimiter;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tweakProcessing9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing9.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "// Input %num%" + "'", str17, "// Input %num%");
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JSError jSError6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(sourceMap5);
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
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
        java.util.Set<java.lang.String> strSet14 = compilerOptions0.stripNamePrefixes;
        compilerOptions0.setCoalesceVariableNames(true);
        compilerOptions0.deadAssignmentElimination = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL;
        com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.printInputDelimiter = false;
        compilerOptions0.setCheckSymbols(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = null;
        compilerOptions10.setCodingConvention(codingConvention13);
        boolean boolean15 = compilerOptions10.generateExports;
        compilerOptions10.printInputDelimiter = false;
        compilerOptions10.prettyPrint = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention23 = null;
        compilerOptions20.setCodingConvention(codingConvention23);
        compilerOptions20.setGenerateExports(true);
        compilerOptions20.setLocale("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        boolean boolean29 = compilerOptions20.deadAssignmentElimination;
        compilerOptions20.optimizeCalls = false;
        compilerOptions20.instrumentationTemplate = "java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        boolean boolean34 = compilerOptions20.jqueryPass;
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions35.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention38 = null;
        compilerOptions35.setCodingConvention(codingConvention38);
        compilerOptions35.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel42 = compilerOptions35.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray43 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList44 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44, locationMappingArray43);
        compilerOptions35.sourceMapLocationMappings = locationMappingList44;
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions47.setRewriteNewDateGoogNow(true);
        boolean boolean50 = compilerOptions47.extractPrototypeMemberDeclarations;
        boolean boolean51 = compilerOptions47.jqueryPass;
        compilerOptions47.collapseAnonymousFunctions = false;
        boolean boolean54 = compilerOptions47.checkTypes;
        compilerOptions47.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CheckLevel checkLevel57 = compilerOptions47.checkProvides;
        compilerOptions35.checkUnreachableCode = checkLevel57;
        compilerOptions35.rewriteFunctionExpressions = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions61 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions61.setRewriteNewDateGoogNow(true);
        boolean boolean64 = compilerOptions61.extractPrototypeMemberDeclarations;
        boolean boolean65 = compilerOptions61.jqueryPass;
        compilerOptions61.collapseAnonymousFunctions = false;
        boolean boolean68 = compilerOptions61.checkTypes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions69 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions69.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention72 = null;
        compilerOptions69.setCodingConvention(codingConvention72);
        compilerOptions69.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions76 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet77 = compilerOptions76.stripNamePrefixes;
        compilerOptions69.setIdGenerators(strSet77);
        compilerOptions61.stripNamePrefixes = strSet77;
        compilerOptions35.setIdGenerators(strSet77);
        compilerOptions20.stripTypePrefixes = strSet77;
        compilerOptions10.stripNameSuffixes = strSet77;
        compilerOptions0.setExtraAnnotationNames(strSet77);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + checkLevel42 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel42.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + checkLevel57 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel57.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strSet77);
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.VISIBILITY = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromInputStream("// Input %num%", inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
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
        boolean boolean16 = compilerOptions0.aliasKeywords;
        boolean boolean17 = compilerOptions0.inlineVariables;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions0.setInputPropertyMapSerialized(byteArray13);
        compilerOptions0.setFlowSensitiveInlineVariables(true);
        boolean boolean17 = compilerOptions0.exportTestFunctions;
        compilerOptions0.setFlowSensitiveInlineVariables(false);
        compilerOptions0.checkSymbols = false;
        compilerOptions0.setDefineToDoubleLiteral("2019/07/12 07:12", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TYPE_INVALIDATION = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode5 = compilerOptions0.getTracerMode();
        compilerOptions0.lineBreak = false;
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(false);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setFoldConstants(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet15 = compilerOptions14.stripNamePrefixes;
        com.google.javascript.jscomp.MessageBundle messageBundle16 = null;
        compilerOptions14.messageBundle = messageBundle16;
        compilerOptions14.setCoalesceVariableNames(false);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing20 = compilerOptions14.getTweakProcessing();
        compilerOptions0.setTweakProcessing(tweakProcessing20);
        boolean boolean22 = tweakProcessing20.shouldStrip();
        org.junit.Assert.assertTrue("'" + tracerMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode5.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + tweakProcessing20 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing20.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.printInputDelimiter = false;
        compilerOptions0.setCheckSymbols(true);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        compilerOptions0.setInputVariableMapSerialized(byteArray14);
        java.lang.String str16 = compilerOptions0.renamePrefix;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy17 = compilerOptions0.propertyRenaming;
        boolean boolean18 = compilerOptions0.foldConstants;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 100, 10, 10]");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy17 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy17.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        compilerOptions0.setExtractPrototypeMemberDeclarations(false);
        compilerOptions0.setNameReferenceGraphPath("Unversioned directory");
        com.google.javascript.jscomp.CheckLevel checkLevel6 = null;
        compilerOptions0.brokenClosureRequiresLevel = checkLevel6;
        compilerOptions0.collapseVariableDeclarations = false;
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.reserveRawExports;
        boolean boolean9 = compilerOptions0.inlineGetters;
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compilerOptions0.getCodingConvention();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(codingConvention10);
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        compilerOptions0.setLocale("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        boolean boolean9 = compilerOptions0.deadAssignmentElimination;
        compilerOptions0.optimizeCalls = false;
        compilerOptions0.resetWarningsGuard();
        compilerOptions0.setLineLengthThreshold(1);
        compilerOptions0.setAliasStringsBlacklist("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        com.google.javascript.jscomp.MessageBundle messageBundle2 = null;
        compilerOptions0.messageBundle = messageBundle2;
        compilerOptions0.setExtractPrototypeMemberDeclarations(true);
        compilerOptions0.syntheticBlockEndMarker = "";
        compilerOptions0.setReplaceIdGenerators(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        compilerOptions0.setInlineConstantVars(false);
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.gatherCssNames;
        boolean boolean9 = compilerOptions0.markAsCompiled;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setRewriteNewDateGoogNow(true);
        boolean boolean13 = compilerOptions10.extractPrototypeMemberDeclarations;
        compilerOptions10.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet16 = compilerOptions10.stripTypePrefixes;
        com.google.javascript.jscomp.CheckLevel checkLevel17 = null;
        compilerOptions10.setCheckGlobalThisLevel(checkLevel17);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode19 = compilerOptions10.getTracerMode();
        compilerOptions0.setTracer(tracerMode19);
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions21.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention24 = null;
        compilerOptions21.setCodingConvention(codingConvention24);
        compilerOptions21.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel28 = compilerOptions21.checkProvides;
        boolean boolean29 = compilerOptions21.smartNameRemoval;
        java.util.Set<java.lang.String> strSet30 = compilerOptions21.aliasableStrings;
        compilerOptions0.stripNamePrefixes = strSet30;
        compilerOptions0.setExportTestFunctions(true);
        boolean boolean34 = compilerOptions0.reserveRawExports;
        compilerOptions0.aliasAllStrings = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + tracerMode19 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode19.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel28 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel28.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
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
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode15 = compilerOptions0.getLanguageOut();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(languageMode15);
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.collapseAnonymousFunctions = false;
        boolean boolean7 = compilerOptions0.checkTypes;
        compilerOptions0.setRemoveTryCatchFinally(false);
        compilerOptions0.markNoSideEffectCalls = true;
        compilerOptions0.setColorizeErrorOutput(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
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
        boolean boolean12 = compilerOptions0.inlineVariables;
        compilerOptions0.setOptimizeCalls(false);
        compilerOptions0.crossModuleMethodMotion = false;
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream8 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        com.google.javascript.jscomp.SourceFile.Builder builder10 = new com.google.javascript.jscomp.SourceFile.Builder();
        java.io.IOException iOException12 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.lang.Object[] objArray15 = new java.lang.Object[] { builder10, iOException13, (byte) 10 };
        java.io.PrintStream printStream16 = printStream8.printf("", objArray15);
        boolean boolean17 = printStream8.checkError();
        byte[] byteArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            printStream8.write(byteArray18, 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(printStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
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
        compilerOptions0.checkMissingGetCssNameBlacklist = "2019/07/12 07:12";
        compilerOptions0.closurePass = false;
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
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
        compilerOptions0.checkMissingGetCssNameBlacklist = "2019/07/12 07:12";
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention26 = null;
        compilerOptions23.setCodingConvention(codingConvention26);
        compilerOptions23.setPropertyAffinity(true);
        boolean boolean30 = compilerOptions23.closurePass;
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy31 = compilerOptions23.anonymousFunctionNaming;
        compilerOptions0.setAnonymousFunctionNaming(anonymousFunctionNamingPolicy31);
        java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList33 = compilerOptions0.sourceMapLocationMappings;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor35 = locationMappingList33.listIterator(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy31 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy31.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
        org.junit.Assert.assertNotNull(locationMappingList33);
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.enableExternExports(true);
        java.util.Set<java.lang.String> strSet3 = compilerOptions0.stripNameSuffixes;
        compilerOptions0.checkSymbols = true;
        compilerOptions0.collapseAnonymousFunctions = false;
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.jscomp.Scope scope3 = compiler1.getTopScope();
        com.google.javascript.rhino.InputId inputId4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler1.getInput(inputId4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNull(scope3);
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.gatherCssNames;
        boolean boolean9 = compilerOptions0.markAsCompiled;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setRewriteNewDateGoogNow(true);
        boolean boolean13 = compilerOptions10.extractPrototypeMemberDeclarations;
        compilerOptions10.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet16 = compilerOptions10.stripTypePrefixes;
        com.google.javascript.jscomp.CheckLevel checkLevel17 = null;
        compilerOptions10.setCheckGlobalThisLevel(checkLevel17);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode19 = compilerOptions10.getTracerMode();
        compilerOptions0.setTracer(tracerMode19);
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions21.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention24 = null;
        compilerOptions21.setCodingConvention(codingConvention24);
        compilerOptions21.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel28 = compilerOptions21.checkProvides;
        boolean boolean29 = compilerOptions21.smartNameRemoval;
        java.util.Set<java.lang.String> strSet30 = compilerOptions21.aliasableStrings;
        compilerOptions0.stripNamePrefixes = strSet30;
        compilerOptions0.setRuntimeTypeCheck(true);
        compilerOptions0.setInlineLocalVariables(true);
        compilerOptions0.instrumentationTemplate = "java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        compilerOptions0.setAliasStringsBlacklist("2019/07/12 07:12");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + tracerMode19 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode19.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel28 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel28.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        compilerOptions0.setShadowVariables(true);
        compilerOptions0.setIdeMode(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        boolean boolean15 = compilerOptions12.extractPrototypeMemberDeclarations;
        compilerOptions12.setCollapseProperties(false);
        compilerOptions12.setClosurePass(true);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions12.setInputPropertyMapSerialized(byteArray25);
        compilerOptions12.setSyntheticBlockStartMarker("Unversioned directory");
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing29 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK;
        boolean boolean30 = tweakProcessing29.isOn();
        compilerOptions12.setTweakProcessing(tweakProcessing29);
        compilerOptions0.setTweakProcessing(tweakProcessing29);
        com.google.javascript.jscomp.ErrorFormat errorFormat33 = compilerOptions0.errorFormat;
        java.lang.String str34 = compilerOptions0.checkMissingGetCssNameBlacklist;
        com.google.javascript.jscomp.WarningsGuard warningsGuard35 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.addWarningsGuard(warningsGuard35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + tweakProcessing29 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK + "'", tweakProcessing29.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(errorFormat33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
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
        compilerOptions0.checkMissingGetCssNameBlacklist = "2019/07/12 07:12";
        compilerOptions0.setOutputJsStringUsage(true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CONST = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        boolean boolean8 = compilerOptions0.closurePass;
        compilerOptions0.setOutputCharset("java.io.IOException");
        com.google.javascript.jscomp.CheckLevel checkLevel11 = compilerOptions0.brokenClosureRequiresLevel;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        boolean boolean15 = compilerOptions12.extractPrototypeMemberDeclarations;
        compilerOptions12.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel18 = compilerOptions12.checkGlobalThisLevel;
        compilerOptions12.setDevirtualizePrototypeMethods(true);
        com.google.javascript.jscomp.MessageBundle messageBundle21 = null;
        compilerOptions12.setMessageBundle(messageBundle21);
        boolean boolean23 = compilerOptions12.recordFunctionInformation;
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy24 = compilerOptions12.anonymousFunctionNaming;
        compilerOptions0.setAnonymousFunctionNaming(anonymousFunctionNamingPolicy24);
        compilerOptions0.ambiguateProperties = false;
        compilerOptions0.exportTestFunctions = false;
        compilerOptions0.setSkipAllPasses(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + checkLevel11 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel11.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + checkLevel18 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel18.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy24 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy24.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel6 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.setMoveFunctionDeclarations(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        boolean boolean12 = compilerOptions9.extractPrototypeMemberDeclarations;
        boolean boolean13 = compilerOptions9.jqueryPass;
        compilerOptions9.collapseAnonymousFunctions = false;
        boolean boolean16 = compilerOptions9.checkTypes;
        compilerOptions9.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions19.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention22 = null;
        compilerOptions19.setCodingConvention(codingConvention22);
        compilerOptions19.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet27 = compilerOptions26.stripNamePrefixes;
        compilerOptions19.setIdGenerators(strSet27);
        compilerOptions9.setStripNameSuffixes(strSet27);
        compilerOptions0.stripTypePrefixes = strSet27;
        com.google.javascript.jscomp.CheckLevel checkLevel31 = compilerOptions0.reportMissingOverride;
        compilerOptions0.setExternExportsPath("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel6 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel6.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + checkLevel31 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel31.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
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
        com.google.javascript.jscomp.SourceFile.Generator generator13 = null;
        com.google.javascript.jscomp.SourceFile sourceFile14 = builder0.buildFromGenerator("// Input %num%", generator13);
        java.lang.String str15 = sourceFile14.toString();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(sourceFile14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "// Input %num%" + "'", str15, "// Input %num%");
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet45 = compilerOptions44.stripNamePrefixes;
        byte[] byteArray46 = compilerOptions44.inputVariableMapSerialized;
        compilerOptions44.setNameReferenceReportPath("java.io.IOException: Unversioned directory");
        compilerOptions44.setDeadAssignmentElimination(true);
        compilerOptions44.setShadowVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions53.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention56 = null;
        compilerOptions53.setCodingConvention(codingConvention56);
        boolean boolean58 = compilerOptions53.generateExports;
        compilerOptions53.gatherCssNames = false;
        boolean boolean61 = compilerOptions53.optimizeReturns;
        compilerOptions53.smartNameRemoval = true;
        java.util.Set<java.lang.String> strSet64 = compilerOptions53.stripTypes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions65 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions65.setRewriteNewDateGoogNow(true);
        boolean boolean68 = compilerOptions65.extractPrototypeMemberDeclarations;
        boolean boolean69 = compilerOptions65.jqueryPass;
        compilerOptions65.collapseAnonymousFunctions = false;
        boolean boolean72 = compilerOptions65.checkTypes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions73 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions73.setLabelRenaming(true);
        compilerOptions73.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean78 = compilerOptions73.labelRenaming;
        compilerOptions73.ambiguateProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions81 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet82 = compilerOptions81.stripNamePrefixes;
        byte[] byteArray83 = compilerOptions81.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup84 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup84;
        com.google.javascript.jscomp.CompilerOptions compilerOptions86 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions86.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention89 = null;
        compilerOptions86.setCodingConvention(codingConvention89);
        compilerOptions86.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel93 = compilerOptions86.checkProvides;
        compilerOptions81.setWarningLevel(diagnosticGroup84, checkLevel93);
        compilerOptions73.checkUnreachableCode = checkLevel93;
        compilerOptions65.setAggressiveVarCheck(checkLevel93);
        compilerOptions53.setAggressiveVarCheck(checkLevel93);
        compilerOptions44.setCheckGlobalNamesLevel(checkLevel93);
        compilerOptions0.checkMissingReturn = checkLevel93;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + checkLevel38 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel38.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNull(byteArray46);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(strSet82);
        org.junit.Assert.assertNull(byteArray83);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup84);
        org.junit.Assert.assertTrue("'" + checkLevel93 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel93.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.convertToDottedProperties = true;
        boolean boolean9 = compilerOptions3.inlineConstantVars;
        boolean boolean10 = compilerOptions3.extractPrototypeMemberDeclarations;
        boolean boolean11 = compilerOptions3.reserveRawExports;
        boolean boolean12 = locationMappingList1.remove((java.lang.Object) boolean11);
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention16 = null;
        compilerOptions13.setCodingConvention(codingConvention16);
        compilerOptions13.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet21 = compilerOptions20.stripNamePrefixes;
        compilerOptions13.setIdGenerators(strSet21);
        java.util.stream.Stream<java.lang.String> strStream23 = strSet21.stream();
        boolean boolean24 = locationMappingList1.retainAll((java.util.Collection<java.lang.String>) strSet21);
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions25.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention28 = null;
        compilerOptions25.setCodingConvention(codingConvention28);
        compilerOptions25.setGenerateExports(true);
        compilerOptions25.setCollapseProperties(false);
        boolean boolean34 = compilerOptions25.inlineVariables;
        com.google.javascript.jscomp.CheckLevel checkLevel35 = compilerOptions25.aggressiveVarCheck;
        compilerOptions25.setCheckSymbols(true);
        boolean boolean38 = compilerOptions25.devirtualizePrototypeMethods;
        boolean boolean39 = locationMappingList1.equals((java.lang.Object) compilerOptions25);
        com.google.javascript.jscomp.MessageBundle messageBundle40 = null;
        compilerOptions25.messageBundle = messageBundle40;
        compilerOptions25.setAcceptConstKeyword(true);
        compilerOptions25.setExportTestFunctions(true);
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + checkLevel35 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel35.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.exportTestFunctions;
        compilerOptions0.lineBreak = false;
        compilerOptions0.collapseVariableDeclarations = true;
        compilerOptions0.setRemoveUnusedVars(false);
        compilerOptions0.generateExports = false;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
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
        compilerOptions0.setLineBreak(true);
        boolean boolean31 = compilerOptions0.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions32.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention35 = null;
        compilerOptions32.setCodingConvention(codingConvention35);
        boolean boolean37 = compilerOptions32.generateExports;
        compilerOptions32.gatherCssNames = false;
        boolean boolean40 = compilerOptions32.optimizeReturns;
        compilerOptions32.smartNameRemoval = true;
        boolean boolean43 = compilerOptions32.lineBreak;
        compilerOptions32.setDebugFunctionSideEffectsPath("hi!");
        java.util.Set<java.lang.String> strSet46 = compilerOptions32.stripNamePrefixes;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy47 = null;
        compilerOptions32.setVariableRenaming(variableRenamingPolicy47);
        compilerOptions32.setCheckControlStructures(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions51.setRewriteNewDateGoogNow(true);
        boolean boolean54 = compilerOptions51.extractPrototypeMemberDeclarations;
        compilerOptions51.setCollapseProperties(false);
        compilerOptions51.setClosurePass(true);
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions51.setInputPropertyMapSerialized(byteArray64);
        compilerOptions51.setSyntheticBlockStartMarker("Unversioned directory");
        com.google.javascript.jscomp.CheckLevel checkLevel68 = compilerOptions51.checkMissingReturn;
        compilerOptions32.setReportMissingOverride(checkLevel68);
        compilerOptions0.setCheckMissingReturn(checkLevel68);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + checkLevel24 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel24.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + checkLevel68 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel68.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGeneratePseudoNames(true);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setInlineLocalVariables(true);
        boolean boolean11 = compilerOptions0.optimizeParameters;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        boolean boolean15 = compilerOptions12.extractPrototypeMemberDeclarations;
        boolean boolean16 = compilerOptions12.jqueryPass;
        compilerOptions12.collapseAnonymousFunctions = false;
        java.lang.String str19 = compilerOptions12.aliasStringsBlacklist;
        compilerOptions12.instrumentationTemplate = "java.io.IOException";
        boolean boolean22 = compilerOptions12.crossModuleCodeMotion;
        com.google.javascript.jscomp.CheckLevel checkLevel23 = compilerOptions12.checkMissingGetCssNameLevel;
        compilerOptions0.aggressiveVarCheck = checkLevel23;
        compilerOptions0.setInlineLocalVariables(true);
        compilerOptions0.preferLineBreakAtEndOfFile = false;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + checkLevel23 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel23.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        boolean boolean8 = compilerOptions0.optimizeReturns;
        compilerOptions0.smartNameRemoval = true;
        boolean boolean11 = compilerOptions0.markNoSideEffectCalls;
        compilerOptions0.setProcessCommonJSModules(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("-1", "// Input %num%");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: // Input %num%");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
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
        compilerOptions0.checkGlobalNamesLevel = checkLevel13;
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap15 = null;
        compilerOptions0.setCustomPasses(customPassExecutionTimeMultimap15);
        boolean boolean17 = compilerOptions0.recordFunctionInformation;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel13 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel13.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.setCollapseProperties(false);
        compilerOptions3.setClosurePass(true);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions3.setInputPropertyMapSerialized(byteArray16);
        compilerOptions3.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setRewriteNewDateGoogNow(true);
        boolean boolean23 = compilerOptions20.extractPrototypeMemberDeclarations;
        compilerOptions20.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet26 = compilerOptions20.stripTypePrefixes;
        compilerOptions3.aliasableStrings = strSet26;
        boolean boolean28 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet26);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup29 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup29;
        boolean boolean33 = locationMappingList1.contains((java.lang.Object) diagnosticGroup29);
        java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor34 = locationMappingList1.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor36 = locationMappingList1.listIterator(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(locationMappingItor34);
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.setCollapseProperties(false);
        compilerOptions3.setClosurePass(true);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions3.setInputPropertyMapSerialized(byteArray16);
        compilerOptions3.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setRewriteNewDateGoogNow(true);
        boolean boolean23 = compilerOptions20.extractPrototypeMemberDeclarations;
        compilerOptions20.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet26 = compilerOptions20.stripTypePrefixes;
        compilerOptions3.aliasableStrings = strSet26;
        boolean boolean28 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet26);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup29 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup29;
        boolean boolean33 = locationMappingList1.contains((java.lang.Object) diagnosticGroup29);
        java.io.IOException iOException36 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException37 = new java.io.IOException("Unversioned directory", (java.lang.Throwable) iOException36);
        java.lang.Throwable[] throwableArray38 = iOException36.getSuppressed();
        java.io.IOException iOException39 = new java.io.IOException((java.lang.Throwable) iOException36);
        int int40 = locationMappingList1.indexOf((java.lang.Object) iOException36);
        java.util.Spliterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingSpliterator41 = locationMappingList1.spliterator();
        locationMappingList1.clear();
        java.lang.Object[] objArray43 = locationMappingList1.toArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping45 = locationMappingList1.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(locationMappingSpliterator41);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("Unversioned directory");
        com.google.javascript.jscomp.SourceFile.Generator generator11 = null;
        com.google.javascript.jscomp.SourceFile sourceFile12 = builder9.buildFromGenerator("java.io.IOException: ", generator11);
        com.google.javascript.jscomp.SourceFile.Generator generator14 = null;
        com.google.javascript.jscomp.SourceFile sourceFile15 = builder9.buildFromGenerator("2019/07/12 07:12", generator14);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = sourceFile15.getColumnOfOffset((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertNotNull(sourceFile15);
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.exportTestFunctions;
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions4.setLabelRenaming(true);
        compilerOptions4.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CheckLevel checkLevel9 = compilerOptions4.checkGlobalThisLevel;
        compilerOptions0.setCheckGlobalNamesLevel(checkLevel9);
        compilerOptions0.setExternExportsPath("Unversioned directory");
        compilerOptions0.setCheckTypes(true);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel9 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel9.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TYPE_INVALIDATION = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_REGEXP = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_MESSAGE = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "java.io.IOException: ");
        boolean boolean6 = locationMappingList1.remove((java.lang.Object) "hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet8 = compilerOptions7.stripNamePrefixes;
        byte[] byteArray9 = compilerOptions7.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup10;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention15 = null;
        compilerOptions12.setCodingConvention(codingConvention15);
        compilerOptions12.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel19 = compilerOptions12.checkProvides;
        compilerOptions7.setWarningLevel(diagnosticGroup10, checkLevel19);
        java.util.Set<java.lang.String> strSet21 = compilerOptions7.stripNamePrefixes;
        boolean boolean22 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet21);
        java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor23 = locationMappingList1.listIterator();
        java.util.Spliterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingSpliterator24 = locationMappingList1.spliterator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet26 = compilerOptions25.stripNamePrefixes;
        byte[] byteArray27 = compilerOptions25.inputVariableMapSerialized;
        boolean boolean28 = compilerOptions25.exportTestFunctions;
        compilerOptions25.setExtractPrototypeMemberDeclarations(true);
        compilerOptions25.reserveRawExports = false;
        compilerOptions25.crossModuleCodeMotion = false;
        com.google.javascript.jscomp.CheckLevel checkLevel35 = compilerOptions25.aggressiveVarCheck;
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions36.setRewriteNewDateGoogNow(true);
        boolean boolean39 = compilerOptions36.extractPrototypeMemberDeclarations;
        boolean boolean40 = compilerOptions36.jqueryPass;
        boolean boolean41 = compilerOptions36.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions42.setLabelRenaming(true);
        compilerOptions42.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean47 = compilerOptions42.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format48 = compilerOptions42.sourceMapFormat;
        compilerOptions36.sourceMapFormat = format48;
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions50.setRewriteNewDateGoogNow(true);
        boolean boolean53 = compilerOptions50.extractPrototypeMemberDeclarations;
        compilerOptions50.setCollapseProperties(false);
        boolean boolean56 = compilerOptions50.printInputDelimiter;
        com.google.javascript.jscomp.ErrorFormat errorFormat57 = compilerOptions50.errorFormat;
        compilerOptions36.setErrorFormat(errorFormat57);
        compilerOptions25.setErrorFormat(errorFormat57);
        boolean boolean60 = locationMappingList1.remove((java.lang.Object) compilerOptions25);
        com.google.javascript.jscomp.DependencyOptions dependencyOptions61 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions25.setDependencyOptions(dependencyOptions61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(byteArray9);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup10);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locationMappingItor23);
        org.junit.Assert.assertNotNull(locationMappingSpliterator24);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(byteArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + checkLevel35 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel35.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(format48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(errorFormat57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
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
        boolean boolean12 = compilerOptions0.inlineVariables;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention16 = null;
        compilerOptions13.setCodingConvention(codingConvention16);
        boolean boolean18 = compilerOptions13.generateExports;
        compilerOptions13.gatherCssNames = false;
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing21 = compilerOptions13.getTweakProcessing();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions22.setRewriteNewDateGoogNow(true);
        boolean boolean25 = compilerOptions22.extractPrototypeMemberDeclarations;
        compilerOptions22.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet28 = compilerOptions22.stripTypePrefixes;
        com.google.javascript.jscomp.CheckLevel checkLevel29 = null;
        compilerOptions22.setCheckGlobalThisLevel(checkLevel29);
        com.google.javascript.jscomp.SourceMap.Format format31 = compilerOptions22.sourceMapFormat;
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions32.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention35 = null;
        compilerOptions32.setCodingConvention(codingConvention35);
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy37 = compilerOptions32.anonymousFunctionNaming;
        compilerOptions22.anonymousFunctionNaming = anonymousFunctionNamingPolicy37;
        compilerOptions13.setAnonymousFunctionNaming(anonymousFunctionNamingPolicy37);
        compilerOptions0.setAnonymousFunctionNaming(anonymousFunctionNamingPolicy37);
        compilerOptions0.rewriteFunctionExpressions = false;
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tweakProcessing21 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing21.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(format31);
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy37 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy37.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_MESSAGE = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
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
        compilerOptions0.prettyPrint = false;
        compilerOptions0.optimizeReturns = false;
        boolean boolean27 = compilerOptions0.shouldColorizeErrorOutput();
        boolean boolean28 = compilerOptions0.shouldColorizeErrorOutput();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(byteArray10);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup11);
        org.junit.Assert.assertTrue("'" + checkLevel20 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel20.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_USELESS_CODE = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_MESSAGE = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean5 = compilerOptions0.labelRenaming;
        compilerOptions0.ambiguateProperties = false;
        boolean boolean8 = compilerOptions0.shouldColorizeErrorOutput();
        boolean boolean9 = compilerOptions0.crossModuleMethodMotion;
        compilerOptions0.inlineConstantVars = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet13 = compilerOptions12.stripNamePrefixes;
        byte[] byteArray14 = compilerOptions12.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup15;
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention20 = null;
        compilerOptions17.setCodingConvention(codingConvention20);
        compilerOptions17.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel24 = compilerOptions17.checkProvides;
        compilerOptions12.setWarningLevel(diagnosticGroup15, checkLevel24);
        java.util.Set<java.lang.String> strSet26 = compilerOptions12.stripNamePrefixes;
        compilerOptions12.setComputeFunctionSideEffects(true);
        java.util.Set<java.lang.String> strSet29 = compilerOptions12.stripTypePrefixes;
        compilerOptions0.stripNameSuffixes = strSet29;
        compilerOptions0.optimizeArgumentsArray = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(byteArray14);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup15);
        org.junit.Assert.assertTrue("'" + checkLevel24 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel24.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
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
        byte[] byteArray16 = compilerOptions0.inputVariableMapSerialized;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + checkLevel15 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel15.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(byteArray16);
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "java.io.IOException: ");
        boolean boolean6 = locationMappingList1.remove((java.lang.Object) "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping7 = null;
        boolean boolean8 = locationMappingList1.add(locationMapping7);
        java.lang.Object[] objArray9 = locationMappingList1.toArray();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = null;
        compilerOptions10.setCodingConvention(codingConvention13);
        boolean boolean15 = compilerOptions10.computeFunctionSideEffects;
        compilerOptions10.setInlineProperties(true);
        java.util.Set<java.lang.String> strSet18 = compilerOptions10.stripTypes;
        compilerOptions10.setNameReferenceGraphPath("-1");
        java.util.Set<java.lang.String> strSet21 = compilerOptions10.stripNamePrefixes;
        boolean boolean22 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet21);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping24 = locationMappingList1.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[null]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.setRemoveUnusedClassProperties(true);
        boolean boolean7 = compilerOptions0.convertToDottedProperties;
        compilerOptions0.printInputDelimiter = true;
        compilerOptions0.exportTestFunctions = true;
        compilerOptions0.collapseAnonymousFunctions = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.enableExternExports(true);
        compilerOptions0.setCrossModuleCodeMotion(false);
        java.util.Set<java.lang.String> strSet5 = compilerOptions0.stripNamePrefixes;
        compilerOptions0.setCheckControlStructures(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.setLabelRenaming(true);
        compilerOptions8.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CheckLevel checkLevel13 = compilerOptions8.checkGlobalThisLevel;
        compilerOptions8.setExportTestFunctions(false);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing16 = compilerOptions8.getTweakProcessing();
        compilerOptions0.setTweakProcessing(tweakProcessing16);
        compilerOptions0.enableRuntimeTypeCheck("java.io.IOException");
        boolean boolean20 = compilerOptions0.shouldColorizeErrorOutput();
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap21 = compilerOptions0.getDefineReplacements();
        java.lang.String str22 = compilerOptions0.renamePrefixNamespace;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + checkLevel13 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel13.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + tweakProcessing16 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing16.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.setCollapseProperties(false);
        compilerOptions3.setClosurePass(true);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions3.setInputPropertyMapSerialized(byteArray16);
        compilerOptions3.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setRewriteNewDateGoogNow(true);
        boolean boolean23 = compilerOptions20.extractPrototypeMemberDeclarations;
        compilerOptions20.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet26 = compilerOptions20.stripTypePrefixes;
        compilerOptions3.aliasableStrings = strSet26;
        boolean boolean28 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet26);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup29 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup29;
        boolean boolean33 = locationMappingList1.contains((java.lang.Object) diagnosticGroup29);
        java.io.IOException iOException36 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException37 = new java.io.IOException("Unversioned directory", (java.lang.Throwable) iOException36);
        java.lang.Throwable[] throwableArray38 = iOException36.getSuppressed();
        java.io.IOException iOException39 = new java.io.IOException((java.lang.Throwable) iOException36);
        int int40 = locationMappingList1.indexOf((java.lang.Object) iOException36);
        int int41 = locationMappingList1.size();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions42.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention45 = null;
        compilerOptions42.setCodingConvention(codingConvention45);
        boolean boolean47 = compilerOptions42.generateExports;
        compilerOptions42.deadAssignmentElimination = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions50.enableExternExports(true);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy53 = compilerOptions50.variableRenaming;
        compilerOptions42.setVariableRenaming(variableRenamingPolicy53);
        compilerOptions42.printInputDelimiter = false;
        int int57 = locationMappingList1.lastIndexOf((java.lang.Object) compilerOptions42);
        com.google.javascript.jscomp.CompilerOptions compilerOptions58 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions58.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention61 = null;
        compilerOptions58.setCodingConvention(codingConvention61);
        boolean boolean63 = compilerOptions58.generateExports;
        compilerOptions58.deadAssignmentElimination = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions66 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions66.enableExternExports(true);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy69 = compilerOptions66.variableRenaming;
        compilerOptions58.setVariableRenaming(variableRenamingPolicy69);
        compilerOptions42.setVariableRenaming(variableRenamingPolicy69);
        compilerOptions42.setCheckSymbols(false);
        compilerOptions42.setManageClosureDependencies(false);
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy53 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.OFF + "'", variableRenamingPolicy53.equals(com.google.javascript.jscomp.VariableRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy69 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.OFF + "'", variableRenamingPolicy69.equals(com.google.javascript.jscomp.VariableRenamingPolicy.OFF));
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CONST = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_USELESS_CODE = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        boolean boolean6 = compilerOptions0.closurePass;
        compilerOptions0.setRemoveAbstractMethods(true);
        compilerOptions0.sourceMapOutputPath = "java.io.IOException: ";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.reserveRawExports;
        compilerOptions0.computeFunctionSideEffects = false;
        compilerOptions0.setProcessObjectPropertyString(false);
        compilerOptions0.setCrossModuleCodeMotion(false);
        compilerOptions0.setAliasStringsBlacklist("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setLabelRenaming(true);
        com.google.javascript.jscomp.CheckLevel checkLevel20 = compilerOptions17.checkProvides;
        com.google.javascript.jscomp.CheckLevel checkLevel21 = compilerOptions17.reportMissingOverride;
        compilerOptions17.checkControlStructures = true;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap24 = null;
        compilerOptions17.cssRenamingMap = cssRenamingMap24;
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions26.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention29 = null;
        compilerOptions26.setCodingConvention(codingConvention29);
        compilerOptions26.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet34 = compilerOptions33.stripNamePrefixes;
        compilerOptions26.setIdGenerators(strSet34);
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions36.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention39 = null;
        compilerOptions36.setCodingConvention(codingConvention39);
        compilerOptions36.setGeneratePseudoNames(true);
        compilerOptions36.inlineLocalFunctions = false;
        compilerOptions36.setIdeMode(true);
        compilerOptions36.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions49.setRewriteNewDateGoogNow(true);
        boolean boolean52 = compilerOptions49.extractPrototypeMemberDeclarations;
        compilerOptions49.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel55 = compilerOptions49.checkGlobalThisLevel;
        compilerOptions36.checkMissingReturn = checkLevel55;
        compilerOptions26.aggressiveVarCheck = checkLevel55;
        compilerOptions17.setCheckMissingGetCssNameLevel(checkLevel55);
        compilerOptions0.aggressiveVarCheck = checkLevel55;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + checkLevel20 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel20.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel21 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel21.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + checkLevel55 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel55.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel6 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.setDevirtualizePrototypeMethods(true);
        com.google.javascript.jscomp.MessageBundle messageBundle9 = null;
        compilerOptions0.setMessageBundle(messageBundle9);
        compilerOptions0.setAcceptConstKeyword(false);
        boolean boolean13 = compilerOptions0.collapseAnonymousFunctions;
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setRewriteNewDateGoogNow(true);
        boolean boolean17 = compilerOptions14.extractPrototypeMemberDeclarations;
        compilerOptions14.setCollapseProperties(false);
        compilerOptions14.setClosurePass(true);
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions14.setInputPropertyMapSerialized(byteArray27);
        compilerOptions14.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions31.setRewriteNewDateGoogNow(true);
        boolean boolean34 = compilerOptions31.extractPrototypeMemberDeclarations;
        compilerOptions31.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet37 = compilerOptions31.stripTypePrefixes;
        compilerOptions14.aliasableStrings = strSet37;
        compilerOptions14.setRemoveUnusedVars(false);
        compilerOptions14.checkSuspiciousCode = false;
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing43 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF;
        boolean boolean44 = tweakProcessing43.shouldStrip();
        boolean boolean45 = tweakProcessing43.isOn();
        boolean boolean46 = tweakProcessing43.shouldStrip();
        compilerOptions14.setTweakProcessing(tweakProcessing43);
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions48.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention51 = null;
        compilerOptions48.setCodingConvention(codingConvention51);
        compilerOptions48.setGeneratePseudoNames(true);
        compilerOptions48.inlineLocalFunctions = false;
        compilerOptions48.setIdeMode(true);
        compilerOptions48.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions61 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions61.setRewriteNewDateGoogNow(true);
        boolean boolean64 = compilerOptions61.extractPrototypeMemberDeclarations;
        compilerOptions61.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel67 = compilerOptions61.checkGlobalThisLevel;
        compilerOptions48.checkMissingReturn = checkLevel67;
        compilerOptions14.setReportUnknownTypes(checkLevel67);
        compilerOptions0.brokenClosureRequiresLevel = checkLevel67;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel6 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel6.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertTrue("'" + tweakProcessing43 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing43.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + checkLevel67 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel67.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
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
        compilerOptions0.removeUnusedClassProperties = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions31.setRewriteNewDateGoogNow(true);
        boolean boolean34 = compilerOptions31.extractPrototypeMemberDeclarations;
        boolean boolean35 = compilerOptions31.jqueryPass;
        compilerOptions31.collapseAnonymousFunctions = false;
        boolean boolean38 = compilerOptions31.checkTypes;
        compilerOptions31.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CheckLevel checkLevel41 = compilerOptions31.checkProvides;
        compilerOptions31.setManageClosureDependencies(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions44.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention47 = null;
        compilerOptions44.setCodingConvention(codingConvention47);
        boolean boolean49 = compilerOptions44.generateExports;
        compilerOptions44.gatherCssNames = false;
        boolean boolean52 = compilerOptions44.optimizeReturns;
        compilerOptions44.smartNameRemoval = true;
        java.util.Set<java.lang.String> strSet55 = compilerOptions44.aliasableStrings;
        compilerOptions44.generateExports = false;
        boolean boolean58 = compilerOptions44.assumeStrictThis();
        compilerOptions44.setReserveRawExports(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions61 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions61.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention64 = null;
        compilerOptions61.setCodingConvention(codingConvention64);
        compilerOptions61.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet69 = compilerOptions68.stripNamePrefixes;
        compilerOptions61.setIdGenerators(strSet69);
        com.google.javascript.jscomp.CompilerOptions compilerOptions71 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions71.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention74 = null;
        compilerOptions71.setCodingConvention(codingConvention74);
        compilerOptions71.setGeneratePseudoNames(true);
        compilerOptions71.inlineLocalFunctions = false;
        compilerOptions71.setIdeMode(true);
        compilerOptions71.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions84 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions84.setRewriteNewDateGoogNow(true);
        boolean boolean87 = compilerOptions84.extractPrototypeMemberDeclarations;
        compilerOptions84.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel90 = compilerOptions84.checkGlobalThisLevel;
        compilerOptions71.checkMissingReturn = checkLevel90;
        compilerOptions61.aggressiveVarCheck = checkLevel90;
        compilerOptions44.checkUnreachableCode = checkLevel90;
        compilerOptions31.checkMissingGetCssNameLevel = checkLevel90;
        compilerOptions0.setCheckProvides(checkLevel90);
        com.google.javascript.jscomp.WarningsGuard warningsGuard96 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.addWarningsGuard(warningsGuard96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + checkLevel41 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel41.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + checkLevel90 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel90.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.removeUnusedVars = true;
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap6 = compilerOptions0.getDefineReplacements();
        com.google.javascript.jscomp.MessageBundle messageBundle7 = compilerOptions0.messageBundle;
        compilerOptions0.labelRenaming = false;
        boolean boolean10 = compilerOptions0.jqueryPass;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(messageBundle7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        boolean boolean6 = compilerOptions0.removeUnusedVars;
        boolean boolean7 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        compilerOptions0.setCheckControlStructures(true);
        boolean boolean10 = compilerOptions0.collapseAnonymousFunctions;
        compilerOptions0.setChainCalls(true);
        compilerOptions0.setLineLengthThreshold((int) (byte) 10);
        boolean boolean15 = compilerOptions0.removeUnusedPrototypePropertiesInExterns;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.disambiguateProperties;
        compilerOptions0.setDefineToNumberLiteral("2019/07/12 07:12", (int) '#');
        java.lang.String str7 = compilerOptions0.instrumentationTemplate;
        compilerOptions0.setCollapsePropertiesOnExternTypes(false);
        boolean boolean10 = compilerOptions0.recordFunctionInformation;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile sourceFile10 = builder7.buildFromCode("java.io.IOException: ", "java.io.IOException: ");
        java.lang.String str11 = sourceFile10.getCode();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.io.IOException: " + "'", str11, "java.io.IOException: ");
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
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
        printStream1.print(35);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
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
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(printStream11);
        com.google.javascript.jscomp.JSModule jSModule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray17 = compiler15.toSourceArray(jSModule16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNull(diagnosticGroup3);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup5);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null, null, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null, null, hi!]");
        org.junit.Assert.assertNotNull(printStream11);
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("Unversioned directory");
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder11 = builder9.withCharset(charset10);
        com.google.javascript.jscomp.SourceFile sourceFile13 = builder9.buildFromFile("java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(sourceFile13);
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy7 = compilerOptions0.propertyRenaming;
        compilerOptions0.setDefineToNumberLiteral("java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy7 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy7.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
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
        boolean boolean12 = compilerOptions0.inlineVariables;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setRewriteNewDateGoogNow(true);
        boolean boolean16 = compilerOptions13.extractPrototypeMemberDeclarations;
        compilerOptions13.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel19 = compilerOptions13.checkGlobalThisLevel;
        compilerOptions13.setDevirtualizePrototypeMethods(true);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode22 = compilerOptions13.getTracerMode();
        compilerOptions0.setTracer(tracerMode22);
        boolean boolean24 = compilerOptions0.inlineVariables;
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + tracerMode22 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode22.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
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
        compilerOptions0.inputDelimiter = "hi!";
        compilerOptions0.inlineFunctions = true;
        compilerOptions0.setLineBreak(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        compilerOptions0.aliasAllStrings = false;
        boolean boolean9 = compilerOptions0.smartNameRemoval;
        compilerOptions0.gatherCssNames = true;
        compilerOptions0.collapseVariableDeclarations = true;
        compilerOptions0.removeDeadCode = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
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
        boolean boolean12 = compilerOptions0.inlineVariables;
        boolean boolean13 = compilerOptions0.inlineLocalFunctions;
        java.lang.Object obj14 = compilerOptions0.clone();
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet6 = compilerOptions0.stripTypePrefixes;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compilerOptions0.cssRenamingMap;
        compilerOptions0.setDefineToBooleanLiteral("Unversioned directory", true);
        compilerOptions0.setMoveFunctionDeclarations(true);
        boolean boolean13 = compilerOptions0.coalesceVariableNames;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(cssRenamingMap7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
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
        com.google.javascript.jscomp.SourceFile sourceFile18 = builder13.buildFromCode("java.io.IOException: ", "java.io.IOException");
        java.lang.String str19 = sourceFile18.getOriginalPath();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(sourceFile15);
        org.junit.Assert.assertNotNull(sourceFile18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.printInputDelimiter = false;
        compilerOptions0.prettyPrint = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = null;
        compilerOptions10.setCodingConvention(codingConvention13);
        compilerOptions10.setGenerateExports(true);
        compilerOptions10.setLocale("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        boolean boolean19 = compilerOptions10.deadAssignmentElimination;
        compilerOptions10.optimizeCalls = false;
        compilerOptions10.instrumentationTemplate = "java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        boolean boolean24 = compilerOptions10.jqueryPass;
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions37.setRewriteNewDateGoogNow(true);
        boolean boolean40 = compilerOptions37.extractPrototypeMemberDeclarations;
        boolean boolean41 = compilerOptions37.jqueryPass;
        compilerOptions37.collapseAnonymousFunctions = false;
        boolean boolean44 = compilerOptions37.checkTypes;
        compilerOptions37.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CheckLevel checkLevel47 = compilerOptions37.checkProvides;
        compilerOptions25.checkUnreachableCode = checkLevel47;
        compilerOptions25.rewriteFunctionExpressions = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions51.setRewriteNewDateGoogNow(true);
        boolean boolean54 = compilerOptions51.extractPrototypeMemberDeclarations;
        boolean boolean55 = compilerOptions51.jqueryPass;
        compilerOptions51.collapseAnonymousFunctions = false;
        boolean boolean58 = compilerOptions51.checkTypes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions59 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions59.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention62 = null;
        compilerOptions59.setCodingConvention(codingConvention62);
        compilerOptions59.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions66 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet67 = compilerOptions66.stripNamePrefixes;
        compilerOptions59.setIdGenerators(strSet67);
        compilerOptions51.stripNamePrefixes = strSet67;
        compilerOptions25.setIdGenerators(strSet67);
        compilerOptions10.stripTypePrefixes = strSet67;
        compilerOptions0.stripNameSuffixes = strSet67;
        compilerOptions0.setTweakToNumberLiteral("-1", 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + checkLevel32 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel32.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + checkLevel47 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel47.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strSet67);
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        boolean boolean5 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        compilerOptions0.preferLineBreakAtEndOfFile = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet6 = compilerOptions0.stripTypePrefixes;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compilerOptions0.cssRenamingMap;
        compilerOptions0.inlineVariables = false;
        boolean boolean10 = compilerOptions0.prettyPrint;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES = diagnosticGroup11;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention16 = null;
        compilerOptions13.setCodingConvention(codingConvention16);
        compilerOptions13.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel20 = compilerOptions13.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray21 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList22 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22, locationMappingArray21);
        compilerOptions13.sourceMapLocationMappings = locationMappingList22;
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions25.setRewriteNewDateGoogNow(true);
        boolean boolean28 = compilerOptions25.extractPrototypeMemberDeclarations;
        boolean boolean29 = compilerOptions25.jqueryPass;
        compilerOptions25.collapseAnonymousFunctions = false;
        boolean boolean32 = compilerOptions25.checkTypes;
        compilerOptions25.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CheckLevel checkLevel35 = compilerOptions25.checkProvides;
        compilerOptions13.checkUnreachableCode = checkLevel35;
        compilerOptions0.setWarningLevel(diagnosticGroup11, checkLevel35);
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_REGEXP = diagnosticGroup11;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(cssRenamingMap7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup11);
        org.junit.Assert.assertTrue("'" + checkLevel20 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel20.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + checkLevel35 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel35.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_REGEXP = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup3;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = com.google.javascript.jscomp.DiagnosticGroups.TWEAKS;
        com.google.javascript.jscomp.SourceFile.Builder builder6 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator8 = null;
        com.google.javascript.jscomp.SourceFile sourceFile9 = builder6.buildFromGenerator("hi!", generator8);
        java.lang.Object[] objArray10 = new java.lang.Object[] { diagnosticGroup3, diagnosticGroup5, sourceFile9 };
        java.io.PrintStream printStream11 = printStream1.printf("2019/07/12 07:12", objArray10);
        printStream1.write((int) (byte) 1);
        java.io.PrintStream printStream15 = printStream1.append((java.lang.CharSequence) "java.io.IOException: Unversioned directory");
        byte[] byteArray16 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            printStream1.write(byteArray16, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNull(diagnosticGroup3);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup5);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null, null, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null, null, hi!]");
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertNotNull(printStream15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.lineBreak = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet9 = compilerOptions8.stripNamePrefixes;
        byte[] byteArray10 = compilerOptions8.inputVariableMapSerialized;
        boolean boolean11 = compilerOptions8.exportTestFunctions;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode12 = com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
        compilerOptions8.setLanguageIn(languageMode12);
        compilerOptions0.setLanguageIn(languageMode12);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions15.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention18 = null;
        compilerOptions15.setCodingConvention(codingConvention18);
        compilerOptions15.setDefineToBooleanLiteral("hi!", true);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        compilerOptions15.setInputPropertyMapSerialized(byteArray26);
        compilerOptions0.setInputPropertyMapSerialized(byteArray26);
        boolean boolean29 = compilerOptions0.labelRenaming;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + languageMode12 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT + "'", languageMode12.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.reserveRawExports;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel9 = null;
        compilerOptions0.sourceMapDetailLevel = detailLevel9;
        compilerOptions0.setSourceMapOutputPath("");
        compilerOptions0.setManageClosureDependencies(false);
        compilerOptions0.sourceMapOutputPath = "";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
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
        compilerOptions0.setDefineToNumberLiteral("", 0);
        com.google.javascript.jscomp.CheckLevel checkLevel23 = compilerOptions0.brokenClosureRequiresLevel;
        compilerOptions0.setGatherCssNames(false);
        compilerOptions0.removeUnusedVars = true;
        compilerOptions0.closurePass = false;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(byteArray5);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup6);
        org.junit.Assert.assertTrue("'" + checkLevel15 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel15.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel23 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel23.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TWEAKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TWEAKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CONST = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
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
        compilerOptions0.setAliasableGlobals("java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        boolean boolean47 = compilerOptions0.removeUnusedLocalVars;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + checkLevel38 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel38.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions38.enableExternExports(true);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy41 = compilerOptions38.variableRenaming;
        compilerOptions0.variableRenaming = variableRenamingPolicy41;
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions43.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention46 = null;
        compilerOptions43.setCodingConvention(codingConvention46);
        boolean boolean48 = compilerOptions43.generateExports;
        compilerOptions43.gatherCssNames = false;
        boolean boolean51 = compilerOptions43.optimizeReturns;
        compilerOptions43.smartNameRemoval = true;
        java.util.Set<java.lang.String> strSet54 = compilerOptions43.aliasableStrings;
        compilerOptions43.generateExports = false;
        boolean boolean57 = compilerOptions43.assumeStrictThis();
        compilerOptions43.setReserveRawExports(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions60 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions60.setRewriteNewDateGoogNow(true);
        boolean boolean63 = compilerOptions60.extractPrototypeMemberDeclarations;
        boolean boolean64 = compilerOptions60.jqueryPass;
        boolean boolean65 = compilerOptions60.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions66 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions66.setLabelRenaming(true);
        compilerOptions66.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean71 = compilerOptions66.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format72 = compilerOptions66.sourceMapFormat;
        compilerOptions60.sourceMapFormat = format72;
        com.google.javascript.jscomp.CompilerOptions compilerOptions74 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions74.setRewriteNewDateGoogNow(true);
        boolean boolean77 = compilerOptions74.extractPrototypeMemberDeclarations;
        compilerOptions74.setCollapseProperties(false);
        boolean boolean80 = compilerOptions74.printInputDelimiter;
        com.google.javascript.jscomp.ErrorFormat errorFormat81 = compilerOptions74.errorFormat;
        compilerOptions60.setErrorFormat(errorFormat81);
        compilerOptions43.setErrorFormat(errorFormat81);
        compilerOptions0.errorFormat = errorFormat81;
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
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy41 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.OFF + "'", variableRenamingPolicy41.equals(com.google.javascript.jscomp.VariableRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(format72);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(errorFormat81);
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.enableExternExports(true);
        compilerOptions0.setCrossModuleCodeMotion(false);
        java.util.Set<java.lang.String> strSet5 = compilerOptions0.stripNamePrefixes;
        compilerOptions0.setCheckControlStructures(false);
        java.util.Set<java.lang.String> strSet8 = compilerOptions0.stripNamePrefixes;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("java.io.IOException", "Unversioned directory");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Unversioned directory");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
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
        compilerOptions0.crossModuleCodeMotion = false;
        compilerOptions0.setSkipAllPasses(true);
        compilerOptions0.setCheckMissingGetCssNameBlacklist("2019/07/12 07:12");
        com.google.javascript.jscomp.CheckLevel checkLevel28 = compilerOptions0.checkGlobalThisLevel;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + checkLevel28 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel28.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
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
        compilerOptions0.lineBreak = true;
        boolean boolean18 = compilerOptions0.crossModuleMethodMotion;
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        boolean boolean6 = compilerOptions0.removeUnusedVars;
        boolean boolean7 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        compilerOptions0.setCheckControlStructures(true);
        compilerOptions0.inlineConstantVars = false;
        compilerOptions0.setLineLengthThreshold((int) (byte) 0);
        compilerOptions0.aliasKeywords = true;
        compilerOptions0.syntheticBlockStartMarker = "hi!";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        compilerOptions0.setLocale("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        boolean boolean9 = compilerOptions0.deadAssignmentElimination;
        boolean boolean10 = compilerOptions0.removeUnusedLocalVars;
        compilerOptions0.generateExports = true;
        boolean boolean13 = compilerOptions0.removeUnusedLocalVars;
        boolean boolean14 = compilerOptions0.printInputDelimiter;
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions15.setLabelRenaming(true);
        compilerOptions15.syntheticBlockStartMarker = "java.io.IOException";
        compilerOptions15.setInstrumentationTemplate("hi!");
        com.google.javascript.jscomp.CheckLevel checkLevel22 = compilerOptions15.brokenClosureRequiresLevel;
        compilerOptions0.setReportMissingOverride(checkLevel22);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + checkLevel22 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel22.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        boolean boolean6 = compilerOptions0.removeUnusedVars;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = null;
        compilerOptions0.cssRenamingMap = cssRenamingMap7;
        boolean boolean9 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        compilerOptions0.inputDelimiter = "java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
        com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT = diagnosticGroup0;
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream8 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        java.io.PrintStream printStream10 = printStream1.append((java.lang.CharSequence) "hi!");
        printStream1.print(true);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(printStream10);
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        compilerOptions0.setRemoveUnusedVars(true);
        boolean boolean8 = compilerOptions0.labelRenaming;
        compilerOptions0.setTweakToBooleanLiteral("-1", false);
        compilerOptions0.ambiguateProperties = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.rhino.Node node3 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = compiler1.getWarningCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
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
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setLabelRenaming(true);
        compilerOptions13.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean18 = compilerOptions13.labelRenaming;
        compilerOptions13.ambiguateProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet22 = compilerOptions21.stripNamePrefixes;
        byte[] byteArray23 = compilerOptions21.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup24 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup24;
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions26.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention29 = null;
        compilerOptions26.setCodingConvention(codingConvention29);
        compilerOptions26.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel33 = compilerOptions26.checkProvides;
        compilerOptions21.setWarningLevel(diagnosticGroup24, checkLevel33);
        compilerOptions13.checkUnreachableCode = checkLevel33;
        compilerOptions0.aggressiveVarCheck = checkLevel33;
        compilerOptions0.setCrossModuleCodeMotion(true);
        compilerOptions0.setOptimizeCalls(false);
        compilerOptions0.setCollapsePropertiesOnExternTypes(true);
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(byteArray23);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup24);
        org.junit.Assert.assertTrue("'" + checkLevel33 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel33.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT;
        printStream1.println((java.lang.Object) diagnosticGroup18);
        java.io.PrintStream printStream20 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        java.io.PrintStream printStream22 = printStream1.append((java.lang.CharSequence) "");
        printStream1.print((double) 0.0f);
        printStream1.print("java.io.IOException: Unversioned directory");
        printStream1.write((int) (short) 100);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNull(diagnosticGroup18);
        org.junit.Assert.assertNotNull(printStream22);
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_USELESS_CODE = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        java.util.Set<java.lang.String> strSet8 = compilerOptions0.stripTypes;
        compilerOptions0.coalesceVariableNames = true;
        compilerOptions0.setAppNameStr("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        compilerOptions0.deadAssignmentElimination = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions15.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention18 = null;
        compilerOptions15.setCodingConvention(codingConvention18);
        compilerOptions15.setGenerateExports(true);
        compilerOptions15.setCollapseProperties(false);
        boolean boolean24 = compilerOptions15.inlineVariables;
        com.google.javascript.jscomp.CheckLevel checkLevel25 = compilerOptions15.aggressiveVarCheck;
        compilerOptions15.setCheckSymbols(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions28.setRewriteNewDateGoogNow(true);
        boolean boolean31 = compilerOptions28.extractPrototypeMemberDeclarations;
        compilerOptions28.convertToDottedProperties = true;
        boolean boolean34 = compilerOptions28.inlineConstantVars;
        boolean boolean35 = compilerOptions28.extractPrototypeMemberDeclarations;
        boolean boolean36 = compilerOptions28.gatherCssNames;
        com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard37 = null;
        compilerOptions28.setWarningsGuard(composeWarningsGuard37);
        compilerOptions28.setInstrumentationTemplate("2019/07/12 07:12");
        com.google.javascript.jscomp.CompilerOptions.Reach reach41 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions28.setInlineFunctions(reach41);
        compilerOptions15.setRemoveUnusedVariables(reach41);
        compilerOptions0.setRemoveUnusedVariables(reach41);
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions45.setRewriteNewDateGoogNow(true);
        boolean boolean48 = compilerOptions45.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach49 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions45.setInlineVariables(reach49);
        compilerOptions45.setPrintInputDelimiter(true);
        boolean boolean53 = compilerOptions45.closurePass;
        compilerOptions45.setOutputCharset("java.io.IOException");
        com.google.javascript.jscomp.CheckLevel checkLevel56 = compilerOptions45.brokenClosureRequiresLevel;
        com.google.javascript.jscomp.CompilerOptions compilerOptions57 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions57.setRewriteNewDateGoogNow(true);
        boolean boolean60 = compilerOptions57.extractPrototypeMemberDeclarations;
        compilerOptions57.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel63 = compilerOptions57.checkGlobalThisLevel;
        compilerOptions57.setDevirtualizePrototypeMethods(true);
        com.google.javascript.jscomp.MessageBundle messageBundle66 = null;
        compilerOptions57.setMessageBundle(messageBundle66);
        boolean boolean68 = compilerOptions57.recordFunctionInformation;
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy69 = compilerOptions57.anonymousFunctionNaming;
        compilerOptions45.setAnonymousFunctionNaming(anonymousFunctionNamingPolicy69);
        compilerOptions0.setAnonymousFunctionNaming(anonymousFunctionNamingPolicy69);
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + checkLevel25 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel25.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + reach41 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach41.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + reach49 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach49.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + checkLevel56 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel56.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + checkLevel63 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel63.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy69 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy69.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler0.tracker;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(performanceTracker9);
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream8 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        com.google.javascript.jscomp.SourceFile.Builder builder10 = new com.google.javascript.jscomp.SourceFile.Builder();
        java.io.IOException iOException12 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.lang.Object[] objArray15 = new java.lang.Object[] { builder10, iOException13, (byte) 10 };
        java.io.PrintStream printStream16 = printStream8.printf("", objArray15);
        printStream16.println((float) (-1L));
        java.io.PrintStream printStream20 = printStream16.append('#');
        java.io.PrintStream printStream22 = new java.io.PrintStream((java.io.OutputStream) printStream16, true);
        printStream22.write((int) (byte) 10);
        java.io.PrintStream printStream25 = new java.io.PrintStream((java.io.OutputStream) printStream22);
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions26.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention29 = null;
        compilerOptions26.setCodingConvention(codingConvention29);
        compilerOptions26.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel33 = compilerOptions26.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray34 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList35 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList35, locationMappingArray34);
        compilerOptions26.sourceMapLocationMappings = locationMappingList35;
        byte[] byteArray39 = new byte[] { (byte) -1 };
        compilerOptions26.setInputPropertyMapSerialized(byteArray39);
        // The following exception was thrown during execution in test generation
        try {
            printStream22.write(byteArray39, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(printStream16);
        org.junit.Assert.assertNotNull(printStream20);
        org.junit.Assert.assertTrue("'" + checkLevel33 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel33.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1]");
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
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
        compilerOptions0.inputDelimiter = "hi!";
        boolean boolean22 = compilerOptions0.collapseVariableDeclarations;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
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
        compilerOptions0.setSpecializeInitialModule(true);
        compilerOptions0.setInstrumentationTemplate("2019/07/12 07:12");
        boolean boolean19 = compilerOptions0.closurePass;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel13 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel13.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        compilerOptions0.optimizeParameters = true;
        compilerOptions0.setReportPath("2019/07/12 07:12");
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap7 = null;
        compilerOptions0.customPasses = customPassExecutionTimeMultimap7;
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        compilerOptions0.setShadowVariables(true);
        compilerOptions0.setIdeMode(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        boolean boolean15 = compilerOptions12.extractPrototypeMemberDeclarations;
        compilerOptions12.setCollapseProperties(false);
        compilerOptions12.setClosurePass(true);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions12.setInputPropertyMapSerialized(byteArray25);
        compilerOptions12.setSyntheticBlockStartMarker("Unversioned directory");
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing29 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK;
        boolean boolean30 = tweakProcessing29.isOn();
        compilerOptions12.setTweakProcessing(tweakProcessing29);
        compilerOptions0.setTweakProcessing(tweakProcessing29);
        com.google.javascript.jscomp.ErrorFormat errorFormat33 = compilerOptions0.errorFormat;
        java.lang.String str34 = compilerOptions0.checkMissingGetCssNameBlacklist;
        boolean boolean35 = compilerOptions0.collapseProperties;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + tweakProcessing29 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK + "'", tweakProcessing29.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(errorFormat33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.gatherCssNames;
        compilerOptions0.setTweakToStringLiteral("2019/07/12 07:12", "java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        compilerOptions0.setRemoveDeadCode(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setRewriteNewDateGoogNow(true);
        boolean boolean17 = compilerOptions14.extractPrototypeMemberDeclarations;
        boolean boolean18 = compilerOptions14.jqueryPass;
        boolean boolean19 = compilerOptions14.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setLabelRenaming(true);
        compilerOptions20.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean25 = compilerOptions20.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format26 = compilerOptions20.sourceMapFormat;
        compilerOptions14.setSourceMapFormat(format26);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing28 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP;
        compilerOptions14.setTweakProcessing(tweakProcessing28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions30.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention33 = null;
        compilerOptions30.setCodingConvention(codingConvention33);
        compilerOptions30.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel37 = compilerOptions30.checkProvides;
        java.util.Set<java.lang.String> strSet38 = compilerOptions30.stripTypes;
        java.util.stream.Stream<java.lang.String> strStream39 = strSet38.stream();
        compilerOptions14.stripTypes = strSet38;
        compilerOptions0.setStripNameSuffixes(strSet38);
        compilerOptions0.sourceMapOutputPath = "java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        compilerOptions0.setPrettyPrint(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions46.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention49 = null;
        compilerOptions46.setCodingConvention(codingConvention49);
        compilerOptions46.setGenerateExports(true);
        compilerOptions46.setLocale("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        boolean boolean55 = compilerOptions46.foldConstants;
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions56.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention59 = null;
        compilerOptions56.setCodingConvention(codingConvention59);
        boolean boolean61 = compilerOptions56.computeFunctionSideEffects;
        boolean boolean62 = compilerOptions56.printInputDelimiter;
        compilerOptions56.setGeneratePseudoNames(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions65 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions65.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention68 = null;
        compilerOptions65.setCodingConvention(codingConvention68);
        compilerOptions65.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions72 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet73 = compilerOptions72.stripNamePrefixes;
        compilerOptions65.setIdGenerators(strSet73);
        com.google.javascript.jscomp.CompilerOptions compilerOptions75 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions75.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention78 = null;
        compilerOptions75.setCodingConvention(codingConvention78);
        compilerOptions75.setGeneratePseudoNames(true);
        compilerOptions75.inlineLocalFunctions = false;
        compilerOptions75.setIdeMode(true);
        compilerOptions75.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions88 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions88.setRewriteNewDateGoogNow(true);
        boolean boolean91 = compilerOptions88.extractPrototypeMemberDeclarations;
        compilerOptions88.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel94 = compilerOptions88.checkGlobalThisLevel;
        compilerOptions75.checkMissingReturn = checkLevel94;
        compilerOptions65.aggressiveVarCheck = checkLevel94;
        compilerOptions56.reportMissingOverride = checkLevel94;
        compilerOptions46.brokenClosureRequiresLevel = checkLevel94;
        compilerOptions0.setCheckMissingReturn(checkLevel94);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(format26);
        org.junit.Assert.assertTrue("'" + tweakProcessing28 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP + "'", tweakProcessing28.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP));
        org.junit.Assert.assertTrue("'" + checkLevel37 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel37.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(strStream39);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + checkLevel94 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel94.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str2 = sourceFile1.getOriginalPath();
        java.lang.String str4 = sourceFile1.getLine(0);
        int int6 = sourceFile1.getColumnOfOffset(0);
        java.lang.String str8 = sourceFile1.getLine(35);
        java.lang.String str9 = sourceFile1.toString();
        org.junit.Assert.assertNotNull(sourceFile1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException: Unversioned directory";
        compilerOptions0.setCollapseProperties(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean5 = compilerOptions0.labelRenaming;
        compilerOptions0.ambiguateProperties = false;
        boolean boolean8 = compilerOptions0.shouldColorizeErrorOutput();
        boolean boolean9 = compilerOptions0.crossModuleMethodMotion;
        com.google.javascript.jscomp.CheckLevel checkLevel10 = compilerOptions0.checkMissingGetCssNameLevel;
        boolean boolean11 = compilerOptions0.jqueryPass;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + checkLevel10 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel10.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
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
        com.google.javascript.jscomp.CheckLevel checkLevel17 = compilerOptions0.brokenClosureRequiresLevel;
        boolean boolean18 = compilerOptions0.collapseAnonymousFunctions;
        compilerOptions0.setNameReferenceGraphPath("-1");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + checkLevel17 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel17.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "java.io.IOException: ");
        boolean boolean6 = locationMappingList1.remove((java.lang.Object) "hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet8 = compilerOptions7.stripNamePrefixes;
        byte[] byteArray9 = compilerOptions7.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup10;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention15 = null;
        compilerOptions12.setCodingConvention(codingConvention15);
        compilerOptions12.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel19 = compilerOptions12.checkProvides;
        compilerOptions7.setWarningLevel(diagnosticGroup10, checkLevel19);
        java.util.Set<java.lang.String> strSet21 = compilerOptions7.stripNamePrefixes;
        boolean boolean22 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet21);
        java.lang.Object[] objArray23 = locationMappingList1.toArray();
        locationMappingList1.clear();
        java.util.Collection<java.lang.String> strCollection25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = locationMappingList1.containsAll(strCollection25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(byteArray9);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup10);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        compilerOptions0.setCollapseProperties(false);
        boolean boolean9 = compilerOptions0.inlineVariables;
        com.google.javascript.jscomp.CheckLevel checkLevel10 = compilerOptions0.aggressiveVarCheck;
        compilerOptions0.setCheckSymbols(true);
        boolean boolean13 = compilerOptions0.devirtualizePrototypeMethods;
        boolean boolean14 = compilerOptions0.markNoSideEffectCalls;
        compilerOptions0.setRemoveClosureAsserts(true);
        compilerOptions0.setReplaceStringsPlaceholderToken("java.io.IOException: -1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + checkLevel10 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel10.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream8 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        com.google.javascript.jscomp.SourceFile.Builder builder10 = new com.google.javascript.jscomp.SourceFile.Builder();
        java.io.IOException iOException12 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.lang.Object[] objArray15 = new java.lang.Object[] { builder10, iOException13, (byte) 10 };
        java.io.PrintStream printStream16 = printStream8.printf("", objArray15);
        printStream16.println((float) (-1L));
        java.io.PrintStream printStream20 = printStream16.append('#');
        java.io.PrintStream printStream22 = new java.io.PrintStream((java.io.OutputStream) printStream16, true);
        printStream16.print(false);
        printStream16.println((long) '4');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(printStream16);
        org.junit.Assert.assertNotNull(printStream20);
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGeneratePseudoNames(true);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setIdeMode(true);
        compilerOptions0.smartNameRemoval = true;
        boolean boolean13 = compilerOptions0.aliasKeywords;
        compilerOptions0.removeUnusedPrototypeProperties = false;
        boolean boolean16 = compilerOptions0.rewriteFunctionExpressions;
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("java.io.IOException: ", charset1);
        org.junit.Assert.assertNotNull(sourceFile2);
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        com.google.javascript.jscomp.SourceFile.Generator generator5 = null;
        com.google.javascript.jscomp.SourceFile sourceFile6 = builder0.buildFromGenerator("hi!", generator5);
        java.nio.charset.Charset charset7 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder8 = builder0.withCharset(charset7);
        com.google.javascript.jscomp.SourceFile.Generator generator10 = null;
        com.google.javascript.jscomp.SourceFile sourceFile11 = builder8.buildFromGenerator("-1", generator10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = sourceFile11.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(sourceFile11);
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setPropertyAffinity(true);
        boolean boolean7 = compilerOptions0.closurePass;
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy8 = compilerOptions0.anonymousFunctionNaming;
        compilerOptions0.setReportPath("Unversioned directory");
        compilerOptions0.optimizeReturns = false;
        compilerOptions0.inlineLocalFunctions = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions15.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention18 = null;
        compilerOptions15.setCodingConvention(codingConvention18);
        boolean boolean20 = compilerOptions15.computeFunctionSideEffects;
        boolean boolean21 = compilerOptions15.printInputDelimiter;
        compilerOptions15.setGeneratePseudoNames(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions24.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention27 = null;
        compilerOptions24.setCodingConvention(codingConvention27);
        compilerOptions24.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet32 = compilerOptions31.stripNamePrefixes;
        compilerOptions24.setIdGenerators(strSet32);
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions34.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention37 = null;
        compilerOptions34.setCodingConvention(codingConvention37);
        compilerOptions34.setGeneratePseudoNames(true);
        compilerOptions34.inlineLocalFunctions = false;
        compilerOptions34.setIdeMode(true);
        compilerOptions34.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions47.setRewriteNewDateGoogNow(true);
        boolean boolean50 = compilerOptions47.extractPrototypeMemberDeclarations;
        compilerOptions47.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel53 = compilerOptions47.checkGlobalThisLevel;
        compilerOptions34.checkMissingReturn = checkLevel53;
        compilerOptions24.aggressiveVarCheck = checkLevel53;
        compilerOptions15.reportMissingOverride = checkLevel53;
        compilerOptions15.setReportPath("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        java.util.Set<java.lang.String> strSet59 = compilerOptions15.stripNamePrefixes;
        compilerOptions15.enableExternExports(false);
        com.google.javascript.jscomp.SourceMap.Format format62 = compilerOptions15.sourceMapFormat;
        compilerOptions0.sourceMapFormat = format62;
        java.lang.String str64 = compilerOptions0.renamePrefix;
        compilerOptions0.setReplaceIdGenerators(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy8 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy8.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + checkLevel53 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel53.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNotNull(format62);
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean5 = compilerOptions0.labelRenaming;
        compilerOptions0.ambiguateProperties = false;
        boolean boolean8 = compilerOptions0.shouldColorizeErrorOutput();
        compilerOptions0.setDefineToBooleanLiteral("// Input %num%", true);
        boolean boolean12 = compilerOptions0.removeUnusedPrototypePropertiesInExterns;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention16 = null;
        compilerOptions13.setCodingConvention(codingConvention16);
        compilerOptions13.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel20 = compilerOptions13.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray21 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList22 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22, locationMappingArray21);
        compilerOptions13.sourceMapLocationMappings = locationMappingList22;
        boolean boolean25 = compilerOptions13.inlineVariables;
        boolean boolean26 = compilerOptions13.inlineLocalFunctions;
        compilerOptions13.setRenamePrefix("java.io.IOException: Unversioned directory");
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions29.setRewriteNewDateGoogNow(true);
        boolean boolean32 = compilerOptions29.extractPrototypeMemberDeclarations;
        compilerOptions29.setCollapseProperties(false);
        compilerOptions29.setClosurePass(true);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions29.setInputPropertyMapSerialized(byteArray42);
        compilerOptions29.setAliasAllStrings(false);
        com.google.javascript.jscomp.CheckLevel checkLevel46 = compilerOptions29.reportMissingOverride;
        compilerOptions29.removeUnusedLocalVars = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet50 = compilerOptions49.stripNamePrefixes;
        byte[] byteArray51 = compilerOptions49.inputVariableMapSerialized;
        compilerOptions49.checkSymbols = false;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap54 = null;
        compilerOptions49.setCssRenamingMap(cssRenamingMap54);
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions56.setRewriteNewDateGoogNow(true);
        boolean boolean59 = compilerOptions56.extractPrototypeMemberDeclarations;
        compilerOptions56.convertToDottedProperties = true;
        boolean boolean62 = compilerOptions56.inlineConstantVars;
        compilerOptions56.aliasAllStrings = false;
        boolean boolean65 = compilerOptions56.smartNameRemoval;
        compilerOptions56.gatherCssNames = true;
        com.google.javascript.jscomp.CheckLevel checkLevel68 = compilerOptions56.checkGlobalNamesLevel;
        compilerOptions49.setCheckProvides(checkLevel68);
        compilerOptions29.setCheckGlobalNamesLevel(checkLevel68);
        compilerOptions13.setReportUnknownTypes(checkLevel68);
        compilerOptions0.aggressiveVarCheck = checkLevel68;
        com.google.javascript.jscomp.CompilerOptions compilerOptions73 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions73.enableExternExports(true);
        compilerOptions73.setCrossModuleMethodMotion(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions78 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet79 = compilerOptions78.stripNamePrefixes;
        byte[] byteArray80 = compilerOptions78.inputVariableMapSerialized;
        compilerOptions78.removeUnusedClassProperties = true;
        com.google.javascript.jscomp.ErrorFormat errorFormat83 = compilerOptions78.errorFormat;
        compilerOptions73.errorFormat = errorFormat83;
        com.google.javascript.jscomp.CompilerOptions compilerOptions85 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet86 = compilerOptions85.stripNamePrefixes;
        byte[] byteArray87 = compilerOptions85.inputVariableMapSerialized;
        boolean boolean88 = compilerOptions85.exportTestFunctions;
        compilerOptions85.lineBreak = false;
        boolean boolean91 = compilerOptions85.optimizeParameters;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode92 = com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
        compilerOptions85.setLanguageOut(languageMode92);
        compilerOptions73.setLanguageOut(languageMode92);
        compilerOptions0.setLanguageIn(languageMode92);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + checkLevel20 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel20.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + checkLevel46 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel46.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertNull(byteArray51);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + checkLevel68 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel68.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertNull(byteArray80);
        org.junit.Assert.assertNotNull(errorFormat83);
        org.junit.Assert.assertNotNull(strSet86);
        org.junit.Assert.assertNull(byteArray87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + languageMode92 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT + "'", languageMode92.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT));
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("java.io.IOException: ", "-1");
        org.junit.Assert.assertNotNull(sourceFile2);
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
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
        boolean boolean16 = compilerOptions0.jqueryPass;
        compilerOptions0.crossModuleCodeMotion = true;
        com.google.javascript.jscomp.SourceMap.Format format19 = compilerOptions0.sourceMapFormat;
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setRewriteNewDateGoogNow(true);
        boolean boolean23 = compilerOptions20.extractPrototypeMemberDeclarations;
        compilerOptions20.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet26 = compilerOptions20.stripTypePrefixes;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap27 = compilerOptions20.cssRenamingMap;
        compilerOptions20.reserveRawExports = true;
        com.google.javascript.jscomp.CompilerOptions.Reach reach30 = com.google.javascript.jscomp.CompilerOptions.Reach.LOCAL_ONLY;
        compilerOptions20.setInlineFunctions(reach30);
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions32.setRewriteNewDateGoogNow(true);
        boolean boolean35 = compilerOptions32.extractPrototypeMemberDeclarations;
        compilerOptions32.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet38 = compilerOptions32.stripTypePrefixes;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap39 = compilerOptions32.cssRenamingMap;
        compilerOptions32.reserveRawExports = true;
        com.google.javascript.jscomp.CompilerOptions.Reach reach42 = com.google.javascript.jscomp.CompilerOptions.Reach.LOCAL_ONLY;
        compilerOptions32.setInlineFunctions(reach42);
        compilerOptions20.setRemoveUnusedVariable(reach42);
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions45.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention48 = null;
        compilerOptions45.setCodingConvention(codingConvention48);
        compilerOptions45.setPropertyAffinity(true);
        compilerOptions45.setInlineConstantVars(true);
        com.google.javascript.jscomp.CheckLevel checkLevel54 = compilerOptions45.checkMissingReturn;
        compilerOptions20.reportMissingOverride = checkLevel54;
        compilerOptions0.checkUnreachableCode = checkLevel54;
        compilerOptions0.setGroupVariableDeclarations(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(format19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(cssRenamingMap27);
        org.junit.Assert.assertTrue("'" + reach30 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.LOCAL_ONLY + "'", reach30.equals(com.google.javascript.jscomp.CompilerOptions.Reach.LOCAL_ONLY));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNull(cssRenamingMap39);
        org.junit.Assert.assertTrue("'" + reach42 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.LOCAL_ONLY + "'", reach42.equals(com.google.javascript.jscomp.CompilerOptions.Reach.LOCAL_ONLY));
        org.junit.Assert.assertTrue("'" + checkLevel54 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel54.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
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
        compilerOptions0.setRenamePrefix("hi!");
        boolean boolean27 = compilerOptions0.generateExports;
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions28.setLabelRenaming(true);
        compilerOptions28.syntheticBlockStartMarker = "java.io.IOException";
        compilerOptions28.locale = "2019/07/12 07:12";
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray35 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList36 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList36, locationMappingArray35);
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions38.setRewriteNewDateGoogNow(true);
        boolean boolean41 = compilerOptions38.extractPrototypeMemberDeclarations;
        compilerOptions38.setCollapseProperties(false);
        compilerOptions38.setClosurePass(true);
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions38.setInputPropertyMapSerialized(byteArray51);
        compilerOptions38.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions55.setRewriteNewDateGoogNow(true);
        boolean boolean58 = compilerOptions55.extractPrototypeMemberDeclarations;
        compilerOptions55.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet61 = compilerOptions55.stripTypePrefixes;
        compilerOptions38.aliasableStrings = strSet61;
        boolean boolean63 = locationMappingList36.removeAll((java.util.Collection<java.lang.String>) strSet61);
        compilerOptions28.setReplaceStringsReservedStrings(strSet61);
        compilerOptions0.stripTypes = strSet61;
        compilerOptions0.setAliasExternals(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(byteArray10);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup11);
        org.junit.Assert.assertTrue("'" + checkLevel20 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel20.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(locationMappingArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.setRemoveUnusedClassProperties(true);
        boolean boolean7 = compilerOptions0.convertToDottedProperties;
        compilerOptions0.setRemoveClosureAsserts(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setDefineToBooleanLiteral("hi!", true);
        compilerOptions0.reserveRawExports = true;
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        compilerOptions0.disableRuntimeTypeCheck();
        compilerOptions0.setOptimizeCalls(false);
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray11 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList12 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList12, locationMappingArray11);
        java.lang.String[] strArray21 = new java.lang.String[] { "// Input %num%", "java.io.IOException", "", "// Input %num%", "java.io.IOException: java.io.IOException: 2019/07/12 07:12", "Unversioned directory", "java.io.IOException: java.io.IOException: 2019/07/12 07:12" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        boolean boolean24 = locationMappingList12.removeAll((java.util.Collection<java.lang.String>) strList22);
        java.util.Spliterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingSpliterator25 = locationMappingList12.spliterator();
        compilerOptions0.sourceMapLocationMappings = locationMappingList12;
        compilerOptions0.disableRuntimeTypeCheck();
        boolean boolean28 = compilerOptions0.foldConstants;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locationMappingArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locationMappingSpliterator25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode5 = compilerOptions0.getTracerMode();
        compilerOptions0.lineBreak = false;
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(false);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setFoldConstants(true);
        java.lang.String str14 = compilerOptions0.instrumentationTemplate;
        boolean boolean15 = compilerOptions0.recordFunctionInformation;
        compilerOptions0.enableRuntimeTypeCheck("");
        org.junit.Assert.assertTrue("'" + tracerMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode5.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("java.io.IOException: ", generator1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = sourceFile2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setInlineConstantVars(true);
        compilerOptions0.setTweakToStringLiteral("", "java.io.IOException");
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setRewriteNewDateGoogNow(true);
        boolean boolean9 = compilerOptions6.extractPrototypeMemberDeclarations;
        compilerOptions6.setCollapseProperties(false);
        compilerOptions6.setClosurePass(true);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions6.setInputPropertyMapSerialized(byteArray19);
        compilerOptions6.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.MessageBundle messageBundle23 = null;
        compilerOptions6.messageBundle = messageBundle23;
        com.google.javascript.jscomp.MessageBundle messageBundle25 = null;
        compilerOptions6.messageBundle = messageBundle25;
        compilerOptions6.lineBreak = true;
        com.google.javascript.jscomp.CheckLevel checkLevel29 = compilerOptions6.checkMissingGetCssNameLevel;
        compilerOptions0.setAggressiveVarCheck(checkLevel29);
        boolean boolean31 = compilerOptions0.extractPrototypeMemberDeclarations;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + checkLevel29 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel29.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        java.io.PrintStream printStream19 = printStream1.append((java.lang.CharSequence) "// Input %num%");
        printStream19.println(' ');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(printStream19);
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
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
        compilerOptions0.setManageClosureDependencies(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.getCode();
        java.lang.String str3 = sourceFile1.getCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        boolean boolean8 = compilerOptions0.optimizeReturns;
        compilerOptions0.smartNameRemoval = true;
        java.util.Set<java.lang.String> strSet11 = compilerOptions0.aliasableStrings;
        compilerOptions0.setRewriteFunctionExpressions(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention17 = null;
        compilerOptions14.setCodingConvention(codingConvention17);
        boolean boolean19 = compilerOptions14.generateExports;
        compilerOptions14.gatherCssNames = false;
        boolean boolean22 = compilerOptions14.optimizeReturns;
        compilerOptions14.smartNameRemoval = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions26.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention29 = null;
        compilerOptions26.setCodingConvention(codingConvention29);
        compilerOptions26.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel33 = compilerOptions26.checkProvides;
        java.lang.String[] strArray35 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        compilerOptions26.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList36);
        java.util.stream.Stream<java.lang.String> strStream39 = strList36.stream();
        compilerOptions14.setReplaceStringsConfiguration("hi!", (java.util.List<java.lang.String>) strList36);
        compilerOptions0.setManageClosureDependencies((java.util.List<java.lang.String>) strList36);
        java.lang.String str42 = compilerOptions0.renamePrefixNamespace;
        compilerOptions0.setPrintInputDelimiter(false);
        compilerOptions0.setClosurePass(false);
        compilerOptions0.enableExternExports(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + checkLevel33 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel33.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strStream39);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode3 = com.google.javascript.jscomp.CompilerOptions.TracerMode.TIMING_ONLY;
        compilerOptions0.setTracer(tracerMode3);
        compilerOptions0.setAliasableGlobals("");
        boolean boolean7 = compilerOptions0.removeDeadCode;
        org.junit.Assert.assertTrue("'" + tracerMode3 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.TIMING_ONLY + "'", tracerMode3.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.TIMING_ONLY));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.checkSymbols = false;
        compilerOptions0.setCheckTypes(true);
        compilerOptions0.coalesceVariableNames = true;
        java.lang.String str9 = compilerOptions0.renamePrefix;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.setPrintInputDelimiter(true);
        boolean boolean8 = compilerOptions0.closurePass;
        compilerOptions0.checkMissingGetCssNameBlacklist = "Unversioned directory";
        boolean boolean11 = compilerOptions0.markNoSideEffectCalls;
        java.lang.String str12 = compilerOptions0.instrumentationTemplate;
        com.google.javascript.jscomp.CheckLevel checkLevel13 = compilerOptions0.checkGlobalNamesLevel;
        java.util.Set<java.lang.String> strSet14 = compilerOptions0.aliasableStrings;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + checkLevel13 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel13.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.exportTestFunctions;
        compilerOptions0.lineBreak = false;
        compilerOptions0.setCrossModuleMethodMotion(true);
        compilerOptions0.setDefineToNumberLiteral("", (int) (short) 1);
        compilerOptions0.setMoveFunctionDeclarations(false);
        boolean boolean13 = compilerOptions0.disambiguateProperties;
        compilerOptions0.setOptimizeParameters(true);
        compilerOptions0.setExternExports(false);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.computeFunctionSideEffects;
        compilerOptions0.setInlineProperties(true);
        java.util.Set<java.lang.String> strSet8 = compilerOptions0.stripTypes;
        compilerOptions0.setNameReferenceGraphPath("-1");
        compilerOptions0.setComputeFunctionSideEffects(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
        com.google.javascript.jscomp.DiagnosticGroups.TWEAKS = diagnosticGroup0;
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel6 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.setIgnoreCajaProperties(false);
        compilerOptions0.removeUnusedClassProperties = true;
        compilerOptions0.setRuntimeTypeCheckLogFunction("2019/07/12 07:12");
        compilerOptions0.setCollapseObjectLiterals(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel6 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel6.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: Unversioned directory");
        java.io.IOException iOException4 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException5 = new java.io.IOException("Unversioned directory", (java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException4);
        iOException1.addSuppressed((java.lang.Throwable) iOException7);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = compiler14.getSourceLine("Unversioned directory", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNull(diagnosticGroup3);
        org.junit.Assert.assertNull(diagnosticGroup5);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null, null, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null, null, hi!]");
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertNull(sourceMap15);
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet6 = compilerOptions0.stripTypePrefixes;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compilerOptions0.cssRenamingMap;
        compilerOptions0.setDefineToBooleanLiteral("Unversioned directory", true);
        compilerOptions0.setMoveFunctionDeclarations(true);
        compilerOptions0.ideMode = true;
        boolean boolean15 = compilerOptions0.jqueryPass;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(cssRenamingMap7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        boolean boolean6 = compilerOptions0.removeUnusedVars;
        boolean boolean7 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        compilerOptions0.setProcessObjectPropertyString(false);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean12 = compilerOptions0.coalesceVariableNames;
        boolean boolean13 = compilerOptions0.optimizeArgumentsArray;
        compilerOptions0.setSummaryDetailLevel((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromInputStream("java.io.IOException: -1", inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        compilerOptions0.setLocale("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        boolean boolean9 = compilerOptions0.foldConstants;
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap10 = compilerOptions0.customPasses;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customPassExecutionTimeMultimap10);
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean5 = compilerOptions0.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format6 = compilerOptions0.sourceMapFormat;
        boolean boolean7 = compilerOptions0.deadAssignmentElimination;
        compilerOptions0.syntheticBlockEndMarker = "java.io.IOException";
        boolean boolean10 = compilerOptions0.preferLineBreakAtEndOfFile;
        compilerOptions0.setAliasKeywords(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(format6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CONST = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_USELESS_CODE = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        boolean boolean6 = compilerOptions0.removeUnusedVars;
        boolean boolean7 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        compilerOptions0.moveFunctionDeclarations = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setRewriteNewDateGoogNow(true);
        boolean boolean13 = compilerOptions10.extractPrototypeMemberDeclarations;
        boolean boolean14 = compilerOptions10.jqueryPass;
        compilerOptions10.setReplaceIdGenerators(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        boolean boolean20 = compilerOptions17.extractPrototypeMemberDeclarations;
        compilerOptions17.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel23 = compilerOptions17.checkGlobalThisLevel;
        compilerOptions10.checkProvides = checkLevel23;
        compilerOptions0.checkUnreachableCode = checkLevel23;
        compilerOptions0.moveFunctionDeclarations = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + checkLevel23 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel23.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TYPE_INVALIDATION = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
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
        compilerOptions0.setExportTestFunctions(true);
        compilerOptions0.setTweakToStringLiteral("// Input %num%", "hi!");
        compilerOptions0.setCrossModuleCodeMotion(true);
        compilerOptions0.exportTestFunctions = false;
        compilerOptions0.setAcceptConstKeyword(false);
        compilerOptions0.smartNameRemoval = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + checkLevel38 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel38.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setPropertyAffinity(true);
        boolean boolean7 = compilerOptions0.closurePass;
        boolean boolean8 = compilerOptions0.checkTypes;
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode9 = null;
        compilerOptions0.setTracer(tracerMode9);
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray11 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList12 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList12, locationMappingArray11);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setRewriteNewDateGoogNow(true);
        boolean boolean17 = compilerOptions14.extractPrototypeMemberDeclarations;
        compilerOptions14.setCollapseProperties(false);
        compilerOptions14.setClosurePass(true);
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions14.setInputPropertyMapSerialized(byteArray27);
        compilerOptions14.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions31.setRewriteNewDateGoogNow(true);
        boolean boolean34 = compilerOptions31.extractPrototypeMemberDeclarations;
        compilerOptions31.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet37 = compilerOptions31.stripTypePrefixes;
        compilerOptions14.aliasableStrings = strSet37;
        boolean boolean39 = locationMappingList12.removeAll((java.util.Collection<java.lang.String>) strSet37);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup40 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup40;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup40;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup40;
        boolean boolean44 = locationMappingList12.contains((java.lang.Object) diagnosticGroup40);
        compilerOptions0.setSourceMapLocationMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList12);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping46 = null;
        boolean boolean47 = locationMappingList12.add(locationMapping46);
        boolean boolean48 = locationMappingList12.isEmpty();
        int int49 = locationMappingList12.size();
        java.io.PrintStream printStream51 = new java.io.PrintStream("Unversioned directory");
        char[] charArray54 = new char[] { '4', '4' };
        printStream51.print(charArray54);
        printStream51.print((int) ' ');
        byte[] byteArray64 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream51.write(byteArray64, (int) (byte) 0, (int) (byte) 1);
        java.lang.Throwable throwable71 = null;
        java.io.IOException iOException72 = new java.io.IOException("", throwable71);
        java.lang.Throwable throwable74 = null;
        java.io.IOException iOException75 = new java.io.IOException("", throwable74);
        iOException72.addSuppressed((java.lang.Throwable) iOException75);
        java.io.IOException iOException77 = new java.io.IOException("", (java.lang.Throwable) iOException72);
        java.lang.Throwable[] throwableArray78 = iOException77.getSuppressed();
        java.io.PrintStream printStream79 = printStream51.format("java.io.IOException: Unversioned directory", (java.lang.Object[]) throwableArray78);
        java.lang.Throwable throwable82 = null;
        java.io.IOException iOException83 = new java.io.IOException("", throwable82);
        java.lang.Throwable throwable85 = null;
        java.io.IOException iOException86 = new java.io.IOException("", throwable85);
        iOException83.addSuppressed((java.lang.Throwable) iOException86);
        java.lang.Throwable[] throwableArray88 = iOException86.getSuppressed();
        java.io.PrintStream printStream89 = printStream51.printf("java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12", (java.lang.Object[]) throwableArray88);
        int int90 = locationMappingList12.lastIndexOf((java.lang.Object) printStream51);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locationMappingArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(printStream79);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(printStream89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode5 = compilerOptions0.getTracerMode();
        compilerOptions0.lineBreak = false;
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(false);
        compilerOptions0.recordFunctionInformation = false;
        compilerOptions0.inlineGetters = true;
        org.junit.Assert.assertTrue("'" + tracerMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode5.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
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
        compilerOptions0.setSyntheticBlockStartMarker("java.io.IOException");
        compilerOptions0.setPrettyPrint(false);
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TYPE_INVALIDATION = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
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
        boolean boolean13 = compilerOptions0.printInputDelimiter;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.reserveRawExports = true;
        compilerOptions0.setCollapsePropertiesOnExternTypes(false);
        compilerOptions0.setSkipAllPasses(true);
        java.util.Set<java.lang.String> strSet9 = compilerOptions0.stripTypePrefixes;
        boolean boolean10 = compilerOptions0.aliasKeywords;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions11.setRewriteNewDateGoogNow(true);
        boolean boolean14 = compilerOptions11.extractPrototypeMemberDeclarations;
        compilerOptions11.setCollapseProperties(false);
        boolean boolean17 = compilerOptions11.lineBreak;
        compilerOptions11.recordFunctionInformation = false;
        com.google.javascript.jscomp.CompilerOptions.Reach reach20 = com.google.javascript.jscomp.CompilerOptions.Reach.LOCAL_ONLY;
        compilerOptions11.setInlineFunctions(reach20);
        compilerOptions0.setRemoveUnusedVariable(reach20);
        compilerOptions0.setAliasExternals(true);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + reach20 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.LOCAL_ONLY + "'", reach20.equals(com.google.javascript.jscomp.CompilerOptions.Reach.LOCAL_ONLY));
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
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
        compilerOptions0.setSummaryDetailLevel((int) (byte) 1);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode17 = com.google.javascript.jscomp.CompilerOptions.TracerMode.ALL;
        compilerOptions0.setTracerMode(tracerMode17);
        boolean boolean19 = compilerOptions0.aliasAllStrings;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tracerMode17 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.ALL + "'", tracerMode17.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.ALL));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        sourceFile2.setOriginalPath("hi!");
        sourceFile2.setOriginalPath("");
        sourceFile2.setOriginalPath("");
        boolean boolean9 = sourceFile2.isExtern();
        java.lang.String str11 = sourceFile2.getLine((int) (byte) 1);
        sourceFile2.clearCachedSource();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.convertToDottedProperties = true;
        boolean boolean9 = compilerOptions3.inlineConstantVars;
        boolean boolean10 = compilerOptions3.extractPrototypeMemberDeclarations;
        boolean boolean11 = compilerOptions3.reserveRawExports;
        boolean boolean12 = locationMappingList1.remove((java.lang.Object) boolean11);
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention16 = null;
        compilerOptions13.setCodingConvention(codingConvention16);
        compilerOptions13.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet21 = compilerOptions20.stripNamePrefixes;
        compilerOptions13.setIdGenerators(strSet21);
        java.util.stream.Stream<java.lang.String> strStream23 = strSet21.stream();
        boolean boolean24 = locationMappingList1.retainAll((java.util.Collection<java.lang.String>) strSet21);
        java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor25 = locationMappingList1.listIterator();
        java.util.function.UnaryOperator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingUnaryOperator26 = null;
        // The following exception was thrown during execution in test generation
        try {
            locationMappingList1.replaceAll(locationMappingUnaryOperator26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locationMappingItor25);
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setPropertyAffinity(true);
        compilerOptions0.setDisambiguateProperties(false);
        java.util.Set<java.lang.String> strSet9 = compilerOptions0.stripNameSuffixes;
        compilerOptions0.skipAllCompilerPasses();
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        com.google.javascript.jscomp.CheckLevel checkLevel3 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.CheckLevel checkLevel4 = compilerOptions0.reportMissingOverride;
        compilerOptions0.checkControlStructures = true;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = null;
        compilerOptions0.cssRenamingMap = cssRenamingMap7;
        boolean boolean9 = compilerOptions0.flowSensitiveInlineVariables;
        compilerOptions0.setTweakToNumberLiteral("java.io.IOException: Unversioned directory", (int) (short) 100);
        compilerOptions0.checkControlStructures = true;
        compilerOptions0.setSourceMapOutputPath("java.io.IOException");
        org.junit.Assert.assertTrue("'" + checkLevel3 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel3.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel4 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel4.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.collapseAnonymousFunctions = false;
        boolean boolean7 = compilerOptions0.checkTypes;
        compilerOptions0.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = null;
        compilerOptions10.setCodingConvention(codingConvention13);
        compilerOptions10.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet18 = compilerOptions17.stripNamePrefixes;
        compilerOptions10.setIdGenerators(strSet18);
        compilerOptions0.setStripNameSuffixes(strSet18);
        compilerOptions0.prettyPrint = false;
        boolean boolean23 = compilerOptions0.markAsCompiled;
        compilerOptions0.setSmartNameRemoval(true);
        compilerOptions0.setRewriteFunctionExpressions(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions28.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention31 = null;
        compilerOptions28.setCodingConvention(codingConvention31);
        compilerOptions28.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel35 = compilerOptions28.checkProvides;
        java.util.Set<java.lang.String> strSet36 = compilerOptions28.stripTypes;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy37 = compilerOptions28.variableRenaming;
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions38.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention41 = null;
        compilerOptions38.setCodingConvention(codingConvention41);
        compilerOptions38.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel45 = compilerOptions38.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray46 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList47 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList47, locationMappingArray46);
        compilerOptions38.sourceMapLocationMappings = locationMappingList47;
        com.google.javascript.jscomp.CheckLevel checkLevel50 = compilerOptions38.aggressiveVarCheck;
        boolean boolean51 = compilerOptions38.aliasAllStrings;
        compilerOptions38.setDefineToNumberLiteral("java.io.IOException", 100);
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions55.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention58 = null;
        compilerOptions55.setCodingConvention(codingConvention58);
        boolean boolean60 = compilerOptions55.generateExports;
        compilerOptions55.printInputDelimiter = false;
        compilerOptions55.prettyPrint = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions65 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions65.setRewriteNewDateGoogNow(true);
        boolean boolean68 = compilerOptions65.extractPrototypeMemberDeclarations;
        compilerOptions65.convertToDottedProperties = true;
        boolean boolean71 = compilerOptions65.inlineConstantVars;
        boolean boolean72 = compilerOptions65.extractPrototypeMemberDeclarations;
        compilerOptions65.optimizeCalls = true;
        compilerOptions65.removeUnusedPrototypeProperties = false;
        compilerOptions65.setExternExports(true);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode79 = compilerOptions65.getTracerMode();
        compilerOptions65.generateExports = true;
        compilerOptions65.jqueryPass = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions84 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions84.setRewriteNewDateGoogNow(true);
        boolean boolean87 = compilerOptions84.extractPrototypeMemberDeclarations;
        compilerOptions84.convertToDottedProperties = true;
        compilerOptions84.setRemoveUnusedVars(true);
        compilerOptions84.removeUnusedClassProperties = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy94 = compilerOptions84.propertyRenaming;
        compilerOptions65.propertyRenaming = propertyRenamingPolicy94;
        compilerOptions55.setPropertyRenaming(propertyRenamingPolicy94);
        compilerOptions38.propertyRenaming = propertyRenamingPolicy94;
        compilerOptions0.setRenamingPolicy(variableRenamingPolicy37, propertyRenamingPolicy94);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + checkLevel35 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel35.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy37 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.OFF + "'", variableRenamingPolicy37.equals(com.google.javascript.jscomp.VariableRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel45 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel45.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + checkLevel50 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel50.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + tracerMode79 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode79.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy94 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy94.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet8 = compilerOptions7.stripNamePrefixes;
        compilerOptions0.setIdGenerators(strSet8);
        compilerOptions0.sourceMapOutputPath = "java.io.IOException: ";
        boolean boolean12 = compilerOptions0.printInputDelimiter;
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        compilerOptions0.setDefineReplacements(strMap13);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        compilerOptions0.setDefineToDoubleLiteral("java.io.IOException: ", (double) 0L);
        boolean boolean11 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.markAsCompiled = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_REGEXP = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        compilerOptions0.locale = "2019/07/12 07:12";
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compilerOptions0.cssRenamingMap;
        compilerOptions0.setRuntimeTypeCheck(true);
        compilerOptions0.inlineVariables = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setLabelRenaming(true);
        com.google.javascript.jscomp.CheckLevel checkLevel15 = compilerOptions12.checkProvides;
        com.google.javascript.jscomp.CheckLevel checkLevel16 = compilerOptions12.reportMissingOverride;
        compilerOptions0.setCheckProvides(checkLevel16);
        compilerOptions0.setChainCalls(true);
        org.junit.Assert.assertNull(cssRenamingMap7);
        org.junit.Assert.assertTrue("'" + checkLevel15 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel15.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel16 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel16.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
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
        compilerOptions0.coalesceVariableNames = false;
        boolean boolean36 = compilerOptions0.rewriteFunctionExpressions;
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + checkLevel29 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel29.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TWEAKS = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12", charset1);
        org.junit.Assert.assertNotNull(sourceFile2);
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.setCollapseProperties(false);
        compilerOptions3.setClosurePass(true);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions3.setInputPropertyMapSerialized(byteArray16);
        compilerOptions3.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setRewriteNewDateGoogNow(true);
        boolean boolean23 = compilerOptions20.extractPrototypeMemberDeclarations;
        compilerOptions20.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet26 = compilerOptions20.stripTypePrefixes;
        compilerOptions3.aliasableStrings = strSet26;
        boolean boolean28 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet26);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping30 = null;
        locationMappingList1.add(0, locationMapping30);
        int int32 = locationMappingList1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList35 = locationMappingList1.subList(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        java.io.PrintStream printStream1 = new java.io.PrintStream("java.io.IOException");
        printStream1.write((int) (byte) 0);
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        compilerOptions0.lineBreak = false;
        boolean boolean8 = compilerOptions0.checkTypes;
        boolean boolean9 = compilerOptions0.isRemoveUnusedClassProperties();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        compilerOptions0.optimizeParameters = true;
        com.google.javascript.jscomp.CheckLevel checkLevel5 = compilerOptions0.checkRequires;
        compilerOptions0.setSummaryDetailLevel((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + checkLevel5 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel5.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean5 = compilerOptions0.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format6 = compilerOptions0.sourceMapFormat;
        compilerOptions0.setCollapseAnonymousFunctions(false);
        compilerOptions0.setDefineToDoubleLiteral("Unversioned directory", (double) 0.0f);
        compilerOptions0.setColorizeErrorOutput(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(format6);
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        compilerOptions0.disableRuntimeTypeCheck();
        compilerOptions0.setOptimizeCalls(false);
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray11 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList12 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList12, locationMappingArray11);
        java.lang.String[] strArray21 = new java.lang.String[] { "// Input %num%", "java.io.IOException", "", "// Input %num%", "java.io.IOException: java.io.IOException: 2019/07/12 07:12", "Unversioned directory", "java.io.IOException: java.io.IOException: 2019/07/12 07:12" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        boolean boolean24 = locationMappingList12.removeAll((java.util.Collection<java.lang.String>) strList22);
        java.util.Spliterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingSpliterator25 = locationMappingList12.spliterator();
        compilerOptions0.sourceMapLocationMappings = locationMappingList12;
        java.util.function.UnaryOperator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingUnaryOperator27 = null;
        // The following exception was thrown during execution in test generation
        try {
            locationMappingList12.replaceAll(locationMappingUnaryOperator27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locationMappingArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locationMappingSpliterator25);
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        compilerOptions0.setDefineReplacements(strMap21);
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.setRewriteNewDateGoogNow(true);
        boolean boolean26 = compilerOptions23.extractPrototypeMemberDeclarations;
        boolean boolean27 = compilerOptions23.jqueryPass;
        compilerOptions23.collapseAnonymousFunctions = false;
        java.lang.String str30 = compilerOptions23.aliasStringsBlacklist;
        compilerOptions23.inlineGetters = false;
        boolean boolean33 = compilerOptions23.exportTestFunctions;
        compilerOptions23.setDefineToDoubleLiteral("Unversioned directory", (double) 100);
        compilerOptions23.preferLineBreakAtEndOfFile = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions39.setRewriteNewDateGoogNow(true);
        compilerOptions39.setCheckSuspiciousCode(true);
        compilerOptions39.setConvertToDottedProperties(false);
        compilerOptions39.setFoldConstants(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions48.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention51 = null;
        compilerOptions48.setCodingConvention(codingConvention51);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode53 = compilerOptions48.getTracerMode();
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup54 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup54;
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions56.setRewriteNewDateGoogNow(true);
        boolean boolean59 = compilerOptions56.extractPrototypeMemberDeclarations;
        compilerOptions56.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel62 = compilerOptions56.brokenClosureRequiresLevel;
        compilerOptions48.setWarningLevel(diagnosticGroup54, checkLevel62);
        com.google.javascript.jscomp.CheckLevel checkLevel64 = compilerOptions48.checkGlobalThisLevel;
        compilerOptions39.setCheckProvides(checkLevel64);
        compilerOptions23.setAggressiveVarCheck(checkLevel64);
        compilerOptions0.setBrokenClosureRequiresLevel(checkLevel64);
        compilerOptions0.setIgnoreCajaProperties(true);
        java.lang.Object obj70 = compilerOptions0.clone();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + tracerMode53 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode53.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
// flaky:         org.junit.Assert.assertNull(diagnosticGroup54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + checkLevel62 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel62.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertTrue("'" + checkLevel64 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel64.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(obj70);
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream8 = new java.io.PrintStream((java.io.OutputStream) printStream1, false, "2019/07/12 07:12");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 2019/07/12 07:12");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        java.io.PrintStream printStream19 = new java.io.PrintStream("Unversioned directory");
        char[] charArray22 = new char[] { '4', '4' };
        printStream19.print(charArray22);
        printStream19.print((int) ' ');
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream19.write(byteArray32, (int) (byte) 0, (int) (byte) 1);
        char[] charArray42 = new char[] { ' ', '#', '4', 'a', '#', 'a' };
        printStream19.print(charArray42);
        printStream1.println(charArray42);
        printStream1.print((long) (byte) 1);
        java.io.PrintStream printStream47 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        java.io.PrintStream printStream49 = new java.io.PrintStream("Unversioned directory");
        char[] charArray52 = new char[] { '4', '4' };
        printStream49.print(charArray52);
        printStream49.print((int) ' ');
        java.io.PrintStream printStream57 = new java.io.PrintStream((java.io.OutputStream) printStream49, false);
        printStream49.write((int) '#');
        java.util.Locale locale60 = null;
        java.lang.Object[] objArray63 = new java.lang.Object[] { "Unversioned directory" };
        java.io.PrintStream printStream64 = printStream49.format(locale60, "Unversioned directory", objArray63);
        printStream64.println((double) 1);
        printStream64.print(1L);
        java.io.PrintStream printStream70 = new java.io.PrintStream("Unversioned directory");
        java.io.PrintStream printStream72 = new java.io.PrintStream("Unversioned directory");
        char[] charArray75 = new char[] { '4', '4' };
        printStream72.print(charArray75);
        printStream70.print(charArray75);
        printStream64.println(charArray75);
        printStream1.print(charArray75);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), " #4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), " #4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[ , #, 4, a, #, a]");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[Unversioned directory]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[Unversioned directory]");
        org.junit.Assert.assertNotNull(printStream64);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[4, 4]");
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        compilerOptions0.aliasAllStrings = false;
        boolean boolean9 = compilerOptions0.smartNameRemoval;
        compilerOptions0.collapseAnonymousFunctions = false;
        compilerOptions0.setAliasExternals(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet6 = compilerOptions0.stripTypePrefixes;
        com.google.javascript.jscomp.CheckLevel checkLevel7 = null;
        compilerOptions0.setCheckGlobalThisLevel(checkLevel7);
        compilerOptions0.setOutputCharset("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        compilerOptions0.setSyntheticBlockEndMarker("Unversioned directory");
        boolean boolean13 = compilerOptions0.rewriteFunctionExpressions;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        compilerOptions0.resetWarningsGuard();
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean9 = compilerOptions0.assumeStrictThis();
        compilerOptions0.computeFunctionSideEffects = true;
        compilerOptions0.removeUnusedClassProperties = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
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
        compilerOptions0.setReserveRawExports(false);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy26 = compilerOptions0.variableRenaming;
        boolean boolean27 = compilerOptions0.prettyPrint;
        boolean boolean28 = compilerOptions0.moveFunctionDeclarations;
        compilerOptions0.setReplaceIdGenerators(true);
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + checkLevel22 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel22.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy26 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.OFF + "'", variableRenamingPolicy26.equals(com.google.javascript.jscomp.VariableRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        double double3 = compiler1.getProgress();
        double double4 = compiler1.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = compiler1.getSourceLine("Unversioned directory", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
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
        java.lang.String str29 = compilerOptions0.locale;
        com.google.javascript.jscomp.CheckLevel checkLevel30 = compilerOptions0.checkUnreachableCode;
        com.google.javascript.jscomp.DependencyOptions dependencyOptions31 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.setDependencyOptions(dependencyOptions31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + checkLevel30 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel30.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel6 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.setDevirtualizePrototypeMethods(true);
        com.google.javascript.jscomp.CheckLevel checkLevel9 = compilerOptions0.checkMissingGetCssNameLevel;
        compilerOptions0.locale = "java.io.IOException: ";
        compilerOptions0.rewriteFunctionExpressions = true;
        compilerOptions0.renamePrefixNamespace = "java.io.IOException: Unversioned directory";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel6 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel6.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel9 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel9.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.checkSymbols = false;
        compilerOptions0.setCheckTypes(true);
        boolean boolean7 = compilerOptions0.optimizeReturns;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
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
        com.google.javascript.jscomp.MessageBundle messageBundle19 = null;
        compilerOptions0.messageBundle = messageBundle19;
        compilerOptions0.lineBreak = true;
        com.google.javascript.jscomp.CheckLevel checkLevel23 = compilerOptions0.checkMissingGetCssNameLevel;
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions24.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention27 = null;
        compilerOptions24.setCodingConvention(codingConvention27);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode29 = compilerOptions24.getTracerMode();
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions30.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention33 = null;
        compilerOptions30.setCodingConvention(codingConvention33);
        boolean boolean35 = compilerOptions30.generateExports;
        compilerOptions30.deadAssignmentElimination = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions38.enableExternExports(true);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy41 = compilerOptions38.variableRenaming;
        compilerOptions30.setVariableRenaming(variableRenamingPolicy41);
        compilerOptions24.variableRenaming = variableRenamingPolicy41;
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions44.setRewriteNewDateGoogNow(true);
        boolean boolean47 = compilerOptions44.extractPrototypeMemberDeclarations;
        boolean boolean48 = compilerOptions44.jqueryPass;
        compilerOptions44.collapseAnonymousFunctions = false;
        java.lang.String str51 = compilerOptions44.aliasStringsBlacklist;
        compilerOptions44.inlineGetters = false;
        boolean boolean54 = compilerOptions44.exportTestFunctions;
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions55.setRewriteNewDateGoogNow(true);
        boolean boolean58 = compilerOptions55.extractPrototypeMemberDeclarations;
        compilerOptions55.setCollapseProperties(false);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy61 = compilerOptions55.variableRenaming;
        com.google.javascript.jscomp.CompilerOptions compilerOptions62 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet63 = compilerOptions62.stripNamePrefixes;
        byte[] byteArray64 = compilerOptions62.inputVariableMapSerialized;
        compilerOptions62.checkSymbols = false;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler67 = compilerOptions62.getAliasTransformationHandler();
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy68 = compilerOptions62.propertyRenaming;
        compilerOptions44.setRenamingPolicy(variableRenamingPolicy61, propertyRenamingPolicy68);
        compilerOptions0.setRenamingPolicy(variableRenamingPolicy41, propertyRenamingPolicy68);
        compilerOptions0.setOptimizeCalls(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions73 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions73.setRewriteNewDateGoogNow(true);
        boolean boolean76 = compilerOptions73.extractPrototypeMemberDeclarations;
        compilerOptions73.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel79 = compilerOptions73.checkGlobalThisLevel;
        compilerOptions73.setDevirtualizePrototypeMethods(true);
        com.google.javascript.jscomp.CheckLevel checkLevel82 = compilerOptions73.checkMissingGetCssNameLevel;
        com.google.javascript.jscomp.CompilerOptions compilerOptions83 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet84 = compilerOptions83.stripNamePrefixes;
        byte[] byteArray85 = compilerOptions83.inputVariableMapSerialized;
        boolean boolean86 = compilerOptions83.exportTestFunctions;
        com.google.javascript.jscomp.CompilerOptions compilerOptions87 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions87.setLabelRenaming(true);
        compilerOptions87.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CheckLevel checkLevel92 = compilerOptions87.checkGlobalThisLevel;
        compilerOptions83.setCheckGlobalNamesLevel(checkLevel92);
        compilerOptions73.setCheckMissingGetCssNameLevel(checkLevel92);
        compilerOptions0.checkProvides = checkLevel92;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + checkLevel23 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel23.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + tracerMode29 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode29.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy41 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.OFF + "'", variableRenamingPolicy41.equals(com.google.javascript.jscomp.VariableRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy61 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.OFF + "'", variableRenamingPolicy61.equals(com.google.javascript.jscomp.VariableRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNull(byteArray64);
        org.junit.Assert.assertNotNull(aliasTransformationHandler67);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy68 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy68.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + checkLevel79 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel79.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel82 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel82.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet84);
        org.junit.Assert.assertNull(byteArray85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + checkLevel92 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel92.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.exportTestFunctions;
        compilerOptions0.lineBreak = false;
        compilerOptions0.setCrossModuleMethodMotion(true);
        compilerOptions0.setDefineToNumberLiteral("", (int) (short) 1);
        compilerOptions0.setMoveFunctionDeclarations(false);
        boolean boolean13 = compilerOptions0.disambiguateProperties;
        compilerOptions0.setLineLengthThreshold((int) (byte) 100);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }
}
