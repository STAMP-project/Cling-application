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
        com.google.javascript.jscomp.CheckLevel checkLevel1 = compilerOptions0.checkRequires;
        compilerOptions0.setLooseTypes(false);
        boolean boolean4 = compilerOptions0.optimizeReturns;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions5.setReplaceStringsPlaceholderToken("hi!");
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel8 = com.google.javascript.jscomp.SourceMap.DetailLevel.SYMBOLS;
        compilerOptions5.setSourceMapDetailLevel(detailLevel8);
        compilerOptions5.inlineFunctions = true;
        compilerOptions5.setCommonJSModulePathPrefix(":");
        compilerOptions5.setCrossModuleCodeMotion(true);
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode16 = compilerOptions5.getLanguageIn();
        compilerOptions5.setExtractPrototypeMemberDeclarations(true);
        boolean boolean19 = compilerOptions5.aliasAllStrings;
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setInlineLocalFunctions(false);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy23 = null;
        compilerOptions20.variableRenaming = variableRenamingPolicy23;
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing25 = compilerOptions20.getTweakProcessing();
        compilerOptions20.syntheticBlockStartMarker = "DiagnosticGroup<checkProvides>";
        boolean boolean28 = compilerOptions20.closurePass;
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions29.crossModuleMethodMotion = true;
        compilerOptions29.setProtectHiddenSideEffects(true);
        compilerOptions29.moveFunctionDeclarations = true;
        boolean boolean36 = compilerOptions29.inlineConstantVars;
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions37.setReplaceStringsPlaceholderToken("hi!");
        compilerOptions37.setTweakToDoubleLiteral("", (double) (short) 1);
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode43 = null;
        compilerOptions37.setLanguageOut(languageMode43);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy45 = null;
        compilerOptions37.variableRenaming = variableRenamingPolicy45;
        com.google.javascript.jscomp.CheckLevel checkLevel47 = compilerOptions37.checkUnreachableCode;
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions48.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy51 = compilerOptions48.propertyRenaming;
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap52 = compilerOptions48.getTweakReplacements();
        boolean boolean53 = strMap52.isEmpty();
        java.lang.Object obj54 = null;
        com.google.javascript.rhino.Node node55 = strMap52.get(obj54);
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions56.setReplaceStringsPlaceholderToken("hi!");
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel59 = com.google.javascript.jscomp.SourceMap.DetailLevel.SYMBOLS;
        compilerOptions56.setSourceMapDetailLevel(detailLevel59);
        boolean boolean61 = compilerOptions56.ideMode;
        compilerOptions56.setUnaliasableGlobals("");
        com.google.javascript.jscomp.CheckLevel checkLevel64 = compilerOptions56.checkUnreachableCode;
        com.google.javascript.rhino.Node node65 = strMap52.remove((java.lang.Object) checkLevel64);
        compilerOptions37.checkMissingGetCssNameLevel = checkLevel64;
        compilerOptions29.setCheckUnreachableCode(checkLevel64);
        compilerOptions20.checkUnreachableCode = checkLevel64;
        compilerOptions5.checkGlobalNamesLevel = checkLevel64;
        compilerOptions0.checkMissingReturn = checkLevel64;
        compilerOptions0.setSummaryDetailLevel(11);
        com.google.javascript.jscomp.WarningsGuard[] warningsGuardArray73 = new com.google.javascript.jscomp.WarningsGuard[] {};
        com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard74 = new com.google.javascript.jscomp.ComposeWarningsGuard(warningsGuardArray73);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup75 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        boolean boolean76 = composeWarningsGuard74.enables(diagnosticGroup75);
        compilerOptions0.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard) composeWarningsGuard74);
        boolean boolean78 = compilerOptions0.inlineConstantVars;
        org.junit.Assert.assertTrue("'" + checkLevel1 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel1.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(detailLevel8);
        org.junit.Assert.assertTrue("'" + languageMode16 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode16.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + tweakProcessing25 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing25.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + checkLevel47 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel47.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy51 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy51.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(detailLevel59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + checkLevel64 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel64.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNotNull(warningsGuardArray73);
// flaky:         org.junit.Assert.assertNull(diagnosticGroup75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        java.io.File file3 = new java.io.File(":");
        java.io.File file5 = new java.io.File(file3, "FINEST");
        java.io.File file6 = null; // flaky: java.io.File.createTempFile("OFF", "", file3);
        java.io.File file7 = null; // flaky: file6.getAbsoluteFile();
        java.io.File file8 = null; // flaky: file6.getAbsoluteFile();
        java.net.URL uRL9 = null; // flaky: file8.toURL();
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), ":");
        org.junit.Assert.assertEquals(file5.getParent(), ":");
        org.junit.Assert.assertEquals(file5.toString(), ":/FINEST");
// flaky:         org.junit.Assert.assertNotNull(file6);
// flaky:         org.junit.Assert.assertEquals(file6.getParent(), ":");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), ":/OFF6973813409557844864");
// flaky:         org.junit.Assert.assertNotNull(file7);
// flaky:         org.junit.Assert.assertEquals(file7.getParent(), "/experiment/:");
// flaky:         org.junit.Assert.assertEquals(file7.toString(), "/experiment/:/OFF6973813409557844864");
// flaky:         org.junit.Assert.assertNotNull(file8);
// flaky:         org.junit.Assert.assertEquals(file8.getParent(), "/experiment/:");
// flaky:         org.junit.Assert.assertEquals(file8.toString(), "/experiment/:/OFF6973813409557844864");
// flaky:         org.junit.Assert.assertNotNull(uRL9);
// flaky:         org.junit.Assert.assertEquals(uRL9.toString(), "file:/experiment/:/OFF6973813409557844864");
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setInlineLocalFunctions(false);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy3 = null;
        compilerOptions0.variableRenaming = variableRenamingPolicy3;
        compilerOptions0.setProtectHiddenSideEffects(false);
        compilerOptions0.syntheticBlockEndMarker = "OFF";
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CheckLevel checkLevel10 = compilerOptions9.checkRequires;
        compilerOptions0.setCheckUnreachableCode(checkLevel10);
        boolean boolean12 = compilerOptions0.checkControlStructures;
        compilerOptions0.setRemoveUnusedVars(false);
        java.util.Set<java.lang.String> strSet15 = compilerOptions0.stripNameSuffixes;
        org.junit.Assert.assertTrue("'" + checkLevel10 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel10.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.optimizeParameters = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions5.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy8 = compilerOptions5.propertyRenaming;
        java.lang.String[] strArray11 = new java.lang.String[] { "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        compilerOptions5.setStripTypes((java.util.Set<java.lang.String>) strSet12);
        compilerOptions0.stripNamePrefixes = strSet12;
        compilerOptions0.checkTypes = false;
        compilerOptions0.flowSensitiveInlineVariables = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.crossModuleMethodMotion = true;
        compilerOptions20.skipAllCompilerPasses();
        compilerOptions20.resetWarningsGuard();
        compilerOptions20.setInlineLocalVariables(false);
        compilerOptions20.coalesceVariableNames = true;
        com.google.javascript.jscomp.CheckLevel checkLevel29 = compilerOptions20.aggressiveVarCheck;
        compilerOptions0.checkMissingReturn = checkLevel29;
        com.google.javascript.jscomp.CheckLevel checkLevel31 = compilerOptions0.checkMissingReturn;
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy8 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy8.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + checkLevel29 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel29.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel31 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel31.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        boolean boolean3 = compilerOptions0.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel4 = compilerOptions0.sourceMapDetailLevel;
        compilerOptions0.setColorizeErrorOutput(true);
        compilerOptions0.collapseProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy12 = compilerOptions9.propertyRenaming;
        compilerOptions0.propertyRenaming = propertyRenamingPolicy12;
        com.google.javascript.jscomp.CheckLevel checkLevel14 = compilerOptions0.brokenClosureRequiresLevel;
        com.google.javascript.jscomp.CheckLevel checkLevel15 = compilerOptions0.brokenClosureRequiresLevel;
        boolean boolean16 = compilerOptions0.removeUnusedPrototypePropertiesInExterns;
        boolean boolean17 = compilerOptions0.checkControlStructures;
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing18 = compilerOptions0.getTweakProcessing();
        compilerOptions0.aliasExternals = true;
        boolean boolean21 = compilerOptions0.checkControlStructures;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(detailLevel4);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy12 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy12.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel14 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel14.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertTrue("'" + checkLevel15 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel15.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tweakProcessing18 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing18.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("PARAM_LIST", 49, 0);
        boolean boolean6 = node4.getBooleanProp((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) -1, node4, (int) '/', 4095);
        boolean boolean10 = node9.isAnd();
        node9.putIntProp(15, 2147483647);
        boolean boolean14 = node9.isQuotedString();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setReplaceStringsPlaceholderToken("hi!");
        compilerOptions0.setTweakToDoubleLiteral("", (double) (short) 1);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode6 = com.google.javascript.jscomp.CompilerOptions.TracerMode.RAW_SIZE;
        compilerOptions0.setTracer(tracerMode6);
        compilerOptions0.setGeneratePseudoNames(true);
        boolean boolean10 = compilerOptions0.inlineVariables;
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList15 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList15, jSTypeArray14);
        com.google.javascript.rhino.Node node17 = jSTypeRegistry13.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList15);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList21 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList21, jSTypeArray20);
        com.google.javascript.rhino.Node node23 = jSTypeRegistry19.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList21);
        node17.addChildrenToBack(node23);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList28 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList28, jSTypeArray27);
        com.google.javascript.rhino.Node node30 = jSTypeRegistry26.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList28);
        boolean boolean31 = node30.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList35 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList35, jSTypeArray34);
        com.google.javascript.rhino.Node node37 = jSTypeRegistry33.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList35);
        boolean boolean38 = node37.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList42 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList42, jSTypeArray41);
        com.google.javascript.rhino.Node node44 = jSTypeRegistry40.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList42);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (short) 0, node17, node30, node37, node44, 0, 49);
        com.google.javascript.rhino.Node node48 = node17.removeFirstChild();
        int int50 = node17.getIntProp(1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions52.setReplaceStringsPlaceholderToken("hi!");
        compilerOptions52.setTweakToDoubleLiteral("", (double) (short) 1);
        compilerOptions52.setCrossModuleCodeMotion(false);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode60 = com.google.javascript.jscomp.CompilerOptions.TracerMode.ALL;
        compilerOptions52.setTracer(tracerMode60);
        compilerOptions52.resetWarningsGuard();
        java.util.Set<java.lang.String> strSet63 = compilerOptions52.stripNamePrefixes;
        node17.putProp(0, (java.lang.Object) strSet63);
        compilerOptions0.stripTypes = strSet63;
        boolean boolean66 = strSet63.isEmpty();
        com.google.javascript.jscomp.CompilerOptions compilerOptions67 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions67.setInlineLocalFunctions(false);
        java.util.Set<java.lang.String> strSet70 = compilerOptions67.stripNameSuffixes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions71 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions71.crossModuleMethodMotion = true;
        compilerOptions71.optimizeParameters = true;
        compilerOptions71.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel79 = compilerOptions71.checkGlobalNamesLevel;
        compilerOptions67.checkRequires = checkLevel79;
        compilerOptions67.prettyPrint = false;
        boolean boolean83 = compilerOptions67.shouldColorizeErrorOutput();
        com.google.javascript.jscomp.CheckLevel checkLevel84 = compilerOptions67.aggressiveVarCheck;
        boolean boolean85 = strSet63.contains((java.lang.Object) compilerOptions67);
        org.junit.Assert.assertTrue("'" + tracerMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.RAW_SIZE + "'", tracerMode6.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.RAW_SIZE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + tracerMode60 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.ALL + "'", tracerMode60.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.ALL));
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strSet70);
        org.junit.Assert.assertTrue("'" + checkLevel79 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel79.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + checkLevel84 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel84.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CheckLevel checkLevel1 = compilerOptions0.checkRequires;
        compilerOptions0.setRewriteNewDateGoogNow(true);
        compilerOptions0.setSyntheticBlockStartMarker("OFF");
        compilerOptions0.setChainCalls(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.crossModuleMethodMotion = true;
        compilerOptions8.setProtectHiddenSideEffects(true);
        compilerOptions8.setInputDelimiter("PARAM_LIST\n");
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap15 = null;
        compilerOptions8.cssRenamingMap = cssRenamingMap15;
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode18 = null;
        compilerOptions17.setTracerMode(tracerMode18);
        boolean boolean20 = compilerOptions17.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel21 = compilerOptions17.sourceMapDetailLevel;
        compilerOptions17.setColorizeErrorOutput(true);
        java.util.Set<java.lang.String> strSet24 = compilerOptions17.stripNameSuffixes;
        strSet24.clear();
        com.google.javascript.jscomp.SourceFile sourceFile28 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int30 = sourceFile28.getLineOfOffset((int) (short) 1);
        java.lang.String str31 = sourceFile28.getName();
        java.lang.String str32 = sourceFile28.getName();
        java.lang.String str33 = sourceFile28.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput35 = new com.google.javascript.jscomp.CompilerInput(sourceFile28, true);
        com.google.javascript.jscomp.SourceAst sourceAst36 = compilerInput35.getAst();
        boolean boolean37 = strSet24.remove((java.lang.Object) sourceAst36);
        compilerOptions8.setExtraAnnotationNames(strSet24);
        compilerOptions0.setReplaceStringsReservedStrings(strSet24);
        compilerOptions0.setFoldConstants(true);
        compilerOptions0.markNoSideEffectCalls = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions44.crossModuleMethodMotion = true;
        compilerOptions44.syntheticBlockEndMarker = "hi!";
        compilerOptions44.removeUnusedClassProperties = false;
        compilerOptions44.setLineLengthThreshold(4095);
        com.google.javascript.jscomp.ErrorFormat errorFormat53 = compilerOptions44.errorFormat;
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler();
        compiler54.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap56 = compiler54.getSourceMap();
        compiler54.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap58 = compiler54.getSourceMap();
        com.google.javascript.jscomp.MessageFormatter messageFormatter60 = errorFormat53.toFormatter((com.google.javascript.jscomp.SourceExcerptProvider) compiler54, true);
        compilerOptions0.setErrorFormat(errorFormat53);
        org.junit.Assert.assertTrue("'" + checkLevel1 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel1.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(detailLevel21);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(sourceFile28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(sourceAst36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(errorFormat53);
        org.junit.Assert.assertNull(sourceMap56);
        org.junit.Assert.assertNull(sourceMap58);
        org.junit.Assert.assertNotNull(messageFormatter60);
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str3 = charset2.name();
        java.util.Locale locale4 = null;
        java.lang.String str5 = charset2.displayName(locale4);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = com.google.javascript.jscomp.JSSourceFile.fromFile("Node tree inequality:\nTree1:\nPARAM_LIST\n    NAME \n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: PARAM_LIST\n    NAME \n\n\nSubtree2: NUMBER -1.0\n", charset2);
        java.nio.charset.CharsetEncoder charsetEncoder7 = charset2.newEncoder();
        boolean boolean8 = charset2.canEncode();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromFile("InputId: *global*", charset2);
        java.nio.charset.Charset charset11 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str12 = charset11.name();
        java.lang.String str13 = charset11.name();
        java.nio.charset.CharsetEncoder charsetEncoder14 = charset11.newEncoder();
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromFile("TYPEOF : 44\n", charset11);
        java.util.Set<java.lang.String> strSet16 = charset11.aliases();
        java.util.Set<java.lang.String> strSet17 = charset11.aliases();
        java.nio.charset.Charset charset18 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str19 = charset18.name();
        java.util.Locale locale20 = null;
        java.lang.String str21 = charset18.displayName(locale20);
        java.nio.ByteBuffer byteBuffer23 = charset18.encode("/experiment/:/hi!");
        java.nio.charset.Charset charset24 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str25 = charset24.name();
        java.util.Set<java.lang.String> strSet26 = charset24.aliases();
        java.util.Set<java.lang.String> strSet27 = charset24.aliases();
        int int28 = charset18.compareTo(charset24);
        java.nio.ByteBuffer byteBuffer30 = charset18.encode("PARAM_LIST\n    PARAM_LIST\n");
        java.nio.CharBuffer charBuffer31 = charset11.decode(byteBuffer30);
        java.nio.ByteBuffer byteBuffer32 = charset2.encode(charBuffer31);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "US-ASCII" + "'", str3, "US-ASCII");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "US-ASCII" + "'", str5, "US-ASCII");
        org.junit.Assert.assertNotNull(jSSourceFile6);
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "US-ASCII" + "'", str12, "US-ASCII");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "US-ASCII" + "'", str13, "US-ASCII");
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertNotNull(sourceFile15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "US-ASCII" + "'", str19, "US-ASCII");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "US-ASCII" + "'", str21, "US-ASCII");
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "US-ASCII" + "'", str25, "US-ASCII");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(charBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer32);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        boolean boolean3 = compilerOptions0.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel4 = compilerOptions0.sourceMapDetailLevel;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions5.setInlineLocalFunctions(false);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy8 = null;
        compilerOptions5.variableRenaming = variableRenamingPolicy8;
        compilerOptions5.setProtectHiddenSideEffects(false);
        compilerOptions5.syntheticBlockEndMarker = "OFF";
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CheckLevel checkLevel15 = compilerOptions14.checkRequires;
        compilerOptions5.setCheckUnreachableCode(checkLevel15);
        compilerOptions0.setCheckRequires(checkLevel15);
        compilerOptions0.setRemoveClosureAsserts(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setReplaceStringsPlaceholderToken("hi!");
        compilerOptions20.setTweakToDoubleLiteral("", (double) (short) 1);
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode26 = null;
        compilerOptions20.setLanguageOut(languageMode26);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy28 = null;
        compilerOptions20.variableRenaming = variableRenamingPolicy28;
        com.google.javascript.jscomp.CheckLevel checkLevel30 = compilerOptions20.checkUnreachableCode;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode31 = compilerOptions20.getLanguageOut();
        boolean boolean32 = compilerOptions20.moveFunctionDeclarations;
        byte[] byteArray33 = null;
        compilerOptions20.inputPropertyMapSerialized = byteArray33;
        compilerOptions20.locale = ":/hi!";
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList42 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList42, jSTypeArray41);
        com.google.javascript.rhino.Node node44 = jSTypeRegistry40.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList42);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList48 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList48, jSTypeArray47);
        com.google.javascript.rhino.Node node50 = jSTypeRegistry46.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList48);
        com.google.javascript.rhino.jstype.JSType jSType55 = jSTypeRegistry46.createNamedType(":", "", (int) (byte) 1, 48);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList59 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList59, jSTypeArray58);
        com.google.javascript.rhino.Node node61 = jSTypeRegistry57.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList59);
        com.google.javascript.rhino.jstype.JSType jSType66 = jSTypeRegistry57.createNamedType(":", "", (int) (byte) 1, 48);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] { jSType66 };
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry40.createConstructorTypeWithVarArgs(jSType55, jSTypeArray67);
        boolean boolean70 = jSTypeRegistry38.canPropertyBeDefined(jSType55, "");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable72 = jSTypeRegistry38.getEachReferenceTypeWithProperty("/");
        java.lang.String[] strArray77 = new java.lang.String[] { "Unversioned directory", "/experiment/:/hi!", ":", "OFF" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        jSTypeRegistry38.setTemplateTypeNames((java.util.List<java.lang.String>) strList78);
        compilerOptions20.setManageClosureDependencies((java.util.List<java.lang.String>) strList78);
        compilerOptions20.setCheckTypes(false);
        java.util.Set<java.lang.String> strSet84 = compilerOptions20.stripTypePrefixes;
        java.util.Set<java.lang.String> strSet85 = compilerOptions20.stripTypePrefixes;
        compilerOptions0.stripNameSuffixes = strSet85;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative88 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec89 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("PARAM_LIST5278126033942481271Unversioned directory", jSTypeNative88);
        boolean boolean90 = strSet85.equals((java.lang.Object) "PARAM_LIST5278126033942481271Unversioned directory");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(detailLevel4);
        org.junit.Assert.assertTrue("'" + checkLevel15 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel15.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel30 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel30.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(languageMode31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable72);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(strSet84);
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setReplaceStringsPlaceholderToken("hi!");
        compilerOptions0.setRuntimeTypeCheckLogFunction("FINEST");
        compilerOptions0.renamePrefixNamespace = ":/hi!";
        compilerOptions0.setMarkAsCompiled(true);
        compilerOptions0.recordFunctionInformation = false;
        boolean boolean11 = compilerOptions0.checkControlStructures;
        compilerOptions0.setAliasStringsBlacklist("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ");
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.crossModuleMethodMotion = true;
        compilerOptions14.skipAllCompilerPasses();
        compilerOptions14.resetWarningsGuard();
        compilerOptions14.setInlineLocalVariables(false);
        compilerOptions14.setIdeMode(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.crossModuleMethodMotion = true;
        compilerOptions23.optimizeParameters = true;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy28 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions29.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy32 = compilerOptions29.propertyRenaming;
        compilerOptions23.setRenamingPolicy(variableRenamingPolicy28, propertyRenamingPolicy32);
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions34.crossModuleMethodMotion = true;
        compilerOptions34.skipAllCompilerPasses();
        boolean boolean38 = compilerOptions34.flowSensitiveInlineVariables;
        java.lang.String[] strArray48 = new java.lang.String[] { "*global*", "", "FINEST", "FINEST", "STRING PARAM_LIST 49", "STRING PARAM_LIST 49", "hi!", ":", "FINEST" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        compilerOptions34.stripTypes = strSet49;
        compilerOptions23.setStripNamePrefixes((java.util.Set<java.lang.String>) strSet49);
        compilerOptions14.setReplaceStringsReservedStrings((java.util.Set<java.lang.String>) strSet49);
        compilerOptions14.setOutputCharset("/");
        compilerOptions14.collapseAnonymousFunctions = false;
        compilerOptions14.setSyntheticBlockStartMarker(":/hi!");
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap60 = null;
        compilerOptions14.setCssRenamingMap(cssRenamingMap60);
        compilerOptions14.setRenamePrefix("hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions64 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode65 = null;
        compilerOptions64.setTracerMode(tracerMode65);
        boolean boolean67 = compilerOptions64.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel68 = compilerOptions64.sourceMapDetailLevel;
        compilerOptions64.setColorizeErrorOutput(true);
        java.util.Set<java.lang.String> strSet71 = compilerOptions64.stripNameSuffixes;
        strSet71.clear();
        com.google.javascript.jscomp.SourceFile sourceFile75 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int77 = sourceFile75.getLineOfOffset((int) (short) 1);
        java.lang.String str78 = sourceFile75.getName();
        java.lang.String str79 = sourceFile75.getName();
        java.lang.String str80 = sourceFile75.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput82 = new com.google.javascript.jscomp.CompilerInput(sourceFile75, true);
        com.google.javascript.jscomp.SourceAst sourceAst83 = compilerInput82.getAst();
        boolean boolean84 = strSet71.remove((java.lang.Object) sourceAst83);
        compilerOptions14.stripNameSuffixes = strSet71;
        compilerOptions14.setOptimizeArgumentsArray(false);
        com.google.javascript.jscomp.CheckLevel checkLevel88 = compilerOptions14.aggressiveVarCheck;
        compilerOptions0.setAggressiveVarCheck(checkLevel88);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy32 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy32.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(detailLevel68);
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertNotNull(sourceFile75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(sourceAst83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + checkLevel88 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel88.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        boolean boolean3 = compilerOptions0.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel4 = compilerOptions0.sourceMapDetailLevel;
        compilerOptions0.setColorizeErrorOutput(true);
        compilerOptions0.generatePseudoNames = true;
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compilerOptions0.getCodingConvention();
        boolean boolean10 = compilerOptions0.generateExports;
        compilerOptions0.setTweakToNumberLiteral("PARAM_LIST\n", 48);
        compilerOptions0.checkSymbols = true;
        compilerOptions0.syntheticBlockEndMarker = "Node tree inequality:\nTree1:\nPARAM_LIST\n    NAME \n\n\nTree2:\nBITXOR  43 [opt_arg: 1]\n\n\nSubtree1: PARAM_LIST\n    NAME \n\n\nSubtree2: BITXOR  43 [opt_arg: 1]\n";
        compilerOptions0.removeUnusedPrototypePropertiesInExterns = true;
        com.google.javascript.jscomp.SourceMap.Format format20 = compilerOptions0.sourceMapFormat;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(detailLevel4);
        org.junit.Assert.assertNull(codingConvention9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(format20);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        jSModule1.sortInputsByDeps(compiler2);
        com.google.javascript.jscomp.SourceFile.Builder builder4 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int10 = sourceFile8.getLineOfOffset((int) (short) 1);
        java.io.Reader reader11 = sourceFile8.getCodeReader();
        int int12 = reader11.read();
        com.google.javascript.jscomp.SourceFile sourceFile13 = builder4.buildFromReader("*global*", reader11);
        jSModule1.add(sourceFile13);
        com.google.javascript.jscomp.JSModule jSModule16 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        jSModule16.sortInputsByDeps(compiler17);
        com.google.javascript.jscomp.SourceFile.Builder builder19 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile sourceFile23 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int25 = sourceFile23.getLineOfOffset((int) (short) 1);
        java.io.Reader reader26 = sourceFile23.getCodeReader();
        int int27 = reader26.read();
        com.google.javascript.jscomp.SourceFile sourceFile28 = builder19.buildFromReader("*global*", reader26);
        jSModule16.add(sourceFile28);
        boolean boolean31 = jSModule16.removeByName("PARAM_LIST");
        jSModule1.addDependency(jSModule16);
        com.google.javascript.jscomp.SourceFile sourceFile34 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput36 = new com.google.javascript.jscomp.CompilerInput(sourceFile34, true);
        com.google.javascript.rhino.InputId inputId38 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput40 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput36, inputId38, true);
        com.google.javascript.jscomp.CompilerInput compilerInput42 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput40, false);
        jSModule1.addFirst(compilerInput40);
        com.google.javascript.jscomp.CompilerInput compilerInput45 = jSModule1.getByName("");
        com.google.javascript.jscomp.SourceFile sourceFile47 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput49 = new com.google.javascript.jscomp.CompilerInput(sourceFile47, true);
        com.google.javascript.rhino.InputId inputId51 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput53 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput49, inputId51, true);
        com.google.javascript.jscomp.CompilerInput compilerInput55 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput53, false);
        com.google.javascript.jscomp.JSModule jSModule57 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler();
        jSModule57.sortInputsByDeps(compiler58);
        java.lang.String str60 = jSModule57.getName();
        compilerInput53.setModule(jSModule57);
        jSModule57.setDepth((int) (byte) 0);
        jSModule1.addDependency(jSModule57);
        java.util.Set<com.google.javascript.jscomp.JSModule> jSModuleSet65 = jSModule1.getThisAndAllDependencies();
        com.google.javascript.jscomp.CompilerInput compilerInput67 = jSModule1.getByName("WARNING: hi!");
        com.google.javascript.jscomp.SourceFile.Builder builder68 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile sourceFile72 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int74 = sourceFile72.getLineOfOffset((int) (short) 1);
        java.io.Reader reader75 = sourceFile72.getCodeReader();
        int int76 = reader75.read();
        com.google.javascript.jscomp.SourceFile sourceFile77 = builder68.buildFromReader("*global*", reader75);
        java.nio.charset.Charset charset78 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder79 = builder68.withCharset(charset78);
        java.io.File file82 = new java.io.File(":", "hi!");
        boolean boolean85 = file82.setExecutable(true, false);
        long long86 = file82.lastModified();
        boolean boolean87 = file82.mkdir();
        com.google.javascript.jscomp.SourceFile sourceFile88 = builder68.buildFromFile(file82);
        com.google.javascript.jscomp.SourceFile sourceFile90 = builder68.buildFromFile("/experiment/:/hi!");
        com.google.javascript.jscomp.SourceFile sourceFile92 = builder68.buildFromFile(":/hi!");
        com.google.javascript.jscomp.CompilerInput compilerInput94 = new com.google.javascript.jscomp.CompilerInput(sourceFile92, true);
        jSModule1.add(sourceFile92);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertNotNull(sourceFile23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(reader26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(sourceFile28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(compilerInput45);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "STRING PARAM_LIST 49" + "'", str60, "STRING PARAM_LIST 49");
        org.junit.Assert.assertNotNull(jSModuleSet65);
        org.junit.Assert.assertNull(compilerInput67);
        org.junit.Assert.assertNotNull(sourceFile72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(reader75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(sourceFile77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertEquals(file82.getParent(), ":");
        org.junit.Assert.assertEquals(file82.toString(), ":/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long86 + "' != '" + 280489385000L + "'", long86 == 280489385000L);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(sourceFile88);
        org.junit.Assert.assertNotNull(sourceFile90);
        org.junit.Assert.assertNotNull(sourceFile92);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        boolean boolean6 = node5.isIn();
        boolean boolean7 = node5.isGetElem();
        boolean boolean8 = node5.isIn();
        com.google.javascript.rhino.Node node9 = node5.getLastSibling();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("PARAM_LIST", 49, 0);
        boolean boolean15 = node14.isTry();
        java.lang.String str16 = node14.toString();
        boolean boolean17 = node14.isIn();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1L), 16, (int) (byte) -1);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship22 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType10, node14, node21);
        node14.setSourceEncodedPositionForTree((int) 'a');
        boolean boolean25 = node9.hasChild(node14);
        node9.setLineno((-33));
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + subclassType10 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType10.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "STRING PARAM_LIST 49" + "'", str16, "STRING PARAM_LIST 49");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 280492408832L);
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.optimizeParameters = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions5.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy8 = compilerOptions5.propertyRenaming;
        java.lang.String[] strArray11 = new java.lang.String[] { "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        compilerOptions5.setStripTypes((java.util.Set<java.lang.String>) strSet12);
        compilerOptions0.stripNamePrefixes = strSet12;
        compilerOptions0.checkTypes = false;
        compilerOptions0.setManageClosureDependencies(true);
        compilerOptions0.syntheticBlockEndMarker = "*global*.  at *global* line (unknown line) : (unknown column)";
        com.google.javascript.jscomp.CodingConvention codingConvention22 = compilerOptions0.getCodingConvention();
        compilerOptions0.setExtractPrototypeMemberDeclarations(true);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy8 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy8.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(codingConvention22);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList4 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList4, jSTypeArray3);
        com.google.javascript.rhino.Node node6 = jSTypeRegistry2.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList4);
        boolean boolean7 = node6.isIn();
        boolean boolean8 = node6.isVoid();
        node6.setOptionalArg(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode12 = null;
        compilerOptions11.setTracerMode(tracerMode12);
        boolean boolean14 = compilerOptions11.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel15 = compilerOptions11.sourceMapDetailLevel;
        compilerOptions11.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions18.crossModuleMethodMotion = true;
        compilerOptions18.optimizeParameters = true;
        compilerOptions18.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel26 = compilerOptions18.checkGlobalNamesLevel;
        compilerOptions11.setReportMissingOverride(checkLevel26);
        com.google.javascript.jscomp.DiagnosticType diagnosticType28 = com.google.javascript.jscomp.Compiler.MOTION_ITERATIONS_ERROR;
        java.lang.String[] strArray29 = null;
        com.google.javascript.jscomp.JSError jSError30 = com.google.javascript.jscomp.JSError.make("", node6, checkLevel26, diagnosticType28, strArray29);
        java.lang.String str31 = jSError30.description;
        com.google.javascript.jscomp.CheckLevel checkLevel32 = jSError30.getDefaultLevel();
        int int33 = jSError30.getNodeSourceOffset();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(detailLevel15);
        org.junit.Assert.assertTrue("'" + checkLevel26 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel26.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(diagnosticType28);
        org.junit.Assert.assertNotNull(jSError30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Exceeded max number of code motion iterations: {0}" + "'", str31, "Exceeded max number of code motion iterations: {0}");
        org.junit.Assert.assertTrue("'" + checkLevel32 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel32.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        boolean boolean3 = compilerOptions0.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel4 = compilerOptions0.sourceMapDetailLevel;
        compilerOptions0.setColorizeErrorOutput(true);
        compilerOptions0.gatherCssNames = true;
        boolean boolean9 = compilerOptions0.removeUnusedPrototypePropertiesInExterns;
        java.util.Set<java.lang.String> strSet10 = compilerOptions0.aliasableStrings;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode12 = null;
        compilerOptions11.setTracerMode(tracerMode12);
        boolean boolean14 = compilerOptions11.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel15 = compilerOptions11.sourceMapDetailLevel;
        compilerOptions11.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions18.crossModuleMethodMotion = true;
        compilerOptions18.optimizeParameters = true;
        compilerOptions18.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel26 = compilerOptions18.checkGlobalNamesLevel;
        compilerOptions11.setReportMissingOverride(checkLevel26);
        java.util.Set<java.lang.String> strSet28 = compilerOptions11.stripTypes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode30 = null;
        compilerOptions29.setTracerMode(tracerMode30);
        boolean boolean32 = compilerOptions29.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel33 = compilerOptions29.sourceMapDetailLevel;
        compilerOptions29.setColorizeErrorOutput(true);
        java.util.Set<java.lang.String> strSet36 = compilerOptions29.stripNameSuffixes;
        com.google.javascript.jscomp.SourceFile sourceFile38 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput40 = new com.google.javascript.jscomp.CompilerInput(sourceFile38, true);
        com.google.javascript.rhino.InputId inputId42 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput44 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput40, inputId42, true);
        java.lang.String str45 = compilerInput44.toString();
        boolean boolean46 = strSet36.contains((java.lang.Object) compilerInput44);
        compilerOptions11.stripTypes = strSet36;
        boolean boolean48 = strSet36.isEmpty();
        compilerOptions0.stripNamePrefixes = strSet36;
        compilerOptions0.foldConstants = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(detailLevel4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(detailLevel15);
        org.junit.Assert.assertTrue("'" + checkLevel26 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel26.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(detailLevel33);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "*global*" + "'", str45, "*global*");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy3 = compilerOptions0.propertyRenaming;
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap4 = compilerOptions0.getTweakReplacements();
        boolean boolean5 = strMap4.isEmpty();
        java.lang.Object obj6 = null;
        com.google.javascript.rhino.Node node7 = strMap4.get(obj6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "2019/07/12 07:12", 0, 2);
        com.google.javascript.rhino.Node node14 = strMap4.put("// Input %num%", node13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions15.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode18 = com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF;
        compilerOptions15.setTracer(tracerMode18);
        compilerOptions15.setFoldConstants(true);
        compilerOptions15.flowSensitiveInlineVariables = true;
        compilerOptions15.setTweakToStringLiteral("InputId: *global*", "hi!");
        compilerOptions15.collapseAnonymousFunctions = false;
        compilerOptions15.setOutputCharset("");
        java.util.Set<java.lang.String> strSet31 = compilerOptions15.stripTypes;
        boolean boolean32 = compilerOptions15.ambiguateProperties;
        boolean boolean33 = strMap4.equals((java.lang.Object) boolean32);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags35 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (byte) 100);
        sideEffectFlags35.clearSideEffectFlags();
        sideEffectFlags35.setAllFlags();
        sideEffectFlags35.setThrows();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions39.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy42 = compilerOptions39.propertyRenaming;
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap43 = compilerOptions39.getTweakReplacements();
        boolean boolean44 = strMap43.isEmpty();
        java.util.Set<java.util.Map.Entry<java.lang.String, com.google.javascript.rhino.Node>> strEntrySet45 = strMap43.entrySet();
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing46 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP;
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions47.setInlineLocalFunctions(false);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy50 = null;
        compilerOptions47.variableRenaming = variableRenamingPolicy50;
        compilerOptions47.setProtectHiddenSideEffects(false);
        boolean boolean54 = strMap43.remove((java.lang.Object) tweakProcessing46, (java.lang.Object) false);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec56 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("*global*");
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString((int) ' ', "OFF");
        com.google.javascript.rhino.Node node60 = assertionFunctionSpec56.getAssertedParam(node59);
        boolean boolean61 = node60.isOr();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString(46, "", 2, 51);
        com.google.javascript.rhino.Node node67 = strMap43.getOrDefault((java.lang.Object) node60, node66);
        com.google.javascript.rhino.Node node68 = strMap4.getOrDefault((java.lang.Object) sideEffectFlags35, node60);
        java.util.Set<java.util.Map.Entry<java.lang.String, com.google.javascript.rhino.Node>> strEntrySet69 = strMap4.entrySet();
        java.io.File file72 = new java.io.File(":", "hi!");
        boolean boolean75 = file72.setExecutable(true, false);
        long long76 = file72.lastModified();
        boolean boolean77 = file72.mkdir();
        java.io.File file78 = file72.getParentFile();
        java.nio.charset.Charset charset79 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str80 = charset79.name();
        java.util.Set<java.lang.String> strSet81 = charset79.aliases();
        java.util.Set<java.lang.String> strSet82 = charset79.aliases();
        com.google.javascript.jscomp.SourceFile sourceFile83 = com.google.javascript.jscomp.SourceFile.fromFile(file72, charset79);
        java.nio.charset.Charset charset84 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str85 = charset84.name();
        java.lang.String str86 = charset84.name();
        java.nio.charset.Charset charset87 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str88 = charset87.toString();
        boolean boolean89 = charset84.contains(charset87);
        java.lang.String str90 = charset84.name();
        int int91 = charset79.compareTo(charset84);
        com.google.javascript.rhino.Node node92 = strMap4.get((java.lang.Object) int91);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy3 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy3.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + tracerMode18 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode18.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy42 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy42.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strEntrySet45);
        org.junit.Assert.assertTrue("'" + tweakProcessing46 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP + "'", tweakProcessing46.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(strEntrySet69);
        org.junit.Assert.assertEquals(file72.getParent(), ":");
        org.junit.Assert.assertEquals(file72.toString(), ":/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long76 + "' != '" + 280489385000L + "'", long76 == 280489385000L);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(file78);
        org.junit.Assert.assertNull("file78.getParent() == null", file78.getParent());
        org.junit.Assert.assertEquals(file78.toString(), ":");
        org.junit.Assert.assertNotNull(charset79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "US-ASCII" + "'", str80, "US-ASCII");
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNotNull(strSet82);
        org.junit.Assert.assertNotNull(sourceFile83);
        org.junit.Assert.assertNotNull(charset84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "US-ASCII" + "'", str85, "US-ASCII");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "US-ASCII" + "'", str86, "US-ASCII");
        org.junit.Assert.assertNotNull(charset87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "US-ASCII" + "'", str88, "US-ASCII");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "US-ASCII" + "'", str90, "US-ASCII");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNull(node92);
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = jSModule1.getByName("FINEST");
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int8 = sourceFile6.getLineOfOffset((int) (short) 1);
        java.lang.String str9 = sourceFile6.getName();
        java.lang.String str10 = sourceFile6.getName();
        java.lang.String str11 = sourceFile6.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput13 = new com.google.javascript.jscomp.CompilerInput(sourceFile6, true);
        com.google.javascript.jscomp.CompilerInput compilerInput14 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput13);
        com.google.javascript.jscomp.JSModule jSModule15 = compilerInput13.getModule();
        com.google.javascript.jscomp.JSModule jSModule17 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        jSModule17.sortInputsByDeps(compiler18);
        java.lang.String str20 = jSModule17.getName();
        compilerInput13.setModule(jSModule17);
        jSModule1.addDependency(jSModule17);
        com.google.javascript.jscomp.SourceFile sourceFile25 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int27 = sourceFile25.getLineOfOffset((int) (short) 1);
        int int29 = sourceFile25.getLineOfOffset(100);
        java.lang.String str30 = sourceFile25.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput31 = new com.google.javascript.jscomp.CompilerInput(sourceFile25);
        com.google.javascript.rhino.InputId inputId32 = compilerInput31.getInputId();
        jSModule1.addFirst(compilerInput31);
        com.google.javascript.jscomp.SourceFile sourceFile37 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", ":", "goog.abstractMethod");
        java.lang.String str38 = sourceFile37.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput40 = new com.google.javascript.jscomp.CompilerInput(sourceFile37, false);
        java.lang.String str41 = sourceFile37.getCode();
        jSModule1.addFirst(sourceFile37);
        jSModule1.removeAll();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = jSModule1.getPathRelativeToClosureBase();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(compilerInput3);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "STRING PARAM_LIST 49" + "'", str20, "STRING PARAM_LIST 49");
        org.junit.Assert.assertNotNull(sourceFile25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(inputId32);
        org.junit.Assert.assertNotNull(sourceFile37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "goog.abstractMethod" + "'", str41, "goog.abstractMethod");
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setReplaceStringsPlaceholderToken("hi!");
        compilerOptions0.setTweakToDoubleLiteral("", (double) (short) 1);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode6 = com.google.javascript.jscomp.CompilerOptions.TracerMode.RAW_SIZE;
        compilerOptions0.setTracer(tracerMode6);
        compilerOptions0.setGeneratePseudoNames(true);
        compilerOptions0.renamePrefixNamespace = "InputId: JSC_OPTIMIZE_LOOP_ERROR: Exceeded max number of code motion iterations: {0}";
        compilerOptions0.setAliasKeywords(false);
        org.junit.Assert.assertTrue("'" + tracerMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.RAW_SIZE + "'", tracerMode6.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.RAW_SIZE));
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setInlineLocalFunctions(false);
        compilerOptions0.moveFunctionDeclarations = true;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode5 = compilerOptions0.getLanguageIn();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setInlineLocalFunctions(false);
        compilerOptions6.moveFunctionDeclarations = true;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode11 = compilerOptions6.getLanguageIn();
        compilerOptions0.setLanguageIn(languageMode11);
        compilerOptions0.setPropertyAffinity(true);
        compilerOptions0.setInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        boolean boolean18 = compilerOptions17.moveFunctionDeclarations;
        compilerOptions17.setReportPath("java.io.IOException: ");
        boolean boolean21 = compilerOptions17.inlineConstantVars;
        boolean boolean22 = compilerOptions17.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode24 = null;
        compilerOptions23.setTracerMode(tracerMode24);
        boolean boolean26 = compilerOptions23.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel27 = compilerOptions23.sourceMapDetailLevel;
        compilerOptions23.setColorizeErrorOutput(true);
        compilerOptions23.generatePseudoNames = true;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy32 = com.google.javascript.jscomp.VariableRenamingPolicy.UNSPECIFIED;
        compilerOptions23.setVariableRenaming(variableRenamingPolicy32);
        com.google.javascript.jscomp.ErrorFormat errorFormat34 = compilerOptions23.errorFormat;
        compilerOptions17.setErrorFormat(errorFormat34);
        compilerOptions0.errorFormat = errorFormat34;
        compilerOptions0.setRewriteNewDateGoogNow(false);
        compilerOptions0.setSyntheticBlockEndMarker("NUMBER -1.0");
        org.junit.Assert.assertTrue("'" + languageMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode5.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + languageMode11 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode11.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(detailLevel27);
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy32 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.UNSPECIFIED + "'", variableRenamingPolicy32.equals(com.google.javascript.jscomp.VariableRenamingPolicy.UNSPECIFIED));
        org.junit.Assert.assertNotNull(errorFormat34);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setReplaceStringsPlaceholderToken("hi!");
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel3 = com.google.javascript.jscomp.SourceMap.DetailLevel.SYMBOLS;
        compilerOptions0.setSourceMapDetailLevel(detailLevel3);
        compilerOptions0.inlineFunctions = true;
        compilerOptions0.setCommonJSModulePathPrefix(":");
        compilerOptions0.setCrossModuleCodeMotion(true);
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode11 = compilerOptions0.getLanguageIn();
        compilerOptions0.setExtractPrototypeMemberDeclarations(true);
        boolean boolean14 = compilerOptions0.aliasAllStrings;
        compilerOptions0.setClosurePass(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode18 = null;
        compilerOptions17.setTracerMode(tracerMode18);
        boolean boolean20 = compilerOptions17.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel21 = compilerOptions17.sourceMapDetailLevel;
        compilerOptions17.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions24.crossModuleMethodMotion = true;
        compilerOptions24.optimizeParameters = true;
        compilerOptions24.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel32 = compilerOptions24.checkGlobalNamesLevel;
        compilerOptions17.setReportMissingOverride(checkLevel32);
        java.util.Set<java.lang.String> strSet34 = compilerOptions17.stripTypes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode36 = null;
        compilerOptions35.setTracerMode(tracerMode36);
        boolean boolean38 = compilerOptions35.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel39 = compilerOptions35.sourceMapDetailLevel;
        compilerOptions35.setColorizeErrorOutput(true);
        java.util.Set<java.lang.String> strSet42 = compilerOptions35.stripNameSuffixes;
        com.google.javascript.jscomp.SourceFile sourceFile44 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput46 = new com.google.javascript.jscomp.CompilerInput(sourceFile44, true);
        com.google.javascript.rhino.InputId inputId48 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput50 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput46, inputId48, true);
        java.lang.String str51 = compilerInput50.toString();
        boolean boolean52 = strSet42.contains((java.lang.Object) compilerInput50);
        compilerOptions17.stripTypes = strSet42;
        compilerOptions0.stripNamePrefixes = strSet42;
        compilerOptions0.setAppNameStr("PARAM_LIST\n    PARAM_LIST\n");
        compilerOptions0.setProcessObjectPropertyString(false);
        compilerOptions0.generateExports = true;
        com.google.javascript.jscomp.SourceFile.Builder builder61 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile sourceFile65 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int67 = sourceFile65.getLineOfOffset((int) (short) 1);
        java.io.Reader reader68 = sourceFile65.getCodeReader();
        int int69 = reader68.read();
        com.google.javascript.jscomp.SourceFile sourceFile70 = builder61.buildFromReader("*global*", reader68);
        java.nio.charset.Charset charset71 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder72 = builder61.withCharset(charset71);
        java.io.File file75 = new java.io.File(":", "hi!");
        boolean boolean78 = file75.setExecutable(true, false);
        long long79 = file75.lastModified();
        boolean boolean80 = file75.mkdir();
        com.google.javascript.jscomp.SourceFile sourceFile81 = builder61.buildFromFile(file75);
        com.google.javascript.jscomp.SourceFile.Builder builder83 = builder61.withOriginalPath("java.io.IOException: OFF");
        java.nio.charset.Charset charset84 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str85 = charset84.name();
        java.lang.String str86 = charset84.name();
        com.google.javascript.jscomp.SourceFile.Builder builder87 = builder61.withCharset(charset84);
        java.nio.charset.Charset charset89 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str90 = charset89.name();
        java.util.Locale locale91 = null;
        java.lang.String str92 = charset89.displayName(locale91);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile93 = com.google.javascript.jscomp.JSSourceFile.fromFile("Node tree inequality:\nTree1:\nPARAM_LIST\n    NAME \n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: PARAM_LIST\n    NAME \n\n\nSubtree2: NUMBER -1.0\n", charset89);
        java.nio.charset.CharsetEncoder charsetEncoder94 = charset89.newEncoder();
        com.google.javascript.jscomp.SourceFile.Builder builder95 = builder61.withCharset(charset89);
        java.util.Set<java.lang.String> strSet96 = charset89.aliases();
        compilerOptions0.stripNameSuffixes = strSet96;
        org.junit.Assert.assertNotNull(detailLevel3);
        org.junit.Assert.assertTrue("'" + languageMode11 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode11.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(detailLevel21);
        org.junit.Assert.assertTrue("'" + checkLevel32 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel32.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(detailLevel39);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "*global*" + "'", str51, "*global*");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(sourceFile65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(reader68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(sourceFile70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertEquals(file75.getParent(), ":");
        org.junit.Assert.assertEquals(file75.toString(), ":/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long79 + "' != '" + 280489385000L + "'", long79 == 280489385000L);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(sourceFile81);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(charset84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "US-ASCII" + "'", str85, "US-ASCII");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "US-ASCII" + "'", str86, "US-ASCII");
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(charset89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "US-ASCII" + "'", str90, "US-ASCII");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "US-ASCII" + "'", str92, "US-ASCII");
        org.junit.Assert.assertNotNull(jSSourceFile93);
        org.junit.Assert.assertNotNull(charsetEncoder94);
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertNotNull(strSet96);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setReplaceStringsPlaceholderToken("hi!");
        compilerOptions0.setTweakToDoubleLiteral("", (double) (short) 1);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode6 = com.google.javascript.jscomp.CompilerOptions.TracerMode.RAW_SIZE;
        compilerOptions0.setTracer(tracerMode6);
        compilerOptions0.setSyntheticBlockStartMarker("");
        java.util.Set<java.lang.String> strSet10 = compilerOptions0.stripTypePrefixes;
        com.google.javascript.jscomp.CheckLevel checkLevel11 = compilerOptions0.checkMissingGetCssNameLevel;
        org.junit.Assert.assertTrue("'" + tracerMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.RAW_SIZE + "'", tracerMode6.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.RAW_SIZE));
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + checkLevel11 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel11.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLooseTypes(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CheckLevel checkLevel4 = compilerOptions3.checkRequires;
        compilerOptions0.setCheckProvides(checkLevel4);
        compilerOptions0.aliasAllStrings = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.crossModuleMethodMotion = true;
        compilerOptions8.skipAllCompilerPasses();
        boolean boolean12 = compilerOptions8.flowSensitiveInlineVariables;
        java.lang.String[] strArray22 = new java.lang.String[] { "*global*", "", "FINEST", "FINEST", "STRING PARAM_LIST 49", "STRING PARAM_LIST 49", "hi!", ":", "FINEST" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        compilerOptions8.stripTypes = strSet23;
        compilerOptions0.setAliasableStrings((java.util.Set<java.lang.String>) strSet23);
        com.google.javascript.jscomp.CheckLevel checkLevel27 = compilerOptions0.aggressiveVarCheck;
        org.junit.Assert.assertTrue("'" + checkLevel4 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel4.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + checkLevel27 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel27.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList9 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList9, jSTypeArray8);
        com.google.javascript.rhino.Node node11 = jSTypeRegistry7.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList9);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry7.createNamedType(":", "", (int) (byte) 1, 48);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList20 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList20, jSTypeArray19);
        com.google.javascript.rhino.Node node22 = jSTypeRegistry18.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList20);
        com.google.javascript.rhino.jstype.JSType jSType27 = jSTypeRegistry18.createNamedType(":", "", (int) (byte) 1, 48);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] { jSType27 };
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry1.createConstructorTypeWithVarArgs(jSType16, jSTypeArray28);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = jSTypeRegistry1.getErrorReporter();
        jSTypeRegistry1.identifyNonNullableName("NUMBER -1.0");
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList37 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList37, jSTypeArray36);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList40 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList40, jSTypeArray39);
        boolean boolean42 = jSTypeList37.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList40);
        com.google.javascript.rhino.Node node43 = jSTypeRegistry35.createParameters((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList37);
        jSTypeRegistry35.forwardDeclareType("PARAM_LIST");
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable47 = jSTypeRegistry35.getTypesWithProperty("*global*");
        com.google.javascript.rhino.jstype.JSType jSType52 = jSTypeRegistry35.createNamedType("PARAM_LIST", "/experiment/:/hi!", 51, 48);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        jSTypeRegistry54.clearNamedTypes();
        com.google.javascript.rhino.jstype.ObjectType objectType56 = jSTypeRegistry54.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSType jSType57 = jSTypeRegistry35.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) objectType56);
        jSTypeRegistry1.registerPropertyOnType("/tmp", jSType57);
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertNull(errorReporter30);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(jSTypeIterable47);
        org.junit.Assert.assertNotNull(jSType52);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNotNull(jSType57);
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = compiler1.getRoot();
        compiler1.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = compiler1.getErrorCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        boolean boolean3 = compilerOptions0.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel4 = compilerOptions0.sourceMapDetailLevel;
        compilerOptions0.setColorizeErrorOutput(true);
        compilerOptions0.collapseProperties = false;
        compilerOptions0.setRemoveDeadCode(true);
        compilerOptions0.setAliasableGlobals("");
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap13 = compilerOptions0.cssRenamingMap;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(detailLevel4);
        org.junit.Assert.assertNull(cssRenamingMap13);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray5 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList6 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList6, jSTypeArray5);
        boolean boolean8 = jSTypeList3.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList6);
        com.google.javascript.rhino.Node node9 = jSTypeRegistry1.createParameters((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable11 = jSTypeRegistry1.getTypesWithProperty(":");
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.clearNamedTypes();
        jSTypeRegistry13.forwardDeclareType("STRING PARAM_LIST 49");
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry13.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSType jSType18 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) objectType17);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable20 = jSTypeRegistry1.getTypesWithProperty("2019/07/12 07:12");
        boolean boolean21 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList28 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList28, jSTypeArray27);
        boolean boolean30 = jSTypeList25.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList28);
        com.google.javascript.rhino.Node node31 = jSTypeRegistry23.createParameters((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList33 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList33, jSTypeArray32);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray35 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList36 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList36, jSTypeArray35);
        boolean boolean38 = jSTypeList33.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList36);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList40 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList40, jSTypeArray39);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList43 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList43, jSTypeArray42);
        boolean boolean45 = jSTypeList40.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList43);
        boolean boolean46 = jSTypeList33.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList43);
        boolean boolean47 = jSTypeList33.isEmpty();
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode49 = null;
        compilerOptions48.setTracerMode(tracerMode49);
        boolean boolean51 = compilerOptions48.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel52 = compilerOptions48.sourceMapDetailLevel;
        compilerOptions48.setColorizeErrorOutput(true);
        compilerOptions48.collapseProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions57 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions57.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy60 = compilerOptions57.propertyRenaming;
        compilerOptions48.propertyRenaming = propertyRenamingPolicy60;
        com.google.javascript.jscomp.CheckLevel checkLevel62 = compilerOptions48.brokenClosureRequiresLevel;
        com.google.javascript.jscomp.CheckLevel checkLevel63 = compilerOptions48.checkRequires;
        compilerOptions48.setReportPath("OFF");
        compilerOptions48.renamePrefix = "STRING PARAM_LIST 49";
        boolean boolean68 = jSTypeList33.equals((java.lang.Object) "STRING PARAM_LIST 49");
        com.google.javascript.jscomp.CompilerOptions compilerOptions69 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions69.setReplaceStringsPlaceholderToken("hi!");
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel72 = com.google.javascript.jscomp.SourceMap.DetailLevel.SYMBOLS;
        compilerOptions69.setSourceMapDetailLevel(detailLevel72);
        compilerOptions69.inlineFunctions = true;
        compilerOptions69.setCommonJSModulePathPrefix(":");
        compilerOptions69.setCrossModuleCodeMotion(true);
        compilerOptions69.setRemoveUnusedClassProperties(true);
        int int82 = jSTypeList33.lastIndexOf((java.lang.Object) true);
        com.google.javascript.rhino.Node node83 = jSTypeRegistry23.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList33);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode84 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        jSTypeRegistry23.setResolveMode(resolveMode84);
        jSTypeRegistry1.setResolveMode(resolveMode84);
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(jSTypeIterable11);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(jSType18);
        org.junit.Assert.assertNotNull(jSTypeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSTypeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSTypeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(detailLevel52);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy60 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy60.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel62 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel62.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertTrue("'" + checkLevel63 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel63.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(detailLevel72);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + resolveMode84 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode84.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        com.google.javascript.jscomp.JSSourceFile jSSourceFile2 = com.google.javascript.jscomp.JSSourceFile.fromCode("STRING PARAM_LIST 49", "InputId: *global*");
        java.lang.String str3 = jSSourceFile2.getName();
        org.junit.Assert.assertNotNull(jSSourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "STRING PARAM_LIST 49" + "'", str3, "STRING PARAM_LIST 49");
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.optimizeParameters = true;
        compilerOptions0.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel8 = compilerOptions0.checkGlobalNamesLevel;
        compilerOptions0.setCheckMissingGetCssNameBlacklist("");
        boolean boolean11 = compilerOptions0.removeTryCatchFinally;
        java.lang.String str12 = compilerOptions0.renamePrefixNamespace;
        compilerOptions0.generatePseudoNames = true;
        org.junit.Assert.assertTrue("'" + checkLevel8 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel8.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        java.nio.charset.Charset charset1 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str2 = charset1.name();
        java.lang.String str3 = charset1.name();
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset1.newEncoder();
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("TYPEOF : 44\n", charset1);
        java.util.Set<java.lang.String> strSet6 = charset1.aliases();
        java.util.Set<java.lang.String> strSet7 = charset1.aliases();
        java.io.IOException iOException11 = new java.io.IOException(":");
        java.io.IOException iOException12 = new java.io.IOException("JSC_OPTIMIZE_LOOP_ERROR: Exceeded max number of code motion iterations: {0}", (java.lang.Throwable) iOException11);
        java.io.IOException iOException14 = new java.io.IOException("sun.util.logging.resources.logging");
        java.io.IOException iOException17 = new java.io.IOException();
        java.io.IOException iOException18 = new java.io.IOException("OFF", (java.lang.Throwable) iOException17);
        java.io.IOException iOException19 = new java.io.IOException("PARAM_LIST\n    PARAM_LIST\n", (java.lang.Throwable) iOException17);
        iOException14.addSuppressed((java.lang.Throwable) iOException17);
        iOException12.addSuppressed((java.lang.Throwable) iOException14);
        java.io.IOException iOException22 = new java.io.IOException("Unversioned directory", (java.lang.Throwable) iOException14);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) iOException22);
        java.lang.Exception[] exceptionArray24 = new java.lang.Exception[] { iOException22 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Exception[] exceptionArray25 = strSet7.toArray(exceptionArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "US-ASCII" + "'", str2, "US-ASCII");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "US-ASCII" + "'", str3, "US-ASCII");
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(exceptionArray24);
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.optimizeParameters = true;
        compilerOptions0.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.crossModuleMethodMotion = true;
        compilerOptions8.optimizeParameters = true;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy13 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy17 = compilerOptions14.propertyRenaming;
        compilerOptions8.setRenamingPolicy(variableRenamingPolicy13, propertyRenamingPolicy17);
        com.google.javascript.jscomp.SourceMap.Format format19 = compilerOptions8.sourceMapFormat;
        compilerOptions0.setSourceMapFormat(format19);
        boolean boolean21 = compilerOptions0.shouldColorizeErrorOutput();
        boolean boolean22 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.inlineLocalFunctions = true;
        compilerOptions0.locale = "NUMBER -1.0 [empty_block: 1]";
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy17 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy17.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(format19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        compilerOptions0.aliasExternals = true;
        compilerOptions0.setInlineLocalVariables(true);
        boolean boolean7 = compilerOptions0.assumeStrictThis();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList4 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList4, jSTypeArray3);
        com.google.javascript.rhino.Node node6 = jSTypeRegistry2.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList4);
        boolean boolean7 = node6.isIn();
        boolean boolean8 = node6.isVoid();
        node6.setOptionalArg(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode12 = null;
        compilerOptions11.setTracerMode(tracerMode12);
        boolean boolean14 = compilerOptions11.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel15 = compilerOptions11.sourceMapDetailLevel;
        compilerOptions11.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions18.crossModuleMethodMotion = true;
        compilerOptions18.optimizeParameters = true;
        compilerOptions18.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel26 = compilerOptions18.checkGlobalNamesLevel;
        compilerOptions11.setReportMissingOverride(checkLevel26);
        com.google.javascript.jscomp.DiagnosticType diagnosticType28 = com.google.javascript.jscomp.Compiler.MOTION_ITERATIONS_ERROR;
        java.lang.String[] strArray29 = null;
        com.google.javascript.jscomp.JSError jSError30 = com.google.javascript.jscomp.JSError.make("", node6, checkLevel26, diagnosticType28, strArray29);
        java.lang.String str31 = jSError30.description;
        java.lang.String str32 = jSError30.description;
        java.lang.String str33 = jSError30.toString();
        int int34 = jSError30.getNodeSourceOffset();
        int int35 = jSError30.getNodeSourceOffset();
        int int36 = jSError30.getCharno();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(detailLevel15);
        org.junit.Assert.assertTrue("'" + checkLevel26 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel26.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(diagnosticType28);
        org.junit.Assert.assertNotNull(jSError30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Exceeded max number of code motion iterations: {0}" + "'", str31, "Exceeded max number of code motion iterations: {0}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Exceeded max number of code motion iterations: {0}" + "'", str32, "Exceeded max number of code motion iterations: {0}");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "JSC_OPTIMIZE_LOOP_ERROR. Exceeded max number of code motion iterations: {0} at (unknown source) line (unknown line) : (unknown column)" + "'", str33, "JSC_OPTIMIZE_LOOP_ERROR. Exceeded max number of code motion iterations: {0} at (unknown source) line (unknown line) : (unknown column)");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        boolean boolean3 = compilerOptions0.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel4 = compilerOptions0.sourceMapDetailLevel;
        compilerOptions0.setColorizeErrorOutput(true);
        compilerOptions0.generatePseudoNames = true;
        java.lang.String str9 = compilerOptions0.renamePrefixNamespace;
        boolean boolean10 = compilerOptions0.recordFunctionInformation;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode12 = null;
        compilerOptions11.setTracerMode(tracerMode12);
        boolean boolean14 = compilerOptions11.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel15 = compilerOptions11.sourceMapDetailLevel;
        compilerOptions11.setColorizeErrorOutput(true);
        compilerOptions11.collapseProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy23 = compilerOptions20.propertyRenaming;
        compilerOptions11.propertyRenaming = propertyRenamingPolicy23;
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CheckLevel checkLevel26 = compilerOptions25.checkRequires;
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode28 = null;
        compilerOptions27.setTracerMode(tracerMode28);
        boolean boolean30 = compilerOptions27.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel31 = compilerOptions27.sourceMapDetailLevel;
        compilerOptions27.setColorizeErrorOutput(true);
        compilerOptions27.collapseProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions36.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy39 = compilerOptions36.propertyRenaming;
        compilerOptions27.propertyRenaming = propertyRenamingPolicy39;
        com.google.javascript.jscomp.CheckLevel checkLevel41 = compilerOptions27.brokenClosureRequiresLevel;
        com.google.javascript.jscomp.CheckLevel checkLevel42 = compilerOptions27.checkRequires;
        compilerOptions25.setCheckRequires(checkLevel42);
        compilerOptions11.setCheckProvides(checkLevel42);
        boolean boolean45 = compilerOptions11.isRemoveUnusedClassProperties();
        com.google.javascript.jscomp.CheckLevel checkLevel46 = compilerOptions11.checkGlobalThisLevel;
        compilerOptions0.setReportUnknownTypes(checkLevel46);
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode48 = compilerOptions0.getLanguageIn();
        compilerOptions0.lineBreak = false;
        java.util.Set<java.lang.String> strSet51 = compilerOptions0.stripNameSuffixes;
        java.lang.String str52 = compilerOptions0.aliasStringsBlacklist;
        boolean boolean53 = compilerOptions0.inlineLocalFunctions;
        compilerOptions0.setRenamePrefixNamespace(":/hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(detailLevel4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(detailLevel15);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy23 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy23.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel26 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel26.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(detailLevel31);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy39 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy39.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel41 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel41.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertTrue("'" + checkLevel42 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel42.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + checkLevel46 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel46.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + languageMode48 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode48.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        boolean boolean3 = compilerOptions0.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel4 = compilerOptions0.sourceMapDetailLevel;
        compilerOptions0.setColorizeErrorOutput(true);
        compilerOptions0.generatePseudoNames = true;
        java.lang.String str9 = compilerOptions0.renamePrefixNamespace;
        boolean boolean10 = compilerOptions0.recordFunctionInformation;
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode12 = null;
        compilerOptions11.setTracerMode(tracerMode12);
        boolean boolean14 = compilerOptions11.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel15 = compilerOptions11.sourceMapDetailLevel;
        compilerOptions11.setColorizeErrorOutput(true);
        compilerOptions11.collapseProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy23 = compilerOptions20.propertyRenaming;
        compilerOptions11.propertyRenaming = propertyRenamingPolicy23;
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CheckLevel checkLevel26 = compilerOptions25.checkRequires;
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode28 = null;
        compilerOptions27.setTracerMode(tracerMode28);
        boolean boolean30 = compilerOptions27.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel31 = compilerOptions27.sourceMapDetailLevel;
        compilerOptions27.setColorizeErrorOutput(true);
        compilerOptions27.collapseProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions36.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy39 = compilerOptions36.propertyRenaming;
        compilerOptions27.propertyRenaming = propertyRenamingPolicy39;
        com.google.javascript.jscomp.CheckLevel checkLevel41 = compilerOptions27.brokenClosureRequiresLevel;
        com.google.javascript.jscomp.CheckLevel checkLevel42 = compilerOptions27.checkRequires;
        compilerOptions25.setCheckRequires(checkLevel42);
        compilerOptions11.setCheckProvides(checkLevel42);
        boolean boolean45 = compilerOptions11.isRemoveUnusedClassProperties();
        com.google.javascript.jscomp.CheckLevel checkLevel46 = compilerOptions11.checkGlobalThisLevel;
        compilerOptions0.setReportUnknownTypes(checkLevel46);
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode48 = compilerOptions0.getLanguageIn();
        compilerOptions0.lineBreak = false;
        java.util.Set<java.lang.String> strSet51 = compilerOptions0.stripNameSuffixes;
        java.lang.String str52 = compilerOptions0.aliasStringsBlacklist;
        java.lang.String str53 = compilerOptions0.locale;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(detailLevel4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(detailLevel15);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy23 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy23.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel26 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel26.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(detailLevel31);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy39 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy39.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel41 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel41.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertTrue("'" + checkLevel42 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel42.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + checkLevel46 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel46.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + languageMode48 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode48.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList4 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList4, jSTypeArray3);
        com.google.javascript.rhino.Node node6 = jSTypeRegistry2.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList4);
        boolean boolean7 = node6.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList12 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList12, jSTypeArray11);
        com.google.javascript.rhino.Node node14 = jSTypeRegistry10.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList12);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList18 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList18, jSTypeArray17);
        com.google.javascript.rhino.Node node20 = jSTypeRegistry16.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList18);
        node14.addChildrenToBack(node20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.Node node27 = jSTypeRegistry23.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = node27.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList32 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList32, jSTypeArray31);
        com.google.javascript.rhino.Node node34 = jSTypeRegistry30.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList32);
        boolean boolean35 = node34.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList39 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList39, jSTypeArray38);
        com.google.javascript.rhino.Node node41 = jSTypeRegistry37.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (short) 0, node14, node27, node34, node41, 0, 49);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList49 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList49, jSTypeArray48);
        com.google.javascript.rhino.Node node51 = jSTypeRegistry47.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList49);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList55 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList55, jSTypeArray54);
        com.google.javascript.rhino.Node node57 = jSTypeRegistry53.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList55);
        node51.addChildrenToBack(node57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList62 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList62, jSTypeArray61);
        com.google.javascript.rhino.Node node64 = jSTypeRegistry60.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList62);
        boolean boolean65 = node64.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray68 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList69 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList69, jSTypeArray68);
        com.google.javascript.rhino.Node node71 = jSTypeRegistry67.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList69);
        boolean boolean72 = node71.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList76 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList76, jSTypeArray75);
        com.google.javascript.rhino.Node node78 = jSTypeRegistry74.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList76);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((int) (short) 0, node51, node64, node71, node78, 0, 49);
        com.google.javascript.rhino.Node node82 = node44.useSourceInfoFrom(node64);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder83 = node64.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node84 = node6.copyInformationFrom(node64);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node(700, node64, 8, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(jSTypeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jSTypeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSTypeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder83);
        org.junit.Assert.assertNotNull(node84);
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy3 = compilerOptions0.propertyRenaming;
        java.lang.String[] strArray6 = new java.lang.String[] { "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerOptions0.setStripTypes((java.util.Set<java.lang.String>) strSet7);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode11 = null;
        compilerOptions10.setTracerMode(tracerMode11);
        boolean boolean13 = compilerOptions10.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel14 = compilerOptions10.sourceMapDetailLevel;
        compilerOptions10.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.crossModuleMethodMotion = true;
        compilerOptions17.optimizeParameters = true;
        compilerOptions17.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel25 = compilerOptions17.checkGlobalNamesLevel;
        compilerOptions10.setReportMissingOverride(checkLevel25);
        compilerOptions0.setCheckUnreachableCode(checkLevel25);
        compilerOptions0.syntheticBlockStartMarker = "*global*";
        compilerOptions0.prettyPrint = false;
        boolean boolean32 = compilerOptions0.aliasAllStrings;
        com.google.javascript.jscomp.CompilerOptions.Reach reach33 = com.google.javascript.jscomp.CompilerOptions.Reach.NONE;
        compilerOptions0.setInlineVariables(reach33);
        compilerOptions0.setDefineToStringLiteral("Node tree inequality:\nTree1:\nNUMBER -1.0\n\n\nTree2:\nPARAM_LIST\n    PARAM_LIST\n\n\nSubtree1: NUMBER -1.0\n\n\nSubtree2: PARAM_LIST\n    PARAM_LIST\n", "/experiment/:/OFF6512485966767396418");
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy3 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy3.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(detailLevel14);
        org.junit.Assert.assertTrue("'" + checkLevel25 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel25.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + reach33 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.NONE + "'", reach33.equals(com.google.javascript.jscomp.CompilerOptions.Reach.NONE));
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        compilerOptions0.setSummaryDetailLevel(49);
        compilerOptions0.setRemoveTryCatchFinally(true);
        compilerOptions0.setComputeFunctionSideEffects(true);
        compilerOptions0.setGroupVariableDeclarations(true);
        compilerOptions0.setLocale("InputId: PARAM_LIST");
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList4 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList4, jSTypeArray3);
        com.google.javascript.rhino.Node node6 = jSTypeRegistry2.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList4);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        node6.addChildrenToBack(node12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        boolean boolean20 = node19.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean27 = node26.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList31 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList31, jSTypeArray30);
        com.google.javascript.rhino.Node node33 = jSTypeRegistry29.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList31);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 0, node6, node19, node26, node33, 0, 49);
        boolean boolean37 = node6.isDo();
        boolean boolean38 = node6.isWhile();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node6.children();
        java.lang.String[] strArray46 = new java.lang.String[] { "OFF", "PARAM_LIST", "*global*", ":", "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        node6.setDirectives((java.util.Set<java.lang.String>) strSet47);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder50 = node6.getJsDocBuilderForNode();
        boolean boolean51 = node6.isVoid();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Exceeded max number of code motion iterations: {0}", jSTypeNative1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("java.io.IOException: ", 43, (int) '#');
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("PARAM_LIST", 49, 0);
        boolean boolean12 = node11.isTry();
        java.lang.String str13 = node11.toString();
        boolean boolean14 = node7.hasChild(node11);
        boolean boolean15 = node7.isFromExterns();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList19 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList19, jSTypeArray18);
        com.google.javascript.rhino.Node node21 = jSTypeRegistry17.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList19);
        boolean boolean22 = node21.isIn();
        boolean boolean23 = node21.isVoid();
        node21.setOptionalArg(true);
        node21.setVarArgs(true);
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = node21.getJSDocInfo();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(42, node7, node21);
        com.google.javascript.rhino.Node node30 = assertionFunctionSpec2.getAssertedParam(node29);
        boolean boolean31 = node29.isOnlyModifiesThisCall();
        boolean boolean32 = node29.isStringKey();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "STRING PARAM_LIST 49" + "'", str13, "STRING PARAM_LIST 49");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSDocInfo28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        com.google.javascript.jscomp.JSSourceFile jSSourceFile1 = com.google.javascript.jscomp.JSSourceFile.fromFile("JSC_OPTIMIZE_LOOP_ERROR. Exceeded max number of code motion iterations: Unversioned directory at STRING PARAM_LIST 49: hi! line 97 : 48");
        jSSourceFile1.setOriginalPath("Node tree inequality:\nTree1:\nTHIS\n    STRING java.io.IOException:  43\n    PARAM_LIST [var_args_name: 1] [opt_arg: 1]\n\n\nTree2:\nSTRING \n\n\nSubtree1: THIS\n    STRING java.io.IOException:  43\n    PARAM_LIST [var_args_name: 1] [opt_arg: 1]\n\n\nSubtree2: STRING \n");
        jSSourceFile1.clearCachedSource();
        org.junit.Assert.assertNotNull(jSSourceFile1);
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList4 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList4, jSTypeArray3);
        com.google.javascript.rhino.Node node6 = jSTypeRegistry2.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList4);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        node6.addChildrenToBack(node12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        boolean boolean20 = node19.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean27 = node26.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList31 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList31, jSTypeArray30);
        com.google.javascript.rhino.Node node33 = jSTypeRegistry29.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList31);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 0, node6, node19, node26, node33, 0, 49);
        boolean boolean37 = node6.isDo();
        boolean boolean38 = node6.isWhile();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node6.children();
        java.lang.String[] strArray46 = new java.lang.String[] { "OFF", "PARAM_LIST", "*global*", ":", "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        node6.setDirectives((java.util.Set<java.lang.String>) strSet47);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList51 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList51, jSTypeArray50);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList54 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList54, jSTypeArray53);
        boolean boolean56 = jSTypeList51.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList54);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray57 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList58 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList58, jSTypeArray57);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        boolean boolean63 = jSTypeList58.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = jSTypeList51.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean65 = strSet47.retainAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        com.google.javascript.jscomp.CompilerOptions compilerOptions66 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CheckLevel checkLevel67 = compilerOptions66.checkRequires;
        compilerOptions66.setRewriteNewDateGoogNow(true);
        compilerOptions66.setSyntheticBlockStartMarker("OFF");
        compilerOptions66.skipAllCompilerPasses();
        compilerOptions66.jqueryPass = false;
        java.lang.String[] strArray80 = new java.lang.String[] { "PARAM_LIST\n", "/", "STRING PARAM_LIST 49", "hi!", "/" };
        java.util.LinkedHashSet<java.lang.String> strSet81 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet81, strArray80);
        compilerOptions66.stripNameSuffixes = strSet81;
        com.google.javascript.rhino.ErrorReporter errorReporter84 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry85 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter84);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray86 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList87 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList87, jSTypeArray86);
        com.google.javascript.rhino.Node node89 = jSTypeRegistry85.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList87);
        java.util.stream.Stream<com.google.javascript.rhino.jstype.JSType> jSTypeStream90 = jSTypeList87.parallelStream();
        boolean boolean91 = strSet81.retainAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList87);
        boolean boolean92 = jSTypeList61.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList87);
        java.util.stream.Stream<com.google.javascript.rhino.jstype.JSType> jSTypeStream93 = jSTypeList61.stream();
        com.google.javascript.jscomp.SourceFile.Builder builder94 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator96 = null;
        com.google.javascript.jscomp.SourceFile sourceFile97 = builder94.buildFromGenerator("java.io.IOException: java.io.IOException: ", generator96);
        com.google.javascript.jscomp.CompilerInput compilerInput98 = new com.google.javascript.jscomp.CompilerInput(sourceFile97);
        boolean boolean99 = jSTypeList61.contains((java.lang.Object) sourceFile97);
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jSTypeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + checkLevel67 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel67.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(jSTypeArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(jSTypeStream90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(jSTypeStream93);
        org.junit.Assert.assertNotNull(sourceFile97);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setInlineLocalFunctions(false);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy3 = null;
        compilerOptions0.variableRenaming = variableRenamingPolicy3;
        compilerOptions0.setProtectHiddenSideEffects(false);
        compilerOptions0.syntheticBlockEndMarker = "OFF";
        java.lang.String str9 = compilerOptions0.renamePrefixNamespace;
        com.google.javascript.jscomp.CodingConvention codingConvention10 = null;
        compilerOptions0.setCodingConvention(codingConvention10);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        compilerOptions0.setDefineReplacements(strMap12);
        boolean boolean14 = compilerOptions0.removeUnusedPrototypePropertiesInExterns;
        java.io.PrintStream printStream16 = new java.io.PrintStream("PARAM_LIST");
        printStream16.write(40);
        printStream16.flush();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy23 = compilerOptions20.propertyRenaming;
        java.lang.String[] strArray26 = new java.lang.String[] { "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        compilerOptions20.setStripTypes((java.util.Set<java.lang.String>) strSet27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode31 = null;
        compilerOptions30.setTracerMode(tracerMode31);
        boolean boolean33 = compilerOptions30.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel34 = compilerOptions30.sourceMapDetailLevel;
        compilerOptions30.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions37.crossModuleMethodMotion = true;
        compilerOptions37.optimizeParameters = true;
        compilerOptions37.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel45 = compilerOptions37.checkGlobalNamesLevel;
        compilerOptions30.setReportMissingOverride(checkLevel45);
        compilerOptions20.setCheckUnreachableCode(checkLevel45);
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        compilerOptions20.inputVariableMapSerialized = byteArray52;
        printStream16.write(byteArray52);
        compilerOptions0.inputPropertyMapSerialized = byteArray52;
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy23 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy23.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(detailLevel34);
        org.junit.Assert.assertTrue("'" + checkLevel45 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel45.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 1, 10, 1]");
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        com.google.javascript.jscomp.CheckLevel checkLevel1 = com.google.javascript.jscomp.CheckLevel.WARNING;
        com.google.javascript.jscomp.DiagnosticType diagnosticType3 = com.google.javascript.jscomp.DiagnosticType.make("WARNING", checkLevel1, "hi!");
        java.lang.String str4 = diagnosticType3.toString();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions5.setReplaceStringsPlaceholderToken("hi!");
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel8 = com.google.javascript.jscomp.SourceMap.DetailLevel.SYMBOLS;
        compilerOptions5.setSourceMapDetailLevel(detailLevel8);
        compilerOptions5.inlineFunctions = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy15 = compilerOptions12.propertyRenaming;
        java.lang.String[] strArray18 = new java.lang.String[] { "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        compilerOptions12.setStripTypes((java.util.Set<java.lang.String>) strSet19);
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode23 = null;
        compilerOptions22.setTracerMode(tracerMode23);
        boolean boolean25 = compilerOptions22.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel26 = compilerOptions22.sourceMapDetailLevel;
        compilerOptions22.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions29.crossModuleMethodMotion = true;
        compilerOptions29.optimizeParameters = true;
        compilerOptions29.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel37 = compilerOptions29.checkGlobalNamesLevel;
        compilerOptions22.setReportMissingOverride(checkLevel37);
        compilerOptions12.setCheckUnreachableCode(checkLevel37);
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        compilerOptions12.inputVariableMapSerialized = byteArray44;
        compilerOptions5.inputVariableMapSerialized = byteArray44;
        compilerOptions5.syntheticBlockStartMarker = "FINEST";
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions49.setLooseTypes(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CheckLevel checkLevel53 = compilerOptions52.checkRequires;
        compilerOptions49.setCheckProvides(checkLevel53);
        compilerOptions5.setCheckProvides(checkLevel53);
        compilerOptions5.coalesceVariableNames = true;
        com.google.javascript.jscomp.CheckLevel checkLevel58 = compilerOptions5.brokenClosureRequiresLevel;
        diagnosticType3.level = checkLevel58;
        com.google.javascript.jscomp.CheckLevel checkLevel60 = diagnosticType3.defaultLevel;
        org.junit.Assert.assertTrue("'" + checkLevel1 + "' != '" + com.google.javascript.jscomp.CheckLevel.WARNING + "'", checkLevel1.equals(com.google.javascript.jscomp.CheckLevel.WARNING));
        org.junit.Assert.assertNotNull(diagnosticType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "WARNING: hi!" + "'", str4, "WARNING: hi!");
        org.junit.Assert.assertNotNull(detailLevel8);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy15 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy15.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(detailLevel26);
        org.junit.Assert.assertTrue("'" + checkLevel37 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel37.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 1, 10, 1]");
        org.junit.Assert.assertTrue("'" + checkLevel53 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel53.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel58 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel58.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertTrue("'" + checkLevel60 + "' != '" + com.google.javascript.jscomp.CheckLevel.WARNING + "'", checkLevel60.equals(com.google.javascript.jscomp.CheckLevel.WARNING));
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.optimizeParameters = true;
        compilerOptions0.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.crossModuleMethodMotion = true;
        compilerOptions8.optimizeParameters = true;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy13 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy17 = compilerOptions14.propertyRenaming;
        compilerOptions8.setRenamingPolicy(variableRenamingPolicy13, propertyRenamingPolicy17);
        com.google.javascript.jscomp.SourceMap.Format format19 = compilerOptions8.sourceMapFormat;
        compilerOptions0.setSourceMapFormat(format19);
        boolean boolean21 = compilerOptions0.shouldColorizeErrorOutput();
        boolean boolean22 = compilerOptions0.removeTryCatchFinally;
        com.google.javascript.jscomp.SourceMap.Format format23 = compilerOptions0.sourceMapFormat;
        compilerOptions0.setAliasExternals(true);
        boolean boolean26 = compilerOptions0.preferLineBreakAtEndOfFile;
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy30 = compilerOptions27.propertyRenaming;
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy31 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF;
        compilerOptions27.anonymousFunctionNaming = anonymousFunctionNamingPolicy31;
        compilerOptions27.checkSymbols = true;
        compilerOptions27.inlineGetters = false;
        com.google.javascript.jscomp.CheckLevel checkLevel37 = compilerOptions27.checkMissingReturn;
        compilerOptions0.checkGlobalNamesLevel = checkLevel37;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode39 = com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
        compilerOptions0.setLanguageIn(languageMode39);
        compilerOptions0.setManageClosureDependencies(false);
        compilerOptions0.setReserveRawExports(false);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy17 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy17.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(format19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(format23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy30 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy30.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy31 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy31.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel37 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel37.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + languageMode39 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT + "'", languageMode39.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT));
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_MESSAGE = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TWEAKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_USELESS_CODE = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        com.google.javascript.jscomp.PerformanceTracker.Stats stats1 = new com.google.javascript.jscomp.PerformanceTracker.Stats("FINEST");
        stats1.gzDiff = (short) 0;
        stats1.runtime = 1645456142000L;
        int int6 = stats1.gzDiff;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.SourceFile sourceFile4 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int6 = sourceFile4.getLineOfOffset((int) (short) 1);
        int int8 = sourceFile4.getColumnOfOffset(49);
        jSModule1.addFirst(sourceFile4);
        boolean boolean11 = jSModule1.removeByName("PARAM_LIST");
        com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int16 = sourceFile14.getLineOfOffset((int) (short) 1);
        java.lang.String str17 = sourceFile14.getName();
        java.lang.String str18 = sourceFile14.getName();
        java.lang.String str19 = sourceFile14.getName();
        jSModule1.addFirst(sourceFile14);
        com.google.javascript.jscomp.SourceFile sourceFile23 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int25 = sourceFile23.getLineOfOffset((int) (short) 1);
        java.lang.String str26 = sourceFile23.getName();
        com.google.javascript.jscomp.JsAst jsAst27 = new com.google.javascript.jscomp.JsAst(sourceFile23);
        jsAst27.clearAst();
        com.google.javascript.jscomp.SourceFile sourceFile31 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int33 = sourceFile31.getLineOfOffset((int) (short) 1);
        java.lang.String str34 = sourceFile31.getName();
        java.lang.String str35 = sourceFile31.getName();
        jsAst27.setSourceFile(sourceFile31);
        com.google.javascript.jscomp.SourceFile sourceFile37 = jsAst27.getSourceFile();
        java.lang.String str38 = sourceFile37.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput39 = new com.google.javascript.jscomp.CompilerInput(sourceFile37);
        jSModule1.add(compilerInput39);
        com.google.javascript.rhino.InputId inputId41 = compilerInput39.getInputId();
        com.google.javascript.jscomp.SourceFile sourceFile43 = com.google.javascript.jscomp.SourceFile.fromFile("/experiment/:/hi!");
        sourceFile43.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            compilerInput39.setSourceFile(sourceFile43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sourceFile14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(sourceFile23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(sourceFile31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(sourceFile37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(inputId41);
        org.junit.Assert.assertNotNull(sourceFile43);
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        java.io.File file2 = new java.io.File(":", "hi!");
        boolean boolean5 = file2.setExecutable(true, false);
        long long6 = file2.lastModified();
        boolean boolean7 = file2.mkdir();
        java.lang.String str8 = file2.getCanonicalPath();
        java.lang.String str9 = file2.getCanonicalPath();
        boolean boolean10 = file2.canExecute();
        boolean boolean12 = file2.setWritable(false);
        boolean boolean13 = file2.setReadOnly();
        org.junit.Assert.assertEquals(file2.getParent(), ":");
        org.junit.Assert.assertEquals(file2.toString(), ":/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 280489385000L + "'", long6 == 280489385000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/experiment/:/hi!" + "'", str8, "/experiment/:/hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/experiment/:/hi!" + "'", str9, "/experiment/:/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setReplaceStringsPlaceholderToken("hi!");
        compilerOptions0.markNoSideEffectCalls = false;
        compilerOptions0.setRemoveTryCatchFinally(true);
        compilerOptions0.setCheckCaja(true);
        boolean boolean9 = compilerOptions0.inlineGetters;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setMutatesGlobalState();
        int int2 = sideEffectFlags0.valueOf();
        sideEffectFlags0.setAllFlags();
        int int4 = sideEffectFlags0.valueOf();
        sideEffectFlags0.clearAllFlags();
        sideEffectFlags0.setMutatesThis();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        boolean boolean3 = compilerOptions0.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel4 = compilerOptions0.sourceMapDetailLevel;
        compilerOptions0.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions7.crossModuleMethodMotion = true;
        compilerOptions7.optimizeParameters = true;
        compilerOptions7.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel15 = compilerOptions7.checkGlobalNamesLevel;
        compilerOptions0.setReportMissingOverride(checkLevel15);
        java.util.Set<java.lang.String> strSet17 = compilerOptions0.stripTypes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CheckLevel checkLevel19 = compilerOptions18.checkRequires;
        compilerOptions0.setReportMissingOverride(checkLevel19);
        compilerOptions0.setGatherCssNames(true);
        compilerOptions0.setLineBreak(false);
        boolean boolean25 = compilerOptions0.flowSensitiveInlineVariables;
        compilerOptions0.setSyntheticBlockStartMarker("/experiment/:");
        compilerOptions0.removeUnusedPrototypeProperties = false;
        compilerOptions0.reserveRawExports = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(detailLevel4);
        org.junit.Assert.assertTrue("'" + checkLevel15 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel15.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        boolean boolean3 = compilerOptions0.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel4 = compilerOptions0.sourceMapDetailLevel;
        compilerOptions0.setColorizeErrorOutput(true);
        compilerOptions0.collapseProperties = false;
        compilerOptions0.setSkipAllPasses(false);
        compilerOptions0.setPropertyAffinity(false);
        compilerOptions0.deadAssignmentElimination = true;
        compilerOptions0.setOutputCharset("WARNING");
        compilerOptions0.setLabelRenaming(true);
        java.lang.String str19 = compilerOptions0.instrumentationTemplate;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(detailLevel4);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setReplaceStringsPlaceholderToken("hi!");
        compilerOptions0.ideMode = false;
        com.google.javascript.jscomp.CheckLevel checkLevel5 = compilerOptions0.brokenClosureRequiresLevel;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode7 = null;
        compilerOptions6.setTracerMode(tracerMode7);
        boolean boolean9 = compilerOptions6.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel10 = compilerOptions6.sourceMapDetailLevel;
        compilerOptions6.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.crossModuleMethodMotion = true;
        compilerOptions13.optimizeParameters = true;
        compilerOptions13.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel21 = compilerOptions13.checkGlobalNamesLevel;
        compilerOptions6.setReportMissingOverride(checkLevel21);
        java.util.Set<java.lang.String> strSet23 = compilerOptions6.stripTypes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode25 = null;
        compilerOptions24.setTracerMode(tracerMode25);
        boolean boolean27 = compilerOptions24.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel28 = compilerOptions24.sourceMapDetailLevel;
        compilerOptions24.setColorizeErrorOutput(true);
        java.util.Set<java.lang.String> strSet31 = compilerOptions24.stripNameSuffixes;
        com.google.javascript.jscomp.SourceFile sourceFile33 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput35 = new com.google.javascript.jscomp.CompilerInput(sourceFile33, true);
        com.google.javascript.rhino.InputId inputId37 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput39 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput35, inputId37, true);
        java.lang.String str40 = compilerInput39.toString();
        boolean boolean41 = strSet31.contains((java.lang.Object) compilerInput39);
        compilerOptions6.stripTypes = strSet31;
        compilerOptions6.setMarkAsCompiled(true);
        java.util.Set<java.lang.String> strSet45 = compilerOptions6.stripTypePrefixes;
        compilerOptions6.setTightenTypes(false);
        compilerOptions6.setRecordFunctionInformation(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions50.crossModuleMethodMotion = true;
        compilerOptions50.optimizeParameters = true;
        compilerOptions50.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel58 = compilerOptions50.checkGlobalNamesLevel;
        compilerOptions50.setCheckMissingGetCssNameBlacklist("");
        boolean boolean61 = compilerOptions50.removeTryCatchFinally;
        compilerOptions50.setMarkAsCompiled(true);
        compilerOptions50.inlineGetters = false;
        boolean boolean66 = compilerOptions50.inlineFunctions;
        com.google.javascript.jscomp.CompilerOptions compilerOptions67 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions67.setReplaceStringsPlaceholderToken("hi!");
        compilerOptions67.setTweakToDoubleLiteral("", (double) (short) 1);
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode73 = null;
        compilerOptions67.setLanguageOut(languageMode73);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy75 = null;
        compilerOptions67.variableRenaming = variableRenamingPolicy75;
        com.google.javascript.jscomp.CheckLevel checkLevel77 = compilerOptions67.checkUnreachableCode;
        compilerOptions50.setCheckProvides(checkLevel77);
        compilerOptions6.checkRequires = checkLevel77;
        com.google.javascript.jscomp.CompilerOptions compilerOptions80 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions80.setInlineLocalFunctions(false);
        java.util.Set<java.lang.String> strSet83 = compilerOptions80.stripNameSuffixes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions84 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions84.crossModuleMethodMotion = true;
        compilerOptions84.optimizeParameters = true;
        compilerOptions84.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel92 = compilerOptions84.checkGlobalNamesLevel;
        compilerOptions80.checkRequires = checkLevel92;
        compilerOptions80.prettyPrint = false;
        boolean boolean96 = compilerOptions80.shouldColorizeErrorOutput();
        com.google.javascript.jscomp.CheckLevel checkLevel97 = compilerOptions80.aggressiveVarCheck;
        compilerOptions6.setCheckGlobalNamesLevel(checkLevel97);
        compilerOptions0.aggressiveVarCheck = checkLevel97;
        org.junit.Assert.assertTrue("'" + checkLevel5 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel5.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(detailLevel10);
        org.junit.Assert.assertTrue("'" + checkLevel21 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel21.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(detailLevel28);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "*global*" + "'", str40, "*global*");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertTrue("'" + checkLevel58 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel58.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + checkLevel77 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel77.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertTrue("'" + checkLevel92 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel92.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + checkLevel97 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel97.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray5 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList6 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList6, jSTypeArray5);
        boolean boolean8 = jSTypeList3.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList6);
        com.google.javascript.rhino.Node node9 = jSTypeRegistry1.createParameters((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        jSTypeRegistry1.forwardDeclareType("PARAM_LIST");
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable13 = jSTypeRegistry1.getTypesWithProperty("*global*");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = jSTypeRegistry1.getType(jSTypeStaticScope14, "PARAM_LIST", "java.io.IOException: ", 44, 8);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList27 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList27, jSTypeArray26);
        boolean boolean29 = jSTypeList24.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList27);
        com.google.javascript.rhino.Node node30 = jSTypeRegistry22.createParameters((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        jSTypeRegistry22.forwardDeclareType("PARAM_LIST");
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable34 = jSTypeRegistry22.getTypesWithProperty("*global*");
        com.google.javascript.rhino.jstype.JSType jSType39 = jSTypeRegistry22.createNamedType("PARAM_LIST", "/experiment/:/hi!", 51, 48);
        boolean boolean40 = jSTypeRegistry1.declareType("hi!", jSType39);
        jSTypeRegistry1.clearTemplateTypeNames();
        boolean boolean42 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(jSTypeIterable34);
        org.junit.Assert.assertNotNull(jSType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setInlineLocalFunctions(false);
        compilerOptions0.moveFunctionDeclarations = true;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode5 = compilerOptions0.getLanguageIn();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setInlineLocalFunctions(false);
        compilerOptions6.moveFunctionDeclarations = true;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode11 = compilerOptions6.getLanguageIn();
        compilerOptions0.setLanguageIn(languageMode11);
        compilerOptions0.setPropertyAffinity(true);
        compilerOptions0.setInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        boolean boolean18 = compilerOptions17.moveFunctionDeclarations;
        compilerOptions17.setReportPath("java.io.IOException: ");
        boolean boolean21 = compilerOptions17.inlineConstantVars;
        boolean boolean22 = compilerOptions17.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode24 = null;
        compilerOptions23.setTracerMode(tracerMode24);
        boolean boolean26 = compilerOptions23.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel27 = compilerOptions23.sourceMapDetailLevel;
        compilerOptions23.setColorizeErrorOutput(true);
        compilerOptions23.generatePseudoNames = true;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy32 = com.google.javascript.jscomp.VariableRenamingPolicy.UNSPECIFIED;
        compilerOptions23.setVariableRenaming(variableRenamingPolicy32);
        com.google.javascript.jscomp.ErrorFormat errorFormat34 = compilerOptions23.errorFormat;
        compilerOptions17.setErrorFormat(errorFormat34);
        compilerOptions0.errorFormat = errorFormat34;
        java.util.Set<java.lang.String> strSet37 = compilerOptions0.stripNameSuffixes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions38.crossModuleMethodMotion = true;
        compilerOptions38.optimizeParameters = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions43.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy46 = compilerOptions43.propertyRenaming;
        java.lang.String[] strArray49 = new java.lang.String[] { "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        compilerOptions43.setStripTypes((java.util.Set<java.lang.String>) strSet50);
        compilerOptions38.stripNamePrefixes = strSet50;
        compilerOptions38.checkTypes = false;
        boolean boolean56 = compilerOptions38.assumeStrictThis();
        compilerOptions38.convertToDottedProperties = true;
        com.google.javascript.jscomp.MessageBundle messageBundle59 = null;
        compilerOptions38.messageBundle = messageBundle59;
        compilerOptions38.ambiguateProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode64 = null;
        compilerOptions63.setTracerMode(tracerMode64);
        boolean boolean66 = compilerOptions63.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel67 = compilerOptions63.sourceMapDetailLevel;
        compilerOptions63.setColorizeErrorOutput(true);
        compilerOptions63.collapseProperties = false;
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy72 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.UNMAPPED;
        compilerOptions63.setAnonymousFunctionNaming(anonymousFunctionNamingPolicy72);
        compilerOptions38.anonymousFunctionNaming = anonymousFunctionNamingPolicy72;
        char[] charArray75 = anonymousFunctionNamingPolicy72.getReservedCharacters();
        compilerOptions0.anonymousFunctionNaming = anonymousFunctionNamingPolicy72;
        compilerOptions0.setRenamePrefix("FINE");
        org.junit.Assert.assertTrue("'" + languageMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode5.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + languageMode11 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode11.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(detailLevel27);
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy32 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.UNSPECIFIED + "'", variableRenamingPolicy32.equals(com.google.javascript.jscomp.VariableRenamingPolicy.UNSPECIFIED));
        org.junit.Assert.assertNotNull(errorFormat34);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy46 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy46.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(detailLevel67);
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy72 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.UNMAPPED + "'", anonymousFunctionNamingPolicy72.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.UNMAPPED));
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[$]");
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy3 = compilerOptions0.propertyRenaming;
        java.lang.String[] strArray6 = new java.lang.String[] { "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerOptions0.setStripTypes((java.util.Set<java.lang.String>) strSet7);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode11 = null;
        compilerOptions10.setTracerMode(tracerMode11);
        boolean boolean13 = compilerOptions10.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel14 = compilerOptions10.sourceMapDetailLevel;
        compilerOptions10.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.crossModuleMethodMotion = true;
        compilerOptions17.optimizeParameters = true;
        compilerOptions17.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel25 = compilerOptions17.checkGlobalNamesLevel;
        compilerOptions10.setReportMissingOverride(checkLevel25);
        compilerOptions0.setCheckUnreachableCode(checkLevel25);
        compilerOptions0.syntheticBlockStartMarker = "*global*";
        com.google.javascript.jscomp.CheckLevel checkLevel30 = compilerOptions0.checkMissingReturn;
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions31.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode34 = com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF;
        compilerOptions31.setTracer(tracerMode34);
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode37 = null;
        compilerOptions36.setTracerMode(tracerMode37);
        boolean boolean39 = compilerOptions36.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel40 = compilerOptions36.sourceMapDetailLevel;
        compilerOptions36.setColorizeErrorOutput(true);
        java.util.Set<java.lang.String> strSet43 = compilerOptions36.stripNameSuffixes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode45 = null;
        compilerOptions44.setTracerMode(tracerMode45);
        boolean boolean47 = compilerOptions44.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel48 = compilerOptions44.sourceMapDetailLevel;
        compilerOptions44.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions51.crossModuleMethodMotion = true;
        compilerOptions51.optimizeParameters = true;
        compilerOptions51.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel59 = compilerOptions51.checkGlobalNamesLevel;
        compilerOptions44.setReportMissingOverride(checkLevel59);
        compilerOptions36.setAggressiveVarCheck(checkLevel59);
        compilerOptions31.setCheckUnreachableCode(checkLevel59);
        com.google.javascript.jscomp.SourceMap.Format format63 = compilerOptions31.sourceMapFormat;
        compilerOptions0.setSourceMapFormat(format63);
        compilerOptions0.setRemoveUnusedVars(true);
        java.lang.String str67 = compilerOptions0.renamePrefixNamespace;
        compilerOptions0.setTweakToNumberLiteral("SHNE 46 [jsdoc_info: JSDocInfo]", 7);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy3 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy3.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(detailLevel14);
        org.junit.Assert.assertTrue("'" + checkLevel25 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel25.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel30 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel30.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + tracerMode34 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode34.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(detailLevel40);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(detailLevel48);
        org.junit.Assert.assertTrue("'" + checkLevel59 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel59.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(format63);
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str3 = charset2.name();
        java.lang.String str4 = charset2.name();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = com.google.javascript.jscomp.JSSourceFile.fromFile("STRING PARAM_LIST 49: hi!", charset2);
        java.lang.String str6 = charset2.displayName();
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromFile("DiagnosticGroup<java.io.IOException: OFF>", charset2);
        java.nio.charset.CharsetEncoder charsetEncoder8 = charset2.newEncoder();
        java.io.PrintStream printStream10 = new java.io.PrintStream("goog.abstractMethod");
        printStream10.print(39L);
        printStream10.println((double) 280491266048L);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions15.crossModuleMethodMotion = true;
        compilerOptions15.optimizeParameters = true;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy20 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions21.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy24 = compilerOptions21.propertyRenaming;
        compilerOptions15.setRenamingPolicy(variableRenamingPolicy20, propertyRenamingPolicy24);
        compilerOptions15.setTransformAMDToCJSModules(true);
        boolean boolean28 = compilerOptions15.exportTestFunctions;
        boolean boolean29 = compilerOptions15.exportTestFunctions;
        boolean boolean30 = compilerOptions15.foldConstants;
        byte[] byteArray31 = new byte[] {};
        compilerOptions15.setInputVariableMapSerialized(byteArray31);
        printStream10.write(byteArray31);
        printStream10.println(1645456230000L);
        java.nio.charset.Charset charset36 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str37 = charset36.name();
        java.lang.String str38 = charset36.name();
        java.nio.charset.Charset charset39 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str40 = charset39.toString();
        boolean boolean41 = charset36.contains(charset39);
        java.lang.String str42 = charset36.name();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        jSTypeRegistry44.clearNamedTypes();
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry44.createAnonymousObjectType();
        boolean boolean47 = charset36.equals((java.lang.Object) objectType46);
        java.nio.charset.Charset charset48 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str49 = charset48.name();
        java.lang.String str50 = charset48.name();
        java.nio.charset.Charset charset51 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str52 = charset51.toString();
        boolean boolean53 = charset48.contains(charset51);
        java.nio.charset.CharsetEncoder charsetEncoder54 = charset51.newEncoder();
        java.io.File file57 = new java.io.File(":", "hi!");
        boolean boolean60 = file57.setExecutable(false, false);
        java.io.File file61 = file57.getParentFile();
        long long62 = file61.getUsableSpace();
        boolean boolean63 = file61.mkdirs();
        java.nio.charset.Charset charset64 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile65 = com.google.javascript.jscomp.JSSourceFile.fromFile(file61, charset64);
        java.io.File file68 = new java.io.File(":", "hi!");
        boolean boolean71 = file68.setExecutable(true, false);
        boolean boolean73 = file68.setWritable(false);
        boolean boolean74 = file68.canWrite();
        java.net.URI uRI75 = file68.toURI();
        boolean boolean76 = file61.renameTo(file68);
        java.nio.charset.Charset charset77 = java.nio.charset.Charset.defaultCharset();
        com.google.javascript.jscomp.SourceFile sourceFile78 = com.google.javascript.jscomp.SourceFile.fromFile(file61, charset77);
        java.lang.String str79 = charset77.displayName();
        boolean boolean80 = charset51.contains(charset77);
        java.nio.charset.CharsetDecoder charsetDecoder81 = charset77.newDecoder();
        java.nio.ByteBuffer byteBuffer83 = charset77.encode("Unversioned directory");
        java.nio.CharBuffer charBuffer84 = charset36.decode(byteBuffer83);
        java.io.PrintStream printStream85 = printStream10.append((java.lang.CharSequence) charBuffer84);
        java.nio.ByteBuffer byteBuffer86 = charset2.encode(charBuffer84);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "US-ASCII" + "'", str3, "US-ASCII");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "US-ASCII" + "'", str4, "US-ASCII");
        org.junit.Assert.assertNotNull(jSSourceFile5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "US-ASCII" + "'", str6, "US-ASCII");
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertNotNull(charsetEncoder8);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy24 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy24.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(charset36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "US-ASCII" + "'", str37, "US-ASCII");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "US-ASCII" + "'", str38, "US-ASCII");
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "US-ASCII" + "'", str40, "US-ASCII");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "US-ASCII" + "'", str42, "US-ASCII");
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "US-ASCII" + "'", str49, "US-ASCII");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "US-ASCII" + "'", str50, "US-ASCII");
        org.junit.Assert.assertNotNull(charset51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "US-ASCII" + "'", str52, "US-ASCII");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(charsetEncoder54);
        org.junit.Assert.assertEquals(file57.getParent(), ":");
        org.junit.Assert.assertEquals(file57.toString(), ":/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(file61);
        org.junit.Assert.assertNull("file61.getParent() == null", file61.getParent());
        org.junit.Assert.assertEquals(file61.toString(), ":");
// flaky:         org.junit.Assert.assertTrue("'" + long62 + "' != '" + 280491261952L + "'", long62 == 280491261952L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jSSourceFile65);
        org.junit.Assert.assertEquals(file68.getParent(), ":");
        org.junit.Assert.assertEquals(file68.toString(), ":/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(uRI75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(charset77);
        org.junit.Assert.assertNotNull(sourceFile78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "US-ASCII" + "'", str79, "US-ASCII");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(charsetDecoder81);
        org.junit.Assert.assertNotNull(byteBuffer83);
        org.junit.Assert.assertNotNull(charBuffer84);
        org.junit.Assert.assertNotNull(printStream85);
        org.junit.Assert.assertNotNull(byteBuffer86);
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable7 = jSTypeRegistry1.getTypesWithProperty("");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry1.getNativeFunctionType(jSTypeNative8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeIterable7);
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        com.google.javascript.jscomp.PerformanceTracker.Stats stats1 = new com.google.javascript.jscomp.PerformanceTracker.Stats("Unversioned directory");
        int int2 = stats1.gzDiff;
        stats1.gzDiff = (short) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        java.io.File file2 = new java.io.File(":", "hi!");
        boolean boolean5 = file2.setExecutable(true, false);
        boolean boolean7 = file2.setWritable(false);
        boolean boolean8 = file2.exists();
        java.lang.String str9 = file2.getName();
        java.nio.file.Path path10 = file2.toPath();
        long long11 = file2.lastModified();
        java.lang.String str12 = file2.getName();
        org.junit.Assert.assertEquals(file2.getParent(), ":");
        org.junit.Assert.assertEquals(file2.toString(), ":/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(path10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 280489385000L + "'", long11 == 280489385000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setReplaceStringsPlaceholderToken("hi!");
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel3 = com.google.javascript.jscomp.SourceMap.DetailLevel.SYMBOLS;
        compilerOptions0.setSourceMapDetailLevel(detailLevel3);
        boolean boolean5 = compilerOptions0.ideMode;
        com.google.javascript.jscomp.CheckLevel checkLevel6 = compilerOptions0.checkMissingGetCssNameLevel;
        compilerOptions0.setDefineToDoubleLiteral("PARAM_LIST [var_args_name: 1] [opt_arg: 1]", (-1.0d));
        org.junit.Assert.assertNotNull(detailLevel3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + checkLevel6 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel6.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setReplaceStringsPlaceholderToken("hi!");
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel3 = com.google.javascript.jscomp.SourceMap.DetailLevel.SYMBOLS;
        compilerOptions0.setSourceMapDetailLevel(detailLevel3);
        compilerOptions0.inlineFunctions = true;
        compilerOptions0.setCommonJSModulePathPrefix(":");
        compilerOptions0.setCrossModuleCodeMotion(true);
        compilerOptions0.setRemoveUnusedClassProperties(true);
        compilerOptions0.setRenamePrefix(":");
        java.lang.String str15 = compilerOptions0.checkMissingGetCssNameBlacklist;
        boolean boolean16 = compilerOptions0.recordFunctionInformation;
        org.junit.Assert.assertNotNull(detailLevel3);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile sourceFile4 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int6 = sourceFile4.getLineOfOffset((int) (short) 1);
        java.io.Reader reader7 = sourceFile4.getCodeReader();
        int int8 = reader7.read();
        com.google.javascript.jscomp.SourceFile sourceFile9 = builder0.buildFromReader("*global*", reader7);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder11 = builder0.withCharset(charset10);
        com.google.javascript.jscomp.SourceFile sourceFile13 = builder11.buildFromFile("java.io.IOException: sun.util.logging.resources.logging");
        java.io.File file16 = new java.io.File(":", "hi!");
        boolean boolean19 = file16.setExecutable(false, false);
        java.io.File file20 = file16.getParentFile();
        long long21 = file20.getUsableSpace();
        boolean boolean22 = file20.mkdirs();
        java.io.File file23 = file20.getParentFile();
        com.google.javascript.jscomp.SourceFile sourceFile24 = builder11.buildFromFile(file20);
        file20.deleteOnExit();
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertEquals(file16.getParent(), ":");
        org.junit.Assert.assertEquals(file16.toString(), ":/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(file20);
        org.junit.Assert.assertNull("file20.getParent() == null", file20.getParent());
        org.junit.Assert.assertEquals(file20.toString(), ":");
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 280491810816L + "'", long21 == 280491810816L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNotNull(sourceFile24);
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping2 = new com.google.javascript.jscomp.SourceMap.LocationMapping("/tmp/PARAM_LIST6145687020670090410Unversioned directory", "Exceeded max number of code motion iterations: {0}");
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy3 = compilerOptions0.propertyRenaming;
        boolean boolean4 = compilerOptions0.disambiguateProperties;
        compilerOptions0.setFoldConstants(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode8 = null;
        compilerOptions7.setTracerMode(tracerMode8);
        boolean boolean10 = compilerOptions7.generatePseudoNames;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray11 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList12 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList12, locationMappingArray11);
        compilerOptions7.sourceMapLocationMappings = locationMappingList12;
        compilerOptions0.sourceMapLocationMappings = locationMappingList12;
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode17 = null;
        compilerOptions16.setTracerMode(tracerMode17);
        boolean boolean19 = compilerOptions16.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel20 = compilerOptions16.sourceMapDetailLevel;
        compilerOptions16.setColorizeErrorOutput(true);
        java.util.Set<java.lang.String> strSet23 = compilerOptions16.stripNameSuffixes;
        com.google.javascript.jscomp.SourceFile sourceFile25 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput27 = new com.google.javascript.jscomp.CompilerInput(sourceFile25, true);
        com.google.javascript.rhino.InputId inputId29 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput31 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput27, inputId29, true);
        java.lang.String str32 = compilerInput31.toString();
        boolean boolean33 = strSet23.contains((java.lang.Object) compilerInput31);
        compilerOptions0.setStripNamePrefixes(strSet23);
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions35.setReplaceStringsPlaceholderToken("hi!");
        compilerOptions35.setTweakToDoubleLiteral("", (double) (short) 1);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode41 = com.google.javascript.jscomp.CompilerOptions.TracerMode.RAW_SIZE;
        compilerOptions35.setTracer(tracerMode41);
        compilerOptions35.setSyntheticBlockStartMarker("");
        java.util.Set<java.lang.String> strSet45 = compilerOptions35.stripNameSuffixes;
        compilerOptions0.setExtraAnnotationNames(strSet45);
        compilerOptions0.setMarkNoSideEffectCalls(true);
        compilerOptions0.setReserveRawExports(true);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy3 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy3.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locationMappingArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(detailLevel20);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "*global*" + "'", str32, "*global*");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + tracerMode41 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.RAW_SIZE + "'", tracerMode41.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.RAW_SIZE));
        org.junit.Assert.assertNotNull(strSet45);
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        boolean boolean6 = node5.isIn();
        boolean boolean7 = node5.isGetElem();
        boolean boolean8 = node5.isIn();
        com.google.javascript.rhino.Node node9 = node5.getLastSibling();
        boolean boolean10 = node5.isCatch();
        boolean boolean11 = node5.isCatch();
        boolean boolean12 = node5.isGetterDef();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList4 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList4, jSTypeArray3);
        com.google.javascript.rhino.Node node6 = jSTypeRegistry2.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList4);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        node6.addChildrenToBack(node12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        boolean boolean20 = node19.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean27 = node26.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList31 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList31, jSTypeArray30);
        com.google.javascript.rhino.Node node33 = jSTypeRegistry29.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList31);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 0, node6, node19, node26, node33, 0, 49);
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = null;
        node19.setJSDocInfo(jSDocInfo37);
        com.google.javascript.rhino.Node node39 = node19.cloneNode();
        boolean boolean40 = node19.isReturn();
        boolean boolean41 = node19.isTrue();
        boolean boolean42 = node19.isNoSideEffectsCall();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        boolean boolean3 = compilerOptions0.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel4 = compilerOptions0.sourceMapDetailLevel;
        compilerOptions0.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compilerOptions0.cssRenamingMap;
        compilerOptions0.setNameReferenceGraphPath("DiagnosticGroup<checkProvides>");
        compilerOptions0.enableExternExports(false);
        compilerOptions0.inlineFunctions = false;
        com.google.javascript.jscomp.CheckLevel checkLevel14 = compilerOptions0.reportMissingOverride;
        compilerOptions0.setAliasAllStrings(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(detailLevel4);
        org.junit.Assert.assertNull(cssRenamingMap7);
        org.junit.Assert.assertTrue("'" + checkLevel14 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel14.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setReplaceStringsPlaceholderToken("hi!");
        compilerOptions0.setTweakToDoubleLiteral("", (double) (short) 1);
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = null;
        compilerOptions0.setLanguageOut(languageMode6);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy8 = null;
        compilerOptions0.variableRenaming = variableRenamingPolicy8;
        com.google.javascript.jscomp.CheckLevel checkLevel10 = compilerOptions0.checkUnreachableCode;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode11 = compilerOptions0.getLanguageOut();
        boolean boolean12 = compilerOptions0.moveFunctionDeclarations;
        byte[] byteArray13 = null;
        compilerOptions0.inputPropertyMapSerialized = byteArray13;
        compilerOptions0.locale = ":/hi!";
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList22 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList22, jSTypeArray21);
        com.google.javascript.rhino.Node node24 = jSTypeRegistry20.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList22);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList28 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList28, jSTypeArray27);
        com.google.javascript.rhino.Node node30 = jSTypeRegistry26.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList28);
        com.google.javascript.rhino.jstype.JSType jSType35 = jSTypeRegistry26.createNamedType(":", "", (int) (byte) 1, 48);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList39 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList39, jSTypeArray38);
        com.google.javascript.rhino.Node node41 = jSTypeRegistry37.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        com.google.javascript.rhino.jstype.JSType jSType46 = jSTypeRegistry37.createNamedType(":", "", (int) (byte) 1, 48);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] { jSType46 };
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry20.createConstructorTypeWithVarArgs(jSType35, jSTypeArray47);
        boolean boolean50 = jSTypeRegistry18.canPropertyBeDefined(jSType35, "");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = jSTypeRegistry18.getEachReferenceTypeWithProperty("/");
        java.lang.String[] strArray57 = new java.lang.String[] { "Unversioned directory", "/experiment/:/hi!", ":", "OFF" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        jSTypeRegistry18.setTemplateTypeNames((java.util.List<java.lang.String>) strList58);
        compilerOptions0.setManageClosureDependencies((java.util.List<java.lang.String>) strList58);
        compilerOptions0.setGroupVariableDeclarations(true);
        compilerOptions0.setRecordFunctionInformation(false);
        compilerOptions0.aliasAllStrings = false;
        compilerOptions0.setManageClosureDependencies(false);
        java.lang.String str70 = compilerOptions0.syntheticBlockStartMarker;
        org.junit.Assert.assertTrue("'" + checkLevel10 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel10.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(languageMode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(jSType35);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.optimizeParameters = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions5.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy8 = compilerOptions5.propertyRenaming;
        java.lang.String[] strArray11 = new java.lang.String[] { "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        compilerOptions5.setStripTypes((java.util.Set<java.lang.String>) strSet12);
        compilerOptions0.stripNamePrefixes = strSet12;
        java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList16 = compilerOptions0.sourceMapLocationMappings;
        com.google.javascript.jscomp.CheckLevel checkLevel17 = compilerOptions0.checkMissingReturn;
        java.lang.String str18 = compilerOptions0.checkMissingGetCssNameBlacklist;
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy8 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy8.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(locationMappingList16);
        org.junit.Assert.assertTrue("'" + checkLevel17 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel17.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        com.google.javascript.jscomp.SourceFile.Builder builder2 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int8 = sourceFile6.getLineOfOffset((int) (short) 1);
        java.io.Reader reader9 = sourceFile6.getCodeReader();
        int int10 = reader9.read();
        com.google.javascript.jscomp.SourceFile sourceFile11 = builder2.buildFromReader("*global*", reader9);
        reader9.reset();
        boolean boolean13 = reader9.markSupported();
        long long15 = reader9.skip(1645456104000L);
        com.google.javascript.jscomp.SourceFile sourceFile16 = com.google.javascript.jscomp.SourceFile.fromReader("java.io.IOException: OFF", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromReader("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ", reader9);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(sourceFile16);
        org.junit.Assert.assertNotNull(sourceFile17);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy3 = compilerOptions0.propertyRenaming;
        boolean boolean4 = compilerOptions0.disambiguateProperties;
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions7.crossModuleMethodMotion = true;
        compilerOptions7.optimizeParameters = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy15 = compilerOptions12.propertyRenaming;
        java.lang.String[] strArray18 = new java.lang.String[] { "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        compilerOptions12.setStripTypes((java.util.Set<java.lang.String>) strSet19);
        compilerOptions7.stripNamePrefixes = strSet19;
        compilerOptions7.checkTypes = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions25.setReplaceStringsPlaceholderToken("hi!");
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel28 = com.google.javascript.jscomp.SourceMap.DetailLevel.SYMBOLS;
        compilerOptions25.setSourceMapDetailLevel(detailLevel28);
        boolean boolean30 = compilerOptions25.ideMode;
        compilerOptions25.renamePrefix = "hi!";
        boolean boolean33 = compilerOptions25.inlineConstantVars;
        com.google.javascript.jscomp.CompilerOptions.Reach reach34 = com.google.javascript.jscomp.CompilerOptions.Reach.LOCAL_ONLY;
        compilerOptions25.setInlineVariables(reach34);
        compilerOptions7.setRemoveUnusedVariable(reach34);
        compilerOptions0.setRemoveUnusedVariables(reach34);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy3 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy3.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy15 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy15.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(detailLevel28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + reach34 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.LOCAL_ONLY + "'", reach34.equals(com.google.javascript.jscomp.CompilerOptions.Reach.LOCAL_ONLY));
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.TYPE_INVALIDATION;
        com.google.javascript.jscomp.DiagnosticGroups.TWEAKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile sourceFile4 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int6 = sourceFile4.getLineOfOffset((int) (short) 1);
        java.io.Reader reader7 = sourceFile4.getCodeReader();
        int int8 = reader7.read();
        com.google.javascript.jscomp.SourceFile sourceFile9 = builder0.buildFromReader("*global*", reader7);
        java.io.File file12 = new java.io.File(":", "hi!");
        boolean boolean15 = file12.setExecutable(false, false);
        java.io.File file16 = file12.getParentFile();
        long long17 = file16.getUsableSpace();
        boolean boolean18 = file16.mkdirs();
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile20 = com.google.javascript.jscomp.JSSourceFile.fromFile(file16, charset19);
        boolean boolean21 = file16.canExecute();
        com.google.javascript.jscomp.SourceFile sourceFile22 = builder0.buildFromFile(file16);
        java.io.File file25 = new java.io.File(":", "hi!");
        boolean boolean28 = file25.setExecutable(true, false);
        long long29 = file25.lastModified();
        boolean boolean30 = file25.mkdir();
        java.lang.String str31 = file25.getCanonicalPath();
        java.lang.String str32 = file25.getCanonicalPath();
        com.google.javascript.jscomp.SourceFile sourceFile33 = builder0.buildFromFile(file25);
        com.google.javascript.jscomp.SourceFile sourceFile36 = builder0.buildFromCode("WARNING: hi!", "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ");
        com.google.javascript.jscomp.SourceFile.Generator generator38 = null;
        com.google.javascript.jscomp.SourceFile sourceFile39 = builder0.buildFromGenerator("/experiment/:/OFF4758658444940475831", generator38);
        sourceFile39.clearCachedSource();
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals(file12.getParent(), ":");
        org.junit.Assert.assertEquals(file12.toString(), ":/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertNull("file16.getParent() == null", file16.getParent());
        org.junit.Assert.assertEquals(file16.toString(), ":");
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 280489943040L + "'", long17 == 280489943040L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSSourceFile20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(sourceFile22);
        org.junit.Assert.assertEquals(file25.getParent(), ":");
        org.junit.Assert.assertEquals(file25.toString(), ":/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 280489385000L + "'", long29 == 280489385000L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "/experiment/:/hi!" + "'", str31, "/experiment/:/hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "/experiment/:/hi!" + "'", str32, "/experiment/:/hi!");
        org.junit.Assert.assertNotNull(sourceFile33);
        org.junit.Assert.assertNotNull(sourceFile36);
        org.junit.Assert.assertNotNull(sourceFile39);
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("java.io.IOException: ", 43, (int) '#');
        com.google.javascript.rhino.InputId inputId4 = node3.getInputId();
        boolean boolean5 = node3.isVar();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList9 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList9, jSTypeArray8);
        com.google.javascript.rhino.Node node11 = jSTypeRegistry7.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList9);
        boolean boolean12 = node11.isIn();
        boolean boolean13 = node11.isVoid();
        node11.setOptionalArg(true);
        node11.setVarArgs(true);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = node11.getJSDocInfo();
        boolean boolean19 = node11.isDebugger();
        boolean boolean20 = node11.isWhile();
        com.google.javascript.rhino.Node node21 = node3.copyInformationFrom(node11);
        node3.setType((-25));
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(inputId4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSDocInfo18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.optimizeParameters = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions5.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy8 = compilerOptions5.propertyRenaming;
        java.lang.String[] strArray11 = new java.lang.String[] { "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        compilerOptions5.setStripTypes((java.util.Set<java.lang.String>) strSet12);
        compilerOptions0.stripNamePrefixes = strSet12;
        compilerOptions0.checkTypes = false;
        compilerOptions0.flowSensitiveInlineVariables = false;
        compilerOptions0.setChainCalls(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions22.crossModuleMethodMotion = true;
        compilerOptions22.skipAllCompilerPasses();
        compilerOptions22.resetWarningsGuard();
        compilerOptions22.setInlineLocalVariables(false);
        compilerOptions22.coalesceVariableNames = true;
        com.google.javascript.jscomp.CheckLevel checkLevel31 = compilerOptions22.aggressiveVarCheck;
        compilerOptions0.checkMissingReturn = checkLevel31;
        compilerOptions0.setChainCalls(false);
        compilerOptions0.setAliasAllStrings(false);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy8 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy8.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + checkLevel31 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel31.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setReplaceStringsPlaceholderToken("hi!");
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel3 = com.google.javascript.jscomp.SourceMap.DetailLevel.SYMBOLS;
        compilerOptions0.setSourceMapDetailLevel(detailLevel3);
        compilerOptions0.inlineFunctions = true;
        compilerOptions0.setCommonJSModulePathPrefix(":");
        compilerOptions0.setCrossModuleCodeMotion(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions11.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy14 = compilerOptions11.propertyRenaming;
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap15 = compilerOptions11.getTweakReplacements();
        boolean boolean16 = strMap15.isEmpty();
        java.lang.Object obj17 = null;
        com.google.javascript.rhino.Node node18 = strMap15.get(obj17);
        java.util.Set<java.lang.String> strSet19 = strMap15.keySet();
        compilerOptions0.setIdGenerators(strSet19);
        com.google.javascript.jscomp.CompilerOptions.Reach reach21 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setRemoveUnusedVariable(reach21);
        java.lang.String[] strArray33 = new java.lang.String[] { "InputId: *global*", "OFF", "*global*.  at *global* line (unknown line) : (unknown column)", "PARAM_LIST\n", "/", "*global*.  at *global* line (unknown line) : (unknown column)", "hi!", "/experiment/:/hi!", "PARAM_LIST" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        compilerOptions0.setReplaceStringsConfiguration("FINEST", (java.util.List<java.lang.String>) strList34);
        compilerOptions0.setCrossModuleCodeMotion(false);
        compilerOptions0.inlineGetters = false;
        compilerOptions0.setDefineToNumberLiteral("*global*.  at *global* line (unknown line) : (unknown column)", 32);
        boolean boolean44 = compilerOptions0.recordFunctionInformation;
        compilerOptions0.setRemoveUnusedPrototypePropertiesInExterns(false);
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler47 = compilerOptions0.getAliasTransformationHandler();
        org.junit.Assert.assertNotNull(detailLevel3);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy14 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy14.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + reach21 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach21.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(aliasTransformationHandler47);
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CheckLevel checkLevel1 = compilerOptions0.checkRequires;
        compilerOptions0.setOutputJsStringUsage(true);
        java.util.Set<java.lang.String> strSet4 = compilerOptions0.stripNamePrefixes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions5.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy8 = compilerOptions5.propertyRenaming;
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap9 = compilerOptions5.getTweakReplacements();
        boolean boolean10 = strMap9.isEmpty();
        java.util.Set<java.util.Map.Entry<java.lang.String, com.google.javascript.rhino.Node>> strEntrySet11 = strMap9.entrySet();
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing12 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setInlineLocalFunctions(false);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy16 = null;
        compilerOptions13.variableRenaming = variableRenamingPolicy16;
        compilerOptions13.setProtectHiddenSideEffects(false);
        boolean boolean20 = strMap9.remove((java.lang.Object) tweakProcessing12, (java.lang.Object) false);
        compilerOptions0.setTweakProcessing(tweakProcessing12);
        boolean boolean22 = compilerOptions0.inlineVariables;
        org.junit.Assert.assertTrue("'" + checkLevel1 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel1.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy8 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy8.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strEntrySet11);
        org.junit.Assert.assertTrue("'" + tweakProcessing12 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP + "'", tweakProcessing12.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.optimizeParameters = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions5.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy8 = compilerOptions5.propertyRenaming;
        java.lang.String[] strArray11 = new java.lang.String[] { "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        compilerOptions5.setStripTypes((java.util.Set<java.lang.String>) strSet12);
        compilerOptions0.stripNamePrefixes = strSet12;
        compilerOptions0.checkTypes = false;
        compilerOptions0.flowSensitiveInlineVariables = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.crossModuleMethodMotion = true;
        compilerOptions20.skipAllCompilerPasses();
        compilerOptions20.resetWarningsGuard();
        compilerOptions20.setInlineLocalVariables(false);
        compilerOptions20.coalesceVariableNames = true;
        com.google.javascript.jscomp.CheckLevel checkLevel29 = compilerOptions20.aggressiveVarCheck;
        compilerOptions0.checkMissingReturn = checkLevel29;
        compilerOptions0.setDefineToBooleanLiteral("PARAM_LIST [var_args_name: 1] [opt_arg: 1]", false);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy8 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy8.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + checkLevel29 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel29.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        java.io.File file2 = new java.io.File(":", "hi!");
        boolean boolean5 = file2.setExecutable(false, false);
        java.io.File file6 = file2.getParentFile();
        long long7 = file6.getUsableSpace();
        boolean boolean8 = file6.mkdirs();
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = com.google.javascript.jscomp.JSSourceFile.fromFile(file6, charset9);
        java.io.File file13 = new java.io.File(":", "hi!");
        boolean boolean16 = file13.setExecutable(true, false);
        boolean boolean18 = file13.setWritable(false);
        boolean boolean19 = file13.canWrite();
        java.net.URI uRI20 = file13.toURI();
        boolean boolean21 = file6.renameTo(file13);
        long long22 = file13.getFreeSpace();
        boolean boolean23 = file13.exists();
        java.io.File file25 = new java.io.File(file13, "/");
        long long26 = file13.lastModified();
        org.junit.Assert.assertEquals(file2.getParent(), ":");
        org.junit.Assert.assertEquals(file2.toString(), ":/hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), ":");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 280489324544L + "'", long7 == 280489324544L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSSourceFile10);
        org.junit.Assert.assertEquals(file13.getParent(), ":");
        org.junit.Assert.assertEquals(file13.toString(), ":/hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(uRI20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 299088441344L + "'", long22 == 299088441344L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals(file25.getParent(), ":/hi!");
        org.junit.Assert.assertEquals(file25.toString(), ":/hi!/");
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 280489385000L + "'", long26 == 280489385000L);
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        boolean boolean3 = compilerOptions0.generatePseudoNames;
        boolean boolean4 = compilerOptions0.removeUnusedClassProperties;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setInlineLocalFunctions(false);
        java.util.Set<java.lang.String> strSet9 = compilerOptions6.stripNameSuffixes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.crossModuleMethodMotion = true;
        compilerOptions10.optimizeParameters = true;
        compilerOptions10.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel18 = compilerOptions10.checkGlobalNamesLevel;
        compilerOptions6.checkRequires = checkLevel18;
        compilerOptions6.prettyPrint = false;
        boolean boolean22 = compilerOptions6.shouldColorizeErrorOutput();
        com.google.javascript.jscomp.CheckLevel checkLevel23 = compilerOptions6.aggressiveVarCheck;
        com.google.javascript.jscomp.DiagnosticType diagnosticType25 = com.google.javascript.jscomp.DiagnosticType.make("DiagnosticGroup<java.io.IOException: OFF>", checkLevel23, "goog.exportProperty");
        compilerOptions0.checkGlobalThisLevel = checkLevel23;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + checkLevel18 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel18.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + checkLevel23 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel23.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(diagnosticType25);
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str1 = charset0.name();
        java.lang.String str2 = charset0.name();
        java.nio.charset.Charset charset3 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str4 = charset3.toString();
        boolean boolean5 = charset0.contains(charset3);
        java.nio.charset.CharsetEncoder charsetEncoder6 = charset3.newEncoder();
        java.lang.String str7 = charset3.toString();
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "US-ASCII" + "'", str1, "US-ASCII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "US-ASCII" + "'", str2, "US-ASCII");
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "US-ASCII" + "'", str4, "US-ASCII");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "US-ASCII" + "'", str7, "US-ASCII");
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        java.io.File file2 = new java.io.File(":", "hi!");
        java.nio.charset.Charset charset4 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str5 = charset4.name();
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromFile("/experiment/:", charset4);
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromFile(file2, charset4);
        java.nio.file.Path path8 = file2.toPath();
        org.junit.Assert.assertEquals(file2.getParent(), ":");
        org.junit.Assert.assertEquals(file2.toString(), ":/hi!");
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "US-ASCII" + "'", str5, "US-ASCII");
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertNotNull(path8);
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setReplaceStringsPlaceholderToken("hi!");
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel3 = com.google.javascript.jscomp.SourceMap.DetailLevel.SYMBOLS;
        compilerOptions0.setSourceMapDetailLevel(detailLevel3);
        compilerOptions0.inlineFunctions = true;
        compilerOptions0.setCommonJSModulePathPrefix(":");
        compilerOptions0.setCrossModuleCodeMotion(true);
        compilerOptions0.setInlineLocalVariables(true);
        compilerOptions0.setNameReferenceReportPath("2019/07/12 07:12");
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap15 = compilerOptions0.getDefineReplacements();
        strMap15.clear();
        java.lang.Object obj18 = null;
        boolean boolean19 = strMap15.remove((java.lang.Object) 280490172416L, obj18);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode21 = null;
        compilerOptions20.setTracerMode(tracerMode21);
        boolean boolean23 = compilerOptions20.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel24 = compilerOptions20.sourceMapDetailLevel;
        compilerOptions20.optimizeArgumentsArray = false;
        compilerOptions20.setAliasableGlobals("STRING PARAM_LIST 49");
        boolean boolean29 = compilerOptions20.aliasAllStrings;
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing30 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK;
        boolean boolean31 = tweakProcessing30.shouldStrip();
        compilerOptions20.setTweakProcessing(tweakProcessing30);
        boolean boolean33 = compilerOptions20.reserveRawExports;
        compilerOptions20.setMarkNoSideEffectCalls(false);
        compilerOptions20.setCrossModuleMethodMotion(true);
        boolean boolean38 = compilerOptions20.aliasAllStrings;
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions39.crossModuleMethodMotion = true;
        compilerOptions39.setUnaliasableGlobals("sun.util.logging.resources.logging");
        com.google.javascript.jscomp.CheckLevel checkLevel44 = com.google.javascript.jscomp.CheckLevel.ERROR;
        compilerOptions39.setCheckGlobalThisLevel(checkLevel44);
        compilerOptions20.checkGlobalNamesLevel = checkLevel44;
        boolean boolean47 = strMap15.containsValue((java.lang.Object) checkLevel44);
        org.junit.Assert.assertNotNull(detailLevel3);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(detailLevel24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + tweakProcessing30 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK + "'", tweakProcessing30.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + checkLevel44 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel44.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy3 = compilerOptions0.propertyRenaming;
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap4 = compilerOptions0.getTweakReplacements();
        boolean boolean5 = strMap4.isEmpty();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy9 = compilerOptions6.propertyRenaming;
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap10 = compilerOptions6.getTweakReplacements();
        boolean boolean11 = strMap10.isEmpty();
        strMap10.clear();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList16 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList16, jSTypeArray15);
        com.google.javascript.rhino.Node node18 = jSTypeRegistry14.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList16);
        boolean boolean19 = node18.isIn();
        boolean boolean20 = strMap10.containsValue((java.lang.Object) node18);
        boolean boolean21 = strMap4.containsKey((java.lang.Object) strMap10);
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList27 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList27, jSTypeArray26);
        com.google.javascript.rhino.Node node29 = jSTypeRegistry25.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList27);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList33 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList33, jSTypeArray32);
        com.google.javascript.rhino.Node node35 = jSTypeRegistry31.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList33);
        node29.addChildrenToBack(node35);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList40 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList40, jSTypeArray39);
        com.google.javascript.rhino.Node node42 = jSTypeRegistry38.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList40);
        boolean boolean43 = node42.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList47 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList47, jSTypeArray46);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry45.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        boolean boolean50 = node49.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList54 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList54, jSTypeArray53);
        com.google.javascript.rhino.Node node56 = jSTypeRegistry52.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList54);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (short) 0, node29, node42, node49, node56, 0, 49);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList63 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList63, jSTypeArray62);
        com.google.javascript.rhino.Node node65 = jSTypeRegistry61.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList63);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray68 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList69 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList69, jSTypeArray68);
        com.google.javascript.rhino.Node node71 = jSTypeRegistry67.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList69);
        node65.addChildrenToBack(node71);
        com.google.javascript.rhino.Node node73 = node29.clonePropsFrom(node71);
        java.util.Set<java.lang.String> strSet74 = node73.getDirectives();
        com.google.javascript.rhino.Node node75 = strMap4.replace("sun.util.logging.resources.logging", node73);
        com.google.javascript.jscomp.CompilerOptions compilerOptions76 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions76.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode79 = com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF;
        compilerOptions76.setTracer(tracerMode79);
        compilerOptions76.setFoldConstants(true);
        compilerOptions76.flowSensitiveInlineVariables = true;
        compilerOptions76.ambiguateProperties = false;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel87 = compilerOptions76.sourceMapDetailLevel;
        boolean boolean88 = strMap4.containsValue((java.lang.Object) compilerOptions76);
        boolean boolean89 = strMap4.isEmpty();
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy3 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy3.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy9 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy9.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(jSTypeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNull(strSet74);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertTrue("'" + tracerMode79 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode79.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertNotNull(detailLevel87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        boolean boolean3 = compilerOptions0.coalesceVariableNames;
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions4.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode7 = com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF;
        compilerOptions4.setTracer(tracerMode7);
        compilerOptions4.setFoldConstants(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode12 = null;
        compilerOptions11.setTracerMode(tracerMode12);
        boolean boolean14 = compilerOptions11.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel15 = compilerOptions11.sourceMapDetailLevel;
        compilerOptions11.setColorizeErrorOutput(true);
        compilerOptions11.collapseProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy23 = compilerOptions20.propertyRenaming;
        compilerOptions11.propertyRenaming = propertyRenamingPolicy23;
        com.google.javascript.jscomp.CheckLevel checkLevel25 = compilerOptions11.brokenClosureRequiresLevel;
        com.google.javascript.jscomp.CheckLevel checkLevel26 = compilerOptions11.checkRequires;
        compilerOptions4.reportMissingOverride = checkLevel26;
        compilerOptions0.setAggressiveVarCheck(checkLevel26);
        compilerOptions0.setReplaceIdGenerators(true);
        compilerOptions0.setOptimizeParameters(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions33.setLooseTypes(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = new com.google.javascript.jscomp.CompilerOptions();
        java.lang.String str37 = compilerOptions36.syntheticBlockStartMarker;
        compilerOptions36.labelRenaming = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions40.crossModuleMethodMotion = true;
        compilerOptions40.setProtectHiddenSideEffects(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions45.crossModuleMethodMotion = true;
        compilerOptions45.skipAllCompilerPasses();
        compilerOptions45.resetWarningsGuard();
        java.lang.String str50 = compilerOptions45.aliasStringsBlacklist;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy51 = com.google.javascript.jscomp.VariableRenamingPolicy.LOCAL;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy52 = null;
        compilerOptions45.setRenamingPolicy(variableRenamingPolicy51, propertyRenamingPolicy52);
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions54.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy57 = compilerOptions54.propertyRenaming;
        compilerOptions40.setRenamingPolicy(variableRenamingPolicy51, propertyRenamingPolicy57);
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy59 = com.google.javascript.jscomp.PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC;
        compilerOptions36.setRenamingPolicy(variableRenamingPolicy51, propertyRenamingPolicy59);
        com.google.javascript.jscomp.CompilerOptions compilerOptions61 = new com.google.javascript.jscomp.CompilerOptions();
        java.lang.String str62 = compilerOptions61.syntheticBlockStartMarker;
        compilerOptions61.labelRenaming = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions65 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions65.crossModuleMethodMotion = true;
        compilerOptions65.setProtectHiddenSideEffects(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions70 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions70.crossModuleMethodMotion = true;
        compilerOptions70.skipAllCompilerPasses();
        compilerOptions70.resetWarningsGuard();
        java.lang.String str75 = compilerOptions70.aliasStringsBlacklist;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy76 = com.google.javascript.jscomp.VariableRenamingPolicy.LOCAL;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy77 = null;
        compilerOptions70.setRenamingPolicy(variableRenamingPolicy76, propertyRenamingPolicy77);
        com.google.javascript.jscomp.CompilerOptions compilerOptions79 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions79.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy82 = compilerOptions79.propertyRenaming;
        compilerOptions65.setRenamingPolicy(variableRenamingPolicy76, propertyRenamingPolicy82);
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy84 = com.google.javascript.jscomp.PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC;
        compilerOptions61.setRenamingPolicy(variableRenamingPolicy76, propertyRenamingPolicy84);
        compilerOptions33.setRenamingPolicy(variableRenamingPolicy51, propertyRenamingPolicy84);
        compilerOptions0.propertyRenaming = propertyRenamingPolicy84;
        boolean boolean88 = compilerOptions0.assumeStrictThis();
        compilerOptions0.optimizeArgumentsArray = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tracerMode7 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode7.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(detailLevel15);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy23 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy23.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel25 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel25.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertTrue("'" + checkLevel26 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel26.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy51 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.LOCAL + "'", variableRenamingPolicy51.equals(com.google.javascript.jscomp.VariableRenamingPolicy.LOCAL));
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy57 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy57.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy59 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC + "'", propertyRenamingPolicy59.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC));
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy76 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.LOCAL + "'", variableRenamingPolicy76.equals(com.google.javascript.jscomp.VariableRenamingPolicy.LOCAL));
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy82 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy82.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy84 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC + "'", propertyRenamingPolicy84.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray5 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList6 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList6, jSTypeArray5);
        boolean boolean8 = jSTypeList3.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList6);
        com.google.javascript.rhino.Node node9 = jSTypeRegistry1.createParameters((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        jSTypeRegistry1.forwardDeclareType("PARAM_LIST");
        com.google.javascript.rhino.ErrorReporter errorReporter12 = jSTypeRegistry1.getErrorReporter();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = jSTypeRegistry1.getEachReferenceTypeWithProperty(":/hi!");
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(errorReporter12);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(6, "java.io.IOException: :", (-1), 50);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLooseTypes(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        java.lang.String str4 = compilerOptions3.syntheticBlockStartMarker;
        compilerOptions3.labelRenaming = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions7.crossModuleMethodMotion = true;
        compilerOptions7.setProtectHiddenSideEffects(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.crossModuleMethodMotion = true;
        compilerOptions12.skipAllCompilerPasses();
        compilerOptions12.resetWarningsGuard();
        java.lang.String str17 = compilerOptions12.aliasStringsBlacklist;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy18 = com.google.javascript.jscomp.VariableRenamingPolicy.LOCAL;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy19 = null;
        compilerOptions12.setRenamingPolicy(variableRenamingPolicy18, propertyRenamingPolicy19);
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions21.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy24 = compilerOptions21.propertyRenaming;
        compilerOptions7.setRenamingPolicy(variableRenamingPolicy18, propertyRenamingPolicy24);
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy26 = com.google.javascript.jscomp.PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC;
        compilerOptions3.setRenamingPolicy(variableRenamingPolicy18, propertyRenamingPolicy26);
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = new com.google.javascript.jscomp.CompilerOptions();
        java.lang.String str29 = compilerOptions28.syntheticBlockStartMarker;
        compilerOptions28.labelRenaming = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions32.crossModuleMethodMotion = true;
        compilerOptions32.setProtectHiddenSideEffects(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions37.crossModuleMethodMotion = true;
        compilerOptions37.skipAllCompilerPasses();
        compilerOptions37.resetWarningsGuard();
        java.lang.String str42 = compilerOptions37.aliasStringsBlacklist;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy43 = com.google.javascript.jscomp.VariableRenamingPolicy.LOCAL;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy44 = null;
        compilerOptions37.setRenamingPolicy(variableRenamingPolicy43, propertyRenamingPolicy44);
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions46.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy49 = compilerOptions46.propertyRenaming;
        compilerOptions32.setRenamingPolicy(variableRenamingPolicy43, propertyRenamingPolicy49);
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy51 = com.google.javascript.jscomp.PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC;
        compilerOptions28.setRenamingPolicy(variableRenamingPolicy43, propertyRenamingPolicy51);
        compilerOptions0.setRenamingPolicy(variableRenamingPolicy18, propertyRenamingPolicy51);
        compilerOptions0.setRenamePrefix("");
        compilerOptions0.setAppNameStr("Node tree inequality:\nTree1:\nNUMBER -1.0\n\n\nTree2:\nPARAM_LIST\n    PARAM_LIST\n\n\nSubtree1: NUMBER -1.0\n\n\nSubtree2: PARAM_LIST\n    PARAM_LIST\n");
        boolean boolean58 = compilerOptions0.coalesceVariableNames;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy18 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.LOCAL + "'", variableRenamingPolicy18.equals(com.google.javascript.jscomp.VariableRenamingPolicy.LOCAL));
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy24 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy24.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy26 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC + "'", propertyRenamingPolicy26.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy43 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.LOCAL + "'", variableRenamingPolicy43.equals(com.google.javascript.jscomp.VariableRenamingPolicy.LOCAL));
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy49 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy49.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy51 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC + "'", propertyRenamingPolicy51.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.Node node5 = jSTypeRegistry1.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        java.util.stream.Stream<com.google.javascript.rhino.jstype.JSType> jSTypeStream6 = jSTypeList3.parallelStream();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        boolean boolean8 = compilerOptions7.moveFunctionDeclarations;
        compilerOptions7.crossModuleCodeMotion = true;
        compilerOptions7.setManageClosureDependencies(false);
        boolean boolean13 = compilerOptions7.inlineLocalFunctions;
        compilerOptions7.disableRuntimeTypeCheck();
        boolean boolean15 = jSTypeList3.equals((java.lang.Object) compilerOptions7);
        java.util.stream.Stream<com.google.javascript.rhino.jstype.JSType> jSTypeStream16 = jSTypeList3.parallelStream();
        java.util.Spliterator<com.google.javascript.rhino.jstype.JSType> jSTypeSpliterator17 = jSTypeList3.spliterator();
        java.util.stream.Stream<com.google.javascript.rhino.jstype.JSType> jSTypeStream18 = jSTypeList3.parallelStream();
        int int19 = jSTypeList3.size();
        java.lang.Object[] objArray20 = jSTypeList3.toArray();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeStream6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeStream16);
        org.junit.Assert.assertNotNull(jSTypeSpliterator17);
        org.junit.Assert.assertNotNull(jSTypeStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        boolean boolean3 = compilerOptions0.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel4 = compilerOptions0.sourceMapDetailLevel;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode5 = compilerOptions0.getLanguageOut();
        com.google.javascript.jscomp.CheckLevel checkLevel6 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.exportTestFunctions = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(detailLevel4);
        org.junit.Assert.assertNull(languageMode5);
        org.junit.Assert.assertTrue("'" + checkLevel6 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel6.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("java.io.IOException: sun.util.logging.resources.logging", (-4), 53);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("TYPEOF : 44\n");
        boolean boolean2 = node1.isObjectLit();
        int int4 = node1.getIntProp(0);
        com.google.javascript.rhino.Node node5 = node1.removeFirstChild();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList11 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList11, jSTypeArray10);
        com.google.javascript.rhino.Node node13 = jSTypeRegistry9.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList11);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType jSType24 = jSTypeRegistry15.createNamedType(":", "", (int) (byte) 1, 48);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList28 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList28, jSTypeArray27);
        com.google.javascript.rhino.Node node30 = jSTypeRegistry26.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList28);
        com.google.javascript.rhino.jstype.JSType jSType35 = jSTypeRegistry26.createNamedType(":", "", (int) (byte) 1, 48);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] { jSType35 };
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry9.createConstructorTypeWithVarArgs(jSType24, jSTypeArray36);
        boolean boolean39 = jSTypeRegistry7.canPropertyBeDefined(jSType24, "");
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList43 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList43, jSTypeArray42);
        com.google.javascript.rhino.Node node45 = jSTypeRegistry41.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList43);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList49 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList49, jSTypeArray48);
        com.google.javascript.rhino.Node node51 = jSTypeRegistry47.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList49);
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry47.createNamedType(":", "", (int) (byte) 1, 48);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList60 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList60, jSTypeArray59);
        com.google.javascript.rhino.Node node62 = jSTypeRegistry58.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList60);
        com.google.javascript.rhino.jstype.JSType jSType67 = jSTypeRegistry58.createNamedType(":", "", (int) (byte) 1, 48);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray68 = new com.google.javascript.rhino.jstype.JSType[] { jSType67 };
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry41.createConstructorTypeWithVarArgs(jSType56, jSTypeArray68);
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList73 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList73, jSTypeArray72);
        com.google.javascript.rhino.Node node75 = jSTypeRegistry71.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList73);
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry71.createNamedType(":", "", (int) (byte) 1, 48);
        com.google.javascript.rhino.jstype.JSType jSType85 = jSTypeRegistry71.createNamedType("FINEST", "/", 32, (int) (short) 1);
        com.google.javascript.rhino.jstype.JSType jSType86 = jSTypeRegistry41.createNullableType(jSType85);
        com.google.javascript.rhino.jstype.JSType jSType87 = jSTypeRegistry7.createOptionalNullableType(jSType85);
        node1.setJSType(jSType85);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(jSType24);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(jSType35);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSTypeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(jSTypeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertNotNull(jSTypeArray68);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertNotNull(jSType86);
        org.junit.Assert.assertNotNull(jSType87);
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        // The following exception was thrown during execution in test generation
        try {
            java.util.logging.Level level1 = java.util.logging.Level.parse("Node tree inequality:\nTree1:\nPARAM_LIST\n\n\nTree2:\nSTRING PARAM_LIST 49\n\n\nSubtree1: PARAM_LIST\n\n\nSubtree2: STRING PARAM_LIST 49\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad level \"Node tree inequality:?Tree1:?PARAM_LIST???Tree2:?STRING PARAM_LIST 49???Subtree1: PARAM_LIST???Subtree2: STRING PARAM_LIST 49?\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        boolean boolean3 = compilerOptions0.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel4 = compilerOptions0.sourceMapDetailLevel;
        compilerOptions0.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions7.crossModuleMethodMotion = true;
        compilerOptions7.optimizeParameters = true;
        compilerOptions7.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel15 = compilerOptions7.checkGlobalNamesLevel;
        compilerOptions0.setReportMissingOverride(checkLevel15);
        java.util.Set<java.lang.String> strSet17 = compilerOptions0.stripTypes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CheckLevel checkLevel19 = compilerOptions18.checkRequires;
        compilerOptions0.setReportMissingOverride(checkLevel19);
        compilerOptions0.setInlineProperties(false);
        compilerOptions0.setLineBreak(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        boolean boolean26 = compilerOptions25.moveFunctionDeclarations;
        boolean boolean27 = compilerOptions25.recordFunctionInformation;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy28 = compilerOptions25.propertyRenaming;
        compilerOptions0.setPropertyRenaming(propertyRenamingPolicy28);
        com.google.javascript.jscomp.CheckLevel checkLevel30 = compilerOptions0.brokenClosureRequiresLevel;
        compilerOptions0.setCollapseAnonymousFunctions(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(detailLevel4);
        org.junit.Assert.assertTrue("'" + checkLevel15 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel15.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy28 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy28.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel30 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel30.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        boolean boolean3 = compilerOptions0.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel4 = compilerOptions0.sourceMapDetailLevel;
        compilerOptions0.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions7.crossModuleMethodMotion = true;
        compilerOptions7.optimizeParameters = true;
        compilerOptions7.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel15 = compilerOptions7.checkGlobalNamesLevel;
        compilerOptions0.setReportMissingOverride(checkLevel15);
        java.util.Set<java.lang.String> strSet17 = compilerOptions0.stripTypes;
        boolean boolean18 = compilerOptions0.devirtualizePrototypeMethods;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(detailLevel4);
        org.junit.Assert.assertTrue("'" + checkLevel15 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel15.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CheckLevel checkLevel1 = compilerOptions0.checkRequires;
        compilerOptions0.setRewriteNewDateGoogNow(true);
        compilerOptions0.setSyntheticBlockStartMarker("OFF");
        compilerOptions0.setChainCalls(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.crossModuleMethodMotion = true;
        compilerOptions8.setProtectHiddenSideEffects(true);
        compilerOptions8.setInputDelimiter("PARAM_LIST\n");
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap15 = null;
        compilerOptions8.cssRenamingMap = cssRenamingMap15;
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode18 = null;
        compilerOptions17.setTracerMode(tracerMode18);
        boolean boolean20 = compilerOptions17.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel21 = compilerOptions17.sourceMapDetailLevel;
        compilerOptions17.setColorizeErrorOutput(true);
        java.util.Set<java.lang.String> strSet24 = compilerOptions17.stripNameSuffixes;
        strSet24.clear();
        com.google.javascript.jscomp.SourceFile sourceFile28 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int30 = sourceFile28.getLineOfOffset((int) (short) 1);
        java.lang.String str31 = sourceFile28.getName();
        java.lang.String str32 = sourceFile28.getName();
        java.lang.String str33 = sourceFile28.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput35 = new com.google.javascript.jscomp.CompilerInput(sourceFile28, true);
        com.google.javascript.jscomp.SourceAst sourceAst36 = compilerInput35.getAst();
        boolean boolean37 = strSet24.remove((java.lang.Object) sourceAst36);
        compilerOptions8.setExtraAnnotationNames(strSet24);
        compilerOptions0.setReplaceStringsReservedStrings(strSet24);
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CheckLevel checkLevel41 = compilerOptions40.checkRequires;
        compilerOptions40.setRewriteNewDateGoogNow(true);
        compilerOptions40.setSyntheticBlockStartMarker("OFF");
        compilerOptions40.skipAllCompilerPasses();
        compilerOptions40.jqueryPass = false;
        java.lang.String[] strArray54 = new java.lang.String[] { "PARAM_LIST\n", "/", "STRING PARAM_LIST 49", "hi!", "/" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        compilerOptions40.stripNameSuffixes = strSet55;
        java.util.Set<java.lang.String> strSet58 = compilerOptions40.stripTypes;
        java.util.Spliterator<java.lang.String> strSpliterator59 = strSet58.spliterator();
        com.google.javascript.jscomp.CompilerOptions compilerOptions60 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions60.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy63 = compilerOptions60.propertyRenaming;
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap64 = compilerOptions60.getTweakReplacements();
        boolean boolean65 = strMap64.isEmpty();
        java.lang.Object obj66 = null;
        com.google.javascript.rhino.Node node67 = strMap64.get(obj66);
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions68.setReplaceStringsPlaceholderToken("hi!");
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel71 = com.google.javascript.jscomp.SourceMap.DetailLevel.SYMBOLS;
        compilerOptions68.setSourceMapDetailLevel(detailLevel71);
        boolean boolean73 = compilerOptions68.ideMode;
        compilerOptions68.setUnaliasableGlobals("");
        com.google.javascript.jscomp.CheckLevel checkLevel76 = compilerOptions68.checkUnreachableCode;
        com.google.javascript.rhino.Node node77 = strMap64.remove((java.lang.Object) checkLevel76);
        boolean boolean78 = strSet58.contains((java.lang.Object) checkLevel76);
        compilerOptions0.setCheckUnreachableCode(checkLevel76);
        org.junit.Assert.assertTrue("'" + checkLevel1 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel1.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(detailLevel21);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(sourceFile28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(sourceAst36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + checkLevel41 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel41.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertNotNull(strSpliterator59);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy63 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy63.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(detailLevel71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + checkLevel76 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel76.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy3 = compilerOptions0.propertyRenaming;
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy4 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF;
        compilerOptions0.anonymousFunctionNaming = anonymousFunctionNamingPolicy4;
        com.google.javascript.jscomp.DependencyOptions dependencyOptions6 = new com.google.javascript.jscomp.DependencyOptions();
        com.google.javascript.jscomp.DependencyOptions dependencyOptions8 = dependencyOptions6.setDependencyPruning(false);
        com.google.javascript.jscomp.DependencyOptions dependencyOptions10 = dependencyOptions8.setMoocherDropping(false);
        com.google.javascript.jscomp.DependencyOptions dependencyOptions12 = dependencyOptions10.setDependencySorting(false);
        compilerOptions0.setDependencyOptions(dependencyOptions12);
        boolean boolean14 = compilerOptions0.devirtualizePrototypeMethods;
        compilerOptions0.setCrossModuleCodeMotion(false);
        compilerOptions0.optimizeParameters = true;
        compilerOptions0.aliasKeywords = true;
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy3 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy3.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy4 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy4.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
        org.junit.Assert.assertNotNull(dependencyOptions8);
        org.junit.Assert.assertNotNull(dependencyOptions10);
        org.junit.Assert.assertNotNull(dependencyOptions12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        java.io.File file2 = new java.io.File(":", "hi!");
        boolean boolean5 = file2.setExecutable(false, false);
        boolean boolean8 = file2.setExecutable(false, true);
        java.io.File file9 = file2.getParentFile();
        java.nio.charset.Charset charset11 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str12 = charset11.name();
        java.lang.String str13 = charset11.name();
        java.nio.charset.Charset charset14 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str15 = charset14.toString();
        boolean boolean16 = charset11.contains(charset14);
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromFile("/", charset14);
        com.google.javascript.jscomp.SourceFile sourceFile18 = com.google.javascript.jscomp.SourceFile.fromFile(file9, charset14);
        java.io.File file19 = file9.getCanonicalFile();
        java.lang.String str20 = file19.getName();
        java.net.URL uRL21 = file19.toURL();
        org.junit.Assert.assertEquals(file2.getParent(), ":");
        org.junit.Assert.assertEquals(file2.toString(), ":/hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), ":");
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "US-ASCII" + "'", str12, "US-ASCII");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "US-ASCII" + "'", str13, "US-ASCII");
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "US-ASCII" + "'", str15, "US-ASCII");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertNotNull(sourceFile18);
        org.junit.Assert.assertNotNull(file19);
// flaky:         org.junit.Assert.assertEquals(file19.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file19.toString(), "/experiment/:");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":" + "'", str20, ":");
        org.junit.Assert.assertNotNull(uRL21);
// flaky:         org.junit.Assert.assertEquals(uRL21.toString(), "file:/experiment/:/");
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("STRING PARAM_LIST 49", jSTypeNative1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy6 = compilerOptions3.propertyRenaming;
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap7 = compilerOptions3.getTweakReplacements();
        boolean boolean8 = strMap7.isEmpty();
        java.lang.Object obj9 = null;
        com.google.javascript.rhino.Node node10 = strMap7.get(obj9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions11.setReplaceStringsPlaceholderToken("hi!");
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel14 = com.google.javascript.jscomp.SourceMap.DetailLevel.SYMBOLS;
        compilerOptions11.setSourceMapDetailLevel(detailLevel14);
        boolean boolean16 = compilerOptions11.ideMode;
        compilerOptions11.setUnaliasableGlobals("");
        com.google.javascript.jscomp.CheckLevel checkLevel19 = compilerOptions11.checkUnreachableCode;
        com.google.javascript.rhino.Node node20 = strMap7.remove((java.lang.Object) checkLevel19);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection21 = strMap7.values();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList28 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList28, jSTypeArray27);
        com.google.javascript.rhino.Node node30 = jSTypeRegistry26.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList28);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray33 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList34 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList34, jSTypeArray33);
        com.google.javascript.rhino.Node node36 = jSTypeRegistry32.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList34);
        node30.addChildrenToBack(node36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList41 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList41, jSTypeArray40);
        com.google.javascript.rhino.Node node43 = jSTypeRegistry39.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList41);
        boolean boolean44 = node43.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList48 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList48, jSTypeArray47);
        com.google.javascript.rhino.Node node50 = jSTypeRegistry46.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList48);
        boolean boolean51 = node50.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList55 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList55, jSTypeArray54);
        com.google.javascript.rhino.Node node57 = jSTypeRegistry53.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList55);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (short) 0, node30, node43, node50, node57, 0, 49);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node63 = node60.useSourceInfoIfMissingFrom(node62);
        com.google.javascript.rhino.InputId inputId64 = node63.getInputId();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList68 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList68, jSTypeArray67);
        com.google.javascript.rhino.Node node70 = jSTypeRegistry66.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList68);
        boolean boolean71 = node70.isIn();
        boolean boolean72 = node70.isGetElem();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) (-1L), 16, (int) (byte) -1);
        java.lang.String str77 = node76.getQualifiedName();
        com.google.javascript.rhino.Node node78 = node76.getLastChild();
        com.google.javascript.rhino.Node node79 = node76.getLastSibling();
        boolean boolean80 = node79.isFromExterns();
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node(9, node63, node70, node79, 300, 11);
        com.google.javascript.rhino.Node node84 = strMap7.replace("STRING PARAM_LIST", node63);
        com.google.javascript.rhino.Node node85 = assertionFunctionSpec2.getAssertedParam(node63);
        com.google.javascript.rhino.ErrorReporter errorReporter86 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry87 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter86);
        jSTypeRegistry87.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType89 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray90 = new com.google.javascript.rhino.jstype.JSType[] { jSType89 };
        com.google.javascript.rhino.Node node91 = jSTypeRegistry87.createParameters(jSTypeArray90);
        com.google.javascript.rhino.Node node92 = assertionFunctionSpec2.getAssertedParam(node91);
        boolean boolean93 = node92.isEmpty();
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy6 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy6.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(detailLevel14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeCollection21);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(jSTypeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNull(inputId64);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(node84);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(jSTypeArray90);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        java.io.File file2 = new java.io.File(":", "hi!");
        boolean boolean5 = file2.setExecutable(false, false);
        boolean boolean7 = file2.setReadable(false);
        java.io.File file8 = file2.getCanonicalFile();
        java.io.File file10 = new java.io.File(":");
        java.io.File file12 = new java.io.File(file10, "FINEST");
        boolean boolean13 = file2.renameTo(file10);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile14 = com.google.javascript.jscomp.JSSourceFile.fromFile(file2);
        java.lang.String str16 = jSSourceFile14.getLine(42);
        jSSourceFile14.clearCachedSource();
        org.junit.Assert.assertEquals(file2.getParent(), ":");
        org.junit.Assert.assertEquals(file2.toString(), ":/hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(file8);
// flaky:         org.junit.Assert.assertEquals(file8.getParent(), "/experiment/:");
// flaky:         org.junit.Assert.assertEquals(file8.toString(), "/experiment/:/hi!");
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), ":");
        org.junit.Assert.assertEquals(file12.getParent(), ":");
        org.junit.Assert.assertEquals(file12.toString(), ":/FINEST");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSSourceFile14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.optimizeParameters = true;
        compilerOptions0.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.crossModuleMethodMotion = true;
        compilerOptions8.optimizeParameters = true;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy13 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy17 = compilerOptions14.propertyRenaming;
        compilerOptions8.setRenamingPolicy(variableRenamingPolicy13, propertyRenamingPolicy17);
        com.google.javascript.jscomp.SourceMap.Format format19 = compilerOptions8.sourceMapFormat;
        compilerOptions0.setSourceMapFormat(format19);
        boolean boolean21 = compilerOptions0.shouldColorizeErrorOutput();
        compilerOptions0.inlineConstantVars = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions24.setReplaceStringsPlaceholderToken("hi!");
        compilerOptions24.setTweakToDoubleLiteral("", (double) (short) 1);
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode30 = null;
        compilerOptions24.setLanguageOut(languageMode30);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy32 = null;
        compilerOptions24.variableRenaming = variableRenamingPolicy32;
        com.google.javascript.jscomp.CheckLevel checkLevel34 = compilerOptions24.checkUnreachableCode;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode35 = compilerOptions24.getLanguageOut();
        boolean boolean36 = compilerOptions24.moveFunctionDeclarations;
        byte[] byteArray37 = null;
        compilerOptions24.inputPropertyMapSerialized = byteArray37;
        compilerOptions24.locale = ":/hi!";
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList46 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList46, jSTypeArray45);
        com.google.javascript.rhino.Node node48 = jSTypeRegistry44.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList46);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray51 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList52 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList52, jSTypeArray51);
        com.google.javascript.rhino.Node node54 = jSTypeRegistry50.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList52);
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry50.createNamedType(":", "", (int) (byte) 1, 48);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList63 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList63, jSTypeArray62);
        com.google.javascript.rhino.Node node65 = jSTypeRegistry61.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList63);
        com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeRegistry61.createNamedType(":", "", (int) (byte) 1, 48);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] { jSType70 };
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry44.createConstructorTypeWithVarArgs(jSType59, jSTypeArray71);
        boolean boolean74 = jSTypeRegistry42.canPropertyBeDefined(jSType59, "");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable76 = jSTypeRegistry42.getEachReferenceTypeWithProperty("/");
        java.lang.String[] strArray81 = new java.lang.String[] { "Unversioned directory", "/experiment/:/hi!", ":", "OFF" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        jSTypeRegistry42.setTemplateTypeNames((java.util.List<java.lang.String>) strList82);
        compilerOptions24.setManageClosureDependencies((java.util.List<java.lang.String>) strList82);
        compilerOptions0.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList82);
        boolean boolean87 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        boolean boolean88 = compilerOptions0.removeUnusedPrototypeProperties;
        boolean boolean89 = compilerOptions0.collapseProperties;
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy17 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy17.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(format19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + checkLevel34 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel34.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(languageMode35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(jSTypeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(jSType70);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable76);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray5 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList6 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList6, jSTypeArray5);
        boolean boolean8 = jSTypeList3.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList6);
        com.google.javascript.rhino.Node node9 = jSTypeRegistry1.createParameters((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        boolean boolean10 = node9.isAdd();
        boolean boolean11 = node9.isDebugger();
        node9.setWasEmptyNode(false);
        boolean boolean14 = node9.isFromExterns();
        com.google.javascript.rhino.Node node15 = node9.cloneTree();
        boolean boolean16 = node15.isScript();
        boolean boolean17 = node15.isRegExp();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setReplaceStringsPlaceholderToken("hi!");
        compilerOptions0.setTweakToDoubleLiteral("", (double) (short) 1);
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = null;
        compilerOptions0.setLanguageOut(languageMode6);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy8 = null;
        compilerOptions0.variableRenaming = variableRenamingPolicy8;
        com.google.javascript.jscomp.CheckLevel checkLevel10 = compilerOptions0.checkUnreachableCode;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode11 = compilerOptions0.getLanguageOut();
        boolean boolean12 = compilerOptions0.moveFunctionDeclarations;
        byte[] byteArray13 = null;
        compilerOptions0.inputPropertyMapSerialized = byteArray13;
        compilerOptions0.locale = ":/hi!";
        boolean boolean17 = compilerOptions0.inlineLocalFunctions;
        com.google.javascript.jscomp.DependencyOptions dependencyOptions18 = new com.google.javascript.jscomp.DependencyOptions();
        com.google.javascript.jscomp.DependencyOptions dependencyOptions20 = dependencyOptions18.setDependencyPruning(false);
        com.google.javascript.jscomp.DependencyOptions dependencyOptions22 = dependencyOptions20.setDependencyPruning(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode24 = null;
        compilerOptions23.setTracerMode(tracerMode24);
        compilerOptions23.setGeneratePseudoNames(false);
        compilerOptions23.setDefineToNumberLiteral("PARAM_LIST\n", (int) '/');
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = new com.google.javascript.jscomp.CompilerOptions();
        java.lang.String str32 = compilerOptions31.syntheticBlockStartMarker;
        compilerOptions31.labelRenaming = true;
        boolean boolean35 = compilerOptions31.inlineLocalFunctions;
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions36.crossModuleMethodMotion = true;
        compilerOptions36.skipAllCompilerPasses();
        boolean boolean40 = compilerOptions36.flowSensitiveInlineVariables;
        java.lang.String[] strArray50 = new java.lang.String[] { "*global*", "", "FINEST", "FINEST", "STRING PARAM_LIST 49", "STRING PARAM_LIST 49", "hi!", ":", "FINEST" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        compilerOptions36.stripTypes = strSet51;
        compilerOptions31.setStripNameSuffixes((java.util.Set<java.lang.String>) strSet51);
        boolean boolean56 = strSet51.contains((java.lang.Object) "java.io.IOException: ");
        compilerOptions23.aliasableStrings = strSet51;
        com.google.javascript.jscomp.DependencyOptions dependencyOptions58 = dependencyOptions20.setEntryPoints((java.util.Collection<java.lang.String>) strSet51);
        com.google.javascript.jscomp.DependencyOptions dependencyOptions60 = dependencyOptions20.setDependencyPruning(false);
        com.google.javascript.jscomp.DependencyOptions dependencyOptions62 = dependencyOptions20.setDependencySorting(true);
        compilerOptions0.setDependencyOptions(dependencyOptions62);
        com.google.javascript.jscomp.DependencyOptions dependencyOptions65 = dependencyOptions62.setDependencySorting(false);
        com.google.javascript.jscomp.DependencyOptions dependencyOptions67 = dependencyOptions62.setDependencyPruning(true);
        org.junit.Assert.assertTrue("'" + checkLevel10 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel10.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(languageMode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dependencyOptions20);
        org.junit.Assert.assertNotNull(dependencyOptions22);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(dependencyOptions58);
        org.junit.Assert.assertNotNull(dependencyOptions60);
        org.junit.Assert.assertNotNull(dependencyOptions62);
        org.junit.Assert.assertNotNull(dependencyOptions65);
        org.junit.Assert.assertNotNull(dependencyOptions67);
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        java.io.File file2 = new java.io.File(":", "hi!");
        boolean boolean5 = file2.setExecutable(false, false);
        boolean boolean7 = file2.setReadable(false);
        boolean boolean10 = file2.setReadable(true, false);
        java.io.File file11 = file2.getParentFile();
        java.lang.String str12 = file2.toString();
        org.junit.Assert.assertEquals(file2.getParent(), ":");
        org.junit.Assert.assertEquals(file2.toString(), ":/hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), ":");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":/hi!" + "'", str12, ":/hi!");
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        boolean boolean3 = compilerOptions0.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel4 = compilerOptions0.sourceMapDetailLevel;
        compilerOptions0.optimizeArgumentsArray = false;
        compilerOptions0.setAliasableGlobals("STRING PARAM_LIST 49");
        boolean boolean9 = compilerOptions0.aliasAllStrings;
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing10 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK;
        boolean boolean11 = tweakProcessing10.shouldStrip();
        compilerOptions0.setTweakProcessing(tweakProcessing10);
        boolean boolean13 = compilerOptions0.reserveRawExports;
        compilerOptions0.setMarkNoSideEffectCalls(false);
        compilerOptions0.setCrossModuleMethodMotion(true);
        boolean boolean18 = compilerOptions0.aliasAllStrings;
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions19.crossModuleMethodMotion = true;
        compilerOptions19.setUnaliasableGlobals("sun.util.logging.resources.logging");
        com.google.javascript.jscomp.CheckLevel checkLevel24 = com.google.javascript.jscomp.CheckLevel.ERROR;
        compilerOptions19.setCheckGlobalThisLevel(checkLevel24);
        compilerOptions0.checkGlobalNamesLevel = checkLevel24;
        compilerOptions0.setRecordFunctionInformation(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(detailLevel4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + tweakProcessing10 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK + "'", tweakProcessing10.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + checkLevel24 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel24.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        com.google.javascript.jscomp.SourceFile.Builder builder1 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int7 = sourceFile5.getLineOfOffset((int) (short) 1);
        java.io.Reader reader8 = sourceFile5.getCodeReader();
        int int9 = reader8.read();
        com.google.javascript.jscomp.SourceFile sourceFile10 = builder1.buildFromReader("*global*", reader8);
        java.nio.charset.Charset charset11 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder12 = builder1.withCharset(charset11);
        com.google.javascript.jscomp.SourceFile sourceFile14 = builder12.buildFromFile("/experiment/:/hi!");
        com.google.javascript.jscomp.SourceFile.Builder builder16 = builder12.withOriginalPath(":");
        com.google.javascript.jscomp.SourceFile sourceFile18 = builder16.buildFromFile("java.io.IOException: OFF");
        java.nio.charset.Charset charset19 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str20 = charset19.name();
        java.lang.String str21 = charset19.name();
        java.nio.charset.Charset charset22 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str23 = charset22.toString();
        boolean boolean24 = charset19.contains(charset22);
        java.lang.String str25 = charset19.displayName();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions26.crossModuleMethodMotion = true;
        compilerOptions26.syntheticBlockEndMarker = "hi!";
        compilerOptions26.setMarkNoSideEffectCalls(false);
        compilerOptions26.setInlineConstantVars(true);
        boolean boolean35 = charset19.equals((java.lang.Object) true);
        java.nio.ByteBuffer byteBuffer37 = charset19.encode("JSC_OPTIMIZE_LOOP_ERROR: Exceeded max number of optimization iterations: {0}");
        com.google.javascript.jscomp.SourceFile.Builder builder38 = builder16.withCharset(charset19);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile39 = com.google.javascript.jscomp.JSSourceFile.fromFile(":", charset19);
        java.nio.ByteBuffer byteBuffer41 = charset19.encode("/experiment/:/hi!");
        java.nio.charset.CharsetDecoder charsetDecoder42 = charset19.newDecoder();
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(sourceFile14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(sourceFile18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "US-ASCII" + "'", str20, "US-ASCII");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "US-ASCII" + "'", str21, "US-ASCII");
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "US-ASCII" + "'", str23, "US-ASCII");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "US-ASCII" + "'", str25, "US-ASCII");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(jSSourceFile39);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(charsetDecoder42);
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList4 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList4, jSTypeArray3);
        com.google.javascript.rhino.Node node6 = jSTypeRegistry2.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList4);
        boolean boolean7 = node6.isIn();
        boolean boolean8 = node6.isGetElem();
        boolean boolean9 = node6.isIn();
        com.google.javascript.rhino.Node node10 = node6.getLastSibling();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType11 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("PARAM_LIST", 49, 0);
        boolean boolean16 = node15.isTry();
        java.lang.String str17 = node15.toString();
        boolean boolean18 = node15.isIn();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) (-1L), 16, (int) (byte) -1);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType11, node15, node22);
        node15.setSourceEncodedPositionForTree((int) 'a');
        boolean boolean26 = node10.hasChild(node15);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = node10.getStaticSourceFile();
        boolean boolean28 = node10.wasEmptyNode();
        com.google.javascript.rhino.Node node30 = node10.getAncestor(32);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((-33), node10, (int) '#', 9);
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + subclassType11 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType11.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "STRING PARAM_LIST 49" + "'", str17, "STRING PARAM_LIST 49");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(staticSourceFile27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy3 = compilerOptions0.propertyRenaming;
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap4 = compilerOptions0.getTweakReplacements();
        boolean boolean5 = strMap4.isEmpty();
        strMap4.clear();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1L), 16, (int) (byte) -1);
        java.lang.String str12 = node11.getQualifiedName();
        com.google.javascript.rhino.Node node13 = node11.getLastChild();
        com.google.javascript.rhino.Node node14 = strMap4.replace("FINEST", node11);
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromCode(":", "");
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("java.io.IOException: ", 43, (int) '#');
        boolean boolean22 = node21.isExprResult();
        com.google.javascript.rhino.Node node23 = strMap4.getOrDefault((java.lang.Object) "", node21);
        boolean boolean24 = node23.hasMoreThanOneChild();
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy3 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy3.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("JSC_OPTIMIZE_LOOP_ERROR. Exceeded max number of code motion iterations: {0} at (unknown source) line (unknown line) : (unknown column)", jSTypeNative1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 280487936000L, 30, 30);
        boolean boolean7 = node6.isAssignAdd();
        com.google.javascript.rhino.Node node8 = assertionFunctionSpec2.getAssertedParam(node6);
        boolean boolean9 = node8.isUnscopedQualifiedName();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = jSModule1.getByName("FINEST");
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int8 = sourceFile6.getLineOfOffset((int) (short) 1);
        java.lang.String str9 = sourceFile6.getName();
        java.lang.String str10 = sourceFile6.getName();
        java.lang.String str11 = sourceFile6.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput13 = new com.google.javascript.jscomp.CompilerInput(sourceFile6, true);
        com.google.javascript.jscomp.CompilerInput compilerInput14 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput13);
        com.google.javascript.jscomp.JSModule jSModule15 = compilerInput13.getModule();
        com.google.javascript.jscomp.JSModule jSModule17 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        jSModule17.sortInputsByDeps(compiler18);
        java.lang.String str20 = jSModule17.getName();
        compilerInput13.setModule(jSModule17);
        jSModule1.addDependency(jSModule17);
        com.google.javascript.jscomp.SourceFile sourceFile25 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int27 = sourceFile25.getLineOfOffset((int) (short) 1);
        int int29 = sourceFile25.getLineOfOffset(100);
        java.lang.String str30 = sourceFile25.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput31 = new com.google.javascript.jscomp.CompilerInput(sourceFile25);
        com.google.javascript.rhino.InputId inputId32 = compilerInput31.getInputId();
        jSModule1.addFirst(compilerInput31);
        com.google.javascript.jscomp.Region region35 = compilerInput31.getRegion(400);
        com.google.javascript.jscomp.SourceAst sourceAst36 = compilerInput31.getSourceAst();
        org.junit.Assert.assertNull(compilerInput3);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "STRING PARAM_LIST 49" + "'", str20, "STRING PARAM_LIST 49");
        org.junit.Assert.assertNotNull(sourceFile25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(inputId32);
        org.junit.Assert.assertNull(region35);
        org.junit.Assert.assertNotNull(sourceAst36);
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 48, 51);
        boolean boolean5 = node4.isFromExterns();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(0, "*global*");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1L), 16, (int) (byte) -1);
        node12.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList19 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList19, jSTypeArray18);
        com.google.javascript.rhino.Node node21 = jSTypeRegistry17.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList19);
        boolean boolean22 = node21.isIn();
        boolean boolean23 = node21.isVoid();
        node21.setOptionalArg(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode27 = null;
        compilerOptions26.setTracerMode(tracerMode27);
        boolean boolean29 = compilerOptions26.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel30 = compilerOptions26.sourceMapDetailLevel;
        compilerOptions26.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions33.crossModuleMethodMotion = true;
        compilerOptions33.optimizeParameters = true;
        compilerOptions33.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel41 = compilerOptions33.checkGlobalNamesLevel;
        compilerOptions26.setReportMissingOverride(checkLevel41);
        com.google.javascript.jscomp.DiagnosticType diagnosticType43 = com.google.javascript.jscomp.Compiler.MOTION_ITERATIONS_ERROR;
        java.lang.String[] strArray44 = null;
        com.google.javascript.jscomp.JSError jSError45 = com.google.javascript.jscomp.JSError.make("", node21, checkLevel41, diagnosticType43, strArray44);
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions46.crossModuleMethodMotion = true;
        compilerOptions46.skipAllCompilerPasses();
        compilerOptions46.resetWarningsGuard();
        compilerOptions46.setInlineLocalVariables(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode54 = null;
        compilerOptions53.setTracerMode(tracerMode54);
        boolean boolean56 = compilerOptions53.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel57 = compilerOptions53.sourceMapDetailLevel;
        compilerOptions53.setColorizeErrorOutput(true);
        java.util.Set<java.lang.String> strSet60 = compilerOptions53.stripNameSuffixes;
        compilerOptions46.setReplaceStringsReservedStrings(strSet60);
        boolean boolean62 = strSet60.isEmpty();
        node21.setDirectives(strSet60);
        node21.addSuppression("java.io.IOException: ");
        java.lang.String str69 = node21.toString(false, false, false);
        boolean boolean70 = node21.isNew();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(38, node4, node8, node12, node21);
        node21.setSourceFileForTesting("JSC_OPTIMIZE_LOOP_ERROR. Exceeded max number of code motion iterations: {0} at (unknown source) line (unknown line) : (unknown column)");
        com.google.javascript.rhino.Node node74 = node21.cloneTree();
        com.google.javascript.rhino.jstype.JSType jSType75 = node21.getJSType();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(detailLevel30);
        org.junit.Assert.assertTrue("'" + checkLevel41 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel41.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(diagnosticType43);
        org.junit.Assert.assertNotNull(jSError45);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(detailLevel57);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "PARAM_LIST" + "'", str69, "PARAM_LIST");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNull(jSType75);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        java.io.File file2 = new java.io.File(":", "hi!");
        boolean boolean5 = file2.setExecutable(false, false);
        java.io.File file6 = file2.getParentFile();
        long long7 = file6.getUsableSpace();
        boolean boolean8 = file6.mkdirs();
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = com.google.javascript.jscomp.JSSourceFile.fromFile(file6, charset9);
        java.io.File file13 = new java.io.File(":", "hi!");
        boolean boolean16 = file13.setExecutable(true, false);
        boolean boolean18 = file13.setWritable(false);
        boolean boolean19 = file13.canWrite();
        java.net.URI uRI20 = file13.toURI();
        boolean boolean21 = file6.renameTo(file13);
        boolean boolean22 = file13.setReadOnly();
        boolean boolean23 = file13.canWrite();
        java.nio.charset.Charset charset24 = java.nio.charset.Charset.defaultCharset();
        java.lang.String str25 = charset24.name();
        java.lang.String str26 = charset24.name();
        java.lang.String str27 = charset24.name();
        com.google.javascript.jscomp.SourceFile sourceFile28 = com.google.javascript.jscomp.SourceFile.fromFile(file13, charset24);
        boolean boolean29 = file13.delete();
        java.io.File file32 = new java.io.File(":", "hi!");
        boolean boolean35 = file32.setExecutable(false, false);
        boolean boolean37 = file32.setReadable(false);
        java.io.File file38 = file32.getCanonicalFile();
        java.lang.String str39 = file38.getPath();
        int int40 = file13.compareTo(file38);
        org.junit.Assert.assertEquals(file2.getParent(), ":");
        org.junit.Assert.assertEquals(file2.toString(), ":/hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), ":");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 280492998656L + "'", long7 == 280492998656L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSSourceFile10);
        org.junit.Assert.assertEquals(file13.getParent(), ":");
        org.junit.Assert.assertEquals(file13.toString(), ":/hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(uRI20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "US-ASCII" + "'", str25, "US-ASCII");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "US-ASCII" + "'", str26, "US-ASCII");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "US-ASCII" + "'", str27, "US-ASCII");
        org.junit.Assert.assertNotNull(sourceFile28);
// flaky:         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals(file32.getParent(), ":");
        org.junit.Assert.assertEquals(file32.toString(), ":/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(file38);
// flaky:         org.junit.Assert.assertEquals(file38.getParent(), "/experiment/:");
// flaky:         org.junit.Assert.assertEquals(file38.toString(), "/experiment/:/hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "/experiment/:/hi!" + "'", str39, "/experiment/:/hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 11 + "'", int40 == 11);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList4 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList4, jSTypeArray3);
        com.google.javascript.rhino.Node node6 = jSTypeRegistry2.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList4);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        node6.addChildrenToBack(node12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        boolean boolean20 = node19.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean27 = node26.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList31 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList31, jSTypeArray30);
        com.google.javascript.rhino.Node node33 = jSTypeRegistry29.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList31);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 0, node6, node19, node26, node33, 0, 49);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList40 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList40, jSTypeArray39);
        com.google.javascript.rhino.Node node42 = jSTypeRegistry38.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList40);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList46 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList46, jSTypeArray45);
        com.google.javascript.rhino.Node node48 = jSTypeRegistry44.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList46);
        node42.addChildrenToBack(node48);
        com.google.javascript.rhino.Node node50 = node6.clonePropsFrom(node48);
        java.util.Set<java.lang.String> strSet51 = node50.getDirectives();
        node50.setLineno((int) '/');
        node50.setIsSyntheticBlock(true);
        int int56 = node50.getType();
        boolean boolean57 = node50.isInstanceOf();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList62 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList62, jSTypeArray61);
        com.google.javascript.rhino.Node node64 = jSTypeRegistry60.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList62);
        boolean boolean65 = node64.isIn();
        boolean boolean66 = node64.isVoid();
        node64.setOptionalArg(true);
        node64.setVarArgs(true);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) (short) 10, node64, 300, 49);
        boolean boolean74 = node64.isExprResult();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable75 = node64.children();
        com.google.javascript.rhino.Node node76 = node50.copyInformationFromForTree(node64);
        // The following exception was thrown during execution in test generation
        try {
            node50.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(strSet51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 83 + "'", int56 == 83);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(nodeIterable75);
        org.junit.Assert.assertNotNull(node76);
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        java.io.File file2 = new java.io.File(":", "hi!");
        boolean boolean5 = file2.setExecutable(false, false);
        java.io.File file6 = file2.getParentFile();
        long long7 = file6.getUsableSpace();
        boolean boolean8 = file6.mkdirs();
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = com.google.javascript.jscomp.JSSourceFile.fromFile(file6, charset9);
        java.io.File file13 = new java.io.File(":", "hi!");
        boolean boolean16 = file13.setExecutable(true, false);
        boolean boolean18 = file13.setWritable(false);
        boolean boolean19 = file13.canWrite();
        java.net.URI uRI20 = file13.toURI();
        boolean boolean21 = file6.renameTo(file13);
        boolean boolean22 = file13.setReadOnly();
        boolean boolean23 = file13.canWrite();
        java.net.URI uRI24 = file13.toURI();
        boolean boolean26 = file13.setExecutable(false);
        org.junit.Assert.assertEquals(file2.getParent(), ":");
        org.junit.Assert.assertEquals(file2.toString(), ":/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), ":");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 280492994560L + "'", long7 == 280492994560L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSSourceFile10);
        org.junit.Assert.assertEquals(file13.getParent(), ":");
        org.junit.Assert.assertEquals(file13.toString(), ":/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(uRI20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(uRI24);
// flaky:         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        java.io.IOException iOException1 = new java.io.IOException("SHNE 46 [jsdoc_info: JSDocInfo]");
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        java.io.File file2 = new java.io.File(":", "hi!");
        boolean boolean5 = file2.setExecutable(false, false);
        java.io.File file6 = file2.getParentFile();
        long long7 = file6.getUsableSpace();
        boolean boolean8 = file6.mkdirs();
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = com.google.javascript.jscomp.JSSourceFile.fromFile(file6, charset9);
        java.net.URL uRL11 = file6.toURL();
        java.lang.String str12 = file6.getName();
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromFile(file6);
        java.lang.String str14 = file6.toString();
        org.junit.Assert.assertEquals(file2.getParent(), ":");
        org.junit.Assert.assertEquals(file2.toString(), ":/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), ":");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 280492994560L + "'", long7 == 280492994560L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSSourceFile10);
        org.junit.Assert.assertNotNull(uRL11);
// flaky:         org.junit.Assert.assertEquals(uRL11.toString(), "file:/experiment/:/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":" + "'", str12, ":");
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":" + "'", str14, ":");
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        com.google.javascript.jscomp.DiagnosticType[] diagnosticTypeArray0 = new com.google.javascript.jscomp.DiagnosticType[] {};
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup1 = new com.google.javascript.jscomp.DiagnosticGroup(diagnosticTypeArray0);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup2 = new com.google.javascript.jscomp.DiagnosticGroup(diagnosticTypeArray0);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = new com.google.javascript.jscomp.DiagnosticGroup(diagnosticTypeArray0);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup4 = new com.google.javascript.jscomp.DiagnosticGroup(diagnosticTypeArray0);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = new com.google.javascript.jscomp.DiagnosticGroup(diagnosticTypeArray0);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = new com.google.javascript.jscomp.DiagnosticGroup(diagnosticTypeArray0);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup7 = new com.google.javascript.jscomp.DiagnosticGroup(diagnosticTypeArray0);
        org.junit.Assert.assertNotNull(diagnosticTypeArray0);
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList4 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList4, jSTypeArray3);
        com.google.javascript.rhino.Node node6 = jSTypeRegistry2.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList4);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        node6.addChildrenToBack(node12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        boolean boolean20 = node19.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean27 = node26.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList31 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList31, jSTypeArray30);
        com.google.javascript.rhino.Node node33 = jSTypeRegistry29.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList31);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 0, node6, node19, node26, node33, 0, 49);
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = null;
        node19.setJSDocInfo(jSDocInfo37);
        com.google.javascript.rhino.Node node39 = node19.cloneNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = node39.getJSDocInfo();
        java.lang.String str41 = node39.getSourceFileName();
        int int42 = node39.getLength();
        node39.setSourceEncodedPositionForTree(4095);
        com.google.javascript.rhino.Node node45 = node39.getFirstChild();
        java.lang.String str49 = node39.toString(false, true, true);
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(jSDocInfo40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PARAM_LIST" + "'", str49, "PARAM_LIST");
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("OFF");
        java.lang.String str2 = null; // flaky: sourceFile1.getCode();
        org.junit.Assert.assertNotNull(sourceFile1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        java.lang.String[] strArray1 = new java.lang.String[] { "/tmp" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        int int4 = strSet2.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray5 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList6 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList6, jSTypeArray5);
        boolean boolean8 = jSTypeList3.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList6);
        com.google.javascript.rhino.Node node9 = jSTypeRegistry1.createParameters((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        jSTypeRegistry1.forwardDeclareType("PARAM_LIST");
        com.google.javascript.rhino.ErrorReporter errorReporter12 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList16 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList16, jSTypeArray15);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList19 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList19, jSTypeArray18);
        boolean boolean21 = jSTypeList16.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList19);
        com.google.javascript.rhino.Node node22 = jSTypeRegistry14.createParameters((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList16);
        jSTypeRegistry14.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList28 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList28, jSTypeArray27);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList31 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList31, jSTypeArray30);
        boolean boolean33 = jSTypeList28.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList31);
        com.google.javascript.rhino.Node node34 = jSTypeRegistry26.createParameters((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList28);
        jSTypeRegistry26.forwardDeclareType("PARAM_LIST");
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable38 = jSTypeRegistry26.getTypesWithProperty("*global*");
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry26.createNamedType("PARAM_LIST", "/experiment/:/hi!", 51, 48);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        jSTypeRegistry45.clearNamedTypes();
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSType jSType48 = jSTypeRegistry26.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) objectType47);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray51 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList52 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList52, jSTypeArray51);
        com.google.javascript.rhino.Node node54 = jSTypeRegistry50.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList52);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray57 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList58 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList58, jSTypeArray57);
        com.google.javascript.rhino.Node node60 = jSTypeRegistry56.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList58);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry56.createNamedType(":", "", (int) (byte) 1, 48);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray68 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList69 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList69, jSTypeArray68);
        com.google.javascript.rhino.Node node71 = jSTypeRegistry67.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList69);
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry67.createNamedType(":", "", (int) (byte) 1, 48);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray77 = new com.google.javascript.rhino.jstype.JSType[] { jSType76 };
        com.google.javascript.rhino.jstype.FunctionType functionType78 = jSTypeRegistry50.createConstructorTypeWithVarArgs(jSType65, jSTypeArray77);
        com.google.javascript.rhino.jstype.FunctionType functionType79 = jSTypeRegistry14.createConstructorType(jSType48, jSTypeArray77);
        com.google.javascript.rhino.Node node80 = jSTypeRegistry1.createParameters(jSTypeArray77);
        boolean boolean81 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(errorReporter12);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(jSTypeIterable38);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertNotNull(jSTypeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(jSTypeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(jSTypeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(jSType76);
        org.junit.Assert.assertNotNull(jSTypeArray77);
        org.junit.Assert.assertNotNull(functionType78);
        org.junit.Assert.assertNotNull(functionType79);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList4 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList4, jSTypeArray3);
        com.google.javascript.rhino.Node node6 = jSTypeRegistry2.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList4);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        node6.addChildrenToBack(node12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        boolean boolean20 = node19.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean27 = node26.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList31 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList31, jSTypeArray30);
        com.google.javascript.rhino.Node node33 = jSTypeRegistry29.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList31);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 0, node6, node19, node26, node33, 0, 49);
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = null;
        node19.setJSDocInfo(jSDocInfo37);
        boolean boolean39 = node19.isDebugger();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.syntheticBlockEndMarker = "hi!";
        compilerOptions0.setMarkNoSideEffectCalls(false);
        byte[] byteArray7 = compilerOptions0.inputPropertyMapSerialized;
        compilerOptions0.markNoSideEffectCalls = false;
        compilerOptions0.setRewriteNewDateGoogNow(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CheckLevel checkLevel13 = compilerOptions12.checkRequires;
        compilerOptions12.setRewriteNewDateGoogNow(true);
        compilerOptions12.setSyntheticBlockStartMarker("OFF");
        compilerOptions12.skipAllCompilerPasses();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions19.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy22 = compilerOptions19.propertyRenaming;
        java.lang.String[] strArray25 = new java.lang.String[] { "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        compilerOptions19.setStripTypes((java.util.Set<java.lang.String>) strSet26);
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode30 = null;
        compilerOptions29.setTracerMode(tracerMode30);
        boolean boolean32 = compilerOptions29.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel33 = compilerOptions29.sourceMapDetailLevel;
        compilerOptions29.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions36.crossModuleMethodMotion = true;
        compilerOptions36.optimizeParameters = true;
        compilerOptions36.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel44 = compilerOptions36.checkGlobalNamesLevel;
        compilerOptions29.setReportMissingOverride(checkLevel44);
        compilerOptions19.setCheckUnreachableCode(checkLevel44);
        compilerOptions12.setCheckMissingReturn(checkLevel44);
        com.google.javascript.jscomp.CompilerOptions.Reach reach48 = com.google.javascript.jscomp.CompilerOptions.Reach.LOCAL_ONLY;
        compilerOptions12.setInlineVariables(reach48);
        compilerOptions0.setInlineVariables(reach48);
        boolean boolean51 = compilerOptions0.removeDeadCode;
        compilerOptions0.setDisambiguateProperties(false);
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy54 = compilerOptions0.anonymousFunctionNaming;
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertTrue("'" + checkLevel13 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel13.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy22 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy22.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(detailLevel33);
        org.junit.Assert.assertTrue("'" + checkLevel44 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel44.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + reach48 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.LOCAL_ONLY + "'", reach48.equals(com.google.javascript.jscomp.CompilerOptions.Reach.LOCAL_ONLY));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy54 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy54.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList4 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList4, jSTypeArray3);
        com.google.javascript.rhino.Node node6 = jSTypeRegistry2.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList4);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        node6.addChildrenToBack(node12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        boolean boolean20 = node19.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean27 = node26.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList31 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList31, jSTypeArray30);
        com.google.javascript.rhino.Node node33 = jSTypeRegistry29.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList31);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 0, node6, node19, node26, node33, 0, 49);
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = null;
        node19.setJSDocInfo(jSDocInfo37);
        node19.putBooleanProp((int) (short) 1, false);
        boolean boolean42 = node19.isAssign();
        boolean boolean43 = node19.isCatch();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy3 = compilerOptions0.propertyRenaming;
        boolean boolean4 = compilerOptions0.disambiguateProperties;
        compilerOptions0.setFoldConstants(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode8 = null;
        compilerOptions7.setTracerMode(tracerMode8);
        boolean boolean10 = compilerOptions7.generatePseudoNames;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray11 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList12 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList12, locationMappingArray11);
        compilerOptions7.sourceMapLocationMappings = locationMappingList12;
        compilerOptions0.sourceMapLocationMappings = locationMappingList12;
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode17 = null;
        compilerOptions16.setTracerMode(tracerMode17);
        boolean boolean19 = compilerOptions16.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel20 = compilerOptions16.sourceMapDetailLevel;
        compilerOptions16.setColorizeErrorOutput(true);
        java.util.Set<java.lang.String> strSet23 = compilerOptions16.stripNameSuffixes;
        com.google.javascript.jscomp.SourceFile sourceFile25 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput27 = new com.google.javascript.jscomp.CompilerInput(sourceFile25, true);
        com.google.javascript.rhino.InputId inputId29 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput31 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput27, inputId29, true);
        java.lang.String str32 = compilerInput31.toString();
        boolean boolean33 = strSet23.contains((java.lang.Object) compilerInput31);
        compilerOptions0.setStripNamePrefixes(strSet23);
        compilerOptions0.setNameReferenceGraphPath("goog.exportProperty");
        compilerOptions0.markAsCompiled = false;
        compilerOptions0.setInlineVariables(false);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy3 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy3.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locationMappingArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(detailLevel20);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "*global*" + "'", str32, "*global*");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("*global*");
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray5 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList6 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList6, jSTypeArray5);
        com.google.javascript.rhino.Node node8 = jSTypeRegistry4.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList6);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList12 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList12, jSTypeArray11);
        com.google.javascript.rhino.Node node14 = jSTypeRegistry10.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList12);
        node8.addChildrenToBack(node14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList19 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList19, jSTypeArray18);
        com.google.javascript.rhino.Node node21 = jSTypeRegistry17.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList19);
        boolean boolean22 = node21.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList26 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList26, jSTypeArray25);
        com.google.javascript.rhino.Node node28 = jSTypeRegistry24.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList26);
        boolean boolean29 = node28.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList33 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList33, jSTypeArray32);
        com.google.javascript.rhino.Node node35 = jSTypeRegistry31.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList33);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (short) 0, node8, node21, node28, node35, 0, 49);
        boolean boolean39 = node28.isInc();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList43 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList43, jSTypeArray42);
        com.google.javascript.rhino.Node node45 = jSTypeRegistry41.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList43);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable47 = jSTypeRegistry41.getTypesWithProperty("");
        com.google.javascript.rhino.jstype.JSType jSType48 = assertionFunctionSpec1.getAssertedType(node28, jSTypeRegistry41);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString((int) (short) 10, ":/hi!");
        int int52 = node51.getLineno();
        boolean boolean53 = node51.isThrow();
        com.google.javascript.rhino.Node node54 = assertionFunctionSpec1.getAssertedParam(node51);
        boolean boolean55 = node54.isWith();
        java.lang.String str59 = node54.toString(true, true, true);
        boolean boolean61 = node54.getBooleanProp(45);
        boolean boolean62 = node54.isNumber();
        org.junit.Assert.assertNotNull(jSTypeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSTypeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(jSTypeIterable47);
        org.junit.Assert.assertNull(jSType48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "BITXOR :/hi!" + "'", str59, "BITXOR :/hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy3 = compilerOptions0.propertyRenaming;
        java.lang.String[] strArray6 = new java.lang.String[] { "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerOptions0.setStripTypes((java.util.Set<java.lang.String>) strSet7);
        boolean boolean10 = compilerOptions0.inlineLocalFunctions;
        compilerOptions0.removeDeadCode = true;
        compilerOptions0.jqueryPass = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        java.lang.String str16 = compilerOptions15.syntheticBlockStartMarker;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel17 = compilerOptions15.sourceMapDetailLevel;
        java.util.Set<java.lang.String> strSet18 = compilerOptions15.stripNameSuffixes;
        compilerOptions0.setStripTypes(strSet18);
        compilerOptions0.setIdeMode(false);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy3 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy3.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(detailLevel17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(500, "java.io.IOException: java.io.IOException: ", 48, 37);
        boolean boolean5 = node4.isEmpty();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode3 = com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF;
        compilerOptions0.setTracer(tracerMode3);
        compilerOptions0.setFoldConstants(true);
        compilerOptions0.flowSensitiveInlineVariables = true;
        compilerOptions0.setTweakToStringLiteral("InputId: *global*", "hi!");
        compilerOptions0.collapseAnonymousFunctions = false;
        compilerOptions0.setOutputCharset("");
        java.lang.String str16 = compilerOptions0.renamePrefixNamespace;
        org.junit.Assert.assertTrue("'" + tracerMode3 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode3.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        java.io.PrintStream printStream1 = new java.io.PrintStream("PARAM_LIST");
        printStream1.write(40);
        printStream1.print((double) 280489566208L);
        printStream1.println("Node tree inequality:\nTree1:\nTHIS\n    STRING java.io.IOException:  43\n    PARAM_LIST [var_args_name: 1] [opt_arg: 1]\n\n\nTree2:\nSTRING \n\n\nSubtree1: THIS\n    STRING java.io.IOException:  43\n    PARAM_LIST [var_args_name: 1] [opt_arg: 1]\n\n\nSubtree2: STRING \n");
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("InputId: *global*");
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy3 = compilerOptions0.propertyRenaming;
        java.lang.String[] strArray6 = new java.lang.String[] { "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        compilerOptions0.setStripTypes((java.util.Set<java.lang.String>) strSet7);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode11 = null;
        compilerOptions10.setTracerMode(tracerMode11);
        boolean boolean13 = compilerOptions10.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel14 = compilerOptions10.sourceMapDetailLevel;
        compilerOptions10.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.crossModuleMethodMotion = true;
        compilerOptions17.optimizeParameters = true;
        compilerOptions17.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel25 = compilerOptions17.checkGlobalNamesLevel;
        compilerOptions10.setReportMissingOverride(checkLevel25);
        compilerOptions0.setCheckUnreachableCode(checkLevel25);
        compilerOptions0.syntheticBlockStartMarker = "*global*";
        com.google.javascript.jscomp.CheckLevel checkLevel30 = compilerOptions0.checkMissingReturn;
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing31 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF;
        boolean boolean32 = tweakProcessing31.shouldStrip();
        boolean boolean33 = tweakProcessing31.shouldStrip();
        compilerOptions0.setTweakProcessing(tweakProcessing31);
        com.google.javascript.jscomp.SourceMap.Format format35 = compilerOptions0.sourceMapFormat;
        boolean boolean36 = compilerOptions0.removeUnusedLocalVars;
        compilerOptions0.setProtectHiddenSideEffects(false);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy3 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy3.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(detailLevel14);
        org.junit.Assert.assertTrue("'" + checkLevel25 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel25.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel30 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel30.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + tweakProcessing31 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing31.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(format35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setInlineLocalFunctions(false);
        compilerOptions0.moveFunctionDeclarations = true;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode5 = compilerOptions0.getLanguageIn();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setInlineLocalFunctions(false);
        compilerOptions6.moveFunctionDeclarations = true;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode11 = compilerOptions6.getLanguageIn();
        compilerOptions0.setLanguageIn(languageMode11);
        compilerOptions0.setPropertyAffinity(true);
        compilerOptions0.crossModuleCodeMotion = false;
        compilerOptions0.setPreferLineBreakAtEndOfFile(true);
        org.junit.Assert.assertTrue("'" + languageMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode5.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertTrue("'" + languageMode11 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode11.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.skipAllCompilerPasses();
        compilerOptions0.resetWarningsGuard();
        compilerOptions0.setInlineLocalVariables(false);
        compilerOptions0.setIdeMode(false);
        compilerOptions0.setDefineToBooleanLiteral("", true);
        java.lang.String str12 = compilerOptions0.renamePrefixNamespace;
        java.util.Set<java.lang.String> strSet13 = compilerOptions0.stripNamePrefixes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy17 = compilerOptions14.propertyRenaming;
        java.lang.String[] strArray20 = new java.lang.String[] { "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        compilerOptions14.setStripTypes((java.util.Set<java.lang.String>) strSet21);
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode25 = null;
        compilerOptions24.setTracerMode(tracerMode25);
        boolean boolean27 = compilerOptions24.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel28 = compilerOptions24.sourceMapDetailLevel;
        compilerOptions24.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions31.crossModuleMethodMotion = true;
        compilerOptions31.optimizeParameters = true;
        compilerOptions31.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel39 = compilerOptions31.checkGlobalNamesLevel;
        compilerOptions24.setReportMissingOverride(checkLevel39);
        compilerOptions14.setCheckUnreachableCode(checkLevel39);
        compilerOptions14.syntheticBlockStartMarker = "*global*";
        compilerOptions14.prettyPrint = false;
        boolean boolean46 = compilerOptions14.aliasAllStrings;
        com.google.javascript.jscomp.CompilerOptions.Reach reach47 = com.google.javascript.jscomp.CompilerOptions.Reach.NONE;
        compilerOptions14.setInlineVariables(reach47);
        compilerOptions0.setRemoveUnusedVariables(reach47);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping52 = new com.google.javascript.jscomp.SourceMap.LocationMapping("PARAM_LIST", "STRING PARAM_LIST 49");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray53 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] { locationMapping52 };
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList54 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList54, locationMappingArray53);
        compilerOptions0.sourceMapLocationMappings = locationMappingList54;
        compilerOptions0.coalesceVariableNames = true;
        compilerOptions0.setAssumeStrictThis(true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy17 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy17.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(detailLevel28);
        org.junit.Assert.assertTrue("'" + checkLevel39 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel39.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + reach47 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.NONE + "'", reach47.equals(com.google.javascript.jscomp.CompilerOptions.Reach.NONE));
        org.junit.Assert.assertNotNull(locationMappingArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(4095);
        int int2 = sideEffectFlags1.valueOf();
        sideEffectFlags1.setAllFlags();
        sideEffectFlags1.setReturnsTainted();
        sideEffectFlags1.setThrows();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4095 + "'", int2 == 4095);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(700, (-9), (int) (short) 10);
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.skipAllCompilerPasses();
        boolean boolean4 = compilerOptions0.flowSensitiveInlineVariables;
        compilerOptions0.setRemoveUnusedPrototypePropertiesInExterns(false);
        boolean boolean7 = compilerOptions0.removeUnusedClassProperties;
        compilerOptions0.setCollapsePropertiesOnExternTypes(true);
        boolean boolean10 = compilerOptions0.checkTypes;
        compilerOptions0.setCheckSuspiciousCode(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        java.io.PrintStream printStream1 = new java.io.PrintStream("PARAM_LIST [var_args_name: 1] [opt_arg: 1]\n");
        java.io.PrintStream printStream3 = new java.io.PrintStream("PARAM_LIST");
        printStream3.write(40);
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setReplaceStringsPlaceholderToken("hi!");
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel9 = com.google.javascript.jscomp.SourceMap.DetailLevel.SYMBOLS;
        compilerOptions6.setSourceMapDetailLevel(detailLevel9);
        compilerOptions6.inlineFunctions = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy16 = compilerOptions13.propertyRenaming;
        java.lang.String[] strArray19 = new java.lang.String[] { "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        compilerOptions13.setStripTypes((java.util.Set<java.lang.String>) strSet20);
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode24 = null;
        compilerOptions23.setTracerMode(tracerMode24);
        boolean boolean26 = compilerOptions23.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel27 = compilerOptions23.sourceMapDetailLevel;
        compilerOptions23.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions30.crossModuleMethodMotion = true;
        compilerOptions30.optimizeParameters = true;
        compilerOptions30.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel38 = compilerOptions30.checkGlobalNamesLevel;
        compilerOptions23.setReportMissingOverride(checkLevel38);
        compilerOptions13.setCheckUnreachableCode(checkLevel38);
        byte[] byteArray45 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        compilerOptions13.inputVariableMapSerialized = byteArray45;
        compilerOptions6.inputVariableMapSerialized = byteArray45;
        printStream3.write(byteArray45, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            printStream1.write(byteArray45, 1, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(detailLevel9);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy16 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy16.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(detailLevel27);
        org.junit.Assert.assertTrue("'" + checkLevel38 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel38.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0, 1, 10, 1]");
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setReplaceStringsPlaceholderToken("hi!");
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel3 = com.google.javascript.jscomp.SourceMap.DetailLevel.SYMBOLS;
        compilerOptions0.setSourceMapDetailLevel(detailLevel3);
        boolean boolean5 = compilerOptions0.ideMode;
        compilerOptions0.removeUnusedLocalVars = true;
        compilerOptions0.setTweakToBooleanLiteral("JSC_OPTIMIZE_LOOP_ERROR", true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions11.setReplaceStringsPlaceholderToken("hi!");
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel14 = com.google.javascript.jscomp.SourceMap.DetailLevel.SYMBOLS;
        compilerOptions11.setSourceMapDetailLevel(detailLevel14);
        compilerOptions11.disambiguateProperties = true;
        boolean boolean18 = compilerOptions11.reserveRawExports;
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode20 = null;
        compilerOptions19.setTracerMode(tracerMode20);
        boolean boolean22 = compilerOptions19.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel23 = compilerOptions19.sourceMapDetailLevel;
        compilerOptions19.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions26.crossModuleMethodMotion = true;
        compilerOptions26.optimizeParameters = true;
        compilerOptions26.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel34 = compilerOptions26.checkGlobalNamesLevel;
        compilerOptions19.setReportMissingOverride(checkLevel34);
        java.util.Set<java.lang.String> strSet36 = compilerOptions19.stripNameSuffixes;
        compilerOptions11.aliasableStrings = strSet36;
        com.google.javascript.jscomp.CheckLevel checkLevel38 = compilerOptions11.brokenClosureRequiresLevel;
        compilerOptions0.setCheckProvides(checkLevel38);
        org.junit.Assert.assertNotNull(detailLevel3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(detailLevel14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(detailLevel23);
        org.junit.Assert.assertTrue("'" + checkLevel34 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel34.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertTrue("'" + checkLevel38 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel38.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.setProtectHiddenSideEffects(true);
        boolean boolean5 = compilerOptions0.isExternExportsEnabled();
        compilerOptions0.optimizeCalls = true;
        boolean boolean8 = compilerOptions0.closurePass;
        boolean boolean9 = compilerOptions0.foldConstants;
        boolean boolean10 = compilerOptions0.generatePseudoNames;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.skipAllCompilerPasses();
        compilerOptions0.resetWarningsGuard();
        java.lang.String str5 = compilerOptions0.aliasStringsBlacklist;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy6 = com.google.javascript.jscomp.VariableRenamingPolicy.LOCAL;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy7 = null;
        compilerOptions0.setRenamingPolicy(variableRenamingPolicy6, propertyRenamingPolicy7);
        compilerOptions0.optimizeParameters = true;
        compilerOptions0.setTweakToBooleanLiteral("JSC_OPTIMIZE_LOOP_ERROR: Exceeded max number of code motion iterations: {0}", true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.crossModuleMethodMotion = true;
        compilerOptions14.skipAllCompilerPasses();
        compilerOptions14.resetWarningsGuard();
        compilerOptions14.setInlineLocalVariables(false);
        compilerOptions14.setIdeMode(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy26 = compilerOptions23.propertyRenaming;
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy27 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF;
        compilerOptions23.anonymousFunctionNaming = anonymousFunctionNamingPolicy27;
        compilerOptions14.setAnonymousFunctionNaming(anonymousFunctionNamingPolicy27);
        compilerOptions0.anonymousFunctionNaming = anonymousFunctionNamingPolicy27;
        compilerOptions0.syntheticBlockEndMarker = "PARAM_LIST [var_args_name: 1] [opt_arg: 1]\n";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy6 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.LOCAL + "'", variableRenamingPolicy6.equals(com.google.javascript.jscomp.VariableRenamingPolicy.LOCAL));
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy26 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy26.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy27 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy27.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        com.google.javascript.jscomp.JsAst jsAst6 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        jsAst6.clearAst();
        com.google.javascript.jscomp.SourceFile sourceFile8 = jsAst6.getSourceFile();
        com.google.javascript.jscomp.SourceFile sourceFile9 = jsAst6.getSourceFile();
        com.google.javascript.jscomp.SourceFile sourceFile10 = jsAst6.getSourceFile();
        com.google.javascript.jscomp.CompilerInput compilerInput11 = new com.google.javascript.jscomp.CompilerInput(sourceFile10);
        com.google.javascript.jscomp.SourceFile sourceFile12 = compilerInput11.getSourceFile();
        sourceFile12.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = sourceFile12.getLineOffset((int) ':');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 58");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(sourceFile12);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("WARNING");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 1645456110000L, 50, 2147483647);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList9 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList9, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList12 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList12, jSTypeArray11);
        boolean boolean14 = jSTypeList9.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList12);
        com.google.javascript.rhino.Node node15 = jSTypeRegistry7.createParameters((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList9);
        jSTypeRegistry7.setLastGeneration(false);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = jSTypeRegistry7.getEachReferenceTypeWithProperty("*global*.  at *global* line (unknown line) : (unknown column)");
        com.google.javascript.rhino.jstype.JSType jSType20 = assertionFunctionSpec1.getAssertedType(node5, jSTypeRegistry7);
        java.lang.String str21 = assertionFunctionSpec1.getFunctionName();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "WARNING" + "'", str21, "WARNING");
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        java.io.File file2 = new java.io.File(":", "hi!");
        boolean boolean5 = file2.setExecutable(false, false);
        boolean boolean8 = file2.setExecutable(false, true);
        boolean boolean11 = file2.setWritable(false, false);
        java.net.URI uRI12 = file2.toURI();
        org.junit.Assert.assertEquals(file2.getParent(), ":");
        org.junit.Assert.assertEquals(file2.toString(), ":/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(uRI12);
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        java.io.File file3 = new java.io.File(":");
        java.io.File file5 = new java.io.File(file3, "FINEST");
        java.io.File file6 = java.io.File.createTempFile("OFF", "", file3);
        java.io.File file7 = file6.getAbsoluteFile();
        java.net.URL uRL8 = file7.toURL();
        long long9 = file7.getUsableSpace();
        java.io.File file10 = file7.getParentFile();
        java.io.File file11 = file7.getParentFile();
        boolean boolean12 = file7.isDirectory();
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), ":");
        org.junit.Assert.assertEquals(file5.getParent(), ":");
        org.junit.Assert.assertEquals(file5.toString(), ":/FINEST");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), ":");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), ":/OFF1030193204663749910");
        org.junit.Assert.assertNotNull(file7);
// flaky:         org.junit.Assert.assertEquals(file7.getParent(), "/experiment/:");
// flaky:         org.junit.Assert.assertEquals(file7.toString(), "/experiment/:/OFF1030193204663749910");
        org.junit.Assert.assertNotNull(uRL8);
// flaky:         org.junit.Assert.assertEquals(uRL8.toString(), "file:/experiment/:/OFF1030193204663749910");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 280488665088L + "'", long9 == 280488665088L);
        org.junit.Assert.assertNotNull(file10);
// flaky:         org.junit.Assert.assertEquals(file10.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file10.toString(), "/experiment/:");
        org.junit.Assert.assertNotNull(file11);
// flaky:         org.junit.Assert.assertEquals(file11.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file11.toString(), "/experiment/:");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.syntheticBlockEndMarker = "hi!";
        compilerOptions0.removeUnusedClassProperties = false;
        compilerOptions0.setLineLengthThreshold(4095);
        com.google.javascript.jscomp.ErrorFormat errorFormat9 = compilerOptions0.errorFormat;
        compilerOptions0.setCrossModuleMethodMotion(true);
        compilerOptions0.setComputeFunctionSideEffects(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setLooseTypes(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CheckLevel checkLevel18 = compilerOptions17.checkRequires;
        compilerOptions14.setCheckProvides(checkLevel18);
        compilerOptions0.checkProvides = checkLevel18;
        java.lang.String str21 = compilerOptions0.checkMissingGetCssNameBlacklist;
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode23 = null;
        compilerOptions22.setTracerMode(tracerMode23);
        boolean boolean25 = compilerOptions22.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel26 = compilerOptions22.sourceMapDetailLevel;
        compilerOptions22.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions29.crossModuleMethodMotion = true;
        compilerOptions29.optimizeParameters = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions34.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy37 = compilerOptions34.propertyRenaming;
        java.lang.String[] strArray40 = new java.lang.String[] { "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        compilerOptions34.setStripTypes((java.util.Set<java.lang.String>) strSet41);
        compilerOptions29.stripNamePrefixes = strSet41;
        compilerOptions22.stripNamePrefixes = strSet41;
        compilerOptions22.optimizeReturns = false;
        boolean boolean48 = compilerOptions22.optimizeReturns;
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing49 = compilerOptions22.getTweakProcessing();
        compilerOptions0.setTweakProcessing(tweakProcessing49);
        compilerOptions0.resetWarningsGuard();
        org.junit.Assert.assertNotNull(errorFormat9);
        org.junit.Assert.assertTrue("'" + checkLevel18 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel18.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(detailLevel26);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy37 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy37.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + tweakProcessing49 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing49.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.syntheticBlockEndMarker = "hi!";
        compilerOptions0.coalesceVariableNames = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode8 = null;
        compilerOptions7.setTracerMode(tracerMode8);
        boolean boolean10 = compilerOptions7.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel11 = compilerOptions7.sourceMapDetailLevel;
        compilerOptions7.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.crossModuleMethodMotion = true;
        compilerOptions14.optimizeParameters = true;
        compilerOptions14.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel22 = compilerOptions14.checkGlobalNamesLevel;
        compilerOptions7.setReportMissingOverride(checkLevel22);
        java.util.Set<java.lang.String> strSet24 = compilerOptions7.stripNameSuffixes;
        com.google.javascript.jscomp.SourceFile sourceFile27 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int29 = sourceFile27.getLineOfOffset((int) (short) 1);
        java.lang.String str30 = sourceFile27.getName();
        java.lang.String str31 = sourceFile27.getName();
        java.lang.String str32 = sourceFile27.getName();
        int int34 = sourceFile27.getLineOfOffset((-1));
        boolean boolean35 = strSet24.equals((java.lang.Object) int34);
        compilerOptions0.stripNamePrefixes = strSet24;
        boolean boolean37 = compilerOptions0.aliasExternals;
        compilerOptions0.skipAllCompilerPasses();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(detailLevel11);
        org.junit.Assert.assertTrue("'" + checkLevel22 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel22.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(sourceFile27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        java.io.File file1 = new java.io.File("/experiment/:/hi!");
        boolean boolean2 = file1.mkdir();
        boolean boolean3 = file1.canExecute();
        long long4 = file1.getFreeSpace();
        org.junit.Assert.assertEquals(file1.getParent(), "/experiment/:");
        org.junit.Assert.assertEquals(file1.toString(), "/experiment/:/hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 299088625664L + "'", long4 == 299088625664L);
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        java.io.File file2 = new java.io.File(":", "hi!");
        boolean boolean5 = file2.setExecutable(false, false);
        boolean boolean7 = file2.setReadable(false);
        java.io.File file8 = file2.getCanonicalFile();
        java.lang.String str9 = file2.getParent();
        org.junit.Assert.assertEquals(file2.getParent(), ":");
        org.junit.Assert.assertEquals(file2.toString(), ":/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(file8);
// flaky:         org.junit.Assert.assertEquals(file8.getParent(), "/experiment/:");
// flaky:         org.junit.Assert.assertEquals(file8.toString(), "/experiment/:/hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":" + "'", str9, ":");
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int5 = sourceFile3.getLineOfOffset((int) (short) 1);
        java.io.Reader reader6 = sourceFile3.getCodeReader();
        boolean boolean7 = reader6.ready();
        boolean boolean8 = reader6.markSupported();
        boolean boolean9 = reader6.ready();
        int int10 = reader6.read();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("SHNE", reader6);
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(sourceFile11);
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode3 = com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF;
        compilerOptions0.setTracer(tracerMode3);
        compilerOptions0.setExtractPrototypeMemberDeclarations(true);
        boolean boolean7 = compilerOptions0.prettyPrint;
        com.google.javascript.jscomp.CheckLevel checkLevel8 = compilerOptions0.checkMissingReturn;
        org.junit.Assert.assertTrue("'" + tracerMode3 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode3.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + checkLevel8 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel8.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        boolean boolean3 = compilerOptions0.generatePseudoNames;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray4 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList5 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList5, locationMappingArray4);
        compilerOptions0.sourceMapLocationMappings = locationMappingList5;
        compilerOptions0.removeUnusedPrototypePropertiesInExterns = true;
        compilerOptions0.aliasKeywords = true;
        boolean boolean12 = compilerOptions0.rewriteFunctionExpressions;
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        boolean boolean15 = compilerOptions14.moveFunctionDeclarations;
        compilerOptions14.setReportPath("java.io.IOException: ");
        boolean boolean18 = compilerOptions14.inlineConstantVars;
        boolean boolean19 = compilerOptions14.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode21 = null;
        compilerOptions20.setTracerMode(tracerMode21);
        boolean boolean23 = compilerOptions20.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel24 = compilerOptions20.sourceMapDetailLevel;
        compilerOptions20.setColorizeErrorOutput(true);
        compilerOptions20.generatePseudoNames = true;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy29 = com.google.javascript.jscomp.VariableRenamingPolicy.UNSPECIFIED;
        compilerOptions20.setVariableRenaming(variableRenamingPolicy29);
        com.google.javascript.jscomp.ErrorFormat errorFormat31 = compilerOptions20.errorFormat;
        compilerOptions14.setErrorFormat(errorFormat31);
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = new com.google.javascript.jscomp.CompilerOptions();
        boolean boolean34 = compilerOptions33.moveFunctionDeclarations;
        compilerOptions33.crossModuleCodeMotion = true;
        compilerOptions33.checkSymbols = true;
        java.util.Set<java.lang.String> strSet39 = compilerOptions33.stripNamePrefixes;
        compilerOptions33.setCheckCaja(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions42.crossModuleMethodMotion = true;
        compilerOptions42.syntheticBlockEndMarker = "hi!";
        com.google.javascript.jscomp.CheckLevel checkLevel47 = compilerOptions42.aggressiveVarCheck;
        compilerOptions33.setCheckGlobalThisLevel(checkLevel47);
        compilerOptions14.checkRequires = checkLevel47;
        com.google.javascript.jscomp.DiagnosticType diagnosticType51 = com.google.javascript.jscomp.DiagnosticType.make("PARAM_LIST\n    PARAM_LIST\n", checkLevel47, "WARNING");
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = new com.google.javascript.jscomp.CompilerOptions();
        java.lang.String str53 = compilerOptions52.syntheticBlockStartMarker;
        compilerOptions52.setMarkNoSideEffectCalls(false);
        com.google.javascript.jscomp.CheckLevel checkLevel56 = compilerOptions52.checkGlobalThisLevel;
        diagnosticType51.level = checkLevel56;
        compilerOptions0.reportMissingOverride = checkLevel56;
        compilerOptions0.setCollapseProperties(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locationMappingArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(detailLevel24);
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy29 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.UNSPECIFIED + "'", variableRenamingPolicy29.equals(com.google.javascript.jscomp.VariableRenamingPolicy.UNSPECIFIED));
        org.junit.Assert.assertNotNull(errorFormat31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertTrue("'" + checkLevel47 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel47.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(diagnosticType51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + checkLevel56 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel56.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setReplaceStringsPlaceholderToken("hi!");
        compilerOptions0.setTweakToDoubleLiteral("", (double) (short) 1);
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = null;
        compilerOptions0.setLanguageOut(languageMode6);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy8 = null;
        compilerOptions0.variableRenaming = variableRenamingPolicy8;
        boolean boolean10 = compilerOptions0.inlineGetters;
        compilerOptions0.setFlowSensitiveInlineVariables(true);
        compilerOptions0.setInlineGetters(true);
        compilerOptions0.jqueryPass = true;
        compilerOptions0.checkSymbols = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode20 = null;
        compilerOptions19.setTracerMode(tracerMode20);
        boolean boolean22 = compilerOptions19.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel23 = compilerOptions19.sourceMapDetailLevel;
        compilerOptions19.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions26.crossModuleMethodMotion = true;
        compilerOptions26.optimizeParameters = true;
        compilerOptions26.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel34 = compilerOptions26.checkGlobalNamesLevel;
        compilerOptions19.setReportMissingOverride(checkLevel34);
        java.util.Set<java.lang.String> strSet36 = compilerOptions19.stripNameSuffixes;
        compilerOptions0.setReplaceStringsReservedStrings(strSet36);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(detailLevel23);
        org.junit.Assert.assertTrue("'" + checkLevel34 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel34.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.optimizeParameters = true;
        compilerOptions0.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.crossModuleMethodMotion = true;
        compilerOptions8.optimizeParameters = true;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy13 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy17 = compilerOptions14.propertyRenaming;
        compilerOptions8.setRenamingPolicy(variableRenamingPolicy13, propertyRenamingPolicy17);
        com.google.javascript.jscomp.SourceMap.Format format19 = compilerOptions8.sourceMapFormat;
        compilerOptions0.setSourceMapFormat(format19);
        compilerOptions0.exportTestFunctions = false;
        compilerOptions0.setNameReferenceReportPath("PARAM_LIST");
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap25 = null;
        compilerOptions0.setCustomPasses(customPassExecutionTimeMultimap25);
        boolean boolean27 = compilerOptions0.removeDeadCode;
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy17 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy17.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(format19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("/", charset1);
        java.lang.String str3 = sourceFile2.toString();
        java.lang.String str5 = sourceFile2.getLine(40);
        com.google.javascript.jscomp.JsAst jsAst6 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        com.google.javascript.jscomp.CompilerInput compilerInput8 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) jsAst6, true);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = compilerInput8.getLineOffset(29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 29");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/" + "'", str3, "/");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode1 = null;
        compilerOptions0.setTracerMode(tracerMode1);
        boolean boolean3 = compilerOptions0.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel4 = compilerOptions0.sourceMapDetailLevel;
        compilerOptions0.setColorizeErrorOutput(true);
        compilerOptions0.collapseProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy12 = compilerOptions9.propertyRenaming;
        compilerOptions0.propertyRenaming = propertyRenamingPolicy12;
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CheckLevel checkLevel15 = compilerOptions14.checkRequires;
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode17 = null;
        compilerOptions16.setTracerMode(tracerMode17);
        boolean boolean19 = compilerOptions16.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel20 = compilerOptions16.sourceMapDetailLevel;
        compilerOptions16.setColorizeErrorOutput(true);
        compilerOptions16.collapseProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions25.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy28 = compilerOptions25.propertyRenaming;
        compilerOptions16.propertyRenaming = propertyRenamingPolicy28;
        com.google.javascript.jscomp.CheckLevel checkLevel30 = compilerOptions16.brokenClosureRequiresLevel;
        com.google.javascript.jscomp.CheckLevel checkLevel31 = compilerOptions16.checkRequires;
        compilerOptions14.setCheckRequires(checkLevel31);
        compilerOptions0.setCheckProvides(checkLevel31);
        boolean boolean34 = compilerOptions0.isRemoveUnusedClassProperties();
        compilerOptions0.aliasAllStrings = true;
        compilerOptions0.labelRenaming = true;
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setNameReferenceGraphPath("JSC_OPTIMIZE_LOOP_ERROR: Exceeded max number of code motion iterations: {0}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(detailLevel4);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy12 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy12.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel15 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel15.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(detailLevel20);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy28 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy28.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel30 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel30.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertTrue("'" + checkLevel31 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel31.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy3 = compilerOptions0.propertyRenaming;
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap4 = compilerOptions0.getTweakReplacements();
        boolean boolean5 = strMap4.isEmpty();
        java.lang.Object obj6 = null;
        com.google.javascript.rhino.Node node7 = strMap4.get(obj6);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.setReplaceStringsPlaceholderToken("hi!");
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel11 = com.google.javascript.jscomp.SourceMap.DetailLevel.SYMBOLS;
        compilerOptions8.setSourceMapDetailLevel(detailLevel11);
        boolean boolean13 = compilerOptions8.ideMode;
        compilerOptions8.setUnaliasableGlobals("");
        com.google.javascript.jscomp.CheckLevel checkLevel16 = compilerOptions8.checkUnreachableCode;
        com.google.javascript.rhino.Node node17 = strMap4.remove((java.lang.Object) checkLevel16);
        boolean boolean19 = strMap4.containsValue((java.lang.Object) 280489189376L);
        strMap4.clear();
        boolean boolean21 = strMap4.isEmpty();
        boolean boolean22 = strMap4.isEmpty();
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy3 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy3.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(detailLevel11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + checkLevel16 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel16.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        com.google.javascript.jscomp.JSSourceFile jSSourceFile2 = com.google.javascript.jscomp.JSSourceFile.fromCode("STRING PARAM_LIST 49: hi!", "US-ASCII");
        java.lang.String str3 = jSSourceFile2.getCode();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = jSSourceFile2.getLineOffset(49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 49");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "US-ASCII" + "'", str3, "US-ASCII");
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray0 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList1 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList1, jSTypeArray0);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList4 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList4, jSTypeArray3);
        boolean boolean6 = jSTypeList1.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList4);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType7 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("PARAM_LIST", 49, 0);
        boolean boolean12 = node11.isTry();
        java.lang.String str13 = node11.toString();
        boolean boolean14 = node11.isIn();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (-1L), 16, (int) (byte) -1);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship19 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType7, node11, node18);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder20 = node18.new FileLevelJsDocBuilder();
        boolean boolean21 = jSTypeList1.remove((java.lang.Object) node18);
        java.util.stream.Stream<com.google.javascript.rhino.jstype.JSType> jSTypeStream22 = jSTypeList1.stream();
        int int23 = jSTypeList1.size();
        org.junit.Assert.assertNotNull(jSTypeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + subclassType7 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType7.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "STRING PARAM_LIST 49" + "'", str13, "STRING PARAM_LIST 49");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.optimizeParameters = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions5.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy8 = compilerOptions5.propertyRenaming;
        java.lang.String[] strArray11 = new java.lang.String[] { "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        compilerOptions5.setStripTypes((java.util.Set<java.lang.String>) strSet12);
        compilerOptions0.stripNamePrefixes = strSet12;
        boolean boolean16 = compilerOptions0.removeUnusedPrototypePropertiesInExterns;
        compilerOptions0.setCrossModuleMethodMotion(true);
        compilerOptions0.setRemoveUnusedPrototypePropertiesInExterns(true);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy8 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy8.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.skipAllCompilerPasses();
        compilerOptions0.resetWarningsGuard();
        compilerOptions0.setInlineLocalVariables(false);
        compilerOptions0.setIdeMode(false);
        compilerOptions0.setDefineToBooleanLiteral("", true);
        java.lang.String str12 = compilerOptions0.renamePrefixNamespace;
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap13 = compilerOptions0.getTweakReplacements();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("java.io.IOException: ", 43, (int) '#');
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("PARAM_LIST", 49, 0);
        boolean boolean22 = node21.isTry();
        java.lang.String str23 = node21.toString();
        boolean boolean24 = node17.hasChild(node21);
        boolean boolean25 = node17.isNot();
        boolean boolean26 = node17.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node27 = strMap13.get((java.lang.Object) node17);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "STRING PARAM_LIST 49" + "'", str23, "STRING PARAM_LIST 49");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList4 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList4, jSTypeArray3);
        com.google.javascript.rhino.Node node6 = jSTypeRegistry2.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList4);
        boolean boolean7 = node6.isIn();
        boolean boolean8 = node6.isVoid();
        node6.setOptionalArg(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode12 = null;
        compilerOptions11.setTracerMode(tracerMode12);
        boolean boolean14 = compilerOptions11.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel15 = compilerOptions11.sourceMapDetailLevel;
        compilerOptions11.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions18.crossModuleMethodMotion = true;
        compilerOptions18.optimizeParameters = true;
        compilerOptions18.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel26 = compilerOptions18.checkGlobalNamesLevel;
        compilerOptions11.setReportMissingOverride(checkLevel26);
        com.google.javascript.jscomp.DiagnosticType diagnosticType28 = com.google.javascript.jscomp.Compiler.MOTION_ITERATIONS_ERROR;
        java.lang.String[] strArray29 = null;
        com.google.javascript.jscomp.JSError jSError30 = com.google.javascript.jscomp.JSError.make("", node6, checkLevel26, diagnosticType28, strArray29);
        boolean boolean31 = node6.isCatch();
        boolean boolean32 = node6.isLabel();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList38 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38, jSTypeArray37);
        com.google.javascript.rhino.Node node40 = jSTypeRegistry36.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList38);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList44 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList44, jSTypeArray43);
        com.google.javascript.rhino.Node node46 = jSTypeRegistry42.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList44);
        com.google.javascript.rhino.jstype.JSType jSType51 = jSTypeRegistry42.createNamedType(":", "", (int) (byte) 1, 48);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList55 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList55, jSTypeArray54);
        com.google.javascript.rhino.Node node57 = jSTypeRegistry53.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList55);
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry53.createNamedType(":", "", (int) (byte) 1, 48);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] { jSType62 };
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry36.createConstructorTypeWithVarArgs(jSType51, jSTypeArray63);
        boolean boolean66 = jSTypeRegistry34.canPropertyBeDefined(jSType51, "");
        node6.setJSType(jSType51);
        boolean boolean68 = node6.isBlock();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(detailLevel15);
        org.junit.Assert.assertTrue("'" + checkLevel26 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel26.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(diagnosticType28);
        org.junit.Assert.assertNotNull(jSError30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(jSType51);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(jSType62);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setReplaceStringsPlaceholderToken("hi!");
        compilerOptions0.setTweakToDoubleLiteral("", (double) (short) 1);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode6 = com.google.javascript.jscomp.CompilerOptions.TracerMode.RAW_SIZE;
        compilerOptions0.setTracer(tracerMode6);
        compilerOptions0.setSyntheticBlockStartMarker("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.crossModuleMethodMotion = true;
        compilerOptions10.skipAllCompilerPasses();
        compilerOptions10.resetWarningsGuard();
        compilerOptions10.setInlineLocalVariables(false);
        compilerOptions10.setIdeMode(false);
        compilerOptions10.setDefineToBooleanLiteral("", true);
        java.lang.String str22 = compilerOptions10.renamePrefixNamespace;
        java.util.Set<java.lang.String> strSet23 = compilerOptions10.stripNamePrefixes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions24.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy27 = compilerOptions24.propertyRenaming;
        java.lang.String[] strArray30 = new java.lang.String[] { "*global*", ":" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        compilerOptions24.setStripTypes((java.util.Set<java.lang.String>) strSet31);
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode35 = null;
        compilerOptions34.setTracerMode(tracerMode35);
        boolean boolean37 = compilerOptions34.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel38 = compilerOptions34.sourceMapDetailLevel;
        compilerOptions34.setColorizeErrorOutput(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions41 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions41.crossModuleMethodMotion = true;
        compilerOptions41.optimizeParameters = true;
        compilerOptions41.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CheckLevel checkLevel49 = compilerOptions41.checkGlobalNamesLevel;
        compilerOptions34.setReportMissingOverride(checkLevel49);
        compilerOptions24.setCheckUnreachableCode(checkLevel49);
        compilerOptions24.syntheticBlockStartMarker = "*global*";
        compilerOptions24.prettyPrint = false;
        boolean boolean56 = compilerOptions24.aliasAllStrings;
        com.google.javascript.jscomp.CompilerOptions.Reach reach57 = com.google.javascript.jscomp.CompilerOptions.Reach.NONE;
        compilerOptions24.setInlineVariables(reach57);
        compilerOptions10.setRemoveUnusedVariables(reach57);
        compilerOptions0.setRemoveUnusedVariables(reach57);
        compilerOptions0.setAcceptConstKeyword(true);
        boolean boolean63 = compilerOptions0.exportTestFunctions;
        org.junit.Assert.assertTrue("'" + tracerMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.RAW_SIZE + "'", tracerMode6.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.RAW_SIZE));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy27 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy27.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(detailLevel38);
        org.junit.Assert.assertTrue("'" + checkLevel49 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel49.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + reach57 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.NONE + "'", reach57.equals(com.google.javascript.jscomp.CompilerOptions.Reach.NONE));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode3 = com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF;
        compilerOptions0.setTracer(tracerMode3);
        compilerOptions0.setFoldConstants(true);
        compilerOptions0.flowSensitiveInlineVariables = true;
        compilerOptions0.setTweakToStringLiteral("InputId: *global*", "hi!");
        compilerOptions0.moveFunctionDeclarations = false;
        boolean boolean14 = compilerOptions0.devirtualizePrototypeMethods;
        compilerOptions0.renamePrefixNamespace = "ALL";
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.crossModuleMethodMotion = true;
        compilerOptions17.optimizeParameters = true;
        compilerOptions17.setTweakToDoubleLiteral("*global*", (double) (byte) 10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions25.crossModuleMethodMotion = true;
        compilerOptions25.optimizeParameters = true;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy30 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions31.crossModuleMethodMotion = true;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy34 = compilerOptions31.propertyRenaming;
        compilerOptions25.setRenamingPolicy(variableRenamingPolicy30, propertyRenamingPolicy34);
        com.google.javascript.jscomp.SourceMap.Format format36 = compilerOptions25.sourceMapFormat;
        compilerOptions17.setSourceMapFormat(format36);
        boolean boolean38 = compilerOptions17.shouldColorizeErrorOutput();
        boolean boolean39 = compilerOptions17.deadAssignmentElimination;
        compilerOptions17.removeUnusedPrototypePropertiesInExterns = false;
        com.google.javascript.rhino.InputId inputId43 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode45 = null;
        compilerOptions44.setTracerMode(tracerMode45);
        boolean boolean47 = compilerOptions44.coalesceVariableNames;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel48 = compilerOptions44.sourceMapDetailLevel;
        compilerOptions44.setColorizeErrorOutput(true);
        compilerOptions44.generatePseudoNames = true;
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy53 = com.google.javascript.jscomp.VariableRenamingPolicy.UNSPECIFIED;
        compilerOptions44.setVariableRenaming(variableRenamingPolicy53);
        boolean boolean55 = inputId43.equals((java.lang.Object) variableRenamingPolicy53);
        compilerOptions17.setVariableRenaming(variableRenamingPolicy53);
        compilerOptions0.setVariableRenaming(variableRenamingPolicy53);
        org.junit.Assert.assertTrue("'" + tracerMode3 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode3.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy34 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy34.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertNotNull(format36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(detailLevel48);
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy53 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.UNSPECIFIED + "'", variableRenamingPolicy53.equals(com.google.javascript.jscomp.VariableRenamingPolicy.UNSPECIFIED));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList4 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList4, jSTypeArray3);
        com.google.javascript.rhino.Node node6 = jSTypeRegistry2.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList4);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList10 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList10, jSTypeArray9);
        com.google.javascript.rhino.Node node12 = jSTypeRegistry8.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList10);
        node6.addChildrenToBack(node12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.Node node19 = jSTypeRegistry15.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        boolean boolean20 = node19.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry22.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        boolean boolean27 = node26.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList31 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList31, jSTypeArray30);
        com.google.javascript.rhino.Node node33 = jSTypeRegistry29.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList31);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 0, node6, node19, node26, node33, 0, 49);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList41 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList41, jSTypeArray40);
        com.google.javascript.rhino.Node node43 = jSTypeRegistry39.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList41);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList47 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList47, jSTypeArray46);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry45.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList47);
        node43.addChildrenToBack(node49);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList54 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList54, jSTypeArray53);
        com.google.javascript.rhino.Node node56 = jSTypeRegistry52.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList54);
        boolean boolean57 = node56.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.Node node63 = jSTypeRegistry59.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = node63.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList68 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList68, jSTypeArray67);
        com.google.javascript.rhino.Node node70 = jSTypeRegistry66.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList68);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) (short) 0, node43, node56, node63, node70, 0, 49);
        com.google.javascript.rhino.Node node74 = node36.useSourceInfoFrom(node56);
        boolean boolean75 = node56.isExprResult();
        int int76 = node56.getLength();
        boolean boolean77 = node56.isFunction();
        com.google.javascript.rhino.Node node78 = node56.detachFromParent();
        int int79 = node78.getSourceOffset();
        node78.addSuppression("/tmp/hi!6553381389133366679*global*.  at *global* line (unknown line) : (unknown column)");
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setReplaceStringsPlaceholderToken("hi!");
        compilerOptions0.setTweakToDoubleLiteral("", (double) (short) 1);
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = null;
        compilerOptions0.setLanguageOut(languageMode6);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy8 = null;
        compilerOptions0.variableRenaming = variableRenamingPolicy8;
        com.google.javascript.jscomp.CheckLevel checkLevel10 = compilerOptions0.checkUnreachableCode;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode11 = compilerOptions0.getLanguageOut();
        boolean boolean12 = compilerOptions0.moveFunctionDeclarations;
        byte[] byteArray13 = null;
        compilerOptions0.inputPropertyMapSerialized = byteArray13;
        compilerOptions0.locale = ":/hi!";
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList22 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList22, jSTypeArray21);
        com.google.javascript.rhino.Node node24 = jSTypeRegistry20.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList22);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList28 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList28, jSTypeArray27);
        com.google.javascript.rhino.Node node30 = jSTypeRegistry26.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList28);
        com.google.javascript.rhino.jstype.JSType jSType35 = jSTypeRegistry26.createNamedType(":", "", (int) (byte) 1, 48);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList39 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList39, jSTypeArray38);
        com.google.javascript.rhino.Node node41 = jSTypeRegistry37.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        com.google.javascript.rhino.jstype.JSType jSType46 = jSTypeRegistry37.createNamedType(":", "", (int) (byte) 1, 48);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] { jSType46 };
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry20.createConstructorTypeWithVarArgs(jSType35, jSTypeArray47);
        boolean boolean50 = jSTypeRegistry18.canPropertyBeDefined(jSType35, "");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = jSTypeRegistry18.getEachReferenceTypeWithProperty("/");
        java.lang.String[] strArray57 = new java.lang.String[] { "Unversioned directory", "/experiment/:/hi!", ":", "OFF" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        jSTypeRegistry18.setTemplateTypeNames((java.util.List<java.lang.String>) strList58);
        compilerOptions0.setManageClosureDependencies((java.util.List<java.lang.String>) strList58);
        boolean boolean62 = compilerOptions0.markNoSideEffectCalls;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap63 = null;
        compilerOptions0.cssRenamingMap = cssRenamingMap63;
        compilerOptions0.renamePrefixNamespace = "SHNE  2";
        org.junit.Assert.assertTrue("'" + checkLevel10 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel10.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(languageMode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(jSType35);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }
}
